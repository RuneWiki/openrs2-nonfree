import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
	public static int[] anIntArray48;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!jb;")
	public static Class40 aClass40_6 = new Class40(32);

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	public static int anInt548 = -2;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!pe;")
	private static Class65 aClass65_261 = Static119.method1462("Enter your username (V password)3");

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_258 = aClass65_261;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_259 = Static119.method1462("Lade Texturen )2 ");

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!pe;")
	private static Class65 aClass65_260 = Static119.method1462("Attack");

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!pe;")
	public static Class65 aClass65_262 = null;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public static int anInt549 = 0;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_263 = aClass65_260;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method354() {
		aClass65_258 = null;
		aClass65_263 = null;
		aClass65_262 = null;
		anIntArray48 = null;
		aClass65_260 = null;
		aClass65_261 = null;
		aClass40_6 = null;
		aClass65_259 = null;
		aClass2_Sub1_Sub4_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method355() {
		Static76.method1282(false);
		@Pc(10) boolean local10 = true;
		Static75.anInt2330 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static43.aByteArrayArray4.length; local14++) {
			if (Static77.anIntArray226[local14] != -1 && Static43.aByteArrayArray4[local14] == null) {
				Static43.aByteArrayArray4[local14] = Static95.aClass56_Sub1_22.method1666(0, Static77.anIntArray226[local14]);
				if (Static43.aByteArrayArray4[local14] == null) {
					Static75.anInt2330++;
					local10 = false;
				}
			}
			if (Static79.anIntArray227[local14] != -1 && Static15.aByteArrayArray1[local14] == null) {
				Static15.aByteArrayArray1[local14] = Static95.aClass56_Sub1_22.method1683(Static96.anIntArrayArray20[local14], 0, Static79.anIntArray227[local14]);
				if (Static15.aByteArrayArray1[local14] == null) {
					Static75.anInt2330++;
					local10 = false;
				}
			}
		}
		if (!local10) {
			Static114.anInt2533 = 1;
			return;
		}
		Static102.anInt2297 = 0;
		local10 = true;
		@Pc(128) int local128;
		@Pc(117) int local117;
		for (@Pc(98) int local98 = 0; local98 < Static43.aByteArrayArray4.length; local98++) {
			@Pc(104) byte[] local104 = Static15.aByteArrayArray1[local98];
			if (local104 != null) {
				local117 = (Static58.anIntArray177[local98] & 0xFF) * 64 - Static66.anInt1577;
				local128 = (Static58.anIntArray177[local98] >> 8) * 64 - Static34.anInt791;
				if (Static68.aBoolean129) {
					local128 = 10;
					local117 = 10;
				}
				local10 &= Static103.method1692(local128, local117, local104);
			}
		}
		if (!local10) {
			Static114.anInt2533 = 2;
			return;
		}
		if (Static114.anInt2533 != 0) {
			Static20.method338(Static35.method647(new Class65[] { Static37.aClass65_390, Static116.aClass65_1102 }), true);
		}
		Static124.method1897();
		Static110.method1795();
		Static124.method1897();
		Static124.aClass49_1.method1180();
		Static124.method1897();
		System.gc();
		for (@Pc(187) int local187 = 0; local187 < 4; local187++) {
			Static90.aClass46Array1[local187].method1100();
		}
		@Pc(210) int local210;
		for (local128 = 0; local128 < 4; local128++) {
			for (local117 = 0; local117 < 104; local117++) {
				for (local210 = 0; local210 < 104; local210++) {
					Static88.aByteArrayArrayArray3[local128][local117][local210] = 0;
				}
			}
		}
		Static124.method1897();
		Static124.method1898();
		local117 = Static43.aByteArrayArray4.length;
		Static9.method169();
		Static76.method1282(true);
		@Pc(274) int local274;
		@Pc(263) int local263;
		@Pc(377) int local377;
		@Pc(330) int local330;
		@Pc(388) int local388;
		if (!Static68.aBoolean129) {
			@Pc(278) byte[] local278;
			for (local210 = 0; local210 < local117; local210++) {
				local263 = (Static58.anIntArray177[local210] & 0xFF) * 64 - Static66.anInt1577;
				local274 = (Static58.anIntArray177[local210] >> 8) * 64 - Static34.anInt791;
				local278 = Static43.aByteArrayArray4[local210];
				if (local278 != null) {
					Static124.method1897();
					Static48.method831(local278, local274, (Static50.anInt1210 - 6) * 8, Static42.anInt1052 * 8 - 48, Static90.aClass46Array1, local263);
				}
			}
			for (local274 = 0; local274 < local117; local274++) {
				local263 = (Static58.anIntArray177[local274] >> 8) * 64 - Static34.anInt791;
				local330 = (Static58.anIntArray177[local274] & 0xFF) * 64 - Static66.anInt1577;
				@Pc(334) byte[] local334 = Static43.aByteArrayArray4[local274];
				if (local334 == null && Static50.anInt1210 < 800) {
					Static124.method1897();
					Static110.method1794(64, local263, local330, 64);
				}
			}
			Static76.method1282(true);
			for (local263 = 0; local263 < local117; local263++) {
				local278 = Static15.aByteArrayArray1[local263];
				if (local278 != null) {
					local377 = (Static58.anIntArray177[local263] & 0xFF) * 64 - Static66.anInt1577;
					local388 = (Static58.anIntArray177[local263] >> 8) * 64 - Static34.anInt791;
					Static124.method1897();
					Static58.method1085(local388, Static124.aClass49_1, Static90.aClass46Array1, local377, local278);
				}
			}
		}
		@Pc(443) int local443;
		@Pc(455) int local455;
		if (Static68.aBoolean129) {
			@Pc(449) int local449;
			@Pc(466) int local466;
			@Pc(468) int local468;
			for (local210 = 0; local210 < 4; local210++) {
				Static124.method1897();
				for (local274 = 0; local274 < 13; local274++) {
					for (local263 = 0; local263 < 13; local263++) {
						local388 = Static119.anIntArrayArrayArray9[local210][local274][local263];
						@Pc(427) boolean local427 = false;
						if (local388 != -1) {
							local377 = local388 >> 24 & 0x3;
							local443 = local388 >> 1 & 0x3;
							local449 = local388 >> 3 & 0x7FF;
							local455 = local388 >> 14 & 0x3FF;
							local466 = (local455 / 8 << 8) + (local449 / 8);
							for (local468 = 0; local468 < Static58.anIntArray177.length; local468++) {
								if (local466 == Static58.anIntArray177[local468] && Static43.aByteArrayArray4[local468] != null) {
									Static62.method1117(Static90.aClass46Array1, local274 * 8, Static43.aByteArrayArray4[local468], (local449 & 0x7) * 8, local210, local377, local263 * 8, local443, (local455 & 0x7) * 8);
									local427 = true;
									break;
								}
							}
						}
						if (!local427) {
							Static57.method1078(local210, local263 * 8, local274 * 8);
						}
					}
				}
			}
			for (local274 = 0; local274 < 13; local274++) {
				for (local263 = 0; local263 < 13; local263++) {
					local330 = Static119.anIntArrayArrayArray9[0][local274][local263];
					if (local330 == -1) {
						Static110.method1794(8, local274 * 8, local263 * 8, 8);
					}
				}
			}
			Static76.method1282(true);
			for (local263 = 0; local263 < 4; local263++) {
				Static124.method1897();
				for (local330 = 0; local330 < 13; local330++) {
					for (local388 = 0; local388 < 13; local388++) {
						local377 = Static119.anIntArrayArrayArray9[local263][local330][local388];
						if (local377 != -1) {
							local455 = local377 >> 1 & 0x3;
							local443 = local377 >> 24 & 0x3;
							local449 = local377 >> 14 & 0x3FF;
							local466 = local377 >> 3 & 0x7FF;
							local468 = local466 / 8 + (local449 / 8 << 8);
							for (@Pc(647) int local647 = 0; local647 < Static58.anIntArray177.length; local647++) {
								if (Static58.anIntArray177[local647] == local468 && Static15.aByteArrayArray1[local647] != null) {
									Static95.method1572((local466 & 0x7) * 8, Static15.aByteArrayArray1[local647], local443, Static90.aClass46Array1, Static124.aClass49_1, (local449 & 0x7) * 8, local455, local388 * 8, local263, local330 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static76.method1282(true);
		Static110.method1795();
		Static124.method1897();
		Static16.method1596(Static90.aClass46Array1, Static124.aClass49_1);
		Static76.method1282(true);
		local210 = Static14.anInt354;
		if (Static59.anInt1479 < local210) {
			local210 = Static59.anInt1479;
		}
		if (Static59.anInt1479 - 1 > local210) {
		}
		if (Static48.aBoolean47) {
			Static124.aClass49_1.method1156(Static14.anInt354);
		} else {
			Static124.aClass49_1.method1156(0);
		}
		for (local274 = 0; local274 < 104; local274++) {
			for (local263 = 0; local263 < 104; local263++) {
				Static54.method961(local274, local263);
			}
		}
		Static124.method1897();
		Static11.method921();
		Static93.aClass8_44.method171();
		if (Static10.aFrame62 != null) {
			Static49.aClass2_Sub4_Sub1_1.method962(192);
			Static49.aClass2_Sub4_Sub1_1.method914(1057001181);
		}
		if (!Static68.aBoolean129) {
			local263 = (Static42.anInt1052 - 6) / 8;
			local330 = (Static42.anInt1052 + 6) / 8;
			local377 = (Static50.anInt1210 + 6) / 8;
			local388 = (Static50.anInt1210 - 6) / 8;
			for (local443 = local263 - 1; local443 <= local330 + 1; local443++) {
				for (local455 = local388 - 1; local455 <= local377 + 1; local455++) {
					if (local443 < local263 || local443 > local330 || local388 > local455 || local377 < local455) {
						Static95.aClass56_Sub1_22.method1680(Static35.method647(new Class65[] { Static121.aClass65_1132, Static120.method1871(local443), Static10.aClass65_1280, Static120.method1871(local455) }));
						Static95.aClass56_Sub1_22.method1680(Static35.method647(new Class65[] { Static81.aClass65_765, Static120.method1871(local443), Static10.aClass65_1280, Static120.method1871(local455) }));
					}
				}
			}
		}
		Static98.method1604(30);
		Static124.method1897();
		Static114.method1831();
		Static49.aClass2_Sub4_Sub1_1.method962(6);
		Static6.method133();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!fb;[B)V")
	public static void method356(@OriginalArg(0) int arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) Class2_Sub19 local8 = new Class2_Sub19();
		local8.aLong100 = arg0;
		local8.aClass24_3 = arg1;
		local8.anInt2511 = 0;
		local8.aByteArray36 = arg2;
		@Pc(27) Class13 local27 = Static9.aClass13_4;
		synchronized (Static9.aClass13_4) {
			Static9.aClass13_4.method263(local8);
		}
		Static35.method643();
	}
}
