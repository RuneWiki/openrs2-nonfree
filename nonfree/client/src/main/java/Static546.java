import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IILclient!vg;ILclient!vg;ZIIII)V")
	public static void method7618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub1_Sub1_Sub2 arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg4.method2775();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class20 local21 = (Class20) Static616.aClass233_61.method5669((long) local7);
		if (local21 == null) {
			@Pc(28) Class120[] local28 = Static647.method3075(Static594.aClass97_144, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static600.aClass87_15.method7969(local28[0], true);
			Static616.aClass233_61.method5662(local21, (long) local7);
		}
		Static24.method591(arg0 >> 1, arg2.method2778() * 256, 0, arg2.anInt9925, arg2.anInt9929, arg2.aByte124, arg5 >> 1);
		@Pc(78) int local78 = arg6 + Static269.anIntArray354[0] - 18;
		@Pc(89) int local89 = arg1 + Static269.anIntArray354[1] - 16 - 54;
		@Pc(97) int local97 = local78 + arg3 / 4 * 18;
		@Pc(105) int local105 = local89 + arg3 % 4 * 18;
		local21.method4582(local97, local105);
		if (arg4 == arg2) {
			Static600.aClass87_15.method7933(-256, local105 - 1, 18, 18, local97 - 1);
		}
		Static233.method3884(local105 + 18, local105 + -1, local97 - 1, local97 + 18);
		@Pc(141) Class11_Sub3 local141 = Static118.method2468();
		local141.anInt2992 = local97;
		local141.anInt2993 = local105;
		local141.anInt2990 = local105 + 16;
		local141.aClass11_Sub1_Sub1_Sub2_1 = arg4;
		local141.anInt2991 = local97 + 16;
		Static49.aClass143_2.method3529(local141);
	}
}
