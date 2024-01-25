import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean423 = false;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public static void method5265() {
		@Pc(1) Class198 local1 = Static56.aClass198_15;
		synchronized (Static56.aClass198_15) {
			Static56.aClass198_15.method5243(5);
		}
		local1 = Static161.aClass198_25;
		synchronized (Static161.aClass198_25) {
			Static161.aClass198_25.method5243(5);
		}
		local1 = Static175.aClass198_28;
		synchronized (Static175.aClass198_28) {
			Static175.aClass198_28.method5243(5);
		}
		local1 = Static278.aClass198_51;
		synchronized (Static278.aClass198_51) {
			Static278.aClass198_51.method5243(5);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!sj;II)V")
	public static void method5266(@OriginalArg(1) Class181 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static276.aClass181_45 = arg0;
		Static97.anInt2040 = arg1;
		Static20.anInt549 = arg2;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII[I[IIIIIIIZLclient!ao;)I")
	public static int method5267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) Class13 arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static177.anIntArrayArray24[local3][local7] = 0;
				Static238.anIntArrayArray42[local3][local7] = 99999999;
			}
		}
		@Pc(55) boolean local55;
		if (arg10 == 1) {
			local55 = Static198.method3463(arg1, arg13, arg8, arg3, arg7, arg0, arg2, arg6, arg11, arg9);
		} else if (arg10 == 2) {
			local55 = Static159.method2521(arg11, arg1, arg9, arg3, arg2, arg8, arg7, arg13, arg6, arg0);
		} else {
			local55 = Static99.method1711(arg8, arg13, arg3, arg9, arg1, arg2, arg6, arg0, arg11, arg7, arg10);
		}
		@Pc(89) int local89 = arg0 - 64;
		@Pc(93) int local93 = arg8 - 64;
		@Pc(95) int local95 = Static132.anInt2759;
		@Pc(97) int local97 = Static45.anInt929;
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(121) int local121;
		if (!local55) {
			if (!arg12) {
				return -1;
			}
			local105 = Integer.MAX_VALUE;
			local107 = Integer.MAX_VALUE;
			for (@Pc(114) int local114 = arg3 - 10; local114 <= arg3 + 10; local114++) {
				for (local121 = arg1 - 10; local121 <= arg1 + 10; local121++) {
					@Pc(128) int local128 = local114 - local89;
					@Pc(133) int local133 = local121 - local93;
					if (local128 >= 0 && local133 >= 0 && local128 < 128 && local133 < 128 && Static238.anIntArrayArray42[local128][local133] < 100) {
						@Pc(157) int local157 = 0;
						if (arg3 > local114) {
							local157 = arg3 - local114;
						} else if (arg3 + arg6 - 1 < local114) {
							local157 = local114 + 1 - arg3 - arg6;
						}
						@Pc(189) int local189 = 0;
						if (local121 < arg1) {
							local189 = arg1 - local121;
						} else if (arg1 + arg2 - 1 < local121) {
							local189 = local121 + 1 - arg2 - arg1;
						}
						@Pc(225) int local225 = local157 * local157 + local189 * local189;
						if (local105 > local225 || local105 == local225 && local107 > Static238.anIntArrayArray42[local128][local133]) {
							local97 = local121;
							local105 = local225;
							local95 = local114;
							local107 = Static238.anIntArrayArray42[local128][local133];
						}
					}
				}
			}
			if (~local105 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg0 == local95 && local97 == arg8) {
			return 0;
		}
		@Pc(287) byte local287 = 0;
		Static238.anIntArray380[0] = local95;
		local105 = local287 + 1;
		Static227.anIntArray376[0] = local97;
		@Pc(317) int local317;
		local107 = local317 = Static177.anIntArrayArray24[local95 - local89][local97 - local93];
		while (local95 != arg0 || arg8 != local97) {
			if (local317 != local107) {
				Static238.anIntArray380[local105] = local95;
				local317 = local107;
				Static227.anIntArray376[local105++] = local97;
			}
			if ((local107 & 0x1) != 0) {
				local97++;
			} else if ((local107 & 0x4) != 0) {
				local97--;
			}
			if ((local107 & 0x2) != 0) {
				local95++;
			} else if ((local107 & 0x8) != 0) {
				local95--;
			}
			local107 = Static177.anIntArrayArray24[local95 - local89][local97 - local93];
		}
		local121 = 0;
		while (local105-- > 0) {
			arg4[local121] = Static238.anIntArray380[local105];
			arg5[local121++] = Static227.anIntArray376[local105];
			if (local121 >= arg4.length) {
				break;
			}
		}
		return local121;
	}
}
