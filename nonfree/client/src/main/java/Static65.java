import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	public static int anInt403 = -1;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "[I")
	public static int[] anIntArray25 = new int[32768];

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	public static int anInt405 = 1;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lclient!td;")
	public static Class140_Sub1 method323(@OriginalArg(1) int arg0) {
		return Static36.aBoolean66 && arg0 >= Static299.anInt6238 && arg0 <= Static177.anInt3990 ? Static24.aClass140_Sub1Array1[arg0 - Static299.anInt6238] : null;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void method324() {
		Static189.method3378(Static204.aClass116_11);
		Static142.anInt3247++;
		if (Static270.aBoolean307 && Static228.aBoolean273) {
			@Pc(32) int local32 = Static84.anInt1989;
			local32 -= Static193.anInt4364;
			@Pc(38) int local38 = Static212.anInt4711;
			local38 -= Static265.anInt5771;
			if (local38 < Static250.anInt1874) {
				local38 = Static250.anInt1874;
			}
			if (Static204.aClass116_11.anInt4363 + local38 > Static143.aClass116_8.anInt4363 + Static250.anInt1874) {
				local38 = Static250.anInt1874 + Static143.aClass116_8.anInt4363 - Static204.aClass116_11.anInt4363;
			}
			if (Static231.anInt5455 > local32) {
				local32 = Static231.anInt5455;
			}
			if (local32 + Static204.aClass116_11.anInt4299 > Static143.aClass116_8.anInt4299 + Static231.anInt5455) {
				local32 = Static231.anInt5455 + Static143.aClass116_8.anInt4299 - Static204.aClass116_11.anInt4299;
			}
			@Pc(92) int local92 = local32 - Static274.anInt2944;
			@Pc(97) int local97 = local38 - Static226.anInt4956;
			@Pc(100) int local100 = Static204.aClass116_11.anInt4339;
			if (Static142.anInt3247 > Static204.aClass116_11.anInt4312 && (local92 > local100 || local92 < -local100 || local100 < local97 || local97 < -local100)) {
				Static87.aBoolean110 = true;
			}
			@Pc(142) int local142 = local38 + Static143.aClass116_8.anInt4307 - Static250.anInt1874;
			@Pc(150) int local150 = Static143.aClass116_8.anInt4303 + local32 - Static231.anInt5455;
			@Pc(160) Class1_Sub27 local160;
			if (Static204.aClass116_11.anObjectArray25 != null && Static87.aBoolean110) {
				local160 = new Class1_Sub27();
				local160.aClass116_13 = Static204.aClass116_11;
				local160.anInt4899 = local150;
				local160.anInt4905 = local142;
				local160.anObjectArray32 = Static204.aClass116_11.anObjectArray25;
				Static22.method392(local160);
			}
			if (Static224.anInt4947 == 0) {
				if (Static87.aBoolean110) {
					if (Static204.aClass116_11.anObjectArray8 != null) {
						local160 = new Class1_Sub27();
						local160.aClass116_13 = Static204.aClass116_11;
						local160.anInt4899 = local150;
						local160.anInt4905 = local142;
						local160.aClass116_12 = Static157.aClass116_9;
						local160.anObjectArray32 = Static204.aClass116_11.anObjectArray8;
						Static22.method392(local160);
					}
					if (Static157.aClass116_9 != null && Static37.method852(Static204.aClass116_11) != null) {
						Static81.aClass1_Sub16_Sub1_1.method2676(117);
						Static81.aClass1_Sub16_Sub1_1.method2617(Static157.aClass116_9.anInt4297);
						Static81.aClass1_Sub16_Sub1_1.method2657(Static204.aClass116_11.anInt4297);
						Static81.aClass1_Sub16_Sub1_1.method2651(Static204.aClass116_11.anInt4290);
						Static81.aClass1_Sub16_Sub1_1.method2638(Static157.aClass116_9.anInt4290);
					}
				} else if ((Static82.anInt1966 == 1 || Static161.method3006(Static111.anInt2398 - 1)) && Static111.anInt2398 > 2) {
					Static35.method730();
				} else if (Static111.anInt2398 > 0) {
					Static259.method4399();
				}
				Static204.aClass116_11 = null;
			}
		} else if (Static142.anInt3247 > 1) {
			Static204.aClass116_11 = null;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
	public static void method327() {
		Static258.method4394(Static204.anInt4555);
		@Pc(17) int local17 = (Static266.anInt5790 >> 3) + (Static157.anInt3612 >> 10);
		@Pc(27) int local27 = (Static82.anInt1972 >> 3) + (Static229.anInt5072 >> 10);
		Static126.aByteArrayArray64 = new byte[18][];
		Static138.aByteArrayArray71 = new byte[18][];
		Static287.anIntArray603 = new int[18];
		Static160.anIntArray336 = new int[18];
		Static105.aByteArrayArray138 = new byte[18][];
		Static8.anIntArray449 = new int[18];
		Static210.anIntArray473 = new int[18];
		Static230.anIntArray528 = new int[18];
		Static231.aByteArrayArray125 = new byte[18][];
		Static99.anIntArray223 = new int[18];
		Static133.anIntArrayArray18 = new int[18][4];
		Static209.aByteArrayArray104 = new byte[18][];
		@Pc(72) int local72 = 0;
		@Pc(78) int local78;
		for (local78 = (local27 - 6) / 8; local78 <= (local27 + 6) / 8; local78++) {
			for (@Pc(95) int local95 = (local17 - 6) / 8; local95 <= (local17 + 6) / 8; local95++) {
				@Pc(112) int local112 = (local78 << 8) + local95;
				Static8.anIntArray449[local72] = local112;
				Static99.anIntArray223[local72] = Static78.aClass83_47.method2322("m" + local78 + "_" + local95);
				Static160.anIntArray336[local72] = Static78.aClass83_47.method2322("l" + local78 + "_" + local95);
				Static210.anIntArray473[local72] = Static78.aClass83_47.method2322("n" + local78 + "_" + local95);
				Static230.anIntArray528[local72] = Static78.aClass83_47.method2322("um" + local78 + "_" + local95);
				Static287.anIntArray603[local72] = Static78.aClass83_47.method2322("ul" + local78 + "_" + local95);
				if (Static210.anIntArray473[local72] == -1) {
					Static99.anIntArray223[local72] = -1;
					Static160.anIntArray336[local72] = -1;
					Static230.anIntArray528[local72] = -1;
					Static287.anIntArray603[local72] = -1;
				}
				local72++;
			}
		}
		for (local78 = local72; local78 < Static210.anIntArray473.length; local78++) {
			Static210.anIntArray473[local78] = -1;
			Static99.anIntArray223[local78] = -1;
			Static160.anIntArray336[local78] = -1;
			Static230.anIntArray528[local78] = -1;
			Static287.anIntArray603[local78] = -1;
		}
		Static32.method666(false, true, 8, 8, local27, 0, local17);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!i;Z)V")
	public static void method328(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) boolean arg1) {
		Static95.aClass131_3.method3799(arg0);
		while (true) {
			@Pc(8) Class1_Sub14 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class1_Sub14[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class1_Sub14 local153;
			@Pc(1332) int local1332;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(44) int var9;
										@Pc(48) int var10;
										@Pc(907) int var17;
										@Pc(916) int var18;
										@Pc(363) Class133 var22;
										@Pc(469) boolean var24;
										@Pc(425) Class152 var25;
										@Pc(1179) Class1_Sub14 var32;
										while (true) {
											do {
												local8 = (Class1_Sub14) Static95.aClass131_3.method3798();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean127);
											local18 = local8.anInt2330;
											local21 = local8.anInt2337;
											local24 = local8.anInt2334;
											local27 = local8.anInt2336;
											local31 = Static132.aClass1_Sub14ArrayArrayArray2[local24];
											@Pc(33) float local33 = 0.0F;
											if (Static296.aBoolean335) {
												if (Static298.anIntArrayArrayArray19 == Static287.anIntArrayArrayArray18) {
													var9 = Static57.anIntArrayArray10[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static129.anInt2875) {
														Static129.anInt2875 = var10;
														Static299.method4854(var10);
														Static201.method3577(Static128.method2181());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static269.anInt5835) {
														Static269.anInt5835 = local65;
														Static108.method1760(local65);
													}
													local115 = Static113.anIntArrayArrayArray10[0][local18][local21] + Static113.anIntArrayArrayArray10[0][local18 + 1][local21] + Static113.anIntArrayArrayArray10[0][local18][local21 + 1] + Static113.anIntArrayArrayArray10[0][local18 + 1][local21 + 1] >> 2;
													Static141.method2524(-local115, 3);
													local33 = 201.5F;
													Static296.method4806(local33);
												} else {
													local33 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static296.method4806(local33);
												}
											}
											if (!local8.aBoolean126) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static132.aClass1_Sub14ArrayArrayArray2[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean127) {
														continue;
													}
												}
												if (local18 <= Static97.anInt6060 && local18 > Static131.anInt2971) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean127 && (local153.aBoolean126 || (local8.anInt2333 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static97.anInt6060 && local18 < Static193.anInt4317 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean127 && (local153.aBoolean126 || (local8.anInt2333 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static16.anInt444 && local21 > Static78.anInt1884) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean127 && (local153.aBoolean126 || (local8.anInt2333 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static16.anInt444 && local21 < Static15.anInt400 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean127 && (local153.aBoolean126 || (local8.anInt2333 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean126 = false;
											if (local8.aClass1_Sub14_1 != null) {
												local153 = local8.aClass1_Sub14_1;
												if (Static296.aBoolean335) {
													Static296.method4806(201.5F - (float) (local153.anInt2336 + 1) * 50.0F);
												}
												if (local153.aClass94_1 == null) {
													if (local153.aClass20_1 != null) {
														if (Static264.method4486(0, local18, local21)) {
															Static289.method4727(local153.aClass20_1, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local18, local21, true);
														} else {
															Static289.method4727(local153.aClass20_1, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local18, local21, false);
														}
													}
												} else if (Static264.method4486(0, local18, local21)) {
													Static227.method3946(local153.aClass94_1, 0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local18, local21, true);
												} else {
													Static227.method3946(local153.aClass94_1, 0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local18, local21, false);
												}
												var22 = local153.aClass133_1;
												if (var22 != null) {
													if (Static296.aBoolean335) {
														if ((var22.anInt4872 & local8.anInt2329) == 0) {
															Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
														} else {
															Static67.method1294(var22.anInt4872, Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local27, local18, local21);
														}
													}
													var22.aClass25_4.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, var22.anInt4873 - Static292.anInt6173, var22.anInt4877 - Static114.anInt2499, var22.anInt4882 - Static197.anInt4472, var22.aLong160, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt2332; local65++) {
													var25 = local153.aClass152Array1[local65];
													if (var25 != null) {
														if (Static296.aBoolean335) {
															Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
														}
														var25.aClass25_6.method4768(var25.anInt5511, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, var25.anInt5526 - Static292.anInt6173, var25.anInt5516 - Static114.anInt2499, var25.anInt5522 - Static197.anInt4472, var25.aLong181, local24, null);
													}
												}
												if (Static296.aBoolean335) {
													Static296.method4806(local33);
												}
											}
											var24 = false;
											if (local8.aClass94_1 == null) {
												if (local8.aClass20_1 != null) {
													if (Static264.method4486(local27, local18, local21)) {
														Static289.method4727(local8.aClass20_1, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local18, local21, true);
													} else {
														var24 = true;
														Static289.method4727(local8.aClass20_1, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local18, local21, false);
													}
												}
											} else if (Static264.method4486(local27, local18, local21)) {
												Static227.method3946(local8.aClass94_1, local27, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local18, local21, true);
											} else {
												var24 = true;
												if (local8.aClass94_1.anInt3553 != 12345678 || Static292.aBoolean328 && local24 <= Static148.anInt3506) {
													Static227.method3946(local8.aClass94_1, local27, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local18, local21, false);
												}
											}
											if (var24) {
												@Pc(549) Class162 local549 = local8.aClass162_1;
												if (local549 != null && (local549.aLong192 & 0x80000000L) != 0L) {
													if (Static296.aBoolean335 && local549.aBoolean309) {
														Static296.method4806(local33 + 50.0F - 1.5F);
													}
													if (Static296.aBoolean335) {
														Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
													}
													local549.aClass25_7.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local549.anInt5858 - Static292.anInt6173, local549.anInt5850 - Static114.anInt2499, local549.anInt5856 - Static197.anInt4472, local549.aLong192, local24, null);
													if (Static296.aBoolean335 && local549.aBoolean309) {
														Static296.method4806(local33);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class133 local616 = local8.aClass133_1;
											@Pc(619) Class101 local619 = local8.aClass101_1;
											if (local616 != null || local619 != null) {
												if (Static97.anInt6060 == local18) {
													var10++;
												} else if (Static97.anInt6060 < local18) {
													var10 += 2;
												}
												if (Static16.anInt444 == local21) {
													var10 += 3;
												} else if (Static16.anInt444 > local21) {
													var10 += 6;
												}
												local65 = Static265.anIntArray573[var10];
												local8.anInt2329 = Static33.anIntArray96[var10];
											}
											if (local616 != null) {
												if ((local616.anInt4872 & Static235.anIntArray533[var10]) == 0) {
													local8.anInt2335 = 0;
												} else if (local616.anInt4872 == 16) {
													local8.anInt2335 = 3;
													local8.anInt2327 = Static45.anIntArray136[var10];
													local8.anInt2328 = 3 - local8.anInt2327;
												} else if (local616.anInt4872 == 32) {
													local8.anInt2335 = 6;
													local8.anInt2327 = Static66.anIntArray334[var10];
													local8.anInt2328 = 6 - local8.anInt2327;
												} else if (local616.anInt4872 == 64) {
													local8.anInt2335 = 12;
													local8.anInt2327 = Static215.anIntArray479[var10];
													local8.anInt2328 = 12 - local8.anInt2327;
												} else {
													local8.anInt2335 = 9;
													local8.anInt2327 = Static191.anIntArray383[var10];
													local8.anInt2328 = 9 - local8.anInt2327;
												}
												if ((local616.anInt4872 & local65) != 0 && !Static175.method3218(local27, local18, local21, local616.anInt4872)) {
													if (Static296.aBoolean335) {
														Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
													}
													local616.aClass25_4.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local616.anInt4873 - Static292.anInt6173, local616.anInt4877 - Static114.anInt2499, local616.anInt4882 - Static197.anInt4472, local616.aLong160, local24, null);
												}
												if ((local616.anInt4874 & local65) != 0 && !Static175.method3218(local27, local18, local21, local616.anInt4874)) {
													if (Static296.aBoolean335) {
														Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
													}
													local616.aClass25_5.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local616.anInt4873 - Static292.anInt6173, local616.anInt4877 - Static114.anInt2499, local616.anInt4882 - Static197.anInt4472, local616.aLong160, local24, null);
												}
											}
											if (local619 != null && !Static76.method4256(local27, local18, local21, local619.aClass25_3.method4773())) {
												if (Static296.aBoolean335) {
													Static296.method4806(local33 - 0.5F);
												}
												if ((local619.anInt3745 & local65) != 0) {
													if (Static296.aBoolean335) {
														Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
													}
													local619.aClass25_3.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local619.anInt3754 + local619.anInt3748 - Static292.anInt6173, local619.anInt3755 - Static114.anInt2499, local619.anInt3746 + local619.anInt3753 - Static197.anInt4472, local619.aLong131, local24, null);
												} else if (local619.anInt3745 == 256) {
													local894 = local619.anInt3754 - Static292.anInt6173;
													local899 = local619.anInt3755 - Static114.anInt2499;
													local904 = local619.anInt3746 - Static197.anInt4472;
													var17 = local619.anInt3752;
													if (var17 == 1 || var17 == 2) {
														var18 = -local894;
													} else {
														var18 = local894;
													}
													@Pc(928) int local928;
													if (var17 == 2 || var17 == 3) {
														local928 = -local904;
													} else {
														local928 = local904;
													}
													if (local928 < var18) {
														if (Static296.aBoolean335) {
															Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
														}
														local619.aClass25_3.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local894 + local619.anInt3748, local899, local904 + local619.anInt3753, local619.aLong131, local24, null);
													} else if (local619.aClass25_2 != null) {
														if (Static296.aBoolean335) {
															Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
														}
														local619.aClass25_2.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local894, local899, local904, local619.aLong131, local24, null);
													}
												}
												if (Static296.aBoolean335) {
													Static296.method4806(local33);
												}
											}
											if (var24) {
												@Pc(1001) Class162 local1001 = local8.aClass162_1;
												if (local1001 != null && (local1001.aLong192 & 0x80000000L) == 0L) {
													if (Static296.aBoolean335 && local1001.aBoolean309) {
														Static296.method4806(local33 + 50.0F - 1.5F);
													}
													if (Static296.aBoolean335) {
														Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
													}
													local1001.aClass25_7.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local1001.anInt5858 - Static292.anInt6173, local1001.anInt5850 - Static114.anInt2499, local1001.anInt5856 - Static197.anInt4472, local1001.aLong192, local24, null);
													if (Static296.aBoolean335 && local1001.aBoolean309) {
														Static296.method4806(local33);
													}
												}
												@Pc(1064) Class168 local1064 = local8.aClass168_1;
												if (local1064 != null && local1064.anInt6021 == 0) {
													if (Static296.aBoolean335) {
														Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
													}
													if (local1064.aClass25_10 != null) {
														local1064.aClass25_10.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local1064.anInt6024 - Static292.anInt6173, local1064.anInt6022 - Static114.anInt2499, local1064.anInt6025 - Static197.anInt4472, local1064.aLong199, local24, null);
													}
													if (local1064.aClass25_8 != null) {
														local1064.aClass25_8.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local1064.anInt6024 - Static292.anInt6173, local1064.anInt6022 - Static114.anInt2499, local1064.anInt6025 - Static197.anInt4472, local1064.aLong199, local24, null);
													}
													if (local1064.aClass25_9 != null) {
														local1064.aClass25_9.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local1064.anInt6024 - Static292.anInt6173, local1064.anInt6022 - Static114.anInt2499, local1064.anInt6025 - Static197.anInt4472, local1064.aLong199, local24, null);
													}
												}
											}
											local894 = local8.anInt2333;
											if (local894 != 0) {
												if (local18 < Static97.anInt6060 && (local894 & 0x4) != 0) {
													var32 = local31[local18 + 1][local21];
													if (var32 != null && var32.aBoolean127) {
														Static95.aClass131_3.method3799(var32);
													}
												}
												if (local21 < Static16.anInt444 && (local894 & 0x2) != 0) {
													var32 = local31[local18][local21 + 1];
													if (var32 != null && var32.aBoolean127) {
														Static95.aClass131_3.method3799(var32);
													}
												}
												if (local18 > Static97.anInt6060 && (local894 & 0x1) != 0) {
													var32 = local31[local18 - 1][local21];
													if (var32 != null && var32.aBoolean127) {
														Static95.aClass131_3.method3799(var32);
													}
												}
												if (local21 > Static16.anInt444 && (local894 & 0x8) != 0) {
													var32 = local31[local18][local21 - 1];
													if (var32 != null && var32.aBoolean127) {
														Static95.aClass131_3.method3799(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt2335 != 0) {
											var24 = true;
											for (var10 = 0; var10 < local8.anInt2332; var10++) {
												if (local8.aClass152Array1[var10].anInt5517 != Static219.anInt4904 && (local8.anIntArray234[var10] & local8.anInt2335) == local8.anInt2327) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												var22 = local8.aClass133_1;
												if (!Static175.method3218(local27, local18, local21, var22.anInt4872)) {
													if (Static296.aBoolean335) {
														label882: {
															if ((var22.aLong160 & 0xFC000L) == 16384L) {
																local65 = var22.anInt4873 - Static292.anInt6173;
																local115 = var22.anInt4882 - Static197.anInt4472;
																local1332 = (int) (var22.aLong160 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static293.anInt6189 - 1) {
																		Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18 - 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static212.anInt4717 - 1 && local21 < Static293.anInt6189 - 1) {
																		Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18 + 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static212.anInt4717 - 1 && local21 > 0) {
																		Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18 + 1, local21 - 1);
																		break label882;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18 - 1, local21 - 1);
																		break label882;
																	}
																}
															}
															Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
														}
													}
													var22.aClass25_4.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, var22.anInt4873 - Static292.anInt6173, var22.anInt4877 - Static114.anInt2499, var22.anInt4882 - Static197.anInt4472, var22.aLong160, local24, null);
												}
												local8.anInt2335 = 0;
											}
										}
										if (!local8.aBoolean125) {
											break;
										}
										try {
											var9 = local8.anInt2332;
											local8.aBoolean125 = false;
											var10 = 0;
											label767: for (local65 = 0; local65 < var9; local65++) {
												var25 = local8.aClass152Array1[local65];
												if (var25.anInt5517 != Static219.anInt4904) {
													for (local1332 = var25.anInt5509; local1332 <= var25.anInt5510; local1332++) {
														for (local894 = var25.anInt5519; local894 <= var25.anInt5512; local894++) {
															var32 = local31[local1332][local894];
															if (var32.aBoolean126) {
																local8.aBoolean125 = true;
																continue label767;
															}
															if (var32.anInt2335 != 0) {
																local904 = 0;
																if (local1332 > var25.anInt5509) {
																	local904++;
																}
																if (local1332 < var25.anInt5510) {
																	local904 += 4;
																}
																if (local894 > var25.anInt5519) {
																	local904 += 8;
																}
																if (local894 < var25.anInt5512) {
																	local904 += 2;
																}
																if ((local904 & var32.anInt2335) == local8.anInt2328) {
																	local8.aBoolean125 = true;
																	continue label767;
																}
															}
														}
													}
													Static164.aClass152Array2[var10++] = var25;
													local1332 = Static97.anInt6060 - var25.anInt5509;
													local894 = var25.anInt5510 - Static97.anInt6060;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static16.anInt444 - var25.anInt5519;
													local904 = var25.anInt5512 - Static16.anInt444;
													if (local904 > local899) {
														var25.anInt5527 = local1332 + local904;
													} else {
														var25.anInt5527 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class152 local1628 = Static164.aClass152Array2[local1332];
													if (local1628.anInt5517 != Static219.anInt4904) {
														if (local1628.anInt5527 > local65) {
															local65 = local1628.anInt5527;
															local115 = local1332;
														} else if (local1628.anInt5527 == local65) {
															local899 = local1628.anInt5526 - Static292.anInt6173;
															local904 = local1628.anInt5522 - Static197.anInt4472;
															var17 = Static164.aClass152Array2[local115].anInt5526 - Static292.anInt6173;
															var18 = Static164.aClass152Array2[local115].anInt5522 - Static197.anInt4472;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class152 local1697 = Static164.aClass152Array2[local115];
												local1697.anInt5517 = Static219.anInt4904;
												if (!Static182.method3507(local27, local1697.anInt5509, local1697.anInt5510, local1697.anInt5519, local1697.anInt5512, local1697.aClass25_6.method4773())) {
													if (Static296.aBoolean335) {
														if ((local1697.aLong181 & 0xFC000L) == 147456L) {
															Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
															local894 = local1697.anInt5526 - Static292.anInt6173;
															local899 = local1697.anInt5522 - Static197.anInt4472;
															local904 = (int) (local1697.aLong181 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static67.method1292(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static67.method1292(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static67.method1292(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static67.method1292(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static67.method1281(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local1697.anInt5509, local1697.anInt5519, local1697.anInt5510, local1697.anInt5512);
														}
													}
													local1697.aClass25_6.method4768(local1697.anInt5511, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local1697.anInt5526 - Static292.anInt6173, local1697.anInt5516 - Static114.anInt2499, local1697.anInt5522 - Static197.anInt4472, local1697.aLong181, local24, null);
												}
												for (local894 = local1697.anInt5509; local894 <= local1697.anInt5510; local894++) {
													for (local899 = local1697.anInt5519; local899 <= local1697.anInt5512; local899++) {
														@Pc(1863) Class1_Sub14 local1863 = local31[local894][local899];
														if (local1863.anInt2335 != 0) {
															Static95.aClass131_3.method3799(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean127) {
															Static95.aClass131_3.method3799(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean125) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean125 = false;
											break;
										}
									}
								} while (!local8.aBoolean127);
							} while (local8.anInt2335 != 0);
							if (local18 > Static97.anInt6060 || local18 <= Static131.anInt2971) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean127);
						if (local18 < Static97.anInt6060 || local18 >= Static193.anInt4317 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean127);
					if (local21 > Static16.anInt444 || local21 <= Static78.anInt1884) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean127);
				if (local21 < Static16.anInt444 || local21 >= Static15.anInt400 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean127);
			local8.aBoolean127 = false;
			Static126.anInt2812--;
			@Pc(1999) Class168 local1999 = local8.aClass168_1;
			if (local1999 != null && local1999.anInt6021 != 0) {
				if (Static296.aBoolean335) {
					Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
				}
				if (local1999.aClass25_10 != null) {
					local1999.aClass25_10.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local1999.anInt6024 - Static292.anInt6173, local1999.anInt6022 - Static114.anInt2499 - local1999.anInt6021, local1999.anInt6025 - Static197.anInt4472, local1999.aLong199, local24, null);
				}
				if (local1999.aClass25_8 != null) {
					local1999.aClass25_8.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local1999.anInt6024 - Static292.anInt6173, local1999.anInt6022 - Static114.anInt2499 - local1999.anInt6021, local1999.anInt6025 - Static197.anInt4472, local1999.aLong199, local24, null);
				}
				if (local1999.aClass25_9 != null) {
					local1999.aClass25_9.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local1999.anInt6024 - Static292.anInt6173, local1999.anInt6022 - Static114.anInt2499 - local1999.anInt6021, local1999.anInt6025 - Static197.anInt4472, local1999.aLong199, local24, null);
				}
			}
			if (local8.anInt2329 != 0) {
				@Pc(2109) Class101 local2109 = local8.aClass101_1;
				if (local2109 != null && !Static76.method4256(local27, local18, local21, local2109.aClass25_3.method4773())) {
					if ((local2109.anInt3745 & local8.anInt2329) != 0) {
						if (Static296.aBoolean335) {
							Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
						}
						local2109.aClass25_3.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local2109.anInt3754 + local2109.anInt3748 - Static292.anInt6173, local2109.anInt3755 - Static114.anInt2499, local2109.anInt3746 + local2109.anInt3753 - Static197.anInt4472, local2109.aLong131, local24, null);
					} else if (local2109.anInt3745 == 256) {
						local65 = local2109.anInt3754 - Static292.anInt6173;
						local115 = local2109.anInt3755 - Static114.anInt2499;
						local1332 = local2109.anInt3746 - Static197.anInt4472;
						local894 = local2109.anInt3752;
						if (local894 == 1 || local894 == 2) {
							local899 = -local65;
						} else {
							local899 = local65;
						}
						if (local894 == 2 || local894 == 3) {
							local904 = -local1332;
						} else {
							local904 = local1332;
						}
						if (local904 >= local899) {
							if (Static296.aBoolean335) {
								Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
							}
							local2109.aClass25_3.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local65 + local2109.anInt3748, local115, local1332 + local2109.anInt3753, local2109.aLong131, local24, null);
						} else if (local2109.aClass25_2 != null) {
							if (Static296.aBoolean335) {
								Static67.method1288(Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local24, local18, local21);
							}
							local2109.aClass25_2.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local65, local115, local1332, local2109.aLong131, local24, null);
						}
					}
				}
				@Pc(2275) Class133 local2275 = local8.aClass133_1;
				if (local2275 != null) {
					if ((local2275.anInt4874 & local8.anInt2329) != 0 && !Static175.method3218(local27, local18, local21, local2275.anInt4874)) {
						if (Static296.aBoolean335) {
							Static67.method1294(local2275.anInt4874, Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local27, local18, local21);
						}
						local2275.aClass25_5.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local2275.anInt4873 - Static292.anInt6173, local2275.anInt4877 - Static114.anInt2499, local2275.anInt4882 - Static197.anInt4472, local2275.aLong160, local24, null);
					}
					if ((local2275.anInt4872 & local8.anInt2329) != 0 && !Static175.method3218(local27, local18, local21, local2275.anInt4872)) {
						if (Static296.aBoolean335) {
							Static67.method1294(local2275.anInt4872, Static292.anInt6173, Static114.anInt2499, Static197.anInt4472, local27, local18, local21);
						}
						local2275.aClass25_4.method4768(0, Static125.anInt2794, Static145.anInt3480, Static132.anInt2996, Static2.anInt5658, local2275.anInt4873 - Static292.anInt6173, local2275.anInt4877 - Static114.anInt2499, local2275.anInt4882 - Static197.anInt4472, local2275.aLong160, local24, null);
					}
				}
			}
			@Pc(2388) Class1_Sub14 local2388;
			if (local24 < Static156.anInt3577 - 1) {
				local2388 = Static132.aClass1_Sub14ArrayArrayArray2[local24 + 1][local18][local21];
				if (local2388 != null && local2388.aBoolean127) {
					Static95.aClass131_3.method3799(local2388);
				}
			}
			if (local18 < Static97.anInt6060) {
				local2388 = local31[local18 + 1][local21];
				if (local2388 != null && local2388.aBoolean127) {
					Static95.aClass131_3.method3799(local2388);
				}
			}
			if (local21 < Static16.anInt444) {
				local2388 = local31[local18][local21 + 1];
				if (local2388 != null && local2388.aBoolean127) {
					Static95.aClass131_3.method3799(local2388);
				}
			}
			if (local18 > Static97.anInt6060) {
				local2388 = local31[local18 - 1][local21];
				if (local2388 != null && local2388.aBoolean127) {
					Static95.aClass131_3.method3799(local2388);
				}
			}
			if (local21 > Static16.anInt444) {
				local2388 = local31[local18][local21 - 1];
				if (local2388 != null && local2388.aBoolean127) {
					Static95.aClass131_3.method3799(local2388);
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
	public static void method331() {
		Static144.aClass155_28.method4354();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIB)Lclient!ha;")
	public static Class1_Sub2_Sub9 method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(10) Class1_Sub2_Sub9 local10 = (Class1_Sub2_Sub9) Static146.aClass117_11.method3441(); local10 != null; local10 = (Class1_Sub2_Sub9) Static146.aClass117_11.method3444()) {
			if (local10.aBoolean116 && local10.method1639(arg0, arg1)) {
				return local10;
			}
		}
		return null;
	}
}
