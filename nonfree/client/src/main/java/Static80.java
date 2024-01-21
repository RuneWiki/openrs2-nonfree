import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!pd", name = "rb", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!pd", name = "vb", descriptor = "I")
	public static int anInt2156;

	@OriginalMember(owner = "client!pd", name = "xb", descriptor = "[Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1Array4;

	@OriginalMember(owner = "client!pd", name = "Bb", descriptor = "Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!pd", name = "tb", descriptor = "Lclient!v;")
	private static Class62 aClass62_952 = Static45.method753("From");

	@OriginalMember(owner = "client!pd", name = "ob", descriptor = "Lclient!v;")
	public static Class62 aClass62_951 = aClass62_952;

	@OriginalMember(owner = "client!pd", name = "qb", descriptor = "Z")
	public static boolean aBoolean126 = true;

	@OriginalMember(owner = "client!pd", name = "yb", descriptor = "Lclient!v;")
	public static Class62 aClass62_953 = Static45.method753("sideicons");

	@OriginalMember(owner = "client!pd", name = "Cb", descriptor = "Lclient!v;")
	public static Class62 aClass62_954 = Static45.method753("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!pd", name = "Db", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!pd", name = "Eb", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub3_Sub1_Sub2[] aClass3_Sub1_Sub3_Sub1_Sub2Array1 = new Class3_Sub1_Sub3_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!pd", name = "Hb", descriptor = "Lclient!v;")
	public static Class62 aClass62_955 = Static45.method753("Entfernen");

	@OriginalMember(owner = "client!pd", name = "Ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_956 = Static45.method753("::errortest");

	@OriginalMember(owner = "client!pd", name = "Jb", descriptor = "J")
	public static long aLong62 = 0L;

	@OriginalMember(owner = "client!pd", name = "Kb", descriptor = "I")
	public static int anInt2161 = 0;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
	public static void method1306(@OriginalArg(0) int arg0) {
		Static68.anInt1895 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z[Lclient!cc;Lclient!a;)V")
	public static void method1307(@OriginalArg(1) Class11[] arg0, @OriginalArg(2) Class1 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(32) int local32;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static44.aByteArrayArrayArray6[local7][local11][local15] & 0x1) == 1) {
						local32 = local7;
						if ((Static44.aByteArrayArrayArray6[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method314(local11, local15);
						}
					}
				}
			}
		}
		Static28.anInt930 += (int) (Math.random() * 5.0D) - 2;
		Static56.anInt1568 += (int) (Math.random() * 5.0D) - 2;
		if (Static56.anInt1568 < -16) {
			Static56.anInt1568 = -16;
		}
		if (Static28.anInt930 < -8) {
			Static28.anInt930 = -8;
		}
		if (Static28.anInt930 > 8) {
			Static28.anInt930 = 8;
		}
		if (Static56.anInt1568 > 16) {
			Static56.anInt1568 = 16;
		}
		@Pc(136) int local136;
		@Pc(138) int local138;
		@Pc(142) int local142;
		@Pc(164) int local164;
		@Pc(185) int local185;
		@Pc(198) int local198;
		@Pc(258) int local258;
		@Pc(202) int local202;
		@Pc(264) int local264;
		@Pc(280) int local280;
		@Pc(252) int local252;
		@Pc(506) int local506;
		@Pc(548) int local548;
		@Pc(650) int local650;
		@Pc(660) int local660;
		@Pc(688) int local688;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(126) byte[][] local126 = Static20.aByteArrayArrayArray4[local11];
			local32 = (int) Math.sqrt(5100.0D);
			local136 = local32 * 768 >> 8;
			for (local138 = 1; local138 < 103; local138++) {
				for (local142 = 1; local142 < 103; local142++) {
					local164 = Static79.anIntArrayArrayArray4[local11][local142 + 1][local138] - Static79.anIntArrayArrayArray4[local11][local142 - 1][local138];
					local185 = Static79.anIntArrayArrayArray4[local11][local142][local138 + 1] - Static79.anIntArrayArrayArray4[local11][local142][local138 - 1];
					local198 = (int) Math.sqrt((double) (local164 * local164 + local185 * local185 + 65536));
					local202 = 65536 / local198;
					local252 = (local126[local142 - 1][local138] >> 2) + (local126[local142 + 1][local138] >> 3) + (local126[local142][local138 + -1] >> 2) + (local126[local142][local138 + 1] >> 3) + (local126[local142][local138] >> 1);
					local258 = (local164 << 8) / local198;
					local264 = (local185 << 8) / local198;
					local280 = (local258 * -50 + local202 * -10 + local264 * -50) / local136 + 96;
					Static40.anIntArrayArray7[local142][local138] = local280 - local252;
				}
			}
			for (local142 = 0; local142 < 104; local142++) {
				Static93.anIntArray273[local142] = 0;
				Static109.anIntArray319[local142] = 0;
				Static83.anIntArray45[local142] = 0;
				Static20.anIntArray55[local142] = 0;
				Static59.anIntArray168[local142] = 0;
			}
			for (local164 = -5; local164 < 109; local164++) {
				for (local185 = 0; local185 < 104; local185++) {
					local198 = local164 + 5;
					@Pc(399) int local399;
					if (local198 >= 0 && local198 < 104) {
						local258 = Static16.aByteArrayArrayArray3[local11][local198][local185] & 0xFF;
						if (local258 > 0) {
							@Pc(363) Class3_Sub1_Sub8 local363 = Static10.method1328(local258 - 1);
							Static93.anIntArray273[local185] += local363.anInt1019;
							Static109.anIntArray319[local185] += local363.anInt1013;
							Static83.anIntArray45[local185] += local363.anInt1024;
							Static20.anIntArray55[local185] += local363.anInt1016;
							local399 = Static59.anIntArray168[local185]++;
						}
					}
					local258 = local164 - 5;
					if (local258 >= 0 && local258 < 104) {
						local202 = Static16.aByteArrayArrayArray3[local11][local258][local185] & 0xFF;
						if (local202 > 0) {
							@Pc(437) Class3_Sub1_Sub8 local437 = Static10.method1328(local202 - 1);
							Static93.anIntArray273[local185] -= local437.anInt1019;
							Static109.anIntArray319[local185] -= local437.anInt1013;
							Static83.anIntArray45[local185] -= local437.anInt1024;
							Static20.anIntArray55[local185] -= local437.anInt1016;
							local399 = Static59.anIntArray168[local185]--;
						}
					}
				}
				if (local164 >= 1 && local164 < 103) {
					local198 = 0;
					local264 = 0;
					local202 = 0;
					local258 = 0;
					local280 = 0;
					for (local252 = -5; local252 < 109; local252++) {
						local506 = local252 + 5;
						if (local506 >= 0 && local506 < 104) {
							local280 += Static59.anIntArray168[local506];
							local202 += Static83.anIntArray45[local506];
							local198 += Static93.anIntArray273[local506];
							local264 += Static20.anIntArray55[local506];
							local258 += Static109.anIntArray319[local506];
						}
						local548 = local252 - 5;
						if (local548 >= 0 && local548 < 104) {
							local198 -= Static93.anIntArray273[local548];
							local280 -= Static59.anIntArray168[local548];
							local258 -= Static109.anIntArray319[local548];
							local264 -= Static20.anIntArray55[local548];
							local202 -= Static83.anIntArray45[local548];
						}
						if (local252 >= 1 && local252 < 103 && (!Static92.aBoolean151 || (Static44.aByteArrayArrayArray6[0][local164][local252] & 0x2) != 0 || (Static44.aByteArrayArrayArray6[local11][local164][local252] & 0x10) == 0 && Static30.method596(local252, local164, local11) == Static51.anInt2321)) {
							if (Static78.anInt2069 > local11) {
								Static78.anInt2069 = local11;
							}
							local650 = Static16.aByteArrayArrayArray3[local11][local164][local252] & 0xFF;
							local660 = Static10.aByteArrayArrayArray11[local11][local164][local252] & 0xFF;
							if (local650 > 0 || local660 > 0) {
								@Pc(680) int local680 = Static79.anIntArrayArrayArray4[local11][local164 + 1][local252];
								local688 = Static79.anIntArrayArrayArray4[local11][local164][local252];
								@Pc(700) int local700 = Static79.anIntArrayArrayArray4[local11][local164 + 1][local252 + 1];
								@Pc(710) int local710 = Static79.anIntArrayArrayArray4[local11][local164][local252 + 1];
								@Pc(716) int local716 = Static40.anIntArrayArray7[local164][local252];
								@Pc(724) int local724 = Static40.anIntArrayArray7[local164 + 1][local252];
								@Pc(732) int local732 = Static40.anIntArrayArray7[local164][local252 + 1];
								@Pc(742) int local742 = Static40.anIntArrayArray7[local164 + 1][local252 + 1];
								@Pc(744) int local744 = -1;
								@Pc(746) int local746 = -1;
								@Pc(757) int local757;
								@Pc(765) int local765;
								if (local650 > 0) {
									local757 = local198 * 256 / local264;
									@Pc(761) int local761 = local202 / local280;
									local765 = local258 / local280;
									local744 = Static85.method1394(local757, local761, local765);
									local761 += Static56.anInt1568;
									if (local761 < 0) {
										local761 = 0;
									} else if (local761 > 255) {
										local761 = 255;
									}
									local757 = Static28.anInt930 + local757 & 0xFF;
									local746 = Static85.method1394(local757, local761, local765);
								}
								if (local11 > 0) {
									@Pc(805) boolean local805 = true;
									if (local650 == 0 && Static27.aByteArrayArrayArray5[local11][local164][local252] != 0) {
										local805 = false;
									}
									if (local660 > 0 && !Static16.method433(local660 - 1).aBoolean123) {
										local805 = false;
									}
									if (local805 && local688 == local680 && local688 == local700 && local710 == local688) {
										Static72.anIntArrayArrayArray3[local11][local164][local252] |= 0x924;
									}
								}
								local757 = 0;
								if (local746 != -1) {
									local757 = Static66.anIntArray187[Static33.method646(local746, 96)];
								}
								if (local660 == 0) {
									arg1.method15(local11, local164, local252, 0, 0, -1, local688, local680, local700, local710, Static33.method646(local744, local716), Static33.method646(local744, local724), Static33.method646(local744, local742), Static33.method646(local744, local732), 0, 0, 0, 0, local757, 0);
								} else {
									@Pc(884) byte local884 = Static100.aByteArrayArrayArray15[local11][local164][local252];
									local765 = Static27.aByteArrayArrayArray5[local11][local164][local252] + 1;
									@Pc(900) Class3_Sub1_Sub13 local900 = Static16.method433(local660 - 1);
									@Pc(903) int local903 = local900.anInt2108;
									@Pc(913) int local913;
									@Pc(917) int local917;
									@Pc(941) int local941;
									@Pc(934) int local934;
									if (local903 >= 0) {
										local913 = -1;
										local917 = Static66.anInterface4_1.method461(local903);
									} else if (local900.anInt2100 == 16711935) {
										local913 = -2;
										local903 = -1;
										local917 = -2;
									} else {
										local913 = Static85.method1394(local900.anInt2118, local900.anInt2115, local900.anInt2104);
										local934 = local900.anInt2115 + Static56.anInt1568;
										local941 = Static28.anInt930 + local900.anInt2118 & 0xFF;
										if (local934 < 0) {
											local934 = 0;
										} else if (local934 > 255) {
											local934 = 255;
										}
										local917 = Static85.method1394(local941, local934, local900.anInt2104);
									}
									local941 = 0;
									if (local917 != -2) {
										local941 = Static66.anIntArray187[Static39.method688(96, local917)];
									}
									if (local900.anInt2116 != -1) {
										@Pc(993) int local993 = Static56.anInt1568 + local900.anInt2101;
										local934 = local900.anInt2114 + Static28.anInt930 & 0xFF;
										if (local993 < 0) {
											local993 = 0;
										} else if (local993 > 255) {
											local993 = 255;
										}
										local917 = Static85.method1394(local934, local993, local900.anInt2117);
										local941 = Static66.anIntArray187[Static39.method688(96, local917)];
									}
									arg1.method15(local11, local164, local252, local765, local884, local903, local688, local680, local700, local710, Static33.method646(local744, local716), Static33.method646(local744, local724), Static33.method646(local744, local742), Static33.method646(local744, local732), Static39.method688(local716, local913), Static39.method688(local724, local913), Static39.method688(local742, local913), Static39.method688(local732, local913), local757, local941);
								}
							}
						}
					}
				}
			}
			for (local185 = 1; local185 < 103; local185++) {
				for (local198 = 1; local198 < 103; local198++) {
					arg1.method2(local11, local198, local185, Static30.method596(local185, local198, local11));
				}
			}
			Static16.aByteArrayArrayArray3[local11] = null;
			Static10.aByteArrayArrayArray11[local11] = null;
			Static27.aByteArrayArrayArray5[local11] = null;
			Static100.aByteArrayArrayArray15[local11] = null;
			Static20.aByteArrayArrayArray4[local11] = null;
		}
		arg1.method13();
		for (local15 = 0; local15 < 104; local15++) {
			for (local32 = 0; local32 < 104; local32++) {
				if ((Static44.aByteArrayArrayArray6[1][local15][local32] & 0x2) == 2) {
					arg1.method17(local15, local32);
				}
			}
		}
		local32 = 1;
		local136 = 2;
		local138 = 4;
		for (local142 = 0; local142 < 4; local142++) {
			if (local142 > 0) {
				local136 <<= 0x3;
				local32 <<= 0x3;
				local138 <<= 0x3;
			}
			for (local164 = 0; local164 <= local142; local164++) {
				for (local185 = 0; local185 <= 104; local185++) {
					for (local198 = 0; local198 <= 104; local198++) {
						if ((Static72.anIntArrayArrayArray3[local164][local198][local185] & local32) != 0) {
							local202 = local185;
							local258 = local185;
							local264 = local164;
							while (local202 < 104 && (Static72.anIntArrayArrayArray3[local164][local198][local202 + 1] & local32) != 0) {
								local202++;
							}
							local280 = local164;
							while (local258 > 0 && (Static72.anIntArrayArrayArray3[local164][local198][local258 - 1] & local32) != 0) {
								local258--;
							}
							label347: while (local264 > 0) {
								for (local252 = local258; local252 <= local202; local252++) {
									if ((local32 & Static72.anIntArrayArrayArray3[local264 - 1][local198][local252]) == 0) {
										break label347;
									}
								}
								local264--;
							}
							label336: while (local280 < local142) {
								for (local252 = local258; local252 <= local202; local252++) {
									if ((local32 & Static72.anIntArrayArrayArray3[local280 + 1][local198][local252]) == 0) {
										break label336;
									}
								}
								local280++;
							}
							local252 = (local202 + 1 - local258) * ((local280 + 1) - local264);
							if (local252 >= 8) {
								local548 = Static79.anIntArrayArrayArray4[local280][local198][local258] - 240;
								local650 = Static79.anIntArrayArrayArray4[local264][local198][local258];
								Static1.method50(local142, 1, local198 * 128, local198 * 128, local258 * 128, local202 * 128 + 128, local548, local650);
								for (local660 = local264; local660 <= local280; local660++) {
									for (local688 = local258; local688 <= local202; local688++) {
										Static72.anIntArrayArrayArray3[local660][local198][local688] &= ~local32;
									}
								}
							}
						}
						if ((local136 & Static72.anIntArrayArrayArray3[local164][local198][local185]) != 0) {
							local258 = local198;
							for (local202 = local198; local202 < 104 && (Static72.anIntArrayArrayArray3[local164][local202 + 1][local185] & local136) != 0; local202++) {
							}
							local264 = local164;
							while (local258 > 0 && (Static72.anIntArrayArrayArray3[local164][local258 - 1][local185] & local136) != 0) {
								local258--;
							}
							label402: while (local264 > 0) {
								for (local252 = local258; local252 <= local202; local252++) {
									if ((Static72.anIntArrayArrayArray3[local264 - 1][local252][local185] & local136) == 0) {
										break label402;
									}
								}
								local264--;
							}
							label390: for (local280 = local164; local280 < local142; local280++) {
								for (local252 = local258; local252 <= local202; local252++) {
									if ((local136 & Static72.anIntArrayArrayArray3[local280 + 1][local252][local185]) == 0) {
										break label390;
									}
								}
							}
							local252 = (local202 + 1 - local258) * (local280 + 1 - local264);
							if (local252 >= 8) {
								local548 = Static79.anIntArrayArrayArray4[local280][local258][local185] - 240;
								local650 = Static79.anIntArrayArrayArray4[local264][local258][local185];
								Static1.method50(local142, 2, local258 * 128, local202 * 128 + 128, local185 * 128, local185 * 128, local548, local650);
								for (local660 = local264; local660 <= local280; local660++) {
									for (local688 = local258; local688 <= local202; local688++) {
										Static72.anIntArrayArrayArray3[local660][local688][local185] &= ~local136;
									}
								}
							}
						}
						if ((Static72.anIntArrayArrayArray3[local164][local198][local185] & local138) != 0) {
							local258 = local198;
							for (local264 = local185; local264 > 0 && (local138 & Static72.anIntArrayArrayArray3[local164][local198][local264 - 1]) != 0; local264--) {
							}
							local202 = local198;
							for (local280 = local185; local280 < 104 && (local138 & Static72.anIntArrayArrayArray3[local164][local198][local280 + 1]) != 0; local280++) {
							}
							label456: while (local258 > 0) {
								for (local252 = local264; local252 <= local280; local252++) {
									if ((local138 & Static72.anIntArrayArrayArray3[local164][local258 - 1][local252]) == 0) {
										break label456;
									}
								}
								local258--;
							}
							label445: while (local202 < 104) {
								for (local252 = local264; local252 <= local280; local252++) {
									if ((local138 & Static72.anIntArrayArrayArray3[local164][local202 + 1][local252]) == 0) {
										break label445;
									}
								}
								local202++;
							}
							if ((local280 + 1 - local264) * ((local202 + 1) - local258) >= 4) {
								local252 = Static79.anIntArrayArrayArray4[local164][local258][local264];
								Static1.method50(local142, 4, local258 * 128, local202 * 128 + 128, local264 * 128, local280 * 128 + 128, local252, local252);
								for (local506 = local258; local506 <= local202; local506++) {
									for (local548 = local264; local548 <= local280; local548++) {
										Static72.anIntArrayArrayArray3[local164][local506][local548] &= ~local138;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
	public static void method1308() {
		aClass62_956 = null;
		anIntArray238 = null;
		aClass62_954 = null;
		aClass62_953 = null;
		aClass62_952 = null;
		aClass3_Sub1_Sub1_Sub1Array4 = null;
		aClass3_Sub1_Sub1_Sub4_4 = null;
		aClass62_951 = null;
		aClass62_955 = null;
		aClass3_Sub1_Sub3_Sub1_Sub2Array1 = null;
	}
}
