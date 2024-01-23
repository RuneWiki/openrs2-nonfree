import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!t", name = "m", descriptor = "I")
	public static int anInt5353;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!rn;")
	public static Class155 aClass155_108;

	@OriginalMember(owner = "client!t", name = "q", descriptor = "Lclient!qk;")
	public static Class3_Sub4_Sub2_Sub2 aClass3_Sub4_Sub2_Sub2_2;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "Lclient!l;")
	public static Class98 aClass98_43 = new Class98(64);

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Lclient!to;")
	public static Class174 aClass174_1 = new Class174();

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!fk;")
	public static Class56 aClass56_25 = new Class56();

	@OriginalMember(owner = "client!t", name = "k", descriptor = "[J")
	public static long[] aLongArray12 = new long[500];

	@OriginalMember(owner = "client!t", name = "l", descriptor = "[S")
	public static short[] aShortArray87 = new short[500];

	@OriginalMember(owner = "client!t", name = "n", descriptor = "Lclient!rg;")
	public static Class151 aClass151_18 = null;

	@OriginalMember(owner = "client!t", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray71 = new int[5][5000];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!qo;Z)V")
	public static void method4346(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) boolean arg1) {
		Static26.aClass56_2.method1282(arg0);
		while (true) {
			@Pc(8) Class3_Sub25 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class3_Sub25[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class3_Sub25 local153;
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
										@Pc(363) Class19 var30;
										@Pc(469) boolean var32;
										@Pc(425) Class85 var33;
										@Pc(1179) Class3_Sub25 var39;
										while (true) {
											do {
												local8 = (Class3_Sub25) Static26.aClass56_2.method1279();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean318);
											local18 = local8.anInt4482;
											local21 = local8.anInt4475;
											local24 = local8.anInt4485;
											local27 = local8.anInt4479;
											local31 = Static146.aClass3_Sub25ArrayArrayArray7[local24];
											var8 = 0.0F;
											if (Static283.aBoolean393) {
												if (Static22.anIntArrayArrayArray1 == Static256.anIntArrayArrayArray14) {
													var9 = Static157.anIntArrayArray45[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static15.anInt4205) {
														Static15.anInt4205 = var10;
														Static120.method2008(var10);
														Static226.method3653(Static48.method759());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static20.anInt374) {
														Static20.anInt374 = local65;
														Static208.method3461(local65);
													}
													local115 = Static258.anIntArrayArrayArray15[0][local18][local21] + Static258.anIntArrayArrayArray15[0][local18 + 1][local21] + Static258.anIntArrayArrayArray15[0][local18][local21 + 1] + Static258.anIntArrayArrayArray15[0][local18 + 1][local21 + 1] >> 2;
													Static53.method5036(-local115, 3);
													var8 = 201.5F;
													Static283.method4634(var8);
												} else {
													var8 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static283.method4634(var8);
												}
											}
											if (!local8.aBoolean317) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static146.aClass3_Sub25ArrayArrayArray7[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean318) {
														continue;
													}
												}
												if (local18 <= Static19.anInt361 && local18 > Static183.anInt3631) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean318 && (local153.aBoolean317 || (local8.anInt4477 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static19.anInt361 && local18 < Static11.anInt5176 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean318 && (local153.aBoolean317 || (local8.anInt4477 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static289.anInt5787 && local21 > Static198.anInt3862) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean318 && (local153.aBoolean317 || (local8.anInt4477 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static289.anInt5787 && local21 < Static17.anInt338 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean318 && (local153.aBoolean317 || (local8.anInt4477 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean317 = false;
											if (local8.aClass3_Sub25_1 != null) {
												local153 = local8.aClass3_Sub25_1;
												if (Static283.aBoolean393) {
													Static283.method4634(201.5F - (float) (local153.anInt4479 + 1) * 50.0F);
												}
												if (local153.aClass110_1 == null) {
													if (local153.aClass111_1 != null) {
														if (Static306.method4923(0, local18, local21)) {
															Static56.method913(local153.aClass111_1, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local18, local21, true);
														} else {
															Static56.method913(local153.aClass111_1, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local18, local21, false);
														}
													}
												} else if (Static306.method4923(0, local18, local21)) {
													Static103.method1668(local153.aClass110_1, 0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local18, local21, true);
												} else {
													Static103.method1668(local153.aClass110_1, 0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local18, local21, false);
												}
												var30 = local153.aClass19_1;
												if (var30 != null) {
													if (Static283.aBoolean393) {
														if ((var30.anInt472 & local8.anInt4473) == 0) {
															Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
														} else {
															Static142.method2414(var30.anInt472, Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local27, local18, local21);
														}
													}
													var30.aClass10_3.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, var30.anInt476 - Static282.anInt5668, var30.anInt481 - Static112.anInt5733, var30.anInt483 - Static104.anInt1924, var30.aLong20, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt4483; local65++) {
													var33 = local153.aClass85Array3[local65];
													if (var33 != null) {
														if (Static283.aBoolean393) {
															Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
														}
														var33.aClass10_7.method4982(var33.anInt2470, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, var33.anInt2476 - Static282.anInt5668, var33.anInt2481 - Static112.anInt5733, var33.anInt2473 - Static104.anInt1924, var33.aLong107, local24, null);
													}
												}
												if (Static283.aBoolean393) {
													Static283.method4634(var8);
												}
											}
											var32 = false;
											if (local8.aClass110_1 == null) {
												if (local8.aClass111_1 != null) {
													if (Static306.method4923(local27, local18, local21)) {
														Static56.method913(local8.aClass111_1, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local18, local21, true);
													} else {
														var32 = true;
														Static56.method913(local8.aClass111_1, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local18, local21, false);
													}
												}
											} else if (Static306.method4923(local27, local18, local21)) {
												Static103.method1668(local8.aClass110_1, local27, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local18, local21, true);
											} else {
												var32 = true;
												if (local8.aClass110_1.anInt3169 != 12345678 || Static5.aBoolean8 && local24 <= Static203.anInt3976) {
													Static103.method1668(local8.aClass110_1, local27, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local18, local21, false);
												}
											}
											if (var32) {
												@Pc(549) Class13 local549 = local8.aClass13_1;
												if (local549 != null && (local549.aLong15 & 0x80000000L) != 0L) {
													if (Static283.aBoolean393 && local549.aBoolean32) {
														Static283.method4634(var8 + 50.0F - 1.5F);
													}
													if (Static283.aBoolean393) {
														Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
													}
													local549.aClass10_1.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local549.anInt346 - Static282.anInt5668, local549.anInt342 - Static112.anInt5733, local549.anInt345 - Static104.anInt1924, local549.aLong15, local24, null);
													if (Static283.aBoolean393 && local549.aBoolean32) {
														Static283.method4634(var8);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class19 local616 = local8.aClass19_1;
											@Pc(619) Class95 local619 = local8.aClass95_1;
											if (local616 != null || local619 != null) {
												if (Static19.anInt361 == local18) {
													var10++;
												} else if (Static19.anInt361 < local18) {
													var10 += 2;
												}
												if (Static289.anInt5787 == local21) {
													var10 += 3;
												} else if (Static289.anInt5787 > local21) {
													var10 += 6;
												}
												local65 = Static262.anIntArray560[var10];
												local8.anInt4473 = Static126.anIntArray291[var10];
											}
											if (local616 != null) {
												if ((local616.anInt472 & Static187.anIntArray427[var10]) == 0) {
													local8.anInt4478 = 0;
												} else if (local616.anInt472 == 16) {
													local8.anInt4478 = 3;
													local8.anInt4486 = Static118.anIntArray229[var10];
													local8.anInt4484 = 3 - local8.anInt4486;
												} else if (local616.anInt472 == 32) {
													local8.anInt4478 = 6;
													local8.anInt4486 = Static230.anIntArray499[var10];
													local8.anInt4484 = 6 - local8.anInt4486;
												} else if (local616.anInt472 == 64) {
													local8.anInt4478 = 12;
													local8.anInt4486 = Static258.anIntArray556[var10];
													local8.anInt4484 = 12 - local8.anInt4486;
												} else {
													local8.anInt4478 = 9;
													local8.anInt4486 = Static179.anIntArray406[var10];
													local8.anInt4484 = 9 - local8.anInt4486;
												}
												if ((local616.anInt472 & local65) != 0 && !Static224.method4975(local27, local18, local21, local616.anInt472)) {
													if (Static283.aBoolean393) {
														Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
													}
													local616.aClass10_3.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local616.anInt476 - Static282.anInt5668, local616.anInt481 - Static112.anInt5733, local616.anInt483 - Static104.anInt1924, local616.aLong20, local24, null);
												}
												if ((local616.anInt480 & local65) != 0 && !Static224.method4975(local27, local18, local21, local616.anInt480)) {
													if (Static283.aBoolean393) {
														Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
													}
													local616.aClass10_2.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local616.anInt476 - Static282.anInt5668, local616.anInt481 - Static112.anInt5733, local616.anInt483 - Static104.anInt1924, local616.aLong20, local24, null);
												}
											}
											if (local619 != null && !Static173.method2866(local27, local18, local21, local619.aClass10_9.method4973())) {
												if (Static283.aBoolean393) {
													Static283.method4634(var8 - 0.5F);
												}
												if ((local619.anInt2809 & local65) != 0) {
													if (Static283.aBoolean393) {
														Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
													}
													local619.aClass10_9.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local619.anInt2807 + local619.anInt2813 - Static282.anInt5668, local619.anInt2812 - Static112.anInt5733, local619.anInt2814 + local619.anInt2806 - Static104.anInt1924, local619.aLong124, local24, null);
												} else if (local619.anInt2809 == 256) {
													local894 = local619.anInt2807 - Static282.anInt5668;
													local899 = local619.anInt2812 - Static112.anInt5733;
													local904 = local619.anInt2814 - Static104.anInt1924;
													var17 = local619.anInt2811;
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
														if (Static283.aBoolean393) {
															Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
														}
														local619.aClass10_9.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local894 + local619.anInt2813, local899, local904 + local619.anInt2806, local619.aLong124, local24, null);
													} else if (local619.aClass10_8 != null) {
														if (Static283.aBoolean393) {
															Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
														}
														local619.aClass10_8.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local894, local899, local904, local619.aLong124, local24, null);
													}
												}
												if (Static283.aBoolean393) {
													Static283.method4634(var8);
												}
											}
											if (var32) {
												@Pc(1001) Class13 local1001 = local8.aClass13_1;
												if (local1001 != null && (local1001.aLong15 & 0x80000000L) == 0L) {
													if (Static283.aBoolean393 && local1001.aBoolean32) {
														Static283.method4634(var8 + 50.0F - 1.5F);
													}
													if (Static283.aBoolean393) {
														Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
													}
													local1001.aClass10_1.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local1001.anInt346 - Static282.anInt5668, local1001.anInt342 - Static112.anInt5733, local1001.anInt345 - Static104.anInt1924, local1001.aLong15, local24, null);
													if (Static283.aBoolean393 && local1001.aBoolean32) {
														Static283.method4634(var8);
													}
												}
												@Pc(1064) Class23 local1064 = local8.aClass23_1;
												if (local1064 != null && local1064.anInt570 == 0) {
													if (Static283.aBoolean393) {
														Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
													}
													if (local1064.aClass10_6 != null) {
														local1064.aClass10_6.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local1064.anInt564 - Static282.anInt5668, local1064.anInt566 - Static112.anInt5733, local1064.anInt569 - Static104.anInt1924, local1064.aLong21, local24, null);
													}
													if (local1064.aClass10_5 != null) {
														local1064.aClass10_5.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local1064.anInt564 - Static282.anInt5668, local1064.anInt566 - Static112.anInt5733, local1064.anInt569 - Static104.anInt1924, local1064.aLong21, local24, null);
													}
													if (local1064.aClass10_4 != null) {
														local1064.aClass10_4.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local1064.anInt564 - Static282.anInt5668, local1064.anInt566 - Static112.anInt5733, local1064.anInt569 - Static104.anInt1924, local1064.aLong21, local24, null);
													}
												}
											}
											local894 = local8.anInt4477;
											if (local894 != 0) {
												if (local18 < Static19.anInt361 && (local894 & 0x4) != 0) {
													var39 = local31[local18 + 1][local21];
													if (var39 != null && var39.aBoolean318) {
														Static26.aClass56_2.method1282(var39);
													}
												}
												if (local21 < Static289.anInt5787 && (local894 & 0x2) != 0) {
													var39 = local31[local18][local21 + 1];
													if (var39 != null && var39.aBoolean318) {
														Static26.aClass56_2.method1282(var39);
													}
												}
												if (local18 > Static19.anInt361 && (local894 & 0x1) != 0) {
													var39 = local31[local18 - 1][local21];
													if (var39 != null && var39.aBoolean318) {
														Static26.aClass56_2.method1282(var39);
													}
												}
												if (local21 > Static289.anInt5787 && (local894 & 0x8) != 0) {
													var39 = local31[local18][local21 - 1];
													if (var39 != null && var39.aBoolean318) {
														Static26.aClass56_2.method1282(var39);
													}
												}
											}
											break;
										}
										if (local8.anInt4478 != 0) {
											var32 = true;
											for (var10 = 0; var10 < local8.anInt4483; var10++) {
												if (local8.aClass85Array3[var10].anInt2484 != Static23.anInt428 && (local8.anIntArray498[var10] & local8.anInt4478) == local8.anInt4486) {
													var32 = false;
													break;
												}
											}
											if (var32) {
												var30 = local8.aClass19_1;
												if (!Static224.method4975(local27, local18, local21, var30.anInt472)) {
													if (Static283.aBoolean393) {
														label1037: {
															if ((var30.aLong20 & 0xFC000L) == 16384L) {
																local65 = var30.anInt476 - Static282.anInt5668;
																local115 = var30.anInt483 - Static104.anInt1924;
																local1332 = (int) (var30.aLong20 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static307.anInt6023 - 1) {
																		Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18 - 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static295.anInt4973 - 1 && local21 < Static307.anInt6023 - 1) {
																		Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18 + 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static295.anInt4973 - 1 && local21 > 0) {
																		Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18 + 1, local21 - 1);
																		break label1037;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18 - 1, local21 - 1);
																		break label1037;
																	}
																}
															}
															Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
														}
													}
													var30.aClass10_3.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, var30.anInt476 - Static282.anInt5668, var30.anInt481 - Static112.anInt5733, var30.anInt483 - Static104.anInt1924, var30.aLong20, local24, null);
												}
												local8.anInt4478 = 0;
											}
										}
										if (!local8.aBoolean316) {
											break;
										}
										try {
											var9 = local8.anInt4483;
											local8.aBoolean316 = false;
											var10 = 0;
											label844: for (local65 = 0; local65 < var9; local65++) {
												var33 = local8.aClass85Array3[local65];
												if (var33.anInt2484 != Static23.anInt428) {
													for (local1332 = var33.anInt2482; local1332 <= var33.anInt2474; local1332++) {
														for (local894 = var33.anInt2480; local894 <= var33.anInt2478; local894++) {
															var39 = local31[local1332][local894];
															if (var39.aBoolean317) {
																local8.aBoolean316 = true;
																continue label844;
															}
															if (var39.anInt4478 != 0) {
																local904 = 0;
																if (local1332 > var33.anInt2482) {
																	local904++;
																}
																if (local1332 < var33.anInt2474) {
																	local904 += 4;
																}
																if (local894 > var33.anInt2480) {
																	local904 += 8;
																}
																if (local894 < var33.anInt2478) {
																	local904 += 2;
																}
																if ((local904 & var39.anInt4478) == local8.anInt4484) {
																	local8.aBoolean316 = true;
																	continue label844;
																}
															}
														}
													}
													Static108.aClass85Array2[var10++] = var33;
													local1332 = Static19.anInt361 - var33.anInt2482;
													local894 = var33.anInt2474 - Static19.anInt361;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static289.anInt5787 - var33.anInt2480;
													local904 = var33.anInt2478 - Static289.anInt5787;
													if (local904 > local899) {
														var33.anInt2472 = local1332 + local904;
													} else {
														var33.anInt2472 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class85 local1628 = Static108.aClass85Array2[local1332];
													if (local1628.anInt2484 != Static23.anInt428) {
														if (local1628.anInt2472 > local65) {
															local65 = local1628.anInt2472;
															local115 = local1332;
														} else if (local1628.anInt2472 == local65) {
															local899 = local1628.anInt2476 - Static282.anInt5668;
															local904 = local1628.anInt2473 - Static104.anInt1924;
															var17 = Static108.aClass85Array2[local115].anInt2476 - Static282.anInt5668;
															var18 = Static108.aClass85Array2[local115].anInt2473 - Static104.anInt1924;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class85 local1697 = Static108.aClass85Array2[local115];
												local1697.anInt2484 = Static23.anInt428;
												if (!Static92.method1366(local27, local1697.anInt2482, local1697.anInt2474, local1697.anInt2480, local1697.anInt2478, local1697.aClass10_7.method4973())) {
													if (Static283.aBoolean393) {
														if ((local1697.aLong107 & 0xFC000L) == 147456L) {
															Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
															local894 = local1697.anInt2476 - Static282.anInt5668;
															local899 = local1697.anInt2473 - Static104.anInt1924;
															local904 = (int) (local1697.aLong107 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static142.method2405(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static142.method2405(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static142.method2405(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static142.method2405(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static142.method2408(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local1697.anInt2482, local1697.anInt2480, local1697.anInt2474, local1697.anInt2478);
														}
													}
													local1697.aClass10_7.method4982(local1697.anInt2470, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local1697.anInt2476 - Static282.anInt5668, local1697.anInt2481 - Static112.anInt5733, local1697.anInt2473 - Static104.anInt1924, local1697.aLong107, local24, null);
												}
												for (local894 = local1697.anInt2482; local894 <= local1697.anInt2474; local894++) {
													for (local899 = local1697.anInt2480; local899 <= local1697.anInt2478; local899++) {
														@Pc(1863) Class3_Sub25 local1863 = local31[local894][local899];
														if (local1863.anInt4478 != 0) {
															Static26.aClass56_2.method1282(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean318) {
															Static26.aClass56_2.method1282(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean316) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean316 = false;
											break;
										}
									}
									if (local8.aClass12_1 != null) {
										if (Static283.aBoolean393) {
											@Pc(1905) GL local1905 = Static283.aGL1;
											Static283.method4634(var8);
											Static71.method1087(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924);
											var10 = local8.anInt4482 * 128 + 64 - Static282.anInt5668;
											local65 = Static256.anIntArrayArrayArray14[local24][local8.anInt4482][local8.anInt4475] - Static112.anInt5733;
											local115 = local8.anInt4475 * 128 + 64 - Static104.anInt1924;
											if (local24 < 3) {
												local1332 = Static256.anIntArrayArrayArray14[local24][local8.anInt4482][local8.anInt4475] - Static256.anIntArrayArrayArray14[local24 + 1][local8.anInt4482][local8.anInt4475];
											} else {
												local1332 = 1024;
											}
											local894 = local115 * Static27.anInt485 - var10 * Static279.anInt5606 >> 16;
											local899 = local65 * Static296.anInt5883 + local894 * anInt5353 >> 16;
											local904 = local899 + (anInt5353 * 91 + Static296.anInt5883 * 0 >> 16);
											var17 = local899 + (anInt5353 * -91 - local1332 * Static296.anInt5883 >> 16);
											if (var17 < local904 - 1597) {
												var17 = local904 - 1597;
											}
											var18 = local904 + 2 - var17;
											@Pc(2030) Class47_Sub2_Sub1 local2030 = null;
											@Pc(2032) Class47_Sub3 local2032 = null;
											@Pc(2034) int local2034 = -1;
											@Pc(2040) Class47_Sub2_Sub1 local2040 = (Class47_Sub2_Sub1) local8.aClass12_1.method295();
											while (true) {
												label1054: {
													if (local2040 != null) {
														if (local2040.aClass47_Sub3_1 == null || local2040.aClass47_Sub3_1.aClass47_Sub1_6.aBoolean103) {
															local2040.method4804();
															break label1054;
														}
														if ((byte) (local2040.aClass47_Sub3_1.aClass47_Sub1_6.aLong53 & 0xFFL) != local8.aByte24) {
															local8.aClass12_1 = null;
															break;
														}
														if (local2030 == null) {
															local2030 = local2040;
															local2032 = local2040.aClass47_Sub3_1;
															local2034 = local2032.aClass164_1.anInt5303;
															break label1054;
														}
													}
													if (local2030 != null && (local2040 == null || local2040.aClass47_Sub3_1 != local2032 || local2040.aClass47_Sub3_1.aClass164_1.anInt5303 != local2034)) {
														@Pc(2097) int local2097;
														for (local2097 = 0; local2097 < var18; local2097++) {
															Static71.anIntArray116[local2097] = 0;
														}
														for (local2097 = 0; local2097 < 32; local2097++) {
															Static71.anIntArray117[local2097] = 0;
														}
														Static71.anInt1301 = 0;
														for (@Pc(2121) Class47_Sub2_Sub1 local2121 = local2030; local2121 != local2040; local2121 = (Class47_Sub2_Sub1) local2121.aClass47_Sub2_6) {
															if (local2121.aClass47_Sub3_1 != null) {
																@Pc(2134) int local2134 = (local2121.anInt5552 >> 12) - Static282.anInt5668;
																@Pc(2141) int local2141 = (local2121.anInt5550 >> 12) - Static112.anInt5733;
																@Pc(2148) int local2148 = (local2121.anInt5547 >> 12) - Static104.anInt1924;
																@Pc(2158) int local2158 = local2148 * Static27.anInt485 - local2134 * Static279.anInt5606 >> 16;
																@Pc(2170) int local2170 = (local2141 * Static296.anInt5883 + local2158 * anInt5353 >> 16) - var17;
																if (Static71.anIntArray116[local2170] < 32) {
																	Static71.aShortArrayArray3[local2170][Static71.anIntArray116[local2170]++] = local2121.aShort45;
																} else {
																	if (Static71.anIntArray116[local2170] == 32) {
																		if (Static71.anInt1301 == 32) {
																			if (Static71.aBoolean105) {
																				System.out.println("Overflowed world-based radix sort");
																			}
																			break;
																		}
																		Static71.anIntArray116[local2170] += Static71.anInt1301++ + 1;
																	}
																	@Pc(2227) int local2227 = Static71.anIntArray117[Static71.anIntArray116[local2170] - 32 - 1];
																	if (local2227 < 768) {
																		@Pc(2239) short[] local2239 = Static71.aShortArrayArray4[Static71.anIntArray116[local2170] - 32 - 1];
																		@Pc(2247) int local2247 = Static71.anIntArray116[local2170] - 32 - 1;
																		@Pc(2249) int local2249 = Static71.anIntArray117[Static71.anIntArray116[local2170] - 32 - 1];
																		Static71.anIntArray117[local2247] = Static71.anIntArray117[Static71.anIntArray116[local2170] - 32 - 1] + 1;
																		local2239[local2249] = local2121.aShort45;
																	}
																}
															}
															if (local2121.aClass47_Sub2_6 == local8.aClass12_1.aClass47_Sub2_1) {
																break;
															}
														}
														@Pc(2270) boolean local2270 = false;
														if (Static71.aBoolean104 && local2032.aClass164_1.anInt5321 != -1) {
															Static16.anInterface4_1.method2902(local2032.aClass164_1.anInt5321);
															local2270 = true;
														} else {
															Static283.method4636(-1);
														}
														@Pc(2293) float local2293 = (float) local2034 * Static71.aFloat15;
														if (local2293 > 64.0F) {
															local2293 = 64.0F;
														}
														local1905.glPointSize(local2293);
														local2032.aClass47_Sub1_6.method1075(local1905, var18, local2270, local2032.aClass164_1.aBoolean370);
														if (local2040 != null) {
															local2030 = local2040;
															local2032 = local2040.aClass47_Sub3_1;
															local2034 = local2040.aClass47_Sub3_1.aClass164_1.anInt5303;
														}
													}
													if (local2040 == null) {
														break;
													}
												}
												local2040 = (Class47_Sub2_Sub1) local8.aClass12_1.method293();
											}
											Static71.method1083();
										} else {
											var9 = Static71.anInt1297 + Static16.anInt325;
											var10 = Static71.anInt1295 + Static16.anInt324;
											@Pc(2347) Class47_Sub2 local2347 = local8.aClass12_1.aClass47_Sub2_1;
											for (@Pc(2350) Class47_Sub2 local2350 = local2347.aClass47_Sub2_6; local2350 != local2347; local2350 = local2350.aClass47_Sub2_6) {
												@Pc(2356) Class47_Sub2_Sub1 local2356 = (Class47_Sub2_Sub1) local2350;
												if (local2356.aClass47_Sub3_1 != null && !local2356.aClass47_Sub3_1.aClass47_Sub1_6.aBoolean103) {
													if ((byte) (local2356.aClass47_Sub3_1.aClass47_Sub1_6.aLong53 & 0xFFL) != local8.aByte24) {
														local8.aClass12_1 = null;
														break;
													}
													local894 = (local2356.anInt5552 >> 12) - Static282.anInt5668;
													local899 = (local2356.anInt5550 >> 12) - Static112.anInt5733;
													local904 = (local2356.anInt5547 >> 12) - Static104.anInt1924;
													var17 = local904 * Static279.anInt5606 + local894 * Static27.anInt485 >> 16;
													local904 = local904 * Static27.anInt485 - local894 * Static279.anInt5606 >> 16;
													local894 = var17;
													var17 = local899 * anInt5353 - local904 * Static296.anInt5883 >> 16;
													local904 = local899 * Static296.anInt5883 + local904 * anInt5353 >> 16;
													if (local904 >= 50) {
														var18 = var9 + (local894 << 9) / local904;
														var19 = var10 + (var17 << 9) / local904;
														@Pc(2468) int local2468 = local904 * 400;
														if (local2468 == 0) {
															local2468 = 1;
														}
														Static143.method2450(var18, var19, (local2356.aClass47_Sub3_1.aClass164_1.anInt5303 << 16) / local2468, local2356.anInt5553, local2356.anInt5553 >> 24 & 0xFF);
													}
												}
											}
										}
									}
								} while (!local8.aBoolean318);
							} while (local8.anInt4478 != 0);
							if (local18 > Static19.anInt361 || local18 <= Static183.anInt3631) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean318);
						if (local18 < Static19.anInt361 || local18 >= Static11.anInt5176 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean318);
					if (local21 > Static289.anInt5787 || local21 <= Static198.anInt3862) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean318);
				if (local21 < Static289.anInt5787 || local21 >= Static17.anInt338 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean318);
			local8.aBoolean318 = false;
			Static122.anInt2305--;
			@Pc(2596) Class23 local2596 = local8.aClass23_1;
			if (local2596 != null && local2596.anInt570 != 0) {
				if (Static283.aBoolean393) {
					Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
				}
				if (local2596.aClass10_6 != null) {
					local2596.aClass10_6.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local2596.anInt564 - Static282.anInt5668, local2596.anInt566 - Static112.anInt5733 - local2596.anInt570, local2596.anInt569 - Static104.anInt1924, local2596.aLong21, local24, null);
				}
				if (local2596.aClass10_5 != null) {
					local2596.aClass10_5.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local2596.anInt564 - Static282.anInt5668, local2596.anInt566 - Static112.anInt5733 - local2596.anInt570, local2596.anInt569 - Static104.anInt1924, local2596.aLong21, local24, null);
				}
				if (local2596.aClass10_4 != null) {
					local2596.aClass10_4.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local2596.anInt564 - Static282.anInt5668, local2596.anInt566 - Static112.anInt5733 - local2596.anInt570, local2596.anInt569 - Static104.anInt1924, local2596.aLong21, local24, null);
				}
			}
			if (local8.anInt4473 != 0) {
				@Pc(2706) Class95 local2706 = local8.aClass95_1;
				if (local2706 != null && !Static173.method2866(local27, local18, local21, local2706.aClass10_9.method4973())) {
					if ((local2706.anInt2809 & local8.anInt4473) != 0) {
						if (Static283.aBoolean393) {
							Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
						}
						local2706.aClass10_9.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local2706.anInt2807 + local2706.anInt2813 - Static282.anInt5668, local2706.anInt2812 - Static112.anInt5733, local2706.anInt2814 + local2706.anInt2806 - Static104.anInt1924, local2706.aLong124, local24, null);
					} else if (local2706.anInt2809 == 256) {
						local65 = local2706.anInt2807 - Static282.anInt5668;
						local115 = local2706.anInt2812 - Static112.anInt5733;
						local1332 = local2706.anInt2814 - Static104.anInt1924;
						local894 = local2706.anInt2811;
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
							if (Static283.aBoolean393) {
								Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
							}
							local2706.aClass10_9.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local65 + local2706.anInt2813, local115, local1332 + local2706.anInt2806, local2706.aLong124, local24, null);
						} else if (local2706.aClass10_8 != null) {
							if (Static283.aBoolean393) {
								Static142.method2413(Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local24, local18, local21);
							}
							local2706.aClass10_8.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local65, local115, local1332, local2706.aLong124, local24, null);
						}
					}
				}
				@Pc(2872) Class19 local2872 = local8.aClass19_1;
				if (local2872 != null) {
					if ((local2872.anInt480 & local8.anInt4473) != 0 && !Static224.method4975(local27, local18, local21, local2872.anInt480)) {
						if (Static283.aBoolean393) {
							Static142.method2414(local2872.anInt480, Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local27, local18, local21);
						}
						local2872.aClass10_2.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local2872.anInt476 - Static282.anInt5668, local2872.anInt481 - Static112.anInt5733, local2872.anInt483 - Static104.anInt1924, local2872.aLong20, local24, null);
					}
					if ((local2872.anInt472 & local8.anInt4473) != 0 && !Static224.method4975(local27, local18, local21, local2872.anInt472)) {
						if (Static283.aBoolean393) {
							Static142.method2414(local2872.anInt472, Static282.anInt5668, Static112.anInt5733, Static104.anInt1924, local27, local18, local21);
						}
						local2872.aClass10_3.method4982(0, Static296.anInt5883, anInt5353, Static279.anInt5606, Static27.anInt485, local2872.anInt476 - Static282.anInt5668, local2872.anInt481 - Static112.anInt5733, local2872.anInt483 - Static104.anInt1924, local2872.aLong20, local24, null);
					}
				}
			}
			@Pc(2985) Class3_Sub25 local2985;
			if (local24 < Static158.anInt2948 - 1) {
				local2985 = Static146.aClass3_Sub25ArrayArrayArray7[local24 + 1][local18][local21];
				if (local2985 != null && local2985.aBoolean318) {
					Static26.aClass56_2.method1282(local2985);
				}
			}
			if (local18 < Static19.anInt361) {
				local2985 = local31[local18 + 1][local21];
				if (local2985 != null && local2985.aBoolean318) {
					Static26.aClass56_2.method1282(local2985);
				}
			}
			if (local21 < Static289.anInt5787) {
				local2985 = local31[local18][local21 + 1];
				if (local2985 != null && local2985.aBoolean318) {
					Static26.aClass56_2.method1282(local2985);
				}
			}
			if (local18 > Static19.anInt361) {
				local2985 = local31[local18 - 1][local21];
				if (local2985 != null && local2985.aBoolean318) {
					Static26.aClass56_2.method1282(local2985);
				}
			}
			if (local21 > Static289.anInt5787) {
				local2985 = local31[local18][local21 - 1];
				if (local2985 != null && local2985.aBoolean318) {
					Static26.aClass56_2.method1282(local2985);
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public static void method4347() {
		@Pc(2) Class41 local2 = Static125.aClass41_1;
		synchronized (Static125.aClass41_1) {
			Static39.anInt681 = Static166.anInt3120;
			Static141.anInt2718++;
			Static167.anInt3153 = Static117.anInt2181;
			Static153.anInt2892 = Static279.anInt5628;
			Static40.anInt6052 = Static213.anInt4156;
			Static293.anInt5844 = Static217.anInt4263;
			Static7.anInt169 = Static117.anInt2178;
			Static126.aLong103 = Static114.aLong244;
			Static213.anInt4156 = 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZ)V")
	public static void method4348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg0, 9);
		local8.method971();
		local8.anInt1140 = arg2;
		local8.anInt1132 = arg1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!ud;B)V")
	public static void method4350(@OriginalArg(0) Class10_Sub5 arg0) {
		@Pc(14) Class31 local14 = arg0.method4191();
		arg0.anInt5066 = local14.anInt912;
		if (arg0.anInt5044 == 0) {
			arg0.anInt5059 = 0;
			return;
		}
		if (arg0.anInt5061 != -1 && arg0.anInt5027 == 0) {
			@Pc(42) Class15 local42 = Static253.method4288(arg0.anInt5061);
			if (arg0.anInt5021 > 0 && local42.anInt419 == 0) {
				arg0.anInt5059++;
				return;
			}
			if (arg0.anInt5021 <= 0 && local42.anInt426 == 0) {
				arg0.anInt5059++;
				return;
			}
		}
		if (arg0.anInt5023 != -1 && Static124.anInt2371 >= arg0.anInt5050) {
			@Pc(97) Class173 local97 = Static297.method1843(arg0.anInt5023);
			if (local97.aBoolean380 && local97.anInt5489 != -1) {
				@Pc(110) Class15 local110 = Static253.method4288(local97.anInt5489);
				if (arg0.anInt5021 > 0 && local110.anInt419 == 0) {
					arg0.anInt5059++;
					return;
				}
				if (arg0.anInt5021 <= 0 && local110.anInt426 == 0) {
					arg0.anInt5059++;
					return;
				}
			}
		}
		@Pc(146) int local146 = arg0.anInt5073;
		@Pc(149) int local149 = arg0.anInt5016;
		@Pc(165) int local165 = arg0.anIntArray537[arg0.anInt5044 - 1] * 128 + arg0.method4186() * 64;
		@Pc(182) int local182 = arg0.anIntArray535[arg0.anInt5044 - 1] * 128 + arg0.method4186() * 64;
		if (local165 - local146 > 256 || local165 - local146 < -256 || local182 - local149 > 256 || local182 - local149 < -256) {
			arg0.anInt5016 = local182;
			arg0.anInt5073 = local165;
			return;
		}
		if (local165 <= local146) {
			if (local165 >= local146) {
				if (local182 > local149) {
					arg0.anInt5018 = 1024;
				} else if (local182 < local149) {
					arg0.anInt5018 = 0;
				}
			} else if (local149 < local182) {
				arg0.anInt5018 = 768;
			} else if (local182 < local149) {
				arg0.anInt5018 = 256;
			} else {
				arg0.anInt5018 = 512;
			}
		} else if (local149 < local182) {
			arg0.anInt5018 = 1280;
		} else if (local182 >= local149) {
			arg0.anInt5018 = 1536;
		} else {
			arg0.anInt5018 = 1792;
		}
		@Pc(301) int local301 = arg0.anInt5018 - arg0.anInt5043 & 0x7FF;
		@Pc(304) int local304 = local14.anInt908;
		@Pc(306) int local306 = 4;
		@Pc(308) boolean local308 = true;
		if (local301 > 1024) {
			local301 -= 2048;
		}
		if (local301 >= -256 && local301 <= 256) {
			local304 = local14.anInt896;
		} else if (local301 >= 256 && local301 < 768) {
			local304 = local14.anInt916;
		} else if (local301 >= -768 && local301 <= -256) {
			local304 = local14.anInt887;
		}
		if (local304 == -1) {
			local304 = local14.anInt896;
		}
		@Pc(359) byte local359 = 1;
		arg0.anInt5066 = local304;
		if (arg0 instanceof Class10_Sub5_Sub2) {
			local308 = ((Class10_Sub5_Sub2) arg0).aClass124_1.aBoolean268;
		}
		if (local308) {
			if (arg0.anInt5018 != arg0.anInt5043 && arg0.anInt5076 == -1 && arg0.anInt5017 != 0) {
				local306 = 2;
			}
			if (arg0.anInt5044 > 2) {
				local306 = 6;
			}
			if (arg0.anInt5044 > 3) {
				local306 = 8;
			}
			if (arg0.anInt5059 > 0 && arg0.anInt5044 > 1) {
				local306 = 8;
				arg0.anInt5059--;
			}
		} else {
			if (arg0.anInt5044 > 1) {
				local306 = 6;
			}
			if (arg0.anInt5044 > 2) {
				local306 = 8;
			}
			if (arg0.anInt5059 > 0 && arg0.anInt5044 > 1) {
				arg0.anInt5059--;
				local306 = 8;
			}
		}
		if (arg0.aByteArray69[arg0.anInt5044 - 1] == 2) {
			local359 = 2;
			local306 <<= 0x1;
		} else if (arg0.aByteArray69[arg0.anInt5044 - 1] == 0) {
			local306 >>= 0x1;
			local359 = 0;
		}
		if (local306 < 8 || local14.anInt919 == -1) {
			if (local14.anInt915 != -1 && local359 == 0) {
				if (local14.anInt908 == arg0.anInt5066 && local14.anInt884 != -1) {
					arg0.anInt5066 = local14.anInt884;
				} else if (arg0.anInt5066 == local14.anInt887 && local14.anInt899 != -1) {
					arg0.anInt5066 = local14.anInt899;
				} else if (local14.anInt916 == arg0.anInt5066 && local14.anInt906 != -1) {
					arg0.anInt5066 = local14.anInt906;
				} else {
					arg0.anInt5066 = local14.anInt915;
				}
			}
		} else if (local14.anInt908 == arg0.anInt5066 && local14.anInt910 != -1) {
			arg0.anInt5066 = local14.anInt910;
		} else if (local14.anInt887 == arg0.anInt5066 && local14.anInt902 != -1) {
			arg0.anInt5066 = local14.anInt902;
		} else if (local14.anInt916 == arg0.anInt5066 && local14.anInt885 != -1) {
			arg0.anInt5066 = local14.anInt885;
		} else {
			arg0.anInt5066 = local14.anInt919;
		}
		if (local14.anInt890 != -1) {
			local306 <<= 0x7;
			if (arg0.anInt5044 == 1) {
				@Pc(634) int local634 = arg0.anInt5072 * arg0.anInt5072;
				@Pc(651) int local651 = (local165 < arg0.anInt5073 ? arg0.anInt5073 - local165 : local165 + -arg0.anInt5073) << 7;
				@Pc(673) int local673 = (local182 >= arg0.anInt5016 ? local182 - arg0.anInt5016 : arg0.anInt5016 + -local182) << 7;
				@Pc(684) int local684 = local651 <= local673 ? local673 : local651;
				@Pc(691) int local691 = local14.anInt890 * 2 * local684;
				if (local634 > local691) {
					arg0.anInt5072 /= 2;
				} else if (local634 / 2 > local684) {
					arg0.anInt5072 -= local14.anInt890;
					if (arg0.anInt5072 < 0) {
						arg0.anInt5072 = 0;
					}
				} else if (arg0.anInt5072 < local306) {
					arg0.anInt5072 += local14.anInt890;
					if (arg0.anInt5072 > local306) {
						arg0.anInt5072 = local306;
					}
				}
			} else if (local306 > arg0.anInt5072) {
				arg0.anInt5072 += local14.anInt890;
				if (local306 < arg0.anInt5072) {
					arg0.anInt5072 = local306;
				}
			} else if (arg0.anInt5072 > 0) {
				arg0.anInt5072 -= local14.anInt890;
				if (arg0.anInt5072 < 0) {
					arg0.anInt5072 = 0;
				}
			}
			local306 = arg0.anInt5072 >> 7;
			if (local306 < 1) {
				local306 = 1;
			}
		}
		if (local165 > local146) {
			arg0.anInt5073 += local306;
			if (arg0.anInt5073 > local165) {
				arg0.anInt5073 = local165;
			}
		} else if (local165 < local146) {
			arg0.anInt5073 -= local306;
			if (local165 > arg0.anInt5073) {
				arg0.anInt5073 = local165;
			}
		}
		if (local182 > local149) {
			arg0.anInt5016 += local306;
			if (local182 < arg0.anInt5016) {
				arg0.anInt5016 = local182;
			}
		} else if (local182 < local149) {
			arg0.anInt5016 -= local306;
			if (local182 > arg0.anInt5016) {
				arg0.anInt5016 = local182;
			}
		}
		if (local165 == arg0.anInt5073 && local182 == arg0.anInt5016) {
			if (arg0.anInt5021 > 0) {
				arg0.anInt5021--;
			}
			arg0.anInt5044--;
		}
	}
}
