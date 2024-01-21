import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
	public static int anInt1074;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "[Lclient!jf;")
	public static Class26_Sub1[] aClass26_Sub1Array1 = new Class26_Sub1[256];

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	public static int anInt1073 = 0;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Z")
	public static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "[Lclient!pa;")
	public static Class5_Sub14[] aClass5_Sub14Array1 = new Class5_Sub14[2048];

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
	public static int anInt1075 = 0;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_320 = Static129.method2060(" loggt sich ein)3");

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Lclient!r;")
	public static Class61 aClass61_321 = Static129.method2060("<br>");

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "[I")
	public static int[] anIntArray175 = new int[128];

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "[I")
	public static int[] anIntArray176 = new int[100];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] method736(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static129.method2057(local18) : local18;
		} else if (arg0 instanceof Class4) {
			@Pc(32) Class4 local32 = (Class4) arg0;
			return local32.method1686();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lclient!r;B)[Lclient!r;")
	public static Class61[] method737(@OriginalArg(0) Class61[] arg0) {
		@Pc(4) Class61[] local4 = new Class61[5];
		for (@Pc(6) int local6 = 0; local6 < 5; local6++) {
			local4[local6] = Static123.method1929(new Class61[] { Static39.method730(local6), Static80.aClass61_627 });
			if (arg0 != null && arg0[local6] != null) {
				local4[local6] = Static123.method1929(new Class61[] { local4[local6], arg0[local6] });
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method738() {
		@Pc(20) int local20;
		if (Static98.anInt2576 == 0) {
			Static61.aClass81_1 = new Class81(4, 104, 104, Static65.anIntArrayArrayArray3);
			for (local20 = 0; local20 < 4; local20++) {
				Static103.aClass66Array1[local20] = new Class66(104, 104);
			}
			Static89.aClass5_Sub2_Sub1_Sub4_5 = new Class5_Sub2_Sub1_Sub4(512, 512);
			Static33.anInt1001 = 5;
			Static98.anInt2576 = 20;
			Static112.aClass61_886 = Static103.aClass61_806;
			return;
		}
		@Pc(59) int local59;
		@Pc(68) int local68;
		@Pc(74) int local74;
		@Pc(78) int local78;
		if (Static98.anInt2576 == 20) {
			@Pc(57) int[] local57 = new int[9];
			for (local59 = 0; local59 < 9; local59++) {
				local68 = local59 * 32 + 143;
				local74 = local68 * 3 + 600;
				local78 = Class5_Sub2_Sub1_Sub2.anIntArray198[local68];
				local57[local59] = local74 * local78 >> 16;
			}
			Static130.method2095(local57);
			Static112.aClass61_886 = Static117.aClass61_932;
			Static33.anInt1001 = 10;
			Static98.anInt2576 = 30;
		} else if (Static98.anInt2576 == 30) {
			Static49.aClass26_Sub1_10 = Static48.method881(false, true, true, 0);
			Static63.aClass26_Sub1_13 = Static48.method881(false, true, true, 1);
			Static16.aClass26_Sub1_2 = Static48.method881(true, true, false, 2);
			Static4.aClass26_Sub1_17 = Static48.method881(false, true, true, 3);
			Static82.aClass26_Sub1_15 = Static48.method881(false, true, true, 4);
			Static45.aClass26_Sub1_7 = Static48.method881(true, true, true, 5);
			Static42.aClass26_Sub1_6 = Static48.method881(true, false, true, 6);
			Static134.aClass26_Sub1_20 = Static48.method881(false, true, true, 7);
			Static47.aClass26_Sub1_8 = Static48.method881(false, true, true, 8);
			Static83.aClass26_Sub1_16 = Static48.method881(false, true, true, 9);
			Static49.aClass26_Sub1_9 = Static48.method881(false, true, true, 10);
			Static19.aClass26_Sub1_3 = Static48.method881(false, true, true, 11);
			Static121.aClass26_Sub1_19 = Static48.method881(false, true, true, 12);
			Static134.aClass26_Sub1_21 = Static48.method881(true, true, false, 13);
			Static64.aClass26_Sub1_18 = Static48.method881(false, false, true, 14);
			Static78.aClass26_Sub1_14 = Static48.method881(false, true, true, 15);
			Static33.anInt1001 = 20;
			Static112.aClass61_886 = Static80.aClass61_626;
			Static98.anInt2576 = 40;
		} else if (Static98.anInt2576 == 40) {
			local20 = Static49.aClass26_Sub1_10.method1049() * 4 / 100;
			local20 += Static63.aClass26_Sub1_13.method1049() * 4 / 100;
			local20 += Static16.aClass26_Sub1_2.method1049() * 2 / 100;
			local20 += Static4.aClass26_Sub1_17.method1049() * 2 / 100;
			local20 += Static82.aClass26_Sub1_15.method1049() * 6 / 100;
			local20 += Static45.aClass26_Sub1_7.method1049() * 4 / 100;
			local20 += Static42.aClass26_Sub1_6.method1049() * 2 / 100;
			local20 += Static134.aClass26_Sub1_20.method1049() * 60 / 100;
			local20 += Static47.aClass26_Sub1_8.method1049() * 2 / 100;
			local20 += Static83.aClass26_Sub1_16.method1049() * 2 / 100;
			local20 += Static49.aClass26_Sub1_9.method1049() * 2 / 100;
			local20 += Static19.aClass26_Sub1_3.method1049() * 2 / 100;
			local20 += Static121.aClass26_Sub1_19.method1049() * 2 / 100;
			local20 += Static134.aClass26_Sub1_21.method1049() * 2 / 100;
			local20 += Static64.aClass26_Sub1_18.method1049() * 2 / 100;
			local20 += Static78.aClass26_Sub1_14.method1049() * 2 / 100;
			if (local20 == 100) {
				Static112.aClass61_886 = Static57.aClass61_444;
				Static33.anInt1001 = 30;
				Static98.anInt2576 = 45;
			} else {
				if (local20 != 0) {
					Static112.aClass61_886 = Static123.method1929(new Class61[] { Static31.aClass61_287, Static39.method730(local20), Static85.aClass61_667 });
				}
				Static33.anInt1001 = 30;
			}
		} else if (Static98.anInt2576 == 45) {
			Static106.method1766(!Static61.aBoolean57);
			@Pc(445) Class5_Sub5_Sub1 local445 = new Class5_Sub5_Sub1();
			local445.method254();
			Static43.aClass12_3 = Static28.method617(Static86.aClass80_2, 22050, 0, Static4.aCanvas2);
			Static43.aClass12_3.method1514(local445);
			Static4.method1684(Static78.aClass26_Sub1_14, local445, Static64.aClass26_Sub1_18, Static82.aClass26_Sub1_15);
			Static108.aClass12_2 = Static28.method617(Static86.aClass80_2, 2048, 1, Static4.aCanvas2);
			Static85.aClass5_Sub5_Sub4_2 = new Class5_Sub5_Sub4();
			Static108.aClass12_2.method1514(Static85.aClass5_Sub5_Sub4_2);
			Static115.aClass9_1 = new Class9(22050, Static78.anInt1981);
			Static112.aClass61_886 = Static123.aClass61_969;
			Static98.anInt2576 = 50;
			Static33.anInt1001 = 35;
		} else if (Static98.anInt2576 == 50) {
			local20 = 0;
			if (Static63.aClass5_Sub2_Sub1_Sub1_Sub1_3 == null) {
				Static63.aClass5_Sub2_Sub1_Sub1_Sub1_3 = Static105.method2173(Static113.aClass61_893, Static96.aClass61_746, Static134.aClass26_Sub1_21, Static47.aClass26_Sub1_8);
			} else {
				local20++;
			}
			if (Static9.aClass5_Sub2_Sub1_Sub1_Sub1_1 == null) {
				Static9.aClass5_Sub2_Sub1_Sub1_Sub1_1 = Static105.method2173(Static106.aClass61_826, Static96.aClass61_746, Static134.aClass26_Sub1_21, Static47.aClass26_Sub1_8);
			} else {
				local20++;
			}
			if (Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4 == null) {
				Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4 = Static105.method2173(Static25.aClass61_221, Static96.aClass61_746, Static134.aClass26_Sub1_21, Static47.aClass26_Sub1_8);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static112.aClass61_886 = Static123.method1929(new Class61[] { Static103.aClass61_808, Static39.method730(local20 * 100 / 3), Static85.aClass61_667 });
				Static33.anInt1001 = 40;
			} else {
				Static98.anInt2576 = 60;
				Static33.anInt1001 = 40;
				Static112.aClass61_886 = Static27.aClass61_872;
			}
		} else if (Static98.anInt2576 == 60) {
			local20 = Static121.method1908(Static47.aClass26_Sub1_8, Static49.aClass26_Sub1_9);
			local59 = Static103.method1749();
			if (local20 < local59) {
				Static112.aClass61_886 = Static123.method1929(new Class61[] { Static58.aClass61_453, Static39.method730(local20 * 100 / local59), Static85.aClass61_667 });
				Static33.anInt1001 = 50;
			} else {
				Static112.aClass61_886 = Static4.aClass61_786;
				Static33.anInt1001 = 50;
				Static36.method697(5);
				Static98.anInt2576 = 70;
			}
		} else if (Static98.anInt2576 == 70) {
			if (Static16.aClass26_Sub1_2.method1023()) {
				Static31.method644(Static16.aClass26_Sub1_2);
				Static66.method1107(Static16.aClass26_Sub1_2);
				Static111.method1833(Static134.aClass26_Sub1_20, Static16.aClass26_Sub1_2);
				Static133.method2195(Static134.aClass26_Sub1_20, Static61.aBoolean57, Static16.aClass26_Sub1_2);
				Static34.method676(Static16.aClass26_Sub1_2, Static134.aClass26_Sub1_20);
				Static116.method1886(Static134.aClass26_Sub1_20, Static16.aClass26_Sub1_2, Static54.aBoolean49, Static63.aClass5_Sub2_Sub1_Sub1_Sub1_3);
				Static95.method1609(Static49.aClass26_Sub1_10, Static63.aClass26_Sub1_13, Static16.aClass26_Sub1_2);
				Static123.method1927(Static16.aClass26_Sub1_2, Static134.aClass26_Sub1_20);
				Static10.method187(Static16.aClass26_Sub1_2);
				Static33.method670(Static16.aClass26_Sub1_2);
				Static20.method455(Static134.aClass26_Sub1_20, Static134.aClass26_Sub1_21, Static4.aClass26_Sub1_17, Static47.aClass26_Sub1_8);
				Static100.method1678(Static16.aClass26_Sub1_2);
				Static115.method1881(Static16.aClass26_Sub1_2);
				Static112.aClass61_886 = Static62.aClass61_473;
				Static33.anInt1001 = 60;
				Static98.anInt2576 = 80;
			} else {
				Static112.aClass61_886 = Static123.method1929(new Class61[] { Static117.aClass61_931, Static39.method730(Static16.aClass26_Sub1_2.method1052()), Static85.aClass61_667 });
				Static33.anInt1001 = 60;
			}
		} else if (Static98.anInt2576 == 80) {
			local20 = 0;
			if (Static17.aClass5_Sub2_Sub1_Sub4_1 == null) {
				Static17.aClass5_Sub2_Sub1_Sub4_1 = Static26.method441(Static96.aClass61_746, Static47.aClass26_Sub1_8, Static119.aClass61_947);
			} else {
				local20++;
			}
			if (Static129.aClass5_Sub2_Sub1_Sub4_7 == null) {
				Static129.aClass5_Sub2_Sub1_Sub4_7 = Static26.method441(Static96.aClass61_746, Static47.aClass26_Sub1_8, Static2.aClass61_11);
			} else {
				local20++;
			}
			if (Static71.aClass5_Sub2_Sub1_Sub3Array24 == null) {
				Static71.aClass5_Sub2_Sub1_Sub3Array24 = Static23.method499(Static96.aClass61_746, Static47.aClass26_Sub1_8, Static113.aClass61_889);
			} else {
				local20++;
			}
			if (Static59.aClass5_Sub2_Sub1_Sub4Array3 == null) {
				Static59.aClass5_Sub2_Sub1_Sub4Array3 = Static103.method1745(Static47.aClass26_Sub1_8, Static61.aClass61_466, Static96.aClass61_746);
			} else {
				local20++;
			}
			if (Static113.aClass5_Sub2_Sub1_Sub4Array8 == null) {
				Static113.aClass5_Sub2_Sub1_Sub4Array8 = Static103.method1745(Static47.aClass26_Sub1_8, Static12.aClass61_113, Static96.aClass61_746);
			} else {
				local20++;
			}
			if (Static9.aClass5_Sub2_Sub1_Sub4Array1 == null) {
				Static9.aClass5_Sub2_Sub1_Sub4Array1 = Static103.method1745(Static47.aClass26_Sub1_8, Static96.aClass61_743, Static96.aClass61_746);
			} else {
				local20++;
			}
			if (Static60.aClass5_Sub2_Sub1_Sub4Array4 == null) {
				Static60.aClass5_Sub2_Sub1_Sub4Array4 = Static103.method1745(Static47.aClass26_Sub1_8, Static13.aClass61_126, Static96.aClass61_746);
			} else {
				local20++;
			}
			if (Static100.aClass5_Sub2_Sub1_Sub4Array7 == null) {
				Static100.aClass5_Sub2_Sub1_Sub4Array7 = Static103.method1745(Static47.aClass26_Sub1_8, Static45.aClass61_364, Static96.aClass61_746);
			} else {
				local20++;
			}
			if (Static75.aClass5_Sub2_Sub1_Sub4Array5 == null) {
				Static75.aClass5_Sub2_Sub1_Sub4Array5 = Static103.method1745(Static47.aClass26_Sub1_8, Static86.aClass61_678, Static96.aClass61_746);
			} else {
				local20++;
			}
			if (Static119.aClass5_Sub2_Sub1_Sub4Array10 == null) {
				Static119.aClass5_Sub2_Sub1_Sub4Array10 = Static103.method1745(Static47.aClass26_Sub1_8, Static16.aClass61_155, Static96.aClass61_746);
			} else {
				local20++;
			}
			if (Static115.aClass5_Sub2_Sub1_Sub4Array9 == null) {
				Static115.aClass5_Sub2_Sub1_Sub4Array9 = Static103.method1745(Static47.aClass26_Sub1_8, Static16.aClass61_157, Static96.aClass61_746);
			} else {
				local20++;
			}
			if (Static126.aClass5_Sub2_Sub1_Sub3Array38 == null) {
				Static126.aClass5_Sub2_Sub1_Sub3Array38 = Static23.method499(Static96.aClass61_746, Static47.aClass26_Sub1_8, Static114.aClass61_897);
			} else {
				local20++;
			}
			if (Static111.aClass5_Sub2_Sub1_Sub3Array33 == null) {
				Static111.aClass5_Sub2_Sub1_Sub3Array33 = Static23.method499(Static96.aClass61_746, Static47.aClass26_Sub1_8, Static20.aClass61_185);
			} else {
				local20++;
			}
			if (Static79.aClass5_Sub2_Sub1_Sub3_4 == null) {
				Static79.aClass5_Sub2_Sub1_Sub3_4 = Static68.method1135(Static96.aClass61_746, Static47.aClass26_Sub1_8, Static12.aClass61_108);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static112.aClass61_886 = Static123.method1929(new Class61[] { Static93.aClass61_721, Static39.method730(local20 * 100 / 14), Static85.aClass61_667 });
				Static33.anInt1001 = 70;
			} else {
				local59 = (int) (Math.random() * 21.0D) - 10;
				Static7.aClass5_Sub2_Sub1_Sub3Array13 = Static111.aClass5_Sub2_Sub1_Sub3Array33;
				Static129.aClass5_Sub2_Sub1_Sub4_7.method2033();
				local68 = (int) (Math.random() * 21.0D) - 10;
				local74 = (int) (Math.random() * 21.0D) - 10;
				local78 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(941) int local941 = 0; local941 < Static59.aClass5_Sub2_Sub1_Sub4Array3.length; local941++) {
					Static59.aClass5_Sub2_Sub1_Sub4Array3[local941].method2012(local78 + local59, local78 + local68, local78 + local74);
				}
				Static71.aClass5_Sub2_Sub1_Sub3Array24[0].method1352(local59 + local78, local68 + local78, local78 + local74);
				Static13.method273();
				Static98.anInt2576 = 90;
				Static33.anInt1001 = 70;
				Static112.aClass61_886 = Static72.aClass61_608;
			}
		} else if (Static98.anInt2576 == 90) {
			if (Static83.aClass26_Sub1_16.method1023()) {
				@Pc(1031) Class46 local1031 = new Class46(Static83.aClass26_Sub1_16, Static47.aClass26_Sub1_8, 20, 0.8D, Static61.aBoolean57 ? 64 : 128);
				Static51.method932(local1031);
				Static51.method926(0.8D);
				Static98.anInt2576 = 110;
				Static33.anInt1001 = 90;
				Static112.aClass61_886 = Static118.aClass61_942;
			} else {
				Static112.aClass61_886 = Static123.method1929(new Class61[] { Static13.aClass61_124, Static39.method730(Static83.aClass26_Sub1_16.method1052()), Static85.aClass61_667 });
				Static33.anInt1001 = 90;
			}
		} else if (Static98.anInt2576 == 110) {
			Static47.aClass15_1 = new Class15();
			Static86.aClass80_2.method2040(Static47.aClass15_1, 10);
			Static98.anInt2576 = 120;
			Static33.anInt1001 = 94;
			Static112.aClass61_886 = Static42.aClass61_329;
		} else if (Static98.anInt2576 == 120) {
			if (Static49.aClass26_Sub1_9.method1042(Static96.aClass61_746, Static49.aClass61_387)) {
				@Pc(1106) Class32 local1106 = new Class32(Static49.aClass26_Sub1_9.method1027(Static49.aClass61_387, Static96.aClass61_746));
				Static48.method880(local1106);
				Static33.anInt1001 = 96;
				Static112.aClass61_886 = Static121.aClass61_960;
				Static98.anInt2576 = 130;
			} else {
				Static112.aClass61_886 = Static123.method1929(new Class61[] { Static107.aClass61_836, Static82.aClass61_649 });
				Static33.anInt1001 = 96;
			}
		} else if (Static98.anInt2576 == 130) {
			if (!Static4.aClass26_Sub1_17.method1023()) {
				Static112.aClass61_886 = Static123.method1929(new Class61[] { Static58.aClass61_448, Static39.method730(Static4.aClass26_Sub1_17.method1052() * 4 / 5), Static85.aClass61_667 });
				Static33.anInt1001 = 100;
			} else if (!Static121.aClass26_Sub1_19.method1023()) {
				Static112.aClass61_886 = Static123.method1929(new Class61[] { Static58.aClass61_448, Static39.method730(Static121.aClass26_Sub1_19.method1052() / 6 + 80), Static85.aClass61_667 });
				Static33.anInt1001 = 100;
			} else if (Static134.aClass26_Sub1_21.method1023()) {
				Static112.aClass61_886 = Static25.aClass61_222;
				Static33.anInt1001 = 100;
				Static98.anInt2576 = 140;
			} else {
				Static112.aClass61_886 = Static123.method1929(new Class61[] { Static58.aClass61_448, Static39.method730(Static134.aClass26_Sub1_21.method1052() / 20 + 96), Static85.aClass61_667 });
				Static33.anInt1001 = 100;
			}
		} else if (Static98.anInt2576 == 140) {
			Static36.method697(10);
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public static void method739() {
		anIntArray175 = null;
		anIntArray176 = null;
		aClass61_320 = null;
		aClass5_Sub14Array1 = null;
		aClass26_Sub1Array1 = null;
		aClass61_321 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBI)I")
	public static int method740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class5_Sub15 local6 = (Class5_Sub15) Static57.aClass20_6.method656((long) arg1);
		if (local6 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local6.anIntArray296.length) {
			return local6.anIntArray296[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Z")
	public static boolean method741(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
