import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "Lclient!me;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!ee", name = "mb", descriptor = "I")
	private static int anInt820;

	@OriginalMember(owner = "client!ee", name = "sb", descriptor = "Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "Lclient!ae;")
	private static Class5 aClass5_363 = Static56.method972("Loading textures )2 ");

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "Lclient!ae;")
	public static Class5 aClass5_360 = aClass5_363;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "Z")
	public static volatile boolean aBoolean42 = true;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "Lclient!ae;")
	private static Class5 aClass5_361 = Static56.method972("M");

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
	public static int anInt810 = 0;

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "Lclient!ae;")
	public static Class5 aClass5_362 = Static56.method972("M");

	@OriginalMember(owner = "client!ee", name = "cb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_364 = aClass5_361;

	@OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
	public static volatile int anInt814 = 0;

	@OriginalMember(owner = "client!ee", name = "kb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_366 = Static56.method972("Click to continue");

	@OriginalMember(owner = "client!ee", name = "gb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_365 = aClass5_366;

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
	public static int anInt817 = 0;

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
	public static int anInt819 = -1;

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "Lclient!nc;")
	public static Class48 aClass48_1 = new Class48();

	@OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
	public static int anInt824 = -1;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method540() {
		for (@Pc(7) int local7 = 0; local7 < Static34.anInt966; local7++) {
			@Pc(13) int local13 = Static56.anIntArray173[local7]--;
			if (Static56.anIntArray173[local7] >= -10) {
				@Pc(84) Class54 local84 = Static17.aClass54Array1[local7];
				if (local84 == null) {
					local84 = Static121.method1461(Static60.aClass11_Sub1_112, Static115.anIntArray380[local7]);
					if (local84 == null) {
						continue;
					}
					Static56.anIntArray173[local7] += local84.method1460();
					Static17.aClass54Array1[local7] = local84;
				}
				if (Static56.anIntArray173[local7] < 0) {
					@Pc(207) int local207;
					if (Static95.anIntArray274[local7] == 0) {
						local207 = Static56.anInt1483;
					} else {
						@Pc(127) int local127 = (Static95.anIntArray274[local7] & 0xFF) * 128;
						@Pc(135) int local135 = Static95.anIntArray274[local7] >> 16 & 0xFF;
						@Pc(145) int local145 = local135 * 128 + 64 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567;
						if (local145 < 0) {
							local145 = -local145;
						}
						@Pc(158) int local158 = Static95.anIntArray274[local7] >> 8 & 0xFF;
						@Pc(168) int local168 = local158 * 128 + 64 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543;
						if (local168 < 0) {
							local168 = -local168;
						}
						@Pc(179) int local179 = local168 + local145 - 128;
						if (local127 < local179) {
							Static56.anIntArray173[local7] = -100;
							continue;
						}
						if (local179 < 0) {
							local179 = 0;
						}
						local207 = Static10.anInt2842 * (local127 - local179) / local127;
					}
					@Pc(216) Class3_Sub4_Sub1 local216 = local84.method1462().method867(aClass46_1);
					@Pc(221) Class3_Sub2_Sub2 local221 = Static119.method1399(local216, local207);
					local221.method1403(Static108.anIntArray370[local7] - 1);
					Static1.aClass3_Sub2_Sub1_1.method340(local221);
					Static56.anIntArray173[local7] = -100;
				}
			} else {
				Static34.anInt966--;
				for (@Pc(27) int local27 = local7; local27 < Static34.anInt966; local27++) {
					Static115.anIntArray380[local27] = Static115.anIntArray380[local27 + 1];
					Static17.aClass54Array1[local27] = Static17.aClass54Array1[local27 + 1];
					Static108.anIntArray370[local27] = Static108.anIntArray370[local27 + 1];
					Static56.anIntArray173[local27] = Static56.anIntArray173[local27 + 1];
					Static95.anIntArray274[local27] = Static95.anIntArray274[local27 + 1];
				}
				local7--;
			}
		}
		if (Static18.anInt633 <= 0) {
			return;
		}
		Static18.anInt633 -= 20;
		if (Static18.anInt633 < 0) {
			Static18.anInt633 = 0;
		}
		if (Static18.anInt633 == 0 && Static68.anInt1575 != 0 && Static115.anInt2976 != -1) {
			Static62.method1073(0, Static34.aClass11_Sub1_34, Static68.anInt1575, Static115.anInt2976);
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method541(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static114.aClass45_1);
		arg0.addMouseMotionListener(Static114.aClass45_1);
		arg0.addFocusListener(Static114.aClass45_1);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!l;[Lclient!h;)V")
	public static void method542(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class30[] arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(30) int local30;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static93.aByteArrayArrayArray5[local7][local11][local15] & 0x1) == 1) {
						local30 = local7;
						if ((Static93.aByteArrayArrayArray5[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg1[local30].method709(local15, local11);
						}
					}
				}
			}
		}
		Static48.anInt1320 += (int) (Math.random() * 5.0D) - 2;
		if (Static48.anInt1320 < -8) {
			Static48.anInt1320 = -8;
		}
		Static60.anInt2985 += (int) (Math.random() * 5.0D) - 2;
		if (Static60.anInt2985 < -16) {
			Static60.anInt2985 = -16;
		}
		if (Static60.anInt2985 > 16) {
			Static60.anInt2985 = 16;
		}
		if (Static48.anInt1320 > 8) {
			Static48.anInt1320 = 8;
		}
		@Pc(136) int local136;
		@Pc(138) int local138;
		@Pc(142) int local142;
		@Pc(165) int local165;
		@Pc(186) int local186;
		@Pc(199) int local199;
		@Pc(209) int local209;
		@Pc(203) int local203;
		@Pc(215) int local215;
		@Pc(232) int local232;
		@Pc(280) int local280;
		@Pc(510) int local510;
		@Pc(551) int local551;
		@Pc(646) int local646;
		@Pc(656) int local656;
		@Pc(674) int local674;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(126) byte[][] local126 = Static19.aByteArrayArrayArray2[local11];
			local30 = (int) Math.sqrt(5100.0D);
			local136 = local30 * 768 >> 8;
			for (local138 = 1; local138 < 103; local138++) {
				for (local142 = 1; local142 < 103; local142++) {
					local165 = Static111.anIntArrayArrayArray7[local11][local142 + 1][local138] - Static111.anIntArrayArrayArray7[local11][local142 - 1][local138];
					local186 = Static111.anIntArrayArrayArray7[local11][local142][local138 + 1] - Static111.anIntArrayArrayArray7[local11][local142][local138 - 1];
					local199 = (int) Math.sqrt((double) (local186 * local186 + local165 * local165 + 65536));
					local203 = 65536 / local199;
					local209 = (local165 << 8) / local199;
					local215 = (local186 << 8) / local199;
					local232 = (local215 * -50 + local209 * -50 + local203 * -10) / local136 + 96;
					local280 = (local126[local142][local138] >> 1) + (local126[local142][local138 + 1] >> 3) + (local126[local142][local138 + -1] >> 2) + (local126[local142 + 1][local138] >> 3) + (local126[local142 + -1][local138] >> 2);
					Static24.anIntArrayArray7[local142][local138] = local232 - local280;
				}
			}
			for (local142 = 0; local142 < 104; local142++) {
				Static15.anIntArray63[local142] = 0;
				Static56.anIntArray172[local142] = 0;
				Static101.anIntArray297[local142] = 0;
				Static40.anIntArray133[local142] = 0;
				Static12.anIntArray60[local142] = 0;
			}
			for (local165 = -5; local165 < 109; local165++) {
				for (local186 = 0; local186 < 104; local186++) {
					local199 = local165 + 5;
					@Pc(406) int local406;
					if (local199 >= 0 && local199 < 104) {
						local209 = Static116.aByteArrayArrayArray9[local11][local199][local186] & 0xFF;
						if (local209 > 0) {
							@Pc(370) Class3_Sub1_Sub10 local370 = Static43.method823(local209 - 1);
							Static15.anIntArray63[local186] += local370.anInt1485;
							Static56.anIntArray172[local186] += local370.anInt1484;
							Static101.anIntArray297[local186] += local370.anInt1474;
							Static40.anIntArray133[local186] += local370.anInt1473;
							local406 = Static12.anIntArray60[local186]++;
						}
					}
					local209 = local165 - 5;
					if (local209 >= 0 && local209 < 104) {
						local203 = Static116.aByteArrayArrayArray9[local11][local209][local186] & 0xFF;
						if (local203 > 0) {
							@Pc(439) Class3_Sub1_Sub10 local439 = Static43.method823(local203 - 1);
							Static15.anIntArray63[local186] -= local439.anInt1485;
							Static56.anIntArray172[local186] -= local439.anInt1484;
							Static101.anIntArray297[local186] -= local439.anInt1474;
							Static40.anIntArray133[local186] -= local439.anInt1473;
							local406 = Static12.anIntArray60[local186]--;
						}
					}
				}
				if (local165 >= 1 && local165 < 103) {
					local199 = 0;
					local203 = 0;
					local209 = 0;
					local232 = 0;
					local215 = 0;
					for (local280 = -5; local280 < 109; local280++) {
						local510 = local280 + 5;
						if (local510 >= 0 && local510 < 104) {
							local199 += Static15.anIntArray63[local510];
							local215 += Static40.anIntArray133[local510];
							local209 += Static56.anIntArray172[local510];
							local232 += Static12.anIntArray60[local510];
							local203 += Static101.anIntArray297[local510];
						}
						local551 = local280 - 5;
						if (local551 >= 0 && local551 < 104) {
							local209 -= Static56.anIntArray172[local551];
							local215 -= Static40.anIntArray133[local551];
							local232 -= Static12.anIntArray60[local551];
							local203 -= Static101.anIntArray297[local551];
							local199 -= Static15.anIntArray63[local551];
						}
						if (local280 >= 1 && local280 < 103 && (!Static74.aBoolean91 || (Static93.aByteArrayArrayArray5[0][local165][local280] & 0x2) != 0 || (Static93.aByteArrayArrayArray5[local11][local165][local280] & 0x10) == 0 && Static74.method1230(local280, local165, local11) == Static83.anInt2037)) {
							if (local11 < Static38.anInt1058) {
								Static38.anInt1058 = local11;
							}
							local646 = Static116.aByteArrayArrayArray9[local11][local165][local280] & 0xFF;
							local656 = Static49.aByteArrayArrayArray3[local11][local165][local280] & 0xFF;
							if (local646 > 0 || local656 > 0) {
								local674 = Static111.anIntArrayArrayArray7[local11][local165][local280];
								@Pc(684) int local684 = Static111.anIntArrayArrayArray7[local11][local165 + 1][local280];
								@Pc(694) int local694 = Static111.anIntArrayArrayArray7[local11][local165][local280 + 1];
								@Pc(706) int local706 = Static111.anIntArrayArrayArray7[local11][local165 + 1][local280 + 1];
								@Pc(712) int local712 = Static24.anIntArrayArray7[local165][local280];
								@Pc(720) int local720 = Static24.anIntArrayArray7[local165 + 1][local280];
								@Pc(722) int local722 = -1;
								@Pc(730) int local730 = Static24.anIntArrayArray7[local165][local280 + 1];
								@Pc(740) int local740 = Static24.anIntArrayArray7[local165 + 1][local280 + 1];
								@Pc(742) int local742 = -1;
								@Pc(753) int local753;
								@Pc(761) int local761;
								if (local646 > 0) {
									local753 = local199 * 256 / local215;
									@Pc(757) int local757 = local203 / local232;
									local761 = local209 / local232;
									local722 = Static114.method1951(local757, local761, local753);
									local757 += Static60.anInt2985;
									@Pc(777) int local777 = local753 + Static48.anInt1320 & 0xFF;
									if (local757 < 0) {
										local757 = 0;
									} else if (local757 > 255) {
										local757 = 255;
									}
									local742 = Static114.method1951(local757, local761, local777);
								}
								if (local11 > 0) {
									@Pc(801) boolean local801 = true;
									if (local646 == 0 && Static111.aByteArrayArrayArray8[local11][local165][local280] != 0) {
										local801 = false;
									}
									if (local656 > 0 && !Static104.method1155(local656 - 1).aBoolean109) {
										local801 = false;
									}
									if (local801 && local674 == local684 && local706 == local674 && local674 == local694) {
										Static78.anIntArrayArrayArray4[local11][local165][local280] |= 0x924;
									}
								}
								local753 = 0;
								if (local742 != -1) {
									local753 = Static25.anIntArray96[Static60.method1965(96, local742)];
								}
								if (local656 == 0) {
									arg0.method1024(local11, local165, local280, 0, 0, -1, local674, local684, local706, local694, Static60.method1965(local712, local722), Static60.method1965(local720, local722), Static60.method1965(local740, local722), Static60.method1965(local730, local722), 0, 0, 0, 0, local753, 0);
								} else {
									local761 = Static111.aByteArrayArrayArray8[local11][local165][local280] + 1;
									@Pc(895) byte local895 = Static100.aByteArrayArrayArray6[local11][local165][local280];
									@Pc(901) Class3_Sub1_Sub14 local901 = Static104.method1155(local656 - 1);
									@Pc(904) int local904 = local901.anInt2248;
									@Pc(916) int local916;
									@Pc(914) int local914;
									@Pc(937) int local937;
									@Pc(942) int local942;
									if (local904 >= 0) {
										local914 = Static25.anInterface3_1.method1552(local904);
										local916 = -1;
									} else if (local901.anInt2256 == 16711935) {
										local914 = -2;
										local916 = -2;
										local904 = -1;
									} else {
										local916 = Static114.method1951(local901.anInt2243, local901.anInt2257, local901.anInt2247);
										local937 = local901.anInt2247 + Static48.anInt1320 & 0xFF;
										local942 = Static60.anInt2985 + local901.anInt2243;
										if (local942 < 0) {
											local942 = 0;
										} else if (local942 > 255) {
											local942 = 255;
										}
										local914 = Static114.method1951(local942, local901.anInt2257, local937);
									}
									local937 = 0;
									if (local914 != -2) {
										local937 = Static25.anIntArray96[Static42.method806(local914, 96)];
									}
									if (local901.anInt2252 != -1) {
										@Pc(996) int local996 = Static60.anInt2985 + local901.anInt2249;
										local942 = Static48.anInt1320 + local901.anInt2242 & 0xFF;
										if (local996 < 0) {
											local996 = 0;
										} else if (local996 > 255) {
											local996 = 255;
										}
										local914 = Static114.method1951(local996, local901.anInt2241, local942);
										local937 = Static25.anIntArray96[Static42.method806(local914, 96)];
									}
									arg0.method1024(local11, local165, local280, local761, local895, local904, local674, local684, local706, local694, Static60.method1965(local712, local722), Static60.method1965(local720, local722), Static60.method1965(local740, local722), Static60.method1965(local730, local722), Static42.method806(local916, local712), Static42.method806(local916, local720), Static42.method806(local916, local740), Static42.method806(local916, local730), local753, local937);
								}
							}
						}
					}
				}
			}
			for (local186 = 1; local186 < 103; local186++) {
				for (local199 = 1; local199 < 103; local199++) {
					arg0.method1018(local11, local199, local186, Static74.method1230(local186, local199, local11));
				}
			}
			Static116.aByteArrayArrayArray9[local11] = null;
			Static49.aByteArrayArrayArray3[local11] = null;
			Static111.aByteArrayArrayArray8[local11] = null;
			Static100.aByteArrayArrayArray6[local11] = null;
			Static19.aByteArrayArrayArray2[local11] = null;
		}
		arg0.method1051();
		for (local15 = 0; local15 < 104; local15++) {
			for (local30 = 0; local30 < 104; local30++) {
				if ((Static93.aByteArrayArrayArray5[1][local15][local30] & 0x2) == 2) {
					arg0.method1026(local15, local30);
				}
			}
		}
		local30 = 1;
		local136 = 2;
		local138 = 4;
		for (local142 = 0; local142 < 4; local142++) {
			if (local142 > 0) {
				local30 <<= 0x3;
				local138 <<= 0x3;
				local136 <<= 0x3;
			}
			for (local165 = 0; local165 <= local142; local165++) {
				for (local186 = 0; local186 <= 104; local186++) {
					for (local199 = 0; local199 <= 104; local199++) {
						if ((local30 & Static78.anIntArrayArrayArray4[local165][local199][local186]) != 0) {
							local209 = local186;
							local215 = local165;
							while (local209 > 0 && (Static78.anIntArrayArrayArray4[local165][local199][local209 - 1] & local30) != 0) {
								local209--;
							}
							local203 = local186;
							local232 = local165;
							while (local203 < 104 && (local30 & Static78.anIntArrayArrayArray4[local165][local199][local203 + 1]) != 0) {
								local203++;
							}
							label347: while (local215 > 0) {
								for (local280 = local209; local280 <= local203; local280++) {
									if ((local30 & Static78.anIntArrayArrayArray4[local215 - 1][local199][local280]) == 0) {
										break label347;
									}
								}
								local215--;
							}
							label336: while (local232 < local142) {
								for (local280 = local209; local280 <= local203; local280++) {
									if ((local30 & Static78.anIntArrayArrayArray4[local232 + 1][local199][local280]) == 0) {
										break label336;
									}
								}
								local232++;
							}
							local280 = (local232 + 1 - local215) * (local203 + 1 - local209);
							if (local280 >= 8) {
								local646 = Static111.anIntArrayArrayArray7[local215][local199][local209];
								local551 = Static111.anIntArrayArrayArray7[local232][local199][local209] - 240;
								Static59.method1044(local142, 1, local199 * 128, local199 * 128, local209 * 128, local203 * 128 + 128, local551, local646);
								for (local656 = local215; local656 <= local232; local656++) {
									for (local674 = local209; local674 <= local203; local674++) {
										Static78.anIntArrayArrayArray4[local656][local199][local674] &= ~local30;
									}
								}
							}
						}
						if ((local136 & Static78.anIntArrayArrayArray4[local165][local199][local186]) != 0) {
							for (local209 = local199; local209 > 0 && (Static78.anIntArrayArrayArray4[local165][local209 - 1][local186] & local136) != 0; local209--) {
							}
							for (local203 = local199; local203 < 104 && (local136 & Static78.anIntArrayArrayArray4[local165][local203 + 1][local186]) != 0; local203++) {
							}
							local232 = local165;
							label401: for (local215 = local165; local215 > 0; local215--) {
								for (local280 = local209; local280 <= local203; local280++) {
									if ((Static78.anIntArrayArrayArray4[local215 - 1][local280][local186] & local136) == 0) {
										break label401;
									}
								}
							}
							label390: while (local232 < local142) {
								for (local280 = local209; local280 <= local203; local280++) {
									if ((local136 & Static78.anIntArrayArrayArray4[local232 + 1][local280][local186]) == 0) {
										break label390;
									}
								}
								local232++;
							}
							local280 = (local232 + 1 - local215) * (local203 + 1 - local209);
							if (local280 >= 8) {
								local646 = Static111.anIntArrayArrayArray7[local215][local209][local186];
								local551 = Static111.anIntArrayArrayArray7[local232][local209][local186] - 240;
								Static59.method1044(local142, 2, local209 * 128, local203 * 128 + 128, local186 * 128, local186 * 128, local551, local646);
								for (local656 = local215; local656 <= local232; local656++) {
									for (local674 = local209; local674 <= local203; local674++) {
										Static78.anIntArrayArrayArray4[local656][local674][local186] &= ~local136;
									}
								}
							}
						}
						if ((local138 & Static78.anIntArrayArrayArray4[local165][local199][local186]) != 0) {
							local209 = local199;
							local203 = local199;
							for (local215 = local186; local215 > 0 && (Static78.anIntArrayArrayArray4[local165][local199][local215 - 1] & local138) != 0; local215--) {
							}
							for (local232 = local186; local232 < 104 && (Static78.anIntArrayArrayArray4[local165][local199][local232 + 1] & local138) != 0; local232++) {
							}
							label456: while (local209 > 0) {
								for (local280 = local215; local280 <= local232; local280++) {
									if ((Static78.anIntArrayArrayArray4[local165][local209 - 1][local280] & local138) == 0) {
										break label456;
									}
								}
								local209--;
							}
							label445: while (local203 < 104) {
								for (local280 = local215; local280 <= local232; local280++) {
									if ((Static78.anIntArrayArrayArray4[local165][local203 + 1][local280] & local138) == 0) {
										break label445;
									}
								}
								local203++;
							}
							if ((local203 + 1 - local209) * (local232 + 1 - local215) >= 4) {
								local280 = Static111.anIntArrayArrayArray7[local165][local209][local215];
								Static59.method1044(local142, 4, local209 * 128, local203 * 128 + 128, local215 * 128, local232 * 128 + 128, local280, local280);
								for (local510 = local209; local510 <= local203; local510++) {
									for (local551 = local215; local551 <= local232; local551++) {
										Static78.anIntArrayArrayArray4[local165][local510][local551] &= ~local138;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!mc;I)V")
	public static void method543(@OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt1567 < 128 || arg0.anInt1543 < 128 || arg0.anInt1567 >= 13184 || arg0.anInt1543 >= 13184) {
			arg0.anInt1536 = -1;
			arg0.anInt1538 = -1;
			arg0.anInt1520 = 0;
			arg0.anInt1528 = 0;
			arg0.anInt1543 = arg0.anInt1562 * 64 + arg0.anIntArray177[0] * 128;
			arg0.anInt1567 = arg0.anInt1562 * 64 + arg0.anIntArray181[0] * 128;
			arg0.method998();
		}
		if (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1 == arg0 && (arg0.anInt1567 < 1536 || arg0.anInt1543 < 1536 || arg0.anInt1567 >= 11776 || arg0.anInt1543 >= 11776)) {
			arg0.anInt1520 = 0;
			arg0.anInt1538 = -1;
			arg0.anInt1567 = arg0.anIntArray181[0] * 128 + arg0.anInt1562 * 64;
			arg0.anInt1543 = arg0.anIntArray177[0] * 128 + arg0.anInt1562 * 64;
			arg0.anInt1536 = -1;
			arg0.anInt1528 = 0;
			arg0.method998();
		}
		if (Static3.anInt289 < arg0.anInt1520) {
			Static23.method458(arg0);
		} else if (Static3.anInt289 <= arg0.anInt1528) {
			Static53.method929(arg0);
		} else {
			Static110.method1917(arg0);
		}
		Static92.method1540(arg0);
		Static69.method1184(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	public static void method544() {
		Static32.aClass2_5.method1318();
		Static53.anIntArray165 = Static25.method507(Static53.anIntArray165);
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	public static void method545() {
		aClass5_360 = null;
		aClass46_1 = null;
		Class3_Sub1_Sub4.anIntArray106 = null;
		aClass5_366 = null;
		aClass5_363 = null;
		aClass48_1 = null;
		aClass5_365 = null;
		aClass5_362 = null;
		aClass5_361 = null;
		aClass5_364 = null;
		aClass3_Sub1_Sub2_Sub3_2 = null;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
	public static void method546(@OriginalArg(1) int arg0) {
		for (anInt820 += arg0; anInt820 >= Static17.anInt610; anInt820 -= Static17.anInt610) {
			Static106.anInt2734 -= Static106.anInt2734 >> 2;
		}
		Static106.anInt2734 -= arg0 * 1000;
		if (Static106.anInt2734 < 0) {
			Static106.anInt2734 = 0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILclient!kd;B)V")
	public static void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub1_Sub1_Sub2 arg3) {
		if (arg3 == Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1 || Static75.anInt1934 >= 400) {
			return;
		}
		@Pc(65) Class5 local65;
		if (arg3.anInt1583 == 0) {
			local65 = Static75.method1261(new Class5[] { arg3.aClass5_765, Static44.method837(Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1581, arg3.anInt1581), Static112.aClass5_1326, Static16.aClass5_271, Static96.method1319(arg3.anInt1581), Static92.aClass5_1083 });
		} else {
			local65 = Static75.method1261(new Class5[] { arg3.aClass5_765, Static112.aClass5_1326, Static88.aClass5_1023, Static96.method1319(arg3.anInt1583), Static92.aClass5_1083 });
		}
		@Pc(170) int local170;
		if (Static14.anInt2886 == 1) {
			Static4.method129(arg0, Static68.aClass5_762, arg2, Static75.method1261(new Class5[] { Static85.aClass5_967, Static102.aClass5_1190, local65 }), arg1, 58);
		} else if (!Static100.aBoolean124) {
			for (local170 = 4; local170 >= 0; local170--) {
				if (Static116.aClass5Array19[local170] != null) {
					@Pc(178) short local178 = 0;
					@Pc(180) int local180 = 0;
					if (Static116.aClass5Array19[local170].method171(Static94.aClass5_265)) {
						if (arg3.anInt1581 > Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1581) {
							local178 = 2000;
						}
						if (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1602 != 0 && arg3.anInt1602 != 0) {
							if (arg3.anInt1602 == Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1602) {
								local178 = 2000;
							} else {
								local178 = 0;
							}
						}
					} else if (Static21.aBooleanArray7[local170]) {
						local178 = 2000;
					}
					if (local170 == 0) {
						local180 = local178 + 44;
					}
					if (local170 == 1) {
						local180 = local178 + 22;
					}
					if (local170 == 2) {
						local180 = local178 + 52;
					}
					if (local170 == 3) {
						local180 = local178 + 56;
					}
					if (local170 == 4) {
						local180 = local178 + 1;
					}
					Static4.method129(arg0, Static116.aClass5Array19[local170], arg2, Static75.method1261(new Class5[] { Static36.aClass5_1258, local65 }), arg1, local180);
				}
			}
		} else if ((Static62.anInt1672 & 0x8) == 8) {
			Static4.method129(arg0, Static16.aClass5_274, arg2, Static75.method1261(new Class5[] { Static15.aClass5_210, Static102.aClass5_1190, local65 }), arg1, 7);
		}
		for (local170 = 0; local170 < Static75.anInt1934; local170++) {
			if (Static52.anIntArray162[local170] == 33) {
				Static49.aClass5Array9[local170] = Static75.method1261(new Class5[] { Static45.aClass5_603, Static91.aClass5_1066, Static36.aClass5_1258, local65 });
				return;
			}
		}
	}
}
