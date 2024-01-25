import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "[Lclient!pn;")
	public static Class25_Sub2[] aClass25_Sub2Array2;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "[I")
	private static final int[] anIntArray357 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "[I")
	public static final int[] anIntArray358 = new int[6];

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
	public static void method5176() {
		Static375.method5253(false);
		Static75.anInt2068 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static260.aByteArrayArray25.length; local14++) {
			if (Static320.anIntArray288[local14] != -1 && Static260.aByteArrayArray25[local14] == null) {
				Static260.aByteArrayArray25[local14] = Static295.aClass284_92.method6331(Static320.anIntArray288[local14], 0);
				if (Static260.aByteArrayArray25[local14] == null) {
					Static75.anInt2068++;
					local12 = false;
				}
			}
			if (Static481.anIntArray497[local14] != -1 && Static566.aByteArrayArray50[local14] == null) {
				Static566.aByteArrayArray50[local14] = Static295.aClass284_92.method6330(0, Static208.anIntArrayArray39[local14], Static481.anIntArray497[local14]);
				if (Static566.aByteArrayArray50[local14] == null) {
					local12 = false;
					Static75.anInt2068++;
				}
			}
			if (Static562.anIntArray563[local14] != -1 && Static4.aByteArrayArray1[local14] == null) {
				Static4.aByteArrayArray1[local14] = Static295.aClass284_92.method6331(Static562.anIntArray563[local14], 0);
				if (Static4.aByteArrayArray1[local14] == null) {
					Static75.anInt2068++;
					local12 = false;
				}
			}
			if (Static575.anIntArray575[local14] != -1 && Static403.aByteArrayArray35[local14] == null) {
				Static403.aByteArrayArray35[local14] = Static295.aClass284_92.method6331(Static575.anIntArray575[local14], 0);
				if (Static403.aByteArrayArray35[local14] == null) {
					local12 = false;
					Static75.anInt2068++;
				}
			}
			if (Static243.anIntArray529 != null && Static402.aByteArrayArray34[local14] == null && Static243.anIntArray529[local14] != -1) {
				Static402.aByteArrayArray34[local14] = Static295.aClass284_92.method6330(0, Static208.anIntArrayArray39[local14], Static243.anIntArray529[local14]);
				if (Static402.aByteArrayArray34[local14] == null) {
					local12 = false;
					Static75.anInt2068++;
				}
			}
		}
		if (Static425.aClass57_3 == null) {
			if (Static5.aClass3_Sub7_Sub1_1 == null || !Static332.aClass284_24.method6348(Static5.aClass3_Sub7_Sub1_1.aString21 + "_staticelements")) {
				Static425.aClass57_3 = new Class57(0);
			} else if (Static332.aClass284_24.method6352(Static5.aClass3_Sub7_Sub1_1.aString21 + "_staticelements")) {
				Static425.aClass57_3 = Static274.method4157(Static332.aClass284_24, Static5.aClass3_Sub7_Sub1_1.aString21 + "_staticelements", Static150.aBoolean247);
			} else {
				Static75.anInt2068++;
				local12 = false;
			}
		}
		if (!local12) {
			Static336.anInt6066 = 1;
			return;
		}
		local12 = true;
		Static218.anInt8725 = 0;
		@Pc(270) int local270;
		@Pc(281) int local281;
		for (@Pc(251) int local251 = 0; local251 < Static260.aByteArrayArray25.length; local251++) {
			@Pc(257) byte[] local257 = Static566.aByteArrayArray50[local251];
			if (local257 != null) {
				local270 = (Static178.anIntArray159[local251] >> 8) * 64 - Static321.anInt5874;
				local281 = (Static178.anIntArray159[local251] & 0xFF) * 64 - Static137.anInt3293;
				if (Static47.anInt1279 != 0) {
					local281 = 10;
					local270 = 10;
				}
				local12 &= Static406.method5724(local257, Static535.anInt9341, local270, Static345.anInt6228, local281);
			}
			local257 = Static403.aByteArrayArray35[local251];
			if (local257 != null) {
				local270 = (Static178.anIntArray159[local251] >> 8) * 64 - Static321.anInt5874;
				local281 = (Static178.anIntArray159[local251] & 0xFF) * 64 - Static137.anInt3293;
				if (Static47.anInt1279 != 0) {
					local270 = 10;
					local281 = 10;
				}
				local12 &= Static406.method5724(local257, Static535.anInt9341, local270, Static345.anInt6228, local281);
			}
		}
		if (!local12) {
			Static336.anInt6066 = 2;
			return;
		}
		if (Static336.anInt6066 != 0) {
			Static452.method6235(Static2.aClass63_1, Static573.aClass350_16.method7730(Static201.anInt4321) + "<br>(100%)", Static319.aClass31_11, Static318.aClass328_8, true);
		}
		Static245.method3870();
		Static527.method8126();
		@Pc(390) boolean local390 = false;
		if (Static319.aClass31_11.method8095() && Static348.aClass3_Sub51_Sub1_5.aBoolean674) {
			for (local270 = 0; local270 < Static260.aByteArrayArray25.length; local270++) {
				if (Static403.aByteArrayArray35[local270] != null || Static4.aByteArrayArray1[local270] != null) {
					local390 = true;
					break;
				}
			}
		}
		if (Static348.aClass3_Sub51_Sub1_5.aBoolean670) {
			local270 = anIntArray357[Static391.anInt6956];
		} else {
			local270 = Static63.anIntArray56[Static391.anInt6956];
		}
		if (Static319.aClass31_11.method8063()) {
			local270++;
		}
		Static278.method4206(Static319.aClass31_11, Static183.anInt4003, Static345.anInt6228, Static535.anInt9341, local270, local390, Static319.aClass31_11.method8026() > 0);
		Static154.method2856(Static528.anInt10344);
		if (Static528.anInt10344 == 0) {
			Static318.method4714(null);
		} else {
			Static318.method4714(Static393.aClass63_9);
		}
		for (local281 = 0; local281 < 4; local281++) {
			Static187.aClass220Array1[local281].method5072();
		}
		Static416.method5813();
		Static560.method7664(false);
		Static25.method245();
		Static253.aBoolean324 = false;
		Static177.aClass256_1 = null;
		Static245.method3870();
		System.gc();
		Static375.method5253(true);
		Static243.method6943();
		Static6.anInt45 = Static348.aClass3_Sub51_Sub1_5.method7830(Static37.anInt1122);
		Static331.aBoolean426 = Static372.anInt6489 >= 96;
		Static266.aBoolean332 = Static348.aClass3_Sub51_Sub1_5.aBoolean674;
		Static167.aBoolean472 = Static348.aClass3_Sub51_Sub1_5.method7824(Static37.anInt1122);
		Static525.aBoolean623 = !Static348.aClass3_Sub51_Sub1_5.aBoolean680;
		Static10.anInt87 = Static348.aClass3_Sub51_Sub1_5.method7837(Static37.anInt1122) ? -1 : Static286.anInt5361;
		Static498.aBoolean528 = Static328.method4867(Static37.anInt1122) || Static348.aClass3_Sub51_Sub1_5.aBoolean685;
		Static385.aBoolean469 = Static348.aClass3_Sub51_Sub1_5.aBoolean678;
		Static591.aClass268_Sub1_2 = new Class268_Sub1(4, Static345.anInt6228, Static535.anInt9341, false);
		if (Static47.anInt1279 == 0) {
			Static65.method1623(Static260.aByteArrayArray25, Static591.aClass268_Sub1_2);
		} else {
			Static572.method7726(Static591.aClass268_Sub1_2, Static260.aByteArrayArray25);
		}
		Static463.method6361(Static535.anInt9341 >> 4, Static345.anInt6228 >> 4);
		Static489.method7314();
		if (local390) {
			Static593.method8145(true);
			Static571.aClass268_Sub1_1 = new Class268_Sub1(1, Static345.anInt6228, Static535.anInt9341, true);
			if (Static47.anInt1279 == 0) {
				Static65.method1623(Static4.aByteArrayArray1, Static571.aClass268_Sub1_1);
				Static375.method5253(true);
			} else {
				Static572.method7726(Static571.aClass268_Sub1_1, Static4.aByteArrayArray1);
				Static375.method5253(true);
			}
			Static571.aClass268_Sub1_1.method6288(Static591.aClass268_Sub1_2.anIntArrayArrayArray12[0]);
			Static571.aClass268_Sub1_1.method6295(null, Static319.aClass31_11, null);
			Static593.method8145(false);
		}
		Static591.aClass268_Sub1_2.method6295(Static187.aClass220Array1, Static319.aClass31_11, local390 ? Static571.aClass268_Sub1_1.anIntArrayArrayArray12 : null);
		if (Static47.anInt1279 == 0) {
			Static375.method5253(true);
			Static142.method2741(Static591.aClass268_Sub1_2, Static566.aByteArrayArray50);
			if (Static402.aByteArrayArray34 != null) {
				Static59.method1444();
			}
		} else {
			Static375.method5253(true);
			Static457.method6287(Static566.aByteArrayArray50, Static591.aClass268_Sub1_2);
		}
		Static527.method8126();
		if (Static372.anInt6489 < 96) {
			Static189.method3320();
		}
		Static375.method5253(true);
		Static591.aClass268_Sub1_2.method6294(local390 ? Static108.aClass127Array5[0] : null, null, Static319.aClass31_11);
		Static591.aClass268_Sub1_2.method6308(false, Static319.aClass31_11);
		Static375.method5253(true);
		if (local390) {
			Static593.method8145(true);
			Static375.method5253(true);
			if (Static47.anInt1279 == 0) {
				Static142.method2741(Static571.aClass268_Sub1_1, Static403.aByteArrayArray35);
			} else {
				Static457.method6287(Static403.aByteArrayArray35, Static571.aClass268_Sub1_1);
			}
			Static527.method8126();
			Static375.method5253(true);
			Static571.aClass268_Sub1_1.method6294(null, Static420.aClass127Array6[0], Static319.aClass31_11);
			Static571.aClass268_Sub1_1.method6308(true, Static319.aClass31_11);
			Static375.method5253(true);
			Static593.method8145(false);
		}
		Static596.method8174();
		@Pc(742) int local742 = Static591.aClass268_Sub1_2.anInt8005;
		if (Static594.anInt10310 < local742) {
			local742 = Static594.anInt10310;
		}
		if (Static594.anInt10310 - 1 > local742) {
			local742 = Static594.anInt10310 - 1;
		}
		if (Static348.aClass3_Sub51_Sub1_5.method7837(Static37.anInt1122)) {
			Static460.method6319(0);
		} else {
			Static460.method6319(local742);
		}
		@Pc(777) int local777;
		@Pc(781) int local781;
		for (@Pc(773) int local773 = 0; local773 < 4; local773++) {
			for (local777 = 0; local777 < Static345.anInt6228; local777++) {
				for (local781 = 0; local781 < Static535.anInt9341; local781++) {
					Static499.method4576(local773, local777, local781);
				}
			}
		}
		Static418.method5824();
		Static245.method3870();
		Static495.method6693();
		Static527.method8126();
		Static31.method474();
		@Pc(832) Class3_Sub10 local832;
		if (Static302.aFrame2 != null && Static451.aClass223_6 != null && Static409.anInt1461 == 11) {
			local832 = Static129.method2403(Static452.aClass353_2, Static384.aClass287_112);
			local832.aClass3_Sub26_Sub1_1.method6826(1057001181);
			Static193.method3398(local832);
		}
		if (Static47.anInt1279 == 0) {
			local777 = (Static347.anInt6235 - (Static345.anInt6228 >> 4)) / 8;
			local781 = ((Static345.anInt6228 >> 4) + Static347.anInt6235) / 8;
			@Pc(867) int local867 = (Static100.anInt9658 - (Static535.anInt9341 >> 4)) / 8;
			@Pc(875) int local875 = (Static100.anInt9658 + (Static535.anInt9341 >> 4)) / 8;
			for (@Pc(879) int local879 = local777 - 1; local879 <= local781 + 1; local879++) {
				for (@Pc(885) int local885 = local867 - 1; local885 <= local875 + 1; local885++) {
					if (local777 > local879 || local781 < local879 || local867 > local885 || local875 < local885) {
						Static295.aClass284_92.method6326("m" + local879 + "_" + local885);
						Static295.aClass284_92.method6326("l" + local879 + "_" + local885);
					}
				}
			}
		}
		if (Static409.anInt1461 == 4) {
			Static27.method293(3);
		} else if (Static409.anInt1461 == 8) {
			Static27.method293(7);
		} else {
			Static27.method293(10);
			if (Static451.aClass223_6 != null) {
				local832 = Static129.method2403(Static452.aClass353_2, Static574.aClass287_146);
				Static193.method3398(local832);
			}
		}
		Static310.method4646();
		Static245.method3870();
		Static288.method4330();
		if (Static330.aBoolean425) {
			Static196.method3426("Took: " + (Static96.method2000() - Static443.aLong214) + "ms");
			Static330.aBoolean425 = false;
		}
	}
}
