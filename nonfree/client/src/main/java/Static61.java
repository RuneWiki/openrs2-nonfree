import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
	public static int anInt1480;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "[Lclient!pd;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!jd;")
	public static Class61 aClass61_22 = new Class61(64);

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
	public static int anInt1488 = -1;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!sc;")
	private static Class107 aClass107_412 = Static231.method3737("Thu");

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "Lclient!sc;")
	private static Class107 aClass107_413 = Static231.method3737("Mon");

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "Lclient!sc;")
	private static Class107 aClass107_414 = Static231.method3737("Sun");

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "Lclient!sc;")
	private static Class107 aClass107_415 = Static231.method3737("Tue");

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "Lclient!sc;")
	private static Class107 aClass107_416 = Static231.method3737("Wed");

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "Lclient!sc;")
	private static Class107 aClass107_417 = Static231.method3737("Fri");

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Lclient!sc;")
	private static Class107 aClass107_418 = Static231.method3737("Sat");

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array6 = new Class107[] { aClass107_414, aClass107_413, aClass107_415, aClass107_416, aClass107_412, aClass107_417, aClass107_418 };

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array7 = new Class107[100];

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
	public static int anInt1490 = -1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method1163() {
		Static57.aClass61_93.method1689();
		Static185.aClass61_92.method1689();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public static void method1164() {
		try {
			if (Static71.aClass65_1 == null) {
				Static71.aClass65_1 = new Class65(Static117.aClass34_2, Static149.method2437(new Class107[] { Static56.method1122(), Static163.aClass107_956 }).method3068());
			}
		} catch (@Pc(32) Exception local32) {
			local32.printStackTrace();
			Static71.aClass65_1 = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	public static void method1167() {
		@Pc(7) int local7 = Static100.anInt2167;
		@Pc(9) int local9 = Static44.anInt965;
		@Pc(11) int local11 = Static101.anInt2176;
		@Pc(13) int local13 = Static104.anInt3191;
		Static205.method3250(local7, local13, local9, local11, 6116423);
		Static205.method3250(local7 + 1, local13 + 1, local9 - 2, 16, 0);
		Static205.method3249(local7 + 1, local13 + 18, local9 - 2, local11 + -19, 0);
		Static175.aClass1_Sub2_Sub15_3.method3331(Static191.aClass107_1107, local7 + 3, local13 - -14, 6116423, -1);
		@Pc(60) int local60 = Static220.anInt4822;
		@Pc(62) int local62 = Static181.anInt4311;
		for (@Pc(64) int local64 = 0; local64 < Static8.anInt259; local64++) {
			@Pc(79) int local79 = (Static8.anInt259 - local64 - 1) * 15 + local13 + 31;
			@Pc(81) int local81 = 16777215;
			if (local60 > local7 && local9 + local7 > local60 && local79 - 13 < local62 && local79 + 3 > local62) {
				local81 = 16776960;
			}
			Static175.aClass1_Sub2_Sub15_3.method3331(Static75.method1338(local64), local7 + 3, local79, local81, 0);
		}
		Static101.method1698(Static100.anInt2167, Static104.anInt3191, Static44.anInt965, Static101.anInt2176);
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Z")
	public static boolean method1169() {
		try {
			if (Static116.anInt2569 == 2) {
				if (Static194.aClass1_Sub27_1 == null) {
					Static194.aClass1_Sub27_1 = Static243.method3055(Static16.aClass28_7, Static125.anInt2704, Static114.anInt2517);
					if (Static194.aClass1_Sub27_1 == null) {
						return false;
					}
				}
				if (Static39.aClass12_1 == null) {
					Static39.aClass12_1 = new Class12(Static117.aClass28_47, Static133.aClass28_52);
				}
				if (Static218.aClass1_Sub6_Sub2_3.method1442(Static54.aClass28_25, Static194.aClass1_Sub27_1, Static39.aClass12_1)) {
					Static218.aClass1_Sub6_Sub2_3.method1447();
					Static218.aClass1_Sub6_Sub2_3.method1445(Static105.anInt2303);
					Static218.aClass1_Sub6_Sub2_3.method1453(Static97.aBoolean190, Static194.aClass1_Sub27_1);
					Static116.anInt2569 = 0;
					Static194.aClass1_Sub27_1 = null;
					Static16.aClass28_7 = null;
					Static39.aClass12_1 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static218.aClass1_Sub6_Sub2_3.method1451();
			Static116.anInt2569 = 0;
			Static194.aClass1_Sub27_1 = null;
			Static39.aClass12_1 = null;
			Static16.aClass28_7 = null;
		}
		return false;
	}
}
