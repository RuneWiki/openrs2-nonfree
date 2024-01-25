import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!po", name = "n", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III[IIIIZI[ILclient!sl;BIII)I")
	public static int method5824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class295 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static88.anIntArrayArray26[local3][local7] = 0;
				Static102.anIntArrayArray29[local3][local7] = 99999999;
			}
		}
		@Pc(53) boolean local53;
		if (arg12 == 1) {
			local53 = Static127.method3633(arg8, arg10, arg2, arg6, arg1, arg13, arg5, arg11, arg0, arg4);
		} else if (arg12 == 2) {
			local53 = Static147.method2186(arg6, arg4, arg10, arg11, arg2, arg1, arg5, arg13, arg8, arg0);
		} else {
			local53 = Static47.method7650(arg13, arg8, arg1, arg5, arg6, arg4, arg10, arg2, arg0, arg11, arg12);
		}
		@Pc(91) int local91 = arg13 - 64;
		@Pc(95) int local95 = arg1 - 64;
		@Pc(97) int local97 = Static119.anInt7676;
		@Pc(99) int local99 = Static97.anInt1600;
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		if (!local53) {
			if (!arg7) {
				return -1;
			}
			local105 = Integer.MAX_VALUE;
			local107 = Integer.MAX_VALUE;
			for (local114 = arg0 - 10; local114 <= arg0 + 10; local114++) {
				for (@Pc(121) int local121 = arg4 - 10; local121 <= arg4 + 10; local121++) {
					@Pc(128) int local128 = local114 - local91;
					@Pc(132) int local132 = local121 - local95;
					if (local128 >= 0 && local132 >= 0 && local128 < 128 && local132 < 128 && Static102.anIntArrayArray29[local128][local132] < 100) {
						@Pc(156) int local156 = 0;
						if (local114 < arg0) {
							local156 = arg0 - local114;
						} else if (local114 > arg11 + arg0 - 1) {
							local156 = local114 + 1 - arg0 - arg11;
						}
						@Pc(188) int local188 = 0;
						if (arg4 > local121) {
							local188 = arg4 - local121;
						} else if (arg4 + arg2 - 1 < local121) {
							local188 = local121 + 1 - arg2 - arg4;
						}
						@Pc(228) int local228 = local156 * local156 + local188 * local188;
						if (local105 > local228 || local105 == local228 && local107 > Static102.anIntArrayArray29[local128][local132]) {
							local107 = Static102.anIntArrayArray29[local128][local132];
							local99 = local121;
							local105 = local228;
							local97 = local114;
						}
					}
				}
			}
			if (~local105 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg13 == local97 && local99 == arg1) {
			return 0;
		}
		@Pc(288) byte local288 = 0;
		Static160.anIntArray325[0] = local97;
		local105 = local288 + 1;
		Static502.anIntArray649[0] = local99;
		@Pc(315) int local315;
		local107 = local315 = Static88.anIntArrayArray26[local97 - local91][local99 - local95];
		while (local97 != arg13 || local99 != arg1) {
			if (local315 != local107) {
				local315 = local107;
				Static160.anIntArray325[local105] = local97;
				Static502.anIntArray649[local105++] = local99;
			}
			if ((local107 & 0x1) != 0) {
				local99++;
			} else if ((local107 & 0x4) != 0) {
				local99--;
			}
			if ((local107 & 0x2) != 0) {
				local97++;
			} else if ((local107 & 0x8) != 0) {
				local97--;
			}
			local107 = Static88.anIntArrayArray26[local97 - local91][local99 - local95];
		}
		local114 = 0;
		while (local105-- > 0) {
			arg3[local114] = Static160.anIntArray325[local105];
			arg9[local114++] = Static502.anIntArray649[local105];
			if (arg3.length <= local114) {
				break;
			}
		}
		return local114;
	}
}
