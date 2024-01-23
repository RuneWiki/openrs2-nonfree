import java.util.Random;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public static int anInt2199;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
	public static int anInt2200;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "Lclient!nm;")
	public static Class119 aClass119_39;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public static int anInt2203 = -1;

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
	public static int anInt2204 = 0;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
	public static int anInt2205 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!jj;Z)V")
	public static void method1976(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) boolean arg1) {
		Static268.aClass96_26.method2336(arg0);
		while (true) {
			@Pc(8) Class1_Sub16 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class1_Sub16[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class1_Sub16 local153;
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
										@Pc(363) Class39 var30;
										@Pc(469) boolean var32;
										@Pc(425) Class45 var33;
										@Pc(1179) Class1_Sub16 var39;
										while (true) {
											do {
												local8 = (Class1_Sub16) Static268.aClass96_26.method2339();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean230);
											local18 = local8.anInt2577;
											local21 = local8.anInt2571;
											local24 = local8.anInt2570;
											local27 = local8.anInt2576;
											local31 = Static254.aClass1_Sub16ArrayArrayArray3[local24];
											var8 = 0.0F;
											if (Static71.aBoolean165) {
												if (Static124.anIntArrayArrayArray5 == Static280.anIntArrayArrayArray13) {
													var9 = Static260.anIntArrayArray38[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static128.anInt2547) {
														Static128.anInt2547 = var10;
														Static286.method4305(var10);
														Static65.method1148(Static55.method992());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static196.anInt3908) {
														Static196.anInt3908 = local65;
														Static23.method460(local65);
													}
													local115 = Static24.anIntArrayArrayArray3[0][local18][local21] + Static24.anIntArrayArrayArray3[0][local18 + 1][local21] + Static24.anIntArrayArrayArray3[0][local18][local21 + 1] + Static24.anIntArrayArrayArray3[0][local18 + 1][local21 + 1] >> 2;
													Static165.method4612(3, -local115);
													var8 = 201.5F;
													Static71.method1385(var8);
												} else {
													var8 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static71.method1385(var8);
												}
											}
											if (!local8.aBoolean228) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static254.aClass1_Sub16ArrayArrayArray3[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean230) {
														continue;
													}
												}
												if (local18 <= Static66.anInt1366 && local18 > Static230.anInt4306) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean230 && (local153.aBoolean228 || (local8.anInt2574 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static66.anInt1366 && local18 < Static82.anInt1810 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean230 && (local153.aBoolean228 || (local8.anInt2574 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static196.anInt3902 && local21 > Static226.anInt4247) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean230 && (local153.aBoolean228 || (local8.anInt2574 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static196.anInt3902 && local21 < Static41.anInt850 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean230 && (local153.aBoolean228 || (local8.anInt2574 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean228 = false;
											if (local8.aClass1_Sub16_1 != null) {
												local153 = local8.aClass1_Sub16_1;
												if (Static71.aBoolean165) {
													Static71.method1385(201.5F - (float) (local153.anInt2576 + 1) * 50.0F);
												}
												if (local153.aClass171_1 == null) {
													if (local153.aClass131_1 != null) {
														if (Static17.method273(0, local18, local21)) {
															Static210.method3474(local153.aClass131_1, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local18, local21, true);
														} else {
															Static210.method3474(local153.aClass131_1, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local18, local21, false);
														}
													}
												} else if (Static17.method273(0, local18, local21)) {
													Static307.method4583(local153.aClass171_1, 0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local18, local21, true);
												} else {
													Static307.method4583(local153.aClass171_1, 0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local18, local21, false);
												}
												var30 = local153.aClass39_1;
												if (var30 != null) {
													if (Static71.aBoolean165) {
														if ((var30.anInt1260 & local8.anInt2572) == 0) {
															Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
														} else {
															Static151.method2630(var30.anInt1260, Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local27, local18, local21);
														}
													}
													var30.aClass11_4.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, var30.anInt1261 - Static156.anInt3124, var30.anInt1259 - Static215.anInt4033, var30.anInt1258 - Static292.anInt5278, var30.aLong48, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt2573; local65++) {
													var33 = local153.aClass45Array2[local65];
													if (var33 != null) {
														if (Static71.aBoolean165) {
															Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
														}
														var33.aClass11_5.method4299(var33.anInt1353, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, var33.anInt1361 - Static156.anInt3124, var33.anInt1358 - Static215.anInt4033, var33.anInt1354 - Static292.anInt5278, var33.aLong56, local24, null);
													}
												}
												if (Static71.aBoolean165) {
													Static71.method1385(var8);
												}
											}
											var32 = false;
											if (local8.aClass171_1 == null) {
												if (local8.aClass131_1 != null) {
													if (Static17.method273(local27, local18, local21)) {
														Static210.method3474(local8.aClass131_1, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local18, local21, true);
													} else {
														var32 = true;
														Static210.method3474(local8.aClass131_1, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local18, local21, false);
													}
												}
											} else if (Static17.method273(local27, local18, local21)) {
												Static307.method4583(local8.aClass171_1, local27, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local18, local21, true);
											} else {
												var32 = true;
												if (local8.aClass171_1.anInt5130 != 12345678 || Static47.aBoolean102 && local24 <= Static273.anInt5034) {
													Static307.method4583(local8.aClass171_1, local27, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local18, local21, false);
												}
											}
											if (var32) {
												@Pc(549) Class124 local549 = local8.aClass124_1;
												if (local549 != null && (local549.aLong143 & 0x80000000L) != 0L) {
													if (Static71.aBoolean165 && local549.aBoolean340) {
														Static71.method1385(var8 + 50.0F - 1.5F);
													}
													if (Static71.aBoolean165) {
														Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
													}
													local549.aClass11_10.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local549.anInt3885 - Static156.anInt3124, local549.anInt3882 - Static215.anInt4033, local549.anInt3886 - Static292.anInt5278, local549.aLong143, local24, null);
													if (Static71.aBoolean165 && local549.aBoolean340) {
														Static71.method1385(var8);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class39 local616 = local8.aClass39_1;
											@Pc(619) Class18 local619 = local8.aClass18_1;
											if (local616 != null || local619 != null) {
												if (Static66.anInt1366 == local18) {
													var10++;
												} else if (Static66.anInt1366 < local18) {
													var10 += 2;
												}
												if (Static196.anInt3902 == local21) {
													var10 += 3;
												} else if (Static196.anInt3902 > local21) {
													var10 += 6;
												}
												local65 = Static148.anIntArray258[var10];
												local8.anInt2572 = Static168.anIntArray300[var10];
											}
											if (local616 != null) {
												if ((local616.anInt1260 & Static16.anIntArray28[var10]) == 0) {
													local8.anInt2578 = 0;
												} else if (local616.anInt1260 == 16) {
													local8.anInt2578 = 3;
													local8.anInt2580 = Static289.anIntArray574[var10];
													local8.anInt2569 = 3 - local8.anInt2580;
												} else if (local616.anInt1260 == 32) {
													local8.anInt2578 = 6;
													local8.anInt2580 = Static299.anIntArray590[var10];
													local8.anInt2569 = 6 - local8.anInt2580;
												} else if (local616.anInt1260 == 64) {
													local8.anInt2578 = 12;
													local8.anInt2580 = Static183.anIntArray374[var10];
													local8.anInt2569 = 12 - local8.anInt2580;
												} else {
													local8.anInt2578 = 9;
													local8.anInt2580 = Static284.anIntArray565[var10];
													local8.anInt2569 = 9 - local8.anInt2580;
												}
												if ((local616.anInt1260 & local65) != 0 && !Static233.method3754(local27, local18, local21, local616.anInt1260)) {
													if (Static71.aBoolean165) {
														Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
													}
													local616.aClass11_4.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local616.anInt1261 - Static156.anInt3124, local616.anInt1259 - Static215.anInt4033, local616.anInt1258 - Static292.anInt5278, local616.aLong48, local24, null);
												}
												if ((local616.anInt1253 & local65) != 0 && !Static233.method3754(local27, local18, local21, local616.anInt1253)) {
													if (Static71.aBoolean165) {
														Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
													}
													local616.aClass11_3.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local616.anInt1261 - Static156.anInt3124, local616.anInt1259 - Static215.anInt4033, local616.anInt1258 - Static292.anInt5278, local616.aLong48, local24, null);
												}
											}
											if (local619 != null && !Static258.method4027(local27, local18, local21, local619.aClass11_1.method4297())) {
												if (Static71.aBoolean165) {
													Static71.method1385(var8 - 0.5F);
												}
												if ((local619.anInt559 & local65) != 0) {
													if (Static71.aBoolean165) {
														Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
													}
													local619.aClass11_1.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local619.anInt563 + local619.anInt562 - Static156.anInt3124, local619.anInt554 - Static215.anInt4033, local619.anInt558 + local619.anInt560 - Static292.anInt5278, local619.aLong21, local24, null);
												} else if (local619.anInt559 == 256) {
													local894 = local619.anInt563 - Static156.anInt3124;
													local899 = local619.anInt554 - Static215.anInt4033;
													local904 = local619.anInt558 - Static292.anInt5278;
													var17 = local619.anInt557;
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
														if (Static71.aBoolean165) {
															Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
														}
														local619.aClass11_1.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local894 + local619.anInt562, local899, local904 + local619.anInt560, local619.aLong21, local24, null);
													} else if (local619.aClass11_2 != null) {
														if (Static71.aBoolean165) {
															Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
														}
														local619.aClass11_2.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local894, local899, local904, local619.aLong21, local24, null);
													}
												}
												if (Static71.aBoolean165) {
													Static71.method1385(var8);
												}
											}
											if (var32) {
												@Pc(1001) Class124 local1001 = local8.aClass124_1;
												if (local1001 != null && (local1001.aLong143 & 0x80000000L) == 0L) {
													if (Static71.aBoolean165 && local1001.aBoolean340) {
														Static71.method1385(var8 + 50.0F - 1.5F);
													}
													if (Static71.aBoolean165) {
														Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
													}
													local1001.aClass11_10.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local1001.anInt3885 - Static156.anInt3124, local1001.anInt3882 - Static215.anInt4033, local1001.anInt3886 - Static292.anInt5278, local1001.aLong143, local24, null);
													if (Static71.aBoolean165 && local1001.aBoolean340) {
														Static71.method1385(var8);
													}
												}
												@Pc(1064) Class68 local1064 = local8.aClass68_1;
												if (local1064 != null && local1064.anInt1914 == 0) {
													if (Static71.aBoolean165) {
														Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
													}
													if (local1064.aClass11_6 != null) {
														local1064.aClass11_6.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local1064.anInt1909 - Static156.anInt3124, local1064.anInt1908 - Static215.anInt4033, local1064.anInt1912 - Static292.anInt5278, local1064.aLong73, local24, null);
													}
													if (local1064.aClass11_7 != null) {
														local1064.aClass11_7.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local1064.anInt1909 - Static156.anInt3124, local1064.anInt1908 - Static215.anInt4033, local1064.anInt1912 - Static292.anInt5278, local1064.aLong73, local24, null);
													}
													if (local1064.aClass11_8 != null) {
														local1064.aClass11_8.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local1064.anInt1909 - Static156.anInt3124, local1064.anInt1908 - Static215.anInt4033, local1064.anInt1912 - Static292.anInt5278, local1064.aLong73, local24, null);
													}
												}
											}
											local894 = local8.anInt2574;
											if (local894 != 0) {
												if (local18 < Static66.anInt1366 && (local894 & 0x4) != 0) {
													var39 = local31[local18 + 1][local21];
													if (var39 != null && var39.aBoolean230) {
														Static268.aClass96_26.method2336(var39);
													}
												}
												if (local21 < Static196.anInt3902 && (local894 & 0x2) != 0) {
													var39 = local31[local18][local21 + 1];
													if (var39 != null && var39.aBoolean230) {
														Static268.aClass96_26.method2336(var39);
													}
												}
												if (local18 > Static66.anInt1366 && (local894 & 0x1) != 0) {
													var39 = local31[local18 - 1][local21];
													if (var39 != null && var39.aBoolean230) {
														Static268.aClass96_26.method2336(var39);
													}
												}
												if (local21 > Static196.anInt3902 && (local894 & 0x8) != 0) {
													var39 = local31[local18][local21 - 1];
													if (var39 != null && var39.aBoolean230) {
														Static268.aClass96_26.method2336(var39);
													}
												}
											}
											break;
										}
										if (local8.anInt2578 != 0) {
											var32 = true;
											for (var10 = 0; var10 < local8.anInt2573; var10++) {
												if (local8.aClass45Array2[var10].anInt1364 != Static34.anInt651 && (local8.anIntArray201[var10] & local8.anInt2578) == local8.anInt2580) {
													var32 = false;
													break;
												}
											}
											if (var32) {
												var30 = local8.aClass39_1;
												if (!Static233.method3754(local27, local18, local21, var30.anInt1260)) {
													if (Static71.aBoolean165) {
														label1037: {
															if ((var30.aLong48 & 0xFC000L) == 16384L) {
																local65 = var30.anInt1261 - Static156.anInt3124;
																local115 = var30.anInt1258 - Static292.anInt5278;
																local1332 = (int) (var30.aLong48 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static298.anInt5372 - 1) {
																		Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18 - 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static220.anInt4129 - 1 && local21 < Static298.anInt5372 - 1) {
																		Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18 + 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static220.anInt4129 - 1 && local21 > 0) {
																		Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18 + 1, local21 - 1);
																		break label1037;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18 - 1, local21 - 1);
																		break label1037;
																	}
																}
															}
															Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
														}
													}
													var30.aClass11_4.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, var30.anInt1261 - Static156.anInt3124, var30.anInt1259 - Static215.anInt4033, var30.anInt1258 - Static292.anInt5278, var30.aLong48, local24, null);
												}
												local8.anInt2578 = 0;
											}
										}
										if (!local8.aBoolean229) {
											break;
										}
										try {
											var9 = local8.anInt2573;
											local8.aBoolean229 = false;
											var10 = 0;
											label844: for (local65 = 0; local65 < var9; local65++) {
												var33 = local8.aClass45Array2[local65];
												if (var33.anInt1364 != Static34.anInt651) {
													for (local1332 = var33.anInt1360; local1332 <= var33.anInt1362; local1332++) {
														for (local894 = var33.anInt1359; local894 <= var33.anInt1355; local894++) {
															var39 = local31[local1332][local894];
															if (var39.aBoolean228) {
																local8.aBoolean229 = true;
																continue label844;
															}
															if (var39.anInt2578 != 0) {
																local904 = 0;
																if (local1332 > var33.anInt1360) {
																	local904++;
																}
																if (local1332 < var33.anInt1362) {
																	local904 += 4;
																}
																if (local894 > var33.anInt1359) {
																	local904 += 8;
																}
																if (local894 < var33.anInt1355) {
																	local904 += 2;
																}
																if ((local904 & var39.anInt2578) == local8.anInt2569) {
																	local8.aBoolean229 = true;
																	continue label844;
																}
															}
														}
													}
													Static80.aClass45Array1[var10++] = var33;
													local1332 = Static66.anInt1366 - var33.anInt1360;
													local894 = var33.anInt1362 - Static66.anInt1366;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static196.anInt3902 - var33.anInt1359;
													local904 = var33.anInt1355 - Static196.anInt3902;
													if (local904 > local899) {
														var33.anInt1356 = local1332 + local904;
													} else {
														var33.anInt1356 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class45 local1628 = Static80.aClass45Array1[local1332];
													if (local1628.anInt1364 != Static34.anInt651) {
														if (local1628.anInt1356 > local65) {
															local65 = local1628.anInt1356;
															local115 = local1332;
														} else if (local1628.anInt1356 == local65) {
															local899 = local1628.anInt1361 - Static156.anInt3124;
															local904 = local1628.anInt1354 - Static292.anInt5278;
															var17 = Static80.aClass45Array1[local115].anInt1361 - Static156.anInt3124;
															var18 = Static80.aClass45Array1[local115].anInt1354 - Static292.anInt5278;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class45 local1697 = Static80.aClass45Array1[local115];
												local1697.anInt1364 = Static34.anInt651;
												if (!Static270.method4168(local27, local1697.anInt1360, local1697.anInt1362, local1697.anInt1359, local1697.anInt1355, local1697.aClass11_5.method4297())) {
													if (Static71.aBoolean165) {
														if ((local1697.aLong56 & 0xFC000L) == 147456L) {
															Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
															local894 = local1697.anInt1361 - Static156.anInt3124;
															local899 = local1697.anInt1354 - Static292.anInt5278;
															local904 = (int) (local1697.aLong56 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static151.method2640(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static151.method2640(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static151.method2640(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static151.method2640(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static151.method2631(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local1697.anInt1360, local1697.anInt1359, local1697.anInt1362, local1697.anInt1355);
														}
													}
													local1697.aClass11_5.method4299(local1697.anInt1353, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local1697.anInt1361 - Static156.anInt3124, local1697.anInt1358 - Static215.anInt4033, local1697.anInt1354 - Static292.anInt5278, local1697.aLong56, local24, null);
												}
												for (local894 = local1697.anInt1360; local894 <= local1697.anInt1362; local894++) {
													for (local899 = local1697.anInt1359; local899 <= local1697.anInt1355; local899++) {
														@Pc(1863) Class1_Sub16 local1863 = local31[local894][local899];
														if (local1863.anInt2578 != 0) {
															Static268.aClass96_26.method2336(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean230) {
															Static268.aClass96_26.method2336(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean229) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean229 = false;
											break;
										}
									}
									if (local8.aClass191_1 != null) {
										if (Static71.aBoolean165) {
											@Pc(1905) GL local1905 = Static71.aGL1;
											Static71.method1385(var8);
											Static52.method960(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278);
											var10 = local8.anInt2577 * 128 + 64 - Static156.anInt3124;
											local65 = Static280.anIntArrayArrayArray13[local24][local8.anInt2577][local8.anInt2571] - Static215.anInt4033;
											local115 = local8.anInt2571 * 128 + 64 - Static292.anInt5278;
											if (local24 < 3) {
												local1332 = Static280.anIntArrayArrayArray13[local24][local8.anInt2577][local8.anInt2571] - Static280.anIntArrayArrayArray13[local24 + 1][local8.anInt2577][local8.anInt2571];
											} else {
												local1332 = 1024;
											}
											local894 = local115 * Static43.anInt976 - var10 * Static262.anInt4838 >> 16;
											local899 = local65 * Static304.anInt5481 + local894 * Static3.anInt112 >> 16;
											local904 = local899 + (Static3.anInt112 * 91 + Static304.anInt5481 * 0 >> 16);
											var17 = local899 + (Static3.anInt112 * -91 - local1332 * Static304.anInt5481 >> 16);
											if (var17 < local904 - 1597) {
												var17 = local904 - 1597;
											}
											var18 = local904 + 2 - var17;
											@Pc(2030) Class22_Sub1_Sub1 local2030 = null;
											@Pc(2032) Class22_Sub2 local2032 = null;
											@Pc(2034) int local2034 = -1;
											@Pc(2040) Class22_Sub1_Sub1 local2040 = (Class22_Sub1_Sub1) local8.aClass191_1.method4664();
											while (true) {
												label1054: {
													if (local2040 != null) {
														if (local2040.aClass22_Sub2_1 == null || local2040.aClass22_Sub2_1.aClass22_Sub3_1.aBoolean111) {
															local2040.method946();
															break label1054;
														}
														if ((byte) (local2040.aClass22_Sub2_1.aClass22_Sub3_1.aLong37 & 0xFFL) != local8.aByte7) {
															local8.aClass191_1 = null;
															break;
														}
														if (local2030 == null) {
															local2030 = local2040;
															local2032 = local2040.aClass22_Sub2_1;
															local2034 = local2032.aClass2_1.anInt87;
															break label1054;
														}
													}
													if (local2030 != null && (local2040 == null || local2040.aClass22_Sub2_1 != local2032 || local2040.aClass22_Sub2_1.aClass2_1.anInt87 != local2034)) {
														@Pc(2097) int local2097;
														for (local2097 = 0; local2097 < var18; local2097++) {
															Static52.anIntArray89[local2097] = 0;
														}
														for (local2097 = 0; local2097 < 32; local2097++) {
															Static52.anIntArray88[local2097] = 0;
														}
														Static52.anInt1134 = 0;
														for (@Pc(2121) Class22_Sub1_Sub1 local2121 = local2030; local2121 != local2040; local2121 = (Class22_Sub1_Sub1) local2121.aClass22_Sub1_3) {
															if (local2121.aClass22_Sub2_1 != null) {
																@Pc(2134) int local2134 = (local2121.anInt647 >> 12) - Static156.anInt3124;
																@Pc(2141) int local2141 = (local2121.anInt645 >> 12) - Static215.anInt4033;
																@Pc(2148) int local2148 = (local2121.anInt649 >> 12) - Static292.anInt5278;
																@Pc(2158) int local2158 = local2148 * Static43.anInt976 - local2134 * Static262.anInt4838 >> 16;
																@Pc(2170) int local2170 = (local2141 * Static304.anInt5481 + local2158 * Static3.anInt112 >> 16) - var17;
																if (Static52.anIntArray89[local2170] < 32) {
																	Static52.aShortArrayArray3[local2170][Static52.anIntArray89[local2170]++] = local2121.aShort12;
																} else {
																	if (Static52.anIntArray89[local2170] == 32) {
																		if (Static52.anInt1134 == 32) {
																			if (Static52.aBoolean112) {
																				System.out.println("Overflowed world-based radix sort");
																			}
																			break;
																		}
																		Static52.anIntArray89[local2170] += Static52.anInt1134++ + 1;
																	}
																	@Pc(2227) int local2227 = Static52.anIntArray88[Static52.anIntArray89[local2170] - 32 - 1];
																	if (local2227 < 768) {
																		@Pc(2239) short[] local2239 = Static52.aShortArrayArray2[Static52.anIntArray89[local2170] - 32 - 1];
																		@Pc(2247) int local2247 = Static52.anIntArray89[local2170] - 32 - 1;
																		@Pc(2249) int local2249 = Static52.anIntArray88[Static52.anIntArray89[local2170] - 32 - 1];
																		Static52.anIntArray88[local2247] = Static52.anIntArray88[Static52.anIntArray89[local2170] - 32 - 1] + 1;
																		local2239[local2249] = local2121.aShort12;
																	}
																}
															}
															if (local2121.aClass22_Sub1_3 == local8.aClass191_1.aClass22_Sub1_5) {
																break;
															}
														}
														@Pc(2270) boolean local2270 = false;
														if (Static52.aBoolean113 && local2032.aClass2_1.anInt55 != -1) {
															Static119.anInterface5_1.method1480(local2032.aClass2_1.anInt55);
															local2270 = true;
														} else {
															Static71.method1400(-1);
														}
														@Pc(2293) float local2293 = (float) local2034 * Static52.aFloat21;
														if (local2293 > 64.0F) {
															local2293 = 64.0F;
														}
														local1905.glPointSize(local2293);
														local2032.aClass22_Sub3_1.method952(local1905, var18, local2270, local2032.aClass2_1.aBoolean7);
														if (local2040 != null) {
															local2030 = local2040;
															local2032 = local2040.aClass22_Sub2_1;
															local2034 = local2040.aClass22_Sub2_1.aClass2_1.anInt87;
														}
													}
													if (local2040 == null) {
														break;
													}
												}
												local2040 = (Class22_Sub1_Sub1) local8.aClass191_1.method4667();
											}
											Static52.method963();
										} else {
											var9 = Static52.anInt1126 + Static119.anInt2423;
											var10 = Static52.anInt1128 + Static119.anInt2427;
											@Pc(2347) Class22_Sub1 local2347 = local8.aClass191_1.aClass22_Sub1_5;
											for (@Pc(2350) Class22_Sub1 local2350 = local2347.aClass22_Sub1_3; local2350 != local2347; local2350 = local2350.aClass22_Sub1_3) {
												@Pc(2356) Class22_Sub1_Sub1 local2356 = (Class22_Sub1_Sub1) local2350;
												if (local2356.aClass22_Sub2_1 != null && !local2356.aClass22_Sub2_1.aClass22_Sub3_1.aBoolean111) {
													if ((byte) (local2356.aClass22_Sub2_1.aClass22_Sub3_1.aLong37 & 0xFFL) != local8.aByte7) {
														local8.aClass191_1 = null;
														break;
													}
													local894 = (local2356.anInt647 >> 12) - Static156.anInt3124;
													local899 = (local2356.anInt645 >> 12) - Static215.anInt4033;
													local904 = (local2356.anInt649 >> 12) - Static292.anInt5278;
													var17 = local904 * Static262.anInt4838 + local894 * Static43.anInt976 >> 16;
													local904 = local904 * Static43.anInt976 - local894 * Static262.anInt4838 >> 16;
													local894 = var17;
													var17 = local899 * Static3.anInt112 - local904 * Static304.anInt5481 >> 16;
													local904 = local899 * Static304.anInt5481 + local904 * Static3.anInt112 >> 16;
													if (local904 >= 50) {
														var18 = var9 + (local894 << 9) / local904;
														var19 = var10 + (var17 << 9) / local904;
														@Pc(2468) int local2468 = local904 * 400;
														if (local2468 == 0) {
															local2468 = 1;
														}
														Static77.method1585(var18, var19, (local2356.aClass22_Sub2_1.aClass2_1.anInt87 << 16) / local2468, local2356.anInt646, local2356.anInt646 >> 24 & 0xFF);
													}
												}
											}
										}
									}
								} while (!local8.aBoolean230);
							} while (local8.anInt2578 != 0);
							if (local18 > Static66.anInt1366 || local18 <= Static230.anInt4306) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean230);
						if (local18 < Static66.anInt1366 || local18 >= Static82.anInt1810 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean230);
					if (local21 > Static196.anInt3902 || local21 <= Static226.anInt4247) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean230);
				if (local21 < Static196.anInt3902 || local21 >= Static41.anInt850 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean230);
			local8.aBoolean230 = false;
			Static44.anInt1037--;
			@Pc(2596) Class68 local2596 = local8.aClass68_1;
			if (local2596 != null && local2596.anInt1914 != 0) {
				if (Static71.aBoolean165) {
					Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
				}
				if (local2596.aClass11_6 != null) {
					local2596.aClass11_6.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local2596.anInt1909 - Static156.anInt3124, local2596.anInt1908 - Static215.anInt4033 - local2596.anInt1914, local2596.anInt1912 - Static292.anInt5278, local2596.aLong73, local24, null);
				}
				if (local2596.aClass11_7 != null) {
					local2596.aClass11_7.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local2596.anInt1909 - Static156.anInt3124, local2596.anInt1908 - Static215.anInt4033 - local2596.anInt1914, local2596.anInt1912 - Static292.anInt5278, local2596.aLong73, local24, null);
				}
				if (local2596.aClass11_8 != null) {
					local2596.aClass11_8.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local2596.anInt1909 - Static156.anInt3124, local2596.anInt1908 - Static215.anInt4033 - local2596.anInt1914, local2596.anInt1912 - Static292.anInt5278, local2596.aLong73, local24, null);
				}
			}
			if (local8.anInt2572 != 0) {
				@Pc(2706) Class18 local2706 = local8.aClass18_1;
				if (local2706 != null && !Static258.method4027(local27, local18, local21, local2706.aClass11_1.method4297())) {
					if ((local2706.anInt559 & local8.anInt2572) != 0) {
						if (Static71.aBoolean165) {
							Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
						}
						local2706.aClass11_1.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local2706.anInt563 + local2706.anInt562 - Static156.anInt3124, local2706.anInt554 - Static215.anInt4033, local2706.anInt558 + local2706.anInt560 - Static292.anInt5278, local2706.aLong21, local24, null);
					} else if (local2706.anInt559 == 256) {
						local65 = local2706.anInt563 - Static156.anInt3124;
						local115 = local2706.anInt554 - Static215.anInt4033;
						local1332 = local2706.anInt558 - Static292.anInt5278;
						local894 = local2706.anInt557;
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
							if (Static71.aBoolean165) {
								Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
							}
							local2706.aClass11_1.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local65 + local2706.anInt562, local115, local1332 + local2706.anInt560, local2706.aLong21, local24, null);
						} else if (local2706.aClass11_2 != null) {
							if (Static71.aBoolean165) {
								Static151.method2639(Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local24, local18, local21);
							}
							local2706.aClass11_2.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local65, local115, local1332, local2706.aLong21, local24, null);
						}
					}
				}
				@Pc(2872) Class39 local2872 = local8.aClass39_1;
				if (local2872 != null) {
					if ((local2872.anInt1253 & local8.anInt2572) != 0 && !Static233.method3754(local27, local18, local21, local2872.anInt1253)) {
						if (Static71.aBoolean165) {
							Static151.method2630(local2872.anInt1253, Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local27, local18, local21);
						}
						local2872.aClass11_3.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local2872.anInt1261 - Static156.anInt3124, local2872.anInt1259 - Static215.anInt4033, local2872.anInt1258 - Static292.anInt5278, local2872.aLong48, local24, null);
					}
					if ((local2872.anInt1260 & local8.anInt2572) != 0 && !Static233.method3754(local27, local18, local21, local2872.anInt1260)) {
						if (Static71.aBoolean165) {
							Static151.method2630(local2872.anInt1260, Static156.anInt3124, Static215.anInt4033, Static292.anInt5278, local27, local18, local21);
						}
						local2872.aClass11_4.method4299(0, Static304.anInt5481, Static3.anInt112, Static262.anInt4838, Static43.anInt976, local2872.anInt1261 - Static156.anInt3124, local2872.anInt1259 - Static215.anInt4033, local2872.anInt1258 - Static292.anInt5278, local2872.aLong48, local24, null);
					}
				}
			}
			@Pc(2985) Class1_Sub16 local2985;
			if (local24 < Static311.anInt5590 - 1) {
				local2985 = Static254.aClass1_Sub16ArrayArrayArray3[local24 + 1][local18][local21];
				if (local2985 != null && local2985.aBoolean230) {
					Static268.aClass96_26.method2336(local2985);
				}
			}
			if (local18 < Static66.anInt1366) {
				local2985 = local31[local18 + 1][local21];
				if (local2985 != null && local2985.aBoolean230) {
					Static268.aClass96_26.method2336(local2985);
				}
			}
			if (local21 < Static196.anInt3902) {
				local2985 = local31[local18][local21 + 1];
				if (local2985 != null && local2985.aBoolean230) {
					Static268.aClass96_26.method2336(local2985);
				}
			}
			if (local18 > Static66.anInt1366) {
				local2985 = local31[local18 - 1][local21];
				if (local2985 != null && local2985.aBoolean230) {
					Static268.aClass96_26.method2336(local2985);
				}
			}
			if (local21 > Static196.anInt3902) {
				local2985 = local31[local18][local21 - 1];
				if (local2985 != null && local2985.aBoolean230) {
					Static268.aClass96_26.method2336(local2985);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[II)V")
	public static void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(7) int local7 = arg1 - 1;
		@Pc(10) int local10 = local7 - 7;
		arg2--;
		while (arg2 < local10) {
			@Pc(24) int local24 = arg2 + 1;
			arg3[local24] = arg0;
			@Pc(29) int local29 = local24 + 1;
			arg3[local29] = arg0;
			@Pc(34) int local34 = local29 + 1;
			arg3[local34] = arg0;
			@Pc(39) int local39 = local34 + 1;
			arg3[local39] = arg0;
			@Pc(44) int local44 = local39 + 1;
			arg3[local44] = arg0;
			@Pc(49) int local49 = local44 + 1;
			arg3[local49] = arg0;
			@Pc(54) int local54 = local49 + 1;
			arg3[local54] = arg0;
			arg2 = local54 + 1;
			arg3[arg2] = arg0;
		}
		while (arg2 < local7) {
			arg2++;
			arg3[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZLjava/lang/String;B)Z")
	public static boolean method1979(@OriginalArg(2) String arg0) {
		@Pc(25) boolean local25 = false;
		@Pc(27) int local27 = 0;
		@Pc(29) boolean local29 = false;
		@Pc(32) int local32 = arg0.length();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(49) char local49 = arg0.charAt(local34);
			if (local34 == 0) {
				if (local49 == '-') {
					local25 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(86) int local86;
			if (local49 >= '0' && local49 <= '9') {
				local86 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local86 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local86 = local49 - 'W';
			} else {
				return false;
			}
			if (local86 >= 10) {
				return false;
			}
			if (local25) {
				local86 = -local86;
			}
			@Pc(120) int local120 = local27 * 10 + local86;
			if (local120 / 10 != local27) {
				return false;
			}
			local29 = true;
			local27 = local120;
		}
		return local29;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([[I[[FZIII[IILclient!jb;ZIBIIII[ZZ[[F[[I[[FZ)V")
	public static void method1980(@OriginalArg(0) int[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub15 arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) boolean[] arg15, @OriginalArg(17) boolean arg16, @OriginalArg(18) float[][] arg17, @OriginalArg(19) int[][] arg18, @OriginalArg(20) float[][] arg19, @OriginalArg(21) boolean arg20) {
		@Pc(15) int local15 = (arg2 ? 255 : 0) + (arg7 << 8);
		@Pc(25) int local25 = (arg14 << 8) + (arg9 ? 255 : 0);
		@Pc(31) int[] local31 = new int[arg6.length / 2];
		@Pc(41) int local41 = (arg16 ? 255 : 0) + (arg13 << 8);
		@Pc(52) int local52 = (arg5 << 8) + (arg20 ? 255 : 0);
		for (@Pc(54) int local54 = 0; local54 < local31.length; local54++) {
			@Pc(69) int local69 = arg6[local54 + local54];
			@Pc(77) int local77 = arg6[local54 + local54 + 1];
			@Pc(90) int[][] local90 = arg18 == null || arg15 == null || !arg15[local54] ? arg0 : arg18;
			local31[local54] = Static289.method4357(arg11, arg19, false, arg8, arg17, local52, arg12, arg1, local15, local90, (float) arg3, arg10, local25, local41, local69, local77, arg18);
		}
		arg8.method2222(arg4, arg12, arg10, local31, null, false);
	}
}
