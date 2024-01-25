import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!ub", name = "Yc", descriptor = "Lclient!rm;")
	public static Class311 aClass311_1;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[IIZIIILclient!eq;II[III)I")
	public static int method7883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class110 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static624.anIntArrayArray56[local3][local7] = 0;
				Static107.anIntArrayArray9[local3][local7] = 99999999;
			}
		}
		@Pc(58) boolean local58;
		if (arg12 == 1) {
			local58 = Static524.method6823(arg8, arg10, arg0, arg7, arg1, arg3, arg9, arg5, arg6, arg13);
		} else if (arg12 == 2) {
			local58 = Static379.method5352(arg6, arg7, arg9, arg1, arg3, arg10, arg5, arg0, arg8, arg13);
		} else {
			local58 = Static12.method350(arg6, arg1, arg13, arg10, arg9, arg3, arg0, arg12, arg8, arg7, arg5);
		}
		@Pc(93) int local93 = arg7 - 64;
		@Pc(97) int local97 = arg6 - 64;
		@Pc(99) int local99 = Static246.anInt4348;
		@Pc(101) int local101 = Static168.anInt3083;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(115) int local115;
		if (!local58) {
			if (!arg4) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (local115 = arg1 - 10; local115 <= arg1 + 10; local115++) {
				for (@Pc(122) int local122 = arg3 - 10; local122 <= arg3 + 10; local122++) {
					@Pc(129) int local129 = local115 - local93;
					@Pc(134) int local134 = local122 - local97;
					if (local129 >= 0 && local134 >= 0 && local129 < 128 && local134 < 128 && Static107.anIntArrayArray9[local129][local134] < 100) {
						@Pc(158) int local158 = 0;
						if (arg1 > local115) {
							local158 = arg1 - local115;
						} else if (local115 > arg1 + arg9 - 1) {
							local158 = local115 + 1 - arg1 - arg9;
						}
						@Pc(186) int local186 = 0;
						if (local122 < arg3) {
							local186 = arg3 - local122;
						} else if (arg13 + arg3 - 1 < local122) {
							local186 = local122 + 1 - arg3 - arg13;
						}
						@Pc(220) int local220 = local158 * local158 + local186 * local186;
						if (local220 < local107 || local107 == local220 && local109 > Static107.anIntArrayArray9[local129][local134]) {
							local109 = Static107.anIntArrayArray9[local129][local134];
							local101 = local122;
							local107 = local220;
							local99 = local115;
						}
					}
				}
			}
			if (~local107 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg7 == local99 && arg6 == local101) {
			return 0;
		}
		@Pc(288) byte local288 = 0;
		Static114.anIntArray117[0] = local99;
		local107 = local288 + 1;
		Static459.anIntArray400[0] = local101;
		@Pc(310) int local310;
		local109 = local310 = Static624.anIntArrayArray56[local99 - local93][local101 - local97];
		while (arg7 != local99 || local101 != arg6) {
			if (local109 != local310) {
				local310 = local109;
				Static114.anIntArray117[local107] = local99;
				Static459.anIntArray400[local107++] = local101;
			}
			if ((local109 & 0x2) != 0) {
				local99++;
			} else if ((local109 & 0x8) != 0) {
				local99--;
			}
			if ((local109 & 0x1) != 0) {
				local101++;
			} else if ((local109 & 0x4) != 0) {
				local101--;
			}
			local109 = Static624.anIntArrayArray56[local99 - local93][local101 - local97];
		}
		local115 = 0;
		while (local107-- > 0) {
			arg2[local115] = Static114.anIntArray117[local107];
			arg11[local115++] = Static459.anIntArray400[local107];
			if (arg2.length <= local115) {
				break;
			}
		}
		return local115;
	}
}
