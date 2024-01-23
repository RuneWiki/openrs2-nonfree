import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_7;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	public static int anInt1461 = 0;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "J")
	public static long aLong45 = 0L;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "I")
	public static int anInt1463 = 0;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "[I")
	public static int[] anIntArray111 = new int[50];

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(SZ)Z")
	public static boolean method1019(@OriginalArg(0) short arg0) {
		if (arg0 == 47 || arg0 == 25 || arg0 == 17 || arg0 == 35 || arg0 == 41 || arg0 == 58 || arg0 == 44 || arg0 == 23) {
			return true;
		} else if (arg0 == 40 || arg0 == 22 || arg0 == 1003 || arg0 == 1006) {
			return true;
		} else if (arg0 == 36 || arg0 == 1 || arg0 == 3 || arg0 == 46 || arg0 == 31) {
			return true;
		} else {
			return arg0 == 16 || arg0 == 50 || arg0 == 7 || arg0 == 38 || arg0 == 33 || arg0 == 26;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public static void method1020() {
		Static152.method2728(false);
		System.gc();
		Static168.method2918(25);
	}
}
