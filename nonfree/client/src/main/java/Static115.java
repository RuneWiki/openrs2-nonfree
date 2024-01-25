import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "[I")
	public static int[] anIntArray262;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_47 = new Class211(50, 10);

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_69 = new Class48(28, 3);

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public static final int anInt2058 = 0;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Lclient!sl;")
	public static final Class213 aClass213_10 = new Class213("", 12);

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method1695() {
		Static222.anInt4507 = 0;
		Static76.anInt5658 = -1;
		Static190.anInt3337 = -1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)V")
	public static void method1697(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg0, 3);
		local8.method2998();
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
	public static void method1699() {
		if (Static186.anInt3265 > 0) {
			Static186.anInt3265--;
		}
		if (Static11.anInt3595 > 1) {
			Static11.anInt3595--;
			Static71.anInt1429 = Static105.anInt1853;
		}
		if (Static103.aBoolean155) {
			Static103.aBoolean155 = false;
			Static48.method744();
			return;
		}
		if (!Static65.aBoolean115) {
			Static32.method503();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static31.method495(); local38++) {
		}
		if (Static142.anInt2665 != 30) {
			return;
		}
		Static98.method1454(Static49.aClass48_126.method895(), Static209.aClass1_Sub33_Sub2_2);
		if (Static88.aClass1_Sub21_1 == null) {
			if (Static378.method5293() >= Static370.aLong196) {
				Static88.aClass1_Sub21_1 = Static352.aClass173_1.method3890(Static314.aString60);
			}
		} else if (Static88.aClass1_Sub21_1.anInt3209 != -1) {
			Static177.method1119(Static354.aClass48_203);
			Static209.aClass1_Sub33_Sub2_2.method5138(Static88.aClass1_Sub21_1.anInt3209);
			Static88.aClass1_Sub21_1 = null;
			Static370.aLong196 = Static378.method5293() + 30000L;
		}
		@Pc(113) int local113;
		@Pc(134) int local134;
		@Pc(152) int local152;
		@Pc(165) boolean local165;
		@Pc(210) int local210;
		@Pc(216) int local216;
		@Pc(228) int local228;
		if (Static379.aClass1_Sub13_1 != null || Static215.aLong118 < Static378.method5293() - 2000L) {
			@Pc(110) boolean local110 = false;
			local113 = Static209.aClass1_Sub33_Sub2_2.lb;
			for (@Pc(118) Class1_Sub13 local118 = (Class1_Sub13) Static109.aClass17_16.method202(); local118 != null && Static209.aClass1_Sub33_Sub2_2.lb - local113 < 240; local118 = (Class1_Sub13) Static109.aClass17_16.method207()) {
				local118.method5577();
				local134 = local118.method2554();
				if (local134 < 0) {
					local134 = 0;
				} else if (local134 > 65534) {
					local134 = 65534;
				}
				local152 = local118.method2559();
				if (local152 < 0) {
					local152 = 0;
				} else if (local152 > 65534) {
					local152 = 65534;
				}
				local165 = false;
				if (local118.method2554() == -1 && local118.method2559() == -1) {
					local165 = true;
					local134 = -1;
					local152 = -1;
				}
				if (Static380.anInt6142 != local152 || Static85.anInt1565 != local134) {
					if (!local110) {
						Static177.method1119(Static153.aClass48_94);
						Static209.aClass1_Sub33_Sub2_2.method5165(0);
						local110 = true;
						local113 = Static209.aClass1_Sub33_Sub2_2.lb;
					}
					local210 = local152 - Static380.anInt6142;
					Static380.anInt6142 = local152;
					local216 = local134 - Static85.anInt1565;
					Static85.anInt1565 = local134;
					local228 = (int) ((local118.method2557() - Static215.aLong118) / 20L);
					if (local228 < 8 && local210 >= -32 && local210 <= 31 && local216 >= -32 && local216 <= 31) {
						local216 += 32;
						local210 += 32;
						Static209.aClass1_Sub33_Sub2_2.method5138(local216 + (local210 << 6) + (local228 << 12));
					} else if (local228 < 32 && local210 >= -128 && local210 <= 127 && local216 >= -128 && local216 <= 127) {
						local216 += 128;
						Static209.aClass1_Sub33_Sub2_2.method5165(local228 + 128);
						local210 += 128;
						Static209.aClass1_Sub33_Sub2_2.method5138(local216 + (local210 << 8));
					} else if (local228 >= 32) {
						Static209.aClass1_Sub33_Sub2_2.method5138(local228 + 57344);
						if (local165) {
							Static209.aClass1_Sub33_Sub2_2.method5142(Integer.MIN_VALUE);
						} else {
							Static209.aClass1_Sub33_Sub2_2.method5142(local152 | local134 << 16);
						}
					} else {
						Static209.aClass1_Sub33_Sub2_2.method5165(local228 + 192);
						if (local165) {
							Static209.aClass1_Sub33_Sub2_2.method5142(Integer.MIN_VALUE);
						} else {
							Static209.aClass1_Sub33_Sub2_2.method5142(local134 << 16 | local152);
						}
					}
					Static215.aLong118 = local118.method2557();
				}
			}
			if (local110) {
				Static209.aClass1_Sub33_Sub2_2.method5149(Static209.aClass1_Sub33_Sub2_2.lb - local113);
			}
		}
		@Pc(398) int local398;
		@Pc(446) int local446;
		if (Static379.aClass1_Sub13_1 != null) {
			@Pc(382) long local382 = (Static379.aClass1_Sub13_1.method2557() - Static295.aLong167) / 50L;
			Static295.aLong167 = Static379.aClass1_Sub13_1.method2557();
			if (local382 > 32767L) {
				local382 = 32767L;
			}
			local398 = Static379.aClass1_Sub13_1.method2554();
			if (local398 < 0) {
				local398 = 0;
			} else if (local398 > 65535) {
				local398 = 65535;
			}
			local134 = Static379.aClass1_Sub13_1.method2559();
			if (local134 < 0) {
				local134 = 0;
			} else if (local134 > 65535) {
				local134 = 65535;
			}
			@Pc(436) byte local436 = 0;
			if (Static379.aClass1_Sub13_1.method2558() == 2) {
				local436 = 1;
			}
			local446 = (int) local382;
			Static177.method1119(Static32.aClass48_18);
			Static209.aClass1_Sub33_Sub2_2.method5170(local446 | local436 << 15);
			Static209.aClass1_Sub33_Sub2_2.method5173(local134 | local398 << 16);
		}
		@Pc(473) int local473;
		if (Static330.anInt5516 > 0) {
			local473 = 0;
			for (local113 = 0; local113 < Static330.anInt5516; local113++) {
				if (Static389.aClass69Array1[local113].method1260()) {
					local473++;
				}
			}
			if (local473 > 0) {
				Static177.method1119(Static355.aClass48_150);
				if (local473 > 75) {
					local473 = 75;
				}
				Static209.aClass1_Sub33_Sub2_2.method5165(local473 * 3);
				for (local398 = 0; local398 < Static330.anInt5516; local398++) {
					@Pc(523) Class69 local523 = Static389.aClass69Array1[local398];
					if (local523.method1260()) {
						@Pc(536) long local536 = (local523.method1262() - Static191.aLong105) / 50L;
						Static191.aLong105 = local523.method1262();
						if (local536 > 65535L) {
							local536 = 65535L;
						}
						Static209.aClass1_Sub33_Sub2_2.method5165(local523.method1266());
						Static209.aClass1_Sub33_Sub2_2.method5138((int) local536);
					}
				}
			}
		}
		if (Static293.anInt5051 > 0) {
			Static293.anInt5051--;
		}
		if (Static187.aBoolean292 && Static293.anInt5051 <= 0) {
			Static293.anInt5051 = 20;
			Static187.aBoolean292 = false;
			Static177.method1119(Static174.aClass48_108);
			Static209.aClass1_Sub33_Sub2_2.method5139((int) Static19.aFloat1 >> 3);
			Static209.aClass1_Sub33_Sub2_2.method5138((int) Static386.aFloat82 >> 3);
		}
		if (Static300.aBoolean485 && !Static153.aBoolean241) {
			Static153.aBoolean241 = true;
			Static177.method1119(Static28.aClass48_16);
			Static209.aClass1_Sub33_Sub2_2.method5165(1);
		}
		if (!Static300.aBoolean485 && Static153.aBoolean241) {
			Static153.aBoolean241 = false;
			Static177.method1119(Static28.aClass48_16);
			Static209.aClass1_Sub33_Sub2_2.method5165(0);
		}
		if (!Static247.aBoolean423) {
			Static177.method1119(Static25.aClass48_11);
			Static209.aClass1_Sub33_Sub2_2.method5165(0);
			local473 = Static209.aClass1_Sub33_Sub2_2.lb;
			@Pc(669) Class1_Sub33 local669 = Static188.aClass135_Sub1_1.method2748();
			Static209.aClass1_Sub33_Sub2_2.method5152(local669.lb, local669.aByteArray86);
			Static209.aClass1_Sub33_Sub2_2.method5149(Static209.aClass1_Sub33_Sub2_2.lb - local473);
			Static247.aBoolean423 = true;
		}
		if (Static25.aClass132ArrayArrayArray1 != null) {
			if (Static323.anInt5463 == 2) {
				Static164.method2421();
			} else if (Static323.anInt5463 == 3) {
				Static123.method4613();
			}
		}
		if (Static221.aBoolean370) {
			Static221.aBoolean370 = false;
		} else {
			Static37.aFloat2 /= 2.0F;
		}
		if (Static25.aBoolean36) {
			Static25.aBoolean36 = false;
		} else {
			Static356.aFloat22 /= 2.0F;
		}
		Static148.method2207();
		if (Static142.anInt2665 != 30) {
			return;
		}
		Static40.method625();
		Static8.method79();
		Static28.method478();
		Static135.method2025();
		Static140.anInt6076++;
		if (Static140.anInt6076 > 750) {
			Static48.method744();
			return;
		}
		Static151.method2294();
		Static39.method585();
		Static160.method2376();
		for (local473 = Static230.aClass72_3.method1334(true); local473 != -1; local473 = Static230.aClass72_3.method1334(false)) {
			Static278.method4110(local473);
			Static150.anIntArray328[Static345.anInt5668++ & 0x1F] = local473;
		}
		@Pc(831) Class117 local831;
		for (@Pc(789) Class1_Sub6_Sub11 local789 = Static90.method1353(); local789 != null; local789 = Static90.method1353()) {
			local398 = local789.method3002();
			local134 = local789.method2999();
			if (local398 == 1) {
				Static158.anIntArray322[local134] = local789.anInt3686;
				Static121.aBoolean177 |= Static105.aBooleanArray10[local134];
				Static130.anIntArray298[Static118.anInt2106++ & 0x1F] = local134;
			} else if (local398 == 2) {
				Static230.aStringArray83[local134] = local789.aString45;
				Static336.anIntArray647[Static323.anInt5475++ & 0x1F] = local134;
			} else if (local398 == 3) {
				local831 = Static13.method107(local134);
				if (!local789.aString45.equals(local831.aString30)) {
					local831.aString30 = local789.aString45;
					Static312.method4635(local831);
				}
			} else if (local398 == 4) {
				local831 = Static13.method107(local134);
				local446 = local789.anInt3686;
				local210 = local789.anInt3679;
				local216 = local789.anInt3676;
				if (local446 != local831.anInt3068 || local831.lb != local210 || local216 != local831.anInt3058) {
					local831.anInt3068 = local446;
					local831.anInt3058 = local216;
					local831.lb = local210;
					Static312.method4635(local831);
				}
			} else if (local398 == 5) {
				local831 = Static13.method107(local134);
				if (local789.anInt3686 != local831.anInt3088 || local789.anInt3686 == -1) {
					local831.anInt3044 = 0;
					local831.anInt3088 = local789.anInt3686;
					local831.anInt3057 = 1;
					local831.anInt3059 = 0;
					Static312.method4635(local831);
				}
			} else if (local398 == 6) {
				local152 = local789.anInt3686;
				local446 = local152 >> 10 & 0x1F;
				local210 = local152 >> 5 & 0x1F;
				local216 = local152 & 0x1F;
				local228 = (local210 << 11) + (local446 << 19) + (local216 << 3);
				@Pc(1247) Class117 local1247 = Static13.method107(local134);
				if (local228 != local1247.anInt3091) {
					local1247.anInt3091 = local228;
					Static312.method4635(local1247);
				}
			} else if (local398 == 7) {
				local831 = Static13.method107(local134);
				local165 = local789.anInt3686 == 1;
				if (local165 != local831.aBoolean263) {
					local831.aBoolean263 = local165;
					Static312.method4635(local831);
				}
			} else if (local398 == 8) {
				local831 = Static13.method107(local134);
				if (local831.anInt3036 != local789.anInt3686 || local831.anInt3109 != local789.anInt3679 || local789.anInt3676 != local831.anInt3067) {
					local831.anInt3036 = local789.anInt3686;
					local831.anInt3109 = local789.anInt3679;
					local831.anInt3067 = local789.anInt3676;
					if (local831.anInt3080 != -1) {
						if (local831.anInt3075 > 0) {
							local831.anInt3067 = local831.anInt3067 * 32 / local831.anInt3075;
						} else if (local831.anInt3100 > 0) {
							local831.anInt3067 = local831.anInt3067 * 32 / local831.anInt3100;
						}
					}
					Static312.method4635(local831);
				}
			} else if (local398 == 9) {
				local831 = Static13.method107(local134);
				if (local831.anInt3080 != local789.anInt3686 || local789.anInt3679 != local831.anInt3107) {
					local831.anInt3080 = local789.anInt3686;
					local831.anInt3107 = local789.anInt3679;
					Static312.method4635(local831);
				}
			} else if (local398 == 10) {
				local831 = Static13.method107(local134);
				if (local831.anInt3106 != local789.anInt3686 || local831.anInt3035 != local789.anInt3679 || local789.anInt3676 != local831.anInt3116) {
					local831.anInt3106 = local789.anInt3686;
					local831.anInt3035 = local789.anInt3679;
					local831.anInt3116 = local789.anInt3676;
					Static312.method4635(local831);
				}
			} else if (local398 == 11) {
				local831 = Static13.method107(local134);
				local831.anInt3104 = local831.anInt3087 = local789.anInt3679;
				local831.aByte41 = 0;
				local831.aByte40 = 0;
				local831.anInt3072 = local831.anInt3037 = local789.anInt3686;
				Static312.method4635(local831);
			} else if (local398 == 12) {
				local831 = Static13.method107(local134);
				local446 = local789.anInt3686;
				if (local831 != null && local831.anInt3108 == 0) {
					if (local446 > local831.anInt3078 - local831.anInt3071) {
						local446 = local831.anInt3078 - local831.anInt3071;
					}
					if (local446 < 0) {
						local446 = 0;
					}
					if (local446 != local831.anInt3089) {
						local831.anInt3089 = local446;
						Static312.method4635(local831);
					}
				}
			} else if (local398 == 14) {
				local831 = Static13.method107(local134);
				local831.anInt3055 = local789.anInt3686;
			} else if (local398 == 15) {
				Static46.aBoolean78 = true;
				Static76.anInt5658 = local789.anInt3679;
				Static190.anInt3337 = local789.anInt3686;
			} else if (local398 == 16) {
				local831 = Static13.method107(local134);
				local831.anInt3101 = local789.anInt3686;
			}
		}
		Static109.anInt1911++;
		if (Static6.anInt90 != 0) {
			Static90.anInt1653 += 20;
			if (Static90.anInt1653 >= 400) {
				Static6.anInt90 = 0;
			}
		}
		if (Static230.aClass117_18 != null) {
			Static297.anInt5089++;
			if (Static297.anInt5089 >= 15) {
				Static312.method4635(Static230.aClass117_18);
				Static230.aClass117_18 = null;
			}
		}
		Static334.aBoolean521 = false;
		Static56.aClass117_1 = null;
		Static192.aBoolean335 = false;
		Static129.aClass117_2 = null;
		Static97.method1418(-1, null, -1);
		Static393.method5571(-1, null, -1);
		Static198.method2853();
		Static105.anInt1853++;
		if (Static371.aBoolean238) {
			Static177.method1119(Static22.aClass48_135);
			Static209.aClass1_Sub33_Sub2_2.method5173(Static295.anInt5083 << 14 | Static366.anInt5881 << 28 | Static341.anInt5634);
			Static371.aBoolean238 = false;
		}
		while (true) {
			@Pc(1415) Class1_Sub39 local1415;
			@Pc(1420) Class117 local1420;
			do {
				local1415 = (Class1_Sub39) Static310.aClass17_64.method203();
				if (local1415 == null) {
					while (true) {
						do {
							local1415 = (Class1_Sub39) Static22.aClass17_35.method203();
							if (local1415 == null) {
								while (true) {
									do {
										local1415 = (Class1_Sub39) Static140.aClass17_67.method203();
										if (local1415 == null) {
											if (Static56.aClass117_1 == null) {
												Static355.anInt4355 = 0;
											}
											if (Static227.aClass117_14 != null) {
												Static334.method4795();
											}
											if (Static284.anInt4919 > 0 && Static264.aClass154_1.method3994(82) && Static264.aClass154_1.method3994(81) && Static180.anInt3208 != 0) {
												local398 = Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 - Static180.anInt3208;
												if (local398 < 0) {
													local398 = 0;
												} else if (local398 > 3) {
													local398 = 3;
												}
												Static325.method4730(Static256.anInt4410 + Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray296[0], local398, Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray295[0] + Static293.anInt5053);
											}
											Static107.method4993();
											for (local398 = 0; local398 < 5; local398++) {
												@Pc(1612) int local1612 = Static101.anIntArray230[local398]++;
											}
											if (Static121.aBoolean177 && Static378.method5293() - 60000L > Static104.aLong56) {
												Static251.method3883();
											}
											Static330.anInt5517++;
											if (Static330.anInt5517 > 500) {
												Static330.anInt5517 = 0;
												local152 = (int) (Math.random() * 8.0D);
												if ((local152 & 0x2) == 2) {
													Static8.anInt119 += Static310.anInt5280;
												}
												if ((local152 & 0x1) == 1) {
													Static319.anInt5425 += Static24.anInt386;
												}
												if ((local152 & 0x4) == 4) {
													Static284.anInt4918 += Static370.anInt6048;
												}
											}
											if (Static319.anInt5425 < -50) {
												Static24.anInt386 = 2;
											}
											if (Static8.anInt119 < -55) {
												Static310.anInt5280 = 2;
											}
											if (Static319.anInt5425 > 50) {
												Static24.anInt386 = -2;
											}
											if (Static284.anInt4918 < -40) {
												Static370.anInt6048 = 1;
											}
											if (Static8.anInt119 > 55) {
												Static310.anInt5280 = -2;
											}
											if (Static284.anInt4918 > 40) {
												Static370.anInt6048 = -1;
											}
											Static134.anInt2507++;
											if (Static134.anInt2507 > 500) {
												Static134.anInt2507 = 0;
												local152 = (int) (Math.random() * 8.0D);
												if ((local152 & 0x1) == 1) {
													Static246.anInt4136 += Static365.anInt5877;
												}
												if ((local152 & 0x2) == 2) {
													Static205.anInt3600 += Static229.anInt3857;
												}
											}
											if (Static246.anInt4136 < -60) {
												Static365.anInt5877 = 2;
											}
											if (Static205.anInt3600 < -20) {
												Static229.anInt3857 = 1;
											}
											if (Static246.anInt4136 > 60) {
												Static365.anInt5877 = -2;
											}
											if (Static205.anInt3600 > 10) {
												Static229.anInt3857 = -1;
											}
											Static30.anInt6417++;
											if (Static30.anInt6417 > 50) {
												Static177.method1119(Static181.aClass48_195);
											}
											if (Static207.aBoolean352) {
												Static341.method4851();
												Static207.aBoolean352 = false;
											}
											try {
												if (Static6.aClass130_1 != null && Static209.aClass1_Sub33_Sub2_2.lb > 0) {
													Static109.anInt1910 += Static209.aClass1_Sub33_Sub2_2.lb;
													Static6.aClass130_1.method2670(Static209.aClass1_Sub33_Sub2_2.lb, Static209.aClass1_Sub33_Sub2_2.aByteArray86);
													Static30.anInt6417 = 0;
													Static209.aClass1_Sub33_Sub2_2.lb = 0;
													return;
												}
												return;
											} catch (@Pc(1831) IOException local1831) {
												Static48.method744();
												return;
											}
										}
										local1420 = local1415.aClass117_16;
										if (local1420.anInt3043 < 0) {
											break;
										}
										local831 = Static13.method107(local1420.anInt3066);
									} while (local831 == null || local831.aClass117Array1 == null || local1420.anInt3043 >= local831.aClass117Array1.length || local1420 != local831.aClass117Array1[local1420.anInt3043]);
									Static387.method5496(local1415);
								}
							}
							local1420 = local1415.aClass117_16;
							if (local1420.anInt3043 < 0) {
								break;
							}
							local831 = Static13.method107(local1420.anInt3066);
						} while (local831 == null || local831.aClass117Array1 == null || local1420.anInt3043 >= local831.aClass117Array1.length || local831.aClass117Array1[local1420.anInt3043] != local1420);
						Static387.method5496(local1415);
					}
				}
				local1420 = local1415.aClass117_16;
				if (local1420.anInt3043 < 0) {
					break;
				}
				local831 = Static13.method107(local1420.anInt3066);
			} while (local831 == null || local831.aClass117Array1 == null || local1420.anInt3043 >= local831.aClass117Array1.length || local831.aClass117Array1[local1420.anInt3043] != local1420);
			Static387.method5496(local1415);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!il;IIII)V")
	public static void method1700(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt2859 == -1 && arg1.anIntArray341 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg1.anInt2861 * Static188.aClass135_Sub1_1.anInt3374 >> 8;
		if (arg1.anInt2863 < arg3) {
			local16 = arg3 - arg1.anInt2863;
		} else if (arg3 < arg1.anInt2854) {
			local16 = arg1.anInt2854 - arg3;
		}
		if (arg1.anInt2851 < arg4) {
			local16 += arg4 - arg1.anInt2851;
		} else if (arg4 < arg1.anInt2855) {
			local16 += arg1.anInt2855 - arg4;
		}
		if (arg1.anInt2849 == 0 || local16 - 64 > arg1.anInt2849 || Static188.aClass135_Sub1_1.anInt3374 == 0 || arg1.anInt2850 != arg0) {
			if (arg1.aClass1_Sub7_Sub2_2 != null) {
				Static366.aClass1_Sub7_Sub4_2.method4410(arg1.aClass1_Sub7_Sub2_2);
				arg1.aClass1_Sub7_Sub2_2 = null;
			}
			if (arg1.aClass1_Sub7_Sub2_3 != null) {
				Static366.aClass1_Sub7_Sub4_2.method4410(arg1.aClass1_Sub7_Sub2_3);
				arg1.aClass1_Sub7_Sub2_3 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(148) int local148 = local24 * (arg1.anInt2849 - local16) / arg1.anInt2849;
		if (arg1.aClass1_Sub7_Sub2_2 != null) {
			arg1.aClass1_Sub7_Sub2_2.method2252(local148);
		} else if (arg1.anInt2859 >= 0) {
			@Pc(167) Class159 local167 = Static403.method3166(Static134.aClass230_35, arg1.anInt2859, 0);
			if (local167 != null) {
				@Pc(174) Class1_Sub31_Sub1 local174 = local167.method3168().method5003(Static173.aClass195_1);
				@Pc(179) Class1_Sub7_Sub2 local179 = Static399.method2255(local174, local148);
				local179.method2238(-1);
				Static366.aClass1_Sub7_Sub4_2.method4413(local179);
				arg1.aClass1_Sub7_Sub2_2 = local179;
			}
		}
		if (arg1.aClass1_Sub7_Sub2_3 != null) {
			arg1.aClass1_Sub7_Sub2_3.method2252(local148);
			if (arg1.aClass1_Sub7_Sub2_3.method5576()) {
				return;
			}
			arg1.aClass1_Sub7_Sub2_3 = null;
		} else if (arg1.anIntArray341 != null && (arg1.anInt2857 -= arg2) <= 0) {
			@Pc(219) int local219 = (int) (Math.random() * (double) arg1.anIntArray341.length);
			@Pc(227) Class159 local227 = Static403.method3166(Static134.aClass230_35, arg1.anIntArray341[local219], 0);
			if (local227 != null) {
				@Pc(234) Class1_Sub31_Sub1 local234 = local227.method3168().method5003(Static173.aClass195_1);
				@Pc(239) Class1_Sub7_Sub2 local239 = Static399.method2255(local234, local148);
				local239.method2238(0);
				Static366.aClass1_Sub7_Sub4_2.method4413(local239);
				arg1.anInt2857 = (int) ((double) (arg1.anInt2852 - arg1.anInt2853) * Math.random()) + arg1.anInt2853;
				arg1.aClass1_Sub7_Sub2_3 = local239;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public static void method1701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass25_Sub4_2 != null) {
			local7.aClass25_Sub4_2 = null;
		}
	}
}
