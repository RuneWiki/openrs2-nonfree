import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] aClass2_Sub2_Sub3_Sub2Array6;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
	public static int anInt2296;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
	public static int[] anIntArray377 = new int[5];

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!sg;")
	public static Class77 aClass77_894 = Static146.method2172("rot:");

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "Lclient!sg;")
	public static Class77 aClass77_895 = Static146.method2172("me");

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!sg;")
	public static Class77 aClass77_896 = Static146.method2172("blaugr-Un:");

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "Lclient!sg;")
	private static Class77 aClass77_897 = Static146.method2172("scroll:");

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!sg;")
	public static Class77 aClass77_898 = aClass77_897;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_899 = aClass77_897;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	public static int anInt2297 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	public static void method1615() {
		aClass77_894 = null;
		anIntArray377 = null;
		aClass77_898 = null;
		aClass77_899 = null;
		aClass77_895 = null;
		aClass77_897 = null;
		aClass77_896 = null;
		aClass2_Sub2_Sub3_Sub2Array6 = null;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!ke;)V")
	public static void method1616(@OriginalArg(1) Class43 arg0) {
		Static13.aClass43_4 = arg0;
		Static100.anInt797 = Static13.aClass43_4.method2223(16);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public static void method1617() {
		if (Static149.aClass66_12 != null || Static34.aClass66_5 != null) {
			return;
		}
		@Pc(18) int local18 = Static50.anInt1384;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(72) int local72;
		if (Static166.aBoolean181) {
			if (local18 != 1) {
				local27 = Static20.anInt631;
				local29 = Static132.anInt3185;
				if (Static17.anInt608 - 10 > local27 || Static64.anInt1811 + Static17.anInt608 + 10 < local27 || Static147.anInt3576 - 10 > local29 || local29 > Static156.anInt3881 + Static147.anInt3576 + 10) {
					Static166.aBoolean181 = false;
					Static5.method100(Static156.anInt3881, Static64.anInt1811, Static17.anInt608, Static147.anInt3576);
				}
			}
			if (local18 == 1) {
				local27 = Static17.anInt608;
				local29 = Static147.anInt3576;
				local72 = Static64.anInt1811;
				@Pc(74) int local74 = Static156.anInt3884;
				@Pc(76) int local76 = Static38.anInt1113;
				@Pc(78) int local78 = -1;
				for (@Pc(80) int local80 = 0; local80 < Static18.anInt618; local80++) {
					@Pc(95) int local95 = (Static18.anInt618 - local80 - 1) * 15 + local29 + 31;
					if (local27 < local74 && local74 < local72 + local27 && local95 - 13 < local76 && local76 < local95 + 3) {
						local78 = local80;
					}
				}
				if (local78 != -1) {
					Static53.method1024(local78);
				}
				Static166.aBoolean181 = false;
				Static5.method100(Static156.anInt3881, Static64.anInt1811, Static17.anInt608, Static147.anInt3576);
				return;
			}
			return;
		}
		if (local18 == 1 && Static18.anInt618 > 0) {
			local27 = Static131.anIntArray616[Static18.anInt618 - 1];
			if (local27 == 36 || local27 == 12 || local27 == 48 || local27 == 29 || local27 == 30 || local27 == 41 || local27 == 23 || local27 == 39 || local27 == 9 || local27 == 43 || local27 == 19 || local27 == 1002) {
				local29 = Static107.anIntArray418[Static18.anInt618 - 1];
				local72 = Static137.anIntArray496[Static18.anInt618 - 1];
				@Pc(222) Class66 local222 = Static55.method1034(local72);
				if (Static38.method771(Static63.method1160(local222)) || Static78.method1458(Static63.method1160(local222))) {
					Static24.aBoolean40 = false;
					Static45.anInt1191 = 0;
					if (Static149.aClass66_12 != null) {
						Static57.method2994(Static149.aClass66_12);
					}
					Static149.aClass66_12 = Static55.method1034(local72);
					Static132.anInt3177 = Static156.anInt3884;
					Static62.anInt1661 = Static38.anInt1113;
					Static124.anInt3033 = local29;
					Static57.method2994(Static149.aClass66_12);
					return;
				}
			}
		}
		if (local18 == 1 && (Static98.anInt2481 == 1 && Static18.anInt618 > 2 || Static131.method2904(Static18.anInt618 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static18.anInt618 > 0) {
			Static53.method1024(Static18.anInt618 - 1);
		}
		if (local18 != 2 || Static18.anInt618 <= 0) {
			return;
		}
		Static80.method1473();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[Lclient!vb;Lclient!og;)V")
	public static void method1619(@OriginalArg(1) Class86[] arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(32) int local32;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static140.aByteArrayArrayArray6[local7][local11][local15] & 0x1) == 1) {
						local32 = local7;
						if ((Static140.aByteArrayArrayArray6[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method2814(local15, local11);
						}
					}
				}
			}
		}
		Static31.anInt888 += (int) (Math.random() * 5.0D) - 2;
		if (Static31.anInt888 < -8) {
			Static31.anInt888 = -8;
		}
		if (Static31.anInt888 > 8) {
			Static31.anInt888 = 8;
		}
		Static146.anInt3064 += (int) (Math.random() * 5.0D) - 2;
		if (Static146.anInt3064 < -16) {
			Static146.anInt3064 = -16;
		}
		if (Static146.anInt3064 > 16) {
			Static146.anInt3064 = 16;
		}
		@Pc(127) int local127;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(223) int local223;
		@Pc(178) int local178;
		@Pc(158) int local158;
		@Pc(191) int local191;
		@Pc(197) int local197;
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(272) int local272;
		@Pc(496) int local496;
		@Pc(535) int local535;
		@Pc(636) int local636;
		@Pc(646) int local646;
		@Pc(661) int local661;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(117) byte[][] local117 = Static27.aByteArrayArrayArray1[local11];
			local32 = (int) Math.sqrt(5100.0D);
			local127 = local32 * 768 >> 8;
			for (local129 = 1; local129 < 103; local129++) {
				for (local133 = 1; local133 < 103; local133++) {
					local158 = Static122.anIntArrayArrayArray2[local11][local133][local129 + 1] - Static122.anIntArrayArrayArray2[local11][local133][local129 - 1];
					local178 = Static122.anIntArrayArrayArray2[local11][local133 + 1][local129] - Static122.anIntArrayArrayArray2[local11][local133 - 1][local129];
					local191 = (int) Math.sqrt((double) (local158 * local158 + local178 * local178 + 65536));
					local197 = (local178 << 8) / local191;
					local201 = 65536 / local191;
					local207 = (local158 << 8) / local191;
					local223 = (local201 * -10 + local197 * -50 + local207 * -50) / local127 + 96;
					local272 = (local117[local133 - 1][local129] >> 2) + (local117[local133 + 1][local129] >> 3) + (local117[local133][local129 - 1] >> 2) + (local117[local133][local129 + 1] >> 3) + (local117[local133][local129] >> 1);
					Static98.anIntArrayArray18[local133][local129] = local223 - local272;
				}
			}
			for (local133 = 0; local133 < 104; local133++) {
				Static148.anIntArray535[local133] = 0;
				Static1.anIntArray5[local133] = 0;
				Static101.anIntArray399[local133] = 0;
				Static177.anIntArray633[local133] = 0;
				Static71.anIntArray319[local133] = 0;
			}
			for (local223 = -5; local223 < 109; local223++) {
				for (local178 = 0; local178 < 104; local178++) {
					local158 = local223 + 5;
					@Pc(395) int local395;
					if (local158 >= 0 && local158 < 104) {
						local191 = Static147.aByteArrayArrayArray7[local11][local158][local178] & 0xFF;
						if (local191 > 0) {
							@Pc(359) Class2_Sub2_Sub6 local359 = Static88.method1622(local191 - 1);
							Static148.anIntArray535[local178] += local359.anInt971;
							Static1.anIntArray5[local178] += local359.anInt966;
							Static101.anIntArray399[local178] += local359.anInt967;
							Static177.anIntArray633[local178] += local359.anInt969;
							local395 = Static71.anIntArray319[local178]++;
						}
					}
					local191 = local223 - 5;
					if (local191 >= 0 && local191 < 104) {
						local197 = Static147.aByteArrayArrayArray7[local11][local191][local178] & 0xFF;
						if (local197 > 0) {
							@Pc(427) Class2_Sub2_Sub6 local427 = Static88.method1622(local197 - 1);
							Static148.anIntArray535[local178] -= local427.anInt971;
							Static1.anIntArray5[local178] -= local427.anInt966;
							Static101.anIntArray399[local178] -= local427.anInt967;
							Static177.anIntArray633[local178] -= local427.anInt969;
							local395 = Static71.anIntArray319[local178]--;
						}
					}
				}
				if (local223 >= 1 && local223 < 103) {
					local158 = 0;
					local197 = 0;
					local191 = 0;
					local201 = 0;
					local207 = 0;
					for (local272 = -5; local272 < 109; local272++) {
						local496 = local272 + 5;
						if (local496 >= 0 && local496 < 104) {
							local207 += Static71.anIntArray319[local496];
							local191 += Static1.anIntArray5[local496];
							local197 += Static101.anIntArray399[local496];
							local158 += Static148.anIntArray535[local496];
							local201 += Static177.anIntArray633[local496];
						}
						local535 = local272 - 5;
						if (local535 >= 0 && local535 < 104) {
							local207 -= Static71.anIntArray319[local535];
							local191 -= Static1.anIntArray5[local535];
							local197 -= Static101.anIntArray399[local535];
							local201 -= Static177.anIntArray633[local535];
							local158 -= Static148.anIntArray535[local535];
						}
						if (local272 >= 1 && local272 < 103 && (!Static92.aBoolean101 || (Static140.aByteArrayArrayArray6[0][local223][local272] & 0x2) != 0 || (Static140.aByteArrayArrayArray6[local11][local223][local272] & 0x10) == 0 && Static77.method1450(local11, local272, local223) == Static24.anInt724)) {
							if (local11 < Static118.anInt2928) {
								Static118.anInt2928 = local11;
							}
							local636 = Static147.aByteArrayArrayArray7[local11][local223][local272] & 0xFF;
							local646 = Static129.aByteArrayArrayArray5[local11][local223][local272] & 0xFF;
							if (local636 > 0 || local646 > 0) {
								local661 = Static122.anIntArrayArrayArray2[local11][local223][local272];
								@Pc(671) int local671 = Static122.anIntArrayArrayArray2[local11][local223 + 1][local272];
								@Pc(683) int local683 = Static122.anIntArrayArrayArray2[local11][local223 + 1][local272 + 1];
								@Pc(693) int local693 = Static122.anIntArrayArrayArray2[local11][local223][local272 + 1];
								@Pc(699) int local699 = Static98.anIntArrayArray18[local223][local272];
								@Pc(707) int local707 = Static98.anIntArrayArray18[local223 + 1][local272];
								@Pc(717) int local717 = Static98.anIntArrayArray18[local223 + 1][local272 + 1];
								@Pc(719) int local719 = -1;
								@Pc(727) int local727 = Static98.anIntArrayArray18[local223][local272 + 1];
								@Pc(729) int local729 = -1;
								@Pc(737) int local737;
								@Pc(741) int local741;
								if (local636 > 0) {
									local737 = local158 * 256 / local201;
									local741 = local191 / local207;
									@Pc(745) int local745 = local197 / local207;
									local719 = Static42.method813(local737, local745, local741);
									local745 += Static146.anInt3064;
									if (local745 < 0) {
										local745 = 0;
									} else if (local745 > 255) {
										local745 = 255;
									}
									local737 = local737 + Static31.anInt888 & 0xFF;
									local729 = Static42.method813(local737, local745, local741);
								}
								if (local11 > 0) {
									@Pc(788) boolean local788 = true;
									if (local636 == 0 && Static27.aByteArrayArrayArray2[local11][local223][local272] != 0) {
										local788 = false;
									}
									if (local646 > 0 && !Static96.method1753(local646 - 1).aBoolean69) {
										local788 = false;
									}
									if (local788 && local661 == local671 && local683 == local661 && local693 == local661) {
										Static140.anIntArrayArrayArray6[local11][local223][local272] |= 0x924;
									}
								}
								local737 = 0;
								if (local729 != -1) {
									local737 = Static12.anIntArray53[Static152.method2586(local729, 96)];
								}
								if (local646 == 0) {
									arg1.method2070(local11, local223, local272, 0, 0, -1, local661, local671, local683, local693, Static152.method2586(local719, local699), Static152.method2586(local719, local707), Static152.method2586(local719, local717), Static152.method2586(local719, local727), 0, 0, 0, 0, local737, 0);
								} else {
									@Pc(909) byte local909 = Static101.aByteArrayArrayArray4[local11][local223][local272];
									local741 = Static27.aByteArrayArrayArray2[local11][local223][local272] + 1;
									@Pc(925) Class2_Sub2_Sub7 local925 = Static96.method1753(local646 - 1);
									@Pc(928) int local928 = local925.anInt1378;
									if (local928 >= 0 && !Static12.anInterface2_1.method1656(local928)) {
										local928 = -1;
									}
									@Pc(946) int local946;
									@Pc(944) int local944;
									@Pc(969) int local969;
									@Pc(974) int local974;
									if (local928 >= 0) {
										local944 = Static12.anInterface2_1.method1655(local928);
										local946 = -1;
									} else if (local925.anInt1368 == 16711935) {
										local928 = -1;
										local946 = -2;
										local944 = -2;
									} else {
										local946 = Static42.method813(local925.anInt1381, local925.anInt1370, local925.anInt1374);
										local969 = local925.anInt1381 + Static31.anInt888 & 0xFF;
										local974 = Static146.anInt3064 + local925.anInt1370;
										if (local974 < 0) {
											local974 = 0;
										} else if (local974 > 255) {
											local974 = 255;
										}
										local944 = Static42.method813(local969, local974, local925.anInt1374);
									}
									local969 = 0;
									if (local944 != -2) {
										local969 = Static12.anIntArray53[Static49.method945(local944, 96)];
									}
									if (local925.anInt1377 != -1) {
										local974 = local925.anInt1376 + Static31.anInt888 & 0xFF;
										@Pc(1035) int local1035 = Static146.anInt3064 + local925.anInt1366;
										if (local1035 < 0) {
											local1035 = 0;
										} else if (local1035 > 255) {
											local1035 = 255;
										}
										local944 = Static42.method813(local974, local1035, local925.anInt1372);
										local969 = Static12.anIntArray53[Static49.method945(local944, 96)];
									}
									arg1.method2070(local11, local223, local272, local741, local909, local928, local661, local671, local683, local693, Static152.method2586(local719, local699), Static152.method2586(local719, local707), Static152.method2586(local719, local717), Static152.method2586(local719, local727), Static49.method945(local946, local699), Static49.method945(local946, local707), Static49.method945(local946, local717), Static49.method945(local946, local727), local737, local969);
								}
							}
						}
					}
				}
			}
			for (local178 = 1; local178 < 103; local178++) {
				for (local158 = 1; local158 < 103; local158++) {
					arg1.method2046(local11, local158, local178, Static77.method1450(local11, local178, local158));
				}
			}
			Static147.aByteArrayArrayArray7[local11] = null;
			Static129.aByteArrayArrayArray5[local11] = null;
			Static27.aByteArrayArrayArray2[local11] = null;
			Static101.aByteArrayArrayArray4[local11] = null;
			Static27.aByteArrayArrayArray1[local11] = null;
		}
		arg1.method2067();
		for (local15 = 0; local15 < 104; local15++) {
			for (local32 = 0; local32 < 104; local32++) {
				if ((Static140.aByteArrayArrayArray6[1][local15][local32] & 0x2) == 2) {
					arg1.method2094(local15, local32);
				}
			}
		}
		local32 = 1;
		local129 = 4;
		local127 = 2;
		for (local133 = 0; local133 < 4; local133++) {
			if (local133 > 0) {
				local32 <<= 0x3;
				local127 <<= 0x3;
				local129 <<= 0x3;
			}
			for (local223 = 0; local223 <= local133; local223++) {
				for (local178 = 0; local178 <= 104; local178++) {
					for (local158 = 0; local158 <= 104; local158++) {
						if ((Static140.anIntArrayArrayArray6[local223][local158][local178] & local32) != 0) {
							local191 = local178;
							local207 = local223;
							for (local197 = local178; local197 < 104 && (Static140.anIntArrayArrayArray6[local223][local158][local197 + 1] & local32) != 0; local197++) {
							}
							local201 = local223;
							while (local191 > 0 && (Static140.anIntArrayArrayArray6[local223][local158][local191 - 1] & local32) != 0) {
								local191--;
							}
							label353: while (local201 > 0) {
								for (local272 = local191; local272 <= local197; local272++) {
									if ((local32 & Static140.anIntArrayArrayArray6[local201 - 1][local158][local272]) == 0) {
										break label353;
									}
								}
								local201--;
							}
							label342: while (local207 < local133) {
								for (local272 = local191; local272 <= local197; local272++) {
									if ((Static140.anIntArrayArrayArray6[local207 + 1][local158][local272] & local32) == 0) {
										break label342;
									}
								}
								local207++;
							}
							local272 = (local207 + 1 - local201) * ((local197 + 1) - local191);
							if (local272 >= 8) {
								local535 = Static122.anIntArrayArrayArray2[local207][local158][local191] - 240;
								local636 = Static122.anIntArrayArrayArray2[local201][local158][local191];
								Static116.method2092(local133, 1, local158 * 128, local158 * 128, local191 * 128, local197 * 128 + 128, local535, local636);
								for (local646 = local201; local646 <= local207; local646++) {
									for (local661 = local191; local661 <= local197; local661++) {
										Static140.anIntArrayArrayArray6[local646][local158][local661] &= ~local32;
									}
								}
							}
						}
						if ((Static140.anIntArrayArrayArray6[local223][local158][local178] & local127) != 0) {
							for (local191 = local158; local191 > 0 && (local127 & Static140.anIntArrayArrayArray6[local223][local191 - 1][local178]) != 0; local191--) {
							}
							local197 = local158;
							local201 = local223;
							while (local197 < 104 && (local127 & Static140.anIntArrayArrayArray6[local223][local197 + 1][local178]) != 0) {
								local197++;
							}
							label408: while (local201 > 0) {
								for (local272 = local191; local272 <= local197; local272++) {
									if ((Static140.anIntArrayArrayArray6[local201 - 1][local272][local178] & local127) == 0) {
										break label408;
									}
								}
								local201--;
							}
							label396: for (local207 = local223; local207 < local133; local207++) {
								for (local272 = local191; local272 <= local197; local272++) {
									if ((Static140.anIntArrayArrayArray6[local207 + 1][local272][local178] & local127) == 0) {
										break label396;
									}
								}
							}
							local272 = (local207 + 1 - local201) * (local197 - (local191 - 1));
							if (local272 >= 8) {
								local636 = Static122.anIntArrayArrayArray2[local201][local191][local178];
								local535 = Static122.anIntArrayArrayArray2[local207][local191][local178] - 240;
								Static116.method2092(local133, 2, local191 * 128, local197 * 128 + 128, local178 * 128, local178 * 128, local535, local636);
								for (local646 = local201; local646 <= local207; local646++) {
									for (local661 = local191; local661 <= local197; local661++) {
										Static140.anIntArrayArrayArray6[local646][local661][local178] &= ~local127;
									}
								}
							}
						}
						if ((Static140.anIntArrayArrayArray6[local223][local158][local178] & local129) != 0) {
							local197 = local158;
							local191 = local158;
							for (local201 = local178; local201 > 0 && (Static140.anIntArrayArrayArray6[local223][local158][local201 - 1] & local129) != 0; local201--) {
							}
							for (local207 = local178; local207 < 104 && (local129 & Static140.anIntArrayArrayArray6[local223][local158][local207 + 1]) != 0; local207++) {
							}
							label462: while (local191 > 0) {
								for (local272 = local201; local272 <= local207; local272++) {
									if ((local129 & Static140.anIntArrayArrayArray6[local223][local191 - 1][local272]) == 0) {
										break label462;
									}
								}
								local191--;
							}
							label451: while (local197 < 104) {
								for (local272 = local201; local272 <= local207; local272++) {
									if ((Static140.anIntArrayArrayArray6[local223][local197 + 1][local272] & local129) == 0) {
										break label451;
									}
								}
								local197++;
							}
							if ((local207 + 1 - local201) * ((local197 - local191) + 1) >= 4) {
								local272 = Static122.anIntArrayArrayArray2[local223][local191][local201];
								Static116.method2092(local133, 4, local191 * 128, local197 * 128 + 128, local201 * 128, local207 * 128 + 128, local272, local272);
								for (local496 = local191; local496 <= local197; local496++) {
									for (local535 = local201; local535 <= local207; local535++) {
										Static140.anIntArrayArrayArray6[local223][local496][local535] &= ~local129;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
