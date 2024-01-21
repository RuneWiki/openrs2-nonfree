import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_71 = Static51.method932("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
	public static int anInt119 = 0;

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "Lclient!cd;")
	public static Class10 aClass10_72 = Static51.method932("jlv");

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
	public static int anInt120 = -1;

	@OriginalMember(owner = "client!ad", name = "X", descriptor = "[Lclient!cd;")
	public static Class10[] aClass10Array2 = new Class10[200];

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_73 = Static51.method932("b12_full");

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
	public static int anInt123 = 0;

	@OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_74 = Static51.method932("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_75 = aClass10_74;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	public static void method86() {
		aClass10_75 = null;
		aClass10_74 = null;
		aClass10_73 = null;
		aClass10_71 = null;
		aClass10_72 = null;
		aClass10Array2 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method87(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
