import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
	public static int anInt7207 = 0;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "[I")
	public static final int[] anIntArray559 = new int[64];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILclient!jj;[IZI)Lclient!og;")
	public static Class4_Sub2_Sub1 method5841(@OriginalArg(1) int arg0, @OriginalArg(2) Class62_Sub3 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean273 || Static281.method4574(arg3) && Static281.method4574(arg0)) {
			return new Class4_Sub2_Sub1(arg1, 3553, arg3, arg0, false, arg2);
		} else if (arg1.aBoolean271) {
			return new Class4_Sub2_Sub1(arg1, 34037, arg3, arg0, false, arg2);
		} else {
			return new Class4_Sub2_Sub1(arg1, arg3, arg0, Static179.method3071(arg3), Static179.method3071(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILclient!aea;[III[IIIZIIIIZ)I")
	public static int method5842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static453.anIntArrayArray66[local3][local7] = 0;
				Static167.anIntArrayArray23[local3][local7] = 99999999;
			}
		}
		@Pc(58) boolean local58;
		if (arg10 == 1) {
			local58 = Static43.method894(arg5, arg11, arg9, arg8, arg7, arg2, arg12, arg4, arg1, arg0);
		} else if (arg10 == 2) {
			local58 = Static112.method2228(arg12, arg4, arg8, arg5, arg1, arg11, arg2, arg7, arg9, arg0);
		} else {
			local58 = Static38.method838(arg5, arg10, arg1, arg2, arg7, arg9, arg12, arg4, arg8, arg11, arg0);
		}
		@Pc(98) int local98 = arg7 - 64;
		@Pc(102) int local102 = arg8 - 64;
		@Pc(104) int local104 = Static128.anInt2699;
		@Pc(106) int local106 = Static134.anInt2782;
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(123) int local123;
		if (!local58) {
			if (!arg13) {
				return -1;
			}
			local114 = Integer.MAX_VALUE;
			local116 = Integer.MAX_VALUE;
			for (local123 = arg0 - 10; local123 <= arg0 + 10; local123++) {
				for (@Pc(130) int local130 = arg1 - 10; local130 <= arg1 + 10; local130++) {
					@Pc(137) int local137 = local123 - local98;
					@Pc(142) int local142 = local130 - local102;
					if (local137 >= 0 && local142 >= 0 && local137 < 128 && local142 < 128 && Static167.anIntArrayArray23[local137][local142] < 100) {
						@Pc(168) int local168 = 0;
						if (arg0 > local123) {
							local168 = arg0 - local123;
						} else if (local123 > arg0 + arg11 - 1) {
							local168 = local123 + 1 - arg11 - arg0;
						}
						@Pc(205) int local205 = 0;
						if (arg1 > local130) {
							local205 = arg1 - local130;
						} else if (local130 > arg4 + arg1 - 1) {
							local205 = local130 + 1 - arg1 - arg4;
						}
						@Pc(238) int local238 = local168 * local168 + local205 * local205;
						if (local114 > local238 || local114 == local238 && local116 > Static167.anIntArrayArray23[local137][local142]) {
							local104 = local123;
							local114 = local238;
							local116 = Static167.anIntArrayArray23[local137][local142];
							local106 = local130;
						}
					}
				}
			}
			if (local114 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local104 == arg7 && local106 == arg8) {
			return 0;
		}
		@Pc(306) byte local306 = 0;
		Static271.anIntArray364[0] = local104;
		local114 = local306 + 1;
		Static242.anIntArray309[0] = local106;
		@Pc(327) int local327;
		local116 = local327 = Static453.anIntArrayArray66[local104 - local98][local106 - local102];
		while (arg7 != local104 || arg8 != local106) {
			if (local116 != local327) {
				local327 = local116;
				Static271.anIntArray364[local114] = local104;
				Static242.anIntArray309[local114++] = local106;
			}
			if ((local116 & 0x1) != 0) {
				local106++;
			} else if ((local116 & 0x4) != 0) {
				local106--;
			}
			if ((local116 & 0x2) != 0) {
				local104++;
			} else if ((local116 & 0x8) != 0) {
				local104--;
			}
			local116 = Static453.anIntArrayArray66[local104 - local98][local106 - local102];
		}
		local123 = 0;
		while (local114-- > 0) {
			arg6[local123] = Static271.anIntArray364[local114];
			arg3[local123++] = Static242.anIntArray309[local114];
			if (arg6.length <= local123) {
				break;
			}
		}
		return local123;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BIIII)V")
	public static void method5843(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static42.anInt967 == 1) {
			Static179.aClass25Array10[Static310.anInt6067 / 100].method6956(Static152.anInt3130 - 8, Static136.anInt2833 + -8);
		}
		if (Static42.anInt967 == 2) {
			Static179.aClass25Array10[Static310.anInt6067 / 100 + 4].method6956(Static152.anInt3130 - 8, Static136.anInt2833 + -8);
		}
		Static232.method3830();
	}
}
