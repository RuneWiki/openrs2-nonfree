import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1590 = Static106.method1849("hel");

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1591 = Static106.method1849("::qa_op_test");

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "Lclient!je;")
	public static Class1_Sub12_Sub1 aClass1_Sub12_Sub1_1 = new Class1_Sub12_Sub1(5000);

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "[I")
	public static int[] anIntArray477 = new int[1000];

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1592 = Static106.method1849("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1593 = Static106.method1849("The server is being updated)3");

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
	public static int anInt2768 = 1;

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
	public static int anInt2769 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!uc", name = "S", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1594 = aClass66_1593;

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1595 = Static106.method1849("<img=0>");

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public static void method1950() {
		if (!Static112.aBoolean113) {
			Static97.aClass66Array21[0] = Static102.aClass66_1421;
			Static5.anInt228 = 1;
			Static84.aClass66Array18[0] = Static13.aClass66_284;
			Static98.anIntArray419[0] = 1007;
		}
		if (Static22.anInt637 != -1) {
			Static25.method531(Static22.anInt637);
		}
		for (@Pc(34) int local34 = 0; local34 < Static94.anInt2420; local34++) {
			if (Static128.aBooleanArray18[local34]) {
				Static5.aBooleanArray2[local34] = true;
			}
			Static9.aBooleanArray3[local34] = Static128.aBooleanArray18[local34];
			Static128.aBooleanArray18[local34] = false;
		}
		Static93.aClass1_Sub10_12 = null;
		Static96.anInt2457 = -1;
		Static60.anInt1848 = -1;
		Static87.anInt2308 = Static22.anInt636;
		if (Static22.anInt637 != -1) {
			Static94.anInt2420 = 0;
			Static47.method1049(Static22.anInt637, 0, 0, 503, 0, 0, -1, 765);
		}
		Static115.method1672();
		Static57.method1255();
		if (Static112.aBoolean113) {
			Static16.method413();
		} else if (Static96.anInt2457 != -1) {
			Static65.method1372(Static60.anInt1848, Static96.anInt2457);
		}
		if (Static71.anInt2010 == 3) {
			for (@Pc(103) int local103 = 0; local103 < Static94.anInt2420; local103++) {
				if (Static9.aBooleanArray3[local103]) {
					Static115.method1660(Static27.anIntArray103[local103], Static99.anIntArray180[local103], Static2.anIntArray16[local103], Static13.anIntArray76[local103], 16711935, 128);
				} else if (Static5.aBooleanArray2[local103]) {
					Static115.method1660(Static27.anIntArray103[local103], Static99.anIntArray180[local103], Static2.anIntArray16[local103], Static13.anIntArray76[local103], 16711680, 128);
				}
			}
		}
		Static34.method68(Static22.anInt635, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261, Static130.anInt2924, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271);
		Static130.anInt2924 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!ha;)V")
	public static void method1951(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub5 arg1) {
		if (Static22.anInt636 < arg1.anInt1239) {
			Static92.method1702(arg1);
		} else if (arg1.anInt1292 >= Static22.anInt636) {
			Static86.method1611(arg1);
		} else {
			Static77.method1475(arg1);
		}
		if (arg1.anInt1261 < 128 || arg1.anInt1271 < 128 || arg1.anInt1261 >= 13184 || arg1.anInt1271 >= 13184) {
			arg1.anInt1271 = arg1.anIntArray191[0] * 128 + arg1.anInt1248 * 64;
			arg1.anInt1292 = 0;
			arg1.anInt1239 = 0;
			arg1.anInt1255 = -1;
			arg1.anInt1261 = arg1.anIntArray189[0] * 128 + arg1.anInt1248 * 64;
			arg1.anInt1266 = -1;
			arg1.method927();
		}
		if (arg1 == Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1 && (arg1.anInt1261 < 1536 || arg1.anInt1271 < 1536 || arg1.anInt1261 >= 11776 || arg1.anInt1271 >= 11776)) {
			arg1.anInt1292 = 0;
			arg1.anInt1266 = -1;
			arg1.anInt1239 = 0;
			arg1.anInt1255 = -1;
			arg1.anInt1271 = arg1.anInt1248 * 64 + arg1.anIntArray191[0] * 128;
			arg1.anInt1261 = arg1.anInt1248 * 64 + arg1.anIntArray189[0] * 128;
			arg1.method927();
		}
		Static42.method935(arg1);
		Static12.method386(arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB)I")
	public static int method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = 0;
		while (arg1 > 0) {
			local3 = arg0 & 0x1 | local3 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local3;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method1953() {
		try {
			if (Static71.aClass83_1 == null) {
				Static71.aClass83_1 = new Class83(Static120.aClass7_4, Static41.method897(new Class66[] { Static36.aClass66_524, Static13.aClass66_283, Static81.aClass66_1179 }).method1844());
			} else {
				@Pc(7) byte[] local7 = Static71.aClass83_1.method2047();
				if (local7 != null) {
					@Pc(14) Class1_Sub12 local14 = new Class1_Sub12(local7);
					Static99.anInt1210 = local14.method1176();
					Static18.aClass4Array1 = new Class4[Static99.anInt1210];
					for (@Pc(23) int local23 = 0; local23 < Static99.anInt1210; local23++) {
						@Pc(33) Class4 local33 = Static18.aClass4Array1[local23] = new Class4();
						@Pc(37) int local37 = local14.method1176();
						local33.aBoolean4 = (local37 & 0x8000) != 0;
						local33.anInt116 = local37 & 0x7FFF;
						local33.aClass66_116 = local14.method1214();
						local33.anInt119 = local14.method1181();
						local33.anInt110 = local23;
						local33.anInt114 = Static105.method1817(local33.aClass66_116);
					}
					Static33.method630(Static119.anIntArray481, 0, Static18.aClass4Array1.length - 1, Static44.anIntArray208, Static18.aClass4Array1);
					Static71.aClass83_1 = null;
					Static60.aBoolean74 = true;
				}
			}
		} catch (@Pc(122) Exception local122) {
			local122.printStackTrace();
			Static71.aClass83_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
	public static void method1954() {
		while (true) {
			if (Static133.aClass1_Sub12_Sub1_3.method1230(Static105.anInt2602) >= 11) {
				@Pc(16) int local16 = Static133.aClass1_Sub12_Sub1_3.method1232(11);
				if (local16 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local16] == null) {
						Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local16] = new Class1_Sub1_Sub1_Sub5_Sub2();
						local23 = true;
						if (Static106.aClass1_Sub12Array1[local16] != null) {
							Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local16].method939(Static106.aClass1_Sub12Array1[local16]);
						}
					}
					Static51.anIntArray239[Static111.anInt2653++] = local16;
					@Pc(59) Class1_Sub1_Sub1_Sub5_Sub2 local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local16];
					local59.anInt1285 = Static22.anInt636;
					@Pc(67) int local67 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
					if (local67 == 1) {
						Static44.anIntArray207[Static101.anInt2503++] = local16;
					}
					@Pc(83) int local83 = Static133.aClass1_Sub12_Sub1_3.method1232(5);
					@Pc(90) int local90 = Static80.anIntArray355[Static133.aClass1_Sub12_Sub1_3.method1232(3)];
					if (local83 > 15) {
						local83 -= 32;
					}
					if (local23) {
						local59.anInt1269 = local59.anInt1290 = local90;
					}
					@Pc(107) int local107 = Static133.aClass1_Sub12_Sub1_3.method1232(5);
					if (local107 > 15) {
						local107 -= 32;
					}
					@Pc(118) int local118 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
					local59.method929(local83 + Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], local118 == 1, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0] + local107);
					continue;
				}
			}
			Static133.aClass1_Sub12_Sub1_3.method1231();
			return;
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
	public static void method1955() {
		aClass66_1592 = null;
		aClass66_1590 = null;
		aClass66_1595 = null;
		aClass66_1591 = null;
		aClass1_Sub12_Sub1_1 = null;
		anIntArray477 = null;
		aClass66_1594 = null;
		aClass66_1593 = null;
	}
}
