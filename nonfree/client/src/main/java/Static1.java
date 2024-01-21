import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	public static int anInt9;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!jg;")
	public static Class44 aClass44_1;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!nd;")
	public static Class59 aClass59_1 = new Class59();

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1 = Static65.method1172("::clientdrop");

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	public static int anInt15 = 0;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "Lclient!kb;")
	public static Class46 aClass46_2 = Static65.method1172("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!jg;IZLclient!kb;Lclient!kb;I)V")
	public static void method1(@OriginalArg(1) Class44 arg0, @OriginalArg(4) Class46 arg1, @OriginalArg(5) Class46 arg2) {
		@Pc(8) int local8 = arg0.method1617(arg1);
		@Pc(22) int local22 = arg0.method1631(arg2, local8);
		Static88.method1473(local8, arg0, 255, local22);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)I")
	public static int method5(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			arg1--;
			local12 = arg0 & 0x1 | local12 << 1;
			arg0 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	public static void method7() {
		anIntArray1 = null;
		aClass46_1 = null;
		aClass46_2 = null;
		aClass44_1 = null;
		aClass59_1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method8() {
		try {
			if (Static9.anInt311 == 0) {
				if (Static129.aClass1_3 != null) {
					Static129.aClass1_3.method10();
					Static129.aClass1_3 = null;
				}
				Static129.aClass14_5 = null;
				Static18.aBoolean14 = false;
				Static9.anInt311 = 1;
				Static41.anInt3680 = 0;
			}
			if (Static9.anInt311 == 1) {
				if (Static129.aClass14_5 == null) {
					Static129.aClass14_5 = Static66.aClass68_4.method2199(Static37.aString1, Static105.anInt2512);
				}
				if (Static129.aClass14_5.anInt516 == 2) {
					throw new IOException();
				}
				if (Static129.aClass14_5.anInt516 == 1) {
					Static129.aClass1_3 = new Class1((Socket) Static129.aClass14_5.anObject1, Static66.aClass68_4);
					Static129.aClass14_5 = null;
					Static9.anInt311 = 2;
				}
			}
			if (Static9.anInt311 == 2) {
				@Pc(68) long local68 = Static40.aLong43 = Static130.aClass46_1066.method1348();
				@Pc(75) int local75 = (int) (local68 >> 16 & 0x1FL);
				Static133.aClass3_Sub4_Sub1_3.anInt232 = 0;
				Static133.aClass3_Sub4_Sub1_3.method206(14);
				Static133.aClass3_Sub4_Sub1_3.method206(local75);
				Static129.aClass1_3.method6(Static133.aClass3_Sub4_Sub1_3.aByteArray5, 2);
				Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
				Static9.anInt311 = 3;
			}
			@Pc(115) int local115;
			if (Static9.anInt311 == 3) {
				if (Static139.aClass12_2 != null) {
					Static139.aClass12_2.method2669();
				}
				if (Static127.aClass12_1 != null) {
					Static127.aClass12_1.method2669();
				}
				local115 = Static129.aClass1_3.method2();
				if (Static139.aClass12_2 != null) {
					Static139.aClass12_2.method2669();
				}
				if (Static127.aClass12_1 != null) {
					Static127.aClass12_1.method2669();
				}
				if (local115 != 0) {
					Static111.method1823(local115);
					return;
				}
				Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
				Static9.anInt311 = 4;
			}
			if (Static9.anInt311 == 4) {
				if (Static49.aClass3_Sub4_Sub1_2.anInt232 < 8) {
					local115 = Static129.aClass1_3.method4();
					if (8 - Static49.aClass3_Sub4_Sub1_2.anInt232 < local115) {
						local115 = 8 - Static49.aClass3_Sub4_Sub1_2.anInt232;
					}
					if (local115 > 0) {
						Static129.aClass1_3.method3(Static49.aClass3_Sub4_Sub1_2.aByteArray5, local115, Static49.aClass3_Sub4_Sub1_2.anInt232);
						Static49.aClass3_Sub4_Sub1_2.anInt232 += local115;
					}
				}
				if (Static49.aClass3_Sub4_Sub1_2.anInt232 == 8) {
					Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
					Static149.aLong126 = Static49.aClass3_Sub4_Sub1_2.method185();
					Static9.anInt311 = 5;
				}
			}
			if (Static9.anInt311 == 5) {
				Static133.aClass3_Sub4_Sub1_3.anInt232 = 0;
				@Pc(205) int[] local205 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static149.aLong126 >> 32), (int) Static149.aLong126 };
				Static133.aClass3_Sub4_Sub1_3.method206(10);
				Static133.aClass3_Sub4_Sub1_3.method188(local205[0]);
				Static133.aClass3_Sub4_Sub1_3.method188(local205[1]);
				Static133.aClass3_Sub4_Sub1_3.method188(local205[2]);
				Static133.aClass3_Sub4_Sub1_3.method188(local205[3]);
				Static133.aClass3_Sub4_Sub1_3.method201(Static130.aClass46_1066.method1348());
				Static133.aClass3_Sub4_Sub1_3.method189(Static130.aClass46_1063);
				Static133.aClass3_Sub4_Sub1_3.method217(Static57.aBigInteger1, Static88.aBigInteger2);
				Static29.aClass3_Sub4_Sub1_1.anInt232 = 0;
				if (Static26.anInt597 == 40) {
					Static29.aClass3_Sub4_Sub1_1.method206(18);
				} else {
					Static29.aClass3_Sub4_Sub1_1.method206(16);
				}
				Static29.aClass3_Sub4_Sub1_1.method206(Static133.aClass3_Sub4_Sub1_3.anInt232 + 93);
				Static29.aClass3_Sub4_Sub1_1.method188(479);
				Static29.aClass3_Sub4_Sub1_1.method206(Static71.aBoolean76 ? 1 : 0);
				Static180.method2892(Static29.aClass3_Sub4_Sub1_1);
				Static29.aClass3_Sub4_Sub1_1.method188(Static95.aClass44_Sub1_10.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static178.aClass44_Sub1_16.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static63.aClass44_Sub1_7.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static160.aClass44_Sub1_15.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static65.aClass44_Sub1_8.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static51.aClass44_Sub1_3.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static53.aClass44_Sub1_5.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static24.aClass44_Sub1_1.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static181.aClass44_Sub1_18.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static179.aClass44_Sub1_17.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static56.aClass44_Sub1_6.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static91.aClass44_Sub1_9.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static153.aClass44_Sub1_14.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static42.aClass44_Sub1_2.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static53.aClass44_Sub1_4.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method188(Static126.aClass44_Sub1_11.anInt2393);
				Static29.aClass3_Sub4_Sub1_1.method200(Static133.aClass3_Sub4_Sub1_3.anInt232, Static133.aClass3_Sub4_Sub1_3.aByteArray5);
				Static129.aClass1_3.method6(Static29.aClass3_Sub4_Sub1_1.aByteArray5, Static29.aClass3_Sub4_Sub1_1.anInt232);
				Static133.aClass3_Sub4_Sub1_3.method225(local205);
				for (@Pc(414) int local414 = 0; local414 < 4; local414++) {
					local205[local414] += 50;
				}
				Static49.aClass3_Sub4_Sub1_2.method225(local205);
				Static9.anInt311 = 6;
			}
			if (Static9.anInt311 == 6 && Static129.aClass1_3.method4() > 0) {
				local115 = Static129.aClass1_3.method2();
				if (local115 == 21 && Static26.anInt597 == 20) {
					Static9.anInt311 = 7;
				} else if (local115 == 2) {
					Static9.anInt311 = 9;
				} else if (local115 == 15 && Static26.anInt597 == 40) {
					Static81.method1366();
					return;
				} else if (local115 == 23 && Static25.anInt3990 < 1) {
					Static9.anInt311 = 0;
					Static25.anInt3990++;
				} else {
					Static111.method1823(local115);
					return;
				}
			}
			if (Static9.anInt311 == 7 && Static129.aClass1_3.method4() > 0) {
				Static28.anInt677 = (Static129.aClass1_3.method2() + 3) * 60;
				Static9.anInt311 = 8;
			}
			if (Static9.anInt311 == 8) {
				Static41.anInt3680 = 0;
				Static81.method1387(Static91.aClass46_752, Static178.method2860(new Class46[] { Static57.method1068(Static28.anInt677 / 60), Static44.aClass46_381 }), Static65.aClass46_596);
				if (--Static28.anInt677 <= 0) {
					Static9.anInt311 = 0;
				}
			} else {
				if (Static9.anInt311 == 9 && Static129.aClass1_3.method4() >= 9) {
					Static38.anInt1076 = Static129.aClass1_3.method2();
					Static106.anInt2534 = Static129.aClass1_3.method2();
					Static10.aBoolean11 = Static129.aClass1_3.method2() == 1;
					Static6.anInt137 = Static129.aClass1_3.method2();
					Static6.anInt137 <<= 0x8;
					Static6.anInt137 += Static129.aClass1_3.method2();
					Static101.anInt2435 = Static129.aClass1_3.method2();
					Static129.aClass1_3.method3(Static49.aClass3_Sub4_Sub1_2.aByteArray5, 1, 0);
					Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
					Static57.anInt1552 = Static49.aClass3_Sub4_Sub1_2.method226();
					Static129.aClass1_3.method3(Static49.aClass3_Sub4_Sub1_2.aByteArray5, 2, 0);
					Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
					Static139.anInt3221 = Static49.aClass3_Sub4_Sub1_2.method208();
					Static9.anInt311 = 10;
				}
				if (Static9.anInt311 != 10) {
					Static41.anInt3680++;
					if (Static41.anInt3680 > 2000) {
						if (Static25.anInt3990 < 1) {
							Static25.anInt3990++;
							Static9.anInt311 = 0;
							if (Static105.anInt2512 == Static35.anInt990) {
								Static105.anInt2512 = Static90.anInt2210;
							} else {
								Static105.anInt2512 = Static35.anInt990;
							}
						} else {
							Static111.method1823(-3);
						}
					}
				} else if (Static129.aClass1_3.method4() >= Static139.anInt3221) {
					Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
					Static129.aClass1_3.method3(Static49.aClass3_Sub4_Sub1_2.aByteArray5, Static139.anInt3221, 0);
					Static122.method2088();
					Static116.anInt2752 = -1;
					Static108.method1769(false);
					Static57.anInt1552 = -1;
				}
			}
		} catch (@Pc(699) IOException local699) {
			if (Static25.anInt3990 < 1) {
				Static9.anInt311 = 0;
				Static25.anInt3990++;
				if (Static105.anInt2512 == Static35.anInt990) {
					Static105.anInt2512 = Static90.anInt2210;
				} else {
					Static105.anInt2512 = Static35.anInt990;
				}
			} else {
				Static111.method1823(-2);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBII[Lclient!h;III)V")
	public static void method9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class33[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(18) Class33 local18 = arg4[local7];
			if (local18 != null && (!local18.aBoolean50 || local18.anInt1441 == 0 || local18.aBoolean52 || Static157.method2541(local18) != 0 || Static30.aClass33_2 == local18) && local18.anInt1479 == arg1 && (!local18.aBoolean50 || !Static114.method1917(local18))) {
				@Pc(55) int local55 = arg5 + local18.anInt1461;
				@Pc(60) int local60 = arg6 + local18.anInt1449;
				if (local18 == Static63.aClass33_5) {
					Static119.anInt2823 = local60;
					Static125.anInt3005 = local55;
					Static84.aBoolean88 = true;
				}
				@Pc(127) int local127;
				@Pc(134) int local134;
				@Pc(156) int local156;
				@Pc(145) int local145;
				@Pc(96) int local96;
				if (local18.anInt1441 == 2) {
					local145 = arg7;
					local134 = arg0;
					local156 = arg2;
					local127 = arg3;
				} else {
					@Pc(85) int local85;
					@Pc(83) int local83;
					if (local18.anInt1441 == 9) {
						local83 = local60;
						local85 = local55;
						@Pc(91) int local91 = local55 + local18.anInt1424;
						local96 = local60 + local18.anInt1428;
						if (local91 < local55) {
							local85 = local91;
							local91 = local55;
						}
						if (local60 > local96) {
							local83 = local96;
							local96 = local60;
						}
						local91++;
						local96++;
						local127 = arg3 < local85 ? local85 : arg3;
						local134 = arg0 >= local83 ? arg0 : local83;
						local145 = local96 >= arg7 ? arg7 : local96;
						local156 = local91 >= arg2 ? arg2 : local91;
					} else {
						local134 = local60 <= arg0 ? arg0 : local60;
						local127 = arg3 < local55 ? local55 : arg3;
						local83 = local60 + local18.anInt1428;
						local85 = local55 + local18.anInt1424;
						local145 = local83 >= arg7 ? arg7 : local83;
						local156 = arg2 <= local85 ? arg2 : local85;
					}
				}
				if (!local18.aBoolean50 || local156 > local127 && local145 > local134) {
					if (local18.anInt1432 == 1337) {
						Static142.method2373(local18);
					} else if (local18.anInt1432 == 1338) {
						Static60.method1123(local55, local60);
					} else {
						if (local18.anInt1441 == 0) {
							if (!local18.aBoolean50 && Static114.method1917(local18) && local18 != Static69.aClass33_6) {
								continue;
							}
							method9(local134, local18.anInt1434, local156, local127, arg4, local55 - local18.anInt1465, local60 - local18.anInt1486, local145);
							if (local18.aClass33Array2 != null) {
								method9(local134, local18.anInt1434, local156, local127, local18.aClass33Array2, local55 - local18.anInt1465, local60 - local18.anInt1486, local145);
							}
							@Pc(318) Class3_Sub12 local318 = (Class3_Sub12) Static129.aClass54_10.method1602((long) local18.anInt1434);
							if (local318 != null) {
								Static151.method2491(local156, local145, local60, local55, local134, local318.anInt1766, local127);
							}
						}
						if (local18.aBoolean50) {
							@Pc(335) boolean local335 = false;
							@Pc(361) boolean local361;
							if (local127 <= Static85.anInt676 && Static149.anInt3582 >= local134 && Static85.anInt676 < local156 && local145 > Static149.anInt3582) {
								local361 = true;
							} else {
								local361 = false;
							}
							if (Static56.anInt1508 == 1 && local361) {
								local335 = true;
							}
							@Pc(374) boolean local374 = false;
							if (Static127.anInt3013 == 1 && local127 <= Static77.anInt1923 && local134 <= Static48.anInt1329 && local156 > Static77.anInt1923 && local145 > Static48.anInt1329) {
								local374 = true;
							}
							if (local374) {
								Static33.method584(Static48.anInt1329 - local60, local18, Static77.anInt1923 - local55);
							}
							if (Static63.aClass33_5 != null && Static63.aClass33_5 != local18 && local361 && Static143.method2386(Static157.method2541(local18))) {
								Static42.aClass33_3 = local18;
							}
							if (Static30.aClass33_2 == local18) {
								Static122.anInt2904 = local60;
								Static64.aBoolean63 = true;
								Static29.anInt698 = local55;
							}
							if (local18.aBoolean52) {
								@Pc(463) Class3_Sub14 local463;
								if (local361 && Static105.anInt2516 != 0 && local18.anObjectArray19 != null) {
									local463 = new Class3_Sub14();
									local463.aClass33_10 = local18;
									local463.anInt2225 = Static105.anInt2516;
									local463.anObjectArray28 = local18.anObjectArray19;
									Static150.aClass59_12.method1730(local463);
								}
								if (Static63.aClass33_5 != null || Static135.aClass33_13 != null || Static105.aBoolean103) {
									local335 = false;
									local361 = false;
									local374 = false;
								}
								if (!local18.aBoolean49 && local374) {
									local18.aBoolean49 = true;
									if (local18.anObjectArray26 != null) {
										local463 = new Class3_Sub14();
										local463.aClass33_10 = local18;
										local463.anInt2221 = Static77.anInt1923 - local55;
										local463.anObjectArray28 = local18.anObjectArray26;
										local463.anInt2225 = Static48.anInt1329 - local60;
										Static150.aClass59_12.method1730(local463);
									}
								}
								if (local18.aBoolean49 && local335 && local18.anObjectArray9 != null) {
									local463 = new Class3_Sub14();
									local463.anInt2221 = Static85.anInt676 - local55;
									local463.aClass33_10 = local18;
									local463.anInt2225 = Static149.anInt3582 - local60;
									local463.anObjectArray28 = local18.anObjectArray9;
									Static150.aClass59_12.method1730(local463);
								}
								if (local18.aBoolean49 && !local335) {
									local18.aBoolean49 = false;
									if (local18.anObjectArray8 != null) {
										local463 = new Class3_Sub14();
										local463.anObjectArray28 = local18.anObjectArray8;
										local463.anInt2225 = Static149.anInt3582 - local60;
										local463.anInt2221 = Static85.anInt676 - local55;
										local463.aClass33_10 = local18;
										Static51.aClass59_4.method1730(local463);
									}
								}
								if (local335 && local18.anObjectArray24 != null) {
									local463 = new Class3_Sub14();
									local463.aClass33_10 = local18;
									local463.anObjectArray28 = local18.anObjectArray24;
									local463.anInt2225 = Static149.anInt3582 - local60;
									local463.anInt2221 = Static85.anInt676 - local55;
									Static150.aClass59_12.method1730(local463);
								}
								if (!local18.aBoolean42 && local361) {
									local18.aBoolean42 = true;
									if (local18.anObjectArray21 != null) {
										local463 = new Class3_Sub14();
										local463.anInt2225 = Static149.anInt3582 - local60;
										local463.aClass33_10 = local18;
										local463.anInt2221 = Static85.anInt676 - local55;
										local463.anObjectArray28 = local18.anObjectArray21;
										Static150.aClass59_12.method1730(local463);
									}
								}
								if (local18.aBoolean42 && local361 && local18.anObjectArray13 != null) {
									local463 = new Class3_Sub14();
									local463.aClass33_10 = local18;
									local463.anInt2221 = Static85.anInt676 - local55;
									local463.anObjectArray28 = local18.anObjectArray13;
									local463.anInt2225 = Static149.anInt3582 - local60;
									Static150.aClass59_12.method1730(local463);
								}
								if (local18.aBoolean42 && !local361) {
									local18.aBoolean42 = false;
									if (local18.anObjectArray22 != null) {
										local463 = new Class3_Sub14();
										local463.anInt2225 = Static149.anInt3582 - local60;
										local463.anInt2221 = Static85.anInt676 - local55;
										local463.anObjectArray28 = local18.anObjectArray22;
										local463.aClass33_10 = local18;
										Static51.aClass59_4.method1730(local463);
									}
								}
								if (local18.anObjectArray1 != null) {
									local463 = new Class3_Sub14();
									local463.aClass33_10 = local18;
									local463.anObjectArray28 = local18.anObjectArray1;
									Static177.aClass59_15.method1730(local463);
								}
								@Pc(805) int local805;
								@Pc(807) int local807;
								@Pc(823) Class3_Sub14 local823;
								if (local18.anObjectArray16 != null && local18.anInt1429 < Static143.anInt3278) {
									if (local18.anIntArray137 == null || Static143.anInt3278 - local18.anInt1429 > 32) {
										local463 = new Class3_Sub14();
										local463.aClass33_10 = local18;
										local463.anObjectArray28 = local18.anObjectArray16;
										Static150.aClass59_12.method1730(local463);
									} else {
										label373: for (local96 = local18.anInt1429; local96 < Static143.anInt3278; local96++) {
											local805 = Static57.anIntArray149[local96 & 0x1F];
											for (local807 = 0; local807 < local18.anIntArray137.length; local807++) {
												if (local805 == local18.anIntArray137[local807]) {
													local823 = new Class3_Sub14();
													local823.aClass33_10 = local18;
													local823.anObjectArray28 = local18.anObjectArray16;
													Static150.aClass59_12.method1730(local823);
													break label373;
												}
											}
										}
									}
									local18.anInt1429 = Static143.anInt3278;
								}
								if (local18.anObjectArray2 != null && local18.anInt1438 < Static14.anInt376) {
									if (local18.anIntArray140 == null || Static14.anInt376 - local18.anInt1438 > 32) {
										local463 = new Class3_Sub14();
										local463.anObjectArray28 = local18.anObjectArray2;
										local463.aClass33_10 = local18;
										Static150.aClass59_12.method1730(local463);
									} else {
										label353: for (local96 = local18.anInt1438; local96 < Static14.anInt376; local96++) {
											local805 = Static176.anIntArray434[local96 & 0x1F];
											for (local807 = 0; local807 < local18.anIntArray140.length; local807++) {
												if (local805 == local18.anIntArray140[local807]) {
													local823 = new Class3_Sub14();
													local823.aClass33_10 = local18;
													local823.anObjectArray28 = local18.anObjectArray2;
													Static150.aClass59_12.method1730(local823);
													break label353;
												}
											}
										}
									}
									local18.anInt1438 = Static14.anInt376;
								}
								if (local18.anObjectArray5 != null && Static111.anInt2630 > local18.anInt1458) {
									if (local18.anIntArray139 == null || Static111.anInt2630 - local18.anInt1458 > 32) {
										local463 = new Class3_Sub14();
										local463.aClass33_10 = local18;
										local463.anObjectArray28 = local18.anObjectArray5;
										Static150.aClass59_12.method1730(local463);
									} else {
										label333: for (local96 = local18.anInt1458; local96 < Static111.anInt2630; local96++) {
											local805 = Static9.anIntArray12[local96 & 0x1F];
											for (local807 = 0; local807 < local18.anIntArray139.length; local807++) {
												if (local805 == local18.anIntArray139[local807]) {
													local823 = new Class3_Sub14();
													local823.anObjectArray28 = local18.anObjectArray5;
													local823.aClass33_10 = local18;
													Static150.aClass59_12.method1730(local823);
													break label333;
												}
											}
										}
									}
									local18.anInt1458 = Static111.anInt2630;
								}
								if (Static181.anInt3977 > local18.anInt1425 && local18.anObjectArray11 != null) {
									local463 = new Class3_Sub14();
									local463.aClass33_10 = local18;
									local463.anObjectArray28 = local18.anObjectArray11;
									Static150.aClass59_12.method1730(local463);
								}
								if (Static16.anInt418 > local18.anInt1425 && local18.anObjectArray10 != null) {
									local463 = new Class3_Sub14();
									local463.anObjectArray28 = local18.anObjectArray10;
									local463.aClass33_10 = local18;
									Static150.aClass59_12.method1730(local463);
								}
								if (Static154.anInt3471 > local18.anInt1425 && local18.anObjectArray6 != null) {
									local463 = new Class3_Sub14();
									local463.anObjectArray28 = local18.anObjectArray6;
									local463.aClass33_10 = local18;
									Static150.aClass59_12.method1730(local463);
								}
								if (Static98.anInt2362 > local18.anInt1425 && local18.anObjectArray3 != null) {
									local463 = new Class3_Sub14();
									local463.aClass33_10 = local18;
									local463.anObjectArray28 = local18.anObjectArray3;
									Static150.aClass59_12.method1730(local463);
								}
								if (local18.anInt1425 < Static108.anInt2582 && local18.anObjectArray17 != null) {
									local463 = new Class3_Sub14();
									local463.aClass33_10 = local18;
									local463.anObjectArray28 = local18.anObjectArray17;
									Static150.aClass59_12.method1730(local463);
								}
								local18.anInt1425 = Static178.anInt3928;
								if (local18.anObjectArray12 != null) {
									for (local96 = 0; local96 < Static182.anInt4017; local96++) {
										@Pc(1162) Class3_Sub14 local1162 = new Class3_Sub14();
										local1162.aClass33_10 = local18;
										local1162.anInt2223 = Static73.anIntArray175[local96];
										local1162.anInt2226 = Static127.anIntArray337[local96];
										local1162.anObjectArray28 = local18.anObjectArray12;
										Static150.aClass59_12.method1730(local1162);
									}
								}
							}
						}
						if (!local18.aBoolean50) {
							if (Static63.aClass33_5 != null || Static135.aClass33_13 != null || Static105.aBoolean103) {
								return;
							}
							if ((local18.anInt1447 >= 0 || local18.anInt1473 != 0) && local127 <= Static85.anInt676 && Static149.anInt3582 >= local134 && local156 > Static85.anInt676 && local145 > Static149.anInt3582) {
								if (local18.anInt1447 >= 0) {
									Static69.aClass33_6 = arg4[local18.anInt1447];
								} else {
									Static69.aClass33_6 = local18;
								}
							}
							if (local18.anInt1441 == 8 && Static85.anInt676 >= local127 && local134 <= Static149.anInt3582 && local156 > Static85.anInt676 && local145 > Static149.anInt3582) {
								Static128.aClass33_12 = local18;
							}
							if (local18.anInt1455 > local18.anInt1428) {
								Static3.method60(local18, local18.anInt1424 + local55, local18.anInt1428, Static149.anInt3582, Static85.anInt676, local60, local18.anInt1455);
							}
						}
					}
				}
			}
		}
	}
}
