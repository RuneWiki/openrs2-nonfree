import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public static int anInt1220;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "[I")
	public static int[] anIntArray155 = new int[25];

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public static void method1029() {
		if (Static114.aClass15_1 != null) {
			Static114.aClass15_1.method1242();
		}
		if (Static157.aClass15_2 != null) {
			Static157.aClass15_2.method1242();
		}
		Static105.method1739(Static11.aBoolean17);
		Static114.aClass15_1 = Static124.method2031(0, Static142.aClass112_2, 22050, Static108.aCanvas1);
		Static114.aClass15_1.method1246(Static220.aClass1_Sub10_Sub3_3);
		Static157.aClass15_2 = Static124.method2031(1, Static142.aClass112_2, 2048, Static108.aCanvas1);
		Static157.aClass15_2.method1246(Static101.aClass1_Sub10_Sub2_2);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!aa;Z)V")
	public static void method1033(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		Static63.aClass26_12.method668(arg0);
		while (true) {
			@Pc(8) Class1_Sub2 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class1_Sub2[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class1_Sub2 local153;
			@Pc(1332) int local1332;
			do {
				do {
					do {
						do {
							do {
								do {
									@Pc(33) float var8;
									@Pc(44) int var9;
									@Pc(48) int var10;
									@Pc(907) int var17;
									@Pc(916) int var18;
									@Pc(928) int var19;
									while (true) {
										@Pc(363) Class136 var30;
										@Pc(469) boolean var32;
										@Pc(425) Class7 var33;
										@Pc(1179) Class1_Sub2 var39;
										while (true) {
											do {
												local8 = (Class1_Sub2) Static63.aClass26_12.method673();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean5);
											local18 = local8.anInt43;
											local21 = local8.anInt55;
											local24 = local8.anInt47;
											local27 = local8.anInt49;
											local31 = Static7.aClass1_Sub2ArrayArrayArray1[local24];
											var8 = 0.0F;
											if (Static294.aBoolean367) {
												if (Static222.anIntArrayArrayArray12 == Static46.anIntArrayArrayArray1) {
													var9 = Static142.anIntArrayArray40[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static85.anInt1982) {
														Static85.anInt1982 = var10;
														Static115.method1849(var10);
														Static180.method2902(Static111.method1808());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static146.anInt4436) {
														Static146.anInt4436 = local65;
														Static60.method1084(local65);
													}
													local115 = Static299.anIntArrayArrayArray14[0][local18][local21] + Static299.anIntArrayArrayArray14[0][local18 + 1][local21] + Static299.anIntArrayArrayArray14[0][local18][local21 + 1] + Static299.anIntArrayArrayArray14[0][local18 + 1][local21 + 1] >> 2;
													Static1.method4721(-local115, 3);
													var8 = 201.5F;
													Static294.method4511(var8);
												} else {
													var8 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static294.method4511(var8);
												}
											}
											if (!local8.aBoolean4) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static7.aClass1_Sub2ArrayArrayArray1[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean5) {
														continue;
													}
												}
												if (local18 <= Static101.anInt152 && local18 > Static194.anInt4264) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean5 && (local153.aBoolean4 || (local8.anInt54 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static101.anInt152 && local18 < Static235.anInt4964 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean5 && (local153.aBoolean4 || (local8.anInt54 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static245.anInt5022 && local21 > Static151.anInt3397) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean5 && (local153.aBoolean4 || (local8.anInt54 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static245.anInt5022 && local21 < Static163.anInt3564 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean5 && (local153.aBoolean4 || (local8.anInt54 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean4 = false;
											if (local8.aClass1_Sub2_1 != null) {
												local153 = local8.aClass1_Sub2_1;
												if (Static294.aBoolean367) {
													Static294.method4511(201.5F - (float) (local153.anInt49 + 1) * 50.0F);
												}
												if (local153.aClass163_1 == null) {
													if (local153.aClass73_1 != null) {
														if (Static90.method1546(0, local18, local21)) {
															Static14.method355(local153.aClass73_1, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local18, local21, true);
														} else {
															Static14.method355(local153.aClass73_1, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local18, local21, false);
														}
													}
												} else if (Static90.method1546(0, local18, local21)) {
													Static83.method1430(local153.aClass163_1, 0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local18, local21, true);
												} else {
													Static83.method1430(local153.aClass163_1, 0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local18, local21, false);
												}
												var30 = local153.aClass136_1;
												if (var30 != null) {
													if (Static294.aBoolean367) {
														if ((var30.anInt4700 & local8.anInt46) == 0) {
															Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
														} else {
															Static191.method3088(var30.anInt4700, Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local27, local18, local21);
														}
													}
													var30.aClass2_10.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, var30.anInt4699 - Static215.anInt4665, var30.anInt4701 - Static296.anInt5905, var30.anInt4697 - Static2.anInt53, var30.aLong182, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt45; local65++) {
													var33 = local153.aClass7Array1[local65];
													if (var33 != null) {
														if (Static294.aBoolean367) {
															Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
														}
														var33.aClass2_1.method3951(var33.anInt223, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, var33.anInt217 - Static215.anInt4665, var33.anInt216 - Static296.anInt5905, var33.anInt219 - Static2.anInt53, var33.aLong7, local24, null);
													}
												}
												if (Static294.aBoolean367) {
													Static294.method4511(var8);
												}
											}
											var32 = false;
											if (local8.aClass163_1 == null) {
												if (local8.aClass73_1 != null) {
													if (Static90.method1546(local27, local18, local21)) {
														Static14.method355(local8.aClass73_1, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local18, local21, true);
													} else {
														var32 = true;
														Static14.method355(local8.aClass73_1, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local18, local21, false);
													}
												}
											} else if (Static90.method1546(local27, local18, local21)) {
												Static83.method1430(local8.aClass163_1, local27, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local18, local21, true);
											} else {
												var32 = true;
												if (local8.aClass163_1.anInt5298 != 12345678 || Static161.aBoolean231 && local24 <= Static25.anInt693) {
													Static83.method1430(local8.aClass163_1, local27, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local18, local21, false);
												}
											}
											if (var32) {
												@Pc(549) Class119 local549 = local8.aClass119_1;
												if (local549 != null && (local549.aLong154 & 0x80000000L) != 0L) {
													if (Static294.aBoolean367 && local549.aBoolean263) {
														Static294.method4511(var8 + 50.0F - 1.5F);
													}
													if (Static294.aBoolean367) {
														Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
													}
													local549.aClass2_7.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local549.anInt4258 - Static215.anInt4665, local549.anInt4260 - Static296.anInt5905, local549.anInt4261 - Static2.anInt53, local549.aLong154, local24, null);
													if (Static294.aBoolean367 && local549.aBoolean263) {
														Static294.method4511(var8);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class136 local616 = local8.aClass136_1;
											@Pc(619) Class106 local619 = local8.aClass106_1;
											if (local616 != null || local619 != null) {
												if (Static101.anInt152 == local18) {
													var10++;
												} else if (Static101.anInt152 < local18) {
													var10 += 2;
												}
												if (Static245.anInt5022 == local21) {
													var10 += 3;
												} else if (Static245.anInt5022 > local21) {
													var10 += 6;
												}
												local65 = Static134.anIntArray291[var10];
												local8.anInt46 = Static263.anIntArray479[var10];
											}
											if (local616 != null) {
												if ((local616.anInt4700 & Static305.anIntArray535[var10]) == 0) {
													local8.anInt50 = 0;
												} else if (local616.anInt4700 == 16) {
													local8.anInt50 = 3;
													local8.anInt48 = Static165.anIntArray330[var10];
													local8.anInt42 = 3 - local8.anInt48;
												} else if (local616.anInt4700 == 32) {
													local8.anInt50 = 6;
													local8.anInt48 = Static293.anIntArray529[var10];
													local8.anInt42 = 6 - local8.anInt48;
												} else if (local616.anInt4700 == 64) {
													local8.anInt50 = 12;
													local8.anInt48 = Static298.anIntArray531[var10];
													local8.anInt42 = 12 - local8.anInt48;
												} else {
													local8.anInt50 = 9;
													local8.anInt48 = Static300.anIntArray532[var10];
													local8.anInt42 = 9 - local8.anInt48;
												}
												if ((local616.anInt4700 & local65) != 0 && !Static103.method1722(local27, local18, local21, local616.anInt4700)) {
													if (Static294.aBoolean367) {
														Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
													}
													local616.aClass2_10.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local616.anInt4699 - Static215.anInt4665, local616.anInt4701 - Static296.anInt5905, local616.anInt4697 - Static2.anInt53, local616.aLong182, local24, null);
												}
												if ((local616.anInt4694 & local65) != 0 && !Static103.method1722(local27, local18, local21, local616.anInt4694)) {
													if (Static294.aBoolean367) {
														Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
													}
													local616.aClass2_9.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local616.anInt4699 - Static215.anInt4665, local616.anInt4701 - Static296.anInt5905, local616.anInt4697 - Static2.anInt53, local616.aLong182, local24, null);
												}
											}
											if (local619 != null && !Static147.method2382(local27, local18, local21, local619.aClass2_5.method3948())) {
												if (Static294.aBoolean367) {
													Static294.method4511(var8 - 0.5F);
												}
												if ((local619.anInt3764 & local65) != 0) {
													if (Static294.aBoolean367) {
														Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
													}
													local619.aClass2_5.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local619.anInt3756 + local619.anInt3751 - Static215.anInt4665, local619.anInt3752 - Static296.anInt5905, local619.anInt3753 + local619.anInt3757 - Static2.anInt53, local619.aLong131, local24, null);
												} else if (local619.anInt3764 == 256) {
													local894 = local619.anInt3756 - Static215.anInt4665;
													local899 = local619.anInt3752 - Static296.anInt5905;
													local904 = local619.anInt3753 - Static2.anInt53;
													var17 = local619.anInt3755;
													if (var17 == 1 || var17 == 2) {
														var18 = -local894;
													} else {
														var18 = local894;
													}
													if (var17 == 2 || var17 == 3) {
														var19 = -local904;
													} else {
														var19 = local904;
													}
													if (var19 < var18) {
														if (Static294.aBoolean367) {
															Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
														}
														local619.aClass2_5.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local894 + local619.anInt3751, local899, local904 + local619.anInt3757, local619.aLong131, local24, null);
													} else if (local619.aClass2_6 != null) {
														if (Static294.aBoolean367) {
															Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
														}
														local619.aClass2_6.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local894, local899, local904, local619.aLong131, local24, null);
													}
												}
												if (Static294.aBoolean367) {
													Static294.method4511(var8);
												}
											}
											if (var32) {
												@Pc(1001) Class119 local1001 = local8.aClass119_1;
												if (local1001 != null && (local1001.aLong154 & 0x80000000L) == 0L) {
													if (Static294.aBoolean367 && local1001.aBoolean263) {
														Static294.method4511(var8 + 50.0F - 1.5F);
													}
													if (Static294.aBoolean367) {
														Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
													}
													local1001.aClass2_7.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local1001.anInt4258 - Static215.anInt4665, local1001.anInt4260 - Static296.anInt5905, local1001.anInt4261 - Static2.anInt53, local1001.aLong154, local24, null);
													if (Static294.aBoolean367 && local1001.aBoolean263) {
														Static294.method4511(var8);
													}
												}
												@Pc(1064) Class10 local1064 = local8.aClass10_1;
												if (local1064 != null && local1064.anInt302 == 0) {
													if (Static294.aBoolean367) {
														Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
													}
													if (local1064.aClass2_3 != null) {
														local1064.aClass2_3.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local1064.anInt305 - Static215.anInt4665, local1064.anInt301 - Static296.anInt5905, local1064.anInt303 - Static2.anInt53, local1064.aLong9, local24, null);
													}
													if (local1064.aClass2_4 != null) {
														local1064.aClass2_4.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local1064.anInt305 - Static215.anInt4665, local1064.anInt301 - Static296.anInt5905, local1064.anInt303 - Static2.anInt53, local1064.aLong9, local24, null);
													}
													if (local1064.aClass2_2 != null) {
														local1064.aClass2_2.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local1064.anInt305 - Static215.anInt4665, local1064.anInt301 - Static296.anInt5905, local1064.anInt303 - Static2.anInt53, local1064.aLong9, local24, null);
													}
												}
											}
											local894 = local8.anInt54;
											if (local894 != 0) {
												if (local18 < Static101.anInt152 && (local894 & 0x4) != 0) {
													var39 = local31[local18 + 1][local21];
													if (var39 != null && var39.aBoolean5) {
														Static63.aClass26_12.method668(var39);
													}
												}
												if (local21 < Static245.anInt5022 && (local894 & 0x2) != 0) {
													var39 = local31[local18][local21 + 1];
													if (var39 != null && var39.aBoolean5) {
														Static63.aClass26_12.method668(var39);
													}
												}
												if (local18 > Static101.anInt152 && (local894 & 0x1) != 0) {
													var39 = local31[local18 - 1][local21];
													if (var39 != null && var39.aBoolean5) {
														Static63.aClass26_12.method668(var39);
													}
												}
												if (local21 > Static245.anInt5022 && (local894 & 0x8) != 0) {
													var39 = local31[local18][local21 - 1];
													if (var39 != null && var39.aBoolean5) {
														Static63.aClass26_12.method668(var39);
													}
												}
											}
											break;
										}
										if (local8.anInt50 != 0) {
											var32 = true;
											for (var10 = 0; var10 < local8.anInt45; var10++) {
												if (local8.aClass7Array1[var10].anInt221 != Static108.anInt2392 && (local8.anIntArray2[var10] & local8.anInt50) == local8.anInt48) {
													var32 = false;
													break;
												}
											}
											if (var32) {
												var30 = local8.aClass136_1;
												if (!Static103.method1722(local27, local18, local21, var30.anInt4700)) {
													if (Static294.aBoolean367) {
														label1037: {
															if ((var30.aLong182 & 0xFC000L) == 16384L) {
																local65 = var30.anInt4699 - Static215.anInt4665;
																local115 = var30.anInt4697 - Static2.anInt53;
																local1332 = (int) (var30.aLong182 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static77.anInt1766 - 1) {
																		Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18 - 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static90.anInt2091 - 1 && local21 < Static77.anInt1766 - 1) {
																		Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18 + 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static90.anInt2091 - 1 && local21 > 0) {
																		Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18 + 1, local21 - 1);
																		break label1037;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18 - 1, local21 - 1);
																		break label1037;
																	}
																}
															}
															Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
														}
													}
													var30.aClass2_10.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, var30.anInt4699 - Static215.anInt4665, var30.anInt4701 - Static296.anInt5905, var30.anInt4697 - Static2.anInt53, var30.aLong182, local24, null);
												}
												local8.anInt50 = 0;
											}
										}
										if (!local8.aBoolean3) {
											break;
										}
										try {
											var9 = local8.anInt45;
											local8.aBoolean3 = false;
											var10 = 0;
											label844: for (local65 = 0; local65 < var9; local65++) {
												var33 = local8.aClass7Array1[local65];
												if (var33.anInt221 != Static108.anInt2392) {
													for (local1332 = var33.anInt214; local1332 <= var33.anInt218; local1332++) {
														for (local894 = var33.anInt220; local894 <= var33.anInt212; local894++) {
															var39 = local31[local1332][local894];
															if (var39.aBoolean4) {
																local8.aBoolean3 = true;
																continue label844;
															}
															if (var39.anInt50 != 0) {
																local904 = 0;
																if (local1332 > var33.anInt214) {
																	local904++;
																}
																if (local1332 < var33.anInt218) {
																	local904 += 4;
																}
																if (local894 > var33.anInt220) {
																	local904 += 8;
																}
																if (local894 < var33.anInt212) {
																	local904 += 2;
																}
																if ((local904 & var39.anInt50) == local8.anInt42) {
																	local8.aBoolean3 = true;
																	continue label844;
																}
															}
														}
													}
													Static29.aClass7Array2[var10++] = var33;
													local1332 = Static101.anInt152 - var33.anInt214;
													local894 = var33.anInt218 - Static101.anInt152;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static245.anInt5022 - var33.anInt220;
													local904 = var33.anInt212 - Static245.anInt5022;
													if (local904 > local899) {
														var33.anInt215 = local1332 + local904;
													} else {
														var33.anInt215 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class7 local1628 = Static29.aClass7Array2[local1332];
													if (local1628.anInt221 != Static108.anInt2392) {
														if (local1628.anInt215 > local65) {
															local65 = local1628.anInt215;
															local115 = local1332;
														} else if (local1628.anInt215 == local65) {
															local899 = local1628.anInt217 - Static215.anInt4665;
															local904 = local1628.anInt219 - Static2.anInt53;
															var17 = Static29.aClass7Array2[local115].anInt217 - Static215.anInt4665;
															var18 = Static29.aClass7Array2[local115].anInt219 - Static2.anInt53;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class7 local1697 = Static29.aClass7Array2[local115];
												local1697.anInt221 = Static108.anInt2392;
												if (!Static178.method2874(local27, local1697.anInt214, local1697.anInt218, local1697.anInt220, local1697.anInt212, local1697.aClass2_1.method3948())) {
													if (Static294.aBoolean367) {
														if ((local1697.aLong7 & 0xFC000L) == 147456L) {
															Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
															local894 = local1697.anInt217 - Static215.anInt4665;
															local899 = local1697.anInt219 - Static2.anInt53;
															local904 = (int) (local1697.aLong7 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static191.method3092(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static191.method3092(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static191.method3092(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static191.method3092(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static191.method3083(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local1697.anInt214, local1697.anInt220, local1697.anInt218, local1697.anInt212);
														}
													}
													local1697.aClass2_1.method3951(local1697.anInt223, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local1697.anInt217 - Static215.anInt4665, local1697.anInt216 - Static296.anInt5905, local1697.anInt219 - Static2.anInt53, local1697.aLong7, local24, null);
												}
												for (local894 = local1697.anInt214; local894 <= local1697.anInt218; local894++) {
													for (local899 = local1697.anInt220; local899 <= local1697.anInt212; local899++) {
														@Pc(1863) Class1_Sub2 local1863 = local31[local894][local899];
														if (local1863.anInt50 != 0) {
															Static63.aClass26_12.method668(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean5) {
															Static63.aClass26_12.method668(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean3) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean3 = false;
											break;
										}
									}
									if (local8.aClass179_1 != null) {
										if (Static294.aBoolean367) {
											@Pc(1905) GL local1905 = Static294.aGL1;
											Static294.method4511(var8);
											Static42.method866(Static215.anInt4665, Static296.anInt5905, Static2.anInt53);
											var10 = local8.anInt43 * 128 + 64 - Static215.anInt4665;
											local65 = Static46.anIntArrayArrayArray1[local24][local8.anInt43][local8.anInt55] - Static296.anInt5905;
											local115 = local8.anInt55 * 128 + 64 - Static2.anInt53;
											if (local24 < 3) {
												local1332 = Static46.anIntArrayArrayArray1[local24][local8.anInt43][local8.anInt55] - Static46.anIntArrayArrayArray1[local24 + 1][local8.anInt43][local8.anInt55];
											} else {
												local1332 = 1024;
											}
											local894 = local115 * Static58.anInt1267 - var10 * Static37.anInt930 >> 16;
											local899 = local65 * Static79.anInt1828 + local894 * Static282.anInt5661 >> 16;
											local904 = local899 + (Static282.anInt5661 * 91 + Static79.anInt1828 * 0 >> 16);
											var17 = local899 + (Static282.anInt5661 * -91 - local1332 * Static79.anInt1828 >> 16);
											if (var17 < local904 - 1597) {
												var17 = local904 - 1597;
											}
											var18 = local904 + 2 - var17;
											@Pc(2030) Class34_Sub2_Sub1 local2030 = null;
											@Pc(2032) Class34_Sub3 local2032 = null;
											@Pc(2034) int local2034 = -1;
											@Pc(2040) Class34_Sub2_Sub1 local2040 = (Class34_Sub2_Sub1) local8.aClass179_1.method4440();
											while (true) {
												label1054: {
													if (local2040 != null) {
														if (local2040.aClass34_Sub3_1 == null || local2040.aClass34_Sub3_1.aClass34_Sub1_7.aBoolean73) {
															local2040.method4182();
															break label1054;
														}
														if ((byte) (local2040.aClass34_Sub3_1.aClass34_Sub1_7.aLong41 & 0xFFL) != local8.aByte1) {
															local8.aClass179_1 = null;
															break;
														}
														if (local2030 == null) {
															local2030 = local2040;
															local2032 = local2040.aClass34_Sub3_1;
															local2034 = local2032.aClass18_2.anInt479;
															break label1054;
														}
													}
													if (local2030 != null && (local2040 == null || local2040.aClass34_Sub3_1 != local2032 || local2040.aClass34_Sub3_1.aClass18_2.anInt479 != local2034)) {
														@Pc(2097) int local2097;
														for (local2097 = 0; local2097 < var18; local2097++) {
															Static42.anIntArray128[local2097] = 0;
														}
														for (local2097 = 0; local2097 < 32; local2097++) {
															Static42.anIntArray129[local2097] = 0;
														}
														Static42.anInt1056 = 0;
														for (@Pc(2121) Class34_Sub2_Sub1 local2121 = local2030; local2121 != local2040; local2121 = (Class34_Sub2_Sub1) local2121.aClass34_Sub2_4) {
															if (local2121.aClass34_Sub3_1 != null) {
																@Pc(2134) int local2134 = (local2121.anInt2120 >> 12) - Static215.anInt4665;
																@Pc(2141) int local2141 = (local2121.anInt2122 >> 12) - Static296.anInt5905;
																@Pc(2148) int local2148 = (local2121.anInt2124 >> 12) - Static2.anInt53;
																@Pc(2158) int local2158 = local2148 * Static58.anInt1267 - local2134 * Static37.anInt930 >> 16;
																@Pc(2170) int local2170 = (local2141 * Static79.anInt1828 + local2158 * Static282.anInt5661 >> 16) - var17;
																if (Static42.anIntArray128[local2170] < 32) {
																	Static42.aShortArrayArray3[local2170][Static42.anIntArray128[local2170]++] = local2121.aShort32;
																} else {
																	if (Static42.anIntArray128[local2170] == 32) {
																		if (Static42.anInt1056 == 32) {
																			if (Static42.aBoolean74) {
																				System.out.println("Overflowed world-based radix sort");
																			}
																			break;
																		}
																		Static42.anIntArray128[local2170] += Static42.anInt1056++ + 1;
																	}
																	@Pc(2227) int local2227 = Static42.anIntArray129[Static42.anIntArray128[local2170] - 32 - 1];
																	if (local2227 < 768) {
																		@Pc(2239) short[] local2239 = Static42.aShortArrayArray2[Static42.anIntArray128[local2170] - 32 - 1];
																		@Pc(2247) int local2247 = Static42.anIntArray128[local2170] - 32 - 1;
																		@Pc(2249) int local2249 = Static42.anIntArray129[Static42.anIntArray128[local2170] - 32 - 1];
																		Static42.anIntArray129[local2247] = Static42.anIntArray129[Static42.anIntArray128[local2170] - 32 - 1] + 1;
																		local2239[local2249] = local2121.aShort32;
																	}
																}
															}
															if (local2121.aClass34_Sub2_4 == local8.aClass179_1.aClass34_Sub2_5) {
																break;
															}
														}
														@Pc(2270) boolean local2270 = false;
														if (Static42.aBoolean75 && local2032.aClass18_2.anInt492 != -1) {
															Static237.anInterface1_1.method4595(local2032.aClass18_2.anInt492);
															local2270 = true;
														} else {
															Static294.method4486(-1);
														}
														@Pc(2293) float local2293 = (float) local2034 * Static42.aFloat11;
														if (local2293 > 64.0F) {
															local2293 = 64.0F;
														}
														local1905.glPointSize(local2293);
														local2032.aClass34_Sub1_7.method850(local1905, var18, local2270, local2032.aClass18_2.aBoolean27);
														if (local2040 != null) {
															local2030 = local2040;
															local2032 = local2040.aClass34_Sub3_1;
															local2034 = local2040.aClass34_Sub3_1.aClass18_2.anInt479;
														}
													}
													if (local2040 == null) {
														break;
													}
												}
												local2040 = (Class34_Sub2_Sub1) local8.aClass179_1.method4438();
											}
											Static42.method857();
										} else {
											var9 = Static42.anInt1040 + Static237.anInt4974;
											var10 = Static42.anInt1035 + Static237.anInt4975;
											@Pc(2347) Class34_Sub2 local2347 = local8.aClass179_1.aClass34_Sub2_5;
											for (@Pc(2350) Class34_Sub2 local2350 = local2347.aClass34_Sub2_4; local2350 != local2347; local2350 = local2350.aClass34_Sub2_4) {
												@Pc(2356) Class34_Sub2_Sub1 local2356 = (Class34_Sub2_Sub1) local2350;
												if (local2356.aClass34_Sub3_1 != null && !local2356.aClass34_Sub3_1.aClass34_Sub1_7.aBoolean73) {
													if ((byte) (local2356.aClass34_Sub3_1.aClass34_Sub1_7.aLong41 & 0xFFL) != local8.aByte1) {
														local8.aClass179_1 = null;
														break;
													}
													local894 = (local2356.anInt2120 >> 12) - Static215.anInt4665;
													local899 = (local2356.anInt2122 >> 12) - Static296.anInt5905;
													local904 = (local2356.anInt2124 >> 12) - Static2.anInt53;
													var17 = local904 * Static37.anInt930 + local894 * Static58.anInt1267 >> 16;
													local904 = local904 * Static58.anInt1267 - local894 * Static37.anInt930 >> 16;
													local894 = var17;
													var17 = local899 * Static282.anInt5661 - local904 * Static79.anInt1828 >> 16;
													local904 = local899 * Static79.anInt1828 + local904 * Static282.anInt5661 >> 16;
													if (local904 >= 50) {
														var18 = var9 + (local894 << 9) / local904;
														var19 = var10 + (var17 << 9) / local904;
														@Pc(2468) int local2468 = local904 * 400;
														if (local2468 == 0) {
															local2468 = 1;
														}
														Static231.method3635(var18, var19, (local2356.aClass34_Sub3_1.aClass18_2.anInt479 << 16) / local2468, local2356.anInt2123, local2356.anInt2123 >> 24 & 0xFF);
													}
												}
											}
										}
									}
								} while (!local8.aBoolean5);
							} while (local8.anInt50 != 0);
							if (local18 > Static101.anInt152 || local18 <= Static194.anInt4264) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean5);
						if (local18 < Static101.anInt152 || local18 >= Static235.anInt4964 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean5);
					if (local21 > Static245.anInt5022 || local21 <= Static151.anInt3397) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean5);
				if (local21 < Static245.anInt5022 || local21 >= Static163.anInt3564 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean5);
			local8.aBoolean5 = false;
			Static86.anInt2119--;
			@Pc(2596) Class10 local2596 = local8.aClass10_1;
			if (local2596 != null && local2596.anInt302 != 0) {
				if (Static294.aBoolean367) {
					Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
				}
				if (local2596.aClass2_3 != null) {
					local2596.aClass2_3.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local2596.anInt305 - Static215.anInt4665, local2596.anInt301 - Static296.anInt5905 - local2596.anInt302, local2596.anInt303 - Static2.anInt53, local2596.aLong9, local24, null);
				}
				if (local2596.aClass2_4 != null) {
					local2596.aClass2_4.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local2596.anInt305 - Static215.anInt4665, local2596.anInt301 - Static296.anInt5905 - local2596.anInt302, local2596.anInt303 - Static2.anInt53, local2596.aLong9, local24, null);
				}
				if (local2596.aClass2_2 != null) {
					local2596.aClass2_2.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local2596.anInt305 - Static215.anInt4665, local2596.anInt301 - Static296.anInt5905 - local2596.anInt302, local2596.anInt303 - Static2.anInt53, local2596.aLong9, local24, null);
				}
			}
			if (local8.anInt46 != 0) {
				@Pc(2706) Class106 local2706 = local8.aClass106_1;
				if (local2706 != null && !Static147.method2382(local27, local18, local21, local2706.aClass2_5.method3948())) {
					if ((local2706.anInt3764 & local8.anInt46) != 0) {
						if (Static294.aBoolean367) {
							Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
						}
						local2706.aClass2_5.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local2706.anInt3756 + local2706.anInt3751 - Static215.anInt4665, local2706.anInt3752 - Static296.anInt5905, local2706.anInt3753 + local2706.anInt3757 - Static2.anInt53, local2706.aLong131, local24, null);
					} else if (local2706.anInt3764 == 256) {
						local65 = local2706.anInt3756 - Static215.anInt4665;
						local115 = local2706.anInt3752 - Static296.anInt5905;
						local1332 = local2706.anInt3753 - Static2.anInt53;
						local894 = local2706.anInt3755;
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
							if (Static294.aBoolean367) {
								Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
							}
							local2706.aClass2_5.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local65 + local2706.anInt3751, local115, local1332 + local2706.anInt3757, local2706.aLong131, local24, null);
						} else if (local2706.aClass2_6 != null) {
							if (Static294.aBoolean367) {
								Static191.method3095(Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local24, local18, local21);
							}
							local2706.aClass2_6.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local65, local115, local1332, local2706.aLong131, local24, null);
						}
					}
				}
				@Pc(2872) Class136 local2872 = local8.aClass136_1;
				if (local2872 != null) {
					if ((local2872.anInt4694 & local8.anInt46) != 0 && !Static103.method1722(local27, local18, local21, local2872.anInt4694)) {
						if (Static294.aBoolean367) {
							Static191.method3088(local2872.anInt4694, Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local27, local18, local21);
						}
						local2872.aClass2_9.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local2872.anInt4699 - Static215.anInt4665, local2872.anInt4701 - Static296.anInt5905, local2872.anInt4697 - Static2.anInt53, local2872.aLong182, local24, null);
					}
					if ((local2872.anInt4700 & local8.anInt46) != 0 && !Static103.method1722(local27, local18, local21, local2872.anInt4700)) {
						if (Static294.aBoolean367) {
							Static191.method3088(local2872.anInt4700, Static215.anInt4665, Static296.anInt5905, Static2.anInt53, local27, local18, local21);
						}
						local2872.aClass2_10.method3951(0, Static79.anInt1828, Static282.anInt5661, Static37.anInt930, Static58.anInt1267, local2872.anInt4699 - Static215.anInt4665, local2872.anInt4701 - Static296.anInt5905, local2872.anInt4697 - Static2.anInt53, local2872.aLong182, local24, null);
					}
				}
			}
			@Pc(2985) Class1_Sub2 local2985;
			if (local24 < Static155.anInt3493 - 1) {
				local2985 = Static7.aClass1_Sub2ArrayArrayArray1[local24 + 1][local18][local21];
				if (local2985 != null && local2985.aBoolean5) {
					Static63.aClass26_12.method668(local2985);
				}
			}
			if (local18 < Static101.anInt152) {
				local2985 = local31[local18 + 1][local21];
				if (local2985 != null && local2985.aBoolean5) {
					Static63.aClass26_12.method668(local2985);
				}
			}
			if (local21 < Static245.anInt5022) {
				local2985 = local31[local18][local21 + 1];
				if (local2985 != null && local2985.aBoolean5) {
					Static63.aClass26_12.method668(local2985);
				}
			}
			if (local18 > Static101.anInt152) {
				local2985 = local31[local18 - 1][local21];
				if (local2985 != null && local2985.aBoolean5) {
					Static63.aClass26_12.method668(local2985);
				}
			}
			if (local21 > Static245.anInt5022) {
				local2985 = local31[local18][local21 - 1];
				if (local2985 != null && local2985.aBoolean5) {
					Static63.aClass26_12.method668(local2985);
				}
			}
		}
	}
}
