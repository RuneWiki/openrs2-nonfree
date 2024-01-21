import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
	public static int anInt2719;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "Lclient!fc;")
	public static Class21 aClass21_31 = new Class21(50);

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1312 = Static87.method1648("runes");

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
	public static int anInt2718 = 0;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1313 = Static87.method1648("Fehler beim Laden Ihres Charakter)2Profils");

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1317 = Static87.method1648("To create a new account you need to");

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1314 = aClass27_1317;

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "[Lclient!de;")
	public static Class3_Sub3_Sub1_Sub1[] aClass3_Sub3_Sub1_Sub1Array1 = new Class3_Sub3_Sub1_Sub1[4];

	@OriginalMember(owner = "client!vc", name = "V", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1315 = Static87.method1648("leuchten2:");

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
	public static int anInt2721 = 0;

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1316 = Static87.method1648("scrollen:");

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
	public static int anInt2722 = 0;

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1318 = Static87.method1648("und haben es deaktiviert)3 Benutzen Sie die");

	@OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
	public static int anInt2723 = -1;

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "B")
	public static byte aByte2 = 0;

	@OriginalMember(owner = "client!vc", name = "db", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1319 = Static87.method1648("Konfig geladen)3");

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1320 = Static87.method1648("glow1:");

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
	public static int anInt2724 = 0;

	@OriginalMember(owner = "client!vc", name = "gb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1321 = aClass27_1320;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ed;B[Lclient!pb;)V")
	public static void method1860(@OriginalArg(0) Class18 arg0, @OriginalArg(2) Class49[] arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(26) int local26;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static89.aByteArrayArrayArray11[local3][local7][local11] & 0x1) == 1) {
						local26 = local3;
						if ((Static89.aByteArrayArrayArray11[1][local7][local11] & 0x2) == 2) {
							local26 = local3 - 1;
						}
						if (local26 >= 0) {
							arg1[local26].method1525(local7, local11);
						}
					}
				}
			}
		}
		Static1.anInt3 += (int) (Math.random() * 5.0D) - 2;
		Static79.anInt823 += (int) (Math.random() * 5.0D) - 2;
		if (Static79.anInt823 < -8) {
			Static79.anInt823 = -8;
		}
		if (Static1.anInt3 < -16) {
			Static1.anInt3 = -16;
		}
		if (Static79.anInt823 > 8) {
			Static79.anInt823 = 8;
		}
		if (Static1.anInt3 > 16) {
			Static1.anInt3 = 16;
		}
		@Pc(132) int local132;
		@Pc(134) int local134;
		@Pc(138) int local138;
		@Pc(161) int local161;
		@Pc(182) int local182;
		@Pc(195) int local195;
		@Pc(201) int local201;
		@Pc(211) int local211;
		@Pc(207) int local207;
		@Pc(228) int local228;
		@Pc(276) int local276;
		@Pc(504) int local504;
		@Pc(548) int local548;
		@Pc(657) int local657;
		@Pc(647) int local647;
		@Pc(672) int local672;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(122) byte[][] local122 = Static82.aByteArrayArrayArray7[local7];
			local26 = (int) Math.sqrt(5100.0D);
			local132 = local26 * 768 >> 8;
			for (local134 = 1; local134 < 103; local134++) {
				for (local138 = 1; local138 < 103; local138++) {
					local161 = Static55.anIntArrayArrayArray4[local7][local138 + 1][local134] - Static55.anIntArrayArrayArray4[local7][local138 - 1][local134];
					local182 = Static55.anIntArrayArrayArray4[local7][local138][local134 + 1] - Static55.anIntArrayArrayArray4[local7][local138][local134 - 1];
					local195 = (int) Math.sqrt((double) (local182 * local182 + local161 * local161 + 65536));
					local201 = (local161 << 8) / local195;
					local207 = (local182 << 8) / local195;
					local211 = 65536 / local195;
					local228 = (local207 * -50 + local201 * -50 + local211 * -10) / local132 + 96;
					local276 = (local122[local138][local134 + 1] >> 3) + (local122[local138][local134 - 1] >> 2) + (local122[local138 - 1][local134] >> 2) + (local122[local138 - -1][local134] >> 3) + (local122[local138][local134] >> 1);
					Static79.anIntArrayArray29[local138][local134] = local228 - local276;
				}
			}
			for (local138 = 0; local138 < 104; local138++) {
				Static1.anIntArray1[local138] = 0;
				Static12.anIntArray52[local138] = 0;
				Static3.anIntArray13[local138] = 0;
				Static66.anIntArray297[local138] = 0;
				Static79.anIntArray153[local138] = 0;
			}
			for (local161 = -5; local161 < 109; local161++) {
				for (local182 = 0; local182 < 104; local182++) {
					local195 = local161 + 5;
					@Pc(400) int local400;
					if (local195 >= 0 && local195 < 104) {
						local201 = Static69.aByteArrayArrayArray5[local7][local195][local182] & 0xFF;
						if (local201 > 0) {
							@Pc(364) Class3_Sub3_Sub8 local364 = Static97.method1604(local201 - 1);
							Static1.anIntArray1[local182] += local364.anInt1701;
							Static12.anIntArray52[local182] += local364.anInt1707;
							Static3.anIntArray13[local182] += local364.anInt1711;
							Static66.anIntArray297[local182] += local364.anInt1715;
							local400 = Static79.anIntArray153[local182]++;
						}
					}
					local201 = local161 - 5;
					if (local201 >= 0 && local201 < 104) {
						local211 = Static69.aByteArrayArrayArray5[local7][local201][local182] & 0xFF;
						if (local211 > 0) {
							@Pc(433) Class3_Sub3_Sub8 local433 = Static97.method1604(local211 - 1);
							Static1.anIntArray1[local182] -= local433.anInt1701;
							Static12.anIntArray52[local182] -= local433.anInt1707;
							Static3.anIntArray13[local182] -= local433.anInt1711;
							Static66.anIntArray297[local182] -= local433.anInt1715;
							local400 = Static79.anIntArray153[local182]--;
						}
					}
				}
				if (local161 >= 1 && local161 < 103) {
					local195 = 0;
					local201 = 0;
					local207 = 0;
					local211 = 0;
					local228 = 0;
					for (local276 = -5; local276 < 109; local276++) {
						local504 = local276 + 5;
						if (local504 >= 0 && local504 < 104) {
							local201 += Static12.anIntArray52[local504];
							local228 += Static79.anIntArray153[local504];
							local207 += Static66.anIntArray297[local504];
							local195 += Static1.anIntArray1[local504];
							local211 += Static3.anIntArray13[local504];
						}
						local548 = local276 - 5;
						if (local548 >= 0 && local548 < 104) {
							local228 -= Static79.anIntArray153[local548];
							local195 -= Static1.anIntArray1[local548];
							local207 -= Static66.anIntArray297[local548];
							local201 -= Static12.anIntArray52[local548];
							local211 -= Static3.anIntArray13[local548];
						}
						if (local276 >= 1 && local276 < 103 && (!Static70.aBoolean94 || (Static89.aByteArrayArrayArray11[0][local161][local276] & 0x2) != 0 || (Static89.aByteArrayArrayArray11[local7][local161][local276] & 0x10) == 0 && Static68.method1244(local161, local7, local276) == Static13.anInt767)) {
							if (local7 < Static80.anInt2191) {
								Static80.anInt2191 = local7;
							}
							local647 = Static73.aByteArrayArrayArray6[local7][local161][local276] & 0xFF;
							local657 = Static69.aByteArrayArrayArray5[local7][local161][local276] & 0xFF;
							if (local657 > 0 || local647 > 0) {
								local672 = Static55.anIntArrayArrayArray4[local7][local161][local276];
								@Pc(682) int local682 = Static55.anIntArrayArrayArray4[local7][local161 + 1][local276];
								@Pc(694) int local694 = Static55.anIntArrayArrayArray4[local7][local161 + 1][local276 + 1];
								@Pc(704) int local704 = Static55.anIntArrayArrayArray4[local7][local161][local276 + 1];
								@Pc(710) int local710 = Static79.anIntArrayArray29[local161][local276];
								@Pc(718) int local718 = Static79.anIntArrayArray29[local161 + 1][local276];
								@Pc(728) int local728 = Static79.anIntArrayArray29[local161 + 1][local276 + 1];
								@Pc(736) int local736 = Static79.anIntArrayArray29[local161][local276 + 1];
								@Pc(738) int local738 = -1;
								@Pc(740) int local740 = -1;
								@Pc(751) int local751;
								@Pc(759) int local759;
								if (local657 > 0) {
									local751 = local195 * 256 / local207;
									@Pc(755) int local755 = local211 / local228;
									local759 = local201 / local228;
									local740 = Static7.method163(local751, local759, local755);
									@Pc(771) int local771 = Static79.anInt823 + local751 & 0xFF;
									local755 += Static1.anInt3;
									if (local755 < 0) {
										local755 = 0;
									} else if (local755 > 255) {
										local755 = 255;
									}
									local738 = Static7.method163(local771, local759, local755);
								}
								if (local7 > 0) {
									@Pc(796) boolean local796 = true;
									if (local657 == 0 && Static48.aByteArrayArrayArray10[local7][local161][local276] != 0) {
										local796 = false;
									}
									if (local647 > 0 && !Static83.method1670(local647 - 1).aBoolean99) {
										local796 = false;
									}
									if (local796 && local682 == local672 && local672 == local694 && local704 == local672) {
										Static86.anIntArrayArrayArray5[local7][local161][local276] |= 0x924;
									}
								}
								local751 = 0;
								if (local738 != -1) {
									local751 = Static51.anIntArray223[Static17.method310(96, local738)];
								}
								if (local647 == 0) {
									arg0.method502(local7, local161, local276, 0, 0, -1, local672, local682, local694, local704, Static17.method310(local710, local740), Static17.method310(local718, local740), Static17.method310(local728, local740), Static17.method310(local736, local740), 0, 0, 0, 0, local751, 0);
								} else {
									local759 = Static48.aByteArrayArrayArray10[local7][local161][local276] + 1;
									@Pc(931) byte local931 = Static57.aByteArrayArrayArray4[local7][local161][local276];
									@Pc(937) Class3_Sub3_Sub10 local937 = Static83.method1670(local647 - 1);
									@Pc(940) int local940 = local937.anInt2129;
									@Pc(960) int local960;
									@Pc(992) int local992;
									@Pc(967) int local967;
									@Pc(972) int local972;
									if (local940 >= 0) {
										local992 = Static51.anInterface4_1.method1547(local940);
										local960 = -1;
									} else if (local937.anInt2119 == 16711935) {
										local992 = -2;
										local940 = -1;
										local960 = -2;
									} else {
										local960 = Static7.method163(local937.anInt2115, local937.anInt2130, local937.anInt2123);
										local967 = local937.anInt2115 + Static79.anInt823 & 0xFF;
										local972 = Static1.anInt3 + local937.anInt2123;
										if (local972 < 0) {
											local972 = 0;
										} else if (local972 > 255) {
											local972 = 255;
										}
										local992 = Static7.method163(local967, local937.anInt2130, local972);
									}
									local967 = 0;
									if (local992 != -2) {
										local967 = Static51.anIntArray223[Static91.method1732(local992, 96)];
									}
									if (local937.anInt2121 != -1) {
										local972 = local937.anInt2117 + Static79.anInt823 & 0xFF;
										@Pc(1039) int local1039 = Static1.anInt3 + local937.anInt2128;
										if (local1039 < 0) {
											local1039 = 0;
										} else if (local1039 > 255) {
											local1039 = 255;
										}
										local992 = Static7.method163(local972, local937.anInt2131, local1039);
										local967 = Static51.anIntArray223[Static91.method1732(local992, 96)];
									}
									arg0.method502(local7, local161, local276, local759, local931, local940, local672, local682, local694, local704, Static17.method310(local710, local740), Static17.method310(local718, local740), Static17.method310(local728, local740), Static17.method310(local736, local740), Static91.method1732(local960, local710), Static91.method1732(local960, local718), Static91.method1732(local960, local728), Static91.method1732(local960, local736), local751, local967);
								}
							}
						}
					}
				}
			}
			for (local182 = 1; local182 < 103; local182++) {
				for (local195 = 1; local195 < 103; local195++) {
					arg0.method508(local7, local195, local182, Static68.method1244(local195, local7, local182));
				}
			}
			Static69.aByteArrayArrayArray5[local7] = null;
			Static73.aByteArrayArrayArray6[local7] = null;
			Static48.aByteArrayArrayArray10[local7] = null;
			Static57.aByteArrayArrayArray4[local7] = null;
			Static82.aByteArrayArrayArray7[local7] = null;
		}
		arg0.method515();
		for (local11 = 0; local11 < 104; local11++) {
			for (local26 = 0; local26 < 104; local26++) {
				if ((Static89.aByteArrayArrayArray11[1][local11][local26] & 0x2) == 2) {
					arg0.method497(local11, local26);
				}
			}
		}
		local26 = 1;
		local132 = 2;
		local134 = 4;
		for (local138 = 0; local138 < 4; local138++) {
			if (local138 > 0) {
				local132 <<= 0x3;
				local26 <<= 0x3;
				local134 <<= 0x3;
			}
			for (local161 = 0; local161 <= local138; local161++) {
				for (local182 = 0; local182 <= 104; local182++) {
					for (local195 = 0; local195 <= 104; local195++) {
						if ((Static86.anIntArrayArrayArray5[local161][local195][local182] & local26) != 0) {
							for (local201 = local182; local201 > 0 && (Static86.anIntArrayArrayArray5[local161][local195][local201 - 1] & local26) != 0; local201--) {
							}
							for (local211 = local182; local211 < 104 && (Static86.anIntArrayArrayArray5[local161][local195][local211 + 1] & local26) != 0; local211++) {
							}
							local228 = local161;
							label347: for (local207 = local161; local207 > 0; local207--) {
								for (local276 = local201; local276 <= local211; local276++) {
									if ((Static86.anIntArrayArrayArray5[local207 - 1][local195][local276] & local26) == 0) {
										break label347;
									}
								}
							}
							label336: while (local228 < local138) {
								for (local276 = local201; local276 <= local211; local276++) {
									if ((local26 & Static86.anIntArrayArrayArray5[local228 + 1][local195][local276]) == 0) {
										break label336;
									}
								}
								local228++;
							}
							local276 = (local211 + 1 - local201) * (local228 + 1 - local207);
							if (local276 >= 8) {
								local657 = Static55.anIntArrayArrayArray4[local207][local195][local201];
								local548 = Static55.anIntArrayArrayArray4[local228][local195][local201] - 240;
								Static26.method498(local138, 1, local195 * 128, local195 * 128, local201 * 128, local211 * 128 + 128, local548, local657);
								for (local647 = local207; local647 <= local228; local647++) {
									for (local672 = local201; local672 <= local211; local672++) {
										Static86.anIntArrayArrayArray5[local647][local195][local672] &= ~local26;
									}
								}
							}
						}
						if ((local132 & Static86.anIntArrayArrayArray5[local161][local195][local182]) != 0) {
							local211 = local195;
							local207 = local161;
							while (local211 < 104 && (local132 & Static86.anIntArrayArrayArray5[local161][local211 + 1][local182]) != 0) {
								local211++;
							}
							for (local201 = local195; local201 > 0 && (Static86.anIntArrayArrayArray5[local161][local201 - 1][local182] & local132) != 0; local201--) {
							}
							local228 = local161;
							label402: while (local207 > 0) {
								for (local276 = local201; local276 <= local211; local276++) {
									if ((Static86.anIntArrayArrayArray5[local207 - 1][local276][local182] & local132) == 0) {
										break label402;
									}
								}
								local207--;
							}
							label391: while (local228 < local138) {
								for (local276 = local201; local276 <= local211; local276++) {
									if ((local132 & Static86.anIntArrayArrayArray5[local228 + 1][local276][local182]) == 0) {
										break label391;
									}
								}
								local228++;
							}
							local276 = (local228 + 1 - local207) * (local211 + 1 - local201);
							if (local276 >= 8) {
								local548 = Static55.anIntArrayArrayArray4[local228][local201][local182] - 240;
								local657 = Static55.anIntArrayArrayArray4[local207][local201][local182];
								Static26.method498(local138, 2, local201 * 128, local211 * 128 + 128, local182 * 128, local182 * 128, local548, local657);
								for (local647 = local207; local647 <= local228; local647++) {
									for (local672 = local201; local672 <= local211; local672++) {
										Static86.anIntArrayArrayArray5[local647][local672][local182] &= ~local132;
									}
								}
							}
						}
						if ((local134 & Static86.anIntArrayArrayArray5[local161][local195][local182]) != 0) {
							local201 = local195;
							local211 = local195;
							for (local207 = local182; local207 > 0 && (local134 & Static86.anIntArrayArrayArray5[local161][local195][local207 - 1]) != 0; local207--) {
							}
							for (local228 = local182; local228 < 104 && (Static86.anIntArrayArrayArray5[local161][local195][local228 + 1] & local134) != 0; local228++) {
							}
							label457: while (local201 > 0) {
								for (local276 = local207; local276 <= local228; local276++) {
									if ((local134 & Static86.anIntArrayArrayArray5[local161][local201 - 1][local276]) == 0) {
										break label457;
									}
								}
								local201--;
							}
							label446: while (local211 < 104) {
								for (local276 = local207; local276 <= local228; local276++) {
									if ((Static86.anIntArrayArrayArray5[local161][local211 + 1][local276] & local134) == 0) {
										break label446;
									}
								}
								local211++;
							}
							if ((local211 + 1 - local201) * (local228 + 1 - local207) >= 4) {
								local276 = Static55.anIntArrayArrayArray4[local161][local201][local207];
								Static26.method498(local138, 4, local201 * 128, local211 * 128 + 128, local207 * 128, local228 * 128 + 128, local276, local276);
								for (local504 = local201; local504 <= local211; local504++) {
									for (local548 = local207; local548 <= local228; local548++) {
										Static86.anIntArrayArrayArray5[local161][local504][local548] &= ~local134;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	public static void method1861() {
		aClass21_31 = null;
		aClass27_1318 = null;
		aClass27_1321 = null;
		aClass27_1320 = null;
		aClass27_1315 = null;
		aClass27_1319 = null;
		aClass27_1317 = null;
		aClass27_1312 = null;
		aClass27_1313 = null;
		aClass27_1314 = null;
		aClass3_Sub3_Sub1_Sub1Array1 = null;
		aClass27_1316 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!hb;BLclient!hb;Lclient!td;)Lclient!ee;")
	public static Class3_Sub3_Sub2_Sub1 method1862(@OriginalArg(0) Class27 arg0, @OriginalArg(2) Class27 arg1, @OriginalArg(3) Class54 arg2) {
		@Pc(15) int local15 = arg2.method1620(arg0);
		@Pc(21) int local21 = arg2.method1613(arg1, local15);
		return Static41.method879(local21, local15, arg2);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!td;II)[Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4[] method1863(@OriginalArg(1) Class54 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static64.method1189(arg1, arg0, arg2) ? Static73.method1343() : null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)V")
	public static void method1864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			if (Static81.aClass27Array13[local9] != null) {
				@Pc(19) int local19 = Static81.anIntArray333[local9];
				@Pc(29) int local29 = Static74.anInt2075 + 4 + 70 - local7 * 14;
				if (local29 < -20) {
					break;
				}
				if (local19 == 0) {
					local7++;
				}
				@Pc(42) Class27 local42 = Static55.aClass27Array8[local9];
				if (local42 != null && local42.method751(Static4.aClass27_1330)) {
					local42 = local42.method731(5);
				}
				if (local42 != null && local42.method751(Static42.aClass27_600)) {
					local42 = local42.method731(5);
				}
				if ((local19 == 1 || local19 == 2) && (local19 == 1 || Static76.anInt2134 == 0 || Static76.anInt2134 == 1 && Static50.method971(local42))) {
					if (local29 - 14 < arg1 && arg1 <= local29 && !local42.method733(Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.aClass27_1150)) {
						if (Static45.anInt345 >= 1) {
							Static46.method925(0, 32, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local42 }), Static47.aClass27_620);
						}
						Static46.method925(0, 49, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local42 }), Static72.aClass27_931);
						Static46.method925(0, 6, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local42 }), Static56.aClass27_717);
					}
					local7++;
				}
				if ((local19 == 3 || local19 == 7) && Static87.anInt2332 == 0 && (local19 == 7 || Static34.anInt828 == 0 || Static34.anInt828 == 1 && Static50.method971(local42))) {
					if (local29 - 14 < arg1 && local29 >= arg1) {
						if (Static45.anInt345 >= 1) {
							Static46.method925(0, 32, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local42 }), Static47.aClass27_620);
						}
						Static46.method925(0, 49, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local42 }), Static72.aClass27_931);
						Static46.method925(0, 6, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local42 }), Static56.aClass27_717);
					}
					local7++;
				}
				if (local19 == 4 && (Static61.anInt1554 == 0 || Static61.anInt1554 == 1 && Static50.method971(local42))) {
					if (local29 - 14 < arg1 && local29 >= arg1) {
						Static46.method925(0, 56, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local42 }), Static106.aClass27_419);
					}
					local7++;
				}
				if ((local19 == 5 || local19 == 6) && Static87.anInt2332 == 0 && Static34.anInt828 < 2) {
					local7++;
				}
				if (local19 == 8 && (Static61.anInt1554 == 0 || Static61.anInt1554 == 1 && Static50.method971(local42))) {
					local7++;
					if (arg1 > local29 - 14 && arg1 <= local29) {
						Static46.method925(0, 38, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local42 }), Static45.aClass27_177);
					}
				}
			}
		}
	}
}
