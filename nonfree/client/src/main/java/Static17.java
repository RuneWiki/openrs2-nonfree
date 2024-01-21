import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!client", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_8;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	public static int anInt606 = 0;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!vc;")
	private static Class71 aClass71_338 = Static38.method736("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
	public static int[] anIntArray76 = new int[5];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!vc;")
	public static Class71 aClass71_339 = Static38.method736("(X");

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_340 = aClass71_338;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	public static int anInt611 = 2;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	public static volatile int anInt613 = 0;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	public static int anInt618 = 0;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_341 = Static38.method736("(Udns");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[Lclient!ic;Lclient!l;)V")
	public static void method474(@OriginalArg(1) Class33[] arg0, @OriginalArg(2) Class43 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(32) int local32;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static59.aByteArrayArrayArray2[local7][local11][local15] & 0x1) == 1) {
						local32 = local7;
						if ((Static59.aByteArrayArrayArray2[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method950(local11, local15);
						}
					}
				}
			}
		}
		Static75.anInt1858 += (int) (Math.random() * 5.0D) - 2;
		Static28.anInt772 += (int) (Math.random() * 5.0D) - 2;
		if (Static28.anInt772 < -16) {
			Static28.anInt772 = -16;
		}
		if (Static28.anInt772 > 16) {
			Static28.anInt772 = 16;
		}
		if (Static75.anInt1858 < -8) {
			Static75.anInt1858 = -8;
		}
		if (Static75.anInt1858 > 8) {
			Static75.anInt1858 = 8;
		}
		@Pc(127) int local127;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(155) int local155;
		@Pc(176) int local176;
		@Pc(190) int local190;
		@Pc(196) int local196;
		@Pc(206) int local206;
		@Pc(202) int local202;
		@Pc(272) int local272;
		@Pc(255) int local255;
		@Pc(495) int local495;
		@Pc(499) int local499;
		@Pc(642) int local642;
		@Pc(652) int local652;
		@Pc(670) int local670;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(117) byte[][] local117 = Static23.aByteArrayArrayArray1[local11];
			local32 = (int) Math.sqrt(5100.0D);
			local127 = local32 * 768 >> 8;
			for (local129 = 1; local129 < 103; local129++) {
				for (local133 = 1; local133 < 103; local133++) {
					local155 = Static51.anIntArrayArrayArray3[local11][local133 + 1][local129] - Static51.anIntArrayArrayArray3[local11][local133 - 1][local129];
					local176 = Static51.anIntArrayArrayArray3[local11][local133][local129 + 1] - Static51.anIntArrayArrayArray3[local11][local133][local129 - 1];
					local190 = (int) Math.sqrt((double) (local155 * local155 + local176 * local176 + 65536));
					local196 = (local155 << 8) / local190;
					local202 = (local176 << 8) / local190;
					local206 = 65536 / local190;
					local255 = (local117[local133][local129] >> 1) + (local117[local133 + 1][local129] >> 3) + (local117[local133 + -1][local129] >> 2) - (-(local117[local133][local129 + -1] >> 2) - (local117[local133][local129 - -1] >> 3));
					local272 = (local206 * -10 + local196 * -50 + local202 * -50) / local127 + 96;
					Static9.anIntArrayArray2[local133][local129] = local272 - local255;
				}
			}
			for (local133 = 0; local133 < 104; local133++) {
				Static108.anIntArray272[local133] = 0;
				Static8.anIntArray17[local133] = 0;
				Static31.anIntArray103[local133] = 0;
				Static97.anIntArray256[local133] = 0;
				Static30.anIntArray99[local133] = 0;
			}
			for (local155 = -5; local155 < 109; local155++) {
				for (local176 = 0; local176 < 104; local176++) {
					local190 = local155 + 5;
					@Pc(394) int local394;
					if (local190 >= 0 && local190 < 104) {
						local196 = Static66.aByteArrayArrayArray3[local11][local190][local176] & 0xFF;
						if (local196 > 0) {
							@Pc(358) Class5_Sub1_Sub2 local358 = Static76.method1246(local196 - 1);
							Static108.anIntArray272[local176] += local358.anInt199;
							Static8.anIntArray17[local176] += local358.anInt210;
							Static31.anIntArray103[local176] += local358.anInt198;
							Static97.anIntArray256[local176] += local358.anInt203;
							local394 = Static30.anIntArray99[local176]++;
						}
					}
					local196 = local155 - 5;
					if (local196 >= 0 && local196 < 104) {
						local206 = Static66.aByteArrayArrayArray3[local11][local196][local176] & 0xFF;
						if (local206 > 0) {
							@Pc(426) Class5_Sub1_Sub2 local426 = Static76.method1246(local206 - 1);
							Static108.anIntArray272[local176] -= local426.anInt199;
							Static8.anIntArray17[local176] -= local426.anInt210;
							Static31.anIntArray103[local176] -= local426.anInt198;
							Static97.anIntArray256[local176] -= local426.anInt203;
							local394 = Static30.anIntArray99[local176]--;
						}
					}
				}
				if (local155 >= 1 && local155 < 103) {
					local190 = 0;
					local196 = 0;
					local202 = 0;
					local206 = 0;
					local272 = 0;
					for (local255 = -5; local255 < 109; local255++) {
						local495 = local255 + 5;
						local499 = local255 - 5;
						if (local495 >= 0 && local495 < 104) {
							local190 += Static108.anIntArray272[local495];
							local272 += Static30.anIntArray99[local495];
							local196 += Static8.anIntArray17[local495];
							local206 += Static31.anIntArray103[local495];
							local202 += Static97.anIntArray256[local495];
						}
						if (local499 >= 0 && local499 < 104) {
							local272 -= Static30.anIntArray99[local499];
							local196 -= Static8.anIntArray17[local499];
							local190 -= Static108.anIntArray272[local499];
							local202 -= Static97.anIntArray256[local499];
							local206 -= Static31.anIntArray103[local499];
						}
						if (local255 >= 1 && local255 < 103 && (!Static21.aBoolean28 || (Static59.aByteArrayArrayArray2[0][local155][local255] & 0x2) != 0 || (Static59.aByteArrayArrayArray2[local11][local155][local255] & 0x10) == 0 && Static94.method1574(local11, local155, local255) == Static19.anInt644)) {
							if (Static77.anInt1920 > local11) {
								Static77.anInt1920 = local11;
							}
							local642 = Static66.aByteArrayArrayArray3[local11][local155][local255] & 0xFF;
							local652 = Static81.aByteArrayArrayArray6[local11][local155][local255] & 0xFF;
							if (local642 > 0 || local652 > 0) {
								local670 = Static51.anIntArrayArrayArray3[local11][local155][local255];
								@Pc(680) int local680 = Static51.anIntArrayArrayArray3[local11][local155 + 1][local255];
								@Pc(692) int local692 = Static51.anIntArrayArrayArray3[local11][local155 + 1][local255 + 1];
								@Pc(700) int local700 = Static9.anIntArrayArray2[local155 + 1][local255];
								@Pc(710) int local710 = Static51.anIntArrayArrayArray3[local11][local155][local255 + 1];
								@Pc(716) int local716 = Static9.anIntArrayArray2[local155][local255];
								@Pc(726) int local726 = Static9.anIntArrayArray2[local155 + 1][local255 + 1];
								@Pc(728) int local728 = -1;
								@Pc(730) int local730 = -1;
								@Pc(738) int local738 = Static9.anIntArrayArray2[local155][local255 + 1];
								@Pc(749) int local749;
								@Pc(757) int local757;
								if (local642 > 0) {
									local749 = local190 * 256 / local202;
									@Pc(753) int local753 = local206 / local272;
									local757 = local196 / local272;
									local730 = Static112.method1753(local753, local757, local749);
									local753 += Static28.anInt772;
									if (local753 < 0) {
										local753 = 0;
									} else if (local753 > 255) {
										local753 = 255;
									}
									local749 = Static75.anInt1858 + local749 & 0xFF;
									local728 = Static112.method1753(local753, local757, local749);
								}
								if (local11 > 0) {
									@Pc(802) boolean local802 = true;
									if (local642 == 0 && Static71.aByteArrayArrayArray4[local11][local155][local255] != 0) {
										local802 = false;
									}
									if (local652 > 0 && !Static101.method1644(local652 - 1).aBoolean46) {
										local802 = false;
									}
									if (local802 && local670 == local680 && local692 == local670 && local710 == local670) {
										Static64.anIntArrayArrayArray9[local11][local155][local255] |= 0x924;
									}
								}
								local749 = 0;
								if (local728 != -1) {
									local749 = Static80.anIntArray244[Static90.method2006(local728, 96)];
								}
								if (local652 == 0) {
									arg1.method1063(local11, local155, local255, 0, 0, -1, local670, local680, local692, local710, Static90.method2006(local730, local716), Static90.method2006(local730, local700), Static90.method2006(local730, local726), Static90.method2006(local730, local738), 0, 0, 0, 0, local749, 0);
								} else {
									local757 = Static71.aByteArrayArrayArray4[local11][local155][local255] + 1;
									@Pc(938) byte local938 = Static114.aByteArrayArrayArray7[local11][local155][local255];
									@Pc(944) Class5_Sub1_Sub8 local944 = Static101.method1644(local652 - 1);
									@Pc(947) int local947 = local944.anInt1062;
									@Pc(958) int local958;
									@Pc(960) int local960;
									@Pc(980) int local980;
									@Pc(985) int local985;
									if (local947 >= 0) {
										local958 = -1;
										local960 = Static80.anInterface3_1.method7(local947);
									} else if (local944.anInt1058 == 16711935) {
										local958 = -2;
										local960 = -2;
										local947 = -1;
									} else {
										local958 = Static112.method1753(local944.anInt1064, local944.anInt1055, local944.anInt1052);
										local980 = Static75.anInt1858 + local944.anInt1052 & 0xFF;
										local985 = local944.anInt1064 + Static28.anInt772;
										if (local985 < 0) {
											local985 = 0;
										} else if (local985 > 255) {
											local985 = 255;
										}
										local960 = Static112.method1753(local985, local944.anInt1055, local980);
									}
									local980 = 0;
									if (local960 != -2) {
										local980 = Static80.anIntArray244[Static88.method1404(local960, 96)];
									}
									if (local944.anInt1054 != -1) {
										local985 = local944.anInt1059 + Static75.anInt1858 & 0xFF;
										@Pc(1050) int local1050 = Static28.anInt772 + local944.anInt1053;
										if (local1050 < 0) {
											local1050 = 0;
										} else if (local1050 > 255) {
											local1050 = 255;
										}
										local960 = Static112.method1753(local1050, local944.anInt1056, local985);
										local980 = Static80.anIntArray244[Static88.method1404(local960, 96)];
									}
									arg1.method1063(local11, local155, local255, local757, local938, local947, local670, local680, local692, local710, Static90.method2006(local730, local716), Static90.method2006(local730, local700), Static90.method2006(local730, local726), Static90.method2006(local730, local738), Static88.method1404(local958, local716), Static88.method1404(local958, local700), Static88.method1404(local958, local726), Static88.method1404(local958, local738), local749, local980);
								}
							}
						}
					}
				}
			}
			for (local176 = 1; local176 < 103; local176++) {
				for (local190 = 1; local190 < 103; local190++) {
					arg1.method1060(local11, local190, local176, Static94.method1574(local11, local190, local176));
				}
			}
			Static66.aByteArrayArrayArray3[local11] = null;
			Static81.aByteArrayArrayArray6[local11] = null;
			Static71.aByteArrayArrayArray4[local11] = null;
			Static114.aByteArrayArrayArray7[local11] = null;
			Static23.aByteArrayArrayArray1[local11] = null;
		}
		arg1.method1075();
		for (local15 = 0; local15 < 104; local15++) {
			for (local32 = 0; local32 < 104; local32++) {
				if ((Static59.aByteArrayArrayArray2[1][local15][local32] & 0x2) == 2) {
					arg1.method1092(local15, local32);
				}
			}
		}
		local32 = 1;
		local127 = 2;
		local129 = 4;
		for (local133 = 0; local133 < 4; local133++) {
			if (local133 > 0) {
				local127 <<= 0x3;
				local32 <<= 0x3;
				local129 <<= 0x3;
			}
			for (local155 = 0; local155 <= local133; local155++) {
				for (local176 = 0; local176 <= 104; local176++) {
					for (local190 = 0; local190 <= 104; local190++) {
						if ((Static64.anIntArrayArrayArray9[local155][local190][local176] & local32) != 0) {
							local206 = local176;
							local202 = local155;
							while (local206 < 104 && (local32 & Static64.anIntArrayArrayArray9[local155][local190][local206 + 1]) != 0) {
								local206++;
							}
							local196 = local176;
							local272 = local155;
							while (local196 > 0 && (local32 & Static64.anIntArrayArrayArray9[local155][local190][local196 - 1]) != 0) {
								local196--;
							}
							label347: while (local202 > 0) {
								for (local255 = local196; local255 <= local206; local255++) {
									if ((Static64.anIntArrayArrayArray9[local202 - 1][local190][local255] & local32) == 0) {
										break label347;
									}
								}
								local202--;
							}
							label336: while (local272 < local133) {
								for (local255 = local196; local255 <= local206; local255++) {
									if ((local32 & Static64.anIntArrayArrayArray9[local272 + 1][local190][local255]) == 0) {
										break label336;
									}
								}
								local272++;
							}
							local255 = (local272 + 1 - local202) * (local206 + 1 - local196);
							if (local255 >= 8) {
								local642 = Static51.anIntArrayArrayArray3[local202][local190][local196];
								local499 = Static51.anIntArrayArrayArray3[local272][local190][local196] - 240;
								Static63.method1096(local133, 1, local190 * 128, local190 * 128, local196 * 128, local206 * 128 + 128, local499, local642);
								for (local652 = local202; local652 <= local272; local652++) {
									for (local670 = local196; local670 <= local206; local670++) {
										Static64.anIntArrayArrayArray9[local652][local190][local670] &= ~local32;
									}
								}
							}
						}
						if ((local127 & Static64.anIntArrayArrayArray9[local155][local190][local176]) != 0) {
							for (local196 = local190; local196 > 0 && (Static64.anIntArrayArrayArray9[local155][local196 - 1][local176] & local127) != 0; local196--) {
							}
							local206 = local190;
							local272 = local155;
							local202 = local155;
							while (local206 < 104 && (Static64.anIntArrayArrayArray9[local155][local206 + 1][local176] & local127) != 0) {
								local206++;
							}
							label401: while (local202 > 0) {
								for (local255 = local196; local255 <= local206; local255++) {
									if ((Static64.anIntArrayArrayArray9[local202 - 1][local255][local176] & local127) == 0) {
										break label401;
									}
								}
								local202--;
							}
							label390: while (local133 > local272) {
								for (local255 = local196; local255 <= local206; local255++) {
									if ((Static64.anIntArrayArrayArray9[local272 + 1][local255][local176] & local127) == 0) {
										break label390;
									}
								}
								local272++;
							}
							local255 = (local206 + 1 - local196) * ((local272 + 1) - local202);
							if (local255 >= 8) {
								local642 = Static51.anIntArrayArrayArray3[local202][local196][local176];
								local499 = Static51.anIntArrayArrayArray3[local272][local196][local176] - 240;
								Static63.method1096(local133, 2, local196 * 128, local206 * 128 + 128, local176 * 128, local176 * 128, local499, local642);
								for (local652 = local202; local652 <= local272; local652++) {
									for (local670 = local196; local670 <= local206; local670++) {
										Static64.anIntArrayArrayArray9[local652][local670][local176] &= ~local127;
									}
								}
							}
						}
						if ((local129 & Static64.anIntArrayArrayArray9[local155][local190][local176]) != 0) {
							local206 = local190;
							local196 = local190;
							for (local202 = local176; local202 > 0 && (local129 & Static64.anIntArrayArrayArray9[local155][local190][local202 - 1]) != 0; local202--) {
							}
							for (local272 = local176; local272 < 104 && (local129 & Static64.anIntArrayArrayArray9[local155][local190][local272 + 1]) != 0; local272++) {
							}
							label455: while (local196 > 0) {
								for (local255 = local202; local255 <= local272; local255++) {
									if ((Static64.anIntArrayArrayArray9[local155][local196 - 1][local255] & local129) == 0) {
										break label455;
									}
								}
								local196--;
							}
							label444: while (local206 < 104) {
								for (local255 = local202; local255 <= local272; local255++) {
									if ((local129 & Static64.anIntArrayArrayArray9[local155][local206 + 1][local255]) == 0) {
										break label444;
									}
								}
								local206++;
							}
							if ((local272 + 1 - local202) * (-local196 + local206 - -1) >= 4) {
								local255 = Static51.anIntArrayArrayArray3[local155][local196][local202];
								Static63.method1096(local133, 4, local196 * 128, local206 * 128 + 128, local202 * 128, local272 * 128 + 128, local255, local255);
								for (local495 = local196; local495 <= local206; local495++) {
									for (local499 = local202; local499 <= local272; local499++) {
										Static64.anIntArrayArrayArray9[local155][local495][local499] &= ~local129;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Z")
	public static boolean method475(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method476() {
		try {
			@Pc(11) Graphics local11 = Static105.aCanvas1.getGraphics();
			Static23.aClass7_25.method697(17, local11, 357);
		} catch (@Pc(19) Exception local19) {
			Static105.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!la;)V")
	public static void method478(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1_Sub1_Sub3 arg1) {
		Static2.method1233(arg1.anInt2474, arg0, arg1.anInt2452);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method479() {
		if (!Static5.aBoolean5) {
			return;
		}
		Static23.aClass7_25 = null;
		Static3.aClass5_Sub1_Sub10_Sub1_1 = null;
		Static93.aClass5_Sub1_Sub10_Sub1_22 = null;
		Static82.aClass5_Sub1_Sub10_Sub1_20 = null;
		Static4.anIntArray6 = null;
		Static61.aClass5_Sub1_Sub10_Sub1_15 = null;
		Static4.aClass5_Sub1_Sub10_Sub1_3 = null;
		Static10.aClass7_15 = null;
		Static36.aClass5_Sub1_Sub10_Sub1_10 = null;
		Static88.aClass7_63 = null;
		Static86.aClass7_89 = null;
		Static3.aClass7_2 = null;
		Static27.anIntArray93 = null;
		Static4.aClass5_Sub1_Sub10_Sub1_2 = null;
		Static99.anIntArray257 = null;
		Static90.aClass7_90 = null;
		Static88.aClass5_Sub1_Sub10_Sub1_21 = null;
		Static62.aClass7_49 = null;
		Static78.aClass7_31 = null;
		Static76.anIntArray233 = null;
		Static114.aClass5_Sub1_Sub10_Sub1Array9 = null;
		Static71.aClass7_54 = null;
		Static5.aBoolean5 = false;
		Static6.anIntArray10 = null;
		Static16.aClass7_22 = null;
		Static41.aClass5_Sub1_Sub10_Sub1_11 = null;
		Static8.aClass5_Sub1_Sub10_Sub1_4 = null;
		Static41.anIntArray122 = null;
		Static79.aClass5_Sub1_Sub10_Sub1_18 = null;
		Static98.aClass5_Sub1_Sub10_Sub1_17 = null;
		Static14.aClass7_20 = null;
		Static7.aClass7_14 = null;
		Static81.aClass5_Sub1_Sub10_Sub1_19 = null;
		Static99.aClass7_69 = null;
		Static42.aClass7_34 = null;
		aClass5_Sub1_Sub10_Sub1_8 = null;
		Static64.aClass7_76 = null;
		Static49.aClass5_Sub1_Sub10_Sub1_13 = null;
		Static101.aClass7_73 = null;
		Static69.anIntArray210 = null;
		Static77.aClass5_Sub1_Sub10_Sub1_16 = null;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	public static void method480() {
		aClass71_338 = null;
		anIntArrayArray7 = null;
		aClass71_339 = null;
		aClass71_341 = null;
		aClass5_Sub1_Sub10_Sub1_8 = null;
		anIntArray76 = null;
		aClass71_340 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	public static void method483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == Static112.anInt2660 && Static8.anInt286 == arg1 && (Static19.anInt644 == arg2 || !Static21.aBoolean28)) {
			return;
		}
		Static112.anInt2660 = arg3;
		Static8.anInt286 = arg1;
		Static19.anInt644 = arg2;
		if (!Static21.aBoolean28) {
			Static19.anInt644 = 0;
		}
		Static27.method571(25);
		Static5.method143(Static97.aClass71_1149, null, false);
		@Pc(41) int local41 = Static76.anInt1884;
		Static76.anInt1884 = (arg1 - 6) * 8;
		@Pc(52) int local52 = Static76.anInt1884 - local41;
		@Pc(54) int local54 = Static48.anInt1367;
		Static48.anInt1367 = (arg3 - 6) * 8;
		@Pc(64) int local64 = Static48.anInt1367 - local54;
		for (@Pc(70) int local70 = 0; local70 < 32768; local70++) {
			@Pc(76) Class5_Sub1_Sub1_Sub3_Sub1 local76 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local70];
			if (local76 != null) {
				for (@Pc(80) int local80 = 0; local80 < 10; local80++) {
					local76.anIntArray264[local80] -= local64;
					local76.anIntArray261[local80] -= local52;
				}
				local76.anInt2474 -= local64 * 128;
				local76.anInt2452 -= local52 * 128;
			}
		}
		for (@Pc(128) int local128 = 0; local128 < 2048; local128++) {
			@Pc(134) Class5_Sub1_Sub1_Sub3_Sub2 local134 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local128];
			if (local134 != null) {
				for (@Pc(138) int local138 = 0; local138 < 10; local138++) {
					local134.anIntArray264[local138] -= local64;
					local134.anIntArray261[local138] -= local52;
				}
				local134.anInt2452 -= local52 * 128;
				local134.anInt2474 -= local64 * 128;
			}
		}
		Static23.anInt728 = arg2;
		Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.method1678(false, arg4, arg0);
		@Pc(192) byte local192 = 104;
		@Pc(194) byte local194 = 1;
		@Pc(196) byte local196 = 0;
		@Pc(198) byte local198 = 104;
		@Pc(200) byte local200 = 1;
		if (local52 < 0) {
			local196 = 103;
			local198 = -1;
			local200 = -1;
		}
		@Pc(213) byte local213 = 0;
		if (local64 < 0) {
			local213 = 103;
			local194 = -1;
			local192 = -1;
		}
		for (@Pc(223) int local223 = local213; local223 != local192; local223 += local194) {
			for (@Pc(227) int local227 = local196; local227 != local198; local227 += local200) {
				@Pc(233) int local233 = local52 + local227;
				@Pc(237) int local237 = local64 + local223;
				for (@Pc(239) int local239 = 0; local239 < 4; local239++) {
					if (local237 >= 0 && local233 >= 0 && local237 < 104 && local233 < 104) {
						Static34.aClass52ArrayArrayArray1[local239][local223][local227] = Static34.aClass52ArrayArrayArray1[local239][local237][local233];
					} else {
						Static34.aClass52ArrayArrayArray1[local239][local223][local227] = null;
					}
				}
			}
		}
		for (@Pc(311) Class5_Sub6 local311 = (Class5_Sub6) Static2.aClass52_10.method1358(); local311 != null; local311 = (Class5_Sub6) Static2.aClass52_10.method1363()) {
			local311.anInt1587 -= local52;
			local311.anInt1580 -= local64;
			if (local311.anInt1580 < 0 || local311.anInt1587 < 0 || local311.anInt1580 >= 104 || local311.anInt1587 >= 104) {
				local311.method2002();
			}
		}
		if (Static41.anInt1068 != 0) {
			Static61.anInt1564 -= local52;
			Static41.anInt1068 -= local64;
		}
		Static101.anInt2385 = -1;
		Static57.anInt1480 = 0;
		Static26.aBoolean59 = false;
		Static109.aClass52_12.method1360();
		Static62.aClass52_6.method1360();
	}
}
