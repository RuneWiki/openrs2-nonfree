import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
	public static int anInt2093;

	@OriginalMember(owner = "client!mb", name = "Ab", descriptor = "Lclient!ua;")
	public static Class59 aClass59_3;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "Lclient!fe;")
	public static Class17 aClass17_78 = new Class17(64);

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_737 = Static56.method1206("backvmid3");

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
	public static int anInt2099 = 0;

	@OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
	public static int anInt2102 = 0;

	@OriginalMember(owner = "client!mb", name = "rb", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!mb", name = "yb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_738 = Static56.method1206(" with @whi@");

	@OriginalMember(owner = "client!mb", name = "zb", descriptor = "[[I")
	public static int[][] anIntArrayArray58 = new int[104][104];

	@OriginalMember(owner = "client!mb", name = "Bb", descriptor = "I")
	public static int anInt2107 = 0;

	@OriginalMember(owner = "client!mb", name = "Cb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_739 = Static56.method1206("Welcome to RuneScape");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method1301() {
		Static50.method343(false);
		Static51.anInt1779 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(18) int local18 = 0; local18 < Static54.aByteArrayArray9.length; local18++) {
			if (Static55.anIntArray275[local18] != -1 && Static54.aByteArrayArray9[local18] == null) {
				Static54.aByteArrayArray9[local18] = Static89.aClass11_Sub1_14.method338(Static55.anIntArray275[local18], 0);
				if (Static54.aByteArrayArray9[local18] == null) {
					Static51.anInt1779++;
					local12 = false;
				}
			}
			if (Static79.anIntArray323[local18] != -1 && Static15.aByteArrayArray5[local18] == null) {
				Static15.aByteArrayArray5[local18] = Static89.aClass11_Sub1_14.method326(Static79.anIntArray323[local18], 0, Static21.anIntArrayArray27[local18]);
				if (Static15.aByteArrayArray5[local18] == null) {
					Static51.anInt1779++;
					local12 = false;
				}
			}
		}
		if (!local12) {
			Static65.anInt2169 = 1;
			return;
		}
		local12 = true;
		Static95.anInt2563 = 0;
		@Pc(121) int local121;
		@Pc(131) int local131;
		for (@Pc(103) int local103 = 0; local103 < Static54.aByteArrayArray9.length; local103++) {
			@Pc(109) byte[] local109 = Static15.aByteArrayArray5[local103];
			if (local109 != null) {
				local121 = (Static13.anIntArray81[local103] >> 8) * 64 - Static25.anInt1103;
				local131 = (Static13.anIntArray81[local103] & 0xFF) * 64 - Static47.anInt1730;
				if (Static59.aBoolean103) {
					local131 = 10;
					local121 = 10;
				}
				local12 &= Static45.method1069(local121, local109, local131);
			}
		}
		if (!local12) {
			Static65.anInt2169 = 2;
			return;
		}
		if (Static65.anInt2169 != 0) {
			Static59.method1283(true, Static40.aClass31_712, Static3.aClass31_51);
		}
		Static51.method1131();
		Static99.aClass64_1.method1782();
		System.gc();
		for (@Pc(172) int local172 = 0; local172 < 4; local172++) {
			Static77.aClass60Array1[local172].method1722();
		}
		@Pc(193) int local193;
		for (local121 = 0; local121 < 4; local121++) {
			for (local131 = 0; local131 < 104; local131++) {
				for (local193 = 0; local193 < 104; local193++) {
					Static34.aByteArrayArrayArray17[local121][local131][local193] = 0;
				}
			}
		}
		Static50.method327();
		local131 = Static54.aByteArrayArray9.length;
		Static50.method343(true);
		@Pc(244) int local244;
		@Pc(255) int local255;
		@Pc(373) int local373;
		@Pc(317) int local317;
		@Pc(362) int local362;
		if (!Static59.aBoolean103) {
			@Pc(259) byte[] local259;
			for (local193 = 0; local193 < local131; local193++) {
				local244 = (Static13.anIntArray81[local193] >> 8) * 64 - Static25.anInt1103;
				local255 = (Static13.anIntArray81[local193] & 0xFF) * 64 - Static47.anInt1730;
				local259 = Static54.aByteArrayArray9[local193];
				if (local259 != null) {
					Static62.method1316(local255, local259, Static77.aClass60Array1, (Static76.anInt2252 - 6) * 8, (Static103.anInt2767 - 6) * 8, local244);
				}
			}
			for (local244 = 0; local244 < local131; local244++) {
				@Pc(295) byte[] local295 = Static54.aByteArrayArray9[local244];
				local255 = (Static13.anIntArray81[local244] >> 8) * 64 - Static25.anInt1103;
				local317 = (Static13.anIntArray81[local244] & 0xFF) * 64 - Static47.anInt1730;
				if (local295 == null && Static76.anInt2252 < 800) {
					Static12.method366(64, 64, local255, local317);
				}
			}
			Static50.method343(true);
			for (local255 = 0; local255 < local131; local255++) {
				local259 = Static15.aByteArrayArray5[local255];
				if (local259 != null) {
					local362 = (Static13.anIntArray81[local255] >> 8) * 64 - Static25.anInt1103;
					local373 = (Static13.anIntArray81[local255] & 0xFF) * 64 - Static47.anInt1730;
					Static17.method527(Static99.aClass64_1, local373, local362, Static77.aClass60Array1, local259);
				}
			}
		}
		@Pc(424) int local424;
		@Pc(430) int local430;
		if (Static59.aBoolean103) {
			@Pc(436) int local436;
			@Pc(446) int local446;
			@Pc(448) int local448;
			for (local193 = 0; local193 < 4; local193++) {
				for (local244 = 0; local244 < 13; local244++) {
					for (local255 = 0; local255 < 13; local255++) {
						@Pc(400) boolean local400 = false;
						local362 = Static58.anIntArrayArrayArray2[local193][local244][local255];
						if (local362 != -1) {
							local373 = local362 >> 24 & 0x3;
							local424 = local362 >> 1 & 0x3;
							local430 = local362 >> 14 & 0x3FF;
							local436 = local362 >> 3 & 0x7FF;
							local446 = local436 / 8 + (local430 / 8 << 8);
							for (local448 = 0; local448 < Static13.anIntArray81.length; local448++) {
								if (local446 == Static13.anIntArray81[local448] && Static54.aByteArrayArray9[local448] != null) {
									Static39.method1005(local424, local244 * 8, local255 * 8, Static77.aClass60Array1, (local436 & 0x7) * 8, (local430 & 0x7) * 8, local373, Static54.aByteArrayArray9[local448], local193);
									local400 = true;
									break;
								}
							}
						}
						if (!local400) {
							Static5.method113(local193, local255 * 8, local244 * 8);
						}
					}
				}
			}
			for (local244 = 0; local244 < 13; local244++) {
				for (local255 = 0; local255 < 13; local255++) {
					local317 = Static58.anIntArrayArrayArray2[0][local244][local255];
					if (local317 == -1) {
						Static12.method366(8, 8, local244 * 8, local255 * 8);
					}
				}
			}
			Static50.method343(true);
			for (local255 = 0; local255 < 4; local255++) {
				for (local317 = 0; local317 < 13; local317++) {
					for (local362 = 0; local362 < 13; local362++) {
						local373 = Static58.anIntArrayArrayArray2[local255][local317][local362];
						if (local373 != -1) {
							local424 = local373 >> 24 & 0x3;
							local436 = local373 >> 14 & 0x3FF;
							local430 = local373 >> 1 & 0x3;
							local446 = local373 >> 3 & 0x7FF;
							local448 = (local436 / 8 << 8) + (local446 / 8);
							for (@Pc(627) int local627 = 0; local627 < Static13.anIntArray81.length; local627++) {
								if (local448 == Static13.anIntArray81[local627] && Static15.aByteArrayArray5[local627] != null) {
									Static24.method721(Static15.aByteArrayArray5[local627], local317 * 8, local424, local362 * 8, local430, Static77.aClass60Array1, (local446 & 0x7) * 8, local255, (local436 & 0x7) * 8, Static99.aClass64_1);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static50.method343(true);
		Static51.method1131();
		Static20.method1266(Static99.aClass64_1, Static77.aClass60Array1);
		Static50.method343(true);
		local193 = Static76.anInt2263;
		if (Static58.anInt1945 < local193) {
			local193 = Static58.anInt1945;
		}
		if (local193 < Static58.anInt1945 - 1) {
		}
		if (Static10.aBoolean28) {
			Static99.aClass64_1.method1776(Static76.anInt2263);
		} else {
			Static99.aClass64_1.method1776(0);
		}
		for (local244 = 0; local244 < 104; local244++) {
			for (local255 = 0; local255 < 104; local255++) {
				Static67.method1355(local255, local244);
			}
		}
		Static37.method977();
		Static5.aClass17_9.method782();
		if (Static38.aCanvas_Sub1_1 != null) {
			Static20.aClass2_Sub6_Sub1_11.method684(153);
			Static20.aClass2_Sub6_Sub1_11.method666(1057001181);
		}
		if (!Static59.aBoolean103) {
			local255 = (Static103.anInt2767 - 6) / 8;
			local317 = (Static103.anInt2767 + 6) / 8;
			local373 = (Static76.anInt2252 + 6) / 8;
			local362 = (Static76.anInt2252 - 6) / 8;
			for (local424 = local255 - 1; local424 <= local317 + 1; local424++) {
				for (local430 = local362 - 1; local430 <= local373 + 1; local430++) {
					if (local424 < local255 || local317 < local424 || local362 > local430 || local430 > local373) {
						Static89.aClass11_Sub1_14.method342(Static37.method974(new Class31[] { Static63.aClass31_744, Static89.method1499(local424), Static20.aClass31_705, Static89.method1499(local430) }));
						Static89.aClass11_Sub1_14.method342(Static37.method974(new Class31[] { Static42.aClass31_572, Static89.method1499(local424), Static20.aClass31_705, Static89.method1499(local430) }));
					}
				}
			}
		}
		if (Static16.anInt773 == -1) {
			Static75.method1404(30);
		} else {
			Static75.method1404(35);
		}
		Static19.method559();
		Static20.aClass2_Sub6_Sub1_11.method684(91);
		Static65.method1344();
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public static void method1303() {
		@Pc(25) int local25;
		if (Static106.anInt2789 == 0) {
			Static99.aClass64_1 = new Class64(4, 104, 104, Static16.anIntArrayArrayArray1);
			for (local25 = 0; local25 < 4; local25++) {
				Static77.aClass60Array1[local25] = new Class60(104, 104);
			}
			Static100.aClass2_Sub1_Sub3_Sub2_7 = new Class2_Sub1_Sub3_Sub2(512, 512);
			Static106.anInt2789 = 20;
			Static18.anInt802 = 5;
			Static79.aClass31_798 = Static76.aClass31_788;
			return;
		}
		@Pc(64) int local64;
		@Pc(74) int local74;
		@Pc(81) int local81;
		@Pc(85) int local85;
		if (Static106.anInt2789 == 20) {
			@Pc(62) int[] local62 = new int[9];
			for (local64 = 0; local64 < 9; local64++) {
				local74 = local64 * 32 + 15 + 128;
				local81 = local74 * 3 + 600;
				local85 = Class2_Sub1_Sub3_Sub4.anIntArray379[local74];
				local62[local64] = local85 * local81 >> 16;
			}
			Static107.method1792(local62);
			Static18.anInt802 = 10;
			Static106.anInt2789 = 25;
			Static79.aClass31_798 = Static15.aClass31_196;
			return;
		}
		try {
			if (Static106.anInt2789 == 25) {
				if (Static21.aClass61_1 != null && Static88.aClass61_4 != null && Static88.aClass61_4.method1741() < 60000L) {
					Static43.aClass25Array2 = new Class25[5];
					for (local25 = 0; local25 < 5; local25++) {
						Static43.aClass25Array2[local25] = new Class25(local25 + 1, Static21.aClass61_1, Static69.aClass61Array2[local25], 500000);
					}
					Static37.aClass25Array1 = new Class25[12];
					for (local64 = 0; local64 < 12; local64++) {
						Static37.aClass25Array1[local64] = new Class25(local64, Static88.aClass61_4, Static28.aClass61Array1[local64], 500000);
					}
					Static79.aClass31_798 = Static57.aClass31_924;
					Static30.anInt1247 = 0;
					Static18.anInt802 = 15;
					Static106.anInt2789 = 26;
					return;
				}
				Static106.anInt2789 = 30;
				Static18.anInt802 = 15;
				Static79.aClass31_798 = Static101.aClass31_942;
				return;
			}
			if (Static106.anInt2789 == 26) {
				while (Static30.anInt1247 < 65535) {
					Static38.method988(Static43.aClass25Array2[1], Static30.anInt1247++, Static37.aClass25Array1[7]);
					if ((Static30.anInt1247 & 0xFF) == 0) {
						Static79.aClass31_798 = Static37.method974(new Class31[] { Static14.aClass31_192, Static89.method1499(Static30.anInt1247 * 100 / 65536), Static102.aClass31_216 });
						Static18.anInt802 = 15;
						return;
					}
				}
				Static106.anInt2789 = 27;
				Static18.anInt802 = 15;
				Static79.aClass31_798 = Static15.aClass31_197;
				Static30.anInt1247 = 0;
				return;
			}
			if (Static106.anInt2789 == 27) {
				while (Static30.anInt1247 < 65535) {
					Static38.method988(Static43.aClass25Array2[3], Static30.anInt1247++, Static37.aClass25Array1[6]);
					if ((Static30.anInt1247 & 0xFF) == 0) {
						Static79.aClass31_798 = Static37.method974(new Class31[] { Static40.aClass31_709, Static89.method1499(Static30.anInt1247 * 100 / 65536), Static102.aClass31_216 });
						Static18.anInt802 = 15;
						return;
					}
				}
				Static18.anInt802 = 15;
				Static30.anInt1247 = 0;
				Static79.aClass31_798 = Static34.aClass31_448;
				Static106.anInt2789 = 28;
				return;
			}
			if (Static106.anInt2789 == 28) {
				while (Static30.anInt1247 < 65535) {
					Static38.method988(Static43.aClass25Array2[4], Static30.anInt1247++, Static37.aClass25Array1[5]);
					if ((Static30.anInt1247 & 0xFF) == 0) {
						Static79.aClass31_798 = Static37.method974(new Class31[] { Static58.aClass31_684, Static89.method1499(Static30.anInt1247 * 100 / 65536), Static102.aClass31_216 });
						Static18.anInt802 = 15;
						return;
					}
				}
				Static18.anInt802 = 15;
				Static79.aClass31_798 = Static54.aClass31_646;
				Static106.anInt2789 = 30;
				return;
			}
		} catch (@Pc(383) Exception local383) {
			if (Static106.anInt2789 < 30) {
				Static106.anInt2789 = 30;
			}
		}
		if (Static106.anInt2789 == 30) {
			Static89.aClass11_Sub1_15 = Static55.method1190(false, 0, true);
			Static64.aClass11_Sub1_3 = Static55.method1190(false, 1, true);
			Static80.aClass11_Sub1_6 = Static55.method1190(true, 2, false);
			Static33.aClass11_Sub1_9 = Static55.method1190(false, 3, true);
			Static55.aClass11_Sub1_12 = Static55.method1190(false, 4, true);
			Static89.aClass11_Sub1_14 = Static55.method1190(true, 5, true);
			Static21.aClass11_Sub1_7 = Static55.method1190(true, 6, true);
			Static68.aClass11_Sub1_13 = Static55.method1190(false, 7, true);
			Static11.aClass11_Sub1_1 = Static55.method1190(false, 8, true);
			Static54.aClass11_Sub1_11 = Static55.method1190(false, 9, true);
			Static37.aClass11_Sub1_10 = Static55.method1190(false, 10, true);
			Static27.aClass11_Sub1_8 = Static55.method1190(false, 11, true);
			Static18.anInt802 = 20;
			Static79.aClass31_798 = Static42.aClass31_573;
			Static78.method1428(null, Static79.aClass31_798, Static18.anInt802);
			Static106.anInt2789 = 40;
		} else if (Static106.anInt2789 == 40) {
			local25 = Static89.aClass11_Sub1_15.method361() * 5 / 100;
			local25 += Static64.aClass11_Sub1_3.method361() * 5 / 100;
			local25 += Static80.aClass11_Sub1_6.method361() * 5 / 100;
			local25 += Static33.aClass11_Sub1_9.method361() * 5 / 100;
			local25 += Static55.aClass11_Sub1_12.method361() * 5 / 100;
			local25 += Static89.aClass11_Sub1_14.method361() * 5 / 100;
			local25 += Static21.aClass11_Sub1_7.method361() * 5 / 100;
			local25 += Static68.aClass11_Sub1_13.method361() * 45 / 100;
			local25 += Static11.aClass11_Sub1_1.method361() * 5 / 100;
			local25 += Static54.aClass11_Sub1_11.method361() * 5 / 100;
			local25 += Static37.aClass11_Sub1_10.method361() * 5 / 100;
			local25 += Static27.aClass11_Sub1_8.method361() * 5 / 100;
			if (local25 == 100) {
				Static80.aClass11_Sub1_6.method362(true);
				Static89.aClass11_Sub1_15.method362(false);
				Static64.aClass11_Sub1_3.method362(false);
				Static33.aClass11_Sub1_9.method362(false);
				Static55.aClass11_Sub1_12.method362(false);
				Static89.aClass11_Sub1_14.method362(false);
				Static68.aClass11_Sub1_13.method362(false);
				Static11.aClass11_Sub1_1.method362(false);
				Static54.aClass11_Sub1_11.method362(false);
				Static37.aClass11_Sub1_10.method362(false);
				Static27.aClass11_Sub1_8.method362(false);
				Static79.aClass31_798 = Static74.aClass31_777;
				Static18.anInt802 = 30;
				Static106.anInt2789 = 45;
			} else {
				Static79.aClass31_798 = Static37.method974(new Class31[] { Static90.aClass31_843, Static89.method1499(local25), Static102.aClass31_216 });
				Static18.anInt802 = 30;
			}
		} else if (Static106.anInt2789 == 45) {
			Static41.method1052(Static51.aClass51_2);
			Static46.aClass2_Sub8_Sub1_1 = Static88.method1489(Static51.aClass51_2, Static70.method1381());
			Static43.aClass44_1 = new Class44(22050, Static27.anInt1162);
			Static18.anInt802 = 35;
			Static79.aClass31_798 = Static40.aClass31_707;
			Static106.anInt2789 = 50;
		} else if (Static106.anInt2789 == 50) {
			local25 = 0;
			if (Static28.aClass2_Sub1_Sub3_Sub3_3 == null) {
				Static28.aClass2_Sub1_Sub3_Sub3_3 = Static83.method1459(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static31.aClass31_441);
			} else {
				local25++;
			}
			if (Static98.aClass2_Sub1_Sub3_Sub3_4 == null) {
				Static98.aClass2_Sub1_Sub3_Sub3_4 = Static83.method1459(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static105.aClass31_951);
			} else {
				local25++;
			}
			if (Static69.aClass2_Sub1_Sub3_Sub3_5 == null) {
				Static69.aClass2_Sub1_Sub3_Sub3_5 = Static83.method1459(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static60.aClass31_721);
			} else {
				local25++;
			}
			if (Static88.aClass2_Sub1_Sub3_Sub3_6 == null) {
				Static88.aClass2_Sub1_Sub3_Sub3_6 = Static83.method1459(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static79.aClass31_795);
			} else {
				local25++;
			}
			if (local25 < 4) {
				Static79.aClass31_798 = Static37.method974(new Class31[] { Static16.aClass31_249, Static89.method1499(local25 * 100 / 4), Static102.aClass31_216 });
				Static18.anInt802 = 40;
			} else {
				Static79.aClass31_798 = Static74.aClass31_779;
				Static106.anInt2789 = 60;
				Static18.anInt802 = 40;
				Static11.aClass2_Sub1_Sub3_Sub3Array1 = new Class2_Sub1_Sub3_Sub3[] { Static28.aClass2_Sub1_Sub3_Sub3_3, Static98.aClass2_Sub1_Sub3_Sub3_4, Static69.aClass2_Sub1_Sub3_Sub3_5, Static88.aClass2_Sub1_Sub3_Sub3_6 };
			}
		} else if (Static106.anInt2789 == 60) {
			local25 = Static45.method1066(Static37.aClass11_Sub1_10, Static11.aClass11_Sub1_1);
			local64 = Static16.method510();
			if (local64 > local25) {
				Static79.aClass31_798 = Static37.method974(new Class31[] { Static24.aClass31_344, Static89.method1499(local25 * 100 / local64), Static102.aClass31_216 });
				Static18.anInt802 = 50;
			} else {
				Static79.aClass31_798 = Static27.aClass31_383;
				Static18.anInt802 = 50;
				Static75.method1404(5);
				Static106.anInt2789 = 70;
			}
		} else if (Static106.anInt2789 == 70) {
			if (Static80.aClass11_Sub1_6.method340()) {
				Static68.method1372(Static80.aClass11_Sub1_6);
				Static93.method1578(Static80.aClass11_Sub1_6);
				Static91.method1542(Static68.aClass11_Sub1_13, Static80.aClass11_Sub1_6);
				Static56.method1224(Static10.aBoolean28, Static68.aClass11_Sub1_13, Static80.aClass11_Sub1_6);
				Static92.method1042(Static68.aClass11_Sub1_13, Static80.aClass11_Sub1_6);
				Static68.method1371(Static80.aClass11_Sub1_6, Static68.aClass11_Sub1_13, Static62.aBoolean108);
				Static45.method1068(Static80.aClass11_Sub1_6, Static89.aClass11_Sub1_15, Static64.aClass11_Sub1_3);
				Static21.method688(Static80.aClass11_Sub1_6, Static68.aClass11_Sub1_13);
				Static105.method1746(Static80.aClass11_Sub1_6);
				Static13.method376(Static80.aClass11_Sub1_6);
				Static72.method859(Static33.aClass11_Sub1_9, Static11.aClass11_Sub1_1, Static68.aClass11_Sub1_13);
				Static18.anInt802 = 60;
				Static79.aClass31_798 = Static89.aClass31_827;
				Static106.anInt2789 = 80;
			} else {
				Static79.aClass31_798 = Static37.method974(new Class31[] { Static72.aClass31_442, Static89.method1499(Static80.aClass11_Sub1_6.method356()), Static102.aClass31_216 });
				Static18.anInt802 = 60;
			}
		} else if (Static106.anInt2789 == 80) {
			local25 = 0;
			if (Static16.aClass2_Sub1_Sub3_Sub2_3 == null) {
				Static16.aClass2_Sub1_Sub3_Sub2_3 = Static45.method1065(Static11.aClass11_Sub1_1, Static45.aClass31_585, Static39.aClass31_531);
			} else {
				local25++;
			}
			if (Static37.aClass2_Sub1_Sub3_Sub2_4 == null) {
				Static37.aClass2_Sub1_Sub3_Sub2_4 = Static45.method1065(Static11.aClass11_Sub1_1, Static11.aClass31_167, Static39.aClass31_531);
			} else {
				local25++;
			}
			if (Static51.aClass2_Sub1_Sub3_Sub1Array2 == null) {
				Static51.aClass2_Sub1_Sub3_Sub1Array2 = Static50.method337(Static39.aClass31_531, Static9.aClass31_119, Static11.aClass11_Sub1_1);
			} else {
				local25++;
			}
			if (Static44.aClass2_Sub1_Sub3_Sub2Array6 == null) {
				Static44.aClass2_Sub1_Sub3_Sub2Array6 = Static91.method1537(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static65.aClass31_761);
			} else {
				local25++;
			}
			if (Static11.aClass2_Sub1_Sub3_Sub2Array3 == null) {
				Static11.aClass2_Sub1_Sub3_Sub2Array3 = Static91.method1537(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static11.aClass31_165);
			} else {
				local25++;
			}
			if (Static42.aClass2_Sub1_Sub3_Sub2Array5 == null) {
				Static42.aClass2_Sub1_Sub3_Sub2Array5 = Static91.method1537(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static59.aClass31_718);
			} else {
				local25++;
			}
			if (Static56.aClass2_Sub1_Sub3_Sub2Array7 == null) {
				Static56.aClass2_Sub1_Sub3_Sub2Array7 = Static91.method1537(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static51.aClass31_635);
			} else {
				local25++;
			}
			if (Static39.aClass2_Sub1_Sub3_Sub2Array4 == null) {
				Static39.aClass2_Sub1_Sub3_Sub2Array4 = Static91.method1537(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static17.aClass31_261);
			} else {
				local25++;
			}
			if (Static39.aClass2_Sub1_Sub3_Sub2_5 == null) {
				Static39.aClass2_Sub1_Sub3_Sub2_5 = Static45.method1065(Static11.aClass11_Sub1_1, Static80.aClass31_310, Static39.aClass31_531);
			} else {
				local25++;
			}
			if (Static79.aClass2_Sub1_Sub3_Sub2Array9 == null) {
				Static79.aClass2_Sub1_Sub3_Sub2Array9 = Static91.method1537(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static74.aClass31_780);
			} else {
				local25++;
			}
			if (Static8.aClass2_Sub1_Sub3_Sub2Array1 == null) {
				Static8.aClass2_Sub1_Sub3_Sub2Array1 = Static91.method1537(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static40.aClass31_710);
			} else {
				local25++;
			}
			if (Static10.aClass2_Sub1_Sub3_Sub2Array2 == null) {
				Static10.aClass2_Sub1_Sub3_Sub2Array2 = Static91.method1537(Static11.aClass11_Sub1_1, Static39.aClass31_531, Static54.aClass31_648);
			} else {
				local25++;
			}
			if (Static101.aClass2_Sub1_Sub3_Sub1Array5 == null) {
				Static101.aClass2_Sub1_Sub3_Sub1Array5 = Static50.method337(Static39.aClass31_531, Static101.aClass31_941, Static11.aClass11_Sub1_1);
			} else {
				local25++;
			}
			if (Static56.aClass2_Sub1_Sub3_Sub1Array3 == null) {
				Static56.aClass2_Sub1_Sub3_Sub1Array3 = Static50.method337(Static39.aClass31_531, Static67.aClass31_765, Static11.aClass11_Sub1_1);
			} else {
				local25++;
			}
			if (local25 < 14) {
				Static79.aClass31_798 = Static37.method974(new Class31[] { Static80.aClass31_312, Static89.method1499(local25 * 100 / 14), Static102.aClass31_216 });
				Static18.anInt802 = 70;
			} else {
				local74 = (int) (Math.random() * 21.0D) - 10;
				Static37.aClass2_Sub1_Sub3_Sub2_4.method464();
				local81 = (int) (Math.random() * 21.0D) - 10;
				local64 = (int) (Math.random() * 21.0D) - 10;
				local85 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(1194) int local1194 = 0; local1194 < Static44.aClass2_Sub1_Sub3_Sub2Array6.length; local1194++) {
					Static44.aClass2_Sub1_Sub3_Sub2Array6[local1194].method459(local85 + local64, local85 + local74, local85 + local81);
				}
				Static51.aClass2_Sub1_Sub3_Sub1Array2[0].method294(local85 + local64, local85 + local74, local85 + local81);
				Static106.anInt2789 = 85;
				Static18.anInt802 = 70;
				Static79.aClass31_798 = Static92.aClass31_568;
			}
		} else if (Static106.anInt2789 == 85) {
			local25 = Static78.method1430(Static11.aClass11_Sub1_1);
			local64 = Static64.method414();
			if (local25 < local64) {
				Static79.aClass31_798 = Static37.method974(new Class31[] { Static57.aClass31_927, Static89.method1499(local25 * 100 / local64), Static102.aClass31_216 });
				Static18.anInt802 = 80;
			} else {
				Static79.aClass31_798 = Static49.aClass31_934;
				Static18.anInt802 = 80;
				Static106.anInt2789 = 90;
			}
		} else if (Static106.anInt2789 == 90) {
			if (Static54.aClass11_Sub1_11.method340()) {
				@Pc(1334) Class45 local1334 = new Class45(Static54.aClass11_Sub1_11, Static11.aClass11_Sub1_1, 20, 0.8D, Static10.aBoolean28 ? 64 : 128);
				Static97.method1648(local1334);
				Static97.method1651(0.8D);
				Static79.aClass31_798 = Static24.aClass31_341;
				Static106.anInt2789 = 110;
				Static18.anInt802 = 90;
			} else {
				Static79.aClass31_798 = Static37.method974(new Class31[] { Static12.aClass31_170, Static89.method1499(Static54.aClass11_Sub1_11.method356()), Static102.aClass31_216 });
				Static18.anInt802 = 90;
			}
		} else if (Static106.anInt2789 == 110) {
			Static14.aClass48_1 = new Class48();
			Static51.aClass51_2.method1467(10, Static14.aClass48_1);
			Static18.anInt802 = 94;
			Static106.anInt2789 = 120;
			Static79.aClass31_798 = Static93.aClass31_871;
		} else if (Static106.anInt2789 == 120) {
			if (Static37.aClass11_Sub1_10.method330(Static38.aClass31_516, Static39.aClass31_531)) {
				@Pc(1390) Class42 local1390 = new Class42(Static37.aClass11_Sub1_10.method333(Static39.aClass31_531, Static38.aClass31_516));
				Static58.method1249(local1390);
				Static18.anInt802 = 96;
				Static79.aClass31_798 = Static53.aClass31_636;
				Static106.anInt2789 = 130;
			} else {
				Static79.aClass31_798 = Static56.aClass31_667;
				Static18.anInt802 = 96;
			}
		} else if (Static106.anInt2789 == 130) {
			if (Static33.aClass11_Sub1_9.method340()) {
				Static106.anInt2789 = 140;
				Static18.anInt802 = 100;
				Static79.aClass31_798 = Static30.aClass31_429;
			} else {
				Static79.aClass31_798 = Static37.method974(new Class31[] { Static39.aClass31_539, Static89.method1499(Static33.aClass11_Sub1_9.method356()), Static102.aClass31_216 });
				Static18.anInt802 = 100;
			}
		} else if (Static106.anInt2789 == 140) {
			Static75.method1404(10);
			Static82.aBoolean120 = true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
	public static void method1307() {
		aClass17_78 = null;
		aClass59_3 = null;
		aClass31_738 = null;
		aClass31_739 = null;
		aClass31_737 = null;
		anIntArrayArray58 = null;
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
	public static void method1308() {
		Static3.aClass2_Sub6_Sub1_1.method681();
		@Pc(7) int local7 = Static3.aClass2_Sub6_Sub1_1.method687(1);
		if (local7 == 0) {
			return;
		}
		@Pc(21) int local21 = Static3.aClass2_Sub6_Sub1_1.method687(2);
		if (local21 == 0) {
			Static91.anIntArray352[Static64.anInt624++] = 2047;
			return;
		}
		@Pc(47) int local47;
		@Pc(57) int local57;
		if (local21 == 1) {
			local47 = Static3.aClass2_Sub6_Sub1_1.method687(3);
			Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.method1267(false, local47);
			local57 = Static3.aClass2_Sub6_Sub1_1.method687(1);
			if (local57 == 1) {
				Static91.anIntArray352[Static64.anInt624++] = 2047;
			}
			return;
		}
		@Pc(105) int local105;
		if (local21 == 2) {
			local47 = Static3.aClass2_Sub6_Sub1_1.method687(3);
			Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.method1267(true, local47);
			local57 = Static3.aClass2_Sub6_Sub1_1.method687(3);
			Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.method1267(true, local57);
			local105 = Static3.aClass2_Sub6_Sub1_1.method687(1);
			if (local105 == 1) {
				Static91.anIntArray352[Static64.anInt624++] = 2047;
			}
		} else if (local21 == 3) {
			local47 = Static3.aClass2_Sub6_Sub1_1.method687(7);
			Static58.anInt1945 = Static3.aClass2_Sub6_Sub1_1.method687(2);
			local57 = Static3.aClass2_Sub6_Sub1_1.method687(1);
			if (local57 == 1) {
				Static91.anIntArray352[Static64.anInt624++] = 2047;
			}
			local105 = Static3.aClass2_Sub6_Sub1_1.method687(1);
			@Pc(158) int local158 = Static3.aClass2_Sub6_Sub1_1.method687(7);
			Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.method1278(local105 == 1, local47, local158);
		}
	}
}
