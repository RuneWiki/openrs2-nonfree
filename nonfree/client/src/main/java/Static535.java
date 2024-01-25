import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method6656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class2_Sub34 local7 = null;
		for (@Pc(12) Class2_Sub34 local12 = (Class2_Sub34) Static465.aClass249_64.method6527(); local12 != null; local12 = (Class2_Sub34) Static465.aClass249_64.method6525()) {
			if (local12.anInt5720 == arg0 && arg5 == local12.anInt5719 && local12.anInt5726 == arg4 && arg1 == local12.anInt5723) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub34();
			local7.anInt5726 = arg4;
			local7.anInt5720 = arg0;
			local7.anInt5719 = arg5;
			local7.anInt5723 = arg1;
			if (arg5 >= 0 && arg4 >= 0 && Static363.anInt1158 > arg5 && Static511.anInt8889 > arg4) {
				Static256.method4014(local7);
			}
			Static465.aClass249_64.method6523(local7);
		}
		local7.anInt5724 = arg3;
		local7.anInt5715 = arg6;
		local7.anInt5717 = -1;
		local7.anInt5725 = 0;
		local7.anInt5718 = arg2;
	}

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
	public static void method6661() {
		Static381.aClass2_Sub29_Sub2_2.method5185(Static498.aClass53_140.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static71.aClass53_21.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static163.aClass53_50.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static168.aClass53_52.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static383.aClass53_109.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static360.aClass53_151.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static463.aClass53_134.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static248.aClass53_78.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static460.aClass53_147.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static147.aClass53_47.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static244.aClass53_76.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static447.aClass53_125.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static458.aClass53_131.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static36.aClass53_10.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static442.aClass53_122.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static391.aClass53_113.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static478.aClass53_137.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static36.aClass53_9.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static358.aClass53_101.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static62.aClass53_20.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static501.aClass53_141.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static103.aClass53_32.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static398.aClass53_116.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static420.aClass53_119.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static43.aClass53_15.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static530.aClass53_150.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static425.aClass53_105.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static459.aClass53_132.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static7.aClass53_124.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static505.aClass53_143.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static85.aClass53_25.method1597());
		Static381.aClass2_Sub29_Sub2_2.method5185(Static19.aClass53_4.method1597());
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
	public static void method6662() {
		@Pc(15) Class107[] local15 = Class2_Sub9.aClass107Array1;
		synchronized (Class2_Sub9.aClass107Array1) {
			for (@Pc(19) int local19 = 0; local19 < Class2_Sub9.aClass107Array1.length; local19++) {
				Class2_Sub9.aClass107Array1[local19] = new Class107();
				Static487.anIntArray656[local19] = 0;
			}
		}
	}
}
