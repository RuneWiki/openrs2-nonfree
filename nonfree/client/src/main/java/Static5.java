import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!b", name = "z", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_18;

	@OriginalMember(owner = "client!b", name = "bb", descriptor = "[Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2[] aClass6_Sub2_Sub2_Sub2Array12;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "Lclient!rc;")
	public static Class55 aClass55_880 = Static34.method846("Passwort: ");

	@OriginalMember(owner = "client!b", name = "L", descriptor = "Lclient!rc;")
	public static Class55 aClass55_881 = Static34.method846("Schlie-8en");

	@OriginalMember(owner = "client!b", name = "V", descriptor = "Lclient!rc;")
	private static Class55 aClass55_882 = Static34.method846("Loading friend list");

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "Lclient!rc;")
	public static Class55 aClass55_883 = Static34.method846("@gr3@");

	@OriginalMember(owner = "client!b", name = "wb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_884 = Static34.method846("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!b", name = "xb", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!b", name = "Jb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_886 = Static34.method846("Loading game screen )2 ");

	@OriginalMember(owner = "client!b", name = "Hb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_885 = aClass55_886;

	@OriginalMember(owner = "client!b", name = "Mb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_887 = aClass55_882;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!kb;I[Lclient!sb;)V")
	public static void method1472(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class57[] arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(28) int local28;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static43.aByteArrayArrayArray8[local3][local7][local11] & 0x1) == 1) {
						local28 = local3;
						if ((Static43.aByteArrayArrayArray8[1][local7][local11] & 0x2) == 2) {
							local28 = local3 - 1;
						}
						if (local28 >= 0) {
							arg1[local28].method1733(local7, local11);
						}
					}
				}
			}
		}
		Static72.anInt2120 += (int) (Math.random() * 5.0D) - 2;
		Static32.anInt1220 += (int) (Math.random() * 5.0D) - 2;
		if (Static32.anInt1220 < -8) {
			Static32.anInt1220 = -8;
		}
		if (Static32.anInt1220 > 8) {
			Static32.anInt1220 = 8;
		}
		if (Static72.anInt2120 < -16) {
			Static72.anInt2120 = -16;
		}
		if (Static72.anInt2120 > 16) {
			Static72.anInt2120 = 16;
		}
		@Pc(135) int local135;
		@Pc(137) int local137;
		@Pc(141) int local141;
		@Pc(164) int local164;
		@Pc(185) int local185;
		@Pc(198) int local198;
		@Pc(214) int local214;
		@Pc(202) int local202;
		@Pc(208) int local208;
		@Pc(231) int local231;
		@Pc(280) int local280;
		@Pc(500) int local500;
		@Pc(542) int local542;
		@Pc(651) int local651;
		@Pc(641) int local641;
		@Pc(676) int local676;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(125) byte[][] local125 = Static106.aByteArrayArrayArray14[local7];
			local28 = (int) Math.sqrt(5100.0D);
			local135 = local28 * 768 >> 8;
			for (local137 = 1; local137 < 103; local137++) {
				for (local141 = 1; local141 < 103; local141++) {
					local164 = Static6.anIntArrayArrayArray1[local7][local141 + 1][local137] - Static6.anIntArrayArrayArray1[local7][local141 - 1][local137];
					local185 = Static6.anIntArrayArrayArray1[local7][local141][local137 + 1] - Static6.anIntArrayArrayArray1[local7][local141][local137 - 1];
					local198 = (int) Math.sqrt((double) (local164 * local164 + local185 * local185 + 65536));
					local202 = 65536 / local198;
					local208 = (local185 << 8) / local198;
					local214 = (local164 << 8) / local198;
					local231 = (local208 * -50 + local202 * -10 + local214 * -50) / local135 + 96;
					local280 = (local125[local141][local137 + 1] >> 3) + (local125[local141][local137 - 1] >> 2) + (local125[local141 - 1][local137] >> 2) + (local125[local141 + 1][local137] >> 3) + (local125[local141][local137] >> 1);
					Static31.anIntArrayArray3[local141][local137] = local231 - local280;
				}
			}
			for (local141 = 0; local141 < 104; local141++) {
				Static51.anIntArray158[local141] = 0;
				Static35.anIntArray83[local141] = 0;
				Static101.anIntArray284[local141] = 0;
				Static110.anIntArray299[local141] = 0;
				Static9.anIntArray28[local141] = 0;
			}
			for (local164 = -5; local164 < 109; local164++) {
				for (local185 = 0; local185 < 104; local185++) {
					local198 = local164 + 5;
					@Pc(400) int local400;
					if (local198 >= 0 && local198 < 104) {
						local214 = Static20.aByteArrayArrayArray7[local7][local198][local185] & 0xFF;
						if (local214 > 0) {
							@Pc(364) Class6_Sub2_Sub1 local364 = Static3.method28(local214 - 1);
							Static51.anIntArray158[local185] += local364.anInt265;
							Static35.anIntArray83[local185] += local364.anInt276;
							Static101.anIntArray284[local185] += local364.anInt261;
							Static110.anIntArray299[local185] += local364.anInt272;
							local400 = Static9.anIntArray28[local185]++;
						}
					}
					local214 = local164 - 5;
					if (local214 >= 0 && local214 < 104) {
						local202 = Static20.aByteArrayArrayArray7[local7][local214][local185] & 0xFF;
						if (local202 > 0) {
							@Pc(433) Class6_Sub2_Sub1 local433 = Static3.method28(local202 - 1);
							Static51.anIntArray158[local185] -= local433.anInt265;
							Static35.anIntArray83[local185] -= local433.anInt276;
							Static101.anIntArray284[local185] -= local433.anInt261;
							Static110.anIntArray299[local185] -= local433.anInt272;
							local400 = Static9.anIntArray28[local185]--;
						}
					}
				}
				if (local164 >= 1 && local164 < 103) {
					local198 = 0;
					local214 = 0;
					local202 = 0;
					local231 = 0;
					local208 = 0;
					for (local280 = -5; local280 < 109; local280++) {
						local500 = local280 + 5;
						if (local500 >= 0 && local500 < 104) {
							local198 += Static51.anIntArray158[local500];
							local202 += Static101.anIntArray284[local500];
							local231 += Static9.anIntArray28[local500];
							local214 += Static35.anIntArray83[local500];
							local208 += Static110.anIntArray299[local500];
						}
						local542 = local280 - 5;
						if (local542 >= 0 && local542 < 104) {
							local208 -= Static110.anIntArray299[local542];
							local214 -= Static35.anIntArray83[local542];
							local231 -= Static9.anIntArray28[local542];
							local202 -= Static101.anIntArray284[local542];
							local198 -= Static51.anIntArray158[local542];
						}
						if (local280 >= 1 && local280 < 103 && (!Static90.aBoolean119 || (Static43.aByteArrayArrayArray8[0][local164][local280] & 0x2) != 0 || (Static43.aByteArrayArrayArray8[local7][local164][local280] & 0x10) == 0 && Static91.method1730(local280, local164, local7) == Static28.anInt1138)) {
							if (local7 < Static110.anInt3162) {
								Static110.anInt3162 = local7;
							}
							local641 = Static54.aByteArrayArrayArray9[local7][local164][local280] & 0xFF;
							local651 = Static20.aByteArrayArrayArray7[local7][local164][local280] & 0xFF;
							if (local651 > 0 || local641 > 0) {
								@Pc(668) int local668 = Static6.anIntArrayArrayArray1[local7][local164 + 1][local280];
								local676 = Static6.anIntArrayArrayArray1[local7][local164][local280];
								@Pc(686) int local686 = Static6.anIntArrayArrayArray1[local7][local164][local280 + 1];
								@Pc(698) int local698 = Static6.anIntArrayArrayArray1[local7][local164 + 1][local280 + 1];
								@Pc(704) int local704 = Static31.anIntArrayArray3[local164][local280];
								@Pc(712) int local712 = Static31.anIntArrayArray3[local164 + 1][local280];
								@Pc(722) int local722 = Static31.anIntArrayArray3[local164 + 1][local280 + 1];
								@Pc(730) int local730 = Static31.anIntArrayArray3[local164][local280 + 1];
								@Pc(732) int local732 = -1;
								@Pc(734) int local734 = -1;
								@Pc(745) int local745;
								@Pc(749) int local749;
								if (local651 > 0) {
									local745 = local198 * 256 / local208;
									local749 = local214 / local231;
									@Pc(753) int local753 = local202 / local231;
									local732 = Static22.method655(local745, local753, local749);
									@Pc(765) int local765 = local745 + Static32.anInt1220 & 0xFF;
									local753 += Static72.anInt2120;
									if (local753 < 0) {
										local753 = 0;
									} else if (local753 > 255) {
										local753 = 255;
									}
									local734 = Static22.method655(local765, local753, local749);
								}
								if (local7 > 0) {
									@Pc(795) boolean local795 = true;
									if (local651 == 0 && Static13.aByteArrayArrayArray4[local7][local164][local280] != 0) {
										local795 = false;
									}
									if (local641 > 0 && !Static100.method1912(local641 - 1).aBoolean122) {
										local795 = false;
									}
									if (local795 && local668 == local676 && local698 == local676 && local686 == local676) {
										Static14.anIntArrayArrayArray2[local7][local164][local280] |= 0x924;
									}
								}
								local745 = 0;
								if (local734 != -1) {
									local745 = Static30.anIntArray78[Static41.method924(96, local734)];
								}
								if (local641 == 0) {
									arg0.method1039(local7, local164, local280, 0, 0, -1, local676, local668, local698, local686, Static41.method924(local704, local732), Static41.method924(local712, local732), Static41.method924(local722, local732), Static41.method924(local730, local732), 0, 0, 0, 0, local745, 0);
								} else {
									local749 = Static13.aByteArrayArrayArray4[local7][local164][local280] + 1;
									@Pc(884) byte local884 = Static20.aByteArrayArrayArray6[local7][local164][local280];
									@Pc(890) Class6_Sub2_Sub11 local890 = Static100.method1912(local641 - 1);
									@Pc(893) int local893 = local890.anInt2603;
									@Pc(902) int local902;
									@Pc(900) int local900;
									@Pc(926) int local926;
									@Pc(931) int local931;
									if (local893 >= 0) {
										local900 = Static30.anInterface4_1.method667(local893);
										local902 = -1;
									} else if (local890.anInt2593 == 16711935) {
										local900 = -2;
										local893 = -1;
										local902 = -2;
									} else {
										local902 = Static22.method655(local890.anInt2606, local890.anInt2594, local890.anInt2596);
										local926 = Static32.anInt1220 + local890.anInt2606 & 0xFF;
										local931 = Static72.anInt2120 + local890.anInt2594;
										if (local931 < 0) {
											local931 = 0;
										} else if (local931 > 255) {
											local931 = 255;
										}
										local900 = Static22.method655(local926, local931, local890.anInt2596);
									}
									local926 = 0;
									if (local900 != -2) {
										local926 = Static30.anIntArray78[Static70.method1401(local900, 96)];
									}
									if (local890.anInt2595 != -1) {
										local931 = local890.anInt2601 + Static32.anInt1220 & 0xFF;
										@Pc(991) int local991 = Static72.anInt2120 + local890.anInt2604;
										if (local991 < 0) {
											local991 = 0;
										} else if (local991 > 255) {
											local991 = 255;
										}
										local900 = Static22.method655(local931, local991, local890.anInt2592);
										local926 = Static30.anIntArray78[Static70.method1401(local900, 96)];
									}
									arg0.method1039(local7, local164, local280, local749, local884, local893, local676, local668, local698, local686, Static41.method924(local704, local732), Static41.method924(local712, local732), Static41.method924(local722, local732), Static41.method924(local730, local732), Static70.method1401(local902, local704), Static70.method1401(local902, local712), Static70.method1401(local902, local722), Static70.method1401(local902, local730), local745, local926);
								}
							}
						}
					}
				}
			}
			for (local185 = 1; local185 < 103; local185++) {
				for (local198 = 1; local198 < 103; local198++) {
					arg0.method1047(local7, local198, local185, Static91.method1730(local185, local198, local7));
				}
			}
			Static20.aByteArrayArrayArray7[local7] = null;
			Static54.aByteArrayArrayArray9[local7] = null;
			Static13.aByteArrayArrayArray4[local7] = null;
			Static20.aByteArrayArrayArray6[local7] = null;
			Static106.aByteArrayArrayArray14[local7] = null;
		}
		arg0.method1055();
		for (local11 = 0; local11 < 104; local11++) {
			for (local28 = 0; local28 < 104; local28++) {
				if ((Static43.aByteArrayArrayArray8[1][local11][local28] & 0x2) == 2) {
					arg0.method1058(local11, local28);
				}
			}
		}
		local28 = 1;
		local135 = 2;
		local137 = 4;
		for (local141 = 0; local141 < 4; local141++) {
			if (local141 > 0) {
				local28 <<= 0x3;
				local137 <<= 0x3;
				local135 <<= 0x3;
			}
			for (local164 = 0; local164 <= local141; local164++) {
				for (local185 = 0; local185 <= 104; local185++) {
					for (local198 = 0; local198 <= 104; local198++) {
						if ((Static14.anIntArrayArrayArray2[local164][local198][local185] & local28) != 0) {
							local214 = local185;
							local202 = local185;
							local208 = local164;
							while (local202 < 104 && (local28 & Static14.anIntArrayArrayArray2[local164][local198][local202 + 1]) != 0) {
								local202++;
							}
							while (local214 > 0 && (local28 & Static14.anIntArrayArrayArray2[local164][local198][local214 - 1]) != 0) {
								local214--;
							}
							label348: while (local208 > 0) {
								for (local280 = local214; local280 <= local202; local280++) {
									if ((Static14.anIntArrayArrayArray2[local208 - 1][local198][local280] & local28) == 0) {
										break label348;
									}
								}
								local208--;
							}
							label336: for (local231 = local164; local231 < local141; local231++) {
								for (local280 = local214; local280 <= local202; local280++) {
									if ((Static14.anIntArrayArrayArray2[local231 + 1][local198][local280] & local28) == 0) {
										break label336;
									}
								}
							}
							local280 = (local202 + 1 - local214) * (local231 + 1 - local208);
							if (local280 >= 8) {
								local651 = Static6.anIntArrayArrayArray1[local208][local198][local214];
								local542 = Static6.anIntArrayArrayArray1[local231][local198][local214] - 240;
								Static48.method1025(local141, 1, local198 * 128, local198 * 128, local214 * 128, local202 * 128 + 128, local542, local651);
								for (local641 = local208; local641 <= local231; local641++) {
									for (local676 = local214; local676 <= local202; local676++) {
										Static14.anIntArrayArrayArray2[local641][local198][local676] &= ~local28;
									}
								}
							}
						}
						if ((Static14.anIntArrayArrayArray2[local164][local198][local185] & local135) != 0) {
							for (local214 = local198; local214 > 0 && (Static14.anIntArrayArrayArray2[local164][local214 - 1][local185] & local135) != 0; local214--) {
							}
							for (local202 = local198; local202 < 104 && (Static14.anIntArrayArrayArray2[local164][local202 + 1][local185] & local135) != 0; local202++) {
							}
							label402: for (local208 = local164; local208 > 0; local208--) {
								for (local280 = local214; local280 <= local202; local280++) {
									if ((Static14.anIntArrayArrayArray2[local208 - 1][local280][local185] & local135) == 0) {
										break label402;
									}
								}
							}
							label390: for (local231 = local164; local231 < local141; local231++) {
								for (local280 = local214; local280 <= local202; local280++) {
									if ((Static14.anIntArrayArrayArray2[local231 + 1][local280][local185] & local135) == 0) {
										break label390;
									}
								}
							}
							local280 = (local231 + 1 - local208) * ((local202 - local214) + 1);
							if (local280 >= 8) {
								local651 = Static6.anIntArrayArrayArray1[local208][local214][local185];
								local542 = Static6.anIntArrayArrayArray1[local231][local214][local185] - 240;
								Static48.method1025(local141, 2, local214 * 128, local202 * 128 + 128, local185 * 128, local185 * 128, local542, local651);
								for (local641 = local208; local641 <= local231; local641++) {
									for (local676 = local214; local676 <= local202; local676++) {
										Static14.anIntArrayArrayArray2[local641][local676][local185] &= ~local135;
									}
								}
							}
						}
						if ((Static14.anIntArrayArrayArray2[local164][local198][local185] & local137) != 0) {
							local214 = local198;
							local208 = local185;
							local202 = local198;
							while (local208 > 0 && (local137 & Static14.anIntArrayArrayArray2[local164][local198][local208 - 1]) != 0) {
								local208--;
							}
							for (local231 = local185; local231 < 104 && (Static14.anIntArrayArrayArray2[local164][local198][local231 + 1] & local137) != 0; local231++) {
							}
							label457: while (local214 > 0) {
								for (local280 = local208; local280 <= local231; local280++) {
									if ((Static14.anIntArrayArrayArray2[local164][local214 - 1][local280] & local137) == 0) {
										break label457;
									}
								}
								local214--;
							}
							label446: while (local202 < 104) {
								for (local280 = local208; local280 <= local231; local280++) {
									if ((Static14.anIntArrayArrayArray2[local164][local202 + 1][local280] & local137) == 0) {
										break label446;
									}
								}
								local202++;
							}
							if ((local202 + 1 - local214) * (local231 + 1 - local208) >= 4) {
								local280 = Static6.anIntArrayArrayArray1[local164][local214][local208];
								Static48.method1025(local141, 4, local214 * 128, local202 * 128 + 128, local208 * 128, local231 * 128 + 128, local280, local280);
								for (local500 = local214; local500 <= local202; local500++) {
									for (local542 = local208; local542 <= local231; local542++) {
										Static14.anIntArrayArrayArray2[local164][local500][local542] &= ~local137;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
	public static void method1478() {
		if (Static110.anInt3147 == 2) {
			Static44.method1825(Static34.anInt1313 + (Static51.anInt1586 - Static18.anInt938 << 7), Static18.anInt936 * 2, Static51.anInt1591 + (Static35.anInt1333 - Static88.anInt3276 << 7));
			if (Static96.anInt2812 > -1 && Static85.anInt2389 % 20 < 10) {
				aClass6_Sub2_Sub2_Sub2Array12[0].method646(Static96.anInt2812 - 12, Static74.anInt1809 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V")
	public static void method1481() {
		aClass55_884 = null;
		aClass55_883 = null;
		aClass55_881 = null;
		aClass55_880 = null;
		aClass55_887 = null;
		aClass55_886 = null;
		aClass6_Sub2_Sub2_Sub2Array12 = null;
		aClass6_Sub2_Sub2_Sub1_18 = null;
		aClass55_885 = null;
		aClass55_882 = null;
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V")
	public static void method1482() {
		for (@Pc(7) int local7 = 0; local7 < Static111.anInt3173; local7++) {
			@Pc(13) int local13 = Static19.anIntArray60[local7];
			@Pc(17) Class6_Sub2_Sub3_Sub1_Sub2 local17 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local13];
			if (local17 != null) {
				Static107.method2004(local17.aClass6_Sub2_Sub4_1.anInt857, local17);
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "l", descriptor = "(I)V")
	public static void method1487() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZII)V")
	public static void method1496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static6.anIntArrayArrayArray1[arg1][local7 + arg2][arg0 + local11] = 0;
			}
		}
		if (arg2 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static6.anIntArrayArrayArray1[arg1][arg2][local11 + arg0] = Static6.anIntArrayArrayArray1[arg1][arg2 - 1][local11 + arg0];
			}
		}
		if (arg0 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static6.anIntArrayArrayArray1[arg1][arg2 + local11][arg0] = Static6.anIntArrayArrayArray1[arg1][arg2 + local11][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static6.anIntArrayArrayArray1[arg1][arg2 - 1][arg0] != 0) {
			Static6.anIntArrayArrayArray1[arg1][arg2][arg0] = Static6.anIntArrayArrayArray1[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static6.anIntArrayArrayArray1[arg1][arg2][arg0 - 1] != 0) {
			Static6.anIntArrayArrayArray1[arg1][arg2][arg0] = Static6.anIntArrayArrayArray1[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static6.anIntArrayArrayArray1[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static6.anIntArrayArrayArray1[arg1][arg2][arg0] = Static6.anIntArrayArrayArray1[arg1][arg2 - 1][arg0 - 1];
		}
	}
}
