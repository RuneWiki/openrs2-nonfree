import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	public static int anInt5159;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "B")
	public static byte aByte21 = 0;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	public static int anInt5160 = -1;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString173 = "Loaded world list data";

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!qe;IIIIIIIZ)V")
	public static void method4108(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static10.anInt148;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static18.anInt389;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static9.anIntArrayArrayArray7[arg1][arg6][arg7] - Static268.anInt5235;
		@Pc(49) int local49 = Static9.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static268.anInt5235;
		@Pc(63) int local63 = Static9.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static268.anInt5235;
		@Pc(75) int local75 = Static9.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static268.anInt5235;
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
		@Pc(275) int local275 = Static1.anInt4 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static1.anInt3 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static1.anInt4 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static1.anInt3 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static1.anInt4 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static1.anInt3 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static1.anInt4 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static1.anInt3 + (local85 << 9) / local261;
		Static1.anInt1 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static182.aBoolean399 && Static231.method3761(Static218.anInt4450 + Static1.anInt4, Static72.anInt1818 + Static1.anInt3, local315, local331, local299, local307, local323, local291)) {
				Static263.anInt5180 = arg6;
				Static268.anInt5229 = arg7;
			}
			if (!Static116.aBoolean184 && !arg8) {
				Static1.aBoolean3 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static1.anInt2 || local323 > Static1.anInt2 || local291 > Static1.anInt2) {
					Static1.aBoolean3 = true;
				}
				if (arg0.anInt4575 == -1) {
					if (arg0.anInt4573 != 12345678) {
						Static1.method15(local315, local331, local299, local307, local323, local291, arg0.anInt4573, arg0.anInt4584, arg0.anInt4583);
					}
				} else if (!Static206.aBoolean292) {
					local475 = Static1.anInterface3_1.method4132(arg0.anInt4575);
					Static1.method15(local315, local331, local299, local307, local323, local291, Static95.method1665(local475, arg0.anInt4573), Static95.method1665(local475, arg0.anInt4584), Static95.method1665(local475, arg0.anInt4583));
				} else if (arg0.aBoolean305) {
					Static1.method22(local315, local331, local299, local307, local323, local291, arg0.anInt4573, arg0.anInt4584, arg0.anInt4583, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4575);
				} else {
					Static1.method22(local315, local331, local299, local307, local323, local291, arg0.anInt4573, arg0.anInt4584, arg0.anInt4583, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4575);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static182.aBoolean399 && Static231.method3761(Static218.anInt4450 + Static1.anInt4, Static72.anInt1818 + Static1.anInt3, local283, local299, local331, local275, local291, local323)) {
			Static263.anInt5180 = arg6;
			Static268.anInt5229 = arg7;
		}
		if (Static116.aBoolean184 || arg8) {
			return;
		}
		Static1.aBoolean3 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static1.anInt2 || local291 > Static1.anInt2 || local323 > Static1.anInt2) {
			Static1.aBoolean3 = true;
		}
		if (arg0.anInt4575 == -1) {
			if (arg0.anInt4577 != 12345678) {
				Static1.method15(local283, local299, local331, local275, local291, local323, arg0.anInt4577, arg0.anInt4583, arg0.anInt4584);
			}
		} else if (Static206.aBoolean292) {
			Static1.method22(local283, local299, local331, local275, local291, local323, arg0.anInt4577, arg0.anInt4583, arg0.anInt4584, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4575);
		} else {
			local475 = Static1.anInterface3_1.method4132(arg0.anInt4575);
			Static1.method15(local283, local299, local331, local275, local291, local323, Static95.method1665(local475, arg0.anInt4577), Static95.method1665(local475, arg0.anInt4583), Static95.method1665(local475, arg0.anInt4584));
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)V")
	public static void method4109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static92.aClass157_21 = new Class157(arg0);
		Static108.aClass157_23 = new Class157(arg1);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == arg5) {
			Static13.method237(arg2, arg1, arg5, arg4, arg6, arg3);
		} else if (Static53.anInt1319 <= arg3 - arg5 && Static81.anInt1915 >= arg5 + arg3 && arg6 - arg0 >= Static148.anInt3245 && arg6 + arg0 <= Static166.anInt3675) {
			Static50.method946(arg3, arg6, arg4, arg5, arg0, arg2, arg1);
		} else {
			Static65.method1197(arg0, arg1, arg4, arg3, arg2, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method4112() {
		Static230.aClass157_38.method4027();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)J")
	public static long method4114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass122_1 == null ? 0L : local7.aClass122_1.aLong142;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIBII)V")
	public static void method4115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 1 || arg1 < 1 || arg3 > 102 || arg1 > 102) {
			return;
		}
		@Pc(49) int local49;
		if (!Static69.method2440() && (Static13.aByteArrayArrayArray2[0][arg3][arg1] & 0x2) == 0) {
			local49 = arg2;
			if ((Static13.aByteArrayArrayArray2[arg2][arg3][arg1] & 0x8) != 0) {
				local49 = 0;
			}
			if (local49 != Static194.anInt4082) {
				return;
			}
		}
		local49 = arg2;
		if (arg2 < 3 && (Static13.aByteArrayArrayArray2[1][arg3][arg1] & 0x2) == 2) {
			local49 = arg2 + 1;
		}
		Static294.method4513(arg2, arg5, arg3, local49, Static89.aClass154Array1[arg2], arg1);
		if (arg6 >= 0) {
			@Pc(105) boolean local105 = Static185.aBoolean365;
			Static185.aBoolean365 = true;
			Static59.method1138(arg2, arg3, false, arg0, arg1, arg4, arg6, false, Static89.aClass154Array1[arg2], local49);
			Static185.aBoolean365 = local105;
		}
	}
}
