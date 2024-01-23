import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public static int anInt4658;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lclient!ng;")
	public static Class115[] aClass115Array1 = new Class115[50];

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString156 = "wishes to trade with you.";

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	public static int anInt4661 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[III[J)V")
	public static void method3641(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(26) int local26 = (arg1 + arg2) / 2;
		@Pc(28) int local28 = arg2;
		@Pc(32) long local32 = arg3[local26];
		arg3[local26] = arg3[arg1];
		arg3[arg1] = local32;
		@Pc(46) int local46 = arg0[local26];
		arg0[local26] = arg0[arg1];
		arg0[arg1] = local46;
		for (@Pc(58) int local58 = arg2; local58 < arg1; local58++) {
			if (arg3[local58] < (long) (local58 & 0x1) + local32) {
				@Pc(77) long local77 = arg3[local58];
				arg3[local58] = arg3[local28];
				arg3[local28] = local77;
				@Pc(91) int local91 = arg0[local58];
				arg0[local58] = arg0[local28];
				arg0[local28++] = local91;
			}
		}
		arg3[arg1] = arg3[local28];
		arg3[local28] = local32;
		arg0[arg1] = arg0[local28];
		arg0[local28] = local46;
		method3641(arg0, local28 - 1, arg2, arg3);
		method3641(arg0, arg1, local28 + 1, arg3);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!k;Z)V")
	public static void method3643(@OriginalArg(0) Class4_Sub21 arg0, @OriginalArg(1) boolean arg1) {
		Static254.aClass17_28.method619(arg0);
		while (true) {
			@Pc(8) Class4_Sub21 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class4_Sub21[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class4_Sub21 local153;
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
										@Pc(363) Class181 var30;
										@Pc(469) boolean var32;
										@Pc(425) Class99 var33;
										@Pc(1179) Class4_Sub21 var39;
										while (true) {
											do {
												local8 = (Class4_Sub21) Static254.aClass17_28.method617();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean175);
											local18 = local8.anInt2701;
											local21 = local8.anInt2691;
											local24 = local8.anInt2696;
											local27 = local8.anInt2699;
											local31 = Static261.aClass4_Sub21ArrayArrayArray4[local24];
											var8 = 0.0F;
											if (Static251.aBoolean330) {
												if (Static127.anIntArrayArrayArray3 == Static154.anIntArrayArrayArray5) {
													var9 = Static149.anIntArrayArray17[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static48.anInt1081) {
														Static48.anInt1081 = var10;
														Static278.method4265(var10);
														Static290.method4525(Static39.method722());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static292.anInt5678) {
														Static292.anInt5678 = local65;
														Static20.method2330(local65);
													}
													local115 = Static230.anIntArrayArrayArray12[0][local18][local21] + Static230.anIntArrayArrayArray12[0][local18 + 1][local21] + Static230.anIntArrayArrayArray12[0][local18][local21 + 1] + Static230.anIntArrayArrayArray12[0][local18 + 1][local21 + 1] >> 2;
													Static126.method2046(-local115, 3);
													var8 = 201.5F;
													Static251.method3861(var8);
												} else {
													var8 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static251.method3861(var8);
												}
											}
											if (!local8.aBoolean172) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static261.aClass4_Sub21ArrayArrayArray4[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean175) {
														continue;
													}
												}
												if (local18 <= Static279.anInt5465 && local18 > Static65.anInt5706) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean175 && (local153.aBoolean172 || (local8.anInt2695 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static279.anInt5465 && local18 < Static67.anInt1406 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean175 && (local153.aBoolean172 || (local8.anInt2695 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static91.anInt1810 && local21 > Static274.anInt5441) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean175 && (local153.aBoolean172 || (local8.anInt2695 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static91.anInt1810 && local21 < Static158.anInt3235 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean175 && (local153.aBoolean172 || (local8.anInt2695 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean172 = false;
											if (local8.aClass4_Sub21_1 != null) {
												local153 = local8.aClass4_Sub21_1;
												if (Static251.aBoolean330) {
													Static251.method3861(201.5F - (float) (local153.anInt2699 + 1) * 50.0F);
												}
												if (local153.aClass131_1 == null) {
													if (local153.aClass187_1 != null) {
														if (Static309.method1137(0, local18, local21)) {
															Static140.method2237(local153.aClass187_1, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local18, local21, true);
														} else {
															Static140.method2237(local153.aClass187_1, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local18, local21, false);
														}
													}
												} else if (Static309.method1137(0, local18, local21)) {
													Static238.method3145(local153.aClass131_1, 0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local18, local21, true);
												} else {
													Static238.method3145(local153.aClass131_1, 0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local18, local21, false);
												}
												var30 = local153.aClass181_1;
												if (var30 != null) {
													if (Static251.aBoolean330) {
														if ((var30.anInt5713 & local8.anInt2700) == 0) {
															Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
														} else {
															Static142.method2275(var30.anInt5713, Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local27, local18, local21);
														}
													}
													var30.aClass13_9.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, var30.anInt5714 - Static54.anInt1239, var30.anInt5720 - Static222.anInt4471, var30.anInt5721 - Static179.anInt3613, var30.aLong206, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt2694; local65++) {
													var33 = local153.aClass99Array19[local65];
													if (var33 != null) {
														if (Static251.aBoolean330) {
															Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
														}
														var33.aClass13_4.method4262(var33.anInt3229, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, var33.anInt3224 - Static54.anInt1239, var33.anInt3227 - Static222.anInt4471, var33.anInt3219 - Static179.anInt3613, var33.aLong117, local24, null);
													}
												}
												if (Static251.aBoolean330) {
													Static251.method3861(var8);
												}
											}
											var32 = false;
											if (local8.aClass131_1 == null) {
												if (local8.aClass187_1 != null) {
													if (Static309.method1137(local27, local18, local21)) {
														Static140.method2237(local8.aClass187_1, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local18, local21, true);
													} else {
														var32 = true;
														Static140.method2237(local8.aClass187_1, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local18, local21, false);
													}
												}
											} else if (Static309.method1137(local27, local18, local21)) {
												Static238.method3145(local8.aClass131_1, local27, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local18, local21, true);
											} else {
												var32 = true;
												if (local8.aClass131_1.anInt4075 != 12345678 || Static201.aBoolean247 && local24 <= Static298.anInt5314) {
													Static238.method3145(local8.aClass131_1, local27, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local18, local21, false);
												}
											}
											if (var32) {
												@Pc(549) Class67 local549 = local8.aClass67_1;
												if (local549 != null && (local549.aLong80 & 0x80000000L) != 0L) {
													if (Static251.aBoolean330 && local549.aBoolean123) {
														Static251.method3861(var8 + 50.0F - 1.5F);
													}
													if (Static251.aBoolean330) {
														Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
													}
													local549.aClass13_3.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local549.anInt2118 - Static54.anInt1239, local549.anInt2116 - Static222.anInt4471, local549.anInt2120 - Static179.anInt3613, local549.aLong80, local24, null);
													if (Static251.aBoolean330 && local549.aBoolean123) {
														Static251.method3861(var8);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class181 local616 = local8.aClass181_1;
											@Pc(619) Class35 local619 = local8.aClass35_1;
											if (local616 != null || local619 != null) {
												if (Static279.anInt5465 == local18) {
													var10++;
												} else if (Static279.anInt5465 < local18) {
													var10 += 2;
												}
												if (Static91.anInt1810 == local21) {
													var10 += 3;
												} else if (Static91.anInt1810 > local21) {
													var10 += 6;
												}
												local65 = Static298.anIntArray416[var10];
												local8.anInt2700 = Static59.anIntArray126[var10];
											}
											if (local616 != null) {
												if ((local616.anInt5713 & Static253.anIntArray389[var10]) == 0) {
													local8.anInt2697 = 0;
												} else if (local616.anInt5713 == 16) {
													local8.anInt2697 = 3;
													local8.anInt2693 = Static118.anIntArray212[var10];
													local8.anInt2692 = 3 - local8.anInt2693;
												} else if (local616.anInt5713 == 32) {
													local8.anInt2697 = 6;
													local8.anInt2693 = Static65.anIntArray459[var10];
													local8.anInt2692 = 6 - local8.anInt2693;
												} else if (local616.anInt5713 == 64) {
													local8.anInt2697 = 12;
													local8.anInt2693 = Static153.anIntArray247[var10];
													local8.anInt2692 = 12 - local8.anInt2693;
												} else {
													local8.anInt2697 = 9;
													local8.anInt2693 = Static175.anIntArray298[var10];
													local8.anInt2692 = 9 - local8.anInt2693;
												}
												if ((local616.anInt5713 & local65) != 0 && !Static14.method265(local27, local18, local21, local616.anInt5713)) {
													if (Static251.aBoolean330) {
														Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
													}
													local616.aClass13_9.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local616.anInt5714 - Static54.anInt1239, local616.anInt5720 - Static222.anInt4471, local616.anInt5721 - Static179.anInt3613, local616.aLong206, local24, null);
												}
												if ((local616.anInt5718 & local65) != 0 && !Static14.method265(local27, local18, local21, local616.anInt5718)) {
													if (Static251.aBoolean330) {
														Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
													}
													local616.aClass13_10.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local616.anInt5714 - Static54.anInt1239, local616.anInt5720 - Static222.anInt4471, local616.anInt5721 - Static179.anInt3613, local616.aLong206, local24, null);
												}
											}
											if (local619 != null && !Static29.method610(local27, local18, local21, local619.aClass13_2.method4266())) {
												if (Static251.aBoolean330) {
													Static251.method3861(var8 - 0.5F);
												}
												if ((local619.anInt1242 & local65) != 0) {
													if (Static251.aBoolean330) {
														Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
													}
													local619.aClass13_2.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local619.anInt1244 + local619.anInt1240 - Static54.anInt1239, local619.anInt1246 - Static222.anInt4471, local619.anInt1249 + local619.anInt1248 - Static179.anInt3613, local619.aLong48, local24, null);
												} else if (local619.anInt1242 == 256) {
													local894 = local619.anInt1244 - Static54.anInt1239;
													local899 = local619.anInt1246 - Static222.anInt4471;
													local904 = local619.anInt1249 - Static179.anInt3613;
													var17 = local619.anInt1247;
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
														if (Static251.aBoolean330) {
															Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
														}
														local619.aClass13_2.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local894 + local619.anInt1240, local899, local904 + local619.anInt1248, local619.aLong48, local24, null);
													} else if (local619.aClass13_1 != null) {
														if (Static251.aBoolean330) {
															Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
														}
														local619.aClass13_1.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local894, local899, local904, local619.aLong48, local24, null);
													}
												}
												if (Static251.aBoolean330) {
													Static251.method3861(var8);
												}
											}
											if (var32) {
												@Pc(1001) Class67 local1001 = local8.aClass67_1;
												if (local1001 != null && (local1001.aLong80 & 0x80000000L) == 0L) {
													if (Static251.aBoolean330 && local1001.aBoolean123) {
														Static251.method3861(var8 + 50.0F - 1.5F);
													}
													if (Static251.aBoolean330) {
														Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
													}
													local1001.aClass13_3.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local1001.anInt2118 - Static54.anInt1239, local1001.anInt2116 - Static222.anInt4471, local1001.anInt2120 - Static179.anInt3613, local1001.aLong80, local24, null);
													if (Static251.aBoolean330 && local1001.aBoolean123) {
														Static251.method3861(var8);
													}
												}
												@Pc(1064) Class127 local1064 = local8.aClass127_1;
												if (local1064 != null && local1064.anInt4023 == 0) {
													if (Static251.aBoolean330) {
														Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
													}
													if (local1064.aClass13_5 != null) {
														local1064.aClass13_5.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local1064.anInt4020 - Static54.anInt1239, local1064.anInt4021 - Static222.anInt4471, local1064.anInt4022 - Static179.anInt3613, local1064.aLong145, local24, null);
													}
													if (local1064.aClass13_6 != null) {
														local1064.aClass13_6.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local1064.anInt4020 - Static54.anInt1239, local1064.anInt4021 - Static222.anInt4471, local1064.anInt4022 - Static179.anInt3613, local1064.aLong145, local24, null);
													}
													if (local1064.aClass13_7 != null) {
														local1064.aClass13_7.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local1064.anInt4020 - Static54.anInt1239, local1064.anInt4021 - Static222.anInt4471, local1064.anInt4022 - Static179.anInt3613, local1064.aLong145, local24, null);
													}
												}
											}
											local894 = local8.anInt2695;
											if (local894 != 0) {
												if (local18 < Static279.anInt5465 && (local894 & 0x4) != 0) {
													var39 = local31[local18 + 1][local21];
													if (var39 != null && var39.aBoolean175) {
														Static254.aClass17_28.method619(var39);
													}
												}
												if (local21 < Static91.anInt1810 && (local894 & 0x2) != 0) {
													var39 = local31[local18][local21 + 1];
													if (var39 != null && var39.aBoolean175) {
														Static254.aClass17_28.method619(var39);
													}
												}
												if (local18 > Static279.anInt5465 && (local894 & 0x1) != 0) {
													var39 = local31[local18 - 1][local21];
													if (var39 != null && var39.aBoolean175) {
														Static254.aClass17_28.method619(var39);
													}
												}
												if (local21 > Static91.anInt1810 && (local894 & 0x8) != 0) {
													var39 = local31[local18][local21 - 1];
													if (var39 != null && var39.aBoolean175) {
														Static254.aClass17_28.method619(var39);
													}
												}
											}
											break;
										}
										if (local8.anInt2697 != 0) {
											var32 = true;
											for (var10 = 0; var10 < local8.anInt2694; var10++) {
												if (local8.aClass99Array19[var10].anInt3220 != Static151.anInt2970 && (local8.anIntArray227[var10] & local8.anInt2697) == local8.anInt2693) {
													var32 = false;
													break;
												}
											}
											if (var32) {
												var30 = local8.aClass181_1;
												if (!Static14.method265(local27, local18, local21, var30.anInt5713)) {
													if (Static251.aBoolean330) {
														label1037: {
															if ((var30.aLong206 & 0xFC000L) == 16384L) {
																local65 = var30.anInt5714 - Static54.anInt1239;
																local115 = var30.anInt5721 - Static179.anInt3613;
																local1332 = (int) (var30.aLong206 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static64.anInt1393 - 1) {
																		Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18 - 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static246.anInt4853 - 1 && local21 < Static64.anInt1393 - 1) {
																		Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18 + 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static246.anInt4853 - 1 && local21 > 0) {
																		Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18 + 1, local21 - 1);
																		break label1037;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18 - 1, local21 - 1);
																		break label1037;
																	}
																}
															}
															Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
														}
													}
													var30.aClass13_9.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, var30.anInt5714 - Static54.anInt1239, var30.anInt5720 - Static222.anInt4471, var30.anInt5721 - Static179.anInt3613, var30.aLong206, local24, null);
												}
												local8.anInt2697 = 0;
											}
										}
										if (!local8.aBoolean174) {
											break;
										}
										try {
											var9 = local8.anInt2694;
											local8.aBoolean174 = false;
											var10 = 0;
											label844: for (local65 = 0; local65 < var9; local65++) {
												var33 = local8.aClass99Array19[local65];
												if (var33.anInt3220 != Static151.anInt2970) {
													for (local1332 = var33.anInt3225; local1332 <= var33.anInt3223; local1332++) {
														for (local894 = var33.anInt3222; local894 <= var33.anInt3221; local894++) {
															var39 = local31[local1332][local894];
															if (var39.aBoolean172) {
																local8.aBoolean174 = true;
																continue label844;
															}
															if (var39.anInt2697 != 0) {
																local904 = 0;
																if (local1332 > var33.anInt3225) {
																	local904++;
																}
																if (local1332 < var33.anInt3223) {
																	local904 += 4;
																}
																if (local894 > var33.anInt3222) {
																	local904 += 8;
																}
																if (local894 < var33.anInt3221) {
																	local904 += 2;
																}
																if ((local904 & var39.anInt2697) == local8.anInt2692) {
																	local8.aBoolean174 = true;
																	continue label844;
																}
															}
														}
													}
													Static102.aClass99Array13[var10++] = var33;
													local1332 = Static279.anInt5465 - var33.anInt3225;
													local894 = var33.anInt3223 - Static279.anInt5465;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static91.anInt1810 - var33.anInt3222;
													local904 = var33.anInt3221 - Static91.anInt1810;
													if (local904 > local899) {
														var33.anInt3232 = local1332 + local904;
													} else {
														var33.anInt3232 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class99 local1628 = Static102.aClass99Array13[local1332];
													if (local1628.anInt3220 != Static151.anInt2970) {
														if (local1628.anInt3232 > local65) {
															local65 = local1628.anInt3232;
															local115 = local1332;
														} else if (local1628.anInt3232 == local65) {
															local899 = local1628.anInt3224 - Static54.anInt1239;
															local904 = local1628.anInt3219 - Static179.anInt3613;
															var17 = Static102.aClass99Array13[local115].anInt3224 - Static54.anInt1239;
															var18 = Static102.aClass99Array13[local115].anInt3219 - Static179.anInt3613;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class99 local1697 = Static102.aClass99Array13[local115];
												local1697.anInt3220 = Static151.anInt2970;
												if (!Static295.method4585(local27, local1697.anInt3225, local1697.anInt3223, local1697.anInt3222, local1697.anInt3221, local1697.aClass13_4.method4266())) {
													if (Static251.aBoolean330) {
														if ((local1697.aLong117 & 0xFC000L) == 147456L) {
															Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
															local894 = local1697.anInt3224 - Static54.anInt1239;
															local899 = local1697.anInt3219 - Static179.anInt3613;
															local904 = (int) (local1697.aLong117 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static142.method2278(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static142.method2278(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static142.method2278(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static142.method2278(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static142.method2285(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local1697.anInt3225, local1697.anInt3222, local1697.anInt3223, local1697.anInt3221);
														}
													}
													local1697.aClass13_4.method4262(local1697.anInt3229, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local1697.anInt3224 - Static54.anInt1239, local1697.anInt3227 - Static222.anInt4471, local1697.anInt3219 - Static179.anInt3613, local1697.aLong117, local24, null);
												}
												for (local894 = local1697.anInt3225; local894 <= local1697.anInt3223; local894++) {
													for (local899 = local1697.anInt3222; local899 <= local1697.anInt3221; local899++) {
														@Pc(1863) Class4_Sub21 local1863 = local31[local894][local899];
														if (local1863.anInt2697 != 0) {
															Static254.aClass17_28.method619(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean175) {
															Static254.aClass17_28.method619(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean174) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean174 = false;
											break;
										}
									}
									if (local8.aClass158_1 != null) {
										if (Static251.aBoolean330) {
											@Pc(1905) GL local1905 = Static251.aGL1;
											Static251.method3861(var8);
											Static117.method1972(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613);
											var10 = local8.anInt2701 * 128 + 64 - Static54.anInt1239;
											local65 = Static154.anIntArrayArrayArray5[local24][local8.anInt2701][local8.anInt2691] - Static222.anInt4471;
											local115 = local8.anInt2691 * 128 + 64 - Static179.anInt3613;
											if (local24 < 3) {
												local1332 = Static154.anIntArrayArrayArray5[local24][local8.anInt2701][local8.anInt2691] - Static154.anIntArrayArrayArray5[local24 + 1][local8.anInt2701][local8.anInt2691];
											} else {
												local1332 = 1024;
											}
											local894 = local115 * Static222.anInt4454 - var10 * Static174.anInt3534 >> 16;
											local899 = local65 * Static45.anInt1014 + local894 * Static99.anInt1944 >> 16;
											local904 = local899 + (Static99.anInt1944 * 91 + Static45.anInt1014 * 0 >> 16);
											var17 = local899 + (Static99.anInt1944 * -91 - local1332 * Static45.anInt1014 >> 16);
											if (var17 < local904 - 1597) {
												var17 = local904 - 1597;
											}
											var18 = local904 + 2 - var17;
											@Pc(2030) Class21_Sub2_Sub1 local2030 = null;
											@Pc(2032) Class21_Sub3 local2032 = null;
											@Pc(2034) int local2034 = -1;
											@Pc(2040) Class21_Sub2_Sub1 local2040 = (Class21_Sub2_Sub1) local8.aClass158_1.method3901();
											while (true) {
												label1054: {
													if (local2040 != null) {
														if (local2040.aClass21_Sub3_1 == null || local2040.aClass21_Sub3_1.aClass21_Sub1_6.aBoolean152) {
															local2040.method4639();
															break label1054;
														}
														if ((byte) (local2040.aClass21_Sub3_1.aClass21_Sub1_6.aLong92 & 0xFFL) != local8.aByte6) {
															local8.aClass158_1 = null;
															break;
														}
														if (local2030 == null) {
															local2030 = local2040;
															local2032 = local2040.aClass21_Sub3_1;
															local2034 = local2032.aClass74_2.anInt2318;
															break label1054;
														}
													}
													if (local2030 != null && (local2040 == null || local2040.aClass21_Sub3_1 != local2032 || local2040.aClass21_Sub3_1.aClass74_2.anInt2318 != local2034)) {
														@Pc(2097) int local2097;
														for (local2097 = 0; local2097 < var18; local2097++) {
															Static117.anIntArray211[local2097] = 0;
														}
														for (local2097 = 0; local2097 < 32; local2097++) {
															Static117.anIntArray210[local2097] = 0;
														}
														Static117.anInt2437 = 0;
														for (@Pc(2121) Class21_Sub2_Sub1 local2121 = local2030; local2121 != local2040; local2121 = (Class21_Sub2_Sub1) local2121.aClass21_Sub2_5) {
															if (local2121.aClass21_Sub3_1 != null) {
																@Pc(2134) int local2134 = (local2121.anInt5757 >> 12) - Static54.anInt1239;
																@Pc(2141) int local2141 = (local2121.anInt5758 >> 12) - Static222.anInt4471;
																@Pc(2148) int local2148 = (local2121.anInt5762 >> 12) - Static179.anInt3613;
																@Pc(2158) int local2158 = local2148 * Static222.anInt4454 - local2134 * Static174.anInt3534 >> 16;
																@Pc(2170) int local2170 = (local2141 * Static45.anInt1014 + local2158 * Static99.anInt1944 >> 16) - var17;
																if (Static117.anIntArray211[local2170] < 32) {
																	Static117.aShortArrayArray3[local2170][Static117.anIntArray211[local2170]++] = local2121.aShort50;
																} else {
																	if (Static117.anIntArray211[local2170] == 32) {
																		if (Static117.anInt2437 == 32) {
																			if (Static117.aBoolean154) {
																				System.out.println("Overflowed world-based radix sort");
																			}
																			break;
																		}
																		Static117.anIntArray211[local2170] += Static117.anInt2437++ + 1;
																	}
																	@Pc(2227) int local2227 = Static117.anIntArray210[Static117.anIntArray211[local2170] - 32 - 1];
																	if (local2227 < 768) {
																		@Pc(2239) short[] local2239 = Static117.aShortArrayArray2[Static117.anIntArray211[local2170] - 32 - 1];
																		@Pc(2247) int local2247 = Static117.anIntArray211[local2170] - 32 - 1;
																		@Pc(2249) int local2249 = Static117.anIntArray210[Static117.anIntArray211[local2170] - 32 - 1];
																		Static117.anIntArray210[local2247] = Static117.anIntArray210[Static117.anIntArray211[local2170] - 32 - 1] + 1;
																		local2239[local2249] = local2121.aShort50;
																	}
																}
															}
															if (local2121.aClass21_Sub2_5 == local8.aClass158_1.aClass21_Sub2_3) {
																break;
															}
														}
														@Pc(2270) boolean local2270 = false;
														if (Static117.aBoolean153 && local2032.aClass74_2.anInt2288 != -1) {
															Static283.anInterface1_1.method2436(local2032.aClass74_2.anInt2288);
															local2270 = true;
														} else {
															Static251.method3892(-1);
														}
														@Pc(2293) float local2293 = (float) local2034 * Static117.aFloat71;
														if (local2293 > 64.0F) {
															local2293 = 64.0F;
														}
														local1905.glPointSize(local2293);
														local2032.aClass21_Sub1_6.method1975(local1905, var18, local2270, local2032.aClass74_2.aBoolean146);
														if (local2040 != null) {
															local2030 = local2040;
															local2032 = local2040.aClass21_Sub3_1;
															local2034 = local2040.aClass21_Sub3_1.aClass74_2.anInt2318;
														}
													}
													if (local2040 == null) {
														break;
													}
												}
												local2040 = (Class21_Sub2_Sub1) local8.aClass158_1.method3903();
											}
											Static117.method1979();
										} else {
											var9 = Static117.anInt2419 + Static283.anInt5539;
											var10 = Static117.anInt2420 + Static283.anInt5542;
											@Pc(2347) Class21_Sub2 local2347 = local8.aClass158_1.aClass21_Sub2_3;
											for (@Pc(2350) Class21_Sub2 local2350 = local2347.aClass21_Sub2_5; local2350 != local2347; local2350 = local2350.aClass21_Sub2_5) {
												@Pc(2356) Class21_Sub2_Sub1 local2356 = (Class21_Sub2_Sub1) local2350;
												if (local2356.aClass21_Sub3_1 != null && !local2356.aClass21_Sub3_1.aClass21_Sub1_6.aBoolean152) {
													if ((byte) (local2356.aClass21_Sub3_1.aClass21_Sub1_6.aLong92 & 0xFFL) != local8.aByte6) {
														local8.aClass158_1 = null;
														break;
													}
													local894 = (local2356.anInt5757 >> 12) - Static54.anInt1239;
													local899 = (local2356.anInt5758 >> 12) - Static222.anInt4471;
													local904 = (local2356.anInt5762 >> 12) - Static179.anInt3613;
													var17 = local904 * Static174.anInt3534 + local894 * Static222.anInt4454 >> 16;
													local904 = local904 * Static222.anInt4454 - local894 * Static174.anInt3534 >> 16;
													local894 = var17;
													var17 = local899 * Static99.anInt1944 - local904 * Static45.anInt1014 >> 16;
													local904 = local899 * Static45.anInt1014 + local904 * Static99.anInt1944 >> 16;
													if (local904 >= 50) {
														var18 = var9 + (local894 << 9) / local904;
														var19 = var10 + (var17 << 9) / local904;
														@Pc(2468) int local2468 = local904 * 400;
														if (local2468 == 0) {
															local2468 = 1;
														}
														Static258.method4027(var18, var19, (local2356.aClass21_Sub3_1.aClass74_2.anInt2318 << 16) / local2468, local2356.anInt5759, local2356.anInt5759 >> 24 & 0xFF);
													}
												}
											}
										}
									}
								} while (!local8.aBoolean175);
							} while (local8.anInt2697 != 0);
							if (local18 > Static279.anInt5465 || local18 <= Static65.anInt5706) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean175);
						if (local18 < Static279.anInt5465 || local18 >= Static67.anInt1406 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean175);
					if (local21 > Static91.anInt1810 || local21 <= Static274.anInt5441) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean175);
				if (local21 < Static91.anInt1810 || local21 >= Static158.anInt3235 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean175);
			local8.aBoolean175 = false;
			Static14.anInt316--;
			@Pc(2596) Class127 local2596 = local8.aClass127_1;
			if (local2596 != null && local2596.anInt4023 != 0) {
				if (Static251.aBoolean330) {
					Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
				}
				if (local2596.aClass13_5 != null) {
					local2596.aClass13_5.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local2596.anInt4020 - Static54.anInt1239, local2596.anInt4021 - Static222.anInt4471 - local2596.anInt4023, local2596.anInt4022 - Static179.anInt3613, local2596.aLong145, local24, null);
				}
				if (local2596.aClass13_6 != null) {
					local2596.aClass13_6.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local2596.anInt4020 - Static54.anInt1239, local2596.anInt4021 - Static222.anInt4471 - local2596.anInt4023, local2596.anInt4022 - Static179.anInt3613, local2596.aLong145, local24, null);
				}
				if (local2596.aClass13_7 != null) {
					local2596.aClass13_7.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local2596.anInt4020 - Static54.anInt1239, local2596.anInt4021 - Static222.anInt4471 - local2596.anInt4023, local2596.anInt4022 - Static179.anInt3613, local2596.aLong145, local24, null);
				}
			}
			if (local8.anInt2700 != 0) {
				@Pc(2706) Class35 local2706 = local8.aClass35_1;
				if (local2706 != null && !Static29.method610(local27, local18, local21, local2706.aClass13_2.method4266())) {
					if ((local2706.anInt1242 & local8.anInt2700) != 0) {
						if (Static251.aBoolean330) {
							Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
						}
						local2706.aClass13_2.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local2706.anInt1244 + local2706.anInt1240 - Static54.anInt1239, local2706.anInt1246 - Static222.anInt4471, local2706.anInt1249 + local2706.anInt1248 - Static179.anInt3613, local2706.aLong48, local24, null);
					} else if (local2706.anInt1242 == 256) {
						local65 = local2706.anInt1244 - Static54.anInt1239;
						local115 = local2706.anInt1246 - Static222.anInt4471;
						local1332 = local2706.anInt1249 - Static179.anInt3613;
						local894 = local2706.anInt1247;
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
							if (Static251.aBoolean330) {
								Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
							}
							local2706.aClass13_2.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local65 + local2706.anInt1240, local115, local1332 + local2706.anInt1248, local2706.aLong48, local24, null);
						} else if (local2706.aClass13_1 != null) {
							if (Static251.aBoolean330) {
								Static142.method2287(Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local24, local18, local21);
							}
							local2706.aClass13_1.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local65, local115, local1332, local2706.aLong48, local24, null);
						}
					}
				}
				@Pc(2872) Class181 local2872 = local8.aClass181_1;
				if (local2872 != null) {
					if ((local2872.anInt5718 & local8.anInt2700) != 0 && !Static14.method265(local27, local18, local21, local2872.anInt5718)) {
						if (Static251.aBoolean330) {
							Static142.method2275(local2872.anInt5718, Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local27, local18, local21);
						}
						local2872.aClass13_10.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local2872.anInt5714 - Static54.anInt1239, local2872.anInt5720 - Static222.anInt4471, local2872.anInt5721 - Static179.anInt3613, local2872.aLong206, local24, null);
					}
					if ((local2872.anInt5713 & local8.anInt2700) != 0 && !Static14.method265(local27, local18, local21, local2872.anInt5713)) {
						if (Static251.aBoolean330) {
							Static142.method2275(local2872.anInt5713, Static54.anInt1239, Static222.anInt4471, Static179.anInt3613, local27, local18, local21);
						}
						local2872.aClass13_9.method4262(0, Static45.anInt1014, Static99.anInt1944, Static174.anInt3534, Static222.anInt4454, local2872.anInt5714 - Static54.anInt1239, local2872.anInt5720 - Static222.anInt4471, local2872.anInt5721 - Static179.anInt3613, local2872.aLong206, local24, null);
					}
				}
			}
			@Pc(2985) Class4_Sub21 local2985;
			if (local24 < Static139.anInt2755 - 1) {
				local2985 = Static261.aClass4_Sub21ArrayArrayArray4[local24 + 1][local18][local21];
				if (local2985 != null && local2985.aBoolean175) {
					Static254.aClass17_28.method619(local2985);
				}
			}
			if (local18 < Static279.anInt5465) {
				local2985 = local31[local18 + 1][local21];
				if (local2985 != null && local2985.aBoolean175) {
					Static254.aClass17_28.method619(local2985);
				}
			}
			if (local21 < Static91.anInt1810) {
				local2985 = local31[local18][local21 + 1];
				if (local2985 != null && local2985.aBoolean175) {
					Static254.aClass17_28.method619(local2985);
				}
			}
			if (local18 > Static279.anInt5465) {
				local2985 = local31[local18 - 1][local21];
				if (local2985 != null && local2985.aBoolean175) {
					Static254.aClass17_28.method619(local2985);
				}
			}
			if (local21 > Static91.anInt1810) {
				local2985 = local31[local18][local21 - 1];
				if (local2985 != null && local2985.aBoolean175) {
					Static254.aClass17_28.method619(local2985);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(CI)Z")
	public static boolean method3644(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(31) char[] local31 = Static162.aCharArray2;
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				@Pc(45) char local45 = local31[local33];
				if (arg0 == local45) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method3645(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
