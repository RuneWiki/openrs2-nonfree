import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	public static int anInt770;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt765 = -1;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "S")
	public static short aShort4 = 1;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
	public static int anInt771 = -2;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "[I")
	public static int[] anIntArray54 = new int[32];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method532(@OriginalArg(0) String arg0) {
		if (Static245.aClass130_2 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(15) int local15 = 0; local15 < Static245.aClass130_2.anInt3917; local15++) {
			if (Static9.method80(" ", "<br>", Static245.aClass130_2.aStringArray61[local15]).equals(arg0)) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!pk;II)Z")
	public static boolean method533(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method3177(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static145.method2287(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sg;Z)V")
	public static void method536(@OriginalArg(0) Class8_Sub27 arg0, @OriginalArg(1) boolean arg1) {
		Static50.aClass182_2.method4328(arg0);
		while (true) {
			@Pc(8) Class8_Sub27 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class8_Sub27[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class8_Sub27 local153;
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
										@Pc(363) Class134 var22;
										@Pc(469) boolean var24;
										@Pc(425) Class170 var25;
										@Pc(1179) Class8_Sub27 var32;
										while (true) {
											do {
												local8 = (Class8_Sub27) Static50.aClass182_2.method4326();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean386);
											local18 = local8.anInt4848;
											local21 = local8.anInt4846;
											local24 = local8.anInt4850;
											local27 = local8.anInt4855;
											local31 = Static178.aClass8_Sub27ArrayArrayArray1[local24];
											@Pc(33) float local33 = 0.0F;
											if (Static116.aBoolean188) {
												if (Static222.anIntArrayArrayArray10 == Static195.anIntArrayArrayArray7) {
													var9 = Static176.anIntArrayArray18[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static109.anInt2271) {
														Static109.anInt2271 = var10;
														Static257.method3873(var10);
														Static233.method3554(Static91.method1479());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static211.anInt4342) {
														Static211.anInt4342 = local65;
														Static275.method4084(local65);
													}
													local115 = Static87.anIntArrayArrayArray5[0][local18][local21] + Static87.anIntArrayArrayArray5[0][local18 + 1][local21] + Static87.anIntArrayArrayArray5[0][local18][local21 + 1] + Static87.anIntArrayArrayArray5[0][local18 + 1][local21 + 1] >> 2;
													Static108.method1772(3, -local115);
													local33 = 201.5F;
													Static116.method1868(local33);
												} else {
													local33 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static116.method1868(local33);
												}
											}
											if (!local8.aBoolean387) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static178.aClass8_Sub27ArrayArrayArray1[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean386) {
														continue;
													}
												}
												if (local18 <= Static212.anInt4369 && local18 > Static21.anInt579) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean386 && (local153.aBoolean387 || (local8.anInt4849 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static212.anInt4369 && local18 < Static257.anInt5096 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean386 && (local153.aBoolean387 || (local8.anInt4849 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static136.anInt2745 && local21 > Static270.anInt5342) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean386 && (local153.aBoolean387 || (local8.anInt4849 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static136.anInt2745 && local21 < Static93.anInt1950 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean386 && (local153.aBoolean387 || (local8.anInt4849 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean387 = false;
											if (local8.aClass8_Sub27_1 != null) {
												local153 = local8.aClass8_Sub27_1;
												if (Static116.aBoolean188) {
													Static116.method1868(201.5F - (float) (local153.anInt4855 + 1) * 50.0F);
												}
												if (local153.aClass21_1 == null) {
													if (local153.aClass14_1 != null) {
														if (Static125.method1985(0, local18, local21)) {
															Static180.method2751(local153.aClass14_1, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local18, local21, true);
														} else {
															Static180.method2751(local153.aClass14_1, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local18, local21, false);
														}
													}
												} else if (Static125.method1985(0, local18, local21)) {
													Static291.method2815(local153.aClass21_1, 0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local18, local21, true);
												} else {
													Static291.method2815(local153.aClass21_1, 0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local18, local21, false);
												}
												var22 = local153.aClass134_1;
												if (var22 != null) {
													if (Static116.aBoolean188) {
														if ((var22.anInt4308 & local8.anInt4847) == 0) {
															Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
														} else {
															Static186.method2930(var22.anInt4308, Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local27, local18, local21);
														}
													}
													var22.aClass36_6.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, var22.anInt4311 - Static228.anInt4644, var22.anInt4310 - Static256.anInt5058, var22.anInt4309 - Static64.anInt1382, var22.aLong147, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt4857; local65++) {
													var25 = local153.aClass170Array3[local65];
													if (var25 != null) {
														if (Static116.aBoolean188) {
															Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
														}
														var25.aClass36_10.method4173(var25.anInt5459, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, var25.anInt5449 - Static228.anInt4644, var25.anInt5446 - Static256.anInt5058, var25.anInt5456 - Static64.anInt1382, var25.aLong196, local24, null);
													}
												}
												if (Static116.aBoolean188) {
													Static116.method1868(local33);
												}
											}
											var24 = false;
											if (local8.aClass21_1 == null) {
												if (local8.aClass14_1 != null) {
													if (Static125.method1985(local27, local18, local21)) {
														Static180.method2751(local8.aClass14_1, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local18, local21, true);
													} else {
														var24 = true;
														Static180.method2751(local8.aClass14_1, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local18, local21, false);
													}
												}
											} else if (Static125.method1985(local27, local18, local21)) {
												Static291.method2815(local8.aClass21_1, local27, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local18, local21, true);
											} else {
												var24 = true;
												if (local8.aClass21_1.anInt745 != 12345678 || Static299.aBoolean481 && local24 <= Static74.anInt1607) {
													Static291.method2815(local8.aClass21_1, local27, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local18, local21, false);
												}
											}
											if (var24) {
												@Pc(549) Class120 local549 = local8.aClass120_1;
												if (local549 != null && (local549.aLong127 & 0x80000000L) != 0L) {
													if (Static116.aBoolean188 && local549.aBoolean289) {
														Static116.method1868(local33 + 50.0F - 1.5F);
													}
													if (Static116.aBoolean188) {
														Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
													}
													local549.aClass36_5.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local549.anInt3473 - Static228.anInt4644, local549.anInt3475 - Static256.anInt5058, local549.anInt3476 - Static64.anInt1382, local549.aLong127, local24, null);
													if (Static116.aBoolean188 && local549.aBoolean289) {
														Static116.method1868(local33);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class134 local616 = local8.aClass134_1;
											@Pc(619) Class141 local619 = local8.aClass141_1;
											if (local616 != null || local619 != null) {
												if (Static212.anInt4369 == local18) {
													var10++;
												} else if (Static212.anInt4369 < local18) {
													var10 += 2;
												}
												if (Static136.anInt2745 == local21) {
													var10 += 3;
												} else if (Static136.anInt2745 > local21) {
													var10 += 6;
												}
												local65 = Static59.anIntArray86[var10];
												local8.anInt4847 = Static89.anIntArray129[var10];
											}
											if (local616 != null) {
												if ((local616.anInt4308 & Static81.anIntArray121[var10]) == 0) {
													local8.anInt4853 = 0;
												} else if (local616.anInt4308 == 16) {
													local8.anInt4853 = 3;
													local8.anInt4843 = Static87.anIntArray125[var10];
													local8.anInt4856 = 3 - local8.anInt4843;
												} else if (local616.anInt4308 == 32) {
													local8.anInt4853 = 6;
													local8.anInt4843 = Static218.anIntArray334[var10];
													local8.anInt4856 = 6 - local8.anInt4843;
												} else if (local616.anInt4308 == 64) {
													local8.anInt4853 = 12;
													local8.anInt4843 = Static288.anIntArray93[var10];
													local8.anInt4856 = 12 - local8.anInt4843;
												} else {
													local8.anInt4853 = 9;
													local8.anInt4843 = Static45.anIntArray472[var10];
													local8.anInt4856 = 9 - local8.anInt4843;
												}
												if ((local616.anInt4308 & local65) != 0 && !Static87.method1418(local27, local18, local21, local616.anInt4308)) {
													if (Static116.aBoolean188) {
														Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
													}
													local616.aClass36_6.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local616.anInt4311 - Static228.anInt4644, local616.anInt4310 - Static256.anInt5058, local616.anInt4309 - Static64.anInt1382, local616.aLong147, local24, null);
												}
												if ((local616.anInt4314 & local65) != 0 && !Static87.method1418(local27, local18, local21, local616.anInt4314)) {
													if (Static116.aBoolean188) {
														Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
													}
													local616.aClass36_7.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local616.anInt4311 - Static228.anInt4644, local616.anInt4310 - Static256.anInt5058, local616.anInt4309 - Static64.anInt1382, local616.aLong147, local24, null);
												}
											}
											if (local619 != null && !Static28.method472(local27, local18, local21, local619.aClass36_8.method4175())) {
												if (Static116.aBoolean188) {
													Static116.method1868(local33 - 0.5F);
												}
												if ((local619.anInt4617 & local65) != 0) {
													if (Static116.aBoolean188) {
														Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
													}
													local619.aClass36_8.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local619.anInt4610 + local619.anInt4613 - Static228.anInt4644, local619.anInt4618 - Static256.anInt5058, local619.anInt4612 + local619.anInt4607 - Static64.anInt1382, local619.aLong166, local24, null);
												} else if (local619.anInt4617 == 256) {
													local894 = local619.anInt4610 - Static228.anInt4644;
													local899 = local619.anInt4618 - Static256.anInt5058;
													local904 = local619.anInt4612 - Static64.anInt1382;
													var17 = local619.anInt4615;
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
														if (Static116.aBoolean188) {
															Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
														}
														local619.aClass36_8.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local894 + local619.anInt4613, local899, local904 + local619.anInt4607, local619.aLong166, local24, null);
													} else if (local619.aClass36_9 != null) {
														if (Static116.aBoolean188) {
															Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
														}
														local619.aClass36_9.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local894, local899, local904, local619.aLong166, local24, null);
													}
												}
												if (Static116.aBoolean188) {
													Static116.method1868(local33);
												}
											}
											if (var24) {
												@Pc(1001) Class120 local1001 = local8.aClass120_1;
												if (local1001 != null && (local1001.aLong127 & 0x80000000L) == 0L) {
													if (Static116.aBoolean188 && local1001.aBoolean289) {
														Static116.method1868(local33 + 50.0F - 1.5F);
													}
													if (Static116.aBoolean188) {
														Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
													}
													local1001.aClass36_5.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local1001.anInt3473 - Static228.anInt4644, local1001.anInt3475 - Static256.anInt5058, local1001.anInt3476 - Static64.anInt1382, local1001.aLong127, local24, null);
													if (Static116.aBoolean188 && local1001.aBoolean289) {
														Static116.method1868(local33);
													}
												}
												@Pc(1064) Class95 local1064 = local8.aClass95_1;
												if (local1064 != null && local1064.anInt2779 == 0) {
													if (Static116.aBoolean188) {
														Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
													}
													if (local1064.aClass36_2 != null) {
														local1064.aClass36_2.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local1064.anInt2781 - Static228.anInt4644, local1064.anInt2785 - Static256.anInt5058, local1064.anInt2783 - Static64.anInt1382, local1064.aLong105, local24, null);
													}
													if (local1064.aClass36_4 != null) {
														local1064.aClass36_4.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local1064.anInt2781 - Static228.anInt4644, local1064.anInt2785 - Static256.anInt5058, local1064.anInt2783 - Static64.anInt1382, local1064.aLong105, local24, null);
													}
													if (local1064.aClass36_3 != null) {
														local1064.aClass36_3.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local1064.anInt2781 - Static228.anInt4644, local1064.anInt2785 - Static256.anInt5058, local1064.anInt2783 - Static64.anInt1382, local1064.aLong105, local24, null);
													}
												}
											}
											local894 = local8.anInt4849;
											if (local894 != 0) {
												if (local18 < Static212.anInt4369 && (local894 & 0x4) != 0) {
													var32 = local31[local18 + 1][local21];
													if (var32 != null && var32.aBoolean386) {
														Static50.aClass182_2.method4328(var32);
													}
												}
												if (local21 < Static136.anInt2745 && (local894 & 0x2) != 0) {
													var32 = local31[local18][local21 + 1];
													if (var32 != null && var32.aBoolean386) {
														Static50.aClass182_2.method4328(var32);
													}
												}
												if (local18 > Static212.anInt4369 && (local894 & 0x1) != 0) {
													var32 = local31[local18 - 1][local21];
													if (var32 != null && var32.aBoolean386) {
														Static50.aClass182_2.method4328(var32);
													}
												}
												if (local21 > Static136.anInt2745 && (local894 & 0x8) != 0) {
													var32 = local31[local18][local21 - 1];
													if (var32 != null && var32.aBoolean386) {
														Static50.aClass182_2.method4328(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt4853 != 0) {
											var24 = true;
											for (var10 = 0; var10 < local8.anInt4857; var10++) {
												if (local8.aClass170Array3[var10].anInt5453 != Static258.anInt5165 && (local8.anIntArray367[var10] & local8.anInt4853) == local8.anInt4843) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												var22 = local8.aClass134_1;
												if (!Static87.method1418(local27, local18, local21, var22.anInt4308)) {
													if (Static116.aBoolean188) {
														label882: {
															if ((var22.aLong147 & 0xFC000L) == 16384L) {
																local65 = var22.anInt4311 - Static228.anInt4644;
																local115 = var22.anInt4309 - Static64.anInt1382;
																local1332 = (int) (var22.aLong147 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static27.anInt665 - 1) {
																		Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18 - 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static24.anInt639 - 1 && local21 < Static27.anInt665 - 1) {
																		Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18 + 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static24.anInt639 - 1 && local21 > 0) {
																		Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18 + 1, local21 - 1);
																		break label882;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18 - 1, local21 - 1);
																		break label882;
																	}
																}
															}
															Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
														}
													}
													var22.aClass36_6.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, var22.anInt4311 - Static228.anInt4644, var22.anInt4310 - Static256.anInt5058, var22.anInt4309 - Static64.anInt1382, var22.aLong147, local24, null);
												}
												local8.anInt4853 = 0;
											}
										}
										if (!local8.aBoolean388) {
											break;
										}
										try {
											var9 = local8.anInt4857;
											local8.aBoolean388 = false;
											var10 = 0;
											label767: for (local65 = 0; local65 < var9; local65++) {
												var25 = local8.aClass170Array3[local65];
												if (var25.anInt5453 != Static258.anInt5165) {
													for (local1332 = var25.anInt5463; local1332 <= var25.anInt5455; local1332++) {
														for (local894 = var25.anInt5460; local894 <= var25.anInt5458; local894++) {
															var32 = local31[local1332][local894];
															if (var32.aBoolean387) {
																local8.aBoolean388 = true;
																continue label767;
															}
															if (var32.anInt4853 != 0) {
																local904 = 0;
																if (local1332 > var25.anInt5463) {
																	local904++;
																}
																if (local1332 < var25.anInt5455) {
																	local904 += 4;
																}
																if (local894 > var25.anInt5460) {
																	local904 += 8;
																}
																if (local894 < var25.anInt5458) {
																	local904 += 2;
																}
																if ((local904 & var32.anInt4853) == local8.anInt4856) {
																	local8.aBoolean388 = true;
																	continue label767;
																}
															}
														}
													}
													Static197.aClass170Array2[var10++] = var25;
													local1332 = Static212.anInt4369 - var25.anInt5463;
													local894 = var25.anInt5455 - Static212.anInt4369;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static136.anInt2745 - var25.anInt5460;
													local904 = var25.anInt5458 - Static136.anInt2745;
													if (local904 > local899) {
														var25.anInt5457 = local1332 + local904;
													} else {
														var25.anInt5457 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class170 local1628 = Static197.aClass170Array2[local1332];
													if (local1628.anInt5453 != Static258.anInt5165) {
														if (local1628.anInt5457 > local65) {
															local65 = local1628.anInt5457;
															local115 = local1332;
														} else if (local1628.anInt5457 == local65) {
															local899 = local1628.anInt5449 - Static228.anInt4644;
															local904 = local1628.anInt5456 - Static64.anInt1382;
															var17 = Static197.aClass170Array2[local115].anInt5449 - Static228.anInt4644;
															var18 = Static197.aClass170Array2[local115].anInt5456 - Static64.anInt1382;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class170 local1697 = Static197.aClass170Array2[local115];
												local1697.anInt5453 = Static258.anInt5165;
												if (!Static99.method1578(local27, local1697.anInt5463, local1697.anInt5455, local1697.anInt5460, local1697.anInt5458, local1697.aClass36_10.method4175())) {
													if (Static116.aBoolean188) {
														if ((local1697.aLong196 & 0xFC000L) == 147456L) {
															Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
															local894 = local1697.anInt5449 - Static228.anInt4644;
															local899 = local1697.anInt5456 - Static64.anInt1382;
															local904 = (int) (local1697.aLong196 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static186.method2926(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static186.method2926(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static186.method2926(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static186.method2926(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static186.method2922(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local1697.anInt5463, local1697.anInt5460, local1697.anInt5455, local1697.anInt5458);
														}
													}
													local1697.aClass36_10.method4173(local1697.anInt5459, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local1697.anInt5449 - Static228.anInt4644, local1697.anInt5446 - Static256.anInt5058, local1697.anInt5456 - Static64.anInt1382, local1697.aLong196, local24, null);
												}
												for (local894 = local1697.anInt5463; local894 <= local1697.anInt5455; local894++) {
													for (local899 = local1697.anInt5460; local899 <= local1697.anInt5458; local899++) {
														@Pc(1863) Class8_Sub27 local1863 = local31[local894][local899];
														if (local1863.anInt4853 != 0) {
															Static50.aClass182_2.method4328(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean386) {
															Static50.aClass182_2.method4328(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean388) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean388 = false;
											break;
										}
									}
								} while (!local8.aBoolean386);
							} while (local8.anInt4853 != 0);
							if (local18 > Static212.anInt4369 || local18 <= Static21.anInt579) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean386);
						if (local18 < Static212.anInt4369 || local18 >= Static257.anInt5096 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean386);
					if (local21 > Static136.anInt2745 || local21 <= Static270.anInt5342) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean386);
				if (local21 < Static136.anInt2745 || local21 >= Static93.anInt1950 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean386);
			local8.aBoolean386 = false;
			Static175.anInt3465--;
			@Pc(1999) Class95 local1999 = local8.aClass95_1;
			if (local1999 != null && local1999.anInt2779 != 0) {
				if (Static116.aBoolean188) {
					Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
				}
				if (local1999.aClass36_2 != null) {
					local1999.aClass36_2.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local1999.anInt2781 - Static228.anInt4644, local1999.anInt2785 - Static256.anInt5058 - local1999.anInt2779, local1999.anInt2783 - Static64.anInt1382, local1999.aLong105, local24, null);
				}
				if (local1999.aClass36_4 != null) {
					local1999.aClass36_4.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local1999.anInt2781 - Static228.anInt4644, local1999.anInt2785 - Static256.anInt5058 - local1999.anInt2779, local1999.anInt2783 - Static64.anInt1382, local1999.aLong105, local24, null);
				}
				if (local1999.aClass36_3 != null) {
					local1999.aClass36_3.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local1999.anInt2781 - Static228.anInt4644, local1999.anInt2785 - Static256.anInt5058 - local1999.anInt2779, local1999.anInt2783 - Static64.anInt1382, local1999.aLong105, local24, null);
				}
			}
			if (local8.anInt4847 != 0) {
				@Pc(2109) Class141 local2109 = local8.aClass141_1;
				if (local2109 != null && !Static28.method472(local27, local18, local21, local2109.aClass36_8.method4175())) {
					if ((local2109.anInt4617 & local8.anInt4847) != 0) {
						if (Static116.aBoolean188) {
							Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
						}
						local2109.aClass36_8.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local2109.anInt4610 + local2109.anInt4613 - Static228.anInt4644, local2109.anInt4618 - Static256.anInt5058, local2109.anInt4612 + local2109.anInt4607 - Static64.anInt1382, local2109.aLong166, local24, null);
					} else if (local2109.anInt4617 == 256) {
						local65 = local2109.anInt4610 - Static228.anInt4644;
						local115 = local2109.anInt4618 - Static256.anInt5058;
						local1332 = local2109.anInt4612 - Static64.anInt1382;
						local894 = local2109.anInt4615;
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
							if (Static116.aBoolean188) {
								Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
							}
							local2109.aClass36_8.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local65 + local2109.anInt4613, local115, local1332 + local2109.anInt4607, local2109.aLong166, local24, null);
						} else if (local2109.aClass36_9 != null) {
							if (Static116.aBoolean188) {
								Static186.method2924(Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local24, local18, local21);
							}
							local2109.aClass36_9.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local65, local115, local1332, local2109.aLong166, local24, null);
						}
					}
				}
				@Pc(2275) Class134 local2275 = local8.aClass134_1;
				if (local2275 != null) {
					if ((local2275.anInt4314 & local8.anInt4847) != 0 && !Static87.method1418(local27, local18, local21, local2275.anInt4314)) {
						if (Static116.aBoolean188) {
							Static186.method2930(local2275.anInt4314, Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local27, local18, local21);
						}
						local2275.aClass36_7.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local2275.anInt4311 - Static228.anInt4644, local2275.anInt4310 - Static256.anInt5058, local2275.anInt4309 - Static64.anInt1382, local2275.aLong147, local24, null);
					}
					if ((local2275.anInt4308 & local8.anInt4847) != 0 && !Static87.method1418(local27, local18, local21, local2275.anInt4308)) {
						if (Static116.aBoolean188) {
							Static186.method2930(local2275.anInt4308, Static228.anInt4644, Static256.anInt5058, Static64.anInt1382, local27, local18, local21);
						}
						local2275.aClass36_6.method4173(0, Static23.anInt625, Static230.anInt4681, Static79.anInt1719, Static227.anInt4635, local2275.anInt4311 - Static228.anInt4644, local2275.anInt4310 - Static256.anInt5058, local2275.anInt4309 - Static64.anInt1382, local2275.aLong147, local24, null);
					}
				}
			}
			@Pc(2388) Class8_Sub27 local2388;
			if (local24 < Static54.anInt1199 - 1) {
				local2388 = Static178.aClass8_Sub27ArrayArrayArray1[local24 + 1][local18][local21];
				if (local2388 != null && local2388.aBoolean386) {
					Static50.aClass182_2.method4328(local2388);
				}
			}
			if (local18 < Static212.anInt4369) {
				local2388 = local31[local18 + 1][local21];
				if (local2388 != null && local2388.aBoolean386) {
					Static50.aClass182_2.method4328(local2388);
				}
			}
			if (local21 < Static136.anInt2745) {
				local2388 = local31[local18][local21 + 1];
				if (local2388 != null && local2388.aBoolean386) {
					Static50.aClass182_2.method4328(local2388);
				}
			}
			if (local18 > Static212.anInt4369) {
				local2388 = local31[local18 - 1][local21];
				if (local2388 != null && local2388.aBoolean386) {
					Static50.aClass182_2.method4328(local2388);
				}
			}
			if (local21 > Static136.anInt2745) {
				local2388 = local31[local18][local21 - 1];
				if (local2388 != null && local2388.aBoolean386) {
					Static50.aClass182_2.method4328(local2388);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIILclient!eh;IZJ)Z")
	public static boolean method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class36 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static195.anIntArrayArrayArray7 == Static222.anIntArrayArrayArray10;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static24.anInt639 || local17 >= Static27.anInt665) {
					return false;
				}
				@Pc(42) Class8_Sub27 local42 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][local10][local17];
				if (local42 != null && local42.anInt4857 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class170 local58 = new Class170();
		local58.aLong196 = arg11;
		local58.anInt5454 = arg0;
		local58.anInt5449 = arg5;
		local58.anInt5456 = arg6;
		local58.anInt5446 = arg7;
		local58.aClass36_10 = arg8;
		local58.anInt5459 = arg9;
		local58.anInt5463 = arg1;
		local58.anInt5460 = arg2;
		local58.anInt5455 = arg1 + arg3 - 1;
		local58.anInt5458 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static178.aClass8_Sub27ArrayArrayArray1[local141][local17][local108] == null) {
						Static178.aClass8_Sub27ArrayArrayArray1[local141][local17][local108] = new Class8_Sub27(local141, local17, local108);
					}
				}
				@Pc(174) Class8_Sub27 local174 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][local17][local108];
				local174.aClass170Array3[local174.anInt4857] = local58;
				local174.anIntArray367[local174.anInt4857] = local115;
				local174.anInt4849 |= local115;
				local174.anInt4857++;
				if (local6 && Static176.anIntArrayArray18[local17][local108] != 0) {
					local8 = Static176.anIntArrayArray18[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static176.anIntArrayArray18[local17][local108] == 0) {
						Static176.anIntArrayArray18[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static174.aClass170Array1[Static295.anInt3736++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lclient!td;)V")
	public static void method538(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub29[] arg1) {
		Static106.aClass8_Sub29ArrayArray4[arg0] = arg1;
	}
}
