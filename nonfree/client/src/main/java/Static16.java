import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public static int anInt2217;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!na;")
	public static Class56 aClass56_31;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub4_Sub1Array9;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_24;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_25;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!pe;")
	private static Class65 aClass65_927 = Static119.method1462("wishes to duel with you)3");

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_928 = Static119.method1462("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_929 = aClass65_927;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[5];

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Lclient!cd;")
	public static Class13 aClass13_14 = new Class13();

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_930 = Static119.method1462("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Lclient!pe;")
	public static Class65 aClass65_931 = Static119.method1462("gelb:");

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
	public static int anInt2224 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[Lclient!la;Lclient!le;)V")
	public static void method1596(@OriginalArg(1) Class46[] arg0, @OriginalArg(2) Class49 arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(28) int local28;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static88.aByteArrayArrayArray3[local3][local7][local11] & 0x1) == 1) {
						local28 = local3;
						if ((Static88.aByteArrayArrayArray3[1][local7][local11] & 0x2) == 2) {
							local28 = local3 - 1;
						}
						if (local28 >= 0) {
							arg0[local28].method1109(local7, local11);
						}
					}
				}
			}
		}
		Static21.anInt526 += (int) (Math.random() * 5.0D) - 2;
		Static129.anInt2751 += (int) (Math.random() * 5.0D) - 2;
		if (Static129.anInt2751 < -16) {
			Static129.anInt2751 = -16;
		}
		if (Static21.anInt526 < -8) {
			Static21.anInt526 = -8;
		}
		if (Static129.anInt2751 > 16) {
			Static129.anInt2751 = 16;
		}
		if (Static21.anInt526 > 8) {
			Static21.anInt526 = 8;
		}
		@Pc(135) int local135;
		@Pc(137) int local137;
		@Pc(141) int local141;
		@Pc(185) int local185;
		@Pc(164) int local164;
		@Pc(199) int local199;
		@Pc(215) int local215;
		@Pc(209) int local209;
		@Pc(205) int local205;
		@Pc(231) int local231;
		@Pc(281) int local281;
		@Pc(505) int local505;
		@Pc(501) int local501;
		@Pc(651) int local651;
		@Pc(641) int local641;
		@Pc(669) int local669;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(125) byte[][] local125 = Static106.aByteArrayArrayArray4[local7];
			local28 = (int) Math.sqrt(5100.0D);
			local135 = local28 * 768 >> 8;
			for (local137 = 1; local137 < 103; local137++) {
				for (local141 = 1; local141 < 103; local141++) {
					local164 = Static67.anIntArrayArrayArray8[local7][local141][local137 + 1] - Static67.anIntArrayArrayArray8[local7][local141][local137 - 1];
					local185 = Static67.anIntArrayArrayArray8[local7][local141 + 1][local137] - Static67.anIntArrayArrayArray8[local7][local141 - 1][local137];
					local199 = (int) Math.sqrt((double) (local185 * local185 + local164 * local164 + 65536));
					local205 = (local164 << 8) / local199;
					local209 = 65536 / local199;
					local215 = (local185 << 8) / local199;
					local231 = (local205 * -50 + local209 * -10 + local215 * -50) / local135 + 96;
					local281 = (local125[local141][local137] >> 1) + (local125[local141][local137 - 1] >> 2) + (local125[local141 - 1][local137] >> 2) - (-(local125[local141 + 1][local137] >> 3) + -(local125[local141][local137 + 1] >> 3));
					Static110.anIntArrayArray24[local141][local137] = local231 - local281;
				}
			}
			for (local141 = 0; local141 < 104; local141++) {
				Static10.anIntArray418[local141] = 0;
				Static83.anIntArray237[local141] = 0;
				Static73.anIntArray199[local141] = 0;
				Static12.anIntArray34[local141] = 0;
				Static93.anIntArray277[local141] = 0;
			}
			for (local185 = -5; local185 < 109; local185++) {
				for (local164 = 0; local164 < 104; local164++) {
					local199 = local185 + 5;
					@Pc(400) int local400;
					if (local199 >= 0 && local199 < 104) {
						local215 = Static113.aByteArrayArrayArray5[local7][local199][local164] & 0xFF;
						if (local215 > 0) {
							@Pc(364) Class2_Sub1_Sub3 local364 = Static112.method1819(local215 - 1);
							Static10.anIntArray418[local164] += local364.anInt511;
							Static83.anIntArray237[local164] += local364.anInt515;
							Static73.anIntArray199[local164] += local364.anInt517;
							Static12.anIntArray34[local164] += local364.anInt507;
							local400 = Static93.anIntArray277[local164]++;
						}
					}
					local215 = local185 - 5;
					if (local215 >= 0 && local215 < 104) {
						local209 = Static113.aByteArrayArrayArray5[local7][local215][local164] & 0xFF;
						if (local209 > 0) {
							@Pc(430) Class2_Sub1_Sub3 local430 = Static112.method1819(local209 - 1);
							Static10.anIntArray418[local164] -= local430.anInt511;
							Static83.anIntArray237[local164] -= local430.anInt515;
							Static73.anIntArray199[local164] -= local430.anInt517;
							Static12.anIntArray34[local164] -= local430.anInt507;
							local400 = Static93.anIntArray277[local164]--;
						}
					}
				}
				if (local185 >= 1 && local185 < 103) {
					local199 = 0;
					local215 = 0;
					local209 = 0;
					local231 = 0;
					local205 = 0;
					for (local281 = -5; local281 < 109; local281++) {
						local501 = local281 - 5;
						local505 = local281 + 5;
						if (local505 >= 0 && local505 < 104) {
							local231 += Static93.anIntArray277[local505];
							local205 += Static12.anIntArray34[local505];
							local215 += Static83.anIntArray237[local505];
							local209 += Static73.anIntArray199[local505];
							local199 += Static10.anIntArray418[local505];
						}
						if (local501 >= 0 && local501 < 104) {
							local209 -= Static73.anIntArray199[local501];
							local199 -= Static10.anIntArray418[local501];
							local205 -= Static12.anIntArray34[local501];
							local215 -= Static83.anIntArray237[local501];
							local231 -= Static93.anIntArray277[local501];
						}
						if (local281 >= 1 && local281 < 103 && (!Static48.aBoolean47 || (Static88.aByteArrayArrayArray3[0][local185][local281] & 0x2) != 0 || (Static88.aByteArrayArrayArray3[local7][local185][local281] & 0x10) == 0 && Static9.method178(local281, local185, local7) == Static37.anInt812)) {
							if (Static14.anInt354 > local7) {
								Static14.anInt354 = local7;
							}
							local641 = Static66.aByteArrayArrayArray2[local7][local185][local281] & 0xFF;
							local651 = Static113.aByteArrayArrayArray5[local7][local185][local281] & 0xFF;
							if (local651 > 0 || local641 > 0) {
								local669 = Static67.anIntArrayArrayArray8[local7][local185][local281];
								@Pc(679) int local679 = Static67.anIntArrayArrayArray8[local7][local185 + 1][local281];
								@Pc(689) int local689 = Static67.anIntArrayArrayArray8[local7][local185][local281 + 1];
								@Pc(701) int local701 = Static67.anIntArrayArrayArray8[local7][local185 + 1][local281 + 1];
								@Pc(707) int local707 = Static110.anIntArrayArray24[local185][local281];
								@Pc(715) int local715 = Static110.anIntArrayArray24[local185 + 1][local281];
								@Pc(725) int local725 = Static110.anIntArrayArray24[local185 + 1][local281 + 1];
								@Pc(733) int local733 = Static110.anIntArrayArray24[local185][local281 + 1];
								@Pc(735) int local735 = -1;
								@Pc(737) int local737 = -1;
								@Pc(749) int local749;
								@Pc(743) int local743;
								if (local651 > 0) {
									local743 = local215 / local231;
									local749 = local199 * 256 / local205;
									@Pc(753) int local753 = local209 / local231;
									local737 = Static44.method755(local753, local749, local743);
									local753 += Static129.anInt2751;
									if (local753 < 0) {
										local753 = 0;
									} else if (local753 > 255) {
										local753 = 255;
									}
									local749 = Static21.anInt526 + local749 & 0xFF;
									local735 = Static44.method755(local753, local749, local743);
								}
								if (local7 > 0) {
									@Pc(794) boolean local794 = true;
									if (local651 == 0 && Static129.aByteArrayArrayArray7[local7][local185][local281] != 0) {
										local794 = false;
									}
									if (local641 > 0 && !Static33.method625(local641 - 1).aBoolean51) {
										local794 = false;
									}
									if (local794 && local669 == local679 && local669 == local701 && local669 == local689) {
										Static5.anIntArrayArrayArray1[local7][local185][local281] |= 0x924;
									}
								}
								local749 = 0;
								if (local735 != -1) {
									local749 = Static87.anIntArray252[Static88.method1444(96, local735)];
								}
								if (local641 == 0) {
									arg1.method1189(local7, local185, local281, 0, 0, -1, local669, local679, local701, local689, Static88.method1444(local707, local737), Static88.method1444(local715, local737), Static88.method1444(local725, local737), Static88.method1444(local733, local737), 0, 0, 0, 0, local749, 0);
								} else {
									local743 = Static129.aByteArrayArrayArray7[local7][local185][local281] + 1;
									@Pc(923) byte local923 = Static53.aByteArrayArrayArray1[local7][local185][local281];
									@Pc(931) Class2_Sub1_Sub8 local931 = Static33.method625(local641 - 1);
									@Pc(934) int local934 = local931.anInt1427;
									@Pc(938) int local938;
									@Pc(945) int local945;
									@Pc(973) int local973;
									@Pc(965) int local965;
									if (local934 >= 0) {
										local938 = -1;
										local945 = Static87.anInterface1_1.method7(local934);
									} else if (local931.anInt1434 == 16711935) {
										local934 = -1;
										local938 = -2;
										local945 = -2;
									} else {
										local938 = Static44.method755(local931.anInt1438, local931.anInt1423, local931.anInt1433);
										local965 = Static129.anInt2751 + local931.anInt1438;
										local973 = local931.anInt1423 + Static21.anInt526 & 0xFF;
										if (local965 < 0) {
											local965 = 0;
										} else if (local965 > 255) {
											local965 = 255;
										}
										local945 = Static44.method755(local965, local973, local931.anInt1433);
									}
									local973 = 0;
									if (local945 != -2) {
										local973 = Static87.anIntArray252[Static79.method1302(96, local945)];
									}
									if (local931.anInt1432 != -1) {
										@Pc(1023) int local1023 = local931.anInt1429 + Static129.anInt2751;
										local965 = Static21.anInt526 + local931.anInt1430 & 0xFF;
										if (local1023 < 0) {
											local1023 = 0;
										} else if (local1023 > 255) {
											local1023 = 255;
										}
										local945 = Static44.method755(local1023, local965, local931.anInt1422);
										local973 = Static87.anIntArray252[Static79.method1302(96, local945)];
									}
									arg1.method1189(local7, local185, local281, local743, local923, local934, local669, local679, local701, local689, Static88.method1444(local707, local737), Static88.method1444(local715, local737), Static88.method1444(local725, local737), Static88.method1444(local733, local737), Static79.method1302(local707, local938), Static79.method1302(local715, local938), Static79.method1302(local725, local938), Static79.method1302(local733, local938), local749, local973);
								}
							}
						}
					}
				}
			}
			for (local164 = 1; local164 < 103; local164++) {
				for (local199 = 1; local199 < 103; local199++) {
					arg1.method1162(local7, local199, local164, Static9.method178(local164, local199, local7));
				}
			}
			Static113.aByteArrayArrayArray5[local7] = null;
			Static66.aByteArrayArrayArray2[local7] = null;
			Static129.aByteArrayArrayArray7[local7] = null;
			Static53.aByteArrayArrayArray1[local7] = null;
			Static106.aByteArrayArrayArray4[local7] = null;
		}
		arg1.method1197();
		for (local11 = 0; local11 < 104; local11++) {
			for (local28 = 0; local28 < 104; local28++) {
				if ((Static88.aByteArrayArrayArray3[1][local11][local28] & 0x2) == 2) {
					arg1.method1181(local11, local28);
				}
			}
		}
		local28 = 1;
		local135 = 2;
		local137 = 4;
		for (local141 = 0; local141 < 4; local141++) {
			if (local141 > 0) {
				local135 <<= 0x3;
				local28 <<= 0x3;
				local137 <<= 0x3;
			}
			for (local185 = 0; local185 <= local141; local185++) {
				for (local164 = 0; local164 <= 104; local164++) {
					for (local199 = 0; local199 <= 104; local199++) {
						if ((Static5.anIntArrayArrayArray1[local185][local199][local164] & local28) != 0) {
							local209 = local164;
							local205 = local185;
							local215 = local164;
							while (local209 < 104 && (Static5.anIntArrayArrayArray1[local185][local199][local209 + 1] & local28) != 0) {
								local209++;
							}
							while (local215 > 0 && (Static5.anIntArrayArrayArray1[local185][local199][local215 - 1] & local28) != 0) {
								local215--;
							}
							local231 = local185;
							label347: while (local205 > 0) {
								for (local281 = local215; local281 <= local209; local281++) {
									if ((local28 & Static5.anIntArrayArrayArray1[local205 - 1][local199][local281]) == 0) {
										break label347;
									}
								}
								local205--;
							}
							label336: while (local231 < local141) {
								for (local281 = local215; local281 <= local209; local281++) {
									if ((local28 & Static5.anIntArrayArrayArray1[local231 + 1][local199][local281]) == 0) {
										break label336;
									}
								}
								local231++;
							}
							local281 = (local209 + 1 - local215) * (local231 + 1 - local205);
							if (local281 >= 8) {
								local501 = Static67.anIntArrayArrayArray8[local231][local199][local215] - 240;
								local651 = Static67.anIntArrayArrayArray8[local205][local199][local215];
								Static65.method1185(local141, 1, local199 * 128, local199 * 128, local215 * 128, local209 * 128 + 128, local501, local651);
								for (local641 = local205; local641 <= local231; local641++) {
									for (local669 = local215; local669 <= local209; local669++) {
										Static5.anIntArrayArrayArray1[local641][local199][local669] &= ~local28;
									}
								}
							}
						}
						if ((local135 & Static5.anIntArrayArrayArray1[local185][local199][local164]) != 0) {
							local215 = local199;
							local209 = local199;
							while (local215 > 0 && (Static5.anIntArrayArrayArray1[local185][local215 - 1][local164] & local135) != 0) {
								local215--;
							}
							local231 = local185;
							while (local209 < 104 && (local135 & Static5.anIntArrayArrayArray1[local185][local209 + 1][local164]) != 0) {
								local209++;
							}
							label401: for (local205 = local185; local205 > 0; local205--) {
								for (local281 = local215; local281 <= local209; local281++) {
									if ((Static5.anIntArrayArrayArray1[local205 - 1][local281][local164] & local135) == 0) {
										break label401;
									}
								}
							}
							label390: while (local141 > local231) {
								for (local281 = local215; local281 <= local209; local281++) {
									if ((local135 & Static5.anIntArrayArrayArray1[local231 + 1][local281][local164]) == 0) {
										break label390;
									}
								}
								local231++;
							}
							local281 = (local231 + 1 - local205) * (local209 + 1 - local215);
							if (local281 >= 8) {
								local501 = Static67.anIntArrayArrayArray8[local231][local215][local164] - 240;
								local651 = Static67.anIntArrayArrayArray8[local205][local215][local164];
								Static65.method1185(local141, 2, local215 * 128, local209 * 128 + 128, local164 * 128, local164 * 128, local501, local651);
								for (local641 = local205; local641 <= local231; local641++) {
									for (local669 = local215; local669 <= local209; local669++) {
										Static5.anIntArrayArrayArray1[local641][local669][local164] &= ~local135;
									}
								}
							}
						}
						if ((Static5.anIntArrayArrayArray1[local185][local199][local164] & local137) != 0) {
							local215 = local199;
							local209 = local199;
							local205 = local164;
							for (local231 = local164; local231 < 104 && (Static5.anIntArrayArrayArray1[local185][local199][local231 + 1] & local137) != 0; local231++) {
							}
							while (local205 > 0 && (local137 & Static5.anIntArrayArrayArray1[local185][local199][local205 - 1]) != 0) {
								local205--;
							}
							label456: while (local215 > 0) {
								for (local281 = local205; local281 <= local231; local281++) {
									if ((Static5.anIntArrayArrayArray1[local185][local215 - 1][local281] & local137) == 0) {
										break label456;
									}
								}
								local215--;
							}
							label445: while (local209 < 104) {
								for (local281 = local205; local281 <= local231; local281++) {
									if ((Static5.anIntArrayArrayArray1[local185][local209 + 1][local281] & local137) == 0) {
										break label445;
									}
								}
								local209++;
							}
							if ((local231 + 1 - local205) * (-local215 + 1 + local209) >= 4) {
								local281 = Static67.anIntArrayArrayArray8[local185][local215][local205];
								Static65.method1185(local141, 4, local215 * 128, local209 * 128 + 128, local205 * 128, local231 * 128 + 128, local281, local281);
								for (local505 = local215; local505 <= local209; local505++) {
									for (local501 = local205; local501 <= local231; local501++) {
										Static5.anIntArrayArrayArray1[local185][local505][local501] &= ~local137;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)I")
	public static int method1600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method1602() {
		aClass65_930 = null;
		aClass65_927 = null;
		aClass13_14 = null;
		aBooleanArray15 = null;
		aClass56_31 = null;
		aClass56_Sub1_25 = null;
		aClass65_929 = null;
		aClass65_931 = null;
		aClass56_Sub1_24 = null;
		aClass2_Sub1_Sub4_Sub1Array9 = null;
		aClass65_928 = null;
	}
}
