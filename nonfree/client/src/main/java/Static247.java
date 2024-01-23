import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	public static int anInt4920;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	public static int anInt4924;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
	public static int anInt4929;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
	public static int anInt4921 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!vb;Z)V")
	public static void method3964(@OriginalArg(0) Class2_Sub31 arg0, @OriginalArg(1) boolean arg1) {
		Static26.aClass1_4.method11(arg0);
		while (true) {
			@Pc(8) Class2_Sub31 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class2_Sub31[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class2_Sub31 local153;
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
										@Pc(363) Class168 var22;
										@Pc(469) boolean var24;
										@Pc(425) Class34 var25;
										@Pc(1179) Class2_Sub31 var32;
										while (true) {
											do {
												local8 = (Class2_Sub31) Static26.aClass1_4.method3();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean457);
											local18 = local8.anInt5712;
											local21 = local8.anInt5707;
											local24 = local8.anInt5713;
											local27 = local8.anInt5711;
											local31 = Static180.aClass2_Sub31ArrayArrayArray2[local24];
											@Pc(33) float local33 = 0.0F;
											if (Static60.aBoolean106) {
												if (Static144.anIntArrayArrayArray5 == Static141.anIntArrayArrayArray4) {
													var9 = Static157.anIntArrayArray27[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static101.anInt6024) {
														Static101.anInt6024 = var10;
														Static36.method721(var10);
														Static117.method2158(Static43.method833());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static159.anInt3363) {
														Static159.anInt3363 = local65;
														Static15.method318(local65);
													}
													local115 = Static274.anIntArrayArrayArray14[0][local18][local21] + Static274.anIntArrayArrayArray14[0][local18 + 1][local21] + Static274.anIntArrayArrayArray14[0][local18][local21 + 1] + Static274.anIntArrayArrayArray14[0][local18 + 1][local21 + 1] >> 2;
													Static4.method119(-local115, 3);
													local33 = 201.5F;
													Static60.method1142(local33);
												} else {
													local33 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static60.method1142(local33);
												}
											}
											if (!local8.aBoolean456) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static180.aClass2_Sub31ArrayArrayArray2[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean457) {
														continue;
													}
												}
												if (local18 <= Static53.anInt1215 && local18 > Static281.anInt5831) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean457 && (local153.aBoolean456 || (local8.anInt5702 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static53.anInt1215 && local18 < Static222.anInt4612 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean457 && (local153.aBoolean456 || (local8.anInt5702 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static210.anInt4375 && local21 > Static26.anInt549) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean457 && (local153.aBoolean456 || (local8.anInt5702 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static210.anInt4375 && local21 < Static50.anInt1165 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean457 && (local153.aBoolean456 || (local8.anInt5702 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean456 = false;
											if (local8.aClass2_Sub31_1 != null) {
												local153 = local8.aClass2_Sub31_1;
												if (Static60.aBoolean106) {
													Static60.method1142(201.5F - (float) (local153.anInt5711 + 1) * 50.0F);
												}
												if (local153.aClass8_1 == null) {
													if (local153.aClass95_1 != null) {
														if (Static217.method3664(0, local18, local21)) {
															Static74.method1369(local153.aClass95_1, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local18, local21, true);
														} else {
															Static74.method1369(local153.aClass95_1, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local18, local21, false);
														}
													}
												} else if (Static217.method3664(0, local18, local21)) {
													Static293.method4857(local153.aClass8_1, 0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local18, local21, true);
												} else {
													Static293.method4857(local153.aClass8_1, 0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local18, local21, false);
												}
												var22 = local153.aClass168_1;
												if (var22 != null) {
													if (Static60.aBoolean106) {
														if ((var22.anInt5425 & local8.anInt5701) == 0) {
															Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
														} else {
															Static128.method2280(var22.anInt5425, Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local27, local18, local21);
														}
													}
													var22.aClass36_10.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, var22.anInt5427 - Static77.anInt1648, var22.anInt5424 - Static189.anInt3965, var22.anInt5433 - Static173.anInt3690, var22.aLong268, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt5708; local65++) {
													var25 = local153.aClass34Array2[local65];
													if (var25 != null) {
														if (Static60.aBoolean106) {
															Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
														}
														var25.aClass36_1.method4878(var25.anInt898, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, var25.anInt901 - Static77.anInt1648, var25.anInt903 - Static189.anInt3965, var25.anInt899 - Static173.anInt3690, var25.aLong49, local24, null);
													}
												}
												if (Static60.aBoolean106) {
													Static60.method1142(local33);
												}
											}
											var24 = false;
											if (local8.aClass8_1 == null) {
												if (local8.aClass95_1 != null) {
													if (Static217.method3664(local27, local18, local21)) {
														Static74.method1369(local8.aClass95_1, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local18, local21, true);
													} else {
														var24 = true;
														Static74.method1369(local8.aClass95_1, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local18, local21, false);
													}
												}
											} else if (Static217.method3664(local27, local18, local21)) {
												Static293.method4857(local8.aClass8_1, local27, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local18, local21, true);
											} else {
												var24 = true;
												if (local8.aClass8_1.anInt285 != 12345678 || Static116.aBoolean191 && local24 <= Static192.anInt3987) {
													Static293.method4857(local8.aClass8_1, local27, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local18, local21, false);
												}
											}
											if (var24) {
												@Pc(549) Class65 local549 = local8.aClass65_1;
												if (local549 != null && (local549.aLong104 & 0x80000000L) != 0L) {
													if (Static60.aBoolean106 && local549.aBoolean155) {
														Static60.method1142(local33 + 50.0F - 1.5F);
													}
													if (Static60.aBoolean106) {
														Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
													}
													local549.aClass36_5.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local549.anInt2044 - Static77.anInt1648, local549.anInt2037 - Static189.anInt3965, local549.anInt2043 - Static173.anInt3690, local549.aLong104, local24, null);
													if (Static60.aBoolean106 && local549.aBoolean155) {
														Static60.method1142(local33);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class168 local616 = local8.aClass168_1;
											@Pc(619) Class50 local619 = local8.aClass50_1;
											if (local616 != null || local619 != null) {
												if (Static53.anInt1215 == local18) {
													var10++;
												} else if (Static53.anInt1215 < local18) {
													var10 += 2;
												}
												if (Static210.anInt4375 == local21) {
													var10 += 3;
												} else if (Static210.anInt4375 > local21) {
													var10 += 6;
												}
												local65 = Static157.anIntArray234[var10];
												local8.anInt5701 = Static103.anIntArray159[var10];
											}
											if (local616 != null) {
												if ((local616.anInt5425 & Static1.anIntArray1[var10]) == 0) {
													local8.anInt5704 = 0;
												} else if (local616.anInt5425 == 16) {
													local8.anInt5704 = 3;
													local8.anInt5710 = Static202.anIntArray349[var10];
													local8.anInt5706 = 3 - local8.anInt5710;
												} else if (local616.anInt5425 == 32) {
													local8.anInt5704 = 6;
													local8.anInt5710 = Static216.anIntArray367[var10];
													local8.anInt5706 = 6 - local8.anInt5710;
												} else if (local616.anInt5425 == 64) {
													local8.anInt5704 = 12;
													local8.anInt5710 = Static238.anIntArray439[var10];
													local8.anInt5706 = 12 - local8.anInt5710;
												} else {
													local8.anInt5704 = 9;
													local8.anInt5710 = Static21.anIntArray35[var10];
													local8.anInt5706 = 9 - local8.anInt5710;
												}
												if ((local616.anInt5425 & local65) != 0 && !Static249.method3995(local27, local18, local21, local616.anInt5425)) {
													if (Static60.aBoolean106) {
														Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
													}
													local616.aClass36_10.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local616.anInt5427 - Static77.anInt1648, local616.anInt5424 - Static189.anInt3965, local616.anInt5433 - Static173.anInt3690, local616.aLong268, local24, null);
												}
												if ((local616.anInt5430 & local65) != 0 && !Static249.method3995(local27, local18, local21, local616.anInt5430)) {
													if (Static60.aBoolean106) {
														Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
													}
													local616.aClass36_9.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local616.anInt5427 - Static77.anInt1648, local616.anInt5424 - Static189.anInt3965, local616.anInt5433 - Static173.anInt3690, local616.aLong268, local24, null);
												}
											}
											if (local619 != null && !Static195.method3281(local27, local18, local21, local619.aClass36_3.method4881())) {
												if (Static60.aBoolean106) {
													Static60.method1142(local33 - 0.5F);
												}
												if ((local619.anInt1326 & local65) != 0) {
													if (Static60.aBoolean106) {
														Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
													}
													local619.aClass36_3.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local619.anInt1316 + local619.anInt1321 - Static77.anInt1648, local619.anInt1328 - Static189.anInt3965, local619.anInt1327 + local619.anInt1318 - Static173.anInt3690, local619.aLong65, local24, null);
												} else if (local619.anInt1326 == 256) {
													local894 = local619.anInt1316 - Static77.anInt1648;
													local899 = local619.anInt1328 - Static189.anInt3965;
													local904 = local619.anInt1327 - Static173.anInt3690;
													var17 = local619.anInt1325;
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
														if (Static60.aBoolean106) {
															Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
														}
														local619.aClass36_3.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local894 + local619.anInt1321, local899, local904 + local619.anInt1318, local619.aLong65, local24, null);
													} else if (local619.aClass36_2 != null) {
														if (Static60.aBoolean106) {
															Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
														}
														local619.aClass36_2.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local894, local899, local904, local619.aLong65, local24, null);
													}
												}
												if (Static60.aBoolean106) {
													Static60.method1142(local33);
												}
											}
											if (var24) {
												@Pc(1001) Class65 local1001 = local8.aClass65_1;
												if (local1001 != null && (local1001.aLong104 & 0x80000000L) == 0L) {
													if (Static60.aBoolean106 && local1001.aBoolean155) {
														Static60.method1142(local33 + 50.0F - 1.5F);
													}
													if (Static60.aBoolean106) {
														Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
													}
													local1001.aClass36_5.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local1001.anInt2044 - Static77.anInt1648, local1001.anInt2037 - Static189.anInt3965, local1001.anInt2043 - Static173.anInt3690, local1001.aLong104, local24, null);
													if (Static60.aBoolean106 && local1001.aBoolean155) {
														Static60.method1142(local33);
													}
												}
												@Pc(1064) Class72 local1064 = local8.aClass72_1;
												if (local1064 != null && local1064.anInt2192 == 0) {
													if (Static60.aBoolean106) {
														Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
													}
													if (local1064.aClass36_8 != null) {
														local1064.aClass36_8.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local1064.anInt2193 - Static77.anInt1648, local1064.anInt2191 - Static189.anInt3965, local1064.anInt2190 - Static173.anInt3690, local1064.aLong109, local24, null);
													}
													if (local1064.aClass36_6 != null) {
														local1064.aClass36_6.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local1064.anInt2193 - Static77.anInt1648, local1064.anInt2191 - Static189.anInt3965, local1064.anInt2190 - Static173.anInt3690, local1064.aLong109, local24, null);
													}
													if (local1064.aClass36_7 != null) {
														local1064.aClass36_7.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local1064.anInt2193 - Static77.anInt1648, local1064.anInt2191 - Static189.anInt3965, local1064.anInt2190 - Static173.anInt3690, local1064.aLong109, local24, null);
													}
												}
											}
											local894 = local8.anInt5702;
											if (local894 != 0) {
												if (local18 < Static53.anInt1215 && (local894 & 0x4) != 0) {
													var32 = local31[local18 + 1][local21];
													if (var32 != null && var32.aBoolean457) {
														Static26.aClass1_4.method11(var32);
													}
												}
												if (local21 < Static210.anInt4375 && (local894 & 0x2) != 0) {
													var32 = local31[local18][local21 + 1];
													if (var32 != null && var32.aBoolean457) {
														Static26.aClass1_4.method11(var32);
													}
												}
												if (local18 > Static53.anInt1215 && (local894 & 0x1) != 0) {
													var32 = local31[local18 - 1][local21];
													if (var32 != null && var32.aBoolean457) {
														Static26.aClass1_4.method11(var32);
													}
												}
												if (local21 > Static210.anInt4375 && (local894 & 0x8) != 0) {
													var32 = local31[local18][local21 - 1];
													if (var32 != null && var32.aBoolean457) {
														Static26.aClass1_4.method11(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt5704 != 0) {
											var24 = true;
											for (var10 = 0; var10 < local8.anInt5708; var10++) {
												if (local8.aClass34Array2[var10].anInt900 != Static183.anInt3890 && (local8.anIntArray498[var10] & local8.anInt5704) == local8.anInt5710) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												var22 = local8.aClass168_1;
												if (!Static249.method3995(local27, local18, local21, var22.anInt5425)) {
													if (Static60.aBoolean106) {
														label882: {
															if ((var22.aLong268 & 0xFC000L) == 16384L) {
																local65 = var22.anInt5427 - Static77.anInt1648;
																local115 = var22.anInt5433 - Static173.anInt3690;
																local1332 = (int) (var22.aLong268 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static232.anInt4787 - 1) {
																		Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18 - 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static26.anInt552 - 1 && local21 < Static232.anInt4787 - 1) {
																		Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18 + 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static26.anInt552 - 1 && local21 > 0) {
																		Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18 + 1, local21 - 1);
																		break label882;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18 - 1, local21 - 1);
																		break label882;
																	}
																}
															}
															Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
														}
													}
													var22.aClass36_10.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, var22.anInt5427 - Static77.anInt1648, var22.anInt5424 - Static189.anInt3965, var22.anInt5433 - Static173.anInt3690, var22.aLong268, local24, null);
												}
												local8.anInt5704 = 0;
											}
										}
										if (!local8.aBoolean455) {
											break;
										}
										try {
											var9 = local8.anInt5708;
											local8.aBoolean455 = false;
											var10 = 0;
											label767: for (local65 = 0; local65 < var9; local65++) {
												var25 = local8.aClass34Array2[local65];
												if (var25.anInt900 != Static183.anInt3890) {
													for (local1332 = var25.anInt894; local1332 <= var25.anInt896; local1332++) {
														for (local894 = var25.anInt897; local894 <= var25.anInt902; local894++) {
															var32 = local31[local1332][local894];
															if (var32.aBoolean456) {
																local8.aBoolean455 = true;
																continue label767;
															}
															if (var32.anInt5704 != 0) {
																local904 = 0;
																if (local1332 > var25.anInt894) {
																	local904++;
																}
																if (local1332 < var25.anInt896) {
																	local904 += 4;
																}
																if (local894 > var25.anInt897) {
																	local904 += 8;
																}
																if (local894 < var25.anInt902) {
																	local904 += 2;
																}
																if ((local904 & var32.anInt5704) == local8.anInt5706) {
																	local8.aBoolean455 = true;
																	continue label767;
																}
															}
														}
													}
													Static225.aClass34Array1[var10++] = var25;
													local1332 = Static53.anInt1215 - var25.anInt894;
													local894 = var25.anInt896 - Static53.anInt1215;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static210.anInt4375 - var25.anInt897;
													local904 = var25.anInt902 - Static210.anInt4375;
													if (local904 > local899) {
														var25.anInt895 = local1332 + local904;
													} else {
														var25.anInt895 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class34 local1628 = Static225.aClass34Array1[local1332];
													if (local1628.anInt900 != Static183.anInt3890) {
														if (local1628.anInt895 > local65) {
															local65 = local1628.anInt895;
															local115 = local1332;
														} else if (local1628.anInt895 == local65) {
															local899 = local1628.anInt901 - Static77.anInt1648;
															local904 = local1628.anInt899 - Static173.anInt3690;
															var17 = Static225.aClass34Array1[local115].anInt901 - Static77.anInt1648;
															var18 = Static225.aClass34Array1[local115].anInt899 - Static173.anInt3690;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class34 local1697 = Static225.aClass34Array1[local115];
												local1697.anInt900 = Static183.anInt3890;
												if (!Static145.method2555(local27, local1697.anInt894, local1697.anInt896, local1697.anInt897, local1697.anInt902, local1697.aClass36_1.method4881())) {
													if (Static60.aBoolean106) {
														if ((local1697.aLong49 & 0xFC000L) == 147456L) {
															Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
															local894 = local1697.anInt901 - Static77.anInt1648;
															local899 = local1697.anInt899 - Static173.anInt3690;
															local904 = (int) (local1697.aLong49 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static128.method2277(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static128.method2277(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static128.method2277(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static128.method2277(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static128.method2279(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local1697.anInt894, local1697.anInt897, local1697.anInt896, local1697.anInt902);
														}
													}
													local1697.aClass36_1.method4878(local1697.anInt898, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local1697.anInt901 - Static77.anInt1648, local1697.anInt903 - Static189.anInt3965, local1697.anInt899 - Static173.anInt3690, local1697.aLong49, local24, null);
												}
												for (local894 = local1697.anInt894; local894 <= local1697.anInt896; local894++) {
													for (local899 = local1697.anInt897; local899 <= local1697.anInt902; local899++) {
														@Pc(1863) Class2_Sub31 local1863 = local31[local894][local899];
														if (local1863.anInt5704 != 0) {
															Static26.aClass1_4.method11(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean457) {
															Static26.aClass1_4.method11(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean455) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean455 = false;
											break;
										}
									}
								} while (!local8.aBoolean457);
							} while (local8.anInt5704 != 0);
							if (local18 > Static53.anInt1215 || local18 <= Static281.anInt5831) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean457);
						if (local18 < Static53.anInt1215 || local18 >= Static222.anInt4612 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean457);
					if (local21 > Static210.anInt4375 || local21 <= Static26.anInt549) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean457);
				if (local21 < Static210.anInt4375 || local21 >= Static50.anInt1165 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean457);
			local8.aBoolean457 = false;
			Static118.anInt2539--;
			@Pc(1999) Class72 local1999 = local8.aClass72_1;
			if (local1999 != null && local1999.anInt2192 != 0) {
				if (Static60.aBoolean106) {
					Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
				}
				if (local1999.aClass36_8 != null) {
					local1999.aClass36_8.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local1999.anInt2193 - Static77.anInt1648, local1999.anInt2191 - Static189.anInt3965 - local1999.anInt2192, local1999.anInt2190 - Static173.anInt3690, local1999.aLong109, local24, null);
				}
				if (local1999.aClass36_6 != null) {
					local1999.aClass36_6.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local1999.anInt2193 - Static77.anInt1648, local1999.anInt2191 - Static189.anInt3965 - local1999.anInt2192, local1999.anInt2190 - Static173.anInt3690, local1999.aLong109, local24, null);
				}
				if (local1999.aClass36_7 != null) {
					local1999.aClass36_7.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local1999.anInt2193 - Static77.anInt1648, local1999.anInt2191 - Static189.anInt3965 - local1999.anInt2192, local1999.anInt2190 - Static173.anInt3690, local1999.aLong109, local24, null);
				}
			}
			if (local8.anInt5701 != 0) {
				@Pc(2109) Class50 local2109 = local8.aClass50_1;
				if (local2109 != null && !Static195.method3281(local27, local18, local21, local2109.aClass36_3.method4881())) {
					if ((local2109.anInt1326 & local8.anInt5701) != 0) {
						if (Static60.aBoolean106) {
							Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
						}
						local2109.aClass36_3.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local2109.anInt1316 + local2109.anInt1321 - Static77.anInt1648, local2109.anInt1328 - Static189.anInt3965, local2109.anInt1327 + local2109.anInt1318 - Static173.anInt3690, local2109.aLong65, local24, null);
					} else if (local2109.anInt1326 == 256) {
						local65 = local2109.anInt1316 - Static77.anInt1648;
						local115 = local2109.anInt1328 - Static189.anInt3965;
						local1332 = local2109.anInt1327 - Static173.anInt3690;
						local894 = local2109.anInt1325;
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
							if (Static60.aBoolean106) {
								Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
							}
							local2109.aClass36_3.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local65 + local2109.anInt1321, local115, local1332 + local2109.anInt1318, local2109.aLong65, local24, null);
						} else if (local2109.aClass36_2 != null) {
							if (Static60.aBoolean106) {
								Static128.method2276(Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local24, local18, local21);
							}
							local2109.aClass36_2.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local65, local115, local1332, local2109.aLong65, local24, null);
						}
					}
				}
				@Pc(2275) Class168 local2275 = local8.aClass168_1;
				if (local2275 != null) {
					if ((local2275.anInt5430 & local8.anInt5701) != 0 && !Static249.method3995(local27, local18, local21, local2275.anInt5430)) {
						if (Static60.aBoolean106) {
							Static128.method2280(local2275.anInt5430, Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local27, local18, local21);
						}
						local2275.aClass36_9.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local2275.anInt5427 - Static77.anInt1648, local2275.anInt5424 - Static189.anInt3965, local2275.anInt5433 - Static173.anInt3690, local2275.aLong268, local24, null);
					}
					if ((local2275.anInt5425 & local8.anInt5701) != 0 && !Static249.method3995(local27, local18, local21, local2275.anInt5425)) {
						if (Static60.aBoolean106) {
							Static128.method2280(local2275.anInt5425, Static77.anInt1648, Static189.anInt3965, Static173.anInt3690, local27, local18, local21);
						}
						local2275.aClass36_10.method4878(0, Static17.anInt431, Static278.anInt5805, Static26.anInt551, Static239.anInt4868, local2275.anInt5427 - Static77.anInt1648, local2275.anInt5424 - Static189.anInt3965, local2275.anInt5433 - Static173.anInt3690, local2275.aLong268, local24, null);
					}
				}
			}
			@Pc(2388) Class2_Sub31 local2388;
			if (local24 < Static63.anInt1426 - 1) {
				local2388 = Static180.aClass2_Sub31ArrayArrayArray2[local24 + 1][local18][local21];
				if (local2388 != null && local2388.aBoolean457) {
					Static26.aClass1_4.method11(local2388);
				}
			}
			if (local18 < Static53.anInt1215) {
				local2388 = local31[local18 + 1][local21];
				if (local2388 != null && local2388.aBoolean457) {
					Static26.aClass1_4.method11(local2388);
				}
			}
			if (local21 < Static210.anInt4375) {
				local2388 = local31[local18][local21 + 1];
				if (local2388 != null && local2388.aBoolean457) {
					Static26.aClass1_4.method11(local2388);
				}
			}
			if (local18 > Static53.anInt1215) {
				local2388 = local31[local18 - 1][local21];
				if (local2388 != null && local2388.aBoolean457) {
					Static26.aClass1_4.method11(local2388);
				}
			}
			if (local21 > Static210.anInt4375) {
				local2388 = local31[local18][local21 - 1];
				if (local2388 != null && local2388.aBoolean457) {
					Static26.aClass1_4.method11(local2388);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BI)Z")
	public static boolean method3965(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class2_Sub26 local13 = new Class2_Sub26(arg0);
		@Pc(17) int local17 = local13.method4261();
		if (local17 != 1) {
			return false;
		}
		@Pc(34) boolean local34 = local13.method4261() == 1;
		if (local34) {
			Static195.method3285(local13);
		}
		Static96.method1837(local13);
		return true;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method3966(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (!arg0) {
			try {
				Static303.method484("loggedout", Static299.aClass177_5.anApplet1);
			} catch (@Pc(21) Throwable local21) {
			}
			try {
				Static87.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static87.anApplet_Sub1_1.getCodeBase(), arg1), "_top");
			} catch (@Pc(33) Exception local33) {
			}
			return;
		}
		if (Static60.aBoolean106 && Static155.aBoolean491) {
			try {
				Static303.method482(new Object[] { (new URL(Static87.anApplet_Sub1_1.getCodeBase(), arg1)).toString() }, Static299.aClass177_5.anApplet1, "openjs");
				return;
			} catch (@Pc(59) Throwable local59) {
			}
		}
		try {
			Static87.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static87.anApplet_Sub1_1.getCodeBase(), arg1), "_blank");
		} catch (@Pc(71) Exception local71) {
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!th;)I")
	public static int method3967(@OriginalArg(1) Class36_Sub3_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt5170;
		@Pc(17) Class70 local17 = arg0.method4104();
		if (arg0.anInt5138 == local17.anInt2124) {
			local13 = arg0.anInt5165;
		} else if (local17.anInt2096 == arg0.anInt5138 || local17.anInt2116 == arg0.anInt5138 || local17.anInt2092 == arg0.anInt5138 || local17.anInt2106 == arg0.anInt5138) {
			local13 = arg0.anInt5168;
		} else if (arg0.anInt5138 == local17.anInt2097 || local17.anInt2113 == arg0.anInt5138 || local17.anInt2093 == arg0.anInt5138 || local17.anInt2122 == arg0.anInt5138) {
			local13 = arg0.anInt5157;
		}
		return local13;
	}
}
