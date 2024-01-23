import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt4169;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public static int anInt4179;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "[I")
	public static int[] anIntArray377;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Z")
	public static boolean aBoolean321 = true;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I")
	public static int method3318() {
		return Static205.aClass135_23.method3323();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!km;BLclient!mk;Lclient!km;)V")
	public static void method3322(@OriginalArg(0) Class91 arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) Class91 arg2) {
		Static19.aClass91_18 = arg0;
		Static166.aClass91_134 = arg2;
		Static109.anInterface3_1 = arg1;
		if (Static19.aClass91_18 != null) {
			Static147.anInt3197 = Static19.aClass91_18.method2510(1);
		}
		if (Static166.aClass91_134 != null) {
			Static232.anInt4573 = Static166.aClass91_134.method2510(1);
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I")
	public static int method3325() {
		return ((Static119.anInt2761 == 0 ? 0 : 1) << 22) + ((Static127.anInt2836 == 0 ? 0 : 1) << 20) + ((Static236.aBoolean353 ? 1 : 0) << 15) + ((Static199.aBoolean308 ? 1 : 0) << 10) + ((Static276.aBoolean217 ? 1 : 0) << 6) + ((Static116.aBoolean450 ? 1 : 0) << 5) + ((Static223.aBoolean343 ? 1 : 0) << 4) + (Static285.anInt5431 & 0x7) + ((Static278.aBoolean421 ? 1 : 0) << 3) + ((aBoolean321 ? 1 : 0) << 7) + ((Static200.aBoolean310 ? 1 : 0) << 8) + ((Static23.aBoolean37 ? 1 : 0) << 9) + ((Static262.anInt5132 & 0x3) << 11) + ((Static188.aBoolean295 ? 1 : 0) << 13) + ((Static129.aBoolean213 ? 1 : 0) << 16) + (Static214.anInt4259 << 17) + ((Static147.aBoolean236 ? 1 : 0) << 19) + ((Static184.anInt3815 == 0 ? 0 : 1) << 21) + (Static235.method3620() << 23);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)V")
	public static void method3326(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static49.anInt1128 >= 100 && !Static33.aBoolean56 || Static49.anInt1128 >= 200) {
			Static196.method1924(0, Static101.aString138, "");
			return;
		}
		@Pc(30) String local30 = Static24.method3641(arg0);
		@Pc(32) int local32;
		for (local32 = 0; local32 < Static49.anInt1128; local32++) {
			if (Static298.aLongArray11[local32] == arg0) {
				Static196.method1924(0, local30 + Static64.aString81, "");
				return;
			}
		}
		for (local32 = 0; local32 < Static148.anInt3198; local32++) {
			if (Static255.aLongArray8[local32] == arg0) {
				Static196.method1924(0, Static47.aString64 + local30 + Static190.aString232, "");
				return;
			}
		}
		if (local30.equals(Static197.aClass14_Sub2_Sub1_2.aString99)) {
			Static196.method1924(0, Static59.aString235, "");
			return;
		}
		Static149.aStringArray43[Static49.anInt1128] = local30;
		Static298.aLongArray11[Static49.anInt1128] = arg0;
		Static117.anIntArray242[Static49.anInt1128] = 0;
		Static59.aStringArray51[Static49.anInt1128] = "";
		Static100.anIntArray211[Static49.anInt1128] = 0;
		Static15.aBooleanArray7[Static49.anInt1128] = false;
		Static67.anInt1414 = Static23.anInt471;
		Static49.anInt1128++;
		Static283.aClass1_Sub11_Sub1_3.method2697(158);
		Static283.aClass1_Sub11_Sub1_3.method2673(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!pi;Z)V")
	public static void method3327(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) boolean arg1) {
		Static250.aClass61_26.method1839(arg0);
		while (true) {
			@Pc(8) Class1_Sub26 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class1_Sub26[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class1_Sub26 local153;
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
										@Pc(363) Class72 var22;
										@Pc(469) boolean var24;
										@Pc(425) Class25 var25;
										@Pc(1179) Class1_Sub26 var32;
										while (true) {
											do {
												local8 = (Class1_Sub26) Static250.aClass61_26.method1850();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean314);
											local18 = local8.anInt4091;
											local21 = local8.anInt4094;
											local24 = local8.anInt4097;
											local27 = local8.anInt4101;
											local31 = Static74.aClass1_Sub26ArrayArrayArray1[local24];
											@Pc(33) float local33 = 0.0F;
											if (Static277.aBoolean412) {
												if (Static255.anIntArrayArrayArray12 == Static55.anIntArrayArrayArray3) {
													var9 = Static242.anIntArrayArray31[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static7.anInt2288) {
														Static7.anInt2288 = var10;
														Static92.method1621(var10);
														Static28.method556(Static111.method2042());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static287.anInt5491) {
														Static287.anInt5491 = local65;
														Static17.method3925(local65);
													}
													local115 = Static108.anIntArrayArrayArray7[0][local18][local21] + Static108.anIntArrayArrayArray7[0][local18 + 1][local21] + Static108.anIntArrayArrayArray7[0][local18][local21 + 1] + Static108.anIntArrayArrayArray7[0][local18 + 1][local21 + 1] >> 2;
													Static123.method2162(-local115, 3);
													local33 = 201.5F;
													Static277.method4221(local33);
												} else {
													local33 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static277.method4221(local33);
												}
											}
											if (!local8.aBoolean313) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static74.aClass1_Sub26ArrayArrayArray1[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean314) {
														continue;
													}
												}
												if (local18 <= Static186.anInt3849 && local18 > Static161.anInt3459) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean314 && (local153.aBoolean313 || (local8.anInt4088 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static186.anInt3849 && local18 < Static30.anInt3246 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean314 && (local153.aBoolean313 || (local8.anInt4088 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static204.anInt4137 && local21 > Static172.anInt3652) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean314 && (local153.aBoolean313 || (local8.anInt4088 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static204.anInt4137 && local21 < Static152.anInt3232 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean314 && (local153.aBoolean313 || (local8.anInt4088 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean313 = false;
											if (local8.aClass1_Sub26_1 != null) {
												local153 = local8.aClass1_Sub26_1;
												if (Static277.aBoolean412) {
													Static277.method4221(201.5F - (float) (local153.anInt4101 + 1) * 50.0F);
												}
												if (local153.aClass110_1 == null) {
													if (local153.aClass172_1 != null) {
														if (Static220.method3471(0, local18, local21)) {
															Static162.method2798(local153.aClass172_1, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local18, local21, true);
														} else {
															Static162.method2798(local153.aClass172_1, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local18, local21, false);
														}
													}
												} else if (Static220.method3471(0, local18, local21)) {
													Static118.method2115(local153.aClass110_1, 0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local18, local21, true);
												} else {
													Static118.method2115(local153.aClass110_1, 0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local18, local21, false);
												}
												var22 = local153.aClass72_1;
												if (var22 != null) {
													if (Static277.aBoolean412) {
														if ((var22.anInt2731 & local8.anInt4092) == 0) {
															Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
														} else {
															Static120.method2144(var22.anInt2731, Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local27, local18, local21);
														}
													}
													var22.aClass14_10.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, var22.anInt2734 - Static215.anInt4270, var22.anInt2739 - Static197.anInt4046, var22.anInt2732 - Static273.anInt5322, var22.aLong105, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt4090; local65++) {
													var25 = local153.aClass25Array4[local65];
													if (var25 != null) {
														if (Static277.aBoolean412) {
															Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
														}
														var25.aClass14_1.method4097(var25.anInt1010, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, var25.anInt1009 - Static215.anInt4270, var25.anInt1005 - Static197.anInt4046, var25.anInt1011 - Static273.anInt5322, var25.aLong39, local24, null);
													}
												}
												if (Static277.aBoolean412) {
													Static277.method4221(local33);
												}
											}
											var24 = false;
											if (local8.aClass110_1 == null) {
												if (local8.aClass172_1 != null) {
													if (Static220.method3471(local27, local18, local21)) {
														Static162.method2798(local8.aClass172_1, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local18, local21, true);
													} else {
														var24 = true;
														Static162.method2798(local8.aClass172_1, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local18, local21, false);
													}
												}
											} else if (Static220.method3471(local27, local18, local21)) {
												Static118.method2115(local8.aClass110_1, local27, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local18, local21, true);
											} else {
												var24 = true;
												if (local8.aClass110_1.anInt3712 != 12345678 || Static88.aBoolean140 && local24 <= Static117.anInt2723) {
													Static118.method2115(local8.aClass110_1, local27, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local18, local21, false);
												}
											}
											if (var24) {
												@Pc(549) Class44 local549 = local8.aClass44_1;
												if (local549 != null && (local549.aLong55 & 0x80000000L) != 0L) {
													if (Static277.aBoolean412 && local549.aBoolean108) {
														Static277.method4221(local33 + 50.0F - 1.5F);
													}
													if (Static277.aBoolean412) {
														Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
													}
													local549.aClass14_6.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local549.anInt1520 - Static215.anInt4270, local549.anInt1521 - Static197.anInt4046, local549.anInt1524 - Static273.anInt5322, local549.aLong55, local24, null);
													if (Static277.aBoolean412 && local549.aBoolean108) {
														Static277.method4221(local33);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class72 local616 = local8.aClass72_1;
											@Pc(619) Class67 local619 = local8.aClass67_1;
											if (local616 != null || local619 != null) {
												if (Static186.anInt3849 == local18) {
													var10++;
												} else if (Static186.anInt3849 < local18) {
													var10 += 2;
												}
												if (Static204.anInt4137 == local21) {
													var10 += 3;
												} else if (Static204.anInt4137 > local21) {
													var10 += 6;
												}
												local65 = Static106.anIntArray215[var10];
												local8.anInt4092 = Static190.anIntArray352[var10];
											}
											if (local616 != null) {
												if ((local616.anInt2731 & Static228.anIntArray401[var10]) == 0) {
													local8.anInt4095 = 0;
												} else if (local616.anInt2731 == 16) {
													local8.anInt4095 = 3;
													local8.anInt4102 = Static92.anIntArray185[var10];
													local8.anInt4087 = 3 - local8.anInt4102;
												} else if (local616.anInt2731 == 32) {
													local8.anInt4095 = 6;
													local8.anInt4102 = Static248.anIntArray432[var10];
													local8.anInt4087 = 6 - local8.anInt4102;
												} else if (local616.anInt2731 == 64) {
													local8.anInt4095 = 12;
													local8.anInt4102 = Static5.anIntArray20[var10];
													local8.anInt4087 = 12 - local8.anInt4102;
												} else {
													local8.anInt4095 = 9;
													local8.anInt4102 = Static200.anIntArray364[var10];
													local8.anInt4087 = 9 - local8.anInt4102;
												}
												if ((local616.anInt2731 & local65) != 0 && !Static176.method2993(local27, local18, local21, local616.anInt2731)) {
													if (Static277.aBoolean412) {
														Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
													}
													local616.aClass14_10.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local616.anInt2734 - Static215.anInt4270, local616.anInt2739 - Static197.anInt4046, local616.anInt2732 - Static273.anInt5322, local616.aLong105, local24, null);
												}
												if ((local616.anInt2740 & local65) != 0 && !Static176.method2993(local27, local18, local21, local616.anInt2740)) {
													if (Static277.aBoolean412) {
														Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
													}
													local616.aClass14_9.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local616.anInt2734 - Static215.anInt4270, local616.anInt2739 - Static197.anInt4046, local616.anInt2732 - Static273.anInt5322, local616.aLong105, local24, null);
												}
											}
											if (local619 != null && !Static55.method1039(local27, local18, local21, local619.aClass14_7.method4091())) {
												if (Static277.aBoolean412) {
													Static277.method4221(local33 - 0.5F);
												}
												if ((local619.anInt2507 & local65) != 0) {
													if (Static277.aBoolean412) {
														Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
													}
													local619.aClass14_7.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local619.anInt2513 + local619.anInt2512 - Static215.anInt4270, local619.anInt2514 - Static197.anInt4046, local619.anInt2508 + local619.anInt2515 - Static273.anInt5322, local619.aLong97, local24, null);
												} else if (local619.anInt2507 == 256) {
													local894 = local619.anInt2513 - Static215.anInt4270;
													local899 = local619.anInt2514 - Static197.anInt4046;
													local904 = local619.anInt2508 - Static273.anInt5322;
													var17 = local619.anInt2517;
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
														if (Static277.aBoolean412) {
															Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
														}
														local619.aClass14_7.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local894 + local619.anInt2512, local899, local904 + local619.anInt2515, local619.aLong97, local24, null);
													} else if (local619.aClass14_8 != null) {
														if (Static277.aBoolean412) {
															Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
														}
														local619.aClass14_8.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local894, local899, local904, local619.aLong97, local24, null);
													}
												}
												if (Static277.aBoolean412) {
													Static277.method4221(local33);
												}
											}
											if (var24) {
												@Pc(1001) Class44 local1001 = local8.aClass44_1;
												if (local1001 != null && (local1001.aLong55 & 0x80000000L) == 0L) {
													if (Static277.aBoolean412 && local1001.aBoolean108) {
														Static277.method4221(local33 + 50.0F - 1.5F);
													}
													if (Static277.aBoolean412) {
														Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
													}
													local1001.aClass14_6.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local1001.anInt1520 - Static215.anInt4270, local1001.anInt1521 - Static197.anInt4046, local1001.anInt1524 - Static273.anInt5322, local1001.aLong55, local24, null);
													if (Static277.aBoolean412 && local1001.aBoolean108) {
														Static277.method4221(local33);
													}
												}
												@Pc(1064) Class31 local1064 = local8.aClass31_1;
												if (local1064 != null && local1064.anInt1118 == 0) {
													if (Static277.aBoolean412) {
														Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
													}
													if (local1064.aClass14_2 != null) {
														local1064.aClass14_2.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local1064.anInt1119 - Static215.anInt4270, local1064.anInt1117 - Static197.anInt4046, local1064.anInt1124 - Static273.anInt5322, local1064.aLong45, local24, null);
													}
													if (local1064.aClass14_3 != null) {
														local1064.aClass14_3.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local1064.anInt1119 - Static215.anInt4270, local1064.anInt1117 - Static197.anInt4046, local1064.anInt1124 - Static273.anInt5322, local1064.aLong45, local24, null);
													}
													if (local1064.aClass14_4 != null) {
														local1064.aClass14_4.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local1064.anInt1119 - Static215.anInt4270, local1064.anInt1117 - Static197.anInt4046, local1064.anInt1124 - Static273.anInt5322, local1064.aLong45, local24, null);
													}
												}
											}
											local894 = local8.anInt4088;
											if (local894 != 0) {
												if (local18 < Static186.anInt3849 && (local894 & 0x4) != 0) {
													var32 = local31[local18 + 1][local21];
													if (var32 != null && var32.aBoolean314) {
														Static250.aClass61_26.method1839(var32);
													}
												}
												if (local21 < Static204.anInt4137 && (local894 & 0x2) != 0) {
													var32 = local31[local18][local21 + 1];
													if (var32 != null && var32.aBoolean314) {
														Static250.aClass61_26.method1839(var32);
													}
												}
												if (local18 > Static186.anInt3849 && (local894 & 0x1) != 0) {
													var32 = local31[local18 - 1][local21];
													if (var32 != null && var32.aBoolean314) {
														Static250.aClass61_26.method1839(var32);
													}
												}
												if (local21 > Static204.anInt4137 && (local894 & 0x8) != 0) {
													var32 = local31[local18][local21 - 1];
													if (var32 != null && var32.aBoolean314) {
														Static250.aClass61_26.method1839(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt4095 != 0) {
											var24 = true;
											for (var10 = 0; var10 < local8.anInt4090; var10++) {
												if (local8.aClass25Array4[var10].anInt1006 != Static107.anInt2499 && (local8.anIntArray366[var10] & local8.anInt4095) == local8.anInt4102) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												var22 = local8.aClass72_1;
												if (!Static176.method2993(local27, local18, local21, var22.anInt2731)) {
													if (Static277.aBoolean412) {
														label882: {
															if ((var22.aLong105 & 0xFC000L) == 16384L) {
																local65 = var22.anInt2734 - Static215.anInt4270;
																local115 = var22.anInt2732 - Static273.anInt5322;
																local1332 = (int) (var22.aLong105 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < anInt4179 - 1) {
																		Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18 - 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static158.anInt3404 - 1 && local21 < anInt4179 - 1) {
																		Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18 + 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static158.anInt3404 - 1 && local21 > 0) {
																		Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18 + 1, local21 - 1);
																		break label882;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18 - 1, local21 - 1);
																		break label882;
																	}
																}
															}
															Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
														}
													}
													var22.aClass14_10.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, var22.anInt2734 - Static215.anInt4270, var22.anInt2739 - Static197.anInt4046, var22.anInt2732 - Static273.anInt5322, var22.aLong105, local24, null);
												}
												local8.anInt4095 = 0;
											}
										}
										if (!local8.aBoolean315) {
											break;
										}
										try {
											var9 = local8.anInt4090;
											local8.aBoolean315 = false;
											var10 = 0;
											label767: for (local65 = 0; local65 < var9; local65++) {
												var25 = local8.aClass25Array4[local65];
												if (var25.anInt1006 != Static107.anInt2499) {
													for (local1332 = var25.anInt1003; local1332 <= var25.anInt1004; local1332++) {
														for (local894 = var25.anInt1000; local894 <= var25.anInt999; local894++) {
															var32 = local31[local1332][local894];
															if (var32.aBoolean313) {
																local8.aBoolean315 = true;
																continue label767;
															}
															if (var32.anInt4095 != 0) {
																local904 = 0;
																if (local1332 > var25.anInt1003) {
																	local904++;
																}
																if (local1332 < var25.anInt1004) {
																	local904 += 4;
																}
																if (local894 > var25.anInt1000) {
																	local904 += 8;
																}
																if (local894 < var25.anInt999) {
																	local904 += 2;
																}
																if ((local904 & var32.anInt4095) == local8.anInt4087) {
																	local8.aBoolean315 = true;
																	continue label767;
																}
															}
														}
													}
													Static35.aClass25Array3[var10++] = var25;
													local1332 = Static186.anInt3849 - var25.anInt1003;
													local894 = var25.anInt1004 - Static186.anInt3849;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static204.anInt4137 - var25.anInt1000;
													local904 = var25.anInt999 - Static204.anInt4137;
													if (local904 > local899) {
														var25.anInt1001 = local1332 + local904;
													} else {
														var25.anInt1001 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class25 local1628 = Static35.aClass25Array3[local1332];
													if (local1628.anInt1006 != Static107.anInt2499) {
														if (local1628.anInt1001 > local65) {
															local65 = local1628.anInt1001;
															local115 = local1332;
														} else if (local1628.anInt1001 == local65) {
															local899 = local1628.anInt1009 - Static215.anInt4270;
															local904 = local1628.anInt1011 - Static273.anInt5322;
															var17 = Static35.aClass25Array3[local115].anInt1009 - Static215.anInt4270;
															var18 = Static35.aClass25Array3[local115].anInt1011 - Static273.anInt5322;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class25 local1697 = Static35.aClass25Array3[local115];
												local1697.anInt1006 = Static107.anInt2499;
												if (!Static279.method4237(local27, local1697.anInt1003, local1697.anInt1004, local1697.anInt1000, local1697.anInt999, local1697.aClass14_1.method4091())) {
													if (Static277.aBoolean412) {
														if ((local1697.aLong39 & 0xFC000L) == 147456L) {
															Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
															local894 = local1697.anInt1009 - Static215.anInt4270;
															local899 = local1697.anInt1011 - Static273.anInt5322;
															local904 = (int) (local1697.aLong39 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static120.method2131(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static120.method2131(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static120.method2131(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static120.method2131(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static120.method2143(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local1697.anInt1003, local1697.anInt1000, local1697.anInt1004, local1697.anInt999);
														}
													}
													local1697.aClass14_1.method4097(local1697.anInt1010, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local1697.anInt1009 - Static215.anInt4270, local1697.anInt1005 - Static197.anInt4046, local1697.anInt1011 - Static273.anInt5322, local1697.aLong39, local24, null);
												}
												for (local894 = local1697.anInt1003; local894 <= local1697.anInt1004; local894++) {
													for (local899 = local1697.anInt1000; local899 <= local1697.anInt999; local899++) {
														@Pc(1863) Class1_Sub26 local1863 = local31[local894][local899];
														if (local1863.anInt4095 != 0) {
															Static250.aClass61_26.method1839(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean314) {
															Static250.aClass61_26.method1839(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean315) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean315 = false;
											break;
										}
									}
								} while (!local8.aBoolean314);
							} while (local8.anInt4095 != 0);
							if (local18 > Static186.anInt3849 || local18 <= Static161.anInt3459) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean314);
						if (local18 < Static186.anInt3849 || local18 >= Static30.anInt3246 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean314);
					if (local21 > Static204.anInt4137 || local21 <= Static172.anInt3652) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean314);
				if (local21 < Static204.anInt4137 || local21 >= Static152.anInt3232 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean314);
			local8.aBoolean314 = false;
			Static172.anInt3657--;
			@Pc(1999) Class31 local1999 = local8.aClass31_1;
			if (local1999 != null && local1999.anInt1118 != 0) {
				if (Static277.aBoolean412) {
					Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
				}
				if (local1999.aClass14_2 != null) {
					local1999.aClass14_2.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local1999.anInt1119 - Static215.anInt4270, local1999.anInt1117 - Static197.anInt4046 - local1999.anInt1118, local1999.anInt1124 - Static273.anInt5322, local1999.aLong45, local24, null);
				}
				if (local1999.aClass14_3 != null) {
					local1999.aClass14_3.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local1999.anInt1119 - Static215.anInt4270, local1999.anInt1117 - Static197.anInt4046 - local1999.anInt1118, local1999.anInt1124 - Static273.anInt5322, local1999.aLong45, local24, null);
				}
				if (local1999.aClass14_4 != null) {
					local1999.aClass14_4.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local1999.anInt1119 - Static215.anInt4270, local1999.anInt1117 - Static197.anInt4046 - local1999.anInt1118, local1999.anInt1124 - Static273.anInt5322, local1999.aLong45, local24, null);
				}
			}
			if (local8.anInt4092 != 0) {
				@Pc(2109) Class67 local2109 = local8.aClass67_1;
				if (local2109 != null && !Static55.method1039(local27, local18, local21, local2109.aClass14_7.method4091())) {
					if ((local2109.anInt2507 & local8.anInt4092) != 0) {
						if (Static277.aBoolean412) {
							Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
						}
						local2109.aClass14_7.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local2109.anInt2513 + local2109.anInt2512 - Static215.anInt4270, local2109.anInt2514 - Static197.anInt4046, local2109.anInt2508 + local2109.anInt2515 - Static273.anInt5322, local2109.aLong97, local24, null);
					} else if (local2109.anInt2507 == 256) {
						local65 = local2109.anInt2513 - Static215.anInt4270;
						local115 = local2109.anInt2514 - Static197.anInt4046;
						local1332 = local2109.anInt2508 - Static273.anInt5322;
						local894 = local2109.anInt2517;
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
							if (Static277.aBoolean412) {
								Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
							}
							local2109.aClass14_7.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local65 + local2109.anInt2512, local115, local1332 + local2109.anInt2515, local2109.aLong97, local24, null);
						} else if (local2109.aClass14_8 != null) {
							if (Static277.aBoolean412) {
								Static120.method2134(Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local24, local18, local21);
							}
							local2109.aClass14_8.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local65, local115, local1332, local2109.aLong97, local24, null);
						}
					}
				}
				@Pc(2275) Class72 local2275 = local8.aClass72_1;
				if (local2275 != null) {
					if ((local2275.anInt2740 & local8.anInt4092) != 0 && !Static176.method2993(local27, local18, local21, local2275.anInt2740)) {
						if (Static277.aBoolean412) {
							Static120.method2144(local2275.anInt2740, Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local27, local18, local21);
						}
						local2275.aClass14_9.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local2275.anInt2734 - Static215.anInt4270, local2275.anInt2739 - Static197.anInt4046, local2275.anInt2732 - Static273.anInt5322, local2275.aLong105, local24, null);
					}
					if ((local2275.anInt2731 & local8.anInt4092) != 0 && !Static176.method2993(local27, local18, local21, local2275.anInt2731)) {
						if (Static277.aBoolean412) {
							Static120.method2144(local2275.anInt2731, Static215.anInt4270, Static197.anInt4046, Static273.anInt5322, local27, local18, local21);
						}
						local2275.aClass14_10.method4097(0, Static112.anInt2572, Static47.anInt1116, Static26.anInt629, Static140.anInt3030, local2275.anInt2734 - Static215.anInt4270, local2275.anInt2739 - Static197.anInt4046, local2275.anInt2732 - Static273.anInt5322, local2275.aLong105, local24, null);
					}
				}
			}
			@Pc(2388) Class1_Sub26 local2388;
			if (local24 < Static169.anInt3625 - 1) {
				local2388 = Static74.aClass1_Sub26ArrayArrayArray1[local24 + 1][local18][local21];
				if (local2388 != null && local2388.aBoolean314) {
					Static250.aClass61_26.method1839(local2388);
				}
			}
			if (local18 < Static186.anInt3849) {
				local2388 = local31[local18 + 1][local21];
				if (local2388 != null && local2388.aBoolean314) {
					Static250.aClass61_26.method1839(local2388);
				}
			}
			if (local21 < Static204.anInt4137) {
				local2388 = local31[local18][local21 + 1];
				if (local2388 != null && local2388.aBoolean314) {
					Static250.aClass61_26.method1839(local2388);
				}
			}
			if (local18 > Static186.anInt3849) {
				local2388 = local31[local18 - 1][local21];
				if (local2388 != null && local2388.aBoolean314) {
					Static250.aClass61_26.method1839(local2388);
				}
			}
			if (local21 > Static204.anInt4137) {
				local2388 = local31[local18][local21 - 1];
				if (local2388 != null && local2388.aBoolean314) {
					Static250.aClass61_26.method1839(local2388);
				}
			}
		}
	}
}
