import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
	public static int anInt4700 = 0;

	@OriginalMember(owner = "client!wi", name = "bb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1331 = Static81.method1507("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!wi", name = "T", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1330 = aClass24_1331;

	@OriginalMember(owner = "client!wi", name = "Z", descriptor = "I")
	public static int anInt4707 = 0;

	@OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
	public static final int anInt4708 = 0;

	@OriginalMember(owner = "client!wi", name = "cb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1332 = Static81.method1507("m");

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([BIIIB[Lclient!ue;I)V")
	public static void method3581(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class93[] arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (local11 + arg1 > 0 && arg1 + local11 < 103 && arg3 + local15 > 0 && local15 + arg3 < 103) {
						arg4[local7].anIntArrayArray33[local11 + arg1][arg3 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(87) Class1_Sub7 local87 = new Class1_Sub7(arg0);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					Static110.method1904(arg5, 0, local98 + arg1, arg3 + local102, arg2, local87, local15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V")
	public static void method3582() {
		if (Static48.anInt1203 > 0) {
			Static48.anInt1203--;
		}
		if (Static150.anInt3361 > 1) {
			Static150.anInt3361--;
		}
		if (Static75.aBoolean230) {
			Static75.aBoolean230 = false;
			Static147.method2537();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static174.method2997(); local29++) {
		}
		if (Static160.anInt4679 != 30) {
			return;
		}
		Static65.method1313(Static176.aClass1_Sub7_Sub1_34);
		@Pc(53) Object local53 = Static147.aClass85_1.anObject4;
		@Pc(83) int local83;
		@Pc(72) int local72;
		@Pc(85) int local85;
		@Pc(102) int local102;
		@Pc(121) int local121;
		synchronized (Static147.aClass85_1.anObject4) {
			if (!Static116.aBoolean119) {
				Static147.aClass85_1.anInt3582 = 0;
			} else if (Static170.anInt3792 != 0 || Static147.aClass85_1.anInt3582 >= 40) {
				Static176.aClass1_Sub7_Sub1_34.method2808(178);
				local72 = 0;
				Static176.aClass1_Sub7_Sub1_34.method2753(0);
				local83 = Static176.aClass1_Sub7_Sub1_34.anInt3592;
				for (local85 = 0; Static147.aClass85_1.anInt3582 > local85 && Static176.aClass1_Sub7_Sub1_34.anInt3592 - local83 < 240; local85++) {
					local72++;
					local102 = Static147.aClass85_1.anIntArray301[local85];
					if (local102 < 0) {
						local102 = 0;
					} else if (local102 > 502) {
						local102 = 502;
					}
					local121 = Static147.aClass85_1.anIntArray300[local85];
					if (local121 < 0) {
						local121 = 0;
					} else if (local121 > 764) {
						local121 = 764;
					}
					@Pc(141) int local141 = local102 * 765 + local121;
					if (Static147.aClass85_1.anIntArray301[local85] == -1 && Static147.aClass85_1.anIntArray300[local85] == -1) {
						local102 = -1;
						local121 = -1;
						local141 = 524287;
					}
					if (Static191.anInt4296 != local121 || Static29.anInt766 != local102) {
						@Pc(182) int local182 = local121 - Static191.anInt4296;
						Static191.anInt4296 = local121;
						@Pc(188) int local188 = local102 - Static29.anInt766;
						Static29.anInt766 = local102;
						if (Static211.anInt4670 < 8 && local182 >= -32 && local182 <= 31 && local188 >= -32 && local188 <= 31) {
							local188 += 32;
							local182 += 32;
							Static176.aClass1_Sub7_Sub1_34.method2775(local188 + (local182 << 6) + (Static211.anInt4670 << 12));
							Static211.anInt4670 = 0;
						} else if (Static211.anInt4670 < 8) {
							Static176.aClass1_Sub7_Sub1_34.method2748(local141 + (Static211.anInt4670 << 19) + 8388608);
							Static211.anInt4670 = 0;
						} else {
							Static176.aClass1_Sub7_Sub1_34.method2754(local141 + (Static211.anInt4670 << 19) - 1073741824);
							Static211.anInt4670 = 0;
						}
					} else if (Static211.anInt4670 < 2047) {
						Static211.anInt4670++;
					}
				}
				Static176.aClass1_Sub7_Sub1_34.method2773(Static176.aClass1_Sub7_Sub1_34.anInt3592 - local83);
				if (Static147.aClass85_1.anInt3582 > local72) {
					Static147.aClass85_1.anInt3582 -= local72;
					for (local102 = 0; local102 < Static147.aClass85_1.anInt3582; local102++) {
						Static147.aClass85_1.anIntArray300[local102] = Static147.aClass85_1.anIntArray300[local72 + local102];
						Static147.aClass85_1.anIntArray301[local102] = Static147.aClass85_1.anIntArray301[local102 + local72];
					}
				} else {
					Static147.aClass85_1.anInt3582 = 0;
				}
			}
		}
		if (Static170.anInt3792 != 0) {
			local72 = Static157.anInt3462;
			@Pc(347) long local347 = (Static2.aLong6 - Static169.aLong122) / 50L;
			Static169.aLong122 = Static2.aLong6;
			if (local72 < 0) {
				local72 = 0;
			} else if (local72 > 764) {
				local72 = 764;
			}
			if (local347 > 4095L) {
				local347 = 4095L;
			}
			local83 = Static92.anInt2141;
			if (local83 < 0) {
				local83 = 0;
			} else if (local83 > 502) {
				local83 = 502;
			}
			local85 = local83 * 765 + local72;
			local121 = (int) local347;
			@Pc(395) byte local395 = 0;
			if (Static170.anInt3792 == 2) {
				local395 = 1;
			}
			Static176.aClass1_Sub7_Sub1_34.method2808(204);
			Static176.aClass1_Sub7_Sub1_34.method2787((local395 << 19) + (local121 << 20) + local85);
		}
		if (Static59.anInt1435 > 0) {
			Static59.anInt1435--;
		}
		if (Static116.aBooleanArray11[96] || Static116.aBooleanArray11[97] || Static116.aBooleanArray11[98] || Static116.aBooleanArray11[99]) {
			Static193.aBoolean202 = true;
		}
		if (Static193.aBoolean202 && Static59.anInt1435 <= 0) {
			Static193.aBoolean202 = false;
			Static59.anInt1435 = 20;
			Static176.aClass1_Sub7_Sub1_34.method2808(177);
			Static176.aClass1_Sub7_Sub1_34.method2789(Static57.anInt1425);
			Static176.aClass1_Sub7_Sub1_34.method2758(Static66.anInt1655);
		}
		if (Static161.aBoolean168 && !Static26.aBoolean30) {
			Static26.aBoolean30 = true;
			Static176.aClass1_Sub7_Sub1_34.method2808(230);
			Static176.aClass1_Sub7_Sub1_34.method2753(1);
		}
		if (!Static161.aBoolean168 && Static26.aBoolean30) {
			Static26.aBoolean30 = false;
			Static176.aClass1_Sub7_Sub1_34.method2808(230);
			Static176.aClass1_Sub7_Sub1_34.method2753(0);
		}
		Static94.method1692();
		if (Static160.anInt4679 != 30) {
			return;
		}
		Static83.method1546();
		Static3.method93();
		Static192.anInt4303++;
		if (Static192.anInt4303 > 750) {
			Static147.method2537();
			return;
		}
		Static67.method1326();
		Static4.method3513();
		Static137.method2407();
		if (Static44.aClass98_5 != null) {
			Static135.method2298();
		}
		Static92.anInt2138++;
		if (Static1.anInt63 != 0) {
			Static178.anInt3964 += 20;
			if (Static178.anInt3964 >= 400) {
				Static1.anInt63 = 0;
			}
		}
		if (Static32.aClass98_3 != null) {
			Static201.anInt4501++;
			if (Static201.anInt4501 >= 15) {
				Static199.method2199(Static32.aClass98_3);
				Static32.aClass98_3 = null;
			}
		}
		@Pc(650) Class98 local650;
		if (Static194.aClass98_17 != null) {
			Static199.method2199(Static194.aClass98_17);
			Static60.anInt3652++;
			if (Static4.anInt4611 + 5 < Static24.anInt661 || Static24.anInt661 < Static4.anInt4611 - 5 || Static7.anInt174 > Static54.anInt3866 + 5 || Static54.anInt3866 - 5 > Static7.anInt174) {
				Static138.aBoolean146 = true;
			}
			if (Static188.anInt4176 == 0) {
				if (Static138.aBoolean146 && Static60.anInt3652 >= 5) {
					if (Static194.aClass98_17 == Static35.aClass98_16 && Static28.anInt729 != Static73.anInt1769) {
						local650 = Static194.aClass98_17;
						@Pc(652) byte local652 = 0;
						if (Static144.anInt3253 == 1 && local650.anInt4351 == 206) {
							local652 = 1;
						}
						if (local650.anIntArray393[Static28.anInt729] <= 0) {
							local652 = 0;
						}
						if (Static123.method2076(Static105.method1831(local650))) {
							local72 = Static28.anInt729;
							local83 = Static73.anInt1769;
							local650.anIntArray393[local72] = local650.anIntArray393[local83];
							local650.anIntArray386[local72] = local650.anIntArray386[local83];
							local650.anIntArray393[local83] = -1;
							local650.anIntArray386[local83] = 0;
						} else if (local652 == 1) {
							local83 = Static73.anInt1769;
							local72 = Static28.anInt729;
							while (local83 != local72) {
								if (local72 < local83) {
									local650.method3330(local83, local83 - 1);
									local83--;
								} else if (local83 < local72) {
									local650.method3330(local83, local83 + 1);
									local83++;
								}
							}
						} else {
							local650.method3330(Static73.anInt1769, Static28.anInt729);
						}
						Static176.aClass1_Sub7_Sub1_34.method2808(89);
						Static176.aClass1_Sub7_Sub1_34.method2744(local652);
						Static176.aClass1_Sub7_Sub1_34.method2789(Static73.anInt1769);
						Static176.aClass1_Sub7_Sub1_34.method2762(Static194.aClass98_17.anInt4357);
						Static176.aClass1_Sub7_Sub1_34.method2775(Static28.anInt729);
					}
				} else if ((Static181.anInt4036 == 1 || Static34.method664(Static156.anInt3437 - 1)) && Static156.anInt3437 > 2) {
					Static12.method295();
				} else if (Static156.anInt3437 > 0) {
					Static63.method1279(Static156.anInt3437 - 1);
				}
				Static170.anInt3792 = 0;
				Static194.aClass98_17 = null;
				Static201.anInt4501 = 10;
			}
		}
		Static179.aBoolean186 = false;
		local650 = Static200.aClass98_20;
		Static161.anInt3572 = 0;
		Static200.aClass98_20 = null;
		Static181.aClass98_15 = null;
		Static149.aBoolean154 = false;
		@Pc(832) Class98 local832 = Static44.aClass98_6;
		Static44.aClass98_6 = null;
		while (Static28.method547() && Static161.anInt3572 < 128) {
			Static156.anIntArray296[Static161.anInt3572] = Static122.anInt2710;
			Static37.anIntArray88[Static161.anInt3572] = Static60.anInt3600;
			Static161.anInt3572++;
		}
		Static44.aClass98_5 = null;
		if (Static177.anInt3924 != -1) {
			Static96.method1704(0, 0, Static177.anInt3924, Static147.anInt3283, 0, Static116.anInt2589, 0);
		}
		Static60.anInt3643++;
		while (true) {
			@Pc(877) Class1_Sub16 local877;
			@Pc(893) Class98 local893;
			@Pc(882) Class98 local882;
			do {
				local877 = (Class1_Sub16) Static91.aClass87_15.method2825();
				if (local877 == null) {
					while (true) {
						do {
							local877 = (Class1_Sub16) Static49.aClass87_9.method2825();
							if (local877 == null) {
								while (true) {
									do {
										local877 = (Class1_Sub16) Static165.aClass87_24.method2825();
										if (local877 == null) {
											if (Static107.aBoolean115 && Static44.aClass98_5 == null) {
												Static107.aBoolean115 = false;
											}
											if (Static208.aClass98_21 != null) {
												Static123.method2074();
											}
											if (Static28.anInt730 != -1) {
												local83 = Static28.anInt730;
												local72 = Static137.anInt3092;
												@Pc(1048) boolean local1048 = Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 0, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], true, local72, local83, 0, 0, 0);
												Static28.anInt730 = -1;
												if (local1048) {
													Static178.anInt3964 = 0;
													Static1.anInt63 = 1;
													Static79.anInt1889 = Static92.anInt2141;
													Static192.anInt4305 = Static157.anInt3462;
												}
											}
											Static36.method687();
											if (Static200.aClass98_20 != local650) {
												if (local650 != null) {
													Static199.method2199(local650);
												}
												if (Static200.aClass98_20 != null) {
													Static199.method2199(Static200.aClass98_20);
												}
											}
											if (Static44.aClass98_6 != local832 && Static158.anInt3507 == Static143.anInt3199) {
												if (local832 != null) {
													Static199.method2199(local832);
												}
												if (Static44.aClass98_6 != null) {
													Static199.method2199(Static44.aClass98_6);
												}
											}
											if (Static44.aClass98_6 == null) {
												if (Static158.anInt3507 > 0) {
													Static158.anInt3507--;
												}
											} else if (Static143.anInt3199 > Static158.anInt3507) {
												Static158.anInt3507++;
												if (Static158.anInt3507 == Static143.anInt3199) {
													Static199.method2199(Static44.aClass98_6);
												}
											}
											Static21.method479();
											if (Static78.aBoolean92) {
												Static102.method1755();
											}
											for (local83 = 0; local83 < 5; local83++) {
												@Pc(1132) int local1132 = Static40.anIntArray92[local83]++;
											}
											local72 = Static45.method843();
											local85 = Static165.method2814();
											if (local72 > 4500 && local85 > 4500) {
												Static48.anInt1203 = 250;
												Static135.method2294(4000);
												Static176.aClass1_Sub7_Sub1_34.method2808(157);
											}
											Static44.anInt1134++;
											Static198.anInt4436++;
											Static3.anInt113++;
											if (Static3.anInt113 > 500) {
												Static3.anInt113 = 0;
												local102 = (int) (Math.random() * 8.0D);
												if ((local102 & 0x4) == 4) {
													Static28.anInt732 += Static99.anInt2233;
												}
												if ((local102 & 0x1) == 1) {
													Static198.anInt4435 += Static201.anInt4510;
												}
												if ((local102 & 0x2) == 2) {
													Static29.anInt759 += Static8.anInt214;
												}
											}
											if (Static29.anInt759 < -55) {
												Static8.anInt214 = 2;
											}
											if (Static198.anInt4435 < -50) {
												Static201.anInt4510 = 2;
											}
											if (Static198.anInt4435 > 50) {
												Static201.anInt4510 = -2;
											}
											if (Static28.anInt732 < -40) {
												Static99.anInt2233 = 1;
											}
											if (Static28.anInt732 > 40) {
												Static99.anInt2233 = -1;
											}
											if (Static29.anInt759 > 55) {
												Static8.anInt214 = -2;
											}
											if (Static198.anInt4436 > 500) {
												Static198.anInt4436 = 0;
												local102 = (int) (Math.random() * 8.0D);
												if ((local102 & 0x1) == 1) {
													Static115.anInt2586 += Static25.anInt669;
												}
												if ((local102 & 0x2) == 2) {
													Static192.anInt4308 += Static100.anInt2252;
												}
											}
											if (Static115.anInt2586 < -60) {
												Static25.anInt669 = 2;
											}
											if (Static192.anInt4308 < -20) {
												Static100.anInt2252 = 1;
											}
											if (Static115.anInt2586 > 60) {
												Static25.anInt669 = -2;
											}
											if (Static192.anInt4308 > 10) {
												Static100.anInt2252 = -1;
											}
											if (Static44.anInt1134 > 50) {
												Static176.aClass1_Sub7_Sub1_34.method2808(4);
											}
											try {
												if (Static91.aClass53_2 != null && Static176.aClass1_Sub7_Sub1_34.anInt3592 > 0) {
													Static91.aClass53_2.method1717(Static176.aClass1_Sub7_Sub1_34.aByteArray38, Static176.aClass1_Sub7_Sub1_34.anInt3592);
													Static44.anInt1134 = 0;
													Static176.aClass1_Sub7_Sub1_34.anInt3592 = 0;
													return;
												}
												return;
											} catch (@Pc(1350) IOException local1350) {
												Static147.method2537();
												return;
											}
										}
										local882 = local877.aClass98_13;
										if (local882.anInt4379 < 0) {
											break;
										}
										local893 = Static188.method3229(local882.anInt4424);
									} while (local893 == null || local893.aClass98Array3 == null || local882.anInt4379 >= local893.aClass98Array3.length || local893.aClass98Array3[local882.anInt4379] != local882);
									Static131.method2258(local877);
								}
							}
							local882 = local877.aClass98_13;
							if (local882.anInt4379 < 0) {
								break;
							}
							local893 = Static188.method3229(local882.anInt4424);
						} while (local893 == null || local893.aClass98Array3 == null || local882.anInt4379 >= local893.aClass98Array3.length || local893.aClass98Array3[local882.anInt4379] != local882);
						Static131.method2258(local877);
					}
				}
				local882 = local877.aClass98_13;
				if (local882.anInt4379 < 0) {
					break;
				}
				local893 = Static188.method3229(local882.anInt4424);
			} while (local893 == null || local893.aClass98Array3 == null || local882.anInt4379 >= local893.aClass98Array3.length || local893.aClass98Array3[local882.anInt4379] != local882);
			Static131.method2258(local877);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BZ)V")
	public static void method3583(@OriginalArg(1) boolean arg0) {
		Static130.aBoolean137 = arg0;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(45) int local45;
		@Pc(56) int local56;
		@Pc(156) int local156;
		@Pc(160) int local160;
		if (!Static130.aBoolean137) {
			local20 = Static192.aClass1_Sub7_Sub1_31.method2765();
			local24 = Static192.aClass1_Sub7_Sub1_31.method2765();
			local28 = Static192.aClass1_Sub7_Sub1_31.method2794();
			local32 = (Static80.anInt1916 - Static192.aClass1_Sub7_Sub1_31.anInt3592) / 16;
			Static57.anIntArrayArray12 = new int[local32][4];
			for (local36 = 0; local36 < local32; local36++) {
				for (local41 = 0; local41 < 4; local41++) {
					Static57.anIntArrayArray12[local36][local41] = Static192.aClass1_Sub7_Sub1_31.method2793();
				}
			}
			local41 = Static192.aClass1_Sub7_Sub1_31.method2799();
			local45 = Static192.aClass1_Sub7_Sub1_31.method2765();
			@Pc(387) boolean local387 = false;
			Static116.aByteArrayArray7 = new byte[local32][];
			Static152.anIntArray284 = new int[local32];
			if ((local45 / 8 == 48 || local45 / 8 == 49) && local28 / 8 == 48) {
				local387 = true;
			}
			Static34.aByteArrayArray2 = new byte[local32][];
			Static169.anIntArray318 = new int[local32];
			Static73.anIntArray150 = new int[local32];
			if (local45 / 8 == 48 && local28 / 8 == 148) {
				local387 = true;
			}
			local32 = 0;
			for (local56 = (local45 - 6) / 8; local56 <= (local45 + 6) / 8; local56++) {
				for (local156 = (local28 - 6) / 8; local156 <= (local28 + 6) / 8; local156++) {
					local160 = (local56 << 8) + local156;
					if (!local387 || local156 != 49 && local156 != 149 && local156 != 147 && local56 != 50 && (local56 != 49 || local156 != 47)) {
						Static152.anIntArray284[local32] = local160;
						Static169.anIntArray318[local32] = Static184.aClass69_Sub1_139.method2205(Static63.method1281(new Class24[] { aClass24_1332, Static175.method3020(local56), Static72.aClass24_529, Static175.method3020(local156) }));
						Static73.anIntArray150[local32] = Static184.aClass69_Sub1_139.method2205(Static63.method1281(new Class24[] { Static127.aClass24_842, Static175.method3020(local56), Static72.aClass24_529, Static175.method3020(local156) }));
						local32++;
					}
				}
			}
			Static207.method3167(local28, local24, local45, local20, local41);
			return;
		}
		local20 = Static192.aClass1_Sub7_Sub1_31.method2799();
		local24 = Static192.aClass1_Sub7_Sub1_31.method2752();
		local28 = Static192.aClass1_Sub7_Sub1_31.method2752();
		local32 = Static192.aClass1_Sub7_Sub1_31.method2752();
		local36 = Static192.aClass1_Sub7_Sub1_31.method2796();
		Static192.aClass1_Sub7_Sub1_31.method2809();
		@Pc(49) int local49;
		for (local41 = 0; local41 < 4; local41++) {
			for (local45 = 0; local45 < 13; local45++) {
				for (local49 = 0; local49 < 13; local49++) {
					local56 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
					if (local56 == 1) {
						Static114.anIntArrayArrayArray6[local41][local45][local49] = Static192.aClass1_Sub7_Sub1_31.method2811(26);
					} else {
						Static114.anIntArrayArrayArray6[local41][local45][local49] = -1;
					}
				}
			}
		}
		Static192.aClass1_Sub7_Sub1_31.method2804();
		local45 = (Static80.anInt1916 - Static192.aClass1_Sub7_Sub1_31.anInt3592) / 16;
		Static57.anIntArrayArray12 = new int[local45][4];
		for (local49 = 0; local49 < local45; local49++) {
			for (local56 = 0; local56 < 4; local56++) {
				Static57.anIntArrayArray12[local49][local56] = Static192.aClass1_Sub7_Sub1_31.method2784();
			}
		}
		Static152.anIntArray284 = new int[local45];
		Static169.anIntArray318 = new int[local45];
		Static116.aByteArrayArray7 = new byte[local45][];
		Static34.aByteArrayArray2 = new byte[local45][];
		Static73.anIntArray150 = new int[local45];
		local45 = 0;
		for (local56 = 0; local56 < 4; local56++) {
			for (local156 = 0; local156 < 13; local156++) {
				for (local160 = 0; local160 < 13; local160++) {
					@Pc(170) int local170 = Static114.anIntArrayArrayArray6[local56][local156][local160];
					if (local170 != -1) {
						@Pc(179) int local179 = local170 >> 14 & 0x3FF;
						@Pc(185) int local185 = local170 >> 3 & 0x7FF;
						@Pc(195) int local195 = local185 / 8 + (local179 / 8 << 8);
						for (@Pc(197) int local197 = 0; local197 < local45; local197++) {
							if (local195 == Static152.anIntArray284[local197]) {
								local195 = -1;
								break;
							}
						}
						if (local195 != -1) {
							Static152.anIntArray284[local45] = local195;
							@Pc(234) int local234 = local195 >> 8 & 0xFF;
							@Pc(238) int local238 = local195 & 0xFF;
							Static169.anIntArray318[local45] = Static184.aClass69_Sub1_139.method2205(Static63.method1281(new Class24[] { aClass24_1332, Static175.method3020(local234), Static72.aClass24_529, Static175.method3020(local238) }));
							Static73.anIntArray150[local45] = Static184.aClass69_Sub1_139.method2205(Static63.method1281(new Class24[] { Static127.aClass24_842, Static175.method3020(local234), Static72.aClass24_529, Static175.method3020(local238) }));
							local45++;
						}
					}
				}
			}
		}
		Static207.method3167(local36, local28, local24, local32, local20);
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(III)J")
	public static long method3586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass96_1 == null ? 0L : local7.aClass96_1.aLong137;
	}
}
