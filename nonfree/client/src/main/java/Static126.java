import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!hd;")
	public static Class1_Sub1_Sub1_Sub5_Sub2 aClass1_Sub1_Sub1_Sub5_Sub2_1;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_15;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
	public static int anInt2888;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public static int anInt2877 = 0;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1686 = Static106.method1849("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1683 = aClass66_1686;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1684 = Static106.method1849("(U5");

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public static int anInt2880 = 0;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1685 = Static106.method1849("<br>(X100(U(Y");

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
	public static int anInt2886 = 0;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1687 = Static106.method1849("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1688 = Static106.method1849(":chalreq:");

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1689 = aClass66_1686;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
	public static int anInt2891 = 0;

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1690 = Static106.method1849("(U0a )2 via: ");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!sc;II)V")
	public static void method2018(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class66 local13 = arg0.method1841().method1820();
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < Static111.anInt2653; local17++) {
			@Pc(25) Class1_Sub1_Sub1_Sub5_Sub2 local25 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[Static51.anIntArray239[local17]];
			if (local25 != null && local25.aClass66_707 != null && local25.aClass66_707.method1843(local13)) {
				local15 = true;
				Static35.method633(local25.anIntArray189[0], 0, 0, 1, 2, local25.anIntArray191[0], 1, false, aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				if (arg1 == 1) {
					Static127.aClass1_Sub12_Sub1_2.method1227(115);
					Static127.aClass1_Sub12_Sub1_2.method1204(Static51.anIntArray239[local17]);
				} else if (arg1 == 4) {
					Static127.aClass1_Sub12_Sub1_2.method1227(106);
					Static127.aClass1_Sub12_Sub1_2.method1175(Static51.anIntArray239[local17]);
				} else if (arg1 == 6) {
					Static127.aClass1_Sub12_Sub1_2.method1227(120);
					Static127.aClass1_Sub12_Sub1_2.method1204(Static51.anIntArray239[local17]);
				} else if (arg1 == 7) {
					Static127.aClass1_Sub12_Sub1_2.method1227(208);
					Static127.aClass1_Sub12_Sub1_2.method1175(Static51.anIntArray239[local17]);
				}
				break;
			}
		}
		if (!local15) {
			Static103.method1791(0, Static13.aClass66_284, Static41.method897(new Class66[] { Static48.aClass66_803, local13 }));
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method2019() {
		aClass66_1690 = null;
		aClass66_1685 = null;
		aClass1_Sub1_Sub1_Sub5_Sub2_1 = null;
		aClass66_1686 = null;
		aClass66_1684 = null;
		aClass66_1687 = null;
		aClass1_Sub1_Sub2_Sub1_15 = null;
		aClass66_1683 = null;
		aClass66_1688 = null;
		aClass66_1689 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z[Lclient!da;Lclient!be;)V")
	public static void method2020(@OriginalArg(1) Class13[] arg0, @OriginalArg(2) Class9 arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(26) int local26;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static87.aByteArrayArrayArray15[local3][local7][local11] & 0x1) == 1) {
						local26 = local3;
						if ((Static87.aByteArrayArrayArray15[1][local7][local11] & 0x2) == 2) {
							local26 = local3 - 1;
						}
						if (local26 >= 0) {
							arg0[local26].method475(local7, local11);
						}
					}
				}
			}
		}
		Static118.anInt2769 += (int) (Math.random() * 5.0D) - 2;
		if (Static118.anInt2769 < -16) {
			Static118.anInt2769 = -16;
		}
		Static90.anInt1847 += (int) (Math.random() * 5.0D) - 2;
		if (Static90.anInt1847 < -8) {
			Static90.anInt1847 = -8;
		}
		if (Static118.anInt2769 > 16) {
			Static118.anInt2769 = 16;
		}
		if (Static90.anInt1847 > 8) {
			Static90.anInt1847 = 8;
		}
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(134) int local134;
		@Pc(157) int local157;
		@Pc(178) int local178;
		@Pc(191) int local191;
		@Pc(207) int local207;
		@Pc(195) int local195;
		@Pc(201) int local201;
		@Pc(274) int local274;
		@Pc(257) int local257;
		@Pc(503) int local503;
		@Pc(507) int local507;
		@Pc(649) int local649;
		@Pc(659) int local659;
		@Pc(671) int local671;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(118) byte[][] local118 = Static22.aByteArrayArrayArray6[local7];
			local26 = (int) Math.sqrt(5100.0D);
			local128 = local26 * 768 >> 8;
			for (local130 = 1; local130 < 103; local130++) {
				for (local134 = 1; local134 < 103; local134++) {
					local157 = Static44.anIntArrayArrayArray3[local7][local134 + 1][local130] - Static44.anIntArrayArrayArray3[local7][local134 - 1][local130];
					local178 = Static44.anIntArrayArrayArray3[local7][local134][local130 + 1] - Static44.anIntArrayArrayArray3[local7][local134][local130 - 1];
					local191 = (int) Math.sqrt((double) (local178 * local178 + local157 * local157 + 65536));
					local195 = 65536 / local191;
					local201 = (local178 << 8) / local191;
					local207 = (local157 << 8) / local191;
					local257 = (local118[local134][local130] >> 1) + (local118[local134 - 1][local130] >> 2) + (local118[local134 + 1][local130] >> 3) + (local118[local134][local130 + -1] >> 2) + (local118[local134][local130 + 1] >> 3);
					local274 = (local201 * -50 + local195 * -10 + local207 * -50) / local128 + 96;
					Static108.anIntArrayArray4[local134][local130] = local274 - local257;
				}
			}
			for (local134 = 0; local134 < 104; local134++) {
				Static29.anIntArray106[local134] = 0;
				Static92.anIntArray402[local134] = 0;
				Static38.anIntArray491[local134] = 0;
				Static96.anIntArray417[local134] = 0;
				Static49.anIntArray230[local134] = 0;
			}
			for (local157 = -5; local157 < 109; local157++) {
				for (local178 = 0; local178 < 104; local178++) {
					local191 = local157 + 5;
					@Pc(399) int local399;
					if (local191 >= 0 && local191 < 104) {
						local207 = Static6.aByteArrayArrayArray4[local7][local191][local178] & 0xFF;
						if (local207 > 0) {
							@Pc(363) Class1_Sub1_Sub13 local363 = Static101.method1769(local207 - 1);
							Static29.anIntArray106[local178] += local363.anInt2437;
							Static92.anIntArray402[local178] += local363.anInt2438;
							Static38.anIntArray491[local178] += local363.anInt2441;
							Static96.anIntArray417[local178] += local363.anInt2447;
							local399 = Static49.anIntArray230[local178]++;
						}
					}
					local207 = local157 - 5;
					if (local207 >= 0 && local207 < 104) {
						local195 = Static6.aByteArrayArrayArray4[local7][local207][local178] & 0xFF;
						if (local195 > 0) {
							@Pc(432) Class1_Sub1_Sub13 local432 = Static101.method1769(local195 - 1);
							Static29.anIntArray106[local178] -= local432.anInt2437;
							Static92.anIntArray402[local178] -= local432.anInt2438;
							Static38.anIntArray491[local178] -= local432.anInt2441;
							Static96.anIntArray417[local178] -= local432.anInt2447;
							local399 = Static49.anIntArray230[local178]--;
						}
					}
				}
				if (local157 >= 1 && local157 < 103) {
					local191 = 0;
					local207 = 0;
					local195 = 0;
					local201 = 0;
					local274 = 0;
					for (local257 = -5; local257 < 109; local257++) {
						local503 = local257 + 5;
						local507 = local257 - 5;
						if (local503 >= 0 && local503 < 104) {
							local207 += Static92.anIntArray402[local503];
							local191 += Static29.anIntArray106[local503];
							local201 += Static96.anIntArray417[local503];
							local195 += Static38.anIntArray491[local503];
							local274 += Static49.anIntArray230[local503];
						}
						if (local507 >= 0 && local507 < 104) {
							local201 -= Static96.anIntArray417[local507];
							local274 -= Static49.anIntArray230[local507];
							local195 -= Static38.anIntArray491[local507];
							local207 -= Static92.anIntArray402[local507];
							local191 -= Static29.anIntArray106[local507];
						}
						if (local257 >= 1 && local257 < 103 && (!Static87.aBoolean96 || (Static87.aByteArrayArrayArray15[0][local157][local257] & 0x2) != 0 || (Static87.aByteArrayArrayArray15[local7][local157][local257] & 0x10) == 0 && Static80.method1488(local7, local157, local257) == Static59.anInt1827)) {
							if (local7 < Static74.anInt2039) {
								Static74.anInt2039 = local7;
							}
							local649 = Static6.aByteArrayArrayArray4[local7][local157][local257] & 0xFF;
							local659 = Static12.aByteArrayArrayArray5[local7][local157][local257] & 0xFF;
							if (local649 > 0 || local659 > 0) {
								local671 = Static44.anIntArrayArrayArray3[local7][local157][local257];
								@Pc(683) int local683 = Static44.anIntArrayArrayArray3[local7][local157 + 1][local257 + 1];
								@Pc(693) int local693 = Static44.anIntArrayArrayArray3[local7][local157 + 1][local257];
								@Pc(701) int local701 = Static108.anIntArrayArray4[local157 + 1][local257];
								@Pc(711) int local711 = Static44.anIntArrayArrayArray3[local7][local157][local257 + 1];
								@Pc(717) int local717 = Static108.anIntArrayArray4[local157][local257];
								@Pc(727) int local727 = Static108.anIntArrayArray4[local157 + 1][local257 + 1];
								@Pc(735) int local735 = Static108.anIntArrayArray4[local157][local257 + 1];
								@Pc(737) int local737 = -1;
								@Pc(739) int local739 = -1;
								@Pc(750) int local750;
								@Pc(758) int local758;
								if (local649 > 0) {
									local750 = local191 * 256 / local201;
									@Pc(754) int local754 = local195 / local274;
									local758 = local207 / local274;
									local737 = Static101.method1765(local754, local750, local758);
									@Pc(771) int local771 = local750 + Static90.anInt1847 & 0xFF;
									local754 += Static118.anInt2769;
									if (local754 < 0) {
										local754 = 0;
									} else if (local754 > 255) {
										local754 = 255;
									}
									local739 = Static101.method1765(local754, local771, local758);
								}
								if (local7 > 0) {
									@Pc(798) boolean local798 = true;
									if (local649 == 0 && Static85.aByteArrayArrayArray14[local7][local157][local257] != 0) {
										local798 = false;
									}
									if (local659 > 0 && !Static35.method632(local659 - 1).aBoolean118) {
										local798 = false;
									}
									if (local798 && local693 == local671 && local671 == local683 && local711 == local671) {
										Static76.anIntArrayArrayArray6[local7][local157][local257] |= 0x924;
									}
								}
								local750 = 0;
								if (local739 != -1) {
									local750 = Static91.anIntArray398[Static112.method1883(local739, 96)];
								}
								if (local659 == 0) {
									arg1.method333(local7, local157, local257, 0, 0, -1, local671, local693, local683, local711, Static112.method1883(local737, local717), Static112.method1883(local737, local701), Static112.method1883(local737, local727), Static112.method1883(local737, local735), 0, 0, 0, 0, local750, 0);
								} else {
									local758 = Static85.aByteArrayArrayArray14[local7][local157][local257] + 1;
									@Pc(891) byte local891 = Static131.aByteArrayArrayArray16[local7][local157][local257];
									@Pc(897) Class1_Sub1_Sub16 local897 = Static35.method632(local659 - 1);
									@Pc(900) int local900 = local897.anInt2812;
									@Pc(917) int local917;
									@Pc(953) int local953;
									@Pc(946) int local946;
									@Pc(923) int local923;
									if (local900 >= 0) {
										local953 = Static91.anInterface2_1.method1699(local900);
										local917 = -1;
									} else if (local897.anInt2819 == 16711935) {
										local917 = -2;
										local900 = -1;
										local953 = -2;
									} else {
										local917 = Static101.method1765(local897.anInt2822, local897.anInt2816, local897.anInt2814);
										local923 = local897.anInt2822 + Static118.anInt2769;
										if (local923 < 0) {
											local923 = 0;
										} else if (local923 > 255) {
											local923 = 255;
										}
										local946 = Static90.anInt1847 + local897.anInt2816 & 0xFF;
										local953 = Static101.method1765(local923, local946, local897.anInt2814);
									}
									local946 = 0;
									if (local953 != -2) {
										local946 = Static91.anIntArray398[Static6.method269(96, local953)];
									}
									if (local897.anInt2821 != -1) {
										@Pc(997) int local997 = local897.anInt2813 + Static118.anInt2769;
										if (local997 < 0) {
											local997 = 0;
										} else if (local997 > 255) {
											local997 = 255;
										}
										local923 = Static90.anInt1847 + local897.anInt2826 & 0xFF;
										local953 = Static101.method1765(local997, local923, local897.anInt2824);
										local946 = Static91.anIntArray398[Static6.method269(96, local953)];
									}
									arg1.method333(local7, local157, local257, local758, local891, local900, local671, local693, local683, local711, Static112.method1883(local737, local717), Static112.method1883(local737, local701), Static112.method1883(local737, local727), Static112.method1883(local737, local735), Static6.method269(local717, local917), Static6.method269(local701, local917), Static6.method269(local727, local917), Static6.method269(local735, local917), local750, local946);
								}
							}
						}
					}
				}
			}
			for (local178 = 1; local178 < 103; local178++) {
				for (local191 = 1; local191 < 103; local191++) {
					arg1.method334(local7, local191, local178, Static80.method1488(local7, local191, local178));
				}
			}
			Static6.aByteArrayArrayArray4[local7] = null;
			Static12.aByteArrayArrayArray5[local7] = null;
			Static85.aByteArrayArrayArray14[local7] = null;
			Static131.aByteArrayArrayArray16[local7] = null;
			Static22.aByteArrayArrayArray6[local7] = null;
		}
		arg1.method346();
		for (local11 = 0; local11 < 104; local11++) {
			for (local26 = 0; local26 < 104; local26++) {
				if ((Static87.aByteArrayArrayArray15[1][local11][local26] & 0x2) == 2) {
					arg1.method331(local11, local26);
				}
			}
		}
		local128 = 2;
		local26 = 1;
		local130 = 4;
		for (local134 = 0; local134 < 4; local134++) {
			if (local134 > 0) {
				local130 <<= 0x3;
				local26 <<= 0x3;
				local128 <<= 0x3;
			}
			for (local157 = 0; local157 <= local134; local157++) {
				for (local178 = 0; local178 <= 104; local178++) {
					for (local191 = 0; local191 <= 104; local191++) {
						if ((Static76.anIntArrayArrayArray6[local157][local191][local178] & local26) != 0) {
							local207 = local178;
							local274 = local157;
							while (local207 > 0 && (Static76.anIntArrayArrayArray6[local157][local191][local207 - 1] & local26) != 0) {
								local207--;
							}
							for (local195 = local178; local195 < 104 && (Static76.anIntArrayArrayArray6[local157][local191][local195 + 1] & local26) != 0; local195++) {
							}
							label347: for (local201 = local157; local201 > 0; local201--) {
								for (local257 = local207; local257 <= local195; local257++) {
									if ((Static76.anIntArrayArrayArray6[local201 - 1][local191][local257] & local26) == 0) {
										break label347;
									}
								}
							}
							label336: while (local274 < local134) {
								for (local257 = local207; local257 <= local195; local257++) {
									if ((local26 & Static76.anIntArrayArrayArray6[local274 + 1][local191][local257]) == 0) {
										break label336;
									}
								}
								local274++;
							}
							local257 = (local195 + 1 - local207) * (local274 + 1 - local201);
							if (local257 >= 8) {
								local507 = Static44.anIntArrayArrayArray3[local274][local191][local207] - 240;
								local649 = Static44.anIntArrayArrayArray3[local201][local191][local207];
								Static10.method303(local134, 1, local191 * 128, local191 * 128, local207 * 128, local195 * 128 + 128, local507, local649);
								for (local659 = local201; local659 <= local274; local659++) {
									for (local671 = local207; local671 <= local195; local671++) {
										Static76.anIntArrayArrayArray6[local659][local191][local671] &= ~local26;
									}
								}
							}
						}
						if ((local128 & Static76.anIntArrayArrayArray6[local157][local191][local178]) != 0) {
							for (local207 = local191; local207 > 0 && (Static76.anIntArrayArrayArray6[local157][local207 - 1][local178] & local128) != 0; local207--) {
							}
							for (local195 = local191; local195 < 104 && (Static76.anIntArrayArrayArray6[local157][local195 + 1][local178] & local128) != 0; local195++) {
							}
							local201 = local157;
							local274 = local157;
							label402: while (local201 > 0) {
								for (local257 = local207; local257 <= local195; local257++) {
									if ((local128 & Static76.anIntArrayArrayArray6[local201 - 1][local257][local178]) == 0) {
										break label402;
									}
								}
								local201--;
							}
							label391: while (local274 < local134) {
								for (local257 = local207; local257 <= local195; local257++) {
									if ((Static76.anIntArrayArrayArray6[local274 + 1][local257][local178] & local128) == 0) {
										break label391;
									}
								}
								local274++;
							}
							local257 = (local274 + 1 - local201) * (local195 + 1 - local207);
							if (local257 >= 8) {
								local507 = Static44.anIntArrayArrayArray3[local274][local207][local178] - 240;
								local649 = Static44.anIntArrayArrayArray3[local201][local207][local178];
								Static10.method303(local134, 2, local207 * 128, local195 * 128 + 128, local178 * 128, local178 * 128, local507, local649);
								for (local659 = local201; local659 <= local274; local659++) {
									for (local671 = local207; local671 <= local195; local671++) {
										Static76.anIntArrayArrayArray6[local659][local671][local178] &= ~local128;
									}
								}
							}
						}
						if ((Static76.anIntArrayArrayArray6[local157][local191][local178] & local130) != 0) {
							local195 = local191;
							local201 = local178;
							local274 = local178;
							while (local201 > 0 && (Static76.anIntArrayArrayArray6[local157][local191][local201 - 1] & local130) != 0) {
								local201--;
							}
							while (local274 < 104 && (local130 & Static76.anIntArrayArrayArray6[local157][local191][local274 + 1]) != 0) {
								local274++;
							}
							label457: for (local207 = local191; local207 > 0; local207--) {
								for (local257 = local201; local257 <= local274; local257++) {
									if ((Static76.anIntArrayArrayArray6[local157][local207 - 1][local257] & local130) == 0) {
										break label457;
									}
								}
							}
							label446: while (local195 < 104) {
								for (local257 = local201; local257 <= local274; local257++) {
									if ((local130 & Static76.anIntArrayArrayArray6[local157][local195 + 1][local257]) == 0) {
										break label446;
									}
								}
								local195++;
							}
							if ((local274 + 1 - local201) * (-local207 + 1 + local195) >= 4) {
								local257 = Static44.anIntArrayArrayArray3[local157][local207][local201];
								Static10.method303(local134, 4, local207 * 128, local195 * 128 + 128, local201 * 128, local274 * 128 + 128, local257, local257);
								for (local503 = local207; local503 <= local195; local503++) {
									for (local507 = local201; local507 <= local274; local507++) {
										Static76.anIntArrayArrayArray6[local157][local503][local507] &= ~local130;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
	public static void method2021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class1_Sub24 local14 = (Class1_Sub24) Static38.aClass65_43.method1802((long) arg3);
		if (local14 == null) {
			local14 = new Class1_Sub24();
			Static38.aClass65_43.method1797(local14, (long) arg3);
		}
		if (local14.anIntArray501.length <= arg2) {
			@Pc(40) int[] local40 = new int[arg2 + 1];
			@Pc(45) int[] local45 = new int[arg2 + 1];
			for (@Pc(47) int local47 = 0; local47 < local14.anIntArray501.length; local47++) {
				local40[local47] = local14.anIntArray501[local47];
				local45[local47] = local14.anIntArray502[local47];
			}
			for (@Pc(77) int local77 = local14.anIntArray501.length; local77 < arg2; local77++) {
				local40[local77] = -1;
				local45[local77] = 0;
			}
			local14.anIntArray502 = local45;
			local14.anIntArray501 = local40;
		}
		local14.anIntArray501[arg2] = arg1;
		local14.anIntArray502[arg2] = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)I")
	public static int method2022(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
