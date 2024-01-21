import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "[I")
	public static final int[] anIntArray170 = new int[50];

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "[I")
	public static final int[] anIntArray171 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_563 = Static181.method2795("title_mute");

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_564 = Static181.method2795("Allocated memory");

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "Lclient!qe;")
	public static Class83 aClass83_565 = aClass83_564;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III[Lclient!ae;IIIII)V")
	public static void method1446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) Class5 local13 = arg2[local7];
			if (local13 != null && (!local13.aBoolean7 || local13.anInt130 == 0 || local13.aBoolean14 || Static138.method2242(local13) != 0 || local13 == Static106.aClass5_12 || local13.anInt180 == 1338) && local13.anInt132 == arg3 && (!local13.aBoolean7 || !Static29.method604(local13))) {
				@Pc(58) int local58 = arg4 + local13.anInt154;
				@Pc(63) int local63 = arg5 + local13.anInt105;
				if (local13 == Static73.aClass5_9) {
					Static11.anInt369 = local58;
					Static123.anInt2756 = local63;
					Static48.aBoolean72 = true;
				}
				@Pc(80) int local80;
				@Pc(82) int local82;
				@Pc(78) int local78;
				@Pc(84) int local84;
				if (local13.anInt130 == 2) {
					local78 = arg0;
					local80 = arg1;
					local82 = arg6;
					local84 = arg7;
				} else {
					local80 = local58 <= arg1 ? arg1 : local58;
					local82 = arg6 < local63 ? local63 : arg6;
					@Pc(113) int local113 = local58 + local13.anInt157;
					@Pc(118) int local118 = local13.anInt100 + local63;
					if (local13.anInt130 == 9) {
						local118++;
						local113++;
					}
					local84 = arg7 > local118 ? local118 : arg7;
					local78 = local113 >= arg0 ? arg0 : local113;
				}
				if (!local13.aBoolean7 || local80 < local78 && local84 > local82) {
					if (local13.anInt130 == 0) {
						if (!local13.aBoolean7 && Static29.method604(local13) && Static135.aClass5_16 != local13) {
							continue;
						}
						if (local13.aBoolean9 && local80 <= Static4.anInt95 && Static121.anInt2740 >= local82 && Static4.anInt95 < local78 && Static121.anInt2740 < local84) {
							for (@Pc(194) Class2_Sub4 local194 = (Class2_Sub4) Static169.aClass19_16.method691(); local194 != null; local194 = (Class2_Sub4) Static169.aClass19_16.method686()) {
								if (local194.aBoolean29) {
									local194.method3254();
								}
							}
							for (@Pc(216) Class2_Sub4 local216 = (Class2_Sub4) Static48.aClass19_1.method691(); local216 != null; local216 = (Class2_Sub4) Static48.aClass19_1.method686()) {
								if (local216.aBoolean29) {
									local216.method3254();
								}
							}
							Static147.aBoolean187 = false;
							if (Static207.anInt4082 == 0) {
								Static73.aClass5_9 = null;
								Static106.aClass5_12 = null;
							}
						}
					}
					if (local13.aBoolean7) {
						@Pc(267) boolean local267;
						if (local80 <= Static4.anInt95 && Static121.anInt2740 >= local82 && Static4.anInt95 < local78 && local84 > Static121.anInt2740) {
							local267 = true;
						} else {
							local267 = false;
						}
						@Pc(273) boolean local273 = false;
						if (Static36.anInt939 == 1 && local267) {
							local273 = true;
						}
						@Pc(284) boolean local284 = false;
						if (Static61.anInt1502 == 1 && local80 <= Static59.anInt1446 && local82 <= Static153.anInt3298 && local78 > Static59.anInt1446 && local84 > Static153.anInt3298) {
							local284 = true;
						}
						if (local284) {
							Static40.method797(local13, Static153.anInt3298 - local63, Static59.anInt1446 + -local58);
						}
						if (Static73.aClass5_9 != null && Static73.aClass5_9 != local13 && local267 && Static5.method92(Static138.method2242(local13))) {
							Static22.aClass5_4 = local13;
						}
						if (local13 == Static106.aClass5_12) {
							Static18.anInt2016 = local58;
							Static71.aBoolean89 = true;
							Static172.anInt3536 = local63;
						}
						if (local13.aBoolean14 || local13.anInt180 != 0) {
							@Pc(361) Class2_Sub4 local361;
							if (local267 && Static27.anInt1416 != 0 && local13.anObjectArray13 != null) {
								local361 = new Class2_Sub4();
								local361.aBoolean29 = true;
								local361.anInt538 = Static27.anInt1416;
								local361.aClass5_3 = local13;
								local361.anObjectArray27 = local13.anObjectArray13;
								Static169.aClass19_16.method684(local361);
							}
							if (Static73.aClass5_9 != null || Static124.aClass5_14 != null || Static159.aBoolean152 || local13.anInt180 != 1400 && Static147.aBoolean187) {
								local273 = false;
								local267 = false;
								local284 = false;
							}
							if (local13.anInt180 == 1337) {
								Static121.method2085(local13);
								continue;
							}
							if (local13.anInt180 == 1338) {
								if (local284) {
									Static38.method763(Static59.anInt1446 - local58, -local63 + Static153.anInt3298, local13);
								}
								continue;
							}
							@Pc(486) int local486;
							@Pc(462) int local462;
							if (local13.anInt180 == 1400) {
								Static42.aClass5_8 = local13;
								if (local284) {
									if (Static71.aBooleanArray10[82] && Static156.anInt4250 > 0) {
										local462 = Static154.anInt3114 + (int) ((double) (Static59.anInt1446 - local58 - local13.anInt157 / 2) * 2.0D / Static131.aDouble11) + Static143.anInt3007;
										local486 = Static177.anInt3615 + Static57.anInt1431 - (int) ((double) (Static153.anInt3298 - local63 - local13.anInt100 / 2) * 2.0D / Static131.aDouble11) - Static62.anInt1512;
										@Pc(539) Class83 local539 = Static67.method1268(new Class83[] { Static109.aClass83_746, Static129.method2179(local462 >> 6), Static49.aClass83_385, Static129.method2179(local486 >> 6), Static49.aClass83_385, Static129.method2179(local462 & 0x3F), Static49.aClass83_385, Static129.method2179(local486 & 0x3F) });
										local539.method2390();
										Static193.method2905(local539);
										Static186.method2833();
										continue;
									}
									Static147.aBoolean187 = true;
									Static173.anInt3551 = Static62.anInt1512;
									Static204.anInt4027 = Static143.anInt3007;
									Static207.anInt4084 = Static121.anInt2740;
									Static131.anInt2840 = Static4.anInt95;
									continue;
								}
								if (local273 && Static147.aBoolean187) {
									Static100.method1733(Static204.anInt4027 + (int) ((double) (Static131.anInt2840 - Static4.anInt95) * 2.0D / Static49.aDouble10));
									Static158.method2446(Static173.anInt3551 + (int) ((double) (Static207.anInt4084 - Static121.anInt2740) * 2.0D / Static49.aDouble10));
									continue;
								}
								Static147.aBoolean187 = false;
								continue;
							}
							if (local13.anInt180 == 1401) {
								if (local273) {
									Static14.method1780(local13.anInt157, local13.anInt100, Static4.anInt95 - local58, -local63 + Static121.anInt2740);
								}
								continue;
							}
							if (!local13.aBoolean5 && local284) {
								local13.aBoolean5 = true;
								if (local13.anObjectArray24 != null) {
									local361 = new Class2_Sub4();
									local361.aClass5_3 = local13;
									local361.anInt538 = Static153.anInt3298 - local63;
									local361.anInt542 = Static59.anInt1446 - local58;
									local361.anObjectArray27 = local13.anObjectArray24;
									local361.aBoolean29 = true;
									Static169.aClass19_16.method684(local361);
								}
							}
							if (local13.aBoolean5 && local273 && local13.anObjectArray25 != null) {
								local361 = new Class2_Sub4();
								local361.anInt542 = Static4.anInt95 - local58;
								local361.aBoolean29 = true;
								local361.aClass5_3 = local13;
								local361.anObjectArray27 = local13.anObjectArray25;
								local361.anInt538 = Static121.anInt2740 - local63;
								Static169.aClass19_16.method684(local361);
							}
							if (local13.aBoolean5 && !local273) {
								local13.aBoolean5 = false;
								if (local13.anObjectArray1 != null) {
									local361 = new Class2_Sub4();
									local361.anInt538 = Static121.anInt2740 - local63;
									local361.anObjectArray27 = local13.anObjectArray1;
									local361.anInt542 = Static4.anInt95 - local58;
									local361.aClass5_3 = local13;
									local361.aBoolean29 = true;
									Static48.aClass19_1.method684(local361);
								}
							}
							if (local273 && local13.anObjectArray14 != null) {
								local361 = new Class2_Sub4();
								local361.anObjectArray27 = local13.anObjectArray14;
								local361.anInt538 = Static121.anInt2740 - local63;
								local361.aBoolean29 = true;
								local361.aClass5_3 = local13;
								local361.anInt542 = Static4.anInt95 - local58;
								Static169.aClass19_16.method684(local361);
							}
							if (!local13.aBoolean8 && local267) {
								local13.aBoolean8 = true;
								if (local13.anObjectArray7 != null) {
									local361 = new Class2_Sub4();
									local361.aBoolean29 = true;
									local361.anObjectArray27 = local13.anObjectArray7;
									local361.anInt542 = Static4.anInt95 - local58;
									local361.aClass5_3 = local13;
									local361.anInt538 = Static121.anInt2740 - local63;
									Static169.aClass19_16.method684(local361);
								}
							}
							if (local13.aBoolean8 && local267 && local13.anObjectArray2 != null) {
								local361 = new Class2_Sub4();
								local361.anInt542 = Static4.anInt95 - local58;
								local361.anInt538 = Static121.anInt2740 - local63;
								local361.aBoolean29 = true;
								local361.aClass5_3 = local13;
								local361.anObjectArray27 = local13.anObjectArray2;
								Static169.aClass19_16.method684(local361);
							}
							if (local13.aBoolean8 && !local267) {
								local13.aBoolean8 = false;
								if (local13.anObjectArray19 != null) {
									local361 = new Class2_Sub4();
									local361.anInt542 = Static4.anInt95 - local58;
									local361.aClass5_3 = local13;
									local361.anInt538 = Static121.anInt2740 - local63;
									local361.aBoolean29 = true;
									local361.anObjectArray27 = local13.anObjectArray19;
									Static48.aClass19_1.method684(local361);
								}
							}
							if (local13.anObjectArray6 != null) {
								local361 = new Class2_Sub4();
								local361.aClass5_3 = local13;
								local361.anObjectArray27 = local13.anObjectArray6;
								Static152.aClass19_13.method684(local361);
							}
							@Pc(948) int local948;
							@Pc(960) Class2_Sub4 local960;
							if (local13.anObjectArray8 != null && local13.anInt135 < Static43.anInt1135) {
								if (local13.anIntArray11 == null || Static43.anInt1135 - local13.anInt135 > 32) {
									local361 = new Class2_Sub4();
									local361.anObjectArray27 = local13.anObjectArray8;
									local361.aClass5_3 = local13;
									Static169.aClass19_16.method684(local361);
								} else {
									label426: for (local462 = local13.anInt135; local462 < Static43.anInt1135; local462++) {
										local486 = Static101.anIntArray227[local462 & 0x1F];
										for (local948 = 0; local948 < local13.anIntArray11.length; local948++) {
											if (local486 == local13.anIntArray11[local948]) {
												local960 = new Class2_Sub4();
												local960.aClass5_3 = local13;
												local960.anObjectArray27 = local13.anObjectArray8;
												Static169.aClass19_16.method684(local960);
												break label426;
											}
										}
									}
								}
								local13.anInt135 = Static43.anInt1135;
							}
							if (local13.anObjectArray9 != null && Static194.anInt3844 > local13.anInt127) {
								if (local13.anIntArray12 == null || Static194.anInt3844 - local13.anInt127 > 32) {
									local361 = new Class2_Sub4();
									local361.anObjectArray27 = local13.anObjectArray9;
									local361.aClass5_3 = local13;
									Static169.aClass19_16.method684(local361);
								} else {
									label402: for (local462 = local13.anInt127; local462 < Static194.anInt3844; local462++) {
										local486 = Static123.anIntArray275[local462 & 0x1F];
										for (local948 = 0; local948 < local13.anIntArray12.length; local948++) {
											if (local13.anIntArray12[local948] == local486) {
												local960 = new Class2_Sub4();
												local960.aClass5_3 = local13;
												local960.anObjectArray27 = local13.anObjectArray9;
												Static169.aClass19_16.method684(local960);
												break label402;
											}
										}
									}
								}
								local13.anInt127 = Static194.anInt3844;
							}
							if (local13.anObjectArray21 != null && local13.anInt163 < Static208.anInt4117) {
								if (local13.anIntArray13 == null || Static208.anInt4117 - local13.anInt163 > 32) {
									local361 = new Class2_Sub4();
									local361.anObjectArray27 = local13.anObjectArray21;
									local361.aClass5_3 = local13;
									Static169.aClass19_16.method684(local361);
								} else {
									label378: for (local462 = local13.anInt163; local462 < Static208.anInt4117; local462++) {
										local486 = Static96.anIntArray204[local462 & 0x1F];
										for (local948 = 0; local948 < local13.anIntArray13.length; local948++) {
											if (local13.anIntArray13[local948] == local486) {
												local960 = new Class2_Sub4();
												local960.anObjectArray27 = local13.anObjectArray21;
												local960.aClass5_3 = local13;
												Static169.aClass19_16.method684(local960);
												break label378;
											}
										}
									}
								}
								local13.anInt163 = Static208.anInt4117;
							}
							if (Static166.anInt3429 > local13.anInt181 && local13.anObjectArray3 != null) {
								local361 = new Class2_Sub4();
								local361.anObjectArray27 = local13.anObjectArray3;
								local361.aClass5_3 = local13;
								Static169.aClass19_16.method684(local361);
							}
							if (local13.anInt181 < Static38.anInt976 && local13.anObjectArray17 != null) {
								local361 = new Class2_Sub4();
								local361.anObjectArray27 = local13.anObjectArray17;
								local361.aClass5_3 = local13;
								Static169.aClass19_16.method684(local361);
							}
							if (local13.anInt181 < Static214.anInt4261 && local13.anObjectArray5 != null) {
								local361 = new Class2_Sub4();
								local361.aClass5_3 = local13;
								local361.anObjectArray27 = local13.anObjectArray5;
								Static169.aClass19_16.method684(local361);
							}
							if (local13.anInt181 < Static128.anInt2815 && local13.anObjectArray15 != null) {
								local361 = new Class2_Sub4();
								local361.anObjectArray27 = local13.anObjectArray15;
								local361.aClass5_3 = local13;
								Static169.aClass19_16.method684(local361);
							}
							if (local13.anInt181 < Static199.anInt3947 && local13.anObjectArray22 != null) {
								local361 = new Class2_Sub4();
								local361.anObjectArray27 = local13.anObjectArray22;
								local361.aClass5_3 = local13;
								Static169.aClass19_16.method684(local361);
							}
							local13.anInt181 = Static29.anInt739;
							if (local13.anObjectArray20 != null) {
								for (local462 = 0; local462 < Static49.anInt1267; local462++) {
									@Pc(1329) Class2_Sub4 local1329 = new Class2_Sub4();
									local1329.aClass5_3 = local13;
									local1329.anInt543 = Static32.anIntArray66[local462];
									local1329.anInt541 = Static152.anIntArray302[local462];
									local1329.anObjectArray27 = local13.anObjectArray20;
									Static169.aClass19_16.method684(local1329);
								}
							}
						}
					}
					if (!local13.aBoolean7 && Static73.aClass5_9 == null && Static124.aClass5_14 == null && !Static159.aBoolean152) {
						if ((local13.anInt156 >= 0 || local13.anInt134 != 0) && local80 <= Static4.anInt95 && local82 <= Static121.anInt2740 && Static4.anInt95 < local78 && Static121.anInt2740 < local84) {
							if (local13.anInt156 >= 0) {
								Static135.aClass5_16 = arg2[local13.anInt156];
							} else {
								Static135.aClass5_16 = local13;
							}
						}
						if (local13.anInt130 == 8 && local80 <= Static4.anInt95 && local82 <= Static121.anInt2740 && local78 > Static4.anInt95 && Static121.anInt2740 < local84) {
							Static114.aClass5_15 = local13;
						}
						if (local13.anInt100 < local13.anInt114) {
							Static152.method2356(local13.anInt100, local13, Static121.anInt2740, local13.anInt157 + local58, local13.anInt114, local63, Static4.anInt95);
						}
					}
					if (local13.anInt130 == 0) {
						method1446(local78, local80, arg2, local13.anInt159, local58 - local13.anInt99, -local13.anInt125 + local63, local82, local84);
						if (local13.aClass5Array1 != null) {
							method1446(local78, local80, local13.aClass5Array1, local13.anInt159, local58 - local13.anInt99, -local13.anInt125 + local63, local82, local84);
						}
						@Pc(1520) Class2_Sub13 local1520 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local13.anInt159);
						if (local1520 != null) {
							Static56.method1058(local63, local78, local82, local1520.anInt1869, local80, local84, local58);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIZ)V")
	public static void method1447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub22 local12 = (Class2_Sub22) Static135.aClass63_10.method2110((long) arg3);
		if (local12 == null) {
			local12 = new Class2_Sub22();
			Static135.aClass63_10.method2115((long) arg3, local12);
		}
		if (arg1 >= local12.anIntArray307.length) {
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(44) int[] local44 = new int[arg1 + 1];
			for (@Pc(46) int local46 = 0; local46 < local12.anIntArray307.length; local46++) {
				local39[local46] = local12.anIntArray307[local46];
				local44[local46] = local12.anIntArray306[local46];
			}
			for (@Pc(76) int local76 = local12.anIntArray307.length; local76 < arg1; local76++) {
				local39[local76] = -1;
				local44[local76] = 0;
			}
			local12.anIntArray307 = local39;
			local12.anIntArray306 = local44;
		}
		local12.anIntArray307[arg1] = arg0;
		local12.anIntArray306[arg1] = arg2;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
	public static void method1449() {
		for (@Pc(7) int local7 = 0; local7 < Static194.anInt3846; local7++) {
			@Pc(13) int local13 = anIntArray170[local7]--;
			if (anIntArray170[local7] >= -10) {
				@Pc(86) Class90 local86 = Static86.aClass90Array1[local7];
				if (local86 == null) {
					local86 = Static224.method2701(Static137.aClass28_Sub1_21, Static129.anIntArray283[local7], 0);
					if (local86 == null) {
						continue;
					}
					anIntArray170[local7] += local86.method2698();
					Static86.aClass90Array1[local7] = local86;
				}
				if (anIntArray170[local7] < 0) {
					@Pc(208) int local208;
					if (Static201.anIntArray392[local7] == 0) {
						local208 = Static132.anInt2855;
					} else {
						@Pc(127) int local127 = (Static201.anIntArray392[local7] & 0xFF) * 128;
						@Pc(135) int local135 = Static201.anIntArray392[local7] >> 16 & 0xFF;
						@Pc(145) int local145 = local135 * 128 + 64 - Static54.aClass24_Sub4_Sub1_1.anInt3316;
						if (local145 < 0) {
							local145 = -local145;
						}
						@Pc(158) int local158 = Static201.anIntArray392[local7] >> 8 & 0xFF;
						@Pc(168) int local168 = local158 * 128 + 64 - Static54.aClass24_Sub4_Sub1_1.anInt3349;
						if (local168 < 0) {
							local168 = -local168;
						}
						@Pc(182) int local182 = local145 + local168 - 128;
						if (local127 < local182) {
							anIntArray170[local7] = -100;
							continue;
						}
						if (local182 < 0) {
							local182 = 0;
						}
						local208 = Static89.anInt4291 * (local127 - local182) / local127;
					}
					if (local208 > 0) {
						@Pc(219) Class2_Sub6_Sub1 local219 = local86.method2699().method451(Static15.aClass88_1);
						@Pc(224) Class2_Sub9_Sub2 local224 = Static219.method1329(local219, local208);
						local224.method1344(Static140.anIntArray293[local7] - 1);
						Static34.aClass2_Sub9_Sub4_1.method2476(local224);
					}
					anIntArray170[local7] = -100;
				}
			} else {
				Static194.anInt3846--;
				for (@Pc(29) int local29 = local7; local29 < Static194.anInt3846; local29++) {
					Static129.anIntArray283[local29] = Static129.anIntArray283[local29 + 1];
					Static86.aClass90Array1[local29] = Static86.aClass90Array1[local29 + 1];
					Static140.anIntArray293[local29] = Static140.anIntArray293[local29 + 1];
					anIntArray170[local29] = anIntArray170[local29 + 1];
					Static201.anIntArray392[local29] = Static201.anIntArray392[local29 + 1];
				}
				local7--;
			}
		}
		if (Static125.aBoolean136 && !Static173.method2669()) {
			if (Static112.anInt1949 != 0 && Static118.anInt2711 != -1) {
				Static3.method62(Static118.anInt2711, Static157.aClass28_Sub1_23, Static112.anInt1949);
			}
			Static125.aBoolean136 = false;
		} else if (Static112.anInt1949 != 0 && Static118.anInt2711 != -1 && !Static173.method2669()) {
			Static69.aClass2_Sub3_Sub1_2.method284(201);
			Static69.aClass2_Sub3_Sub1_2.method246(Static118.anInt2711);
			Static118.anInt2711 = -1;
		}
	}
}
