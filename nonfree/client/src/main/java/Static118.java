import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "[I")
	public static int[] anIntArray250;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString159;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "[Lclient!jm;")
	public static Class81[] aClass81Array1;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!ik;")
	public static Class70 aClass70_8 = new Class70(16);

	@OriginalMember(owner = "client!j", name = "i", descriptor = "J")
	public static long aLong104 = 0L;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	public static int anInt2736 = 0;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	public static int anInt2738 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method2112() {
		for (@Pc(13) int local13 = -1; local13 < Static278.anInt5374; local13++) {
			@Pc(23) int local23;
			if (local13 == -1) {
				local23 = 2047;
			} else {
				local23 = Static17.anIntArray444[local13];
			}
			@Pc(31) Class14_Sub2_Sub1 local31 = Static98.aClass14_Sub2_Sub1Array1[local23];
			if (local31 != null) {
				Static62.method1122(local31.method3656(), local31);
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I[I[III)V")
	public static void method2114(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(15) int local15 = arg3;
		@Pc(21) int local21 = (arg3 + arg0) / 2;
		@Pc(25) int local25 = arg1[local21];
		arg1[local21] = arg1[arg0];
		arg1[arg0] = local25;
		@Pc(39) int local39 = arg2[local21];
		arg2[local21] = arg2[arg0];
		arg2[arg0] = local39;
		for (@Pc(51) int local51 = arg3; local51 < arg0; local51++) {
			if ((local51 & 0x1) + local25 < arg1[local51]) {
				@Pc(71) int local71 = arg1[local51];
				arg1[local51] = arg1[local15];
				arg1[local15] = local71;
				@Pc(85) int local85 = arg2[local51];
				arg2[local51] = arg2[local15];
				arg2[local15++] = local85;
			}
		}
		arg1[arg0] = arg1[local15];
		arg1[local15] = local25;
		arg2[arg0] = arg2[local15];
		arg2[local15] = local39;
		method2114(local15 - 1, arg1, arg2, arg3);
		method2114(arg0, arg1, arg2, local15 + 1);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!nf;IIIIIIIZ)V")
	public static void method2115(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static215.anInt4270;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static273.anInt5322;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static55.anIntArrayArrayArray3[arg1][arg6][arg7] - Static197.anInt4046;
		@Pc(49) int local49 = Static55.anIntArrayArrayArray3[arg1][arg6 + 1][arg7] - Static197.anInt4046;
		@Pc(63) int local63 = Static55.anIntArrayArrayArray3[arg1][arg6 + 1][arg7 + 1] - Static197.anInt4046;
		@Pc(75) int local75 = Static55.anIntArrayArrayArray3[arg1][arg6][arg7 + 1] - Static197.anInt4046;
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
		@Pc(275) int local275 = Static110.anInt2551 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static110.anInt2554 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static110.anInt2551 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static110.anInt2554 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static110.anInt2551 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static110.anInt2554 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static110.anInt2551 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static110.anInt2554 + (local85 << 9) / local261;
		Static110.anInt2555 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static88.aBoolean140 && Static253.method3877(Static266.anInt3887 + Static110.anInt2551, Static53.anInt5283 + Static110.anInt2554, local315, local331, local299, local307, local323, local291)) {
				Static258.anInt5067 = arg6;
				Static296.anInt5586 = arg7;
			}
			if (!Static277.aBoolean412 && !arg8) {
				Static110.aBoolean181 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static110.anInt2553 || local323 > Static110.anInt2553 || local291 > Static110.anInt2553) {
					Static110.aBoolean181 = true;
				}
				if (arg0.anInt3718 == -1) {
					if (arg0.anInt3712 != 12345678) {
						Static110.method2029(local315, local331, local299, local307, local323, local291, arg0.anInt3712, arg0.anInt3719, arg0.anInt3713);
					}
				} else if (!Static23.aBoolean37) {
					local475 = Static110.anInterface2_1.method2266(arg0.anInt3718);
					Static110.method2029(local315, local331, local299, local307, local323, local291, Static166.method2880(local475, arg0.anInt3712), Static166.method2880(local475, arg0.anInt3719), Static166.method2880(local475, arg0.anInt3713));
				} else if (arg0.aBoolean280) {
					Static110.method2024(local315, local331, local299, local307, local323, local291, arg0.anInt3712, arg0.anInt3719, arg0.anInt3713, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt3718);
				} else {
					Static110.method2024(local315, local331, local299, local307, local323, local291, arg0.anInt3712, arg0.anInt3719, arg0.anInt3713, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt3718);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static88.aBoolean140 && Static253.method3877(Static266.anInt3887 + Static110.anInt2551, Static53.anInt5283 + Static110.anInt2554, local283, local299, local331, local275, local291, local323)) {
			Static258.anInt5067 = arg6;
			Static296.anInt5586 = arg7;
		}
		if (Static277.aBoolean412 || arg8) {
			return;
		}
		Static110.aBoolean181 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static110.anInt2553 || local291 > Static110.anInt2553 || local323 > Static110.anInt2553) {
			Static110.aBoolean181 = true;
		}
		if (arg0.anInt3718 == -1) {
			if (arg0.anInt3717 != 12345678) {
				Static110.method2029(local283, local299, local331, local275, local291, local323, arg0.anInt3717, arg0.anInt3713, arg0.anInt3719);
			}
		} else if (Static23.aBoolean37) {
			Static110.method2024(local283, local299, local331, local275, local291, local323, arg0.anInt3717, arg0.anInt3713, arg0.anInt3719, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt3718);
		} else {
			local475 = Static110.anInterface2_1.method2266(arg0.anInt3718);
			Static110.method2029(local283, local299, local331, local275, local291, local323, Static166.method2880(local475, arg0.anInt3717), Static166.method2880(local475, arg0.anInt3713), Static166.method2880(local475, arg0.anInt3719));
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method2116() {
		Static201.aClass135_22.method3324();
		Static47.aClass135_1.method3324();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lclient!id;")
	public static Class67 method2117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass67_1;
	}
}
