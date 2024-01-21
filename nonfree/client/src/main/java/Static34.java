import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array1;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt995;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!tf;")
	public static Class73 aClass73_6;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "[Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array2;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
	public static int[] anIntArray99 = new int[100];

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!qd;")
	public static Class63 aClass63_8 = new Class63(50);

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_476 = Static9.method266("(U5");

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!id;")
	public static Class34 aClass34_477 = Static9.method266(")4lang)4de");

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!mc;")
	public static Class48 aClass48_4 = new Class48(32);

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!id;")
	public static Class34 aClass34_478 = Static9.method266("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)I")
	public static int method621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method622() {
		if (Static25.aString1.toLowerCase().indexOf("microsoft") != -1) {
			Static80.anIntArray261[219] = 42;
			Static80.anIntArray261[190] = 72;
			Static80.anIntArray261[192] = 58;
			Static80.anIntArray261[191] = 73;
			Static80.anIntArray261[188] = 71;
			Static80.anIntArray261[187] = 27;
			Static80.anIntArray261[220] = 74;
			Static80.anIntArray261[189] = 26;
			Static80.anIntArray261[186] = 57;
			Static80.anIntArray261[221] = 43;
			Static80.anIntArray261[223] = 28;
			Static80.anIntArray261[222] = 59;
			return;
		}
		Static80.anIntArray261[61] = 27;
		if (Static25.aMethod1 == null) {
			Static80.anIntArray261[192] = 58;
			Static80.anIntArray261[222] = 59;
		} else {
			Static80.anIntArray261[520] = 59;
			Static80.anIntArray261[192] = 28;
			Static80.anIntArray261[222] = 58;
		}
		Static80.anIntArray261[46] = 72;
		Static80.anIntArray261[91] = 42;
		Static80.anIntArray261[59] = 57;
		Static80.anIntArray261[93] = 43;
		Static80.anIntArray261[44] = 71;
		Static80.anIntArray261[47] = 73;
		Static80.anIntArray261[45] = 26;
		Static80.anIntArray261[92] = 74;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BZLclient!id;ILclient!ie;ILclient!id;)V")
	public static void method623(@OriginalArg(2) Class34 arg0, @OriginalArg(4) Class35 arg1, @OriginalArg(6) Class34 arg2) {
		@Pc(4) int local4 = arg1.method1582(arg0);
		@Pc(10) int local10 = arg1.method1564(arg2, local4);
		Static30.method559(local4, arg1, local10, 255);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
	public static void method624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static89.anInt1976 == arg1 && Static76.anInt2062 == arg4 && (Static128.anInt3003 == arg2 || !Static21.aBoolean39)) {
			return;
		}
		Static89.anInt1976 = arg1;
		Static76.anInt2062 = arg4;
		Static128.anInt3003 = arg2;
		if (!Static21.aBoolean39) {
			Static128.anInt3003 = 0;
		}
		Static41.method695(25);
		Static72.method1267(true, Static17.aClass34_347);
		@Pc(50) int local50 = Static37.anInt1098;
		Static37.anInt1098 = (arg1 - 6) * 8;
		@Pc(58) int local58 = Static121.anInt2871;
		Static121.anInt2871 = (arg4 - 6) * 8;
		@Pc(68) int local68 = Static37.anInt1098 - local50;
		@Pc(75) int local75 = Static121.anInt2871 - local58;
		for (@Pc(79) int local79 = 0; local79 < 32768; local79++) {
			@Pc(85) Class1_Sub1_Sub1_Sub1_Sub2 local85 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local79];
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < 10; local89++) {
					local85.anIntArray149[local89] -= local68;
					local85.anIntArray147[local89] -= local75;
				}
				local85.anInt1428 -= local68 * 128;
				local85.anInt1405 -= local75 * 128;
			}
		}
		for (@Pc(135) int local135 = 0; local135 < 2048; local135++) {
			@Pc(141) Class1_Sub1_Sub1_Sub1_Sub1 local141 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local135];
			if (local141 != null) {
				for (@Pc(145) int local145 = 0; local145 < 10; local145++) {
					local141.anIntArray149[local145] -= local68;
					local141.anIntArray147[local145] -= local75;
				}
				local141.anInt1405 -= local75 * 128;
				local141.anInt1428 -= local68 * 128;
			}
		}
		Static42.anInt1208 = arg2;
		Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.method903(arg3, arg0, false);
		@Pc(199) byte local199 = 104;
		@Pc(201) byte local201 = 0;
		@Pc(203) byte local203 = 0;
		@Pc(205) byte local205 = 104;
		@Pc(207) byte local207 = 1;
		if (local68 < 0) {
			local207 = -1;
			local199 = -1;
			local201 = 103;
		}
		@Pc(220) byte local220 = 1;
		if (local75 < 0) {
			local220 = -1;
			local205 = -1;
			local203 = 103;
		}
		for (@Pc(233) int local233 = local201; local233 != local199; local233 += local207) {
			for (@Pc(237) int local237 = local203; local237 != local205; local237 += local220) {
				@Pc(243) int local243 = local68 + local233;
				@Pc(247) int local247 = local237 + local75;
				for (@Pc(249) int local249 = 0; local249 < 4; local249++) {
					if (local243 >= 0 && local247 >= 0 && local243 < 104 && local247 < 104) {
						Static94.aClass38ArrayArrayArray1[local249][local233][local237] = Static94.aClass38ArrayArrayArray1[local249][local243][local247];
					} else {
						Static94.aClass38ArrayArrayArray1[local249][local233][local237] = null;
					}
				}
			}
		}
		for (@Pc(310) Class1_Sub3 local310 = (Class1_Sub3) Static48.aClass38_10.method1034(); local310 != null; local310 = (Class1_Sub3) Static48.aClass38_10.method1038()) {
			local310.anInt469 -= local68;
			local310.anInt484 -= local75;
			if (local310.anInt469 < 0 || local310.anInt484 < 0 || local310.anInt469 >= 104 || local310.anInt484 >= 104) {
				local310.method2039();
			}
		}
		Static31.anInt924 = 0;
		if (Static44.anInt1248 != 0) {
			Static44.anInt1248 -= local68;
			Static54.anInt1521 -= local75;
		}
		Static95.aBoolean129 = false;
		Static26.anInt834 = -1;
		Static95.aClass38_20.method1044();
		Static24.aClass38_7.method1044();
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method625() {
		aClass63_8 = null;
		aClass73_6 = null;
		aClass1_Sub1_Sub2_Sub2Array1 = null;
		aClass48_4 = null;
		aClass34_477 = null;
		aClass1_Sub1_Sub2_Sub2Array2 = null;
		anIntArray99 = null;
		aClass34_478 = null;
		aClass34_476 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!fd;)Z")
	public static boolean method626(@OriginalArg(1) Class1_Sub9 arg0) {
		if (arg0.anIntArray100 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray100.length; local12++) {
			@Pc(19) int local19 = Static88.method1493(local12, arg0);
			@Pc(24) int local24 = arg0.anIntArray105[local12];
			if (arg0.anIntArray100[local12] == 2) {
				if (local19 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray100[local12] == 3) {
				if (local24 >= local19) {
					return false;
				}
			} else if (arg0.anIntArray100[local12] == 4) {
				if (local19 == local24) {
					return false;
				}
			} else if (local24 != local19) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!gf;")
	public static RuntimeException_Sub1 method627(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString4 = local9.aString4 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)Lclient!oe;")
	public static Class47 method628() {
		try {
			return (Class47) Class.forName("Class47_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lclient!ge;")
	public static Class1_Sub1_Sub7 method629(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub1_Sub7 local11 = (Class1_Sub1_Sub7) Static5.aClass63_2.method1663((long) arg0);
		if (local11 != null) {
			return local11;
		}
		local11 = Static75.method1344(arg0, Static76.aClass35_20, Static62.aClass35_15);
		if (local11 != null) {
			Static5.aClass63_2.method1659(local11, (long) arg0);
		}
		return local11;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)V")
	public static void method630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static42.anInt1195 != 0 && Static42.anInt1195 != 3 || Static55.anInt1547 != 1) {
			return;
		}
		@Pc(21) int local21 = Static119.anInt2832 - arg0 - 25;
		@Pc(28) int local28 = Static118.anInt2830 - arg1 - 5;
		if (local21 < 0 || local28 < 0 || local21 >= 146 || local28 >= 151) {
			return;
		}
		local21 -= 73;
		@Pc(48) int local48 = Static126.anInt2999 + Static132.anInt3154 & 0x7FF;
		local28 -= 75;
		@Pc(53) int local53 = Class1_Sub1_Sub2_Sub4.anIntArray335[local48];
		@Pc(57) int local57 = Class1_Sub1_Sub2_Sub4.anIntArray334[local48];
		@Pc(65) int local65 = (Static122.anInt2890 + 256) * local57 >> 8;
		@Pc(73) int local73 = local53 * (Static122.anInt2890 + 256) >> 8;
		@Pc(83) int local83 = local73 * local28 + local21 * local65 >> 11;
		@Pc(90) int local90 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 + local83 >> 7;
		@Pc(101) int local101 = local28 * local65 - local21 * local73 >> 11;
		@Pc(109) int local109 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 - local101 >> 7;
		@Pc(131) boolean local131 = Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 0, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 1, local90, true, 0, local109, 0, 0);
		if (!local131) {
			return;
		}
		Static21.aClass1_Sub19_Sub1_1.method2061(local21);
		Static21.aClass1_Sub19_Sub1_1.method2061(local28);
		Static21.aClass1_Sub19_Sub1_1.method2054(Static132.anInt3154);
		Static21.aClass1_Sub19_Sub1_1.method2061(57);
		Static21.aClass1_Sub19_Sub1_1.method2061(Static126.anInt2999);
		Static21.aClass1_Sub19_Sub1_1.method2061(Static122.anInt2890);
		Static21.aClass1_Sub19_Sub1_1.method2061(89);
		Static21.aClass1_Sub19_Sub1_1.method2054(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428);
		Static21.aClass1_Sub19_Sub1_1.method2054(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405);
		Static21.aClass1_Sub19_Sub1_1.method2061(Static31.anInt925);
		Static21.aClass1_Sub19_Sub1_1.method2061(63);
	}
}
