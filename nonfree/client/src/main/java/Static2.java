import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "Lclient!wb;")
	public static Class3_Sub3_Sub16 aClass3_Sub3_Sub16_1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "[I")
	public static int[] anIntArray2 = new int[5];

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!hb;")
	private static Class27 aClass27_7 = Static87.method1648("shake:");

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array2 = new Class3_Sub3_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Lclient!hb;")
	public static Class27 aClass27_8 = Static87.method1648("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!he;")
	public static Class28 aClass28_1 = new Class28();

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "Lclient!hb;")
	private static Class27 aClass27_11 = Static87.method1648("No reply from loginserver)3");

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "Lclient!hb;")
	public static Class27 aClass27_9 = aClass27_11;

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "Lclient!hb;")
	public static Class27 aClass27_10 = Static87.method1648("Weiter");

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
	public static int anInt38 = 0;

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "Lclient!hb;")
	public static Class27 aClass27_12 = aClass27_7;

	@OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
	public static int anInt41 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!hb;Lclient!hb;ILclient!hb;)V")
	public static void method14(@OriginalArg(0) Class27 arg0, @OriginalArg(1) Class27 arg1, @OriginalArg(3) Class27 arg2) {
		Static76.aClass27_1014 = arg2;
		Static76.aClass27_1009 = arg0;
		Static76.aClass27_1013 = arg1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method15() {
		aClass27_11 = null;
		aClass27_10 = null;
		aClass27_7 = null;
		aClass27_12 = null;
		Class2.anIntArray7 = null;
		anIntArray2 = null;
		aClass28_1 = null;
		aClass3_Sub3_Sub2_Sub2Array2 = null;
		aClass27_9 = null;
		aClass27_8 = null;
		aClass3_Sub3_Sub16_1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!hc;IB)V")
	public static void method16(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static46.anInt1251 + Static73.anInt1924 & 0x7FF;
		@Pc(21) int local21 = arg2 * arg2 + arg0 * arg0;
		if (local21 > 6400) {
			return;
		}
		@Pc(29) int local29 = Static21.anIntArray99[local12];
		@Pc(33) int local33 = Static21.anIntArray96[local12];
		@Pc(41) int local41 = local33 * 256 / (Static3.anInt91 + 256);
		@Pc(49) int local49 = local29 * 256 / (Static3.anInt91 + 256);
		@Pc(60) int local60 = arg0 * local41 - local49 * arg2 >> 16;
		@Pc(70) int local70 = local41 * arg2 + arg0 * local49 >> 16;
		if (local21 > 2500) {
			arg1.method803(Static101.aClass3_Sub3_Sub2_Sub4_103, local70 + 4 + 94 - arg1.anInt1019 / 2, -local60 + 83 + (-(arg1.anInt1018 / 2) - 4));
		} else {
			arg1.method804(local70 + 94 + 4 - arg1.anInt1019 / 2, -(arg1.anInt1018 / 2) + -4 + -local60 + 83);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method17() {
		Static28.aClass12_22.method674();
		Static77.aClass3_Sub3_Sub2_Sub4_88.method1332(0, 0);
		Static59.anIntArray255 = Static51.method1015(Static59.anIntArray255);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ja;I)V")
	public static void method18(@OriginalArg(0) Class3_Sub3_Sub1_Sub4 arg0) {
		if (arg0.anInt2415 == 0) {
			arg0.anInt2422 = 1024;
		}
		arg0.anInt2387 = 0;
		@Pc(17) int local17 = arg0.anInt2424 - anInt38;
		if (arg0.anInt2415 == 1) {
			arg0.anInt2422 = 1536;
		}
		if (arg0.anInt2415 == 2) {
			arg0.anInt2422 = 0;
		}
		@Pc(48) int local48 = arg0.anInt2435 * 64 + arg0.anInt2381 * 128;
		if (arg0.anInt2415 == 3) {
			arg0.anInt2422 = 512;
		}
		arg0.anInt2408 += (local48 - arg0.anInt2408) / local17;
		@Pc(83) int local83 = arg0.anInt2435 * 64 + arg0.anInt2407 * 128;
		arg0.anInt2399 += (local83 - arg0.anInt2399) / local17;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[BIBZ)V")
	public static void method19(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static88.aClass5_1 == null) {
			return;
		}
		if (Static39.anInt988 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			Static15.anInt297 = arg2;
			if (Static39.anInt988 == 0) {
				Static84.anInt2213 = 0;
			} else {
				@Pc(50) int local50 = Static28.method621(Static39.anInt988);
				@Pc(54) int local54 = local50 - Static78.anInt2155;
				Static84.anInt2213 = (Static84.anInt2213 + local54 + 3600 - 1) / Static84.anInt2213;
			}
			Static16.aBoolean23 = arg3;
			Static22.aByteArray7 = arg1;
			Static83.anInt2364 = arg0;
		} else if (Static15.anInt297 == 0) {
			Static94.method1754(arg3, arg0, arg1);
		} else {
			Static83.anInt2364 = arg0;
			Static16.aBoolean23 = arg3;
			Static22.aByteArray7 = arg1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZII)I")
	public static int method20(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * local20 * 15731 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public static void method21() {
		Static81.aBoolean105 = true;
		Static36.aLong33 = 0L;
		Static64.aBoolean88 = true;
		Static32.anInt811 = 0;
		Static86.aClass33_1.anInt1426 = 0;
		Static55.method1060();
		Static1.anInt13 = -1;
		Static61.anInt1553 = 0;
		Static32.anInt809 = 0;
		Static74.anInt2080 = 0;
		Static97.anInt2261 = 0;
		Static78.aClass3_Sub11_Sub1_3.anInt2060 = 0;
		Static12.aBoolean16 = false;
		Static34.anInt829 = -1;
		Static104.anInt2721 = 0;
		Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
		Static19.anInt442 = -1;
		Static99.anInt2622 = -1;
		Static80.method1537(0);
		for (@Pc(1681) int local1681 = 0; local1681 < 100; local1681++) {
			Static81.aClass27Array13[local1681] = null;
		}
		Static87.anInt2341 = -1;
		Static73.anInt1924 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static70.anInt1818 = (int) (Math.random() * 80.0D) - 40;
		Static3.anInt91 = (int) (Math.random() * 30.0D) - 20;
		Static42.anInt1232 = 0;
		Static77.anInt2150 = 0;
		Static107.anInt2771 = (int) (Math.random() * 110.0D) - 55;
		Static42.anInt1235 = 0;
		Static12.anInt281 = (int) (Math.random() * 100.0D) - 50;
		Static104.anInt2724 = 0;
		Static37.anInt887 = 0;
		Static97.anInt2290 = 0;
		Static104.anInt2718 = 0;
		Static46.anInt1251 = (int) (Math.random() * 120.0D) - 60;
		Static39.anInt964 = 0;
		for (@Pc(1762) int local1762 = 0; local1762 < 2048; local1762++) {
			Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local1762] = null;
			Static90.aClass3_Sub11Array1[local1762] = null;
		}
		for (@Pc(1780) int local1780 = 0; local1780 < 32768; local1780++) {
			Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local1780] = null;
		}
		Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[2047] = new Class3_Sub3_Sub1_Sub4_Sub2();
		Static39.aClass28_8.method891();
		Static19.aClass28_5.method891();
		@Pc(1812) int local1812;
		for (@Pc(1808) int local1808 = 0; local1808 < 4; local1808++) {
			for (local1812 = 0; local1812 < 104; local1812++) {
				for (@Pc(1816) int local1816 = 0; local1816 < 104; local1816++) {
					Static71.aClass28ArrayArrayArray1[local1808][local1812][local1816] = null;
				}
			}
		}
		Static82.aClass28_10 = new Class28();
		Static43.anInt1241 = 0;
		Static90.anInt2496 = 0;
		Static97.method1607(Static64.anInt1661);
		Static64.anInt1661 = -1;
		Static97.method1607(Static84.anInt2220);
		Static84.anInt2220 = -1;
		Static97.method1607(Static104.anInt2723);
		Static104.anInt2723 = -1;
		Static97.method1607(Static55.anInt1446);
		Static55.anInt1446 = -1;
		Static97.method1607(Static92.anInt2543);
		Static92.anInt2543 = -1;
		Static97.method1607(Static41.anInt1210);
		Static41.anInt1210 = -1;
		Static97.method1607(Static19.anInt446);
		Static109.aClass27_960 = null;
		Static68.anInt1744 = 0;
		Static19.anInt446 = -1;
		Static12.aBoolean16 = false;
		Static109.anInt2025 = -1;
		Static34.anInt825 = 3;
		Static97.aBoolean112 = false;
		Static18.anInt418 = 0;
		Static1.anInt8 = -1;
		Static81.aClass15_1.method347(null, new int[5], -1, false);
		for (local1812 = 0; local1812 < 5; local1812++) {
			Static55.aClass27Array7[local1812] = null;
			Static24.aBooleanArray6[local1812] = false;
		}
		Static80.aBoolean104 = true;
	}
}
