import sign.signlink;

public class Class1_Sub1 extends Class1 {

	public Class1_Sub3_Sub1 method568(boolean arg0) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			} else {
				return null;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("84732, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
