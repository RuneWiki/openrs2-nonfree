import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "Lclient!r;")
	public static Class150 aClass150_2;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
	public static int anInt4197 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IJ)V")
	public static void method3533(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < Static120.anInt2510; local15++) {
			if (Static204.aLongArray10[local15] == arg0) {
				Static120.anInt2510--;
				for (@Pc(35) int local35 = local15; local35 < Static120.anInt2510; local35++) {
					Static106.aStringArray16[local35] = Static106.aStringArray16[local35 + 1];
					Static170.anIntArray283[local35] = Static170.anIntArray283[local35 + 1];
					Static239.aStringArray33[local35] = Static239.aStringArray33[local35 + 1];
					Static204.aLongArray10[local35] = Static204.aLongArray10[local35 + 1];
					Static63.anIntArray276[local35] = Static63.anIntArray276[local35 + 1];
					Static208.aBooleanArray17[local35] = Static208.aBooleanArray17[local35 + 1];
				}
				Static70.anInt1491 = Static86.anInt1698;
				Static127.aClass1_Sub14_Sub1_3.method1408(197);
				Static127.aClass1_Sub14_Sub1_3.method1374(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
	public static void method3535() {
		Static185.aClass187_96.method4530();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII[BIIZIZ[Lclient!ne;)V")
	public static void method3536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class118[] arg9) {
		@Pc(16) Class1_Sub14 local16 = new Class1_Sub14(arg4);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local16.method1354();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local16.method1362();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 & 0x3F;
				@Pc(58) int local58 = local35 >> 12;
				@Pc(62) int local62 = local16.method1378();
				@Pc(68) int local68 = local35 >> 6 & 0x3F;
				@Pc(72) int local72 = local62 >> 2;
				@Pc(76) int local76 = local62 & 0x3;
				if (local58 == arg8 && arg2 <= local68 && arg2 + 8 > local68 && local54 >= arg1 && arg1 + 8 > local54) {
					@Pc(104) Class71 local104 = Static255.method4052(local18);
					@Pc(121) int local121 = Static95.method1733(local104.anInt2385, local68 & 0x7, local54 & 0x7, local76, arg0, local104.anInt2377) + arg5;
					@Pc(138) int local138 = Static171.method2903(local68 & 0x7, local76, local104.anInt2385, arg0, local104.anInt2377, local54 & 0x7) + arg6;
					if (local121 > 0 && local138 > 0 && local121 < 103 && local138 < 103) {
						@Pc(156) Class118 local156 = null;
						if (!arg7) {
							@Pc(160) int local160 = arg3;
							if ((Static104.aByteArrayArrayArray3[1][local121][local138] & 0x2) == 2) {
								local160 = arg3 - 1;
							}
							if (local160 >= 0) {
								local156 = arg9[local160];
							}
						}
						Static137.method2376(arg3, arg7, local72, arg3, local156, local18, local138, !arg7, local76 + arg0 & 0x3, local121);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!sd;IIIIIIIZ)V")
	public static void method3538(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static160.anInt3163;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static100.anInt2013;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static24.anIntArrayArrayArray2[arg1][arg6][arg7] - Static193.anInt3671;
		@Pc(49) int local49 = Static24.anIntArrayArrayArray2[arg1][arg6 + 1][arg7] - Static193.anInt3671;
		@Pc(63) int local63 = Static24.anIntArrayArrayArray2[arg1][arg6 + 1][arg7 + 1] - Static193.anInt3671;
		@Pc(75) int local75 = Static24.anIntArrayArrayArray2[arg1][arg6][arg7 + 1] - Static193.anInt3671;
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
		@Pc(275) int local275 = Static215.anInt4020 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static215.anInt4021 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static215.anInt4020 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static215.anInt4021 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static215.anInt4020 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static215.anInt4021 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static215.anInt4020 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static215.anInt4021 + (local85 << 9) / local261;
		Static215.anInt4023 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static218.aBoolean71 && Static315.method4457(Static229.anInt4204 + Static215.anInt4020, Static75.anInt1563 + Static215.anInt4021, local315, local331, local299, local307, local323, local291)) {
				Static66.anInt4309 = arg6;
				Static183.anInt3499 = arg7;
			}
			if (!Static156.aBoolean211 && !arg8) {
				Static215.aBoolean276 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static215.anInt4024 || local323 > Static215.anInt4024 || local291 > Static215.anInt4024) {
					Static215.aBoolean276 = true;
				}
				if (arg0.anInt4608 == -1) {
					if (arg0.anInt4610 != 12345678) {
						Static215.method3366(local315, local331, local299, local307, local323, local291, arg0.anInt4610, arg0.anInt4612, arg0.anInt4614);
					}
				} else if (!Static102.aBoolean113) {
					local475 = Static215.anInterface5_1.method777(arg0.anInt4608);
					Static215.method3366(local315, local331, local299, local307, local323, local291, Static244.method3820(local475, arg0.anInt4610), Static244.method3820(local475, arg0.anInt4612), Static244.method3820(local475, arg0.anInt4614));
				} else if (arg0.aBoolean316) {
					Static215.method3376(local315, local331, local299, local307, local323, local291, arg0.anInt4610, arg0.anInt4612, arg0.anInt4614, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4608);
				} else {
					Static215.method3376(local315, local331, local299, local307, local323, local291, arg0.anInt4610, arg0.anInt4612, arg0.anInt4614, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4608);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static218.aBoolean71 && Static315.method4457(Static229.anInt4204 + Static215.anInt4020, Static75.anInt1563 + Static215.anInt4021, local283, local299, local331, local275, local291, local323)) {
			Static66.anInt4309 = arg6;
			Static183.anInt3499 = arg7;
		}
		if (Static156.aBoolean211 || arg8) {
			return;
		}
		Static215.aBoolean276 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static215.anInt4024 || local291 > Static215.anInt4024 || local323 > Static215.anInt4024) {
			Static215.aBoolean276 = true;
		}
		if (arg0.anInt4608 == -1) {
			if (arg0.anInt4611 != 12345678) {
				Static215.method3366(local283, local299, local331, local275, local291, local323, arg0.anInt4611, arg0.anInt4614, arg0.anInt4612);
			}
		} else if (Static102.aBoolean113) {
			Static215.method3376(local283, local299, local331, local275, local291, local323, arg0.anInt4611, arg0.anInt4614, arg0.anInt4612, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4608);
		} else {
			local475 = Static215.anInterface5_1.method777(arg0.anInt4608);
			Static215.method3366(local283, local299, local331, local275, local291, local323, Static244.method3820(local475, arg0.anInt4611), Static244.method3820(local475, arg0.anInt4614), Static244.method3820(local475, arg0.anInt4612));
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)V")
	public static void method3539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class35 local3 = Static247.method3903(arg1);
		@Pc(17) int local17 = local3.anInt961;
		@Pc(20) int local20 = local3.anInt964;
		@Pc(23) int local23 = local3.anInt967;
		@Pc(30) int local30 = Class1_Sub4_Sub18.anIntArray212[local23 - local20];
		if (arg0 < 0 || local30 < arg0) {
			arg0 = 0;
		}
		local30 <<= local20;
		Static130.method2232(~local30 & Static55.anIntArray64[local17] | arg0 << local20 & local30, local17);
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)I")
	public static int method3541() {
		if (Static275.aFrame2 != null) {
			return 3;
		} else if (Static156.aBoolean211 && Static46.aBoolean53) {
			return 2;
		} else if (Static156.aBoolean211 && !Static46.aBoolean53) {
			return 1;
		} else {
			return 0;
		}
	}
}
