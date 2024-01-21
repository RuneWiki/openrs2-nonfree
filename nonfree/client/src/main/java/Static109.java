import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
	public static int anInt2692;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
	public static int anInt2693;

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "[I")
	public static int[] anIntArray409;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_20;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_1255 = Static45.method1937(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "Lclient!af;")
	private static Class5 aClass5_1260 = Static45.method1937("purple:");

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "Lclient!af;")
	public static Class5 aClass5_1256 = aClass5_1260;

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "Lclient!gd;")
	public static Class28 aClass28_71 = new Class28(128);

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "Lclient!af;")
	public static Class5 aClass5_1257 = aClass5_1260;

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "Lclient!af;")
	private static Class5 aClass5_1258 = Static45.method1937(" from your ignore list first");

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "Lclient!af;")
	public static Class5 aClass5_1259 = Static45.method1937("Hidden)2");

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "Lclient!af;")
	public static Class5 aClass5_1261 = aClass5_1258;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
	public static int anInt2694 = -1;

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
	public static int anInt2695 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!kb;)V")
	private static void method1887(@OriginalArg(1) Class41 arg0) {
		Static99.aClass41_24 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method1888() {
		@Pc(20) int local20;
		if (Static121.anInt3116 == 0) {
			Static44.aClass68_1 = new Class68(4, 104, 104, Static95.anIntArrayArrayArray2);
			for (local20 = 0; local20 < 4; local20++) {
				Static131.aClass49Array1[local20] = new Class49(104, 104);
			}
			Static8.aClass1_Sub3_Sub1_Sub2_1 = new Class1_Sub3_Sub1_Sub2(512, 512);
			Static12.anInt3240 = 5;
			Static121.anInt3116 = 20;
			Static93.aClass5_1109 = Static7.aClass5_113;
			return;
		}
		@Pc(57) int local57;
		@Pc(68) int local68;
		@Pc(78) int local78;
		@Pc(72) int local72;
		if (Static121.anInt3116 == 20) {
			@Pc(55) int[] local55 = new int[9];
			for (local57 = 0; local57 < 9; local57++) {
				local68 = local57 * 32 + 128 + 15;
				local72 = Class1_Sub3_Sub1_Sub4.anIntArray425[local68];
				local78 = local68 * 3 + 600;
				local55[local57] = local78 * local72 >> 16;
			}
			Static107.method1876(local55);
			Static93.aClass5_1109 = Static89.aClass5_1365;
			Static121.anInt3116 = 30;
			Static12.anInt3240 = 10;
		} else if (Static121.anInt3116 == 30) {
			Static73.aClass41_Sub1_11 = Static80.method1409(true, true, false, 0);
			Static50.aClass41_Sub1_7 = Static80.method1409(true, true, false, 1);
			Static54.aClass41_Sub1_8 = Static80.method1409(false, true, true, 2);
			Static66.aClass41_Sub1_23 = Static80.method1409(true, true, false, 3);
			Static38.aClass41_Sub1_5 = Static80.method1409(true, true, false, 4);
			Static20.aClass41_Sub1_4 = Static80.method1409(true, true, true, 5);
			Static98.aClass41_Sub1_16 = Static80.method1409(true, false, true, 6);
			Static17.aClass41_Sub1_3 = Static80.method1409(true, true, false, 7);
			aClass41_Sub1_20 = Static80.method1409(true, true, false, 8);
			Static45.aClass41_Sub1_22 = Static80.method1409(true, true, false, 9);
			Static62.aClass41_Sub1_17 = Static80.method1409(true, true, false, 10);
			Static120.aClass41_Sub1_14 = Static80.method1409(true, true, false, 11);
			Static10.aClass41_Sub1_1 = Static80.method1409(true, true, false, 12);
			Static74.aClass41_Sub1_12 = Static80.method1409(false, true, true, 13);
			Static103.aClass41_Sub1_19 = Static80.method1409(true, false, false, 14);
			Static12.aClass41_Sub1_25 = Static80.method1409(true, true, false, 15);
			Static12.anInt3240 = 20;
			Static121.anInt3116 = 40;
			Static93.aClass5_1109 = Static108.aClass5_1249;
		} else if (Static121.anInt3116 == 40) {
			local20 = Static73.aClass41_Sub1_11.method1735() * 4 / 100;
			local20 += Static50.aClass41_Sub1_7.method1735() * 4 / 100;
			local20 += Static54.aClass41_Sub1_8.method1735() * 2 / 100;
			local20 += Static66.aClass41_Sub1_23.method1735() * 2 / 100;
			local20 += Static38.aClass41_Sub1_5.method1735() * 6 / 100;
			local20 += Static20.aClass41_Sub1_4.method1735() * 4 / 100;
			local20 += Static98.aClass41_Sub1_16.method1735() * 2 / 100;
			local20 += Static17.aClass41_Sub1_3.method1735() * 60 / 100;
			local20 += aClass41_Sub1_20.method1735() * 2 / 100;
			local20 += Static45.aClass41_Sub1_22.method1735() * 2 / 100;
			local20 += Static62.aClass41_Sub1_17.method1735() * 2 / 100;
			local20 += Static120.aClass41_Sub1_14.method1735() * 2 / 100;
			local20 += Static10.aClass41_Sub1_1.method1735() * 2 / 100;
			local20 += Static74.aClass41_Sub1_12.method1735() * 2 / 100;
			local20 += Static103.aClass41_Sub1_19.method1735() * 2 / 100;
			local20 += Static12.aClass41_Sub1_25.method1735() * 2 / 100;
			if (local20 == 100) {
				Static12.anInt3240 = 30;
				Static121.anInt3116 = 45;
				Static93.aClass5_1109 = Static106.aClass5_1244;
			} else {
				if (local20 != 0) {
					Static93.aClass5_1109 = Static100.method1696(new Class5[] { Static100.aClass5_1177, Static48.method838(local20), Static69.aClass5_805 });
				}
				Static12.anInt3240 = 30;
			}
		} else if (Static121.anInt3116 == 45) {
			Static43.method794(!Static79.aBoolean64);
			@Pc(452) Class1_Sub1_Sub3 local452 = new Class1_Sub1_Sub3();
			local452.method1152();
			Static113.aClass10_2 = Static116.method2034(0, Static65.aClass55_2, 22050, Static12.aCanvas3);
			Static113.aClass10_2.method1297(local452);
			Static95.method1603(Static38.aClass41_Sub1_5, Static103.aClass41_Sub1_19, Static12.aClass41_Sub1_25, local452);
			Static97.aClass10_1 = Static116.method2034(1, Static65.aClass55_2, 2048, Static12.aCanvas3);
			Static122.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1();
			Static97.aClass10_1.method1297(Static122.aClass1_Sub1_Sub1_2);
			Static104.aClass4_1 = new Class4(22050, Static45.anInt2755);
			Static93.aClass5_1109 = Static8.aClass5_137;
			Static121.anInt3116 = 50;
			Static12.anInt3240 = 35;
		} else if (Static121.anInt3116 == 50) {
			local20 = 0;
			if (Static48.aClass1_Sub3_Sub1_Sub1_2 == null) {
				Static48.aClass1_Sub3_Sub1_Sub1_2 = Static6.method216(Static69.aClass5_803, Static49.aClass5_612, aClass41_Sub1_20);
			} else {
				local20++;
			}
			if (Static124.aClass1_Sub3_Sub1_Sub1_4 == null) {
				Static124.aClass1_Sub3_Sub1_Sub1_4 = Static6.method216(Static95.aClass5_1129, Static49.aClass5_612, aClass41_Sub1_20);
			} else {
				local20++;
			}
			if (Static25.aClass1_Sub3_Sub1_Sub1_1 == null) {
				Static25.aClass1_Sub3_Sub1_Sub1_1 = Static6.method216(Static8.aClass5_129, Static49.aClass5_612, aClass41_Sub1_20);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static93.aClass5_1109 = Static100.method1696(new Class5[] { Static20.aClass5_321, Static48.method838(local20 * 100 / 3), Static69.aClass5_805 });
				Static12.anInt3240 = 40;
			} else {
				Static12.anInt3240 = 40;
				Static93.aClass5_1109 = Static77.aClass5_894;
				Static121.anInt3116 = 60;
			}
		} else if (Static121.anInt3116 == 60) {
			local20 = Static45.method1934(aClass41_Sub1_20, Static62.aClass41_Sub1_17);
			local57 = Static70.method1221();
			if (local57 > local20) {
				Static93.aClass5_1109 = Static100.method1696(new Class5[] { Static36.aClass5_439, Static48.method838(local20 * 100 / local57), Static69.aClass5_805 });
				Static12.anInt3240 = 50;
			} else {
				Static93.aClass5_1109 = Static90.aClass5_1075;
				Static12.anInt3240 = 50;
				Static97.method1636(5);
				Static121.anInt3116 = 70;
			}
		} else if (Static121.anInt3116 == 70) {
			if (Static54.aClass41_Sub1_8.method1719()) {
				Static49.method864(Static54.aClass41_Sub1_8);
				method1887(Static54.aClass41_Sub1_8);
				Static112.method1928(Static17.aClass41_Sub1_3, Static54.aClass41_Sub1_8);
				Static118.method2114(Static17.aClass41_Sub1_3, Static54.aClass41_Sub1_8, Static79.aBoolean64);
				Static24.method536(Static54.aClass41_Sub1_8, Static17.aClass41_Sub1_3);
				Static123.method2178(Static17.aClass41_Sub1_3, Static54.aClass41_Sub1_8, Static82.aBoolean70, Static48.aClass1_Sub3_Sub1_Sub1_2);
				Static103.method1749(Static50.aClass41_Sub1_7, Static54.aClass41_Sub1_8, Static73.aClass41_Sub1_11);
				Static65.method1184(Static17.aClass41_Sub1_3, Static54.aClass41_Sub1_8);
				Static57.method1042(Static54.aClass41_Sub1_8);
				Static65.method1182(Static54.aClass41_Sub1_8);
				Static27.method593(Static66.aClass41_Sub1_23, aClass41_Sub1_20, Static17.aClass41_Sub1_3);
				Static38.method698(Static54.aClass41_Sub1_8);
				Static38.method693(Static54.aClass41_Sub1_8);
				Static93.aClass5_1109 = Static102.aClass5_1202;
				Static121.anInt3116 = 80;
				Static12.anInt3240 = 60;
			} else {
				Static93.aClass5_1109 = Static100.method1696(new Class5[] { Static93.aClass5_1112, Static48.method838(Static54.aClass41_Sub1_8.method1731()), Static69.aClass5_805 });
				Static12.anInt3240 = 60;
			}
		} else if (Static121.anInt3116 == 80) {
			local20 = 0;
			if (Static55.aClass1_Sub3_Sub1_Sub2_3 == null) {
				Static55.aClass1_Sub3_Sub1_Sub2_3 = Static59.method1058(Static101.aClass5_1185, aClass41_Sub1_20, Static49.aClass5_612);
			} else {
				local20++;
			}
			if (Static56.aClass1_Sub3_Sub1_Sub2_4 == null) {
				Static56.aClass1_Sub3_Sub1_Sub2_4 = Static59.method1058(Static55.aClass5_674, aClass41_Sub1_20, Static49.aClass5_612);
			} else {
				local20++;
			}
			if (Static74.aClass1_Sub3_Sub1_Sub3Array5 == null) {
				Static74.aClass1_Sub3_Sub1_Sub3Array5 = Static24.method541(Static49.aClass5_612, Static17.aClass5_269, aClass41_Sub1_20);
			} else {
				local20++;
			}
			if (Static86.aClass1_Sub3_Sub1_Sub2Array4 == null) {
				Static86.aClass1_Sub3_Sub1_Sub2Array4 = Static27.method592(aClass41_Sub1_20, Static56.aClass5_693, Static49.aClass5_612);
			} else {
				local20++;
			}
			if (Static127.aClass1_Sub3_Sub1_Sub2Array10 == null) {
				Static127.aClass1_Sub3_Sub1_Sub2Array10 = Static27.method592(aClass41_Sub1_20, Static8.aClass5_131, Static49.aClass5_612);
			} else {
				local20++;
			}
			if (Static98.aClass1_Sub3_Sub1_Sub2Array7 == null) {
				Static98.aClass1_Sub3_Sub1_Sub2Array7 = Static27.method592(aClass41_Sub1_20, Static28.aClass5_404, Static49.aClass5_612);
			} else {
				local20++;
			}
			if (Static6.aClass1_Sub3_Sub1_Sub2Array2 == null) {
				Static6.aClass1_Sub3_Sub1_Sub2Array2 = Static27.method592(aClass41_Sub1_20, Static42.aClass5_514, Static49.aClass5_612);
			} else {
				local20++;
			}
			if (Static97.aClass1_Sub3_Sub1_Sub2Array6 == null) {
				Static97.aClass1_Sub3_Sub1_Sub2Array6 = Static27.method592(aClass41_Sub1_20, Static62.aClass5_1180, Static49.aClass5_612);
			} else {
				local20++;
			}
			if (Static2.aClass1_Sub3_Sub1_Sub2Array1 == null) {
				Static2.aClass1_Sub3_Sub1_Sub2Array1 = Static27.method592(aClass41_Sub1_20, Static52.aClass5_657, Static49.aClass5_612);
			} else {
				local20++;
			}
			if (Static46.aClass1_Sub3_Sub1_Sub2Array3 == null) {
				Static46.aClass1_Sub3_Sub1_Sub2Array3 = Static27.method592(aClass41_Sub1_20, Static131.aClass5_1483, Static49.aClass5_612);
			} else {
				local20++;
			}
			if (Static101.aClass1_Sub3_Sub1_Sub2Array8 == null) {
				Static101.aClass1_Sub3_Sub1_Sub2Array8 = Static27.method592(aClass41_Sub1_20, Static80.aClass5_988, Static49.aClass5_612);
			} else {
				local20++;
			}
			if (Static38.aClass1_Sub3_Sub1_Sub3Array3 == null) {
				Static38.aClass1_Sub3_Sub1_Sub3Array3 = Static24.method541(Static49.aClass5_612, Static77.aClass5_896, aClass41_Sub1_20);
			} else {
				local20++;
			}
			if (Static96.aClass1_Sub3_Sub1_Sub3Array8 == null) {
				Static96.aClass1_Sub3_Sub1_Sub3Array8 = Static24.method541(Static49.aClass5_612, Static25.aClass5_353, aClass41_Sub1_20);
			} else {
				local20++;
			}
			if (Static81.aClass1_Sub3_Sub1_Sub3_4 == null) {
				Static81.aClass1_Sub3_Sub1_Sub3_4 = Static90.method1563(Static77.aClass5_899, Static49.aClass5_612, aClass41_Sub1_20);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static93.aClass5_1109 = Static100.method1696(new Class5[] { Static57.aClass5_705, Static48.method838(local20 * 100 / 14), Static69.aClass5_805 });
				Static12.anInt3240 = 70;
			} else {
				Static4.aClass1_Sub3_Sub1_Sub3Array1 = Static96.aClass1_Sub3_Sub1_Sub3Array8;
				local57 = (int) (Math.random() * 21.0D) - 10;
				local78 = (int) (Math.random() * 21.0D) - 10;
				Static56.aClass1_Sub3_Sub1_Sub2_4.method746();
				local68 = (int) (Math.random() * 21.0D) - 10;
				local72 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(960) int local960 = 0; local960 < Static86.aClass1_Sub3_Sub1_Sub2Array4.length; local960++) {
					Static86.aClass1_Sub3_Sub1_Sub2Array4[local960].method757(local72 + local57, local68 - -local72, local72 + local78);
				}
				Static74.aClass1_Sub3_Sub1_Sub3Array5[0].method1686(local57 + local72, local68 - -local72, local72 + local78);
				Static79.method1374();
				Static12.anInt3240 = 70;
				Static121.anInt3116 = 90;
				Static93.aClass5_1109 = Static6.aClass5_110;
			}
		} else if (Static121.anInt3116 == 90) {
			if (Static45.aClass41_Sub1_22.method1719()) {
				@Pc(1051) Class39 local1051 = new Class39(Static45.aClass41_Sub1_22, aClass41_Sub1_20, 20, 0.8D, Static79.aBoolean64 ? 64 : 128);
				Static114.method1996(local1051);
				Static114.method2001(0.8D);
				Static12.anInt3240 = 90;
				Static121.anInt3116 = 110;
				Static93.aClass5_1109 = Static13.aClass5_180;
			} else {
				Static93.aClass5_1109 = Static100.method1696(new Class5[] { Static89.aClass5_1363, Static48.method838(Static45.aClass41_Sub1_22.method1731()), Static69.aClass5_805 });
				Static12.anInt3240 = 90;
			}
		} else if (Static121.anInt3116 == 110) {
			Static40.aClass79_1 = new Class79();
			Static65.aClass55_2.method1537(10, Static40.aClass79_1);
			Static93.aClass5_1109 = Static63.aClass5_872;
			Static12.anInt3240 = 94;
			Static121.anInt3116 = 120;
		} else if (Static121.anInt3116 == 120) {
			if (Static62.aClass41_Sub1_17.method1702(Static74.aClass5_847, Static49.aClass5_612)) {
				@Pc(1116) Class3 local1116 = new Class3(Static62.aClass41_Sub1_17.method1711(Static49.aClass5_612, Static74.aClass5_847));
				Static48.method839(local1116);
				Static12.anInt3240 = 96;
				Static121.anInt3116 = 130;
				Static93.aClass5_1109 = Static20.aClass5_320;
			} else {
				Static93.aClass5_1109 = Static100.method1696(new Class5[] { Static32.aClass5_433, Static40.aClass5_490 });
				Static12.anInt3240 = 96;
			}
		} else if (Static121.anInt3116 == 130) {
			if (!Static66.aClass41_Sub1_23.method1719()) {
				Static93.aClass5_1109 = Static100.method1696(new Class5[] { Static83.aClass5_1030, Static48.method838(Static66.aClass41_Sub1_23.method1731() * 4 / 5), Static69.aClass5_805 });
				Static12.anInt3240 = 100;
			} else if (!Static10.aClass41_Sub1_1.method1719()) {
				Static93.aClass5_1109 = Static100.method1696(new Class5[] { Static83.aClass5_1030, Static48.method838(Static10.aClass41_Sub1_1.method1731() / 6 + 80), Static69.aClass5_805 });
				Static12.anInt3240 = 100;
			} else if (Static74.aClass41_Sub1_12.method1719()) {
				Static12.anInt3240 = 100;
				Static121.anInt3116 = 140;
				Static93.aClass5_1109 = Static47.aClass5_576;
			} else {
				Static93.aClass5_1109 = Static100.method1696(new Class5[] { Static83.aClass5_1030, Static48.method838(Static74.aClass41_Sub1_12.method1731() / 20 + 96), Static69.aClass5_805 });
				Static12.anInt3240 = 100;
			}
		} else if (Static121.anInt3116 == 140) {
			Static97.method1636(10);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1889() {
		aClass5_1258 = null;
		aClass5_1255 = null;
		aClass5_1257 = null;
		aClass5_1256 = null;
		aClass5_1260 = null;
		aBigInteger2 = null;
		anIntArray409 = null;
		aClass28_71 = null;
		aClass5_1259 = null;
		aClass5_1261 = null;
		aByteArrayArrayArray6 = null;
		aClass41_Sub1_20 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIILclient!fd;)V")
	public static void method1890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub3_Sub1_Sub2 arg4) {
		if (arg4 == null) {
			return;
		}
		@Pc(12) int local12 = Static21.anInt748 + Static3.anInt58 & 0x7FF;
		@Pc(21) int local21 = arg3 * arg3 + arg2 * arg2;
		if (local21 > 6400) {
			return;
		}
		@Pc(33) int local33 = Class1_Sub3_Sub1_Sub4.anIntArray425[local12];
		@Pc(41) int local41 = local33 * 256 / (Static98.anInt2404 + 256);
		@Pc(45) int local45 = Class1_Sub3_Sub1_Sub4.anIntArray424[local12];
		@Pc(53) int local53 = local45 * 256 / (Static98.anInt2404 + 256);
		@Pc(63) int local63 = local53 * arg2 - arg3 * local41 >> 16;
		@Pc(73) int local73 = arg3 * local53 + local41 * arg2 >> 16;
		if (local21 <= 2500) {
			arg4.method735(arg1 + local73 + 94 + 4 - arg4.anInt1017 / 2, -(arg4.anInt1013 / 2) + -4 + arg0 - -83 + -local63);
		} else {
			arg4.method759(Static81.aClass1_Sub3_Sub1_Sub3_4, arg1 + local73 + 4 + 94 - arg4.anInt1017 / 2, -local63 + 83 + arg0 - arg4.anInt1013 / 2 + -4);
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method1891() {
		@Pc(7) int local7 = Static17.anInt514;
		@Pc(9) int local9 = Static24.anInt761;
		@Pc(13) int local13 = Static49.anInt1182;
		@Pc(15) int local15 = Static27.anInt840;
		Static33.method1981(local9, local7, local15 + local9, local13 + local7);
		Static33.method1984(local9, local7, local15, local13, 6116423);
		Static33.method1984(local9 + 1, local7 - -1, local15 - 2, 16, 0);
		Static33.method1979(local9 + 1, local7 + 18, local15 - 2, local13 + -19, 0);
		Static25.aClass1_Sub3_Sub1_Sub1_1.method165(Static23.aClass5_343, local9 + 3, local7 + 14, 6116423, -1);
		@Pc(69) int local69 = Static97.anInt2395;
		@Pc(81) int local81 = Static98.anInt2407;
		for (@Pc(83) int local83 = 0; local83 < Static18.anInt3043; local83++) {
			@Pc(87) int local87 = 16777215;
			@Pc(100) int local100 = local7 + (-local83 + -1 + Static18.anInt3043) * 15 + 31;
			if (local81 > local9 && local15 + local9 > local81 && local100 - 13 < local69 && local100 + 3 > local69) {
				local87 = 16776960;
			}
			Static25.aClass1_Sub3_Sub1_Sub1_1.method165(Static72.method1233(local83), local9 + 3, local100, local87, 0);
		}
		Static129.method2253(Static27.anInt840, Static49.anInt1182, Static24.anInt761, Static17.anInt514);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[B)I")
	public static int method1892(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static83.method1481(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V")
	public static void method1893(@OriginalArg(0) int arg0) {
		if (Static101.aClass1_Sub14Array1 != null && arg0 >= 0 && Static101.aClass1_Sub14Array1.length > arg0 && Static101.aClass1_Sub14Array1[arg0] != null) {
			Static44.aClass1_Sub20_Sub1_1.method2108(163);
			Static44.aClass1_Sub20_Sub1_1.method2078(Static101.aClass1_Sub14Array1[arg0].aLong95);
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method1894() {
		Static69.aClass28_46.method792();
	}
}
