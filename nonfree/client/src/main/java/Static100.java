import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!v", name = "O", descriptor = "Lclient!o;")
	public static Class40 aClass40_688 = Static13.method257("Invalid loginserver requested");

	@OriginalMember(owner = "client!v", name = "P", descriptor = "[Z")
	public static boolean[] aBooleanArray37 = new boolean[112];

	@OriginalMember(owner = "client!v", name = "X", descriptor = "Lclient!o;")
	public static Class40 aClass40_689 = Static13.method257("@gre@");

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "[Lclient!kc;")
	public static Class2_Sub2_Sub12_Sub1_Sub1[] aClass2_Sub2_Sub12_Sub1_Sub1Array1 = new Class2_Sub2_Sub12_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!v", name = "db", descriptor = "I")
	public static int anInt2394 = 0;

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
	public static int anInt2396 = 0;

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "Lclient!o;")
	public static Class40 aClass40_690 = Static13.method257("To ");

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_691 = Static13.method257("Connecting to update server");

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	public static void method1580() {
		aClass40_688 = null;
		aClass40_690 = null;
		aClass40_689 = null;
		aBooleanArray37 = null;
		aClass40_691 = null;
		aClass2_Sub2_Sub12_Sub1_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)Lclient!o;")
	public static Class40 method1581(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static53.method859(arg0) : Static17.aClass40_116;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1583(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V")
	public static void method1584() {
		Static104.aClass44_9 = new Class44();
	}
}
