import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!to", name = "v", descriptor = "Lclient!l;")
	public static Interface7 anInterface7_6;

	@OriginalMember(owner = "client!to", name = "nb", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!to", name = "oc", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray64 = new String[100];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Z")
	public static boolean method5463() {
		return Static429.aClass129_8 != Static112.aClass129_4 || Static81.anInt1300 >= 2;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I[IIIII[IIZIILclient!sj;III)I")
	public static int method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class225 arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(1) int local1 = 0; local1 < 128; local1++) {
			for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
				Static320.anIntArrayArray138[local1][local4] = 0;
				Static397.anIntArrayArray168[local1][local4] = 99999999;
			}
		}
		@Pc(49) boolean local49;
		if (arg7 == 1) {
			local49 = Static208.method4871(arg4, arg11, arg10, arg5, arg0, arg13, arg2, arg12, arg3, arg9);
		} else if (arg7 == 2) {
			local49 = Static69.method1077(arg9, arg2, arg4, arg5, arg0, arg10, arg3, arg11, arg12, arg13);
		} else {
			local49 = Static259.method3678(arg11, arg7, arg5, arg9, arg12, arg0, arg2, arg3, arg10, arg13, arg4);
		}
		@Pc(85) int local85 = arg9 - 64;
		@Pc(89) int local89 = arg5 - 64;
		@Pc(91) int local91 = Static199.anInt3421;
		@Pc(93) int local93 = Static379.anInt3836;
		@Pc(101) int local101;
		@Pc(103) int local103;
		@Pc(110) int local110;
		if (!local49) {
			if (!arg8) {
				return -1;
			}
			local101 = Integer.MAX_VALUE;
			local103 = Integer.MAX_VALUE;
			for (local110 = arg2 - 10; local110 <= arg2 + 10; local110++) {
				for (@Pc(116) int local116 = arg12 - 10; local116 <= arg12 + 10; local116++) {
					@Pc(122) int local122 = local110 - local85;
					@Pc(127) int local127 = local116 - local89;
					if (local122 >= 0 && local127 >= 0 && local122 < 128 && local127 < 128 && Static397.anIntArrayArray168[local122][local127] < 100) {
						@Pc(151) int local151 = 0;
						if (local110 < arg2) {
							local151 = arg2 - local110;
						} else if (arg2 + arg10 - 1 < local110) {
							local151 = local110 + 1 - arg10 - arg2;
						}
						@Pc(182) int local182 = 0;
						if (arg12 > local116) {
							local182 = arg12 - local116;
						} else if (local116 > arg3 + arg12 - 1) {
							local182 = local116 + 1 - arg12 - arg3;
						}
						@Pc(219) int local219 = local151 * local151 + local182 * local182;
						if (local219 < local101 || local101 == local219 && Static397.anIntArrayArray168[local122][local127] < local103) {
							local103 = Static397.anIntArrayArray168[local122][local127];
							local101 = local219;
							local91 = local110;
							local93 = local116;
						}
					}
				}
			}
			if (local101 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local91 == arg9 && local93 == arg5) {
			return 0;
		}
		@Pc(284) byte local284 = 0;
		Static311.anIntArray475[0] = local91;
		local101 = local284 + 1;
		Static228.anIntArray515[0] = local93;
		@Pc(310) int local310;
		local103 = local310 = Static320.anIntArrayArray138[local91 - local85][local93 - local89];
		while (arg9 != local91 || arg5 != local93) {
			if (local310 != local103) {
				Static311.anIntArray475[local101] = local91;
				local310 = local103;
				Static228.anIntArray515[local101++] = local93;
			}
			if ((local103 & 0x1) != 0) {
				local93++;
			} else if ((local103 & 0x4) != 0) {
				local93--;
			}
			if ((local103 & 0x2) != 0) {
				local91++;
			} else if ((local103 & 0x8) != 0) {
				local91--;
			}
			local103 = Static320.anIntArrayArray138[local91 - local85][local93 - local89];
		}
		local110 = 0;
		while (local101-- > 0) {
			arg6[local110] = Static311.anIntArray475[local101];
			arg1[local110++] = Static228.anIntArray515[local101];
			if (arg6.length <= local110) {
				break;
			}
		}
		return local110;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I[Ljava/lang/Object;I[II)V")
	public static void method5471(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg0];
		arg3[arg0] = local20;
		@Pc(34) Object local34 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg2; local53 < arg0; local53++) {
			if ((local51 & local53) + local20 > arg3[local53]) {
				@Pc(68) int local68 = arg3[local53];
				arg3[local53] = arg3[local16];
				arg3[local16] = local68;
				@Pc(82) Object local82 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16++] = local82;
			}
		}
		arg3[arg0] = arg3[local16];
		arg3[local16] = local20;
		arg1[arg0] = arg1[local16];
		arg1[local16] = local34;
		method5471(local16 - 1, arg1, arg2, arg3);
		method5471(arg0, arg1, local16 + 1, arg3);
	}
}
