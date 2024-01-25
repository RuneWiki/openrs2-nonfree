import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "[I")
	public static int[] anIntArray557;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	public static int anInt6461;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
	public static int anInt6463 = 0;

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
	public static int anInt6465 = -1;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBI)V")
	public static void method5707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static335.aClass5_Sub1_Sub1_3.method174(219);
		Static335.aClass5_Sub1_Sub1_3.method1848(arg0);
		Static335.aClass5_Sub1_Sub1_3.method1847(arg1);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!en;)V")
	public static void method5708(@OriginalArg(1) Class59 arg0) {
		@Pc(7) int local7 = Static303.anInt5839;
		@Pc(9) int local9 = Static279.anInt5429;
		@Pc(11) int local11 = Static144.anInt2967;
		@Pc(13) int local13 = Static343.anInt6411;
		arg0.method4835(local9, local7, local13, local11, -10660793);
		arg0.method4835(local9 + 1, local7 + 1, 16, local11 - 2, -16777216);
		arg0.method4830(-16777216, local9 + 18, local7 + 1, local13 - 19, local11 + -2);
		Static190.aClass91_8.method5300(-1, local9 + 14, Static103.aString140, -10660793, local7 + 3);
		@Pc(72) int local72 = Static270.anInt5171;
		@Pc(74) int local74 = Static274.anInt5378;
		@Pc(76) int local76 = 0;
		for (@Pc(81) Class5_Sub4 local81 = (Class5_Sub4) Static60.aClass211_4.method5608(); local81 != null; local81 = (Class5_Sub4) Static60.aClass211_4.method5603()) {
			@Pc(97) int local97 = local9 + (-local76 + -1 + Static27.anInt5324) * 16 + 31;
			@Pc(99) short local99 = -1;
			if (local7 < local72 && local72 < local7 + local11 && local97 - 13 < local74 && local74 < local97 + 3) {
				local99 = -256;
			}
			@Pc(133) int[] local133 = null;
			if (Static327.method5513(local81.anInt785)) {
				local133 = Static88.method1382((int) local81.aLong24).anIntArray382;
			} else if (Static93.method1989(local81.anInt785)) {
				@Pc(151) Class25_Sub1_Sub1_Sub2 local151 = Static188.aClass25_Sub1_Sub1_Sub2Array1[(int) local81.aLong24];
				if (local151 != null) {
					local133 = local151.aClass216_1.anIntArray560;
				}
			} else if (Static199.method3530(local81.anInt785)) {
				if (local81.anInt785 == 1002) {
					local133 = Static228.method3923((int) local81.aLong24).anIntArray298;
				} else {
					local133 = Static228.method3923((int) (local81.aLong24 >>> 32 & 0x7FFFFFFFL)).anIntArray298;
				}
			}
			@Pc(208) String local208 = Static55.method1184(local81);
			if (local133 != null) {
				local208 = local208 + Static346.method5697(local133);
			}
			local76++;
			Static190.aClass91_8.method5303(local208, 0, local99, anIntArray557, local97, local7 + 3, Static49.aClass54Array4);
		}
		Static82.method1818(Static279.anInt5429, Static303.anInt5839, Static144.anInt2967, Static343.anInt6411);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIBI[[B[[BLclient!en;ILclient!ng;[Z[[BLclient!gf;II)V")
	public static void method5709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) Class59 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class135 arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) Class71 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(52) int local52;
		if (arg7 != null && arg10 != null || arg10 != null && arg0 == 12 || arg7 != null && arg0 == 0) {
			@Pc(30) boolean[] local30 = arg7 != null && arg7.aBoolean280 ? Static109.aBooleanArrayArray15[arg0] : Static133.aBooleanArrayArray46[arg0];
			@Pc(60) Class135 local60;
			@Pc(77) byte local77;
			@Pc(94) int local94;
			@Pc(99) int local99;
			if (arg12 > 0) {
				if (arg2 > 0) {
					local52 = arg9[arg2 - 1][arg12 - 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static301.method5317(local52 - 1);
						if (local60.anInt3954 != -1 && local60.aBoolean280) {
							local77 = arg3[arg2 - 1][arg12 - 1];
							local94 = arg4[arg2 - 1][arg12 - 1] * 2 + 4 & 0x7;
							local99 = Static323.method5436(arg5, local60);
							if (Static129.aBooleanArrayArray20[local77][local94]) {
								Static244.anIntArray372[0] = local60.anInt3954;
								Static92.anIntArray125[0] = local99;
								Static57.anIntArray66[0] = arg5.method4862() ? local60.anInt3944 : local60.anInt3951;
								Static38.anIntArray46[0] = local60.anInt3942;
								Static124.anIntArray159[0] = local60.anInt3953;
								Static166.anIntArray232[0] = 256;
							}
						}
					}
				}
				if (arg2 < arg11 - 1) {
					local52 = arg9[arg2 + 1][arg12 - 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static301.method5317(local52 - 1);
						if (local60.anInt3954 != -1 && local60.aBoolean280) {
							local77 = arg3[arg2 + 1][arg12 - 1];
							local94 = arg4[arg2 + 1][arg12 - 1] * 2 + 6 & 0x7;
							local99 = Static323.method5436(arg5, local60);
							if (Static129.aBooleanArrayArray20[local77][local94]) {
								Static244.anIntArray372[2] = local60.anInt3954;
								Static92.anIntArray125[2] = local99;
								Static57.anIntArray66[2] = arg5.method4862() ? local60.anInt3944 : local60.anInt3951;
								Static38.anIntArray46[2] = local60.anInt3942;
								Static124.anIntArray159[2] = local60.anInt3953;
								Static166.anIntArray232[2] = 512;
							}
						}
					}
				}
			}
			if (arg12 < arg6 - 1) {
				if (arg2 > 0) {
					local52 = arg9[arg2 - 1][arg12 + 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static301.method5317(local52 - 1);
						if (local60.anInt3954 != -1 && local60.aBoolean280) {
							local77 = arg3[arg2 - 1][arg12 + 1];
							local94 = arg4[arg2 - 1][arg12 + 1] * 2 + 2 & 0x7;
							local99 = Static323.method5436(arg5, local60);
							if (Static129.aBooleanArrayArray20[local77][local94]) {
								Static244.anIntArray372[6] = local60.anInt3954;
								Static92.anIntArray125[6] = local99;
								Static57.anIntArray66[6] = arg5.method4862() ? local60.anInt3944 : local60.anInt3951;
								Static38.anIntArray46[6] = local60.anInt3942;
								Static124.anIntArray159[6] = local60.anInt3953;
								Static166.anIntArray232[6] = 64;
							}
						}
					}
				}
				if (arg11 - 1 > arg2) {
					local52 = arg9[arg2 + 1][arg12 + 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static301.method5317(local52 - 1);
						if (local60.anInt3954 != -1 && local60.aBoolean280) {
							local77 = arg3[arg2 + 1][arg12 + 1];
							local94 = arg4[arg2 + 1][arg12 + 1] * 2 & 0x7;
							local99 = Static323.method5436(arg5, local60);
							if (Static129.aBooleanArrayArray20[local77][local94]) {
								Static244.anIntArray372[4] = local60.anInt3954;
								Static92.anIntArray125[4] = local99;
								Static57.anIntArray66[4] = arg5.method4862() ? local60.anInt3944 : local60.anInt3951;
								Static38.anIntArray46[4] = local60.anInt3942;
								Static124.anIntArray159[4] = local60.anInt3953;
								Static166.anIntArray232[4] = 128;
							}
						}
					}
				}
			}
			@Pc(516) int local516;
			@Pc(521) int local521;
			@Pc(523) int local523;
			@Pc(505) byte local505;
			if (arg12 > 0) {
				local52 = arg9[arg2][arg12 - 1] & 0xFF;
				if (local52 > 0) {
					local60 = Static301.method5317(local52 - 1);
					if (local60.anInt3954 != -1) {
						local77 = arg3[arg2][arg12 - 1];
						local505 = arg4[arg2][arg12 - 1];
						if (local60.aBoolean280) {
							local99 = 2;
							local516 = local505 * 2 + 4;
							local521 = Static323.method5436(arg5, local60);
							for (local523 = 0; local523 < 3; local523++) {
								local516 &= 0x7;
								local99 &= 0x7;
								if (Static129.aBooleanArrayArray20[local77][local516] && local60.anInt3953 >= Static124.anIntArray159[local99]) {
									Static244.anIntArray372[local99] = local60.anInt3954;
									Static92.anIntArray125[local99] = local521;
									Static57.anIntArray66[local99] = arg5.method4862() ? local60.anInt3944 : local60.anInt3951;
									Static38.anIntArray46[local99] = local60.anInt3942;
									if (local60.anInt3953 == Static124.anIntArray159[local99]) {
										Static166.anIntArray232[local99] |= 0x20;
									} else {
										Static166.anIntArray232[local99] = 32;
									}
									Static124.anIntArray159[local99] = local60.anInt3953;
								}
								local99--;
								local516++;
							}
							if (!local30[arg1 & 0x3]) {
								arg8[0] = Static109.aBooleanArrayArray15[local77][local505 + 2 & 0x3];
							}
						} else if (!local30[arg1 & 0x3]) {
							arg8[0] = Static133.aBooleanArrayArray46[local77][local505 + 2 & 0x3];
						}
					}
				}
			}
			if (arg12 < arg6 - 1) {
				local52 = arg9[arg2][arg12 + 1] & 0xFF;
				if (local52 > 0) {
					local60 = Static301.method5317(local52 - 1);
					if (local60.anInt3954 != -1) {
						local77 = arg3[arg2][arg12 + 1];
						local505 = arg4[arg2][arg12 + 1];
						if (local60.aBoolean280) {
							local99 = 4;
							local516 = local505 * 2 + 2;
							local521 = Static323.method5436(arg5, local60);
							for (local523 = 0; local523 < 3; local523++) {
								local516 &= 0x7;
								local99 &= 0x7;
								if (Static129.aBooleanArrayArray20[local77][local516] && Static124.anIntArray159[local99] <= local60.anInt3953) {
									Static244.anIntArray372[local99] = local60.anInt3954;
									Static92.anIntArray125[local99] = local521;
									Static57.anIntArray66[local99] = arg5.method4862() ? local60.anInt3944 : local60.anInt3951;
									Static38.anIntArray46[local99] = local60.anInt3942;
									if (Static124.anIntArray159[local99] == local60.anInt3953) {
										Static166.anIntArray232[local99] |= 0x10;
									} else {
										Static166.anIntArray232[local99] = 16;
									}
									Static124.anIntArray159[local99] = local60.anInt3953;
								}
								local516--;
								local99++;
							}
							if (!local30[arg1 + 2 & 0x3]) {
								arg8[2] = Static109.aBooleanArrayArray15[local77][local505 & 0x3];
							}
						} else if (!local30[arg1 + 2 & 0x3]) {
							arg8[2] = Static133.aBooleanArrayArray46[local77][--local505 & 0x3];
						}
					}
				}
			}
			if (arg2 > 0) {
				local52 = arg9[arg2 - 1][arg12] & 0xFF;
				if (local52 > 0) {
					local60 = Static301.method5317(local52 - 1);
					if (local60.anInt3954 != -1) {
						local77 = arg3[arg2 - 1][arg12];
						local505 = arg4[arg2 - 1][arg12];
						if (local60.aBoolean280) {
							local99 = 6;
							local516 = local505 * 2 + 4;
							local521 = Static323.method5436(arg5, local60);
							for (local523 = 0; local523 < 3; local523++) {
								local516 &= 0x7;
								local99 &= 0x7;
								if (Static129.aBooleanArrayArray20[local77][local516] && Static124.anIntArray159[local99] <= local60.anInt3953) {
									Static244.anIntArray372[local99] = local60.anInt3954;
									Static92.anIntArray125[local99] = local521;
									Static57.anIntArray66[local99] = arg5.method4862() ? local60.anInt3944 : local60.anInt3951;
									Static38.anIntArray46[local99] = local60.anInt3942;
									if (Static124.anIntArray159[local99] == local60.anInt3953) {
										Static166.anIntArray232[local99] |= 0x8;
									} else {
										Static166.anIntArray232[local99] = 8;
									}
									Static124.anIntArray159[local99] = local60.anInt3953;
								}
								local99++;
								local516--;
							}
							if (!local30[arg1 + 3 & 0x3]) {
								arg8[3] = Static109.aBooleanArrayArray15[local77][local505 + 1 & 0x3];
							}
						} else if (!local30[arg1 + 3 & 0x3]) {
							arg8[3] = Static133.aBooleanArrayArray46[local77][local505 + 1 & 0x3];
						}
					}
				}
			}
			if (arg11 - 1 > arg2) {
				local52 = arg9[arg2 + 1][arg12] & 0xFF;
				if (local52 > 0) {
					local60 = Static301.method5317(local52 - 1);
					if (local60.anInt3954 != -1) {
						local77 = arg3[arg2 + 1][arg12];
						local505 = arg4[arg2 + 1][arg12];
						if (local60.aBoolean280) {
							local99 = 4;
							local516 = local505 * 2 + 6;
							local521 = Static323.method5436(arg5, local60);
							for (local523 = 0; local523 < 3; local523++) {
								local99 &= 0x7;
								local516 &= 0x7;
								if (Static129.aBooleanArrayArray20[local77][local516] && local60.anInt3953 >= Static124.anIntArray159[local99]) {
									Static244.anIntArray372[local99] = local60.anInt3954;
									Static92.anIntArray125[local99] = local521;
									Static57.anIntArray66[local99] = arg5.method4862() ? local60.anInt3944 : local60.anInt3951;
									Static38.anIntArray46[local99] = local60.anInt3942;
									if (Static124.anIntArray159[local99] == local60.anInt3953) {
										Static166.anIntArray232[local99] |= 0x4;
									} else {
										Static166.anIntArray232[local99] = 4;
									}
									Static124.anIntArray159[local99] = local60.anInt3953;
								}
								local99--;
								local516++;
							}
							if (!local30[arg1 + 1 & 0x3]) {
								arg8[1] = Static109.aBooleanArrayArray15[local77][local505 + 3 & 0x3];
							}
						} else if (!local30[arg1 + 1 & 0x3]) {
							arg8[1] = Static133.aBooleanArrayArray46[local77][local505 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg7 == null) {
			return;
		}
		@Pc(1236) int local1236 = Static323.method5436(arg5, arg7);
		if (!arg7.aBoolean280) {
			return;
		}
		for (local52 = 0; local52 < 8; local52++) {
			@Pc(1252) int local1252 = local52 - arg1 * 2 & 0x7;
			if (Static129.aBooleanArrayArray20[arg0][local52] && Static124.anIntArray159[local1252] <= arg7.anInt3953) {
				Static244.anIntArray372[local1252] = arg7.anInt3954;
				Static92.anIntArray125[local1252] = local1236;
				Static57.anIntArray66[local1252] = arg5.method4862() ? arg7.anInt3944 : arg7.anInt3951;
				Static38.anIntArray46[local1252] = arg7.anInt3942;
				if (Static124.anIntArray159[local1252] == arg7.anInt3953) {
					Static166.anIntArray232[local1252] |= 0x2;
				} else {
					Static166.anIntArray232[local1252] = 2;
				}
				Static124.anIntArray159[local1252] = arg7.anInt3953;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB[I)[I")
	public static int[] method5713(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(13) int[] local13 = new int[1152];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			for (@Pc(21) int local21 = 0; local21 < 36; local21++) {
				@Pc(27) int local27 = arg1[local15];
				if (local27 == 0) {
					if (local21 > 0 && arg1[local15 - 1] != 0) {
						local27 = arg0;
					} else if (local17 > 0 && arg1[local15 - 36] != 0) {
						local27 = arg0;
					} else if (local21 < 35 && arg1[local15 + 1] != 0) {
						local27 = arg0;
					} else if (local17 < 31 && arg1[local15 + 36] != 0) {
						local27 = arg0;
					}
				}
				local13[local15++] = local27;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)Lclient!mf;")
	public static Class25_Sub5 method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class25_Sub5 local14 = local7.aClass25_Sub5_1;
			local7.aClass25_Sub5_1 = null;
			return local14;
		}
	}
}
