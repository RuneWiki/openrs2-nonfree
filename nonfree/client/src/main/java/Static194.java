import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZLclient!pf;IIIIIBI[II[III)I")
	public static int method3308(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static381.anIntArrayArray59[local7][local11] = 0;
				Static135.anIntArrayArray28[local7][local11] = 99999999;
			}
		}
		@Pc(49) boolean local49;
		if (arg10 == 1) {
			local49 = Static269.method4137(arg3, arg7, arg12, arg13, arg8, arg5, arg0, arg6, arg2, arg4);
		} else if (arg10 == 2) {
			local49 = Static342.method5008(arg2, arg12, arg6, arg0, arg13, arg8, arg5, arg7, arg3, arg4);
		} else {
			local49 = Static245.method3913(arg5, arg8, arg6, arg13, arg4, arg2, arg7, arg0, arg12, arg3, arg10);
		}
		@Pc(87) int local87 = arg3 - 64;
		@Pc(91) int local91 = arg13 - 64;
		@Pc(93) int local93 = Static60.anInt1160;
		@Pc(95) int local95 = Static197.anInt3647;
		@Pc(109) int local109;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (!local49) {
			if (!arg1) {
				return -1;
			}
			local109 = Integer.MAX_VALUE;
			local111 = Integer.MAX_VALUE;
			for (local118 = arg8 - 10; local118 <= arg8 + 10; local118++) {
				for (@Pc(125) int local125 = arg12 - 10; local125 <= arg12 + 10; local125++) {
					@Pc(131) int local131 = local118 - local87;
					@Pc(136) int local136 = local125 - local91;
					if (local131 >= 0 && local136 >= 0 && local131 < 128 && local136 < 128 && Static135.anIntArrayArray28[local131][local136] < 100) {
						@Pc(162) int local162 = 0;
						if (local118 < arg8) {
							local162 = arg8 - local118;
						} else if (local118 > arg8 + arg4 - 1) {
							local162 = local118 + 1 - arg8 - arg4;
						}
						@Pc(193) int local193 = 0;
						if (arg12 > local125) {
							local193 = arg12 - local125;
						} else if (local125 > arg12 + arg6 - 1) {
							local193 = local125 + 1 - arg6 - arg12;
						}
						@Pc(231) int local231 = local162 * local162 + local193 * local193;
						if (local231 < local109 || local109 == local231 && Static135.anIntArrayArray28[local131][local136] < local111) {
							local95 = local125;
							local111 = Static135.anIntArrayArray28[local131][local136];
							local93 = local118;
							local109 = local231;
						}
					}
				}
			}
			if (~local109 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg3 == local93 && local95 == arg13) {
			return 0;
		}
		@Pc(308) byte local308 = 0;
		Static189.anIntArray1355[0] = local93;
		local109 = local308 + 1;
		Static275.anIntArray914[0] = local95;
		@Pc(328) int local328;
		local111 = local328 = Static381.anIntArrayArray59[local93 - local87][local95 - local91];
		while (arg3 != local93 || arg13 != local95) {
			if (local111 != local328) {
				local328 = local111;
				Static189.anIntArray1355[local109] = local93;
				Static275.anIntArray914[local109++] = local95;
			}
			if ((local111 & 0x2) != 0) {
				local93++;
			} else if ((local111 & 0x8) != 0) {
				local93--;
			}
			if ((local111 & 0x1) != 0) {
				local95++;
			} else if ((local111 & 0x4) != 0) {
				local95--;
			}
			local111 = Static381.anIntArrayArray59[local93 - local87][local95 - local91];
		}
		local118 = 0;
		while (local109-- > 0) {
			arg9[local118] = Static189.anIntArray1355[local109];
			arg11[local118++] = Static275.anIntArray914[local109];
			if (local118 >= arg9.length) {
				break;
			}
		}
		return local118;
	}
}
