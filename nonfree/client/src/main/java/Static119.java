import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_34;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!ff;")
	public static Class11 aClass11_25;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1 aClass2_Sub1_Sub9_Sub1_5;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	public static int anInt1677;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3[] aClass2_Sub1_Sub9_Sub3Array6;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Lclient!va;")
	public static Class2_Sub1_Sub17 aClass2_Sub1_Sub17_4;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!wd;")
	private static Class80 aClass80_593 = Static2.method59("Please use a different world)3");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_591 = aClass80_593;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!i;")
	public static Class32 aClass32_31 = new Class32(200);

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_592 = aClass80_593;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_594 = Static2.method59(" )2>");

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!wd;")
	public static Class80 aClass80_595 = Static2.method59("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!wb;")
	public static Class2_Sub17 aClass2_Sub17_3 = new Class2_Sub17(8);

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	public static int anInt1678 = 0;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!wd;")
	public static Class80 aClass80_596 = Static2.method59("@gr1@");

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Lclient!wd;")
	private static Class80 aClass80_600 = Static2.method59("green:");

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_597 = aClass80_600;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!wd;")
	public static Class80 aClass80_598 = aClass80_600;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Lclient!wd;")
	public static Class80 aClass80_599 = Static2.method59("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!va;)Z")
	public static boolean method996(@OriginalArg(1) Class2_Sub1_Sub17 arg0) {
		@Pc(8) int local8 = arg0.anInt3030;
		if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
			if (local8 >= 801) {
				local8 -= 701;
			} else if (local8 >= 701) {
				local8 -= 601;
			} else if (local8 < 101) {
				local8--;
			} else {
				local8 -= 101;
			}
			Static59.method1043(0, 53, Static27.aClass80_350, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, Static123.aClass80Array20[local8] }), 0);
			Static59.method1043(0, 33, Static20.aClass80_289, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, Static123.aClass80Array20[local8] }), 0);
			return true;
		} else if (local8 >= 401 && local8 <= 500) {
			Static59.method1043(0, 32, Static27.aClass80_350, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, arg0.aClass80_1160 }), 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)I")
	public static int method997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(20) int local20 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local20;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
	public static void method999(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub18 local16 = (Class2_Sub18) Static104.aClass41_12.method1056((long) arg0);
		if (local16 != null) {
			for (@Pc(21) int local21 = 0; local21 < local16.anIntArray365.length; local21++) {
				local16.anIntArray365[local21] = -1;
				local16.anIntArray364[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method1000() {
		if (Static85.anInt2063 == 2) {
			Static78.method1209((Static94.anInt2418 - Static57.anInt1736 << 7) + Static31.anInt1091, Static88.anInt2162 * 2, Static121.anInt3094 + (Static108.anInt2878 - Static66.anInt1860 << 7));
			if (Static105.anInt2322 > -1 && Static10.anInt300 % 20 < 10) {
				Static57.aClass2_Sub1_Sub9_Sub1Array8[0].method825(Static105.anInt2322 - 12, Static59.anInt1769 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public static void method1002() {
		Static80.aClass73_1.anInt2947 = 0;
		Static74.aLong59 = 0L;
		Static102.aBoolean199 = true;
		Static8.aBoolean21 = true;
		Static9.anInt262 = 0;
		Static118.method1944();
		Static88.anInt2152 = -1;
		Static120.aClass2_Sub17_Sub1_3.anInt2799 = 0;
		Static103.anInt2679 = 0;
		Static63.anInt1818 = 0;
		Static85.anInt2063 = 0;
		Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
		Static122.aBoolean241 = false;
		Static79.anInt2023 = -1;
		Static55.anInt1305 = 0;
		Static10.anInt298 = -1;
		Static56.anInt1718 = 0;
		Static9.anInt255 = -1;
		Static29.method566(0);
		for (@Pc(1961) int local1961 = 0; local1961 < 100; local1961++) {
			Static36.aClass80Array8[local1961] = null;
		}
		Static92.anInt2272 = (int) (Math.random() * 120.0D) - 60;
		Static124.anInt3139 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static37.anInt1212 = (int) (Math.random() * 110.0D) - 55;
		Static2.anInt121 = 0;
		Static76.aBoolean141 = false;
		anInt1678 = 0;
		Static39.anInt699 = 0;
		Static92.anInt2273 = 0;
		Static74.anInt1951 = (int) (Math.random() * 80.0D) - 40;
		Static8.anInt233 = (int) (Math.random() * 100.0D) - 50;
		Static110.anInt2908 = 0;
		Static108.anInt2879 = (int) (Math.random() * 30.0D) - 20;
		Static16.anInt443 = 0;
		Static107.anInt2862 = 0;
		Static95.anInt2428 = -1;
		for (@Pc(2041) int local2041 = 0; local2041 < 2048; local2041++) {
			Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local2041] = null;
			Static90.aClass2_Sub17Array1[local2041] = null;
		}
		for (@Pc(2059) int local2059 = 0; local2059 < 32768; local2059++) {
			Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local2059] = null;
		}
		Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[2047] = new Class2_Sub1_Sub1_Sub4_Sub2();
		Static93.aClass58_12.method1292();
		Static33.aClass58_3.method1292();
		@Pc(2089) int local2089;
		@Pc(2093) int local2093;
		for (@Pc(2085) int local2085 = 0; local2085 < 4; local2085++) {
			for (local2089 = 0; local2089 < 104; local2089++) {
				for (local2093 = 0; local2093 < 104; local2093++) {
					Static45.aClass58ArrayArrayArray3[local2085][local2089][local2093] = null;
				}
			}
		}
		Static90.aClass58_11 = new Class58();
		Static45.anInt2090 = 0;
		Static89.anInt2165 = 0;
		for (local2089 = 0; local2089 < Static118.anInt3040; local2089++) {
			@Pc(2131) Class2_Sub1_Sub11 local2131 = Static14.method244(local2089);
			if (local2131 != null && local2131.anInt2157 == 0) {
				Static100.anIntArray337[local2089] = 0;
				Static15.anIntArray66[local2089] = 0;
			}
		}
		for (local2093 = 0; local2093 < Static87.anIntArray306.length; local2093++) {
			Static87.anIntArray306[local2093] = -1;
		}
		for (@Pc(2167) int local2167 = 0; local2167 < Static39.anIntArray89.length; local2167++) {
			if (Static39.anIntArray89[local2167] != -1) {
				Static59.method1042(Static39.anIntArray89[local2167]);
				Static39.anIntArray89[local2167] = -1;
			}
		}
		Static59.method1042(Static28.anInt2316);
		Static28.anInt2316 = -1;
		Static59.method1042(Static57.anInt1737);
		Static57.anInt1737 = -1;
		Static59.method1042(Static90.anInt2214);
		Static90.anInt2214 = -1;
		Static59.method1042(Static91.anInt2232);
		Static91.anInt2232 = -1;
		Static59.method1042(Static121.anInt3090);
		Static121.anInt3090 = -1;
		Static59.method1042(Static97.anInt2559);
		Static97.anInt2559 = -1;
		Static59.method1042(Static67.anInt1865);
		Static122.aBoolean241 = false;
		Static112.anInt2919 = 0;
		Static110.anInt2904 = -1;
		Static67.anInt1865 = -1;
		Static42.anInt1258 = 0;
		Static124.anInt3134 = -1;
		Static53.aBoolean109 = false;
		Static95.aClass80_947 = null;
		Static23.anInt875 = 3;
		Static33.aClass79_1.method1988(false, null, new int[5], -1);
		for (@Pc(2253) int local2253 = 0; local2253 < 5; local2253++) {
			Static65.aClass80Array10[local2253] = null;
			Static1.aBooleanArray1[local2253] = false;
		}
		Static15.method252();
		Static3.aBoolean12 = true;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
	public static int method1003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static1.method1(arg0 - 1, arg1 - 1) + Static1.method1(arg0 - 1, arg1 + 1) + Static1.method1(arg0 + 1, arg1 + -1) + Static1.method1(arg0 + 1, arg1 + 1);
		@Pc(71) int local71 = Static1.method1(arg0, arg1 - 1) + Static1.method1(arg0, arg1 + 1) + Static1.method1(arg0 - 1, arg1) + Static1.method1(arg0 + 1, arg1);
		@Pc(76) int local76 = Static1.method1(arg0, arg1);
		return local76 / 4 + local71 / 8 + local41 / 16;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)I")
	public static int method1004(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		return Static71.aClass2_Sub1_Sub15_1 != null && local10 == Static71.aClass2_Sub1_Sub15_1.aLong91 ? Static83.aClass2_Sub17_5.anInt2799 * 99 / (Static83.aClass2_Sub17_5.aByteArray38.length - Static71.aClass2_Sub1_Sub15_1.aByte5) + 1 : 0;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	public static void method1005() {
		aClass80_594 = null;
		aClass80_593 = null;
		aClass80_600 = null;
		aClass80_592 = null;
		aCanvas2 = null;
		aClass80_597 = null;
		aClass80_599 = null;
		aClass2_Sub1_Sub17_4 = null;
		aClass2_Sub1_Sub9_Sub3Array6 = null;
		aClass80_595 = null;
		aClass80_596 = null;
		aClass2_Sub1_Sub9_Sub3_34 = null;
		aClass80_598 = null;
		aClass32_31 = null;
		aClass11_25 = null;
		aClass2_Sub1_Sub9_Sub1_5 = null;
		aClass2_Sub17_3 = null;
		aClass80_591 = null;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	public static void method1006() {
		@Pc(5) int local5;
		if (Static19.anInt796 > 0) {
			for (local5 = 0; local5 < 256; local5++) {
				if (Static19.anInt796 > 768) {
					Static4.anIntArray12[local5] = Static55.method710(1024 - Static19.anInt796, Static70.anIntArray247[local5], Static97.anIntArray332[local5]);
				} else if (Static19.anInt796 <= 256) {
					Static4.anIntArray12[local5] = Static55.method710(256 - Static19.anInt796, Static97.anIntArray332[local5], Static70.anIntArray247[local5]);
				} else {
					Static4.anIntArray12[local5] = Static97.anIntArray332[local5];
				}
			}
		} else if (Static66.anInt1859 <= 0) {
			for (local5 = 0; local5 < 256; local5++) {
				Static4.anIntArray12[local5] = Static70.anIntArray247[local5];
			}
		} else {
			for (local5 = 0; local5 < 256; local5++) {
				if (Static66.anInt1859 > 768) {
					Static4.anIntArray12[local5] = Static55.method710(1024 - Static66.anInt1859, Static70.anIntArray247[local5], Static113.anIntArray381[local5]);
				} else if (Static66.anInt1859 > 256) {
					Static4.anIntArray12[local5] = Static113.anIntArray381[local5];
				} else {
					Static4.anIntArray12[local5] = Static55.method710(256 - Static66.anInt1859, Static113.anIntArray381[local5], Static70.anIntArray247[local5]);
				}
			}
		}
		Static99.method1896(0, 9, 128, 263);
		local5 = 0;
		@Pc(154) int local154 = 6885;
		Static45.aClass2_Sub1_Sub9_Sub1_8.method837(0, 0);
		Static99.method1893();
		@Pc(177) int local177;
		@Pc(181) int local181;
		@Pc(191) int local191;
		@Pc(198) int local198;
		@Pc(205) int local205;
		@Pc(210) int local210;
		@Pc(215) int local215;
		for (@Pc(165) int local165 = 1; local165 < 255; local165++) {
			local177 = Static65.anIntArray230[local165] * (256 - local165) / 256;
			local181 = local177 + 22;
			if (local181 < 0) {
				local181 = 0;
			}
			local5 += local181;
			for (local191 = local181; local191 < 128; local191++) {
				local198 = Static70.anIntArray246[local5++];
				if (local198 == 0) {
					local154++;
				} else {
					local205 = local198;
					local210 = 256 - local198;
					local215 = Static19.aClass22_4.anIntArray223[local154];
					local198 = Static4.anIntArray12[local198];
					Static19.aClass22_4.anIntArray223[local154++] = (local210 * (local215 & 0xFF00) + (local198 & 0xFF00) * local205 & 0xFF0000) + ((local198 & 0xFF00FF) * local205 + (local210 * (local215 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local154 += local181 + 765 - 128;
		}
		Static99.method1896(637, 9, 765, 263);
		Static127.aClass2_Sub1_Sub9_Sub1_9.method837(382, 0);
		Static99.method1893();
		local154 = 7546;
		local5 = 0;
		for (local177 = 1; local177 < 255; local177++) {
			local181 = (256 - local177) * Static65.anIntArray230[local177] / 256;
			local191 = 103 - local181;
			local154 += local181;
			for (local198 = 0; local198 < local191; local198++) {
				local205 = Static70.anIntArray246[local5++];
				if (local205 == 0) {
					local154++;
				} else {
					local210 = local205;
					local215 = 256 - local205;
					@Pc(339) int local339 = Static19.aClass22_4.anIntArray223[local154];
					local205 = Static4.anIntArray12[local205];
					Static19.aClass22_4.anIntArray223[local154++] = ((local205 & 0xFF00FF) * local210 + (local339 & 0xFF00FF) * local215 & 0xFF00FF00) + (local215 * (local339 & 0xFF00) + (local205 & 0xFF00) * local210 & 0xFF0000) >> 8;
				}
			}
			local154 += 765 - local191 - local181;
			local5 += 128 - local191;
		}
	}
}
