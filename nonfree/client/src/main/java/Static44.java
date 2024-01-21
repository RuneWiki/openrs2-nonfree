import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!fa", name = "Z", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!fa", name = "fb", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!fa", name = "ob", descriptor = "Lclient!ea;")
	public static Class21 aClass21_3;

	@OriginalMember(owner = "client!fa", name = "tb", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 aClass1_Sub1_Sub12_Sub1_3;

	@OriginalMember(owner = "client!fa", name = "rb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_463 = Static169.method2903("Your account has been disabled)3");

	@OriginalMember(owner = "client!fa", name = "ab", descriptor = "Lclient!ed;")
	public static Class23 aClass23_460 = aClass23_463;

	@OriginalMember(owner = "client!fa", name = "bb", descriptor = "[I")
	public static int[] anIntArray146 = new int[] { 33, 6, 45, 28, 41, 7, 19, 14 };

	@OriginalMember(owner = "client!fa", name = "gb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_461 = Static169.method2903("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!fa", name = "lb", descriptor = "I")
	public static int anInt1219 = 0;

	@OriginalMember(owner = "client!fa", name = "nb", descriptor = "[Lclient!ag;")
	public static Class6[] aClass6Array1 = new Class6[50];

	@OriginalMember(owner = "client!fa", name = "qb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_462 = Static169.method2903("Could not complete login)3");

	@OriginalMember(owner = "client!fa", name = "sb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_464 = aClass23_462;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
	public static void method739() {
		aClass23_461 = null;
		anIntArray145 = null;
		aClass23_462 = null;
		anIntArray146 = null;
		aClass6Array1 = null;
		aClass23_460 = null;
		aClass1_Sub1_Sub12_Sub1_3 = null;
		aClass23_464 = null;
		aClass23_463 = null;
		anIntArray147 = null;
		aClass21_3 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([Lclient!qh;ZLclient!te;)V")
	public static void method740(@OriginalArg(0) Class69[] arg0, @OriginalArg(2) Class80 arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static12.aByteArrayArrayArray11[local3][local7][local11] & 0x1) == 1) {
						@Pc(26) int local26 = local3;
						if ((Static12.aByteArrayArrayArray11[1][local7][local11] & 0x2) == 2) {
							local26 = local3 - 1;
						}
						if (local26 >= 0) {
							arg0[local26].method2401(local11, local7);
						}
					}
				}
			}
		}
		Static67.anInt1756 += (int) (Math.random() * 5.0D) - 2;
		Static176.anInt4186 += (int) (Math.random() * 5.0D) - 2;
		if (Static67.anInt1756 < -8) {
			Static67.anInt1756 = -8;
		}
		if (Static176.anInt4186 < -16) {
			Static176.anInt4186 = -16;
		}
		if (Static176.anInt4186 > 16) {
			Static176.anInt4186 = 16;
		}
		if (Static67.anInt1756 > 8) {
			Static67.anInt1756 = 8;
		}
		local7 = Static67.anInt1756 >> 2 << 10;
		local11 = Static176.anInt4186 >> 1;
		@Pc(132) int[][] local132 = new int[104][104];
		@Pc(136) int[][] local136 = new int[104][104];
		@Pc(148) int local148;
		@Pc(154) int local154;
		@Pc(156) int local156;
		@Pc(160) int local160;
		@Pc(250) int local250;
		@Pc(184) int local184;
		@Pc(205) int local205;
		@Pc(218) int local218;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(234) int local234;
		@Pc(299) int local299;
		@Pc(514) int local514;
		@Pc(551) int local551;
		@Pc(805) int local805;
		@Pc(820) int local820;
		@Pc(845) int local845;
		for (@Pc(138) int local138 = 0; local138 < 4; local138++) {
			@Pc(144) byte[][] local144 = Static60.aByteArrayArrayArray109[local138];
			local148 = (int) Math.sqrt(5100.0D);
			local154 = local148 * 768 >> 8;
			for (local156 = 1; local156 < 103; local156++) {
				for (local160 = 1; local160 < 103; local160++) {
					local184 = Static141.anIntArrayArrayArray3[local138][local160 + 1][local156] - Static141.anIntArrayArrayArray3[local138][local160 - 1][local156];
					local205 = Static141.anIntArrayArrayArray3[local138][local160][local156 + 1] - Static141.anIntArrayArrayArray3[local138][local160][local156 - 1];
					local218 = (int) Math.sqrt((double) (local205 * local205 + local184 * local184 + 65536));
					local224 = (local184 << 8) / local218;
					local228 = 65536 / local218;
					local234 = (local205 << 8) / local218;
					local250 = (local234 * -50 + local224 * -50 + local228 * -10) / local154 + 96;
					local299 = (local144[local160][local156] >> 1) + (local144[local160 - 1][local156] >> 2) + (local144[local160 + 1][local156] >> 3) + (local144[local160][local156 + -1] >> 2) + (local144[local160][local156 + 1] >> 3);
					local132[local160][local156] = local250 - local299;
				}
			}
			for (local160 = 0; local160 < 104; local160++) {
				Static22.anIntArray96[local160] = 0;
				Static9.anIntArray55[local160] = 0;
				Static142.anIntArray477[local160] = 0;
				Static157.anIntArray519[local160] = 0;
				anIntArray147[local160] = 0;
			}
			for (local250 = -5; local250 < 104; local250++) {
				for (local184 = 0; local184 < 104; local184++) {
					local205 = local250 + 5;
					@Pc(418) int local418;
					if (local205 < 104) {
						local218 = Static154.aByteArrayArrayArray91[local138][local205][local184] & 0xFF;
						if (local218 > 0) {
							@Pc(382) Class1_Sub1_Sub5 local382 = Static97.method1672(local218 - 1);
							Static22.anIntArray96[local184] += local382.anInt753;
							Static9.anIntArray55[local184] += local382.anInt754;
							Static142.anIntArray477[local184] += local382.anInt742;
							Static157.anIntArray519[local184] += local382.anInt745;
							local418 = anIntArray147[local184]++;
						}
					}
					local218 = local250 - 5;
					if (local218 >= 0) {
						local224 = Static154.aByteArrayArrayArray91[local138][local218][local184] & 0xFF;
						if (local224 > 0) {
							@Pc(448) Class1_Sub1_Sub5 local448 = Static97.method1672(local224 - 1);
							Static22.anIntArray96[local184] -= local448.anInt753;
							Static9.anIntArray55[local184] -= local448.anInt754;
							Static142.anIntArray477[local184] -= local448.anInt742;
							Static157.anIntArray519[local184] -= local448.anInt745;
							local418 = anIntArray147[local184]--;
						}
					}
				}
				if (local250 >= 0) {
					local205 = 0;
					local218 = 0;
					local228 = 0;
					local234 = 0;
					local224 = 0;
					for (local299 = -5; local299 < 104; local299++) {
						local514 = local299 + 5;
						if (local514 < 104) {
							local205 += Static22.anIntArray96[local514];
							local228 += Static157.anIntArray519[local514];
							local234 += anIntArray147[local514];
							local218 += Static9.anIntArray55[local514];
							local224 += Static142.anIntArray477[local514];
						}
						local551 = local299 - 5;
						if (local551 >= 0) {
							local218 -= Static9.anIntArray55[local551];
							local224 -= Static142.anIntArray477[local551];
							local228 -= Static157.anIntArray519[local551];
							local205 -= Static22.anIntArray96[local551];
							local234 -= anIntArray147[local551];
						}
						if (local299 >= 0 && local234 > 0) {
							local136[local250][local299] = Static149.method2572(local224 / local234, local218 / local234, local205 * 256 / local228);
						}
					}
				}
			}
			for (local184 = 1; local184 < 103; local184++) {
				for (local205 = 1; local205 < 103; local205++) {
					if (!Static8.aBoolean17 || (Static12.aByteArrayArrayArray11[0][local184][local205] & 0x2) != 0 || (Static12.aByteArrayArrayArray11[local138][local184][local205] & 0x10) == 0 && Static29.method531(local205, local138, local184) == Static100.anInt2570) {
						if (Static7.anInt327 > local138) {
							Static7.anInt327 = local138;
						}
						local218 = Static154.aByteArrayArrayArray91[local138][local184][local205] & 0xFF;
						local224 = Static74.aByteArrayArrayArray45[local138][local184][local205] & 0xFF;
						if (local218 > 0 || local224 > 0) {
							local234 = Static141.anIntArrayArrayArray3[local138][local184 + 1][local205];
							local228 = Static141.anIntArrayArrayArray3[local138][local184][local205];
							local514 = Static141.anIntArrayArrayArray3[local138][local184][local205 + 1];
							local299 = Static141.anIntArrayArrayArray3[local138][local184 + 1][local205 + 1];
							if (local138 > 0) {
								@Pc(742) boolean local742 = true;
								if (local218 == 0 && Static177.aByteArrayArrayArray104[local138][local184][local205] != 0) {
									local742 = false;
								}
								if (local224 > 0 && !Static112.method1988(local224 - 1).aBoolean83) {
									local742 = false;
								}
								if (local742 && local234 == local228 && local228 == local299 && local514 == local228) {
									Static144.anIntArrayArrayArray4[local138][local184][local205] |= 0x924;
								}
							}
							if (local218 <= 0) {
								local551 = -1;
								local805 = 0;
							} else {
								local551 = local136[local184][local205];
								local820 = (local551 & 0x7F) + local11;
								if (local820 < 0) {
									local820 = 0;
								} else if (local820 > 127) {
									local820 = 127;
								}
								local845 = (local551 & 0x380) + (local551 + local7 & 0xFC00) + local820;
								local805 = Static121.anIntArray421[Static165.method2852(96, local845)];
							}
							local820 = local132[local184][local205];
							@Pc(868) int local868 = local132[local184 + 1][local205 + 1];
							@Pc(876) int local876 = local132[local184][local205 + 1];
							local845 = local132[local184 + 1][local205];
							if (local224 == 0) {
								arg1.method2686(local138, local184, local205, 0, 0, -1, local228, local234, local299, local514, Static165.method2852(local820, local551), Static165.method2852(local845, local551), Static165.method2852(local868, local551), Static165.method2852(local876, local551), 0, 0, 0, 0, local805, 0);
							} else {
								@Pc(935) int local935 = Static177.aByteArrayArrayArray104[local138][local184][local205] + 1;
								@Pc(943) byte local943 = Static36.aByteArrayArrayArray24[local138][local184][local205];
								@Pc(949) Class1_Sub1_Sub10 local949 = Static112.method1988(local224 - 1);
								@Pc(952) int local952 = local949.anInt1675;
								if (local952 >= 0 && !Static121.anInterface1_1.method104(local952)) {
									local952 = -1;
								}
								@Pc(965) int local965;
								@Pc(975) int local975;
								@Pc(991) int local991;
								@Pc(1020) int local1020;
								if (local952 >= 0) {
									local965 = -1;
									local975 = Static121.anIntArray421[Static15.method267(96, Static121.anInterface1_1.method109(local952))];
								} else if (local949.anInt1678 == -1) {
									local975 = 0;
									local965 = -2;
								} else {
									local965 = local949.anInt1678;
									local991 = (local965 & 0x7F) + local11;
									if (local991 < 0) {
										local991 = 0;
									} else if (local991 > 127) {
										local991 = 127;
									}
									local1020 = local991 + (local7 + local965 & 0xFC00) + (local965 & 0x380);
									local975 = Static121.anIntArray421[Static15.method267(96, local1020)];
								}
								if (local949.anInt1674 >= 0) {
									local991 = local949.anInt1674;
									local1020 = local11 + (local991 & 0x7F);
									if (local1020 < 0) {
										local1020 = 0;
									} else if (local1020 > 127) {
										local1020 = 127;
									}
									@Pc(1069) int local1069 = (local7 + local991 & 0xFC00) + ((local991 & 0x380) + local1020);
									local975 = Static121.anIntArray421[Static15.method267(96, local1069)];
								}
								arg1.method2686(local138, local184, local205, local935, local943, local952, local228, local234, local299, local514, Static165.method2852(local820, local551), Static165.method2852(local845, local551), Static165.method2852(local868, local551), Static165.method2852(local876, local551), Static15.method267(local820, local965), Static15.method267(local845, local965), Static15.method267(local868, local965), Static15.method267(local876, local965), local805, local975);
							}
						}
					}
				}
			}
			for (local205 = 1; local205 < 103; local205++) {
				for (local218 = 1; local218 < 103; local218++) {
					arg1.method2667(local138, local218, local205, Static29.method531(local205, local138, local218));
				}
			}
			Static154.aByteArrayArrayArray91[local138] = null;
			Static74.aByteArrayArrayArray45[local138] = null;
			Static177.aByteArrayArrayArray104[local138] = null;
			Static36.aByteArrayArrayArray24[local138] = null;
			Static60.aByteArrayArrayArray109[local138] = null;
		}
		arg1.method2677();
		for (@Pc(1193) int local1193 = 0; local1193 < 104; local1193++) {
			for (local148 = 0; local148 < 104; local148++) {
				if ((Static12.aByteArrayArrayArray11[1][local1193][local148] & 0x2) == 2) {
					arg1.method2703(local1193, local148);
				}
			}
		}
		local148 = 1;
		local156 = 4;
		local154 = 2;
		for (local160 = 0; local160 < 4; local160++) {
			if (local160 > 0) {
				local148 <<= 0x3;
				local156 <<= 0x3;
				local154 <<= 0x3;
			}
			for (local250 = 0; local250 <= local160; local250++) {
				for (local184 = 0; local184 <= 104; local184++) {
					for (local205 = 0; local205 <= 104; local205++) {
						if ((Static144.anIntArrayArrayArray4[local250][local205][local184] & local148) != 0) {
							local218 = local184;
							for (local224 = local184; local224 < 104 && (Static144.anIntArrayArrayArray4[local250][local205][local224 + 1] & local148) != 0; local224++) {
							}
							local228 = local250;
							while (local218 > 0 && (local148 & Static144.anIntArrayArrayArray4[local250][local205][local218 - 1]) != 0) {
								local218--;
							}
							local234 = local250;
							label350: while (local228 > 0) {
								for (local299 = local218; local299 <= local224; local299++) {
									if ((local148 & Static144.anIntArrayArrayArray4[local228 - 1][local205][local299]) == 0) {
										break label350;
									}
								}
								local228--;
							}
							label339: while (local160 > local234) {
								for (local299 = local218; local299 <= local224; local299++) {
									if ((Static144.anIntArrayArrayArray4[local234 + 1][local205][local299] & local148) == 0) {
										break label339;
									}
								}
								local234++;
							}
							local299 = (local234 + 1 - local228) * (local224 + 1 - local218);
							if (local299 >= 8) {
								local551 = Static141.anIntArrayArrayArray3[local234][local205][local218] - 240;
								local805 = Static141.anIntArrayArrayArray3[local228][local205][local218];
								Static159.method2671(local160, 1, local205 * 128, local205 * 128, local218 * 128, local224 * 128 + 128, local551, local805);
								for (local820 = local228; local820 <= local234; local820++) {
									for (local845 = local218; local845 <= local224; local845++) {
										Static144.anIntArrayArrayArray4[local820][local205][local845] &= ~local148;
									}
								}
							}
						}
						if ((local154 & Static144.anIntArrayArrayArray4[local250][local205][local184]) != 0) {
							for (local218 = local205; local218 > 0 && (Static144.anIntArrayArrayArray4[local250][local218 - 1][local184] & local154) != 0; local218--) {
							}
							for (local224 = local205; local224 < 104 && (local154 & Static144.anIntArrayArrayArray4[local250][local224 + 1][local184]) != 0; local224++) {
							}
							local234 = local250;
							label405: for (local228 = local250; local228 > 0; local228--) {
								for (local299 = local218; local299 <= local224; local299++) {
									if ((local154 & Static144.anIntArrayArrayArray4[local228 - 1][local299][local184]) == 0) {
										break label405;
									}
								}
							}
							label394: while (local234 < local160) {
								for (local299 = local218; local299 <= local224; local299++) {
									if ((local154 & Static144.anIntArrayArrayArray4[local234 + 1][local299][local184]) == 0) {
										break label394;
									}
								}
								local234++;
							}
							local299 = (local234 + 1 - local228) * ((local224 + 1) - local218);
							if (local299 >= 8) {
								local805 = Static141.anIntArrayArrayArray3[local228][local218][local184];
								local551 = Static141.anIntArrayArrayArray3[local234][local218][local184] - 240;
								Static159.method2671(local160, 2, local218 * 128, local224 * 128 + 128, local184 * 128, local184 * 128, local551, local805);
								for (local820 = local228; local820 <= local234; local820++) {
									for (local845 = local218; local845 <= local224; local845++) {
										Static144.anIntArrayArrayArray4[local820][local845][local184] &= ~local154;
									}
								}
							}
						}
						if ((Static144.anIntArrayArrayArray4[local250][local205][local184] & local156) != 0) {
							local234 = local184;
							local228 = local184;
							local224 = local205;
							while (local228 > 0 && (local156 & Static144.anIntArrayArrayArray4[local250][local205][local228 - 1]) != 0) {
								local228--;
							}
							while (local234 < 104 && (local156 & Static144.anIntArrayArrayArray4[local250][local205][local234 + 1]) != 0) {
								local234++;
							}
							label460: for (local218 = local205; local218 > 0; local218--) {
								for (local299 = local228; local299 <= local234; local299++) {
									if ((Static144.anIntArrayArrayArray4[local250][local218 - 1][local299] & local156) == 0) {
										break label460;
									}
								}
							}
							label449: while (local224 < 104) {
								for (local299 = local228; local299 <= local234; local299++) {
									if ((Static144.anIntArrayArrayArray4[local250][local224 + 1][local299] & local156) == 0) {
										break label449;
									}
								}
								local224++;
							}
							if ((local234 + 1 - local228) * (-local218 + local224 - -1) >= 4) {
								local299 = Static141.anIntArrayArrayArray3[local250][local218][local228];
								Static159.method2671(local160, 4, local218 * 128, local224 * 128 + 128, local228 * 128, local234 * 128 + 128, local299, local299);
								for (local514 = local218; local514 <= local224; local514++) {
									for (local551 = local228; local551 <= local234; local551++) {
										Static144.anIntArrayArrayArray4[local250][local514][local551] &= ~local156;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZLclient!ed;ILclient!ed;Lclient!ga;I)V")
	public static void method741(@OriginalArg(1) Class23 arg0, @OriginalArg(3) Class23 arg1, @OriginalArg(4) Class30 arg2) {
		@Pc(4) int local4 = arg2.method1281(arg0);
		@Pc(21) int local21 = arg2.method1296(arg1, local4);
		Static181.method3134(local4, 255, arg2, local21);
	}
}
