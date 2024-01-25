import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray16;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_139 = new Class126(20, 3);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIILclient!jo;ZI[II[IIII)I")
	public static int method5728(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class198 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static638.anIntArrayArray106[local3][local7] = 0;
				Static376.anIntArrayArray70[local3][local7] = 99999999;
			}
		}
		@Pc(61) boolean local61;
		if (arg1 == 1) {
			local61 = Static283.method4484(arg12, arg9, arg0, arg3, arg5, arg13, arg4, arg2, arg11, arg7);
		} else if (arg1 == 2) {
			local61 = Static84.method8604(arg5, arg4, arg11, arg2, arg13, arg12, arg0, arg3, arg9, arg7);
		} else {
			local61 = Static180.method2977(arg2, arg0, arg1, arg9, arg12, arg13, arg3, arg5, arg7, arg4, arg11);
		}
		@Pc(97) int local97 = arg12 - 64;
		@Pc(101) int local101 = arg4 - 64;
		@Pc(103) int local103 = Static77.anInt1744;
		@Pc(105) int local105 = Static502.anInt8448;
		@Pc(111) int local111;
		@Pc(113) int local113;
		@Pc(120) int local120;
		if (!local61) {
			if (!arg6) {
				return -1;
			}
			local111 = Integer.MAX_VALUE;
			local113 = Integer.MAX_VALUE;
			for (local120 = arg7 - 10; local120 <= arg7 + 10; local120++) {
				for (@Pc(127) int local127 = arg3 - 10; local127 <= arg3 + 10; local127++) {
					@Pc(134) int local134 = local120 - local97;
					@Pc(138) int local138 = local127 - local101;
					if (local134 >= 0 && local138 >= 0 && local134 < 128 && local138 < 128 && Static376.anIntArrayArray70[local134][local138] < 100) {
						@Pc(159) int local159 = 0;
						if (arg7 > local120) {
							local159 = arg7 - local120;
						} else if (local120 > arg13 + arg7 - 1) {
							local159 = local120 + 1 - arg13 - arg7;
						}
						@Pc(192) int local192 = 0;
						if (local127 < arg3) {
							local192 = arg3 - local127;
						} else if (arg11 + arg3 - 1 < local127) {
							local192 = local127 + 1 - arg11 - arg3;
						}
						@Pc(225) int local225 = local192 * local192 + local159 * local159;
						if (local225 < local111 || local225 == local111 && Static376.anIntArrayArray70[local134][local138] < local113) {
							local103 = local120;
							local111 = local225;
							local105 = local127;
							local113 = Static376.anIntArrayArray70[local134][local138];
						}
					}
				}
			}
			if (~local111 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local103 == arg12 && arg4 == local105) {
			return 0;
		}
		@Pc(293) byte local293 = 0;
		Static476.anIntArray503[0] = local103;
		local111 = local293 + 1;
		Static331.anIntArray638[0] = local105;
		@Pc(315) int local315;
		local113 = local315 = Static638.anIntArrayArray106[local103 - local97][local105 - local101];
		while (arg12 != local103 || local105 != arg4) {
			if (local113 != local315) {
				local315 = local113;
				Static476.anIntArray503[local111] = local103;
				Static331.anIntArray638[local111++] = local105;
			}
			if ((local113 & 0x2) != 0) {
				local103++;
			} else if ((local113 & 0x8) != 0) {
				local103--;
			}
			if ((local113 & 0x1) != 0) {
				local105++;
			} else if ((local113 & 0x4) != 0) {
				local105--;
			}
			local113 = Static638.anIntArrayArray106[local103 - local97][local105 - local101];
		}
		local120 = 0;
		while (local111-- > 0) {
			arg10[local120] = Static476.anIntArray503[local111];
			arg8[local120++] = Static331.anIntArray638[local111];
			if (local120 >= arg10.length) {
				break;
			}
		}
		return local120;
	}
}
