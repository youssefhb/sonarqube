package ma.training.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insecure {

 

  public KeyPair weakKey() {
    KeyPairGenerator keyPairGen;
    try {
      keyPairGen = KeyPairGenerator.getInstance("RSA");
      keyPairGen.initialize(512);
      return keyPairGen.genKeyPair();
    } catch (NoSuchAlgorithmException e) {
      return null;
    }
  }

}