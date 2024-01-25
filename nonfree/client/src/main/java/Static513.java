import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
	public static int anInt8697;

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Lclient!pu;")
	public static Class270 aClass270_106;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "Lclient!fv;")
	public static Class111 aClass111_3;

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "[I")
	public static final int[] anIntArray659 = new int[5];

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg7 && arg1 == arg3 && arg8 == arg2 && arg0 == arg5) {
			Static520.method7229(arg4, arg2, arg1, arg6, arg5);
			return;
		}
		@Pc(28) int local28 = arg6;
		@Pc(30) int local30 = arg1;
		@Pc(34) int local34 = arg6 * 3;
		@Pc(38) int local38 = arg1 * 3;
		@Pc(42) int local42 = arg7 * 3;
		@Pc(46) int local46 = arg3 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg0 * 3;
		@Pc(63) int local63 = local42 + arg2 - local50 - arg6;
		@Pc(73) int local73 = arg5 + local46 - arg1 - local54;
		@Pc(82) int local82 = local34 + local50 - local42 - local42;
		@Pc(92) int local92 = local38 + local54 - local46 - local46;
		@Pc(97) int local97 = local42 - local34;
		@Pc(102) int local102 = local46 - local38;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(112) int local112 = local104 * local104 >> 12;
			@Pc(118) int local118 = local112 * local104 >> 12;
			@Pc(122) int local122 = local118 * local63;
			@Pc(126) int local126 = local118 * local73;
			@Pc(130) int local130 = local82 * local112;
			@Pc(134) int local134 = local112 * local92;
			@Pc(138) int local138 = local104 * local97;
			@Pc(142) int local142 = local104 * local102;
			@Pc(155) int local155 = arg6 + (local122 + local130 + local138 >> 12);
			@Pc(166) int local166 = (local126 + local134 + local142 >> 12) + arg1;
			Static520.method7229(arg4, local155, local30, local28, local166);
			local28 = local155;
			local30 = local166;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!qaa;I)V")
	public static void method7128(@OriginalArg(0) Class1_Sub35_Sub2 arg0) {
		arg0.method5792(Static588.aClass270_122.method5676());
		arg0.method5792(Static181.aClass270_39.method5676());
		arg0.method5792(Static462.aClass270_97.method5676());
		arg0.method5792(Static332.aClass270_88.method5676());
		arg0.method5792(Static71.aClass270_14.method5676());
		arg0.method5792(Static559.aClass270_116.method5676());
		arg0.method5792(Static358.aClass270_69.method5676());
		arg0.method5792(Static412.aClass270_84.method5676());
		arg0.method5792(Static463.aClass270_98.method5676());
		arg0.method5792(Static69.aClass270_13.method5676());
		arg0.method5792(Static172.aClass270_38.method5676());
		arg0.method5792(Static408.aClass270_81.method5676());
		arg0.method5792(Static410.aClass270_83.method5676());
		arg0.method5792(Static412.aClass270_85.method5676());
		arg0.method5792(Static360.aClass270_68.method5676());
		arg0.method5792(Static374.aClass270_72.method5676());
		arg0.method5792(Static416.aClass270_86.method5676());
		arg0.method5792(Static530.aClass270_111.method5676());
		arg0.method5792(Static82.aClass270_15.method5676());
		arg0.method5792(Static535.aClass270_112.method5676());
		arg0.method5792(aClass270_106.method5676());
		arg0.method5792(Static498.aClass270_102.method5676());
		arg0.method5792(Static521.aClass270_108.method5676());
		arg0.method5792(Static129.aClass270_30.method5676());
		arg0.method5792(Static171.aClass270_37.method5676());
		arg0.method5792(Static101.aClass270_22.method5676());
		arg0.method5792(Static103.aClass270_23.method5676());
		arg0.method5792(Static344.aClass270_66.method5676());
		arg0.method5792(Static416.aClass270_87.method5676());
		arg0.method5792(Static6.aClass270_1.method5676());
		arg0.method5792(Static442.aClass270_96.method5676());
		arg0.method5792(Static398.aClass270_78.method5676());
		arg0.method5792(Static576.method7741());
		arg0.method5792(Static103.method1714());
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V")
	public static void method7133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(15, 0);
		local8.method6594();
		local8.anInt8204 = arg1;
		local8.anInt8208 = arg0;
	}
}
