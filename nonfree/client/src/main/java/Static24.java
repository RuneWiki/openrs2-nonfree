import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ee", name = "cb", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!ee", name = "gb", descriptor = "Ljava/awt/Graphics;")
	public static Graphics aGraphics1;

	@OriginalMember(owner = "client!ee", name = "nb", descriptor = "[B")
	public static byte[] aByteArray9;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lclient!o;")
	public static Class40 aClass40_179 = Static13.method257("*6n*6nRecovery Questions Last Set:*6n@gre@");

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "Lclient!o;")
	public static Class40 aClass40_180 = Static13.method257("Loading wordpack )2 0(U");

	@OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lclient!od;")
	public static Class44 aClass44_4 = new Class44();

	@OriginalMember(owner = "client!ee", name = "mb", descriptor = "Lclient!o;")
	private static Class40 aClass40_184 = Static13.method257("Login to a members(W server to use this object)3");

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "Lclient!o;")
	public static Class40 aClass40_181 = aClass40_184;

	@OriginalMember(owner = "client!ee", name = "kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_182 = Static13.method257("::fpsoff");

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_183 = Static13.method257("You have @gre@");

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
	public static int anInt641 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!qb;)V")
	public static void method502(@OriginalArg(1) Class2_Sub2_Sub2_Sub3 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static15.anIntArray414.length; local9++) {
			Static15.anIntArray414[local9] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) ((double) 256 * 128.0D * Math.random());
			Static15.anIntArray414[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(68) int local68;
		for (local32 = 0; local32 < 20; local32++) {
			for (local56 = 1; local56 < 255; local56++) {
				for (local60 = 1; local60 < 127; local60++) {
					local68 = (local56 << 7) + local60;
					Static4.anIntArray17[local68] = (Static15.anIntArray414[local68 - 1] + Static15.anIntArray414[local68 + 1] + Static15.anIntArray414[local68 - 128] + Static15.anIntArray414[local68 + 128]) / 4;
				}
			}
			@Pc(109) int[] local109 = Static15.anIntArray414;
			Static15.anIntArray414 = Static4.anIntArray17;
			Static4.anIntArray17 = local109;
		}
		if (arg0 == null) {
			return;
		}
		local56 = 0;
		for (local60 = 0; local60 < arg0.anInt1910; local60++) {
			for (local68 = 0; local68 < arg0.anInt1905; local68++) {
				if (arg0.aByteArray16[local56++] != 0) {
					@Pc(142) int local142 = local60 + arg0.anInt1906 + 16;
					@Pc(149) int local149 = arg0.anInt1907 + local68 + 16;
					@Pc(155) int local155 = (local142 << 7) + local149;
					Static15.anIntArray414[local155] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([Lclient!fb;Lclient!sd;I)V")
	public static void method503(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class55 arg1) {
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(36) int local36;
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			for (local15 = 0; local15 < 104; local15++) {
				for (local19 = 0; local19 < 104; local19++) {
					if ((Static61.aByteArrayArrayArray7[local11][local15][local19] & 0x1) == 1) {
						local36 = local11;
						if ((Static61.aByteArrayArrayArray7[1][local15][local19] & 0x2) == 2) {
							local36 = local11 - 1;
						}
						if (local36 >= 0) {
							arg0[local36].method536(local19, local15);
						}
					}
				}
			}
		}
		Static55.anInt1430 += (int) (Math.random() * 5.0D) - 2;
		if (Static55.anInt1430 < -16) {
			Static55.anInt1430 = -16;
		}
		Static82.anInt1942 += (int) (Math.random() * 5.0D) - 2;
		if (Static82.anInt1942 < -8) {
			Static82.anInt1942 = -8;
		}
		if (Static55.anInt1430 > 16) {
			Static55.anInt1430 = 16;
		}
		if (Static82.anInt1942 > 8) {
			Static82.anInt1942 = 8;
		}
		@Pc(138) int local138;
		@Pc(140) int local140;
		@Pc(144) int local144;
		@Pc(166) int local166;
		@Pc(187) int local187;
		@Pc(200) int local200;
		@Pc(210) int local210;
		@Pc(204) int local204;
		@Pc(216) int local216;
		@Pc(233) int local233;
		@Pc(283) int local283;
		@Pc(510) int local510;
		@Pc(551) int local551;
		@Pc(664) int local664;
		@Pc(654) int local654;
		@Pc(689) int local689;
		for (local15 = 0; local15 < 4; local15++) {
			@Pc(128) byte[][] local128 = Static60.aByteArrayArrayArray6[local15];
			local36 = (int) Math.sqrt(5100.0D);
			local138 = local36 * 768 >> 8;
			for (local140 = 1; local140 < 103; local140++) {
				for (local144 = 1; local144 < 103; local144++) {
					local166 = Static91.anIntArrayArrayArray8[local15][local144 + 1][local140] - Static91.anIntArrayArrayArray8[local15][local144 - 1][local140];
					local187 = Static91.anIntArrayArrayArray8[local15][local144][local140 + 1] - Static91.anIntArrayArrayArray8[local15][local144][local140 - 1];
					local200 = (int) Math.sqrt((double) (local187 * local187 + local166 * local166 + 65536));
					local204 = 65536 / local200;
					local210 = (local166 << 8) / local200;
					local216 = (local187 << 8) / local200;
					local233 = (local204 * -10 + local210 * -50 + local216 * -50) / local138 + 96;
					local283 = (local128[local144][local140 + 1] >> 3) + (local128[local144 - 1][local140] >> 2) + (local128[local144 - -1][local140] >> 3) + (local128[local144][local140 + -1] >> 2) + (local128[local144][local140] >> 1);
					Static10.anIntArrayArray5[local144][local140] = local233 - local283;
				}
			}
			for (local144 = 0; local144 < 104; local144++) {
				Static85.anIntArray434[local144] = 0;
				Static25.anIntArray126[local144] = 0;
				Static46.anIntArray543[local144] = 0;
				Static83.anIntArray428[local144] = 0;
				Static20.anIntArray91[local144] = 0;
			}
			for (local166 = -5; local166 < 109; local166++) {
				for (local187 = 0; local187 < 104; local187++) {
					local200 = local166 + 5;
					@Pc(402) int local402;
					if (local200 >= 0 && local200 < 104) {
						local210 = Static37.aByteArrayArrayArray4[local15][local200][local187] & 0xFF;
						if (local210 > 0) {
							@Pc(366) Class2_Sub2_Sub16 local366 = Static84.method1360(local210 - 1);
							Static85.anIntArray434[local187] += local366.anInt2469;
							Static25.anIntArray126[local187] += local366.anInt2461;
							Static46.anIntArray543[local187] += local366.anInt2460;
							Static83.anIntArray428[local187] += local366.anInt2464;
							local402 = Static20.anIntArray91[local187]++;
						}
					}
					local210 = local166 - 5;
					if (local210 >= 0 && local210 < 104) {
						local204 = Static37.aByteArrayArrayArray4[local15][local210][local187] & 0xFF;
						if (local204 > 0) {
							@Pc(437) Class2_Sub2_Sub16 local437 = Static84.method1360(local204 - 1);
							Static85.anIntArray434[local187] -= local437.anInt2469;
							Static25.anIntArray126[local187] -= local437.anInt2461;
							Static46.anIntArray543[local187] -= local437.anInt2460;
							Static83.anIntArray428[local187] -= local437.anInt2464;
							local402 = Static20.anIntArray91[local187]--;
						}
					}
				}
				if (local166 >= 1 && local166 < 103) {
					local210 = 0;
					local204 = 0;
					local216 = 0;
					local233 = 0;
					local200 = 0;
					for (local283 = -5; local283 < 109; local283++) {
						local510 = local283 + 5;
						if (local510 >= 0 && local510 < 104) {
							local210 += Static25.anIntArray126[local510];
							local233 += Static20.anIntArray91[local510];
							local216 += Static83.anIntArray428[local510];
							local204 += Static46.anIntArray543[local510];
							local200 += Static85.anIntArray434[local510];
						}
						local551 = local283 - 5;
						if (local551 >= 0 && local551 < 104) {
							local233 -= Static20.anIntArray91[local551];
							local204 -= Static46.anIntArray543[local551];
							local216 -= Static83.anIntArray428[local551];
							local210 -= Static25.anIntArray126[local551];
							local200 -= Static85.anIntArray434[local551];
						}
						if (local283 >= 1 && local283 < 103 && (!Static1.aBoolean2 || (Static61.aByteArrayArrayArray7[0][local166][local283] & 0x2) != 0 || (Static61.aByteArrayArrayArray7[local15][local166][local283] & 0x10) == 0 && Static48.method821(local283, local166, local15) == Static33.anInt786)) {
							if (Static34.anInt807 > local15) {
								Static34.anInt807 = local15;
							}
							local654 = Static75.aByteArrayArrayArray9[local15][local166][local283] & 0xFF;
							local664 = Static37.aByteArrayArrayArray4[local15][local166][local283] & 0xFF;
							if (local664 > 0 || local654 > 0) {
								@Pc(681) int local681 = Static91.anIntArrayArrayArray8[local15][local166 + 1][local283];
								local689 = Static91.anIntArrayArrayArray8[local15][local166][local283];
								@Pc(701) int local701 = Static91.anIntArrayArrayArray8[local15][local166 + 1][local283 + 1];
								@Pc(707) int local707 = Static10.anIntArrayArray5[local166][local283];
								@Pc(715) int local715 = Static10.anIntArrayArray5[local166 + 1][local283];
								@Pc(725) int local725 = Static91.anIntArrayArrayArray8[local15][local166][local283 + 1];
								@Pc(727) int local727 = -1;
								@Pc(729) int local729 = -1;
								@Pc(737) int local737 = Static10.anIntArrayArray5[local166][local283 + 1];
								@Pc(747) int local747 = Static10.anIntArrayArray5[local166 + 1][local283 + 1];
								@Pc(758) int local758;
								@Pc(762) int local762;
								if (local664 > 0) {
									local758 = local200 * 256 / local216;
									local762 = local210 / local233;
									@Pc(766) int local766 = local204 / local233;
									local727 = Static12.method251(local766, local762, local758);
									local766 += Static55.anInt1430;
									@Pc(782) int local782 = Static82.anInt1942 + local758 & 0xFF;
									if (local766 < 0) {
										local766 = 0;
									} else if (local766 > 255) {
										local766 = 255;
									}
									local729 = Static12.method251(local766, local762, local782);
								}
								if (local15 > 0) {
									@Pc(806) boolean local806 = true;
									if (local664 == 0 && Static15.aByteArrayArrayArray10[local15][local166][local283] != 0) {
										local806 = false;
									}
									if (local654 > 0 && !Static81.method1338(local654 - 1).aBoolean45) {
										local806 = false;
									}
									if (local806 && local689 == local681 && local689 == local701 && local689 == local725) {
										Static32.anIntArrayArrayArray3[local15][local166][local283] |= 0x924;
									}
								}
								local758 = 0;
								if (local729 != -1) {
									local758 = Static6.anIntArray63[Static52.method849(96, local729)];
								}
								if (local654 == 0) {
									arg1.method1438(local15, local166, local283, 0, 0, -1, local689, local681, local701, local725, Static52.method849(local707, local727), Static52.method849(local715, local727), Static52.method849(local747, local727), Static52.method849(local737, local727), 0, 0, 0, 0, local758, 0);
								} else {
									local762 = Static15.aByteArrayArrayArray10[local15][local166][local283] + 1;
									@Pc(898) byte local898 = Static74.aByteArrayArrayArray8[local15][local166][local283];
									@Pc(904) Class2_Sub2_Sub4 local904 = Static81.method1338(local654 - 1);
									@Pc(907) int local907 = local904.anInt582;
									@Pc(911) int local911;
									@Pc(916) int local916;
									@Pc(938) int local938;
									@Pc(943) int local943;
									if (local907 >= 0) {
										local911 = -1;
										local916 = Static6.anInterface4_1.method396(local907);
									} else if (local904.anInt581 == 16711935) {
										local916 = -2;
										local907 = -1;
										local911 = -2;
									} else {
										local911 = Static12.method251(local904.anInt594, local904.anInt585, local904.anInt588);
										local938 = Static82.anInt1942 + local904.anInt588 & 0xFF;
										local943 = local904.anInt594 + Static55.anInt1430;
										if (local943 < 0) {
											local943 = 0;
										} else if (local943 > 255) {
											local943 = 255;
										}
										local916 = Static12.method251(local943, local904.anInt585, local938);
									}
									local938 = 0;
									if (local916 != -2) {
										local938 = Static6.anIntArray63[Static72.method1193(local916, 96)];
									}
									if (local904.anInt593 != -1) {
										local943 = local904.anInt586 + Static82.anInt1942 & 0xFF;
										@Pc(1001) int local1001 = local904.anInt578 + Static55.anInt1430;
										if (local1001 < 0) {
											local1001 = 0;
										} else if (local1001 > 255) {
											local1001 = 255;
										}
										local916 = Static12.method251(local1001, local904.anInt591, local943);
										local938 = Static6.anIntArray63[Static72.method1193(local916, 96)];
									}
									arg1.method1438(local15, local166, local283, local762, local898, local907, local689, local681, local701, local725, Static52.method849(local707, local727), Static52.method849(local715, local727), Static52.method849(local747, local727), Static52.method849(local737, local727), Static72.method1193(local911, local707), Static72.method1193(local911, local715), Static72.method1193(local911, local747), Static72.method1193(local911, local737), local758, local938);
								}
							}
						}
					}
				}
			}
			for (local187 = 1; local187 < 103; local187++) {
				for (local200 = 1; local200 < 103; local200++) {
					arg1.method1418(local15, local200, local187, Static48.method821(local187, local200, local15));
				}
			}
			Static37.aByteArrayArrayArray4[local15] = null;
			Static75.aByteArrayArrayArray9[local15] = null;
			Static15.aByteArrayArrayArray10[local15] = null;
			Static74.aByteArrayArrayArray8[local15] = null;
			Static60.aByteArrayArrayArray6[local15] = null;
		}
		arg1.method1434();
		for (local19 = 0; local19 < 104; local19++) {
			for (local36 = 0; local36 < 104; local36++) {
				if ((Static61.aByteArrayArrayArray7[1][local19][local36] & 0x2) == 2) {
					arg1.method1453(local19, local36);
				}
			}
		}
		local138 = 2;
		local36 = 1;
		local140 = 4;
		for (local144 = 0; local144 < 4; local144++) {
			if (local144 > 0) {
				local140 <<= 0x3;
				local36 <<= 0x3;
				local138 <<= 0x3;
			}
			for (local166 = 0; local166 <= local144; local166++) {
				for (local187 = 0; local187 <= 104; local187++) {
					for (local200 = 0; local200 <= 104; local200++) {
						if ((Static32.anIntArrayArrayArray3[local166][local200][local187] & local36) != 0) {
							for (local204 = local187; local204 < 104 && (local36 & Static32.anIntArrayArrayArray3[local166][local200][local204 + 1]) != 0; local204++) {
							}
							local210 = local187;
							local216 = local166;
							local233 = local166;
							while (local210 > 0 && (local36 & Static32.anIntArrayArrayArray3[local166][local200][local210 - 1]) != 0) {
								local210--;
							}
							label347: while (local216 > 0) {
								for (local283 = local210; local283 <= local204; local283++) {
									if ((local36 & Static32.anIntArrayArrayArray3[local216 - 1][local200][local283]) == 0) {
										break label347;
									}
								}
								local216--;
							}
							label336: while (local233 < local144) {
								for (local283 = local210; local283 <= local204; local283++) {
									if ((local36 & Static32.anIntArrayArrayArray3[local233 + 1][local200][local283]) == 0) {
										break label336;
									}
								}
								local233++;
							}
							local283 = (local233 + 1 - local216) * (local204 + 1 - local210);
							if (local283 >= 8) {
								local551 = Static91.anIntArrayArrayArray8[local233][local200][local210] - 240;
								local664 = Static91.anIntArrayArrayArray8[local216][local200][local210];
								Static89.method1433(local144, 1, local200 * 128, local200 * 128, local210 * 128, local204 * 128 + 128, local551, local664);
								for (local654 = local216; local654 <= local233; local654++) {
									for (local689 = local210; local689 <= local204; local689++) {
										Static32.anIntArrayArrayArray3[local654][local200][local689] &= ~local36;
									}
								}
							}
						}
						if ((Static32.anIntArrayArrayArray3[local166][local200][local187] & local138) != 0) {
							for (local210 = local200; local210 > 0 && (local138 & Static32.anIntArrayArrayArray3[local166][local210 - 1][local187]) != 0; local210--) {
							}
							local204 = local200;
							local216 = local166;
							while (local204 < 104 && (local138 & Static32.anIntArrayArrayArray3[local166][local204 + 1][local187]) != 0) {
								local204++;
							}
							local233 = local166;
							label401: while (local216 > 0) {
								for (local283 = local210; local283 <= local204; local283++) {
									if ((Static32.anIntArrayArrayArray3[local216 - 1][local283][local187] & local138) == 0) {
										break label401;
									}
								}
								local216--;
							}
							label390: while (local144 > local233) {
								for (local283 = local210; local283 <= local204; local283++) {
									if ((Static32.anIntArrayArrayArray3[local233 + 1][local283][local187] & local138) == 0) {
										break label390;
									}
								}
								local233++;
							}
							local283 = (local204 + 1 - local210) * ((local233 + 1) - local216);
							if (local283 >= 8) {
								local664 = Static91.anIntArrayArrayArray8[local216][local210][local187];
								local551 = Static91.anIntArrayArrayArray8[local233][local210][local187] - 240;
								Static89.method1433(local144, 2, local210 * 128, local204 * 128 + 128, local187 * 128, local187 * 128, local551, local664);
								for (local654 = local216; local654 <= local233; local654++) {
									for (local689 = local210; local689 <= local204; local689++) {
										Static32.anIntArrayArrayArray3[local654][local689][local187] &= ~local138;
									}
								}
							}
						}
						if ((local140 & Static32.anIntArrayArrayArray3[local166][local200][local187]) != 0) {
							local210 = local200;
							local204 = local200;
							local216 = local187;
							for (local233 = local187; local233 < 104 && (Static32.anIntArrayArrayArray3[local166][local200][local233 + 1] & local140) != 0; local233++) {
							}
							while (local216 > 0 && (Static32.anIntArrayArrayArray3[local166][local200][local216 - 1] & local140) != 0) {
								local216--;
							}
							label456: while (local210 > 0) {
								for (local283 = local216; local283 <= local233; local283++) {
									if ((Static32.anIntArrayArrayArray3[local166][local210 - 1][local283] & local140) == 0) {
										break label456;
									}
								}
								local210--;
							}
							label445: while (local204 < 104) {
								for (local283 = local216; local283 <= local233; local283++) {
									if ((local140 & Static32.anIntArrayArrayArray3[local166][local204 + 1][local283]) == 0) {
										break label445;
									}
								}
								local204++;
							}
							if ((local233 + 1 - local216) * (-local210 + (local204 - -1)) >= 4) {
								local283 = Static91.anIntArrayArrayArray8[local166][local210][local216];
								Static89.method1433(local144, 4, local210 * 128, local204 * 128 + 128, local216 * 128, local233 * 128 + 128, local283, local283);
								for (local510 = local210; local510 <= local204; local510++) {
									for (local551 = local216; local551 <= local233; local551++) {
										Static32.anIntArrayArrayArray3[local166][local510][local551] &= ~local140;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
	public static void method506() {
		aClass40_180 = null;
		aGraphics1 = null;
		aClass40_179 = null;
		aClass40_183 = null;
		aByteArrayArray6 = null;
		aClass40_184 = null;
		aByteArray9 = null;
		aClass40_182 = null;
		aClass40_181 = null;
		aClass44_4 = null;
	}
}
