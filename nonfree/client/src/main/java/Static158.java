import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!r;")
	public static Class139 aClass139_2;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public static void method2544() {
		@Pc(4) int local4 = Static274.aByteArrayArray17.length;
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			if (Static274.aByteArrayArray17[local10] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static42.anInt972; local24++) {
					if (Static206.anIntArray329[local24] == Static13.anIntArray15[local10]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static206.anIntArray329[Static42.anInt972] = Static13.anIntArray15[local10];
					local22 = Static42.anInt972++;
				}
				@Pc(67) Class8_Sub2 local67 = new Class8_Sub2(Static274.aByteArrayArray17[local10]);
				@Pc(69) int local69 = 0;
				while (local67.anInt2955 < Static274.aByteArrayArray17[local10].length && local69 < 511) {
					@Pc(88) int local88 = local69++ << 6 | local22;
					@Pc(92) int local92 = local67.method2375();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = local106 + (Static13.anIntArray15[local10] & 0xFF) * 64 - Static130.anInt2601;
					@Pc(133) int local133 = (Static13.anIntArray15[local10] >> 8) * 64 + local102 - Static49.anInt1089;
					@Pc(139) Class173 local139 = Static253.method3795(local67.method2375());
					if (Static48.aClass36_Sub3_Sub2Array1[local88] == null && (local139.aByte23 & 0x1) > 0 && local96 == Static253.anInt4999 && local133 >= 0 && local133 + local139.anInt5633 < 104 && local119 >= 0 && local119 + local139.anInt5633 < 104) {
						Static48.aClass36_Sub3_Sub2Array1[local88] = new Class36_Sub3_Sub2();
						@Pc(186) Class36_Sub3_Sub2 local186 = Static48.aClass36_Sub3_Sub2Array1[local88];
						Static191.anIntArray285[Static135.anInt2729++] = local88;
						local186.anInt4119 = Static183.anInt3590;
						local186.method3117(local139);
						local186.method3115(local186.aClass173_1.anInt5633);
						local186.anInt4081 = local186.anInt4128 = Static92.anIntArray131[local186.aClass173_1.aByte22];
						local186.anInt4083 = local186.aClass173_1.anInt5634;
						local186.anInt4129 = local186.aClass173_1.anInt5606;
						if (local186.anInt4129 == 0) {
							local186.anInt4128 = 0;
						}
						local186.method3116(local133, local186.method3110(), local119, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)I")
	public static int method2545() {
		return Static87.anInt1862 == 0 ? 0 : Static246.anInterface5Array1[Static87.anInt1862].method4312();
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public static void method2549() {
		Static160.aClass61_27.method1378();
		Static222.aClass61_41.method1378();
		Static203.aClass61_37.method1378();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIBII[Lclient!tk;III)V")
	public static void method2551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class159[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static116.aBoolean188) {
			Static126.method1993(arg2, arg0, arg8, arg4);
		} else {
			Static103.method1680(arg2, arg0, arg8, arg4);
			Static96.method1541();
		}
		for (@Pc(26) int local26 = 0; local26 < arg5.length; local26++) {
			@Pc(34) Class159 local34 = arg5[local26];
			if (local34 != null && (local34.anInt5116 == arg3 || arg3 == -1412584499 && Static201.aClass159_15 == local34)) {
				@Pc(60) int local60;
				if (arg6 == -1) {
					Static78.anIntArray113[Static235.anInt4759] = local34.anInt5208 + arg7;
					Static295.anIntArray277[Static235.anInt4759] = local34.anInt5198 + arg1;
					Static57.anIntArray84[Static235.anInt4759] = local34.anInt5123;
					Static250.anIntArray374[Static235.anInt4759] = local34.anInt5121;
					local60 = Static235.anInt4759++;
				} else {
					local60 = arg6;
				}
				local34.anInt5180 = Static183.anInt3590;
				local34.anInt5202 = local60;
				if (!local34.aBoolean423 || !Static42.method663(local34)) {
					if (local34.anInt5188 > 0) {
						Static23.method410(local34);
					}
					@Pc(119) int local119 = local34.anInt5208 + arg7;
					@Pc(122) int local122 = local34.anInt5178;
					@Pc(127) int local127 = arg1 + local34.anInt5198;
					if (Static104.aBoolean169 && (Static42.method668(local34).anInt4411 != 0 || local34.anInt5197 == 0) && local122 > 127) {
						local122 = 127;
					}
					@Pc(180) int local180;
					@Pc(218) int local218;
					if (local34 == Static201.aClass159_15) {
						if (arg3 != -1412584499 && !local34.aBoolean417) {
							Static248.anInt4909 = arg1;
							Static292.aClass159Array2 = arg5;
							Static283.anInt5554 = arg7;
							continue;
						}
						if (!local34.aBoolean417) {
							local122 = 128;
						}
						if (Static246.aBoolean393 && Static20.aBoolean36) {
							local180 = Static182.anInt3572;
							local180 -= Static16.anInt3521;
							if (Static199.anInt4028 > local180) {
								local180 = Static199.anInt4028;
							}
							if (local180 + local34.anInt5123 > Static153.aClass159_12.anInt5123 + Static199.anInt4028) {
								local180 = Static153.aClass159_12.anInt5123 + Static199.anInt4028 - local34.anInt5123;
							}
							local119 = local180;
							local218 = Static106.anInt2198;
							local218 -= Static204.anInt4224;
							if (Static13.anInt360 > local218) {
								local218 = Static13.anInt360;
							}
							if (local218 + local34.anInt5121 > Static153.aClass159_12.anInt5121 + Static13.anInt360) {
								local218 = Static153.aClass159_12.anInt5121 + Static13.anInt360 - local34.anInt5121;
							}
							local127 = local218;
						}
					}
					@Pc(265) int local265;
					@Pc(263) int local263;
					@Pc(272) int local272;
					@Pc(289) int local289;
					if (local34.anInt5197 == 2) {
						local180 = arg2;
						local218 = arg0;
						local263 = arg4;
						local265 = arg8;
					} else {
						local272 = local34.anInt5123 + local119;
						local180 = local119 > arg2 ? local119 : arg2;
						local289 = local127 + local34.anInt5121;
						local218 = local127 <= arg0 ? arg0 : local127;
						if (local34.anInt5197 == 9) {
							local289++;
							local272++;
						}
						local263 = arg4 > local289 ? local289 : arg4;
						local265 = arg8 <= local272 ? arg8 : local272;
					}
					if (!local34.aBoolean423 || local265 > local180 && local218 < local263) {
						@Pc(462) int local462;
						@Pc(496) int local496;
						@Pc(500) int local500;
						@Pc(519) int local519;
						@Pc(537) int local537;
						@Pc(564) int local564;
						@Pc(553) int local553;
						@Pc(580) int local580;
						if (local34.anInt5188 != 0) {
							if (local34.anInt5188 == 1337 || local34.anInt5188 == 1403) {
								Static224.aClass159_16 = local34;
								Static293.anInt5687 = local127;
								Static192.anInt3876 = local119;
								Static145.method2288(local34.anInt5123, local127, local34.anInt5188 == 1403, local119, local34.anInt5121);
								Static128.aBooleanArray7[local60] = true;
								if (Static116.aBoolean188) {
									Static126.method1993(arg2, arg0, arg8, arg4);
								} else {
									Static103.method1680(arg2, arg0, arg8, arg4);
								}
								continue;
							}
							if (local34.anInt5188 == 1338) {
								if (!local34.method3878()) {
									continue;
								}
								Static20.method365(local127, local34, local119, local60);
								if (Static116.aBoolean188) {
									Static126.method1993(arg2, arg0, arg8, arg4);
								} else {
									Static103.method1680(arg2, arg0, arg8, arg4);
								}
								if (Static242.anInt4842 != 0 && Static242.anInt4842 != 3 || Static147.aBoolean246 || local180 > Static127.anInt2559 || local218 > Static229.anInt4666 || Static127.anInt2559 >= local265 || local263 <= Static229.anInt4666) {
									continue;
								}
								local272 = Static127.anInt2559 - local119;
								local289 = Static229.anInt4666 - local127;
								local462 = local34.anIntArray410[local289];
								if (local272 < local462 || local272 > local34.anIntArray409[local289] + local462) {
									continue;
								}
								local272 -= local34.anInt5123 / 2;
								local496 = (int) Static82.aFloat20 + Static121.anInt2437 & 0x7FF;
								local500 = Class68.anIntArray137[local496];
								local500 = (Static2.anInt12 + 256) * local500 >> 8;
								local289 -= local34.anInt5121 / 2;
								local519 = Class68.anIntArray139[local496];
								local519 = (Static2.anInt12 + 256) * local519 >> 8;
								local537 = local272 * local519 + local289 * local500 >> 11;
								local553 = Static21.aClass36_Sub3_Sub1_1.anInt4117 + local537 + 64 - Static21.aClass36_Sub3_Sub1_1.method3110() * 64 >> 7;
								local564 = local289 * local519 - local500 * local272 >> 11;
								local580 = Static21.aClass36_Sub3_Sub1_1.anInt4118 - local564 - (Static21.aClass36_Sub3_Sub1_1.method3110() + -1) * 64 >> 7;
								if (Static215.aBoolean357 && (Static234.anInt4722 & 0x40) != 0) {
									@Pc(615) Class159 local615 = Static260.method3916(Static132.anInt2621, Static106.anInt2200);
									if (local615 == null) {
										Static184.method2848();
									} else {
										Static28.method477(local553, Static47.aString39, local580, " ->", Static57.anInt1261, 1L, (short) 58);
									}
									continue;
								}
								if (Static198.anInt3914 == 1) {
									Static28.method477(local553, Static48.aString40, local580, "", -1, 1L, (short) 45);
								}
								Static28.method477(local553, Static30.aString30, local580, "", -1, 1L, (short) 31);
								continue;
							}
							if (local34.anInt5188 == 1339) {
								if (local34.method3878()) {
									Static41.method623(local60, local127, local34, local119);
									if (Static116.aBoolean188) {
										Static126.method1993(arg2, arg0, arg8, arg4);
									} else {
										Static103.method1680(arg2, arg0, arg8, arg4);
									}
								}
								continue;
							}
							if (local34.anInt5188 == 1400) {
								Static12.method212(local127, local34.anInt5123, local34.anInt5121, local119);
								Static128.aBooleanArray7[local60] = true;
								Static44.aBooleanArray3[local60] = true;
								if (Static116.aBoolean188) {
									Static126.method1993(arg2, arg0, arg8, arg4);
								} else {
									Static103.method1680(arg2, arg0, arg8, arg4);
								}
								continue;
							}
							if (local34.anInt5188 == 1401) {
								Static22.method405(local34.anInt5123, local34.anInt5121, local127, local119);
								Static128.aBooleanArray7[local60] = true;
								Static44.aBooleanArray3[local60] = true;
								if (Static116.aBoolean188) {
									Static126.method1993(arg2, arg0, arg8, arg4);
								} else {
									Static103.method1680(arg2, arg0, arg8, arg4);
								}
								continue;
							}
							if (local34.anInt5188 == 1402) {
								if (!Static116.aBoolean188) {
									Static108.method1773(local127, local119);
									Static128.aBooleanArray7[local60] = true;
									Static44.aBooleanArray3[local60] = true;
								}
								continue;
							}
							if (local34.anInt5188 == 1405) {
								if (!Static216.aBoolean360) {
									continue;
								}
								local272 = local34.anInt5123 + local119;
								local289 = local127 + 15;
								Static247.aClass8_Sub1_Sub5_5.method2013("Fps:" + Static222.anInt4576, local272, local289, 16776960, -1);
								@Pc(795) Runtime local795 = Runtime.getRuntime();
								local500 = 16776960;
								local496 = (int) ((local795.totalMemory() - local795.freeMemory()) / 1024L);
								if (local496 > 65536) {
									local500 = 16711680;
								}
								local289 += 15;
								Static247.aClass8_Sub1_Sub5_5.method2013("Mem:" + local496 + "k", local272, local289, local500, -1);
								local289 += 15;
								if (Static116.aBoolean188) {
									local519 = (Static166.anInt3351 + Static166.anInt3352 + Static166.anInt3353) / 1024;
									local500 = 16776960;
									if (local519 > 65536) {
										local500 = 16711680;
									}
									Static247.aClass8_Sub1_Sub5_5.method2013("Card:" + local519 + "k", local272, local289, local500, -1);
									local289 += 15;
								}
								local519 = 0;
								local564 = 0;
								local537 = 0;
								for (local553 = 0; local553 < 29; local553++) {
									local519 += Static83.aClass46_Sub1Array1[local553].method973();
									local537 += Static83.aClass46_Sub1Array1[local553].method984();
									local564 += Static83.aClass46_Sub1Array1[local553].method986();
								}
								local553 = local564 * 100 / local519;
								local580 = local537 * 10000 / local519;
								@Pc(939) String local939 = "Cache:" + Static133.method2172(true, 2, 0, (long) local580) + "% (" + local553 + "%)";
								Static276.aClass8_Sub1_Sub5_4.method2013(local939, local272, local289, 16776960, -1);
								local289 += 12;
								Static128.aBooleanArray7[local60] = true;
								Static44.aBooleanArray3[local60] = true;
								continue;
							}
							if (local34.anInt5188 == 1406) {
								Static113.anInt2317 = local127;
								Static178.anInt3508 = local119;
								Static15.aClass159_1 = local34;
								continue;
							}
						}
						if (!Static147.aBoolean246) {
							if (local34.anInt5197 == 0 && local34.aBoolean425 && Static127.anInt2559 >= local180 && Static229.anInt4666 >= local218 && Static127.anInt2559 < local265 && Static229.anInt4666 < local263 && !Static104.aBoolean169) {
								Static204.aShortArray34[0] = 1007;
								Static65.anIntArray476[0] = Static9.anInt85;
								Static57.aStringArray19[0] = Static86.aString69;
								Static185.anInt3679 = 1;
								Static161.aStringArray47[0] = "";
							}
							if (local180 <= Static127.anInt2559 && Static229.anInt4666 >= local218 && local265 > Static127.anInt2559 && Static229.anInt4666 < local263) {
								Static35.method554(Static229.anInt4666 - local127, local34, Static127.anInt2559 - local119);
							}
						}
						if (local34.anInt5197 == 0) {
							if (!local34.aBoolean423 && Static42.method663(local34) && Static164.aClass159_13 != local34) {
								continue;
							}
							if (!local34.aBoolean423) {
								if (local34.anInt5207 - local34.anInt5121 < local34.anInt5176) {
									local34.anInt5176 = local34.anInt5207 - local34.anInt5121;
								}
								if (local34.anInt5176 < 0) {
									local34.anInt5176 = 0;
								}
							}
							if (Static116.aBoolean188 && local34.anInt5188 == 1407) {
								Static154.method2456(local119, local127, local34.anInt5123, local34.anInt5121);
							}
							method2551(local218, local127 - local34.anInt5176, local180, local34.anInt5199, local263, arg5, local60, local119 - local34.anInt5128, local265);
							if (local34.aClass159Array1 != null) {
								method2551(local218, local127 - local34.anInt5176, local180, local34.anInt5199, local263, local34.aClass159Array1, local60, local119 - local34.anInt5128, local265);
							}
							@Pc(1177) Class8_Sub32 local1177 = (Class8_Sub32) Static213.aClass129_22.method3043((long) local34.anInt5199);
							if (local1177 != null) {
								if (local1177.anInt5291 == 0 && !Static147.aBoolean246 && local180 <= Static127.anInt2559 && Static229.anInt4666 >= local218 && Static127.anInt2559 < local265 && Static229.anInt4666 < local263 && !Static104.aBoolean169) {
									Static204.aShortArray34[0] = 1007;
									Static65.anIntArray476[0] = Static9.anInt85;
									Static57.aStringArray19[0] = Static86.aString69;
									Static185.anInt3679 = 1;
									Static161.aStringArray47[0] = "";
								}
								Static189.method2951(local265, local1177.anInt5295, local263, local218, local60, local180, local119, local127);
							}
							if (Static116.aBoolean188 && local34.anInt5188 == 1407) {
								Static154.method2454();
							}
							if (Static116.aBoolean188) {
								Static126.method1993(arg2, arg0, arg8, arg4);
							} else {
								Static103.method1680(arg2, arg0, arg8, arg4);
								Static96.method1541();
							}
						}
						if (Static161.aBooleanArray14[local60] || Static138.anInt2763 > 1) {
							if (local34.anInt5197 == 0 && !local34.aBoolean423 && local34.anInt5121 < local34.anInt5207) {
								Static72.method1147(local127, local34.anInt5121, local34.anInt5176, local34.anInt5123 + local119, local34.anInt5207);
							}
							if (local34.anInt5197 != 1) {
								if (local34.anInt5197 == 2) {
									local272 = 0;
									for (local289 = 0; local289 < local34.anInt5156; local289++) {
										for (local462 = 0; local462 < local34.anInt5145; local462++) {
											local496 = (local34.anInt5149 + 32) * local462 + local119;
											local500 = local127 + local289 * (local34.anInt5179 + 32);
											if (local272 < 20) {
												local496 += local34.anIntArray398[local272];
												local500 += local34.anIntArray400[local272];
											}
											if (local34.anIntArray394[local272] > 0) {
												local564 = local34.anIntArray394[local272] - 1;
												if (arg2 < local496 + 32 && local496 < arg8 && arg0 < local500 + 32 && arg4 > local500 || Static198.aClass159_14 == local34 && local272 == Static138.anInt2765) {
													@Pc(1494) Class8_Sub1_Sub7 local1494;
													if (Static149.anInt3012 == 1 && local272 == Static244.anInt4874 && local34.anInt5199 == Static274.anInt5395) {
														local1494 = Static77.method1234(local34.anIntArray399[local272], local564, local34.aBoolean421, 0, null, 2);
													} else {
														local1494 = Static77.method1234(local34.anIntArray399[local272], local564, local34.aBoolean421, 3153952, null, 1);
													}
													if (Static96.aBoolean146) {
														Static128.aBooleanArray7[local60] = true;
													}
													if (local1494 == null) {
														Static128.method2075(local34);
													} else if (local34 == Static198.aClass159_14 && Static138.anInt2765 == local272) {
														local519 = Static182.anInt3572 - Static288.anInt1351;
														local537 = Static106.anInt2198 - Static195.anInt2790;
														if (local537 < 5 && local537 > -5) {
															local537 = 0;
														}
														if (local519 < 5 && local519 > -5) {
															local519 = 0;
														}
														if (Static87.anInt1864 < 5) {
															local519 = 0;
															local537 = 0;
														}
														local1494.method2810(local496 + local519, local537 + local500, 128);
														if (arg3 != -1) {
															@Pc(1579) int local1579;
															@Pc(1581) int local1581;
															if (Static116.aBoolean188) {
																local1579 = Static126.anInt2500;
																local1581 = Static126.anInt2502;
															} else {
																local1579 = Static103.anInt2162;
																local1581 = Static103.anInt2159;
															}
															@Pc(1593) Class159 local1593 = arg5[arg3 & 0xFFFF];
															@Pc(1613) int local1613;
															if (local537 + local500 < local1579 && local1593.anInt5176 > 0) {
																local1613 = Static185.anInt3691 * (local1579 - local537 - local500) / 3;
																if (Static185.anInt3691 * 10 < local1613) {
																	local1613 = Static185.anInt3691 * 10;
																}
																if (local1593.anInt5176 < local1613) {
																	local1613 = local1593.anInt5176;
																}
																Static195.anInt2790 += local1613;
																local1593.anInt5176 -= local1613;
																Static128.method2075(local1593);
															}
															if (local500 + local537 + 32 > local1581 && local1593.anInt5176 < local1593.anInt5207 - local1593.anInt5121) {
																local1613 = (local537 + local500 + 32 - local1581) * Static185.anInt3691 / 3;
																if (Static185.anInt3691 * 10 < local1613) {
																	local1613 = Static185.anInt3691 * 10;
																}
																if (local1613 > local1593.anInt5207 - local1593.anInt5176 - local1593.anInt5121) {
																	local1613 = local1593.anInt5207 - local1593.anInt5121 - local1593.anInt5176;
																}
																Static195.anInt2790 -= local1613;
																local1593.anInt5176 += local1613;
																Static128.method2075(local1593);
															}
														}
													} else if (local34 == Static293.aClass159_20 && local272 == Static182.anInt3570) {
														local1494.method2810(local496, local500, 128);
													} else {
														local1494.method2811(local496, local500);
													}
												}
											} else if (local34.anIntArray406 != null && local272 < 20) {
												@Pc(1396) Class8_Sub1_Sub7 local1396 = local34.method3879(local272);
												if (local1396 != null) {
													local1396.method2811(local496, local500);
												} else if (Static273.aBoolean454) {
													Static128.method2075(local34);
												}
											}
											local272++;
										}
									}
								} else if (local34.anInt5197 == 3) {
									if (Static33.method527(local34)) {
										local272 = local34.anInt5164;
										if (local34 == Static164.aClass159_13 && local34.anInt5146 != 0) {
											local272 = local34.anInt5146;
										}
									} else {
										local272 = local34.anInt5193;
										if (local34 == Static164.aClass159_13 && local34.anInt5111 != 0) {
											local272 = local34.anInt5111;
										}
									}
									if (local122 == 0) {
										if (local34.aBoolean420) {
											if (Static116.aBoolean188) {
												Static126.method1994(local119, local127, local34.anInt5123, local34.anInt5121, local272);
											} else {
												Static103.method1664(local119, local127, local34.anInt5123, local34.anInt5121, local272);
											}
										} else if (Static116.aBoolean188) {
											Static126.method2004(local119, local127, local34.anInt5123, local34.anInt5121, local272);
										} else {
											Static103.method1669(local119, local127, local34.anInt5123, local34.anInt5121, local272);
										}
									} else if (local34.aBoolean420) {
										if (Static116.aBoolean188) {
											Static126.method2000(local119, local127, local34.anInt5123, local34.anInt5121, local272, 256 - (local122 & 0xFF));
										} else {
											Static103.method1678(local119, local127, local34.anInt5123, local34.anInt5121, local272, 256 - (local122 & 0xFF));
										}
									} else if (Static116.aBoolean188) {
										Static126.method2002(local119, local127, local34.anInt5123, local34.anInt5121, local272, 256 - (local122 & 0xFF));
									} else {
										Static103.method1687(local119, local127, local34.anInt5123, local34.anInt5121, local272, 256 - (local122 & 0xFF));
									}
								} else {
									@Pc(1936) Class8_Sub1_Sub5 local1936;
									if (local34.anInt5197 == 4) {
										local1936 = local34.method3887(Static199.aClass43Array4);
										if (local1936 != null) {
											@Pc(1950) String local1950 = local34.aString177;
											if (Static33.method527(local34)) {
												local289 = local34.anInt5164;
												if (local34 == Static164.aClass159_13 && local34.anInt5146 != 0) {
													local289 = local34.anInt5146;
												}
												if (local34.aString179.length() > 0) {
													local1950 = local34.aString179;
												}
											} else {
												local289 = local34.anInt5193;
												if (local34 == Static164.aClass159_13 && local34.anInt5111 != 0) {
													local289 = local34.anInt5111;
												}
											}
											if (local34.aBoolean423 && local34.anInt5125 != -1) {
												@Pc(2004) Class10 local2004 = Static140.method2222(local34.anInt5125);
												local1950 = local2004.aString13;
												if (local1950 == null) {
													local1950 = "null";
												}
												if ((local2004.anInt147 == 1 || local34.anInt5160 != 1) && local34.anInt5160 != -1) {
													local1950 = "<col=ff9040>" + local1950 + "</col> x" + Static234.method3558(local34.anInt5160);
												}
											}
											if (local34 == Static272.aClass159_19) {
												local289 = local34.anInt5193;
												local1950 = Static85.aString68;
											}
											if (!local34.aBoolean423) {
												local1950 = Static185.method2875(local34, local1950);
											}
											local1936.method2022(local1950, local119, local127, local34.anInt5123, local34.anInt5121, local289, local34.aBoolean430 ? 0 : -1, local34.anInt5112, local34.anInt5127, local34.anInt5167);
										} else if (Static273.aBoolean454) {
											Static128.method2075(local34);
										}
									} else if (local34.anInt5197 == 5) {
										@Pc(2099) Class8_Sub1_Sub7 local2099;
										if (!local34.aBoolean423) {
											local2099 = local34.method3892(Static33.method527(local34));
											if (local2099 != null) {
												local2099.method2811(local119, local127);
											} else if (Static273.aBoolean454) {
												Static128.method2075(local34);
											}
										} else if (local34.anInt5119 >= 0) {
											@Pc(2614) Class91 local2614 = local34.method3885();
											if (Static116.aBoolean188) {
												local2614.method2097(0, local119, local127, local34.anInt5123, local34.anInt5121, local34.anInt5170, local34.anInt5154, 0);
											} else {
												local2614.method2099(0, local119, local127, local34.anInt5123, local34.anInt5121, local34.anInt5170, local34.anInt5154);
											}
										} else {
											if (local34.anInt5125 == -1) {
												local2099 = local34.method3892(false);
											} else if (local34.aBoolean415 && Static21.aClass36_Sub3_Sub1_1.aClass11_2 != null) {
												local2099 = Static77.method1234(local34.anInt5160, local34.anInt5125, local34.aBoolean421, local34.anInt5114, Static21.aClass36_Sub3_Sub1_1.aClass11_2, local34.anInt5200);
											} else {
												local2099 = Static77.method1234(local34.anInt5160, local34.anInt5125, local34.aBoolean421, local34.anInt5114, null, local34.anInt5200);
											}
											if (local2099 != null) {
												local289 = local2099.anInt3611;
												local462 = local2099.anInt3610;
												if (local34.aBoolean427) {
													local500 = (local462 + local34.anInt5121 - 1) / local462;
													local496 = (local289 + local34.anInt5123 - 1) / local289;
													if (Static116.aBoolean188) {
														Static126.method2001(local119, local127, local34.anInt5123 + local119, local127 - -local34.anInt5121);
														@Pc(2329) boolean local2329 = Static35.method556(local2099.anInt3602);
														@Pc(2334) boolean local2334 = Static35.method556(local2099.anInt3603);
														@Pc(2337) Class8_Sub1_Sub7_Sub2 local2337 = (Class8_Sub1_Sub7_Sub2) local2099;
														if (local2329 && local2334) {
															if (local122 == 0) {
																local2337.method2820(local119, local127, local496, local500);
															} else {
																local2337.method2824(local119, local127, 256 - (local122 & 0xFF), local496, local500);
															}
														} else if (local2329) {
															for (local553 = 0; local553 < local500; local553++) {
																if (local122 == 0) {
																	local2337.method2820(local119, local127 + local462 * local553, local496, 1);
																} else {
																	local2337.method2824(local119, local127 + local462 * local553, 256 - (local122 & 0xFF), local496, 1);
																}
															}
														} else if (local2334) {
															for (local553 = 0; local553 < local496; local553++) {
																if (local122 == 0) {
																	local2337.method2820(local553 * local289 + local119, local127, 1, local500);
																} else {
																	local2337.method2824(local289 * local553 + local119, local127, 256 - (local122 & 0xFF), 1, local500);
																}
															}
														} else {
															for (local553 = 0; local553 < local496; local553++) {
																for (local580 = 0; local580 < local500; local580++) {
																	if (local122 == 0) {
																		local2099.method2811(local119 + local553 * local289, local127 - -(local462 * local580));
																	} else {
																		local2099.method2810(local119 + local289 * local553, local127 + local462 * local580, 256 - (local122 & 0xFF));
																	}
																}
															}
														}
														Static126.method1993(arg2, arg0, arg8, arg4);
													} else {
														Static103.method1673(local119, local127, local34.anInt5123 + local119, local34.anInt5121 + local127);
														for (local519 = 0; local519 < local496; local519++) {
															for (local537 = 0; local537 < local500; local537++) {
																if (local34.anInt5117 != 0) {
																	local2099.method2813(local462 * local537 + local127 + local462 / 2, local119 + local519 * local289 + local289 / 2, local34.anInt5117, 4096);
																} else if (local122 == 0) {
																	local2099.method2811(local519 * local289 + local119, local127 + local462 * local537);
																} else {
																	local2099.method2810(local519 * local289 + local119, local127 + local537 * local462, 256 - (local122 & 0xFF));
																}
															}
														}
														Static103.method1680(arg2, arg0, arg8, arg4);
													}
												} else {
													local496 = local34.anInt5123 * 4096 / local289;
													if (local34.anInt5117 != 0) {
														local2099.method2813(local34.anInt5121 / 2 + local127, local34.anInt5123 / 2 + local119, local34.anInt5117, local496);
													} else if (local122 != 0) {
														local2099.method2807(local119, local127, local34.anInt5123, local34.anInt5121, 256 - (local122 & 0xFF));
													} else if (local289 == local34.anInt5123 && local462 == local34.anInt5121) {
														local2099.method2811(local119, local127);
													} else {
														local2099.method2808(local119, local127, local34.anInt5123, local34.anInt5121);
													}
												}
											} else if (Static273.aBoolean454) {
												Static128.method2075(local34);
											}
										}
									} else {
										@Pc(2682) Class10 local2682;
										if (local34.anInt5197 == 6) {
											@Pc(2659) boolean local2659 = Static33.method527(local34);
											if (local2659) {
												local289 = local34.anInt5147;
											} else {
												local289 = local34.anInt5141;
											}
											@Pc(2671) Class36_Sub2 local2671 = null;
											local496 = 0;
											if (local34.anInt5125 != -1) {
												local2682 = Static140.method2222(local34.anInt5125);
												if (local2682 != null) {
													local2682 = local2682.method96(local34.anInt5160);
													@Pc(2700) Class76 local2700 = local289 == -1 ? null : Static115.method1855(local289);
													if (local34.aBoolean415 && Static21.aClass36_Sub3_Sub1_1.aClass11_2 != null) {
														local2671 = local2682.method95(local34.anInt5194, local34.anInt5137, Static21.aClass36_Sub3_Sub1_1.aClass11_2, local2700, local34.anInt5175, 1);
													} else {
														local2671 = local2682.method95(local34.anInt5194, local34.anInt5137, null, local2700, local34.anInt5175, 1);
													}
													if (local2671 == null) {
														Static128.method2075(local34);
													} else {
														local496 = -local2671.method4175() / 2;
													}
												}
											} else if (local34.anInt5151 == 5) {
												if (local34.anInt5153 == -1) {
													local2671 = Static24.aClass11_1.method265(-1, null, -1, null, 0, -1, -1, null, 0);
												} else {
													local500 = local34.anInt5153 & 0x7FF;
													if (local500 == Static34.anInt765) {
														local500 = 2047;
													}
													@Pc(2775) Class36_Sub3_Sub1 local2775 = Static230.aClass36_Sub3_Sub1Array1[local500];
													@Pc(2784) Class76 local2784 = local289 == -1 ? null : Static115.method1855(local289);
													if (local2775 != null && (int) Static31.method513(local2775.aString144) << 11 == (local34.anInt5153 & 0xFFFFF800)) {
														local2671 = local2775.aClass11_2.method265(local34.anInt5194, null, 0, null, 0, -1, -1, local2784, 0);
													}
												}
											} else if (local289 == -1) {
												local2671 = local34.method3891(local2659, -1, 0, -1, null, Static21.aClass36_Sub3_Sub1_1.aClass11_2);
												if (local2671 == null && Static273.aBoolean454) {
													Static128.method2075(local34);
												}
											} else {
												@Pc(2862) Class76 local2862 = Static115.method1855(local289);
												local2671 = local34.method3891(local2659, local34.anInt5137, local34.anInt5175, local34.anInt5194, local2862, Static21.aClass36_Sub3_Sub1_1.aClass11_2);
												if (local2671 == null && Static273.aBoolean454) {
													Static128.method2075(local34);
												}
											}
											if (local2671 != null) {
												if (local34.anInt5195 > 0) {
													local519 = (local34.anInt5121 << 8) / local34.anInt5195;
												} else {
													local519 = 256;
												}
												if (local34.anInt5201 > 0) {
													local500 = (local34.anInt5123 << 8) / local34.anInt5201;
												} else {
													local500 = 256;
												}
												local537 = local34.anInt5123 / 2 + local119 + (local500 * local34.anInt5189 >> 8);
												local564 = (local34.anInt5157 * local519 >> 8) + local34.anInt5121 / 2 + local127;
												if (Static116.aBoolean188) {
													if (local34.aBoolean414) {
														Static116.method1893(local537, local564, local34.anInt5209, local34.aShort20, local500, local519);
													} else {
														Static116.method1907(local537, local564, local500, local519);
														Static116.method1909((float) local34.aShort21, (float) local34.aShort20 * 1.5F);
													}
													Static116.method1877();
													Static116.method1871(true);
													Static116.method1885(false);
													Static107.method1716(Static54.anInt1180);
													if (Static175.aBoolean288) {
														Static126.method1999();
														Static116.method1905();
														Static126.method1993(arg2, arg0, arg8, arg4);
														Static175.aBoolean288 = false;
													}
													if (local34.aBoolean429) {
														Static116.method1874();
													}
													local580 = local34.anInt5209 * Class68.anIntArray139[local34.anInt5163] >> 16;
													local553 = Class68.anIntArray137[local34.anInt5163] * local34.anInt5209 >> 16;
													if (local34.aBoolean423) {
														local2671.method3949(local34.anInt5138, local34.anInt5120, local34.anInt5163, local34.anInt5184, local34.anInt5134 + local496 + local553, local580 + local34.anInt5134, -1L);
													} else {
														local2671.method3949(local34.anInt5138, 0, local34.anInt5163, 0, local553, local580, -1L);
													}
													if (local34.aBoolean429) {
														Static116.method1881();
													}
												} else {
													Static96.method1540(local537, local564);
													local580 = Class68.anIntArray139[local34.anInt5163] * local34.anInt5209 >> 16;
													local553 = Class68.anIntArray137[local34.anInt5163] * local34.anInt5209 >> 16;
													if (!local34.aBoolean423) {
														local2671.method3949(local34.anInt5138, 0, local34.anInt5163, 0, local553, local580, -1L);
													} else if (local34.aBoolean414) {
														((Class36_Sub2_Sub2) local2671).method3973(local34.anInt5138, local34.anInt5120, local34.anInt5163, local34.anInt5184, local34.anInt5134 + local553 + local496, local34.anInt5134 + local580, local34.anInt5209);
													} else {
														local2671.method3949(local34.anInt5138, local34.anInt5120, local34.anInt5163, local34.anInt5184, local553 + local496 + local34.anInt5134, local580 + local34.anInt5134, -1L);
													}
													Static96.method1527();
												}
											}
										} else {
											if (local34.anInt5197 == 7) {
												local1936 = local34.method3887(Static199.aClass43Array4);
												if (local1936 == null) {
													if (Static273.aBoolean454) {
														Static128.method2075(local34);
													}
													continue;
												}
												local289 = 0;
												for (local462 = 0; local462 < local34.anInt5156; local462++) {
													for (local496 = 0; local496 < local34.anInt5145; local496++) {
														if (local34.anIntArray394[local289] > 0) {
															local2682 = Static140.method2222(local34.anIntArray394[local289] - 1);
															@Pc(3251) String local3251;
															if (local2682.anInt147 != 1 && local34.anIntArray399[local289] == 1) {
																local3251 = "<col=ff9040>" + local2682.aString13 + "</col>";
															} else {
																local3251 = "<col=ff9040>" + local2682.aString13 + "</col> x" + Static234.method3558(local34.anIntArray399[local289]);
															}
															local537 = local119 + (local34.anInt5149 + 115) * local496;
															local564 = local462 * (local34.anInt5179 + 12) + local127;
															if (local34.anInt5112 == 0) {
																local1936.method2027(local3251, local537, local564, local34.anInt5193, local34.aBoolean430 ? 0 : -1);
															} else if (local34.anInt5112 == 1) {
																local1936.method2040(local3251, local537 + 57, local564, local34.anInt5193, local34.aBoolean430 ? 0 : -1);
															} else {
																local1936.method2013(local3251, local537 + 115 - 1, local564, local34.anInt5193, local34.aBoolean430 ? 0 : -1);
															}
														}
														local289++;
													}
												}
											}
											if (local34.anInt5197 == 8 && local34 == Static30.aClass159_2 && Static108.anInt2270 == Static85.anInt1820) {
												local289 = 0;
												local272 = 0;
												@Pc(3367) Class8_Sub1_Sub5 local3367 = Static247.aClass8_Sub1_Sub5_5;
												@Pc(3370) String local3370 = local34.aString177;
												local3370 = Static185.method2875(local34, local3370);
												@Pc(3392) String local3392;
												while (local3370.length() > 0) {
													local519 = local3370.indexOf("<br>");
													if (local519 == -1) {
														local3392 = local3370;
														local3370 = "";
													} else {
														local3392 = local3370.substring(0, local519);
														local3370 = local3370.substring(local519 + 4);
													}
													local537 = local3367.method2014(local3392);
													if (local537 > local272) {
														local272 = local537;
													}
													local289 += local3367.anInt2515 + 1;
												}
												local272 += 6;
												local289 += 7;
												local519 = local34.anInt5123 + local119 - local272 - 5;
												if (local519 < local119 + 5) {
													local519 = local119 + 5;
												}
												if (arg8 < local272 + local519) {
													local519 = arg8 - local272;
												}
												local537 = local127 + local34.anInt5121 + 5;
												if (local537 + local289 > arg4) {
													local537 = arg4 - local289;
												}
												if (Static116.aBoolean188) {
													Static126.method1994(local519, local537, local272, local289, 16777120);
													Static126.method2004(local519, local537, local272, local289, 0);
												} else {
													Static103.method1664(local519, local537, local272, local289, 16777120);
													Static103.method1669(local519, local537, local272, local289, 0);
												}
												local3370 = local34.aString177;
												local564 = local3367.anInt2515 + local537 + 2;
												local3370 = Static185.method2875(local34, local3370);
												while (local3370.length() > 0) {
													local553 = local3370.indexOf("<br>");
													if (local553 == -1) {
														local3392 = local3370;
														local3370 = "";
													} else {
														local3392 = local3370.substring(0, local553);
														local3370 = local3370.substring(local553 + 4);
													}
													local3367.method2027(local3392, local519 + 3, local564, 0, -1);
													local564 += local3367.anInt2515 + 1;
												}
											}
											if (local34.anInt5197 == 9) {
												if (local34.aBoolean422) {
													local289 = local127 + local34.anInt5121;
													local496 = local127;
													local462 = local119 + local34.anInt5123;
												} else {
													local462 = local34.anInt5123 + local119;
													local289 = local127;
													local496 = local34.anInt5121 + local127;
												}
												if (local34.anInt5203 == 1) {
													if (Static116.aBoolean188) {
														Static126.method1997(local119, local289, local462, local496, local34.anInt5193);
													} else {
														Static103.method1682(local119, local289, local462, local496, local34.anInt5193);
													}
												} else if (Static116.aBoolean188) {
													Static126.method1992(local119, local289, local462, local496, local34.anInt5193, local34.anInt5203);
												} else {
													Static103.method1686(local119, local289, local462, local496, local34.anInt5193, local34.anInt5203);
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
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public static void method2552() {
		Static292.aClass159Array2 = null;
		Static189.method2951(Static250.anInt4959, Static248.anInt4917, Static13.anInt356, 0, -1, 0, 0, 0);
		if (Static292.aClass159Array2 != null) {
			method2551(0, Static248.anInt4909, 0, -1412584499, Static13.anInt356, Static292.aClass159Array2, Static153.aClass159_12.anInt5202, Static283.anInt5554, Static250.anInt4959);
			Static292.aClass159Array2 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Z")
	public static boolean method2553() {
		return Static116.aBoolean188 ? true : Static23.aBoolean40;
	}
}
