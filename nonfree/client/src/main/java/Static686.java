import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static686 {

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
	public static int anInt11144;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	public static int anInt11152;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!aq;")
	public static Class23 aClass23_3;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!pka;[IIII[IIZZIIIII)I")
	public static int method9454(@OriginalArg(0) int arg0, @OriginalArg(1) Class289 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(5) int local5 = 0; local5 < 128; local5++) {
			for (@Pc(8) int local8 = 0; local8 < 128; local8++) {
				Static384.anIntArrayArray45[local5][local8] = 0;
				Static3.anIntArrayArray1[local5][local8] = 99999999;
			}
		}
		@Pc(55) boolean local55;
		if (arg12 == 1) {
			local55 = Static221.method3811(arg9, arg7, arg5, arg11, arg10, arg0, arg4, arg13, arg1, arg3);
		} else if (arg12 == 2) {
			local55 = Static148.method2183(arg5, arg11, arg9, arg3, arg4, arg1, arg0, arg10, arg7, arg13);
		} else {
			local55 = Static486.method7341(arg1, arg11, arg3, arg10, arg13, arg4, arg5, arg0, arg12, arg9, arg7);
		}
		@Pc(91) int local91 = arg4 - 64;
		@Pc(95) int local95 = arg7 - 64;
		@Pc(97) int local97 = Static447.anInt7500;
		@Pc(99) int local99 = Static131.anInt2079;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		if (!local55) {
			if (!arg8) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local119 = arg10 - 10; local119 <= arg10 + 10; local119++) {
				for (@Pc(124) int local124 = arg13 - 10; local124 <= arg13 + 10; local124++) {
					@Pc(130) int local130 = local119 - local91;
					@Pc(135) int local135 = local124 - local95;
					if (local130 >= 0 && local135 >= 0 && local130 < 128 && local135 < 128 && Static3.anIntArrayArray1[local130][local135] < 100) {
						@Pc(165) int local165 = 0;
						if (local119 < arg10) {
							local165 = arg10 - local119;
						} else if (local119 > arg3 + arg10 - 1) {
							local165 = local119 + 1 - arg3 - arg10;
						}
						@Pc(194) int local194 = 0;
						if (arg13 > local124) {
							local194 = arg13 - local124;
						} else if (arg13 + arg0 - 1 < local124) {
							local194 = local124 + 1 - arg0 - arg13;
						}
						@Pc(233) int local233 = local194 * local194 + local165 * local165;
						if (local110 > local233 || local110 == local233 && Static3.anIntArrayArray1[local130][local135] < local112) {
							local97 = local119;
							local99 = local124;
							local110 = local233;
							local112 = Static3.anIntArrayArray1[local130][local135];
						}
					}
				}
			}
			if (~local110 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local97 == arg4 && local99 == arg7) {
			return 0;
		}
		@Pc(307) byte local307 = 0;
		Static465.anIntArray413[0] = local97;
		local110 = local307 + 1;
		Static581.anIntArray499[0] = local99;
		@Pc(334) int local334;
		local112 = local334 = Static384.anIntArrayArray45[local97 - local91][local99 - local95];
		while (arg4 != local97 || arg7 != local99) {
			if (local334 != local112) {
				Static465.anIntArray413[local110] = local97;
				local334 = local112;
				Static581.anIntArray499[local110++] = local99;
			}
			if ((local112 & 0x2) != 0) {
				local97++;
			} else if ((local112 & 0x8) != 0) {
				local97--;
			}
			if ((local112 & 0x1) != 0) {
				local99++;
			} else if ((local112 & 0x4) != 0) {
				local99--;
			}
			local112 = Static384.anIntArrayArray45[local97 - local91][local99 - local95];
		}
		local119 = 0;
		while (local110-- > 0) {
			arg6[local119] = Static465.anIntArray413[local110];
			arg2[local119++] = Static581.anIntArray499[local110];
			if (local119 >= arg6.length) {
				break;
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public static void method9455() {
		for (@Pc(7) int local7 = 0; local7 < Static208.anInt7849; local7++) {
			@Pc(13) Class106 local13 = Static314.aClass106Array1[local7];
			if (local13.aByte32 == 3) {
				if (local13.aClass14_Sub1_Sub1_1 == null) {
					local13.anInt2306 = Integer.MIN_VALUE;
				} else {
					Static196.aClass14_Sub1_Sub2_1.method1810(local13.aClass14_Sub1_Sub1_1);
				}
			}
		}
	}
}
