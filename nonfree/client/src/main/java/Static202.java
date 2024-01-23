import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "[S")
	public static short[] aShortArray84;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Lclient!ak;")
	public static Class7 aClass7_167;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
	public static int anInt3984;

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
	public static int anInt3981 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)I")
	public static int method3141(@OriginalArg(1) int arg0) {
		if (Static155.aClass73_3 != null) {
			Static155.aClass73_3.method1691();
			Static155.aClass73_3 = null;
		}
		Static163.anInt4688++;
		if (Static163.anInt4688 > 4) {
			Static163.anInt4688 = 0;
			Static203.anInt3998 = 0;
			return arg0;
		}
		Static203.anInt3998 = 0;
		if (Static146.anInt2695 == Static121.anInt2345) {
			Static121.anInt2345 = Static259.anInt5236;
		} else {
			Static121.anInt2345 = Static146.anInt2695;
		}
		return -1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)V")
	public static void method3142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg0);
		@Pc(17) int local17 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg3);
		@Pc(23) int local23 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg5);
		@Pc(29) int local29 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg2);
		@Pc(37) int local37 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg1 + arg0);
		@Pc(46) int local46 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg3 - arg1);
		@Pc(48) int local48;
		for (local48 = local11; local48 < local37; local48++) {
			Static288.method4405(arg4, local29, local23, Static151.anIntArrayArray26[local48]);
		}
		for (local48 = local17; local48 > local46; local48--) {
			Static288.method4405(arg4, local29, local23, Static151.anIntArrayArray26[local48]);
		}
		@Pc(102) int local102 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg5 + arg1);
		@Pc(110) int local110 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg2 - arg1);
		for (local48 = local37; local48 <= local46; local48++) {
			@Pc(123) int[] local123 = Static151.anIntArrayArray26[local48];
			Static288.method4405(arg4, local102, local23, local123);
			Static288.method4405(arg4, local29, local110, local123);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
	public static int method3145(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	public static void method3148() {
		Static90.method3587(false);
		Static229.anInt4801 = 0;
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static242.aByteArrayArray11.length; local14++) {
			if (Static156.anIntArray227[local14] != -1 && Static242.aByteArrayArray11[local14] == null) {
				Static242.aByteArrayArray11[local14] = Static216.aClass7_178.method253(0, Static156.anIntArray227[local14]);
				if (Static242.aByteArrayArray11[local14] == null) {
					local12 = false;
					Static229.anInt4801++;
				}
			}
			if (Static163.anIntArray531[local14] != -1 && Static30.aByteArrayArray3[local14] == null) {
				Static30.aByteArrayArray3[local14] = Static216.aClass7_178.method239(Static163.anIntArray531[local14], Static268.anIntArrayArray44[local14], 0);
				if (Static30.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static229.anInt4801++;
				}
			}
			if (Static240.aBoolean369) {
				if (Static201.anIntArray456[local14] != -1 && Static291.aByteArrayArray14[local14] == null) {
					Static291.aByteArrayArray14[local14] = Static216.aClass7_178.method253(0, Static201.anIntArray456[local14]);
					if (Static291.aByteArrayArray14[local14] == null) {
						local12 = false;
						Static229.anInt4801++;
					}
				}
				if (Static201.anIntArray455[local14] != -1 && Static19.aByteArrayArray2[local14] == null) {
					Static19.aByteArrayArray2[local14] = Static216.aClass7_178.method253(0, Static201.anIntArray455[local14]);
					if (Static19.aByteArrayArray2[local14] == null) {
						local12 = false;
						Static229.anInt4801++;
					}
				}
			}
			if (Static190.anIntArray426 != null && Static255.aByteArrayArray12[local14] == null && Static190.anIntArray426[local14] != -1) {
				Static255.aByteArrayArray12[local14] = Static216.aClass7_178.method239(Static190.anIntArray426[local14], Static268.anIntArrayArray44[local14], 0);
				if (Static255.aByteArrayArray12[local14] == null) {
					Static229.anInt4801++;
					local12 = false;
				}
			}
		}
		if (Static3.aClass50_1 == null) {
			if (Static70.aClass1_Sub2_Sub13_1 == null || !Static133.aClass7_117.method244(Static70.aClass1_Sub2_Sub13_1.aString118 + "_labels")) {
				Static3.aClass50_1 = new Class50(0);
			} else if (Static133.aClass7_117.method251(Static70.aClass1_Sub2_Sub13_1.aString118 + "_labels")) {
				Static3.aClass50_1 = Static33.method615(Static70.aClass1_Sub2_Sub13_1.aString118 + "_labels", Static133.aClass7_117);
			} else {
				local12 = false;
				Static229.anInt4801++;
			}
		}
		if (!local12) {
			Static88.anInt1649 = 1;
			return;
		}
		Static298.anInt5902 = 0;
		local12 = true;
		@Pc(301) int local301;
		@Pc(312) int local312;
		for (local14 = 0; local14 < Static242.aByteArrayArray11.length; local14++) {
			@Pc(287) byte[] local287 = Static30.aByteArrayArray3[local14];
			if (local287 != null) {
				local301 = (Static177.anIntArray389[local14] >> 8) * 64 - Static224.anInt4695;
				local312 = (Static177.anIntArray389[local14] & 0xFF) * 64 - Static158.anInt2961;
				if (Static86.aBoolean124) {
					local301 = 10;
					local312 = 10;
				}
				local12 &= Static293.method4497(local287, local312, local301);
			}
			if (Static240.aBoolean369) {
				local287 = Static19.aByteArrayArray2[local14];
				if (local287 != null) {
					local301 = (Static177.anIntArray389[local14] >> 8) * 64 - Static224.anInt4695;
					local312 = (Static177.anIntArray389[local14] & 0xFF) * 64 - Static158.anInt2961;
					if (Static86.aBoolean124) {
						local312 = 10;
						local301 = 10;
					}
					local12 &= Static293.method4497(local287, local312, local301);
				}
			}
		}
		if (!local12) {
			Static88.anInt1649 = 2;
			return;
		}
		if (Static88.anInt1649 != 0) {
			Static195.method2964(true, Static4.aString6 + "<br>(100%)");
		}
		Static39.method716();
		@Pc(397) boolean local397 = false;
		Static115.method1779();
		@Pc(406) int local406;
		if (Static240.aBoolean369 && Static160.aBoolean223) {
			for (local406 = 0; local406 < Static242.aByteArrayArray11.length; local406++) {
				if (Static19.aByteArrayArray2[local406] != null || Static291.aByteArrayArray14[local406] != null) {
					local397 = true;
					break;
				}
			}
		}
		Static274.method4196(Static240.aBoolean369 ? 28 : 25, local397);
		for (local406 = 0; local406 < 4; local406++) {
			Static27.aClass2Array1[local406].method110();
		}
		for (local406 = 0; local406 < 4; local406++) {
			for (local301 = 0; local301 < 104; local301++) {
				for (local312 = 0; local312 < 104; local312++) {
					Static242.aByteArrayArrayArray23[local406][local301][local312] = 0;
				}
			}
		}
		Static105.method1664(false);
		if (Static240.aBoolean369) {
			Static78.aClass48_Sub2_3.method3626();
			for (local406 = 0; local406 < 13; local406++) {
				for (local301 = 0; local301 < 13; local301++) {
					Static78.aClass14ArrayArray1[local406][local301].aBoolean37 = true;
				}
			}
		}
		if (Static240.aBoolean369) {
			Static194.method2945();
		}
		if (Static240.aBoolean369) {
			Static196.method2974();
		}
		Static39.method716();
		System.gc();
		Static90.method3587(true);
		Static95.method1565(false);
		if (!Static86.aBoolean124) {
			Static153.method2369(false);
			Static90.method3587(true);
			if (Static240.aBoolean369) {
				local406 = Static28.aClass6_Sub6_Sub2_1.anIntArray519[0] >> 3;
				local301 = Static28.aClass6_Sub6_Sub2_1.anIntArray516[0] >> 3;
				Static117.method1823(local301, local406);
			}
			Static220.method3515(false);
			if (Static255.aByteArrayArray12 != null) {
				Static173.method2617();
			}
		}
		if (Static86.aBoolean124) {
			Static2.method62(false);
			Static90.method3587(true);
			if (Static240.aBoolean369) {
				local406 = Static28.aClass6_Sub6_Sub2_1.anIntArray519[0] >> 3;
				local301 = Static28.aClass6_Sub6_Sub2_1.anIntArray516[0] >> 3;
				Static117.method1823(local301, local406);
			}
			Static150.method2342(false);
		}
		Static115.method1779();
		Static90.method3587(true);
		Static106.method1683(Static27.aClass2Array1, false, Static86.aBoolean124 ? Static185.anIntArrayArrayArray14 : (int[][][]) null);
		if (Static240.aBoolean369) {
			Static194.method2942();
		}
		Static90.method3587(true);
		local406 = Static297.anInt5897;
		if (local406 > Static159.anInt2978) {
			local406 = Static159.anInt2978;
		}
		if (Static159.anInt2978 - 1 <= local406) {
		}
		if (Static39.method718()) {
			Static48.method846(0);
		} else {
			Static48.method846(Static297.anInt5897);
		}
		Static60.method1022();
		if (Static240.aBoolean369 && local397) {
			Static229.method3658(true);
			Static95.method1565(true);
			if (!Static86.aBoolean124) {
				Static153.method2369(true);
				Static90.method3587(true);
				Static220.method3515(true);
			}
			if (Static86.aBoolean124) {
				Static2.method62(true);
				Static90.method3587(true);
				Static150.method2342(true);
			}
			Static115.method1779();
			Static90.method3587(true);
			Static106.method1683(Static27.aClass2Array1, true, Static86.aBoolean124 ? Static185.anIntArrayArrayArray14 : (int[][][]) null);
			Static90.method3587(true);
			Static60.method1022();
			Static229.method3658(false);
		}
		if (Static240.aBoolean369) {
			for (local301 = 0; local301 < 13; local301++) {
				for (local312 = 0; local312 < 13; local312++) {
					Static78.aClass14ArrayArray1[local301][local312].method358(Static163.anIntArrayArrayArray16[0], local301 * 8, local312 * 8);
				}
			}
		}
		for (local301 = 0; local301 < 104; local301++) {
			for (local312 = 0; local312 < 104; local312++) {
				Static261.method4030(local312, local301);
			}
		}
		Static232.method3814();
		Static39.method716();
		Static257.method3983();
		Static115.method1779();
		Static65.aBoolean104 = false;
		if (Static240.aBoolean369) {
			Static82.method1397(true);
		}
		if (Static299.aFrame2 != null && Static155.aClass73_3 != null && Static98.anInt1878 == 25) {
			Static270.aClass1_Sub18_Sub1_3.method3130(199);
			Static270.aClass1_Sub18_Sub1_3.method3119(1057001181);
		}
		if (!Static86.aBoolean124) {
			local301 = (Static75.anInt1495 - 6) / 8;
			@Pc(832) int local832 = (Static179.anInt3322 - 6) / 8;
			local312 = (Static75.anInt1495 + 6) / 8;
			@Pc(844) int local844 = (Static179.anInt3322 + 6) / 8;
			for (@Pc(848) int local848 = local301 - 1; local848 <= local312 + 1; local848++) {
				for (@Pc(857) int local857 = local832 - 1; local857 <= local844 + 1; local857++) {
					if (local301 > local848 || local848 > local312 || local857 < local832 || local844 < local857) {
						Static216.aClass7_178.method252("m" + local848 + "_" + local857);
						Static216.aClass7_178.method252("l" + local848 + "_" + local857);
					}
				}
			}
		}
		if (Static98.anInt1878 == 28) {
			Static299.method4554(10);
		} else {
			Static299.method4554(30);
			if (Static155.aClass73_3 != null) {
				Static270.aClass1_Sub18_Sub1_3.method3130(72);
			}
		}
		Static196.method2966();
		Static39.method716();
		Static81.method1390();
	}
}
