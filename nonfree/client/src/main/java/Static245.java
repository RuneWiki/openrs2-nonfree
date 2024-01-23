import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
	public static int anInt3786;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
	public static void method3163() {
		Static212.aClass4_Sub3_Sub14_4 = null;
		Static153.anInt3020 = -1;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([JBII[Ljava/lang/Object;)V")
	public static void method3165(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(22) int local22 = (arg1 + arg2) / 2;
		@Pc(24) int local24 = arg2;
		@Pc(28) long local28 = arg0[local22];
		arg0[local22] = arg0[arg1];
		arg0[arg1] = local28;
		@Pc(42) Object local42 = arg3[local22];
		arg3[local22] = arg3[arg1];
		arg3[arg1] = local42;
		for (@Pc(54) int local54 = arg2; local54 < arg1; local54++) {
			if (arg0[local54] < (long) (local54 & 0x1) + local28) {
				@Pc(77) long local77 = arg0[local54];
				arg0[local54] = arg0[local24];
				arg0[local24] = local77;
				@Pc(91) Object local91 = arg3[local54];
				arg3[local54] = arg3[local24];
				arg3[local24++] = local91;
			}
		}
		arg0[arg1] = arg0[local24];
		arg0[local24] = local28;
		arg3[arg1] = arg3[local24];
		arg3[local24] = local42;
		method3165(arg0, local24 - 1, arg2, arg3);
		method3165(arg0, arg1, local24 + 1, arg3);
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
	public static void method3166() {
		Static58.anImage2 = null;
		Static34.aFont1 = null;
		Static28.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method3167(@OriginalArg(1) Class58 arg0) {
		Static246.anInt4678 = arg0.method1362("titlebg");
		Static22.anInt322 = arg0.method1362("logo");
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!qf;IIIIIIIZ)V")
	public static void method3168(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static277.anInt5282;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static230.anInt4401;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static243.anIntArrayArrayArray13[arg1][arg6][arg7] - Static228.anInt4376;
		@Pc(49) int local49 = Static243.anIntArrayArrayArray13[arg1][arg6 + 1][arg7] - Static228.anInt4376;
		@Pc(63) int local63 = Static243.anIntArrayArrayArray13[arg1][arg6 + 1][arg7 + 1] - Static228.anInt4376;
		@Pc(75) int local75 = Static243.anIntArrayArrayArray13[arg1][arg6][arg7 + 1] - Static228.anInt4376;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static158.anInt3125 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static158.anInt3126 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static158.anInt3125 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static158.anInt3126 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static158.anInt3125 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static158.anInt3126 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static158.anInt3125 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static158.anInt3126 + (local85 << 9) / local261;
		Static158.anInt3127 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static73.aBoolean101 && Static75.method1223(Static22.anInt315 + Static158.anInt3125, Static305.anInt5807 + Static158.anInt3126, local315, local331, local299, local307, local323, local291)) {
				Static32.anInt528 = arg6;
				Static28.anInt420 = arg7;
			}
			if (!Static94.aBoolean138 && !arg8) {
				Static158.aBoolean217 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static158.anInt3129 || local323 > Static158.anInt3129 || local291 > Static158.anInt3129) {
					Static158.aBoolean217 = true;
				}
				if (arg0.anInt4298 == -1) {
					if (arg0.anInt4300 != 12345678) {
						Static158.method2556(local315, local331, local299, local307, local323, local291, arg0.anInt4300, arg0.anInt4302, arg0.anInt4297);
					}
				} else if (!Static27.aBoolean27) {
					local475 = Static158.anInterface5_1.method446(arg0.anInt4298);
					Static158.method2556(local315, local331, local299, local307, local323, local291, Static22.method302(local475, arg0.anInt4300), Static22.method302(local475, arg0.anInt4302), Static22.method302(local475, arg0.anInt4297));
				} else if (arg0.aBoolean303) {
					Static158.method2571(local315, local331, local299, local307, local323, local291, arg0.anInt4300, arg0.anInt4302, arg0.anInt4297, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4298);
				} else {
					Static158.method2571(local315, local331, local299, local307, local323, local291, arg0.anInt4300, arg0.anInt4302, arg0.anInt4297, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4298);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static73.aBoolean101 && Static75.method1223(Static22.anInt315 + Static158.anInt3125, Static305.anInt5807 + Static158.anInt3126, local283, local299, local331, local275, local291, local323)) {
			Static32.anInt528 = arg6;
			Static28.anInt420 = arg7;
		}
		if (Static94.aBoolean138 || arg8) {
			return;
		}
		Static158.aBoolean217 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static158.anInt3129 || local291 > Static158.anInt3129 || local323 > Static158.anInt3129) {
			Static158.aBoolean217 = true;
		}
		if (arg0.anInt4298 == -1) {
			if (arg0.anInt4299 != 12345678) {
				Static158.method2556(local283, local299, local331, local275, local291, local323, arg0.anInt4299, arg0.anInt4297, arg0.anInt4302);
			}
		} else if (Static27.aBoolean27) {
			Static158.method2571(local283, local299, local331, local275, local291, local323, arg0.anInt4299, arg0.anInt4297, arg0.anInt4302, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4298);
		} else {
			local475 = Static158.anInterface5_1.method446(arg0.anInt4298);
			Static158.method2556(local283, local299, local331, local275, local291, local323, Static22.method302(local475, arg0.anInt4299), Static22.method302(local475, arg0.anInt4297), Static22.method302(local475, arg0.anInt4302));
		}
	}
}
