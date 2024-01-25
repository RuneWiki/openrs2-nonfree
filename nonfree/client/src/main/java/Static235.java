import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!nea;IZIII[IIIIIIII[I)I")
	public static int method3837(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(27) int local27 = 0; local27 < 128; local27++) {
			for (@Pc(31) int local31 = 0; local31 < 128; local31++) {
				Static237.anIntArrayArray26[local27][local31] = 0;
				Static481.anIntArrayArray53[local27][local31] = 99999999;
			}
		}
		@Pc(71) boolean local71;
		if (arg10 == 1) {
			local71 = Static497.method7185(arg3, arg5, arg9, arg7, arg11, arg8, arg4, arg1, arg12, arg0);
		} else if (arg10 == 2) {
			local71 = Static549.method7713(arg8, arg12, arg9, arg3, arg7, arg5, arg1, arg11, arg4, arg0);
		} else {
			local71 = Static19.method823(arg0, arg3, arg9, arg7, arg5, arg8, arg12, arg1, arg10, arg11, arg4);
		}
		@Pc(109) int local109 = arg12 - 64;
		@Pc(113) int local113 = arg4 - 64;
		@Pc(115) int local115 = Static263.anInt5323;
		@Pc(117) int local117 = Static208.anInt4412;
		@Pc(123) int local123;
		@Pc(125) int local125;
		@Pc(132) int local132;
		if (!local71) {
			if (!arg2) {
				return -1;
			}
			local123 = Integer.MAX_VALUE;
			local125 = Integer.MAX_VALUE;
			for (local132 = arg8 - 10; local132 <= arg8 + 10; local132++) {
				for (@Pc(139) int local139 = arg7 - 10; local139 <= arg7 + 10; local139++) {
					@Pc(145) int local145 = local132 - local109;
					@Pc(150) int local150 = local139 - local113;
					if (local145 >= 0 && local150 >= 0 && local145 < 128 && local150 < 128 && Static481.anIntArrayArray53[local145][local150] < 100) {
						@Pc(176) int local176 = 0;
						if (local132 < arg8) {
							local176 = arg8 - local132;
						} else if (local132 > arg8 + arg11 - 1) {
							local176 = local132 + 1 - arg8 - arg11;
						}
						@Pc(209) int local209 = 0;
						if (arg7 > local139) {
							local209 = arg7 - local139;
						} else if (local139 > arg5 + arg7 - 1) {
							local209 = local139 + 1 - arg5 - arg7;
						}
						@Pc(252) int local252 = local209 * local209 + local176 * local176;
						if (local123 > local252 || local123 == local252 && local125 > Static481.anIntArrayArray53[local145][local150]) {
							local115 = local132;
							local123 = local252;
							local125 = Static481.anIntArrayArray53[local145][local150];
							local117 = local139;
						}
					}
				}
			}
			if (local123 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local115 == arg12 && arg4 == local117) {
			return 0;
		}
		@Pc(320) byte local320 = 0;
		Static140.anIntArray146[0] = local115;
		local123 = local320 + 1;
		Static398.anIntArray416[0] = local117;
		@Pc(341) int local341;
		local125 = local341 = Static237.anIntArrayArray26[local115 - local109][local117 - local113];
		while (local115 != arg12 || local117 != arg4) {
			if (local341 != local125) {
				Static140.anIntArray146[local123] = local115;
				local341 = local125;
				Static398.anIntArray416[local123++] = local117;
			}
			if ((local125 & 0x2) != 0) {
				local115++;
			} else if ((local125 & 0x8) != 0) {
				local115--;
			}
			if ((local125 & 0x1) != 0) {
				local117++;
			} else if ((local125 & 0x4) != 0) {
				local117--;
			}
			local125 = Static237.anIntArrayArray26[local115 - local109][local117 - local113];
		}
		local132 = 0;
		while (local123-- > 0) {
			arg6[local132] = Static140.anIntArray146[local123];
			arg13[local132++] = Static398.anIntArray416[local123];
			if (arg6.length <= local132) {
				break;
			}
		}
		return local132;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < 1 || arg6 < 1 || arg1 > Static338.anInt6508 - 2 || Static390.anInt7654 - 2 < arg6) {
			return;
		}
		@Pc(27) int local27 = arg4;
		if (arg4 < 3 && Static193.method3175(arg6, arg1)) {
			local27 = arg4 + 1;
		}
		if (!Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614) && !Static592.method8254(arg1, arg6, Static550.anInt10029, local27)) {
			return;
		}
		if (Static571.aClass182ArrayArrayArray3 == null) {
			return;
		}
		Static360.aClass123_Sub1_2.method5169(arg6, Static526.aClass232Array1[arg4], Static39.aClass7_2, arg3, arg1, arg4);
		if (arg2 >= 0) {
			@Pc(71) boolean local71 = Static455.aClass4_Sub35_Sub1_1.aBoolean667;
			Static455.aClass4_Sub35_Sub1_1.aBoolean667 = true;
			Static360.aClass123_Sub1_2.method5170(arg6, arg4, arg2, arg5, Static526.aClass232Array1[arg4], local27, arg7, arg1, Static39.aClass7_2, arg0);
			Static455.aClass4_Sub35_Sub1_1.aBoolean667 = local71;
		}
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(III)Z")
	public static boolean method3839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)I")
	public static int method3840() {
		return Static569.method6000(false);
	}
}
