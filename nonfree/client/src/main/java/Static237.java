import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_35 = new Class38();

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
	public static int anInt4614 = 0;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public static void method4030() {
		Static473.aBoolean549 = false;
		Static542.aClipboard1 = null;
		Static278.method4744();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)Z")
	public static boolean method4032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static296.anInt5741; local1++) {
			@Pc(6) Class138 local6 = Static50.aClass138Array4[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4391 == 1) {
				local15 = local6.anInt4404 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4398 + (local6.anInt4395 * local15 >> 8);
					local37 = local6.anInt4397 + (local6.anInt4400 * local15 >> 8);
					local47 = local6.anInt4407 + (local6.anInt4396 * local15 >> 8);
					local57 = local6.anInt4388 + (local6.anInt4399 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4391 == 2) {
				local15 = arg0 - local6.anInt4404;
				if (local15 > 0) {
					local27 = local6.anInt4398 + (local6.anInt4395 * local15 >> 8);
					local37 = local6.anInt4397 + (local6.anInt4400 * local15 >> 8);
					local47 = local6.anInt4407 + (local6.anInt4396 * local15 >> 8);
					local57 = local6.anInt4388 + (local6.anInt4399 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4391 == 3) {
				local15 = local6.anInt4398 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4404 + (local6.anInt4392 * local15 >> 8);
					local37 = local6.anInt4405 + (local6.anInt4393 * local15 >> 8);
					local47 = local6.anInt4407 + (local6.anInt4396 * local15 >> 8);
					local57 = local6.anInt4388 + (local6.anInt4399 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4391 == 4) {
				local15 = arg2 - local6.anInt4398;
				if (local15 > 0) {
					local27 = local6.anInt4404 + (local6.anInt4392 * local15 >> 8);
					local37 = local6.anInt4405 + (local6.anInt4393 * local15 >> 8);
					local47 = local6.anInt4407 + (local6.anInt4396 * local15 >> 8);
					local57 = local6.anInt4388 + (local6.anInt4399 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4391 == 5) {
				local15 = arg1 - local6.anInt4407;
				if (local15 > 0) {
					local27 = local6.anInt4404 + (local6.anInt4392 * local15 >> 8);
					local37 = local6.anInt4405 + (local6.anInt4393 * local15 >> 8);
					local47 = local6.anInt4398 + (local6.anInt4395 * local15 >> 8);
					local57 = local6.anInt4397 + (local6.anInt4400 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	public static void method4033() {
		Static135.method2905(false);
		Static188.anInt3984 = 0;
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < Static397.aByteArrayArray25.length; local12++) {
			if (Static128.anIntArray247[local12] != -1 && Static397.aByteArrayArray25[local12] == null) {
				Static397.aByteArrayArray25[local12] = Static350.aClass160_74.method4198(0, Static128.anIntArray247[local12]);
				if (Static397.aByteArrayArray25[local12] == null) {
					Static188.anInt3984++;
					local10 = false;
				}
			}
			if (Static480.anIntArray638[local12] != -1 && Static419.aByteArrayArray28[local12] == null) {
				Static419.aByteArrayArray28[local12] = Static350.aClass160_74.method4224(Static270.anIntArrayArray37[local12], Static480.anIntArray638[local12], 0);
				if (Static419.aByteArrayArray28[local12] == null) {
					Static188.anInt3984++;
					local10 = false;
				}
			}
			if (Static467.anIntArray624[local12] != -1 && Static130.aByteArrayArray12[local12] == null) {
				Static130.aByteArrayArray12[local12] = Static350.aClass160_74.method4198(0, Static467.anIntArray624[local12]);
				if (Static130.aByteArrayArray12[local12] == null) {
					local10 = false;
					Static188.anInt3984++;
				}
			}
			if (Static404.anIntArray782[local12] != -1 && Static161.aByteArrayArray15[local12] == null) {
				Static161.aByteArrayArray15[local12] = Static350.aClass160_74.method4198(0, Static404.anIntArray782[local12]);
				if (Static161.aByteArrayArray15[local12] == null) {
					local10 = false;
					Static188.anInt3984++;
				}
			}
			if (Static213.anIntArray329 != null && Static540.aByteArrayArray32[local12] == null && Static213.anIntArray329[local12] != -1) {
				Static540.aByteArrayArray32[local12] = Static350.aClass160_74.method4224(Static270.anIntArrayArray37[local12], Static213.anIntArray329[local12], 0);
				if (Static540.aByteArrayArray32[local12] == null) {
					Static188.anInt3984++;
					local10 = false;
				}
			}
		}
		if (Static161.aClass179_3 == null) {
			if (Static391.aClass1_Sub1_Sub12_3 == null || !Static115.aClass160_24.method4202(Static391.aClass1_Sub1_Sub12_3.aString45 + "_staticelements")) {
				Static161.aClass179_3 = new Class179(0);
			} else if (Static115.aClass160_24.method4219(Static391.aClass1_Sub1_Sub12_3.aString45 + "_staticelements")) {
				Static161.aClass179_3 = Static355.method1723(Static115.aClass160_24, Static163.aBoolean222, Static391.aClass1_Sub1_Sub12_3.aString45 + "_staticelements");
			} else {
				local10 = false;
				Static188.anInt3984++;
			}
		}
		if (!local10) {
			Static140.anInt3290 = 1;
			return;
		}
		local10 = true;
		Static541.anInt9379 = 0;
		@Pc(259) int local259;
		@Pc(270) int local270;
		for (@Pc(241) int local241 = 0; local241 < Static397.aByteArrayArray25.length; local241++) {
			@Pc(246) byte[] local246 = Static419.aByteArrayArray28[local241];
			if (local246 != null) {
				local259 = (Static85.anIntArray178[local241] >> 8) * 64 - Static324.anInt6132;
				local270 = (Static85.anIntArray178[local241] & 0xFF) * 64 - Static517.anInt8716;
				if (Static198.anInt4113 != 0) {
					local270 = 10;
					local259 = 10;
				}
				local10 &= Static385.method6072(Static36.anInt1324, local270, Static542.anInt9387, local246, local259);
			}
			local246 = Static161.aByteArrayArray15[local241];
			if (local246 != null) {
				local259 = (Static85.anIntArray178[local241] >> 8) * 64 - Static324.anInt6132;
				local270 = (Static85.anIntArray178[local241] & 0xFF) * 64 - Static517.anInt8716;
				if (Static198.anInt4113 != 0) {
					local259 = 10;
					local270 = 10;
				}
				local10 &= Static385.method6072(Static36.anInt1324, local270, Static542.anInt9387, local246, local259);
			}
		}
		if (!local10) {
			Static140.anInt3290 = 2;
			return;
		}
		if (Static140.anInt3290 != 0) {
			Static236.method4028(Static33.aClass114_17.method3330(Static315.anInt5993) + "<br>(100%)", true, Static268.aClass27_4);
		}
		Static443.method6413();
		Static33.method1299();
		@Pc(369) boolean local369 = false;
		if (Static478.aClass9_10.method7622() && Static89.aClass1_Sub28_Sub1_1.aBoolean315) {
			for (local259 = 0; local259 < Static397.aByteArrayArray25.length; local259++) {
				if (Static161.aByteArrayArray15[local259] != null || Static130.aByteArrayArray12[local259] != null) {
					local369 = true;
					break;
				}
			}
		}
		if (Static89.aClass1_Sub28_Sub1_1.aBoolean320) {
			local259 = Static273.anIntArray382[Static331.anInt6223];
		} else {
			local259 = Static526.anIntArray770[Static331.anInt6223];
		}
		if (Static478.aClass9_10.method7579()) {
			local259++;
		}
		Static399.method6009(Static542.anInt9387, Static36.anInt1324, local259, local369, Static478.aClass9_10.method7582() > 0);
		for (local270 = 0; local270 < 4; local270++) {
			Static70.aClass299Array1[local270].method7230();
		}
		Static504.method7226();
		Static7.method228(false);
		Static525.method7465();
		Static446.aClass89_1 = null;
		Static450.aBoolean500 = false;
		Static443.method6413();
		System.gc();
		Static135.method2905(true);
		Static470.method5656();
		Static324.anInt6133 = Static89.aClass1_Sub28_Sub1_1.method4262(Static526.anInt8926);
		Static465.aBoolean543 = Static89.aClass1_Sub28_Sub1_1.aBoolean315;
		Static305.aBoolean403 = Static318.anInt6040 >= 96;
		Static212.aBoolean266 = Static89.aClass1_Sub28_Sub1_1.method4260(Static526.anInt8926);
		Static423.aBoolean619 = !Static89.aClass1_Sub28_Sub1_1.aBoolean322;
		Static314.anInt5988 = Static89.aClass1_Sub28_Sub1_1.method4266(Static526.anInt8926) ? -1 : Static435.anInt7457;
		Static459.aBoolean536 = Static322.method2839(Static526.anInt8926) || Static89.aClass1_Sub28_Sub1_1.aBoolean325;
		Static92.aBoolean168 = Static89.aClass1_Sub28_Sub1_1.aBoolean323;
		Static108.aClass118_Sub1_2 = new Class118_Sub1(4, Static542.anInt9387, Static36.anInt1324, false);
		if (Static198.anInt4113 == 0) {
			Static403.method7261(Static108.aClass118_Sub1_2, Static397.aByteArrayArray25);
		} else {
			Static31.method1233(Static397.aByteArrayArray25, Static108.aClass118_Sub1_2);
		}
		Static223.method3946(Static542.anInt9387 >> 4, Static36.anInt1324 >> 4);
		Static432.method6371();
		if (local369) {
			Static368.method5690(true);
			Static33.aClass118_Sub1_1 = new Class118_Sub1(1, Static542.anInt9387, Static36.anInt1324, true);
			if (Static198.anInt4113 == 0) {
				Static403.method7261(Static33.aClass118_Sub1_1, Static130.aByteArrayArray12);
				Static135.method2905(true);
			} else {
				Static31.method1233(Static130.aByteArrayArray12, Static33.aClass118_Sub1_1);
				Static135.method2905(true);
			}
			Static33.aClass118_Sub1_1.method3444(Static108.aClass118_Sub1_2.anIntArrayArrayArray6[0]);
			Static33.aClass118_Sub1_1.method3439(Static478.aClass9_10, null, null);
			Static368.method5690(false);
		}
		Static108.aClass118_Sub1_2.method3439(Static478.aClass9_10, Static70.aClass299Array1, local369 ? Static33.aClass118_Sub1_1.anIntArrayArrayArray6 : null);
		if (Static198.anInt4113 == 0) {
			Static135.method2905(true);
			Static170.method3308(Static419.aByteArrayArray28, Static108.aClass118_Sub1_2);
			if (Static540.aByteArrayArray32 != null) {
				Static333.method5448();
			}
		} else {
			Static135.method2905(true);
			Static90.method2165(Static108.aClass118_Sub1_2, Static419.aByteArrayArray28);
		}
		Static33.method1299();
		if (Static318.anInt6040 < 96) {
			Static13.method709();
		}
		Static135.method2905(true);
		Static108.aClass118_Sub1_2.method3435(local369 ? Static106.aClass10Array5[0] : null, null, Static478.aClass9_10);
		Static108.aClass118_Sub1_2.method3448(Static478.aClass9_10);
		Static135.method2905(true);
		if (local369) {
			Static368.method5690(true);
			Static135.method2905(true);
			if (Static198.anInt4113 == 0) {
				Static170.method3308(Static161.aByteArrayArray15, Static33.aClass118_Sub1_1);
			} else {
				Static90.method2165(Static33.aClass118_Sub1_1, Static161.aByteArrayArray15);
			}
			Static33.method1299();
			Static135.method2905(true);
			Static33.aClass118_Sub1_1.method3435(null, Static53.aClass10Array3[0], Static478.aClass9_10);
			Static33.aClass118_Sub1_1.method3448(Static478.aClass9_10);
			Static135.method2905(true);
			Static368.method5690(false);
		}
		Static99.method2255();
		@Pc(701) int local701 = Static108.aClass118_Sub1_2.anInt3867;
		if (local701 > Static245.anInt4747) {
			local701 = Static245.anInt4747;
		}
		if (local701 < Static245.anInt4747 - 1) {
			local701 = Static245.anInt4747 - 1;
		}
		if (Static89.aClass1_Sub28_Sub1_1.method4266(Static526.anInt8926)) {
			Static426.method6323(0);
		} else {
			Static426.method6323(local701);
		}
		@Pc(734) int local734;
		@Pc(737) int local737;
		for (@Pc(731) int local731 = 0; local731 < 4; local731++) {
			for (local734 = 0; local734 < Static542.anInt9387; local734++) {
				for (local737 = 0; local737 < Static36.anInt1324; local737++) {
					Static218.method3888(local731, local734, local737);
				}
			}
		}
		Static418.method6217();
		Static443.method6413();
		Static118.method2664();
		Static33.method1299();
		Static131.method2856();
		if (Static543.aFrame2 != null && Static453.aClass154_1 != null && Static51.anInt7926 == 10) {
			Static444.method6416(Static312.aClass186_87);
			Static192.aClass1_Sub13_Sub2_1.method3069(1057001181);
		}
		if (Static198.anInt4113 == 0) {
			local734 = (Static184.anInt3932 - (Static542.anInt9387 >> 4)) / 8;
			local737 = (Static184.anInt3932 + (Static542.anInt9387 >> 4)) / 8;
			@Pc(823) int local823 = (Static358.anInt2386 - (Static36.anInt1324 >> 4)) / 8;
			@Pc(832) int local832 = (Static358.anInt2386 + (Static36.anInt1324 >> 4)) / 8;
			for (@Pc(836) int local836 = local734 - 1; local836 <= local737 + 1; local836++) {
				for (@Pc(841) int local841 = local823 - 1; local841 <= local832 + 1; local841++) {
					if (local734 > local836 || local737 < local836 || local823 > local841 || local832 < local841) {
						Static350.aClass160_74.method4227("m" + local836 + "_" + local841);
						Static350.aClass160_74.method4227("l" + local836 + "_" + local841);
					}
				}
			}
		}
		if (Static51.anInt7926 == 3) {
			Static265.method4401(2);
		} else if (Static51.anInt7926 == 7) {
			Static265.method4401(6);
		} else {
			Static265.method4401(9);
			if (Static453.aClass154_1 != null) {
				Static444.method6416(Static540.aClass186_119);
			}
		}
		Static141.method2966();
		Static443.method6413();
		Static58.method1891();
	}
}
