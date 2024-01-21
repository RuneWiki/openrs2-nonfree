import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!fb;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_11;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!gf;")
	public static Class5_Sub8 aClass5_Sub8_1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_314 = Static63.method1251("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[Lclient!mb;")
	public static Class45[] aClass45Array7 = new Class45[200];

	@OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
	public static int[] anIntArray114 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!mb;")
	private static Class45 aClass45_319 = Static63.method1251("Enter name of player to add to list");

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_315 = aClass45_319;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_316 = Static63.method1251("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!de", name = "m", descriptor = "I")
	public static int anInt696 = 0;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_317 = Static63.method1251("headicons_prayer");

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Z")
	public static boolean aBoolean31 = true;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Lclient!mb;")
	public static Class45 aClass45_318 = Static63.method1251("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Lclient!mb;")
	public static Class45 aClass45_320 = Static63.method1251("redstone1");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!sd;I)Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3 method438(@OriginalArg(0) int arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) int arg2) {
		return Static106.method1918(arg2, arg1, arg0) ? Static51.method1124() : null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public static void method439() {
		aClass45_315 = null;
		aClass23_1 = null;
		aClass45_320 = null;
		aClass45Array7 = null;
		aClass45_318 = null;
		aClass45_314 = null;
		anIntArray114 = null;
		aClass5_Sub8_1 = null;
		aClass45_317 = null;
		aClass45_316 = null;
		aClass29_Sub1_11 = null;
		aClass45_319 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method440() {
		if (Static103.aBoolean122 && Static99.anInt2657 != Static8.anInt262) {
			Static44.method949(Static42.anInt803, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], Static8.anInt262, Static41.anInt2257);
		} else if (Static8.anInt262 != Static102.anInt2754) {
			Static102.anInt2754 = Static8.anInt262;
			Static33.method683(Static8.anInt262);
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method441() {
		if (Static19.aBoolean26) {
			Static104.method1900();
			Static19.aBoolean26 = false;
			Static1.method7();
			Static78.aBoolean102 = true;
			Static96.aBoolean121 = true;
			Static51.aBoolean81 = true;
			Static72.aBoolean99 = true;
		}
		Static35.method698();
		if (Static2.aBoolean2 && Static97.anInt2635 == 1) {
			Static72.aBoolean99 = true;
		}
		@Pc(36) boolean local36;
		if (Static72.anInt2162 != -1) {
			local36 = Static27.method613(Static72.anInt2162);
			if (local36) {
				Static72.aBoolean99 = true;
			}
		}
		if (Static28.anInt879 == 2) {
			Static72.aBoolean99 = true;
		}
		if (Static96.anInt2617 == 2) {
			Static72.aBoolean99 = true;
		}
		if (Static72.aBoolean99) {
			Static72.aBoolean99 = false;
			Static32.method680();
		}
		@Pc(103) int local103;
		if (Static67.anInt1909 == -1) {
			Static77.aClass5_Sub2_Sub8_4.anInt1244 = Static44.anInt1239 - Static44.anInt1253 - 77;
			if (Static14.anInt425 > 17 && Static14.anInt425 < 560 && Static47.anInt1354 > 332) {
				Static62.method1229(Static47.anInt1354 - 357, 463, Static44.anInt1239, -1, 77, Static14.anInt425 - 17, Static77.aClass5_Sub2_Sub8_4, 0);
			}
			local103 = Static44.anInt1239 - Static77.aClass5_Sub2_Sub8_4.anInt1244 - 77;
			if (local103 < 0) {
				local103 = 0;
			}
			if (local103 > Static44.anInt1239 - 77) {
				local103 = Static44.anInt1239 - 77;
			}
			if (local103 != Static44.anInt1253) {
				Static51.aBoolean81 = true;
				Static44.anInt1253 = local103;
			}
		}
		if (Static67.anInt1909 == -1 && Static75.anInt2178 == 3) {
			Static77.aClass5_Sub2_Sub8_4.anInt1244 = Static41.anInt2256;
			local103 = Static88.anInt2502 * 14 + 7;
			if (Static14.anInt425 > 17 && Static14.anInt425 < 560 && Static47.anInt1354 > 332) {
				Static62.method1229(Static47.anInt1354 - 357, 463, local103, -1, 77, Static14.anInt425 - 17, Static77.aClass5_Sub2_Sub8_4, 0);
			}
			@Pc(173) int local173 = Static77.aClass5_Sub2_Sub8_4.anInt1244;
			if (local173 < 0) {
				local173 = 0;
			}
			if (local103 - 77 < local173) {
				local173 = local103 - 77;
			}
			if (local173 != Static41.anInt2256) {
				Static41.anInt2256 = local173;
				Static51.aBoolean81 = true;
			}
		}
		if (Static67.anInt1909 != -1) {
			local36 = Static27.method613(Static67.anInt1909);
			if (local36) {
				Static51.aBoolean81 = true;
			}
		}
		if (Static28.anInt879 == 3) {
			Static51.aBoolean81 = true;
		}
		if (Static96.anInt2617 == 3) {
			Static51.aBoolean81 = true;
		}
		if (Static53.aClass45_1006 != null) {
			Static51.aBoolean81 = true;
		}
		if (Static2.aBoolean2 && Static97.anInt2635 == 2) {
			Static51.aBoolean81 = true;
		}
		if (Static51.aBoolean81) {
			Static51.aBoolean81 = false;
			Static39.method1412();
		}
		method442();
		if (Static107.anInt2801 != -1) {
			Static78.aBoolean102 = true;
		}
		if (Static78.aBoolean102) {
			if (Static107.anInt2801 != -1 && Static107.anInt2801 == Static53.anInt2372) {
				Static107.anInt2801 = -1;
				Static64.aClass5_Sub9_Sub1_2.method1466(2);
				Static64.aClass5_Sub9_Sub1_2.method1428(Static53.anInt2372);
			}
			Static77.aBoolean101 = true;
			Static78.aBoolean102 = false;
			Static17.method322(Static57.anIntArray262, Static53.anInt2372, Static3.anInt94 % 20 >= 10 ? Static107.anInt2801 : -1, Static72.anInt2162 == -1);
		}
		if (Static96.aBoolean121) {
			Static77.aBoolean101 = true;
			Static96.aBoolean121 = false;
			Static49.method1104(Static78.aClass5_Sub2_Sub6_Sub1_5, Static71.anInt2080, Static70.anInt2023, Static36.anInt1058);
		}
		Static99.method1821(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428, Static90.anInt2533, Static8.anInt262);
		Static90.anInt2533 = 0;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	private static void method442() {
		Static104.method1900();
		Static53.method1610();
		@Pc(21) int local21;
		@Pc(23) int local23;
		if (Static51.anInt1621 == 2 || Static51.anInt1621 == 5) {
			@Pc(16) byte[] local16 = Static117.aClass5_Sub2_Sub6_Sub4_49.aByteArray37;
			@Pc(18) int[] local18 = Static118.anIntArray414;
			local21 = local16.length;
			for (local23 = 0; local23 < local21; local23++) {
				if (local16[local23] == 0) {
					local18[local23] = 0;
				}
			}
			if (Static51.anInt1621 < 3) {
				Static108.aClass5_Sub2_Sub6_Sub3_6.method1763(0, 0, 33, 33, 25, 25, Static112.anInt2981, 256, Static66.anIntArray291, Static48.anIntArray244);
			}
			Static79.method1501();
			return;
		}
		@Pc(65) int local65 = Static112.anInt2981 + Static100.anInt2699 & 0x7FF;
		local21 = 464 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 / 32;
		@Pc(81) int local81 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 / 32 + 48;
		Static84.aClass5_Sub2_Sub6_Sub3_2.method1763(25, 5, 146, 151, local81, local21, local65, Static4.anInt98 + 256, Static108.anIntArray432, Static57.anIntArray261);
		for (local23 = 0; local23 < Static50.anInt1606; local23++) {
			local81 = Static16.anIntArray70[local23] * 4 + 2 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 / 32;
			local21 = Static89.anIntArray367[local23] * 4 + 2 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 / 32;
			Static69.method1355(local81, local21, Static119.aClass5_Sub2_Sub6_Sub3Array11[local23]);
		}
		@Pc(142) int local142;
		for (@Pc(139) int local139 = 0; local139 < 104; local139++) {
			for (local142 = 0; local142 < 104; local142++) {
				@Pc(151) Class10 local151 = Static30.aClass10ArrayArrayArray2[Static8.anInt262][local139][local142];
				if (local151 != null) {
					local21 = local142 * 4 + 2 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 / 32;
					local81 = local139 * 4 + 2 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 / 32;
					Static69.method1355(local81, local21, Static110.aClass5_Sub2_Sub6_Sub3Array9[0]);
				}
			}
		}
		for (local142 = 0; local142 < Static62.anInt1819; local142++) {
			@Pc(205) Class5_Sub2_Sub4_Sub3_Sub2 local205 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[Static70.anIntArray297[local142]];
			if (local205 != null && local205.method1614()) {
				@Pc(214) Class5_Sub2_Sub17 local214 = local205.aClass5_Sub2_Sub17_1;
				if (local214 != null && local214.anIntArray479 != null) {
					local214 = local214.method2122();
				}
				if (local214 != null && local214.aBoolean136 && local214.aBoolean133) {
					local81 = local205.anInt2428 / 32 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 / 32;
					local21 = local205.anInt2417 / 32 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 / 32;
					Static69.method1355(local81, local21, Static110.aClass5_Sub2_Sub6_Sub3Array9[1]);
				}
			}
		}
		@Pc(314) int local314;
		@Pc(277) Class5_Sub2_Sub4_Sub3_Sub1 local277;
		for (@Pc(270) int local270 = 0; local270 < Static56.anInt1694; local270++) {
			local277 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[Static64.anIntArray283[local270]];
			if (local277 != null && local277.method1614()) {
				local21 = local277.anInt2417 / 32 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 / 32;
				@Pc(296) boolean local296 = false;
				local81 = local277.anInt2428 / 32 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 / 32;
				@Pc(312) long local312 = local277.aClass45_629.method1299();
				for (local314 = 0; local314 < Static104.anInt2772; local314++) {
					if (Static23.aLongArray1[local314] == local312 && Static56.anIntArray257[local314] != 0) {
						local296 = true;
						break;
					}
				}
				@Pc(341) boolean local341 = false;
				if (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt1577 != 0 && local277.anInt1577 != 0 && local277.anInt1577 == Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt1577) {
					local341 = true;
				}
				if (local296) {
					Static69.method1355(local81, local21, Static110.aClass5_Sub2_Sub6_Sub3Array9[3]);
				} else if (local341) {
					Static69.method1355(local81, local21, Static110.aClass5_Sub2_Sub6_Sub3Array9[4]);
				} else {
					Static69.method1355(local81, local21, Static110.aClass5_Sub2_Sub6_Sub3Array9[2]);
				}
			}
		}
		if (Static11.anInt365 != 0 && Static3.anInt94 % 20 < 10) {
			if (Static11.anInt365 == 1 && Static29.anInt888 >= 0 && Static29.anInt888 < Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1.length) {
				@Pc(417) Class5_Sub2_Sub4_Sub3_Sub2 local417 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[Static29.anInt888];
				if (local417 != null) {
					local81 = local417.anInt2428 / 32 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 / 32;
					local21 = local417.anInt2417 / 32 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 / 32;
					Static105.method1906(local81, local21, Static72.aClass5_Sub2_Sub6_Sub3Array5[1]);
				}
			}
			if (Static11.anInt365 == 2) {
				local21 = (Static110.anInt2891 - Static6.anInt162) * 4 + 2 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 / 32;
				local81 = (Static56.anInt1697 - Static78.anInt2210) * 4 + 2 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 / 32;
				Static105.method1906(local81, local21, Static72.aClass5_Sub2_Sub6_Sub3Array5[1]);
			}
			if (Static11.anInt365 == 10 && Static77.anInt2201 >= 0 && Static77.anInt2201 < Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1.length) {
				local277 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[Static77.anInt2201];
				if (local277 != null) {
					local21 = local277.anInt2417 / 32 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 / 32;
					local81 = local277.anInt2428 / 32 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 / 32;
					Static105.method1906(local81, local21, Static72.aClass5_Sub2_Sub6_Sub3Array5[1]);
				}
			}
		}
		if (Static1.anInt6 != 0) {
			local21 = Static31.anInt924 * 4 + 2 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 / 32;
			local81 = Static1.anInt6 * 4 + 2 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 / 32;
			Static69.method1355(local81, local21, Static72.aClass5_Sub2_Sub6_Sub3Array5[0]);
		}
		Static118.method1858(97, 78, 3, 3, 16777215);
		if (Static51.anInt1621 >= 3) {
			@Pc(579) byte[] local579 = Static117.aClass5_Sub2_Sub6_Sub4_49.aByteArray37;
			@Pc(581) int[] local581 = Static118.anIntArray414;
			for (@Pc(583) int local583 = 0; local583 <= 33; local583++) {
				@Pc(589) int local589 = Static117.aClass5_Sub2_Sub6_Sub4_49.anInt2731 * local583;
				for (local314 = 0; local314 <= 33; local314++) {
					if (local579[local314 + local589] == 0) {
						local581[local314 + local589] = 0;
					}
				}
			}
		} else {
			Static108.aClass5_Sub2_Sub6_Sub3_6.method1763(0, 0, 33, 33, 25, 25, Static112.anInt2981, 256, Static66.anIntArray291, Static48.anIntArray244);
		}
		Static79.method1501();
	}
}
