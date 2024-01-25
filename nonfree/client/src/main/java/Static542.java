import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_143 = new Class397(65, 6);

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_144 = new Class397(15, 7);

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "Lclient!dja;")
	public static final Class78 aClass78_11 = new Class78("", 14);

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIBI)V")
	public static void method7185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg0;
		@Pc(15) int local15 = arg3 - arg1;
		if (local10 == 0) {
			if (local15 != 0) {
				Static291.method4047(arg2, arg0, arg3, arg1);
			}
		} else if (local15 == 0) {
			Static381.method5135(arg0, arg1, arg2, arg4);
		} else {
			@Pc(54) int local54 = (local15 << 12) / local10;
			@Pc(62) int local62 = arg1 - (local54 * arg0 >> 12);
			@Pc(71) int local71;
			@Pc(79) int local79;
			if (arg4 < Static82.anInt1902) {
				local71 = Static82.anInt1902;
				local79 = (Static82.anInt1902 * local54 >> 12) + local62;
			} else if (arg4 <= Static77.anInt1737) {
				local79 = arg3;
				local71 = arg4;
			} else {
				local71 = Static77.anInt1737;
				local79 = local62 + (Static77.anInt1737 * local54 >> 12);
			}
			@Pc(115) int local115;
			@Pc(113) int local113;
			if (Static82.anInt1902 > arg0) {
				local113 = (Static82.anInt1902 * local54 >> 12) + local62;
				local115 = Static82.anInt1902;
			} else if (Static77.anInt1737 >= arg0) {
				local115 = arg0;
				local113 = arg1;
			} else {
				local113 = (local54 * Static77.anInt1737 >> 12) + local62;
				local115 = Static77.anInt1737;
			}
			if (Static549.anInt5294 > local79) {
				local79 = Static549.anInt5294;
				local71 = (Static549.anInt5294 - local62 << 12) / local54;
			} else if (local79 > Static334.anInt5381) {
				local71 = (Static334.anInt5381 - local62 << 12) / local54;
				local79 = Static334.anInt5381;
			}
			if (Static549.anInt5294 > local113) {
				local113 = Static549.anInt5294;
				local115 = (Static549.anInt5294 - local62 << 12) / local54;
			} else if (Static334.anInt5381 < local113) {
				local113 = Static334.anInt5381;
				local115 = (Static334.anInt5381 - local62 << 12) / local54;
			}
			Static90.method4199(arg2, local113, local79, local115, local71);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	public static void method7186() {
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub15_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub15_2);
		Static580.aClass3_Sub22_24.method2423(2, Static580.aClass3_Sub22_24.aClass21_Sub21_1);
		Static580.aClass3_Sub22_24.method2423(2, Static580.aClass3_Sub22_24.aClass21_Sub21_2);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub5_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub22_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub1_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub9_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub7_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub27_1);
		Static580.aClass3_Sub22_24.method2423(2, Static580.aClass3_Sub22_24.aClass21_Sub30_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub2_1);
		Static580.aClass3_Sub22_24.method2423(2, Static580.aClass3_Sub22_24.aClass21_Sub25_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub8_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub6_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub6_2);
		Static580.aClass3_Sub22_24.method2423(2, Static580.aClass3_Sub22_24.aClass21_Sub26_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub23_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub19_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub14_1);
		Static108.method2127();
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub11_1);
		Static580.aClass3_Sub22_24.method2423(4, Static580.aClass3_Sub22_24.aClass21_Sub13_1);
		Static585.method7560();
		Static509.method6646();
		Static477.aBoolean507 = true;
	}
}
