import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!ub;")
	public static final Class244 aClass244_38 = new Class244();

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "[I")
	public static final int[] anIntArray502 = new int[50];

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public static void method5131() {
		Static118.method1693(Static11.aClass110_1);
		Static285.anInt4687++;
		if (Static30.aBoolean32 && Static240.aBoolean299) {
			@Pc(31) int local31 = Static455.aClass48_1.method1138();
			@Pc(35) int local35 = Static455.aClass48_1.method1142();
			local35 -= Static204.anInt3612;
			local31 -= Static337.anInt5501;
			if (local31 < Static105.anInt1944) {
				local31 = Static105.anInt1944;
			}
			if (Static11.aClass110_1.anInt2617 + local31 > Static216.aClass110_9.anInt2617 + Static105.anInt1944) {
				local31 = Static105.anInt1944 + Static216.aClass110_9.anInt2617 - Static11.aClass110_1.anInt2617;
			}
			if (local35 < Static389.anInt6348) {
				local35 = Static389.anInt6348;
			}
			if (local35 + Static11.aClass110_1.anInt2590 > Static216.aClass110_9.anInt2590 + Static389.anInt6348) {
				local35 = Static389.anInt6348 + Static216.aClass110_9.anInt2590 - Static11.aClass110_1.anInt2590;
			}
			@Pc(106) int local106 = Static216.aClass110_9.anInt2630 + local31 - Static105.anInt1944;
			@Pc(114) int local114 = local35 + Static216.aClass110_9.anInt2642 - Static389.anInt6348;
			@Pc(168) Class4_Sub34 local168;
			if (Static455.aClass48_1.method1147()) {
				if (Static11.aClass110_1.anInt2603 < Static285.anInt4687) {
					@Pc(127) int local127 = local31 - Static19.anInt304;
					@Pc(131) int local131 = local35 - Static448.anInt7475;
					if (Static11.aClass110_1.anInt2611 < local127 || local127 < -Static11.aClass110_1.anInt2611 || local131 > Static11.aClass110_1.anInt2611 || local131 < -Static11.aClass110_1.anInt2611) {
						Static188.aBoolean268 = true;
					}
				}
				if (Static11.aClass110_1.anObjectArray8 != null && Static188.aBoolean268) {
					local168 = new Class4_Sub34();
					local168.anInt4910 = local114;
					local168.aClass110_14 = Static11.aClass110_1;
					local168.anInt4909 = local106;
					local168.anObjectArray34 = Static11.aClass110_1.anObjectArray8;
					Static80.method1289(local168);
					return;
				}
			} else {
				if (Static188.aBoolean268) {
					Static4.method74();
					if (Static11.aClass110_1.anObjectArray21 != null) {
						local168 = new Class4_Sub34();
						local168.aClass110_14 = Static11.aClass110_1;
						local168.aClass110_15 = Static63.aClass110_16;
						local168.anInt4909 = local106;
						local168.anObjectArray34 = Static11.aClass110_1.anObjectArray21;
						local168.anInt4910 = local114;
						Static80.method1289(local168);
					}
					if (Static63.aClass110_16 != null && Static55.method754(Static11.aClass110_1) != null) {
						Static171.method2386(Static63.aClass110_16, Static11.aClass110_1);
					}
				} else if ((Static443.anInt7447 == 1 || Static285.method3722()) && Static351.anInt5841 > 2) {
					Static256.method3380(Static448.anInt7475 + Static204.anInt3612, Static19.anInt304 + Static337.anInt5501);
				} else if (Static114.method1680()) {
					Static256.method3380(Static448.anInt7475 + Static204.anInt3612, Static19.anInt304 + Static337.anInt5501);
				}
				Static11.aClass110_1 = null;
			}
		} else if (Static285.anInt4687 > 1) {
			Static11.aClass110_1 = null;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method5134() {
		Static162.method66(false);
		Static375.anInt6137 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static271.aByteArrayArray10.length; local14++) {
			if (Static318.anIntArray417[local14] != -1 && Static271.aByteArrayArray10[local14] == null) {
				Static271.aByteArrayArray10[local14] = Static280.aClass211_68.method4377(Static318.anIntArray417[local14], 0);
				if (Static271.aByteArrayArray10[local14] == null) {
					Static375.anInt6137++;
					local12 = false;
				}
			}
			if (Static146.anIntArray220[local14] != -1 && Static418.aByteArrayArray17[local14] == null) {
				Static418.aByteArrayArray17[local14] = Static280.aClass211_68.method4383(0, Static146.anIntArray220[local14], Static229.anIntArrayArray42[local14]);
				if (Static418.aByteArrayArray17[local14] == null) {
					Static375.anInt6137++;
					local12 = false;
				}
			}
			if (Static127.anIntArray182[local14] != -1 && Static131.aByteArrayArray5[local14] == null) {
				Static131.aByteArrayArray5[local14] = Static280.aClass211_68.method4377(Static127.anIntArray182[local14], 0);
				if (Static131.aByteArrayArray5[local14] == null) {
					Static375.anInt6137++;
					local12 = false;
				}
			}
			if (Static398.anIntArray495[local14] != -1 && Static375.aByteArrayArray14[local14] == null) {
				Static375.aByteArrayArray14[local14] = Static280.aClass211_68.method4377(Static398.anIntArray495[local14], 0);
				if (Static375.aByteArrayArray14[local14] == null) {
					local12 = false;
					Static375.anInt6137++;
				}
			}
			if (Static225.anIntArray279 != null && Static372.aByteArrayArray13[local14] == null && Static225.anIntArray279[local14] != -1) {
				Static372.aByteArrayArray13[local14] = Static280.aClass211_68.method4383(0, Static225.anIntArray279[local14], Static229.anIntArrayArray42[local14]);
				if (Static372.aByteArrayArray13[local14] == null) {
					local12 = false;
					Static375.anInt6137++;
				}
			}
		}
		if (Static337.aClass11_2 == null) {
			if (Static290.aClass4_Sub2_Sub11_1 == null || !Static359.aClass211_80.method4355(Static290.aClass4_Sub2_Sub11_1.aString33 + "_staticelements")) {
				Static337.aClass11_2 = new Class11(0);
			} else if (Static359.aClass211_80.method4376(Static290.aClass4_Sub2_Sub11_1.aString33 + "_staticelements")) {
				Static337.aClass11_2 = Static436.method5811(Static359.aClass211_80, Static225.aBoolean284, Static290.aClass4_Sub2_Sub11_1.aString33 + "_staticelements");
			} else {
				local12 = false;
				Static375.anInt6137++;
			}
		}
		if (!local12) {
			Static84.anInt5160 = 1;
			return;
		}
		Static294.anInt4838 = 0;
		local12 = true;
		@Pc(273) int local273;
		@Pc(284) int local284;
		for (@Pc(255) int local255 = 0; local255 < Static271.aByteArrayArray10.length; local255++) {
			@Pc(261) byte[] local261 = Static418.aByteArrayArray17[local255];
			if (local261 != null) {
				local273 = (Static91.anIntArray131[local255] >> 8) * 64 - Static365.anInt6047;
				local284 = (Static91.anIntArray131[local255] & 0xFF) * 64 - Static366.anInt6052;
				if (Static267.anInt4402 != 0) {
					local284 = 10;
					local273 = 10;
				}
				local12 &= Static454.method6025(local261, local284, local273, Static282.anInt4644, Static337.anInt5497);
			}
			local261 = Static375.aByteArrayArray14[local255];
			if (local261 != null) {
				local273 = (Static91.anIntArray131[local255] >> 8) * 64 - Static365.anInt6047;
				local284 = (Static91.anIntArray131[local255] & 0xFF) * 64 - Static366.anInt6052;
				if (Static267.anInt4402 != 0) {
					local284 = 10;
					local273 = 10;
				}
				local12 &= Static454.method6025(local261, local284, local273, Static282.anInt4644, Static337.anInt5497);
			}
		}
		if (!local12) {
			Static84.anInt5160 = 2;
			return;
		}
		if (Static84.anInt5160 != 0) {
			Static94.method4424(Static283.aClass123_6, Static243.aClass15_65.method180(Static429.anInt6999) + "<br>(100%)", true);
		}
		Static150.method2112();
		Static297.method3871();
		@Pc(385) boolean local385 = false;
		if (Static39.aClass135_1.method5350() && Static413.aClass49_Sub1_1.aBoolean236) {
			for (local273 = 0; local273 < Static271.aByteArrayArray10.length; local273++) {
				if (Static375.aByteArrayArray14[local273] != null || Static131.aByteArrayArray5[local273] != null) {
					local385 = true;
					break;
				}
			}
		}
		if (Static413.aClass49_Sub1_1.aBoolean242) {
			local273 = Static284.anIntArray377[Static241.anInt4046];
		} else {
			local273 = Static202.anIntArray264[Static241.anInt4046];
		}
		if (Static39.aClass135_1.method5342()) {
			local273++;
		}
		Static406.method5513(Static337.anInt5497, Static282.anInt4644, local273, local385, Static39.aClass135_1.method5362() > 0);
		for (local284 = 0; local284 < 4; local284++) {
			Static409.aClass128Array1[local284].method2466();
		}
		Static56.method779();
		Static337.method4458(false);
		Static277.method3669();
		Static113.aClass209_1 = null;
		Static150.method2112();
		System.gc();
		Static162.method66(true);
		Static85.method1324();
		Static262.anInt4697 = Static413.aClass49_Sub1_1.method2478(Static341.anInt5549);
		Static416.aBoolean497 = Static18.anInt296 >= 96;
		Static342.aBoolean400 = Static413.aClass49_Sub1_1.aBoolean236;
		Static389.aBoolean440 = Static413.aClass49_Sub1_1.method2481(Static341.anInt5549);
		Static225.aBoolean286 = !Static413.aClass49_Sub1_1.aBoolean232;
		Static169.anInt3059 = Static413.aClass49_Sub1_1.method2485(Static341.anInt5549) ? -1 : Static163.anInt3008;
		Static53.aBoolean50 = Static413.aClass49_Sub1_1.aBoolean237;
		Static276.aBoolean343 = Static341.anInt5549 == 1 || Static413.aClass49_Sub1_1.aBoolean247;
		Static102.aClass26_Sub1_1 = new Class26_Sub1(4, Static337.anInt5497, Static282.anInt4644, false);
		if (Static267.anInt4402 == 0) {
			Static213.method574(Static102.aClass26_Sub1_1, Static271.aByteArrayArray10);
		} else {
			Static89.method1406(Static271.aByteArrayArray10, Static102.aClass26_Sub1_1);
		}
		Static198.method4125(Static282.anInt4644 >> 4, Static337.anInt5497 >> 4);
		Static321.method4250();
		if (local385) {
			Static371.method4767(true);
			Static379.aClass26_Sub1_2 = new Class26_Sub1(1, Static337.anInt5497, Static282.anInt4644, true);
			if (Static267.anInt4402 == 0) {
				Static213.method574(Static379.aClass26_Sub1_2, Static131.aByteArrayArray5);
				Static162.method66(true);
			} else {
				Static89.method1406(Static131.aByteArrayArray5, Static379.aClass26_Sub1_2);
				Static162.method66(true);
			}
			Static379.aClass26_Sub1_2.method1708(Static102.aClass26_Sub1_1.anIntArrayArrayArray2[0]);
			Static379.aClass26_Sub1_2.method1704(null, null, Static39.aClass135_1);
			Static371.method4767(false);
		}
		Static102.aClass26_Sub1_1.method1704(Static409.aClass128Array1, local385 ? Static379.aClass26_Sub1_2.anIntArrayArrayArray2 : null, Static39.aClass135_1);
		if (Static267.anInt4402 == 0) {
			Static162.method66(true);
			Static31.method431(Static102.aClass26_Sub1_1, Static418.aByteArrayArray17);
			if (Static372.aByteArrayArray13 != null) {
				Static96.method1454();
			}
		} else {
			Static162.method66(true);
			Static128.method5872(Static418.aByteArrayArray17, Static102.aClass26_Sub1_1);
		}
		Static297.method3871();
		Static162.method66(true);
		Static102.aClass26_Sub1_1.method1711(Static39.aClass135_1, null, local385 ? Static169.aClass41Array1[0] : null);
		Static102.aClass26_Sub1_1.method1714(Static39.aClass135_1);
		Static162.method66(true);
		if (local385) {
			Static371.method4767(true);
			Static162.method66(true);
			if (Static267.anInt4402 == 0) {
				Static31.method431(Static379.aClass26_Sub1_2, Static375.aByteArrayArray14);
			} else {
				Static128.method5872(Static375.aByteArrayArray14, Static379.aClass26_Sub1_2);
			}
			Static297.method3871();
			Static162.method66(true);
			Static379.aClass26_Sub1_2.method1711(Static39.aClass135_1, Static228.aClass41Array2[0], null);
			Static379.aClass26_Sub1_2.method1714(Static39.aClass135_1);
			Static162.method66(true);
			Static371.method4767(false);
		}
		Static304.method3972();
		@Pc(727) int local727 = Static102.aClass26_Sub1_1.anInt2164;
		if (local727 > Static68.anInt1387) {
			local727 = Static68.anInt1387;
		}
		if (Static68.anInt1387 - 1 > local727) {
			local727 = Static68.anInt1387 - 1;
		}
		if (Static413.aClass49_Sub1_1.method2485(Static341.anInt5549)) {
			Static167.method2320(0);
		} else {
			Static167.method2320(local727);
		}
		@Pc(766) int local766;
		@Pc(770) int local770;
		for (@Pc(762) int local762 = 0; local762 < 4; local762++) {
			for (local766 = 0; local766 < Static337.anInt5497; local766++) {
				for (local770 = 0; local770 < Static282.anInt4644; local770++) {
					Static39.method546(local766, local762, local770);
				}
			}
		}
		Static70.method1167();
		Static150.method2112();
		Static83.method4115();
		Static297.method3871();
		Static288.aBoolean350 = false;
		Static389.method5135();
		if (Static43.aFrame4 != null && Static338.aClass152_4 != null && Static8.anInt119 == 10) {
			Static448.method5935(Static157.aClass146_45);
			Static247.aClass4_Sub9_Sub2_2.method5047(1057001181);
		}
		if (Static267.anInt4402 == 0) {
			local766 = (Static34.anInt2146 - (Static337.anInt5497 >> 4)) / 8;
			local770 = ((Static337.anInt5497 >> 4) + Static34.anInt2146) / 8;
			@Pc(861) int local861 = (Static361.anInt627 - (Static282.anInt4644 >> 4)) / 8;
			@Pc(869) int local869 = (Static361.anInt627 + (Static282.anInt4644 >> 4)) / 8;
			for (@Pc(873) int local873 = local766 - 1; local873 <= local770 + 1; local873++) {
				for (@Pc(879) int local879 = local861 - 1; local879 <= local869 + 1; local879++) {
					if (local766 > local873 || local770 < local873 || local879 < local861 || local879 > local869) {
						Static280.aClass211_68.method4363("m" + local873 + "_" + local879);
						Static280.aClass211_68.method4363("l" + local873 + "_" + local879);
					}
				}
			}
		}
		if (Static8.anInt119 == 3) {
			Static119.method4569(2);
		} else if (Static8.anInt119 == 7) {
			Static119.method4569(6);
		} else {
			Static119.method4569(9);
			if (Static338.aClass152_4 != null) {
				Static448.method5935(Static142.aClass146_42);
			}
		}
		Static90.method1413();
		Static150.method2112();
		Static251.method3313();
	}
}
