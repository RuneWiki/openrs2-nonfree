import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
	public static int anInt2806;

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
	public static int anInt2810;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_825 = Static181.method2795("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "[[B")
	public static final byte[][] aByteArrayArray12 = new byte[1000][];

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_826 = Static181.method2795("FULL");

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "Lclient!qe;")
	public static Class83 aClass83_827 = aClass83_826;

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "[I")
	public static final int[] anIntArray280 = new int[5];

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)I")
	public static int method2160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!ai;Z)V")
	public static void method2161(@OriginalArg(1) Class2_Sub3_Sub1 arg0) {
		while (true) {
			@Pc(14) Class2_Sub24 local14 = (Class2_Sub24) Static180.aClass19_17.method691();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt3723; local21++) {
				if (local14.aClass15Array2[local21] != null) {
					if (local14.aClass15Array2[local21].anInt624 == 2) {
						local14.anIntArray366[local21] = -5;
					}
					if (local14.aClass15Array2[local21].anInt624 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass15Array1[local21] != null) {
					if (local14.aClass15Array1[local21].anInt624 == 2) {
						local14.anIntArray366[local21] = -6;
					}
					if (local14.aClass15Array1[local21].anInt624 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method284(226);
			arg0.method247(0);
			@Pc(94) int local94 = arg0.anInt340;
			arg0.method246(local14.anInt3726);
			for (@Pc(101) int local101 = 0; local101 < local14.anInt3723; local101++) {
				if (local14.anIntArray366[local101] == 0) {
					try {
						@Pc(125) int local125 = local14.anIntArray369[local101];
						@Pc(134) Field local134;
						@Pc(138) int local138;
						if (local125 == 0) {
							local134 = (Field) local14.aClass15Array2[local101].anObject1;
							local138 = local134.getInt(null);
							arg0.method247(0);
							arg0.method246(local138);
						} else if (local125 == 1) {
							local134 = (Field) local14.aClass15Array2[local101].anObject1;
							local134.setInt(null, local14.anIntArray367[local101]);
							arg0.method247(0);
						} else if (local125 == 2) {
							local134 = (Field) local14.aClass15Array2[local101].anObject1;
							local138 = local134.getModifiers();
							arg0.method247(0);
							arg0.method246(local138);
						}
						@Pc(207) Method local207;
						if (local125 == 3) {
							local207 = (Method) local14.aClass15Array1[local101].anObject1;
							@Pc(232) byte[][] local232 = local14.aByteArrayArrayArray73[local101];
							@Pc(236) Object[] local236 = new Object[local232.length];
							for (@Pc(238) int local238 = 0; local238 < local232.length; local238++) {
								@Pc(250) ObjectInputStream local250 = new ObjectInputStream(new ByteArrayInputStream(local232[local238]));
								local236[local238] = local250.readObject();
							}
							@Pc(269) Object local269 = local207.invoke(null, local236);
							if (local269 == null) {
								arg0.method247(0);
							} else if (local269 instanceof Number) {
								arg0.method247(1);
								arg0.method249(((Number) local269).longValue());
							} else if (local269 instanceof Class83) {
								arg0.method247(2);
								arg0.method229((Class83) local269);
							} else {
								arg0.method247(4);
							}
						} else if (local125 == 4) {
							local207 = (Method) local14.aClass15Array1[local101].anObject1;
							local138 = local207.getModifiers();
							arg0.method247(0);
							arg0.method246(local138);
						}
					} catch (@Pc(312) ClassNotFoundException local312) {
						arg0.method247(-10);
					} catch (@Pc(318) InvalidClassException local318) {
						arg0.method247(-11);
					} catch (@Pc(324) StreamCorruptedException local324) {
						arg0.method247(-12);
					} catch (@Pc(330) OptionalDataException local330) {
						arg0.method247(-13);
					} catch (@Pc(336) IllegalAccessException local336) {
						arg0.method247(-14);
					} catch (@Pc(342) IllegalArgumentException local342) {
						arg0.method247(-15);
					} catch (@Pc(348) InvocationTargetException local348) {
						arg0.method247(-16);
					} catch (@Pc(354) SecurityException local354) {
						arg0.method247(-17);
					} catch (@Pc(360) IOException local360) {
						arg0.method247(-18);
					} catch (@Pc(366) NullPointerException local366) {
						arg0.method247(-19);
					} catch (@Pc(372) Exception local372) {
						arg0.method247(-20);
					} catch (@Pc(378) Throwable local378) {
						arg0.method247(-21);
					}
				} else {
					arg0.method247(local14.anIntArray366[local101]);
				}
			}
			arg0.method245(local94);
			arg0.method255(arg0.anInt340 - local94);
			local14.method3254();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!sc;Z)V")
	public static void method2162(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) boolean arg1) {
		Static184.aClass19_18.method684(arg0);
		while (true) {
			@Pc(8) Class2_Sub23 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class2_Sub23[][] local30;
			@Pc(47) Class2_Sub23 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class105 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class78 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class2_Sub23 var32;
										while (true) {
											do {
												local8 = (Class2_Sub23) Static184.aClass19_18.method679();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean165);
											local17 = local8.anInt3561;
											local20 = local8.anInt3557;
											local23 = local8.anInt3553;
											local26 = local8.anInt3555;
											local30 = Static203.aClass2_Sub23ArrayArrayArray1[local23];
											if (!local8.aBoolean166) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static203.aClass2_Sub23ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean165) {
														continue;
													}
												}
												if (local17 <= Static206.anInt4069 && local17 > Static144.anInt3014) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean165 && (local47.aBoolean166 || (local8.anInt3563 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static206.anInt4069 && local17 < Static119.anInt2712 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean165 && (local47.aBoolean166 || (local8.anInt3563 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static4.anInt96 && local20 > Static197.anInt3926) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean165 && (local47.aBoolean166 || (local8.anInt3563 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static4.anInt96 && local20 < Static153.anInt3348 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean165 && (local47.aBoolean166 || (local8.anInt3563 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean166 = false;
											if (local8.aClass2_Sub23_1 != null) {
												local47 = local8.aClass2_Sub23_1;
												if (local47.aClass81_1 == null) {
													if (local47.aClass36_1 != null && !Static101.method1745(0, local17, local20)) {
														Static216.method3273(local47.aClass36_1, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local17, local20);
													}
												} else if (!Static101.method1745(0, local17, local20)) {
													Static141.method2276(local47.aClass81_1, 0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local17, local20);
												}
												@Pc(219) Class105 local219 = local47.aClass105_1;
												if (local219 != null) {
													local219.aClass24_11.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local219.anInt4192 - Static87.anInt1883, local219.anInt4203 - Static57.anInt1428, local219.anInt4202 - Static95.anInt2024, local219.aLong146);
												}
												for (local245 = 0; local245 < local47.anInt3554; local245++) {
													var11 = local47.aClass78Array3[local245];
													if (var11 != null) {
														var11.aClass24_4.method2974(var11.anInt3035, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, var11.anInt3039 - Static87.anInt1883, var11.anInt3025 - Static57.anInt1428, var11.anInt3026 - Static95.anInt2024, var11.aLong107);
													}
												}
											}
											var21 = false;
											if (local8.aClass81_1 == null) {
												if (local8.aClass36_1 != null && !Static101.method1745(local26, local17, local20)) {
													var21 = true;
													Static216.method3273(local8.aClass36_1, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local17, local20);
												}
											} else if (!Static101.method1745(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass81_1.anInt3055 != 12345678 || Static192.aBoolean178 && local23 <= Static117.anInt2703) {
													Static141.method2276(local8.aClass81_1, local26, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class105 local340 = local8.aClass105_1;
											@Pc(343) Class79 local343 = local8.aClass79_1;
											if (local340 != null || local343 != null) {
												if (Static206.anInt4069 == local17) {
													var20++;
												} else if (Static206.anInt4069 < local17) {
													var20 += 2;
												}
												if (Static4.anInt96 == local20) {
													var20 += 3;
												} else if (Static4.anInt96 > local20) {
													var20 += 6;
												}
												local245 = Static56.anIntArray111[var20];
												local8.anInt3558 = Static63.anIntArray325[var20];
											}
											if (local340 != null) {
												if ((local340.anInt4197 & Static83.anIntArray178[var20]) == 0) {
													local8.anInt3562 = 0;
												} else if (local340.anInt4197 == 16) {
													local8.anInt3562 = 3;
													local8.anInt3559 = Static32.anIntArray65[var20];
													local8.anInt3560 = 3 - local8.anInt3559;
												} else if (local340.anInt4197 == 32) {
													local8.anInt3562 = 6;
													local8.anInt3559 = Static166.anIntArray323[var20];
													local8.anInt3560 = 6 - local8.anInt3559;
												} else if (local340.anInt4197 == 64) {
													local8.anInt3562 = 12;
													local8.anInt3559 = Static124.anIntArray250[var20];
													local8.anInt3560 = 12 - local8.anInt3559;
												} else {
													local8.anInt3562 = 9;
													local8.anInt3559 = Static66.anIntArray146[var20];
													local8.anInt3560 = 9 - local8.anInt3559;
												}
												if ((local340.anInt4197 & local245) != 0 && !Static78.method1436(local26, local17, local20, local340.anInt4197)) {
													local340.aClass24_11.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local340.anInt4192 - Static87.anInt1883, local340.anInt4203 - Static57.anInt1428, local340.anInt4202 - Static95.anInt2024, local340.aLong146);
												}
												if ((local340.anInt4193 & local245) != 0 && !Static78.method1436(local26, local17, local20, local340.anInt4193)) {
													local340.aClass24_10.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local340.anInt4192 - Static87.anInt1883, local340.anInt4203 - Static57.anInt1428, local340.anInt4202 - Static95.anInt2024, local340.aLong146);
												}
											}
											if (local343 != null && !Static190.method2865(local26, local17, local20, local343.aClass24_6.method2978())) {
												if ((local343.anInt3045 & local245) != 0) {
													local343.aClass24_6.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local343.anInt3044 + local343.anInt3048 - Static87.anInt1883, local343.anInt3049 - Static57.anInt1428, local343.anInt3047 + local343.anInt3042 - Static95.anInt2024, local343.aLong108);
												} else if (local343.anInt3045 == 256) {
													local579 = local343.anInt3044 - Static87.anInt1883;
													local584 = local343.anInt3049 - Static57.anInt1428;
													local589 = local343.anInt3047 - Static95.anInt2024;
													var16 = local343.anInt3043;
													if (var16 == 1 || var16 == 2) {
														var17 = -local579;
													} else {
														var17 = local579;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local589;
													} else {
														var18 = local589;
													}
													if (var18 < var17) {
														local343.aClass24_6.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local579 + local343.anInt3048, local584, local589 + local343.anInt3042, local343.aLong108);
													} else if (local343.aClass24_5 != null) {
														local343.aClass24_5.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local579, local584, local589, local343.aLong108);
													}
												}
											}
											if (var21) {
												@Pc(660) Class26 local660 = local8.aClass26_1;
												if (local660 != null) {
													local660.aClass24_1.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local660.anInt1035 - Static87.anInt1883, local660.anInt1037 - Static57.anInt1428, local660.anInt1036 - Static95.anInt2024, local660.aLong32);
												}
												@Pc(687) Class104 local687 = local8.aClass104_1;
												if (local687 != null && local687.anInt4065 == 0) {
													if (local687.aClass24_7 != null) {
														local687.aClass24_7.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local687.anInt4060 - Static87.anInt1883, local687.anInt4062 - Static57.anInt1428, local687.anInt4061 - Static95.anInt2024, local687.aLong142);
													}
													if (local687.aClass24_9 != null) {
														local687.aClass24_9.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local687.anInt4060 - Static87.anInt1883, local687.anInt4062 - Static57.anInt1428, local687.anInt4061 - Static95.anInt2024, local687.aLong142);
													}
													if (local687.aClass24_8 != null) {
														local687.aClass24_8.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local687.anInt4060 - Static87.anInt1883, local687.anInt4062 - Static57.anInt1428, local687.anInt4061 - Static95.anInt2024, local687.aLong142);
													}
												}
											}
											local579 = local8.anInt3563;
											if (local579 != 0) {
												if (local17 < Static206.anInt4069 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean165) {
														Static184.aClass19_18.method684(var32);
													}
												}
												if (local20 < Static4.anInt96 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean165) {
														Static184.aClass19_18.method684(var32);
													}
												}
												if (local17 > Static206.anInt4069 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean165) {
														Static184.aClass19_18.method684(var32);
													}
												}
												if (local20 > Static4.anInt96 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean165) {
														Static184.aClass19_18.method684(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt3562 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt3554; var20++) {
												if (local8.aClass78Array3[var20].anInt3037 != Static18.anInt2019 && (local8.anIntArray328[var20] & local8.anInt3562) == local8.anInt3559) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass105_1;
												if (!Static78.method1436(local26, local17, local20, local906.anInt4197)) {
													local906.aClass24_11.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local906.anInt4192 - Static87.anInt1883, local906.anInt4203 - Static57.anInt1428, local906.anInt4202 - Static95.anInt2024, local906.aLong146);
												}
												local8.anInt3562 = 0;
											}
										}
										if (!local8.aBoolean167) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt3554;
											local8.aBoolean167 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass78Array3[local245];
												if (var11.anInt3037 != Static18.anInt2019) {
													for (local964 = var11.anInt3028; local964 <= var11.anInt3031; local964++) {
														for (local579 = var11.anInt3036; local579 <= var11.anInt3040; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean166) {
																local8.aBoolean167 = true;
																continue label558;
															}
															if (var32.anInt3562 != 0) {
																local589 = 0;
																if (local964 > var11.anInt3028) {
																	local589++;
																}
																if (local964 < var11.anInt3031) {
																	local589 += 4;
																}
																if (local579 > var11.anInt3036) {
																	local589 += 8;
																}
																if (local579 < var11.anInt3040) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt3562) == local8.anInt3560) {
																	local8.aBoolean167 = true;
																	continue label558;
																}
															}
														}
													}
													Static99.aClass78Array1[var20++] = var11;
													local579 = Static206.anInt4069 - var11.anInt3028;
													local584 = var11.anInt3031 - Static206.anInt4069;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static4.anInt96 - var11.anInt3036;
													var16 = var11.anInt3040 - Static4.anInt96;
													if (var16 > local589) {
														var11.anInt3038 = local579 + var16;
													} else {
														var11.anInt3038 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class78 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static99.aClass78Array1[local579];
													if (local1088.anInt3037 != Static18.anInt2019) {
														if (local1088.anInt3038 > local1079) {
															local1079 = local1088.anInt3038;
															local964 = local579;
														} else if (local1088.anInt3038 == local1079) {
															local589 = local1088.anInt3039 - Static87.anInt1883;
															var16 = local1088.anInt3026 - Static95.anInt2024;
															var17 = Static99.aClass78Array1[local964].anInt3039 - Static87.anInt1883;
															var18 = Static99.aClass78Array1[local964].anInt3026 - Static95.anInt2024;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static99.aClass78Array1[local964];
												local1088.anInt3037 = Static18.anInt2019;
												if (!Static123.method2099(local26, local1088.anInt3028, local1088.anInt3031, local1088.anInt3036, local1088.anInt3040, local1088.aClass24_4.method2978())) {
													local1088.aClass24_4.method2974(local1088.anInt3035, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local1088.anInt3039 - Static87.anInt1883, local1088.anInt3025 - Static57.anInt1428, local1088.anInt3026 - Static95.anInt2024, local1088.aLong107);
												}
												for (local589 = local1088.anInt3028; local589 <= local1088.anInt3031; local589++) {
													for (var16 = local1088.anInt3036; var16 <= local1088.anInt3040; var16++) {
														@Pc(1212) Class2_Sub23 local1212 = local30[local589][var16];
														if (local1212.anInt3562 != 0) {
															Static184.aClass19_18.method684(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean165) {
															Static184.aClass19_18.method684(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean167) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean167 = false;
											break;
										}
									}
								} while (!local8.aBoolean165);
							} while (local8.anInt3562 != 0);
							if (local17 > Static206.anInt4069 || local17 <= Static144.anInt3014) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean165);
						if (local17 < Static206.anInt4069 || local17 >= Static119.anInt2712 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean165);
					if (local20 > Static4.anInt96 || local20 <= Static197.anInt3926) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean165);
				if (local20 < Static4.anInt96 || local20 >= Static153.anInt3348 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean165);
			local8.aBoolean165 = false;
			Static192.anInt3806--;
			@Pc(1354) Class104 local1354 = local8.aClass104_1;
			if (local1354 != null && local1354.anInt4065 != 0) {
				if (local1354.aClass24_7 != null) {
					local1354.aClass24_7.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local1354.anInt4060 - Static87.anInt1883, local1354.anInt4062 - Static57.anInt1428 - local1354.anInt4065, local1354.anInt4061 - Static95.anInt2024, local1354.aLong142);
				}
				if (local1354.aClass24_9 != null) {
					local1354.aClass24_9.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local1354.anInt4060 - Static87.anInt1883, local1354.anInt4062 - Static57.anInt1428 - local1354.anInt4065, local1354.anInt4061 - Static95.anInt2024, local1354.aLong142);
				}
				if (local1354.aClass24_8 != null) {
					local1354.aClass24_8.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local1354.anInt4060 - Static87.anInt1883, local1354.anInt4062 - Static57.anInt1428 - local1354.anInt4065, local1354.anInt4061 - Static95.anInt2024, local1354.aLong142);
				}
			}
			if (local8.anInt3558 != 0) {
				@Pc(1449) Class79 local1449 = local8.aClass79_1;
				if (local1449 != null && !Static190.method2865(local26, local17, local20, local1449.aClass24_6.method2978())) {
					if ((local1449.anInt3045 & local8.anInt3558) != 0) {
						local1449.aClass24_6.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local1449.anInt3044 + local1449.anInt3048 - Static87.anInt1883, local1449.anInt3049 - Static57.anInt1428, local1449.anInt3047 + local1449.anInt3042 - Static95.anInt2024, local1449.aLong108);
					} else if (local1449.anInt3045 == 256) {
						local245 = local1449.anInt3044 - Static87.anInt1883;
						local1079 = local1449.anInt3049 - Static57.anInt1428;
						local964 = local1449.anInt3047 - Static95.anInt2024;
						local579 = local1449.anInt3043;
						if (local579 == 1 || local579 == 2) {
							local584 = -local245;
						} else {
							local584 = local245;
						}
						if (local579 == 2 || local579 == 3) {
							local589 = -local964;
						} else {
							local589 = local964;
						}
						if (local589 >= local584) {
							local1449.aClass24_6.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local245 + local1449.anInt3048, local1079, local964 + local1449.anInt3042, local1449.aLong108);
						} else if (local1449.aClass24_5 != null) {
							local1449.aClass24_5.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local245, local1079, local964, local1449.aLong108);
						}
					}
				}
				local906 = local8.aClass105_1;
				if (local906 != null) {
					if ((local906.anInt4193 & local8.anInt3558) != 0 && !Static78.method1436(local26, local17, local20, local906.anInt4193)) {
						local906.aClass24_10.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local906.anInt4192 - Static87.anInt1883, local906.anInt4203 - Static57.anInt1428, local906.anInt4202 - Static95.anInt2024, local906.aLong146);
					}
					if ((local906.anInt4197 & local8.anInt3558) != 0 && !Static78.method1436(local26, local17, local20, local906.anInt4197)) {
						local906.aClass24_11.method2974(0, Static163.anInt3267, Static48.anInt1235, Static112.anInt1951, Static213.anInt4239, local906.anInt4192 - Static87.anInt1883, local906.anInt4203 - Static57.anInt1428, local906.anInt4202 - Static95.anInt2024, local906.aLong146);
					}
				}
			}
			@Pc(1669) Class2_Sub23 local1669;
			if (local23 < Static135.anInt2895 - 1) {
				local1669 = Static203.aClass2_Sub23ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean165) {
					Static184.aClass19_18.method684(local1669);
				}
			}
			if (local17 < Static206.anInt4069) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean165) {
					Static184.aClass19_18.method684(local1669);
				}
			}
			if (local20 < Static4.anInt96) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean165) {
					Static184.aClass19_18.method684(local1669);
				}
			}
			if (local17 > Static206.anInt4069) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean165) {
					Static184.aClass19_18.method684(local1669);
				}
			}
			if (local20 > Static4.anInt96) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean165) {
					Static184.aClass19_18.method684(local1669);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
	public static void method2163() {
		try {
			if (Static213.anInt4246 == 0) {
				if (Static175.aClass25_5 != null) {
					Static175.aClass25_5.method796();
					Static175.aClass25_5 = null;
				}
				Static4.aBoolean4 = false;
				Static176.anInt3611 = 0;
				Static213.anInt4246 = 1;
				Static21.aClass15_3 = null;
			}
			if (Static213.anInt4246 == 1) {
				if (Static21.aClass15_3 == null) {
					Static21.aClass15_3 = Static23.aClass1_1.method1(Static196.aString6, Static208.anInt4116);
				}
				if (Static21.aClass15_3.anInt624 == 2) {
					throw new IOException();
				}
				if (Static21.aClass15_3.anInt624 == 1) {
					Static175.aClass25_5 = new Class25((Socket) Static21.aClass15_3.anObject1, Static23.aClass1_1);
					Static21.aClass15_3 = null;
					Static213.anInt4246 = 2;
				}
			}
			if (Static213.anInt4246 == 2) {
				@Pc(74) long local74 = Static16.aLong78 = Static206.aClass83_1172.method2397();
				Static69.aClass2_Sub3_Sub1_2.anInt340 = 0;
				Static69.aClass2_Sub3_Sub1_2.method247(14);
				@Pc(88) int local88 = (int) (local74 >> 16 & 0x1FL);
				Static69.aClass2_Sub3_Sub1_2.method247(local88);
				Static175.aClass25_5.method800(Static69.aClass2_Sub3_Sub1_2.aByteArray2, 2);
				Static213.anInt4246 = 3;
				Static33.aClass2_Sub3_Sub1_1.anInt340 = 0;
			}
			@Pc(123) int local123;
			if (Static213.anInt4246 == 3) {
				if (Static168.aClass10_2 != null) {
					Static168.aClass10_2.method1776();
				}
				if (Static142.aClass10_1 != null) {
					Static142.aClass10_1.method1776();
				}
				local123 = Static175.aClass25_5.method802();
				if (Static168.aClass10_2 != null) {
					Static168.aClass10_2.method1776();
				}
				if (Static142.aClass10_1 != null) {
					Static142.aClass10_1.method1776();
				}
				if (local123 != 0) {
					Static16.method1830(local123);
					return;
				}
				Static213.anInt4246 = 4;
				Static33.aClass2_Sub3_Sub1_1.anInt340 = 0;
			}
			if (Static213.anInt4246 == 4) {
				if (Static33.aClass2_Sub3_Sub1_1.anInt340 < 8) {
					local123 = Static175.aClass25_5.method798();
					if (8 - Static33.aClass2_Sub3_Sub1_1.anInt340 < local123) {
						local123 = 8 - Static33.aClass2_Sub3_Sub1_1.anInt340;
					}
					if (local123 > 0) {
						Static175.aClass25_5.method804(Static33.aClass2_Sub3_Sub1_1.aByteArray2, Static33.aClass2_Sub3_Sub1_1.anInt340, local123);
						Static33.aClass2_Sub3_Sub1_1.anInt340 += local123;
					}
				}
				if (Static33.aClass2_Sub3_Sub1_1.anInt340 == 8) {
					Static33.aClass2_Sub3_Sub1_1.anInt340 = 0;
					Static185.aLong128 = Static33.aClass2_Sub3_Sub1_1.method243();
					Static213.anInt4246 = 5;
				}
			}
			if (Static213.anInt4246 == 5) {
				Static69.aClass2_Sub3_Sub1_2.anInt340 = 0;
				@Pc(216) int[] local216 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static185.aLong128 >> 32), (int) Static185.aLong128 };
				Static69.aClass2_Sub3_Sub1_2.method247(10);
				Static69.aClass2_Sub3_Sub1_2.method246(local216[0]);
				Static69.aClass2_Sub3_Sub1_2.method246(local216[1]);
				Static69.aClass2_Sub3_Sub1_2.method246(local216[2]);
				Static69.aClass2_Sub3_Sub1_2.method246(local216[3]);
				Static69.aClass2_Sub3_Sub1_2.method249(Static206.aClass83_1172.method2397());
				Static69.aClass2_Sub3_Sub1_2.method229(Static206.aClass83_1169);
				Static69.aClass2_Sub3_Sub1_2.method237(Static180.aBigInteger2, Static55.aBigInteger1);
				Static93.aClass2_Sub3_Sub1_3.anInt340 = 0;
				if (Static68.anInt1625 == 40) {
					Static93.aClass2_Sub3_Sub1_3.method247(18);
				} else {
					Static93.aClass2_Sub3_Sub1_3.method247(16);
				}
				Static93.aClass2_Sub3_Sub1_3.method247(Static69.aClass2_Sub3_Sub1_2.anInt340 + Static168.method2614(Static63.aClass83_988) + 129);
				Static93.aClass2_Sub3_Sub1_3.method246(497);
				Static93.aClass2_Sub3_Sub1_3.method247(Static158.aBoolean148 ? 1 : 0);
				Static107.method2366(Static93.aClass2_Sub3_Sub1_3);
				Static93.aClass2_Sub3_Sub1_3.method229(Static63.aClass83_988);
				Static93.aClass2_Sub3_Sub1_3.method246(Static132.anInt2868);
				Static93.aClass2_Sub3_Sub1_3.method246(Static18.aClass28_Sub1_13.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static68.aClass28_Sub1_10.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static201.aClass28_Sub1_26.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static44.aClass28_Sub1_7.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static137.aClass28_Sub1_21.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static32.aClass28_Sub1_3.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static157.aClass28_Sub1_23.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static160.aClass28_Sub1_24.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static113.aClass28_Sub1_18.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static34.aClass28_Sub1_4.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static197.aClass28_Sub1_25.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static125.aClass28_Sub1_19.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static211.aClass28_Sub1_27.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static73.aClass28_Sub1_11.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static42.aClass28_Sub1_6.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static106.aClass28_Sub1_16.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static44.aClass28_Sub1_8.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static23.aClass28_Sub1_2.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static142.aClass28_Sub1_22.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static57.aClass28_Sub1_9.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static130.aClass28_Sub1_20.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static91.aClass28_Sub1_12.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static37.aClass28_Sub1_5.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method246(Static97.aClass28_Sub1_14.anInt1103);
				Static93.aClass2_Sub3_Sub1_3.method265(Static69.aClass2_Sub3_Sub1_2.aByteArray2, Static69.aClass2_Sub3_Sub1_2.anInt340);
				Static175.aClass25_5.method800(Static93.aClass2_Sub3_Sub1_3.aByteArray2, Static93.aClass2_Sub3_Sub1_3.anInt340);
				Static69.aClass2_Sub3_Sub1_2.method275(local216);
				for (@Pc(482) int local482 = 0; local482 < 4; local482++) {
					local216[local482] += 50;
				}
				Static33.aClass2_Sub3_Sub1_1.method275(local216);
				Static213.anInt4246 = 6;
			}
			if (Static213.anInt4246 == 6 && Static175.aClass25_5.method798() > 0) {
				local123 = Static175.aClass25_5.method802();
				if (local123 == 21 && Static68.anInt1625 == 20) {
					Static213.anInt4246 = 7;
				} else if (local123 == 2) {
					Static213.anInt4246 = 9;
				} else if (local123 == 15 && Static68.anInt1625 == 40) {
					Static48.method959();
					return;
				} else if (local123 == 23 && Static146.anInt3034 < 1) {
					Static213.anInt4246 = 0;
					Static146.anInt3034++;
				} else {
					Static16.method1830(local123);
					return;
				}
			}
			if (Static213.anInt4246 == 7 && Static175.aClass25_5.method798() > 0) {
				Static185.anInt3725 = Static175.aClass25_5.method802() * 60 + 180;
				Static213.anInt4246 = 8;
			}
			if (Static213.anInt4246 == 8) {
				Static176.anInt3611 = 0;
				Static90.method1585(Static117.aClass83_793, Static67.method1268(new Class83[] { Static129.method2179(Static185.anInt3725 / 60), Static39.aClass83_332 }), Static57.aClass83_456);
				if (--Static185.anInt3725 <= 0) {
					Static213.anInt4246 = 0;
				}
			} else {
				if (Static213.anInt4246 == 9 && Static175.aClass25_5.method798() >= 9) {
					Static156.anInt4250 = Static175.aClass25_5.method802();
					Static150.anInt3076 = Static175.aClass25_5.method802();
					Static195.aBoolean181 = Static175.aClass25_5.method802() == 1;
					Static138.anInt2924 = Static175.aClass25_5.method802();
					Static138.anInt2924 <<= 0x8;
					Static138.anInt2924 += Static175.aClass25_5.method802();
					Static114.anInt2626 = Static175.aClass25_5.method802();
					Static175.aClass25_5.method804(Static33.aClass2_Sub3_Sub1_1.aByteArray2, 0, 1);
					Static33.aClass2_Sub3_Sub1_1.anInt340 = 0;
					Static148.anInt3046 = Static33.aClass2_Sub3_Sub1_1.method278();
					Static175.aClass25_5.method804(Static33.aClass2_Sub3_Sub1_1.aByteArray2, 0, 2);
					Static33.aClass2_Sub3_Sub1_1.anInt340 = 0;
					Static131.anInt2843 = Static33.aClass2_Sub3_Sub1_1.method269();
					Static213.anInt4246 = 10;
				}
				if (Static213.anInt4246 != 10) {
					Static176.anInt3611++;
					if (Static176.anInt3611 > 2000) {
						if (Static146.anInt3034 < 1) {
							Static213.anInt4246 = 0;
							if (Static94.anInt2004 == Static208.anInt4116) {
								Static208.anInt4116 = Static80.anInt1792;
							} else {
								Static208.anInt4116 = Static94.anInt2004;
							}
							Static146.anInt3034++;
						} else {
							Static16.method1830(-3);
						}
					}
				} else if (Static175.aClass25_5.method798() >= Static131.anInt2843) {
					Static33.aClass2_Sub3_Sub1_1.anInt340 = 0;
					Static175.aClass25_5.method804(Static33.aClass2_Sub3_Sub1_1.aByteArray2, 0, Static131.anInt2843);
					Static155.method2380();
					Static2.anInt63 = -1;
					Static18.method1617(false);
					Static148.anInt3046 = -1;
				}
			}
		} catch (@Pc(767) IOException local767) {
			if (Static146.anInt3034 < 1) {
				Static146.anInt3034++;
				if (Static208.anInt4116 == Static94.anInt2004) {
					Static208.anInt4116 = Static80.anInt1792;
				} else {
					Static208.anInt4116 = Static94.anInt2004;
				}
				Static213.anInt4246 = 0;
			} else {
				Static16.method1830(-2);
			}
		}
	}
}
