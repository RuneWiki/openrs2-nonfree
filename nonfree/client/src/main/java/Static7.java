import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "q", descriptor = "I")
	public static int anInt84;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "I")
	public static int anInt79 = 0;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!w;")
	public static Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!b", name = "j", descriptor = "[S")
	public static short[] aShortArray1 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[I")
	public static int[] anIntArray8 = new int[5];

	@OriginalMember(owner = "client!b", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_50 = Static41.method597("Spieler");

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_51 = Static41.method597("<img=0>");

	@OriginalMember(owner = "client!b", name = "r", descriptor = "I")
	public static int anInt85 = 0;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
	public static int[] anIntArray9 = new int[25];

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_52 = Static41.method597("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!b", name = "u", descriptor = "Lclient!od;")
	public static Class60 aClass60_53 = Static41.method597(" weitere Optionen");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method61() {
		@Pc(20) int local20;
		if (Static76.anInt1845 == 0) {
			Static30.aClass48_1 = new Class48(4, 104, 104, Static16.anIntArrayArrayArray1);
			for (local20 = 0; local20 < 4; local20++) {
				Static50.aClass28Array3[local20] = new Class28(104, 104);
			}
			Static106.aClass4_Sub3_Sub6_Sub3_5 = new Class4_Sub3_Sub6_Sub3(512, 512);
			Static68.aClass60_682 = Static74.aClass60_763;
			Static97.anInt2283 = 5;
			Static76.anInt1845 = 20;
			return;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(73) int local73;
		@Pc(77) int local77;
		if (Static76.anInt1845 == 20) {
			@Pc(57) int[] local57 = new int[9];
			for (local59 = 0; local59 < 9; local59++) {
				local67 = local59 * 32 + 143;
				local73 = local67 * 3 + 600;
				local77 = Class4_Sub3_Sub6_Sub4.anIntArray301[local67];
				local57[local59] = local73 * local77 >> 16;
			}
			Static64.method1005(local57);
			Static97.anInt2283 = 10;
			Static76.anInt1845 = 30;
			Static68.aClass60_682 = Static15.aClass60_1032;
		} else if (Static76.anInt1845 == 30) {
			Static42.aClass10_Sub1_7 = Static83.method1327(0, true, false, true);
			Static24.aClass10_Sub1_5 = Static83.method1327(1, true, false, true);
			Static69.aClass10_Sub1_12 = Static83.method1327(2, true, true, false);
			Static125.aClass10_Sub1_20 = Static83.method1327(3, true, false, true);
			Static116.aClass10_Sub1_19 = Static83.method1327(4, true, false, true);
			Static127.aClass10_Sub1_8 = Static83.method1327(5, true, true, true);
			Static10.aClass10_Sub1_3 = Static83.method1327(6, false, true, true);
			Static28.aClass10_Sub1_15 = Static83.method1327(7, true, false, true);
			Static16.aClass10_Sub1_4 = Static83.method1327(8, true, false, true);
			Static48.aClass10_Sub1_9 = Static83.method1327(9, true, false, true);
			Static68.aClass10_Sub1_11 = Static83.method1327(10, true, false, true);
			Static79.aClass10_Sub1_14 = Static83.method1327(11, true, false, true);
			Static106.aClass10_Sub1_16 = Static83.method1327(12, true, false, true);
			Static128.aClass10_Sub1_21 = Static83.method1327(13, true, true, false);
			Static108.aClass10_Sub1_18 = Static83.method1327(14, false, false, true);
			Static107.aClass10_Sub1_17 = Static83.method1327(15, true, false, true);
			Static97.anInt2283 = 20;
			Static76.anInt1845 = 40;
			Static68.aClass60_682 = Static94.aClass60_906;
		} else if (Static76.anInt1845 == 40) {
			local20 = Static42.aClass10_Sub1_7.method1793() * 4 / 100;
			local20 += Static24.aClass10_Sub1_5.method1793() * 4 / 100;
			local20 += Static69.aClass10_Sub1_12.method1793() * 2 / 100;
			local20 += Static125.aClass10_Sub1_20.method1793() * 2 / 100;
			local20 += Static116.aClass10_Sub1_19.method1793() * 6 / 100;
			local20 += Static127.aClass10_Sub1_8.method1793() * 4 / 100;
			local20 += Static10.aClass10_Sub1_3.method1793() * 2 / 100;
			local20 += Static28.aClass10_Sub1_15.method1793() * 60 / 100;
			local20 += Static16.aClass10_Sub1_4.method1793() * 2 / 100;
			local20 += Static48.aClass10_Sub1_9.method1793() * 2 / 100;
			local20 += Static68.aClass10_Sub1_11.method1793() * 2 / 100;
			local20 += Static79.aClass10_Sub1_14.method1793() * 2 / 100;
			local20 += Static106.aClass10_Sub1_16.method1793() * 2 / 100;
			local20 += Static128.aClass10_Sub1_21.method1793() * 2 / 100;
			local20 += Static108.aClass10_Sub1_18.method1793() * 2 / 100;
			local20 += Static107.aClass10_Sub1_17.method1793() * 2 / 100;
			if (local20 == 100) {
				Static68.aClass60_682 = Static54.aClass60_532;
				Static76.anInt1845 = 45;
				Static97.anInt2283 = 30;
			} else {
				if (local20 != 0) {
					Static68.aClass60_682 = Static12.method1761(new Class60[] { Static90.aClass60_870, Static65.method1051(local20), Static39.aClass60_392 });
				}
				Static97.anInt2283 = 30;
			}
		} else if (Static76.anInt1845 == 45) {
			Static111.method1831(!Static8.aBoolean3);
			@Pc(462) Class4_Sub1_Sub1 local462 = new Class4_Sub1_Sub1();
			local462.method109();
			Static85.aClass11_3 = method67(22050, Static105.aClass81_4, Static110.aCanvas1, 0);
			Static85.aClass11_3.method1837(local462);
			Static33.method497(Static107.aClass10_Sub1_17, Static116.aClass10_Sub1_19, Static108.aClass10_Sub1_18, local462);
			Static113.aClass11_2 = method67(2048, Static105.aClass81_4, Static110.aCanvas1, 1);
			Static109.aClass4_Sub1_Sub3_1 = new Class4_Sub1_Sub3();
			Static113.aClass11_2.method1837(Static109.aClass4_Sub1_Sub3_1);
			Static40.aClass63_1 = new Class63(22050, Static115.anInt2690);
			Static76.anInt1845 = 50;
			Static68.aClass60_682 = Static15.aClass60_1028;
			Static97.anInt2283 = 35;
		} else if (Static76.anInt1845 == 50) {
			local20 = 0;
			if (Static96.aClass4_Sub3_Sub6_Sub1_Sub1_5 == null) {
				Static96.aClass4_Sub3_Sub6_Sub1_Sub1_5 = Static65.method1064(Static16.aClass10_Sub1_4, Static44.aClass60_894, Static128.aClass10_Sub1_21, Static23.aClass60_253);
			} else {
				local20++;
			}
			if (Static132.aClass4_Sub3_Sub6_Sub1_Sub1_6 == null) {
				Static132.aClass4_Sub3_Sub6_Sub1_Sub1_6 = Static65.method1064(Static16.aClass10_Sub1_4, Static39.aClass60_394, Static128.aClass10_Sub1_21, Static23.aClass60_253);
			} else {
				local20++;
			}
			if (Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3 == null) {
				Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3 = Static65.method1064(Static16.aClass10_Sub1_4, Static71.aClass60_754, Static128.aClass10_Sub1_21, Static23.aClass60_253);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static68.aClass60_682 = Static12.method1761(new Class60[] { Static97.aClass60_925, Static65.method1051(local20 * 100 / 3), Static39.aClass60_392 });
				Static97.anInt2283 = 40;
			} else {
				Static68.aClass60_682 = Static59.aClass60_563;
				Static76.anInt1845 = 60;
				Static97.anInt2283 = 40;
			}
		} else if (Static76.anInt1845 == 60) {
			local20 = Static9.method94(Static68.aClass10_Sub1_11, Static16.aClass10_Sub1_4);
			local59 = Static86.method1376();
			if (local59 > local20) {
				Static68.aClass60_682 = Static12.method1761(new Class60[] { Static52.aClass60_511, Static65.method1051(local20 * 100 / local59), Static39.aClass60_392 });
				Static97.anInt2283 = 50;
			} else {
				Static97.anInt2283 = 50;
				Static68.aClass60_682 = Static25.aClass60_278;
				Static32.method496(5);
				Static76.anInt1845 = 70;
			}
		} else if (Static76.anInt1845 == 70) {
			if (Static69.aClass10_Sub1_12.method1765()) {
				Static55.method880(Static69.aClass10_Sub1_12);
				Static29.method475(Static69.aClass10_Sub1_12);
				Static84.method1352(Static69.aClass10_Sub1_12, Static28.aClass10_Sub1_15);
				Static43.method623(Static8.aBoolean3, Static69.aClass10_Sub1_12, Static28.aClass10_Sub1_15);
				Static96.method1567(Static69.aClass10_Sub1_12, Static28.aClass10_Sub1_15);
				Static116.method1879(Static69.aClass10_Sub1_12, Static29.aBoolean36, Static28.aClass10_Sub1_15, Static96.aClass4_Sub3_Sub6_Sub1_Sub1_5);
				Static115.method1870(Static69.aClass10_Sub1_12, Static24.aClass10_Sub1_5, Static42.aClass10_Sub1_7);
				Static129.method679(Static28.aClass10_Sub1_15, Static69.aClass10_Sub1_12);
				Static113.method791(Static69.aClass10_Sub1_12);
				Static79.method1276(Static69.aClass10_Sub1_12);
				Static1.method6(Static128.aClass10_Sub1_21, Static125.aClass10_Sub1_20, Static16.aClass10_Sub1_4, Static28.aClass10_Sub1_15);
				Static85.method1370(Static69.aClass10_Sub1_12);
				Static106.method1743(Static69.aClass10_Sub1_12);
				Static97.anInt2283 = 60;
				Static76.anInt1845 = 80;
				Static68.aClass60_682 = Static41.aClass60_400;
			} else {
				Static68.aClass60_682 = Static12.method1761(new Class60[] { Static19.aClass60_199, Static65.method1051(Static69.aClass10_Sub1_12.method1789()), Static39.aClass60_392 });
				Static97.anInt2283 = 60;
			}
		} else if (Static76.anInt1845 == 80) {
			local20 = 0;
			if (Static28.aClass4_Sub3_Sub6_Sub3_3 == null) {
				Static28.aClass4_Sub3_Sub6_Sub3_3 = Static25.method448(Static23.aClass60_253, Static16.aClass10_Sub1_4, Static16.aClass60_180);
			} else {
				local20++;
			}
			if (Static6.aClass4_Sub3_Sub6_Sub3_1 == null) {
				Static6.aClass4_Sub3_Sub6_Sub3_1 = Static25.method448(Static23.aClass60_253, Static16.aClass10_Sub1_4, Static106.aClass60_980);
			} else {
				local20++;
			}
			if (Static24.aClass4_Sub3_Sub6_Sub2Array2 == null) {
				Static24.aClass4_Sub3_Sub6_Sub2Array2 = Static82.method1299(Static59.aClass60_562, Static16.aClass10_Sub1_4, Static23.aClass60_253);
			} else {
				local20++;
			}
			if (Static128.aClass4_Sub3_Sub6_Sub3Array12 == null) {
				Static128.aClass4_Sub3_Sub6_Sub3Array12 = Static36.method562(Static23.aClass60_253, Static14.aClass60_165, Static16.aClass10_Sub1_4);
			} else {
				local20++;
			}
			if (Static76.aClass4_Sub3_Sub6_Sub3Array8 == null) {
				Static76.aClass4_Sub3_Sub6_Sub3Array8 = Static36.method562(Static23.aClass60_253, Static81.aClass60_799, Static16.aClass10_Sub1_4);
			} else {
				local20++;
			}
			if (Static33.aClass4_Sub3_Sub6_Sub3Array1 == null) {
				Static33.aClass4_Sub3_Sub6_Sub3Array1 = Static36.method562(Static23.aClass60_253, Static83.aClass60_818, Static16.aClass10_Sub1_4);
			} else {
				local20++;
			}
			if (Static41.aClass4_Sub3_Sub6_Sub3Array2 == null) {
				Static41.aClass4_Sub3_Sub6_Sub3Array2 = Static36.method562(Static23.aClass60_253, Static24.aClass60_266, Static16.aClass10_Sub1_4);
			} else {
				local20++;
			}
			if (Static129.aClass4_Sub3_Sub6_Sub3Array4 == null) {
				Static129.aClass4_Sub3_Sub6_Sub3Array4 = Static36.method562(Static23.aClass60_253, Static22.aClass60_245, Static16.aClass10_Sub1_4);
			} else {
				local20++;
			}
			if (Static113.aClass4_Sub3_Sub6_Sub3Array6 == null) {
				Static113.aClass4_Sub3_Sub6_Sub3Array6 = Static36.method562(Static23.aClass60_253, Static107.aClass60_996, Static16.aClass10_Sub1_4);
			} else {
				local20++;
			}
			if (Static122.aClass4_Sub3_Sub6_Sub3Array11 == null) {
				Static122.aClass4_Sub3_Sub6_Sub3Array11 = Static36.method562(Static23.aClass60_253, Static98.aClass60_932, Static16.aClass10_Sub1_4);
			} else {
				local20++;
			}
			if (Static118.aClass4_Sub3_Sub6_Sub3Array10 == null) {
				Static118.aClass4_Sub3_Sub6_Sub3Array10 = Static36.method562(Static23.aClass60_253, Static122.aClass60_1088, Static16.aClass10_Sub1_4);
			} else {
				local20++;
			}
			if (Static40.aClass4_Sub3_Sub6_Sub2Array4 == null) {
				Static40.aClass4_Sub3_Sub6_Sub2Array4 = Static82.method1299(Static119.aClass60_1068, Static16.aClass10_Sub1_4, Static23.aClass60_253);
			} else {
				local20++;
			}
			if (Static39.aClass4_Sub3_Sub6_Sub2Array3 == null) {
				Static39.aClass4_Sub3_Sub6_Sub2Array3 = Static82.method1299(Static37.aClass60_377, Static16.aClass10_Sub1_4, Static23.aClass60_253);
			} else {
				local20++;
			}
			if (Static5.aClass4_Sub3_Sub6_Sub2_2 == null) {
				Static5.aClass4_Sub3_Sub6_Sub2_2 = Static122.method1921(Static16.aClass10_Sub1_4, Static125.aClass60_1112, Static23.aClass60_253);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static68.aClass60_682 = Static12.method1761(new Class60[] { Static21.aClass60_235, Static65.method1051(local20 * 100 / 14), Static39.aClass60_392 });
				Static97.anInt2283 = 70;
			} else {
				Static93.aClass4_Sub3_Sub6_Sub2Array6 = Static39.aClass4_Sub3_Sub6_Sub2Array3;
				local67 = (int) (Math.random() * 21.0D) - 10;
				Static6.aClass4_Sub3_Sub6_Sub3_1.method1623();
				local59 = (int) (Math.random() * 21.0D) - 10;
				local77 = (int) (Math.random() * 41.0D) - 20;
				local73 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(976) int local976 = 0; local976 < Static128.aClass4_Sub3_Sub6_Sub3Array12.length; local976++) {
					Static128.aClass4_Sub3_Sub6_Sub3Array12[local976].method1626(local59 + local77, local77 + local67, local77 + local73);
				}
				Static24.aClass4_Sub3_Sub6_Sub2Array2[0].method1557(local59 + local77, local67 - -local77, local77 + local73);
				Static47.method650();
				Static76.anInt1845 = 90;
				Static68.aClass60_682 = Static25.aClass60_280;
				Static97.anInt2283 = 70;
			}
		} else if (Static76.anInt1845 == 90) {
			if (Static48.aClass10_Sub1_9.method1765()) {
				@Pc(1067) Class68 local1067 = new Class68(Static48.aClass10_Sub1_9, Static16.aClass10_Sub1_4, 20, 0.8D, Static8.aBoolean3 ? 64 : 128);
				Static100.method1684(local1067);
				Static100.method1675(0.8D);
				Static97.anInt2283 = 90;
				Static76.anInt1845 = 110;
				Static68.aClass60_682 = Static128.aClass60_1115;
			} else {
				Static68.aClass60_682 = Static12.method1761(new Class60[] { Static96.aClass60_919, Static65.method1051(Static48.aClass10_Sub1_9.method1789()), Static39.aClass60_392 });
				Static97.anInt2283 = 90;
			}
		} else if (Static76.anInt1845 == 110) {
			Static35.aClass25_1 = new Class25();
			Static105.aClass81_4.method1937(10, Static35.aClass25_1);
			Static97.anInt2283 = 94;
			Static76.anInt1845 = 120;
			Static68.aClass60_682 = Static16.aClass60_182;
		} else if (Static76.anInt1845 == 120) {
			if (Static68.aClass10_Sub1_11.method1775(Static44.aClass60_892, Static23.aClass60_253)) {
				@Pc(1138) Class31 local1138 = new Class31(Static68.aClass10_Sub1_11.method1769(Static44.aClass60_892, Static23.aClass60_253));
				Static107.method1758(local1138);
				Static97.anInt2283 = 96;
				Static76.anInt1845 = 130;
				Static68.aClass60_682 = Static37.aClass60_381;
			} else {
				Static68.aClass60_682 = Static12.method1761(new Class60[] { Static55.aClass60_533, Static61.aClass60_569 });
				Static97.anInt2283 = 96;
			}
		} else if (Static76.anInt1845 == 130) {
			if (!Static125.aClass10_Sub1_20.method1765()) {
				Static68.aClass60_682 = Static12.method1761(new Class60[] { Static20.aClass60_220, Static65.method1051(Static125.aClass10_Sub1_20.method1789() * 4 / 5), Static39.aClass60_392 });
				Static97.anInt2283 = 100;
			} else if (!Static106.aClass10_Sub1_16.method1765()) {
				Static68.aClass60_682 = Static12.method1761(new Class60[] { Static20.aClass60_220, Static65.method1051(Static106.aClass10_Sub1_16.method1789() / 6 + 80), Static39.aClass60_392 });
				Static97.anInt2283 = 100;
			} else if (Static128.aClass10_Sub1_21.method1765()) {
				Static76.anInt1845 = 140;
				Static97.anInt2283 = 100;
				Static68.aClass60_682 = Static115.aClass60_1044;
			} else {
				Static68.aClass60_682 = Static12.method1761(new Class60[] { Static20.aClass60_220, Static65.method1051(Static128.aClass10_Sub1_21.method1789() / 20 + 96), Static39.aClass60_392 });
				Static97.anInt2283 = 100;
			}
		} else if (Static76.anInt1845 == 140) {
			Static32.method496(10);
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	public static void method62() {
		aClass60_51 = null;
		anIntArray8 = null;
		aClass82_1 = null;
		aClass60_53 = null;
		anIntArray9 = null;
		aClass60_52 = null;
		aShortArray1 = null;
		aClass60_50 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)Lclient!ne;")
	public static Class4_Sub3_Sub10 method63(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub10 local10 = (Class4_Sub3_Sub10) Static81.aClass12_16.method289((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static110.aClass10_29.method1774(12, arg0);
		local10 = new Class4_Sub3_Sub10();
		if (local20 != null) {
			local10.method1265(new Class4_Sub9(local20));
		}
		local10.method1266();
		Static81.aClass12_16.method290(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)Lclient!me;")
	public static Class4_Sub3_Sub6_Sub1_Sub1 method64(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(25) Class4_Sub3_Sub6_Sub1_Sub1 local25 = new Class4_Sub3_Sub6_Sub1_Sub1(arg0, Static2.anIntArray1, Static29.anIntArray91, Static125.anIntArray341, Static113.anIntArray132, Static75.anIntArray125, Static56.aByteArrayArray7);
			Static53.method866();
			return local25;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!tf;II)Lclient!od;")
	public static Class60 method65(@OriginalArg(0) Class4_Sub9 arg0) {
		try {
			@Pc(7) Class60 local7 = new Class60();
			local7.anInt1991 = arg0.method770();
			if (local7.anInt1991 > 32767) {
				local7.anInt1991 = 32767;
			}
			local7.aByteArray21 = new byte[local7.anInt1991];
			arg0.anInt1312 += Static5.aClass31_1.method646(0, local7.aByteArray21, local7.anInt1991, arg0.anInt1312, arg0.aByteArray6);
			return local7;
		} catch (@Pc(52) Exception local52) {
			return Static11.aClass60_140;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)V")
	public static void method66(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static48.anInt1184 < 2 && Static44.anInt2167 == 0 && !Static86.aBoolean71) {
			return;
		}
		@Pc(49) Class60 local49;
		if (Static44.anInt2167 == 1 && Static48.anInt1184 < 2) {
			local49 = Static12.method1761(new Class60[] { Static83.aClass60_819, Static83.aClass60_814, Static108.aClass60_1004, Static29.aClass60_306 });
		} else if (Static86.aBoolean71 && Static48.anInt1184 < 2) {
			local49 = Static12.method1761(new Class60[] { Static124.aClass60_1108, Static83.aClass60_814, Static12.aClass60_998, Static29.aClass60_306 });
		} else {
			local49 = Static48.method668(Static48.anInt1184 - 1);
		}
		if (Static48.anInt1184 > 2) {
			local49 = Static12.method1761(new Class60[] { local49, Static56.aClass60_547, Static65.method1051(Static48.anInt1184 - 2), Static55.aClass60_539 });
		}
		Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1208(local49, arg1 + 4, arg0 + 15, Static118.anInt2741 / 1000);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BILclient!ve;Ljava/awt/Component;I)Lclient!cc;")
	private static Class11 method67(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static115.anInt2690 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class11 local30 = (Class11) Class.forName("Class11_Sub2").getDeclaredConstructor().newInstance();
			local30.anIntArray333 = new int[(Static6.aBoolean2 ? 2 : 1) * 256];
			local30.anInt2668 = arg0;
			local30.method1838(arg2);
			local30.anInt2665 = (arg0 & -1024) + 1024;
			if (local30.anInt2665 > 16384) {
				local30.anInt2665 = 16384;
			}
			local30.method1843(local30.anInt2665);
			if (Static39.anInt1048 > 0 && Static62.aClass61_1 == null) {
				Static62.aClass61_1 = new Class61();
				Static62.aClass61_1.aClass81_3 = arg1;
				arg1.method1937(Static39.anInt1048, Static62.aClass61_1);
			}
			if (Static62.aClass61_1 != null) {
				if (Static62.aClass61_1.aClass11Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static62.aClass61_1.aClass11Array1[arg3] = local30;
			}
			return local30;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(111) Class11_Sub1 local111 = new Class11_Sub1(arg1, arg3);
				local111.anIntArray333 = new int[(Static6.aBoolean2 ? 2 : 1) * 256];
				local111.anInt2668 = arg0;
				local111.method1838(arg2);
				local111.anInt2665 = 16384;
				local111.method1843(local111.anInt2665);
				if (Static39.anInt1048 > 0 && Static62.aClass61_1 == null) {
					Static62.aClass61_1 = new Class61();
					Static62.aClass61_1.aClass81_3 = arg1;
					arg1.method1937(Static39.anInt1048, Static62.aClass61_1);
				}
				if (Static62.aClass61_1 != null) {
					if (Static62.aClass61_1.aClass11Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static62.aClass61_1.aClass11Array1[arg3] = local111;
				}
				return local111;
			} catch (@Pc(181) Throwable local181) {
				return new Class11();
			}
		}
	}
}
