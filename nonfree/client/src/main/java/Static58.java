import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
	public static int anInt1578;

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "Lclient!rd;")
	public static Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "Lclient!ef;")
	public static Class3_Sub2_Sub3_Sub1_Sub1 aClass3_Sub2_Sub3_Sub1_Sub1_4;

	@OriginalMember(owner = "client!hc", name = "bb", descriptor = "Lclient!jg;")
	public static Class44 aClass44_10;

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!hc", name = "lb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
	public static int anInt1579 = 0;

	@OriginalMember(owner = "client!hc", name = "R", descriptor = "Z")
	public static boolean aBoolean58 = true;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "Lclient!kb;")
	public static Class46 aClass46_524 = Static65.method1172("<col=c0ff00>");

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
	public static int anInt1583 = 0;

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lclient!kb;")
	private static Class46 aClass46_525 = Static65.method1172("Please use a different world)3");

	@OriginalMember(owner = "client!hc", name = "ib", descriptor = "Lclient!kb;")
	private static Class46 aClass46_529 = Static65.method1172("World");

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_526 = aClass46_529;

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_527 = aClass46_529;

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "Lclient!kb;")
	public static Class46 aClass46_528 = aClass46_525;

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "B")
	public static byte aByte3 = 0;

	@OriginalMember(owner = "client!hc", name = "kb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_530 = aClass46_525;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
	public static void method1091() {
		aClass44_10 = null;
		aClass46_528 = null;
		aClass46_527 = null;
		aClass46_525 = null;
		aClass46_526 = null;
		aByteArrayArrayArray3 = null;
		aFrame1 = null;
		aClass46_530 = null;
		aClass46_524 = null;
		aClass3_Sub4_1 = null;
		aClass3_Sub2_Sub3_Sub1_Sub1_4 = null;
		aClass46_529 = null;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IB)Z")
	public static boolean method1092(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	public static void method1093() {
		if (Static163.anInt3623 > 1) {
			Static163.anInt3623--;
		}
		if (Static135.anInt3150 > 0) {
			Static135.anInt3150--;
		}
		if (Static18.aBoolean14) {
			Static18.aBoolean14 = false;
			Static119.method2035();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static136.method2320(); local29++) {
		}
		if (Static26.anInt597 != 30) {
			return;
		}
		Static165.method2651(Static133.aClass3_Sub4_Sub1_3);
		@Pc(57) Object local57 = Static89.aClass84_1.anObject4;
		@Pc(92) int local92;
		@Pc(94) int local94;
		@Pc(96) int local96;
		@Pc(112) int local112;
		@Pc(133) int local133;
		synchronized (Static89.aClass84_1.anObject4) {
			if (!Static10.aBoolean11) {
				Static89.aClass84_1.anInt3779 = 0;
			} else if (Static127.anInt3013 != 0 || Static89.aClass84_1.anInt3779 >= 40) {
				Static133.aClass3_Sub4_Sub1_3.method233(49);
				Static133.aClass3_Sub4_Sub1_3.method206(0);
				local92 = Static133.aClass3_Sub4_Sub1_3.anInt232;
				local94 = 0;
				for (local96 = 0; local96 < Static89.aClass84_1.anInt3779 && Static133.aClass3_Sub4_Sub1_3.anInt232 - local92 < 240; local96++) {
					local94++;
					local112 = Static89.aClass84_1.anIntArray423[local96];
					if (local112 < 0) {
						local112 = 0;
					} else if (local112 > 502) {
						local112 = 502;
					}
					local133 = Static89.aClass84_1.anIntArray422[local96];
					if (local133 < 0) {
						local133 = 0;
					} else if (local133 > 764) {
						local133 = 764;
					}
					@Pc(152) int local152 = local133 + local112 * 765;
					if (Static89.aClass84_1.anIntArray423[local96] == -1 && Static89.aClass84_1.anIntArray422[local96] == -1) {
						local133 = -1;
						local152 = 524287;
						local112 = -1;
					}
					if (local133 != Static60.anInt1635 || local112 != Static26.anInt594) {
						@Pc(197) int local197 = local112 - Static26.anInt594;
						@Pc(201) int local201 = local133 - Static60.anInt1635;
						Static60.anInt1635 = local133;
						Static26.anInt594 = local112;
						if (Static42.anInt1170 < 8 && local201 >= -32 && local201 <= 31 && local197 >= -32 && local197 <= 31) {
							local201 += 32;
							local197 += 32;
							Static133.aClass3_Sub4_Sub1_3.method198(local197 + (local201 << 6) + (Static42.anInt1170 << 12));
							Static42.anInt1170 = 0;
						} else if (Static42.anInt1170 < 8) {
							Static133.aClass3_Sub4_Sub1_3.method187((Static42.anInt1170 << 19) + local152 + 8388608);
							Static42.anInt1170 = 0;
						} else {
							Static133.aClass3_Sub4_Sub1_3.method188((Static42.anInt1170 << 19) + (local152 - 1073741824));
							Static42.anInt1170 = 0;
						}
					} else if (Static42.anInt1170 < 2047) {
						Static42.anInt1170++;
					}
				}
				Static133.aClass3_Sub4_Sub1_3.method222(Static133.aClass3_Sub4_Sub1_3.anInt232 - local92);
				if (Static89.aClass84_1.anInt3779 > local94) {
					Static89.aClass84_1.anInt3779 -= local94;
					for (local112 = 0; local112 < Static89.aClass84_1.anInt3779; local112++) {
						Static89.aClass84_1.anIntArray422[local112] = Static89.aClass84_1.anIntArray422[local112 + local94];
						Static89.aClass84_1.anIntArray423[local112] = Static89.aClass84_1.anIntArray423[local112 + local94];
					}
				} else {
					Static89.aClass84_1.anInt3779 = 0;
				}
			}
		}
		if (Static127.anInt3013 != 0) {
			@Pc(372) long local372 = (Static53.aLong54 - Static32.aLong31) / 50L;
			Static32.aLong31 = Static53.aLong54;
			if (local372 > 4095L) {
				local372 = 4095L;
			}
			local92 = Static48.anInt1329;
			if (local92 < 0) {
				local92 = 0;
			} else if (local92 > 502) {
				local92 = 502;
			}
			local94 = Static77.anInt1923;
			if (local94 < 0) {
				local94 = 0;
			} else if (local94 > 764) {
				local94 = 764;
			}
			local96 = local94 + local92 * 765;
			@Pc(419) byte local419 = 0;
			if (Static127.anInt3013 == 2) {
				local419 = 1;
			}
			Static133.aClass3_Sub4_Sub1_3.method233(6);
			local133 = (int) local372;
			Static133.aClass3_Sub4_Sub1_3.method224(local96 + (local419 << 19) + (local133 << 20));
		}
		if (Static155.anInt3480 > 0) {
			Static155.anInt3480--;
		}
		if (Static97.aBooleanArray9[96] || Static97.aBooleanArray9[97] || Static97.aBooleanArray9[98] || Static97.aBooleanArray9[99]) {
			Static83.aBoolean86 = true;
		}
		if (Static83.aBoolean86 && Static155.anInt3480 <= 0) {
			Static83.aBoolean86 = false;
			Static155.anInt3480 = 20;
			Static133.aClass3_Sub4_Sub1_3.method233(128);
			Static133.aClass3_Sub4_Sub1_3.method198(Static98.anInt2371);
			Static133.aClass3_Sub4_Sub1_3.method198(Static29.anInt697);
		}
		if (Static89.aBoolean92 && !aBoolean58) {
			aBoolean58 = true;
			Static133.aClass3_Sub4_Sub1_3.method233(74);
			Static133.aClass3_Sub4_Sub1_3.method206(1);
		}
		if (!Static89.aBoolean92 && aBoolean58) {
			aBoolean58 = false;
			Static133.aClass3_Sub4_Sub1_3.method233(74);
			Static133.aClass3_Sub4_Sub1_3.method206(0);
		}
		Static153.method2516();
		if (Static26.anInt597 != 30) {
			return;
		}
		Static36.method651();
		Static28.method484();
		Static42.anInt1174++;
		if (Static42.anInt1174 > 750) {
			Static119.method2035();
			return;
		}
		Static100.method1652();
		Static114.method1916();
		Static86.method1429();
		if (Static182.anInt4022 != 0) {
			Static23.anInt542 += 20;
			if (Static23.anInt542 >= 400) {
				Static182.anInt4022 = 0;
			}
		}
		Static22.anInt526++;
		if (Static93.aClass33_11 != null) {
			Static99.anInt2410++;
			if (Static99.anInt2410 >= 15) {
				Static142.method2373(Static93.aClass33_11);
				Static93.aClass33_11 = null;
			}
		}
		@Pc(671) Class33 local671;
		if (Static135.aClass33_13 != null) {
			Static142.method2373(Static135.aClass33_13);
			Static21.anInt3035++;
			if (Static85.anInt676 > anInt1579 + 5 || anInt1579 - 5 > Static85.anInt676 || Static96.anInt2348 + 5 < Static149.anInt3582 || Static96.anInt2348 - 5 > Static149.anInt3582) {
				Static13.aBoolean12 = true;
			}
			if (Static56.anInt1508 == 0) {
				if (Static13.aBoolean12 && Static21.anInt3035 >= 5) {
					if (Static135.aClass33_13 == Static27.aClass33_1 && Static53.anInt1393 != Static52.anInt1392) {
						local671 = Static135.aClass33_13;
						@Pc(673) byte local673 = 0;
						if (Static127.anInt3020 == 1 && local671.anInt1432 == 206) {
							local673 = 1;
						}
						if (local671.anIntArray142[Static52.anInt1392] <= 0) {
							local673 = 0;
						}
						if (Static100.method1649(Static157.method2541(local671))) {
							local94 = Static52.anInt1392;
							local92 = Static53.anInt1393;
							local671.anIntArray142[local94] = local671.anIntArray142[local92];
							local671.anIntArray138[local94] = local671.anIntArray138[local92];
							local671.anIntArray142[local92] = -1;
							local671.anIntArray138[local92] = 0;
						} else if (local673 == 1) {
							local92 = Static53.anInt1393;
							local94 = Static52.anInt1392;
							while (local94 != local92) {
								if (local94 < local92) {
									local671.method1025(local92 - 1, local92);
									local92--;
								} else if (local92 < local94) {
									local671.method1025(local92 + 1, local92);
									local92++;
								}
							}
						} else {
							local671.method1025(Static52.anInt1392, Static53.anInt1393);
						}
						Static133.aClass3_Sub4_Sub1_3.method233(81);
						Static133.aClass3_Sub4_Sub1_3.method206(local673);
						Static133.aClass3_Sub4_Sub1_3.method219(Static135.aClass33_13.anInt1434);
						Static133.aClass3_Sub4_Sub1_3.method198(Static53.anInt1393);
						Static133.aClass3_Sub4_Sub1_3.method170(Static52.anInt1392);
					}
				} else if ((Static167.anInt734 == 1 || Static25.method2912(Static87.anInt2129 - 1)) && Static87.anInt2129 > 2) {
					Static57.method1071();
				} else if (Static87.anInt2129 > 0) {
					Static102.method1679(Static87.anInt2129 - 1);
				}
				Static135.aClass33_13 = null;
				Static99.anInt2410 = 10;
				Static127.anInt3013 = 0;
			}
		}
		Static42.aClass33_3 = null;
		Static64.aBoolean63 = false;
		Static182.anInt4017 = 0;
		Static84.aBoolean88 = false;
		@Pc(861) Class33 local861 = Static128.aClass33_12;
		local671 = Static69.aClass33_6;
		Static69.aClass33_6 = null;
		Static128.aClass33_12 = null;
		while (Static95.method1573() && Static182.anInt4017 < 128) {
			Static73.anIntArray175[Static182.anInt4017] = Static2.anInt25;
			Static127.anIntArray337[Static182.anInt4017] = Static78.anInt2403;
			Static182.anInt4017++;
		}
		if (Static85.anInt674 != -1) {
			Static151.method2491(765, 503, 0, 0, 0, Static85.anInt674, 0);
		}
		Static178.anInt3928++;
		while (true) {
			@Pc(909) Class3_Sub14 local909;
			@Pc(925) Class33 local925;
			@Pc(914) Class33 local914;
			do {
				local909 = (Class3_Sub14) Static177.aClass59_15.method1733();
				if (local909 == null) {
					while (true) {
						do {
							local909 = (Class3_Sub14) Static51.aClass59_4.method1733();
							if (local909 == null) {
								while (true) {
									do {
										local909 = (Class3_Sub14) Static150.aClass59_12.method1733();
										if (local909 == null) {
											if (Static63.aClass33_5 != null) {
												Static125.method2149();
											}
											if (Static117.anInt2774 != -1) {
												local94 = Static117.anInt2786;
												local92 = Static117.anInt2774;
												@Pc(1079) boolean local1079 = Static6.method100(0, true, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 0, 0, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local94, 0, 0, 0, local92);
												if (local1079) {
													Static182.anInt4022 = 1;
													Static13.anInt356 = Static77.anInt1923;
													Static23.anInt542 = 0;
													Static4.anInt3715 = Static48.anInt1329;
												}
												Static117.anInt2774 = -1;
											}
											Static133.method2262();
											if (Static69.aClass33_6 != local671) {
												if (local671 != null) {
													Static142.method2373(local671);
												}
												if (Static69.aClass33_6 != null) {
													Static142.method2373(Static69.aClass33_6);
												}
											}
											if (Static128.aClass33_12 != local861 && Static98.anInt2375 == Static19.anInt445) {
												if (local861 != null) {
													Static142.method2373(local861);
												}
												if (Static128.aClass33_12 != null) {
													Static142.method2373(Static128.aClass33_12);
												}
											}
											if (Static128.aClass33_12 == null) {
												if (Static98.anInt2375 > 0) {
													Static98.anInt2375--;
												}
											} else if (Static19.anInt445 > Static98.anInt2375) {
												Static98.anInt2375++;
												if (Static19.anInt445 == Static98.anInt2375) {
													Static142.method2373(Static128.aClass33_12);
												}
											}
											Static71.method1214();
											if (Static123.aBoolean122) {
												Static72.method1219();
											}
											for (local92 = 0; local92 < 5; local92++) {
												@Pc(1176) int local1176 = Static81.anIntArray203[local92]++;
											}
											local94 = Static27.method448();
											local96 = Static44.method876();
											if (local94 > 4500 && local96 > 4500) {
												Static135.anInt3150 = 250;
												Static70.method1205(4000);
												Static133.aClass3_Sub4_Sub1_3.method233(69);
											}
											Static133.anInt3108++;
											Static14.anInt371++;
											Static113.anInt2127++;
											if (Static113.anInt2127 > 500) {
												Static113.anInt2127 = 0;
												local112 = (int) (Math.random() * 8.0D);
												if ((local112 & 0x2) == 2) {
													Static20.anInt514 += Static68.anInt1772;
												}
												if ((local112 & 0x1) == 1) {
													Static146.anInt3350 += Static56.anInt1521;
												}
												if ((local112 & 0x4) == 4) {
													Static142.anInt3266 += Static7.anInt139;
												}
											}
											if (Static20.anInt514 < -55) {
												Static68.anInt1772 = 2;
											}
											if (Static146.anInt3350 < -50) {
												Static56.anInt1521 = 2;
											}
											if (Static133.anInt3108 > 500) {
												Static133.anInt3108 = 0;
												local112 = (int) (Math.random() * 8.0D);
												if ((local112 & 0x1) == 1) {
													Static81.anInt2039 += Static18.anInt426;
												}
												if ((local112 & 0x2) == 2) {
													Static172.anInt3773 += Static12.anInt3963;
												}
											}
											if (Static142.anInt3266 < -40) {
												Static7.anInt139 = 1;
											}
											if (Static81.anInt2039 < -60) {
												Static18.anInt426 = 2;
											}
											if (Static20.anInt514 > 55) {
												Static68.anInt1772 = -2;
											}
											if (Static172.anInt3773 < -20) {
												Static12.anInt3963 = 1;
											}
											if (Static142.anInt3266 > 40) {
												Static7.anInt139 = -1;
											}
											if (Static81.anInt2039 > 60) {
												Static18.anInt426 = -2;
											}
											if (Static146.anInt3350 > 50) {
												Static56.anInt1521 = -2;
											}
											if (Static172.anInt3773 > 10) {
												Static12.anInt3963 = -1;
											}
											if (Static14.anInt371 > 50) {
												Static133.aClass3_Sub4_Sub1_3.method233(168);
											}
											try {
												if (Static129.aClass1_3 != null && Static133.aClass3_Sub4_Sub1_3.anInt232 > 0) {
													Static129.aClass1_3.method6(Static133.aClass3_Sub4_Sub1_3.aByteArray5, Static133.aClass3_Sub4_Sub1_3.anInt232);
													Static14.anInt371 = 0;
													Static133.aClass3_Sub4_Sub1_3.anInt232 = 0;
													return;
												}
												return;
											} catch (@Pc(1383) IOException local1383) {
												Static119.method2035();
												return;
											}
										}
										local914 = local909.aClass33_10;
										if (local914.anInt1468 < 0) {
											break;
										}
										local925 = Static179.method2873(local914.anInt1479);
									} while (local925 == null || local925.aClass33Array2 == null || local914.anInt1468 >= local925.aClass33Array2.length || local925.aClass33Array2[local914.anInt1468] != local914);
									Static71.method1217(local909);
								}
							}
							local914 = local909.aClass33_10;
							if (local914.anInt1468 < 0) {
								break;
							}
							local925 = Static179.method2873(local914.anInt1479);
						} while (local925 == null || local925.aClass33Array2 == null || local925.aClass33Array2.length <= local914.anInt1468 || local925.aClass33Array2[local914.anInt1468] != local914);
						Static71.method1217(local909);
					}
				}
				local914 = local909.aClass33_10;
				if (local914.anInt1468 < 0) {
					break;
				}
				local925 = Static179.method2873(local914.anInt1479);
			} while (local925 == null || local925.aClass33Array2 == null || local925.aClass33Array2.length <= local914.anInt1468 || local925.aClass33Array2[local914.anInt1468] != local914);
			Static71.method1217(local909);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)I")
	public static int method1094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class3_Sub2_Sub3_Sub4.anIntArray346[arg3 * 1024 / arg1] >> 1;
		return (arg2 * (65536 - local21) >> 16) + (arg0 * local21 >> 16);
	}
}
