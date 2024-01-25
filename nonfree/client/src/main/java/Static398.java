import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "Lclient!go;")
	public static final Class97 aClass97_15 = new Class97(14, 0, 4, 1);

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "J")
	public static long aLong205 = -1L;

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "[I")
	public static final int[] anIntArray400 = new int[32];

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!ic;)V")
	public static void method5002(@OriginalArg(1) Class113 arg0) {
		Static85.aClass113_87 = arg0;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
	public static void method5005() {
		Static27.method869(false);
		Static61.anInt1095 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static342.aByteArrayArray41.length; local14++) {
			if (Static346.anIntArray341[local14] != -1 && Static342.aByteArrayArray41[local14] == null) {
				Static342.aByteArrayArray41[local14] = Static310.aClass113_97.method2274(Static346.anIntArray341[local14], 0);
				if (Static342.aByteArrayArray41[local14] == null) {
					Static61.anInt1095++;
					local12 = false;
				}
			}
			if (Static137.anIntArray112[local14] != -1 && Static383.aByteArrayArray44[local14] == null) {
				Static383.aByteArrayArray44[local14] = Static310.aClass113_97.method2262(0, Static137.anIntArray112[local14], Static148.anIntArrayArray62[local14]);
				if (Static383.aByteArrayArray44[local14] == null) {
					Static61.anInt1095++;
					local12 = false;
				}
			}
			if (Static7.anIntArray394[local14] != -1 && Static207.aByteArrayArray28[local14] == null) {
				Static207.aByteArrayArray28[local14] = Static310.aClass113_97.method2274(Static7.anIntArray394[local14], 0);
				if (Static207.aByteArrayArray28[local14] == null) {
					Static61.anInt1095++;
					local12 = false;
				}
			}
			if (Static288.anIntArray250[local14] != -1 && Static109.aByteArrayArray15[local14] == null) {
				Static109.aByteArrayArray15[local14] = Static310.aClass113_97.method2274(Static288.anIntArray250[local14], 0);
				if (Static109.aByteArrayArray15[local14] == null) {
					Static61.anInt1095++;
					local12 = false;
				}
			}
			if (Static356.anIntArray348 != null && Static59.aByteArrayArray9[local14] == null && Static356.anIntArray348[local14] != -1) {
				Static59.aByteArrayArray9[local14] = Static310.aClass113_97.method2262(0, Static356.anIntArray348[local14], Static148.anIntArrayArray62[local14]);
				if (Static59.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static61.anInt1095++;
				}
			}
		}
		if (Static403.aClass22_2 == null) {
			if (Static149.aClass1_Sub3_Sub16_4 == null || !Static274.aClass113_84.method2277(Static149.aClass1_Sub3_Sub16_4.aString56 + "_staticelements")) {
				Static403.aClass22_2 = new Class22(0);
			} else if (Static274.aClass113_84.method2254(Static149.aClass1_Sub3_Sub16_4.aString56 + "_staticelements")) {
				Static403.aClass22_2 = Static420.method210(Static149.aClass1_Sub3_Sub16_4.aString56 + "_staticelements", Static305.aBoolean410, Static274.aClass113_84);
			} else {
				local12 = false;
				Static61.anInt1095++;
			}
		}
		if (!local12) {
			Static430.anInt7185 = 1;
			return;
		}
		Static74.anInt1415 = 0;
		local12 = true;
		@Pc(275) int local275;
		@Pc(286) int local286;
		for (@Pc(256) int local256 = 0; local256 < Static342.aByteArrayArray41.length; local256++) {
			@Pc(262) byte[] local262 = Static383.aByteArrayArray44[local256];
			if (local262 != null) {
				local275 = (Static334.anIntArray331[local256] >> 8) * 64 - Static101.anInt6646;
				local286 = (Static334.anIntArray331[local256] & 0xFF) * 64 - Static278.anInt4392;
				if (Static108.anInt1918 != 0) {
					local275 = 10;
					local286 = 10;
				}
				local12 &= Static286.method3730(Static425.anInt6922, local275, local262, Static251.anInt4072, local286);
			}
			local262 = Static109.aByteArrayArray15[local256];
			if (local262 != null) {
				local275 = (Static334.anIntArray331[local256] >> 8) * 64 - Static101.anInt6646;
				local286 = (Static334.anIntArray331[local256] & 0xFF) * 64 - Static278.anInt4392;
				if (Static108.anInt1918 != 0) {
					local286 = 10;
					local275 = 10;
				}
				local12 &= Static286.method3730(Static425.anInt6922, local275, local262, Static251.anInt4072, local286);
			}
		}
		if (!local12) {
			Static430.anInt7185 = 2;
			return;
		}
		if (Static430.anInt7185 != 0) {
			Static357.method4619(Static275.aClass16_2, Static81.aClass151_51.method3122(Static188.anInt3028) + "<br>(100%)", true);
		}
		Static15.method239();
		Static336.method4290();
		@Pc(393) boolean local393 = false;
		if (Static213.aClass128_22.method3595() && Static336.aClass106_Sub1_1.aBoolean466) {
			for (local275 = 0; local275 < Static342.aByteArrayArray41.length; local275++) {
				if (Static109.aByteArrayArray15[local275] != null || Static207.aByteArrayArray28[local275] != null) {
					local393 = true;
					break;
				}
			}
		}
		if (Static336.aClass106_Sub1_1.aBoolean474) {
			local275 = Static126.anIntArray103[Static263.anInt4190];
		} else {
			local275 = Static339.anIntArray334[Static263.anInt4190];
		}
		if (Static213.aClass128_22.method3570()) {
			local275++;
		}
		Static439.method5513(Static425.anInt6922, Static251.anInt4072, local275, local393, Static213.aClass128_22.method3558() > 0);
		for (local286 = 0; local286 < 4; local286++) {
			Static383.aClass247Array1[local286].method5261();
		}
		Static151.method2146();
		Static363.method4723(false);
		Static274.method3489();
		Static25.aClass256_1 = null;
		Static15.method239();
		System.gc();
		Static27.method869(true);
		Static31.method546();
		Static265.anInt4222 = Static336.aClass106_Sub1_1.method4424(Static410.anInt6680);
		Static127.aBoolean164 = Static336.aClass106_Sub1_1.aBoolean466;
		Static40.aBoolean385 = Static144.anInt2437 >= 96;
		Static202.aBoolean253 = Static336.aClass106_Sub1_1.method4423(Static410.anInt6680);
		Static275.aBoolean345 = !Static336.aClass106_Sub1_1.aBoolean475;
		Static101.anInt6645 = Static336.aClass106_Sub1_1.method4438(Static410.anInt6680) ? -1 : Static257.anInt6933;
		Static144.aBoolean180 = Static336.aClass106_Sub1_1.aBoolean463;
		Static155.aBoolean207 = Static410.anInt6680 == 1 || Static336.aClass106_Sub1_1.aBoolean467;
		Static279.aClass148_Sub1_8 = new Class148_Sub1(4, Static425.anInt6922, Static251.anInt4072, false);
		if (Static108.anInt1918 == 0) {
			Static397.method5001(Static279.aClass148_Sub1_8, Static342.aByteArrayArray41);
		} else {
			Static278.method3524(Static279.aClass148_Sub1_8, Static342.aByteArrayArray41);
		}
		Static236.method3110(Static251.anInt4072 >> 4, Static425.anInt6922 >> 4);
		Static347.method4406();
		if (local393) {
			Static80.method1231(true);
			Static377.aClass148_Sub1_7 = new Class148_Sub1(1, Static425.anInt6922, Static251.anInt4072, true);
			if (Static108.anInt1918 == 0) {
				Static397.method5001(Static377.aClass148_Sub1_7, Static207.aByteArrayArray28);
				Static27.method869(true);
			} else {
				Static278.method3524(Static377.aClass148_Sub1_7, Static207.aByteArrayArray28);
				Static27.method869(true);
			}
			Static377.aClass148_Sub1_7.method4880(Static279.aClass148_Sub1_8.anIntArrayArrayArray14[0]);
			Static377.aClass148_Sub1_7.method4870(Static213.aClass128_22, null, null);
			Static80.method1231(false);
		}
		Static279.aClass148_Sub1_8.method4870(Static213.aClass128_22, local393 ? Static377.aClass148_Sub1_7.anIntArrayArrayArray14 : null, Static383.aClass247Array1);
		if (Static108.anInt1918 == 0) {
			Static27.method869(true);
			Static406.method5040(Static279.aClass148_Sub1_8, Static383.aByteArrayArray44);
			if (Static59.aByteArrayArray9 != null) {
				Static296.method3885();
			}
		} else {
			Static27.method869(true);
			Static284.method3704(Static279.aClass148_Sub1_8, Static383.aByteArrayArray44);
		}
		Static336.method4290();
		Static27.method869(true);
		Static279.aClass148_Sub1_8.method4878(Static213.aClass128_22, null, local393 ? Static164.aClass163Array1[0] : null);
		Static279.aClass148_Sub1_8.method4882(Static213.aClass128_22);
		Static27.method869(true);
		if (local393) {
			Static80.method1231(true);
			Static27.method869(true);
			if (Static108.anInt1918 == 0) {
				Static406.method5040(Static377.aClass148_Sub1_7, Static109.aByteArrayArray15);
			} else {
				Static284.method3704(Static377.aClass148_Sub1_7, Static109.aByteArrayArray15);
			}
			Static336.method4290();
			Static27.method869(true);
			Static377.aClass148_Sub1_7.method4878(Static213.aClass128_22, Static240.aClass163Array3[0], null);
			Static377.aClass148_Sub1_7.method4882(Static213.aClass128_22);
			Static27.method869(true);
			Static80.method1231(false);
		}
		Static57.method883();
		@Pc(734) int local734 = Static279.aClass148_Sub1_8.anInt6362;
		if (local734 > Static138.anInt3548) {
			local734 = Static138.anInt3548;
		}
		if (Static138.anInt3548 - 1 > local734) {
			local734 = Static138.anInt3548 - 1;
		}
		if (Static336.aClass106_Sub1_1.method4438(Static410.anInt6680)) {
			Static385.method4924(0);
		} else {
			Static385.method4924(local734);
		}
		@Pc(773) int local773;
		@Pc(777) int local777;
		for (@Pc(769) int local769 = 0; local769 < 4; local769++) {
			for (local773 = 0; local773 < Static425.anInt6922; local773++) {
				for (local777 = 0; local777 < Static251.anInt4072; local777++) {
					Static324.method4162(local769, local773, local777);
				}
			}
		}
		Static275.method3498();
		Static15.method239();
		Static391.method4946();
		Static336.method4290();
		Static402.aBoolean533 = false;
		Static102.method1464();
		if (Static158.aFrame2 != null && Static48.aClass3_2 != null && Static98.anInt1721 == 25) {
			Static5.method94(Static105.aClass137_87);
			Static75.aClass1_Sub11_Sub1_1.method4450(1057001181);
		}
		if (Static108.anInt1918 == 0) {
			local773 = (Static92.anInt1619 - (Static425.anInt6922 >> 4)) / 8;
			local777 = ((Static425.anInt6922 >> 4) + Static92.anInt1619) / 8;
			@Pc(854) int local854 = (Static64.anInt1135 - (Static251.anInt4072 >> 4)) / 8;
			@Pc(863) int local863 = (Static64.anInt1135 + (Static251.anInt4072 >> 4)) / 8;
			for (@Pc(867) int local867 = local773 - 1; local867 <= local777 + 1; local867++) {
				for (@Pc(873) int local873 = local854 - 1; local873 <= local863 + 1; local873++) {
					if (local867 < local773 || local777 < local867 || local873 < local854 || local873 > local863) {
						Static310.aClass113_97.method2259("m" + local867 + "_" + local873);
						Static310.aClass113_97.method2259("l" + local867 + "_" + local873);
					}
				}
			}
		}
		if (Static98.anInt1721 == 28) {
			Static430.method5422(10);
		} else {
			Static430.method5422(30);
			if (Static48.aClass3_2 != null) {
				Static5.method94(Static323.aClass137_203);
			}
		}
		Static241.method3137();
		Static15.method239();
		Static285.method3724();
	}
}
