import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Lclient!ff;")
	public static Class11 aClass11_23;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
	public static int anInt1292;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Lclient!wd;")
	public static Class80 aClass80_480 = Static2.method59("welle:");

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	public static int anInt1287 = 0;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!wd;")
	private static Class80 aClass80_481 = Static2.method59("Login limit exceeded)3");

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
	public static int anInt1291 = 0;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
	public static int anInt1293 = 0;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "Lclient!wd;")
	public static Class80 aClass80_482 = Static2.method59("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "Lclient!wd;")
	private static Class80 aClass80_483 = Static2.method59("This computers address has been blocked");

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "Lclient!wd;")
	public static Class80 aClass80_484 = aClass80_483;

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "Lclient!wd;")
	public static Class80 aClass80_485 = Static2.method59("Ausw-=hlen");

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "Lclient!wd;")
	public static Class80 aClass80_486 = Static2.method59("(Y");

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "Lclient!wd;")
	public static Class80 aClass80_487 = aClass80_481;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public static void method705() {
		for (@Pc(10) Class2_Sub5 local10 = (Class2_Sub5) Static90.aClass58_11.method1285(); local10 != null; local10 = (Class2_Sub5) Static90.aClass58_11.method1281()) {
			if (local10.anInt1505 == -1) {
				local10.anInt1512 = 0;
				Static111.method1939(local10);
			} else {
				local10.method1961();
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
	public static void method706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static120.aClass2_Sub17_Sub1_3.method1799(64);
		Static120.aClass2_Sub17_Sub1_3.method1765(arg0);
		Static120.aClass2_Sub17_Sub1_3.method1785(arg1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIB)V")
	public static void method707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = arg1; local7 <= arg1 + arg3; local7++) {
			for (@Pc(13) int local13 = arg0; local13 <= arg0 + arg2; local13++) {
				if (local13 >= 0 && local13 < 104 && local7 >= 0 && local7 < 104) {
					Static97.aByteArrayArrayArray6[0][local13][local7] = 127;
					if (local13 == arg0 && local13 > 0) {
						Static100.anIntArrayArrayArray5[0][local13][local7] = Static100.anIntArrayArrayArray5[0][local13 - 1][local7];
					}
					if (local13 == arg0 + arg2 && local13 < 103) {
						Static100.anIntArrayArrayArray5[0][local13][local7] = Static100.anIntArrayArrayArray5[0][local13 + 1][local7];
					}
					if (arg1 == local7 && local7 > 0) {
						Static100.anIntArrayArrayArray5[0][local13][local7] = Static100.anIntArrayArrayArray5[0][local13][local7 - 1];
					}
					if (arg3 + arg1 == local7 && local7 < 103) {
						Static100.anIntArrayArrayArray5[0][local13][local7] = Static100.anIntArrayArrayArray5[0][local13][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
	public static void method708() {
		@Pc(1) Object local1 = Static49.anObject1;
		synchronized (Static49.anObject1) {
			if (Static89.anInt2163 == 0) {
				Static9.aClass74_1.method1875(5, new Class4());
			}
			Static89.anInt2163 = 600;
		}
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V")
	public static void method709() {
		aClass80_485 = null;
		aClass80_484 = null;
		aClass80_481 = null;
		aClass80_482 = null;
		aClass80_486 = null;
		aClass80_483 = null;
		aClass80_487 = null;
		aClass80_480 = null;
		aClass11_23 = null;
	}
}
