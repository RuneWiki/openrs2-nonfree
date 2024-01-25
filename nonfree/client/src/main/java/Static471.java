import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "Lclient!ut;")
	public static Class344 aClass344_5;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	public static int anInt7543;

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public static void method6068() {
		if (Static593.anInt9634 > 1) {
			Static593.anInt9634--;
			Static181.anInt2687 = Static390.anInt6454;
		}
		if (Static559.aBoolean766) {
			Static559.aBoolean766 = false;
			Static454.method5907();
			return;
		}
		if (!Static572.aBoolean774) {
			Static519.method1522();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static533.method7004(); local27++) {
		}
		if (Static540.anInt8912 != 10) {
			return;
		}
		@Pc(49) Class2_Sub34 local49;
		@Pc(58) int local58;
		while (Static227.method2759()) {
			local49 = Static555.method7264(Static147.aClass154_27, Static551.aClass64_2);
			local49.aClass2_Sub7_Sub2_2.method4459(0);
			local58 = local49.aClass2_Sub7_Sub2_2.anInt5186;
			Static200.method2513(local49.aClass2_Sub7_Sub2_2);
			local49.aClass2_Sub7_Sub2_2.method4491(local49.aClass2_Sub7_Sub2_2.anInt5186 - local58);
			Static100.method1508(local49);
		}
		if (Static535.aClass2_Sub8_2 == null) {
			if (Static537.aLong247 <= Static362.method5133()) {
				Static535.aClass2_Sub8_2 = Static330.aClass209_2.method4381(Static489.aClass292_5.aString111);
			}
		} else if (Static535.aClass2_Sub8_2.anInt991 != -1) {
			local49 = Static555.method7264(Static368.aClass154_118, Static551.aClass64_2);
			local49.aClass2_Sub7_Sub2_2.method4511(Static535.aClass2_Sub8_2.anInt991);
			Static100.method1508(local49);
			Static535.aClass2_Sub8_2 = null;
			Static537.aLong247 = Static362.method5133() + 30000L;
		}
		@Pc(127) Class2_Sub29 local127 = (Class2_Sub29) Static359.aClass70_17.method1264();
		@Pc(140) int local140;
		@Pc(165) int local165;
		@Pc(184) int local184;
		@Pc(237) int local237;
		@Pc(244) int local244;
		@Pc(255) int local255;
		@Pc(138) Class2_Sub34 local138;
		if (local127 != null || Static312.aLong140 < Static362.method5133() - 2000L) {
			local138 = null;
			local140 = 0;
			for (@Pc(145) Class2_Sub29 local145 = (Class2_Sub29) Static484.aClass70_49.method1264(); local145 != null && (local138 == null || local138.aClass2_Sub7_Sub2_2.anInt5186 - local140 < 240); local145 = (Class2_Sub29) Static484.aClass70_49.method1261()) {
				local145.method7657();
				local165 = local145.method6293();
				if (local165 < -1) {
					local165 = -1;
				} else if (local165 > 65534) {
					local165 = 65534;
				}
				local184 = local145.method6294();
				if (local184 < -1) {
					local184 = -1;
				} else if (local184 > 65534) {
					local184 = 65534;
				}
				if (Static493.anInt7809 != local184 || local165 != Static257.anInt4277) {
					if (local138 == null) {
						local138 = Static555.method7264(Static522.aClass154_119, Static551.aClass64_2);
						local138.aClass2_Sub7_Sub2_2.method4459(0);
						local140 = local138.aClass2_Sub7_Sub2_2.anInt5186;
					}
					local237 = local184 - Static493.anInt7809;
					Static493.anInt7809 = local184;
					local244 = local165 - Static257.anInt4277;
					Static257.anInt4277 = local165;
					local255 = (int) ((local145.method6292() - Static312.aLong140) / 20L);
					if (local255 < 8 && local237 >= -32 && local237 <= 31 && local244 >= -32 && local244 <= 31) {
						local237 += 32;
						local244 += 32;
						local138.aClass2_Sub7_Sub2_2.method4511(local244 + (local255 << 12) + (local237 << 6));
					} else if (local255 < 32 && local237 >= -128 && local237 <= 127 && local244 >= -128 && local244 <= 127) {
						local244 += 128;
						local237 += 128;
						local138.aClass2_Sub7_Sub2_2.method4459(local255 + 128);
						local138.aClass2_Sub7_Sub2_2.method4511((local237 << 8) + local244);
					} else if (local255 < 32) {
						local138.aClass2_Sub7_Sub2_2.method4459(local255 + 192);
						if (local184 == 1 || local165 == -1) {
							local138.aClass2_Sub7_Sub2_2.method4495(Integer.MIN_VALUE);
						} else {
							local138.aClass2_Sub7_Sub2_2.method4495(local165 << 16 | local184);
						}
					} else {
						local138.aClass2_Sub7_Sub2_2.method4511(local255 + 57344);
						if (local184 == 1 || local165 == -1) {
							local138.aClass2_Sub7_Sub2_2.method4495(Integer.MIN_VALUE);
						} else {
							local138.aClass2_Sub7_Sub2_2.method4495(local165 << 16 | local184);
						}
					}
					Static312.aLong140 = local145.method6292();
				}
			}
			if (local138 != null) {
				local138.aClass2_Sub7_Sub2_2.method4491(local138.aClass2_Sub7_Sub2_2.anInt5186 - local140);
				Static100.method1508(local138);
			}
		}
		@Pc(446) int local446;
		if (local127 != null) {
			@Pc(432) long local432 = (local127.method6292() - Static172.aLong73) / 50L;
			Static172.aLong73 = local127.method6292();
			if (local432 > 32767L) {
				local432 = 32767L;
			}
			local446 = local127.method6293();
			if (local446 < 0) {
				local446 = 0;
			} else if (local446 > 65535) {
				local446 = 65535;
			}
			local165 = local127.method6294();
			if (local165 < 0) {
				local165 = 0;
			} else if (local165 > 65535) {
				local165 = 65535;
			}
			@Pc(482) byte local482 = 0;
			if (local127.method6295() == 2) {
				local482 = 1;
			}
			local237 = (int) local432;
			@Pc(501) Class2_Sub34 local501 = Static555.method7264(Static169.aClass154_31, Static551.aClass64_2);
			local501.aClass2_Sub7_Sub2_2.method4492(local482 << 15 | local237);
			local501.aClass2_Sub7_Sub2_2.method4520(local165 | local446 << 16);
			Static100.method1508(local501);
		}
		if (Static136.anInt2219 > 0) {
			local138 = Static555.method7264(Static407.aClass154_87, Static551.aClass64_2);
			local138.aClass2_Sub7_Sub2_2.method4459(Static136.anInt2219 * 3);
			for (local140 = 0; local140 < Static136.anInt2219; local140++) {
				@Pc(551) Interface24 local551 = Static66.anInterface24Array1[local140];
				@Pc(559) long local559 = (local551.method7250() - Static392.aLong175) / 50L;
				if (local559 > 65535L) {
					local559 = 65535L;
				}
				Static392.aLong175 = local551.method7250();
				local138.aClass2_Sub7_Sub2_2.method4459(local551.method7253());
				local138.aClass2_Sub7_Sub2_2.method4511((int) local559);
			}
			Static100.method1508(local138);
		}
		if (Static454.anInt7268 > 0) {
			Static454.anInt7268--;
		}
		if (Static122.aBoolean139 && Static454.anInt7268 <= 0) {
			Static454.anInt7268 = 20;
			Static122.aBoolean139 = false;
			local138 = Static555.method7264(Static404.aClass154_86, Static551.aClass64_2);
			local138.aClass2_Sub7_Sub2_2.method4511((int) Static541.aFloat128 >> 3);
			local138.aClass2_Sub7_Sub2_2.method4492((int) Static313.aFloat157 >> 3);
			Static100.method1508(local138);
		}
		if (Static565.aBoolean769 != Static287.aBoolean374) {
			Static565.aBoolean769 = Static287.aBoolean374;
			local138 = Static555.method7264(Static67.aClass154_11, Static551.aClass64_2);
			local138.aClass2_Sub7_Sub2_2.method4459(Static287.aBoolean374 ? 1 : 0);
			Static100.method1508(local138);
		}
		if (!Static237.aBoolean297) {
			local138 = Static555.method7264(Static386.aClass154_80, Static551.aClass64_2);
			local138.aClass2_Sub7_Sub2_2.method4459(0);
			local140 = local138.aClass2_Sub7_Sub2_2.anInt5186;
			@Pc(694) Class2_Sub7 local694 = new Class2_Sub7(Static202.method2528());
			Static257.aClass2_Sub35_Sub1_1.method6038(local694);
			local138.aClass2_Sub7_Sub2_2.method4498(local694.aByteArray52, local694.anInt5186);
			local138.aClass2_Sub7_Sub2_2.method4491(local138.aClass2_Sub7_Sub2_2.anInt5186 - local140);
			Static100.method1508(local138);
			Static237.aBoolean297 = true;
		}
		if (Static469.aClass228ArrayArrayArray6 != null) {
			if (Static489.anInt7763 == 2) {
				Static577.method7482();
			} else if (Static489.anInt7763 == 3) {
				Static317.method4598();
			}
		}
		if (Static189.aBoolean199) {
			Static189.aBoolean199 = false;
		} else {
			Static216.aFloat246 /= 2.0F;
		}
		if (Static570.aBoolean772) {
			Static570.aBoolean772 = false;
		} else {
			Static452.aFloat192 /= 2.0F;
		}
		Static150.method2077();
		if (Static540.anInt8912 != 10) {
			return;
		}
		Static390.method5391();
		Static344.method5012();
		Static116.method1700();
		Static210.anInt3053++;
		if (Static210.anInt3053 > 750) {
			Static454.method5907();
			return;
		}
		Static168.method2201();
		Static256.method3645();
		Static576.method7470();
		for (local58 = Static426.aClass160_1.method2783(true); local58 != -1; local58 = Static426.aClass160_1.method2783(false)) {
			Static335.method4787(local58);
			Static113.anIntArray170[Static134.anInt2158++ & 0x1F] = local58;
		}
		@Pc(959) Class273 local959;
		for (@Pc(823) Class2_Sub2_Sub18 local823 = Static191.method2416(); local823 != null; local823 = Static191.method2416()) {
			local446 = local823.method6223();
			local165 = local823.method6222();
			if (local446 == 1) {
				Static297.anIntArray342[local165] = local823.anInt7701;
				Static435.aBoolean574 |= Static143.aBooleanArray26[local165];
				Static330.anIntArray10[Static138.anInt2259++ & 0x1F] = local165;
			} else if (local446 == 2) {
				Static240.aStringArray45[local165] = local823.aString118;
				Static172.anIntArray217[Static458.anInt7367++ & 0x1F] = local165;
			} else if (local446 == 3) {
				local959 = Static594.method7731(local165);
				if (!local823.aString118.equals(local959.aString104)) {
					local959.aString104 = local823.aString118;
					Static155.method2111(local959);
				}
			} else if (local446 == 4) {
				local959 = Static594.method7731(local165);
				local237 = local823.anInt7701;
				local244 = local823.anInt7693;
				local255 = local823.anInt7695;
				if (local959.anInt6850 != local237 || local244 != local959.anInt6828 || local959.anInt6874 != local255) {
					local959.anInt6874 = local255;
					local959.anInt6850 = local237;
					local959.anInt6828 = local244;
					Static155.method2111(local959);
				}
			} else if (local446 == 5) {
				local959 = Static594.method7731(local165);
				if (local959.anInt6799 != local823.anInt7701 || local823.anInt7701 == -1) {
					local959.anInt6811 = 0;
					local959.anInt6833 = 1;
					local959.anInt6802 = 0;
					local959.anInt6799 = local823.anInt7701;
					@Pc(1313) Class148 local1313 = local959.anInt6799 == -1 ? null : Static117.aClass18_1.method296(local959.anInt6799);
					if (local1313 != null) {
						Static28.method382(local1313, local959.anInt6802);
					}
					Static155.method2111(local959);
				}
			} else if (local446 == 6) {
				local184 = local823.anInt7701;
				local237 = local184 >> 10 & 0x1F;
				local244 = local184 >> 5 & 0x1F;
				local255 = local184 & 0x1F;
				@Pc(924) int local924 = (local255 << 3) + (local237 << 19) + (local244 << 11);
				@Pc(928) Class273 local928 = Static594.method7731(local165);
				if (local924 != local928.anInt6854) {
					local928.anInt6854 = local924;
					Static155.method2111(local928);
				}
			} else if (local446 == 7) {
				local959 = Static594.method7731(local165);
				@Pc(1254) boolean local1254 = local823.anInt7701 == 1;
				if (local959.aBoolean553 != local1254) {
					local959.aBoolean553 = local1254;
					Static155.method2111(local959);
				}
			} else if (local446 == 8) {
				local959 = Static594.method7731(local165);
				if (local823.anInt7701 != local959.anInt6863 || local959.anInt6801 != local823.anInt7693 || local823.anInt7695 != local959.anInt6847) {
					local959.anInt6847 = local823.anInt7695;
					local959.anInt6863 = local823.anInt7701;
					local959.anInt6801 = local823.anInt7693;
					if (local959.anInt6805 != -1) {
						if (local959.anInt6849 > 0) {
							local959.anInt6847 = local959.anInt6847 * 32 / local959.anInt6849;
						} else if (local959.anInt6871 > 0) {
							local959.anInt6847 = local959.anInt6847 * 32 / local959.anInt6871;
						}
					}
					Static155.method2111(local959);
				}
			} else if (local446 == 9) {
				local959 = Static594.method7731(local165);
				if (local959.anInt6805 != local823.anInt7701 || local959.anInt6830 != local823.anInt7693) {
					local959.anInt6830 = local823.anInt7693;
					local959.anInt6805 = local823.anInt7701;
					Static155.method2111(local959);
				}
			} else if (local446 == 10) {
				local959 = Static594.method7731(local165);
				if (local959.anInt6798 != local823.anInt7701 || local959.anInt6838 != local823.anInt7693 || local823.anInt7695 != local959.anInt6846) {
					local959.anInt6798 = local823.anInt7701;
					local959.anInt6838 = local823.anInt7693;
					local959.anInt6846 = local823.anInt7695;
					Static155.method2111(local959);
				}
			} else if (local446 == 11) {
				local959 = Static594.method7731(local165);
				local959.aByte90 = 0;
				local959.aByte88 = 0;
				local959.anInt6855 = local959.anInt6836 = local823.anInt7693;
				local959.anInt6817 = local959.anInt6819 = local823.anInt7701;
				Static155.method2111(local959);
			} else if (local446 == 12) {
				local959 = Static594.method7731(local165);
				local237 = local823.anInt7701;
				if (local959 != null && local959.anInt6868 == 0) {
					if (local237 > local959.anInt6835 - local959.anInt6814) {
						local237 = local959.anInt6835 - local959.anInt6814;
					}
					if (local237 < 0) {
						local237 = 0;
					}
					if (local237 != local959.anInt6880) {
						local959.anInt6880 = local237;
						Static155.method2111(local959);
					}
				}
			} else if (local446 == 14) {
				local959 = Static594.method7731(local165);
				local959.anInt6842 = local823.anInt7701;
			} else if (local446 == 15) {
				Static143.aBoolean620 = true;
				Static143.anInt7433 = local823.anInt7693;
				Static484.anInt7716 = local823.anInt7701;
			} else if (local446 == 16) {
				local959 = Static594.method7731(local165);
				local959.anInt6860 = local823.anInt7701;
			}
		}
		Static534.anInt8792++;
		if (Static581.anInt9423 != 0) {
			Static206.anInt3015 += 20;
			if (Static206.anInt3015 >= 400) {
				Static581.anInt9423 = 0;
			}
		}
		if (Static354.aClass273_9 != null) {
			Static472.anInt7590++;
			if (Static472.anInt7590 >= 15) {
				Static155.method2111(Static354.aClass273_9);
				Static354.aClass273_9 = null;
			}
		}
		Static469.aBoolean646 = false;
		Static176.aClass273_5 = null;
		Static258.aBoolean319 = false;
		Static310.aClass273_7 = null;
		Static306.method4399(-1, null, -1);
		Static560.method7327(null, -1, -1);
		if (!Static355.aBoolean473) {
			Static409.anInt6677 = -1;
		}
		Static460.method5966();
		Static390.anInt6454++;
		if (Static213.aBoolean225) {
			@Pc(1456) Class2_Sub34 local1456 = Static555.method7264(Static552.aClass154_128, Static551.aClass64_2);
			local1456.aClass2_Sub7_Sub2_2.method4475(Static269.anInt4395 << 28 | Static1.anInt1 << 14 | Static279.anInt4790);
			Static100.method1508(local1456);
			Static213.aBoolean225 = false;
		}
		while (true) {
			@Pc(1479) Class2_Sub10 local1479;
			@Pc(1484) Class273 local1484;
			do {
				local1479 = (Class2_Sub10) Static153.aClass70_7.method1262();
				if (local1479 == null) {
					while (true) {
						do {
							local1479 = (Class2_Sub10) Static361.aClass70_40.method1262();
							if (local1479 == null) {
								while (true) {
									do {
										local1479 = (Class2_Sub10) Static213.aClass70_15.method1262();
										if (local1479 == null) {
											if (Static176.aClass273_5 == null) {
												Static294.anInt9620 = 0;
											}
											if (Class12_Sub2_Sub1_Sub3.lb != null) {
												Static158.method6598();
											}
											if (Static11.anInt294 > 0 && Static106.aClass150_3.method2632(82) && Static106.aClass150_3.method2632(81) && Static157.anInt2491 != 0) {
												local446 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 - Static157.anInt2491;
												if (local446 < 0) {
													local446 = 0;
												} else if (local446 > 3) {
													local446 = 3;
												}
												Static63.method1090(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0] + Static485.anInt7725, local446, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0] + Static310.anInt5129);
											}
											Static508.method6608();
											for (local446 = 0; local446 < 5; local446++) {
												@Pc(1687) int local1687 = Static540.anIntArray581[local446]++;
											}
											if (Static435.aBoolean574 && Static266.aLong115 < Static362.method5133() - 60000L) {
												Static25.method354();
											}
											for (@Pc(1712) Class12_Sub1_Sub2 local1712 = (Class12_Sub1_Sub2) Static235.aClass220_6.method4661(); local1712 != null; local1712 = (Class12_Sub1_Sub2) Static235.aClass220_6.method4660()) {
												if (Static362.method5133() / 1000L - 5L > (long) local1712.anInt6564) {
													if (local1712.aShort84 > 0) {
														Static316.method4596("", 5, local1712.aString93 + Static229.aClass159_21.method2776(Static261.anInt4297), "", "", 0);
													}
													if (local1712.aShort84 == 0) {
														Static316.method4596("", 5, local1712.aString93 + Static229.aClass159_22.method2776(Static261.anInt4297), "", "", 0);
													}
													local1712.method7630();
												}
											}
											Static3.anInt2070++;
											if (Static3.anInt2070 > 500) {
												Static3.anInt2070 = 0;
												local184 = (int) (Math.random() * 8.0D);
												if ((local184 & 0x2) == 2) {
													Static402.anInt6615 += Static60.anInt1081;
												}
												if ((local184 & 0x1) == 1) {
													Static157.anInt2490 += Static128.anInt2119;
												}
												if ((local184 & 0x4) == 4) {
													Static83.anInt1438 += Static223.anInt3254;
												}
											}
											if (Static157.anInt2490 < -50) {
												Static128.anInt2119 = 2;
											}
											if (Static402.anInt6615 < -55) {
												Static60.anInt1081 = 2;
											}
											if (Static157.anInt2490 > 50) {
												Static128.anInt2119 = -2;
											}
											if (Static83.anInt1438 < -40) {
												Static223.anInt3254 = 1;
											}
											if (Static402.anInt6615 > 55) {
												Static60.anInt1081 = -2;
											}
											Static300.anInt5023++;
											if (Static83.anInt1438 > 40) {
												Static223.anInt3254 = -1;
											}
											if (Static300.anInt5023 > 500) {
												Static300.anInt5023 = 0;
												local184 = (int) (Math.random() * 8.0D);
												if ((local184 & 0x2) == 2) {
													Static434.anInt6973 += Static107.anInt1859;
												}
												if ((local184 & 0x1) == 1) {
													Static525.anInt8446 += Static156.anInt2486;
												}
											}
											if (Static525.anInt8446 < -60) {
												Static156.anInt2486 = 2;
											}
											if (Static434.anInt6973 < -20) {
												Static107.anInt1859 = 1;
											}
											if (Static525.anInt8446 > 60) {
												Static156.anInt2486 = -2;
											}
											if (Static434.anInt6973 > 10) {
												Static107.anInt1859 = -1;
											}
											Static3.anInt2071++;
											if (Static3.anInt2071 > 50) {
												@Pc(1938) Class2_Sub34 local1938 = Static555.method7264(Static235.aClass154_50, Static551.aClass64_2);
												Static100.method1508(local1938);
											}
											if (Static53.aBoolean782) {
												Static85.method1260();
												Static53.aBoolean782 = false;
											}
											try {
												Static509.method6612();
												return;
											} catch (@Pc(1951) IOException local1951) {
												Static454.method5907();
												return;
											}
										}
										local1484 = local1479.aClass273_4;
										if (local1484.anInt6800 < 0) {
											break;
										}
										local959 = Static594.method7731(local1484.anInt6820);
									} while (local959 == null || local959.aClass273Array2 == null || local1484.anInt6800 >= local959.aClass273Array2.length || local1484 != local959.aClass273Array2[local1484.anInt6800]);
									Static566.method7398(local1479);
								}
							}
							local1484 = local1479.aClass273_4;
							if (local1484.anInt6800 < 0) {
								break;
							}
							local959 = Static594.method7731(local1484.anInt6820);
						} while (local959 == null || local959.aClass273Array2 == null || local1484.anInt6800 >= local959.aClass273Array2.length || local959.aClass273Array2[local1484.anInt6800] != local1484);
						Static566.method7398(local1479);
					}
				}
				local1484 = local1479.aClass273_4;
				if (local1484.anInt6800 < 0) {
					break;
				}
				local959 = Static594.method7731(local1484.anInt6820);
			} while (local959 == null || local959.aClass273Array2 == null || local1484.anInt6800 >= local959.aClass273Array2.length || local1484 != local959.aClass273Array2[local1484.anInt6800]);
			Static566.method7398(local1479);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIBLclient!qv;I)V")
	public static void method6071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub40 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt7190 == -1 && arg3.anIntArray485 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg3.anInt7175 * Static257.aClass2_Sub35_Sub1_1.anInt7512 >> 8;
		if (arg2 > arg3.anInt7187) {
			local16 = arg2 - arg3.anInt7187;
		} else if (arg3.anInt7178 > arg2) {
			local16 = arg3.anInt7178 - arg2;
		}
		if (arg3.anInt7188 < arg4) {
			local16 += arg4 - arg3.anInt7188;
		} else if (arg4 < arg3.anInt7184) {
			local16 += arg3.anInt7184 - arg4;
		}
		if (arg3.anInt7173 == 0 || arg3.anInt7173 < local16 - 256 || Static257.aClass2_Sub35_Sub1_1.anInt7512 == 0 || arg1 != arg3.anInt7186) {
			if (arg3.aClass2_Sub3_Sub3_2 != null) {
				Static246.aClass2_Sub3_Sub4_2.method6705(arg3.aClass2_Sub3_Sub3_2);
				arg3.aClass2_Sub13_Sub1_2 = null;
				arg3.aClass2_Sub37_2 = null;
				arg3.aClass2_Sub3_Sub3_2 = null;
			}
			if (arg3.aClass2_Sub3_Sub3_3 != null) {
				Static246.aClass2_Sub3_Sub4_2.method6705(arg3.aClass2_Sub3_Sub3_3);
				arg3.aClass2_Sub3_Sub3_3 = null;
				arg3.aClass2_Sub37_3 = null;
				arg3.aClass2_Sub13_Sub1_3 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(162) int local162 = local24 * (arg3.anInt7173 - local16) / arg3.anInt7173;
		Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777();
		@Pc(173) int local173 = 8192;
		@Pc(184) int local184 = (arg3.anInt7178 + arg3.anInt7187) / 2 - arg2;
		@Pc(194) int local194 = (arg3.anInt7188 + arg3.anInt7184) / 2 - arg4;
		@Pc(217) int local217;
		@Pc(239) int local239;
		if (local184 != 0 || local194 != 0) {
			local217 = -Static584.anInt9487 - (int) (Math.atan2((double) local184, (double) local194) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local217 > 8192) {
				local217 = 16384 - local217;
			}
			if (local16 <= 0) {
				local239 = 8192;
			} else if (local16 < 4096) {
				local239 = local16 * 8192 / 4096 + 8192;
			} else {
				local239 = 16384;
			}
			local173 = (16384 - local239 >> 1) + local217 * local239 / 8192;
		}
		@Pc(323) Class2_Sub3_Sub3 local323;
		if (arg3.aClass2_Sub3_Sub3_2 != null) {
			arg3.aClass2_Sub3_Sub3_2.method4314(local162);
			arg3.aClass2_Sub3_Sub3_2.method4319(local173);
		} else if (arg3.anInt7190 >= 0) {
			local217 = arg3.anInt7176 == 256 && arg3.anInt7185 == 256 ? 256 : Static241.method3436(arg3.anInt7185, arg3.anInt7176);
			if (arg3.aBoolean592) {
				if (arg3.aClass2_Sub37_2 == null) {
					arg3.aClass2_Sub37_2 = Static406.method5536(Static391.aClass229_109, arg3.anInt7190);
				}
				if (arg3.aClass2_Sub37_2 != null) {
					if (arg3.aClass2_Sub13_Sub1_2 == null) {
						arg3.aClass2_Sub13_Sub1_2 = arg3.aClass2_Sub37_2.method5535(new int[] { 22050 });
					}
					if (arg3.aClass2_Sub13_Sub1_2 != null) {
						local323 = Static599.method4313(arg3.aClass2_Sub13_Sub1_2, local217, local162 << 6, local173);
						local323.method4331(-1);
						Static246.aClass2_Sub3_Sub4_2.method6706(local323);
						arg3.aClass2_Sub3_Sub3_2 = local323;
					}
				}
			} else {
				@Pc(340) Class100 local340 = Static596.method1807(Static48.aClass229_11, arg3.anInt7190, 0);
				if (local340 != null) {
					@Pc(347) Class2_Sub13_Sub1 local347 = local340.method1806().method7647(Static398.aClass132_1);
					@Pc(355) Class2_Sub3_Sub3 local355 = Static599.method4313(local347, local217, local162 << 6, local173);
					local355.method4331(-1);
					Static246.aClass2_Sub3_Sub4_2.method6706(local355);
					arg3.aClass2_Sub3_Sub3_2 = local355;
				}
			}
		}
		if (arg3.aClass2_Sub3_Sub3_3 != null) {
			arg3.aClass2_Sub3_Sub3_3.method4314(local162);
			arg3.aClass2_Sub3_Sub3_3.method4319(local173);
			if (arg3.aClass2_Sub3_Sub3_3.method7656()) {
				return;
			}
			arg3.aClass2_Sub3_Sub3_3 = null;
			arg3.aClass2_Sub37_3 = null;
			arg3.aClass2_Sub13_Sub1_3 = null;
		} else if (arg3.anIntArray485 != null && (arg3.anInt7180 -= arg0) <= 0) {
			local217 = arg3.anInt7176 == 256 && arg3.anInt7185 == 256 ? 256 : arg3.anInt7185 + (int) (Math.random() * (double) (arg3.anInt7176 - arg3.anInt7185));
			if (!arg3.aBoolean591) {
				local239 = (int) (Math.random() * (double) arg3.anIntArray485.length);
				@Pc(435) Class100 local435 = Static596.method1807(Static48.aClass229_11, arg3.anIntArray485[local239], 0);
				if (local435 != null) {
					@Pc(442) Class2_Sub13_Sub1 local442 = local435.method1806().method7647(Static398.aClass132_1);
					@Pc(450) Class2_Sub3_Sub3 local450 = Static599.method4313(local442, local217, local162 << 6, local173);
					local450.method4331(0);
					Static246.aClass2_Sub3_Sub4_2.method6706(local450);
					arg3.aClass2_Sub3_Sub3_3 = local450;
					arg3.anInt7180 = arg3.anInt7192 + (int) (Math.random() * (double) (arg3.anInt7174 - arg3.anInt7192));
					return;
				}
				return;
			}
			if (arg3.aClass2_Sub37_3 == null) {
				local239 = (int) (Math.random() * (double) arg3.anIntArray485.length);
				arg3.aClass2_Sub37_3 = Static406.method5536(Static391.aClass229_109, arg3.anIntArray485[local239]);
			}
			if (arg3.aClass2_Sub37_3 != null) {
				if (arg3.aClass2_Sub13_Sub1_3 == null) {
					arg3.aClass2_Sub13_Sub1_3 = arg3.aClass2_Sub37_3.method5535(new int[] { 22050 });
				}
				if (arg3.aClass2_Sub13_Sub1_3 != null) {
					local323 = Static599.method4313(arg3.aClass2_Sub13_Sub1_3, local217, local162 << 6, local173);
					local323.method4331(0);
					Static246.aClass2_Sub3_Sub4_2.method6706(local323);
					arg3.anInt7180 = arg3.anInt7192 + (int) ((double) (arg3.anInt7174 - arg3.anInt7192) * Math.random());
					arg3.aClass2_Sub3_Sub3_3 = local323;
					return;
				}
			}
		}
	}
}
