import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray40;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2 aClass8_Sub1_Sub3_Sub2_5;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_836 = Static56.method816("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "[I")
	public static int[] anIntArray230 = new int[1000];

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public static int anInt1804 = 0;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "Lclient!ic;")
	public static Class34 aClass34_837 = Static56.method816("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
	public static int anInt1806 = 0;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_838 = Static56.method816("<img=0>");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	public static void method1093() {
		Static2.aClass49_1 = new Class49();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2 method1094() {
		@Pc(7) Class8_Sub1_Sub3_Sub2 local7 = new Class8_Sub1_Sub3_Sub2();
		local7.aByteArray3 = Static115.aByteArrayArray57[0];
		local7.anInt485 = Static19.anIntArray65[0];
		local7.anInt486 = Static13.anIntArray47[0];
		local7.anInt487 = Static5.anInt70;
		local7.anInt482 = Static92.anIntArray307[0];
		local7.anInt484 = Static42.anIntArray135[0];
		local7.anInt483 = Static92.anInt2205;
		local7.anIntArray62 = Static32.anIntArray110;
		Static2.method10();
		return local7;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void method1095() {
		aClass34_837 = null;
		aShortArrayArray6 = null;
		aClass34_838 = null;
		anIntArray230 = null;
		aByteArrayArray40 = null;
		aClass34_836 = null;
		aClass8_Sub1_Sub3_Sub2_5 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!dd;I)V")
	public static void method1098(@OriginalArg(0) Class14 arg0) {
		Static36.aClass14_12 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3 method1099() {
		@Pc(9) Class8_Sub1_Sub3_Sub3 local9 = new Class8_Sub1_Sub3_Sub3();
		@Pc(13) byte[] local13 = Static115.aByteArrayArray57[0];
		local9.anInt2537 = Static42.anIntArray135[0];
		local9.anInt2535 = Static92.anIntArray307[0];
		local9.anInt2534 = Static92.anInt2205;
		local9.anInt2538 = Static13.anIntArray47[0];
		local9.anInt2533 = Static19.anIntArray65[0];
		@Pc(47) int local47 = local9.anInt2537 * local9.anInt2533;
		local9.anIntArray342 = new int[local47];
		local9.anInt2536 = Static5.anInt70;
		for (@Pc(56) int local56 = 0; local56 < local47; local56++) {
			local9.anIntArray342[local56] = Static32.anIntArray110[local13[local56] & 0xFF];
		}
		Static2.method10();
		return local9;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIIIILclient!cd;)V")
	public static void method1102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class8_Sub1_Sub4 arg4) {
		@Pc(7) Class8_Sub14 local7 = new Class8_Sub14();
		local7.anInt1880 = arg2 * 128;
		local7.anInt1869 = arg0 * 128;
		local7.anInt1873 = arg4.anInt429;
		local7.anInt1868 = arg3;
		local7.anInt1875 = arg4.anInt432;
		@Pc(39) int local39 = arg4.anInt455;
		local7.anInt1866 = arg4.anInt415;
		local7.anIntArray243 = arg4.anIntArray58;
		@Pc(50) int local50 = arg4.anInt443;
		if (arg1 == 1 || arg1 == 3) {
			local39 = arg4.anInt443;
			local50 = arg4.anInt455;
		}
		local7.anInt1867 = (local50 + arg2) * 128;
		local7.anInt1879 = arg4.anInt416 * 128;
		local7.anInt1871 = (arg0 + local39) * 128;
		if (arg4.anIntArray56 != null) {
			local7.aClass8_Sub1_Sub4_1 = arg4;
			local7.method1137();
		}
		Static58.aClass49_7.method1114(local7);
		if (local7.anIntArray243 != null) {
			local7.anInt1882 = local7.anInt1875 + (int) (Math.random() * (double) (local7.anInt1866 - local7.anInt1875));
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!ub;Lclient!ub;)V")
	public static void method1103(@OriginalArg(1) Class8_Sub1_Sub3_Sub4_Sub1 arg0, @OriginalArg(2) Class8_Sub1_Sub3_Sub4_Sub1 arg1) {
		if (Static48.aClass8_Sub1_Sub3_Sub3Array39 == null) {
			Static48.aClass8_Sub1_Sub3_Sub3Array39 = Static127.method1982(Static45.aClass34_570, Static92.aClass14_Sub1_16, Static83.aClass34_940);
		}
		if (Static21.aClass8_Sub1_Sub3_Sub2Array1 == null) {
			Static21.aClass8_Sub1_Sub3_Sub2Array1 = Static72.method1070(Static83.aClass34_940, Static92.aClass14_Sub1_16, Static60.aClass34_753);
		}
		if (Static49.aClass8_Sub1_Sub3_Sub2Array4 == null) {
			Static49.aClass8_Sub1_Sub3_Sub2Array4 = Static72.method1070(Static83.aClass34_940, Static92.aClass14_Sub1_16, Static79.aClass34_855);
		}
		if (Static80.aClass8_Sub1_Sub3_Sub2Array7 == null) {
			Static80.aClass8_Sub1_Sub3_Sub2Array7 = Static72.method1070(Static83.aClass34_940, Static92.aClass14_Sub1_16, Static66.aClass34_1360);
		}
		Static110.method1729(0, 23, 765, 480, 0);
		Static110.method1736(0, 0, 125, 23, 12425273, 9135624);
		Static110.method1736(125, 0, 640, 23, 5197647, 2697513);
		arg1.method1753(Static8.aClass34_108, 62, 15, 0, -1);
		if (Static80.aClass8_Sub1_Sub3_Sub2Array7 != null) {
			Static80.aClass8_Sub1_Sub3_Sub2Array7[1].method300(140, 1);
			arg0.method1741(Static45.aClass34_574, 152, 10, 16777215, -1);
			Static80.aClass8_Sub1_Sub3_Sub2Array7[0].method300(140, 12);
			arg0.method1741(Static1.aClass34_1, 152, 21, 16777215, -1);
		}
		if (Static49.aClass8_Sub1_Sub3_Sub2Array4 != null) {
			if (Static68.anIntArray208[0] == 0 && Static101.anIntArray325[0] == 0) {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[2].method300(280, 4);
			} else {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[0].method300(280, 4);
			}
			if (Static68.anIntArray208[0] == 0 && Static101.anIntArray325[0] == 1) {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[3].method300(295, 4);
			} else {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[1].method300(295, 4);
			}
			arg1.method1741(Static74.aClass34_834, 312, 17, 16777215, -1);
			if (Static68.anIntArray208[0] == 1 && Static101.anIntArray325[0] == 0) {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[2].method300(390, 4);
			} else {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[0].method300(390, 4);
			}
			if (Static68.anIntArray208[0] == 1 && Static101.anIntArray325[0] == 1) {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[3].method300(405, 4);
			} else {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[1].method300(405, 4);
			}
			arg1.method1741(Static128.aClass34_1387, 422, 17, 16777215, -1);
			if (Static68.anIntArray208[0] == 2 && Static101.anIntArray325[0] == 0) {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[2].method300(500, 4);
			} else {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[0].method300(500, 4);
			}
			if (Static68.anIntArray208[0] == 2 && Static101.anIntArray325[0] == 1) {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[3].method300(515, 4);
			} else {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[1].method300(515, 4);
			}
			arg1.method1741(Static116.aClass34_1228, 532, 17, 16777215, -1);
			if (Static68.anIntArray208[0] == 3 && Static101.anIntArray325[0] == 0) {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[2].method300(610, 4);
			} else {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[0].method300(610, 4);
			}
			if (Static68.anIntArray208[0] == 3 && Static101.anIntArray325[0] == 1) {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[3].method300(625, 4);
			} else {
				Static49.aClass8_Sub1_Sub3_Sub2Array4[1].method300(625, 4);
			}
			arg1.method1741(Static41.aClass34_530, 642, 17, 16777215, -1);
		}
		Static110.method1729(708, 4, 50, 16, 0);
		arg0.method1753(Static62.aClass34_759, 733, 16, 16777215, -1);
		Static44.anInt1073 = -1;
		if (Static48.aClass8_Sub1_Sub3_Sub3Array39 == null) {
			return;
		}
		@Pc(397) int local397 = 8;
		@Pc(403) int local403 = 24;
		@Pc(405) int local405;
		@Pc(407) int local407;
		do {
			local405 = local403;
			local407 = local397;
			if (local403 * (local397 - 1) >= Static116.anInt2617) {
				local397--;
			}
			if (Static116.anInt2617 <= local397 * (local403 - 1)) {
				local403--;
			}
			if (Static116.anInt2617 <= local397 * (local403 - 1)) {
				local403--;
			}
		} while (local403 != local405 || local397 != local407);
		local405 = (765 - local397 * 88) / (local397 - -1);
		local407 = (480 - local403 * 19) / (local403 + 1);
		if (local407 > 5) {
			local407 = 5;
		}
		if (local405 > 5) {
			local405 = 5;
		}
		@Pc(504) int local504 = (765 - local405 * (local397 - 1) - local397 * 88) / 2;
		@Pc(520) int local520 = (480 - (local403 - 1) * local407 - local403 * 19) / 2;
		@Pc(522) int local522 = local504;
		@Pc(527) int local527 = local520 + 23;
		@Pc(529) int local529 = 0;
		for (@Pc(531) int local531 = 0; local531 < Static116.anInt2617; local531++) {
			@Pc(537) Class2 local537 = Static91.aClass2Array1[local531];
			@Pc(539) boolean local539 = true;
			@Pc(544) Class34 local544 = Static44.method672(local537.anInt27);
			if (local537.anInt27 == -1) {
				local544 = Static62.aClass34_763;
				local539 = false;
			} else if (local537.anInt27 > 1980) {
				local544 = Static25.aClass34_357;
				local539 = false;
			}
			if (Static14.anInt366 >= local522 && Static121.anInt2909 >= local527 && Static14.anInt366 < local522 + 88 && Static121.anInt2909 < local527 + 19 && local539) {
				Static44.anInt1073 = local531;
				Static48.aClass8_Sub1_Sub3_Sub3Array39[local537.aBoolean2 ? 1 : 0].method1586(local522, local527);
			} else {
				Static48.aClass8_Sub1_Sub3_Sub3Array39[local537.aBoolean2 ? 1 : 0].method1584(local522, local527);
			}
			if (Static21.aClass8_Sub1_Sub3_Sub2Array1 != null) {
				Static21.aClass8_Sub1_Sub3_Sub2Array1[(local537.aBoolean2 ? 8 : 0) + local537.anInt31].method300(local522 + 29, local527);
			}
			arg1.method1753(Static44.method672(local537.anInt30), local522 + 15, local527 + 9 + 5, 0, -1);
			arg0.method1753(local544, local522 + 60, local527 + 9 - -5, 268435455, -1);
			local527 += local407 + 19;
			local529++;
			if (local403 <= local529) {
				local522 += local405 + 88;
				local529 = 0;
				local527 = local520 + 23;
			}
		}
	}
}
