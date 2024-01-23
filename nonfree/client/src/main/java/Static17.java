import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!be", name = "H", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!be", name = "L", descriptor = "I")
	public static int anInt367;

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
	public static int anInt372;

	@OriginalMember(owner = "client!be", name = "R", descriptor = "I")
	public static int anInt373;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IC)Z")
	private static boolean method320(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!mn;IZ)V")
	public static void method321(@OriginalArg(0) Class4_Sub22 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray32;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class4_Sub2_Sub2 local18 = Static95.method1527(local14);
		if (local18 == null) {
			return;
		}
		Static266.anInt4997 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36 = -1;
		@Pc(39) int[] local39 = local18.anIntArray16;
		@Pc(41) byte local41 = -1;
		@Pc(44) int[] local44 = local18.anIntArray15;
		@Pc(58) int local58;
		try {
			Static117.aStringArray19 = new String[local18.anInt176];
			Static82.anIntArray172 = new int[local18.anInt174];
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			@Pc(81) String local81;
			@Pc(101) int local101;
			for (local58 = 1; local58 < local8.length; local58++) {
				if (local8[local58] instanceof Integer) {
					local101 = (Integer) local8[local58];
					if (local101 == -2147483647) {
						local101 = arg0.anInt3402;
					}
					if (local101 == -2147483646) {
						local101 = arg0.anInt3408;
					}
					if (local101 == -2147483645) {
						local101 = arg0.aClass22_15 == null ? -1 : arg0.aClass22_15.anInt596;
					}
					if (local101 == -2147483644) {
						local101 = arg0.anInt3409;
					}
					if (local101 == -2147483643) {
						local101 = arg0.aClass22_15 == null ? -1 : arg0.aClass22_15.anInt561;
					}
					if (local101 == -2147483642) {
						local101 = arg0.aClass22_16 == null ? -1 : arg0.aClass22_16.anInt596;
					}
					if (local101 == -2147483641) {
						local101 = arg0.aClass22_16 == null ? -1 : arg0.aClass22_16.anInt561;
					}
					if (local101 == -2147483640) {
						local101 = arg0.anInt3403;
					}
					if (local101 == -2147483639) {
						local101 = arg0.anInt3405;
					}
					Static82.anIntArray172[local54++] = local101;
				} else if (local8[local58] instanceof String) {
					local81 = (String) local8[local58];
					if (local81.equals("event_opbase")) {
						local81 = arg0.aString111;
					}
					Static117.aStringArray19[local56++] = local81;
				}
			}
			local58 = 0;
			label4416: while (true) {
				local58++;
				if (arg1 < local58) {
					throw new RuntimeException("slow");
				}
				local36++;
				@Pc(218) int local218 = local39[local36];
				@Pc(807) int local807;
				@Pc(651) int local651;
				@Pc(813) int local813;
				@Pc(603) String local603;
				@Pc(645) int[] local645;
				if (local218 < 100) {
					if (local218 == 0) {
						Static218.anIntArray478[local27++] = local44[local36];
						continue;
					}
					if (local218 == 1) {
						local101 = local44[local36];
						Static218.anIntArray478[local27++] = Static221.anIntArray393[local101];
						continue;
					}
					if (local218 == 2) {
						local101 = local44[local36];
						local27--;
						Static234.method3668(local101, Static218.anIntArray478[local27]);
						continue;
					}
					if (local218 == 3) {
						Static167.aStringArray26[local29++] = local18.aStringArray1[local36];
						continue;
					}
					if (local218 == 6) {
						local36 += local44[local36];
						continue;
					}
					if (local218 == 7) {
						local27 -= 2;
						if (Static218.anIntArray478[local27] != Static218.anIntArray478[local27 + 1]) {
							local36 += local44[local36];
						}
						continue;
					}
					if (local218 == 8) {
						local27 -= 2;
						if (Static218.anIntArray478[local27] == Static218.anIntArray478[local27 + 1]) {
							local36 += local44[local36];
						}
						continue;
					}
					if (local218 == 9) {
						local27 -= 2;
						if (Static218.anIntArray478[local27] < Static218.anIntArray478[local27 + 1]) {
							local36 += local44[local36];
						}
						continue;
					}
					if (local218 == 10) {
						local27 -= 2;
						if (Static218.anIntArray478[local27 + 1] < Static218.anIntArray478[local27]) {
							local36 += local44[local36];
						}
						continue;
					}
					if (local218 == 21) {
						if (Static266.anInt4997 == 0) {
							return;
						}
						@Pc(420) Class85 local420 = Static229.aClass85Array2[--Static266.anInt4997];
						Static117.aStringArray19 = local420.aStringArray21;
						Static82.anIntArray172 = local420.anIntArray248;
						local36 = local420.anInt2788;
						local18 = local420.aClass4_Sub2_Sub2_1;
						local39 = local18.anIntArray16;
						local44 = local18.anIntArray15;
						continue;
					}
					if (local218 == 25) {
						local101 = local44[local36];
						Static218.anIntArray478[local27++] = Static227.method3216(local101);
						continue;
					}
					if (local218 == 27) {
						local101 = local44[local36];
						local27--;
						Static24.method380(local101, Static218.anIntArray478[local27]);
						continue;
					}
					if (local218 == 31) {
						local27 -= 2;
						if (Static218.anIntArray478[local27] <= Static218.anIntArray478[local27 + 1]) {
							local36 += local44[local36];
						}
						continue;
					}
					if (local218 == 32) {
						local27 -= 2;
						if (Static218.anIntArray478[local27] >= Static218.anIntArray478[local27 + 1]) {
							local36 += local44[local36];
						}
						continue;
					}
					if (local218 == 33) {
						Static218.anIntArray478[local27++] = Static82.anIntArray172[local44[local36]];
						continue;
					}
					@Pc(549) int local549;
					if (local218 == 34) {
						local549 = local44[local36];
						local27--;
						Static82.anIntArray172[local549] = Static218.anIntArray478[local27];
						continue;
					}
					if (local218 == 35) {
						Static167.aStringArray26[local29++] = Static117.aStringArray19[local44[local36]];
						continue;
					}
					if (local218 == 36) {
						local549 = local44[local36];
						local29--;
						Static117.aStringArray19[local549] = Static167.aStringArray26[local29];
						continue;
					}
					if (local218 == 37) {
						local101 = local44[local36];
						local29 -= local101;
						local603 = Static232.method3634(local29, Static167.aStringArray26, local101);
						Static167.aStringArray26[local29++] = local603;
						continue;
					}
					if (local218 == 38) {
						local27--;
						continue;
					}
					if (local218 == 39) {
						local29--;
						continue;
					}
					if (local218 == 40) {
						local101 = local44[local36];
						@Pc(641) Class4_Sub2_Sub2 local641 = Static95.method1527(local101);
						local645 = new int[local641.anInt174];
						@Pc(649) String[] local649 = new String[local641.anInt176];
						for (local651 = 0; local651 < local641.anInt171; local651++) {
							local645[local651] = Static218.anIntArray478[local27 + local651 - local641.anInt171];
						}
						for (local651 = 0; local651 < local641.anInt175; local651++) {
							local649[local651] = Static167.aStringArray26[local29 + local651 - local641.anInt175];
						}
						local27 -= local641.anInt171;
						local29 -= local641.anInt175;
						@Pc(706) Class85 local706 = new Class85();
						local706.anIntArray248 = Static82.anIntArray172;
						local706.anInt2788 = local36;
						local706.aClass4_Sub2_Sub2_1 = local18;
						local706.aStringArray21 = Static117.aStringArray19;
						if (Static229.aClass85Array2.length <= Static266.anInt4997) {
							throw new RuntimeException();
						}
						local18 = local641;
						Static229.aClass85Array2[Static266.anInt4997++] = local706;
						local36 = -1;
						local39 = local641.anIntArray16;
						Static117.aStringArray19 = local649;
						local44 = local641.anIntArray15;
						Static82.anIntArray172 = local645;
						continue;
					}
					if (local218 == 42) {
						Static218.anIntArray478[local27++] = Static150.anIntArray279[local44[local36]];
						continue;
					}
					if (local218 == 43) {
						local101 = local44[local36];
						local27--;
						Static150.anIntArray279[local101] = Static218.anIntArray478[local27];
						Static280.method4223(local101);
						continue;
					}
					if (local218 == 44) {
						local101 = local44[local36] >> 16;
						local27--;
						local807 = Static218.anIntArray478[local27];
						local813 = local44[local36] & 0xFFFF;
						if (local807 >= 0 && local807 <= 5000) {
							@Pc(828) byte local828 = -1;
							if (local813 == 105) {
								local828 = 0;
							}
							Static255.anIntArray433[local101] = local807;
							local651 = 0;
							while (true) {
								if (local807 <= local651) {
									continue label4416;
								}
								Static167.anIntArrayArray27[local101][local651] = local828;
								local651++;
							}
						}
						throw new RuntimeException();
					}
					if (local218 == 45) {
						local101 = local44[local36];
						local27--;
						local813 = Static218.anIntArray478[local27];
						if (local813 >= 0 && Static255.anIntArray433[local101] > local813) {
							Static218.anIntArray478[local27++] = Static167.anIntArrayArray27[local101][local813];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 46) {
						local27 -= 2;
						local813 = Static218.anIntArray478[local27];
						local101 = local44[local36];
						if (local813 >= 0 && Static255.anIntArray433[local101] > local813) {
							Static167.anIntArrayArray27[local101][local813] = Static218.anIntArray478[local27 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 47) {
						local81 = Static299.aStringArray38[local44[local36]];
						if (local81 == null) {
							local81 = "null";
						}
						Static167.aStringArray26[local29++] = local81;
						continue;
					}
					if (local218 == 48) {
						local101 = local44[local36];
						local29--;
						Static299.aStringArray38[local101] = Static167.aStringArray26[local29];
						Static251.method3782(local101);
						continue;
					}
					if (local218 == 51) {
						@Pc(994) Class97 local994 = local18.aClass97Array1[local44[local36]];
						local27--;
						@Pc(1004) Class4_Sub19 local1004 = (Class4_Sub19) local994.method2360((long) Static218.anIntArray478[local27]);
						if (local1004 != null) {
							local36 += local1004.anInt2869;
						}
						continue;
					}
				}
				@Pc(1024) boolean local1024;
				if (local44[local36] == 1) {
					local1024 = true;
				} else {
					local1024 = false;
				}
				@Pc(1182) Class22 local1182;
				@Pc(1056) int local1056;
				@Pc(1068) Class22 local1068;
				@Pc(1091) int local1091;
				@Pc(1255) Class22 local1255;
				if (local218 < 300) {
					if (local218 == 100) {
						local27 -= 3;
						local813 = Static218.anIntArray478[local27];
						local807 = Static218.anIntArray478[local27 + 1];
						local1056 = Static218.anIntArray478[local27 + 2];
						if (local807 != 0) {
							local1068 = Static21.method3453(local813);
							if (local1068.aClass22Array1 == null) {
								local1068.aClass22Array1 = new Class22[local1056 + 1];
							}
							if (local1068.aClass22Array1.length <= local1056) {
								@Pc(1089) Class22[] local1089 = new Class22[local1056 + 1];
								for (local1091 = 0; local1091 < local1068.aClass22Array1.length; local1091++) {
									local1089[local1091] = local1068.aClass22Array1[local1091];
								}
								local1068.aClass22Array1 = local1089;
							}
							if (local1056 > 0 && local1068.aClass22Array1[local1056 - 1] == null) {
								throw new RuntimeException("Gap at:" + (local1056 - 1));
							}
							@Pc(1139) Class22 local1139 = new Class22();
							local1139.aBoolean33 = true;
							local1139.anInt542 = local807;
							local1139.anInt561 = local1056;
							local1139.anInt587 = local1139.anInt596 = local1068.anInt596;
							local1068.aClass22Array1[local1056] = local1139;
							if (local1024) {
								Static160.aClass22_14 = local1139;
							} else {
								Static265.aClass22_19 = local1139;
							}
							Static81.method3274(local1068);
							continue;
						}
						throw new RuntimeException();
					}
					@Pc(1204) Class22 local1204;
					if (local218 == 101) {
						local1182 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
						if (local1182.anInt561 == -1) {
							if (local1024) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local1204 = Static21.method3453(local1182.anInt596);
						local1204.aClass22Array1[local1182.anInt561] = null;
						Static81.method3274(local1204);
						continue;
					}
					if (local218 == 102) {
						local27--;
						local1182 = Static21.method3453(Static218.anIntArray478[local27]);
						local1182.aClass22Array1 = null;
						Static81.method3274(local1182);
						continue;
					}
					if (local218 == 200) {
						local27 -= 2;
						local813 = Static218.anIntArray478[local27];
						local807 = Static218.anIntArray478[local27 + 1];
						local1255 = Static172.method2702(local813, local807);
						if (local1255 != null && local807 != -1) {
							Static218.anIntArray478[local27++] = 1;
							if (local1024) {
								Static160.aClass22_14 = local1255;
							} else {
								Static265.aClass22_19 = local1255;
							}
							continue;
						}
						Static218.anIntArray478[local27++] = 0;
						continue;
					}
					if (local218 == 201) {
						local27--;
						local813 = Static218.anIntArray478[local27];
						local1204 = Static21.method3453(local813);
						if (local1204 == null) {
							Static218.anIntArray478[local27++] = 0;
						} else {
							Static218.anIntArray478[local27++] = 1;
							if (local1024) {
								Static160.aClass22_14 = local1204;
							} else {
								Static265.aClass22_19 = local1204;
							}
						}
						continue;
					}
				} else {
					@Pc(3793) boolean local3793;
					if (local218 < 500) {
						if (local218 == 403) {
							local27 -= 2;
							local813 = Static218.anIntArray478[local27];
							local807 = Static218.anIntArray478[local27 + 1];
							for (local1056 = 0; local1056 < Static169.anIntArray296.length; local1056++) {
								if (local813 == Static169.anIntArray296[local1056]) {
									Static239.aClass12_Sub3_Sub2_2.aClass143_1.method3562(local1056, local807);
									continue label4416;
								}
							}
							local1056 = 0;
							while (true) {
								if (local1056 >= Static110.anIntArray228.length) {
									continue label4416;
								}
								if (local813 == Static110.anIntArray228[local1056]) {
									Static239.aClass12_Sub3_Sub2_2.aClass143_1.method3562(local1056, local807);
									continue label4416;
								}
								local1056++;
							}
						}
						if (local218 == 404) {
							local27 -= 2;
							local807 = Static218.anIntArray478[local27 + 1];
							local813 = Static218.anIntArray478[local27];
							Static239.aClass12_Sub3_Sub2_2.aClass143_1.method3565(local807, local813);
							continue;
						}
						if (local218 == 410) {
							local27--;
							local3793 = Static218.anIntArray478[local27] != 0;
							Static239.aClass12_Sub3_Sub2_2.aClass143_1.method3564(local3793);
							continue;
						}
					} else {
						@Pc(6284) boolean local6284;
						if ((local218 < 1000 || local218 >= 1100) && (local218 < 2000 || local218 >= 2100)) {
							@Pc(1643) String local1643;
							if (local218 >= 1100 && local218 < 1200 || !(local218 < 2100 || local218 >= 2200)) {
								if (local218 >= 2000) {
									local218 -= 1000;
									local27--;
									local1182 = Static21.method3453(Static218.anIntArray478[local27]);
								} else {
									local1182 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
								}
								if (local218 == 1100) {
									local27 -= 2;
									local1182.anInt589 = Static218.anIntArray478[local27];
									if (local1182.anInt589 > local1182.anInt544 - local1182.anInt546) {
										local1182.anInt589 = local1182.anInt544 - local1182.anInt546;
									}
									if (local1182.anInt589 < 0) {
										local1182.anInt589 = 0;
									}
									local1182.anInt547 = Static218.anIntArray478[local27 + 1];
									if (local1182.anInt583 - local1182.anInt602 < local1182.anInt547) {
										local1182.anInt547 = local1182.anInt583 - local1182.anInt602;
									}
									if (local1182.anInt547 < 0) {
										local1182.anInt547 = 0;
									}
									Static81.method3274(local1182);
									if (local1182.anInt561 == -1) {
										Static75.method1152(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1101) {
									local27--;
									local1182.anInt585 = Static218.anIntArray478[local27];
									Static81.method3274(local1182);
									if (local1182.anInt561 == -1) {
										Static95.method1528(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1102) {
									local27--;
									local1182.aBoolean42 = Static218.anIntArray478[local27] == 1;
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1103) {
									local27--;
									local1182.anInt549 = Static218.anIntArray478[local27];
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1104) {
									local27--;
									local1182.anInt614 = Static218.anIntArray478[local27];
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1105) {
									local27--;
									local1182.anInt588 = Static218.anIntArray478[local27];
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1106) {
									local27--;
									local1182.anInt560 = Static218.anIntArray478[local27];
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1107) {
									local27--;
									local1182.aBoolean38 = Static218.anIntArray478[local27] == 1;
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1108) {
									local1182.anInt628 = 1;
									local27--;
									local1182.anInt572 = Static218.anIntArray478[local27];
									Static81.method3274(local1182);
									if (local1182.anInt561 == -1) {
										Static100.method1638(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1109) {
									local27 -= 6;
									local1182.anInt613 = Static218.anIntArray478[local27];
									local1182.anInt584 = Static218.anIntArray478[local27 + 1];
									local1182.anInt621 = Static218.anIntArray478[local27 + 2];
									local1182.anInt617 = Static218.anIntArray478[local27 + 3];
									local1182.anInt566 = Static218.anIntArray478[local27 + 4];
									local1182.anInt623 = Static218.anIntArray478[local27 + 5];
									Static81.method3274(local1182);
									if (local1182.anInt561 == -1) {
										Static167.method2633(local1182.anInt596);
										Static74.method1122(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1110) {
									local27--;
									local807 = Static218.anIntArray478[local27];
									if (local1182.anInt622 != local807) {
										local1182.anInt578 = 0;
										local1182.anInt576 = 1;
										local1182.anInt632 = 0;
										local1182.anInt622 = local807;
										Static81.method3274(local1182);
									}
									if (local1182.anInt561 == -1) {
										Static191.method3992(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1111) {
									local27--;
									local1182.aBoolean36 = Static218.anIntArray478[local27] == 1;
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1112) {
									local29--;
									local1643 = Static167.aStringArray26[local29];
									if (!local1643.equals(local1182.aString10)) {
										local1182.aString10 = local1643;
										Static81.method3274(local1182);
									}
									if (local1182.anInt561 == -1) {
										Static87.method1405(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1113) {
									local27--;
									local1182.anInt610 = Static218.anIntArray478[local27];
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1114) {
									local27 -= 3;
									local1182.anInt564 = Static218.anIntArray478[local27];
									local1182.anInt603 = Static218.anIntArray478[local27 + 1];
									local1182.anInt557 = Static218.anIntArray478[local27 + 2];
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1115) {
									local27--;
									local1182.aBoolean44 = Static218.anIntArray478[local27] == 1;
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1116) {
									local27--;
									local1182.anInt581 = Static218.anIntArray478[local27];
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1117) {
									local27--;
									local1182.anInt543 = Static218.anIntArray478[local27];
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1118) {
									local27--;
									local1182.aBoolean47 = Static218.anIntArray478[local27] == 1;
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1119) {
									local27--;
									local1182.aBoolean49 = Static218.anIntArray478[local27] == 1;
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1120) {
									local27 -= 2;
									local1182.anInt544 = Static218.anIntArray478[local27];
									local1182.anInt583 = Static218.anIntArray478[local27 + 1];
									Static81.method3274(local1182);
									if (local1182.anInt542 == 0) {
										Static161.method2514(local1182, false);
									}
									continue;
								}
								if (local218 == 1121) {
									local27 -= 2;
									local1182.aShort2 = (short) Static218.anIntArray478[local27];
									local1182.aShort1 = (short) Static218.anIntArray478[local27 + 1];
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1122) {
									local27--;
									local1182.aBoolean37 = Static218.anIntArray478[local27] == 1;
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1123) {
									local27--;
									local1182.anInt623 = Static218.anIntArray478[local27];
									Static81.method3274(local1182);
									if (local1182.anInt561 == -1) {
										Static167.method2633(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1124) {
									local27--;
									local807 = Static218.anIntArray478[local27];
									local1182.aBoolean46 = local807 == 1;
									Static81.method3274(local1182);
									continue;
								}
							} else if (local218 >= 1200 && local218 < 1300 || local218 >= 2200 && local218 < 2300) {
								if (local218 < 2000) {
									local1182 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
								} else {
									local218 -= 1000;
									local27--;
									local1182 = Static21.method3453(Static218.anIntArray478[local27]);
								}
								Static81.method3274(local1182);
								if (local218 == 1200 || local218 == 1205 || local218 == 1208 || local218 == 1209) {
									local27 -= 2;
									local807 = Static218.anIntArray478[local27];
									local1056 = Static218.anIntArray478[local27 + 1];
									if (local1182.anInt561 == -1) {
										Static88.method1421(local1182.anInt596);
										Static167.method2633(local1182.anInt596);
										Static74.method1122(local1182.anInt596);
									}
									if (local807 == -1) {
										local1182.anInt628 = 1;
										local1182.anInt572 = -1;
										local1182.anInt553 = -1;
										continue;
									}
									local1182.anInt553 = local807;
									local1182.anInt567 = local1056;
									if (local218 == 1208 || local218 == 1209) {
										local1182.aBoolean43 = true;
									} else {
										local1182.aBoolean43 = false;
									}
									@Pc(13438) Class163 local13438 = Static277.method4117(local807);
									local1182.anInt613 = local13438.anInt4896;
									local1182.anInt584 = local13438.anInt4911;
									local1182.anInt566 = local13438.anInt4862;
									local1182.anInt623 = local13438.anInt4907;
									if (local218 == 1205) {
										local1182.aBoolean45 = false;
									} else {
										local1182.aBoolean45 = true;
									}
									local1182.anInt617 = local13438.anInt4894;
									local1182.anInt621 = local13438.anInt4886;
									if (local1182.anInt570 > 0) {
										local1182.anInt623 = local1182.anInt623 * 32 / local1182.anInt570;
									} else if (local1182.anInt600 > 0) {
										local1182.anInt623 = local1182.anInt623 * 32 / local1182.anInt600;
									}
									continue;
								}
								if (local218 == 1201) {
									local1182.anInt628 = 2;
									local27--;
									local1182.anInt572 = Static218.anIntArray478[local27];
									if (local1182.anInt561 == -1) {
										Static100.method1638(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1202) {
									local1182.anInt628 = 3;
									local1182.anInt572 = Static239.aClass12_Sub3_Sub2_2.aClass143_1.method3571();
									if (local1182.anInt561 == -1) {
										Static100.method1638(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1203) {
									local1182.anInt628 = 6;
									local27--;
									local1182.anInt572 = Static218.anIntArray478[local27];
									if (local1182.anInt561 == -1) {
										Static100.method1638(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1204) {
									local1182.anInt628 = 5;
									local27--;
									local1182.anInt572 = Static218.anIntArray478[local27];
									if (local1182.anInt561 == -1) {
										Static100.method1638(local1182.anInt596);
									}
									continue;
								}
								if (local218 == 1206) {
									local27 -= 4;
									local1182.anInt579 = Static218.anIntArray478[local27];
									local1182.anInt616 = Static218.anIntArray478[local27 + 1];
									local1182.anInt597 = Static218.anIntArray478[local27 + 2];
									local1182.anInt552 = Static218.anIntArray478[local27 + 3];
									Static81.method3274(local1182);
									continue;
								}
								if (local218 == 1207) {
									local27 -= 2;
									local1182.anInt562 = Static218.anIntArray478[local27];
									local1182.anInt601 = Static218.anIntArray478[local27 + 1];
									Static81.method3274(local1182);
									continue;
								}
							} else if ((local218 < 1300 || local218 >= 1400) && (local218 < 2300 || local218 >= 2400)) {
								@Pc(1704) int local1704;
								@Pc(1645) int[] local1645;
								if (local218 >= 1400 && local218 < 1500 || local218 >= 2400 && local218 < 2500) {
									if (local218 >= 2000) {
										local218 -= 1000;
										local27--;
										local1182 = Static21.method3453(Static218.anIntArray478[local27]);
									} else {
										local1182 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
									}
									local29--;
									local1643 = Static167.aStringArray26[local29];
									local1645 = null;
									if (local1643.length() > 0 && local1643.charAt(local1643.length() - 1) == 'Y') {
										local27--;
										local651 = Static218.anIntArray478[local27];
										if (local651 > 0) {
											local1645 = new int[local651];
											while (local651-- > 0) {
												local27--;
												local1645[local651] = Static218.anIntArray478[local27];
											}
										}
										local1643 = local1643.substring(0, local1643.length() - 1);
									}
									@Pc(1699) Object[] local1699 = new Object[local1643.length() + 1];
									for (local1704 = local1699.length - 1; local1704 >= 1; local1704--) {
										if (local1643.charAt(local1704 - 1) == 's') {
											local29--;
											local1699[local1704] = Static167.aStringArray26[local29];
										} else {
											local27--;
											local1699[local1704] = Integer.valueOf(Static218.anIntArray478[local27]);
										}
									}
									local27--;
									local1704 = Static218.anIntArray478[local27];
									if (local1704 == -1) {
										local1699 = null;
									} else {
										local1699[0] = Integer.valueOf(local1704);
									}
									if (local218 == 1400) {
										local1182.anObjectArray1 = local1699;
									} else if (local218 == 1401) {
										local1182.anObjectArray28 = local1699;
									} else if (local218 == 1402) {
										local1182.anObjectArray18 = local1699;
									} else if (local218 == 1403) {
										local1182.anObjectArray11 = local1699;
									} else if (local218 == 1404) {
										local1182.anObjectArray13 = local1699;
									} else if (local218 == 1405) {
										local1182.anObjectArray15 = local1699;
									} else if (local218 == 1406) {
										local1182.anObjectArray7 = local1699;
									} else if (local218 == 1407) {
										local1182.anObjectArray17 = local1699;
										local1182.anIntArray59 = local1645;
									} else if (local218 == 1408) {
										local1182.anObjectArray2 = local1699;
									} else if (local218 == 1409) {
										local1182.anObjectArray10 = local1699;
									} else if (local218 == 1410) {
										local1182.anObjectArray23 = local1699;
									} else if (local218 == 1411) {
										local1182.anObjectArray12 = local1699;
									} else if (local218 == 1412) {
										local1182.anObjectArray6 = local1699;
									} else if (local218 == 1414) {
										local1182.anIntArray58 = local1645;
										local1182.anObjectArray4 = local1699;
									} else if (local218 == 1415) {
										local1182.anObjectArray24 = local1699;
										local1182.anIntArray62 = local1645;
									} else if (local218 == 1416) {
										local1182.anObjectArray19 = local1699;
									} else if (local218 == 1417) {
										local1182.anObjectArray20 = local1699;
									} else if (local218 == 1418) {
										local1182.anObjectArray3 = local1699;
									} else if (local218 == 1419) {
										local1182.anObjectArray9 = local1699;
									} else if (local218 == 1420) {
										local1182.anObjectArray29 = local1699;
									} else if (local218 == 1421) {
										local1182.anObjectArray25 = local1699;
									} else if (local218 == 1422) {
										local1182.anObjectArray8 = local1699;
									} else if (local218 == 1423) {
										local1182.anObjectArray22 = local1699;
									} else if (local218 == 1424) {
										local1182.anObjectArray30 = local1699;
									} else if (local218 == 1425) {
										local1182.anObjectArray14 = local1699;
									} else if (local218 == 1426) {
										local1182.anObjectArray16 = local1699;
									} else if (local218 == 1427) {
										local1182.anObjectArray27 = local1699;
									} else if (local218 == 1428) {
										local1182.anIntArray55 = local1645;
										local1182.anObjectArray21 = local1699;
									} else if (local218 == 1429) {
										local1182.anIntArray54 = local1645;
										local1182.anObjectArray26 = local1699;
									}
									local1182.aBoolean48 = true;
									continue;
								}
								if (local218 < 1600) {
									local1182 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
									if (local218 == 1500) {
										Static218.anIntArray478[local27++] = local1182.anInt569;
										continue;
									}
									if (local218 == 1501) {
										Static218.anIntArray478[local27++] = local1182.anInt593;
										continue;
									}
									if (local218 == 1502) {
										Static218.anIntArray478[local27++] = local1182.anInt546;
										continue;
									}
									if (local218 == 1503) {
										Static218.anIntArray478[local27++] = local1182.anInt602;
										continue;
									}
									if (local218 == 1504) {
										Static218.anIntArray478[local27++] = local1182.aBoolean35 ? 1 : 0;
										continue;
									}
									if (local218 == 1505) {
										Static218.anIntArray478[local27++] = local1182.anInt587;
										continue;
									}
								} else if (local218 < 1700) {
									local1182 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
									if (local218 == 1600) {
										Static218.anIntArray478[local27++] = local1182.anInt589;
										continue;
									}
									if (local218 == 1601) {
										Static218.anIntArray478[local27++] = local1182.anInt547;
										continue;
									}
									if (local218 == 1602) {
										Static167.aStringArray26[local29++] = local1182.aString10;
										continue;
									}
									if (local218 == 1603) {
										Static218.anIntArray478[local27++] = local1182.anInt544;
										continue;
									}
									if (local218 == 1604) {
										Static218.anIntArray478[local27++] = local1182.anInt583;
										continue;
									}
									if (local218 == 1605) {
										Static218.anIntArray478[local27++] = local1182.anInt623;
										continue;
									}
									if (local218 == 1606) {
										Static218.anIntArray478[local27++] = local1182.anInt621;
										continue;
									}
									if (local218 == 1607) {
										Static218.anIntArray478[local27++] = local1182.anInt566;
										continue;
									}
									if (local218 == 1608) {
										Static218.anIntArray478[local27++] = local1182.anInt617;
										continue;
									}
									if (local218 == 1609) {
										Static218.anIntArray478[local27++] = local1182.anInt549;
										continue;
									}
									if (local218 == 1610) {
										Static218.anIntArray478[local27++] = local1182.anInt613;
										continue;
									}
									if (local218 == 1611) {
										Static218.anIntArray478[local27++] = local1182.anInt584;
										continue;
									}
									if (local218 == 1612) {
										Static218.anIntArray478[local27++] = local1182.anInt588;
										continue;
									}
								} else if (local218 < 1800) {
									local1182 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
									if (local218 == 1700) {
										Static218.anIntArray478[local27++] = local1182.anInt553;
										continue;
									}
									if (local218 == 1701) {
										if (local1182.anInt553 == -1) {
											Static218.anIntArray478[local27++] = 0;
										} else {
											Static218.anIntArray478[local27++] = local1182.anInt567;
										}
										continue;
									}
									if (local218 == 1702) {
										Static218.anIntArray478[local27++] = local1182.anInt561;
										continue;
									}
								} else if (local218 < 1900) {
									local1182 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
									if (local218 == 1800) {
										Static218.anIntArray478[local27++] = Static40.method681(local1182).method2834();
										continue;
									}
									if (local218 == 1801) {
										local27--;
										local807 = Static218.anIntArray478[local27];
										local807--;
										if (local1182.aStringArray5 != null && local807 < local1182.aStringArray5.length && local1182.aStringArray5[local807] != null) {
											Static167.aStringArray26[local29++] = local1182.aStringArray5[local807];
											continue;
										}
										Static167.aStringArray26[local29++] = "";
										continue;
									}
									if (local218 == 1802) {
										if (local1182.aString9 == null) {
											Static167.aStringArray26[local29++] = "";
										} else {
											Static167.aStringArray26[local29++] = local1182.aString9;
										}
										continue;
									}
								} else if (local218 < 2600) {
									local27--;
									local1182 = Static21.method3453(Static218.anIntArray478[local27]);
									if (local218 == 2500) {
										Static218.anIntArray478[local27++] = local1182.anInt569;
										continue;
									}
									if (local218 == 2501) {
										Static218.anIntArray478[local27++] = local1182.anInt593;
										continue;
									}
									if (local218 == 2502) {
										Static218.anIntArray478[local27++] = local1182.anInt546;
										continue;
									}
									if (local218 == 2503) {
										Static218.anIntArray478[local27++] = local1182.anInt602;
										continue;
									}
									if (local218 == 2504) {
										Static218.anIntArray478[local27++] = local1182.aBoolean35 ? 1 : 0;
										continue;
									}
									if (local218 == 2505) {
										Static218.anIntArray478[local27++] = local1182.anInt587;
										continue;
									}
								} else if (local218 < 2700) {
									local27--;
									local1182 = Static21.method3453(Static218.anIntArray478[local27]);
									if (local218 == 2600) {
										Static218.anIntArray478[local27++] = local1182.anInt589;
										continue;
									}
									if (local218 == 2601) {
										Static218.anIntArray478[local27++] = local1182.anInt547;
										continue;
									}
									if (local218 == 2602) {
										Static167.aStringArray26[local29++] = local1182.aString10;
										continue;
									}
									if (local218 == 2603) {
										Static218.anIntArray478[local27++] = local1182.anInt544;
										continue;
									}
									if (local218 == 2604) {
										Static218.anIntArray478[local27++] = local1182.anInt583;
										continue;
									}
									if (local218 == 2605) {
										Static218.anIntArray478[local27++] = local1182.anInt623;
										continue;
									}
									if (local218 == 2606) {
										Static218.anIntArray478[local27++] = local1182.anInt621;
										continue;
									}
									if (local218 == 2607) {
										Static218.anIntArray478[local27++] = local1182.anInt566;
										continue;
									}
									if (local218 == 2608) {
										Static218.anIntArray478[local27++] = local1182.anInt617;
										continue;
									}
									if (local218 == 2609) {
										Static218.anIntArray478[local27++] = local1182.anInt549;
										continue;
									}
									if (local218 == 2610) {
										Static218.anIntArray478[local27++] = local1182.anInt613;
										continue;
									}
									if (local218 == 2611) {
										Static218.anIntArray478[local27++] = local1182.anInt584;
										continue;
									}
									if (local218 == 2612) {
										Static218.anIntArray478[local27++] = local1182.anInt588;
										continue;
									}
								} else if (local218 < 2800) {
									if (local218 == 2700) {
										local27--;
										local1182 = Static21.method3453(Static218.anIntArray478[local27]);
										Static218.anIntArray478[local27++] = local1182.anInt553;
										continue;
									}
									if (local218 == 2701) {
										local27--;
										local1182 = Static21.method3453(Static218.anIntArray478[local27]);
										if (local1182.anInt553 == -1) {
											Static218.anIntArray478[local27++] = 0;
										} else {
											Static218.anIntArray478[local27++] = local1182.anInt567;
										}
										continue;
									}
									if (local218 == 2702) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										@Pc(2447) Class4_Sub10 local2447 = (Class4_Sub10) Static227.aClass97_16.method2360((long) local813);
										if (local2447 == null) {
											Static218.anIntArray478[local27++] = 0;
										} else {
											Static218.anIntArray478[local27++] = 1;
										}
										continue;
									}
									if (local218 == 2703) {
										local27--;
										local1182 = Static21.method3453(Static218.anIntArray478[local27]);
										if (local1182.aClass22Array1 == null) {
											Static218.anIntArray478[local27++] = 0;
											continue;
										}
										local807 = local1182.aClass22Array1.length;
										for (local1056 = 0; local1056 < local1182.aClass22Array1.length; local1056++) {
											if (local1182.aClass22Array1[local1056] == null) {
												local807 = local1056;
												break;
											}
										}
										Static218.anIntArray478[local27++] = local807;
										continue;
									}
									if (local218 == 2704 || local218 == 2705) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										@Pc(2542) Class4_Sub10 local2542 = (Class4_Sub10) Static227.aClass97_16.method2360((long) local813);
										if (local2542 != null && local2542.anInt1032 == local807) {
											Static218.anIntArray478[local27++] = 1;
											continue;
										}
										Static218.anIntArray478[local27++] = 0;
										continue;
									}
								} else if (local218 < 2900) {
									local27--;
									local1182 = Static21.method3453(Static218.anIntArray478[local27]);
									if (local218 == 2800) {
										Static218.anIntArray478[local27++] = Static40.method681(local1182).method2834();
										continue;
									}
									if (local218 == 2801) {
										local27--;
										local807 = Static218.anIntArray478[local27];
										local807--;
										if (local1182.aStringArray5 != null && local807 < local1182.aStringArray5.length && local1182.aStringArray5[local807] != null) {
											Static167.aStringArray26[local29++] = local1182.aStringArray5[local807];
											continue;
										}
										Static167.aStringArray26[local29++] = "";
										continue;
									}
									if (local218 == 2802) {
										if (local1182.aString9 == null) {
											Static167.aStringArray26[local29++] = "";
										} else {
											Static167.aStringArray26[local29++] = local1182.aString9;
										}
										continue;
									}
								} else if (local218 < 3200) {
									if (local218 == 3100) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static271.method4062(local603, 0, "");
										continue;
									}
									if (local218 == 3101) {
										local27 -= 2;
										Static139.method2270(Static239.aClass12_Sub3_Sub2_2, Static218.anIntArray478[local27 + 1], Static218.anIntArray478[local27]);
										continue;
									}
									if (local218 == 3103) {
										Static47.method749();
										continue;
									}
									if (local218 == 3104) {
										local807 = 0;
										local29--;
										local603 = Static167.aStringArray26[local29];
										if (Static19.method351(local603)) {
											local807 = Static224.method3585(local603);
										}
										Static142.aClass4_Sub17_Sub1_3.method1905(93);
										Static142.aClass4_Sub17_Sub1_3.method1854(local807);
										continue;
									}
									if (local218 == 3105) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static142.aClass4_Sub17_Sub1_3.method1905(187);
										Static142.aClass4_Sub17_Sub1_3.method1891(Static34.method491(local603));
										continue;
									}
									if (local218 == 3106) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static142.aClass4_Sub17_Sub1_3.method1905(57);
										Static142.aClass4_Sub17_Sub1_3.method1861(local603.length() + 1);
										Static142.aClass4_Sub17_Sub1_3.method1849(local603);
										continue;
									}
									if (local218 == 3107) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										local29--;
										local1643 = Static167.aStringArray26[local29];
										Static179.method2814(local1643, local813);
										continue;
									}
									if (local218 == 3108) {
										local27 -= 3;
										local813 = Static218.anIntArray478[local27];
										local1056 = Static218.anIntArray478[local27 + 2];
										local807 = Static218.anIntArray478[local27 + 1];
										local1068 = Static21.method3453(local1056);
										Static44.method706(local813, local807, local1068);
										continue;
									}
									if (local218 == 3109) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										local1255 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
										Static44.method706(local813, local807, local1255);
										continue;
									}
									if (local218 == 3110) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static142.aClass4_Sub17_Sub1_3.method1905(100);
										Static142.aClass4_Sub17_Sub1_3.method1875(local813);
										continue;
									}
								} else if (local218 < 3300) {
									if (local218 == 3200) {
										local27 -= 3;
										Static231.method3630(Static218.anIntArray478[local27], Static218.anIntArray478[local27 + 1], 255, Static218.anIntArray478[local27 + 2]);
										continue;
									}
									if (local218 == 3201) {
										local27--;
										Static292.method4342(255, Static218.anIntArray478[local27]);
										continue;
									}
									if (local218 == 3202) {
										local27 -= 2;
										Static270.method4034(Static218.anIntArray478[local27], 255, Static218.anIntArray478[local27 + 1]);
										continue;
									}
								} else if (local218 < 3400) {
									if (local218 == 3300) {
										Static218.anIntArray478[local27++] = Static104.anInt2226;
										continue;
									}
									if (local218 == 3301) {
										local27 -= 2;
										local807 = Static218.anIntArray478[local27 + 1];
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static148.method2375(local807, local813);
										continue;
									}
									if (local218 == 3302) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = Static180.method2827(local813, local807);
										continue;
									}
									if (local218 == 3303) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = Static219.method3518(local807, local813);
										continue;
									}
									if (local218 == 3304) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static187.method2992(local813).anInt3996;
										continue;
									}
									if (local218 == 3305) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static264.anIntArray443[local813];
										continue;
									}
									if (local218 == 3306) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static280.anIntArray475[local813];
										continue;
									}
									if (local218 == 3307) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static286.anIntArray481[local813];
										continue;
									}
									if (local218 == 3308) {
										local813 = Static210.anInt4103;
										local807 = (Static239.aClass12_Sub3_Sub2_2.anInt4141 >> 7) + Static170.anInt3385;
										local1056 = Static239.anInt4613 + (Static239.aClass12_Sub3_Sub2_2.anInt4113 >> 7);
										Static218.anIntArray478[local27++] = local1056 + (local813 << 28) + (local807 << 14);
										continue;
									}
									if (local218 == 3309) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = local813 >> 14 & 0x3FFF;
										continue;
									}
									if (local218 == 3310) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = local813 >> 28;
										continue;
									}
									if (local218 == 3311) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = local813 & 0x3FFF;
										continue;
									}
									if (local218 == 3312) {
										Static218.anIntArray478[local27++] = Static39.aBoolean340 ? 1 : 0;
										continue;
									}
									if (local218 == 3313) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27] + 32768;
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = Static148.method2375(local807, local813);
										continue;
									}
									if (local218 == 3314) {
										local27 -= 2;
										local807 = Static218.anIntArray478[local27 + 1];
										local813 = Static218.anIntArray478[local27] + 32768;
										Static218.anIntArray478[local27++] = Static180.method2827(local813, local807);
										continue;
									}
									if (local218 == 3315) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27] + 32768;
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = Static219.method3518(local807, local813);
										continue;
									}
									if (local218 == 3316) {
										if (Static176.anInt829 >= 2) {
											Static218.anIntArray478[local27++] = Static176.anInt829;
										} else {
											Static218.anIntArray478[local27++] = 0;
										}
										continue;
									}
									if (local218 == 3317) {
										Static218.anIntArray478[local27++] = Static114.anInt2474;
										continue;
									}
									if (local218 == 3318) {
										Static218.anIntArray478[local27++] = Static211.anInt4204;
										continue;
									}
									if (local218 == 3321) {
										Static218.anIntArray478[local27++] = Static183.anInt3590;
										continue;
									}
									if (local218 == 3322) {
										Static218.anIntArray478[local27++] = Static100.anInt2135;
										continue;
									}
									if (local218 == 3323) {
										if (Static32.anInt639 >= 5 && Static32.anInt639 <= 9) {
											Static218.anIntArray478[local27++] = 1;
											continue;
										}
										Static218.anIntArray478[local27++] = 0;
										continue;
									}
									if (local218 == 3324) {
										if (Static32.anInt639 >= 5 && Static32.anInt639 <= 9) {
											Static218.anIntArray478[local27++] = Static32.anInt639;
											continue;
										}
										Static218.anIntArray478[local27++] = 0;
										continue;
									}
									if (local218 == 3325) {
										Static218.anIntArray478[local27++] = Static183.aBoolean235 ? 1 : 0;
										continue;
									}
									if (local218 == 3326) {
										Static218.anIntArray478[local27++] = Static239.aClass12_Sub3_Sub2_2.anInt4201;
										continue;
									}
									if (local218 == 3327) {
										Static218.anIntArray478[local27++] = Static239.aClass12_Sub3_Sub2_2.aClass143_1.aBoolean295 ? 1 : 0;
										continue;
									}
									if (local218 == 3328) {
										Static218.anIntArray478[local27++] = Static263.aBoolean68 && !Static189.aBoolean321 ? 1 : 0;
										continue;
									}
									if (local218 == 3329) {
										Static218.anIntArray478[local27++] = Static63.aBoolean91 ? 1 : 0;
										continue;
									}
									if (local218 == 3330) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static265.method3981(local813);
										continue;
									}
									if (local218 == 3331) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = Static120.method2042(local807, false, local813);
										continue;
									}
									if (local218 == 3332) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = Static120.method2042(local807, true, local813);
										continue;
									}
									if (local218 == 3333) {
										Static218.anIntArray478[local27++] = Static292.anInt5465;
										continue;
									}
									if (local218 == 3335) {
										Static218.anIntArray478[local27++] = Static139.anInt2870;
										continue;
									}
									if (local218 == 3336) {
										local27 -= 4;
										local1056 = Static218.anIntArray478[local27 + 2];
										local807 = Static218.anIntArray478[local27 + 1];
										local813 = Static218.anIntArray478[local27];
										local813 += local807 << 14;
										local651 = Static218.anIntArray478[local27 + 3];
										local813 += local1056 << 28;
										local813 += local651;
										Static218.anIntArray478[local27++] = local813;
										continue;
									}
									if (local218 == 3337) {
										Static218.anIntArray478[local27++] = Static168.anInt3340;
										continue;
									}
								} else if (local218 < 3500) {
									@Pc(11898) Class4_Sub2_Sub10 local11898;
									if (local218 == 3400) {
										local27 -= 2;
										local807 = Static218.anIntArray478[local27 + 1];
										local813 = Static218.anIntArray478[local27];
										local11898 = Static279.method4164(local813);
										if (local11898.aChar3 == 's') {
										}
										Static167.aStringArray26[local29++] = local11898.method1445(local807);
										continue;
									}
									if (local218 == 3408) {
										local27 -= 4;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										local1056 = Static218.anIntArray478[local27 + 2];
										local651 = Static218.anIntArray478[local27 + 3];
										@Pc(11944) Class4_Sub2_Sub10 local11944 = Static279.method4164(local1056);
										if (local813 == local11944.aChar2 && local807 == local11944.aChar3) {
											if (local807 == 115) {
												Static167.aStringArray26[local29++] = local11944.method1445(local651);
											} else {
												Static218.anIntArray478[local27++] = local11944.method1438(local651);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local218 == 3409) {
										local27 -= 3;
										local807 = Static218.anIntArray478[local27 + 1];
										local813 = Static218.anIntArray478[local27];
										local1056 = Static218.anIntArray478[local27 + 2];
										if (local807 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(12021) Class4_Sub2_Sub10 local12021 = Static279.method4164(local807);
										if (local813 != local12021.aChar3) {
											throw new RuntimeException("C3409-1");
										}
										Static218.anIntArray478[local27++] = local12021.method1443(local1056) ? 1 : 0;
										continue;
									}
									if (local218 == 3410) {
										local29--;
										local1643 = Static167.aStringArray26[local29];
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (local813 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local11898 = Static279.method4164(local813);
										if (local11898.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static218.anIntArray478[local27++] = local11898.method1436(local1643) ? 1 : 0;
										continue;
									}
									if (local218 == 3411) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										@Pc(12112) Class4_Sub2_Sub10 local12112 = Static279.method4164(local813);
										Static218.anIntArray478[local27++] = local12112.aClass97_6.method2362();
										continue;
									}
								} else if (local218 < 3700) {
									if (local218 == 3600) {
										if (Static81.anInt4013 == 0) {
											Static218.anIntArray478[local27++] = -2;
										} else if (Static81.anInt4013 == 1) {
											Static218.anIntArray478[local27++] = -1;
										} else {
											Static218.anIntArray478[local27++] = Static231.anInt4525;
										}
										continue;
									}
									if (local218 == 3601) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static81.anInt4013 == 2 && Static231.anInt4525 > local813) {
											Static167.aStringArray26[local29++] = Static196.aStringArray31[local813];
											continue;
										}
										Static167.aStringArray26[local29++] = "";
										continue;
									}
									if (local218 == 3602) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static81.anInt4013 == 2 && local813 < Static231.anInt4525) {
											Static218.anIntArray478[local27++] = Static131.anIntArray247[local813];
											continue;
										}
										Static218.anIntArray478[local27++] = 0;
										continue;
									}
									if (local218 == 3603) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static81.anInt4013 == 2 && Static231.anInt4525 > local813) {
											Static218.anIntArray478[local27++] = Static266.anIntArray447[local813];
											continue;
										}
										Static218.anIntArray478[local27++] = 0;
										continue;
									}
									if (local218 == 3604) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										local27--;
										local807 = Static218.anIntArray478[local27];
										Static53.method868(local603, local807);
										continue;
									}
									if (local218 == 3605) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static132.method2159(Static34.method491(local603));
										continue;
									}
									if (local218 == 3606) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static137.method2185(Static34.method491(local603));
										continue;
									}
									if (local218 == 3607) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static230.method3624(Static34.method491(local603), false);
										continue;
									}
									if (local218 == 3608) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static99.method1610(Static34.method491(local603));
										continue;
									}
									if (local218 == 3609) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										if (local603.startsWith("<img=0>") || local603.startsWith("<img=1>")) {
											local603 = local603.substring(7);
										}
										Static218.anIntArray478[local27++] = Static76.method1153(local603) ? 1 : 0;
										continue;
									}
									if (local218 == 3610) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static81.anInt4013 == 2 && Static231.anInt4525 > local813) {
											Static167.aStringArray26[local29++] = Static175.aStringArray28[local813];
											continue;
										}
										Static167.aStringArray26[local29++] = "";
										continue;
									}
									if (local218 == 3611) {
										if (Static232.aString149 == null) {
											Static167.aStringArray26[local29++] = "";
										} else {
											Static167.aStringArray26[local29++] = Static176.method653(Static232.aString149);
										}
										continue;
									}
									if (local218 == 3612) {
										if (Static232.aString149 == null) {
											Static218.anIntArray478[local27++] = 0;
										} else {
											Static218.anIntArray478[local27++] = Static26.anInt478;
										}
										continue;
									}
									if (local218 == 3613) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static232.aString149 != null && Static26.anInt478 > local813) {
											Static167.aStringArray26[local29++] = Static176.method653(Static83.aClass4_Sub16Array3[local813].aString59);
											continue;
										}
										Static167.aStringArray26[local29++] = "";
										continue;
									}
									if (local218 == 3614) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static232.aString149 != null && Static26.anInt478 > local813) {
											Static218.anIntArray478[local27++] = Static83.aClass4_Sub16Array3[local813].anInt1957;
											continue;
										}
										Static218.anIntArray478[local27++] = 0;
										continue;
									}
									if (local218 == 3615) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static232.aString149 != null && Static26.anInt478 > local813) {
											Static218.anIntArray478[local27++] = Static83.aClass4_Sub16Array3[local813].aByte11;
											continue;
										}
										Static218.anIntArray478[local27++] = 0;
										continue;
									}
									if (local218 == 3616) {
										Static218.anIntArray478[local27++] = Static27.aByte8;
										continue;
									}
									if (local218 == 3617) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static28.method435(local603);
										continue;
									}
									if (local218 == 3618) {
										Static218.anIntArray478[local27++] = Static147.aByte12;
										continue;
									}
									if (local218 == 3619) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static63.method968(Static34.method491(local603));
										continue;
									}
									if (local218 == 3620) {
										Static277.method4115();
										continue;
									}
									if (local218 == 3621) {
										if (Static81.anInt4013 == 0) {
											Static218.anIntArray478[local27++] = -1;
										} else {
											Static218.anIntArray478[local27++] = Static297.anInt5497;
										}
										continue;
									}
									if (local218 == 3622) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static81.anInt4013 != 0 && local813 < Static297.anInt5497) {
											Static167.aStringArray26[local29++] = Static211.method3379(Static126.aLongArray6[local813]);
											continue;
										}
										Static167.aStringArray26[local29++] = "";
										continue;
									}
									if (local218 == 3623) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										if (local603.startsWith("<img=0>") || local603.startsWith("<img=1>")) {
											local603 = local603.substring(7);
										}
										Static218.anIntArray478[local27++] = Static286.method4293(local603) ? 1 : 0;
										continue;
									}
									if (local218 == 3624) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static83.aClass4_Sub16Array3 != null && Static26.anInt478 > local813 && Static83.aClass4_Sub16Array3[local813].aString59.equalsIgnoreCase(Static239.aClass12_Sub3_Sub2_2.aString132)) {
											Static218.anIntArray478[local27++] = 1;
											continue;
										}
										Static218.anIntArray478[local27++] = 0;
										continue;
									}
									if (local218 == 3625) {
										if (Static52.aString30 == null) {
											Static167.aStringArray26[local29++] = "";
										} else {
											Static167.aStringArray26[local29++] = Static176.method653(Static52.aString30);
										}
										continue;
									}
									if (local218 == 3626) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static232.aString149 != null && Static26.anInt478 > local813) {
											Static167.aStringArray26[local29++] = Static83.aClass4_Sub16Array3[local813].aString58;
											continue;
										}
										Static167.aStringArray26[local29++] = "";
										continue;
									}
									if (local218 == 3627) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										if (Static81.anInt4013 == 2 && local813 >= 0 && Static231.anInt4525 > local813) {
											Static218.anIntArray478[local27++] = Static176.aBooleanArray10[local813] ? 1 : 0;
											continue;
										}
										Static218.anIntArray478[local27++] = 0;
										continue;
									}
									if (local218 == 3628) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										if (local603.startsWith("<img=0>") || local603.startsWith("<img=1>")) {
											local603 = local603.substring(7);
										}
										Static218.anIntArray478[local27++] = Static94.method1518(local603);
										continue;
									}
									if (local218 == 3629) {
										Static218.anIntArray478[local27++] = Static245.anInt4683;
										continue;
									}
									if (local218 == 3630) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static230.method3624(Static34.method491(local603), true);
										continue;
									}
									if (local218 == 3631) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static272.aBooleanArray25[local813] ? 1 : 0;
										continue;
									}
								} else if (local218 < 4000) {
									if (local218 == 3903) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static24.aClass101Array1[local813].method2441();
										continue;
									}
									if (local218 == 3904) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static24.aClass101Array1[local813].anInt3095;
										continue;
									}
									if (local218 == 3905) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static24.aClass101Array1[local813].anInt3093;
										continue;
									}
									if (local218 == 3906) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static24.aClass101Array1[local813].anInt3098;
										continue;
									}
									if (local218 == 3907) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static24.aClass101Array1[local813].anInt3096;
										continue;
									}
									if (local218 == 3908) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static24.aClass101Array1[local813].anInt3094;
										continue;
									}
									if (local218 == 3910) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										local807 = Static24.aClass101Array1[local813].method2443();
										Static218.anIntArray478[local27++] = local807 == 0 ? 1 : 0;
										continue;
									}
									if (local218 == 3911) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										local807 = Static24.aClass101Array1[local813].method2443();
										Static218.anIntArray478[local27++] = local807 == 2 ? 1 : 0;
										continue;
									}
									if (local218 == 3912) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										local807 = Static24.aClass101Array1[local813].method2443();
										Static218.anIntArray478[local27++] = local807 == 5 ? 1 : 0;
										continue;
									}
									if (local218 == 3913) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										local807 = Static24.aClass101Array1[local813].method2443();
										Static218.anIntArray478[local27++] = local807 == 1 ? 1 : 0;
										continue;
									}
								} else if (local218 < 4100) {
									if (local218 == 4000) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = local813 + local807;
										continue;
									}
									if (local218 == 4001) {
										local27 -= 2;
										local807 = Static218.anIntArray478[local27 + 1];
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = local813 - local807;
										continue;
									}
									if (local218 == 4002) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = local807 * local813;
										continue;
									}
									if (local218 == 4003) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = local813 / local807;
										continue;
									}
									if (local218 == 4004) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = (int) ((double) local813 * Math.random());
										continue;
									}
									if (local218 == 4005) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = (int) ((double) (local813 + 1) * Math.random());
										continue;
									}
									if (local218 == 4006) {
										local27 -= 5;
										local813 = Static218.anIntArray478[local27];
										local651 = Static218.anIntArray478[local27 + 3];
										local807 = Static218.anIntArray478[local27 + 1];
										local1056 = Static218.anIntArray478[local27 + 2];
										local1704 = Static218.anIntArray478[local27 + 4];
										Static218.anIntArray478[local27++] = local813 + (local807 - local813) * (local1704 + -local1056) / (local651 - local1056);
										continue;
									}
									@Pc(10702) long local10702;
									@Pc(10695) long local10695;
									if (local218 == 4007) {
										local27 -= 2;
										local10695 = Static218.anIntArray478[local27];
										local10702 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = (int) (local10695 * local10702 / 100L + local10695);
										continue;
									}
									if (local218 == 4008) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = 0x1 << local807 | local813;
										continue;
									}
									if (local218 == 4009) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = local813 & -(0x1 << local807) - 1;
										continue;
									}
									if (local218 == 4010) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = (local813 & 0x1 << local807) == 0 ? 0 : 1;
										continue;
									}
									if (local218 == 4011) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = local813 % local807;
										continue;
									}
									if (local218 == 4012) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										if (local813 == 0) {
											Static218.anIntArray478[local27++] = 0;
										} else {
											Static218.anIntArray478[local27++] = (int) Math.pow((double) local813, (double) local807);
										}
										continue;
									}
									if (local218 == 4013) {
										local27 -= 2;
										local807 = Static218.anIntArray478[local27 + 1];
										local813 = Static218.anIntArray478[local27];
										if (local813 == 0) {
											Static218.anIntArray478[local27++] = 0;
										} else if (local807 == 0) {
											Static218.anIntArray478[local27++] = Integer.MAX_VALUE;
										} else {
											Static218.anIntArray478[local27++] = (int) Math.pow((double) local813, 1.0D / (double) local807);
										}
										continue;
									}
									if (local218 == 4014) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = local807 & local813;
										continue;
									}
									if (local218 == 4015) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = local813 | local807;
										continue;
									}
									if (local218 == 4016) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = local813 < local807 ? local813 : local807;
										continue;
									}
									if (local218 == 4017) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = local807 >= local813 ? local807 : local813;
										continue;
									}
									if (local218 == 4018) {
										local27 -= 3;
										local10695 = Static218.anIntArray478[local27];
										local10702 = Static218.anIntArray478[local27 + 1];
										@Pc(11048) long local11048 = (long) Static218.anIntArray478[local27 + 2];
										Static218.anIntArray478[local27++] = (int) (local11048 * local10695 / local10702);
										continue;
									}
								} else if (local218 < 4200) {
									if (local218 == 4100) {
										local27--;
										local807 = Static218.anIntArray478[local27];
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static167.aStringArray26[local29++] = local603 + local807;
										continue;
									}
									if (local218 == 4101) {
										local29 -= 2;
										local1643 = Static167.aStringArray26[local29 + 1];
										local603 = Static167.aStringArray26[local29];
										Static167.aStringArray26[local29++] = local603 + local1643;
										continue;
									}
									if (local218 == 4102) {
										local27--;
										local807 = Static218.anIntArray478[local27];
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static167.aStringArray26[local29++] = local603 + Static70.method3352(local807);
										continue;
									}
									if (local218 == 4103) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static167.aStringArray26[local29++] = local603.toLowerCase();
										continue;
									}
									if (local218 == 4104) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										@Pc(3194) long local3194 = (long) local813 * 86400000L + 1014768000000L;
										Static63.aCalendar2.setTime(new Date(local3194));
										local651 = Static63.aCalendar2.get(5);
										local1704 = Static63.aCalendar2.get(2);
										local1091 = Static63.aCalendar2.get(1);
										Static167.aStringArray26[local29++] = local651 + "-" + Static92.aStringArray15[local1704] + "-" + local1091;
										continue;
									}
									if (local218 == 4105) {
										local29 -= 2;
										local1643 = Static167.aStringArray26[local29 + 1];
										local603 = Static167.aStringArray26[local29];
										if (Static239.aClass12_Sub3_Sub2_2.aClass143_1 != null && Static239.aClass12_Sub3_Sub2_2.aClass143_1.aBoolean295) {
											Static167.aStringArray26[local29++] = local1643;
											continue;
										}
										Static167.aStringArray26[local29++] = local603;
										continue;
									}
									if (local218 == 4106) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static167.aStringArray26[local29++] = Integer.toString(local813);
										continue;
									}
									if (local218 == 4107) {
										local29 -= 2;
										Static218.anIntArray478[local27++] = Static21.method3465(Static181.method1756(Static139.anInt2870, Static167.aStringArray26[local29 + 1], Static167.aStringArray26[local29]));
										continue;
									}
									if (local218 == 4108) {
										local27 -= 2;
										local29--;
										local603 = Static167.aStringArray26[local29];
										local1056 = Static218.anIntArray478[local27 + 1];
										local807 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static224.method3575(local1056).method4185(local603, local807);
										continue;
									}
									if (local218 == 4109) {
										local27 -= 2;
										local29--;
										local603 = Static167.aStringArray26[local29];
										local807 = Static218.anIntArray478[local27];
										local1056 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = Static224.method3575(local1056).method4178(local603, local807);
										continue;
									}
									if (local218 == 4110) {
										local29 -= 2;
										local603 = Static167.aStringArray26[local29];
										local1643 = Static167.aStringArray26[local29 + 1];
										local27--;
										if (Static218.anIntArray478[local27] == 1) {
											Static167.aStringArray26[local29++] = local603;
										} else {
											Static167.aStringArray26[local29++] = local1643;
										}
										continue;
									}
									if (local218 == 4111) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										Static167.aStringArray26[local29++] = Static293.method4172(local603);
										continue;
									}
									if (local218 == 4112) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										local27--;
										local807 = Static218.anIntArray478[local27];
										if (local807 == -1) {
											throw new RuntimeException("null char");
										}
										Static167.aStringArray26[local29++] = local603 + (char) local807;
										continue;
									}
									if (local218 == 4113) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static164.method2590((char) local813) ? 1 : 0;
										continue;
									}
									if (local218 == 4114) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static218.method4262((char) local813) ? 1 : 0;
										continue;
									}
									if (local218 == 4115) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Static93.method1496((char) local813) ? 1 : 0;
										continue;
									}
									if (local218 == 4116) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = method320((char) local813) ? 1 : 0;
										continue;
									}
									if (local218 == 4117) {
										local29--;
										local603 = Static167.aStringArray26[local29];
										if (local603 == null) {
											Static218.anIntArray478[local27++] = 0;
										} else {
											Static218.anIntArray478[local27++] = local603.length();
										}
										continue;
									}
									if (local218 == 4118) {
										local27 -= 2;
										local807 = Static218.anIntArray478[local27];
										local29--;
										local603 = Static167.aStringArray26[local29];
										local1056 = Static218.anIntArray478[local27 + 1];
										Static167.aStringArray26[local29++] = local603.substring(local807, local1056);
										continue;
									}
									if (local218 == 4119) {
										@Pc(3628) boolean local3628 = false;
										local29--;
										local603 = Static167.aStringArray26[local29];
										@Pc(3639) StringBuffer local3639 = new StringBuffer(local603.length());
										for (local651 = 0; local651 < local603.length(); local651++) {
											@Pc(3649) char local3649 = local603.charAt(local651);
											if (local3649 == '<') {
												local3628 = true;
											} else if (local3649 == '>') {
												local3628 = false;
											} else if (!local3628) {
												local3639.append(local3649);
											}
										}
										Static167.aStringArray26[local29++] = local3639.toString();
										continue;
									}
									if (local218 == 4120) {
										local27 -= 2;
										local807 = Static218.anIntArray478[local27];
										local29--;
										local603 = Static167.aStringArray26[local29];
										local1056 = Static218.anIntArray478[local27 + 1];
										Static218.anIntArray478[local27++] = local603.indexOf(local807, local1056);
										continue;
									}
									if (local218 == 4121) {
										local29 -= 2;
										local603 = Static167.aStringArray26[local29];
										local1643 = Static167.aStringArray26[local29 + 1];
										local27--;
										local1056 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = local603.indexOf(local1643, local1056);
										continue;
									}
									if (local218 == 4122) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Character.toLowerCase((char) local813);
										continue;
									}
									if (local218 == 4123) {
										local27--;
										local813 = Static218.anIntArray478[local27];
										Static218.anIntArray478[local27++] = Character.toUpperCase((char) local813);
										continue;
									}
									if (local218 == 4124) {
										local27--;
										local3793 = Static218.anIntArray478[local27] != 0;
										local27--;
										local807 = Static218.anIntArray478[local27];
										Static167.aStringArray26[local29++] = Static185.method2904((long) local807, Static139.anInt2870, 0, local3793);
										continue;
									}
								} else {
									@Pc(4111) Class4_Sub2_Sub22 local4111;
									if (local218 < 4300) {
										if (local218 == 4200) {
											local27--;
											local813 = Static218.anIntArray478[local27];
											Static167.aStringArray26[local29++] = Static277.method4117(local813).aString169;
											continue;
										}
										@Pc(3855) Class163 local3855;
										if (local218 == 4201) {
											local27 -= 2;
											local813 = Static218.anIntArray478[local27];
											local807 = Static218.anIntArray478[local27 + 1];
											local3855 = Static277.method4117(local813);
											if (local807 >= 1 && local807 <= 5 && local3855.aStringArray33[local807 - 1] != null) {
												Static167.aStringArray26[local29++] = local3855.aStringArray33[local807 - 1];
												continue;
											}
											Static167.aStringArray26[local29++] = "";
											continue;
										}
										if (local218 == 4202) {
											local27 -= 2;
											local813 = Static218.anIntArray478[local27];
											local807 = Static218.anIntArray478[local27 + 1];
											local3855 = Static277.method4117(local813);
											if (local807 >= 1 && local807 <= 5 && local3855.aStringArray32[local807 - 1] != null) {
												Static167.aStringArray26[local29++] = local3855.aStringArray32[local807 - 1];
												continue;
											}
											Static167.aStringArray26[local29++] = "";
											continue;
										}
										if (local218 == 4203) {
											local27--;
											local813 = Static218.anIntArray478[local27];
											Static218.anIntArray478[local27++] = Static277.method4117(local813).anInt4912;
											continue;
										}
										if (local218 == 4204) {
											local27--;
											local813 = Static218.anIntArray478[local27];
											Static218.anIntArray478[local27++] = Static277.method4117(local813).anInt4887 == 1 ? 1 : 0;
											continue;
										}
										@Pc(4001) Class163 local4001;
										if (local218 == 4205) {
											local27--;
											local813 = Static218.anIntArray478[local27];
											local4001 = Static277.method4117(local813);
											if (local4001.anInt4869 == -1 && local4001.anInt4899 >= 0) {
												Static218.anIntArray478[local27++] = local4001.anInt4899;
												continue;
											}
											Static218.anIntArray478[local27++] = local813;
											continue;
										}
										if (local218 == 4206) {
											local27--;
											local813 = Static218.anIntArray478[local27];
											local4001 = Static277.method4117(local813);
											if (local4001.anInt4869 >= 0 && local4001.anInt4899 >= 0) {
												Static218.anIntArray478[local27++] = local4001.anInt4899;
												continue;
											}
											Static218.anIntArray478[local27++] = local813;
											continue;
										}
										if (local218 == 4207) {
											local27--;
											local813 = Static218.anIntArray478[local27];
											Static218.anIntArray478[local27++] = Static277.method4117(local813).aBoolean316 ? 1 : 0;
											continue;
										}
										if (local218 == 4208) {
											local27 -= 2;
											local813 = Static218.anIntArray478[local27];
											local807 = Static218.anIntArray478[local27 + 1];
											local4111 = Static51.method855(local807);
											if (local4111.method4398()) {
												Static167.aStringArray26[local29++] = Static277.method4117(local813).method3887(local807, local4111.aString193);
											} else {
												Static218.anIntArray478[local27++] = Static277.method4117(local813).method3896(local807, local4111.anInt5557);
											}
											continue;
										}
										if (local218 == 4210) {
											local27--;
											local807 = Static218.anIntArray478[local27];
											local29--;
											local603 = Static167.aStringArray26[local29];
											Static173.method2711(local603, local807 == 1);
											Static218.anIntArray478[local27++] = Static18.anInt381;
											continue;
										}
										if (local218 == 4211) {
											if (Static270.aShortArray84 != null && Static127.anInt2700 < Static18.anInt381) {
												Static218.anIntArray478[local27++] = Static270.aShortArray84[Static127.anInt2700++] & 0xFFFF;
												continue;
											}
											Static218.anIntArray478[local27++] = -1;
											continue;
										}
										if (local218 == 4212) {
											Static127.anInt2700 = 0;
											continue;
										}
									} else if (local218 < 4400) {
										if (local218 == 4300) {
											local27 -= 2;
											local813 = Static218.anIntArray478[local27];
											local807 = Static218.anIntArray478[local27 + 1];
											local4111 = Static51.method855(local807);
											if (local4111.method4398()) {
												Static167.aStringArray26[local29++] = Static262.method3970(local813).method4136(local4111.aString193, local807);
											} else {
												Static218.anIntArray478[local27++] = Static262.method3970(local813).method4135(local807, local4111.anInt5557);
											}
											continue;
										}
									} else if (local218 < 4500) {
										if (local218 == 4400) {
											local27 -= 2;
											local813 = Static218.anIntArray478[local27];
											local807 = Static218.anIntArray478[local27 + 1];
											local4111 = Static51.method855(local807);
											if (local4111.method4398()) {
												Static167.aStringArray26[local29++] = Static170.method2683(local813).method1092(local4111.aString193, local807);
											} else {
												Static218.anIntArray478[local27++] = Static170.method2683(local813).method1083(local807, local4111.anInt5557);
											}
											continue;
										}
									} else if (local218 >= 4600) {
										if (local218 < 5100) {
											if (local218 == 5000) {
												Static218.anIntArray478[local27++] = Static47.anInt952;
												continue;
											}
											if (local218 == 5001) {
												local27 -= 3;
												Static47.anInt952 = Static218.anIntArray478[local27];
												Static281.anInt5346 = Static218.anIntArray478[local27 + 1];
												Static171.anInt3390 = Static218.anIntArray478[local27 + 2];
												Static142.aClass4_Sub17_Sub1_3.method1905(26);
												Static142.aClass4_Sub17_Sub1_3.method1861(Static47.anInt952);
												Static142.aClass4_Sub17_Sub1_3.method1861(Static281.anInt5346);
												Static142.aClass4_Sub17_Sub1_3.method1861(Static171.anInt3390);
												continue;
											}
											if (local218 == 5002) {
												local27 -= 2;
												local29--;
												local603 = Static167.aStringArray26[local29];
												local1056 = Static218.anIntArray478[local27 + 1];
												local807 = Static218.anIntArray478[local27];
												Static142.aClass4_Sub17_Sub1_3.method1905(88);
												Static142.aClass4_Sub17_Sub1_3.method1891(Static34.method491(local603));
												Static142.aClass4_Sub17_Sub1_3.method1861(local807 - 1);
												Static142.aClass4_Sub17_Sub1_3.method1861(local1056);
												continue;
											}
											if (local218 == 5003) {
												local27--;
												local813 = Static218.anIntArray478[local27];
												local1643 = null;
												if (local813 < 100) {
													local1643 = Static19.aStringArray3[local813];
												}
												if (local1643 == null) {
													local1643 = "";
												}
												Static167.aStringArray26[local29++] = local1643;
												continue;
											}
											if (local218 == 5004) {
												local807 = -1;
												local27--;
												local813 = Static218.anIntArray478[local27];
												if (local813 < 100 && Static19.aStringArray3[local813] != null) {
													local807 = Static276.anIntArray455[local813];
												}
												Static218.anIntArray478[local27++] = local807;
												continue;
											}
											if (local218 == 5005) {
												Static218.anIntArray478[local27++] = Static281.anInt5346;
												continue;
											}
											if (local218 == 5008) {
												local29--;
												local603 = Static167.aStringArray26[local29];
												if (!local603.startsWith("::")) {
													if (Static176.anInt829 == 0 && (Static263.aBoolean68 && !Static189.aBoolean321 || Static63.aBoolean91)) {
														continue;
													}
													local1643 = local603.toLowerCase();
													@Pc(9014) byte local9014 = 0;
													@Pc(9016) byte local9016 = 0;
													if (local1643.startsWith(Static180.aString118)) {
														local9016 = 0;
														local603 = local603.substring(Static180.aString118.length());
													} else if (local1643.startsWith(Static205.aString128)) {
														local9016 = 1;
														local603 = local603.substring(Static205.aString128.length());
													} else if (local1643.startsWith(Static241.aString157)) {
														local603 = local603.substring(Static241.aString157.length());
														local9016 = 2;
													} else if (local1643.startsWith(Static214.aString134)) {
														local9016 = 3;
														local603 = local603.substring(Static214.aString134.length());
													} else if (local1643.startsWith(Static67.aString36)) {
														local603 = local603.substring(Static67.aString36.length());
														local9016 = 4;
													} else if (local1643.startsWith(Static227.aString127)) {
														local9016 = 5;
														local603 = local603.substring(Static227.aString127.length());
													} else if (local1643.startsWith(Static101.aString162)) {
														local603 = local603.substring(Static101.aString162.length());
														local9016 = 6;
													} else if (local1643.startsWith(Static167.aString109)) {
														local9016 = 7;
														local603 = local603.substring(Static167.aString109.length());
													} else if (local1643.startsWith(Static257.aString167)) {
														local9016 = 8;
														local603 = local603.substring(Static257.aString167.length());
													} else if (local1643.startsWith(Static277.aString187)) {
														local603 = local603.substring(Static277.aString187.length());
														local9016 = 9;
													} else if (local1643.startsWith(Static125.aString80)) {
														local603 = local603.substring(Static125.aString80.length());
														local9016 = 10;
													} else if (local1643.startsWith(Static45.aString24)) {
														local9016 = 11;
														local603 = local603.substring(Static45.aString24.length());
													} else if (Static139.anInt2870 != 0) {
														if (local1643.startsWith(Static234.aString154)) {
															local9016 = 0;
															local603 = local603.substring(Static234.aString154.length());
														} else if (local1643.startsWith(Static38.aString17)) {
															local9016 = 1;
															local603 = local603.substring(Static38.aString17.length());
														} else if (local1643.startsWith(Static137.aString89)) {
															local9016 = 2;
															local603 = local603.substring(Static137.aString89.length());
														} else if (local1643.startsWith(Static244.aString159)) {
															local603 = local603.substring(Static244.aString159.length());
															local9016 = 3;
														} else if (local1643.startsWith(Static243.aString158)) {
															local9016 = 4;
															local603 = local603.substring(Static243.aString158.length());
														} else if (local1643.startsWith(Static264.aString178)) {
															local603 = local603.substring(Static264.aString178.length());
															local9016 = 5;
														} else if (local1643.startsWith(Static160.aString107)) {
															local603 = local603.substring(Static160.aString107.length());
															local9016 = 6;
														} else if (local1643.startsWith(Static95.aString57)) {
															local603 = local603.substring(Static95.aString57.length());
															local9016 = 7;
														} else if (local1643.startsWith(Static153.aString102)) {
															local603 = local603.substring(Static153.aString102.length());
															local9016 = 8;
														} else if (local1643.startsWith(Static101.aString163)) {
															local9016 = 9;
															local603 = local603.substring(Static101.aString163.length());
														} else if (local1643.startsWith(Static63.aString33)) {
															local603 = local603.substring(Static63.aString33.length());
															local9016 = 10;
														} else if (local1643.startsWith(Static245.aString160)) {
															local603 = local603.substring(Static245.aString160.length());
															local9016 = 11;
														}
													}
													local1643 = local603.toLowerCase();
													if (local1643.startsWith(Static69.aString37)) {
														local9014 = 1;
														local603 = local603.substring(Static69.aString37.length());
													} else if (local1643.startsWith(Static180.aString119)) {
														local603 = local603.substring(Static180.aString119.length());
														local9014 = 2;
													} else if (local1643.startsWith(Static125.aString81)) {
														local603 = local603.substring(Static125.aString81.length());
														local9014 = 3;
													} else if (local1643.startsWith(Static179.aString115)) {
														local9014 = 4;
														local603 = local603.substring(Static179.aString115.length());
													} else if (local1643.startsWith(Static119.aString75)) {
														local9014 = 5;
														local603 = local603.substring(Static119.aString75.length());
													} else if (Static139.anInt2870 != 0) {
														if (local1643.startsWith(Static61.aString31)) {
															local603 = local603.substring(Static61.aString31.length());
															local9014 = 1;
														} else if (local1643.startsWith(Static191.aString181)) {
															local603 = local603.substring(Static191.aString181.length());
															local9014 = 2;
														} else if (local1643.startsWith(Static74.aString39)) {
															local603 = local603.substring(Static74.aString39.length());
															local9014 = 3;
														} else if (local1643.startsWith(Static169.aString110)) {
															local9014 = 4;
															local603 = local603.substring(Static169.aString110.length());
														} else if (local1643.startsWith(Static125.aString79)) {
															local603 = local603.substring(Static125.aString79.length());
															local9014 = 5;
														}
													}
													Static142.aClass4_Sub17_Sub1_3.method1905(147);
													Static142.aClass4_Sub17_Sub1_3.method1861(0);
													local1704 = Static142.aClass4_Sub17_Sub1_3.anInt2400;
													Static142.aClass4_Sub17_Sub1_3.method1861(local9016);
													Static142.aClass4_Sub17_Sub1_3.method1861(local9014);
													Static211.method3377(Static142.aClass4_Sub17_Sub1_3, local603);
													Static142.aClass4_Sub17_Sub1_3.method1867(Static142.aClass4_Sub17_Sub1_3.anInt2400 - local1704);
													continue;
												}
												Static16.method274(local603);
												continue;
											}
											if (local218 == 5009) {
												local29 -= 2;
												local603 = Static167.aStringArray26[local29];
												local1643 = Static167.aStringArray26[local29 + 1];
												if (Static176.anInt829 != 0 || (!Static263.aBoolean68 || Static189.aBoolean321) && !Static63.aBoolean91) {
													Static142.aClass4_Sub17_Sub1_3.method1905(66);
													Static142.aClass4_Sub17_Sub1_3.method1861(0);
													local1056 = Static142.aClass4_Sub17_Sub1_3.anInt2400;
													Static142.aClass4_Sub17_Sub1_3.method1891(Static34.method491(local603));
													Static211.method3377(Static142.aClass4_Sub17_Sub1_3, local1643);
													Static142.aClass4_Sub17_Sub1_3.method1867(Static142.aClass4_Sub17_Sub1_3.anInt2400 - local1056);
												}
												continue;
											}
											if (local218 == 5010) {
												local27--;
												local813 = Static218.anIntArray478[local27];
												local1643 = null;
												if (local813 < 100) {
													local1643 = Static117.aStringArray20[local813];
												}
												if (local1643 == null) {
													local1643 = "";
												}
												Static167.aStringArray26[local29++] = local1643;
												continue;
											}
											if (local218 == 5011) {
												local27--;
												local813 = Static218.anIntArray478[local27];
												local1643 = null;
												if (local813 < 100) {
													local1643 = Static49.aStringArray8[local813];
												}
												if (local1643 == null) {
													local1643 = "";
												}
												Static167.aStringArray26[local29++] = local1643;
												continue;
											}
											if (local218 == 5012) {
												local27--;
												local813 = Static218.anIntArray478[local27];
												local807 = -1;
												if (local813 < 100) {
													local807 = Static160.anIntArray286[local813];
												}
												Static218.anIntArray478[local27++] = local807;
												continue;
											}
											if (local218 == 5015) {
												if (Static239.aClass12_Sub3_Sub2_2 == null || Static239.aClass12_Sub3_Sub2_2.aString132 == null) {
													local603 = Static106.aString68;
												} else {
													local603 = Static239.aClass12_Sub3_Sub2_2.method3378();
												}
												Static167.aStringArray26[local29++] = local603;
												continue;
											}
											if (local218 == 5016) {
												Static218.anIntArray478[local27++] = Static171.anInt3390;
												continue;
											}
											if (local218 == 5017) {
												Static218.anIntArray478[local27++] = Static189.anInt4950;
												continue;
											}
											if (local218 == 5050) {
												local27--;
												local813 = Static218.anIntArray478[local27];
												Static167.aStringArray26[local29++] = Static151.method2419(local813).aString41;
												continue;
											}
											@Pc(9728) Class4_Sub2_Sub6 local9728;
											if (local218 == 5051) {
												local27--;
												local813 = Static218.anIntArray478[local27];
												local9728 = Static151.method2419(local813);
												if (local9728.anIntArray169 == null) {
													Static218.anIntArray478[local27++] = 0;
												} else {
													Static218.anIntArray478[local27++] = local9728.anIntArray169.length;
												}
												continue;
											}
											if (local218 == 5052) {
												local27 -= 2;
												local813 = Static218.anIntArray478[local27];
												local807 = Static218.anIntArray478[local27 + 1];
												@Pc(9768) Class4_Sub2_Sub6 local9768 = Static151.method2419(local813);
												local651 = local9768.anIntArray169[local807];
												Static218.anIntArray478[local27++] = local651;
												continue;
											}
											if (local218 == 5053) {
												local27--;
												local813 = Static218.anIntArray478[local27];
												local9728 = Static151.method2419(local813);
												if (local9728.anIntArray168 == null) {
													Static218.anIntArray478[local27++] = 0;
												} else {
													Static218.anIntArray478[local27++] = local9728.anIntArray168.length;
												}
												continue;
											}
											if (local218 == 5054) {
												local27 -= 2;
												local813 = Static218.anIntArray478[local27];
												local807 = Static218.anIntArray478[local27 + 1];
												Static218.anIntArray478[local27++] = Static151.method2419(local813).anIntArray168[local807];
												continue;
											}
											if (local218 == 5055) {
												local27--;
												local813 = Static218.anIntArray478[local27];
												Static167.aStringArray26[local29++] = Static248.method3758(local813).method2883();
												continue;
											}
											if (local218 == 5056) {
												local27--;
												local813 = Static218.anIntArray478[local27];
												@Pc(9873) Class4_Sub2_Sub14 local9873 = Static248.method3758(local813);
												if (local9873.anIntArray303 == null) {
													Static218.anIntArray478[local27++] = 0;
												} else {
													Static218.anIntArray478[local27++] = local9873.anIntArray303.length;
												}
												continue;
											}
											if (local218 == 5057) {
												local27 -= 2;
												local813 = Static218.anIntArray478[local27];
												local807 = Static218.anIntArray478[local27 + 1];
												Static218.anIntArray478[local27++] = Static248.method3758(local813).anIntArray303[local807];
												continue;
											}
											if (local218 == 5058) {
												Static205.aClass91_1 = new Class91();
												local27--;
												Static205.aClass91_1.anInt2857 = Static218.anIntArray478[local27];
												Static205.aClass91_1.aClass4_Sub2_Sub14_1 = Static248.method3758(Static205.aClass91_1.anInt2857);
												Static205.aClass91_1.anIntArray265 = new int[Static205.aClass91_1.aClass4_Sub2_Sub14_1.method2880()];
												continue;
											}
											if (local218 == 5059) {
												Static142.aClass4_Sub17_Sub1_3.method1905(41);
												Static142.aClass4_Sub17_Sub1_3.method1861(0);
												local813 = Static142.aClass4_Sub17_Sub1_3.anInt2400;
												Static142.aClass4_Sub17_Sub1_3.method1861(0);
												Static142.aClass4_Sub17_Sub1_3.method1875(Static205.aClass91_1.anInt2857);
												Static205.aClass91_1.aClass4_Sub2_Sub14_1.method2884(Static142.aClass4_Sub17_Sub1_3, Static205.aClass91_1.anIntArray265);
												Static142.aClass4_Sub17_Sub1_3.method1867(Static142.aClass4_Sub17_Sub1_3.anInt2400 - local813);
												continue;
											}
											if (local218 == 5060) {
												local29--;
												local603 = Static167.aStringArray26[local29];
												Static142.aClass4_Sub17_Sub1_3.method1905(5);
												Static142.aClass4_Sub17_Sub1_3.method1861(0);
												local807 = Static142.aClass4_Sub17_Sub1_3.anInt2400;
												Static142.aClass4_Sub17_Sub1_3.method1891(Static34.method491(local603));
												Static142.aClass4_Sub17_Sub1_3.method1875(Static205.aClass91_1.anInt2857);
												Static205.aClass91_1.aClass4_Sub2_Sub14_1.method2884(Static142.aClass4_Sub17_Sub1_3, Static205.aClass91_1.anIntArray265);
												Static142.aClass4_Sub17_Sub1_3.method1867(Static142.aClass4_Sub17_Sub1_3.anInt2400 - local807);
												continue;
											}
											if (local218 == 5061) {
												Static142.aClass4_Sub17_Sub1_3.method1905(41);
												Static142.aClass4_Sub17_Sub1_3.method1861(0);
												local813 = Static142.aClass4_Sub17_Sub1_3.anInt2400;
												Static142.aClass4_Sub17_Sub1_3.method1861(1);
												Static142.aClass4_Sub17_Sub1_3.method1875(Static205.aClass91_1.anInt2857);
												Static205.aClass91_1.aClass4_Sub2_Sub14_1.method2884(Static142.aClass4_Sub17_Sub1_3, Static205.aClass91_1.anIntArray265);
												Static142.aClass4_Sub17_Sub1_3.method1867(Static142.aClass4_Sub17_Sub1_3.anInt2400 - local813);
												continue;
											}
											if (local218 == 5062) {
												local27 -= 2;
												local807 = Static218.anIntArray478[local27 + 1];
												local813 = Static218.anIntArray478[local27];
												Static218.anIntArray478[local27++] = Static151.method2419(local813).aCharArray16[local807];
												continue;
											}
											if (local218 == 5063) {
												local27 -= 2;
												local813 = Static218.anIntArray478[local27];
												local807 = Static218.anIntArray478[local27 + 1];
												Static218.anIntArray478[local27++] = Static151.method2419(local813).aCharArray15[local807];
												continue;
											}
											if (local218 == 5064) {
												local27 -= 2;
												local813 = Static218.anIntArray478[local27];
												local807 = Static218.anIntArray478[local27 + 1];
												if (local807 == -1) {
													Static218.anIntArray478[local27++] = -1;
												} else {
													Static218.anIntArray478[local27++] = Static151.method2419(local813).method1243((char) local807);
												}
												continue;
											}
											if (local218 == 5065) {
												local27 -= 2;
												local813 = Static218.anIntArray478[local27];
												local807 = Static218.anIntArray478[local27 + 1];
												if (local807 == -1) {
													Static218.anIntArray478[local27++] = -1;
												} else {
													Static218.anIntArray478[local27++] = Static151.method2419(local813).method1249((char) local807);
												}
												continue;
											}
											if (local218 == 5066) {
												local27--;
												local813 = Static218.anIntArray478[local27];
												Static218.anIntArray478[local27++] = Static248.method3758(local813).method2880();
												continue;
											}
											if (local218 == 5067) {
												local27 -= 2;
												local813 = Static218.anIntArray478[local27];
												local807 = Static218.anIntArray478[local27 + 1];
												local1056 = Static248.method3758(local813).method2875(local807);
												Static218.anIntArray478[local27++] = local1056;
												continue;
											}
											if (local218 == 5068) {
												local27 -= 2;
												local807 = Static218.anIntArray478[local27 + 1];
												local813 = Static218.anIntArray478[local27];
												Static205.aClass91_1.anIntArray265[local813] = local807;
												continue;
											}
											if (local218 == 5069) {
												local27 -= 2;
												local807 = Static218.anIntArray478[local27 + 1];
												local813 = Static218.anIntArray478[local27];
												Static205.aClass91_1.anIntArray265[local813] = local807;
												continue;
											}
											if (local218 == 5070) {
												local27 -= 3;
												local813 = Static218.anIntArray478[local27];
												local807 = Static218.anIntArray478[local27 + 1];
												local1056 = Static218.anIntArray478[local27 + 2];
												@Pc(10347) Class4_Sub2_Sub14 local10347 = Static248.method3758(local813);
												if (local10347.method2875(local807) != 0) {
													throw new RuntimeException("bad command");
												}
												Static218.anIntArray478[local27++] = local10347.method2882(local1056, local807);
												continue;
											}
											if (local218 == 5071) {
												local29--;
												local603 = Static167.aStringArray26[local29];
												local27--;
												local6284 = Static218.anIntArray478[local27] == 1;
												Static68.method1044(local603, local6284);
												Static218.anIntArray478[local27++] = Static18.anInt381;
												continue;
											}
											if (local218 == 5072) {
												if (Static270.aShortArray84 != null && Static127.anInt2700 < Static18.anInt381) {
													Static218.anIntArray478[local27++] = Static270.aShortArray84[Static127.anInt2700++] & 0xFFFF;
													continue;
												}
												Static218.anIntArray478[local27++] = -1;
												continue;
											}
											if (local218 == 5073) {
												Static127.anInt2700 = 0;
												continue;
											}
										} else if (local218 < 5200) {
											if (local218 == 5100) {
												if (Static96.aBooleanArray15[86]) {
													Static218.anIntArray478[local27++] = 1;
												} else {
													Static218.anIntArray478[local27++] = 0;
												}
												continue;
											}
											if (local218 == 5101) {
												if (Static96.aBooleanArray15[82]) {
													Static218.anIntArray478[local27++] = 1;
												} else {
													Static218.anIntArray478[local27++] = 0;
												}
												continue;
											}
											if (local218 == 5102) {
												if (Static96.aBooleanArray15[81]) {
													Static218.anIntArray478[local27++] = 1;
												} else {
													Static218.anIntArray478[local27++] = 0;
												}
												continue;
											}
										} else {
											@Pc(4869) boolean local4869;
											if (local218 < 5300) {
												if (local218 == 5200) {
													local27--;
													Static127.method2095(Static218.anIntArray478[local27]);
													continue;
												}
												if (local218 == 5201) {
													Static218.anIntArray478[local27++] = Static165.method2598();
													continue;
												}
												if (local218 == 5202) {
													local27--;
													Static69.method1047(Static218.anIntArray478[local27]);
													continue;
												}
												if (local218 == 5203) {
													local29--;
													Static169.method2666(Static167.aStringArray26[local29]);
													continue;
												}
												if (local218 == 5204) {
													Static167.aStringArray26[local29 - 1] = Static98.method1591(Static167.aStringArray26[local29 - 1]);
													continue;
												}
												if (local218 == 5205) {
													local27--;
													Static224.method3579(-1, Static218.anIntArray478[local27], -1);
													continue;
												}
												@Pc(4525) Class4_Sub2_Sub9 local4525;
												if (local218 == 5206) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													local4525 = Static217.method3492(local813 & 0x3FFF, local813 >> 14 & 0x3FFF);
													if (local4525 == null) {
														Static218.anIntArray478[local27++] = -1;
													} else {
														Static218.anIntArray478[local27++] = local4525.anInt1820;
													}
													continue;
												}
												@Pc(4553) Class4_Sub2_Sub9 local4553;
												if (local218 == 5207) {
													local27--;
													local4553 = Static179.method2819(Static218.anIntArray478[local27]);
													if (local4553 != null && local4553.aString53 != null) {
														Static167.aStringArray26[local29++] = local4553.aString53;
														continue;
													}
													Static167.aStringArray26[local29++] = "";
													continue;
												}
												if (local218 == 5208) {
													Static218.anIntArray478[local27++] = Static59.anInt3156;
													Static218.anIntArray478[local27++] = Static21.anInt4307;
													continue;
												}
												if (local218 == 5209) {
													Static218.anIntArray478[local27++] = Static295.anInt5481 + Static81.anInt4033;
													Static218.anIntArray478[local27++] = Static132.anInt2785 + Static92.anInt1912 - Static96.anInt2064 - 1;
													continue;
												}
												if (local218 == 5210) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													local4525 = Static179.method2819(local813);
													if (local4525 == null) {
														Static218.anIntArray478[local27++] = 0;
														Static218.anIntArray478[local27++] = 0;
													} else {
														Static218.anIntArray478[local27++] = local4525.anInt1817 >> 14 & 0x3FFF;
														Static218.anIntArray478[local27++] = local4525.anInt1817 & 0x3FFF;
													}
													continue;
												}
												if (local218 == 5211) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													local4525 = Static179.method2819(local813);
													if (local4525 == null) {
														Static218.anIntArray478[local27++] = 0;
														Static218.anIntArray478[local27++] = 0;
													} else {
														Static218.anIntArray478[local27++] = local4525.anInt1830 - local4525.anInt1824;
														Static218.anIntArray478[local27++] = local4525.anInt1827 - local4525.anInt1821;
													}
													continue;
												}
												if (local218 == 5212) {
													local813 = Static164.method2597();
													local1056 = 0;
													if (local813 == -1) {
														local1643 = "";
													} else {
														local1643 = Static192.aClass9_2.aStringArray2[local813];
														local1056 = Static192.aClass9_2.method178(local813);
													}
													local1643 = Static83.method3365(local1643, "<br>", " ");
													Static167.aStringArray26[local29++] = local1643;
													Static218.anIntArray478[local27++] = local1056;
													continue;
												}
												if (local218 == 5213) {
													local813 = Static39.method4123();
													local1056 = 0;
													if (local813 == -1) {
														local1643 = "";
													} else {
														local1643 = Static192.aClass9_2.aStringArray2[local813];
														local1056 = Static192.aClass9_2.method178(local813);
													}
													local1643 = Static83.method3365(local1643, "<br>", " ");
													Static167.aStringArray26[local29++] = local1643;
													Static218.anIntArray478[local27++] = local1056;
													continue;
												}
												if (local218 == 5214) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													local4525 = Static111.method1918();
													if (local4525 != null) {
														local1645 = local4525.method1414(local813 >> 28 & 0x3, local813 & 0x3FFF, local813 >> 14 & 0x3FFF);
														if (local1645 != null) {
															Static237.method3672(local1645[1], local1645[2]);
														}
													}
													continue;
												}
												if (local218 == 5215) {
													local27 -= 2;
													local807 = Static218.anIntArray478[local27 + 1];
													local813 = Static218.anIntArray478[local27];
													local4869 = false;
													@Pc(4880) Class177 local4880 = Static165.method2599(local813 >> 14 & 0x3FFF, local813 & 0x3FFF);
													for (@Pc(4885) Class4_Sub2_Sub9 local4885 = (Class4_Sub2_Sub9) local4880.method4278(); local4885 != null; local4885 = (Class4_Sub2_Sub9) local4880.method4280()) {
														if (local4885.anInt1820 == local807) {
															local4869 = true;
															break;
														}
													}
													if (local4869) {
														Static218.anIntArray478[local27++] = 1;
													} else {
														Static218.anIntArray478[local27++] = 0;
													}
													continue;
												}
												if (local218 == 5216) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													Static235.method3670(local813);
													continue;
												}
												if (local218 == 5217) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (Static22.method366(local813)) {
														Static218.anIntArray478[local27++] = 1;
													} else {
														Static218.anIntArray478[local27++] = 0;
													}
													continue;
												}
												if (local218 == 5218) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													local4525 = Static179.method2819(local813);
													if (local4525 == null) {
														Static218.anIntArray478[local27++] = -1;
													} else {
														Static218.anIntArray478[local27++] = local4525.anInt1828;
													}
													continue;
												}
												if (local218 == 5219) {
													local29--;
													Static55.method877(Static167.aStringArray26[local29]);
													continue;
												}
												if (local218 == 5220) {
													Static218.anIntArray478[local27++] = Static93.anInt1927 == 100 ? 1 : 0;
													continue;
												}
												if (local218 == 5221) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													Static237.method3672(local813 >> 14 & 0x3FFF, local813 & 0x3FFF);
													continue;
												}
												if (local218 == 5222) {
													local4553 = Static111.method1918();
													if (local4553 == null) {
														Static218.anIntArray478[local27++] = -1;
														Static218.anIntArray478[local27++] = -1;
													} else {
														local645 = local4553.method1420(Static295.anInt5481 + Static81.anInt4033, -Static96.anInt2064 + -1 + Static92.anInt1912 + Static132.anInt2785);
														if (local645 == null) {
															Static218.anIntArray478[local27++] = -1;
															Static218.anIntArray478[local27++] = -1;
														} else {
															Static218.anIntArray478[local27++] = local645[1];
															Static218.anIntArray478[local27++] = local645[2];
														}
													}
													continue;
												}
												if (local218 == 5223) {
													local27 -= 2;
													local813 = Static218.anIntArray478[local27];
													local807 = Static218.anIntArray478[local27 + 1];
													Static224.method3579(local807 >> 14 & 0x3FFF, local813, local807 & 0x3FFF);
													continue;
												}
												if (local218 == 5224) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													local4525 = Static111.method1918();
													if (local4525 == null) {
														Static218.anIntArray478[local27++] = -1;
														Static218.anIntArray478[local27++] = -1;
													} else {
														local1645 = local4525.method1414(local813 >> 28 & 0x3, local813 & 0x3FFF, local813 >> 14 & 0x3FFF);
														if (local1645 == null) {
															Static218.anIntArray478[local27++] = -1;
															Static218.anIntArray478[local27++] = -1;
														} else {
															Static218.anIntArray478[local27++] = local1645[1];
															Static218.anIntArray478[local27++] = local1645[2];
														}
													}
													continue;
												}
												if (local218 == 5225) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													local4525 = Static111.method1918();
													if (local4525 == null) {
														Static218.anIntArray478[local27++] = -1;
														Static218.anIntArray478[local27++] = -1;
													} else {
														local1645 = local4525.method1420(local813 >> 14 & 0x3FFF, local813 & 0x3FFF);
														if (local1645 == null) {
															Static218.anIntArray478[local27++] = -1;
															Static218.anIntArray478[local27++] = -1;
														} else {
															Static218.anIntArray478[local27++] = local1645[1];
															Static218.anIntArray478[local27++] = local1645[2];
														}
													}
													continue;
												}
											} else if (local218 < 5400) {
												if (local218 == 5300) {
													local27 -= 2;
													local813 = Static218.anIntArray478[local27];
													local807 = Static218.anIntArray478[local27 + 1];
													Static82.method1277(false, 3, local813, local807);
													Static218.anIntArray478[local27++] = Static55.aFrame2 == null ? 0 : 1;
													continue;
												}
												if (local218 == 5301) {
													if (Static55.aFrame2 != null) {
														Static82.method1277(false, Static116.anInt2573, -1, -1);
													}
													continue;
												}
												if (local218 == 5302) {
													@Pc(8634) Class76[] local8634 = Static265.method3982();
													Static218.anIntArray478[local27++] = local8634.length;
													continue;
												}
												if (local218 == 5303) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													@Pc(8656) Class76[] local8656 = Static265.method3982();
													Static218.anIntArray478[local27++] = local8656[local813].anInt2653;
													Static218.anIntArray478[local27++] = local8656[local813].anInt2645;
													continue;
												}
												if (local218 == 5305) {
													local813 = Static224.anInt4445;
													local807 = Static176.anInt808;
													local1056 = -1;
													@Pc(8687) Class76[] local8687 = Static265.method3982();
													for (local1704 = 0; local1704 < local8687.length; local1704++) {
														@Pc(8701) Class76 local8701 = local8687[local1704];
														if (local8701.anInt2653 == local813 && local807 == local8701.anInt2645) {
															local1056 = local1704;
															break;
														}
													}
													Static218.anIntArray478[local27++] = local1056;
													continue;
												}
												if (local218 == 5306) {
													Static218.anIntArray478[local27++] = Static40.method683();
													continue;
												}
												if (local218 == 5307) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (local813 < 0 || local813 > 2) {
														local813 = 0;
													}
													Static82.method1277(false, local813, -1, -1);
													continue;
												}
												if (local218 == 5308) {
													Static218.anIntArray478[local27++] = Static116.anInt2573;
													continue;
												}
												if (local218 == 5309) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (local813 < 0 || local813 > 2) {
														local813 = 0;
													}
													Static116.anInt2573 = local813;
													Static102.method1649(Static87.aClass164_2);
													continue;
												}
											} else if (local218 < 5500) {
												if (local218 == 5400) {
													local29 -= 2;
													local1643 = Static167.aStringArray26[local29 + 1];
													local603 = Static167.aStringArray26[local29];
													local27--;
													local1056 = Static218.anIntArray478[local27];
													Static142.aClass4_Sub17_Sub1_3.method1905(33);
													Static142.aClass4_Sub17_Sub1_3.method1861(Static255.method3839(local603) + Static255.method3839(local1643) + 1);
													Static142.aClass4_Sub17_Sub1_3.method1849(local603);
													Static142.aClass4_Sub17_Sub1_3.method1849(local1643);
													Static142.aClass4_Sub17_Sub1_3.method1861(local1056);
													continue;
												}
												if (local218 == 5401) {
													local27 -= 2;
													Static181.aShortArray23[Static218.anIntArray478[local27]] = (short) Static160.method2501(Static218.anIntArray478[local27 + 1]);
													Static98.method1589();
													Static214.method3425();
													Static33.method486();
													Static264.method3975();
													Static85.method1340();
													continue;
												}
												if (local218 == 5405) {
													local27 -= 2;
													local807 = Static218.anIntArray478[local27 + 1];
													local813 = Static218.anIntArray478[local27];
													if (local813 >= 0 && local813 < 2) {
														Static146.anIntArrayArrayArray8[local813] = new int[local807 << 1][4];
													}
													continue;
												}
												if (local218 == 5406) {
													local27 -= 7;
													local807 = Static218.anIntArray478[local27 + 1] << 1;
													local813 = Static218.anIntArray478[local27];
													local1056 = Static218.anIntArray478[local27 + 2];
													local651 = Static218.anIntArray478[local27 + 3];
													local1704 = Static218.anIntArray478[local27 + 4];
													local1091 = Static218.anIntArray478[local27 + 5];
													@Pc(8090) int local8090 = Static218.anIntArray478[local27 + 6];
													if (local813 >= 0 && local813 < 2 && Static146.anIntArrayArrayArray8[local813] != null && local807 >= 0 && Static146.anIntArrayArrayArray8[local813].length > local807) {
														Static146.anIntArrayArrayArray8[local813][local807] = new int[] { (local1056 >> 14 & 0x3FFF) * 128, local651, (local1056 & 0x3FFF) * 128, local8090 };
														Static146.anIntArrayArrayArray8[local813][local807 + 1] = new int[] { (local1704 >> 14 & 0x3FFF) * 128, local1091, (local1704 & 0x3FFF) * 128 };
													}
													continue;
												}
												if (local218 == 5407) {
													local27--;
													local813 = Static146.anIntArrayArrayArray8[Static218.anIntArray478[local27]].length >> 1;
													Static218.anIntArray478[local27++] = local813;
													continue;
												}
												if (local218 == 5411) {
													if (Static55.aFrame2 != null) {
														Static82.method1277(false, Static116.anInt2573, -1, -1);
													}
													if (Static27.aFrame3 == null) {
														Static275.method4103(Static81.method3282(), false);
													} else {
														System.exit(0);
													}
													continue;
												}
												if (local218 == 5419) {
													local603 = "";
													if (Static248.aClass123_5 != null) {
														if (Static248.aClass123_5.anObject4 == null) {
															local603 = Static257.method3884(Static248.aClass123_5.anInt3793);
														} else {
															local603 = (String) Static248.aClass123_5.anObject4;
														}
													}
													Static167.aStringArray26[local29++] = local603;
													continue;
												}
												if (local218 == 5420) {
													Static218.anIntArray478[local27++] = Static260.anInt4951 == 3 ? 1 : 0;
													continue;
												}
												if (local218 == 5421) {
													if (Static55.aFrame2 != null) {
														Static82.method1277(false, Static116.anInt2573, -1, -1);
													}
													local29--;
													local603 = Static167.aStringArray26[local29];
													local27--;
													local6284 = Static218.anIntArray478[local27] == 1;
													@Pc(8309) String local8309 = Static81.method3282() + local603;
													if (Static27.aFrame3 != null || local6284 && Static260.anInt4951 != 3 && Static260.aString172.startsWith("win") && !Static145.aBoolean193) {
														Static86.aString52 = local8309;
														Static55.aBoolean81 = local6284;
														Static119.aClass123_3 = Static87.aClass164_2.method3932(local8309);
														continue;
													}
													Static275.method4103(local8309, local6284);
													continue;
												}
												if (local218 == 5422) {
													local29 -= 2;
													local603 = Static167.aStringArray26[local29];
													local27--;
													local1056 = Static218.anIntArray478[local27];
													local1643 = Static167.aStringArray26[local29 + 1];
													if (local603.length() > 0) {
														if (Static23.aStringArray4 == null) {
															Static23.aStringArray4 = new String[Static272.anIntArray452[Static132.anInt2784]];
														}
														Static23.aStringArray4[local1056] = local603;
													}
													if (local1643.length() > 0) {
														if (Static179.aStringArray29 == null) {
															Static179.aStringArray29 = new String[Static272.anIntArray452[Static132.anInt2784]];
														}
														Static179.aStringArray29[local1056] = local1643;
													}
													continue;
												}
												if (local218 == 5423) {
													local29--;
													System.out.println(Static167.aStringArray26[local29]);
													continue;
												}
												if (local218 == 5424) {
													local27 -= 11;
													Static16.anInt313 = Static218.anIntArray478[local27];
													Static292.anInt5467 = Static218.anIntArray478[local27 + 1];
													Static172.anInt3407 = Static218.anIntArray478[local27 + 2];
													Static277.anInt5180 = Static218.anIntArray478[local27 + 3];
													Static281.anInt5347 = Static218.anIntArray478[local27 + 4];
													Static202.anInt3944 = Static218.anIntArray478[local27 + 5];
													Static32.anInt638 = Static218.anIntArray478[local27 + 6];
													Static218.anInt5362 = Static218.anIntArray478[local27 + 7];
													Static202.anInt3934 = Static218.anIntArray478[local27 + 8];
													Static100.anInt2131 = Static218.anIntArray478[local27 + 9];
													Static183.anInt3594 = Static218.anIntArray478[local27 + 10];
													Static288.aClass98_66.method2391(Static281.anInt5347);
													Static288.aClass98_66.method2391(Static202.anInt3944);
													Static288.aClass98_66.method2391(Static32.anInt638);
													Static288.aClass98_66.method2391(Static218.anInt5362);
													Static288.aClass98_66.method2391(Static202.anInt3934);
													Static32.aBoolean50 = true;
													continue;
												}
												if (local218 == 5425) {
													Static106.method1733();
													Static32.aBoolean50 = false;
													continue;
												}
												if (local218 == 5426) {
													local27--;
													Static156.anInt3142 = Static218.anIntArray478[local27];
													continue;
												}
												if (local218 == 5427) {
													local27 -= 2;
													Static70.anInt4107 = Static218.anIntArray478[local27];
													Static277.anInt5176 = Static218.anIntArray478[local27 + 1];
													continue;
												}
												if (local218 == 5428) {
													local27 -= 2;
													local813 = Static218.anIntArray478[local27];
													local807 = Static218.anIntArray478[local27 + 1];
													Static218.anIntArray478[local27++] = Static255.method3851(local813, local807) ? 1 : 0;
													continue;
												}
											} else if (local218 < 5600) {
												if (local218 == 5500) {
													local27 -= 4;
													local813 = Static218.anIntArray478[local27];
													local807 = Static218.anIntArray478[local27 + 1];
													local1056 = Static218.anIntArray478[local27 + 2];
													local651 = Static218.anIntArray478[local27 + 3];
													Static231.method3629(local651, (local813 & 0x3FFF) - Static239.anInt4613, -Static170.anInt3385 + (local813 >> 14 & 0x3FFF), local1056, false, local807);
													continue;
												}
												if (local218 == 5501) {
													local27 -= 4;
													local813 = Static218.anIntArray478[local27];
													local651 = Static218.anIntArray478[local27 + 3];
													local1056 = Static218.anIntArray478[local27 + 2];
													local807 = Static218.anIntArray478[local27 + 1];
													Static142.method2312((local813 >> 14 & 0x3FFF) - Static170.anInt3385, local1056, (local813 & 0x3FFF) - Static239.anInt4613, local651, local807);
													continue;
												}
												if (local218 == 5502) {
													local27 -= 6;
													local813 = Static218.anIntArray478[local27];
													if (local813 >= 2) {
														throw new RuntimeException();
													}
													Static126.anInt2695 = local813;
													local807 = Static218.anIntArray478[local27 + 1];
													if (local807 + 1 >= Static146.anIntArrayArrayArray8[Static126.anInt2695].length >> 1) {
														throw new RuntimeException();
													}
													Static268.anInt5016 = 0;
													Static220.anInt4360 = local807;
													Static272.anInt5102 = Static218.anIntArray478[local27 + 2];
													Static121.anInt2646 = Static218.anIntArray478[local27 + 3];
													local1056 = Static218.anIntArray478[local27 + 4];
													if (local1056 >= 2) {
														throw new RuntimeException();
													}
													Static297.anInt5494 = local1056;
													local651 = Static218.anIntArray478[local27 + 5];
													if (local651 + 1 >= Static146.anIntArrayArrayArray8[Static297.anInt5494].length >> 1) {
														throw new RuntimeException();
													}
													Static85.anInt1720 = local651;
													Static239.anInt4616 = 3;
													continue;
												}
												if (local218 == 5503) {
													Static248.method3764();
													continue;
												}
												if (local218 == 5504) {
													local27 -= 2;
													Static207.method3301(Static218.anIntArray478[local27 + 1], Static218.anIntArray478[local27]);
													continue;
												}
												if (local218 == 5505) {
													Static218.anIntArray478[local27++] = (int) Static96.aFloat16;
													continue;
												}
												if (local218 == 5506) {
													Static218.anIntArray478[local27++] = (int) Static270.aFloat49;
													continue;
												}
												if (local218 == 5507) {
													Static232.method3635();
													continue;
												}
												if (local218 == 5508) {
													Static103.method1663();
													continue;
												}
												if (local218 == 5509) {
													Static60.method949();
													continue;
												}
												if (local218 == 5510) {
													Static177.method2747();
													continue;
												}
												if (local218 == 5512) {
													Static54.method873();
													continue;
												}
											} else if (local218 < 5700) {
												if (local218 == 5600) {
													local29 -= 2;
													local603 = Static167.aStringArray26[local29];
													local1643 = Static167.aStringArray26[local29 + 1];
													local27--;
													local1056 = Static218.anIntArray478[local27];
													if (Static267.anInt3573 == 10 && Static184.anInt3615 == 0 && Static277.anInt5177 == 0 && Static81.anInt4026 == 0 && Static134.anInt2799 == 0) {
														Static279.method4160(local1643, local1056, local603);
													}
													continue;
												}
												if (local218 == 5601) {
													Static99.method1613();
													continue;
												}
												if (local218 == 5602) {
													if (Static277.anInt5177 == 0) {
														Static254.anInt4785 = -2;
													}
													continue;
												}
												if (local218 == 5603) {
													local27 -= 4;
													if (Static267.anInt3573 == 10 && Static184.anInt3615 == 0 && Static277.anInt5177 == 0 && Static81.anInt4026 == 0 && Static134.anInt2799 == 0) {
														Static173.method2709(Static218.anIntArray478[local27 + 2], Static218.anIntArray478[local27 + 1], Static218.anIntArray478[local27 + 3], Static218.anIntArray478[local27]);
													}
													continue;
												}
												if (local218 == 5604) {
													local29--;
													if (Static267.anInt3573 == 10 && Static184.anInt3615 == 0 && Static277.anInt5177 == 0 && Static81.anInt4026 == 0 && Static134.anInt2799 == 0) {
														Static92.method1489(Static34.method491(Static167.aStringArray26[local29]));
													}
													continue;
												}
												if (local218 == 5605) {
													local29 -= 3;
													local27 -= 7;
													if (Static267.anInt3573 == 10 && Static184.anInt3615 == 0 && Static277.anInt5177 == 0 && Static81.anInt4026 == 0 && Static134.anInt2799 == 0) {
														Static45.method710(Static218.anIntArray478[local27 + 3], Static218.anIntArray478[local27 + 4] == 1, Static34.method491(Static167.aStringArray26[local29]), Static218.anIntArray478[local27 + 2], Static218.anIntArray478[local27 + 5] == 1, Static218.anIntArray478[local27 + 6] == 1, Static218.anIntArray478[local27 + 1], Static167.aStringArray26[local29 + 1], Static167.aStringArray26[local29 + 2], Static218.anIntArray478[local27]);
													}
													continue;
												}
												if (local218 == 5606) {
													if (Static81.anInt4026 == 0) {
														Static171.anInt3391 = -2;
													}
													continue;
												}
												if (local218 == 5607) {
													Static218.anIntArray478[local27++] = Static254.anInt4785;
													continue;
												}
												if (local218 == 5608) {
													Static218.anIntArray478[local27++] = Static230.anInt4510;
													continue;
												}
												if (local218 == 5609) {
													Static218.anIntArray478[local27++] = Static171.anInt3391;
													continue;
												}
												if (local218 == 5610) {
													for (local813 = 0; local813 < 5; local813++) {
														Static167.aStringArray26[local29++] = local813 >= Static82.aStringArray11.length ? "" : Static176.method653(Static82.aStringArray11[local813]);
													}
													Static82.aStringArray11 = null;
													continue;
												}
												if (local218 == 5611) {
													Static218.anIntArray478[local27++] = Static16.anInt311;
													continue;
												}
											} else if (local218 < 6100) {
												if (local218 == 6001) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (local813 < 1) {
														local813 = 1;
													}
													if (local813 > 4) {
														local813 = 4;
													}
													Static165.anInt3301 = local813;
													if (!Static178.aBoolean216 || !Static298.aBoolean357) {
														if (Static165.anInt3301 == 1) {
															Static204.method3239(0.9F);
														}
														if (Static165.anInt3301 == 2) {
															Static204.method3239(0.8F);
														}
														if (Static165.anInt3301 == 3) {
															Static204.method3239(0.7F);
														}
														if (Static165.anInt3301 == 4) {
															Static204.method3239(0.6F);
														}
													}
													if (Static178.aBoolean216) {
														Static6.method133();
														if (!Static298.aBoolean357) {
															Static79.method1232();
														}
													}
													Static214.method3425();
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6002) {
													local27--;
													Static240.method4000(Static218.anIntArray478[local27] == 1);
													Static120.method2044();
													Static79.method1232();
													Static265.method3980();
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6003) {
													local27--;
													Static73.aBoolean106 = Static218.anIntArray478[local27] == 1;
													Static265.method3980();
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6005) {
													local27--;
													Static114.aBoolean166 = Static218.anIntArray478[local27] == 1;
													Static79.method1232();
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6006) {
													local27--;
													Static238.aBoolean299 = Static218.anIntArray478[local27] == 1;
													((Class71_Sub1) Static204.anInterface2_1).method1987(!Static238.aBoolean299);
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6007) {
													local27--;
													Static182.aBoolean234 = Static218.anIntArray478[local27] == 1;
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6008) {
													local27--;
													Static268.aBoolean333 = Static218.anIntArray478[local27] == 1;
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6009) {
													local27--;
													Static105.aBoolean162 = Static218.anIntArray478[local27] == 1;
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6010) {
													local27--;
													Static171.aBoolean210 = Static218.anIntArray478[local27] == 1;
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6011) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (local813 < 0 || local813 > 2) {
														local813 = 0;
													}
													Static18.anInt380 = local813;
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6012) {
													if (Static178.aBoolean216) {
														Static32.method479(0, 0);
													}
													local27--;
													Static298.aBoolean357 = Static218.anIntArray478[local27] == 1;
													if (Static178.aBoolean216 && Static298.aBoolean357) {
														Static204.method3239(0.7F);
													} else {
														if (Static165.anInt3301 == 1) {
															Static204.method3239(0.9F);
														}
														if (Static165.anInt3301 == 2) {
															Static204.method3239(0.8F);
														}
														if (Static165.anInt3301 == 3) {
															Static204.method3239(0.7F);
														}
														if (Static165.anInt3301 == 4) {
															Static204.method3239(0.6F);
														}
													}
													Static79.method1232();
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6014) {
													local27--;
													Static139.aBoolean188 = Static218.anIntArray478[local27] == 1;
													if (Static178.aBoolean216) {
														Static79.method1232();
													}
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6015) {
													local27--;
													Static14.aBoolean154 = Static218.anIntArray478[local27] == 1;
													if (Static178.aBoolean216) {
														Static6.method133();
													}
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6016) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (Static178.aBoolean216) {
														Static115.aBoolean170 = true;
													}
													if (local813 < 0 || local813 > 2) {
														local813 = 0;
													}
													Static218.anInt5374 = local813;
													continue;
												}
												if (local218 == 6017) {
													local27--;
													Static159.aBoolean203 = Static218.anIntArray478[local27] == 1;
													Static53.method866();
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6018) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (local813 < 0) {
														local813 = 0;
													}
													if (local813 > 127) {
														local813 = 127;
													}
													Static150.anInt3043 = local813;
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6019) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (local813 < 0) {
														local813 = 0;
													}
													if (local813 > 255) {
														local813 = 255;
													}
													if (local813 != Static52.anInt1043) {
														if (Static52.anInt1043 == 0 && Static67.anInt1256 != -1) {
															Static119.method2037(local813, Static94.aClass98_56, Static67.anInt1256);
															Static190.aBoolean244 = false;
														} else if (local813 == 0) {
															Static121.method2051();
															Static190.aBoolean244 = false;
														} else {
															Static74.method1120(local813);
														}
														Static52.anInt1043 = local813;
													}
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6020) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (local813 < 0) {
														local813 = 0;
													}
													if (local813 > 127) {
														local813 = 127;
													}
													Static71.anInt1312 = local813;
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													continue;
												}
												if (local218 == 6021) {
													local27--;
													Static117.aBoolean172 = Static218.anIntArray478[local27] == 1;
													Static265.method3980();
													continue;
												}
												if (local218 == 6023) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													local6284 = false;
													if (local813 < 0) {
														local813 = 0;
													}
													if (local813 > 2) {
														local813 = 2;
													}
													if (Static193.anInt3800 < 96) {
														local6284 = true;
														local813 = 0;
													}
													Static109.method1760(local813);
													Static102.method1649(Static87.aClass164_2);
													Static189.aBoolean320 = false;
													Static218.anIntArray478[local27++] = local6284 ? 0 : 1;
													continue;
												}
												if (local218 == 6024) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (local813 < 0 || local813 > 2) {
														local813 = 0;
													}
													Static222.anInt4407 = local813;
													Static102.method1649(Static87.aClass164_2);
													continue;
												}
												if (local218 == 6027) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (!Static178.aBoolean216) {
														continue;
													}
													if (local813 < 0 || local813 > 1) {
														local813 = 0;
													}
													Static140.method2283(local813 == 1);
													continue;
												}
												if (local218 == 6028) {
													local27--;
													Static266.aBoolean331 = Static218.anIntArray478[local27] != 0;
													Static102.method1649(Static87.aClass164_2);
													continue;
												}
											} else if (local218 < 6200) {
												if (local218 == 6101) {
													Static218.anIntArray478[local27++] = Static165.anInt3301;
													continue;
												}
												if (local218 == 6102) {
													Static218.anIntArray478[local27++] = Static62.method957() ? 1 : 0;
													continue;
												}
												if (local218 == 6103) {
													Static218.anIntArray478[local27++] = Static73.aBoolean106 ? 1 : 0;
													continue;
												}
												if (local218 == 6105) {
													Static218.anIntArray478[local27++] = Static114.aBoolean166 ? 1 : 0;
													continue;
												}
												if (local218 == 6106) {
													Static218.anIntArray478[local27++] = Static238.aBoolean299 ? 1 : 0;
													continue;
												}
												if (local218 == 6107) {
													Static218.anIntArray478[local27++] = Static182.aBoolean234 ? 1 : 0;
													continue;
												}
												if (local218 == 6108) {
													Static218.anIntArray478[local27++] = Static268.aBoolean333 ? 1 : 0;
													continue;
												}
												if (local218 == 6109) {
													Static218.anIntArray478[local27++] = Static105.aBoolean162 ? 1 : 0;
													continue;
												}
												if (local218 == 6110) {
													Static218.anIntArray478[local27++] = Static171.aBoolean210 ? 1 : 0;
													continue;
												}
												if (local218 == 6111) {
													Static218.anIntArray478[local27++] = Static18.anInt380;
													continue;
												}
												if (local218 == 6112) {
													Static218.anIntArray478[local27++] = Static298.aBoolean357 ? 1 : 0;
													continue;
												}
												if (local218 == 6114) {
													Static218.anIntArray478[local27++] = Static139.aBoolean188 ? 1 : 0;
													continue;
												}
												if (local218 == 6115) {
													Static218.anIntArray478[local27++] = Static14.aBoolean154 ? 1 : 0;
													continue;
												}
												if (local218 == 6116) {
													Static218.anIntArray478[local27++] = Static218.anInt5374;
													continue;
												}
												if (local218 == 6117) {
													Static218.anIntArray478[local27++] = Static159.aBoolean203 ? 1 : 0;
													continue;
												}
												if (local218 == 6118) {
													Static218.anIntArray478[local27++] = Static150.anInt3043;
													continue;
												}
												if (local218 == 6119) {
													Static218.anIntArray478[local27++] = Static52.anInt1043;
													continue;
												}
												if (local218 == 6120) {
													Static218.anIntArray478[local27++] = Static71.anInt1312;
													continue;
												}
												if (local218 == 6121) {
													if (Static178.aBoolean216) {
														Static218.anIntArray478[local27++] = Static178.aBoolean226 ? 1 : 0;
													} else {
														Static218.anIntArray478[local27++] = 0;
													}
													continue;
												}
												if (local218 == 6123) {
													Static218.anIntArray478[local27++] = Static109.method1758();
													continue;
												}
												if (local218 == 6124) {
													Static218.anIntArray478[local27++] = Static222.anInt4407;
													continue;
												}
												if (local218 == 6126) {
													if (Static178.aBoolean216) {
														Static218.anIntArray478[local27++] = Static58.method934() ? 1 : 0;
													} else {
														Static218.anIntArray478[local27++] = 0;
													}
													continue;
												}
												if (local218 == 6127) {
													Static218.anIntArray478[local27++] = Static92.aBoolean144 ? 1 : 0;
													continue;
												}
												if (local218 == 6128) {
													Static218.anIntArray478[local27++] = Static266.aBoolean331 ? 1 : 0;
													continue;
												}
											} else if (local218 < 6300) {
												if (local218 == 6200) {
													local27 -= 2;
													Static180.aShort18 = (short) Static218.anIntArray478[local27];
													if (Static180.aShort18 <= 0) {
														Static180.aShort18 = 256;
													}
													Static165.aShort17 = (short) Static218.anIntArray478[local27 + 1];
													if (Static165.aShort17 <= 0) {
														Static165.aShort17 = 205;
													}
													continue;
												}
												if (local218 == 6201) {
													local27 -= 2;
													Static176.aShort12 = (short) Static218.anIntArray478[local27];
													if (Static176.aShort12 <= 0) {
														Static176.aShort12 = 256;
													}
													Static132.aShort15 = (short) Static218.anIntArray478[local27 + 1];
													if (Static132.aShort15 <= 0) {
														Static132.aShort15 = 320;
													}
													continue;
												}
												if (local218 == 6202) {
													local27 -= 4;
													Static258.aShort30 = (short) Static218.anIntArray478[local27];
													if (Static258.aShort30 <= 0) {
														Static258.aShort30 = 1;
													}
													Static157.aShort16 = (short) Static218.anIntArray478[local27 + 1];
													if (Static157.aShort16 <= 0) {
														Static157.aShort16 = 32767;
													} else if (Static157.aShort16 < Static258.aShort30) {
														Static157.aShort16 = Static258.aShort30;
													}
													Static242.aShort31 = (short) Static218.anIntArray478[local27 + 2];
													if (Static242.aShort31 <= 0) {
														Static242.aShort31 = 1;
													}
													Static69.aShort13 = (short) Static218.anIntArray478[local27 + 3];
													if (Static69.aShort13 <= 0) {
														Static69.aShort13 = 32767;
													} else if (Static69.aShort13 < Static242.aShort31) {
														Static69.aShort13 = Static242.aShort31;
													}
													continue;
												}
												if (local218 == 6203) {
													Static145.method2343(Static221.aClass22_18.anInt602, Static221.aClass22_18.anInt546, 0, false, 0);
													Static218.anIntArray478[local27++] = Static272.anInt5104;
													Static218.anIntArray478[local27++] = Static84.anInt1698;
													continue;
												}
												if (local218 == 6204) {
													Static218.anIntArray478[local27++] = Static176.aShort12;
													Static218.anIntArray478[local27++] = Static132.aShort15;
													continue;
												}
												if (local218 == 6205) {
													Static218.anIntArray478[local27++] = Static180.aShort18;
													Static218.anIntArray478[local27++] = Static165.aShort17;
													continue;
												}
											} else if (local218 < 6400) {
												if (local218 == 6300) {
													Static218.anIntArray478[local27++] = (int) (Static133.method2163() / 60000L);
													continue;
												}
												if (local218 == 6301) {
													Static218.anIntArray478[local27++] = (int) (Static133.method2163() / 86400000L) - 11745;
													continue;
												}
												if (local218 == 6302) {
													local27 -= 3;
													local813 = Static218.anIntArray478[local27];
													local1056 = Static218.anIntArray478[local27 + 2];
													local807 = Static218.anIntArray478[local27 + 1];
													Static63.aCalendar2.clear();
													Static63.aCalendar2.set(11, 12);
													Static63.aCalendar2.set(local1056, local807, local813);
													Static218.anIntArray478[local27++] = (int) (Static63.aCalendar2.getTime().getTime() / 86400000L) - 11745;
													continue;
												}
												if (local218 == 6303) {
													Static63.aCalendar2.clear();
													Static63.aCalendar2.setTime(new Date(Static133.method2163()));
													Static218.anIntArray478[local27++] = Static63.aCalendar2.get(1);
													continue;
												}
												if (local218 == 6304) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													local6284 = true;
													if (local813 < 0) {
														local6284 = (local813 + 1) % 4 == 0;
													} else if (local813 < 1582) {
														local6284 = local813 % 4 == 0;
													} else if (local813 % 4 != 0) {
														local6284 = false;
													} else if (local813 % 100 != 0) {
														local6284 = true;
													} else if (local813 % 400 != 0) {
														local6284 = false;
													}
													Static218.anIntArray478[local27++] = local6284 ? 1 : 0;
													continue;
												}
											} else if (local218 < 6500) {
												if (local218 == 6405) {
													Static218.anIntArray478[local27++] = Static227.method3211() ? 1 : 0;
													continue;
												}
												if (local218 == 6406) {
													Static218.anIntArray478[local27++] = Static82.method1278() ? 1 : 0;
													continue;
												}
											} else if (local218 < 6600) {
												if (local218 == 6500) {
													if (Static267.anInt3573 == 10 && Static184.anInt3615 == 0 && Static277.anInt5177 == 0 && Static81.anInt4026 == 0) {
														Static218.anIntArray478[local27++] = Static129.method2131() == -1 ? 0 : 1;
														continue;
													}
													Static218.anIntArray478[local27++] = 1;
													continue;
												}
												@Pc(7126) Class149 local7126;
												@Pc(7069) Class53_Sub1 local7069;
												if (local218 == 6501) {
													local7069 = Static108.method1746();
													if (local7069 == null) {
														Static218.anIntArray478[local27++] = -1;
														Static218.anIntArray478[local27++] = 0;
														Static167.aStringArray26[local29++] = "";
														Static218.anIntArray478[local27++] = 0;
														Static167.aStringArray26[local29++] = "";
														Static218.anIntArray478[local27++] = 0;
													} else {
														Static218.anIntArray478[local27++] = local7069.anInt1775;
														Static218.anIntArray478[local27++] = local7069.anInt1769;
														Static167.aStringArray26[local29++] = local7069.aString48;
														local7126 = local7069.method1380();
														Static218.anIntArray478[local27++] = local7126.anInt4518;
														Static167.aStringArray26[local29++] = local7126.aString148;
														Static218.anIntArray478[local27++] = local7069.anInt1771;
													}
													continue;
												}
												if (local218 == 6502) {
													local7069 = Static138.method2262();
													if (local7069 == null) {
														Static218.anIntArray478[local27++] = -1;
														Static218.anIntArray478[local27++] = 0;
														Static167.aStringArray26[local29++] = "";
														Static218.anIntArray478[local27++] = 0;
														Static167.aStringArray26[local29++] = "";
														Static218.anIntArray478[local27++] = 0;
													} else {
														Static218.anIntArray478[local27++] = local7069.anInt1775;
														Static218.anIntArray478[local27++] = local7069.anInt1769;
														Static167.aStringArray26[local29++] = local7069.aString48;
														local7126 = local7069.method1380();
														Static218.anIntArray478[local27++] = local7126.anInt4518;
														Static167.aStringArray26[local29++] = local7126.aString148;
														Static218.anIntArray478[local27++] = local7069.anInt1771;
													}
													continue;
												}
												if (local218 == 6503) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													if (Static267.anInt3573 == 10 && Static184.anInt3615 == 0 && Static277.anInt5177 == 0 && Static81.anInt4026 == 0) {
														Static218.anIntArray478[local27++] = Static61.method953(local813) ? 1 : 0;
														continue;
													}
													Static218.anIntArray478[local27++] = 0;
													continue;
												}
												if (local218 == 6504) {
													local27--;
													Static11.anInt216 = Static218.anIntArray478[local27];
													Static102.method1649(Static87.aClass164_2);
													continue;
												}
												if (local218 == 6505) {
													Static218.anIntArray478[local27++] = Static11.anInt216;
													continue;
												}
												if (local218 == 6506) {
													local27--;
													local813 = Static218.anIntArray478[local27];
													@Pc(7319) Class53_Sub1 local7319 = Static155.method2476(local813);
													if (local7319 == null) {
														Static218.anIntArray478[local27++] = -1;
														Static167.aStringArray26[local29++] = "";
														Static218.anIntArray478[local27++] = 0;
														Static167.aStringArray26[local29++] = "";
														Static218.anIntArray478[local27++] = 0;
													} else {
														Static218.anIntArray478[local27++] = local7319.anInt1769;
														Static167.aStringArray26[local29++] = local7319.aString48;
														@Pc(7338) Class149 local7338 = local7319.method1380();
														Static218.anIntArray478[local27++] = local7338.anInt4518;
														Static167.aStringArray26[local29++] = local7338.aString148;
														Static218.anIntArray478[local27++] = local7319.anInt1771;
													}
													continue;
												}
												if (local218 == 6507) {
													local27 -= 4;
													local813 = Static218.anIntArray478[local27];
													local6284 = Static218.anIntArray478[local27 + 1] == 1;
													local1056 = Static218.anIntArray478[local27 + 2];
													local4869 = Static218.anIntArray478[local27 + 3] == 1;
													Static262.method3969(local4869, local813, local6284, local1056);
													continue;
												}
											} else if (local218 < 6700) {
												if (local218 == 6600) {
													local27--;
													Static74.aBoolean115 = Static218.anIntArray478[local27] == 1;
													Static102.method1649(Static87.aClass164_2);
													continue;
												}
												if (local218 == 6601) {
													Static218.anIntArray478[local27++] = Static74.aBoolean115 ? 1 : 0;
													continue;
												}
											}
										}
									} else if (local218 == 4500) {
										local27 -= 2;
										local813 = Static218.anIntArray478[local27];
										local807 = Static218.anIntArray478[local27 + 1];
										local4111 = Static51.method855(local807);
										if (local4111.method4398()) {
											Static167.aStringArray26[local29++] = Static113.method1934(local813).method1512(local4111.aString193, local807);
										} else {
											Static218.anIntArray478[local27++] = Static113.method1934(local813).method1513(local807, local4111.anInt5557);
										}
										continue;
									}
								}
							} else {
								if (local218 < 2000) {
									local1182 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
								} else {
									local218 -= 1000;
									local27--;
									local1182 = Static21.method3453(Static218.anIntArray478[local27]);
								}
								if (local218 == 1300) {
									local27--;
									local807 = Static218.anIntArray478[local27] - 1;
									if (local807 >= 0 && local807 <= 9) {
										local29--;
										local1182.method466(local807, Static167.aStringArray26[local29]);
										continue;
									}
									local29--;
									continue;
								}
								if (local218 == 1301) {
									local27 -= 2;
									local807 = Static218.anIntArray478[local27];
									local1056 = Static218.anIntArray478[local27 + 1];
									local1182.aClass22_3 = Static172.method2702(local807, local1056);
									continue;
								}
								if (local218 == 1302) {
									local27--;
									local1182.aBoolean34 = Static218.anIntArray478[local27] == 1;
									continue;
								}
								if (local218 == 1303) {
									local27--;
									local1182.anInt577 = Static218.anIntArray478[local27];
									continue;
								}
								if (local218 == 1304) {
									local27--;
									local1182.anInt599 = Static218.anIntArray478[local27];
									continue;
								}
								if (local218 == 1305) {
									local29--;
									local1182.aString9 = Static167.aStringArray26[local29];
									continue;
								}
								if (local218 == 1306) {
									local29--;
									local1182.aString12 = Static167.aStringArray26[local29];
									continue;
								}
								if (local218 == 1307) {
									local1182.aStringArray5 = null;
									continue;
								}
								if (local218 == 1308) {
									local27--;
									local1182.anInt539 = Static218.anIntArray478[local27];
									local27--;
									local1182.anInt582 = Static218.anIntArray478[local27];
									continue;
								}
								if (local218 == 1309) {
									local27--;
									local807 = Static218.anIntArray478[local27];
									local27--;
									local1056 = Static218.anIntArray478[local27];
									if (local1056 >= 1 && local1056 <= 10) {
										local1182.method464(local1056 - 1, local807);
									}
									continue;
								}
								if (local218 == 1310) {
									local29--;
									local1182.aString11 = Static167.aStringArray26[local29];
									continue;
								}
							}
						} else {
							if (local218 >= 2000) {
								local218 -= 1000;
								local27--;
								local1182 = Static21.method3453(Static218.anIntArray478[local27]);
							} else {
								local1182 = local1024 ? Static160.aClass22_14 : Static265.aClass22_19;
							}
							if (local218 == 1000) {
								local27 -= 4;
								local1182.anInt538 = Static218.anIntArray478[local27];
								local1182.anInt608 = Static218.anIntArray478[local27 + 1];
								local807 = Static218.anIntArray478[local27 + 2];
								local1056 = Static218.anIntArray478[local27 + 3];
								if (local807 < 0) {
									local807 = 0;
								} else if (local807 > 5) {
									local807 = 5;
								}
								local1182.aByte4 = (byte) local807;
								if (local1056 < 0) {
									local1056 = 0;
								} else if (local1056 > 5) {
									local1056 = 5;
								}
								local1182.aByte2 = (byte) local1056;
								Static81.method3274(local1182);
								Static275.method4099(local1182);
								if (local1182.anInt561 == -1) {
									Static7.method146(local1182.anInt596);
								}
								continue;
							}
							if (local218 == 1001) {
								local27 -= 4;
								local1182.anInt600 = Static218.anIntArray478[local27];
								local1182.anInt634 = Static218.anIntArray478[local27 + 1];
								local1182.anInt570 = 0;
								local1182.anInt606 = 0;
								local807 = Static218.anIntArray478[local27 + 2];
								local1056 = Static218.anIntArray478[local27 + 3];
								if (local807 < 0) {
									local807 = 0;
								} else if (local807 > 4) {
									local807 = 4;
								}
								local1182.aByte3 = (byte) local807;
								if (local1056 < 0) {
									local1056 = 0;
								} else if (local1056 > 4) {
									local1056 = 4;
								}
								local1182.aByte5 = (byte) local1056;
								Static81.method3274(local1182);
								Static275.method4099(local1182);
								if (local1182.anInt542 == 0) {
									Static161.method2514(local1182, false);
								}
								continue;
							}
							if (local218 == 1003) {
								local27--;
								local6284 = Static218.anIntArray478[local27] == 1;
								if (local1182.aBoolean35 != local6284) {
									local1182.aBoolean35 = local6284;
									Static81.method3274(local1182);
								}
								if (local1182.anInt561 == -1) {
									Static206.method3290(local1182.anInt596);
								}
								continue;
							}
							if (local218 == 1004) {
								local27 -= 2;
								local1182.anInt548 = Static218.anIntArray478[local27];
								local1182.anInt559 = Static218.anIntArray478[local27 + 1];
								Static81.method3274(local1182);
								Static275.method4099(local1182);
								if (local1182.anInt542 == 0) {
									Static161.method2514(local1182, false);
								}
								continue;
							}
							if (local218 == 1005) {
								local27--;
								local1182.aBoolean39 = Static218.anIntArray478[local27] == 1;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14765) Exception local14765) {
			if (local18.aString4 == null) {
				if (Static251.anInt4743 != 0) {
					Static271.method4062("Clientscript error - check log for details", 0, "");
				}
				Static244.method3721("CS2 - scr:" + local18.aLong200 + " op:" + local41, local14765);
			} else {
				@Pc(14774) StringBuffer local14774 = new StringBuffer(30);
				local14774.append("%0a - in: ").append(local18.aString4);
				for (local58 = Static266.anInt4997 - 1; local58 >= 0; local58--) {
					local14774.append("%0a - via: ").append(Static229.aClass85Array2[local58].aClass4_Sub2_Sub2_1.aString4);
				}
				if (local41 == 40) {
					local58 = local44[local36];
					local14774.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local58));
				}
				if (Static251.anInt4743 != 0) {
					Static271.method4062("Clientscript error in: " + local18.aString4, 0, "");
				}
				Static244.method3721("CS2 - scr:" + local18.aLong200 + " op:" + local41 + local14774.toString(), local14765);
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIZIZ)Lclient!lc;")
	public static Class98 method322(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class79 local5 = null;
		if (Static103.aClass137_1 != null) {
			local5 = new Class79(arg2, Static103.aClass137_1, Static99.aClass137Array1[arg2], 1000000);
		}
		Static165.aClass153_Sub1Array1[arg2] = Static28.aClass162_1.method3842(Static267.aClass79_4, arg2, local5);
		if (arg0) {
			Static165.aClass153_Sub1Array1[arg2].method3923();
		}
		return new Class98(Static165.aClass153_Sub1Array1[arg2], arg3, arg1);
	}
}
