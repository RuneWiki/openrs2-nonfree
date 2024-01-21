import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!pd;")
	public static Class74 aClass74_4;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "Lclient!bc;")
	public static Class1 aClass1_32;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	public static int anInt4008 = 0;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1539 = Static120.method1824("Service unavailable)3");

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1535 = aClass80_1539;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1536 = Static120.method1824("Unexpected server response)3");

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1537 = Static120.method1824("Angreifen");

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1538 = Static120.method1824("Choose Option");

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
	public static volatile int anInt4017 = -1;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Z")
	public static volatile boolean aBoolean158 = true;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1540 = Static120.method1824("null");

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "Z")
	public static volatile boolean aBoolean159 = true;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1541 = aClass80_1538;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1542 = Static120.method1824("");

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "[I")
	public static final int[] anIntArray486 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1543 = aClass80_1536;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method2879(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public static void method2880() {
		Static145.aClass5_43.method146();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!rd;)Z")
	public static boolean method2881(@OriginalArg(1) Class80 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static133.anInt2865; local16++) {
			if (arg0.method2432(Static170.aClass80Array28[local16])) {
				return true;
			}
		}
		return false;
	}
}
