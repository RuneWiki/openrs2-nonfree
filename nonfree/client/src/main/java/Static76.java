import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!oa;")
	public static Class9 aClass9_20;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!ua;")
	public static Class59 aClass59_5;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
	public static int[] anIntArray316;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "I")
	public static int anInt2252;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	public static int anInt2255;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "Lclient!oa;")
	public static Class9 aClass9_21;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Lclient!oa;")
	public static Class9 aClass9_22;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!kc;")
	public static Class11 aClass11_14;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "I")
	public static int anInt2262;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!lc;")
	public static Class31 aClass31_786 = Static56.method1206("flash1:");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!lc;")
	public static Class31 aClass31_787 = Static56.method1206("Existing User");

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	public static int anInt2250 = 0;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public static int anInt2256 = 0;

	@OriginalMember(owner = "client!p", name = "x", descriptor = "I")
	public static int anInt2263 = 99;

	@OriginalMember(owner = "client!p", name = "z", descriptor = "Lclient!lc;")
	public static Class31 aClass31_788 = Static56.method1206("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method1411() {
		aClass31_787 = null;
		aClass31_786 = null;
		aClass9_20 = null;
		anIntArray316 = null;
		aClass31_788 = null;
		aClass9_21 = null;
		aClass9_22 = null;
		aClass11_14 = null;
		anIntArrayArrayArray3 = null;
		aClass59_5 = null;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method1412() {
		if (Static46.anInt1615 != 0) {
			return;
		}
		@Pc(16) int local16 = Static49.anInt2693;
		if (Static47.anInt1737 == 1 && Static105.anInt2783 >= 516 && Static15.anInt649 >= 160 && Static105.anInt2783 <= 765 && Static15.anInt649 <= 205) {
			local16 = 0;
		}
		@Pc(48) int local48;
		@Pc(104) int local104;
		@Pc(98) int local98;
		if (!Static105.aBoolean154) {
			if (local16 == 1 && Static59.anInt2044 > 0) {
				local48 = Static63.anIntArray296[Static59.anInt2044 - 1];
				if (local48 == 55 || local48 == 22 || local48 == 15 || local48 == 21 || local48 == 18 || local48 == 36 || local48 == 51 || local48 == 5 || local48 == 19 || local48 == 29 || local48 == 33 || local48 == 1005) {
					local98 = Static64.anIntArray84[Static59.anInt2044 - 1];
					local104 = Static55.anIntArray274[Static59.anInt2044 - 1];
					@Pc(108) Class2_Sub1_Sub2 local108 = Static7.method187(local98);
					if (local108.aBoolean20 || local108.aBoolean23) {
						Static59.anInt2040 = local104;
						Static23.aBoolean59 = false;
						Static46.anInt1615 = 2;
						Static79.anInt2291 = Static15.anInt649;
						Static21.anInt1000 = Static105.anInt2783;
						Static67.anInt2202 = local98;
						if (Static42.anInt1586 == local98 >> 16) {
							Static46.anInt1615 = 1;
						}
						Static11.anInt515 = 0;
						if (Static47.anInt1736 == local98 >> 16) {
							Static46.anInt1615 = 3;
						}
						return;
					}
				}
			}
			if (local16 == 1 && (Static14.anInt637 == 1 || Static51.method1134(Static59.anInt2044 - 1)) && Static59.anInt2044 > 2) {
				local16 = 2;
			}
			if (local16 == 1 && Static59.anInt2044 > 0) {
				Static59.method1281(Static59.anInt2044 - 1);
			}
			if (local16 == 2 && Static59.anInt2044 > 0) {
				Static93.method1579();
			}
			return;
		}
		if (local16 != 1) {
			local48 = Static85.anInt2508;
			local104 = Static61.anInt2102;
			if (Static64.anInt601 == 0) {
				local48 -= 4;
				local104 -= 4;
			}
			if (Static64.anInt601 == 1) {
				local104 -= 205;
				local48 -= 553;
			}
			if (Static64.anInt601 == 2) {
				local104 -= 357;
				local48 -= 17;
			}
			if (local48 < Static25.anInt1109 - 10 || Static25.anInt1109 + Static15.anInt650 + 10 < local48 || Static100.anInt2717 - 10 > local104 || local104 > Static100.anInt2717 + Static93.anInt2522 + 10) {
				if (Static64.anInt601 == 1) {
					Static92.aBoolean81 = true;
				}
				Static105.aBoolean154 = false;
				if (Static64.anInt601 == 2) {
					Static27.aBoolean65 = true;
				}
			}
		}
		if (local16 != 1) {
			return;
		}
		local48 = Static25.anInt1109;
		local104 = Static100.anInt2717;
		local98 = Static15.anInt650;
		@Pc(280) int local280 = Static105.anInt2783;
		@Pc(282) int local282 = Static15.anInt649;
		if (Static64.anInt601 == 0) {
			local280 -= 4;
			local282 -= 4;
		}
		if (Static64.anInt601 == 1) {
			local280 -= 553;
			local282 -= 205;
		}
		if (Static64.anInt601 == 2) {
			local280 -= 17;
			local282 -= 357;
		}
		@Pc(303) int local303 = -1;
		for (@Pc(305) int local305 = 0; local305 < Static59.anInt2044; local305++) {
			@Pc(319) int local319 = local104 + (Static59.anInt2044 - 1 - local305) * 15 + 31;
			if (local280 > local48 && local98 + local48 > local280 && local319 - 13 < local282 && local282 < local319 + 3) {
				local303 = local305;
			}
		}
		if (local303 != -1) {
			Static59.method1281(local303);
		}
		Static105.aBoolean154 = false;
		if (Static64.anInt601 == 1) {
			Static92.aBoolean81 = true;
		}
		if (Static64.anInt601 == 2) {
			Static27.aBoolean65 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ib;I)V")
	public static void method1414(@OriginalArg(0) Class2_Sub1_Sub4_Sub6 arg0) {
		if (arg0.anInt2029 == 0) {
			return;
		}
		@Pc(32) int local32;
		@Pc(39) int local39;
		if (arg0.anInt2019 != -1 && arg0.anInt2019 < 32768) {
			@Pc(23) Class2_Sub1_Sub4_Sub6_Sub2 local23 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[arg0.anInt2019];
			if (local23 != null) {
				local32 = arg0.anInt2006 - local23.anInt2006;
				local39 = arg0.anInt2011 - local23.anInt2011;
				if (local32 != 0 || local39 != 0) {
					arg0.anInt2023 = (int) (Math.atan2((double) local32, (double) local39) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(67) int local67;
		if (arg0.anInt2019 >= 32768) {
			local67 = arg0.anInt2019 - 32768;
			if (local67 == Static2.anInt99) {
				local67 = 2047;
			}
			@Pc(76) Class2_Sub1_Sub4_Sub6_Sub1 local76 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local67];
			if (local76 != null) {
				local39 = arg0.anInt2006 - local76.anInt2006;
				@Pc(92) int local92 = arg0.anInt2011 - local76.anInt2011;
				if (local39 != 0 || local92 != 0) {
					arg0.anInt2023 = (int) (Math.atan2((double) local39, (double) local92) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2038 != 0 || arg0.anInt1985 != 0) && (arg0.anInt2000 == 0 || arg0.anInt1989 > 0)) {
			local67 = arg0.anInt2006 - (arg0.anInt2038 - Static25.anInt1103 - Static25.anInt1103) * 64;
			local32 = arg0.anInt2011 - (arg0.anInt1985 - Static47.anInt1730 - Static47.anInt1730) * 64;
			if (local67 != 0 || local32 != 0) {
				arg0.anInt2023 = (int) (Math.atan2((double) local67, (double) local32) * 325.949D) & 0x7FF;
			}
			arg0.anInt2038 = 0;
			arg0.anInt1985 = 0;
		}
		local67 = arg0.anInt2023 - arg0.anInt1991 & 0x7FF;
		if (local67 == 0) {
			return;
		}
		if (local67 < arg0.anInt2029 || 2048 - arg0.anInt2029 < local67) {
			arg0.anInt1991 = arg0.anInt2023;
		} else if (local67 > 1024) {
			arg0.anInt1991 -= arg0.anInt2029;
		} else {
			arg0.anInt1991 += arg0.anInt2029;
		}
		arg0.anInt1991 &= 0x7FF;
		if (arg0.anInt1988 != arg0.anInt2007 || arg0.anInt1991 == arg0.anInt2023) {
			return;
		}
		if (arg0.anInt2001 == -1) {
			arg0.anInt1988 = arg0.anInt2003;
			return;
		}
		arg0.anInt1988 = arg0.anInt2001;
		return;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;ILclient!kc;)V")
	public static void method1416(@OriginalArg(0) Component arg0, @OriginalArg(2) Class11 arg1) {
		if (Static18.aBoolean53) {
			return;
		}
		Static93.aClass2_Sub1_Sub3_Sub1_16 = Static8.method198(Static105.aClass31_949, arg1, Static69.aClass31_771);
		Static70.aClass2_Sub1_Sub3_Sub1_13 = Static8.method198(Static25.aClass31_364, arg1, Static69.aClass31_771);
		Static68.aClass2_Sub1_Sub3_Sub1_11 = Static8.method198(Static74.aClass31_778, arg1, Static69.aClass31_771);
		Static89.aClass2_Sub1_Sub3_Sub1_14 = Static8.method198(Static68.aClass31_769, arg1, Static69.aClass31_771);
		Static91.aClass2_Sub1_Sub3_Sub1_15 = Static8.method198(Static23.aClass31_323, arg1, Static69.aClass31_771);
		Static47.aClass2_Sub1_Sub3_Sub1_10 = Static8.method198(Static28.aClass31_385, arg1, Static69.aClass31_771);
		Static79.aClass9_23 = Static44.method1061(arg0, 96, 479);
		Static70.aClass2_Sub1_Sub3_Sub1_13.method291(0, 0);
		Static30.aClass9_12 = Static44.method1061(arg0, 156, 172);
		Static81.method1647();
		Static68.aClass2_Sub1_Sub3_Sub1_11.method291(0, 0);
		aClass9_20 = Static44.method1061(arg0, 261, 190);
		Static93.aClass2_Sub1_Sub3_Sub1_16.method291(0, 0);
		Static28.aClass9_11 = Static44.method1061(arg0, 334, 512);
		Static81.method1647();
		Static62.aClass9_16 = Static44.method1061(arg0, 50, 496);
		Static50.aClass9_4 = Static44.method1061(arg0, 37, 269);
		Static90.aClass9_25 = Static44.method1061(arg0, 45, 249);
		@Pc(106) Class2_Sub1_Sub3_Sub2 local106 = Static45.method1065(arg1, Static24.aClass31_345, Static69.aClass31_771);
		Static23.aClass9_9 = Static44.method1061(arg0, local106.anInt686, local106.anInt690);
		local106.method468(0, 0);
		@Pc(124) Class2_Sub1_Sub3_Sub2 local124 = Static45.method1065(arg1, Static47.aClass31_611, Static69.aClass31_771);
		Static69.aClass9_19 = Static44.method1061(arg0, local124.anInt686, local124.anInt690);
		local124.method468(0, 0);
		@Pc(142) Class2_Sub1_Sub3_Sub2 local142 = Static45.method1065(arg1, Static33.aClass31_443, Static69.aClass31_771);
		Static3.aClass9_1 = Static44.method1061(arg0, local142.anInt686, local142.anInt690);
		local142.method468(0, 0);
		@Pc(160) Class2_Sub1_Sub3_Sub2 local160 = Static45.method1065(arg1, Static40.aClass31_713, Static69.aClass31_771);
		Static24.aClass9_10 = Static44.method1061(arg0, local160.anInt686, local160.anInt690);
		local160.method468(0, 0);
		@Pc(178) Class2_Sub1_Sub3_Sub2 local178 = Static45.method1065(arg1, Static78.aClass31_790, Static69.aClass31_771);
		Static11.aClass9_5 = Static44.method1061(arg0, local178.anInt686, local178.anInt690);
		local178.method468(0, 0);
		@Pc(201) Class2_Sub1_Sub3_Sub2 local201 = Static45.method1065(arg1, Static80.aClass31_309, Static69.aClass31_771);
		aClass9_22 = Static44.method1061(arg0, local201.anInt686, local201.anInt690);
		local201.method468(0, 0);
		@Pc(219) Class2_Sub1_Sub3_Sub2 local219 = Static45.method1065(arg1, Static54.aClass31_640, Static69.aClass31_771);
		Static55.aClass9_15 = Static44.method1061(arg0, local219.anInt686, local219.anInt690);
		local219.method468(0, 0);
		@Pc(237) Class2_Sub1_Sub3_Sub2 local237 = Static45.method1065(arg1, Static61.aClass31_737, Static69.aClass31_771);
		Static83.aClass9_24 = Static44.method1061(arg0, local237.anInt686, local237.anInt690);
		local237.method468(0, 0);
		@Pc(255) Class2_Sub1_Sub3_Sub2 local255 = Static45.method1065(arg1, Static56.aClass31_668, Static69.aClass31_771);
		Static67.aClass9_18 = Static44.method1061(arg0, local255.anInt686, local255.anInt690);
		local255.method468(0, 0);
		Static98.aClass2_Sub1_Sub3_Sub1_7 = Static8.method198(Static12.aClass31_171, arg1, Static69.aClass31_771);
		Static100.aClass2_Sub1_Sub3_Sub1_20 = Static8.method198(Static39.aClass31_536, arg1, Static69.aClass31_771);
		Static69.aClass2_Sub1_Sub3_Sub1_12 = Static8.method198(Static102.aClass31_213, arg1, Static69.aClass31_771);
		Static96.aClass2_Sub1_Sub3_Sub1_18 = Static98.aClass2_Sub1_Sub3_Sub1_7.method293();
		Static96.aClass2_Sub1_Sub3_Sub1_18.method288();
		Static93.aClass2_Sub1_Sub3_Sub1_17 = Static100.aClass2_Sub1_Sub3_Sub1_20.method293();
		Static93.aClass2_Sub1_Sub3_Sub1_17.method288();
		Static28.aClass2_Sub1_Sub3_Sub1_6 = Static98.aClass2_Sub1_Sub3_Sub1_7.method293();
		Static28.aClass2_Sub1_Sub3_Sub1_6.method289();
		Static10.aClass2_Sub1_Sub3_Sub1_3 = Static100.aClass2_Sub1_Sub3_Sub1_20.method293();
		Static10.aClass2_Sub1_Sub3_Sub1_3.method289();
		Static13.aClass2_Sub1_Sub3_Sub1_4 = Static69.aClass2_Sub1_Sub3_Sub1_12.method293();
		Static13.aClass2_Sub1_Sub3_Sub1_4.method289();
		Static38.aClass2_Sub1_Sub3_Sub1_8 = Static98.aClass2_Sub1_Sub3_Sub1_7.method293();
		Static38.aClass2_Sub1_Sub3_Sub1_8.method288();
		Static38.aClass2_Sub1_Sub3_Sub1_8.method289();
		Static47.aClass2_Sub1_Sub3_Sub1_9 = Static100.aClass2_Sub1_Sub3_Sub1_20.method293();
		Static47.aClass2_Sub1_Sub3_Sub1_9.method288();
		Static47.aClass2_Sub1_Sub3_Sub1_9.method289();
		Static23.aClass2_Sub1_Sub3_Sub1Array1 = Static50.method337(Static69.aClass31_771, Static100.aClass31_937, arg1);
		Static50.anIntArray73 = new int[151];
		Static18.anIntArray98 = new int[151];
		Static68.anIntArray302 = new int[33];
		Static63.anIntArray297 = new int[33];
		@Pc(348) int local348;
		@Pc(350) int local350;
		@Pc(352) int local352;
		for (@Pc(344) int local344 = 0; local344 < 33; local344++) {
			local348 = 999;
			local350 = 0;
			for (local352 = 0; local352 < 34; local352++) {
				if (Static68.aClass2_Sub1_Sub3_Sub1_11.aByteArray7[Static68.aClass2_Sub1_Sub3_Sub1_11.anInt432 * local344 + local352] == 0) {
					if (local348 == 999) {
						local348 = local352;
					}
				} else if (local348 != 999) {
					local350 = local352;
					break;
				}
			}
			Static63.anIntArray297[local344] = local348;
			Static68.anIntArray302[local344] = local350 - local348;
		}
		for (local348 = 5; local348 < 156; local348++) {
			local350 = 999;
			local352 = 0;
			for (@Pc(412) int local412 = 25; local412 < 172; local412++) {
				if (Static68.aClass2_Sub1_Sub3_Sub1_11.aByteArray7[Static68.aClass2_Sub1_Sub3_Sub1_11.anInt432 * local348 + local412] == 0 && (local412 > 34 || local348 > 34)) {
					if (local350 == 999) {
						local350 = local412;
					}
				} else if (local350 != 999) {
					local352 = local412;
					break;
				}
			}
			Static50.anIntArray73[local348 - 5] = local350 - 25;
			Static18.anIntArray98[local348 - 5] = local352 - local350;
		}
		Static18.aBoolean53 = true;
	}
}
