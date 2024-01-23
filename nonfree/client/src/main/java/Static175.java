import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
	public static int anInt3456;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "J")
	public static long aLong125 = 0L;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "[I")
	public static int[] anIntArray298 = new int[1000];

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = new String[200];

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Z")
	public static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	public static int anInt3449 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!dk;Z)V")
	public static void method2720(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) boolean arg1) {
		Static170.aClass10_41.method184(arg0);
		while (true) {
			@Pc(8) Class4_Sub11 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class4_Sub11[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class4_Sub11 local153;
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
										@Pc(363) Class43 var22;
										@Pc(469) boolean var24;
										@Pc(425) Class173 var25;
										@Pc(1179) Class4_Sub11 var32;
										while (true) {
											do {
												local8 = (Class4_Sub11) Static170.aClass10_41.method182();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean74);
											local18 = local8.anInt1049;
											local21 = local8.anInt1053;
											local24 = local8.anInt1048;
											local27 = local8.anInt1047;
											local31 = Static127.aClass4_Sub11ArrayArrayArray1[local24];
											@Pc(33) float local33 = 0.0F;
											if (Static178.aBoolean216) {
												if (Static15.anIntArrayArrayArray2 == Static250.anIntArrayArrayArray13) {
													var9 = Static120.anIntArrayArray23[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static125.anInt2693) {
														Static125.anInt2693 = var10;
														Static74.method1121(var10);
														Static291.method4319(Static46.method725());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static289.anInt5422) {
														Static289.anInt5422 = local65;
														Static279.method4162(local65);
													}
													local115 = Static231.anIntArrayArrayArray12[0][local18][local21] + Static231.anIntArrayArrayArray12[0][local18 + 1][local21] + Static231.anIntArrayArrayArray12[0][local18][local21 + 1] + Static231.anIntArrayArrayArray12[0][local18 + 1][local21 + 1] >> 2;
													Static32.method479(3, -local115);
													local33 = 201.5F;
													Static178.method2771(local33);
												} else {
													local33 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static178.method2771(local33);
												}
											}
											if (!local8.aBoolean76) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static127.aClass4_Sub11ArrayArrayArray1[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean74) {
														continue;
													}
												}
												if (local18 <= Static273.anInt1119 && local18 > Static106.anInt2266) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean74 && (local153.aBoolean76 || (local8.anInt1056 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static273.anInt1119 && local18 < Static137.anInt2811 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean74 && (local153.aBoolean76 || (local8.anInt1056 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static89.anInt1839 && local21 > Static219.anInt4347) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean74 && (local153.aBoolean76 || (local8.anInt1056 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static89.anInt1839 && local21 < Static77.anInt1474 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean74 && (local153.aBoolean76 || (local8.anInt1056 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean76 = false;
											if (local8.aClass4_Sub11_1 != null) {
												local153 = local8.aClass4_Sub11_1;
												if (Static178.aBoolean216) {
													Static178.method2771(201.5F - (float) (local153.anInt1047 + 1) * 50.0F);
												}
												if (local153.aClass181_1 == null) {
													if (local153.aClass147_1 != null) {
														if (Static15.method266(0, local18, local21)) {
															Static258.method3885(local153.aClass147_1, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local18, local21, true);
														} else {
															Static258.method3885(local153.aClass147_1, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local18, local21, false);
														}
													}
												} else if (Static15.method266(0, local18, local21)) {
													Static274.method4076(local153.aClass181_1, 0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local18, local21, true);
												} else {
													Static274.method4076(local153.aClass181_1, 0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local18, local21, false);
												}
												var22 = local153.aClass43_1;
												if (var22 != null) {
													if (Static178.aBoolean216) {
														if ((var22.anInt1227 & local8.anInt1046) == 0) {
															Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
														} else {
															Static12.method199(var22.anInt1227, anInt3456, Static27.anInt1303, Static165.anInt3299, local27, local18, local21);
														}
													}
													var22.aClass12_5.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, var22.anInt1230 - anInt3456, var22.anInt1225 - Static27.anInt1303, var22.anInt1226 - Static165.anInt3299, var22.aLong44, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt1054; local65++) {
													var25 = local153.aClass173Array1[local65];
													if (var25 != null) {
														if (Static178.aBoolean216) {
															Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
														}
														var25.aClass12_10.method3357(var25.anInt5150, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, var25.anInt5159 - anInt3456, var25.anInt5162 - Static27.anInt1303, var25.anInt5161 - Static165.anInt3299, var25.aLong183, local24, null);
													}
												}
												if (Static178.aBoolean216) {
													Static178.method2771(local33);
												}
											}
											var24 = false;
											if (local8.aClass181_1 == null) {
												if (local8.aClass147_1 != null) {
													if (Static15.method266(local27, local18, local21)) {
														Static258.method3885(local8.aClass147_1, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local18, local21, true);
													} else {
														var24 = true;
														Static258.method3885(local8.aClass147_1, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local18, local21, false);
													}
												}
											} else if (Static15.method266(local27, local18, local21)) {
												Static274.method4076(local8.aClass181_1, local27, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local18, local21, true);
											} else {
												var24 = true;
												if (local8.aClass181_1.anInt5430 != 12345678 || Static125.aBoolean177 && local24 <= Static73.anInt1343) {
													Static274.method4076(local8.aClass181_1, local27, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local18, local21, false);
												}
											}
											if (var24) {
												@Pc(549) Class135 local549 = local8.aClass135_1;
												if (local549 != null && (local549.aLong147 & 0x80000000L) != 0L) {
													if (Static178.aBoolean216 && local549.aBoolean271) {
														Static178.method2771(local33 + 50.0F - 1.5F);
													}
													if (Static178.aBoolean216) {
														Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
													}
													local549.aClass12_8.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local549.anInt4100 - anInt3456, local549.anInt4101 - Static27.anInt1303, local549.anInt4098 - Static165.anInt3299, local549.aLong147, local24, null);
													if (Static178.aBoolean216 && local549.aBoolean271) {
														Static178.method2771(local33);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class43 local616 = local8.aClass43_1;
											@Pc(619) Class104 local619 = local8.aClass104_1;
											if (local616 != null || local619 != null) {
												if (Static273.anInt1119 == local18) {
													var10++;
												} else if (Static273.anInt1119 < local18) {
													var10 += 2;
												}
												if (Static89.anInt1839 == local21) {
													var10 += 3;
												} else if (Static89.anInt1839 > local21) {
													var10 += 6;
												}
												local65 = Static249.anIntArray430[var10];
												local8.anInt1046 = Static278.anIntArray461[var10];
											}
											if (local616 != null) {
												if ((local616.anInt1227 & Static265.anIntArray444[var10]) == 0) {
													local8.anInt1050 = 0;
												} else if (local616.anInt1227 == 16) {
													local8.anInt1050 = 3;
													local8.anInt1051 = Static95.anIntArray211[var10];
													local8.anInt1055 = 3 - local8.anInt1051;
												} else if (local616.anInt1227 == 32) {
													local8.anInt1050 = 6;
													local8.anInt1051 = Static151.anIntArray280[var10];
													local8.anInt1055 = 6 - local8.anInt1051;
												} else if (local616.anInt1227 == 64) {
													local8.anInt1050 = 12;
													local8.anInt1051 = Static234.anIntArray425[var10];
													local8.anInt1055 = 12 - local8.anInt1051;
												} else {
													local8.anInt1050 = 9;
													local8.anInt1051 = Static131.anIntArray246[var10];
													local8.anInt1055 = 9 - local8.anInt1051;
												}
												if ((local616.anInt1227 & local65) != 0 && !Static65.method1013(local27, local18, local21, local616.anInt1227)) {
													if (Static178.aBoolean216) {
														Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
													}
													local616.aClass12_5.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local616.anInt1230 - anInt3456, local616.anInt1225 - Static27.anInt1303, local616.anInt1226 - Static165.anInt3299, local616.aLong44, local24, null);
												}
												if ((local616.anInt1231 & local65) != 0 && !Static65.method1013(local27, local18, local21, local616.anInt1231)) {
													if (Static178.aBoolean216) {
														Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
													}
													local616.aClass12_4.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local616.anInt1230 - anInt3456, local616.anInt1225 - Static27.anInt1303, local616.anInt1226 - Static165.anInt3299, local616.aLong44, local24, null);
												}
											}
											if (local619 != null && !Static296.method1375(local27, local18, local21, local619.aClass12_6.method3355())) {
												if (Static178.aBoolean216) {
													Static178.method2771(local33 - 0.5F);
												}
												if ((local619.anInt3173 & local65) != 0) {
													if (Static178.aBoolean216) {
														Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
													}
													local619.aClass12_6.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local619.anInt3171 + local619.anInt3167 - anInt3456, local619.anInt3164 - Static27.anInt1303, local619.anInt3165 + local619.anInt3166 - Static165.anInt3299, local619.aLong112, local24, null);
												} else if (local619.anInt3173 == 256) {
													local894 = local619.anInt3171 - anInt3456;
													local899 = local619.anInt3164 - Static27.anInt1303;
													local904 = local619.anInt3165 - Static165.anInt3299;
													var17 = local619.anInt3172;
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
														if (Static178.aBoolean216) {
															Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
														}
														local619.aClass12_6.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local894 + local619.anInt3167, local899, local904 + local619.anInt3166, local619.aLong112, local24, null);
													} else if (local619.aClass12_7 != null) {
														if (Static178.aBoolean216) {
															Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
														}
														local619.aClass12_7.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local894, local899, local904, local619.aLong112, local24, null);
													}
												}
												if (Static178.aBoolean216) {
													Static178.method2771(local33);
												}
											}
											if (var24) {
												@Pc(1001) Class135 local1001 = local8.aClass135_1;
												if (local1001 != null && (local1001.aLong147 & 0x80000000L) == 0L) {
													if (Static178.aBoolean216 && local1001.aBoolean271) {
														Static178.method2771(local33 + 50.0F - 1.5F);
													}
													if (Static178.aBoolean216) {
														Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
													}
													local1001.aClass12_8.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local1001.anInt4100 - anInt3456, local1001.anInt4101 - Static27.anInt1303, local1001.anInt4098 - Static165.anInt3299, local1001.aLong147, local24, null);
													if (Static178.aBoolean216 && local1001.aBoolean271) {
														Static178.method2771(local33);
													}
												}
												@Pc(1064) Class18 local1064 = local8.aClass18_1;
												if (local1064 != null && local1064.anInt446 == 0) {
													if (Static178.aBoolean216) {
														Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
													}
													if (local1064.aClass12_3 != null) {
														local1064.aClass12_3.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local1064.anInt445 - anInt3456, local1064.anInt451 - Static27.anInt1303, local1064.anInt449 - Static165.anInt3299, local1064.aLong25, local24, null);
													}
													if (local1064.aClass12_1 != null) {
														local1064.aClass12_1.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local1064.anInt445 - anInt3456, local1064.anInt451 - Static27.anInt1303, local1064.anInt449 - Static165.anInt3299, local1064.aLong25, local24, null);
													}
													if (local1064.aClass12_2 != null) {
														local1064.aClass12_2.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local1064.anInt445 - anInt3456, local1064.anInt451 - Static27.anInt1303, local1064.anInt449 - Static165.anInt3299, local1064.aLong25, local24, null);
													}
												}
											}
											local894 = local8.anInt1056;
											if (local894 != 0) {
												if (local18 < Static273.anInt1119 && (local894 & 0x4) != 0) {
													var32 = local31[local18 + 1][local21];
													if (var32 != null && var32.aBoolean74) {
														Static170.aClass10_41.method184(var32);
													}
												}
												if (local21 < Static89.anInt1839 && (local894 & 0x2) != 0) {
													var32 = local31[local18][local21 + 1];
													if (var32 != null && var32.aBoolean74) {
														Static170.aClass10_41.method184(var32);
													}
												}
												if (local18 > Static273.anInt1119 && (local894 & 0x1) != 0) {
													var32 = local31[local18 - 1][local21];
													if (var32 != null && var32.aBoolean74) {
														Static170.aClass10_41.method184(var32);
													}
												}
												if (local21 > Static89.anInt1839 && (local894 & 0x8) != 0) {
													var32 = local31[local18][local21 - 1];
													if (var32 != null && var32.aBoolean74) {
														Static170.aClass10_41.method184(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt1050 != 0) {
											var24 = true;
											for (var10 = 0; var10 < local8.anInt1054; var10++) {
												if (local8.aClass173Array1[var10].anInt5154 != Static65.anInt1217 && (local8.anIntArray122[var10] & local8.anInt1050) == local8.anInt1051) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												var22 = local8.aClass43_1;
												if (!Static65.method1013(local27, local18, local21, var22.anInt1227)) {
													if (Static178.aBoolean216) {
														label882: {
															if ((var22.aLong44 & 0xFC000L) == 16384L) {
																local65 = var22.anInt1230 - anInt3456;
																local115 = var22.anInt1226 - Static165.anInt3299;
																local1332 = (int) (var22.aLong44 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static24.anInt439 - 1) {
																		Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18 - 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static247.anInt4706 - 1 && local21 < Static24.anInt439 - 1) {
																		Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18 + 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static247.anInt4706 - 1 && local21 > 0) {
																		Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18 + 1, local21 - 1);
																		break label882;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18 - 1, local21 - 1);
																		break label882;
																	}
																}
															}
															Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
														}
													}
													var22.aClass12_5.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, var22.anInt1230 - anInt3456, var22.anInt1225 - Static27.anInt1303, var22.anInt1226 - Static165.anInt3299, var22.aLong44, local24, null);
												}
												local8.anInt1050 = 0;
											}
										}
										if (!local8.aBoolean75) {
											break;
										}
										try {
											var9 = local8.anInt1054;
											local8.aBoolean75 = false;
											var10 = 0;
											label767: for (local65 = 0; local65 < var9; local65++) {
												var25 = local8.aClass173Array1[local65];
												if (var25.anInt5154 != Static65.anInt1217) {
													for (local1332 = var25.anInt5149; local1332 <= var25.anInt5163; local1332++) {
														for (local894 = var25.anInt5157; local894 <= var25.anInt5158; local894++) {
															var32 = local31[local1332][local894];
															if (var32.aBoolean76) {
																local8.aBoolean75 = true;
																continue label767;
															}
															if (var32.anInt1050 != 0) {
																local904 = 0;
																if (local1332 > var25.anInt5149) {
																	local904++;
																}
																if (local1332 < var25.anInt5163) {
																	local904 += 4;
																}
																if (local894 > var25.anInt5157) {
																	local904 += 8;
																}
																if (local894 < var25.anInt5158) {
																	local904 += 2;
																}
																if ((local904 & var32.anInt1050) == local8.anInt1055) {
																	local8.aBoolean75 = true;
																	continue label767;
																}
															}
														}
													}
													Static290.aClass173Array3[var10++] = var25;
													local1332 = Static273.anInt1119 - var25.anInt5149;
													local894 = var25.anInt5163 - Static273.anInt1119;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static89.anInt1839 - var25.anInt5157;
													local904 = var25.anInt5158 - Static89.anInt1839;
													if (local904 > local899) {
														var25.anInt5153 = local1332 + local904;
													} else {
														var25.anInt5153 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class173 local1628 = Static290.aClass173Array3[local1332];
													if (local1628.anInt5154 != Static65.anInt1217) {
														if (local1628.anInt5153 > local65) {
															local65 = local1628.anInt5153;
															local115 = local1332;
														} else if (local1628.anInt5153 == local65) {
															local899 = local1628.anInt5159 - anInt3456;
															local904 = local1628.anInt5161 - Static165.anInt3299;
															var17 = Static290.aClass173Array3[local115].anInt5159 - anInt3456;
															var18 = Static290.aClass173Array3[local115].anInt5161 - Static165.anInt3299;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class173 local1697 = Static290.aClass173Array3[local115];
												local1697.anInt5154 = Static65.anInt1217;
												if (!Static187.method2994(local27, local1697.anInt5149, local1697.anInt5163, local1697.anInt5157, local1697.anInt5158, local1697.aClass12_10.method3355())) {
													if (Static178.aBoolean216) {
														if ((local1697.aLong183 & 0xFC000L) == 147456L) {
															Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
															local894 = local1697.anInt5159 - anInt3456;
															local899 = local1697.anInt5161 - Static165.anInt3299;
															local904 = (int) (local1697.aLong183 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static12.method195(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static12.method195(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static12.method195(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static12.method195(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static12.method204(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local1697.anInt5149, local1697.anInt5157, local1697.anInt5163, local1697.anInt5158);
														}
													}
													local1697.aClass12_10.method3357(local1697.anInt5150, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local1697.anInt5159 - anInt3456, local1697.anInt5162 - Static27.anInt1303, local1697.anInt5161 - Static165.anInt3299, local1697.aLong183, local24, null);
												}
												for (local894 = local1697.anInt5149; local894 <= local1697.anInt5163; local894++) {
													for (local899 = local1697.anInt5157; local899 <= local1697.anInt5158; local899++) {
														@Pc(1863) Class4_Sub11 local1863 = local31[local894][local899];
														if (local1863.anInt1050 != 0) {
															Static170.aClass10_41.method184(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean74) {
															Static170.aClass10_41.method184(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean75) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean75 = false;
											break;
										}
									}
								} while (!local8.aBoolean74);
							} while (local8.anInt1050 != 0);
							if (local18 > Static273.anInt1119 || local18 <= Static106.anInt2266) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean74);
						if (local18 < Static273.anInt1119 || local18 >= Static137.anInt2811 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean74);
					if (local21 > Static89.anInt1839 || local21 <= Static219.anInt4347) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean74);
				if (local21 < Static89.anInt1839 || local21 >= Static77.anInt1474 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean74);
			local8.aBoolean74 = false;
			Static243.anInt4649--;
			@Pc(1999) Class18 local1999 = local8.aClass18_1;
			if (local1999 != null && local1999.anInt446 != 0) {
				if (Static178.aBoolean216) {
					Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
				}
				if (local1999.aClass12_3 != null) {
					local1999.aClass12_3.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local1999.anInt445 - anInt3456, local1999.anInt451 - Static27.anInt1303 - local1999.anInt446, local1999.anInt449 - Static165.anInt3299, local1999.aLong25, local24, null);
				}
				if (local1999.aClass12_1 != null) {
					local1999.aClass12_1.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local1999.anInt445 - anInt3456, local1999.anInt451 - Static27.anInt1303 - local1999.anInt446, local1999.anInt449 - Static165.anInt3299, local1999.aLong25, local24, null);
				}
				if (local1999.aClass12_2 != null) {
					local1999.aClass12_2.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local1999.anInt445 - anInt3456, local1999.anInt451 - Static27.anInt1303 - local1999.anInt446, local1999.anInt449 - Static165.anInt3299, local1999.aLong25, local24, null);
				}
			}
			if (local8.anInt1046 != 0) {
				@Pc(2109) Class104 local2109 = local8.aClass104_1;
				if (local2109 != null && !Static296.method1375(local27, local18, local21, local2109.aClass12_6.method3355())) {
					if ((local2109.anInt3173 & local8.anInt1046) != 0) {
						if (Static178.aBoolean216) {
							Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
						}
						local2109.aClass12_6.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local2109.anInt3171 + local2109.anInt3167 - anInt3456, local2109.anInt3164 - Static27.anInt1303, local2109.anInt3165 + local2109.anInt3166 - Static165.anInt3299, local2109.aLong112, local24, null);
					} else if (local2109.anInt3173 == 256) {
						local65 = local2109.anInt3171 - anInt3456;
						local115 = local2109.anInt3164 - Static27.anInt1303;
						local1332 = local2109.anInt3165 - Static165.anInt3299;
						local894 = local2109.anInt3172;
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
							if (Static178.aBoolean216) {
								Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
							}
							local2109.aClass12_6.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local65 + local2109.anInt3167, local115, local1332 + local2109.anInt3166, local2109.aLong112, local24, null);
						} else if (local2109.aClass12_7 != null) {
							if (Static178.aBoolean216) {
								Static12.method197(anInt3456, Static27.anInt1303, Static165.anInt3299, local24, local18, local21);
							}
							local2109.aClass12_7.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local65, local115, local1332, local2109.aLong112, local24, null);
						}
					}
				}
				@Pc(2275) Class43 local2275 = local8.aClass43_1;
				if (local2275 != null) {
					if ((local2275.anInt1231 & local8.anInt1046) != 0 && !Static65.method1013(local27, local18, local21, local2275.anInt1231)) {
						if (Static178.aBoolean216) {
							Static12.method199(local2275.anInt1231, anInt3456, Static27.anInt1303, Static165.anInt3299, local27, local18, local21);
						}
						local2275.aClass12_4.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local2275.anInt1230 - anInt3456, local2275.anInt1225 - Static27.anInt1303, local2275.anInt1226 - Static165.anInt3299, local2275.aLong44, local24, null);
					}
					if ((local2275.anInt1227 & local8.anInt1046) != 0 && !Static65.method1013(local27, local18, local21, local2275.anInt1227)) {
						if (Static178.aBoolean216) {
							Static12.method199(local2275.anInt1227, anInt3456, Static27.anInt1303, Static165.anInt3299, local27, local18, local21);
						}
						local2275.aClass12_5.method3357(0, Static275.anInt5147, Static54.anInt1076, Static68.anInt1263, Static84.anInt1703, local2275.anInt1230 - anInt3456, local2275.anInt1225 - Static27.anInt1303, local2275.anInt1226 - Static165.anInt3299, local2275.aLong44, local24, null);
					}
				}
			}
			@Pc(2388) Class4_Sub11 local2388;
			if (local24 < Static114.anInt2478 - 1) {
				local2388 = Static127.aClass4_Sub11ArrayArrayArray1[local24 + 1][local18][local21];
				if (local2388 != null && local2388.aBoolean74) {
					Static170.aClass10_41.method184(local2388);
				}
			}
			if (local18 < Static273.anInt1119) {
				local2388 = local31[local18 + 1][local21];
				if (local2388 != null && local2388.aBoolean74) {
					Static170.aClass10_41.method184(local2388);
				}
			}
			if (local21 < Static89.anInt1839) {
				local2388 = local31[local18][local21 + 1];
				if (local2388 != null && local2388.aBoolean74) {
					Static170.aClass10_41.method184(local2388);
				}
			}
			if (local18 > Static273.anInt1119) {
				local2388 = local31[local18 - 1][local21];
				if (local2388 != null && local2388.aBoolean74) {
					Static170.aClass10_41.method184(local2388);
				}
			}
			if (local21 > Static89.anInt1839) {
				local2388 = local31[local18][local21 - 1];
				if (local2388 != null && local2388.aBoolean74) {
					Static170.aClass10_41.method184(local2388);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(SB)Z")
	public static boolean method2721(@OriginalArg(0) short arg0) {
		if (arg0 == 51 || arg0 == 19 || arg0 == 37 || arg0 == 14 || arg0 == 57 || arg0 == 3 || arg0 == 43 || arg0 == 35) {
			return true;
		} else if (arg0 == 49 || arg0 == 50 || arg0 == 1004 || arg0 == 1002) {
			return true;
		} else if (arg0 == 32 || arg0 == 11 || arg0 == 2 || arg0 == 60 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 20 || arg0 == 18 || arg0 == 28 || arg0 == 13 || arg0 == 41 || arg0 == 6;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public static void method2722() {
		anIntArray298 = null;
		aByteArrayArray14 = null;
		aStringArray28 = null;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Lclient!re;")
	public static Class130 method2723() {
		try {
			return (Class130) Class.forName("Class130_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}
