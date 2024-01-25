import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "[Lclient!rd;")
	public static Class196[] aClass196Array1;

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
	public static int anInt3079 = 0;

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
	public static int anInt3081 = 0;

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
	public static int anInt3084 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIIIZIIII)V")
	public static void method2825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(15) Class12_Sub1_Sub2 local15;
		@Pc(11) int local11;
		if (arg5 >= 0) {
			local11 = arg5 - 1;
			local15 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local11];
		} else {
			local11 = -arg5 - 1;
			if (Static194.anInt3441 == local11) {
				local15 = Static267.aClass12_Sub1_Sub2_Sub2_1;
			} else {
				local15 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local11];
			}
		}
		if (local15 == null) {
			return;
		}
		@Pc(41) Class34 local41 = Static11.aClass123_5.method2703(arg3);
		@Pc(50) int local50;
		@Pc(53) int local53;
		if (arg10 == 1 || arg10 == 3) {
			local50 = local41.anInt808;
			local53 = local41.lb;
		} else {
			local50 = local41.lb;
			local53 = local41.anInt808;
		}
		@Pc(68) int local68 = arg2 + (local50 >> 1);
		@Pc(76) int local76 = (local50 + 1 >> 1) + arg2;
		@Pc(82) int local82 = (local53 >> 1) + arg9;
		@Pc(90) int local90 = arg9 + (local53 + 1 >> 1);
		@Pc(94) Class33 local94 = Static17.aClass33Array1[arg12];
		@Pc(118) int local118 = local94.method4057(local68, local82) + local94.method4057(local76, local82) + local94.method4057(local68, local90) + local94.method4057(local76, local90) >> 2;
		@Pc(122) Class2_Sub3 local122 = new Class2_Sub3();
		local122.anInt155 = arg4 + Static295.anInt5281;
		local122.anInt160 = arg3;
		local122.anInt151 = arg8;
		@Pc(142) int local142;
		if (arg1 < arg6) {
			local142 = arg6;
			arg6 = arg1;
			arg1 = local142;
		}
		local122.anInt149 = arg2;
		local122.anInt156 = arg9;
		local122.anInt157 = local15.aByte74;
		local122.anInt161 = arg10;
		local122.anInt153 = Static295.anInt5281 + arg0;
		local122.anInt152 = arg2 + arg6;
		if (arg7 < arg11) {
			local142 = arg11;
			arg11 = arg7;
			arg7 = local142;
		}
		local122.anInt159 = arg2 + arg1;
		local122.anInt145 = local50 * 64 + local122.anInt149 * 128;
		local122.anInt148 = local118;
		local122.anInt162 = arg9 + arg7;
		local122.anInt146 = local122.anInt156 * 128 + local53 * 64;
		local122.anInt158 = arg11 + arg9;
		Static365.aClass210_19.method5044(local122);
		local15.aClass2_Sub3_3 = local122;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)Z")
	public static boolean method2826(@OriginalArg(0) int arg0) {
		if (arg0 == 11 || arg0 == 45 || arg0 == 46 || arg0 == 60 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1007;
		}
	}
}
