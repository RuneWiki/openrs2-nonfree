import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "[I")
	public static int[] anIntArray813;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg6 - arg0;
		@Pc(20) int local20 = arg5 - arg0;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg5 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local24 * (1 - local56) + local40;
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(86) int local86 = (1 - local60) * local32 + local48;
		@Pc(94) int local94 = local36 - (local60 - 1) * local52;
		@Pc(98) int local98 = local24 << 2;
		@Pc(102) int local102 = local28 << 2;
		@Pc(106) int local106 = local32 << 2;
		@Pc(110) int local110 = local36 << 2;
		@Pc(114) int local114 = local40 * 3;
		@Pc(120) int local120 = local44 * (local56 - 3);
		@Pc(124) int local124 = local48 * 3;
		@Pc(130) int local130 = local52 * (local60 - 3);
		@Pc(132) int local132 = local102;
		@Pc(138) int local138 = local98 * (arg5 - 1);
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (local20 - 1);
		@Pc(169) int local169;
		@Pc(177) int local177;
		@Pc(188) int local188;
		@Pc(197) int local197;
		if (arg2 >= Static94.anInt2057 && arg2 <= Static187.anInt3872) {
			@Pc(160) int[] local160 = Static143.anIntArrayArray33[arg2];
			local169 = Static452.method6975(Static119.anInt2469, arg3 - arg6, Static325.anInt6148);
			local177 = Static452.method6975(Static119.anInt2469, arg3 + arg6, Static325.anInt6148);
			local188 = Static452.method6975(Static119.anInt2469, arg3 - local15, Static325.anInt6148);
			local197 = Static452.method6975(Static119.anInt2469, arg3 + local15, Static325.anInt6148);
			Static313.method5430(local188, arg4, local160, local169);
			Static313.method5430(local197, arg1, local160, local188);
			Static313.method5430(local177, arg4, local160, local197);
		}
		while (local9 > 0) {
			@Pc(224) boolean local224 = local20 >= local9;
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local114;
					local77 += local132;
					local114 += local102;
					local7++;
					local132 += local102;
				}
			}
			if (local224) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local124;
						local94 += local140;
						local140 += local110;
						local11++;
						local124 += local110;
					}
				}
				if (local94 < 0) {
					local94 += local140;
					local86 += local124;
					local140 += local110;
					local124 += local110;
					local11++;
				}
				local86 += -local146;
				local94 += -local130;
				local146 -= local106;
				local130 -= local106;
			}
			if (local77 < 0) {
				local77 += local132;
				local69 += local114;
				local132 += local102;
				local114 += local102;
				local7++;
			}
			local77 += -local120;
			local69 += -local138;
			local120 -= local98;
			local138 -= local98;
			local9--;
			local169 = arg2 - local9;
			local177 = local9 + arg2;
			if (Static94.anInt2057 <= local177 && local169 <= Static187.anInt3872) {
				local188 = Static452.method6975(Static119.anInt2469, arg3 + local7, Static325.anInt6148);
				local197 = Static452.method6975(Static119.anInt2469, arg3 - local7, Static325.anInt6148);
				if (local224) {
					@Pc(403) int local403 = Static452.method6975(Static119.anInt2469, local11 + arg3, Static325.anInt6148);
					@Pc(412) int local412 = Static452.method6975(Static119.anInt2469, arg3 - local11, Static325.anInt6148);
					@Pc(419) int[] local419;
					if (local169 >= Static94.anInt2057) {
						local419 = Static143.anIntArrayArray33[local169];
						Static313.method5430(local412, arg4, local419, local197);
						Static313.method5430(local403, arg1, local419, local412);
						Static313.method5430(local188, arg4, local419, local403);
					}
					if (local177 <= Static187.anInt3872) {
						local419 = Static143.anIntArrayArray33[local177];
						Static313.method5430(local412, arg4, local419, local197);
						Static313.method5430(local403, arg1, local419, local412);
						Static313.method5430(local188, arg4, local419, local403);
					}
				} else {
					if (local169 >= Static94.anInt2057) {
						Static313.method5430(local188, arg4, Static143.anIntArrayArray33[local169], local197);
					}
					if (Static187.anInt3872 >= local177) {
						Static313.method5430(local188, arg4, Static143.anIntArrayArray33[local177], local197);
					}
				}
			}
		}
	}
}
