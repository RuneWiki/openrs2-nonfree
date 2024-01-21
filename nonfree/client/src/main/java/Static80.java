import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!qa", name = "kd", descriptor = "Lclient!ja;")
	public static Class33 aClass33_23;

	@OriginalMember(owner = "client!qa", name = "Rc", descriptor = "I")
	public static int anInt2104 = 0;

	@OriginalMember(owner = "client!qa", name = "Sc", descriptor = "I")
	public static int anInt2105 = 0;

	@OriginalMember(owner = "client!qa", name = "fd", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1134 = Static23.method501("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!qa", name = "Tc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1131 = aClass42_1134;

	@OriginalMember(owner = "client!qa", name = "hd", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1135 = Static23.method501("Create a free account");

	@OriginalMember(owner = "client!qa", name = "Yc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1132 = aClass42_1135;

	@OriginalMember(owner = "client!qa", name = "Zc", descriptor = "I")
	public static int anInt2110 = 0;

	@OriginalMember(owner = "client!qa", name = "ad", descriptor = "I")
	public static final int anInt2111 = 5063219;

	@OriginalMember(owner = "client!qa", name = "cd", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1133 = Static23.method501("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!qa", name = "ed", descriptor = "Lclient!oa;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_2 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!qa", name = "ld", descriptor = "I")
	public static int anInt2116 = 0;

	@OriginalMember(owner = "client!qa", name = "md", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1136 = Static23.method501("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(II)Z")
	public static boolean method1478(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)Z")
	public static boolean method1479() {
		@Pc(5) Class46 local5 = Static107.aClass46_29;
		synchronized (Static107.aClass46_29) {
			if (Static50.anInt1738 == Static108.anInt2746) {
				return false;
			} else {
				Static31.anInt2249 = Static57.anIntArray401[Static108.anInt2746];
				Static87.anInt2274 = Static12.anIntArray35[Static108.anInt2746];
				Static108.anInt2746 = Static108.anInt2746 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public static void method1480() {
		aClass1_Sub8_Sub1_2 = null;
		aClass42_1136 = null;
		aClass42_1132 = null;
		aClass42_1131 = null;
		aClass33_23 = null;
		aClass42_1135 = null;
		aClass42_1134 = null;
		aClass42_1133 = null;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V")
	public static void method1481() {
		@Pc(5) Object local5 = Static61.anObject2;
		synchronized (Static61.anObject2) {
			if (Static63.anInt1531 == 0) {
				Static64.aClass60_3.method1807(new Class4(), 5);
			}
			Static63.anInt1531 = 600;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B[Lclient!ba;Lclient!ed;)V")
	public static void method1482(@OriginalArg(1) Class6[] arg0, @OriginalArg(2) Class20 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(30) int local30;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static61.aByteArrayArrayArray7[local7][local11][local15] & 0x1) == 1) {
						local30 = local7;
						if ((Static61.aByteArrayArrayArray7[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method117(local15, local11);
						}
					}
				}
			}
		}
		Static33.anInt843 += (int) (Math.random() * 5.0D) - 2;
		Static74.anInt1905 += (int) (Math.random() * 5.0D) - 2;
		if (Static33.anInt843 < -16) {
			Static33.anInt843 = -16;
		}
		if (Static33.anInt843 > 16) {
			Static33.anInt843 = 16;
		}
		if (Static74.anInt1905 < -8) {
			Static74.anInt1905 = -8;
		}
		if (Static74.anInt1905 > 8) {
			Static74.anInt1905 = 8;
		}
		@Pc(127) int local127;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(156) int local156;
		@Pc(177) int local177;
		@Pc(190) int local190;
		@Pc(196) int local196;
		@Pc(200) int local200;
		@Pc(206) int local206;
		@Pc(272) int local272;
		@Pc(256) int local256;
		@Pc(504) int local504;
		@Pc(508) int local508;
		@Pc(646) int local646;
		@Pc(656) int local656;
		@Pc(674) int local674;
		@Pc(684) int local684;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(117) byte[][] local117 = Static52.aByteArrayArrayArray6[local11];
			local30 = (int) Math.sqrt(5100.0D);
			local127 = local30 * 768 >> 8;
			for (local129 = 1; local129 < 103; local129++) {
				for (local133 = 1; local133 < 103; local133++) {
					local156 = Static10.anIntArrayArrayArray1[local11][local133 + 1][local129] - Static10.anIntArrayArrayArray1[local11][local133 - 1][local129];
					local177 = Static10.anIntArrayArrayArray1[local11][local133][local129 + 1] - Static10.anIntArrayArrayArray1[local11][local133][local129 - 1];
					local190 = (int) Math.sqrt((double) (local156 * local156 + local177 * local177 + 65536));
					local196 = (local156 << 8) / local190;
					local200 = 65536 / local190;
					local206 = (local177 << 8) / local190;
					local256 = (local117[local133 - 1][local129] >> 2) + (local117[local133 + 1][local129] >> 3) + (local117[local133][local129 + -1] >> 2) + (local117[local133][local129 + 1] >> 3) + (local117[local133][local129] >> 1);
					local272 = (local206 * -50 + local196 * -50 + local200 * -10) / local127 + 96;
					Static89.anIntArrayArray27[local133][local129] = local272 - local256;
				}
			}
			for (local133 = 0; local133 < 104; local133++) {
				Static43.anIntArray162[local133] = 0;
				Static21.anIntArray55[local133] = 0;
				Static12.anIntArray34[local133] = 0;
				Static46.anIntArray184[local133] = 0;
				Static51.anIntArray203[local133] = 0;
			}
			for (local156 = -5; local156 < 109; local156++) {
				for (local177 = 0; local177 < 104; local177++) {
					local190 = local156 + 5;
					@Pc(396) int local396;
					if (local190 >= 0 && local190 < 104) {
						local196 = Static69.aByteArrayArrayArray8[local11][local190][local177] & 0xFF;
						if (local196 > 0) {
							@Pc(360) Class1_Sub1_Sub3 local360 = Static68.method1170(local196 - 1);
							Static43.anIntArray162[local177] += local360.anInt338;
							Static21.anIntArray55[local177] += local360.anInt339;
							Static12.anIntArray34[local177] += local360.anInt329;
							Static46.anIntArray184[local177] += local360.anInt332;
							local396 = Static51.anIntArray203[local177]++;
						}
					}
					local196 = local156 - 5;
					if (local196 >= 0 && local196 < 104) {
						local200 = Static69.aByteArrayArrayArray8[local11][local196][local177] & 0xFF;
						if (local200 > 0) {
							@Pc(431) Class1_Sub1_Sub3 local431 = Static68.method1170(local200 - 1);
							Static43.anIntArray162[local177] -= local431.anInt338;
							Static21.anIntArray55[local177] -= local431.anInt339;
							Static12.anIntArray34[local177] -= local431.anInt329;
							Static46.anIntArray184[local177] -= local431.anInt332;
							local396 = Static51.anIntArray203[local177]--;
						}
					}
				}
				if (local156 >= 1 && local156 < 103) {
					local196 = 0;
					local190 = 0;
					local200 = 0;
					local206 = 0;
					local272 = 0;
					for (local256 = -5; local256 < 109; local256++) {
						local504 = local256 + 5;
						local508 = local256 - 5;
						if (local504 >= 0 && local504 < 104) {
							local196 += Static21.anIntArray55[local504];
							local190 += Static43.anIntArray162[local504];
							local206 += Static46.anIntArray184[local504];
							local272 += Static51.anIntArray203[local504];
							local200 += Static12.anIntArray34[local504];
						}
						if (local508 >= 0 && local508 < 104) {
							local206 -= Static46.anIntArray184[local508];
							local272 -= Static51.anIntArray203[local508];
							local190 -= Static43.anIntArray162[local508];
							local200 -= Static12.anIntArray34[local508];
							local196 -= Static21.anIntArray55[local508];
						}
						if (local256 >= 1 && local256 < 103 && (!Static75.aBoolean85 || (Static61.aByteArrayArrayArray7[0][local156][local256] & 0x2) != 0 || (Static61.aByteArrayArrayArray7[local11][local156][local256] & 0x10) == 0 && Static33.method577(local11, local156, local256) == Static21.anInt663)) {
							if (Static75.anInt1419 > local11) {
								Static75.anInt1419 = local11;
							}
							local646 = Static69.aByteArrayArrayArray8[local11][local156][local256] & 0xFF;
							local656 = Static20.aByteArrayArrayArray2[local11][local156][local256] & 0xFF;
							if (local646 > 0 || local656 > 0) {
								local674 = Static10.anIntArrayArrayArray1[local11][local156][local256];
								local684 = Static10.anIntArrayArrayArray1[local11][local156 + 1][local256];
								@Pc(696) int local696 = Static10.anIntArrayArrayArray1[local11][local156 + 1][local256 + 1];
								@Pc(702) int local702 = Static89.anIntArrayArray27[local156][local256];
								@Pc(712) int local712 = Static10.anIntArrayArrayArray1[local11][local156][local256 + 1];
								@Pc(720) int local720 = Static89.anIntArrayArray27[local156 + 1][local256];
								@Pc(730) int local730 = Static89.anIntArrayArray27[local156 + 1][local256 + 1];
								@Pc(738) int local738 = Static89.anIntArrayArray27[local156][local256 + 1];
								@Pc(740) int local740 = -1;
								@Pc(742) int local742 = -1;
								@Pc(750) int local750;
								@Pc(754) int local754;
								if (local646 > 0) {
									local750 = local190 * 256 / local206;
									local754 = local196 / local272;
									@Pc(758) int local758 = local200 / local272;
									local740 = Static51.method972(local754, local758, local750);
									@Pc(771) int local771 = local750 + Static74.anInt1905 & 0xFF;
									local758 += Static33.anInt843;
									if (local758 < 0) {
										local758 = 0;
									} else if (local758 > 255) {
										local758 = 255;
									}
									local742 = Static51.method972(local754, local758, local771);
								}
								if (local11 > 0) {
									@Pc(804) boolean local804 = true;
									if (local646 == 0 && Static28.aByteArrayArrayArray4[local11][local156][local256] != 0) {
										local804 = false;
									}
									if (local656 > 0 && !Static39.method304(local656 - 1).aBoolean23) {
										local804 = false;
									}
									if (local804 && local684 == local674 && local674 == local696 && local712 == local674) {
										Static52.anIntArrayArrayArray7[local11][local156][local256] |= 0x924;
									}
								}
								local750 = 0;
								if (local742 != -1) {
									local750 = Static41.anIntArray140[Static23.method503(local742, 96)];
								}
								if (local656 == 0) {
									arg1.method494(local11, local156, local256, 0, 0, -1, local674, local684, local696, local712, Static23.method503(local740, local702), Static23.method503(local740, local720), Static23.method503(local740, local730), Static23.method503(local740, local738), 0, 0, 0, 0, local750, 0);
								} else {
									local754 = Static28.aByteArrayArrayArray4[local11][local156][local256] + 1;
									@Pc(893) byte local893 = Static6.aByteArrayArrayArray1[local11][local156][local256];
									@Pc(899) Class1_Sub1_Sub4 local899 = Static39.method304(local656 - 1);
									@Pc(902) int local902 = local899.anInt549;
									@Pc(914) int local914;
									@Pc(912) int local912;
									@Pc(946) int local946;
									@Pc(951) int local951;
									if (local902 >= 0) {
										local912 = Static41.anInterface4_1.method263(local902);
										local914 = -1;
									} else if (local899.anInt551 == 16711935) {
										local912 = -2;
										local914 = -2;
										local902 = -1;
									} else {
										local914 = Static51.method972(local899.anInt541, local899.anInt550, local899.anInt536);
										local946 = Static74.anInt1905 + local899.anInt536 & 0xFF;
										local951 = local899.anInt550 + Static33.anInt843;
										if (local951 < 0) {
											local951 = 0;
										} else if (local951 > 255) {
											local951 = 255;
										}
										local912 = Static51.method972(local899.anInt541, local951, local946);
									}
									local946 = 0;
									if (local912 != -2) {
										local946 = Static41.anIntArray140[Static58.method1008(local912, 96)];
									}
									if (local899.anInt545 != -1) {
										local951 = local899.anInt552 + Static74.anInt1905 & 0xFF;
										@Pc(1005) int local1005 = Static33.anInt843 + local899.anInt542;
										if (local1005 < 0) {
											local1005 = 0;
										} else if (local1005 > 255) {
											local1005 = 255;
										}
										local912 = Static51.method972(local899.anInt546, local1005, local951);
										local946 = Static41.anIntArray140[Static58.method1008(local912, 96)];
									}
									arg1.method494(local11, local156, local256, local754, local893, local902, local674, local684, local696, local712, Static23.method503(local740, local702), Static23.method503(local740, local720), Static23.method503(local740, local730), Static23.method503(local740, local738), Static58.method1008(local914, local702), Static58.method1008(local914, local720), Static58.method1008(local914, local730), Static58.method1008(local914, local738), local750, local946);
								}
							}
						}
					}
				}
			}
			for (local177 = 1; local177 < 103; local177++) {
				for (local190 = 1; local190 < 103; local190++) {
					arg1.method465(local11, local190, local177, Static33.method577(local11, local190, local177));
				}
			}
			Static69.aByteArrayArrayArray8[local11] = null;
			Static20.aByteArrayArrayArray2[local11] = null;
			Static28.aByteArrayArrayArray4[local11] = null;
			Static6.aByteArrayArrayArray1[local11] = null;
			Static52.aByteArrayArrayArray6[local11] = null;
		}
		arg1.method486();
		for (local15 = 0; local15 < 104; local15++) {
			for (local127 = 0; local127 < 104; local127++) {
				if ((Static61.aByteArrayArrayArray7[1][local15][local127] & 0x2) == 2) {
					arg1.method457(local15, local127);
				}
			}
		}
		local127 = 1;
		local133 = 4;
		local129 = 2;
		for (local156 = 0; local156 < 4; local156++) {
			if (local156 > 0) {
				local127 <<= 0x3;
				local133 <<= 0x3;
				local129 <<= 0x3;
			}
			for (local177 = 0; local177 <= local156; local177++) {
				for (local190 = 0; local190 <= 104; local190++) {
					for (local196 = 0; local196 <= 104; local196++) {
						if ((Static52.anIntArrayArrayArray7[local177][local196][local190] & local127) != 0) {
							local272 = local177;
							local256 = local177;
							local200 = local190;
							for (local206 = local190; local206 < 104 && (Static52.anIntArrayArrayArray7[local177][local196][local206 + 1] & local127) != 0; local206++) {
							}
							while (local200 > 0 && (Static52.anIntArrayArrayArray7[local177][local196][local200 - 1] & local127) != 0) {
								local200--;
							}
							label347: while (local272 > 0) {
								for (local504 = local200; local504 <= local206; local504++) {
									if ((Static52.anIntArrayArrayArray7[local272 - 1][local196][local504] & local127) == 0) {
										break label347;
									}
								}
								local272--;
							}
							label336: while (local156 > local256) {
								for (local504 = local200; local504 <= local206; local504++) {
									if ((local127 & Static52.anIntArrayArrayArray7[local256 + 1][local196][local504]) == 0) {
										break label336;
									}
								}
								local256++;
							}
							local504 = (local206 + 1 - local200) * (local256 + 1 - local272);
							if (local504 >= 8) {
								local646 = Static10.anIntArrayArrayArray1[local256][local196][local200] - 240;
								local656 = Static10.anIntArrayArrayArray1[local272][local196][local200];
								Static22.method476(local156, 1, local196 * 128, local196 * 128, local200 * 128, local206 * 128 + 128, local646, local656);
								for (local674 = local272; local674 <= local256; local674++) {
									for (local684 = local200; local684 <= local206; local684++) {
										Static52.anIntArrayArrayArray7[local674][local196][local684] &= ~local127;
									}
								}
							}
						}
						if ((Static52.anIntArrayArrayArray7[local177][local196][local190] & local129) != 0) {
							for (local206 = local196; local206 < 104 && (Static52.anIntArrayArrayArray7[local177][local206 + 1][local190] & local129) != 0; local206++) {
							}
							local200 = local196;
							local272 = local177;
							local256 = local177;
							while (local200 > 0 && (local129 & Static52.anIntArrayArrayArray7[local177][local200 - 1][local190]) != 0) {
								local200--;
							}
							label400: while (local272 > 0) {
								for (local504 = local200; local504 <= local206; local504++) {
									if ((local129 & Static52.anIntArrayArrayArray7[local272 - 1][local504][local190]) == 0) {
										break label400;
									}
								}
								local272--;
							}
							label389: while (local156 > local256) {
								for (local504 = local200; local504 <= local206; local504++) {
									if ((Static52.anIntArrayArrayArray7[local256 + 1][local504][local190] & local129) == 0) {
										break label389;
									}
								}
								local256++;
							}
							local504 = (local206 + 1 - local200) * (local256 + 1 - local272);
							if (local504 >= 8) {
								local646 = Static10.anIntArrayArrayArray1[local256][local200][local190] - 240;
								local656 = Static10.anIntArrayArrayArray1[local272][local200][local190];
								Static22.method476(local156, 2, local200 * 128, local206 * 128 + 128, local190 * 128, local190 * 128, local646, local656);
								for (local674 = local272; local674 <= local256; local674++) {
									for (local684 = local200; local684 <= local206; local684++) {
										Static52.anIntArrayArrayArray7[local674][local684][local190] &= ~local129;
									}
								}
							}
						}
						if ((local133 & Static52.anIntArrayArrayArray7[local177][local196][local190]) != 0) {
							local200 = local196;
							for (local256 = local190; local256 < 104 && (Static52.anIntArrayArrayArray7[local177][local196][local256 + 1] & local133) != 0; local256++) {
							}
							for (local272 = local190; local272 > 0 && (local133 & Static52.anIntArrayArrayArray7[local177][local196][local272 - 1]) != 0; local272--) {
							}
							label455: while (local200 > 0) {
								for (local504 = local272; local504 <= local256; local504++) {
									if ((Static52.anIntArrayArrayArray7[local177][local200 - 1][local504] & local133) == 0) {
										break label455;
									}
								}
								local200--;
							}
							label443: for (local206 = local196; local206 < 104; local206++) {
								for (local504 = local272; local504 <= local256; local504++) {
									if ((Static52.anIntArrayArrayArray7[local177][local206 + 1][local504] & local133) == 0) {
										break label443;
									}
								}
							}
							if ((local256 + 1 - local272) * (local206 + 1 - local200) >= 4) {
								local504 = Static10.anIntArrayArrayArray1[local177][local200][local272];
								Static22.method476(local156, 4, local200 * 128, local206 * 128 + 128, local272 * 128, local256 * 128 + 128, local504, local504);
								for (local508 = local200; local508 <= local206; local508++) {
									for (local646 = local272; local646 <= local256; local646++) {
										Static52.anIntArrayArrayArray7[local177][local508][local646] &= ~local133;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mc;Lclient!mc;ZLclient!ja;)Lclient!j;")
	public static Class1_Sub1_Sub1_Sub3 method1483(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(13) int local13 = arg2.method1302(arg0);
		@Pc(19) int local19 = arg2.method1320(arg1, local13);
		return Static7.method160(arg2, local19, local13);
	}
}
