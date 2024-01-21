import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	public static int anInt927;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!gg;")
	private static Class28 aClass28_547 = Static107.method1838("Bad session id)3");

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	public static int anInt928 = 0;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_548 = aClass28_547;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_549 = Static107.method1838("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	public static int anInt936 = 0;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[B")
	public static byte[] aByteArray10 = new byte[520];

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	public static void method629() {
		aClass28_547 = null;
		aClass28_548 = null;
		aClass28_549 = null;
		aByteArray10 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Lclient!of;")
	public static Class2_Sub22 method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub22 local7 = new Class2_Sub22();
		local7.anInt2872 = arg1;
		local7.anInt2866 = arg2;
		Static121.aClass35_35.method1362(local7, (long) arg0);
		Static6.method225(arg2);
		Static50.method944(arg2);
		@Pc(29) Class24 local29 = Static58.method1035(arg0);
		if (local29 != null) {
			Static104.method1828(local29);
		}
		if (Static177.aClass24_14 != null) {
			Static104.method1828(Static177.aClass24_14);
			Static177.aClass24_14 = null;
		}
		Static169.aBoolean165 = false;
		Static150.anInt3365 = 0;
		Static19.method609(Static158.anInt3508, Static136.anInt3117, Static40.anInt1059, Static100.anInt2501);
		if (Static118.anInt4001 != -1) {
			Static95.method1646(Static118.anInt4001, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	public static void method633() {
		Static104.method1828(Static177.aClass24_13);
		Static133.anInt3089++;
		if (Static146.aBoolean147 && Static129.aBoolean136) {
			@Pc(24) int local24 = Static169.anInt3798;
			@Pc(27) int local27 = Static177.aClass24_13.anInt1426;
			@Pc(29) int local29 = Static93.anInt2353;
			local29 -= Static35.anInt971;
			if (local29 < Static95.anInt2365) {
				local29 = Static95.anInt2365;
			}
			local24 -= Static46.anInt1237;
			if (local24 < Static28.anInt855) {
				local24 = Static28.anInt855;
			}
			if (Static95.anInt2365 + Static157.aClass24_11.anInt1357 < Static177.aClass24_13.anInt1357 + local29) {
				local29 = Static95.anInt2365 + Static157.aClass24_11.anInt1357 - Static177.aClass24_13.anInt1357;
			}
			if (Static177.aClass24_13.anInt1427 + local24 > Static157.aClass24_11.anInt1427 + Static28.anInt855) {
				local24 = Static157.aClass24_11.anInt1427 + Static28.anInt855 - Static177.aClass24_13.anInt1427;
			}
			@Pc(97) int local97 = local24 - Static87.anInt2206;
			@Pc(104) int local104 = local29 + Static157.aClass24_11.anInt1398 - Static95.anInt2365;
			@Pc(112) int local112 = local24 + Static157.aClass24_11.anInt1406 - Static28.anInt855;
			@Pc(117) int local117 = local29 - Static120.anInt2871;
			if (Static133.anInt3089 > Static177.aClass24_13.anInt1361 && (local117 > local27 || -local27 > local117 || local27 < local97 || -local27 > local97)) {
				Static96.aBoolean116 = true;
			}
			@Pc(162) Class2_Sub21 local162;
			if (Static177.aClass24_13.anObjectArray4 != null && Static96.aBoolean116) {
				local162 = new Class2_Sub21();
				local162.anInt2856 = local112;
				local162.aClass24_9 = Static177.aClass24_13;
				local162.anObjectArray29 = Static177.aClass24_13.anObjectArray4;
				local162.anInt2854 = local104;
				Static118.method2854(local162);
			}
			if (Static152.anInt3425 == 0) {
				if (Static96.aBoolean116) {
					if (Static177.aClass24_13.anObjectArray13 != null) {
						local162 = new Class2_Sub21();
						local162.anInt2854 = local104;
						local162.aClass24_8 = Static98.aClass24_5;
						local162.aClass24_9 = Static177.aClass24_13;
						local162.anInt2856 = local112;
						local162.anObjectArray29 = Static177.aClass24_13.anObjectArray13;
						Static118.method2854(local162);
					}
					if (Static98.aClass24_5 != null && Static141.method2248(Static177.aClass24_13) != null) {
						Static128.aClass2_Sub2_Sub1_2.method1711(181);
						Static128.aClass2_Sub2_Sub1_2.method1656(Static177.aClass24_13.anInt1367);
						Static128.aClass2_Sub2_Sub1_2.method1710(Static98.aClass24_5.anInt1367);
						Static128.aClass2_Sub2_Sub1_2.method1688(Static177.aClass24_13.anInt1409);
						Static128.aClass2_Sub2_Sub1_2.method1688(Static98.aClass24_5.anInt1409);
					}
				} else if ((Static164.anInt3647 == 1 || Static116.method1949(Static150.anInt3365 - 1)) && Static150.anInt3365 > 2) {
					Static167.method2619();
				} else if (Static150.anInt3365 > 0) {
					Static107.method1839(Static150.anInt3365 - 1);
				}
				Static177.aClass24_13 = null;
			}
		} else if (Static133.anInt3089 > 1) {
			Static177.aClass24_13 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	public static void method634(@OriginalArg(1) boolean arg0) {
		Static79.aBoolean100 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(41) int local41;
		@Pc(145) int local145;
		@Pc(149) int local149;
		@Pc(153) int local153;
		if (!Static79.aBoolean100) {
			local13 = Static151.aClass2_Sub2_Sub1_3.method1680();
			local17 = (Static103.anInt2571 - Static151.aClass2_Sub2_Sub1_3.anInt2385) / 16;
			Static110.anIntArrayArray25 = new int[local17][4];
			for (local21 = 0; local21 < local17; local21++) {
				for (local26 = 0; local26 < 4; local26++) {
					Static110.anIntArrayArray25[local21][local26] = Static151.aClass2_Sub2_Sub1_3.method1671();
				}
			}
			local26 = Static151.aClass2_Sub2_Sub1_3.method1674();
			local30 = Static151.aClass2_Sub2_Sub1_3.method1674();
			local34 = Static151.aClass2_Sub2_Sub1_3.method1665();
			local41 = Static151.aClass2_Sub2_Sub1_3.method1698();
			Static164.anIntArray337 = new int[local17];
			Static168.anIntArray352 = new int[local17];
			Static52.aByteArrayArray2 = new byte[local17][];
			@Pc(387) boolean local387 = false;
			Static125.aByteArrayArray6 = new byte[local17][];
			Static33.anIntArray72 = new int[local17];
			local17 = 0;
			if ((local13 / 8 == 48 || local13 / 8 == 49) && local34 / 8 == 48) {
				local387 = true;
			}
			if (local13 / 8 == 48 && local34 / 8 == 148) {
				local387 = true;
			}
			for (local145 = (local13 - 6) / 8; local145 <= (local13 + 6) / 8; local145++) {
				for (local149 = (local34 - 6) / 8; local149 <= (local34 + 6) / 8; local149++) {
					local153 = (local145 << 8) + local149;
					if (!local387 || local149 != 49 && local149 != 149 && local149 != 147 && local145 != 50 && (local145 != 49 || local149 != 47)) {
						Static164.anIntArray337[local17] = local153;
						Static33.anIntArray72[local17] = Static47.aClass40_Sub1_49.method1777(Static83.method1481(new Class28[] { Static11.aClass28_366, Static158.method2411(local145), Static158.aClass28_2050, Static158.method2411(local149) }));
						Static168.anIntArray352[local17] = Static47.aClass40_Sub1_49.method1777(Static83.method1481(new Class28[] { Static26.aClass28_519, Static158.method2411(local145), Static158.aClass28_2050, Static158.method2411(local149) }));
						local17++;
					}
				}
			}
			Static149.method2324(local34, local26, local30, local13, local41);
			return;
		}
		local13 = Static151.aClass2_Sub2_Sub1_3.method1670();
		local17 = Static151.aClass2_Sub2_Sub1_3.method1670();
		local21 = Static151.aClass2_Sub2_Sub1_3.method1667();
		Static151.aClass2_Sub2_Sub1_3.method1714();
		for (local26 = 0; local26 < 4; local26++) {
			for (local30 = 0; local30 < 13; local30++) {
				for (local34 = 0; local34 < 13; local34++) {
					local41 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
					if (local41 == 1) {
						Static33.anIntArrayArrayArray4[local26][local30][local34] = Static151.aClass2_Sub2_Sub1_3.method1713(26);
					} else {
						Static33.anIntArrayArrayArray4[local26][local30][local34] = -1;
					}
				}
			}
		}
		Static151.aClass2_Sub2_Sub1_3.method1717();
		local30 = (Static103.anInt2571 - Static151.aClass2_Sub2_Sub1_3.anInt2385) / 16;
		Static110.anIntArrayArray25 = new int[local30][4];
		for (local34 = 0; local34 < local30; local34++) {
			for (local41 = 0; local41 < 4; local41++) {
				Static110.anIntArrayArray25[local34][local41] = Static151.aClass2_Sub2_Sub1_3.method1671();
			}
		}
		local41 = Static151.aClass2_Sub2_Sub1_3.method1665();
		@Pc(126) int local126 = Static151.aClass2_Sub2_Sub1_3.method1680();
		Static125.aByteArrayArray6 = new byte[local30][];
		Static168.anIntArray352 = new int[local30];
		Static33.anIntArray72 = new int[local30];
		Static52.aByteArrayArray2 = new byte[local30][];
		Static164.anIntArray337 = new int[local30];
		local30 = 0;
		for (local145 = 0; local145 < 4; local145++) {
			for (local149 = 0; local149 < 13; local149++) {
				for (local153 = 0; local153 < 13; local153++) {
					@Pc(163) int local163 = Static33.anIntArrayArrayArray4[local145][local149][local153];
					if (local163 != -1) {
						@Pc(172) int local172 = local163 >> 3 & 0x7FF;
						@Pc(178) int local178 = local163 >> 14 & 0x3FF;
						@Pc(188) int local188 = local172 / 8 + (local178 / 8 << 8);
						for (@Pc(190) int local190 = 0; local190 < local30; local190++) {
							if (local188 == Static164.anIntArray337[local190]) {
								local188 = -1;
								break;
							}
						}
						if (local188 != -1) {
							Static164.anIntArray337[local30] = local188;
							@Pc(222) int local222 = local188 >> 8 & 0xFF;
							@Pc(226) int local226 = local188 & 0xFF;
							Static33.anIntArray72[local30] = Static47.aClass40_Sub1_49.method1777(Static83.method1481(new Class28[] { Static11.aClass28_366, Static158.method2411(local222), Static158.aClass28_2050, Static158.method2411(local226) }));
							Static168.anIntArray352[local30] = Static47.aClass40_Sub1_49.method1777(Static83.method1481(new Class28[] { Static26.aClass28_519, Static158.method2411(local222), Static158.aClass28_2050, Static158.method2411(local226) }));
							local30++;
						}
					}
				}
			}
		}
		Static149.method2324(local41, local17, local13, local126, local21);
	}
}
