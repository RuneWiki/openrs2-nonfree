import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
	public static int anInt1581;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3 = new int[4][105][105];

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "[I")
	public static int[] anIntArray235 = new int[32];

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "Lclient!r;")
	public static Class61 aClass61_492 = null;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "Lclient!ef;")
	public static Class20 aClass20_7 = new Class20(32);

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "Lclient!ge;")
	public static Class29 aClass29_17 = new Class29(50);

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "Lclient!r;")
	public static Class61 aClass61_493 = Static129.method2060("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	public static int anInt1587 = 0;

	@OriginalMember(owner = "client!kc", name = "bb", descriptor = "Lclient!r;")
	public static Class61 aClass61_494 = Static129.method2060("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lclient!r;")
	public static Class61 aClass61_495 = Static129.method2060("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!kc", name = "db", descriptor = "Lclient!r;")
	public static Class61 aClass61_496 = Static129.method2060("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public static void method1101() {
		@Pc(5) int local5 = Static68.anInt1692 * 128 + 64;
		@Pc(15) int local15 = Static44.anInt1142 * 128 + 64;
		@Pc(24) int local24 = Static42.method757(Static93.anInt2428, local5, local15) - Static80.anInt2044;
		if (local5 > Static22.anInt683) {
			Static22.anInt683 += Static87.anInt2340 * (local5 - Static22.anInt683) / 1000 + Static98.anInt2562;
			if (Static22.anInt683 > local5) {
				Static22.anInt683 = local5;
			}
		}
		if (local24 > Static78.anInt1986) {
			Static78.anInt1986 += Static98.anInt2562 + Static87.anInt2340 * (local24 - Static78.anInt1986) / 1000;
			if (Static78.anInt1986 > local24) {
				Static78.anInt1986 = local24;
			}
		}
		if (Static22.anInt683 > local5) {
			Static22.anInt683 -= Static98.anInt2562 + Static87.anInt2340 * (Static22.anInt683 - local5) / 1000;
			if (local5 > Static22.anInt683) {
				Static22.anInt683 = local5;
			}
		}
		if (Static78.anInt1986 > local24) {
			Static78.anInt1986 -= Static87.anInt2340 * (Static78.anInt1986 - local24) / 1000 + Static98.anInt2562;
			if (Static78.anInt1986 < local24) {
				Static78.anInt1986 = local24;
			}
		}
		local5 = Static100.anInt2601 * 128 + 64;
		if (local15 > Static40.anInt1074) {
			Static40.anInt1074 += Static98.anInt2562 + Static87.anInt2340 * (local15 - Static40.anInt1074) / 1000;
			if (local15 < Static40.anInt1074) {
				Static40.anInt1074 = local15;
			}
		}
		if (local15 < Static40.anInt1074) {
			Static40.anInt1074 -= (Static40.anInt1074 - local15) * Static87.anInt2340 / 1000 + Static98.anInt2562;
			if (Static40.anInt1074 < local15) {
				Static40.anInt1074 = local15;
			}
		}
		local15 = Static16.anInt492 * 128 + 64;
		local24 = Static42.method757(Static93.anInt2428, local5, local15) - Static9.anInt225;
		@Pc(198) int local198 = local24 - Static78.anInt1986;
		@Pc(203) int local203 = local15 - Static40.anInt1074;
		@Pc(207) int local207 = local5 - Static22.anInt683;
		@Pc(218) int local218 = (int) Math.sqrt((double) (local203 * local203 + local207 * local207));
		@Pc(229) int local229 = (int) (Math.atan2((double) local198, (double) local218) * 325.949D) & 0x7FF;
		if (local229 < 128) {
			local229 = 128;
		}
		if (local229 > 383) {
			local229 = 383;
		}
		@Pc(260) int local260 = (int) (Math.atan2((double) local207, (double) local203) * -325.949D) & 0x7FF;
		@Pc(265) int local265 = local260 - Static1.anInt15;
		if (local229 > Static78.anInt1985) {
			Static78.anInt1985 += Static57.anInt1413 + Static30.anInt923 * (local229 - Static78.anInt1985) / 1000;
			if (local229 < Static78.anInt1985) {
				Static78.anInt1985 = local229;
			}
		}
		if (local265 > 1024) {
			local265 -= 2048;
		}
		if (Static78.anInt1985 > local229) {
			Static78.anInt1985 -= Static57.anInt1413 + (Static78.anInt1985 - local229) * Static30.anInt923 / 1000;
			if (local229 > Static78.anInt1985) {
				Static78.anInt1985 = local229;
			}
		}
		if (local265 < -1024) {
			local265 += 2048;
		}
		if (local265 > 0) {
			Static1.anInt15 += Static57.anInt1413 + local265 * Static30.anInt923 / 1000;
			Static1.anInt15 &= 0x7FF;
		}
		if (local265 < 0) {
			Static1.anInt15 -= Static57.anInt1413 + Static30.anInt923 * -local265 / 1000;
			Static1.anInt15 &= 0x7FF;
		}
		@Pc(371) int local371 = local260 - Static1.anInt15;
		if (local371 > 1024) {
			local371 -= 2048;
		}
		if (local371 < -1024) {
			local371 += 2048;
		}
		if (local371 < 0 && local265 > 0 || local371 > 0 && local265 < 0) {
			Static1.anInt15 = local260;
		}
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
	public static void method1102() {
		Static1.aClass5_Sub14_Sub1_1.method1489(47);
		Static1.aClass5_Sub14_Sub1_1.method1464(0L);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ff;Lclient!ff;ILjava/awt/Component;)V")
	public static void method1103(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(3) Component arg2) {
		if (Static44.aBoolean37) {
			return;
		}
		Static46.method1994();
		@Pc(15) byte[] local15 = arg0.method1027(Static113.aClass61_888, Static112.aClass61_882);
		Static54.aClass5_Sub2_Sub1_Sub4_4 = new Class5_Sub2_Sub1_Sub4(local15, arg2);
		Static25.aClass5_Sub2_Sub1_Sub4_2 = Static54.aClass5_Sub2_Sub1_Sub4_4.method2022();
		Static20.aClass5_Sub2_Sub1_Sub3_1 = Static68.method1135(Static112.aClass61_882, arg1, Static109.aClass61_841);
		Static82.aClass5_Sub2_Sub1_Sub3_5 = Static68.method1135(Static112.aClass61_882, arg1, Static8.aClass61_77);
		Static22.aClass5_Sub2_Sub1_Sub3_2 = Static68.method1135(Static112.aClass61_882, arg1, Static103.aClass61_805);
		Static105.aClass5_Sub2_Sub1_Sub3Array42 = Static23.method499(Static112.aClass61_882, arg1, Static26.aClass61_180);
		Static12.aClass5_Sub2_Sub1_Sub3Array7 = Static23.method499(Static112.aClass61_882, arg1, Static57.aClass61_445);
		Static107.anIntArray338 = new int[256];
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			Static107.anIntArray338[local61] = local61 * 262144;
		}
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			Static107.anIntArray338[local75 + 64] = local75 * 1024 + 16711680;
		}
		for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
			Static107.anIntArray338[local96 + 128] = local96 * 4 + 16776960;
		}
		for (@Pc(115) int local115 = 0; local115 < 64; local115++) {
			Static107.anIntArray338[local115 + 192] = 16777215;
		}
		Static55.anIntArray208 = new int[256];
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			Static55.anIntArray208[local132] = local132 * 1024;
		}
		for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
			Static55.anIntArray208[local148 + 64] = local148 * 4 + 65280;
		}
		for (@Pc(168) int local168 = 0; local168 < 64; local168++) {
			Static55.anIntArray208[local168 + 128] = local168 * 262144 + 65535;
		}
		for (@Pc(186) int local186 = 0; local186 < 64; local186++) {
			Static55.anIntArray208[local186 + 192] = 16777215;
		}
		Static43.anIntArray180 = new int[256];
		for (@Pc(203) int local203 = 0; local203 < 64; local203++) {
			Static43.anIntArray180[local203] = local203 * 4;
		}
		for (@Pc(217) int local217 = 0; local217 < 64; local217++) {
			Static43.anIntArray180[local217 + 64] = local217 * 262144 + 255;
		}
		for (@Pc(235) int local235 = 0; local235 < 64; local235++) {
			Static43.anIntArray180[local235 + 128] = local235 * 1024 + 16711935;
		}
		for (@Pc(255) int local255 = 0; local255 < 64; local255++) {
			Static43.anIntArray180[local255 + 192] = 16777215;
		}
		Static39.anIntArray174 = new int[32768];
		Static85.anIntArray293 = new int[256];
		Static25.anIntArray127 = new int[32768];
		Static59.method1017(null);
		Static112.aClass61_881 = Static112.aClass61_882;
		Static112.aClass61_880 = Static112.aClass61_882;
		if (Static52.anInt1345 == 0) {
			Static41.aBoolean80 = true;
		} else {
			Static41.aBoolean80 = false;
		}
		Static95.aBoolean86 = false;
		Static32.anIntArray154 = new int[32768];
		Static2.anInt22 = 0;
		Static133.anIntArray448 = new int[32768];
		if (Static41.aBoolean80) {
			Static11.method203();
		} else {
			Static39.method731(Static42.aClass26_Sub1_6, Static112.aClass61_882, Static90.aClass61_699);
		}
		Static34.method678(false);
		Static44.aBoolean37 = true;
		Static54.aClass5_Sub2_Sub1_Sub4_4.method2026(0, 0);
		Static25.aClass5_Sub2_Sub1_Sub4_2.method2026(382, 0);
		Static20.aClass5_Sub2_Sub1_Sub3_1.method1354(382 - Static20.aClass5_Sub2_Sub1_Sub3_1.anInt2091 / 2, 18);
		Static32.aClass5_Sub2_Sub1_Sub4_3 = new Class5_Sub2_Sub1_Sub4(128, 254);
		Static97.aClass5_Sub2_Sub1_Sub4_6 = new Class5_Sub2_Sub1_Sub4(128, 254);
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
	public static void method1104() {
		aClass61_494 = null;
		anIntArrayArrayArray3 = null;
		aClass61_493 = null;
		aClass20_7 = null;
		aClass61_492 = null;
		aClass61_495 = null;
		aClass29_17 = null;
		aClass61_496 = null;
		anIntArray235 = null;
	}
}
