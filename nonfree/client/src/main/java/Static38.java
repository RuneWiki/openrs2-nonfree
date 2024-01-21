import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array4;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "Lclient!wc;")
	public static Class2_Sub1_Sub4_Sub4 aClass2_Sub1_Sub4_Sub4_1;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!da;")
	public static Class15 aClass15_29;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_5;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!k;")
	public static Class33 aClass33_15;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "[Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array6;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!wb;")
	private static Class65 aClass65_525 = Static24.method441("Unable to find ");

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!wb;")
	private static Class65 aClass65_526 = Static24.method441("Remove");

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean74 = true;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_527 = Static24.method441("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!wb;")
	public static Class65 aClass65_528 = aClass65_525;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_529 = Static24.method441("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!wb;")
	public static Class65 aClass65_530 = aClass65_526;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!fc;[Lclient!uc;I)V")
	public static void method751(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class58[] arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(32) int local32;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static50.aByteArrayArrayArray6[local7][local11][local15] & 0x1) == 1) {
						local32 = local7;
						if ((Static50.aByteArrayArrayArray6[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg1[local32].method1728(local15, local11);
						}
					}
				}
			}
		}
		Static85.anInt2468 += (int) (Math.random() * 5.0D) - 2;
		if (Static85.anInt2468 < -16) {
			Static85.anInt2468 = -16;
		}
		if (Static85.anInt2468 > 16) {
			Static85.anInt2468 = 16;
		}
		Static100.anInt2780 += (int) (Math.random() * 5.0D) - 2;
		if (Static100.anInt2780 < -8) {
			Static100.anInt2780 = -8;
		}
		if (Static100.anInt2780 > 8) {
			Static100.anInt2780 = 8;
		}
		@Pc(134) int local134;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(163) int local163;
		@Pc(184) int local184;
		@Pc(197) int local197;
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(213) int local213;
		@Pc(230) int local230;
		@Pc(280) int local280;
		@Pc(513) int local513;
		@Pc(552) int local552;
		@Pc(648) int local648;
		@Pc(658) int local658;
		@Pc(680) int local680;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(124) byte[][] local124 = Static100.aByteArrayArrayArray9[local11];
			local32 = (int) Math.sqrt(5100.0D);
			local134 = local32 * 768 >> 8;
			for (local136 = 1; local136 < 103; local136++) {
				for (local140 = 1; local140 < 103; local140++) {
					local163 = Static61.anIntArrayArrayArray6[local11][local140 + 1][local136] - Static61.anIntArrayArrayArray6[local11][local140 - 1][local136];
					local184 = Static61.anIntArrayArrayArray6[local11][local140][local136 + 1] - Static61.anIntArrayArrayArray6[local11][local140][local136 - 1];
					local197 = (int) Math.sqrt((double) (local184 * local184 + local163 * local163 + 65536));
					local203 = (local163 << 8) / local197;
					local207 = 65536 / local197;
					local213 = (local184 << 8) / local197;
					local230 = (local203 * -50 + local207 * -10 + local213 * -50) / local134 + 96;
					local280 = (local124[local140][local136] >> 1) + ((local124[local140 + 1][local136] >> 3) + (local124[local140 - 1][local136] >> 2) + (local124[local140][local136 + -1] >> 2) + (local124[local140][local136 + 1] >> 3));
					Static68.anIntArrayArray18[local140][local136] = local230 - local280;
				}
			}
			for (local140 = 0; local140 < 104; local140++) {
				Static90.anIntArray196[local140] = 0;
				Static4.anIntArray28[local140] = 0;
				Static50.anIntArray199[local140] = 0;
				Static60.anIntArray247[local140] = 0;
				Static89.anIntArray369[local140] = 0;
			}
			for (local163 = -5; local163 < 109; local163++) {
				for (local184 = 0; local184 < 104; local184++) {
					local197 = local163 + 5;
					@Pc(406) int local406;
					if (local197 >= 0 && local197 < 104) {
						local203 = Static7.aByteArrayArrayArray3[local11][local197][local184] & 0xFF;
						if (local203 > 0) {
							@Pc(370) Class2_Sub1_Sub12 local370 = Static55.method982(local203 - 1);
							Static90.anIntArray196[local184] += local370.anInt2278;
							Static4.anIntArray28[local184] += local370.anInt2281;
							Static50.anIntArray199[local184] += local370.anInt2276;
							Static60.anIntArray247[local184] += local370.anInt2268;
							local406 = Static89.anIntArray369[local184]++;
						}
					}
					local203 = local163 - 5;
					if (local203 >= 0 && local203 < 104) {
						local207 = Static7.aByteArrayArrayArray3[local11][local203][local184] & 0xFF;
						if (local207 > 0) {
							@Pc(442) Class2_Sub1_Sub12 local442 = Static55.method982(local207 - 1);
							Static90.anIntArray196[local184] -= local442.anInt2278;
							Static4.anIntArray28[local184] -= local442.anInt2281;
							Static50.anIntArray199[local184] -= local442.anInt2276;
							Static60.anIntArray247[local184] -= local442.anInt2268;
							local406 = Static89.anIntArray369[local184]--;
						}
					}
				}
				if (local163 >= 1 && local163 < 103) {
					local197 = 0;
					local207 = 0;
					local203 = 0;
					local230 = 0;
					local213 = 0;
					for (local280 = -5; local280 < 109; local280++) {
						local513 = local280 + 5;
						if (local513 >= 0 && local513 < 104) {
							local213 += Static60.anIntArray247[local513];
							local203 += Static4.anIntArray28[local513];
							local230 += Static89.anIntArray369[local513];
							local207 += Static50.anIntArray199[local513];
							local197 += Static90.anIntArray196[local513];
						}
						local552 = local280 - 5;
						if (local552 >= 0 && local552 < 104) {
							local203 -= Static4.anIntArray28[local552];
							local230 -= Static89.anIntArray369[local552];
							local197 -= Static90.anIntArray196[local552];
							local207 -= Static50.anIntArray199[local552];
							local213 -= Static60.anIntArray247[local552];
						}
						if (local280 >= 1 && local280 < 103 && (!Static4.aBoolean16 || (Static50.aByteArrayArrayArray6[0][local163][local280] & 0x2) != 0 || (Static50.aByteArrayArrayArray6[local11][local163][local280] & 0x10) == 0 && Static110.method1847(local163, local280, local11) == Static95.anInt1972)) {
							if (Static106.anInt2837 > local11) {
								Static106.anInt2837 = local11;
							}
							local648 = Static7.aByteArrayArrayArray3[local11][local163][local280] & 0xFF;
							local658 = Static5.aByteArrayArrayArray1[local11][local163][local280] & 0xFF;
							if (local648 > 0 || local658 > 0) {
								@Pc(672) int local672 = Static61.anIntArrayArrayArray6[local11][local163 + 1][local280];
								local680 = Static61.anIntArrayArrayArray6[local11][local163][local280];
								@Pc(692) int local692 = Static61.anIntArrayArrayArray6[local11][local163 + 1][local280 + 1];
								@Pc(702) int local702 = Static61.anIntArrayArrayArray6[local11][local163][local280 + 1];
								@Pc(708) int local708 = Static68.anIntArrayArray18[local163][local280];
								@Pc(716) int local716 = Static68.anIntArrayArray18[local163 + 1][local280];
								@Pc(726) int local726 = Static68.anIntArrayArray18[local163 + 1][local280 + 1];
								@Pc(728) int local728 = -1;
								@Pc(736) int local736 = Static68.anIntArrayArray18[local163][local280 + 1];
								@Pc(738) int local738 = -1;
								@Pc(746) int local746;
								@Pc(750) int local750;
								if (local648 > 0) {
									local746 = local197 * 256 / local213;
									local750 = local203 / local230;
									@Pc(754) int local754 = local207 / local230;
									local738 = Static75.method1299(local746, local750, local754);
									@Pc(766) int local766 = Static100.anInt2780 + local746 & 0xFF;
									local754 += Static85.anInt2468;
									if (local754 < 0) {
										local754 = 0;
									} else if (local754 > 255) {
										local754 = 255;
									}
									local728 = Static75.method1299(local766, local750, local754);
								}
								if (local11 > 0) {
									@Pc(797) boolean local797 = true;
									if (local648 == 0 && aByteArrayArrayArray4[local11][local163][local280] != 0) {
										local797 = false;
									}
									if (local658 > 0 && !Static42.method813(local658 - 1).aBoolean34) {
										local797 = false;
									}
									if (local797 && local672 == local680 && local680 == local692 && local702 == local680) {
										Static100.anIntArrayArrayArray7[local11][local163][local280] |= 0x924;
									}
								}
								local746 = 0;
								if (local728 != -1) {
									local746 = Static10.anIntArray54[Static2.method60(local728, 96)];
								}
								if (local658 == 0) {
									arg0.method584(local11, local163, local280, 0, 0, -1, local680, local672, local692, local702, Static2.method60(local738, local708), Static2.method60(local738, local716), Static2.method60(local738, local726), Static2.method60(local738, local736), 0, 0, 0, 0, local746, 0);
								} else {
									local750 = aByteArrayArrayArray4[local11][local163][local280] + 1;
									@Pc(931) byte local931 = Static7.aByteArrayArrayArray2[local11][local163][local280];
									@Pc(937) Class2_Sub1_Sub5 local937 = Static42.method813(local658 - 1);
									@Pc(940) int local940 = local937.anInt456;
									@Pc(954) int local954;
									@Pc(952) int local952;
									@Pc(992) int local992;
									@Pc(974) int local974;
									if (local940 >= 0) {
										local952 = Static10.anInterface1_1.method119(local940);
										local954 = -1;
									} else if (local937.anInt455 == 16711935) {
										local954 = -2;
										local940 = -1;
										local952 = -2;
									} else {
										local954 = Static75.method1299(local937.anInt442, local937.anInt449, local937.anInt457);
										local974 = local937.anInt457 + Static85.anInt2468;
										if (local974 < 0) {
											local974 = 0;
										} else if (local974 > 255) {
											local974 = 255;
										}
										local992 = Static100.anInt2780 + local937.anInt442 & 0xFF;
										local952 = Static75.method1299(local992, local937.anInt449, local974);
									}
									local992 = 0;
									if (local952 != -2) {
										local992 = Static10.anIntArray54[Static65.method1163(local952, 96)];
									}
									if (local937.anInt453 != -1) {
										@Pc(1031) int local1031 = Static85.anInt2468 + local937.anInt444;
										if (local1031 < 0) {
											local1031 = 0;
										} else if (local1031 > 255) {
											local1031 = 255;
										}
										local974 = Static100.anInt2780 + local937.anInt454 & 0xFF;
										local952 = Static75.method1299(local974, local937.anInt451, local1031);
										local992 = Static10.anIntArray54[Static65.method1163(local952, 96)];
									}
									arg0.method584(local11, local163, local280, local750, local931, local940, local680, local672, local692, local702, Static2.method60(local738, local708), Static2.method60(local738, local716), Static2.method60(local738, local726), Static2.method60(local738, local736), Static65.method1163(local954, local708), Static65.method1163(local954, local716), Static65.method1163(local954, local726), Static65.method1163(local954, local736), local746, local992);
								}
							}
						}
					}
				}
			}
			for (local184 = 1; local184 < 103; local184++) {
				for (local197 = 1; local197 < 103; local197++) {
					arg0.method586(local11, local197, local184, Static110.method1847(local197, local184, local11));
				}
			}
			Static7.aByteArrayArrayArray3[local11] = null;
			Static5.aByteArrayArrayArray1[local11] = null;
			aByteArrayArrayArray4[local11] = null;
			Static7.aByteArrayArrayArray2[local11] = null;
			Static100.aByteArrayArrayArray9[local11] = null;
		}
		arg0.method599();
		for (local15 = 0; local15 < 104; local15++) {
			for (local32 = 0; local32 < 104; local32++) {
				if ((Static50.aByteArrayArrayArray6[1][local15][local32] & 0x2) == 2) {
					arg0.method588(local15, local32);
				}
			}
		}
		local134 = 2;
		local32 = 1;
		local136 = 4;
		for (local140 = 0; local140 < 4; local140++) {
			if (local140 > 0) {
				local136 <<= 0x3;
				local32 <<= 0x3;
				local134 <<= 0x3;
			}
			for (local163 = 0; local163 <= local140; local163++) {
				for (local184 = 0; local184 <= 104; local184++) {
					for (local197 = 0; local197 <= 104; local197++) {
						if ((Static100.anIntArrayArrayArray7[local163][local197][local184] & local32) != 0) {
							for (local207 = local184; local207 < 104 && (Static100.anIntArrayArrayArray7[local163][local197][local207 + 1] & local32) != 0; local207++) {
							}
							local203 = local184;
							local213 = local163;
							local230 = local163;
							while (local203 > 0 && (local32 & Static100.anIntArrayArrayArray7[local163][local197][local203 - 1]) != 0) {
								local203--;
							}
							label347: while (local213 > 0) {
								for (local280 = local203; local280 <= local207; local280++) {
									if ((local32 & Static100.anIntArrayArrayArray7[local213 - 1][local197][local280]) == 0) {
										break label347;
									}
								}
								local213--;
							}
							label336: while (local230 < local140) {
								for (local280 = local203; local280 <= local207; local280++) {
									if ((local32 & Static100.anIntArrayArrayArray7[local230 + 1][local197][local280]) == 0) {
										break label336;
									}
								}
								local230++;
							}
							local280 = (local230 + 1 - local213) * (local207 + 1 - local203);
							if (local280 >= 8) {
								local552 = Static61.anIntArrayArrayArray6[local230][local197][local203] - 240;
								local648 = Static61.anIntArrayArrayArray6[local213][local197][local203];
								Static31.method583(local140, 1, local197 * 128, local197 * 128, local203 * 128, local207 * 128 + 128, local552, local648);
								for (local658 = local213; local658 <= local230; local658++) {
									for (local680 = local203; local680 <= local207; local680++) {
										Static100.anIntArrayArrayArray7[local658][local197][local680] &= ~local32;
									}
								}
							}
						}
						if ((Static100.anIntArrayArrayArray7[local163][local197][local184] & local134) != 0) {
							for (local203 = local197; local203 > 0 && (Static100.anIntArrayArrayArray7[local163][local203 - 1][local184] & local134) != 0; local203--) {
							}
							local207 = local197;
							local213 = local163;
							local230 = local163;
							while (local207 < 104 && (local134 & Static100.anIntArrayArrayArray7[local163][local207 + 1][local184]) != 0) {
								local207++;
							}
							label401: while (local213 > 0) {
								for (local280 = local203; local280 <= local207; local280++) {
									if ((local134 & Static100.anIntArrayArrayArray7[local213 - 1][local280][local184]) == 0) {
										break label401;
									}
								}
								local213--;
							}
							label390: while (local230 < local140) {
								for (local280 = local203; local280 <= local207; local280++) {
									if ((Static100.anIntArrayArrayArray7[local230 + 1][local280][local184] & local134) == 0) {
										break label390;
									}
								}
								local230++;
							}
							local280 = (local207 + 1 - local203) * (local230 + 1 - local213);
							if (local280 >= 8) {
								local552 = Static61.anIntArrayArrayArray6[local230][local203][local184] - 240;
								local648 = Static61.anIntArrayArrayArray6[local213][local203][local184];
								Static31.method583(local140, 2, local203 * 128, local207 * 128 + 128, local184 * 128, local184 * 128, local552, local648);
								for (local658 = local213; local658 <= local230; local658++) {
									for (local680 = local203; local680 <= local207; local680++) {
										Static100.anIntArrayArrayArray7[local658][local680][local184] &= ~local134;
									}
								}
							}
						}
						if ((Static100.anIntArrayArrayArray7[local163][local197][local184] & local136) != 0) {
							local203 = local197;
							for (local213 = local184; local213 > 0 && (Static100.anIntArrayArrayArray7[local163][local197][local213 - 1] & local136) != 0; local213--) {
							}
							local230 = local184;
							local207 = local197;
							while (local230 < 104 && (local136 & Static100.anIntArrayArrayArray7[local163][local197][local230 + 1]) != 0) {
								local230++;
							}
							label455: while (local203 > 0) {
								for (local280 = local213; local280 <= local230; local280++) {
									if ((Static100.anIntArrayArrayArray7[local163][local203 - 1][local280] & local136) == 0) {
										break label455;
									}
								}
								local203--;
							}
							label444: while (local207 < 104) {
								for (local280 = local213; local280 <= local230; local280++) {
									if ((Static100.anIntArrayArrayArray7[local163][local207 + 1][local280] & local136) == 0) {
										break label444;
									}
								}
								local207++;
							}
							if ((local207 + 1 - local203) * (local230 + 1 - local213) >= 4) {
								local280 = Static61.anIntArrayArrayArray6[local163][local203][local213];
								Static31.method583(local140, 4, local203 * 128, local207 * 128 + 128, local213 * 128, local230 * 128 + 128, local280, local280);
								for (local513 = local203; local513 <= local207; local513++) {
									for (local552 = local213; local552 <= local230; local552++) {
										Static100.anIntArrayArrayArray7[local163][local513][local552] &= ~local136;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method752() {
		aClass65_525 = null;
		aClass2_Sub1_Sub4_Sub4_1 = null;
		aClass65_530 = null;
		aByteArrayArrayArray4 = null;
		aClass2_Sub1_Sub4_Sub3Array4 = null;
		aClass33_15 = null;
		aClass65_528 = null;
		aClass15_29 = null;
		aClass65_527 = null;
		aClass65_526 = null;
		aClass65_529 = null;
		aClass2_Sub1_Sub4_Sub2Array6 = null;
		aClass2_Sub1_Sub4_Sub2_5 = null;
	}
}
