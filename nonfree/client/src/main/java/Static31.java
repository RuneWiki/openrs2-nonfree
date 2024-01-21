import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fc", name = "qb", descriptor = "[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] aClass3_Sub1_Sub5_Sub3Array2;

	@OriginalMember(owner = "client!fc", name = "db", descriptor = "Lclient!na;")
	public static Class53 aClass53_422 = Static109.method1737("jolt");

	@OriginalMember(owner = "client!fc", name = "ib", descriptor = "I")
	public static int anInt1056 = 1;

	@OriginalMember(owner = "client!fc", name = "lb", descriptor = "Lclient!te;")
	public static Class75 aClass75_27 = new Class75(200);

	@OriginalMember(owner = "client!fc", name = "ub", descriptor = "I")
	public static int anInt1066 = 0;

	@OriginalMember(owner = "client!fc", name = "xb", descriptor = "Lclient!na;")
	public static Class53 aClass53_423 = Static109.method1737("Lade Sprites )2 ");

	@OriginalMember(owner = "client!fc", name = "zb", descriptor = "[I")
	public static int[] anIntArray114 = new int[100];

	@OriginalMember(owner = "client!fc", name = "Bb", descriptor = "Lclient!na;")
	public static Class53 aClass53_424 = Static109.method1737("Entfernen");

	@OriginalMember(owner = "client!fc", name = "Cb", descriptor = "I")
	public static int anInt1070 = 0;

	@OriginalMember(owner = "client!fc", name = "Db", descriptor = "Lclient!c;")
	public static Class11 aClass11_3 = new Class11();

	@OriginalMember(owner = "client!fc", name = "Eb", descriptor = "I")
	public static int anInt1071 = -1;

	@OriginalMember(owner = "client!fc", name = "Fb", descriptor = "Lclient!na;")
	public static Class53 aClass53_425 = Static109.method1737("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V")
	public static void method691(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static98.method1633(arg0)) {
			return;
		}
		@Pc(24) Class3_Sub1_Sub15[] local24 = Static107.aClass3_Sub1_Sub15ArrayArray1[arg0];
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			@Pc(32) Class3_Sub1_Sub15 local32 = local24[local26];
			if (local32.anObjectArray7 != null) {
				Static12.method188(0, 0, local32, 0, null, local32.anObjectArray7);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V")
	public static void method692() {
		aClass53_425 = null;
		aClass11_3 = null;
		aClass75_27 = null;
		aClass53_423 = null;
		aClass53_424 = null;
		aClass3_Sub1_Sub5_Sub3Array2 = null;
		aClass53_422 = null;
		anIntArray114 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!we;B)Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4 method693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2) {
		return Static35.method756(arg1, arg0, arg2) ? Static94.method1566() : null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!vb;B)Z")
	public static boolean method694(@OriginalArg(0) Class3_Sub1_Sub15 arg0) {
		@Pc(13) int local13 = arg0.anInt2712;
		if (local13 >= 1 && local13 <= 200 || !(local13 < 701 || local13 > 900)) {
			if (local13 >= 801) {
				local13 -= 701;
			} else if (local13 >= 701) {
				local13 -= 601;
			} else if (local13 >= 101) {
				local13 -= 101;
			} else {
				local13--;
			}
			Static59.method1075(18, Static79.aClass53_900, Static103.method1689(new Class53[] { Static25.aClass53_333, Static52.aClass53Array11[local13] }), 0, 0, 0);
			Static59.method1075(46, Static102.aClass53_1177, Static103.method1689(new Class53[] { Static25.aClass53_333, Static52.aClass53Array11[local13] }), 0, 0, 0);
			return true;
		} else if (local13 >= 401 && local13 <= 500) {
			Static59.method1075(33, Static79.aClass53_900, Static103.method1689(new Class53[] { Static25.aClass53_333, arg0.aClass53_1346 }), 0, 0, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
	public static void method695(@OriginalArg(0) boolean arg0) {
		Static93.aBoolean91 = arg0;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(155) int local155;
		@Pc(159) int local159;
		@Pc(163) int local163;
		if (!Static93.aBoolean91) {
			local22 = Static62.aClass3_Sub7_Sub1_2.method604();
			local26 = (Static37.anInt2211 - Static62.aClass3_Sub7_Sub1_2.anInt964) / 16;
			Static22.anIntArrayArray3 = new int[local26][4];
			for (local30 = 0; local30 < local26; local30++) {
				for (local35 = 0; local35 < 4; local35++) {
					Static22.anIntArrayArray3[local30][local35] = Static62.aClass3_Sub7_Sub1_2.method600();
				}
			}
			local35 = Static62.aClass3_Sub7_Sub1_2.method611();
			local39 = Static62.aClass3_Sub7_Sub1_2.method602();
			local43 = Static62.aClass3_Sub7_Sub1_2.method611();
			local50 = Static62.aClass3_Sub7_Sub1_2.method611();
			@Pc(388) boolean local388 = false;
			Static77.anIntArray258 = new int[local26];
			Static96.anIntArray182 = new int[local26];
			if ((local35 / 8 == 48 || local35 / 8 == 49) && (local50 / 8) == 48) {
				local388 = true;
			}
			Static11.anIntArray29 = new int[local26];
			if (local35 / 8 == 48 && local50 / 8 == 148) {
				local388 = true;
			}
			Static120.aByteArrayArray9 = new byte[local26][];
			Static66.aByteArrayArray3 = new byte[local26][];
			local26 = 0;
			for (local155 = (local35 - 6) / 8; local155 <= (local35 + 6) / 8; local155++) {
				for (local159 = (local50 - 6) / 8; local159 <= (local50 + 6) / 8; local159++) {
					local163 = local159 + (local155 << 8);
					if (!local388 || local159 != 49 && local159 != 149 && local159 != 147 && local155 != 50 && (local155 != 49 || local159 != 47)) {
						Static96.anIntArray182[local26] = local163;
						Static11.anIntArray29[local26] = Static7.aClass62_Sub1_2.method1504(Static103.method1689(new Class53[] { Static58.aClass53_687, Static108.method1725(local155), Static109.aClass53_1261, Static108.method1725(local159) }));
						Static77.anIntArray258[local26] = Static7.aClass62_Sub1_2.method1504(Static103.method1689(new Class53[] { Static85.aClass53_946, Static108.method1725(local155), Static109.aClass53_1261, Static108.method1725(local159) }));
						local26++;
					}
				}
			}
			Static21.method388(local50, local43, local39, local22, local35);
			return;
		}
		local22 = Static62.aClass3_Sub7_Sub1_2.method612();
		local26 = Static62.aClass3_Sub7_Sub1_2.method611();
		local30 = Static62.aClass3_Sub7_Sub1_2.method651();
		Static62.aClass3_Sub7_Sub1_2.method658();
		for (local35 = 0; local35 < 4; local35++) {
			for (local39 = 0; local39 < 13; local39++) {
				for (local43 = 0; local43 < 13; local43++) {
					local50 = Static62.aClass3_Sub7_Sub1_2.method661(1);
					if (local50 == 1) {
						Static59.anIntArrayArrayArray4[local35][local39][local43] = Static62.aClass3_Sub7_Sub1_2.method661(26);
					} else {
						Static59.anIntArrayArrayArray4[local35][local39][local43] = -1;
					}
				}
			}
		}
		Static62.aClass3_Sub7_Sub1_2.method659();
		local39 = (Static37.anInt2211 - Static62.aClass3_Sub7_Sub1_2.anInt964) / 16;
		Static22.anIntArrayArray3 = new int[local39][4];
		for (local43 = 0; local43 < local39; local43++) {
			for (local50 = 0; local50 < 4; local50++) {
				Static22.anIntArrayArray3[local43][local50] = Static62.aClass3_Sub7_Sub1_2.method600();
			}
		}
		local50 = Static62.aClass3_Sub7_Sub1_2.method651();
		@Pc(136) int local136 = Static62.aClass3_Sub7_Sub1_2.method617();
		Static66.aByteArrayArray3 = new byte[local39][];
		Static11.anIntArray29 = new int[local39];
		Static96.anIntArray182 = new int[local39];
		Static120.aByteArrayArray9 = new byte[local39][];
		Static77.anIntArray258 = new int[local39];
		local39 = 0;
		for (local155 = 0; local155 < 4; local155++) {
			for (local159 = 0; local159 < 13; local159++) {
				for (local163 = 0; local163 < 13; local163++) {
					@Pc(173) int local173 = Static59.anIntArrayArrayArray4[local155][local159][local163];
					if (local173 != -1) {
						@Pc(183) int local183 = local173 >> 3 & 0x7FF;
						@Pc(189) int local189 = local173 >> 14 & 0x3FF;
						@Pc(199) int local199 = (local189 / 8 << 8) + local183 / 8;
						for (@Pc(201) int local201 = 0; local201 < local39; local201++) {
							if (local199 == Static96.anIntArray182[local201]) {
								local199 = -1;
								break;
							}
						}
						if (local199 != -1) {
							Static96.anIntArray182[local39] = local199;
							@Pc(237) int local237 = local199 >> 8 & 0xFF;
							@Pc(241) int local241 = local199 & 0xFF;
							Static11.anIntArray29[local39] = Static7.aClass62_Sub1_2.method1504(Static103.method1689(new Class53[] { Static58.aClass53_687, Static108.method1725(local237), Static109.aClass53_1261, Static108.method1725(local241) }));
							Static77.anIntArray258[local39] = Static7.aClass62_Sub1_2.method1504(Static103.method1689(new Class53[] { Static85.aClass53_946, Static108.method1725(local237), Static109.aClass53_1261, Static108.method1725(local241) }));
							local39++;
						}
					}
				}
			}
		}
		Static21.method388(local50, local136, local26, local22, local30);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Z")
	public static boolean method696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && Static9.anInt230 == arg0) {
			return true;
		} else if (arg1 == 1 && Static100.anInt2361 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && anInt1071 == arg0;
		}
	}
}
