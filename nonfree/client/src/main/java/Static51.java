import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "[Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1[] aClass2_Sub1_Sub3_Sub1Array2;

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lclient!na;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "Lclient!oc;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!kd", name = "nb", descriptor = "Lclient!qd;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
	public static int anInt1774 = 0;

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lclient!lc;")
	public static Class31 aClass31_632 = Static56.method1206("This is a non)2members*6nworld)3 To enjoy your*6nmembers benefits we*6nrecommend you play on a*6nmembers world instead)3");

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lclient!lc;")
	public static Class31 aClass31_633 = Static56.method1206("Click to continue");

	@OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
	public static int anInt1779 = 0;

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
	public static int anInt1780 = 0;

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_634 = Static56.method1206("wishes to duel with you)3");

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "Lclient!lc;")
	public static Class31 aClass31_635 = Static56.method1206("headicons_prayer");

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "[I")
	public static int[] anIntArray261 = new int[100];

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "[Lclient!lc;")
	public static Class31[] aClass31Array7 = new Class31[200];

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
	public static void method1131() {
		Static5.method115();
		Static7.method181();
		Static17.method526();
		Static28.method784();
		Static11.method354();
		Static30.method843();
		Static38.method990();
		Static37.method975();
		Static80.method634();
		Static54.method1167();
		Static2.method86();
		Static80.method661();
		((Class45) Static97.anInterface1_1).method1427();
		Static89.aClass11_Sub1_15.method346();
		Static64.aClass11_Sub1_3.method346();
		Static33.aClass11_Sub1_9.method346();
		Static55.aClass11_Sub1_12.method346();
		Static89.aClass11_Sub1_14.method346();
		Static21.aClass11_Sub1_7.method346();
		Static68.aClass11_Sub1_13.method346();
		Static11.aClass11_Sub1_1.method346();
		Static54.aClass11_Sub1_11.method346();
		Static37.aClass11_Sub1_10.method346();
		Static27.aClass11_Sub1_8.method346();
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
	public static void method1132() {
		Static12.method367();
		@Pc(20) int local20;
		@Pc(22) int local22;
		if (Static8.anInt288 == 2) {
			@Pc(14) int[] local14 = Static81.anIntArray373;
			@Pc(17) byte[] local17 = Static68.aClass2_Sub1_Sub3_Sub1_11.aByteArray7;
			local20 = local17.length;
			for (local22 = 0; local22 < local20; local22++) {
				if (local17[local22] == 0) {
					local14[local22] = 0;
				}
			}
			Static16.aClass2_Sub1_Sub3_Sub2_3.method461(0, 0, 33, 33, 25, 25, Static12.anInt542, 256, Static63.anIntArray297, Static68.anIntArray302);
			Static64.method417(Static18.aGraphics1);
			return;
		}
		@Pc(59) int local59 = Static12.anInt542 + Static106.anInt2795 & 0x7FF;
		@Pc(66) int local66 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 / 32 + 48;
		local20 = 464 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 / 32;
		Static100.aClass2_Sub1_Sub3_Sub2_7.method461(25, 5, 146, 151, local66, local20, local59, Static57.anInt2681 + 256, Static50.anIntArray73, Static18.anIntArray98);
		Static16.aClass2_Sub1_Sub3_Sub2_3.method461(0, 0, 33, 33, 25, 25, Static12.anInt542, 256, Static63.anIntArray297, Static68.anIntArray302);
		for (local22 = 0; local22 < Static68.anInt2206; local22++) {
			local20 = Static11.anIntArray75[local22] * 4 + 2 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 / 32;
			local66 = Static33.anIntArray170[local22] * 4 + 2 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 / 32;
			Static66.method1348(local66, Static59.aClass2_Sub1_Sub3_Sub2Array8[local22], local20);
		}
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 0; local147 < 104; local147++) {
			for (local151 = 0; local151 < 104; local151++) {
				@Pc(161) Class36 local161 = Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local147][local151];
				if (local161 != null) {
					local66 = local147 * 4 + 2 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 / 32;
					local20 = local151 * 4 + 2 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 / 32;
					Static66.method1348(local66, Static10.aClass2_Sub1_Sub3_Sub2Array2[0], local20);
				}
			}
		}
		for (local151 = 0; local151 < Static49.anInt2696; local151++) {
			@Pc(217) Class2_Sub1_Sub4_Sub6_Sub2 local217 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[Static57.anIntArray383[local151]];
			if (local217 != null && local217.method1270()) {
				@Pc(226) Class2_Sub1_Sub8 local226 = local217.aClass2_Sub1_Sub8_1;
				if (local226.anIntArray271 != null) {
					local226 = local226.method1189();
				}
				if (local226 != null && local226.aBoolean96 && local226.aBoolean94) {
					local66 = local217.anInt2006 / 32 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 / 32;
					local20 = local217.anInt2011 / 32 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 / 32;
					Static66.method1348(local66, Static10.aClass2_Sub1_Sub3_Sub2Array2[1], local20);
				}
			}
		}
		@Pc(283) Class2_Sub1_Sub4_Sub6_Sub1 local283;
		for (@Pc(275) int local275 = 0; local275 < Static21.anInt1007; local275++) {
			local283 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[Static78.anIntArray322[local275]];
			if (local283 != null && local283.method1270()) {
				local66 = local283.anInt2006 / 32 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 / 32;
				local20 = local283.anInt2011 / 32 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 / 32;
				@Pc(315) long local315 = local283.aClass31_612.method1201();
				@Pc(317) boolean local317 = false;
				for (@Pc(319) int local319 = 0; local319 < Static34.anInt1312; local319++) {
					if (local315 == Static45.aLongArray4[local319] && Static41.anIntArray246[local319] != 0) {
						local317 = true;
						break;
					}
				}
				@Pc(345) boolean local345 = false;
				if (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt1726 != 0 && local283.anInt1726 != 0 && local283.anInt1726 == Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt1726) {
					local345 = true;
				}
				if (local317) {
					Static66.method1348(local66, Static10.aClass2_Sub1_Sub3_Sub2Array2[3], local20);
				} else if (local345) {
					Static66.method1348(local66, Static10.aClass2_Sub1_Sub3_Sub2Array2[4], local20);
				} else {
					Static66.method1348(local66, Static10.aClass2_Sub1_Sub3_Sub2Array2[2], local20);
				}
			}
		}
		if (Static62.anInt2116 != 0 && Static49.anInt2694 % 20 < 10) {
			if (Static62.anInt2116 == 1 && Static61.anInt2099 >= 0 && Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1.length > Static61.anInt2099) {
				@Pc(424) Class2_Sub1_Sub4_Sub6_Sub2 local424 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[Static61.anInt2099];
				if (local424 != null) {
					local20 = local424.anInt2011 / 32 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 / 32;
					local66 = local424.anInt2006 / 32 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 / 32;
					Static53.method1153(Static79.aClass2_Sub1_Sub3_Sub2Array9[1], local20, local66);
				}
			}
			if (Static62.anInt2116 == 2) {
				local66 = (Static65.anInt2167 - Static25.anInt1103) * 4 + 2 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 / 32;
				local20 = (Static43.anInt1588 + -Static47.anInt1730) * 4 + 2 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 / 32;
				Static53.method1153(Static79.aClass2_Sub1_Sub3_Sub2Array9[1], local20, local66);
			}
			if (Static62.anInt2116 == 10 && anInt1780 >= 0 && anInt1780 < Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3.length) {
				local283 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[anInt1780];
				if (local283 != null) {
					local66 = local283.anInt2006 / 32 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 / 32;
					local20 = local283.anInt2011 / 32 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 / 32;
					Static53.method1153(Static79.aClass2_Sub1_Sub3_Sub2Array9[1], local20, local66);
				}
			}
		}
		if (Static85.anInt2509 != 0) {
			local20 = Static8.anInt302 * 4 + 2 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 / 32;
			local66 = Static85.anInt2509 * 4 + 2 - Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 / 32;
			Static66.method1348(local66, Static79.aClass2_Sub1_Sub3_Sub2Array9[0], local20);
		}
		Static81.method1646(97, 78, 3, 3, 16777215);
		Static64.method417(Static18.aGraphics1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Lclient!lc;")
	public static Class31 method1133(@OriginalArg(1) int arg0) {
		@Pc(14) Class31 local14 = Static89.method1499(arg0);
		for (@Pc(20) int local20 = local14.method1223() - 3; local20 > 0; local20 -= 3) {
			local14 = Static37.method974(new Class31[] { local14.method1213(local20, 0), Static14.aClass31_194, local14.method1222(local20) });
		}
		if (local14.method1223() > 8) {
			local14 = Static37.method974(new Class31[] { Static83.aClass31_808, local14.method1213(local14.method1223() - 8, 0), Static86.aClass31_812, local14, Static93.aClass31_870 });
		} else if (local14.method1223() > 4) {
			local14 = Static37.method974(new Class31[] { Static50.aClass31_161, local14.method1213(local14.method1223() - 4, 0), Static43.aClass31_578, local14, Static93.aClass31_870 });
		}
		return Static37.method974(new Class31[] { Static34.aClass31_449, local14 });
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z")
	public static boolean method1134(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static63.anIntArray296[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 9;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
	public static void method1135() {
		aClass31_634 = null;
		aClass35_1 = null;
		aClass42_1 = null;
		aClass2_Sub1_Sub3_Sub1Array2 = null;
		aClass31_632 = null;
		anIntArray261 = null;
		aClass31_635 = null;
		aClass31_633 = null;
		aClass51_2 = null;
		aClass31Array7 = null;
	}
}
