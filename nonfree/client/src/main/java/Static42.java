import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Lclient!qa;")
	public static Class2_Sub1_Sub1_Sub4_Sub2 aClass2_Sub1_Sub1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	public static int anInt1256;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
	public static int anInt1257;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!va;")
	public static Class2_Sub1_Sub17 aClass2_Sub1_Sub17_2;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_460 = Static2.method59("backvmid3");

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_461 = Static2.method59("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_462 = Static2.method59("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!i;")
	public static Class32 aClass32_24 = new Class32(20);

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	public static int anInt1250 = 10;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_463 = Static2.method59("An:");

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!wd;")
	private static Class80 aClass80_468 = Static2.method59("Trade)4compete");

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_464 = aClass80_468;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_465 = Static2.method59("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!wd;")
	public static Class80 aClass80_466 = Static2.method59("Hidden)2use");

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!wd;")
	public static Class80 aClass80_467 = Static2.method59("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!wd;")
	public static Class80 aClass80_469 = Static2.method59("Einloggen");

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
	public static int anInt1258 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!va;I)Lclient!wd;")
	public static Class80 method680(@OriginalArg(1) Class2_Sub1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (!Static85.method1262(Static102.method1660(arg0), arg1)) {
			return null;
		} else if (arg0.aClass80Array18 == null || arg0.aClass80Array18.length <= arg1 || arg0.aClass80Array18[arg1] == null || arg0.aClass80Array18[arg1].method2026().method1999() == 0) {
			return Static97.aBoolean188 ? Static93.method1444(new Class80[] { Static107.aClass80_1072, Static28.method1422(arg1) }) : null;
		} else {
			return arg0.aClass80Array18[arg1];
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method681() {
		aClass2_Sub1_Sub1_Sub4_Sub2_1 = null;
		aClass80_464 = null;
		aClass80_461 = null;
		aClass80_467 = null;
		aClass32_24 = null;
		aClass80_468 = null;
		aClass80_462 = null;
		aClass80_460 = null;
		aClass2_Sub1_Sub17_2 = null;
		aClass80_466 = null;
		aClass80_469 = null;
		aClass80_465 = null;
		aClass80_463 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z")
	public static boolean method682() {
		try {
			if (Static17.anInt650 == 2) {
				if (Static113.aClass2_Sub7_1 == null) {
					Static113.aClass2_Sub7_1 = Static130.method1090(Static5.aClass11_4, Static64.anInt1819, Static57.anInt1739);
					if (Static113.aClass2_Sub7_1 == null) {
						return false;
					}
				}
				if (Static126.aClass55_1 == null) {
					Static126.aClass55_1 = new Class55(Static37.aClass11_21, Static17.aClass11_13);
				}
				if (Static44.aClass2_Sub2_Sub3_2.method1392(Static113.aClass2_Sub7_1, Static119.aClass11_25, Static126.aClass55_1)) {
					Static44.aClass2_Sub2_Sub3_2.method1362();
					Static44.aClass2_Sub2_Sub3_2.method1389(Static35.anInt1172);
					Static44.aClass2_Sub2_Sub3_2.method1367(Static107.aBoolean212, Static113.aClass2_Sub7_1);
					Static5.aClass11_4 = null;
					Static17.anInt650 = 0;
					Static126.aClass55_1 = null;
					Static113.aClass2_Sub7_1 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static44.aClass2_Sub2_Sub3_2.method1379();
			Static113.aClass2_Sub7_1 = null;
			Static126.aClass55_1 = null;
			Static5.aClass11_4 = null;
			Static17.anInt650 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 method683() {
		@Pc(7) Class2_Sub1_Sub9_Sub3 local7 = new Class2_Sub1_Sub9_Sub3();
		local7.anInt2487 = Static93.anIntArray314[0];
		local7.anInt2482 = Static86.anIntArray280[0];
		local7.aByteArray34 = Static9.aByteArrayArray2[0];
		local7.anIntArray322 = Static14.anIntArray65;
		local7.anInt2483 = Static16.anInt442;
		local7.anInt2484 = Static40.anIntArray154[0];
		local7.anInt2485 = Static95.anIntArray318[0];
		local7.anInt2486 = Static111.anInt3002;
		Static35.method624();
		return local7;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ff;Lclient!wd;BLclient!wd;)Lclient!v;")
	public static Class2_Sub1_Sub9_Sub4 method684(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(3) Class80 arg2) {
		@Pc(13) int local13 = arg0.method378(arg2);
		@Pc(19) int local19 = arg0.method391(local13, arg1);
		return Static2.method63(local19, arg0, local13);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public static void method685() {
		Static51.method892(Static91.anInt2232);
		if (Static121.anInt3090 != -1) {
			Static51.method892(Static121.anInt3090);
		}
		Static106.anInt2840 = 0;
		Static38.aClass22_7.method1068();
		Static52.method929();
		Static99.method1900();
		Static125.method1778(Static91.anInt2232, 765, 0, 503);
		if (Static121.anInt3090 != -1) {
			Static125.method1778(Static121.anInt3090, 765, 0, 503);
		}
		if (Static122.aBoolean241) {
			Static112.method1848();
		} else {
			Static39.method379();
			Static85.method1257();
		}
		try {
			@Pc(57) Graphics local57 = Static119.aCanvas2.getGraphics();
			Static38.aClass22_7.method1065(local57, 0, 0);
		} catch (@Pc(65) Exception local65) {
			Static119.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Z")
	public static boolean method686(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static57.anIntArray218[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 21;
	}
}
