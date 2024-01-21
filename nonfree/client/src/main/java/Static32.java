import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Lclient!qe;")
	public static Class4_Sub4_Sub4 aClass4_Sub4_Sub4_1;

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
	public static int anInt825;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "Lclient!ec;")
	public static Class22 aClass22_211 = Static60.method1113("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Lclient!ec;")
	private static Class22 aClass22_212 = Static60.method1113("Password: ");

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
	public static int anInt819 = 0;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "Lclient!ec;")
	private static Class22 aClass22_213 = Static60.method1113("Please enter your username)3");

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
	public static int anInt820 = 1;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "Lclient!ja;")
	public static Class33 aClass33_11 = new Class33(64);

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "Lclient!ec;")
	public static Class22 aClass22_215 = aClass22_212;

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
	public static int anInt824 = -1;

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "Lclient!ec;")
	public static Class22 aClass22_216 = aClass22_213;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "Lclient!ec;")
	private static Class22 aClass22_219 = Static60.method1113("Login");

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "Lclient!ec;")
	public static Class22 aClass22_217 = aClass22_219;

	@OriginalMember(owner = "client!fa", name = "M", descriptor = "Lclient!ec;")
	public static Class22 aClass22_218 = Static60.method1113("Benutzername: ");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method541() {
		aClass22_219 = null;
		aClass22_212 = null;
		aClass4_Sub4_Sub4_1 = null;
		aClass22_217 = null;
		aClass22_213 = null;
		aClass22_216 = null;
		anIntArray92 = null;
		aClass33_11 = null;
		aClass22_218 = null;
		aClass22_215 = null;
		aClass22_211 = null;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Lclient!uf;")
	public static Class31 method542() {
		try {
			return (Class31) Class.forName("Class31_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
