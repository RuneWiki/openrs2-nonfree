import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
	public static int anInt898;

	@OriginalMember(owner = "client!dc", name = "yb", descriptor = "Lclient!bd;")
	public static Class8 aClass8_8;

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "Lclient!a;")
	public static Class1 aClass1_838 = Static94.method1596("::fpson");

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "[I")
	public static int[] anIntArray89 = new int[32768];

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
	public static int anInt899 = 0;

	@OriginalMember(owner = "client!dc", name = "kb", descriptor = "[I")
	public static int[] anIntArray90 = new int[50];

	@OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
	public static int anInt901 = 1;

	@OriginalMember(owner = "client!dc", name = "nb", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!dc", name = "tb", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method597() {
		anIntArray90 = null;
		aClass8_8 = null;
		anIntArray89 = null;
		aClass1_838 = null;
		aClass2_Sub1_Sub2_Sub4Array3 = null;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public static void method598() {
		@Pc(17) int local17;
		if (Static41.anInt1402 == 0) {
			Static109.aClass3_1 = new Class3(4, 104, 104, Static50.anIntArrayArrayArray7);
			for (local17 = 0; local17 < 4; local17++) {
				Static84.aClass5Array1[local17] = new Class5(104, 104);
			}
			Static86.aClass2_Sub1_Sub2_Sub4_6 = new Class2_Sub1_Sub2_Sub4(512, 512);
			Static112.anInt2804 = 5;
			Static41.anInt1402 = 20;
			Static104.aClass1_1598 = Static83.aClass1_2335;
			return;
		}
		@Pc(56) int local56;
		@Pc(66) int local66;
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (Static41.anInt1402 == 20) {
			@Pc(54) int[] local54 = new int[9];
			for (local56 = 0; local56 < 9; local56++) {
				local66 = local56 * 32 + 15 + 128;
				local72 = local66 * 3 + 600;
				local76 = Class2_Sub1_Sub2_Sub3.anIntArray106[local66];
				local54[local56] = local76 * local72 >> 16;
			}
			Static3.method127(local54);
			Static112.anInt2804 = 10;
			Static104.aClass1_1598 = Static53.aClass1_1822;
			Static41.anInt1402 = 30;
		} else if (Static41.anInt1402 == 30) {
			Static46.aClass8_Sub1_9 = Static89.method1569(0, true, false, true);
			Static18.aClass8_Sub1_7 = Static89.method1569(1, true, false, true);
			Static79.aClass8_Sub1_18 = Static89.method1569(2, true, true, false);
			Static110.aClass8_Sub1_25 = Static89.method1569(3, true, false, true);
			Static67.aClass8_Sub1_24 = Static89.method1569(4, true, false, true);
			Static107.aClass8_Sub1_23 = Static89.method1569(5, true, true, true);
			Static90.aClass8_Sub1_20 = Static89.method1569(6, false, true, true);
			Static64.aClass8_Sub1_15 = Static89.method1569(7, true, false, true);
			Static37.aClass8_Sub1_8 = Static89.method1569(8, true, false, true);
			Static59.aClass8_Sub1_14 = Static89.method1569(9, true, false, true);
			Static53.aClass8_Sub1_13 = Static89.method1569(10, true, false, true);
			Static77.aClass8_Sub1_17 = Static89.method1569(11, true, false, true);
			Static91.aClass8_Sub1_21 = Static89.method1569(12, true, false, true);
			Static41.anInt1402 = 40;
			Static104.aClass1_1598 = Static46.aClass1_1501;
			Static112.anInt2804 = 20;
		} else if (Static41.anInt1402 == 40) {
			local17 = Static46.aClass8_Sub1_9.method1709() * 5 / 100;
			local17 += Static18.aClass8_Sub1_7.method1709() * 5 / 100;
			local17 += Static79.aClass8_Sub1_18.method1709() * 5 / 100;
			local17 += Static110.aClass8_Sub1_25.method1709() * 5 / 100;
			local17 += Static67.aClass8_Sub1_24.method1709() * 5 / 100;
			local17 += Static107.aClass8_Sub1_23.method1709() * 5 / 100;
			local17 += Static90.aClass8_Sub1_20.method1709() * 5 / 100;
			local17 += Static64.aClass8_Sub1_15.method1709() * 40 / 100;
			local17 += Static37.aClass8_Sub1_8.method1709() * 5 / 100;
			local17 += Static59.aClass8_Sub1_14.method1709() * 5 / 100;
			local17 += Static53.aClass8_Sub1_13.method1709() * 5 / 100;
			local17 += Static77.aClass8_Sub1_17.method1709() * 5 / 100;
			local17 += Static91.aClass8_Sub1_21.method1709() * 5 / 100;
			if (local17 == 100) {
				Static41.anInt1402 = 45;
				Static104.aClass1_1598 = Static61.aClass1_1900;
				Static112.anInt2804 = 30;
			} else {
				if (local17 != 0) {
					Static104.aClass1_1598 = Static97.method1655(new Class1[] { Static37.aClass1_1315, Static43.method994(local17), Static73.aClass1_2050 });
				}
				Static112.anInt2804 = 30;
			}
		} else if (Static41.anInt1402 == 45) {
			Static52.method1186(Static34.aClass34_4, !Static77.aBoolean113);
			Static82.aClass2_Sub2_Sub1_1 = Static103.method1725(Static34.aClass34_4, Static103.aCanvas1);
			Static90.aClass49_1 = new Class49(22050, Static5.anInt382);
			Static41.anInt1402 = 50;
			Static104.aClass1_1598 = Static77.aClass1_2159;
			Static112.anInt2804 = 35;
		} else if (Static41.anInt1402 == 50) {
			local17 = 0;
			if (Static97.aClass2_Sub1_Sub2_Sub1_2 == null) {
				Static97.aClass2_Sub1_Sub2_Sub1_2 = Static46.method1049(Static37.aClass8_Sub1_8, Static111.aClass1_2898, Static50.aClass1_1641);
			} else {
				local17++;
			}
			if (Static88.aClass2_Sub1_Sub2_Sub1_1 == null) {
				Static88.aClass2_Sub1_Sub2_Sub1_1 = Static46.method1049(Static37.aClass8_Sub1_8, Static111.aClass1_2898, Static112.aClass1_2900);
			} else {
				local17++;
			}
			if (Static97.aClass2_Sub1_Sub2_Sub1_3 == null) {
				Static97.aClass2_Sub1_Sub2_Sub1_3 = Static46.method1049(Static37.aClass8_Sub1_8, Static111.aClass1_2898, Static52.aClass1_1776);
			} else {
				local17++;
			}
			if (local17 < 3) {
				Static104.aClass1_1598 = Static97.method1655(new Class1[] { Static77.aClass1_2157, Static43.method994(local17 * 100 / 3), Static73.aClass1_2050 });
				Static112.anInt2804 = 40;
			} else {
				Static41.anInt1402 = 60;
				Static112.anInt2804 = 40;
				Static104.aClass1_1598 = Static37.aClass1_1314;
			}
		} else if (Static41.anInt1402 == 60) {
			local17 = Static99.method1665(Static53.aClass8_Sub1_13, Static37.aClass8_Sub1_8);
			local56 = Static34.method870();
			if (local17 < local56) {
				Static104.aClass1_1598 = Static97.method1655(new Class1[] { Static81.aClass1_2274, Static43.method994(local17 * 100 / local56), Static73.aClass1_2050 });
				Static112.anInt2804 = 50;
			} else {
				Static104.aClass1_1598 = Static113.aClass1_2350;
				Static112.anInt2804 = 50;
				Static29.method759(5);
				Static41.anInt1402 = 70;
			}
		} else if (Static41.anInt1402 == 70) {
			if (Static79.aClass8_Sub1_18.method1697()) {
				Static66.method1588(Static79.aClass8_Sub1_18);
				Static64.method1328(Static79.aClass8_Sub1_18);
				Static94.method1595(Static79.aClass8_Sub1_18, Static64.aClass8_Sub1_15);
				Static94.method1598(Static64.aClass8_Sub1_15, Static77.aBoolean113, Static79.aClass8_Sub1_18);
				Static54.method1223(Static64.aClass8_Sub1_15, Static79.aClass8_Sub1_18);
				Static71.method1362(Static79.aClass8_Sub1_18, Static40.aBoolean87, Static64.aClass8_Sub1_15);
				Static13.method436(Static18.aClass8_Sub1_7, Static79.aClass8_Sub1_18, Static46.aClass8_Sub1_9);
				Static90.method1578(Static64.aClass8_Sub1_15, Static79.aClass8_Sub1_18);
				Static84.method1533(Static79.aClass8_Sub1_18);
				Static17.method503(Static79.aClass8_Sub1_18);
				Static18.method519(Static110.aClass8_Sub1_25, Static37.aClass8_Sub1_8, Static64.aClass8_Sub1_15);
				Static41.anInt1402 = 80;
				Static112.anInt2804 = 60;
				Static104.aClass1_1598 = Static71.aClass1_2034;
			} else {
				Static104.aClass1_1598 = Static97.method1655(new Class1[] { Static60.aClass1_1851, Static43.method994(Static79.aClass8_Sub1_18.method1714()), Static73.aClass1_2050 });
				Static112.anInt2804 = 60;
			}
		} else if (Static41.anInt1402 == 80) {
			local17 = 0;
			if (Static42.aClass2_Sub1_Sub2_Sub4_3 == null) {
				Static42.aClass2_Sub1_Sub2_Sub4_3 = Static111.method1805(Static37.aClass8_Sub1_8, Static89.aClass1_2441, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static25.aClass2_Sub1_Sub2_Sub4_1 == null) {
				Static25.aClass2_Sub1_Sub2_Sub4_1 = Static111.method1805(Static37.aClass8_Sub1_8, Static102.aClass1_2690, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static25.aClass2_Sub1_Sub2_Sub2Array5 == null) {
				Static25.aClass2_Sub1_Sub2_Sub2Array5 = Static25.method716(Static37.aClass8_Sub1_8, Static56.aClass1_1838, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static12.aClass2_Sub1_Sub2_Sub4Array13 == null) {
				Static12.aClass2_Sub1_Sub2_Sub4Array13 = Static11.method413(Static37.aClass8_Sub1_8, Static48.aClass1_1576, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static42.aClass2_Sub1_Sub2_Sub4Array6 == null) {
				Static42.aClass2_Sub1_Sub2_Sub4Array6 = Static11.method413(Static37.aClass8_Sub1_8, Static50.aClass1_1645, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static46.aClass2_Sub1_Sub2_Sub4Array8 == null) {
				Static46.aClass2_Sub1_Sub2_Sub4Array8 = Static11.method413(Static37.aClass8_Sub1_8, Static100.aClass1_2675, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static4.aClass2_Sub1_Sub2_Sub4Array1 == null) {
				Static4.aClass2_Sub1_Sub2_Sub4Array1 = Static11.method413(Static37.aClass8_Sub1_8, Static33.aClass1_1226, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static64.aClass2_Sub1_Sub2_Sub4Array10 == null) {
				Static64.aClass2_Sub1_Sub2_Sub4Array10 = Static11.method413(Static37.aClass8_Sub1_8, Static87.aClass1_2425, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static76.aClass2_Sub1_Sub2_Sub4_5 == null) {
				Static76.aClass2_Sub1_Sub2_Sub4_5 = Static111.method1805(Static37.aClass8_Sub1_8, Static50.aClass1_1643, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (aClass2_Sub1_Sub2_Sub4Array3 == null) {
				aClass2_Sub1_Sub2_Sub4Array3 = Static11.method413(Static37.aClass8_Sub1_8, Static8.aClass1_424, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static65.aClass2_Sub1_Sub2_Sub4Array11 == null) {
				Static65.aClass2_Sub1_Sub2_Sub4Array11 = Static11.method413(Static37.aClass8_Sub1_8, Static106.aClass1_2800, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static54.aClass2_Sub1_Sub2_Sub4Array9 == null) {
				Static54.aClass2_Sub1_Sub2_Sub4Array9 = Static11.method413(Static37.aClass8_Sub1_8, Static6.aClass1_294, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static10.aClass2_Sub1_Sub2_Sub2Array10 == null) {
				Static10.aClass2_Sub1_Sub2_Sub2Array10 = Static25.method716(Static37.aClass8_Sub1_8, Static1.aClass1_1, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (Static86.aClass2_Sub1_Sub2_Sub2Array8 == null) {
				Static86.aClass2_Sub1_Sub2_Sub2Array8 = Static25.method716(Static37.aClass8_Sub1_8, Static66.aClass1_2450, Static111.aClass1_2898);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static104.aClass1_1598 = Static97.method1655(new Class1[] { Static27.aClass1_1007, Static43.method994(local17 * 100 / 14), Static73.aClass1_2050 });
				Static112.anInt2804 = 70;
			} else {
				Static25.aClass2_Sub1_Sub2_Sub4_1.method1145();
				local56 = (int) (Math.random() * 21.0D) - 10;
				local66 = (int) (Math.random() * 21.0D) - 10;
				local76 = (int) (Math.random() * 41.0D) - 20;
				local72 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(853) int local853 = 0; local853 < Static12.aClass2_Sub1_Sub2_Sub4Array13.length; local853++) {
					Static12.aClass2_Sub1_Sub2_Sub4Array13[local853].method1136(local76 + local56, local66 - -local76, local72 + local76);
				}
				Static25.aClass2_Sub1_Sub2_Sub2Array5[0].method642(local56 + local76, local66 + local76, local76 + local72);
				Static104.aClass1_1598 = Static52.aClass1_1777;
				Static112.anInt2804 = 70;
				Static41.anInt1402 = 85;
			}
		} else if (Static41.anInt1402 == 85) {
			local17 = Static89.method1567(Static37.aClass8_Sub1_8);
			local56 = Static37.method938();
			if (local17 < local56) {
				Static104.aClass1_1598 = Static97.method1655(new Class1[] { Static54.aClass1_1836, Static43.method994(local17 * 100 / local56), Static73.aClass1_2050 });
				Static112.anInt2804 = 80;
			} else {
				Static104.aClass1_1598 = Static48.aClass1_1570;
				Static41.anInt1402 = 90;
				Static112.anInt2804 = 80;
			}
		} else if (Static41.anInt1402 == 90) {
			if (Static59.aClass8_Sub1_14.method1697()) {
				@Pc(988) Class38 local988 = new Class38(Static59.aClass8_Sub1_14, Static37.aClass8_Sub1_8, 20, 0.8D, Static77.aBoolean113 ? 64 : 128);
				Static24.method691(local988);
				Static24.method699(0.8D);
				Static41.anInt1402 = 110;
				Static112.anInt2804 = 90;
				Static104.aClass1_1598 = Static67.aClass1_2866;
			} else {
				Static104.aClass1_1598 = Static97.method1655(new Class1[] { Static25.aClass1_998, Static43.method994(Static59.aClass8_Sub1_14.method1714()), Static73.aClass1_2050 });
				Static112.anInt2804 = 90;
			}
		} else if (Static41.anInt1402 == 110) {
			Static21.aClass41_1 = new Class41();
			Static34.aClass34_4.method1262(10, Static21.aClass41_1);
			Static104.aClass1_1598 = Static25.aClass1_1000;
			Static41.anInt1402 = 120;
			Static112.anInt2804 = 94;
		} else if (Static41.anInt1402 == 120) {
			if (Static53.aClass8_Sub1_13.method1706(Static46.aClass1_1509, Static111.aClass1_2898)) {
				@Pc(1059) Class67 local1059 = new Class67(Static53.aClass8_Sub1_13.method1682(Static111.aClass1_2898, Static46.aClass1_1509));
				Static51.method1170(local1059);
				Static41.anInt1402 = 130;
				Static104.aClass1_1598 = Static84.aClass1_2360;
				Static112.anInt2804 = 96;
			} else {
				Static104.aClass1_1598 = Static97.method1655(new Class1[] { Static18.aClass1_746, Static93.aClass1_2467 });
				Static112.anInt2804 = 96;
			}
		} else if (Static41.anInt1402 == 130) {
			if (!Static110.aClass8_Sub1_25.method1697()) {
				Static104.aClass1_1598 = Static97.method1655(new Class1[] { Static61.aClass1_1905, Static43.method994(Static110.aClass8_Sub1_25.method1714() * 4 / 5), Static73.aClass1_2050 });
				Static112.anInt2804 = 100;
			} else if (Static91.aClass8_Sub1_21.method1697()) {
				Static104.aClass1_1598 = Static33.aClass1_1225;
				Static41.anInt1402 = 140;
				Static112.anInt2804 = 100;
			} else {
				Static104.aClass1_1598 = Static97.method1655(new Class1[] { Static61.aClass1_1905, Static43.method994(Static91.aClass8_Sub1_21.method1714() / 5 + 80), Static73.aClass1_2050 });
				Static112.anInt2804 = 100;
			}
		} else if (Static41.anInt1402 == 140) {
			Static29.method759(10);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lclient!md;")
	public static Class2_Sub1_Sub11 method599(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub1_Sub11 local6 = (Class2_Sub1_Sub11) Static88.aClass11_21.method431((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static67.aClass8_29.method1684(arg0, 1);
		local6 = new Class2_Sub1_Sub11();
		if (local20 != null) {
			local6.method1330(arg0, new Class2_Sub3(local20));
		}
		local6.method1327();
		Static88.aClass11_21.method430((long) arg0, local6);
		return local6;
	}
}
