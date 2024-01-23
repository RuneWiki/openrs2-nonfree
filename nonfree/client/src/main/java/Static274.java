import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!um", name = "w", descriptor = "I")
	public static int anInt5476;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "Lclient!db;")
	public static Class31 aClass31_40 = new Class31(2);

	@OriginalMember(owner = "client!um", name = "f", descriptor = "I")
	public static int anInt5464 = -1;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "I")
	public static int anInt5470 = 0;

	@OriginalMember(owner = "client!um", name = "r", descriptor = "[Lclient!bk;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array4 = new Class1_Sub2_Sub4[14];

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	public static void method4188(@OriginalArg(1) int arg0) {
		if (arg0 == Static68.anInt4744) {
			@Pc(21) Interface1 local21 = Static267.anInterface1Array1[arg0];
			local21.method4329(Static44.anInt990);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method4192(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static127.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static18.aClass163_1);
		arg0.addFocusListener(Static18.aClass163_1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIB)V")
	public static void method4193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static73.anInt1433 == 0 || arg0 == 0 || Static25.anInt2862 >= 50 || arg2 == -1) {
			return;
		}
		Static55.anIntArray139[Static25.anInt2862] = arg2;
		Static237.anIntArray360[Static25.anInt2862] = arg0;
		Static207.anIntArray471[Static25.anInt2862] = arg1;
		Static221.aClass44Array1[Static25.anInt2862] = null;
		Static93.anIntArray237[Static25.anInt2862] = 0;
		Static282.anIntArray689[Static25.anInt2862] = arg3;
		Static25.anInt2862++;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIZ)V")
	public static void method4196(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static44.anInt996 = 104;
		Static14.anInt369 = 104;
		Static167.anInt3094 = arg0;
		Static191.aClass1_Sub19ArrayArrayArray2 = new Class1_Sub19[4][Static44.anInt996][Static14.anInt369];
		Static152.anIntArrayArrayArray11 = new int[4][Static44.anInt996 + 1][Static14.anInt369 + 1];
		if (Static240.aBoolean369) {
			Static32.aClass1_Sub25ArrayArray1 = new Class1_Sub25[4][];
		}
		if (arg1) {
			Static263.aClass1_Sub19ArrayArrayArray3 = new Class1_Sub19[1][Static44.anInt996][Static14.anInt369];
			Static46.anIntArrayArray10 = new int[Static44.anInt996][Static14.anInt369];
			Static165.anIntArrayArrayArray13 = new int[1][Static44.anInt996 + 1][Static14.anInt369 + 1];
			if (Static240.aBoolean369) {
				Static263.aClass1_Sub25ArrayArray3 = new Class1_Sub25[1][];
			}
		} else {
			Static263.aClass1_Sub19ArrayArrayArray3 = null;
			Static46.anIntArrayArray10 = null;
			Static165.anIntArrayArrayArray13 = null;
			Static263.aClass1_Sub25ArrayArray3 = null;
		}
		Static229.method3658(false);
		Static73.aClass114Array1 = new Class114[500];
		Static245.anInt1244 = 0;
		Static174.aClass114Array2 = new Class114[500];
		Static149.anInt2777 = 0;
		Static58.anIntArrayArrayArray7 = new int[4][Static44.anInt996 + 1][Static14.anInt369 + 1];
		Static189.aClass124Array3 = new Class124[5000];
		Static289.anInt5737 = 0;
		Static67.aClass124Array1 = new Class124[100];
		Static217.aBooleanArrayArray10 = new boolean[Static167.anInt3094 + Static167.anInt3094 + 1][Static167.anInt3094 + Static167.anInt3094 + 1];
		Static37.aBooleanArrayArray7 = new boolean[Static167.anInt3094 + Static167.anInt3094 + 2][Static167.anInt3094 + Static167.anInt3094 + 2];
		Static70.aByteArrayArrayArray8 = new byte[4][Static44.anInt996][Static14.anInt369];
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!kb;Z)V")
	public static void method4197(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) boolean arg1) {
		Static100.aClass69_8.method1628(arg0);
		while (true) {
			@Pc(8) Class1_Sub19 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class1_Sub19[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class1_Sub19 local153;
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
										@Pc(363) Class125 var22;
										@Pc(469) boolean var24;
										@Pc(425) Class124 var25;
										@Pc(1179) Class1_Sub19 var32;
										while (true) {
											do {
												local8 = (Class1_Sub19) Static100.aClass69_8.method1630();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean181);
											local18 = local8.anInt2560;
											local21 = local8.anInt2558;
											local24 = local8.anInt2564;
											local27 = local8.anInt2563;
											local31 = Static130.aClass1_Sub19ArrayArrayArray1[local24];
											@Pc(33) float local33 = 0.0F;
											if (Static240.aBoolean369) {
												if (Static165.anIntArrayArrayArray13 == Static163.anIntArrayArrayArray16) {
													var9 = Static46.anIntArrayArray10[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static115.anInt2124) {
														Static115.anInt2124 = var10;
														Static64.method1060(var10);
														Static34.method630(Static173.method2619());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static238.anInt4937) {
														Static238.anInt4937 = local65;
														Static124.method1915(local65);
													}
													local115 = Static152.anIntArrayArrayArray11[0][local18][local21] + Static152.anIntArrayArrayArray11[0][local18 + 1][local21] + Static152.anIntArrayArrayArray11[0][local18][local21 + 1] + Static152.anIntArrayArrayArray11[0][local18 + 1][local21 + 1] >> 2;
													Static122.method1910(3, -local115);
													local33 = 201.5F;
													Static240.method3809(local33);
												} else {
													local33 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static240.method3809(local33);
												}
											}
											if (!local8.aBoolean180) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static130.aClass1_Sub19ArrayArrayArray1[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean181) {
														continue;
													}
												}
												if (local18 <= Static120.anInt2321 && local18 > Static104.anInt3085) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean181 && (local153.aBoolean180 || (local8.anInt2567 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static120.anInt2321 && local18 < Static171.anInt3162 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean181 && (local153.aBoolean180 || (local8.anInt2567 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static20.anInt458 && local21 > Static97.anInt1857) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean181 && (local153.aBoolean180 || (local8.anInt2567 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static20.anInt458 && local21 < Static276.anInt5533 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean181 && (local153.aBoolean180 || (local8.anInt2567 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean180 = false;
											if (local8.aClass1_Sub19_1 != null) {
												local153 = local8.aClass1_Sub19_1;
												if (Static240.aBoolean369) {
													Static240.method3809(201.5F - (float) (local153.anInt2563 + 1) * 50.0F);
												}
												if (local153.aClass74_1 == null) {
													if (local153.aClass59_1 != null) {
														if (Static266.method4099(0, local18, local21)) {
															Static286.method3896(local153.aClass59_1, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local18, local21, true);
														} else {
															Static286.method3896(local153.aClass59_1, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local18, local21, false);
														}
													}
												} else if (Static266.method4099(0, local18, local21)) {
													Static60.method1019(local153.aClass74_1, 0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local18, local21, true);
												} else {
													Static60.method1019(local153.aClass74_1, 0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local18, local21, false);
												}
												var22 = local153.aClass125_1;
												if (var22 != null) {
													if (Static240.aBoolean369) {
														if ((var22.anInt3531 & local8.anInt2571) == 0) {
															Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
														} else {
															Static194.method2933(var22.anInt3531, Static3.anInt142, Static254.anInt5887, Static12.anInt356, local27, local18, local21);
														}
													}
													var22.aClass6_8.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, var22.anInt3529 - Static3.anInt142, var22.anInt3537 - Static254.anInt5887, var22.anInt3530 - Static12.anInt356, var22.aLong118, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt2570; local65++) {
													var25 = local153.aClass124Array2[local65];
													if (var25 != null) {
														if (Static240.aBoolean369) {
															Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
														}
														var25.aClass6_6.method3838(var25.anInt3414, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, var25.anInt3413 - Static3.anInt142, var25.anInt3417 - Static254.anInt5887, var25.anInt3404 - Static12.anInt356, var25.aLong114, local24, null);
													}
												}
												if (Static240.aBoolean369) {
													Static240.method3809(local33);
												}
											}
											var24 = false;
											if (local8.aClass74_1 == null) {
												if (local8.aClass59_1 != null) {
													if (Static266.method4099(local27, local18, local21)) {
														Static286.method3896(local8.aClass59_1, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local18, local21, true);
													} else {
														var24 = true;
														Static286.method3896(local8.aClass59_1, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local18, local21, false);
													}
												}
											} else if (Static266.method4099(local27, local18, local21)) {
												Static60.method1019(local8.aClass74_1, local27, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local18, local21, true);
											} else {
												var24 = true;
												if (local8.aClass74_1.anInt2048 != 12345678 || Static167.aBoolean234 && local24 <= Static185.anInt3456) {
													Static60.method1019(local8.aClass74_1, local27, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local18, local21, false);
												}
											}
											if (var24) {
												@Pc(549) Class167 local549 = local8.aClass167_1;
												if (local549 != null && (local549.aLong178 & 0x80000000L) != 0L) {
													if (Static240.aBoolean369 && local549.aBoolean422) {
														Static240.method3809(local33 + 50.0F - 1.5F);
													}
													if (Static240.aBoolean369) {
														Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
													}
													local549.aClass6_9.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local549.anInt5539 - Static3.anInt142, local549.anInt5537 - Static254.anInt5887, local549.anInt5542 - Static12.anInt356, local549.aLong178, local24, null);
													if (Static240.aBoolean369 && local549.aBoolean422) {
														Static240.method3809(local33);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class125 local616 = local8.aClass125_1;
											@Pc(619) Class63 local619 = local8.aClass63_1;
											if (local616 != null || local619 != null) {
												if (Static120.anInt2321 == local18) {
													var10++;
												} else if (Static120.anInt2321 < local18) {
													var10 += 2;
												}
												if (Static20.anInt458 == local21) {
													var10 += 3;
												} else if (Static20.anInt458 > local21) {
													var10 += 6;
												}
												local65 = Static253.anIntArray602[var10];
												local8.anInt2571 = Static180.anIntArray391[var10];
											}
											if (local616 != null) {
												if ((local616.anInt3531 & Static75.anIntArray177[var10]) == 0) {
													local8.anInt2561 = 0;
												} else if (local616.anInt3531 == 16) {
													local8.anInt2561 = 3;
													local8.anInt2569 = Static254.anIntArray692[var10];
													local8.anInt2565 = 3 - local8.anInt2569;
												} else if (local616.anInt3531 == 32) {
													local8.anInt2561 = 6;
													local8.anInt2569 = Static23.anIntArray686[var10];
													local8.anInt2565 = 6 - local8.anInt2569;
												} else if (local616.anInt3531 == 64) {
													local8.anInt2561 = 12;
													local8.anInt2569 = Static271.anIntArray630[var10];
													local8.anInt2565 = 12 - local8.anInt2569;
												} else {
													local8.anInt2561 = 9;
													local8.anInt2569 = Static133.anIntArray304[var10];
													local8.anInt2565 = 9 - local8.anInt2569;
												}
												if ((local616.anInt3531 & local65) != 0 && !Static265.method4069(local27, local18, local21, local616.anInt3531)) {
													if (Static240.aBoolean369) {
														Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
													}
													local616.aClass6_8.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local616.anInt3529 - Static3.anInt142, local616.anInt3537 - Static254.anInt5887, local616.anInt3530 - Static12.anInt356, local616.aLong118, local24, null);
												}
												if ((local616.anInt3535 & local65) != 0 && !Static265.method4069(local27, local18, local21, local616.anInt3535)) {
													if (Static240.aBoolean369) {
														Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
													}
													local616.aClass6_7.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local616.anInt3529 - Static3.anInt142, local616.anInt3537 - Static254.anInt5887, local616.anInt3530 - Static12.anInt356, local616.aLong118, local24, null);
												}
											}
											if (local619 != null && !Static297.method4546(local27, local18, local21, local619.aClass6_4.method3833())) {
												if (Static240.aBoolean369) {
													Static240.method3809(local33 - 0.5F);
												}
												if ((local619.anInt1654 & local65) != 0) {
													if (Static240.aBoolean369) {
														Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
													}
													local619.aClass6_4.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local619.anInt1653 + local619.anInt1651 - Static3.anInt142, local619.anInt1650 - Static254.anInt5887, local619.anInt1648 + local619.anInt1655 - Static12.anInt356, local619.aLong55, local24, null);
												} else if (local619.anInt1654 == 256) {
													local894 = local619.anInt1653 - Static3.anInt142;
													local899 = local619.anInt1650 - Static254.anInt5887;
													local904 = local619.anInt1648 - Static12.anInt356;
													var17 = local619.anInt1652;
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
														if (Static240.aBoolean369) {
															Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
														}
														local619.aClass6_4.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local894 + local619.anInt1651, local899, local904 + local619.anInt1655, local619.aLong55, local24, null);
													} else if (local619.aClass6_5 != null) {
														if (Static240.aBoolean369) {
															Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
														}
														local619.aClass6_5.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local894, local899, local904, local619.aLong55, local24, null);
													}
												}
												if (Static240.aBoolean369) {
													Static240.method3809(local33);
												}
											}
											if (var24) {
												@Pc(1001) Class167 local1001 = local8.aClass167_1;
												if (local1001 != null && (local1001.aLong178 & 0x80000000L) == 0L) {
													if (Static240.aBoolean369 && local1001.aBoolean422) {
														Static240.method3809(local33 + 50.0F - 1.5F);
													}
													if (Static240.aBoolean369) {
														Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
													}
													local1001.aClass6_9.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local1001.anInt5539 - Static3.anInt142, local1001.anInt5537 - Static254.anInt5887, local1001.anInt5542 - Static12.anInt356, local1001.aLong178, local24, null);
													if (Static240.aBoolean369 && local1001.aBoolean422) {
														Static240.method3809(local33);
													}
												}
												@Pc(1064) Class5 local1064 = local8.aClass5_1;
												if (local1064 != null && local1064.anInt247 == 0) {
													if (Static240.aBoolean369) {
														Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
													}
													if (local1064.aClass6_2 != null) {
														local1064.aClass6_2.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local1064.anInt249 - Static3.anInt142, local1064.anInt241 - Static254.anInt5887, local1064.anInt242 - Static12.anInt356, local1064.aLong12, local24, null);
													}
													if (local1064.aClass6_3 != null) {
														local1064.aClass6_3.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local1064.anInt249 - Static3.anInt142, local1064.anInt241 - Static254.anInt5887, local1064.anInt242 - Static12.anInt356, local1064.aLong12, local24, null);
													}
													if (local1064.aClass6_1 != null) {
														local1064.aClass6_1.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local1064.anInt249 - Static3.anInt142, local1064.anInt241 - Static254.anInt5887, local1064.anInt242 - Static12.anInt356, local1064.aLong12, local24, null);
													}
												}
											}
											local894 = local8.anInt2567;
											if (local894 != 0) {
												if (local18 < Static120.anInt2321 && (local894 & 0x4) != 0) {
													var32 = local31[local18 + 1][local21];
													if (var32 != null && var32.aBoolean181) {
														Static100.aClass69_8.method1628(var32);
													}
												}
												if (local21 < Static20.anInt458 && (local894 & 0x2) != 0) {
													var32 = local31[local18][local21 + 1];
													if (var32 != null && var32.aBoolean181) {
														Static100.aClass69_8.method1628(var32);
													}
												}
												if (local18 > Static120.anInt2321 && (local894 & 0x1) != 0) {
													var32 = local31[local18 - 1][local21];
													if (var32 != null && var32.aBoolean181) {
														Static100.aClass69_8.method1628(var32);
													}
												}
												if (local21 > Static20.anInt458 && (local894 & 0x8) != 0) {
													var32 = local31[local18][local21 - 1];
													if (var32 != null && var32.aBoolean181) {
														Static100.aClass69_8.method1628(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt2561 != 0) {
											var24 = true;
											for (var10 = 0; var10 < local8.anInt2570; var10++) {
												if (local8.aClass124Array2[var10].anInt3407 != Static123.anInt2372 && (local8.anIntArray309[var10] & local8.anInt2561) == local8.anInt2569) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												var22 = local8.aClass125_1;
												if (!Static265.method4069(local27, local18, local21, var22.anInt3531)) {
													if (Static240.aBoolean369) {
														label882: {
															if ((var22.aLong118 & 0xFC000L) == 16384L) {
																local65 = var22.anInt3529 - Static3.anInt142;
																local115 = var22.anInt3530 - Static12.anInt356;
																local1332 = (int) (var22.aLong118 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static14.anInt369 - 1) {
																		Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18 - 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static44.anInt996 - 1 && local21 < Static14.anInt369 - 1) {
																		Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18 + 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static44.anInt996 - 1 && local21 > 0) {
																		Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18 + 1, local21 - 1);
																		break label882;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18 - 1, local21 - 1);
																		break label882;
																	}
																}
															}
															Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
														}
													}
													var22.aClass6_8.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, var22.anInt3529 - Static3.anInt142, var22.anInt3537 - Static254.anInt5887, var22.anInt3530 - Static12.anInt356, var22.aLong118, local24, null);
												}
												local8.anInt2561 = 0;
											}
										}
										if (!local8.aBoolean179) {
											break;
										}
										try {
											var9 = local8.anInt2570;
											local8.aBoolean179 = false;
											var10 = 0;
											label767: for (local65 = 0; local65 < var9; local65++) {
												var25 = local8.aClass124Array2[local65];
												if (var25.anInt3407 != Static123.anInt2372) {
													for (local1332 = var25.anInt3416; local1332 <= var25.anInt3401; local1332++) {
														for (local894 = var25.anInt3411; local894 <= var25.anInt3406; local894++) {
															var32 = local31[local1332][local894];
															if (var32.aBoolean180) {
																local8.aBoolean179 = true;
																continue label767;
															}
															if (var32.anInt2561 != 0) {
																local904 = 0;
																if (local1332 > var25.anInt3416) {
																	local904++;
																}
																if (local1332 < var25.anInt3401) {
																	local904 += 4;
																}
																if (local894 > var25.anInt3411) {
																	local904 += 8;
																}
																if (local894 < var25.anInt3406) {
																	local904 += 2;
																}
																if ((local904 & var32.anInt2561) == local8.anInt2565) {
																	local8.aBoolean179 = true;
																	continue label767;
																}
															}
														}
													}
													Static67.aClass124Array1[var10++] = var25;
													local1332 = Static120.anInt2321 - var25.anInt3416;
													local894 = var25.anInt3401 - Static120.anInt2321;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static20.anInt458 - var25.anInt3411;
													local904 = var25.anInt3406 - Static20.anInt458;
													if (local904 > local899) {
														var25.anInt3410 = local1332 + local904;
													} else {
														var25.anInt3410 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class124 local1628 = Static67.aClass124Array1[local1332];
													if (local1628.anInt3407 != Static123.anInt2372) {
														if (local1628.anInt3410 > local65) {
															local65 = local1628.anInt3410;
															local115 = local1332;
														} else if (local1628.anInt3410 == local65) {
															local899 = local1628.anInt3413 - Static3.anInt142;
															local904 = local1628.anInt3404 - Static12.anInt356;
															var17 = Static67.aClass124Array1[local115].anInt3413 - Static3.anInt142;
															var18 = Static67.aClass124Array1[local115].anInt3404 - Static12.anInt356;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class124 local1697 = Static67.aClass124Array1[local115];
												local1697.anInt3407 = Static123.anInt2372;
												if (!Static81.method1387(local27, local1697.anInt3416, local1697.anInt3401, local1697.anInt3411, local1697.anInt3406, local1697.aClass6_6.method3833())) {
													if (Static240.aBoolean369) {
														if ((local1697.aLong114 & 0xFC000L) == 147456L) {
															Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
															local894 = local1697.anInt3413 - Static3.anInt142;
															local899 = local1697.anInt3404 - Static12.anInt356;
															local904 = (int) (local1697.aLong114 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static194.method2938(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static194.method2938(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static194.method2938(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static194.method2938(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static194.method2936(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local1697.anInt3416, local1697.anInt3411, local1697.anInt3401, local1697.anInt3406);
														}
													}
													local1697.aClass6_6.method3838(local1697.anInt3414, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local1697.anInt3413 - Static3.anInt142, local1697.anInt3417 - Static254.anInt5887, local1697.anInt3404 - Static12.anInt356, local1697.aLong114, local24, null);
												}
												for (local894 = local1697.anInt3416; local894 <= local1697.anInt3401; local894++) {
													for (local899 = local1697.anInt3411; local899 <= local1697.anInt3406; local899++) {
														@Pc(1863) Class1_Sub19 local1863 = local31[local894][local899];
														if (local1863.anInt2561 != 0) {
															Static100.aClass69_8.method1628(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean181) {
															Static100.aClass69_8.method1628(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean179) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean179 = false;
											break;
										}
									}
								} while (!local8.aBoolean181);
							} while (local8.anInt2561 != 0);
							if (local18 > Static120.anInt2321 || local18 <= Static104.anInt3085) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean181);
						if (local18 < Static120.anInt2321 || local18 >= Static171.anInt3162 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean181);
					if (local21 > Static20.anInt458 || local21 <= Static97.anInt1857) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean181);
				if (local21 < Static20.anInt458 || local21 >= Static276.anInt5533 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean181);
			local8.aBoolean181 = false;
			Static73.anInt1432--;
			@Pc(1999) Class5 local1999 = local8.aClass5_1;
			if (local1999 != null && local1999.anInt247 != 0) {
				if (Static240.aBoolean369) {
					Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
				}
				if (local1999.aClass6_2 != null) {
					local1999.aClass6_2.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local1999.anInt249 - Static3.anInt142, local1999.anInt241 - Static254.anInt5887 - local1999.anInt247, local1999.anInt242 - Static12.anInt356, local1999.aLong12, local24, null);
				}
				if (local1999.aClass6_3 != null) {
					local1999.aClass6_3.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local1999.anInt249 - Static3.anInt142, local1999.anInt241 - Static254.anInt5887 - local1999.anInt247, local1999.anInt242 - Static12.anInt356, local1999.aLong12, local24, null);
				}
				if (local1999.aClass6_1 != null) {
					local1999.aClass6_1.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local1999.anInt249 - Static3.anInt142, local1999.anInt241 - Static254.anInt5887 - local1999.anInt247, local1999.anInt242 - Static12.anInt356, local1999.aLong12, local24, null);
				}
			}
			if (local8.anInt2571 != 0) {
				@Pc(2109) Class63 local2109 = local8.aClass63_1;
				if (local2109 != null && !Static297.method4546(local27, local18, local21, local2109.aClass6_4.method3833())) {
					if ((local2109.anInt1654 & local8.anInt2571) != 0) {
						if (Static240.aBoolean369) {
							Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
						}
						local2109.aClass6_4.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local2109.anInt1653 + local2109.anInt1651 - Static3.anInt142, local2109.anInt1650 - Static254.anInt5887, local2109.anInt1648 + local2109.anInt1655 - Static12.anInt356, local2109.aLong55, local24, null);
					} else if (local2109.anInt1654 == 256) {
						local65 = local2109.anInt1653 - Static3.anInt142;
						local115 = local2109.anInt1650 - Static254.anInt5887;
						local1332 = local2109.anInt1648 - Static12.anInt356;
						local894 = local2109.anInt1652;
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
							if (Static240.aBoolean369) {
								Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
							}
							local2109.aClass6_4.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local65 + local2109.anInt1651, local115, local1332 + local2109.anInt1655, local2109.aLong55, local24, null);
						} else if (local2109.aClass6_5 != null) {
							if (Static240.aBoolean369) {
								Static194.method2935(Static3.anInt142, Static254.anInt5887, Static12.anInt356, local24, local18, local21);
							}
							local2109.aClass6_5.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local65, local115, local1332, local2109.aLong55, local24, null);
						}
					}
				}
				@Pc(2275) Class125 local2275 = local8.aClass125_1;
				if (local2275 != null) {
					if ((local2275.anInt3535 & local8.anInt2571) != 0 && !Static265.method4069(local27, local18, local21, local2275.anInt3535)) {
						if (Static240.aBoolean369) {
							Static194.method2933(local2275.anInt3535, Static3.anInt142, Static254.anInt5887, Static12.anInt356, local27, local18, local21);
						}
						local2275.aClass6_7.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local2275.anInt3529 - Static3.anInt142, local2275.anInt3537 - Static254.anInt5887, local2275.anInt3530 - Static12.anInt356, local2275.aLong118, local24, null);
					}
					if ((local2275.anInt3531 & local8.anInt2571) != 0 && !Static265.method4069(local27, local18, local21, local2275.anInt3531)) {
						if (Static240.aBoolean369) {
							Static194.method2933(local2275.anInt3531, Static3.anInt142, Static254.anInt5887, Static12.anInt356, local27, local18, local21);
						}
						local2275.aClass6_8.method3838(0, Static71.anInt1411, Static295.anInt5859, Static166.anInt3056, Static190.anInt3638, local2275.anInt3529 - Static3.anInt142, local2275.anInt3537 - Static254.anInt5887, local2275.anInt3530 - Static12.anInt356, local2275.aLong118, local24, null);
					}
				}
			}
			@Pc(2388) Class1_Sub19 local2388;
			if (local24 < Static158.anInt2965 - 1) {
				local2388 = Static130.aClass1_Sub19ArrayArrayArray1[local24 + 1][local18][local21];
				if (local2388 != null && local2388.aBoolean181) {
					Static100.aClass69_8.method1628(local2388);
				}
			}
			if (local18 < Static120.anInt2321) {
				local2388 = local31[local18 + 1][local21];
				if (local2388 != null && local2388.aBoolean181) {
					Static100.aClass69_8.method1628(local2388);
				}
			}
			if (local21 < Static20.anInt458) {
				local2388 = local31[local18][local21 + 1];
				if (local2388 != null && local2388.aBoolean181) {
					Static100.aClass69_8.method1628(local2388);
				}
			}
			if (local18 > Static120.anInt2321) {
				local2388 = local31[local18 - 1][local21];
				if (local2388 != null && local2388.aBoolean181) {
					Static100.aClass69_8.method1628(local2388);
				}
			}
			if (local21 > Static20.anInt458) {
				local2388 = local31[local18][local21 - 1];
				if (local2388 != null && local2388.aBoolean181) {
					Static100.aClass69_8.method1628(local2388);
				}
			}
		}
	}
}
