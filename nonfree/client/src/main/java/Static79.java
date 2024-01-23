import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Lclient!ha;")
	public static Class1_Sub2_Sub8 aClass1_Sub2_Sub8_1;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "[I")
	public static int[] anIntArray111 = new int[2048];

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "Lclient!ia;")
	private static Class51 aClass51_601 = Static64.method1101("Please wait)3)3)3");

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "Lclient!ia;")
	public static Class51 aClass51_603 = aClass51_601;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
	public static int anInt1782 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!mb;B)V")
	public static void method1373(@OriginalArg(0) Class70 arg0) {
		Static187.aClass41_Sub1Array2 = Static63.method1096(arg0, Static191.anInt4121);
		Static125.aClass1_Sub2_Sub1_Sub1Array3 = Static105.method1796(Static157.anInt3433, arg0);
		Static177.aClass1_Sub2_Sub1Array14 = Static67.method1162(arg0, Static180.anInt3925);
		Static67.method1162(arg0, Static194.anInt4188);
		Static110.aClass1_Sub2_Sub1Array6 = Static67.method1162(arg0, Static127.anInt2863);
		Static172.aClass1_Sub2_Sub1Array13 = Static67.method1162(arg0, Static53.anInt1238);
		Static5.aClass1_Sub2_Sub1Array12 = Static100.method1677(Static103.anInt4829, arg0);
		Static97.aClass1_Sub2_Sub1Array9 = Static100.method1677(Static2.anInt71, arg0);
		Static83.aClass1_Sub2_Sub1_3 = Static123.method2154(Static227.anInt4779, arg0);
		Static122.aClass1_Sub2_Sub1Array11 = Static100.method1677(Static141.anInt3048, arg0);
		Static11.aClass1_Sub2_Sub1Array2 = Static100.method1677(Static156.anInt3425, arg0);
		Static187.aClass41Array8 = Static118.method1948(arg0, Static124.anInt4548);
		Static141.aClass41Array7 = Static118.method1948(arg0, Static6.anInt159);
		Static165.aClass1_Sub2_Sub11_3.method2022(Static141.aClass41Array7, null);
		Static52.aClass1_Sub2_Sub11_1.method2022(Static141.aClass41Array7, null);
		Static80.aClass1_Sub2_Sub11_2.method2022(Static141.aClass41Array7, null);
		@Pc(101) Class1_Sub2_Sub1_Sub1 local101 = Static127.method2214(Static222.anInt4669, arg0);
		local101.method2075();
		Static189.aClass1_Sub2_Sub1_5 = local101;
		@Pc(111) Class1_Sub2_Sub1_Sub1[] local111 = Static105.method1796(Static33.anInt786, arg0);
		for (@Pc(113) int local113 = 0; local113 < local111.length; local113++) {
			local111[local113].method2075();
		}
		Static198.aClass1_Sub2_Sub1Array15 = local111;
		@Pc(141) int local141 = (int) (Math.random() * 21.0D) - 10;
		@Pc(148) int local148 = (int) (Math.random() * 21.0D) - 10;
		@Pc(155) int local155 = (int) (Math.random() * 21.0D) - 10;
		@Pc(162) int local162 = (int) (Math.random() * 41.0D) - 20;
		for (@Pc(164) int local164 = 0; local164 < Static125.aClass1_Sub2_Sub1_Sub1Array3.length; local164++) {
			Static125.aClass1_Sub2_Sub1_Sub1Array3[local164].method2074(local162 + local148, local141 - -local162, local155 + local162);
		}
		Static187.aClass41_Sub1Array2[0].method973(local148 + local162, local162 + local141, local155 + local162);
		Static46.aClass1_Sub2_Sub1Array4 = Static125.aClass1_Sub2_Sub1_Sub1Array3;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZILclient!fc;II)V")
	public static void method1375(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(5) int arg4) {
		if (Static161.anInt3459 >= 50 || (arg3.anIntArrayArray8 == null || arg2 >= arg3.anIntArrayArray8.length || arg3.anIntArrayArray8[arg2] == null)) {
			return;
		}
		@Pc(28) int local28 = arg3.anIntArrayArray8[arg2][0];
		@Pc(32) int local32 = local28 >> 8;
		@Pc(38) int local38 = local28 >> 4 & 0x7;
		@Pc(42) int local42 = local28 & 0xF;
		@Pc(61) int local61;
		if (arg3.anIntArrayArray8[arg2].length > 1) {
			local61 = (int) (Math.random() * (double) arg3.anIntArrayArray8[arg2].length);
			if (local61 > 0) {
				local32 = arg3.anIntArrayArray8[arg2][local61];
			}
		}
		if (local42 == 0) {
			if (arg1) {
				Static218.method1758(0, local38, local32);
			}
		} else if (Static123.anInt2717 != 0) {
			Static225.anIntArray375[Static161.anInt3459] = local32;
			local61 = (arg4 - 64) / 128;
			Static66.anIntArray99[Static161.anInt3459] = local38;
			Static123.anIntArray162[Static161.anInt3459] = 0;
			Static141.aClass91Array2[Static161.anInt3459] = null;
			@Pc(125) int local125 = (arg0 - 64) / 128;
			Static129.anIntArray189[Static161.anInt3459] = (local61 << 16) - (-(local125 << 8) - local42);
			Static161.anInt3459++;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Lclient!jg;")
	public static Class60 method1376(@OriginalArg(0) int arg0) {
		@Pc(10) Class60 local10 = (Class60) Static224.aClass53_31.method1501((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static30.aClass70_24.method3509(arg0, 1);
		local10 = new Class60();
		if (local20 != null) {
			local10.method1644(arg0, new Class1_Sub16(local20));
		}
		Static224.aClass53_31.method1497(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!rg;Z)V")
	public static void method1377(@OriginalArg(0) Class98 arg0) {
		Static48.aClass98_1 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
	public static void method1378() {
		Static167.aClass1_Sub16_Sub1_2.anInt4860 = 0;
		anInt1782 = 0;
		Static97.anInt2134 = -1;
		Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
		Static142.anInt3128 = 0;
		Static202.anInt4289 = 0;
		Static156.aBoolean164 = false;
		Static216.anInt4583 = -1;
		Static80.anInt1797 = -1;
		Static135.anInt3042 = 0;
		Static90.anInt4704 = 0;
		Static141.anInt3047 = 0;
		Static105.anInt2334 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static191.aClass5_Sub1_Sub1Array1.length; local35++) {
			if (Static191.aClass5_Sub1_Sub1Array1[local35] != null) {
				Static191.aClass5_Sub1_Sub1Array1[local35].anInt3621 = -1;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < Static168.aClass5_Sub1_Sub2Array1.length; local58++) {
			if (Static168.aClass5_Sub1_Sub2Array1[local58] != null) {
				Static168.aClass5_Sub1_Sub2Array1[local58].anInt3621 = -1;
			}
		}
		Static31.method543();
		Static70.anInt1624 = 1;
		Static142.method2482(30);
		for (@Pc(87) int local87 = 0; local87 < 100; local87++) {
			Static73.aBooleanArray10[local87] = true;
		}
		Static203.aClass105_20.method3114();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I")
	public static int method1379() {
		Static9.anInt179 = Static157.anInt3437;
		Static118.method1951();
		Static198.method3277();
		Static42.method3754(Static9.anInt179);
		Static73.aClass5_Sub1_Sub1_1 = new Class5_Sub1_Sub1();
		Static73.aClass5_Sub1_Sub1_1.anInt3624 = 3000;
		Static73.aClass5_Sub1_Sub1_1.anInt3598 = 3000;
		Static2.method59(Static77.aClass70_Sub1_20);
		return 10;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)V")
	public static void method1380() {
		Static218.aClass53_18.method1496(5);
		Static188.aClass53_24.method1496(5);
		Static225.aClass53_32.method1496(5);
		Static207.aClass53_27.method1496(5);
	}
}
