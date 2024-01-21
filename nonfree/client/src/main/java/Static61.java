import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!gf", name = "od", descriptor = "Lclient!th;")
	public static Class2_Sub4_Sub3_Sub2_Sub1 aClass2_Sub4_Sub3_Sub2_Sub1_3;

	@OriginalMember(owner = "client!gf", name = "cd", descriptor = "Lclient!gg;")
	public static Class28 aClass28_952 = null;

	@OriginalMember(owner = "client!gf", name = "hd", descriptor = "I")
	public static int anInt1659 = 0;

	@OriginalMember(owner = "client!gf", name = "id", descriptor = "Lclient!gg;")
	public static Class28 aClass28_954 = null;

	@OriginalMember(owner = "client!gf", name = "md", descriptor = "Lclient!gg;")
	private static Class28 aClass28_955 = Static107.method1838("Connection timed out)3");

	@OriginalMember(owner = "client!gf", name = "td", descriptor = "[I")
	public static int[] anIntArray143 = new int[25];

	@OriginalMember(owner = "client!gf", name = "ud", descriptor = "Lclient!gg;")
	public static Class28 aClass28_956 = aClass28_955;

	@OriginalMember(owner = "client!gf", name = "vd", descriptor = "I")
	public static int anInt1667 = 0;

	@OriginalMember(owner = "client!gf", name = "Gd", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
	public static void method1102() {
		aClass28_952 = null;
		anIntArray143 = null;
		aClass2_Sub4_Sub3_Sub2_Sub1_3 = null;
		aClass28_955 = null;
		aClass28_956 = null;
		aClass28_954 = null;
	}

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "(I)V")
	public static void method1104() {
		Static135.method2137(false);
		Static129.anInt3028 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static52.aByteArrayArray2.length; local14++) {
			if (Static33.anIntArray72[local14] != -1 && Static52.aByteArrayArray2[local14] == null) {
				Static52.aByteArrayArray2[local14] = Static47.aClass40_Sub1_49.method1771(Static33.anIntArray72[local14], 0);
				if (Static52.aByteArrayArray2[local14] == null) {
					Static129.anInt3028++;
					local12 = false;
				}
			}
			if (Static168.anIntArray352[local14] != -1 && Static125.aByteArrayArray6[local14] == null) {
				Static125.aByteArrayArray6[local14] = Static47.aClass40_Sub1_49.method1773(Static168.anIntArray352[local14], Static110.anIntArrayArray25[local14], 0);
				if (Static125.aByteArrayArray6[local14] == null) {
					local12 = false;
					Static129.anInt3028++;
				}
			}
		}
		if (!local12) {
			Static26.anInt817 = 1;
			return;
		}
		Static14.anInt601 = 0;
		local12 = true;
		@Pc(116) int local116;
		@Pc(127) int local127;
		for (@Pc(97) int local97 = 0; local97 < Static52.aByteArrayArray2.length; local97++) {
			@Pc(103) byte[] local103 = Static125.aByteArrayArray6[local97];
			if (local103 != null) {
				local116 = (Static164.anIntArray337[local97] >> 8) * 64 - Static3.anInt2434;
				local127 = (Static164.anIntArray337[local97] & 0xFF) * 64 - Static39.anInt1055;
				if (Static79.aBoolean100) {
					local116 = 10;
					local127 = 10;
				}
				local12 &= Static146.method2283(local116, local127, local103);
			}
		}
		if (!local12) {
			Static26.anInt817 = 2;
			return;
		}
		if (Static26.anInt817 != 0) {
			Static59.method1061(true, Static83.method1481(new Class28[] { Static11.aClass28_367, Static75.aClass28_1153 }));
		}
		Static177.method2757();
		Static48.method901();
		Static177.method2757();
		Static153.method2370();
		Static177.method2757();
		System.gc();
		for (@Pc(187) int local187 = 0; local187 < 4; local187++) {
			Static141.aClass36Array1[local187].method1374();
		}
		@Pc(208) int local208;
		for (local116 = 0; local116 < 4; local116++) {
			for (local127 = 0; local127 < 104; local127++) {
				for (local208 = 0; local208 < 104; local208++) {
					Static49.aByteArrayArrayArray4[local116][local127][local208] = 0;
				}
			}
		}
		Static177.method2757();
		Static10.method321();
		local127 = Static52.aByteArrayArray2.length;
		Static114.method1903();
		Static135.method2137(true);
		@Pc(263) int local263;
		@Pc(273) int local273;
		@Pc(383) int local383;
		@Pc(330) int local330;
		@Pc(393) int local393;
		if (!Static79.aBoolean100) {
			@Pc(277) byte[] local277;
			for (local208 = 0; local208 < local127; local208++) {
				local263 = (Static164.anIntArray337[local208] >> 8) * 64 - Static3.anInt2434;
				local273 = (Static164.anIntArray337[local208] & 0xFF) * 64 - Static39.anInt1055;
				local277 = Static52.aByteArrayArray2[local208];
				if (local277 != null) {
					Static177.method2757();
					Static164.method2547(local277, local273, Static127.anInt3016 * 8 - 48, local263, Static142.anInt3243 * 8 - 48, Static141.aClass36Array1);
				}
			}
			for (local263 = 0; local263 < local127; local263++) {
				local273 = (Static164.anIntArray337[local263] >> 8) * 64 - Static3.anInt2434;
				local330 = (Static164.anIntArray337[local263] & 0xFF) * 64 - Static39.anInt1055;
				@Pc(334) byte[] local334 = Static52.aByteArrayArray2[local263];
				if (local334 == null && Static127.anInt3016 < 800) {
					Static177.method2757();
					Static34.method657(64, local330, 64, local273);
				}
			}
			Static135.method2137(true);
			for (local273 = 0; local273 < local127; local273++) {
				local277 = Static125.aByteArrayArray6[local273];
				if (local277 != null) {
					local383 = (Static164.anIntArray337[local273] & 0xFF) * 64 - Static39.anInt1055;
					local393 = (Static164.anIntArray337[local273] >> 8) * 64 - Static3.anInt2434;
					Static177.method2757();
					Static78.method1406(local393, local277, Static141.aClass36Array1, local383);
				}
			}
		}
		@Pc(451) int local451;
		@Pc(457) int local457;
		if (Static79.aBoolean100) {
			@Pc(463) int local463;
			@Pc(473) int local473;
			@Pc(475) int local475;
			for (local208 = 0; local208 < 4; local208++) {
				Static177.method2757();
				for (local263 = 0; local263 < 13; local263++) {
					for (local273 = 0; local273 < 13; local273++) {
						@Pc(427) boolean local427 = false;
						local393 = Static33.anIntArrayArrayArray4[local208][local263][local273];
						if (local393 != -1) {
							local383 = local393 >> 24 & 0x3;
							local451 = local393 >> 1 & 0x3;
							local457 = local393 >> 14 & 0x3FF;
							local463 = local393 >> 3 & 0x7FF;
							local473 = local463 / 8 + (local457 / 8 << 8);
							for (local475 = 0; local475 < Static164.anIntArray337.length; local475++) {
								if (local473 == Static164.anIntArray337[local475] && Static52.aByteArrayArray2[local475] != null) {
									Static12.method359(local383, (local457 & 0x7) * 8, local263 * 8, local273 * 8, local208, local451, (local463 & 0x7) * 8, Static141.aClass36Array1, Static52.aByteArrayArray2[local475]);
									local427 = true;
									break;
								}
							}
						}
						if (!local427) {
							Static3.method1693(local273 * 8, local263 * 8, local208);
						}
					}
				}
			}
			for (local263 = 0; local263 < 13; local263++) {
				for (local273 = 0; local273 < 13; local273++) {
					local330 = Static33.anIntArrayArrayArray4[0][local263][local273];
					if (local330 == -1) {
						Static34.method657(8, local273 * 8, 8, local263 * 8);
					}
				}
			}
			Static135.method2137(true);
			for (local273 = 0; local273 < 4; local273++) {
				Static177.method2757();
				for (local330 = 0; local330 < 13; local330++) {
					for (local393 = 0; local393 < 13; local393++) {
						local383 = Static33.anIntArrayArrayArray4[local273][local330][local393];
						if (local383 != -1) {
							local451 = local383 >> 24 & 0x3;
							local457 = local383 >> 1 & 0x3;
							local463 = local383 >> 14 & 0x3FF;
							local473 = local383 >> 3 & 0x7FF;
							local475 = local473 / 8 + (local463 / 8 << 8);
							for (@Pc(655) int local655 = 0; local655 < Static164.anIntArray337.length; local655++) {
								if (Static164.anIntArray337[local655] == local475 && Static125.aByteArrayArray6[local655] != null) {
									Static126.method2043(local393 * 8, Static141.aClass36Array1, local273, Static125.aByteArrayArray6[local655], (local463 & 0x7) * 8, local330 * 8, local451, (local473 & 0x7) * 8, local457);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static135.method2137(true);
		Static48.method901();
		Static177.method2757();
		Static8.method295(Static141.aClass36Array1);
		Static135.method2137(true);
		local208 = Static36.anInt975;
		if (Static103.anInt2568 < local208) {
			local208 = Static103.anInt2568;
		}
		if (Static103.anInt2568 - 1 > local208) {
		}
		if (Static177.aBoolean170) {
			Static33.method646(Static36.anInt975);
		} else {
			Static33.method646(0);
		}
		for (local263 = 0; local263 < 104; local263++) {
			for (local273 = 0; local273 < 104; local273++) {
				Static52.method966(local273, local263);
			}
		}
		Static177.method2757();
		Static155.method2398();
		Static48.method901();
		if (Static138.aFrame1 != null) {
			Static128.aClass2_Sub2_Sub1_2.method1711(168);
			Static128.aClass2_Sub2_Sub1_2.method1710(1057001181);
		}
		if (!Static79.aBoolean100) {
			local273 = (Static142.anInt3243 - 6) / 8;
			local330 = (Static142.anInt3243 + 6) / 8;
			local393 = (Static127.anInt3016 - 6) / 8;
			local383 = (Static127.anInt3016 + 6) / 8;
			for (local451 = local273 - 1; local451 <= local330 + 1; local451++) {
				for (local457 = local393 - 1; local457 <= local383 + 1; local457++) {
					if (local451 < local273 || local451 > local330 || local457 < local393 || local383 < local457) {
						Static47.aClass40_Sub1_49.method1772(Static83.method1481(new Class28[] { Static11.aClass28_366, Static158.method2411(local451), Static158.aClass28_2050, Static158.method2411(local457) }));
						Static47.aClass40_Sub1_49.method1772(Static83.method1481(new Class28[] { Static26.aClass28_519, Static158.method2411(local451), Static158.aClass28_2050, Static158.method2411(local457) }));
					}
				}
			}
		}
		Static110.method1877(30);
		Static177.method2757();
		Static104.method1826();
		Static128.aClass2_Sub2_Sub1_2.method1711(187);
		Static129.method2082();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!ab;ILclient!qe;)V")
	public static void method1105(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2 arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(9) Class2_Sub15 local9 = new Class2_Sub15();
		local9.anInt2349 = arg1.method1698();
		local9.anInt2346 = arg1.method1690();
		local9.aClass41Array1 = new Class41[local9.anInt2349];
		local9.aClass41Array2 = new Class41[local9.anInt2349];
		local9.aByteArrayArrayArray6 = new byte[local9.anInt2349][][];
		local9.anIntArray224 = new int[local9.anInt2349];
		local9.anIntArray225 = new int[local9.anInt2349];
		local9.anIntArray226 = new int[local9.anInt2349];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt2349; local56++) {
			try {
				@Pc(62) int local62 = arg1.method1698();
				@Pc(86) String local86;
				@Pc(95) String local95;
				@Pc(97) int local97;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local86 = new String(arg1.method1662().method1143());
					local95 = new String(arg1.method1662().method1143());
					local97 = 0;
					if (local62 == 1) {
						local97 = arg1.method1690();
					}
					local9.anIntArray224[local56] = local62;
					local9.anIntArray226[local56] = local97;
					local9.aClass41Array2[local56] = arg2.method2132(local95, Static63.method1167(local86));
				} else if (local62 == 3 || local62 == 4) {
					local86 = new String(arg1.method1662().method1143());
					local95 = new String(arg1.method1662().method1143());
					local97 = arg1.method1698();
					@Pc(164) String[] local164 = new String[local97];
					for (@Pc(166) int local166 = 0; local166 < local97; local166++) {
						local164[local166] = new String(arg1.method1662().method1143());
					}
					@Pc(186) byte[][] local186 = new byte[local97][];
					@Pc(201) int local201;
					if (local62 == 3) {
						for (@Pc(193) int local193 = 0; local193 < local97; local193++) {
							local201 = arg1.method1690();
							local186[local193] = new byte[local201];
							arg1.method1705(local201, local186[local193]);
						}
					}
					local9.anIntArray224[local56] = local62;
					@Pc(228) Class[] local228 = new Class[local97];
					for (local201 = 0; local201 < local97; local201++) {
						local228[local201] = Static63.method1167(local164[local201]);
					}
					local9.aClass41Array1[local56] = arg2.method2128(Static63.method1167(local86), local95, local228);
					local9.aByteArrayArrayArray6[local56] = local186;
				}
			} catch (@Pc(265) ClassNotFoundException local265) {
				local9.anIntArray225[local56] = -1;
			} catch (@Pc(272) SecurityException local272) {
				local9.anIntArray225[local56] = -2;
			} catch (@Pc(279) NullPointerException local279) {
				local9.anIntArray225[local56] = -3;
			} catch (@Pc(286) Exception local286) {
				local9.anIntArray225[local56] = -4;
			} catch (@Pc(293) Throwable local293) {
				local9.anIntArray225[local56] = -5;
			}
		}
		Static122.aClass65_11.method2116(local9);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!eh;II)V")
	public static void method1106(@OriginalArg(0) Class2_Sub4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (Static156.anInt3491 < arg0.anInt1620) {
			Static180.method2861(arg0);
		} else if (Static156.anInt3491 <= arg0.anInt1632) {
			Static124.method2013(arg0);
		} else {
			Static177.method2760(arg0);
		}
		if (arg0.anInt1633 < 128 || arg0.anInt1635 < 128 || arg0.anInt1633 >= 13184 || arg0.anInt1635 >= 13184) {
			arg0.anInt1653 = -1;
			arg0.anInt1633 = arg0.anIntArray139[0] * 128 + arg0.anInt1618 * 64;
			arg0.anInt1632 = 0;
			arg0.anInt1627 = -1;
			arg0.anInt1635 = arg0.anInt1618 * 64 + arg0.anIntArray142[0] * 128;
			arg0.anInt1620 = 0;
			arg0.method1100();
		}
		if (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2 == arg0 && (arg0.anInt1633 < 1536 || arg0.anInt1635 < 1536 || arg0.anInt1633 >= 11776 || arg0.anInt1635 >= 11776)) {
			arg0.anInt1632 = 0;
			arg0.anInt1635 = arg0.anInt1618 * 64 + arg0.anIntArray142[0] * 128;
			arg0.anInt1627 = -1;
			arg0.anInt1620 = 0;
			arg0.anInt1653 = -1;
			arg0.anInt1633 = arg0.anIntArray139[0] * 128 + arg0.anInt1618 * 64;
			arg0.method1100();
		}
		Static145.method2279(arg0);
		Static22.method475(arg0);
	}
}
