import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_12;

	@OriginalMember(owner = "client!cd", name = "wb", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_13;

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "Lclient!u;")
	public static Class74 aClass74_398 = Static72.method1077("scape main");

	@OriginalMember(owner = "client!cd", name = "db", descriptor = "Lclient!u;")
	public static Class74 aClass74_399 = Static72.method1077("huffman");

	@OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
	public static int anInt401 = -1;

	@OriginalMember(owner = "client!cd", name = "hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_400 = Static72.method1077("overlay_multiway");

	@OriginalMember(owner = "client!cd", name = "rb", descriptor = "Lclient!e;")
	public static Class16 aClass16_21 = new Class16(128);

	@OriginalMember(owner = "client!cd", name = "xb", descriptor = "I")
	public static int anInt415 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIBIII)V")
	public static void method334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg4 < 1 || arg1 > 102 || arg4 > 102) {
			return;
		}
		if (Static84.aBoolean73 && arg5 != Static117.anInt2529) {
			return;
		}
		@Pc(41) int local41 = 0;
		if (arg2 == 0) {
			local41 = Static84.aClass69_1.method1638(arg5, arg1, arg4);
		}
		if (arg2 == 1) {
			local41 = Static84.aClass69_1.method1610(arg5, arg1, arg4);
		}
		if (arg2 == 2) {
			local41 = Static84.aClass69_1.method1632(arg5, arg1, arg4);
		}
		if (arg2 == 3) {
			local41 = Static84.aClass69_1.method1630(arg5, arg1, arg4);
		}
		@Pc(101) int local101;
		if (local41 != 0) {
			local101 = Static84.aClass69_1.method1617(arg5, arg1, arg4, local41);
			@Pc(105) int local105 = local101 & 0x1F;
			@Pc(111) int local111 = local41 >> 14 & 0x7FFF;
			@Pc(117) int local117 = local101 >> 6 & 0x3;
			@Pc(131) Class2_Sub2_Sub14 local131;
			if (arg2 == 0) {
				Static84.aClass69_1.method1625(arg5, arg1, arg4);
				local131 = Static2.method19(local111);
				if (local131.anInt2242 != 0) {
					Static50.aClass55Array1[arg5].method1272(arg1, local105, arg4, local131.aBoolean93, local117);
				}
			}
			if (arg2 == 1) {
				Static84.aClass69_1.method1647(arg5, arg1, arg4);
			}
			if (arg2 == 2) {
				Static84.aClass69_1.method1629(arg5, arg1, arg4);
				local131 = Static2.method19(local111);
				if (local131.anInt2279 + arg1 > 103 || arg4 + local131.anInt2279 > 103 || arg1 + local131.anInt2259 > 103 || local131.anInt2259 + arg4 > 103) {
					return;
				}
				if (local131.anInt2242 != 0) {
					Static50.aClass55Array1[arg5].method1275(local117, local131.anInt2259, arg1, arg4, local131.anInt2279, local131.aBoolean93);
				}
			}
			if (arg2 == 3) {
				Static84.aClass69_1.method1657(arg5, arg1, arg4);
				local131 = Static2.method19(local111);
				if (local131.anInt2242 == 1) {
					Static50.aClass55Array1[arg5].method1277(arg1, arg4);
				}
			}
		}
		if (arg0 < 0) {
			return;
		}
		local101 = arg5;
		if (arg5 < 3 && (Static17.aByteArrayArrayArray1[1][arg1][arg4] & 0x2) == 2) {
			local101 = arg5 + 1;
		}
		Static43.method684(arg5, arg6, arg1, arg4, Static84.aClass69_1, arg0, arg3, local101, Static50.aClass55Array1[arg5]);
		return;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method336() {
		Static41.method671();
		if (Static126.anInt2857 == 1) {
			Static85.aClass2_Sub2_Sub1_Sub2Array9[Static38.anInt929 / 100].method213(Static75.anInt1601 - 8 - 4, Static124.anInt2729 + -4 + -8);
		}
		if (Static126.anInt2857 == 2) {
			Static85.aClass2_Sub2_Sub1_Sub2Array9[Static38.anInt929 / 100 + 4].method213(Static75.anInt1601 - 12, Static124.anInt2729 + -8 + -4);
		}
		if (Static79.anInt1754 != -1) {
			Static91.method1338(Static79.anInt1754);
			Static85.method1295(4, 334, 512, Static79.anInt1754);
		}
		if (Static90.anInt1905 != -1) {
			Static91.method1338(Static90.anInt1905);
			Static85.method1295(0, 334, 512, Static90.anInt1905);
		}
		Static67.method1025();
		if (!Static109.aBoolean103) {
			Static63.method1003();
			Static8.method167();
		} else if (Static78.anInt1701 == 0) {
			Static52.method877();
		}
		if (Static119.anInt2548 == 1) {
			Static1.aClass2_Sub2_Sub1_Sub2_6.method213(472, 296);
		}
		@Pc(128) int local128;
		if (Static87.aBoolean50) {
			@Pc(106) byte local106 = 20;
			Static77.aClass2_Sub2_Sub1_Sub3_9.method303(Static91.method1340(new Class74[] { Static102.aClass74_1463, Static56.method940(Static99.anInt2121) }), 20, 16776960);
			@Pc(127) int local127 = 16776960;
			local128 = local106 + 15;
			@Pc(130) Runtime local130 = Runtime.getRuntime();
			@Pc(140) int local140 = (int) ((local130.totalMemory() - local130.freeMemory()) / 1024L);
			if (local140 > 32768 && Static84.aBoolean73) {
				local127 = 16711680;
			}
			if (local140 > 65536 && !Static84.aBoolean73) {
				local127 = 16711680;
			}
			Static77.aClass2_Sub2_Sub1_Sub3_9.method303(Static91.method1340(new Class74[] { Static99.aClass74_1423, Static56.method940(local140), Static47.aClass74_801 }), 35, local127);
			local128 += 15;
			if (Static107.aBoolean100) {
				Static77.aClass2_Sub2_Sub1_Sub3_9.method303(Static70.aClass74_1090, 50, 16711680);
				local128 += 15;
				Static107.aBoolean100 = false;
			}
			if (Static79.aBoolean71) {
				Static77.aClass2_Sub2_Sub1_Sub3_9.method303(Static48.aClass74_840, local128, 16711680);
				Static79.aBoolean71 = false;
				local128 += 15;
			}
			if (Static109.aBoolean104) {
				Static77.aClass2_Sub2_Sub1_Sub3_9.method303(Static56.aClass74_952, local128, 16711680);
				Static109.aBoolean104 = false;
				local128 += 15;
			}
		}
		if (Static54.anInt1332 == 0) {
			return;
		}
		local128 = Static54.anInt1332 / 50;
		@Pc(236) int local236 = local128 / 60;
		local128 %= 60;
		if (local128 >= 10) {
			Static77.aClass2_Sub2_Sub1_Sub3_9.method308(Static91.method1340(new Class74[] { Static5.aClass74_51, Static56.method940(local236), Static119.aClass74_1590, Static56.method940(local128) }), 4, 329, 16776960);
		} else {
			Static77.aClass2_Sub2_Sub1_Sub3_9.method308(Static91.method1340(new Class74[] { Static5.aClass74_51, Static56.method940(local236), Static55.aClass74_429, Static56.method940(local128) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
	public static void method338() {
		while (true) {
			if (Static19.aClass2_Sub10_Sub1_1.method1535(Static16.anInt463) >= 11) {
				@Pc(17) int local17 = Static19.aClass2_Sub10_Sub1_1.method1538(11);
				if (local17 != 2047) {
					@Pc(22) boolean local22 = false;
					if (Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local17] == null) {
						Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local17] = new Class2_Sub2_Sub2_Sub1_Sub2();
						local22 = true;
						if (Static64.aClass2_Sub10Array1[local17] != null) {
							Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local17].method1868(Static64.aClass2_Sub10Array1[local17]);
						}
					}
					Static92.anIntArray267[Static10.anInt320++] = local17;
					@Pc(58) Class2_Sub2_Sub2_Sub1_Sub2 local58 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local17];
					local58.anInt2681 = Static107.anInt2338;
					@Pc(66) int local66 = Static19.aClass2_Sub10_Sub1_1.method1538(5);
					@Pc(71) int local71 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
					if (local66 > 15) {
						local66 -= 32;
					}
					@Pc(82) int local82 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
					if (local82 == 1) {
						Static81.anIntArray255[Static107.anInt2342++] = local17;
					}
					@Pc(100) int local100 = Static120.anIntArray369[Static19.aClass2_Sub10_Sub1_1.method1538(3)];
					if (local22) {
						local58.anInt2720 = local100;
					}
					@Pc(110) int local110 = Static19.aClass2_Sub10_Sub1_1.method1538(5);
					if (local110 > 15) {
						local110 -= 32;
					}
					local58.method1867(local71 == 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0] + local66, local110 + Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0]);
					continue;
				}
			}
			Static19.aClass2_Sub10_Sub1_1.method1537();
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBIIIIIII[Lclient!ve;I)V")
	public static void method339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class2_Sub2_Sub17[] arg9, @OriginalArg(11) int arg10) {
		if (arg6 < arg1 || arg8 > arg10 || arg3 <= arg6 || arg4 <= arg10) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg9.length; local32++) {
			@Pc(38) Class2_Sub2_Sub17 local38 = arg9[local32];
			if (local38 != null && local38.anInt2803 == arg0 && (!local38.aBoolean125 || !Static63.method1002(local38))) {
				@Pc(65) int local65 = arg1 + local38.anInt2780 - arg5;
				@Pc(72) int local72 = arg8 + local38.anInt2834 - arg7;
				if (local38.anInt2777 == 8 && arg6 >= local65 && local72 <= arg10 && local38.anInt2810 + local65 > arg6 && local38.anInt2829 + local72 > arg10) {
					Static52.anInt1263 = local32;
				}
				if ((local38.anInt2799 >= 0 || local38.anInt2790 != 0) && local65 <= arg6 && arg10 >= local72 && local38.anInt2810 + local65 > arg6 && local38.anInt2829 + local72 > arg10) {
					if (local38.anInt2799 >= 0) {
						Static110.anInt2411 = local38.anInt2799;
					} else {
						Static110.anInt2411 = local32;
					}
				}
				if (local38.anInt2777 == 0) {
					if (!local38.aBoolean125 && Static63.method1002(local38) && !Static17.method402(arg2, local32)) {
						continue;
					}
					method339(local38.anInt2794, local65, arg2, local65 + local38.anInt2810, local38.anInt2829 + local72, local38.anInt2832, arg6, local38.anInt2836, local72, arg9, arg10);
					if (local38.aClass2_Sub2_Sub17Array2 != null) {
						method339(local38.anInt2794, local65, arg2, local65 + local38.anInt2810, local72 + local38.anInt2829, local38.anInt2832, arg6, local38.anInt2836, local72, local38.aClass2_Sub2_Sub17Array2, arg10);
					}
					if (local38.anInt2807 > local38.anInt2829 && !local38.aBoolean125) {
						Static75.method1103(arg2, arg10, local65 + local38.anInt2810, local72, arg6, local38, local38.anInt2829, local38.anInt2807);
					}
					if (!local38.aBoolean125) {
						continue;
					}
				}
				if (local38.anInt2828 == 1 && local65 <= arg6 && local72 <= arg10 && arg6 < local38.anInt2810 + local65 && local38.anInt2829 + local72 > arg10) {
					@Pc(279) boolean local279 = false;
					if (local38.anInt2796 != 0) {
						local279 = Static70.method1067(local38);
					}
					if (!local279) {
						Static79.method1250(local38.anInt2794, 0, Static97.aClass74_1736, local38.aClass74_1692, 0, 49);
					}
				}
				if (local38.anInt2828 == 2 && !Static6.aBoolean7 && arg6 >= local65 && arg10 >= local72 && local65 + local38.anInt2810 > arg6 && arg10 < local38.anInt2829 + local72) {
					@Pc(350) Class74 local350 = Static34.method601(local38);
					if (local350 != null) {
						Static79.method1250(local38.anInt2794, -1, Static91.method1340(new Class74[] { Static70.aClass74_1086, local38.aClass74_1691 }), local350, 0, 22);
					}
				}
				if (local38.anInt2828 == 3 && local65 <= arg6 && arg10 >= local72 && arg6 < local38.anInt2810 + local65 && arg10 < local38.anInt2829 + local72) {
					@Pc(426) byte local426;
					if (arg2 == 3) {
						local426 = 55;
					} else {
						local426 = 58;
					}
					Static79.method1250(local38.anInt2794, 0, Static97.aClass74_1736, Static126.aClass74_1708, 0, local426);
				}
				if (local38.anInt2828 == 4 && local65 <= arg6 && local72 <= arg10 && local65 + local38.anInt2810 > arg6 && local38.anInt2829 + local72 > arg10) {
					Static79.method1250(local38.anInt2794, 0, Static97.aClass74_1736, local38.aClass74_1692, 0, 44);
				}
				if (local38.anInt2828 == 5 && local65 <= arg6 && local72 <= arg10 && local38.anInt2810 + local65 > arg6 && local72 + local38.anInt2829 > arg10) {
					Static79.method1250(local38.anInt2794, 0, Static97.aClass74_1736, local38.aClass74_1692, 0, 21);
				}
				if (local38.anInt2828 == 6 && Static88.anInt1857 == -1 && arg6 >= local65 && local72 <= arg10 && arg6 < local65 + local38.anInt2810 && arg10 < local72 + local38.anInt2829) {
					Static79.method1250(local38.anInt2794, -1, Static97.aClass74_1736, local38.aClass74_1692, 0, 46);
				}
				@Pc(607) int local607;
				@Pc(601) int local601;
				if (local38.anInt2777 == 2) {
					local601 = 0;
					for (@Pc(603) int local603 = 0; local603 < local38.anInt2829; local603++) {
						for (local607 = 0; local607 < local38.anInt2810; local607++) {
							@Pc(619) int local619 = local607 * (local38.anInt2779 + 32) + local65;
							@Pc(629) int local629 = local72 + local603 * (local38.anInt2775 + 32);
							if (local601 < 20) {
								local629 += local38.anIntArray403[local601];
								local619 += local38.anIntArray401[local601];
							}
							if (local619 <= arg6 && arg10 >= local629 && arg6 < local619 + 32 && arg10 < local629 + 32) {
								Static106.anInt2333 = local601;
								Static128.anInt2898 = local38.anInt2794;
								if (local38.anIntArray402[local601] > 0) {
									@Pc(687) Class2_Sub2_Sub12 local687 = Static35.method1934(local38.anIntArray402[local601] - 1);
									if (Static40.anInt960 == 1 && Static81.method1261(Static19.method429(local38))) {
										if (Static78.anInt1699 != local38.anInt2794 || local601 != Static47.anInt1083) {
											Static79.method1250(local38.anInt2794, local601, Static91.method1340(new Class74[] { Static121.aClass74_1619, Static124.aClass74_1662, local687.aClass74_1184 }), Static92.aClass74_1315, local687.anInt1717, 52);
										}
									} else if (!Static6.aBoolean7 || !Static81.method1261(Static19.method429(local38))) {
										@Pc(746) Class74[] local746 = local687.aClass74Array12;
										if (Static1.aBoolean85) {
											local746 = Static12.method276(local746);
										}
										@Pc(764) int local764;
										@Pc(814) byte local814;
										if (Static81.method1261(Static19.method429(local38))) {
											for (local764 = 4; local764 >= 3; local764--) {
												if (local746 != null && local746[local764] != null) {
													if (local764 == 3) {
														local814 = 47;
													} else {
														local814 = 31;
													}
													Static79.method1250(local38.anInt2794, local601, Static91.method1340(new Class74[] { Static55.aClass74_432, local687.aClass74_1184 }), local746[local764], local687.anInt1717, local814);
												} else if (local764 == 4) {
													Static79.method1250(local38.anInt2794, local601, Static91.method1340(new Class74[] { Static55.aClass74_432, local687.aClass74_1184 }), Static120.aClass74_1606, local687.anInt1717, 31);
												}
											}
										}
										if (Static125.method1893(Static19.method429(local38))) {
											Static79.method1250(local38.anInt2794, local601, Static91.method1340(new Class74[] { Static55.aClass74_432, local687.aClass74_1184 }), Static92.aClass74_1315, local687.anInt1717, 29);
										}
										if (Static81.method1261(Static19.method429(local38)) && local746 != null) {
											for (local764 = 2; local764 >= 0; local764--) {
												if (local746[local764] != null) {
													local814 = 0;
													if (local764 == 0) {
														local814 = 18;
													}
													if (local764 == 1) {
														local814 = 36;
													}
													if (local764 == 2) {
														local814 = 57;
													}
													Static79.method1250(local38.anInt2794, local601, Static91.method1340(new Class74[] { Static55.aClass74_432, local687.aClass74_1184 }), local746[local764], local687.anInt1717, local814);
												}
											}
										}
										local746 = local38.aClass74Array19;
										if (Static1.aBoolean85) {
											local746 = Static12.method276(local746);
										}
										if (local746 != null) {
											for (local764 = 4; local764 >= 0; local764--) {
												if (local746[local764] != null) {
													local814 = 0;
													if (local764 == 0) {
														local814 = 8;
													}
													if (local764 == 1) {
														local814 = 1;
													}
													if (local764 == 2) {
														local814 = 17;
													}
													if (local764 == 3) {
														local814 = 19;
													}
													if (local764 == 4) {
														local814 = 34;
													}
													Static79.method1250(local38.anInt2794, local601, Static91.method1340(new Class74[] { Static55.aClass74_432, local687.aClass74_1184 }), local746[local764], local687.anInt1717, local814);
												}
											}
										}
										Static79.method1250(local38.anInt2794, local601, Static91.method1340(new Class74[] { Static55.aClass74_432, local687.aClass74_1184 }), Static2.aClass74_27, local687.anInt1717, 1002);
									} else if ((Static65.anInt1451 & 0x10) == 16) {
										Static79.method1250(local38.anInt2794, local601, Static91.method1340(new Class74[] { Static4.aClass74_41, Static124.aClass74_1662, local687.aClass74_1184 }), Static25.aClass74_526, local687.anInt1717, 38);
									}
								}
							}
							local601++;
						}
					}
				}
				if (local38.aBoolean125) {
					if (Static6.aBoolean7) {
						if (Static78.method1222(Static19.method429(local38)) && (Static65.anInt1451 & 0x20) == 32 && local65 <= arg6 && local72 <= arg10 && local38.anInt2810 + local65 > arg6 && arg10 < local38.anInt2829 + local72) {
							Static79.method1250(local38.anInt2794, local38.anInt2782, Static91.method1340(new Class74[] { Static4.aClass74_41, Static19.aClass74_447, local38.aClass74_1689 }), Static25.aClass74_526, 0, 14);
						}
					} else if (arg6 >= local65 && arg10 >= local72 && arg6 < local38.anInt2810 + local65 && local72 + local38.anInt2829 > arg10) {
						@Pc(1235) Class74 local1235;
						for (local601 = 9; local601 >= 5; local601--) {
							local1235 = Static27.method509(local601, local38);
							if (local1235 != null) {
								Static79.method1250(local38.anInt2794, local38.anInt2782, local38.aClass74_1689, local1235, local601 + 1, 26);
							}
						}
						local1235 = Static34.method601(local38);
						if (local1235 != null) {
							Static79.method1250(local38.anInt2794, local38.anInt2782, local38.aClass74_1689, local1235, 0, 22);
						}
						for (local607 = 4; local607 >= 0; local607--) {
							@Pc(1288) Class74 local1288 = Static27.method509(local607, local38);
							if (local1288 != null) {
								Static79.method1250(local38.anInt2794, local38.anInt2782, local38.aClass74_1689, local1288, local607 + 1, 26);
							}
						}
						if (Static46.method749(Static19.method429(local38))) {
							Static79.method1250(local38.anInt2794, local38.anInt2782, Static97.aClass74_1736, local38.aClass74_1692, 0, 46);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!h;Z)V")
	public static void method340(@OriginalArg(0) Class31 arg0) {
		Static105.aClass31_1 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	public static void method342() {
		aClass16_21 = null;
		aClass74_399 = null;
		aClass2_Sub2_Sub1_Sub1_13 = null;
		aClass2_Sub2_Sub1_Sub1_12 = null;
		aClass74_398 = null;
		aClass74_400 = null;
	}
}
