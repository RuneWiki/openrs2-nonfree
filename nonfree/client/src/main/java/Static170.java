import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	public static int anInt2805 = 0;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
	public static int anInt2808 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!rv;I)Lclient!wu;")
	public static Class76 method2524(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3698();
		@Pc(16) Class112 local16 = Static17.method265()[arg0.method3642()];
		@Pc(23) Class4 local23 = Static49.method727()[arg0.method3642()];
		@Pc(27) int local27 = arg0.method3638();
		@Pc(31) int local31 = arg0.method3638();
		return new Class76(local7, local16, local23, local27, local31);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIILclient!mja;[IIIZ[IIII)I")
	public static int method2525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class234 arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(6) int local6 = 0; local6 < 128; local6++) {
			for (@Pc(9) int local9 = 0; local9 < 128; local9++) {
				Static435.anIntArrayArray55[local6][local9] = 0;
				Static507.anIntArrayArray69[local6][local9] = 99999999;
			}
		}
		@Pc(57) boolean local57;
		if (arg12 == 1) {
			local57 = Static285.method3925(arg11, arg1, arg13, arg2, arg0, arg3, arg8, arg5, arg7, arg4);
		} else if (arg12 == 2) {
			local57 = Static543.method7517(arg2, arg5, arg8, arg4, arg3, arg7, arg1, arg0, arg11, arg13);
		} else {
			local57 = Static508.method7314(arg8, arg12, arg4, arg11, arg3, arg1, arg2, arg0, arg5, arg13, arg7);
		}
		@Pc(90) int local90 = arg3 - 64;
		@Pc(94) int local94 = arg11 - 64;
		@Pc(96) int local96 = Static29.anInt404;
		@Pc(98) int local98 = Static498.anInt8492;
		@Pc(104) int local104;
		@Pc(106) int local106;
		@Pc(113) int local113;
		if (!local57) {
			if (!arg9) {
				return -1;
			}
			local104 = Integer.MAX_VALUE;
			local106 = Integer.MAX_VALUE;
			for (local113 = arg0 - 10; local113 <= arg0 + 10; local113++) {
				for (@Pc(118) int local118 = arg13 - 10; local118 <= arg13 + 10; local118++) {
					@Pc(124) int local124 = local113 - local90;
					@Pc(128) int local128 = local118 - local94;
					if (local124 >= 0 && local128 >= 0 && local124 < 128 && local128 < 128 && Static507.anIntArrayArray69[local124][local128] < 100) {
						@Pc(149) int local149 = 0;
						if (arg0 > local113) {
							local149 = arg0 - local113;
						} else if (arg2 + arg0 - 1 < local113) {
							local149 = local113 + 1 - arg2 - arg0;
						}
						@Pc(184) int local184 = 0;
						if (local118 < arg13) {
							local184 = arg13 - local118;
						} else if (local118 > arg13 + arg1 - 1) {
							local184 = local118 + 1 - arg13 - arg1;
						}
						@Pc(217) int local217 = local184 * local184 + local149 * local149;
						if (local217 < local104 || local104 == local217 && local106 > Static507.anIntArrayArray69[local124][local128]) {
							local98 = local118;
							local96 = local113;
							local104 = local217;
							local106 = Static507.anIntArrayArray69[local124][local128];
						}
					}
				}
			}
			if (~local104 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local96 == arg3 && local98 == arg11) {
			return 0;
		}
		@Pc(286) byte local286 = 0;
		Static3.anIntArray1[0] = local96;
		local104 = local286 + 1;
		Static110.anIntArray104[0] = local98;
		@Pc(306) int local306;
		local106 = local306 = Static435.anIntArrayArray55[local96 - local90][local98 - local94];
		while (local96 != arg3 || local98 != arg11) {
			if (local306 != local106) {
				local306 = local106;
				Static3.anIntArray1[local104] = local96;
				Static110.anIntArray104[local104++] = local98;
			}
			if ((local106 & 0x1) != 0) {
				local98++;
			} else if ((local106 & 0x4) != 0) {
				local98--;
			}
			if ((local106 & 0x2) != 0) {
				local96++;
			} else if ((local106 & 0x8) != 0) {
				local96--;
			}
			local106 = Static435.anIntArrayArray55[local96 - local90][local98 - local94];
		}
		local113 = 0;
		while (local104-- > 0) {
			arg6[local113] = Static3.anIntArray1[local104];
			arg10[local113++] = Static110.anIntArray104[local104];
			if (arg6.length <= local113) {
				break;
			}
		}
		return local113;
	}
}
