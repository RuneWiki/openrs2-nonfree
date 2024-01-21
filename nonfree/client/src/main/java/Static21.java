import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	public static int anInt2665;

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_21;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	public static int anInt2668;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1205 = Static2.method66("auf der Hautpseite)3");

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1206 = Static2.method66("gr-Un:");

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1207 = Static2.method66("Handel)4Duell");

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
	public static int[] anIntArray326 = new int[500];

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "J")
	public static long aLong75 = 0L;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1208 = Static2.method66("*6n");

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1209 = Static2.method66("Accept trade");

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1210 = Static2.method66("Sprites geladen)3");

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1211 = Static2.method66("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1212 = aClass39_1209;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!jd;Ljava/awt/Component;Lclient!jd;)V")
	public static void method1869(@OriginalArg(1) Class36 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class36 arg2) {
		if (Static66.aBoolean94) {
			return;
		}
		Static35.aClass51_62 = Static72.method1484(128, 265, arg1);
		Static91.method2012();
		Static48.aClass51_28 = Static72.method1484(128, 265, arg1);
		Static91.method2012();
		Static23.aClass51_13 = Static72.method1484(509, 171, arg1);
		Static91.method2012();
		Static96.aClass51_55 = Static72.method1484(360, 132, arg1);
		Static91.method2012();
		Static65.aClass51_40 = Static72.method1484(360, 200, arg1);
		Static91.method2012();
		Static89.aClass51_47 = Static72.method1484(202, 238, arg1);
		Static91.method2012();
		Static97.aClass51_56 = Static72.method1484(203, 238, arg1);
		Static91.method2012();
		Static39.aClass51_24 = Static72.method1484(74, 94, arg1);
		Static91.method2012();
		Static84.aClass51_61 = Static72.method1484(75, 94, arg1);
		Static91.method2012();
		@Pc(81) byte[] local81 = arg2.method1758(Static40.aClass39_510, Static22.aClass39_295);
		@Pc(87) Class2_Sub1_Sub4_Sub2 local87 = new Class2_Sub1_Sub4_Sub2(local81, arg1);
		Static35.aClass51_62.method1970();
		local87.method1044(0, 0);
		Static48.aClass51_28.method1970();
		local87.method1044(-637, 0);
		Static23.aClass51_13.method1970();
		local87.method1044(-128, 0);
		Static96.aClass51_55.method1970();
		local87.method1044(-202, -371);
		Static65.aClass51_40.method1970();
		local87.method1044(-202, -171);
		Static89.aClass51_47.method1970();
		local87.method1044(0, -265);
		Static97.aClass51_56.method1970();
		local87.method1044(-562, -265);
		Static39.aClass51_24.method1970();
		local87.method1044(-128, -171);
		Static84.aClass51_61.method1970();
		local87.method1044(-562, -171);
		@Pc(160) int[] local160 = new int[local87.anInt1497];
		@Pc(165) int local165;
		@Pc(194) int local194;
		for (@Pc(162) int local162 = 0; local162 < local87.anInt1498; local162++) {
			for (local165 = 0; local165 < local87.anInt1497; local165++) {
				local160[local165] = local87.anIntArray209[local87.anInt1497 * local162 + local87.anInt1497 - local165 - 1];
			}
			for (local194 = 0; local194 < local87.anInt1497; local194++) {
				local87.anIntArray209[local87.anInt1497 * local162 + local194] = local160[local194];
			}
		}
		Static35.aClass51_62.method1970();
		local87.method1044(382, 0);
		Static48.aClass51_28.method1970();
		local87.method1044(-255, 0);
		Static23.aClass51_13.method1970();
		local87.method1044(254, 0);
		Static96.aClass51_55.method1970();
		local87.method1044(180, -371);
		Static65.aClass51_40.method1970();
		local87.method1044(180, -171);
		Static89.aClass51_47.method1970();
		local87.method1044(382, -265);
		Static97.aClass51_56.method1970();
		local87.method1044(-180, -265);
		Static39.aClass51_24.method1970();
		local87.method1044(254, -171);
		Static84.aClass51_61.method1970();
		local87.method1044(-180, -171);
		local87 = Static20.method430(Static27.aClass39_372, Static22.aClass39_295, arg0);
		Static23.aClass51_13.method1970();
		local87.method1040(382 - local87.anInt1497 / 2 - 128, 18);
		Static39.aClass2_Sub1_Sub4_Sub3_7 = Static67.method1407(arg0, Static101.aClass39_1255, Static22.aClass39_295);
		Static17.aClass2_Sub1_Sub4_Sub3_2 = Static67.method1407(arg0, Static6.aClass39_1305, Static22.aClass39_295);
		Static27.aClass2_Sub1_Sub4_Sub3Array1 = Static22.method436(Static35.aClass39_1310, Static22.aClass39_295, arg0);
		Static72.aClass2_Sub1_Sub4_Sub2_5 = new Class2_Sub1_Sub4_Sub2(128, 265);
		Static26.aClass2_Sub1_Sub4_Sub2_2 = new Class2_Sub1_Sub4_Sub2(128, 265);
		for (local165 = 0; local165 < 33920; local165++) {
			Static72.aClass2_Sub1_Sub4_Sub2_5.anIntArray209[local165] = Static35.aClass51_62.anIntArray334[local165];
		}
		for (local194 = 0; local194 < 33920; local194++) {
			Static26.aClass2_Sub1_Sub4_Sub2_2.anIntArray209[local194] = Static48.aClass51_28.anIntArray334[local194];
		}
		Static35.anIntArray369 = new int[256];
		for (@Pc(384) int local384 = 0; local384 < 64; local384++) {
			Static35.anIntArray369[local384] = local384 * 262144;
		}
		for (@Pc(397) int local397 = 0; local397 < 64; local397++) {
			Static35.anIntArray369[local397 + 64] = local397 * 1024 + 16711680;
		}
		for (@Pc(414) int local414 = 0; local414 < 64; local414++) {
			Static35.anIntArray369[local414 + 128] = local414 * 4 + 16776960;
		}
		for (@Pc(433) int local433 = 0; local433 < 64; local433++) {
			Static35.anIntArray369[local433 + 192] = 16777215;
		}
		Static5.anIntArray14 = new int[256];
		for (@Pc(451) int local451 = 0; local451 < 64; local451++) {
			Static5.anIntArray14[local451] = local451 * 1024;
		}
		for (@Pc(466) int local466 = 0; local466 < 64; local466++) {
			Static5.anIntArray14[local466 + 64] = local466 * 4 + 65280;
		}
		for (@Pc(490) int local490 = 0; local490 < 64; local490++) {
			Static5.anIntArray14[local490 + 128] = local490 * 262144 + 65535;
		}
		for (@Pc(508) int local508 = 0; local508 < 64; local508++) {
			Static5.anIntArray14[local508 + 192] = 16777215;
		}
		Static108.anIntArray370 = new int[256];
		for (@Pc(524) int local524 = 0; local524 < 64; local524++) {
			Static108.anIntArray370[local524] = local524 * 4;
		}
		for (@Pc(537) int local537 = 0; local537 < 64; local537++) {
			Static108.anIntArray370[local537 + 64] = local537 * 262144 + 255;
		}
		for (@Pc(557) int local557 = 0; local557 < 64; local557++) {
			Static108.anIntArray370[local557 + 128] = local557 * 1024 + 16711935;
		}
		for (@Pc(577) int local577 = 0; local577 < 64; local577++) {
			Static108.anIntArray370[local577 + 192] = 16777215;
		}
		Static63.anIntArray238 = new int[32768];
		Static30.anIntArray92 = new int[32768];
		Static83.anIntArray298 = new int[256];
		Static87.method1645(null);
		Static22.aClass39_294 = Static22.aClass39_295;
		Static22.aClass39_290 = Static22.aClass39_295;
		Static83.anInt2268 = 0;
		Static107.anIntArray324 = new int[32768];
		Static71.anIntArray254 = new int[32768];
		if (Static79.anInt2768 == 0 || Static35.aBoolean136) {
			Static73.method1498();
		} else {
			Static73.method1496(Static79.anInt2768, Static22.aClass39_295, Static50.aClass36_Sub1_12, Static100.aClass39_1247);
		}
		Static72.method1488(false);
		Static5.aBoolean2 = true;
		Static66.aBoolean94 = true;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(IB)Lclient!mc;")
	public static Class2_Sub1_Sub10 method1870(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub10 local10 = (Class2_Sub1_Sub10) Static7.aClass54_4.method1634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static109.aClass36_77.method1761(4, arg0);
		local10 = new Class2_Sub1_Sub10();
		if (local20 != null) {
			local10.method1327(arg0, new Class2_Sub5(local20));
		}
		local10.method1329();
		Static7.aClass54_4.method1637((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ke;)V")
	public static void method1873(@OriginalArg(1) Class39 arg0) {
		if (arg0 == null || arg0.method1088() == 0) {
			Static72.anInt2072 = 0;
			return;
		}
		@Pc(17) Class39[] local17 = new Class39[100];
		@Pc(19) Class39 local19 = arg0;
		@Pc(21) int local21 = 0;
		while (true) {
			@Pc(26) int local26 = local19.method1102();
			if (local26 == -1) {
				local19 = local19.method1103();
				if (local19.method1088() > 0) {
					local17[local21++] = local19.method1107();
				}
				Static72.anInt2072 = 0;
				label46: for (local26 = 0; local26 < Static82.anInt2218; local26++) {
					@Pc(89) Class2_Sub1_Sub7 local89 = Static66.method1384(local26);
					if (local89.anInt1327 == -1 && local89.aClass39_588 != null) {
						@Pc(101) Class39 local101 = local89.aClass39_588.method1107();
						for (@Pc(103) int local103 = 0; local103 < local21; local103++) {
							if (local101.method1100(local17[local103]) == -1) {
								continue label46;
							}
						}
						Static5.aClass39Array1[Static72.anInt2072] = local101;
						Static40.anIntArray168[Static72.anInt2072] = local26;
						Static72.anInt2072++;
						if (Static5.aClass39Array1.length <= Static72.anInt2072) {
							return;
						}
					}
				}
				return;
			}
			@Pc(38) Class39 local38 = local19.method1115(0, local26).method1103();
			if (local38.method1088() > 0) {
				local17[local21++] = local38.method1107();
			}
			local19 = local19.method1099(local26 + 1);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
	public static int method1874(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static105.anIntArray352[arg0];
		@Pc(11) int local11 = (local3 * Static105.anInt2810 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 method1875() {
		@Pc(3) Class2_Sub1_Sub4_Sub3 local3 = new Class2_Sub1_Sub4_Sub3();
		local3.anInt2730 = Static56.anInt1612;
		local3.anInt2731 = Static76.anInt2102;
		local3.anInt2728 = Static83.anIntArray297[0];
		local3.anInt2732 = Static10.anIntArray34[0];
		local3.anInt2733 = Static95.anIntArray314[0];
		local3.anInt2729 = Static30.anIntArray94[0];
		local3.anIntArray331 = Static46.anIntArray179;
		local3.aByteArray24 = Static51.aByteArrayArray10[0];
		Static89.method1677();
		return local3;
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(B)V")
	public static void method1876() {
		aClass39_1205 = null;
		aClass39_1206 = null;
		aClass39_1208 = null;
		aClass39_1207 = null;
		aClass39_1211 = null;
		aClass36_Sub1_21 = null;
		anIntArray326 = null;
		aClass39_1210 = null;
		aClass39_1212 = null;
		aClass39_1209 = null;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method1880() {
		for (@Pc(4) Class2_Sub1_Sub2_Sub4 local4 = (Class2_Sub1_Sub2_Sub4) Static90.aClass34_46.method872(); local4 != null; local4 = (Class2_Sub1_Sub2_Sub4) Static90.aClass34_46.method879()) {
			if (local4.anInt1555 != Static18.anInt560 || local4.aBoolean83) {
				local4.method2045();
			} else if (Static64.anInt1889 >= local4.anInt1556) {
				local4.method1084(Static17.anInt489);
				if (local4.aBoolean83) {
					local4.method2045();
				} else {
					Static77.aClass43_1.method1180(local4.anInt1555, local4.anInt1562, local4.anInt1559, local4.anInt1565, 60, local4, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method1881(@OriginalArg(1) Class2_Sub1_Sub2_Sub3 arg0) {
		arg0.anInt2894 = arg0.anInt2895;
		if (arg0.anInt2938 == 0) {
			arg0.anInt2908 = 0;
			return;
		}
		if (arg0.anInt2901 != -1 && arg0.anInt2937 == 0) {
			@Pc(31) Class2_Sub1_Sub1 local31 = Static69.method1439(arg0.anInt2901);
			if (arg0.anInt2932 > 0 && local31.anInt69 == 0) {
				arg0.anInt2908++;
				return;
			}
			if (arg0.anInt2932 <= 0 && local31.anInt86 == 0) {
				arg0.anInt2908++;
				return;
			}
		}
		@Pc(66) int local66 = arg0.anInt2896;
		@Pc(81) int local81 = arg0.anInt2898 * 64 + arg0.anIntArray368[arg0.anInt2938 - 1] * 128;
		@Pc(84) int local84 = arg0.anInt2899;
		@Pc(100) int local100 = arg0.anIntArray367[arg0.anInt2938 - 1] * 128 + arg0.anInt2898 * 64;
		if (local81 - local66 > 256 || local81 - local66 < -256 || local100 - local84 > 256 || local100 - local84 < -256) {
			arg0.anInt2896 = local81;
			arg0.anInt2899 = local100;
			return;
		}
		if (local66 < local81) {
			if (local84 < local100) {
				arg0.anInt2887 = 1280;
			} else if (local84 <= local100) {
				arg0.anInt2887 = 1536;
			} else {
				arg0.anInt2887 = 1792;
			}
		} else if (local66 <= local81) {
			if (local100 > local84) {
				arg0.anInt2887 = 1024;
			} else if (local100 < local84) {
				arg0.anInt2887 = 0;
			}
		} else if (local100 > local84) {
			arg0.anInt2887 = 768;
		} else if (local84 <= local100) {
			arg0.anInt2887 = 512;
		} else {
			arg0.anInt2887 = 256;
		}
		@Pc(228) int local228 = 4;
		@Pc(231) int local231 = arg0.anInt2939;
		if (arg0.anInt2909 != arg0.anInt2887 && arg0.anInt2930 == -1 && arg0.anInt2889 != 0) {
			local228 = 2;
		}
		if (arg0.anInt2938 > 2) {
			local228 = 6;
		}
		@Pc(260) int local260 = arg0.anInt2887 - arg0.anInt2909 & 0x7FF;
		if (local260 > 1024) {
			local260 -= 2048;
		}
		if (arg0.anInt2938 > 3) {
			local228 = 8;
		}
		if (arg0.anInt2908 > 0 && arg0.anInt2938 > 1) {
			local228 = 8;
			arg0.anInt2908--;
		}
		if (local260 >= -256 && local260 <= 256) {
			local231 = arg0.anInt2891;
		} else if (local260 >= 256 && local260 < 768) {
			local231 = arg0.anInt2935;
		} else if (local260 >= -768 && local260 <= -256) {
			local231 = arg0.anInt2897;
		}
		if (local231 == -1) {
			local231 = arg0.anInt2891;
		}
		arg0.anInt2894 = local231;
		if (arg0.aBooleanArray16[arg0.anInt2938 - 1]) {
			local228 <<= 0x1;
		}
		if (local228 >= 8 && arg0.anInt2894 == arg0.anInt2891 && arg0.anInt2923 != -1) {
			arg0.anInt2894 = arg0.anInt2923;
		}
		if (local81 > local66) {
			arg0.anInt2896 += local228;
			if (arg0.anInt2896 > local81) {
				arg0.anInt2896 = local81;
			}
		} else if (local81 < local66) {
			arg0.anInt2896 -= local228;
			if (local81 > arg0.anInt2896) {
				arg0.anInt2896 = local81;
			}
		}
		if (local84 < local100) {
			arg0.anInt2899 += local228;
			if (arg0.anInt2899 > local100) {
				arg0.anInt2899 = local100;
			}
		} else if (local84 > local100) {
			arg0.anInt2899 -= local228;
			if (arg0.anInt2899 < local100) {
				arg0.anInt2899 = local100;
			}
		}
		if (arg0.anInt2896 != local81 || local100 != arg0.anInt2899) {
			return;
		}
		arg0.anInt2938--;
		if (arg0.anInt2932 > 0) {
			arg0.anInt2932--;
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public static void method1882() {
		if (Static1.aClass24_1 != null) {
			Static1.aClass24_1.method1133();
			Static1.aClass24_1 = null;
		}
	}
}
