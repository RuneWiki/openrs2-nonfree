import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "(I)V")
	public static void method6895() {
		if (!Static537.aBoolean683) {
			return;
		}
		@Pc(11) Class357 local11 = Static226.method4160(Static590.anInt10293, Static135.anInt2564);
		if (local11 != null && local11.anObjectArray14 != null) {
			@Pc(20) Class2_Sub45 local20 = new Class2_Sub45();
			local20.aClass357_131 = local11;
			local20.anObjectArray2 = local11.anObjectArray14;
			Static518.method8031(local20);
		}
		Static537.aBoolean683 = false;
		Static113.anInt2045 = -1;
		Static188.anInt8300 = -1;
		if (local11 != null) {
			Static473.method7526(local11);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BII)Z")
	public static boolean method6896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static573.method8708(arg0, arg1) | (arg1 & 0x40000) != 0 || Static318.method5257(arg1, arg0);
	}

	@OriginalMember(owner = "client!oaa", name = "h", descriptor = "(I)V")
	public static void method6898() {
		if (Static543.anInt9483 > 1) {
			Static543.anInt9483--;
			Static301.anInt5476 = Static397.anInt11030;
		}
		if (Static597.aBoolean749) {
			Static597.aBoolean749 = false;
			Static175.method3431();
			return;
		}
		if (!Static183.aBoolean305) {
			Static332.method5480();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static95.method1631(); local27++) {
		}
		if (Static579.anInt10049 != 10) {
			return;
		}
		@Pc(49) Class2_Sub52 local49;
		@Pc(58) int local58;
		while (Static11.method157()) {
			local49 = Static311.method5098(Static409.aClass341_77, Static125.aClass179_1);
			local49.aClass2_Sub8_Sub2_2.method5170(0);
			local58 = local49.aClass2_Sub8_Sub2_2.anInt5725;
			Static327.method5408(local49.aClass2_Sub8_Sub2_2);
			local49.aClass2_Sub8_Sub2_2.method5217(local49.aClass2_Sub8_Sub2_2.anInt5725 - local58);
			Static38.method791(local49);
		}
		if (Static354.aClass2_Sub22_1 == null) {
			if (Static21.aLong13 <= Static99.method1701()) {
				Static354.aClass2_Sub22_1 = Static40.aClass188_1.method4912(Static524.aClass66_4.aString22);
			}
		} else if (Static354.aClass2_Sub22_1.anInt2415 != -1) {
			local49 = Static311.method5098(Static494.aClass341_86, Static125.aClass179_1);
			local49.aClass2_Sub8_Sub2_2.method5192(Static354.aClass2_Sub22_1.anInt2415);
			Static38.method791(local49);
			Static354.aClass2_Sub22_1 = null;
			Static21.aLong13 = Static99.method1701() + 30000L;
		}
		@Pc(127) Class2_Sub35 local127 = (Class2_Sub35) Static489.aClass271_50.method7177();
		@Pc(144) int local144;
		@Pc(168) int local168;
		@Pc(185) int local185;
		@Pc(233) int local233;
		@Pc(240) int local240;
		@Pc(251) int local251;
		@Pc(142) Class2_Sub52 local142;
		if (local127 != null || Static99.method1701() - 2000L > Static43.aLong243) {
			local142 = null;
			local144 = 0;
			for (@Pc(149) Class2_Sub35 local149 = (Class2_Sub35) Static588.aClass271_62.method7177(); local149 != null && (local142 == null || local142.aClass2_Sub8_Sub2_2.anInt5725 - local144 < 240); local149 = (Class2_Sub35) Static588.aClass271_62.method7175()) {
				local149.method9825();
				local168 = local149.method9185();
				if (local168 < -1) {
					local168 = -1;
				} else if (local168 > 65534) {
					local168 = 65534;
				}
				local185 = local149.method9186();
				if (local185 < -1) {
					local185 = -1;
				} else if (local185 > 65534) {
					local185 = 65534;
				}
				if (local185 != Static493.anInt8811 || Static334.anInt6089 != local168) {
					if (local142 == null) {
						local142 = Static311.method5098(Static336.aClass341_65, Static125.aClass179_1);
						local142.aClass2_Sub8_Sub2_2.method5170(0);
						local144 = local142.aClass2_Sub8_Sub2_2.anInt5725;
					}
					local233 = local185 - Static493.anInt8811;
					Static493.anInt8811 = local185;
					local240 = local168 - Static334.anInt6089;
					Static334.anInt6089 = local168;
					local251 = (int) ((local149.method9188() - Static43.aLong243) / 20L);
					if (local251 < 8 && local233 >= -32 && local233 <= 31 && local240 >= -32 && local240 <= 31) {
						local240 += 32;
						local233 += 32;
						local142.aClass2_Sub8_Sub2_2.method5192(local240 + (local233 << 6) + (local251 << 12));
					} else if (local251 < 32 && local233 >= -128 && local233 <= 127 && local240 >= -128 && local240 <= 127) {
						local240 += 128;
						local233 += 128;
						local142.aClass2_Sub8_Sub2_2.method5170(local251 + 128);
						local142.aClass2_Sub8_Sub2_2.method5192((local233 << 8) + local240);
					} else if (local251 >= 32) {
						local142.aClass2_Sub8_Sub2_2.method5192(local251 + 57344);
						if (local185 == 1 || local168 == -1) {
							local142.aClass2_Sub8_Sub2_2.method5194(Integer.MIN_VALUE);
						} else {
							local142.aClass2_Sub8_Sub2_2.method5194(local185 | local168 << 16);
						}
					} else {
						local142.aClass2_Sub8_Sub2_2.method5170(local251 + 192);
						if (local185 == 1 || local168 == -1) {
							local142.aClass2_Sub8_Sub2_2.method5194(Integer.MIN_VALUE);
						} else {
							local142.aClass2_Sub8_Sub2_2.method5194(local185 | local168 << 16);
						}
					}
					Static43.aLong243 = local149.method9188();
				}
			}
			if (local142 != null) {
				local142.aClass2_Sub8_Sub2_2.method5217(local142.aClass2_Sub8_Sub2_2.anInt5725 - local144);
				Static38.method791(local142);
			}
		}
		@Pc(444) int local444;
		if (local127 != null) {
			@Pc(430) long local430 = (local127.method9188() - Static148.aLong84) / 50L;
			Static148.aLong84 = local127.method9188();
			if (local430 > 32767L) {
				local430 = 32767L;
			}
			local444 = local127.method9185();
			if (local444 < 0) {
				local444 = 0;
			} else if (local444 > 65535) {
				local444 = 65535;
			}
			local168 = local127.method9186();
			if (local168 < 0) {
				local168 = 0;
			} else if (local168 > 65535) {
				local168 = 65535;
			}
			@Pc(480) byte local480 = 0;
			if (local127.method9190() == 2) {
				local480 = 1;
			}
			local233 = (int) local430;
			@Pc(499) Class2_Sub52 local499 = Static311.method5098(Static262.aClass341_55, Static125.aClass179_1);
			local499.aClass2_Sub8_Sub2_2.method5192(local233 | local480 << 15);
			local499.aClass2_Sub8_Sub2_2.method5188(local168 | local444 << 16);
			Static38.method791(local499);
		}
		@Pc(558) long local558;
		if (Static499.anInt8894 > 0) {
			local142 = Static311.method5098(Static62.aClass341_16, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5170(Static499.anInt8894 * 3);
			for (local144 = 0; local144 < Static499.anInt8894; local144++) {
				@Pc(549) Interface21 local549 = Static190.anInterface21Array1[local144];
				local558 = (local549.method5147() - Static406.aLong204) / 50L;
				Static406.aLong204 = local549.method5147();
				if (local558 > 65535L) {
					local558 = 65535L;
				}
				local142.aClass2_Sub8_Sub2_2.method5170(local549.method5149());
				local142.aClass2_Sub8_Sub2_2.method5192((int) local558);
			}
			Static38.method791(local142);
		}
		if (Static13.anInt8389 > 0) {
			Static13.anInt8389--;
		}
		if (Static561.aBoolean715 && Static13.anInt8389 <= 0) {
			Static561.aBoolean715 = false;
			Static13.anInt8389 = 20;
			local142 = Static311.method5098(Static547.aClass341_91, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5192((int) Static320.aFloat118 >> 3);
			local142.aClass2_Sub8_Sub2_2.method5205((int) Static278.aFloat108 >> 3);
			Static38.method791(local142);
		}
		if (Static494.aBoolean638 != Static105.aBoolean132) {
			Static105.aBoolean132 = Static494.aBoolean638;
			local142 = Static311.method5098(Static127.aClass341_32, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5170(Static494.aBoolean638 ? 1 : 0);
			Static38.method791(local142);
		}
		if (!Static388.aBoolean551) {
			local142 = Static311.method5098(Static55.aClass341_15, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5170(0);
			local144 = local142.aClass2_Sub8_Sub2_2.anInt5725;
			@Pc(700) Class2_Sub8 local700 = Static230.aClass2_Sub54_15.method9554();
			local142.aClass2_Sub8_Sub2_2.method5160(local700.lb, local700.anInt5725, 0);
			local142.aClass2_Sub8_Sub2_2.method5217(local142.aClass2_Sub8_Sub2_2.anInt5725 - local144);
			Static38.method791(local142);
			Static388.aBoolean551 = true;
		}
		if (Static193.aClass291ArrayArrayArray2 != null) {
			if (Static484.anInt8685 == 2) {
				Static218.method4049();
			} else if (Static484.anInt8685 == 3) {
				Static460.method9469();
			}
		}
		if (Static378.aBoolean541) {
			Static378.aBoolean541 = false;
		} else {
			Static24.aFloat3 /= 2.0F;
		}
		if (Static358.aBoolean520) {
			Static358.aBoolean520 = false;
		} else {
			Static584.aFloat89 /= 2.0F;
		}
		Static617.method9229();
		if (Static579.anInt10049 != 10) {
			return;
		}
		Static673.method9445();
		Static373.method6357();
		Static47.method981();
		Static10.anInt166++;
		if (Static10.anInt166 > 750) {
			Static175.method3431();
			return;
		}
		Static254.method4439();
		Static541.method8307();
		Static332.method5477();
		for (local58 = Static113.aClass282_1.method7368(true); local58 != -1; local58 = Static113.aClass282_1.method7368(false)) {
			Static415.method2398(local58);
			Static584.anIntArray209[Static115.anInt2100++ & 0x1F] = local58;
		}
		for (@Pc(817) Class2_Sub1_Sub5 local817 = Static27.method466(); local817 != null; local817 = Static27.method466()) {
			local444 = local817.method2488();
			local558 = local817.method2490();
			if (local444 == 1) {
				Static100.anIntArray75[(int) local558] = local817.anInt2680;
				Static25.aBoolean24 |= Static546.aBooleanArray56[(int) local558];
				Static515.anIntArray463[Static461.anInt8264++ & 0x1F] = (int) local558;
			} else if (local444 == 2) {
				Static576.aStringArray67[(int) local558] = local817.aString33;
				Static367.anIntArray330[Static438.anInt7964++ & 0x1F] = (int) local558;
			} else {
				@Pc(888) Class357 local888;
				if (local444 == 3) {
					local888 = Static647.method9532((int) local558);
					if (!local817.aString33.equals(local888.aString123)) {
						local888.aString123 = local817.aString33;
						Static473.method7526(local888);
					}
				} else {
					@Pc(931) int local931;
					if (local444 == 4) {
						local888 = Static647.method9532((int) local558);
						local240 = local817.anInt2680;
						local251 = local817.anInt2674;
						local931 = local817.anInt2679;
						if (local240 != local888.anInt10404 || local251 != local888.anInt10441 || local931 != local888.anInt10450) {
							local888.anInt10404 = local240;
							local888.anInt10450 = local931;
							local888.anInt10441 = local251;
							Static473.method7526(local888);
						}
					} else if (local444 == 5) {
						local888 = Static647.method9532((int) local558);
						if (local888.anInt10446 != local817.anInt2680 || local817.anInt2680 == -1) {
							local888.anInt10467 = 0;
							local888.anInt10408 = 1;
							local888.anInt10446 = local817.anInt2680;
							local888.anInt10475 = 0;
							@Pc(1406) Class178 local1406 = local888.anInt10446 == -1 ? null : Static354.aClass40_2.method1123(local888.anInt10446);
							if (local1406 != null) {
								Static364.method6183(local888.anInt10475, local1406);
							}
							Static473.method7526(local888);
						}
					} else if (local444 == 6) {
						local233 = local817.anInt2680;
						local240 = local233 >> 10 & 0x1F;
						local251 = local233 >> 5 & 0x1F;
						local931 = local233 & 0x1F;
						@Pc(943) int local943 = (local931 << 3) + (local251 << 11) + (local240 << 19);
						@Pc(948) Class357 local948 = Static647.method9532((int) local558);
						if (local948.anInt10411 != local943) {
							local948.anInt10411 = local943;
							Static473.method7526(local948);
						}
					} else if (local444 == 7) {
						local888 = Static647.method9532((int) local558);
						@Pc(1350) boolean local1350 = local817.anInt2680 == 1;
						if (local888.aBoolean762 != local1350) {
							local888.aBoolean762 = local1350;
							Static473.method7526(local888);
						}
					} else if (local444 == 8) {
						local888 = Static647.method9532((int) local558);
						if (local888.anInt10414 != local817.anInt2680 || local817.anInt2674 != local888.anInt10399 || local888.anInt10455 != local817.anInt2679) {
							local888.anInt10399 = local817.anInt2674;
							local888.anInt10414 = local817.anInt2680;
							local888.anInt10455 = local817.anInt2679;
							if (local888.anInt10396 != -1) {
								if (local888.anInt10480 > 0) {
									local888.anInt10455 = local888.anInt10455 * 32 / local888.anInt10480;
								} else if (local888.anInt10417 > 0) {
									local888.anInt10455 = local888.anInt10455 * 32 / local888.anInt10417;
								}
							}
							Static473.method7526(local888);
						}
					} else if (local444 == 9) {
						local888 = Static647.method9532((int) local558);
						if (local888.anInt10396 != local817.anInt2680 || local888.anInt10398 != local817.anInt2674) {
							local888.anInt10398 = local817.anInt2674;
							local888.anInt10396 = local817.anInt2680;
							Static473.method7526(local888);
						}
					} else if (local444 == 10) {
						local888 = Static647.method9532((int) local558);
						if (local888.anInt10445 != local817.anInt2680 || local888.anInt10422 != local817.anInt2674 || local817.anInt2679 != local888.anInt10469) {
							local888.anInt10422 = local817.anInt2674;
							local888.anInt10445 = local817.anInt2680;
							local888.anInt10469 = local817.anInt2679;
							Static473.method7526(local888);
						}
					} else if (local444 == 11) {
						local888 = Static647.method9532((int) local558);
						local888.anInt10407 = local888.anInt10391 = local817.anInt2674;
						local888.anInt10431 = local888.anInt10477 = local817.anInt2680;
						local888.aByte135 = 0;
						local888.aByte134 = 0;
						Static473.method7526(local888);
					} else if (local444 == 12) {
						local888 = Static647.method9532((int) local558);
						local240 = local817.anInt2680;
						if (local888 != null && local888.anInt10430 == 0) {
							if (local888.anInt10413 - local888.anInt10465 < local240) {
								local240 = local888.anInt10413 - local888.anInt10465;
							}
							if (local240 < 0) {
								local240 = 0;
							}
							if (local888.anInt10458 != local240) {
								local888.anInt10458 = local240;
								Static473.method7526(local888);
							}
						}
					} else if (local444 == 14) {
						local888 = Static647.method9532((int) local558);
						local888.anInt10459 = local817.anInt2680;
					} else if (local444 == 15) {
						Static587.anInt10248 = local817.anInt2680;
						Static472.anInt8440 = local817.anInt2674;
						Static191.aBoolean318 = true;
					} else if (local444 == 16) {
						local888 = Static647.method9532((int) local558);
						local888.anInt10397 = local817.anInt2680;
					} else if (local444 == 17) {
						local888 = Static647.method9532((int) local558);
						local888.anInt10439 = local817.anInt2680;
					} else if (local444 == 18) {
						local888 = Static647.method9532((int) local558);
						local240 = (int) (local558 >> 32);
						local888.method8986(local240, (short) local817.anInt2674, (short) local817.anInt2680);
					} else if (local444 == 19) {
						local888 = Static647.method9532((int) local558);
						local240 = (int) (local558 >> 32);
						local888.method8987((short) local817.anInt2680, local240, (short) local817.anInt2674);
					}
				}
			}
		}
		Static87.anInt1634++;
		if (Static481.anInt8660 != 0) {
			Static136.anInt2586 += 20;
			if (Static136.anInt2586 >= 400) {
				Static481.anInt8660 = 0;
			}
		}
		if (Static660.aClass357_159 != null) {
			Static541.anInt9470++;
			if (Static541.anInt9470 >= 15) {
				Static473.method7526(Static660.aClass357_159);
				Static660.aClass357_159 = null;
			}
		}
		Static634.aBoolean788 = false;
		Static527.aClass357_137 = null;
		Static95.aBoolean119 = false;
		Static395.aClass357_105 = null;
		Static76.method1365(-1, (Class357) null, -1);
		Static500.method7872(-1, (Class357) null, -1);
		if (!Static537.aBoolean683) {
			Static113.anInt2045 = -1;
		}
		Static579.method8748();
		Static397.anInt11030++;
		if (Static226.aBoolean360) {
			@Pc(1536) Class2_Sub52 local1536 = Static311.method5098(Static525.aClass341_88, Static125.aClass179_1);
			local1536.aClass2_Sub8_Sub2_2.method5188(Static230.anInt4628 << 14 | Static282.anInt5211 << 28 | Static673.anInt11039);
			Static38.method791(local1536);
			Static226.aBoolean360 = false;
		}
		while (true) {
			@Pc(1559) Class2_Sub45 local1559;
			@Pc(1572) Class357 local1572;
			@Pc(1564) Class357 local1564;
			do {
				local1559 = (Class2_Sub45) Static280.aClass271_27.method7172();
				if (local1559 == null) {
					while (true) {
						do {
							local1559 = (Class2_Sub45) Static165.aClass271_22.method7172();
							if (local1559 == null) {
								while (true) {
									do {
										local1559 = (Class2_Sub45) Static507.aClass271_51.method7172();
										if (local1559 == null) {
											if (Static527.aClass357_137 == null) {
												Static429.anInt7877 = 0;
											}
											if (Static267.aClass357_180 != null) {
												Static136.method2392();
											}
											if (Static31.anInt530 > 0 && Static202.aClass191_1.method8963(82) && Static202.aClass191_1.method8963(81) && Static511.anInt9099 != 0) {
												local444 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 - Static511.anInt9099;
												if (local444 < 0) {
													local444 = 0;
												} else if (local444 > 3) {
													local444 = 3;
												}
												Static26.method458(Static640.anInt11085 + Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0], local444, Static490.anInt8763 + Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0]);
											}
											Static584.method4097();
											for (local444 = 0; local444 < 5; local444++) {
												@Pc(1759) int local1759 = Static487.anIntArray440[local444]++;
											}
											if (Static25.aBoolean24 && Static99.method1701() - 60000L > Static339.aLong167) {
												Static394.method7234();
											}
											for (@Pc(1784) Class15_Sub2_Sub2 local1784 = (Class15_Sub2_Sub2) Static138.aClass60_4.method1547(); local1784 != null; local1784 = (Class15_Sub2_Sub2) Static138.aClass60_4.method1546()) {
												if ((long) local1784.anInt1181 < Static99.method1701() / 1000L - 5L) {
													if (local1784.aShort19 > 0) {
														Static159.method3207("", local1784.aString12 + Static205.aClass134_19.method3906(Static204.anInt8130), 5, "", "", 0);
													}
													if (local1784.aShort19 == 0) {
														Static159.method3207("", local1784.aString12 + Static205.aClass134_20.method3906(Static204.anInt8130), 5, "", "", 0);
													}
													local1784.method9741();
												}
											}
											Static483.anInt8680++;
											if (Static483.anInt8680 > 500) {
												Static483.anInt8680 = 0;
												local185 = (int) (Math.random() * 8.0D);
												if ((local185 & 0x2) == 2) {
													Static483.anInt8677 += Static631.anInt10921;
												}
												if ((local185 & 0x1) == 1) {
													Static209.anInt4333 += Static245.anInt4807;
												}
												if ((local185 & 0x4) == 4) {
													Static25.anInt454 += Static150.anInt2787;
												}
											}
											if (Static209.anInt4333 < -50) {
												Static245.anInt4807 = 2;
											}
											if (Static209.anInt4333 > 50) {
												Static245.anInt4807 = -2;
											}
											if (Static483.anInt8677 < -55) {
												Static631.anInt10921 = 2;
											}
											if (Static483.anInt8677 > 55) {
												Static631.anInt10921 = -2;
											}
											if (Static25.anInt454 < -40) {
												Static150.anInt2787 = 1;
											}
											if (Static25.anInt454 > 40) {
												Static150.anInt2787 = -1;
											}
											Static354.anInt6800++;
											if (Static354.anInt6800 > 500) {
												Static354.anInt6800 = 0;
												local185 = (int) (Math.random() * 8.0D);
												if ((local185 & 0x1) == 1) {
													Static275.anInt5119 += Static294.anInt5368;
												}
												if ((local185 & 0x2) == 2) {
													Static199.anInt4199 += Static456.anInt8173;
												}
											}
											if (Static275.anInt5119 < -60) {
												Static294.anInt5368 = 2;
											}
											if (Static199.anInt4199 < -20) {
												Static456.anInt8173 = 1;
											}
											if (Static275.anInt5119 > 60) {
												Static294.anInt5368 = -2;
											}
											Static312.anInt5632++;
											if (Static199.anInt4199 > 10) {
												Static456.anInt8173 = -1;
											}
											if (Static312.anInt5632 > 50) {
												@Pc(2011) Class2_Sub52 local2011 = Static311.method5098(Static536.aClass341_51, Static125.aClass179_1);
												Static38.method791(local2011);
											}
											if (Static475.aBoolean620) {
												Static312.method5105();
												Static475.aBoolean620 = false;
											}
											try {
												Static355.method6354();
												return;
											} catch (@Pc(2024) IOException local2024) {
												Static175.method3431();
												return;
											}
										}
										local1564 = local1559.aClass357_131;
										if (local1564.anInt10432 < 0) {
											break;
										}
										local1572 = Static647.method9532(local1564.anInt10449);
									} while (local1572 == null || local1572.aClass357Array2 == null || local1564.anInt10432 >= local1572.aClass357Array2.length || local1564 != local1572.aClass357Array2[local1564.anInt10432]);
									Static518.method8031(local1559);
								}
							}
							local1564 = local1559.aClass357_131;
							if (local1564.anInt10432 < 0) {
								break;
							}
							local1572 = Static647.method9532(local1564.anInt10449);
						} while (local1572 == null || local1572.aClass357Array2 == null || local1572.aClass357Array2.length <= local1564.anInt10432 || local1564 != local1572.aClass357Array2[local1564.anInt10432]);
						Static518.method8031(local1559);
					}
				}
				local1564 = local1559.aClass357_131;
				if (local1564.anInt10432 < 0) {
					break;
				}
				local1572 = Static647.method9532(local1564.anInt10449);
			} while (local1572 == null || local1572.aClass357Array2 == null || local1572.aClass357Array2.length <= local1564.anInt10432 || local1572.aClass357Array2[local1564.anInt10432] != local1564);
			Static518.method8031(local1559);
		}
	}
}
