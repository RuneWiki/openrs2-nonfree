import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_6;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_5;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "[Lclient!ia;")
	public static Class27[] aClass27Array1 = new Class27[16];

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_638 = Static6.method100("Hidden)2");

	@OriginalMember(owner = "client!h", name = "k", descriptor = "[I")
	public static int[] anIntArray133 = new int[1000];

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_639 = Static6.method100("0(U");

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!he;")
	public static Class26 aClass26_640 = Static6.method100("AUS");

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Lclient!he;")
	private static Class26 aClass26_644 = Static6.method100("Choose Option");

	@OriginalMember(owner = "client!h", name = "q", descriptor = "Lclient!he;")
	public static Class26 aClass26_641 = aClass26_644;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!he;")
	private static Class26 aClass26_645 = Static6.method100("Drop");

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!he;")
	public static Class26 aClass26_642 = aClass26_645;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!he;")
	public static Class26 aClass26_643 = Static6.method100(":assistreq:");

	@OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
	public static int[] anIntArray134 = new int[100];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method771() {
		if (!Static109.aBoolean162) {
			Static56.aClass26Array13[0] = Static132.aClass26_1814;
			Static132.anIntArray411[0] = 1007;
			Static56.anInt1695 = 1;
			Static29.aClass26Array7[0] = Static22.aClass26_415;
		}
		if (Static32.anInt1048 != -1) {
			Static21.method476(Static32.anInt1048);
		}
		for (@Pc(26) int local26 = 0; local26 < Static15.anInt403; local26++) {
			if (Static72.aBooleanArray19[local26]) {
				Static28.aBooleanArray9[local26] = true;
			}
			Static36.aBooleanArray12[local26] = Static72.aBooleanArray19[local26];
			Static72.aBooleanArray19[local26] = false;
		}
		Static33.anInt1078 = Static4.anInt136;
		Static73.anInt2074 = -1;
		Static66.aClass3_Sub14_12 = null;
		Static64.anInt1935 = -1;
		if (Static32.anInt1048 != -1) {
			Static15.anInt403 = 0;
			Static4.method65(503, 0, 765, -1, 0, 0, 0, Static32.anInt1048);
		}
		Static77.method2225();
		Static98.method1800();
		if (Static109.aBoolean162) {
			Static25.method2161();
		} else if (Static73.anInt2074 != -1) {
			Static23.method882(Static64.anInt1935, Static73.anInt2074);
		}
		if (Static87.anInt2437 == 3) {
			for (@Pc(110) int local110 = 0; local110 < Static15.anInt403; local110++) {
				if (Static36.aBooleanArray12[local110]) {
					Static77.method2224(anIntArray134[local110], Static66.anIntArray296[local110], Static125.anIntArray386[local110], Static31.anIntArray328[local110], 16711935, 128);
				} else if (Static28.aBooleanArray9[local110]) {
					Static77.method2224(anIntArray134[local110], Static66.anIntArray296[local110], Static125.anIntArray386[local110], Static31.anIntArray328[local110], 16711680, 128);
				}
			}
		}
		Static27.method584(Static132.anInt3270, Static42.anInt1304, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733);
		Static42.anInt1304 = 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
	public static void method772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static49.anInt1587 == 1) {
			Static12.aClass3_Sub1_Sub4_Sub3Array1[Static17.anInt428 / 100].method1758(Static93.anInt2538 - 8, Static2.anInt18 + -8);
		}
		if (Static49.anInt1587 == 2) {
			Static12.aClass3_Sub1_Sub4_Sub3Array1[Static17.anInt428 / 100 + 4].method1758(Static93.anInt2538 - 8, Static2.anInt18 + -8);
		}
		Static23.method878();
		if (!Static63.aBoolean99) {
			return;
		}
		@Pc(51) int local51 = arg1 + 512 - 5;
		@Pc(55) int local55 = arg2 + 20;
		@Pc(57) int local57 = 16776960;
		Static91.aClass3_Sub1_Sub4_Sub2_Sub1_3.method1597(Static119.method2136(new Class26[] { Static132.aClass26_1816, Static122.method2170(Static121.anInt3167) }), local51, local55, 16776960, -1);
		@Pc(80) int local80 = local55 + 15;
		@Pc(82) Runtime local82 = Runtime.getRuntime();
		@Pc(92) int local92 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
		if (local92 > 32768 && Static98.aBoolean151) {
			local57 = 16711680;
		}
		if (local92 > 65536 && !Static98.aBoolean151) {
			local57 = 16711680;
		}
		Static91.aClass3_Sub1_Sub4_Sub2_Sub1_3.method1597(Static119.method2136(new Class26[] { Static69.aClass26_1334, Static122.method2170(local92), Static29.aClass26_480 }), local51, local80, local57, -1);
		local55 = local80 + 15;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method773() {
		if (Static95.aBooleanArray24[98]) {
			Static81.anInt2238 += (12 - Static81.anInt2238) / 2;
		} else if (Static95.aBooleanArray24[99]) {
			Static81.anInt2238 += (-Static81.anInt2238 - 12) / 2;
		} else {
			Static81.anInt2238 /= 2;
		}
		if (Static95.aBooleanArray24[96]) {
			Static126.anInt3217 += (-Static126.anInt3217 - 24) / 2;
		} else if (Static95.aBooleanArray24[97]) {
			Static126.anInt3217 += (24 - Static126.anInt3217) / 2;
		} else {
			Static126.anInt3217 /= 2;
		}
		@Pc(78) int local78 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 + Static36.anInt1196;
		Static1.anInt5 += Static81.anInt2238 / 2;
		if (Static1.anInt5 < 128) {
			Static1.anInt5 = 128;
		}
		Static78.anInt2107 = Static78.anInt2107 + Static126.anInt3217 / 2 & 0x7FF;
		@Pc(111) int local111 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 + Static117.anInt3069;
		if (Static99.anInt2754 - local111 < -500 || Static99.anInt2754 - local111 > 500 || Static85.anInt2342 - local78 < -500 || Static85.anInt2342 - local78 > 500) {
			Static99.anInt2754 = local111;
			Static85.anInt2342 = local78;
		}
		if (local78 != Static85.anInt2342) {
			Static85.anInt2342 += (local78 - Static85.anInt2342) / 16;
		}
		if (local111 != Static99.anInt2754) {
			Static99.anInt2754 += (local111 - Static99.anInt2754) / 16;
		}
		if (Static1.anInt5 > 383) {
			Static1.anInt5 = 383;
		}
		@Pc(174) int local174 = 0;
		@Pc(178) int local178 = Static85.anInt2342 >> 7;
		@Pc(182) int local182 = Static99.anInt2754 >> 7;
		@Pc(188) int local188 = Static110.method2006(Static99.anInt2754, Static85.anInt2342, Static132.anInt3270);
		@Pc(210) int local210;
		if (local182 > 3 && local178 > 3 && local182 < 100 && local178 < 100) {
			for (local210 = local182 - 4; local210 <= local182 + 4; local210++) {
				for (@Pc(216) int local216 = local178 - 4; local216 <= local178 + 4; local216++) {
					@Pc(220) int local220 = Static132.anInt3270;
					if (local220 < 3 && (Static74.aByteArrayArrayArray5[1][local210][local216] & 0x2) == 2) {
						local220++;
					}
					@Pc(248) int local248 = local188 - Static117.anIntArrayArrayArray6[local220][local210][local216];
					if (local174 < local248) {
						local174 = local248;
					}
				}
			}
		}
		local210 = local174 * 192;
		if (local210 > 98048) {
			local210 = 98048;
		}
		if (local210 < 32768) {
			local210 = 32768;
		}
		if (local210 > Static122.anInt3178) {
			Static122.anInt3178 += (local210 - Static122.anInt3178) / 24;
		} else if (Static122.anInt3178 > local210) {
			Static122.anInt3178 += (local210 - Static122.anInt3178) / 80;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!uc;II)V")
	public static void method774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3) {
		if (Static8.anInt195 >= 50 || Static115.anInt3051 == 0 || (arg2.anIntArray373 == null || arg2.anIntArray373.length <= arg1)) {
			return;
		}
		@Pc(27) int local27 = arg2.anIntArray373[arg1];
		if (local27 == 0) {
			return;
		}
		@Pc(37) int local37 = local27 >> 8;
		Static32.anIntArray106[Static8.anInt195] = local37;
		@Pc(47) int local47 = local27 >> 4 & 0x7;
		@Pc(51) int local51 = local27 & 0xF;
		Static18.anIntArray54[Static8.anInt195] = local47;
		Static40.anIntArray136[Static8.anInt195] = 0;
		Static76.aClass36Array1[Static8.anInt195] = null;
		@Pc(76) int local76 = (arg0 - 64) / 128;
		@Pc(82) int local82 = (arg3 - 64) / 128;
		Static1.anIntArray1[Static8.anInt195] = (local76 << 16) + (local82 << 8) + local51;
		Static8.anInt195++;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIZ)V")
	public static void method775(@OriginalArg(3) boolean arg0) {
		Static31.aBoolean156 = arg0;
		Static73.anInt2071 = 2;
		Static110.anInt2948 = 22050;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public static void method776() {
		Static11.aFontMetrics1 = null;
		Static107.anImage4 = null;
		Static72.aFont1 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method777() {
		aClass26_638 = null;
		aClass26_643 = null;
		aClass26_639 = null;
		aClass16_Sub1_5 = null;
		aClass26_645 = null;
		aClass27Array1 = null;
		aClass26_641 = null;
		anIntArray134 = null;
		aClass26_642 = null;
		aClass3_Sub1_Sub4_Sub1_6 = null;
		anIntArray133 = null;
		aClass26_644 = null;
		aClass26_640 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!fb;I)V")
	public static void method778(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub5_Sub1 arg1) {
		Static103.method1903(arg1.anInt2733, arg0, arg1.anInt2731);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BIII)Lclient!qa;")
	public static Class3_Sub17 method779(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class3_Sub17 local15 = new Class3_Sub17();
		local15.anInt2552 = arg0;
		local15.anInt2549 = arg1;
		Static52.aClass17_9.method594(local15, (long) arg2);
		Static107.method1967(arg0);
		Static102.method1898(arg0);
		@Pc(37) Class3_Sub14 local37 = Static100.method2212(arg2);
		if (local37 != null) {
			Static110.method2004(local37);
		}
		if (Static79.aClass3_Sub14_8 != null) {
			Static110.method2004(Static79.aClass3_Sub14_8);
			Static79.aClass3_Sub14_8 = null;
		}
		Static56.anInt1695 = 0;
		Static109.aBoolean162 = false;
		Static118.method2126(Static7.anInt188, Static103.anInt2776, Static118.anInt3105, Static69.anInt2516);
		if (Static32.anInt1048 != -1) {
			Static96.method1776(1, Static32.anInt1048);
		}
		return local15;
	}
}
