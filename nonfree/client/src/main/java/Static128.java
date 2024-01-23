import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public static int anInt2548 = 0;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString90 = "Face here";

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	public static int anInt2551 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
	public static void method2020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1_Sub2 local12 = Static46.method824(7, arg1);
		local12.method294();
		local12.anInt293 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!mc;Z)V")
	public static void method2021(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) boolean arg1) {
		Static281.aClass24_28.method473(arg0);
		while (true) {
			@Pc(8) Class1_Sub17 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class1_Sub17[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class1_Sub17 local153;
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
										@Pc(363) Class61 var30;
										@Pc(469) boolean var32;
										@Pc(425) Class60 var33;
										@Pc(1179) Class1_Sub17 var39;
										while (true) {
											do {
												local8 = (Class1_Sub17) Static281.aClass24_28.method469();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean238);
											local18 = local8.anInt3442;
											local21 = local8.anInt3447;
											local24 = local8.anInt3446;
											local27 = local8.anInt3449;
											local31 = Static122.aClass1_Sub17ArrayArrayArray3[local24];
											var8 = 0.0F;
											if (Static291.aBoolean404) {
												if (Static61.anIntArrayArrayArray5 == Static208.anIntArrayArrayArray11) {
													var9 = Static300.anIntArrayArray47[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static252.anInt4937) {
														Static252.anInt4937 = var10;
														Static292.method4349(var10);
														Static96.method1395(Static285.method4250());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static178.anInt3588) {
														Static178.anInt3588 = local65;
														Static83.method1245(local65);
													}
													local115 = Static89.anIntArrayArrayArray6[0][local18][local21] + Static89.anIntArrayArrayArray6[0][local18 + 1][local21] + Static89.anIntArrayArrayArray6[0][local18][local21 + 1] + Static89.anIntArrayArrayArray6[0][local18 + 1][local21 + 1] >> 2;
													Static207.method3280(3, -local115);
													var8 = 201.5F;
													Static291.method4299(var8);
												} else {
													var8 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static291.method4299(var8);
												}
											}
											if (!local8.aBoolean239) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static122.aClass1_Sub17ArrayArrayArray3[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean238) {
														continue;
													}
												}
												if (local18 <= Static257.anInt5014 && local18 > Static233.anInt4690) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean238 && (local153.aBoolean239 || (local8.anInt3454 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static257.anInt5014 && local18 < Static10.anInt187 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean238 && (local153.aBoolean239 || (local8.anInt3454 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static198.anInt3993 && local21 > Static137.anInt2713) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean238 && (local153.aBoolean239 || (local8.anInt3454 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static198.anInt3993 && local21 < Static315.anInt5923 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean238 && (local153.aBoolean239 || (local8.anInt3454 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean239 = false;
											if (local8.aClass1_Sub17_1 != null) {
												local153 = local8.aClass1_Sub17_1;
												if (Static291.aBoolean404) {
													Static291.method4299(201.5F - (float) (local153.anInt3449 + 1) * 50.0F);
												}
												if (local153.aClass36_1 == null) {
													if (local153.aClass105_1 != null) {
														if (Static140.method2233(0, local18, local21)) {
															Static302.method4514(local153.aClass105_1, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local18, local21, true);
														} else {
															Static302.method4514(local153.aClass105_1, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local18, local21, false);
														}
													}
												} else if (Static140.method2233(0, local18, local21)) {
													Static109.method1793(local153.aClass36_1, 0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local18, local21, true);
												} else {
													Static109.method1793(local153.aClass36_1, 0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local18, local21, false);
												}
												var30 = local153.aClass61_1;
												if (var30 != null) {
													if (Static291.aBoolean404) {
														if ((var30.anInt1541 & local8.anInt3450) == 0) {
															Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
														} else {
															Static294.method4350(var30.anInt1541, Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local27, local18, local21);
														}
													}
													var30.aClass22_2.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, var30.anInt1545 - Static16.anInt247, var30.anInt1544 - Static273.anInt5205, var30.anInt1539 - Static245.anInt2378, var30.aLong65, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt3452; local65++) {
													var33 = local153.aClass60Array3[local65];
													if (var33 != null) {
														if (Static291.aBoolean404) {
															Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
														}
														var33.aClass22_1.method4073(var33.anInt1534, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, var33.anInt1536 - Static16.anInt247, var33.anInt1535 - Static273.anInt5205, var33.anInt1528 - Static245.anInt2378, var33.aLong64, local24, null);
													}
												}
												if (Static291.aBoolean404) {
													Static291.method4299(var8);
												}
											}
											var32 = false;
											if (local8.aClass36_1 == null) {
												if (local8.aClass105_1 != null) {
													if (Static140.method2233(local27, local18, local21)) {
														Static302.method4514(local8.aClass105_1, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local18, local21, true);
													} else {
														var32 = true;
														Static302.method4514(local8.aClass105_1, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local18, local21, false);
													}
												}
											} else if (Static140.method2233(local27, local18, local21)) {
												Static109.method1793(local8.aClass36_1, local27, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local18, local21, true);
											} else {
												var32 = true;
												if (local8.aClass36_1.anInt852 != 12345678 || Static303.aBoolean421 && local24 <= Static79.anInt1466) {
													Static109.method1793(local8.aClass36_1, local27, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local18, local21, false);
												}
											}
											if (var32) {
												@Pc(549) Class171 local549 = local8.aClass171_1;
												if (local549 != null && (local549.aLong196 & 0x80000000L) != 0L) {
													if (Static291.aBoolean404 && local549.aBoolean379) {
														Static291.method4299(var8 + 50.0F - 1.5F);
													}
													if (Static291.aBoolean404) {
														Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
													}
													local549.aClass22_10.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local549.anInt5287 - Static16.anInt247, local549.anInt5282 - Static273.anInt5205, local549.anInt5284 - Static245.anInt2378, local549.aLong196, local24, null);
													if (Static291.aBoolean404 && local549.aBoolean379) {
														Static291.method4299(var8);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class61 local616 = local8.aClass61_1;
											@Pc(619) Class102 local619 = local8.aClass102_1;
											if (local616 != null || local619 != null) {
												if (Static257.anInt5014 == local18) {
													var10++;
												} else if (Static257.anInt5014 < local18) {
													var10 += 2;
												}
												if (Static198.anInt3993 == local21) {
													var10 += 3;
												} else if (Static198.anInt3993 > local21) {
													var10 += 6;
												}
												local65 = Static38.anIntArray56[var10];
												local8.anInt3450 = Static52.anIntArray94[var10];
											}
											if (local616 != null) {
												if ((local616.anInt1541 & Static309.anIntArray529[var10]) == 0) {
													local8.anInt3444 = 0;
												} else if (local616.anInt1541 == 16) {
													local8.anInt3444 = 3;
													local8.anInt3451 = Static201.anIntArray328[var10];
													local8.anInt3453 = 3 - local8.anInt3451;
												} else if (local616.anInt1541 == 32) {
													local8.anInt3444 = 6;
													local8.anInt3451 = Static221.anIntArray346[var10];
													local8.anInt3453 = 6 - local8.anInt3451;
												} else if (local616.anInt1541 == 64) {
													local8.anInt3444 = 12;
													local8.anInt3451 = Static152.anIntArray249[var10];
													local8.anInt3453 = 12 - local8.anInt3451;
												} else {
													local8.anInt3444 = 9;
													local8.anInt3451 = Static75.anIntArray116[var10];
													local8.anInt3453 = 9 - local8.anInt3451;
												}
												if ((local616.anInt1541 & local65) != 0 && !Static293.method4621(local27, local18, local21, local616.anInt1541)) {
													if (Static291.aBoolean404) {
														Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
													}
													local616.aClass22_2.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local616.anInt1545 - Static16.anInt247, local616.anInt1544 - Static273.anInt5205, local616.anInt1539 - Static245.anInt2378, local616.aLong65, local24, null);
												}
												if ((local616.anInt1538 & local65) != 0 && !Static293.method4621(local27, local18, local21, local616.anInt1538)) {
													if (Static291.aBoolean404) {
														Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
													}
													local616.aClass22_3.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local616.anInt1545 - Static16.anInt247, local616.anInt1544 - Static273.anInt5205, local616.anInt1539 - Static245.anInt2378, local616.aLong65, local24, null);
												}
											}
											if (local619 != null && !Static287.method4256(local27, local18, local21, local619.aClass22_4.method4071())) {
												if (Static291.aBoolean404) {
													Static291.method4299(var8 - 0.5F);
												}
												if ((local619.anInt2947 & local65) != 0) {
													if (Static291.aBoolean404) {
														Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
													}
													local619.aClass22_4.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local619.anInt2949 + local619.anInt2945 - Static16.anInt247, local619.anInt2943 - Static273.anInt5205, local619.anInt2953 + local619.anInt2951 - Static245.anInt2378, local619.aLong113, local24, null);
												} else if (local619.anInt2947 == 256) {
													local894 = local619.anInt2949 - Static16.anInt247;
													local899 = local619.anInt2943 - Static273.anInt5205;
													local904 = local619.anInt2953 - Static245.anInt2378;
													var17 = local619.anInt2950;
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
														if (Static291.aBoolean404) {
															Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
														}
														local619.aClass22_4.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local894 + local619.anInt2945, local899, local904 + local619.anInt2951, local619.aLong113, local24, null);
													} else if (local619.aClass22_5 != null) {
														if (Static291.aBoolean404) {
															Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
														}
														local619.aClass22_5.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local894, local899, local904, local619.aLong113, local24, null);
													}
												}
												if (Static291.aBoolean404) {
													Static291.method4299(var8);
												}
											}
											if (var32) {
												@Pc(1001) Class171 local1001 = local8.aClass171_1;
												if (local1001 != null && (local1001.aLong196 & 0x80000000L) == 0L) {
													if (Static291.aBoolean404 && local1001.aBoolean379) {
														Static291.method4299(var8 + 50.0F - 1.5F);
													}
													if (Static291.aBoolean404) {
														Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
													}
													local1001.aClass22_10.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local1001.anInt5287 - Static16.anInt247, local1001.anInt5282 - Static273.anInt5205, local1001.anInt5284 - Static245.anInt2378, local1001.aLong196, local24, null);
													if (Static291.aBoolean404 && local1001.aBoolean379) {
														Static291.method4299(var8);
													}
												}
												@Pc(1064) Class164 local1064 = local8.aClass164_1;
												if (local1064 != null && local1064.anInt5046 == 0) {
													if (Static291.aBoolean404) {
														Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
													}
													if (local1064.aClass22_7 != null) {
														local1064.aClass22_7.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local1064.anInt5045 - Static16.anInt247, local1064.anInt5040 - Static273.anInt5205, local1064.anInt5043 - Static245.anInt2378, local1064.aLong188, local24, null);
													}
													if (local1064.aClass22_8 != null) {
														local1064.aClass22_8.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local1064.anInt5045 - Static16.anInt247, local1064.anInt5040 - Static273.anInt5205, local1064.anInt5043 - Static245.anInt2378, local1064.aLong188, local24, null);
													}
													if (local1064.aClass22_9 != null) {
														local1064.aClass22_9.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local1064.anInt5045 - Static16.anInt247, local1064.anInt5040 - Static273.anInt5205, local1064.anInt5043 - Static245.anInt2378, local1064.aLong188, local24, null);
													}
												}
											}
											local894 = local8.anInt3454;
											if (local894 != 0) {
												if (local18 < Static257.anInt5014 && (local894 & 0x4) != 0) {
													var39 = local31[local18 + 1][local21];
													if (var39 != null && var39.aBoolean238) {
														Static281.aClass24_28.method473(var39);
													}
												}
												if (local21 < Static198.anInt3993 && (local894 & 0x2) != 0) {
													var39 = local31[local18][local21 + 1];
													if (var39 != null && var39.aBoolean238) {
														Static281.aClass24_28.method473(var39);
													}
												}
												if (local18 > Static257.anInt5014 && (local894 & 0x1) != 0) {
													var39 = local31[local18 - 1][local21];
													if (var39 != null && var39.aBoolean238) {
														Static281.aClass24_28.method473(var39);
													}
												}
												if (local21 > Static198.anInt3993 && (local894 & 0x8) != 0) {
													var39 = local31[local18][local21 - 1];
													if (var39 != null && var39.aBoolean238) {
														Static281.aClass24_28.method473(var39);
													}
												}
											}
											break;
										}
										if (local8.anInt3444 != 0) {
											var32 = true;
											for (var10 = 0; var10 < local8.anInt3452; var10++) {
												if (local8.aClass60Array3[var10].anInt1533 != Static68.anInt1344 && (local8.anIntArray276[var10] & local8.anInt3444) == local8.anInt3451) {
													var32 = false;
													break;
												}
											}
											if (var32) {
												var30 = local8.aClass61_1;
												if (!Static293.method4621(local27, local18, local21, var30.anInt1541)) {
													if (Static291.aBoolean404) {
														label1037: {
															if ((var30.aLong65 & 0xFC000L) == 16384L) {
																local65 = var30.anInt1545 - Static16.anInt247;
																local115 = var30.anInt1539 - Static245.anInt2378;
																local1332 = (int) (var30.aLong65 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static178.anInt3591 - 1) {
																		Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18 - 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static6.anInt118 - 1 && local21 < Static178.anInt3591 - 1) {
																		Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18 + 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static6.anInt118 - 1 && local21 > 0) {
																		Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18 + 1, local21 - 1);
																		break label1037;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18 - 1, local21 - 1);
																		break label1037;
																	}
																}
															}
															Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
														}
													}
													var30.aClass22_2.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, var30.anInt1545 - Static16.anInt247, var30.anInt1544 - Static273.anInt5205, var30.anInt1539 - Static245.anInt2378, var30.aLong65, local24, null);
												}
												local8.anInt3444 = 0;
											}
										}
										if (!local8.aBoolean240) {
											break;
										}
										try {
											var9 = local8.anInt3452;
											local8.aBoolean240 = false;
											var10 = 0;
											label844: for (local65 = 0; local65 < var9; local65++) {
												var33 = local8.aClass60Array3[local65];
												if (var33.anInt1533 != Static68.anInt1344) {
													for (local1332 = var33.anInt1529; local1332 <= var33.anInt1523; local1332++) {
														for (local894 = var33.anInt1522; local894 <= var33.anInt1537; local894++) {
															var39 = local31[local1332][local894];
															if (var39.aBoolean239) {
																local8.aBoolean240 = true;
																continue label844;
															}
															if (var39.anInt3444 != 0) {
																local904 = 0;
																if (local1332 > var33.anInt1529) {
																	local904++;
																}
																if (local1332 < var33.anInt1523) {
																	local904 += 4;
																}
																if (local894 > var33.anInt1522) {
																	local904 += 8;
																}
																if (local894 < var33.anInt1537) {
																	local904 += 2;
																}
																if ((local904 & var39.anInt3444) == local8.anInt3453) {
																	local8.aBoolean240 = true;
																	continue label844;
																}
															}
														}
													}
													Static9.aClass60Array2[var10++] = var33;
													local1332 = Static257.anInt5014 - var33.anInt1529;
													local894 = var33.anInt1523 - Static257.anInt5014;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static198.anInt3993 - var33.anInt1522;
													local904 = var33.anInt1537 - Static198.anInt3993;
													if (local904 > local899) {
														var33.anInt1527 = local1332 + local904;
													} else {
														var33.anInt1527 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class60 local1628 = Static9.aClass60Array2[local1332];
													if (local1628.anInt1533 != Static68.anInt1344) {
														if (local1628.anInt1527 > local65) {
															local65 = local1628.anInt1527;
															local115 = local1332;
														} else if (local1628.anInt1527 == local65) {
															local899 = local1628.anInt1536 - Static16.anInt247;
															local904 = local1628.anInt1528 - Static245.anInt2378;
															var17 = Static9.aClass60Array2[local115].anInt1536 - Static16.anInt247;
															var18 = Static9.aClass60Array2[local115].anInt1528 - Static245.anInt2378;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class60 local1697 = Static9.aClass60Array2[local115];
												local1697.anInt1533 = Static68.anInt1344;
												if (!Static107.method1773(local27, local1697.anInt1529, local1697.anInt1523, local1697.anInt1522, local1697.anInt1537, local1697.aClass22_1.method4071())) {
													if (Static291.aBoolean404) {
														if ((local1697.aLong64 & 0xFC000L) == 147456L) {
															Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
															local894 = local1697.anInt1536 - Static16.anInt247;
															local899 = local1697.anInt1528 - Static245.anInt2378;
															local904 = (int) (local1697.aLong64 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static294.method4359(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static294.method4359(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static294.method4359(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static294.method4359(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static294.method4366(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local1697.anInt1529, local1697.anInt1522, local1697.anInt1523, local1697.anInt1537);
														}
													}
													local1697.aClass22_1.method4073(local1697.anInt1534, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local1697.anInt1536 - Static16.anInt247, local1697.anInt1535 - Static273.anInt5205, local1697.anInt1528 - Static245.anInt2378, local1697.aLong64, local24, null);
												}
												for (local894 = local1697.anInt1529; local894 <= local1697.anInt1523; local894++) {
													for (local899 = local1697.anInt1522; local899 <= local1697.anInt1537; local899++) {
														@Pc(1863) Class1_Sub17 local1863 = local31[local894][local899];
														if (local1863.anInt3444 != 0) {
															Static281.aClass24_28.method473(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean238) {
															Static281.aClass24_28.method473(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean240) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean240 = false;
											break;
										}
									}
									if (local8.aClass39_1 != null) {
										if (Static291.aBoolean404) {
											@Pc(1905) GL local1905 = Static291.aGL1;
											Static291.method4299(var8);
											Static149.method2395(Static16.anInt247, Static273.anInt5205, Static245.anInt2378);
											var10 = local8.anInt3442 * 128 + 64 - Static16.anInt247;
											local65 = Static208.anIntArrayArrayArray11[local24][local8.anInt3442][local8.anInt3447] - Static273.anInt5205;
											local115 = local8.anInt3447 * 128 + 64 - Static245.anInt2378;
											if (local24 < 3) {
												local1332 = Static208.anIntArrayArrayArray11[local24][local8.anInt3442][local8.anInt3447] - Static208.anIntArrayArrayArray11[local24 + 1][local8.anInt3442][local8.anInt3447];
											} else {
												local1332 = 1024;
											}
											local894 = local115 * Static172.anInt155 - var10 * Static257.anInt5010 >> 16;
											local899 = local65 * Static138.anInt2726 + local894 * Static91.anInt1749 >> 16;
											local904 = local899 + (Static91.anInt1749 * 91 + Static138.anInt2726 * 0 >> 16);
											var17 = local899 + (Static91.anInt1749 * -91 - local1332 * Static138.anInt2726 >> 16);
											if (var17 < local904 - 1597) {
												var17 = local904 - 1597;
											}
											var18 = local904 + 2 - var17;
											@Pc(2030) Class45_Sub3_Sub1 local2030 = null;
											@Pc(2032) Class45_Sub1 local2032 = null;
											@Pc(2034) int local2034 = -1;
											@Pc(2040) Class45_Sub3_Sub1 local2040 = (Class45_Sub3_Sub1) local8.aClass39_1.method830();
											while (true) {
												label1054: {
													if (local2040 != null) {
														if (local2040.aClass45_Sub1_1 == null || local2040.aClass45_Sub1_1.aClass45_Sub2_4.aBoolean216) {
															local2040.method2449();
															break label1054;
														}
														if ((byte) (local2040.aClass45_Sub1_1.aClass45_Sub2_4.aLong116 & 0xFFL) != local8.aByte10) {
															local8.aClass39_1 = null;
															break;
														}
														if (local2030 == null) {
															local2030 = local2040;
															local2032 = local2040.aClass45_Sub1_1;
															local2034 = local2032.aClass148_2.anInt4470;
															break label1054;
														}
													}
													if (local2030 != null && (local2040 == null || local2040.aClass45_Sub1_1 != local2032 || local2040.aClass45_Sub1_1.aClass148_2.anInt4470 != local2034)) {
														@Pc(2097) int local2097;
														for (local2097 = 0; local2097 < var18; local2097++) {
															Static149.anIntArray243[local2097] = 0;
														}
														for (local2097 = 0; local2097 < 32; local2097++) {
															Static149.anIntArray244[local2097] = 0;
														}
														Static149.anInt3008 = 0;
														for (@Pc(2121) Class45_Sub3_Sub1 local2121 = local2030; local2121 != local2040; local2121 = (Class45_Sub3_Sub1) local2121.aClass45_Sub3_6) {
															if (local2121.aClass45_Sub1_1 != null) {
																@Pc(2134) int local2134 = (local2121.anInt3067 >> 12) - Static16.anInt247;
																@Pc(2141) int local2141 = (local2121.anInt3066 >> 12) - Static273.anInt5205;
																@Pc(2148) int local2148 = (local2121.anInt3068 >> 12) - Static245.anInt2378;
																@Pc(2158) int local2158 = local2148 * Static172.anInt155 - local2134 * Static257.anInt5010 >> 16;
																@Pc(2170) int local2170 = (local2141 * Static138.anInt2726 + local2158 * Static91.anInt1749 >> 16) - var17;
																if (Static149.anIntArray243[local2170] < 32) {
																	Static149.aShortArrayArray19[local2170][Static149.anIntArray243[local2170]++] = local2121.aShort18;
																} else {
																	if (Static149.anIntArray243[local2170] == 32) {
																		if (Static149.anInt3008 == 32) {
																			if (Static149.aBoolean215) {
																				System.out.println("Overflowed world-based radix sort");
																			}
																			break;
																		}
																		Static149.anIntArray243[local2170] += Static149.anInt3008++ + 1;
																	}
																	@Pc(2227) int local2227 = Static149.anIntArray244[Static149.anIntArray243[local2170] - 32 - 1];
																	if (local2227 < 768) {
																		@Pc(2239) short[] local2239 = Static149.aShortArrayArray20[Static149.anIntArray243[local2170] - 32 - 1];
																		@Pc(2247) int local2247 = Static149.anIntArray243[local2170] - 32 - 1;
																		@Pc(2249) int local2249 = Static149.anIntArray244[Static149.anIntArray243[local2170] - 32 - 1];
																		Static149.anIntArray244[local2247] = Static149.anIntArray244[Static149.anIntArray243[local2170] - 32 - 1] + 1;
																		local2239[local2249] = local2121.aShort18;
																	}
																}
															}
															if (local2121.aClass45_Sub3_6 == local8.aClass39_1.aClass45_Sub3_1) {
																break;
															}
														}
														@Pc(2270) boolean local2270 = false;
														if (Static149.aBoolean214 && local2032.aClass148_2.anInt4508 != -1) {
															Static18.anInterface1_1.method1630(local2032.aClass148_2.anInt4508);
															local2270 = true;
														} else {
															Static291.method4310(-1);
														}
														@Pc(2293) float local2293 = (float) local2034 * Static149.aFloat34;
														if (local2293 > 64.0F) {
															local2293 = 64.0F;
														}
														local1905.glPointSize(local2293);
														local2032.aClass45_Sub2_4.method2400(local1905, var18, local2270, local2032.aClass148_2.aBoolean321);
														if (local2040 != null) {
															local2030 = local2040;
															local2032 = local2040.aClass45_Sub1_1;
															local2034 = local2040.aClass45_Sub1_1.aClass148_2.anInt4470;
														}
													}
													if (local2040 == null) {
														break;
													}
												}
												local2040 = (Class45_Sub3_Sub1) local8.aClass39_1.method825();
											}
											Static149.method2410();
										} else {
											var9 = Static149.anInt2993 + Static18.anInt303;
											var10 = Static149.anInt2995 + Static18.anInt302;
											@Pc(2347) Class45_Sub3 local2347 = local8.aClass39_1.aClass45_Sub3_1;
											for (@Pc(2350) Class45_Sub3 local2350 = local2347.aClass45_Sub3_6; local2350 != local2347; local2350 = local2350.aClass45_Sub3_6) {
												@Pc(2356) Class45_Sub3_Sub1 local2356 = (Class45_Sub3_Sub1) local2350;
												if (local2356.aClass45_Sub1_1 != null && !local2356.aClass45_Sub1_1.aClass45_Sub2_4.aBoolean216) {
													if ((byte) (local2356.aClass45_Sub1_1.aClass45_Sub2_4.aLong116 & 0xFFL) != local8.aByte10) {
														local8.aClass39_1 = null;
														break;
													}
													local894 = (local2356.anInt3067 >> 12) - Static16.anInt247;
													local899 = (local2356.anInt3066 >> 12) - Static273.anInt5205;
													local904 = (local2356.anInt3068 >> 12) - Static245.anInt2378;
													var17 = local904 * Static257.anInt5010 + local894 * Static172.anInt155 >> 16;
													local904 = local904 * Static172.anInt155 - local894 * Static257.anInt5010 >> 16;
													local894 = var17;
													var17 = local899 * Static91.anInt1749 - local904 * Static138.anInt2726 >> 16;
													local904 = local899 * Static138.anInt2726 + local904 * Static91.anInt1749 >> 16;
													if (local904 >= 50) {
														var18 = var9 + (local894 << 9) / local904;
														var19 = var10 + (var17 << 9) / local904;
														@Pc(2468) int local2468 = local904 * 400;
														if (local2468 == 0) {
															local2468 = 1;
														}
														Static41.method749(var18, var19, (local2356.aClass45_Sub1_1.aClass148_2.anInt4470 << 16) / local2468, local2356.anInt3071, local2356.anInt3071 >> 24 & 0xFF);
													}
												}
											}
										}
									}
								} while (!local8.aBoolean238);
							} while (local8.anInt3444 != 0);
							if (local18 > Static257.anInt5014 || local18 <= Static233.anInt4690) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean238);
						if (local18 < Static257.anInt5014 || local18 >= Static10.anInt187 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean238);
					if (local21 > Static198.anInt3993 || local21 <= Static137.anInt2713) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean238);
				if (local21 < Static198.anInt3993 || local21 >= Static315.anInt5923 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean238);
			local8.aBoolean238 = false;
			Static296.anInt5597--;
			@Pc(2596) Class164 local2596 = local8.aClass164_1;
			if (local2596 != null && local2596.anInt5046 != 0) {
				if (Static291.aBoolean404) {
					Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
				}
				if (local2596.aClass22_7 != null) {
					local2596.aClass22_7.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local2596.anInt5045 - Static16.anInt247, local2596.anInt5040 - Static273.anInt5205 - local2596.anInt5046, local2596.anInt5043 - Static245.anInt2378, local2596.aLong188, local24, null);
				}
				if (local2596.aClass22_8 != null) {
					local2596.aClass22_8.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local2596.anInt5045 - Static16.anInt247, local2596.anInt5040 - Static273.anInt5205 - local2596.anInt5046, local2596.anInt5043 - Static245.anInt2378, local2596.aLong188, local24, null);
				}
				if (local2596.aClass22_9 != null) {
					local2596.aClass22_9.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local2596.anInt5045 - Static16.anInt247, local2596.anInt5040 - Static273.anInt5205 - local2596.anInt5046, local2596.anInt5043 - Static245.anInt2378, local2596.aLong188, local24, null);
				}
			}
			if (local8.anInt3450 != 0) {
				@Pc(2706) Class102 local2706 = local8.aClass102_1;
				if (local2706 != null && !Static287.method4256(local27, local18, local21, local2706.aClass22_4.method4071())) {
					if ((local2706.anInt2947 & local8.anInt3450) != 0) {
						if (Static291.aBoolean404) {
							Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
						}
						local2706.aClass22_4.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local2706.anInt2949 + local2706.anInt2945 - Static16.anInt247, local2706.anInt2943 - Static273.anInt5205, local2706.anInt2953 + local2706.anInt2951 - Static245.anInt2378, local2706.aLong113, local24, null);
					} else if (local2706.anInt2947 == 256) {
						local65 = local2706.anInt2949 - Static16.anInt247;
						local115 = local2706.anInt2943 - Static273.anInt5205;
						local1332 = local2706.anInt2953 - Static245.anInt2378;
						local894 = local2706.anInt2950;
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
							if (Static291.aBoolean404) {
								Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
							}
							local2706.aClass22_4.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local65 + local2706.anInt2945, local115, local1332 + local2706.anInt2951, local2706.aLong113, local24, null);
						} else if (local2706.aClass22_5 != null) {
							if (Static291.aBoolean404) {
								Static294.method4363(Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local24, local18, local21);
							}
							local2706.aClass22_5.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local65, local115, local1332, local2706.aLong113, local24, null);
						}
					}
				}
				@Pc(2872) Class61 local2872 = local8.aClass61_1;
				if (local2872 != null) {
					if ((local2872.anInt1538 & local8.anInt3450) != 0 && !Static293.method4621(local27, local18, local21, local2872.anInt1538)) {
						if (Static291.aBoolean404) {
							Static294.method4350(local2872.anInt1538, Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local27, local18, local21);
						}
						local2872.aClass22_3.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local2872.anInt1545 - Static16.anInt247, local2872.anInt1544 - Static273.anInt5205, local2872.anInt1539 - Static245.anInt2378, local2872.aLong65, local24, null);
					}
					if ((local2872.anInt1541 & local8.anInt3450) != 0 && !Static293.method4621(local27, local18, local21, local2872.anInt1541)) {
						if (Static291.aBoolean404) {
							Static294.method4350(local2872.anInt1541, Static16.anInt247, Static273.anInt5205, Static245.anInt2378, local27, local18, local21);
						}
						local2872.aClass22_2.method4073(0, Static138.anInt2726, Static91.anInt1749, Static257.anInt5010, Static172.anInt155, local2872.anInt1545 - Static16.anInt247, local2872.anInt1544 - Static273.anInt5205, local2872.anInt1539 - Static245.anInt2378, local2872.aLong65, local24, null);
					}
				}
			}
			@Pc(2985) Class1_Sub17 local2985;
			if (local24 < Static68.anInt1350 - 1) {
				local2985 = Static122.aClass1_Sub17ArrayArrayArray3[local24 + 1][local18][local21];
				if (local2985 != null && local2985.aBoolean238) {
					Static281.aClass24_28.method473(local2985);
				}
			}
			if (local18 < Static257.anInt5014) {
				local2985 = local31[local18 + 1][local21];
				if (local2985 != null && local2985.aBoolean238) {
					Static281.aClass24_28.method473(local2985);
				}
			}
			if (local21 < Static198.anInt3993) {
				local2985 = local31[local18][local21 + 1];
				if (local2985 != null && local2985.aBoolean238) {
					Static281.aClass24_28.method473(local2985);
				}
			}
			if (local18 > Static257.anInt5014) {
				local2985 = local31[local18 - 1][local21];
				if (local2985 != null && local2985.aBoolean238) {
					Static281.aClass24_28.method473(local2985);
				}
			}
			if (local21 > Static198.anInt3993) {
				local2985 = local31[local18][local21 - 1];
				if (local2985 != null && local2985.aBoolean238) {
					Static281.aClass24_28.method473(local2985);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIII)V")
	public static void method2022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class47 local3 = new Class47();
		local3.anInt1360 = arg1 / 128;
		local3.anInt1351 = arg2 / 128;
		local3.anInt1354 = arg3 / 128;
		local3.anInt1333 = arg4 / 128;
		local3.anInt1355 = arg0;
		local3.anInt1347 = arg1;
		local3.anInt1342 = arg2;
		local3.anInt1357 = arg3;
		local3.anInt1349 = arg4;
		local3.anInt1341 = arg5;
		local3.anInt1345 = arg6;
		Static198.aClass47Array6[Static208.anInt4105++] = local3;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)[Lclient!wg;")
	public static Class191[] method2023() {
		if (Static2.aClass191Array1 == null) {
			@Pc(21) Class191[] local21 = Static293.method4624(Static117.aClass117_3);
			@Pc(23) int local23 = 0;
			@Pc(27) Class191[] local27 = new Class191[local21.length];
			label53: for (@Pc(29) int local29 = 0; local29 < local21.length; local29++) {
				@Pc(41) Class191 local41 = local21[local29];
				if ((local41.anInt5844 <= 0 || local41.anInt5844 >= 24) && local41.anInt5845 >= 800 && local41.anInt5843 >= 600) {
					for (@Pc(66) int local66 = 0; local66 < local23; local66++) {
						@Pc(73) Class191 local73 = local27[local66];
						if (local41.anInt5845 == local73.anInt5845 && local73.anInt5843 == local41.anInt5843) {
							if (local73.anInt5844 < local41.anInt5844) {
								local27[local66] = local41;
							}
							continue label53;
						}
					}
					local27[local23] = local41;
					local23++;
				}
			}
			Static2.aClass191Array1 = new Class191[local23];
			Static319.method511(local27, 0, Static2.aClass191Array1, 0, local23);
			@Pc(122) int[] local122 = new int[Static2.aClass191Array1.length];
			for (@Pc(124) int local124 = 0; local124 < Static2.aClass191Array1.length; local124++) {
				@Pc(132) Class191 local132 = Static2.aClass191Array1[local124];
				local122[local124] = local132.anInt5845 * local132.anInt5843;
			}
			Static56.method976(Static2.aClass191Array1, local122);
		}
		return Static2.aClass191Array1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method2025(@OriginalArg(1) Class146 arg0) {
		@Pc(9) int local9 = arg0.anInt4350;
		if (local9 == 324) {
			if (Static83.anInt1507 == -1) {
				Static144.anInt2844 = arg0.anInt4411;
				Static83.anInt1507 = arg0.anInt4406;
			}
			if (Static51.aClass119_1.aBoolean258) {
				arg0.anInt4406 = Static83.anInt1507;
			} else {
				arg0.anInt4406 = Static144.anInt2844;
			}
		} else if (local9 == 325) {
			if (Static83.anInt1507 == -1) {
				Static144.anInt2844 = arg0.anInt4411;
				Static83.anInt1507 = arg0.anInt4406;
			}
			if (Static51.aClass119_1.aBoolean258) {
				arg0.anInt4406 = Static144.anInt2844;
			} else {
				arg0.anInt4406 = Static83.anInt1507;
			}
		} else if (local9 == 327) {
			arg0.anInt4351 = 150;
			arg0.anInt4400 = (int) (Math.sin((double) Static37.anInt757 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt4409 = 5;
			arg0.anInt4389 = -1;
		} else if (local9 == 328) {
			if (Static229.aClass22_Sub3_Sub2_2.aString153 == null) {
				arg0.anInt4389 = 0;
				arg0.anInt4397 = 0;
			} else {
				arg0.anInt4351 = 150;
				arg0.anInt4400 = (int) (Math.sin((double) Static37.anInt757 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4389 = 2047;
				arg0.anInt4409 = 5;
				arg0.anInt4397 = Static2.method36(Static229.aClass22_Sub3_Sub2_2.aString153);
				arg0.anInt4353 = 0;
				arg0.anInt4388 = Static229.aClass22_Sub3_Sub2_2.anInt4635;
				arg0.anInt4367 = Static229.aClass22_Sub3_Sub2_2.anInt4566;
				arg0.anInt4408 = Static229.aClass22_Sub3_Sub2_2.anInt4612;
			}
		}
	}
}
