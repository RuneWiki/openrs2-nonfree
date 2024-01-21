import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "Lclient!ob;")
	public static Class3_Sub7 aClass3_Sub7_2;

	@OriginalMember(owner = "client!vd", name = "Y", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!vd", name = "Z", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_5;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Lclient!na;")
	public static Class53 aClass53_163 = Static109.method1737("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_164 = Static109.method1737("Registrierter Benutzer");

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	public static int anInt432 = 0;

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Lclient!na;")
	private static Class53 aClass53_165 = Static109.method1737("Enter name of player to delete from list");

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_166 = Static109.method1737(":  ");

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
	public static int anInt444 = 0;

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "Lclient!na;")
	public static Class53 aClass53_167 = aClass53_165;

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "Lclient!te;")
	public static Class75 aClass75_12 = new Class75(64);

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "Lclient!na;")
	public static Class53 aClass53_168 = Static109.method1737("Passwort: ");

	@OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
	public static int anInt457 = 0;

	@OriginalMember(owner = "client!vd", name = "U", descriptor = "Lclient!na;")
	public static Class53 aClass53_169 = Static109.method1737("welle2:");

	@OriginalMember(owner = "client!vd", name = "V", descriptor = "Lclient!na;")
	public static Class53 aClass53_170 = Static109.method1737("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!vd", name = "X", descriptor = "Lclient!na;")
	private static Class53 aClass53_171 = Static109.method1737("Loading config )2 ");

	@OriginalMember(owner = "client!vd", name = "ab", descriptor = "[I")
	public static int[] anIntArray46 = new int[1000];

	@OriginalMember(owner = "client!vd", name = "bb", descriptor = "[I")
	public static int[] anIntArray47 = new int[1000];

	@OriginalMember(owner = "client!vd", name = "cb", descriptor = "Lclient!na;")
	public static Class53 aClass53_172 = aClass53_171;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!q;BI)V")
	public static void method274(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (aClass3_Sub7_2 == null) {
			Static58.method1063((byte) 0, 255, 255, 0, true, null);
			Static30.aClass62_Sub1Array1[arg1] = arg0;
		} else {
			aClass3_Sub7_2.anInt964 = arg1 * 4 + 5;
			@Pc(16) int local16 = aClass3_Sub7_2.method638();
			arg0.method1522(local16);
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	public static void method276() {
		aClass75_12 = null;
		aClass53_163 = null;
		aClass53_168 = null;
		aClass53_165 = null;
		aClass53_167 = null;
		aClass53_170 = null;
		aClass53_169 = null;
		aClass53_171 = null;
		aClass53_164 = null;
		aClass3_Sub1_Sub5_Sub3_5 = null;
		anIntArray47 = null;
		aClass3_Sub7_2 = null;
		aClass53_166 = null;
		anIntArray46 = null;
		aClass53_172 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ba;Lclient!ob;II)V")
	public static void method280(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class3_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub11 local9 = new Class3_Sub11();
		local9.anInt1265 = arg1.method647();
		local9.anInt1261 = arg1.method638();
		local9.anIntArray151 = new int[local9.anInt1265];
		local9.aByteArrayArrayArray10 = new byte[local9.anInt1265][][];
		local9.aClass22Array1 = new Class22[local9.anInt1265];
		local9.anIntArray154 = new int[local9.anInt1265];
		local9.aClass22Array2 = new Class22[local9.anInt1265];
		local9.anIntArray153 = new int[local9.anInt1265];
		for (@Pc(59) int local59 = 0; local59 < local9.anInt1265; local59++) {
			try {
				@Pc(67) int local67 = arg1.method647();
				@Pc(97) String local97;
				@Pc(106) String local106;
				@Pc(110) int local110;
				if (local67 == 0 || local67 == 1 || local67 == 2) {
					local97 = new String(arg1.method605().method1266());
					local106 = new String(arg1.method605().method1266());
					local110 = 0;
					if (local67 == 1) {
						local110 = arg1.method638();
					}
					local9.anIntArray151[local59] = local67;
					local9.anIntArray154[local59] = local110;
					local9.aClass22Array1[local59] = arg0.method124(Static71.method1207(local97), local106);
				} else if (local67 == 3 || local67 == 4) {
					local97 = new String(arg1.method605().method1266());
					local106 = new String(arg1.method605().method1266());
					local110 = arg1.method647();
					@Pc(113) String[] local113 = new String[local110];
					for (@Pc(115) int local115 = 0; local115 < local110; local115++) {
						local113[local115] = new String(arg1.method605().method1266());
					}
					@Pc(135) byte[][] local135 = new byte[local110][];
					@Pc(150) int local150;
					if (local67 == 3) {
						for (@Pc(142) int local142 = 0; local142 < local110; local142++) {
							local150 = arg1.method638();
							local135[local142] = new byte[local150];
							arg1.method620(local150, local135[local142]);
						}
					}
					@Pc(174) Class[] local174 = new Class[local110];
					local9.anIntArray151[local59] = local67;
					for (local150 = 0; local150 < local110; local150++) {
						local174[local150] = Static71.method1207(local113[local150]);
					}
					local9.aClass22Array2[local59] = arg0.method121(local174, Static71.method1207(local97), local106);
					local9.aByteArrayArrayArray10[local59] = local135;
				}
			} catch (@Pc(268) ClassNotFoundException local268) {
				local9.anIntArray153[local59] = -1;
			} catch (@Pc(275) SecurityException local275) {
				local9.anIntArray153[local59] = -2;
			} catch (@Pc(282) NullPointerException local282) {
				local9.anIntArray153[local59] = -3;
			} catch (@Pc(289) Exception local289) {
				local9.anIntArray153[local59] = -4;
			} catch (@Pc(296) Throwable local296) {
				local9.anIntArray153[local59] = -5;
			}
		}
		Static32.aClass11_4.method190(local9);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I")
	public static int method282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public static void method285() {
		@Pc(5) Class43 local5 = Static23.aClass43_1;
		synchronized (Static23.aClass43_1) {
			Static53.anInt2087 = Static50.anInt2791;
			Static99.anInt2348 = Static12.anInt318;
			Static105.anInt2433 = Static98.anInt2321;
			Static73.anInt1832 = Static35.anInt1113;
			Static56.anInt1504 = Static95.anInt2277;
			Static54.anInt2854 = Static65.anInt1662;
			Static106.aLong78 = Static71.aLong60;
			Static35.anInt1113 = 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[Lclient!bd;Lclient!je;)V")
	public static void method291(@OriginalArg(1) Class9[] arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(30) int local30;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static37.aByteArrayArrayArray17[local7][local11][local15] & 0x1) == 1) {
						local30 = local7;
						if ((Static37.aByteArrayArrayArray17[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method139(local15, local11);
						}
					}
				}
			}
		}
		Static61.anInt1615 += (int) (Math.random() * 5.0D) - 2;
		if (Static61.anInt1615 < -8) {
			Static61.anInt1615 = -8;
		}
		if (Static61.anInt1615 > 8) {
			Static61.anInt1615 = 8;
		}
		Static81.anInt2040 += (int) (Math.random() * 5.0D) - 2;
		if (Static81.anInt2040 < -16) {
			Static81.anInt2040 = -16;
		}
		if (Static81.anInt2040 > 16) {
			Static81.anInt2040 = 16;
		}
		@Pc(126) int local126;
		@Pc(128) int local128;
		@Pc(132) int local132;
		@Pc(175) int local175;
		@Pc(154) int local154;
		@Pc(189) int local189;
		@Pc(244) int local244;
		@Pc(248) int local248;
		@Pc(254) int local254;
		@Pc(270) int local270;
		@Pc(238) int local238;
		@Pc(496) int local496;
		@Pc(492) int local492;
		@Pc(636) int local636;
		@Pc(646) int local646;
		@Pc(664) int local664;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(116) byte[][] local116 = Static82.aByteArrayArrayArray6[local11];
			local30 = (int) Math.sqrt(5100.0D);
			local126 = local30 * 768 >> 8;
			for (local128 = 1; local128 < 103; local128++) {
				for (local132 = 1; local132 < 103; local132++) {
					local154 = Static107.anIntArrayArrayArray7[local11][local132][local128 + 1] - Static107.anIntArrayArrayArray7[local11][local132][local128 - 1];
					local175 = Static107.anIntArrayArrayArray7[local11][local132 + 1][local128] - Static107.anIntArrayArrayArray7[local11][local132 - 1][local128];
					local189 = (int) Math.sqrt((double) (local175 * local175 + local154 * local154 + 65536));
					local238 = (local116[local132][local128 + 1] >> 3) + (local116[local132 - 1][local128] >> 2) + (local116[local132 + 1][local128] >> 3) + (local116[local132][local128 - 1] >> 2) + (local116[local132][local128] >> 1);
					local244 = (local175 << 8) / local189;
					local248 = 65536 / local189;
					local254 = (local154 << 8) / local189;
					local270 = (local248 * -10 + local244 * -50 + local254 * -50) / local126 + 96;
					Static73.anIntArrayArray15[local132][local128] = local270 - local238;
				}
			}
			for (local132 = 0; local132 < 104; local132++) {
				Static46.anIntArray415[local132] = 0;
				Static108.anIntArray328[local132] = 0;
				Static85.anIntArray270[local132] = 0;
				Static122.anIntArray411[local132] = 0;
				Static124.anIntArray416[local132] = 0;
			}
			for (local175 = -5; local175 < 109; local175++) {
				for (local154 = 0; local154 < 104; local154++) {
					local189 = local175 + 5;
					@Pc(389) int local389;
					if (local189 >= 0 && local189 < 104) {
						local244 = Static70.aByteArrayArrayArray15[local11][local189][local154] & 0xFF;
						if (local244 > 0) {
							@Pc(353) Class3_Sub1_Sub14 local353 = Static88.method1453(local244 - 1);
							Static46.anIntArray415[local154] += local353.anInt2637;
							Static108.anIntArray328[local154] += local353.anInt2647;
							Static85.anIntArray270[local154] += local353.anInt2646;
							Static122.anIntArray411[local154] += local353.anInt2640;
							local389 = Static124.anIntArray416[local154]++;
						}
					}
					local244 = local175 - 5;
					if (local244 >= 0 && local244 < 104) {
						local248 = Static70.aByteArrayArrayArray15[local11][local244][local154] & 0xFF;
						if (local248 > 0) {
							@Pc(425) Class3_Sub1_Sub14 local425 = Static88.method1453(local248 - 1);
							Static46.anIntArray415[local154] -= local425.anInt2637;
							Static108.anIntArray328[local154] -= local425.anInt2647;
							Static85.anIntArray270[local154] -= local425.anInt2646;
							Static122.anIntArray411[local154] -= local425.anInt2640;
							local389 = Static124.anIntArray416[local154]--;
						}
					}
				}
				if (local175 >= 1 && local175 < 103) {
					local244 = 0;
					local189 = 0;
					local248 = 0;
					local254 = 0;
					local270 = 0;
					for (local238 = -5; local238 < 109; local238++) {
						local492 = local238 - 5;
						local496 = local238 + 5;
						if (local496 >= 0 && local496 < 104) {
							local244 += Static108.anIntArray328[local496];
							local270 += Static124.anIntArray416[local496];
							local189 += Static46.anIntArray415[local496];
							local254 += Static122.anIntArray411[local496];
							local248 += Static85.anIntArray270[local496];
						}
						if (local492 >= 0 && local492 < 104) {
							local270 -= Static124.anIntArray416[local492];
							local248 -= Static85.anIntArray270[local492];
							local244 -= Static108.anIntArray328[local492];
							local189 -= Static46.anIntArray415[local492];
							local254 -= Static122.anIntArray411[local492];
						}
						if (local238 >= 1 && local238 < 103 && (!Static45.aBoolean47 || (Static37.aByteArrayArrayArray17[0][local175][local238] & 0x2) != 0 || (Static37.aByteArrayArrayArray17[local11][local175][local238] & 0x10) == 0 && Static95.method1568(local11, local175, local238) == Static90.anInt2123)) {
							if (local11 < Static21.anInt706) {
								Static21.anInt706 = local11;
							}
							local636 = Static70.aByteArrayArrayArray15[local11][local175][local238] & 0xFF;
							local646 = Static107.aByteArrayArrayArray18[local11][local175][local238] & 0xFF;
							if (local636 > 0 || local646 > 0) {
								local664 = Static107.anIntArrayArrayArray7[local11][local175][local238];
								@Pc(674) int local674 = Static107.anIntArrayArrayArray7[local11][local175 + 1][local238];
								@Pc(684) int local684 = Static107.anIntArrayArrayArray7[local11][local175][local238 + 1];
								@Pc(696) int local696 = Static107.anIntArrayArrayArray7[local11][local175 + 1][local238 + 1];
								@Pc(704) int local704 = Static73.anIntArrayArray15[local175 + 1][local238];
								@Pc(710) int local710 = Static73.anIntArrayArray15[local175][local238];
								@Pc(720) int local720 = Static73.anIntArrayArray15[local175 + 1][local238 + 1];
								@Pc(722) int local722 = -1;
								@Pc(730) int local730 = Static73.anIntArrayArray15[local175][local238 + 1];
								@Pc(732) int local732 = -1;
								@Pc(740) int local740;
								@Pc(744) int local744;
								if (local636 > 0) {
									local740 = local189 * 256 / local254;
									local744 = local244 / local270;
									@Pc(748) int local748 = local248 / local270;
									local732 = Static75.method1248(local748, local744, local740);
									@Pc(760) int local760 = Static61.anInt1615 + local740 & 0xFF;
									local748 += Static81.anInt2040;
									if (local748 < 0) {
										local748 = 0;
									} else if (local748 > 255) {
										local748 = 255;
									}
									local722 = Static75.method1248(local748, local744, local760);
								}
								if (local11 > 0) {
									@Pc(785) boolean local785 = true;
									if (local636 == 0 && Static104.aByteArrayArrayArray19[local11][local175][local238] != 0) {
										local785 = false;
									}
									if (local646 > 0 && !Static111.method1783(local646 - 1).aBoolean67) {
										local785 = false;
									}
									if (local785 && local674 == local664 && local664 == local696 && local684 == local664) {
										Static27.anIntArrayArrayArray1[local11][local175][local238] |= 0x924;
									}
								}
								local740 = 0;
								if (local722 != -1) {
									local740 = Static24.anIntArray82[Static75.method1249(local722, 96)];
								}
								if (local646 == 0) {
									arg1.method1003(local11, local175, local238, 0, 0, -1, local664, local674, local696, local684, Static75.method1249(local732, local710), Static75.method1249(local732, local704), Static75.method1249(local732, local720), Static75.method1249(local732, local730), 0, 0, 0, 0, local740, 0);
								} else {
									local744 = Static104.aByteArrayArrayArray19[local11][local175][local238] + 1;
									@Pc(916) byte local916 = Static40.aByteArrayArrayArray9[local11][local175][local238];
									@Pc(922) Class3_Sub1_Sub9 local922 = Static111.method1783(local646 - 1);
									@Pc(925) int local925 = local922.anInt1810;
									@Pc(929) int local929;
									@Pc(934) int local934;
									@Pc(964) int local964;
									@Pc(969) int local969;
									if (local925 >= 0) {
										local929 = -1;
										local934 = Static24.anInterface2_1.method491(local925);
									} else if (local922.anInt1801 == 16711935) {
										local934 = -2;
										local929 = -2;
										local925 = -1;
									} else {
										local929 = Static75.method1248(local922.anInt1806, local922.anInt1803, local922.anInt1809);
										local964 = local922.anInt1809 + Static61.anInt1615 & 0xFF;
										local969 = local922.anInt1806 + Static81.anInt2040;
										if (local969 < 0) {
											local969 = 0;
										} else if (local969 > 255) {
											local969 = 255;
										}
										local934 = Static75.method1248(local969, local922.anInt1803, local964);
									}
									local964 = 0;
									if (local934 != -2) {
										local964 = Static24.anIntArray82[Static106.method1708(local934, 96)];
									}
									if (local922.anInt1818 != -1) {
										local969 = local922.anInt1814 + Static61.anInt1615 & 0xFF;
										@Pc(1021) int local1021 = Static81.anInt2040 + local922.anInt1817;
										if (local1021 < 0) {
											local1021 = 0;
										} else if (local1021 > 255) {
											local1021 = 255;
										}
										local934 = Static75.method1248(local1021, local922.anInt1808, local969);
										local964 = Static24.anIntArray82[Static106.method1708(local934, 96)];
									}
									arg1.method1003(local11, local175, local238, local744, local916, local925, local664, local674, local696, local684, Static75.method1249(local732, local710), Static75.method1249(local732, local704), Static75.method1249(local732, local720), Static75.method1249(local732, local730), Static106.method1708(local929, local710), Static106.method1708(local929, local704), Static106.method1708(local929, local720), Static106.method1708(local929, local730), local740, local964);
								}
							}
						}
					}
				}
			}
			for (local154 = 1; local154 < 103; local154++) {
				for (local189 = 1; local189 < 103; local189++) {
					arg1.method998(local11, local189, local154, Static95.method1568(local11, local189, local154));
				}
			}
			Static70.aByteArrayArrayArray15[local11] = null;
			Static107.aByteArrayArrayArray18[local11] = null;
			Static104.aByteArrayArrayArray19[local11] = null;
			Static40.aByteArrayArrayArray9[local11] = null;
			Static82.aByteArrayArrayArray6[local11] = null;
		}
		arg1.method964();
		for (local15 = 0; local15 < 104; local15++) {
			for (local30 = 0; local30 < 104; local30++) {
				if ((Static37.aByteArrayArrayArray17[1][local15][local30] & 0x2) == 2) {
					arg1.method990(local15, local30);
				}
			}
		}
		local126 = 2;
		local128 = 4;
		local30 = 1;
		for (local132 = 0; local132 < 4; local132++) {
			if (local132 > 0) {
				local30 <<= 0x3;
				local128 <<= 0x3;
				local126 <<= 0x3;
			}
			for (local175 = 0; local175 <= local132; local175++) {
				for (local154 = 0; local154 <= 104; local154++) {
					for (local189 = 0; local189 <= 104; local189++) {
						if ((local30 & Static27.anIntArrayArrayArray1[local175][local189][local154]) != 0) {
							for (local244 = local154; local244 > 0 && (Static27.anIntArrayArrayArray1[local175][local189][local244 - 1] & local30) != 0; local244--) {
							}
							local248 = local154;
							local270 = local175;
							while (local248 < 104 && (local30 & Static27.anIntArrayArrayArray1[local175][local189][local248 + 1]) != 0) {
								local248++;
							}
							label347: for (local254 = local175; local254 > 0; local254--) {
								for (local238 = local244; local238 <= local248; local238++) {
									if ((local30 & Static27.anIntArrayArrayArray1[local254 - 1][local189][local238]) == 0) {
										break label347;
									}
								}
							}
							label336: while (local132 > local270) {
								for (local238 = local244; local238 <= local248; local238++) {
									if ((Static27.anIntArrayArrayArray1[local270 + 1][local189][local238] & local30) == 0) {
										break label336;
									}
								}
								local270++;
							}
							local238 = (local248 + 1 - local244) * (local270 + 1 - local254);
							if (local238 >= 8) {
								local492 = Static107.anIntArrayArrayArray7[local270][local189][local244] - 240;
								local636 = Static107.anIntArrayArrayArray7[local254][local189][local244];
								Static55.method1013(local132, 1, local189 * 128, local189 * 128, local244 * 128, local248 * 128 + 128, local492, local636);
								for (local646 = local254; local646 <= local270; local646++) {
									for (local664 = local244; local664 <= local248; local664++) {
										Static27.anIntArrayArrayArray1[local646][local189][local664] &= ~local30;
									}
								}
							}
						}
						if ((Static27.anIntArrayArrayArray1[local175][local189][local154] & local126) != 0) {
							local244 = local189;
							for (local248 = local189; local248 < 104 && (Static27.anIntArrayArrayArray1[local175][local248 + 1][local154] & local126) != 0; local248++) {
							}
							local254 = local175;
							while (local244 > 0 && (local126 & Static27.anIntArrayArrayArray1[local175][local244 - 1][local154]) != 0) {
								local244--;
							}
							local270 = local175;
							label402: while (local254 > 0) {
								for (local238 = local244; local238 <= local248; local238++) {
									if ((local126 & Static27.anIntArrayArrayArray1[local254 - 1][local238][local154]) == 0) {
										break label402;
									}
								}
								local254--;
							}
							label391: while (local132 > local270) {
								for (local238 = local244; local238 <= local248; local238++) {
									if ((local126 & Static27.anIntArrayArrayArray1[local270 + 1][local238][local154]) == 0) {
										break label391;
									}
								}
								local270++;
							}
							local238 = (local270 + 1 - local254) * (local248 + 1 - local244);
							if (local238 >= 8) {
								local492 = Static107.anIntArrayArrayArray7[local270][local244][local154] - 240;
								local636 = Static107.anIntArrayArrayArray7[local254][local244][local154];
								Static55.method1013(local132, 2, local244 * 128, local248 * 128 + 128, local154 * 128, local154 * 128, local492, local636);
								for (local646 = local254; local646 <= local270; local646++) {
									for (local664 = local244; local664 <= local248; local664++) {
										Static27.anIntArrayArrayArray1[local646][local664][local154] &= ~local126;
									}
								}
							}
						}
						if ((local128 & Static27.anIntArrayArrayArray1[local175][local189][local154]) != 0) {
							local244 = local189;
							local248 = local189;
							for (local254 = local154; local254 > 0 && (local128 & Static27.anIntArrayArrayArray1[local175][local189][local254 - 1]) != 0; local254--) {
							}
							for (local270 = local154; local270 < 104 && (local128 & Static27.anIntArrayArrayArray1[local175][local189][local270 + 1]) != 0; local270++) {
							}
							label457: while (local244 > 0) {
								for (local238 = local254; local238 <= local270; local238++) {
									if ((Static27.anIntArrayArrayArray1[local175][local244 - 1][local238] & local128) == 0) {
										break label457;
									}
								}
								local244--;
							}
							label446: while (local248 < 104) {
								for (local238 = local254; local238 <= local270; local238++) {
									if ((local128 & Static27.anIntArrayArrayArray1[local175][local248 + 1][local238]) == 0) {
										break label446;
									}
								}
								local248++;
							}
							if ((local270 + 1 - local254) * (local248 + 1 - local244) >= 4) {
								local238 = Static107.anIntArrayArrayArray7[local175][local244][local254];
								Static55.method1013(local132, 4, local244 * 128, local248 * 128 + 128, local254 * 128, local270 * 128 + 128, local238, local238);
								for (local496 = local244; local496 <= local248; local496++) {
									for (local492 = local254; local492 <= local270; local492++) {
										Static27.anIntArrayArrayArray1[local175][local496][local492] &= ~local128;
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
