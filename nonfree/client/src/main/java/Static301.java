import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
	public static int anInt3999;

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "Ljava/util/Random;")
	public static final Random aRandom3 = new Random();

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V")
	public static void method3330() {
		if (Static398.anInt6924 > 0) {
			Static398.anInt6924--;
		}
		if (Static79.anInt1568 > 1) {
			Static367.anInt6237 = Static337.anInt7419;
			Static79.anInt1568--;
		}
		if (Static37.aBoolean24) {
			Static37.aBoolean24 = false;
			Static32.method556();
			return;
		}
		if (!Static108.aBoolean111) {
			Static188.method2891();
		}
		for (@Pc(33) int local33 = 0; local33 < 100 && Static91.method1479(); local33++) {
		}
		if (Static151.anInt2579 != 30) {
			return;
		}
		Static303.method4334(Static54.aClass131_38.method3011(), Static232.aClass1_Sub1_Sub1_2);
		if (Static175.aClass1_Sub25_2 == null) {
			if (Static101.method1557() >= Static228.aLong129) {
				Static175.aClass1_Sub25_2 = Static311.aClass213_1.method5021(Static212.aString4);
			}
		} else if (Static175.aClass1_Sub25_2.anInt4176 != -1) {
			Static55.method989(Static272.aClass131_126);
			Static232.aClass1_Sub1_Sub1_2.method4101(Static175.aClass1_Sub25_2.anInt4176);
			Static175.aClass1_Sub25_2 = null;
			Static228.aLong129 = Static101.method1557() + 30000L;
		}
		@Pc(100) Class1_Sub27 local100 = (Class1_Sub27) Static384.aClass266_45.method6000();
		@Pc(114) int local114;
		@Pc(135) int local135;
		@Pc(150) int local150;
		@Pc(165) boolean local165;
		@Pc(216) int local216;
		@Pc(223) int local223;
		@Pc(234) int local234;
		if (local100 != null || Static205.aLong117 < Static101.method1557() - 2000L) {
			@Pc(111) boolean local111 = false;
			local114 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
			for (@Pc(119) Class1_Sub27 local119 = (Class1_Sub27) Static381.aClass266_40.method6000(); local119 != null && Static232.aClass1_Sub1_Sub1_2.anInt5056 - local114 < 240; local119 = (Class1_Sub27) Static381.aClass266_40.method5994()) {
				local119.method6071();
				local135 = local119.method4582();
				if (local135 < 0) {
					local135 = 0;
				} else if (local135 > 65534) {
					local135 = 65534;
				}
				local150 = local119.method4581();
				if (local150 < 0) {
					local150 = 0;
				} else if (local150 > 65534) {
					local150 = 65534;
				}
				local165 = false;
				if (local119.method4582() == -1 && local119.method4581() == -1) {
					local165 = true;
					local135 = -1;
					local150 = -1;
				}
				if (local150 != Static78.anInt1545 || local135 != Static140.anInt2359) {
					if (!local111) {
						Static55.method989(Static428.aClass131_183);
						Static232.aClass1_Sub1_Sub1_2.method4115(0);
						local111 = true;
						local114 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
					}
					local216 = local150 - Static78.anInt1545;
					Static78.anInt1545 = local150;
					local223 = local135 - Static140.anInt2359;
					Static140.anInt2359 = local135;
					local234 = (int) ((local119.method4580() - Static205.aLong117) / 20L);
					if (local234 < 8 && local216 >= -32 && local216 <= 31 && local223 >= -32 && local223 <= 31) {
						local216 += 32;
						local223 += 32;
						Static232.aClass1_Sub1_Sub1_2.method4101(local223 + (local216 << 6) + (local234 << 12));
					} else if (local234 < 32 && local216 >= -128 && local216 <= 127 && local223 >= -128 && local223 <= 127) {
						local223 += 128;
						Static232.aClass1_Sub1_Sub1_2.method4115(local234 + 128);
						local216 += 128;
						Static232.aClass1_Sub1_Sub1_2.method4101(local223 + (local216 << 8));
					} else if (local234 >= 32) {
						Static232.aClass1_Sub1_Sub1_2.method4101(local234 + 57344);
						if (local165) {
							Static232.aClass1_Sub1_Sub1_2.method4105(Integer.MIN_VALUE);
						} else {
							Static232.aClass1_Sub1_Sub1_2.method4105(local150 | local135 << 16);
						}
					} else {
						Static232.aClass1_Sub1_Sub1_2.method4115(local234 + 192);
						if (local165) {
							Static232.aClass1_Sub1_Sub1_2.method4105(Integer.MIN_VALUE);
						} else {
							Static232.aClass1_Sub1_Sub1_2.method4105(local150 | local135 << 16);
						}
					}
					Static205.aLong117 = local119.method4580();
				}
			}
			if (local111) {
				Static232.aClass1_Sub1_Sub1_2.method4138(Static232.aClass1_Sub1_Sub1_2.anInt5056 - local114);
			}
		}
		@Pc(407) int local407;
		@Pc(455) int local455;
		if (local100 != null) {
			@Pc(393) long local393 = (local100.method4580() - Static441.aLong222) / 50L;
			Static441.aLong222 = local100.method4580();
			if (local393 > 32767L) {
				local393 = 32767L;
			}
			local407 = local100.method4582();
			if (local407 < 0) {
				local407 = 0;
			} else if (local407 > 65535) {
				local407 = 65535;
			}
			local135 = local100.method4581();
			if (local135 < 0) {
				local135 = 0;
			} else if (local135 > 65535) {
				local135 = 65535;
			}
			@Pc(442) byte local442 = 0;
			if (local100.method4578() == 2) {
				local442 = 1;
			}
			Static55.method989(Static316.aClass131_143);
			local455 = (int) local393;
			Static232.aClass1_Sub1_Sub1_2.method4144(local442 << 15 | local455);
			Static232.aClass1_Sub1_Sub1_2.method4105(local135 | local407 << 16);
		}
		@Pc(486) int local486;
		if (Static242.anInt4339 > 0) {
			local486 = 0;
			for (local114 = 0; local114 < Static242.anInt4339; local114++) {
				if (Static148.aClass21Array1[local114].method3177()) {
					local486++;
				}
			}
			if (local486 > 0) {
				Static55.method989(Static42.aClass131_29);
				if (local486 > 75) {
					local486 = 75;
				}
				Static232.aClass1_Sub1_Sub1_2.method4115(local486 * 3);
				for (local407 = 0; local407 < Static242.anInt4339; local407++) {
					@Pc(529) Class21 local529 = Static148.aClass21Array1[local407];
					if (local529.method3177()) {
						@Pc(542) long local542 = (local529.method3184() - Static279.aLong139) / 50L;
						if (local542 > 65535L) {
							local542 = 65535L;
						}
						Static279.aLong139 = local529.method3184();
						Static232.aClass1_Sub1_Sub1_2.method4115(local529.method3182());
						Static232.aClass1_Sub1_Sub1_2.method4101((int) local542);
					}
				}
			}
		}
		if (Static311.anInt5560 > 0) {
			Static311.anInt5560--;
		}
		if (Static255.aBoolean311 && Static311.anInt5560 <= 0) {
			Static311.anInt5560 = 20;
			Static255.aBoolean311 = false;
			Static55.method989(Static233.aClass131_111);
			Static232.aClass1_Sub1_Sub1_2.method4092((int) Static144.aFloat36 >> 3);
			Static232.aClass1_Sub1_Sub1_2.method4092((int) Static274.aFloat78 >> 3);
		}
		if (Static40.aBoolean28 && !Static430.aBoolean476) {
			Static430.aBoolean476 = true;
			Static55.method989(Static55.aClass131_40);
			Static232.aClass1_Sub1_Sub1_2.method4115(1);
		}
		if (!Static40.aBoolean28 && Static430.aBoolean476) {
			Static430.aBoolean476 = false;
			Static55.method989(Static55.aClass131_40);
			Static232.aClass1_Sub1_Sub1_2.method4115(0);
		}
		if (!Static373.aBoolean406) {
			Static55.method989(Static334.aClass131_147);
			Static232.aClass1_Sub1_Sub1_2.method4115(0);
			local486 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
			@Pc(696) Class1_Sub1 local696 = Static389.aClass128_Sub1_1.method2983();
			Static232.aClass1_Sub1_Sub1_2.method4110(local696.anInt5056, local696.aByteArray66);
			Static232.aClass1_Sub1_Sub1_2.method4138(Static232.aClass1_Sub1_Sub1_2.anInt5056 - local486);
			Static373.aBoolean406 = true;
		}
		if (Static268.aClass211ArrayArrayArray4 != null) {
			if (Static310.anInt5540 == 2) {
				Static199.method3016();
			} else if (Static310.anInt5540 == 3) {
				Static64.method1126();
			}
		}
		if (Static211.aBoolean268) {
			Static211.aBoolean268 = false;
		} else {
			Static107.aFloat33 /= 2.0F;
		}
		if (Static216.aBoolean272) {
			Static216.aBoolean272 = false;
		} else {
			Static8.aFloat3 /= 2.0F;
		}
		Static242.method3586();
		if (Static151.anInt2579 != 30) {
			return;
		}
		Static83.method5719();
		Static395.method5368();
		Static451.method6037();
		Static335.method1053();
		Static95.anInt1785++;
		if (Static95.anInt1785 > 750) {
			Static32.method556();
			return;
		}
		Static402.method5429();
		Static128.method1878();
		Static27.method487();
		for (local486 = Static51.aClass79_1.method1576(true); local486 != -1; local486 = Static51.aClass79_1.method1576(false)) {
			Static358.method4935(local486);
			Static245.anIntArray351[Static193.anInt1051++ & 0x1F] = local486;
		}
		@Pc(879) Class219 local879;
		for (@Pc(814) Class1_Sub2_Sub1 local814 = Static162.method2558(); local814 != null; local814 = Static162.method2558()) {
			local407 = local814.method198();
			local135 = local814.method196();
			if (local407 == 1) {
				Static77.anIntArray142[local135] = local814.anInt214;
				Static201.aBoolean257 |= Static318.aBooleanArray18[local135];
				Static442.anIntArray406[Static18.anInt419++ & 0x1F] = local135;
			} else if (local407 == 2) {
				Static238.aStringArray39[local135] = local814.aString1;
				Static272.anIntArray392[Static451.anInt7775++ & 0x1F] = local135;
			} else if (local407 == 3) {
				local879 = Static103.method1572(local135);
				if (!local814.aString1.equals(local879.aString45)) {
					local879.aString45 = local814.aString1;
					Static355.method4895(local879);
				}
			} else if (local407 == 4) {
				local879 = Static103.method1572(local135);
				local455 = local814.anInt214;
				local216 = local814.anInt218;
				local223 = local814.anInt211;
				if (local455 != local879.anInt6366 || local879.anInt6353 != local216 || local879.anInt6410 != local223) {
					local879.anInt6353 = local216;
					local879.anInt6410 = local223;
					local879.anInt6366 = local455;
					Static355.method4895(local879);
				}
			} else if (local407 == 5) {
				local879 = Static103.method1572(local135);
				if (local879.anInt6417 != local814.anInt214 || local814.anInt214 == -1) {
					local879.anInt6420 = 1;
					local879.anInt6396 = 0;
					local879.anInt6425 = 0;
					local879.anInt6417 = local814.anInt214;
					Static355.method4895(local879);
				}
			} else if (local407 == 6) {
				local150 = local814.anInt214;
				local455 = local150 >> 10 & 0x1F;
				local216 = local150 >> 5 & 0x1F;
				local223 = local150 & 0x1F;
				local234 = (local455 << 19) + (local216 << 11) + (local223 << 3);
				@Pc(1341) Class219 local1341 = Static103.method1572(local135);
				if (local234 != local1341.anInt6339) {
					local1341.anInt6339 = local234;
					Static355.method4895(local1341);
				}
			} else if (local407 == 7) {
				local879 = Static103.method1572(local135);
				local165 = local814.anInt214 == 1;
				if (local879.aBoolean417 != local165) {
					local879.aBoolean417 = local165;
					Static355.method4895(local879);
				}
			} else if (local407 == 8) {
				local879 = Static103.method1572(local135);
				if (local814.anInt214 != local879.anInt6423 || local814.anInt218 != local879.anInt6395 || local814.anInt211 != local879.anInt6391) {
					local879.anInt6395 = local814.anInt218;
					local879.anInt6423 = local814.anInt214;
					local879.anInt6391 = local814.anInt211;
					if (local879.anInt6421 != -1) {
						if (local879.anInt6351 > 0) {
							local879.anInt6391 = local879.anInt6391 * 32 / local879.anInt6351;
						} else if (local879.anInt6365 > 0) {
							local879.anInt6391 = local879.anInt6391 * 32 / local879.anInt6365;
						}
					}
					Static355.method4895(local879);
				}
			} else if (local407 == 9) {
				local879 = Static103.method1572(local135);
				if (local879.anInt6421 != local814.anInt214 || local879.anInt6374 != local814.anInt218) {
					local879.anInt6421 = local814.anInt214;
					local879.anInt6374 = local814.anInt218;
					Static355.method4895(local879);
				}
			} else if (local407 == 10) {
				local879 = Static103.method1572(local135);
				if (local879.anInt6346 != local814.anInt214 || local879.anInt6352 != local814.anInt218 || local814.anInt211 != local879.anInt6416) {
					local879.anInt6352 = local814.anInt218;
					local879.anInt6416 = local814.anInt211;
					local879.anInt6346 = local814.anInt214;
					Static355.method4895(local879);
				}
			} else if (local407 == 11) {
				local879 = Static103.method1572(local135);
				local879.aByte80 = 0;
				local879.aByte81 = 0;
				local879.anInt6418 = local879.anInt6343 = local814.anInt214;
				local879.anInt6375 = local879.anInt6367 = local814.anInt218;
				Static355.method4895(local879);
			} else if (local407 == 12) {
				local879 = Static103.method1572(local135);
				local455 = local814.anInt214;
				if (local879 != null && local879.anInt6377 == 0) {
					if (local879.anInt6413 - local879.anInt6363 < local455) {
						local455 = local879.anInt6413 - local879.anInt6363;
					}
					if (local455 < 0) {
						local455 = 0;
					}
					if (local879.anInt6371 != local455) {
						local879.anInt6371 = local455;
						Static355.method4895(local879);
					}
				}
			} else if (local407 == 14) {
				local879 = Static103.method1572(local135);
				local879.anInt6402 = local814.anInt214;
			} else if (local407 == 15) {
				Static3.anInt169 = local814.anInt218;
				Static261.aBoolean488 = true;
				Static270.anInt4850 = local814.anInt214;
			} else if (local407 == 16) {
				local879 = Static103.method1572(local135);
				local879.anInt6362 = local814.anInt214;
			}
		}
		Static9.anInt248++;
		if (Static258.anInt7179 != 0) {
			Static158.anInt2678 += 20;
			if (Static158.anInt2678 >= 400) {
				Static258.anInt7179 = 0;
			}
		}
		if (Static221.aClass219_12 != null) {
			Static167.anInt3120++;
			if (Static167.anInt3120 >= 15) {
				Static355.method4895(Static221.aClass219_12);
				Static221.aClass219_12 = null;
			}
		}
		Static139.aClass219_9 = null;
		Static295.aClass219_15 = null;
		Static400.aBoolean448 = false;
		Static168.aBoolean183 = false;
		Static429.method5745(-1, -1, null);
		Static425.method5709(-1, null, -1);
		if (!Static138.aBoolean128) {
			Static246.anInt4394 = -1;
		}
		Static330.method4638();
		Static337.anInt7419++;
		if (Static257.aBoolean317) {
			Static55.method989(Static413.aClass131_191);
			Static232.aClass1_Sub1_Sub1_2.method4116(Static429.anInt7414 << 14 | Static323.anInt5665 << 28 | Static439.anInt7578);
			Static257.aBoolean317 = false;
		}
		while (true) {
			@Pc(1447) Class1_Sub6 local1447;
			@Pc(1452) Class219 local1452;
			do {
				local1447 = (Class1_Sub6) Static420.aClass266_49.method5999();
				if (local1447 == null) {
					while (true) {
						do {
							local1447 = (Class1_Sub6) Static30.aClass266_8.method5999();
							if (local1447 == null) {
								while (true) {
									do {
										local1447 = (Class1_Sub6) Static59.aClass266_11.method5999();
										if (local1447 == null) {
											if (Static139.aClass219_9 == null) {
												Static90.anInt1740 = 0;
											}
											if (Static442.aClass219_14 != null) {
												Static268.method4065();
											}
											if (Static82.anInt1625 > 0 && Static102.aClass163_1.method3809(82) && Static102.aClass163_1.method3809(81) && Static257.anInt4626 != 0) {
												local407 = Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 - Static257.anInt4626;
												if (local407 < 0) {
													local407 = 0;
												} else if (local407 > 3) {
													local407 = 3;
												}
												Static363.method4978(Static134.anInt5502 + Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray589[0], Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray590[0] + Static437.anInt7555, local407);
											}
											Static90.method1476();
											for (local407 = 0; local407 < 5; local407++) {
												@Pc(1648) int local1648 = Static206.anIntArray315[local407]++;
											}
											if (Static201.aBoolean257 && Static32.aLong21 < Static101.method1557() - 60000L) {
												Static86.method1449();
											}
											Static129.anInt2263++;
											if (Static129.anInt2263 > 500) {
												Static129.anInt2263 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x1) == 1) {
													Static65.anInt1352 += Static193.anInt1053;
												}
												if ((local135 & 0x2) == 2) {
													Static151.anInt2581 += Static298.anInt5266;
												}
												if ((local135 & 0x4) == 4) {
													Static12.anInt322 += Static394.anInt6845;
												}
											}
											if (Static65.anInt1352 < -50) {
												Static193.anInt1053 = 2;
											}
											if (Static151.anInt2581 < -55) {
												Static298.anInt5266 = 2;
											}
											if (Static65.anInt1352 > 50) {
												Static193.anInt1053 = -2;
											}
											if (Static151.anInt2581 > 55) {
												Static298.anInt5266 = -2;
											}
											if (Static12.anInt322 < -40) {
												Static394.anInt6845 = 1;
											}
											if (Static12.anInt322 > 40) {
												Static394.anInt6845 = -1;
											}
											Static3.anInt166++;
											if (Static3.anInt166 > 500) {
												Static3.anInt166 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x1) == 1) {
													Static182.anInt7140 += Static177.anInt5591;
												}
												if ((local135 & 0x2) == 2) {
													Static427.anInt7386 += Static294.anInt5924;
												}
											}
											if (Static182.anInt7140 < -60) {
												Static177.anInt5591 = 2;
											}
											if (Static182.anInt7140 > 60) {
												Static177.anInt5591 = -2;
											}
											if (Static427.anInt7386 < -20) {
												Static294.anInt5924 = 1;
											}
											if (Static427.anInt7386 > 10) {
												Static294.anInt5924 = -1;
											}
											Static166.anInt6111++;
											if (Static166.anInt6111 > 50) {
												Static55.method989(Static265.aClass131_125);
											}
											if (Static9.aBoolean1) {
												Static199.method3015();
												Static9.aBoolean1 = false;
											}
											try {
												if (Static372.aClass161_6 != null && Static232.aClass1_Sub1_Sub1_2.anInt5056 > 0) {
													Static441.anInt7603 += Static232.aClass1_Sub1_Sub1_2.anInt5056;
													Static372.aClass161_6.method3763(Static232.aClass1_Sub1_Sub1_2.aByteArray66, Static232.aClass1_Sub1_Sub1_2.anInt5056);
													Static232.aClass1_Sub1_Sub1_2.anInt5056 = 0;
													Static166.anInt6111 = 0;
													return;
												}
												return;
											} catch (@Pc(1866) IOException local1866) {
												Static32.method556();
												return;
											}
										}
										local1452 = local1447.aClass219_4;
										if (local1452.anInt6345 < 0) {
											break;
										}
										local879 = Static103.method1572(local1452.anInt6379);
									} while (local879 == null || local879.aClass219Array3 == null || local1452.anInt6345 >= local879.aClass219Array3.length || local879.aClass219Array3[local1452.anInt6345] != local1452);
									Static104.method1608(local1447);
								}
							}
							local1452 = local1447.aClass219_4;
							if (local1452.anInt6345 < 0) {
								break;
							}
							local879 = Static103.method1572(local1452.anInt6379);
						} while (local879 == null || local879.aClass219Array3 == null || local1452.anInt6345 >= local879.aClass219Array3.length || local879.aClass219Array3[local1452.anInt6345] != local1452);
						Static104.method1608(local1447);
					}
				}
				local1452 = local1447.aClass219_4;
				if (local1452.anInt6345 < 0) {
					break;
				}
				local879 = Static103.method1572(local1452.anInt6379);
			} while (local879 == null || local879.aClass219Array3 == null || local1452.anInt6345 >= local879.aClass219Array3.length || local1452 != local879.aClass219Array3[local1452.anInt6345]);
			Static104.method1608(local1447);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BILjava/util/Random;)I")
	public static int method3334(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static304.method4356(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(44) int local44;
			do {
				local44 = arg1.nextInt();
			} while (local44 >= local41);
			return Static174.method2720(local44, arg0);
		}
	}
}
