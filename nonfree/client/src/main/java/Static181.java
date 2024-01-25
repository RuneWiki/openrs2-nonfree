import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!li", name = "v", descriptor = "[I")
	public static int[] anIntArray325;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "Lclient!tj;")
	public static Class193 aClass193_66;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "Lclient!br;")
	public static Class21 aClass21_9 = null;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Lclient!br;")
	public static Class21 aClass21_10 = null;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "Z")
	public static boolean aBoolean302 = true;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([Z[[BIII[[BLclient!li;II[[BILclient!ph;BLclient!vq;)V")
	public static void method3483(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) Class121 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[][] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class156 arg11, @OriginalArg(13) Class47 arg12) {
		@Pc(55) int local55;
		if (arg6 != null && arg11 != null || arg11 != null && arg8 == 12 || arg6 != null && arg8 == 0) {
			@Pc(39) boolean[] local39 = arg6 != null && arg6.aBoolean299 ? Static72.aBooleanArrayArray3[arg8] : Static157.aBooleanArrayArray4[arg8];
			@Pc(66) Class121 local66;
			@Pc(84) byte local84;
			@Pc(100) int local100;
			@Pc(105) int local105;
			if (arg4 > 0) {
				if (arg3 > 0) {
					local55 = arg1[arg3 - 1][arg4 - 1] & 0xFF;
					if (local55 > 0) {
						local66 = Static293.method3948(local55 - 1);
						if (local66.anInt3843 != -1 && local66.aBoolean299) {
							local84 = arg9[arg3 - 1][arg4 - 1];
							local100 = arg5[arg3 - 1][arg4 - 1] * 2 + 4 & 0x7;
							local105 = Static328.method5313(local66, arg12);
							if (Static204.aBooleanArrayArray5[local84][local100]) {
								Static356.anIntArray513[0] = local66.anInt3843;
								Static234.anIntArray393[0] = local105;
								Static214.anIntArray120[0] = arg12.method2712() ? local66.anInt3837 : local66.anInt3842;
								Static230.anIntArray484[0] = local66.anInt3846;
								Static331.anIntArray488[0] = local66.anInt3847;
								Static139.anIntArray277[0] = 256;
							}
						}
					}
				}
				if (arg7 - 1 > arg3) {
					local55 = arg1[arg3 + 1][arg4 - 1] & 0xFF;
					if (local55 > 0) {
						local66 = Static293.method3948(local55 - 1);
						if (local66.anInt3843 != -1 && local66.aBoolean299) {
							local84 = arg9[arg3 + 1][arg4 - 1];
							local100 = arg5[arg3 + 1][arg4 - 1] * 2 + 6 & 0x7;
							local105 = Static328.method5313(local66, arg12);
							if (Static204.aBooleanArrayArray5[local84][local100]) {
								Static356.anIntArray513[2] = local66.anInt3843;
								Static234.anIntArray393[2] = local105;
								Static214.anIntArray120[2] = arg12.method2712() ? local66.anInt3837 : local66.anInt3842;
								Static230.anIntArray484[2] = local66.anInt3846;
								Static331.anIntArray488[2] = local66.anInt3847;
								Static139.anIntArray277[2] = 512;
							}
						}
					}
				}
			}
			if (arg4 < arg2 - 1) {
				if (arg3 > 0) {
					local55 = arg1[arg3 - 1][arg4 + 1] & 0xFF;
					if (local55 > 0) {
						local66 = Static293.method3948(local55 - 1);
						if (local66.anInt3843 != -1 && local66.aBoolean299) {
							local84 = arg9[arg3 - 1][arg4 + 1];
							local100 = arg5[arg3 - 1][arg4 + 1] * 2 + 2 & 0x7;
							local105 = Static328.method5313(local66, arg12);
							if (Static204.aBooleanArrayArray5[local84][local100]) {
								Static356.anIntArray513[6] = local66.anInt3843;
								Static234.anIntArray393[6] = local105;
								Static214.anIntArray120[6] = arg12.method2712() ? local66.anInt3837 : local66.anInt3842;
								Static230.anIntArray484[6] = local66.anInt3846;
								Static331.anIntArray488[6] = local66.anInt3847;
								Static139.anIntArray277[6] = 64;
							}
						}
					}
				}
				if (arg3 < arg7 - 1) {
					local55 = arg1[arg3 + 1][arg4 + 1] & 0xFF;
					if (local55 > 0) {
						local66 = Static293.method3948(local55 - 1);
						if (local66.anInt3843 != -1 && local66.aBoolean299) {
							local84 = arg9[arg3 + 1][arg4 + 1];
							local100 = arg5[arg3 + 1][arg4 + 1] * 2 & 0x7;
							local105 = Static328.method5313(local66, arg12);
							if (Static204.aBooleanArrayArray5[local84][local100]) {
								Static356.anIntArray513[4] = local66.anInt3843;
								Static234.anIntArray393[4] = local105;
								Static214.anIntArray120[4] = arg12.method2712() ? local66.anInt3837 : local66.anInt3842;
								Static230.anIntArray484[4] = local66.anInt3846;
								Static331.anIntArray488[4] = local66.anInt3847;
								Static139.anIntArray277[4] = 128;
							}
						}
					}
				}
			}
			@Pc(545) int local545;
			@Pc(550) int local550;
			@Pc(552) int local552;
			@Pc(511) byte local511;
			if (arg4 > 0) {
				local55 = arg1[arg3][arg4 - 1] & 0xFF;
				if (local55 > 0) {
					local66 = Static293.method3948(local55 - 1);
					if (local66.anInt3843 != -1) {
						local84 = arg9[arg3][arg4 - 1];
						local511 = arg5[arg3][arg4 - 1];
						if (local66.aBoolean299) {
							local105 = 2;
							local545 = local511 * 2 + 4;
							local550 = Static328.method5313(local66, arg12);
							for (local552 = 0; local552 < 3; local552++) {
								local105 &= 0x7;
								local545 &= 0x7;
								if (Static204.aBooleanArrayArray5[local84][local545] && local66.anInt3847 >= Static331.anIntArray488[local105]) {
									Static356.anIntArray513[local105] = local66.anInt3843;
									Static234.anIntArray393[local105] = local550;
									Static214.anIntArray120[local105] = arg12.method2712() ? local66.anInt3837 : local66.anInt3842;
									Static230.anIntArray484[local105] = local66.anInt3846;
									if (Static331.anIntArray488[local105] == local66.anInt3847) {
										Static139.anIntArray277[local105] |= 0x20;
									} else {
										Static139.anIntArray277[local105] = 32;
									}
									Static331.anIntArray488[local105] = local66.anInt3847;
								}
								local545++;
								local105--;
							}
							if (!local39[arg10 & 0x3]) {
								arg0[0] = Static72.aBooleanArrayArray3[local84][local511 + 2 & 0x3];
							}
						} else if (!local39[--arg10 & 0x3]) {
							arg0[0] = Static157.aBooleanArrayArray4[local84][local511 + 2 & 0x3];
						}
					}
				}
			}
			if (arg4 < arg2 - 1) {
				local55 = arg1[arg3][arg4 + 1] & 0xFF;
				if (local55 > 0) {
					local66 = Static293.method3948(local55 - 1);
					if (local66.anInt3843 != -1) {
						local84 = arg9[arg3][arg4 + 1];
						local511 = arg5[arg3][arg4 + 1];
						if (local66.aBoolean299) {
							local105 = 4;
							local545 = local511 * 2 + 2;
							local550 = Static328.method5313(local66, arg12);
							for (local552 = 0; local552 < 3; local552++) {
								local105 &= 0x7;
								local545 &= 0x7;
								if (Static204.aBooleanArrayArray5[local84][local545] && Static331.anIntArray488[local105] <= local66.anInt3847) {
									Static356.anIntArray513[local105] = local66.anInt3843;
									Static234.anIntArray393[local105] = local550;
									Static214.anIntArray120[local105] = arg12.method2712() ? local66.anInt3837 : local66.anInt3842;
									Static230.anIntArray484[local105] = local66.anInt3846;
									if (Static331.anIntArray488[local105] == local66.anInt3847) {
										Static139.anIntArray277[local105] |= 0x10;
									} else {
										Static139.anIntArray277[local105] = 16;
									}
									Static331.anIntArray488[local105] = local66.anInt3847;
								}
								local545--;
								local105++;
							}
							if (!local39[arg10 + 2 & 0x3]) {
								arg0[2] = Static72.aBooleanArrayArray3[local84][local511 & 0x3];
							}
						} else if (!local39[arg10 + 2 & 0x3]) {
							arg0[2] = Static157.aBooleanArrayArray4[local84][local511 & 0x3];
						}
					}
				}
			}
			if (arg3 > 0) {
				local55 = arg1[arg3 - 1][arg4] & 0xFF;
				if (local55 > 0) {
					local66 = Static293.method3948(local55 - 1);
					if (local66.anInt3843 != -1) {
						local84 = arg9[arg3 - 1][arg4];
						local511 = arg5[arg3 - 1][arg4];
						if (local66.aBoolean299) {
							local105 = 6;
							local545 = local511 * 2 + 4;
							local550 = Static328.method5313(local66, arg12);
							for (local552 = 0; local552 < 3; local552++) {
								local105 &= 0x7;
								local545 &= 0x7;
								if (Static204.aBooleanArrayArray5[local84][local545] && Static331.anIntArray488[local105] <= local66.anInt3847) {
									Static356.anIntArray513[local105] = local66.anInt3843;
									Static234.anIntArray393[local105] = local550;
									Static214.anIntArray120[local105] = arg12.method2712() ? local66.anInt3837 : local66.anInt3842;
									Static230.anIntArray484[local105] = local66.anInt3846;
									if (local66.anInt3847 == Static331.anIntArray488[local105]) {
										Static139.anIntArray277[local105] |= 0x8;
									} else {
										Static139.anIntArray277[local105] = 8;
									}
									Static331.anIntArray488[local105] = local66.anInt3847;
								}
								local105++;
								local545--;
							}
							if (!local39[arg10 + 3 & 0x3]) {
								arg0[3] = Static72.aBooleanArrayArray3[local84][local511 + 1 & 0x3];
							}
						} else if (!local39[arg10 + 3 & 0x3]) {
							arg0[3] = Static157.aBooleanArrayArray4[local84][local511 + 1 & 0x3];
						}
					}
				}
			}
			if (arg3 < arg7 - 1) {
				local55 = arg1[arg3 + 1][arg4] & 0xFF;
				if (local55 > 0) {
					local66 = Static293.method3948(local55 - 1);
					if (local66.anInt3843 != -1) {
						local84 = arg9[arg3 + 1][arg4];
						local511 = arg5[arg3 + 1][arg4];
						if (local66.aBoolean299) {
							local105 = 4;
							local545 = local511 * 2 + 6;
							local550 = Static328.method5313(local66, arg12);
							for (local552 = 0; local552 < 3; local552++) {
								local545 &= 0x7;
								local105 &= 0x7;
								if (Static204.aBooleanArrayArray5[local84][local545] && Static331.anIntArray488[local105] <= local66.anInt3847) {
									Static356.anIntArray513[local105] = local66.anInt3843;
									Static234.anIntArray393[local105] = local550;
									Static214.anIntArray120[local105] = arg12.method2712() ? local66.anInt3837 : local66.anInt3842;
									Static230.anIntArray484[local105] = local66.anInt3846;
									if (local66.anInt3847 == Static331.anIntArray488[local105]) {
										Static139.anIntArray277[local105] |= 0x4;
									} else {
										Static139.anIntArray277[local105] = 4;
									}
									Static331.anIntArray488[local105] = local66.anInt3847;
								}
								local545++;
								local105--;
							}
							if (!local39[arg10 + 1 & 0x3]) {
								arg0[1] = Static72.aBooleanArrayArray3[local84][local511 + 3 & 0x3];
							}
						} else if (!local39[arg10 + 1 & 0x3]) {
							arg0[1] = Static157.aBooleanArrayArray4[local84][local511 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg6 == null) {
			return;
		}
		@Pc(1224) int local1224 = Static328.method5313(arg6, arg12);
		if (!arg6.aBoolean299) {
			return;
		}
		for (local55 = 0; local55 < 8; local55++) {
			@Pc(1239) int local1239 = local55 - arg10 * 2 & 0x7;
			if (Static204.aBooleanArrayArray5[arg8][local55] && Static331.anIntArray488[local1239] <= arg6.anInt3847) {
				Static356.anIntArray513[local1239] = arg6.anInt3843;
				Static234.anIntArray393[local1239] = local1224;
				Static214.anIntArray120[local1239] = arg12.method2712() ? arg6.anInt3837 : arg6.anInt3842;
				Static230.anIntArray484[local1239] = arg6.anInt3846;
				if (arg6.anInt3847 == Static331.anIntArray488[local1239]) {
					Static139.anIntArray277[local1239] |= 0x2;
				} else {
					Static139.anIntArray277[local1239] = 2;
				}
				Static331.anIntArray488[local1239] = arg6.anInt3847;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZIZ)V")
	public static void method3486(@OriginalArg(0) boolean arg0) {
		Static168.anInt6689--;
		if (Static168.anInt6689 == 0) {
			Static194.anIntArray340 = null;
		}
		if (!arg0) {
			return;
		}
		Static110.anInt2698--;
		if (Static110.anInt2698 == 0) {
			Static26.anIntArray24 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZILclient!ao;BZLclient!ao;)I")
	public static int method3489(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub1 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class10_Sub1 arg5) {
		@Pc(10) int local10 = Static338.method5446(arg1, arg3, arg0, arg5);
		if (local10 != 0) {
			return arg1 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(34) int local34 = Static338.method5446(arg4, arg3, arg2, arg5);
			return arg4 ? -local34 : local34;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIZIII)V")
	public static void method3490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static273.aClass128ArrayArrayArray4 == null) {
			Static274.aClass47_9.method2687(arg0, -16777216, arg3, arg1, arg4);
			return;
		}
		Static357.anInt6820++;
		if (Static158.aClass8_Sub1_Sub2_Sub1_1 != null && Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 - (Static158.aClass8_Sub1_Sub2_Sub1_1.method4349() - 1) * 64 >> 7 == Static18.anInt369 && Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 + 64 - Static158.aClass8_Sub1_Sub2_Sub1_1.method4349() * 64 >> 7 == Static39.anInt1027) {
			Static18.anInt369 = -1;
			Static39.anInt1027 = -1;
			Static342.method5467();
		}
		Static23.method384();
		if (!arg2) {
			Static282.method4197();
		}
		Static26.method444();
		Static343.method5475(arg0, arg4, true, arg1, arg3);
		@Pc(76) int local76 = Static319.anInt6181;
		@Pc(78) int local78 = Static89.anInt2442;
		@Pc(80) int local80 = Static124.anInt2956;
		@Pc(82) int local82 = Static152.anInt3325;
		@Pc(105) int local105;
		@Pc(136) int local136;
		if (Static353.anInt2640 == 1) {
			local105 = (int) Static77.aFloat23;
			if (Static114.anInt2732 >> 8 > local105) {
				local105 = Static114.anInt2732 >> 8;
			}
			if (Static298.aBooleanArray26[4] && Static305.anIntArray512[4] + 128 > local105) {
				local105 = Static305.anIntArray512[4] + 128;
			}
			local136 = (int) Static106.aFloat31 + Static70.anInt1840 & 0x3FFF;
			Static168.method5619(Static354.anInt6740, local82, local136, local105, Static193.anInt4286, Static81.method2010(Static12.anInt267, Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702, Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701) - 50, 600 - -((local105 >> 3) * 3));
		} else if (Static353.anInt2640 == 4) {
			local105 = (int) Static77.aFloat23;
			if (local105 < Static114.anInt2732 >> 8) {
				local105 = Static114.anInt2732 >> 8;
			}
			if (Static298.aBooleanArray26[4] && Static305.anIntArray512[4] + 128 > local105) {
				local105 = Static305.anIntArray512[4] + 128;
			}
			local136 = (int) Static106.aFloat31 & 0x3FFF;
			Static168.method5619(Static354.anInt6740, local82, local136, local105, Static193.anInt4286, Static81.method2010(Static12.anInt267, Static207.anInt4327, Static64.anInt1662) - 50, (local105 >> 3) * 3 + 600);
		} else if (Static353.anInt2640 == 5) {
			Static238.method4559(local82);
		}
		local105 = Static240.anInt4829;
		local136 = Static112.anInt2705;
		@Pc(229) int local229 = Static129.anInt3039;
		@Pc(231) int local231 = Static337.anInt6445;
		@Pc(233) int local233 = Static217.anInt4437;
		@Pc(277) int local277;
		for (@Pc(235) int local235 = 0; local235 < 5; local235++) {
			if (Static298.aBooleanArray26[local235]) {
				local277 = (int) ((double) -Static171.anIntArray313[local235] + (double) (Static171.anIntArray313[local235] * 2 + 1) * Math.random() + Math.sin((double) Static144.anIntArray280[local235] / 100.0D * (double) Static149.anIntArray333[local235]) * (double) Static305.anIntArray512[local235]);
				if (local235 == 3) {
					Static217.anInt4437 = local277 + Static217.anInt4437 & 0x3FFF;
				}
				if (local235 == 1) {
					Static112.anInt2705 += local277;
				}
				if (local235 == 0) {
					Static240.anInt4829 += local277;
				}
				if (local235 == 4) {
					Static337.anInt6445 += local277;
					if (Static337.anInt6445 < 1024) {
						Static337.anInt6445 = 1024;
					} else if (Static337.anInt6445 > 3072) {
						Static337.anInt6445 = 3072;
					}
				}
				if (local235 == 2) {
					Static129.anInt3039 += local277;
				}
			}
		}
		if (Static240.anInt4829 < 0) {
			Static240.anInt4829 = 0;
		}
		if (Static240.anInt4829 > (Static198.anInt4128 << 7) - 1) {
			Static240.anInt4829 = (Static198.anInt4128 << 7) - 1;
		}
		if (Static129.anInt3039 < 0) {
			Static129.anInt3039 = 0;
		}
		if (Static129.anInt3039 > (Static15.anInt1162 << 7) - 1) {
			Static129.anInt3039 = (Static15.anInt1162 << 7) - 1;
		}
		Static284.method4835();
		Static69.method1643();
		Static274.aClass47_9.method2709(local76, local78, local80 + local76, local78 - -local82);
		Static274.aClass47_9.method2678();
		local277 = Static235.anInt4755;
		if (Static122.aClass73_1 == null) {
			Static274.aClass47_9.method2728(local277);
		} else {
			Static122.aClass73_1.method2230(local80, local82, Static337.anInt6445, local78, local76, Static217.anInt4437, Static248.anInt5060 << 3, Static274.aClass47_9, local277);
		}
		Static319.method5250();
		Static288.aClass57_6.method4198(Static240.anInt4829, Static112.anInt2705, Static129.anInt3039, -Static337.anInt6445 & 0x3FFF, -Static217.anInt4437 & 0x3FFF, -Static80.anInt2124 & 0x3FFF);
		Static274.aClass47_9.method2656(Static288.aClass57_6);
		Static274.aClass47_9.method2660(local76 + local80 / 2, local78 + local82 / 2, Static272.anInt5415 << 1, Static272.anInt5415 << 1);
		Static343.method5476(local80 / 2 + local76, local82 / 2 + local78, Static272.anInt5415 << 1, Static272.anInt5415 << 1);
		Static153.method3027(Static112.anInt2705, -Static80.anInt2124 & 0x3FFF, Static129.anInt3039, Static240.anInt4829, -Static337.anInt6445 & 0x3FFF, -Static217.anInt4437 & 0x3FFF);
		@Pc(499) byte local499 = Static174.method3345() == 2 ? (byte) Static357.anInt6820 : 1;
		Static4.method4654(Static274.aClass47_9, Static199.anInt4137, Static142.anInt3231, Static288.aClass57_6, Static240.anInt4829, Static112.anInt2705, Static129.anInt3039, Static63.aByteArrayArrayArray3, Static226.anIntArray388, Static151.anIntArray271, Static103.anIntArray229, Static7.anIntArray6, Static274.anIntArray443, Static12.anInt267 + 1, local499, Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 >> 7, Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 >> 7, !Static292.aBoolean421);
		Static319.method5250();
		if (Static139.anInt3199 == 30) {
			Static209.method3882(local80, local82, local76, local78);
			Static195.method3699(local82, local78, local80, local76);
			Static155.method3034(local78, local76, local82, local80);
			Static38.method753(local76, local82, local80, local78);
		}
		Static29.method497();
		Static240.anInt4829 = local105;
		Static217.anInt4437 = local233;
		Static129.anInt3039 = local229;
		Static112.anInt2705 = local136;
		Static337.anInt6445 = local231;
		if (Static57.aBoolean108 && Static147.aClass13_3.method295() == 0) {
			Static57.aBoolean108 = false;
		}
		if (Static57.aBoolean108) {
			Static274.aClass47_9.method2687(local76, -16777216, local80, local78, local82);
			Static3.method124(false, Static341.aClass159_23.method4311(Static180.anInt3835), Static238.aClass51_6);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)Z")
	public static boolean method3491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static143.method2962(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static218.method3955(local10 + 1, Static261.aClass60Array2[arg0].method2264(arg1, arg2) + arg3, local14 + 1) && Static218.method3955(local10 + 128 - 1, Static261.aClass60Array2[arg0].method2264(arg1 + 1, arg2) + arg3, local14 + 1) && Static218.method3955(local10 + 128 - 1, Static261.aClass60Array2[arg0].method2264(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static218.method3955(local10 + 1, Static261.aClass60Array2[arg0].method2264(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
