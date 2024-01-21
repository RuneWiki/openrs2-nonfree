import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
	public static int anInt199;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_82 = Static8.method128("Benutzername: ");

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_83 = Static8.method128("");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!dd;Lclient!dd;Lclient!dd;)V")
	public static void method118(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) Class16 arg2) {
		Static113.aClass16_31 = arg2;
		Static84.aClass16_10 = arg1;
		Static16.aClass16_1 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([Lclient!fh;Lclient!re;I)V")
	public static void method119(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class68 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(30) int local30;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static2.aByteArrayArrayArray1[local7][local11][local15] & 0x1) == 1) {
						local30 = local7;
						if ((Static2.aByteArrayArrayArray1[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method1048(local15, local11);
						}
					}
				}
			}
		}
		Static34.anInt1142 += (int) (Math.random() * 5.0D) - 2;
		Static100.anInt2932 += (int) (Math.random() * 5.0D) - 2;
		if (Static34.anInt1142 < -16) {
			Static34.anInt1142 = -16;
		}
		if (Static100.anInt2932 < -8) {
			Static100.anInt2932 = -8;
		}
		if (Static100.anInt2932 > 8) {
			Static100.anInt2932 = 8;
		}
		if (Static34.anInt1142 > 16) {
			Static34.anInt1142 = 16;
		}
		@Pc(127) int local127;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(155) int local155;
		@Pc(176) int local176;
		@Pc(189) int local189;
		@Pc(199) int local199;
		@Pc(193) int local193;
		@Pc(254) int local254;
		@Pc(271) int local271;
		@Pc(248) int local248;
		@Pc(489) int local489;
		@Pc(531) int local531;
		@Pc(638) int local638;
		@Pc(648) int local648;
		@Pc(660) int local660;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(117) byte[][] local117 = Static143.aByteArrayArrayArray6[local11];
			local30 = (int) Math.sqrt(5100.0D);
			local127 = local30 * 768 >> 8;
			for (local129 = 1; local129 < 103; local129++) {
				for (local133 = 1; local133 < 103; local133++) {
					local155 = Static135.anIntArrayArrayArray5[local11][local133 + 1][local129] - Static135.anIntArrayArrayArray5[local11][local133 - 1][local129];
					local176 = Static135.anIntArrayArrayArray5[local11][local133][local129 + 1] - Static135.anIntArrayArrayArray5[local11][local133][local129 - 1];
					local189 = (int) Math.sqrt((double) (local176 * local176 + local155 * local155 + 65536));
					local193 = 65536 / local189;
					local199 = (local155 << 8) / local189;
					local248 = (local117[local133][local129 + 1] >> 3) + (local117[local133][local129 - 1] >> 2) + (local117[local133 + 1][local129] >> 3) + (local117[local133 + -1][local129] >> 2) + (local117[local133][local129] >> 1);
					local254 = (local176 << 8) / local189;
					local271 = (local199 * -50 + local193 * -10 + local254 * -50) / local127 + 96;
					Static141.anIntArrayArray63[local133][local129] = local271 - local248;
				}
			}
			for (local133 = 0; local133 < 104; local133++) {
				Static22.anIntArray44[local133] = 0;
				Static116.anIntArray289[local133] = 0;
				Static78.anIntArray210[local133] = 0;
				Static158.anIntArray397[local133] = 0;
				Static165.anIntArray408[local133] = 0;
			}
			for (local155 = -5; local155 < 109; local155++) {
				for (local176 = 0; local176 < 104; local176++) {
					local189 = local155 + 5;
					@Pc(392) int local392;
					if (local189 >= 0 && local189 < 104) {
						local199 = Static171.aByteArrayArrayArray8[local11][local189][local176] & 0xFF;
						if (local199 > 0) {
							@Pc(356) Class1_Sub1_Sub3 local356 = Static122.method2402(local199 - 1);
							Static22.anIntArray44[local176] += local356.anInt191;
							Static116.anIntArray289[local176] += local356.anInt193;
							Static78.anIntArray210[local176] += local356.anInt182;
							Static158.anIntArray397[local176] += local356.anInt186;
							local392 = Static165.anIntArray408[local176]++;
						}
					}
					local199 = local155 - 5;
					if (local199 >= 0 && local199 < 104) {
						local193 = Static171.aByteArrayArrayArray8[local11][local199][local176] & 0xFF;
						if (local193 > 0) {
							@Pc(422) Class1_Sub1_Sub3 local422 = Static122.method2402(local193 - 1);
							Static22.anIntArray44[local176] -= local422.anInt191;
							Static116.anIntArray289[local176] -= local422.anInt193;
							Static78.anIntArray210[local176] -= local422.anInt182;
							Static158.anIntArray397[local176] -= local422.anInt186;
							local392 = Static165.anIntArray408[local176]--;
						}
					}
				}
				if (local155 >= 1 && local155 < 103) {
					local189 = 0;
					local199 = 0;
					local254 = 0;
					local193 = 0;
					local271 = 0;
					for (local248 = -5; local248 < 109; local248++) {
						local489 = local248 + 5;
						if (local489 >= 0 && local489 < 104) {
							local254 += Static158.anIntArray397[local489];
							local271 += Static165.anIntArray408[local489];
							local199 += Static116.anIntArray289[local489];
							local189 += Static22.anIntArray44[local489];
							local193 += Static78.anIntArray210[local489];
						}
						local531 = local248 - 5;
						if (local531 >= 0 && local531 < 104) {
							local199 -= Static116.anIntArray289[local531];
							local254 -= Static158.anIntArray397[local531];
							local193 -= Static78.anIntArray210[local531];
							local271 -= Static165.anIntArray408[local531];
							local189 -= Static22.anIntArray44[local531];
						}
						if (local248 >= 1 && local248 < 103 && (!Static27.aBoolean26 || (Static2.aByteArrayArrayArray1[0][local155][local248] & 0x2) != 0 || (Static2.aByteArrayArrayArray1[local11][local155][local248] & 0x10) == 0 && Static106.method2187(local11, local155, local248) == Static99.anInt3024)) {
							if (Static95.anInt2954 > local11) {
								Static95.anInt2954 = local11;
							}
							local638 = Static171.aByteArrayArrayArray8[local11][local155][local248] & 0xFF;
							local648 = Static28.aByteArrayArrayArray5[local11][local155][local248] & 0xFF;
							if (local638 > 0 || local648 > 0) {
								local660 = Static135.anIntArrayArrayArray5[local11][local155][local248];
								@Pc(672) int local672 = Static135.anIntArrayArrayArray5[local11][local155 + 1][local248 + 1];
								@Pc(678) int local678 = Static141.anIntArrayArray63[local155][local248];
								@Pc(686) int local686 = Static141.anIntArrayArray63[local155 + 1][local248];
								@Pc(696) int local696 = Static135.anIntArrayArrayArray5[local11][local155][local248 + 1];
								@Pc(704) int local704 = Static141.anIntArrayArray63[local155][local248 + 1];
								@Pc(706) int local706 = -1;
								@Pc(716) int local716 = Static135.anIntArrayArrayArray5[local11][local155 + 1][local248];
								@Pc(718) int local718 = -1;
								@Pc(728) int local728 = Static141.anIntArrayArray63[local155 + 1][local248 + 1];
								@Pc(736) int local736;
								@Pc(740) int local740;
								if (local638 > 0) {
									local736 = local189 * 256 / local254;
									local740 = local199 / local271;
									@Pc(744) int local744 = local193 / local271;
									local706 = Static109.method2230(local744, local740, local736);
									local744 += Static34.anInt1142;
									if (local744 < 0) {
										local744 = 0;
									} else if (local744 > 255) {
										local744 = 255;
									}
									local736 = Static100.anInt2932 + local736 & 0xFF;
									local718 = Static109.method2230(local744, local740, local736);
								}
								if (local11 > 0) {
									@Pc(783) boolean local783 = true;
									if (local638 == 0 && Static107.aByteArrayArrayArray4[local11][local155][local248] != 0) {
										local783 = false;
									}
									if (local648 > 0 && !Static57.method1174(local648 - 1).aBoolean61) {
										local783 = false;
									}
									if (local783 && local716 == local660 && local672 == local660 && local660 == local696) {
										Static9.anIntArrayArrayArray1[local11][local155][local248] |= 0x924;
									}
								}
								local736 = 0;
								if (local718 != -1) {
									local736 = Static79.anIntArray217[Static39.method778(local718, 96)];
								}
								if (local648 == 0) {
									arg1.method2631(local11, local155, local248, 0, 0, -1, local660, local716, local672, local696, Static39.method778(local706, local678), Static39.method778(local706, local686), Static39.method778(local706, local728), Static39.method778(local706, local704), 0, 0, 0, 0, local736, 0);
								} else {
									local740 = Static107.aByteArrayArrayArray4[local11][local155][local248] + 1;
									@Pc(912) byte local912 = Static60.aByteArrayArrayArray3[local11][local155][local248];
									@Pc(918) Class1_Sub1_Sub9 local918 = Static57.method1174(local648 - 1);
									@Pc(921) int local921 = local918.anInt1619;
									if (local921 >= 0 && !Static79.anInterface3_1.method3055(local921)) {
										local921 = -1;
									}
									@Pc(940) int local940;
									@Pc(945) int local945;
									@Pc(975) int local975;
									@Pc(981) int local981;
									if (local921 >= 0) {
										local940 = -1;
										local945 = Static79.anInterface3_1.method3054(local921);
									} else if (local918.anInt1623 == 16711935) {
										local940 = -2;
										local945 = -2;
										local921 = -1;
									} else {
										local940 = Static109.method2230(local918.anInt1626, local918.anInt1625, local918.anInt1632);
										local975 = Static100.anInt2932 + local918.anInt1632 & 0xFF;
										local981 = local918.anInt1626 + Static34.anInt1142;
										if (local981 < 0) {
											local981 = 0;
										} else if (local981 > 255) {
											local981 = 255;
										}
										local945 = Static109.method2230(local981, local918.anInt1625, local975);
									}
									local975 = 0;
									if (local945 != -2) {
										local975 = Static79.anIntArray217[Static54.method1134(96, local945)];
									}
									if (local918.anInt1630 != -1) {
										@Pc(1024) int local1024 = Static34.anInt1142 + local918.anInt1624;
										local981 = Static100.anInt2932 + local918.anInt1628 & 0xFF;
										if (local1024 < 0) {
											local1024 = 0;
										} else if (local1024 > 255) {
											local1024 = 255;
										}
										local945 = Static109.method2230(local1024, local918.anInt1631, local981);
										local975 = Static79.anIntArray217[Static54.method1134(96, local945)];
									}
									arg1.method2631(local11, local155, local248, local740, local912, local921, local660, local716, local672, local696, Static39.method778(local706, local678), Static39.method778(local706, local686), Static39.method778(local706, local728), Static39.method778(local706, local704), Static54.method1134(local678, local940), Static54.method1134(local686, local940), Static54.method1134(local728, local940), Static54.method1134(local704, local940), local736, local975);
								}
							}
						}
					}
				}
			}
			for (local176 = 1; local176 < 103; local176++) {
				for (local189 = 1; local189 < 103; local189++) {
					arg1.method2637(local11, local189, local176, Static106.method2187(local11, local189, local176));
				}
			}
			Static171.aByteArrayArrayArray8[local11] = null;
			Static28.aByteArrayArrayArray5[local11] = null;
			Static107.aByteArrayArrayArray4[local11] = null;
			Static60.aByteArrayArrayArray3[local11] = null;
			Static143.aByteArrayArrayArray6[local11] = null;
		}
		arg1.method2613();
		for (local15 = 0; local15 < 104; local15++) {
			for (local30 = 0; local30 < 104; local30++) {
				if ((Static2.aByteArrayArrayArray1[1][local15][local30] & 0x2) == 2) {
					arg1.method2629(local15, local30);
				}
			}
		}
		local30 = 1;
		local127 = 2;
		local129 = 4;
		for (local133 = 0; local133 < 4; local133++) {
			if (local133 > 0) {
				local129 <<= 0x3;
				local127 <<= 0x3;
				local30 <<= 0x3;
			}
			for (local155 = 0; local155 <= local133; local155++) {
				for (local176 = 0; local176 <= 104; local176++) {
					for (local189 = 0; local189 <= 104; local189++) {
						if ((Static9.anIntArrayArrayArray1[local155][local189][local176] & local30) != 0) {
							for (local199 = local176; local199 > 0 && (Static9.anIntArrayArrayArray1[local155][local189][local199 - 1] & local30) != 0; local199--) {
							}
							for (local193 = local176; local193 < 104 && (local30 & Static9.anIntArrayArrayArray1[local155][local189][local193 + 1]) != 0; local193++) {
							}
							local271 = local155;
							label353: for (local254 = local155; local254 > 0; local254--) {
								for (local248 = local199; local248 <= local193; local248++) {
									if ((Static9.anIntArrayArrayArray1[local254 - 1][local189][local248] & local30) == 0) {
										break label353;
									}
								}
							}
							label342: while (local271 < local133) {
								for (local248 = local199; local248 <= local193; local248++) {
									if ((Static9.anIntArrayArrayArray1[local271 + 1][local189][local248] & local30) == 0) {
										break label342;
									}
								}
								local271++;
							}
							local248 = (local271 + 1 - local254) * ((local193 + 1) - local199);
							if (local248 >= 8) {
								local531 = Static135.anIntArrayArrayArray5[local271][local189][local199] - 240;
								local638 = Static135.anIntArrayArrayArray5[local254][local189][local199];
								Static138.method2651(local133, 1, local189 * 128, local189 * 128, local199 * 128, local193 * 128 + 128, local531, local638);
								for (local648 = local254; local648 <= local271; local648++) {
									for (local660 = local199; local660 <= local193; local660++) {
										Static9.anIntArrayArrayArray1[local648][local189][local660] &= ~local30;
									}
								}
							}
						}
						if ((Static9.anIntArrayArrayArray1[local155][local189][local176] & local127) != 0) {
							local193 = local189;
							for (local199 = local189; local199 > 0 && (local127 & Static9.anIntArrayArrayArray1[local155][local199 - 1][local176]) != 0; local199--) {
							}
							while (local193 < 104 && (Static9.anIntArrayArrayArray1[local155][local193 + 1][local176] & local127) != 0) {
								local193++;
							}
							local254 = local155;
							local271 = local155;
							label408: while (local254 > 0) {
								for (local248 = local199; local248 <= local193; local248++) {
									if ((Static9.anIntArrayArrayArray1[local254 - 1][local248][local176] & local127) == 0) {
										break label408;
									}
								}
								local254--;
							}
							label397: while (local133 > local271) {
								for (local248 = local199; local248 <= local193; local248++) {
									if ((local127 & Static9.anIntArrayArrayArray1[local271 + 1][local248][local176]) == 0) {
										break label397;
									}
								}
								local271++;
							}
							local248 = (local271 + 1 - local254) * (local193 + 1 - local199);
							if (local248 >= 8) {
								local638 = Static135.anIntArrayArrayArray5[local254][local199][local176];
								local531 = Static135.anIntArrayArrayArray5[local271][local199][local176] - 240;
								Static138.method2651(local133, 2, local199 * 128, local193 * 128 + 128, local176 * 128, local176 * 128, local531, local638);
								for (local648 = local254; local648 <= local271; local648++) {
									for (local660 = local199; local660 <= local193; local660++) {
										Static9.anIntArrayArrayArray1[local648][local660][local176] &= ~local127;
									}
								}
							}
						}
						if ((local129 & Static9.anIntArrayArrayArray1[local155][local189][local176]) != 0) {
							local199 = local189;
							local254 = local176;
							local193 = local189;
							while (local254 > 0 && (Static9.anIntArrayArrayArray1[local155][local189][local254 - 1] & local129) != 0) {
								local254--;
							}
							for (local271 = local176; local271 < 104 && (local129 & Static9.anIntArrayArrayArray1[local155][local189][local271 + 1]) != 0; local271++) {
							}
							label462: while (local199 > 0) {
								for (local248 = local254; local248 <= local271; local248++) {
									if ((local129 & Static9.anIntArrayArrayArray1[local155][local199 - 1][local248]) == 0) {
										break label462;
									}
								}
								local199--;
							}
							label451: while (local193 < 104) {
								for (local248 = local254; local248 <= local271; local248++) {
									if ((Static9.anIntArrayArrayArray1[local155][local193 + 1][local248] & local129) == 0) {
										break label451;
									}
								}
								local193++;
							}
							if ((local193 + 1 - local199) * (local271 - local254 + 1) >= 4) {
								local248 = Static135.anIntArrayArrayArray5[local155][local199][local254];
								Static138.method2651(local133, 4, local199 * 128, local193 * 128 + 128, local254 * 128, local271 * 128 + 128, local248, local248);
								for (local489 = local199; local489 <= local193; local489++) {
									for (local531 = local254; local531 <= local271; local531++) {
										Static9.anIntArrayArrayArray1[local155][local489][local531] &= ~local129;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method120() {
		aClass18_83 = null;
		aClass18_82 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BJ)V")
	public static void method121(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static95.aClass1_Sub6_Sub1_1.method555(163);
			Static95.aClass1_Sub6_Sub1_1.method515(arg0);
		}
	}
}
