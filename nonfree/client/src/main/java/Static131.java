import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!q", name = "e", descriptor = "[Lclient!lb;")
	public static Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array1 = new Class3_Sub1_Sub4_Sub4[4];

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1660 = Static122.method531("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1661 = Static122.method531("<col=00ff80>");

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1662 = Static122.method531("::fpsoff");

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1663 = Static122.method531(" loggt sich aus)3");

	@OriginalMember(owner = "client!q", name = "q", descriptor = "I")
	public static int anInt2984 = -1;

	@OriginalMember(owner = "client!q", name = "s", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1664 = Static122.method531("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!q", name = "t", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1665 = Static122.method531("(U0a )2 in: ");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ud;II)V")
	public static void method2172(@OriginalArg(0) Class3_Sub1_Sub4_Sub7 arg0, @OriginalArg(1) int arg1) {
		Static14.method234(arg0.anInt3159, arg1, arg0.anInt3169);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZLclient!sd;I)V")
	public static void method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class73 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class83 local8 = Static109.method1959(arg1, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray8 != null) {
			@Pc(18) Class3_Sub17 local18 = new Class3_Sub17();
			local18.anObjectArray3 = local8.anObjectArray8;
			local18.aClass73_1615 = arg2;
			local18.aClass83_13 = local8;
			local18.anInt2862 = arg0;
			Static148.method2418(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt3735 > 0) {
			local36 = Static122.method530(local8);
		}
		if (!local36 || !Static61.method1115(arg0 - 1, Static127.method484(local8))) {
			return;
		}
		if (arg0 == 1) {
			Static139.aClass3_Sub12_Sub1_3.method1400(180);
			Static139.aClass3_Sub12_Sub1_3.method1392(arg3);
			Static139.aClass3_Sub12_Sub1_3.method1361(arg1);
		}
		if (arg0 == 2) {
			Static139.aClass3_Sub12_Sub1_3.method1400(45);
			Static139.aClass3_Sub12_Sub1_3.method1392(arg3);
			Static139.aClass3_Sub12_Sub1_3.method1361(arg1);
		}
		if (arg0 == 3) {
			Static139.aClass3_Sub12_Sub1_3.method1400(166);
			Static139.aClass3_Sub12_Sub1_3.method1392(arg3);
			Static139.aClass3_Sub12_Sub1_3.method1361(arg1);
		}
		if (arg0 == 4) {
			Static139.aClass3_Sub12_Sub1_3.method1400(157);
			Static139.aClass3_Sub12_Sub1_3.method1392(arg3);
			Static139.aClass3_Sub12_Sub1_3.method1361(arg1);
		}
		if (arg0 == 5) {
			Static139.aClass3_Sub12_Sub1_3.method1400(3);
			Static139.aClass3_Sub12_Sub1_3.method1392(arg3);
			Static139.aClass3_Sub12_Sub1_3.method1361(arg1);
		}
		if (arg0 == 6) {
			Static139.aClass3_Sub12_Sub1_3.method1400(29);
			Static139.aClass3_Sub12_Sub1_3.method1392(arg3);
			Static139.aClass3_Sub12_Sub1_3.method1361(arg1);
		}
		if (arg0 == 7) {
			Static139.aClass3_Sub12_Sub1_3.method1400(135);
			Static139.aClass3_Sub12_Sub1_3.method1392(arg3);
			Static139.aClass3_Sub12_Sub1_3.method1361(arg1);
		}
		if (arg0 == 8) {
			Static139.aClass3_Sub12_Sub1_3.method1400(130);
			Static139.aClass3_Sub12_Sub1_3.method1392(arg3);
			Static139.aClass3_Sub12_Sub1_3.method1361(arg1);
		}
		if (arg0 == 9) {
			Static139.aClass3_Sub12_Sub1_3.method1400(60);
			Static139.aClass3_Sub12_Sub1_3.method1392(arg3);
			Static139.aClass3_Sub12_Sub1_3.method1361(arg1);
		}
		if (arg0 == 10) {
			Static139.aClass3_Sub12_Sub1_3.method1400(143);
			Static139.aClass3_Sub12_Sub1_3.method1392(arg3);
			Static139.aClass3_Sub12_Sub1_3.method1361(arg1);
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method2174() {
		aClass3_Sub1_Sub4_Sub4Array1 = null;
		aClass73_1661 = null;
		aClass73_1665 = null;
		aClass73_1664 = null;
		aClass73_1663 = null;
		aClass73_1660 = null;
		aClass73_1662 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BII[I)I")
	public static int method2175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		return arg1 * arg2[0] + arg2[1] * arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([Lclient!pf;Lclient!i;B)V")
	public static void method2176(@OriginalArg(0) Class60[] arg0, @OriginalArg(1) Class35 arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(26) int local26;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static110.aByteArrayArrayArray5[local3][local7][local11] & 0x1) == 1) {
						local26 = local3;
						if ((Static110.aByteArrayArrayArray5[1][local7][local11] & 0x2) == 2) {
							local26 = local3 - 1;
						}
						if (local26 >= 0) {
							arg0[local26].method2161(local11, local7);
						}
					}
				}
			}
		}
		Static142.anInt3265 += (int) (Math.random() * 5.0D) - 2;
		if (Static142.anInt3265 < -16) {
			Static142.anInt3265 = -16;
		}
		if (Static142.anInt3265 > 16) {
			Static142.anInt3265 = 16;
		}
		Static150.anInt3579 += (int) (Math.random() * 5.0D) - 2;
		if (Static150.anInt3579 < -8) {
			Static150.anInt3579 = -8;
		}
		if (Static150.anInt3579 > 8) {
			Static150.anInt3579 = 8;
		}
		@Pc(124) int local124;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(222) int local222;
		@Pc(155) int local155;
		@Pc(176) int local176;
		@Pc(190) int local190;
		@Pc(196) int local196;
		@Pc(200) int local200;
		@Pc(206) int local206;
		@Pc(273) int local273;
		@Pc(496) int local496;
		@Pc(540) int local540;
		@Pc(635) int local635;
		@Pc(645) int local645;
		@Pc(660) int local660;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(114) byte[][] local114 = Static65.aByteArrayArrayArray3[local7];
			local26 = (int) Math.sqrt(5100.0D);
			local124 = local26 * 768 >> 8;
			for (local126 = 1; local126 < 103; local126++) {
				for (local130 = 1; local130 < 103; local130++) {
					local155 = Static65.anIntArrayArrayArray5[local7][local130 + 1][local126] - Static65.anIntArrayArrayArray5[local7][local130 - 1][local126];
					local176 = Static65.anIntArrayArrayArray5[local7][local130][local126 + 1] - Static65.anIntArrayArrayArray5[local7][local130][local126 - 1];
					local190 = (int) Math.sqrt((double) (local155 * local155 + local176 * local176 + 65536));
					local196 = (local155 << 8) / local190;
					local200 = 65536 / local190;
					local206 = (local176 << 8) / local190;
					local222 = (local200 * -10 + local196 * -50 + local206 * -50) / local124 + 96;
					local273 = (local114[local130][local126] >> 1) + (local114[local130 - 1][local126] >> 2) + (local114[local130 + 1][local126] >> 3) + (local114[local130][local126 + -1] >> 2) + (local114[local130][local126 + 1] >> 3);
					Static139.anIntArrayArray22[local130][local126] = local222 - local273;
				}
			}
			for (local130 = 0; local130 < 104; local130++) {
				Static125.anIntArray309[local130] = 0;
				Static96.anIntArray222[local130] = 0;
				Static181.anIntArray434[local130] = 0;
				Static22.anIntArray61[local130] = 0;
				Static98.anIntArray224[local130] = 0;
			}
			for (local222 = -5; local222 < 109; local222++) {
				for (local155 = 0; local155 < 104; local155++) {
					local176 = local222 + 5;
					@Pc(392) int local392;
					if (local176 >= 0 && local176 < 104) {
						local190 = Static90.aByteArrayArrayArray4[local7][local176][local155] & 0xFF;
						if (local190 > 0) {
							@Pc(356) Class3_Sub1_Sub2 local356 = Static78.method1324(local190 - 1);
							Static125.anIntArray309[local155] += local356.anInt95;
							Static96.anIntArray222[local155] += local356.anInt100;
							Static181.anIntArray434[local155] += local356.anInt103;
							Static22.anIntArray61[local155] += local356.anInt94;
							local392 = Static98.anIntArray224[local155]++;
						}
					}
					local190 = local222 - 5;
					if (local190 >= 0 && local190 < 104) {
						local196 = Static90.aByteArrayArrayArray4[local7][local190][local155] & 0xFF;
						if (local196 > 0) {
							@Pc(425) Class3_Sub1_Sub2 local425 = Static78.method1324(local196 - 1);
							Static125.anIntArray309[local155] -= local425.anInt95;
							Static96.anIntArray222[local155] -= local425.anInt100;
							Static181.anIntArray434[local155] -= local425.anInt103;
							Static22.anIntArray61[local155] -= local425.anInt94;
							local392 = Static98.anIntArray224[local155]--;
						}
					}
				}
				if (local222 >= 1 && local222 < 103) {
					local176 = 0;
					local190 = 0;
					local200 = 0;
					local196 = 0;
					local206 = 0;
					for (local273 = -5; local273 < 109; local273++) {
						local496 = local273 + 5;
						if (local496 >= 0 && local496 < 104) {
							local176 += Static125.anIntArray309[local496];
							local206 += Static98.anIntArray224[local496];
							local190 += Static96.anIntArray222[local496];
							local200 += Static22.anIntArray61[local496];
							local196 += Static181.anIntArray434[local496];
						}
						local540 = local273 - 5;
						if (local540 >= 0 && local540 < 104) {
							local200 -= Static22.anIntArray61[local540];
							local206 -= Static98.anIntArray224[local540];
							local196 -= Static181.anIntArray434[local540];
							local190 -= Static96.anIntArray222[local540];
							local176 -= Static125.anIntArray309[local540];
						}
						if (local273 >= 1 && local273 < 103 && (!Static85.aBoolean127 || (Static110.aByteArrayArrayArray5[0][local222][local273] & 0x2) != 0 || (Static110.aByteArrayArrayArray5[local7][local222][local273] & 0x10) == 0 && Static101.method1773(local273, local222, local7) == Static33.anInt830)) {
							if (Static108.anInt2483 > local7) {
								Static108.anInt2483 = local7;
							}
							local635 = Static90.aByteArrayArrayArray4[local7][local222][local273] & 0xFF;
							local645 = Static167.aByteArrayArrayArray8[local7][local222][local273] & 0xFF;
							if (local635 > 0 || local645 > 0) {
								local660 = Static65.anIntArrayArrayArray5[local7][local222][local273];
								@Pc(670) int local670 = Static65.anIntArrayArrayArray5[local7][local222 + 1][local273];
								@Pc(682) int local682 = Static65.anIntArrayArrayArray5[local7][local222 + 1][local273 + 1];
								@Pc(690) int local690 = Static139.anIntArrayArray22[local222 + 1][local273];
								@Pc(700) int local700 = Static65.anIntArrayArrayArray5[local7][local222][local273 + 1];
								@Pc(706) int local706 = Static139.anIntArrayArray22[local222][local273];
								@Pc(716) int local716 = Static139.anIntArrayArray22[local222 + 1][local273 + 1];
								@Pc(724) int local724 = Static139.anIntArrayArray22[local222][local273 + 1];
								@Pc(726) int local726 = -1;
								@Pc(728) int local728 = -1;
								@Pc(739) int local739;
								@Pc(743) int local743;
								if (local635 > 0) {
									local739 = local176 * 256 / local200;
									local743 = local190 / local206;
									@Pc(747) int local747 = local196 / local206;
									local726 = Static153.method2484(local743, local739, local747);
									local747 += Static142.anInt3265;
									if (local747 < 0) {
										local747 = 0;
									} else if (local747 > 255) {
										local747 = 255;
									}
									local739 = local739 + Static150.anInt3579 & 0xFF;
									local728 = Static153.method2484(local743, local739, local747);
								}
								if (local7 > 0) {
									@Pc(788) boolean local788 = true;
									if (local635 == 0 && Static165.aByteArrayArrayArray2[local7][local222][local273] != 0) {
										local788 = false;
									}
									if (local645 > 0 && !Static100.method1730(local645 - 1).aBoolean6) {
										local788 = false;
									}
									if (local788 && local660 == local670 && local660 == local682 && local700 == local660) {
										Static5.anIntArrayArrayArray1[local7][local222][local273] |= 0x924;
									}
								}
								local739 = 0;
								if (local728 != -1) {
									local739 = Static36.anIntArray86[Static10.method181(96, local728)];
								}
								if (local645 == 0) {
									arg1.method1147(local7, local222, local273, 0, 0, -1, local660, local670, local682, local700, Static10.method181(local706, local726), Static10.method181(local690, local726), Static10.method181(local716, local726), Static10.method181(local724, local726), 0, 0, 0, 0, local739, 0);
								} else {
									local743 = Static165.aByteArrayArrayArray2[local7][local222][local273] + 1;
									@Pc(917) byte local917 = Static135.aByteArrayArrayArray6[local7][local222][local273];
									@Pc(923) Class3_Sub1_Sub1 local923 = Static100.method1730(local645 - 1);
									@Pc(926) int local926 = local923.anInt51;
									if (local926 >= 0 && !Static36.anInterface1_2.method1719(local926)) {
										local926 = -1;
									}
									@Pc(947) int local947;
									@Pc(943) int local943;
									@Pc(965) int local965;
									@Pc(970) int local970;
									if (local926 >= 0) {
										local947 = -1;
										local943 = Static36.anInterface1_2.method1724(local926);
									} else if (local923.anInt46 == 16711935) {
										local943 = -2;
										local926 = -1;
										local947 = -2;
									} else {
										local947 = Static153.method2484(local923.anInt45, local923.anInt54, local923.anInt50);
										local965 = Static150.anInt3579 + local923.anInt54 & 0xFF;
										local970 = local923.anInt50 + Static142.anInt3265;
										if (local970 < 0) {
											local970 = 0;
										} else if (local970 > 255) {
											local970 = 255;
										}
										local943 = Static153.method2484(local923.anInt45, local965, local970);
									}
									local965 = 0;
									if (local943 != -2) {
										local965 = Static36.anIntArray86[Static180.method2777(local943, 96)];
									}
									if (local923.anInt58 != -1) {
										local970 = local923.anInt52 + Static150.anInt3579 & 0xFF;
										@Pc(1031) int local1031 = local923.anInt53 + Static142.anInt3265;
										if (local1031 < 0) {
											local1031 = 0;
										} else if (local1031 > 255) {
											local1031 = 255;
										}
										local943 = Static153.method2484(local923.anInt47, local970, local1031);
										local965 = Static36.anIntArray86[Static180.method2777(local943, 96)];
									}
									arg1.method1147(local7, local222, local273, local743, local917, local926, local660, local670, local682, local700, Static10.method181(local706, local726), Static10.method181(local690, local726), Static10.method181(local716, local726), Static10.method181(local724, local726), Static180.method2777(local947, local706), Static180.method2777(local947, local690), Static180.method2777(local947, local716), Static180.method2777(local947, local724), local739, local965);
								}
							}
						}
					}
				}
			}
			for (local155 = 1; local155 < 103; local155++) {
				for (local176 = 1; local176 < 103; local176++) {
					arg1.method1167(local7, local176, local155, Static101.method1773(local155, local176, local7));
				}
			}
			Static90.aByteArrayArrayArray4[local7] = null;
			Static167.aByteArrayArrayArray8[local7] = null;
			Static165.aByteArrayArrayArray2[local7] = null;
			Static135.aByteArrayArrayArray6[local7] = null;
			Static65.aByteArrayArrayArray3[local7] = null;
		}
		arg1.method1142();
		for (local11 = 0; local11 < 104; local11++) {
			for (local26 = 0; local26 < 104; local26++) {
				if ((Static110.aByteArrayArrayArray5[1][local11][local26] & 0x2) == 2) {
					arg1.method1163(local11, local26);
				}
			}
		}
		local124 = 2;
		local26 = 1;
		local126 = 4;
		for (local130 = 0; local130 < 4; local130++) {
			if (local130 > 0) {
				local26 <<= 0x3;
				local124 <<= 0x3;
				local126 <<= 0x3;
			}
			for (local222 = 0; local222 <= local130; local222++) {
				for (local155 = 0; local155 <= 104; local155++) {
					for (local176 = 0; local176 <= 104; local176++) {
						if ((local26 & Static5.anIntArrayArrayArray1[local222][local176][local155]) != 0) {
							local190 = local155;
							local200 = local222;
							local196 = local155;
							while (local190 > 0 && (local26 & Static5.anIntArrayArrayArray1[local222][local176][local190 - 1]) != 0) {
								local190--;
							}
							while (local196 < 104 && (Static5.anIntArrayArrayArray1[local222][local176][local196 + 1] & local26) != 0) {
								local196++;
							}
							label354: while (local200 > 0) {
								for (local273 = local190; local273 <= local196; local273++) {
									if ((local26 & Static5.anIntArrayArrayArray1[local200 - 1][local176][local273]) == 0) {
										break label354;
									}
								}
								local200--;
							}
							label342: for (local206 = local222; local206 < local130; local206++) {
								for (local273 = local190; local273 <= local196; local273++) {
									if ((local26 & Static5.anIntArrayArrayArray1[local206 + 1][local176][local273]) == 0) {
										break label342;
									}
								}
							}
							local273 = (local196 + 1 - local190) * (local206 + 1 - local200);
							if (local273 >= 8) {
								local540 = Static65.anIntArrayArrayArray5[local206][local176][local190] - 240;
								local635 = Static65.anIntArrayArrayArray5[local200][local176][local190];
								Static64.method1175(local130, 1, local176 * 128, local176 * 128, local190 * 128, local196 * 128 + 128, local540, local635);
								for (local645 = local200; local645 <= local206; local645++) {
									for (local660 = local190; local660 <= local196; local660++) {
										Static5.anIntArrayArrayArray1[local645][local176][local660] &= ~local26;
									}
								}
							}
						}
						if ((Static5.anIntArrayArrayArray1[local222][local176][local155] & local124) != 0) {
							for (local190 = local176; local190 > 0 && (local124 & Static5.anIntArrayArrayArray1[local222][local190 - 1][local155]) != 0; local190--) {
							}
							local200 = local222;
							for (local196 = local176; local196 < 104 && (local124 & Static5.anIntArrayArrayArray1[local222][local196 + 1][local155]) != 0; local196++) {
							}
							local206 = local222;
							label407: while (local200 > 0) {
								for (local273 = local190; local273 <= local196; local273++) {
									if ((Static5.anIntArrayArrayArray1[local200 - 1][local273][local155] & local124) == 0) {
										break label407;
									}
								}
								local200--;
							}
							label396: while (local130 > local206) {
								for (local273 = local190; local273 <= local196; local273++) {
									if ((Static5.anIntArrayArrayArray1[local206 + 1][local273][local155] & local124) == 0) {
										break label396;
									}
								}
								local206++;
							}
							local273 = (local206 + 1 - local200) * (local196 + 1 - local190);
							if (local273 >= 8) {
								local540 = Static65.anIntArrayArrayArray5[local206][local190][local155] - 240;
								local635 = Static65.anIntArrayArrayArray5[local200][local190][local155];
								Static64.method1175(local130, 2, local190 * 128, local196 * 128 + 128, local155 * 128, local155 * 128, local540, local635);
								for (local645 = local200; local645 <= local206; local645++) {
									for (local660 = local190; local660 <= local196; local660++) {
										Static5.anIntArrayArrayArray1[local645][local660][local155] &= ~local124;
									}
								}
							}
						}
						if ((Static5.anIntArrayArrayArray1[local222][local176][local155] & local126) != 0) {
							local190 = local176;
							local196 = local176;
							local200 = local155;
							for (local206 = local155; local206 < 104 && (Static5.anIntArrayArrayArray1[local222][local176][local206 + 1] & local126) != 0; local206++) {
							}
							while (local200 > 0 && (local126 & Static5.anIntArrayArrayArray1[local222][local176][local200 - 1]) != 0) {
								local200--;
							}
							label462: while (local190 > 0) {
								for (local273 = local200; local273 <= local206; local273++) {
									if ((Static5.anIntArrayArrayArray1[local222][local190 - 1][local273] & local126) == 0) {
										break label462;
									}
								}
								local190--;
							}
							label451: while (local196 < 104) {
								for (local273 = local200; local273 <= local206; local273++) {
									if ((Static5.anIntArrayArrayArray1[local222][local196 + 1][local273] & local126) == 0) {
										break label451;
									}
								}
								local196++;
							}
							if ((local206 + 1 - local200) * (local196 + 1 - local190) >= 4) {
								local273 = Static65.anIntArrayArrayArray5[local222][local190][local200];
								Static64.method1175(local130, 4, local190 * 128, local196 * 128 + 128, local200 * 128, local206 * 128 + 128, local273, local273);
								for (local496 = local190; local496 <= local196; local496++) {
									for (local540 = local200; local540 <= local206; local540++) {
										Static5.anIntArrayArrayArray1[local222][local496][local540] &= ~local126;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2178(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static117.aClass64_1);
		arg0.removeMouseMotionListener(Static117.aClass64_1);
		arg0.removeFocusListener(Static117.aClass64_1);
		Static91.anInt2029 = 0;
	}
}
