import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
	public static int anInt4225;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "[[Lclient!wj;")
	public static Class191[][] aClass191ArrayArray1;

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	public static int anInt4231 = 100;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILclient!f;I)V")
	public static void method3525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class53_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (Static154.aClass53_Sub1_Sub1_2 == arg2 || Static300.anInt5638 >= 400) {
			return;
		}
		@Pc(144) String local144;
		if (arg2.anInt1584 == 0) {
			@Pc(29) boolean local29 = true;
			if (Static154.aClass53_Sub1_Sub1_2.anInt1586 != -1 && arg2.anInt1586 != -1) {
				@Pc(53) int local53 = arg2.anInt1597 >= Static154.aClass53_Sub1_Sub1_2.anInt1597 ? arg2.anInt1597 : Static154.aClass53_Sub1_Sub1_2.anInt1597;
				@Pc(68) int local68 = Static154.aClass53_Sub1_Sub1_2.anInt1586 >= arg2.anInt1586 ? arg2.anInt1586 : Static154.aClass53_Sub1_Sub1_2.anInt1586;
				@Pc(79) int local79 = local53 * 10 / 100 + local68 + 5;
				@Pc(86) int local86 = Static154.aClass53_Sub1_Sub1_2.anInt1597 - arg2.anInt1597;
				if (local86 < 0) {
					local86 = -local86;
				}
				if (local79 < local86) {
					local29 = false;
				}
			}
			@Pc(110) String local110 = Static76.anInt5724 == 1 ? Static20.aString29 : Static306.aString355;
			if (arg2.anInt1576 <= arg2.anInt1597) {
				local144 = arg2.method1173() + (local29 ? Static124.method1922(Static154.aClass53_Sub1_Sub1_2.anInt1597, arg2.anInt1597) : "<col=ffffff>") + " (" + local110 + arg2.anInt1597 + ")";
			} else {
				local144 = arg2.method1173() + (local29 ? Static124.method1922(Static154.aClass53_Sub1_Sub1_2.anInt1597, arg2.anInt1597) : "<col=ffffff>") + " (" + local110 + arg2.anInt1597 + "+" + (arg2.anInt1576 - arg2.anInt1597) + ")";
			}
		} else {
			local144 = arg2.method1173() + " (" + Static282.aString327 + arg2.anInt1584 + ")";
		}
		@Pc(269) int local269;
		if (Static69.anInt1334 == 1) {
			Static84.method1497((long) arg1, arg3, arg0, Static313.aString372 + " -> <col=ffffff>" + local144, Static194.aString321, (short) 21, Static82.anInt1937);
		} else if (!Static135.aBoolean177) {
			for (local269 = 7; local269 >= 0; local269--) {
				if (Static76.aStringArray40[local269] != null) {
					@Pc(277) short local277 = 0;
					if (Static76.anInt5724 == 0 && Static76.aStringArray40[local269].equalsIgnoreCase(Static102.aString120)) {
						if (Static154.aClass53_Sub1_Sub1_2.anInt1597 < arg2.anInt1597) {
							local277 = 2000;
						}
						if (Static154.aClass53_Sub1_Sub1_2.anInt1593 != 0 && arg2.anInt1593 != 0) {
							if (arg2.anInt1593 == Static154.aClass53_Sub1_Sub1_2.anInt1593) {
								local277 = 2000;
							} else {
								local277 = 0;
							}
						}
					} else if (Static127.aBooleanArray11[local269]) {
						local277 = 2000;
					}
					@Pc(336) short local336 = Static308.aShortArray122[local269];
					@Pc(341) short local341 = (short) (local336 + local277);
					Static84.method1497((long) arg1, arg3, arg0, "<col=ffffff>" + local144, Static76.aStringArray40[local269], local341, Static186.anIntArray615[local269]);
				}
			}
		} else if ((Static187.anInt3560 & 0x8) != 0) {
			Static84.method1497((long) arg1, arg3, arg0, Static69.aString81 + " -> <col=ffffff>" + local144, Static155.aString140, (short) 5, Static237.anInt4467);
		}
		for (local269 = 0; local269 < Static300.anInt5638; local269++) {
			if (Static262.aShortArray100[local269] == 26) {
				Static249.aStringArray27[local269] = "<col=ffffff>" + local144;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method3529(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(20) byte[] local20 = (byte[]) arg1;
			return arg0 ? Static297.method4482(local20) : local20;
		} else if (arg1 instanceof Class76) {
			@Pc(34) Class76 local34 = (Class76) arg1;
			return local34.method2331();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!nh;Z)V")
	public static void method3530(@OriginalArg(0) Class4_Sub19 arg0, @OriginalArg(1) boolean arg1) {
		Static134.aClass114_26.method2625(arg0);
		while (true) {
			@Pc(8) Class4_Sub19 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class4_Sub19[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class4_Sub19 local153;
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
										@Pc(363) Class182 var30;
										@Pc(469) boolean var32;
										@Pc(425) Class33 var33;
										@Pc(1179) Class4_Sub19 var39;
										while (true) {
											do {
												local8 = (Class4_Sub19) Static134.aClass114_26.method2621();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean255);
											local18 = local8.anInt3548;
											local21 = local8.anInt3547;
											local24 = local8.anInt3552;
											local27 = local8.anInt3557;
											local31 = Static6.aClass4_Sub19ArrayArrayArray1[local24];
											var8 = 0.0F;
											if (Static94.aBoolean138) {
												if (Static36.anIntArrayArrayArray2 == Static243.anIntArrayArrayArray13) {
													var9 = Static54.anIntArrayArray10[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static192.anInt3636) {
														Static192.anInt3636 = var10;
														Static107.method4409(var10);
														Static178.method2785(Static45.method723());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static266.anInt5121) {
														Static266.anInt5121 = local65;
														Static189.method3002(local65);
													}
													local115 = Static259.anIntArrayArrayArray14[0][local18][local21] + Static259.anIntArrayArrayArray14[0][local18 + 1][local21] + Static259.anIntArrayArrayArray14[0][local18][local21 + 1] + Static259.anIntArrayArrayArray14[0][local18 + 1][local21 + 1] >> 2;
													Static164.method2665(3, -local115);
													var8 = 201.5F;
													Static94.method1613(var8);
												} else {
													var8 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static94.method1613(var8);
												}
											}
											if (!local8.aBoolean257) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static6.aClass4_Sub19ArrayArrayArray1[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean255) {
														continue;
													}
												}
												if (local18 <= Static239.anInt4514 && local18 > Static261.anInt4979) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean255 && (local153.aBoolean257 || (local8.anInt3551 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static239.anInt4514 && local18 < Static87.anInt5782 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean255 && (local153.aBoolean257 || (local8.anInt3551 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static172.anInt3329 && local21 > Static47.anInt890) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean255 && (local153.aBoolean257 || (local8.anInt3551 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static172.anInt3329 && local21 < Static70.anInt1344 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean255 && (local153.aBoolean257 || (local8.anInt3551 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean257 = false;
											if (local8.aClass4_Sub19_1 != null) {
												local153 = local8.aClass4_Sub19_1;
												if (Static94.aBoolean138) {
													Static94.method1613(201.5F - (float) (local153.anInt3557 + 1) * 50.0F);
												}
												if (local153.aClass145_1 == null) {
													if (local153.aClass169_1 != null) {
														if (Static31.method508(0, local18, local21)) {
															Static254.method4024(local153.aClass169_1, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local18, local21, true);
														} else {
															Static254.method4024(local153.aClass169_1, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local18, local21, false);
														}
													}
												} else if (Static31.method508(0, local18, local21)) {
													Static245.method3168(local153.aClass145_1, 0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local18, local21, true);
												} else {
													Static245.method3168(local153.aClass145_1, 0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local18, local21, false);
												}
												var30 = local153.aClass182_1;
												if (var30 != null) {
													if (Static94.aBoolean138) {
														if ((var30.anInt5494 & local8.anInt3558) == 0) {
															Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
														} else {
															Static196.method3132(var30.anInt5494, Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local27, local18, local21);
														}
													}
													var30.aClass53_5.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, var30.anInt5493 - Static277.anInt5282, var30.anInt5495 - Static228.anInt4376, var30.anInt5492 - Static230.anInt4401, var30.aLong193, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt3554; local65++) {
													var33 = local153.aClass33Array3[local65];
													if (var33 != null) {
														if (Static94.aBoolean138) {
															Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
														}
														var33.aClass53_1.method3842(var33.anInt814, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, var33.anInt821 - Static277.anInt5282, var33.anInt823 - Static228.anInt4376, var33.anInt827 - Static230.anInt4401, var33.aLong38, local24, null);
													}
												}
												if (Static94.aBoolean138) {
													Static94.method1613(var8);
												}
											}
											var32 = false;
											if (local8.aClass145_1 == null) {
												if (local8.aClass169_1 != null) {
													if (Static31.method508(local27, local18, local21)) {
														Static254.method4024(local8.aClass169_1, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local18, local21, true);
													} else {
														var32 = true;
														Static254.method4024(local8.aClass169_1, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local18, local21, false);
													}
												}
											} else if (Static31.method508(local27, local18, local21)) {
												Static245.method3168(local8.aClass145_1, local27, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local18, local21, true);
											} else {
												var32 = true;
												if (local8.aClass145_1.anInt4300 != 12345678 || Static73.aBoolean101 && local24 <= Static195.anInt3715) {
													Static245.method3168(local8.aClass145_1, local27, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local18, local21, false);
												}
											}
											if (var32) {
												@Pc(549) Class42 local549 = local8.aClass42_1;
												if (local549 != null && (local549.aLong45 & 0x80000000L) != 0L) {
													if (Static94.aBoolean138 && local549.aBoolean63) {
														Static94.method1613(var8 + 50.0F - 1.5F);
													}
													if (Static94.aBoolean138) {
														Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
													}
													local549.aClass53_2.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local549.anInt1129 - Static277.anInt5282, local549.anInt1130 - Static228.anInt4376, local549.anInt1128 - Static230.anInt4401, local549.aLong45, local24, null);
													if (Static94.aBoolean138 && local549.aBoolean63) {
														Static94.method1613(var8);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class182 local616 = local8.aClass182_1;
											@Pc(619) Class186 local619 = local8.aClass186_1;
											if (local616 != null || local619 != null) {
												if (Static239.anInt4514 == local18) {
													var10++;
												} else if (Static239.anInt4514 < local18) {
													var10 += 2;
												}
												if (Static172.anInt3329 == local21) {
													var10 += 3;
												} else if (Static172.anInt3329 > local21) {
													var10 += 6;
												}
												local65 = Static168.anIntArray313[var10];
												local8.anInt3558 = Static83.anIntArray150[var10];
											}
											if (local616 != null) {
												if ((local616.anInt5494 & Static291.anIntArray621[var10]) == 0) {
													local8.anInt3549 = 0;
												} else if (local616.anInt5494 == 16) {
													local8.anInt3549 = 3;
													local8.anInt3553 = Static254.anIntArray524[var10];
													local8.anInt3559 = 3 - local8.anInt3553;
												} else if (local616.anInt5494 == 32) {
													local8.anInt3549 = 6;
													local8.anInt3553 = Static137.anIntArray230[var10];
													local8.anInt3559 = 6 - local8.anInt3553;
												} else if (local616.anInt5494 == 64) {
													local8.anInt3549 = 12;
													local8.anInt3553 = Static190.anIntArray392[var10];
													local8.anInt3559 = 12 - local8.anInt3553;
												} else {
													local8.anInt3549 = 9;
													local8.anInt3553 = Static2.anIntArray1[var10];
													local8.anInt3559 = 9 - local8.anInt3553;
												}
												if ((local616.anInt5494 & local65) != 0 && !Static220.method3326(local27, local18, local21, local616.anInt5494)) {
													if (Static94.aBoolean138) {
														Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
													}
													local616.aClass53_5.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local616.anInt5493 - Static277.anInt5282, local616.anInt5495 - Static228.anInt4376, local616.anInt5492 - Static230.anInt4401, local616.aLong193, local24, null);
												}
												if ((local616.anInt5489 & local65) != 0 && !Static220.method3326(local27, local18, local21, local616.anInt5489)) {
													if (Static94.aBoolean138) {
														Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
													}
													local616.aClass53_4.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local616.anInt5493 - Static277.anInt5282, local616.anInt5495 - Static228.anInt4376, local616.anInt5492 - Static230.anInt4401, local616.aLong193, local24, null);
												}
											}
											if (local619 != null && !Static70.method1089(local27, local18, local21, local619.aClass53_10.method3850())) {
												if (Static94.aBoolean138) {
													Static94.method1613(var8 - 0.5F);
												}
												if ((local619.anInt5633 & local65) != 0) {
													if (Static94.aBoolean138) {
														Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
													}
													local619.aClass53_10.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local619.anInt5630 + local619.anInt5637 - Static277.anInt5282, local619.anInt5631 - Static228.anInt4376, local619.anInt5628 + local619.anInt5629 - Static230.anInt4401, local619.aLong199, local24, null);
												} else if (local619.anInt5633 == 256) {
													local894 = local619.anInt5630 - Static277.anInt5282;
													local899 = local619.anInt5631 - Static228.anInt4376;
													local904 = local619.anInt5628 - Static230.anInt4401;
													var17 = local619.anInt5635;
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
														if (Static94.aBoolean138) {
															Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
														}
														local619.aClass53_10.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local894 + local619.anInt5637, local899, local904 + local619.anInt5629, local619.aLong199, local24, null);
													} else if (local619.aClass53_9 != null) {
														if (Static94.aBoolean138) {
															Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
														}
														local619.aClass53_9.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local894, local899, local904, local619.aLong199, local24, null);
													}
												}
												if (Static94.aBoolean138) {
													Static94.method1613(var8);
												}
											}
											if (var32) {
												@Pc(1001) Class42 local1001 = local8.aClass42_1;
												if (local1001 != null && (local1001.aLong45 & 0x80000000L) == 0L) {
													if (Static94.aBoolean138 && local1001.aBoolean63) {
														Static94.method1613(var8 + 50.0F - 1.5F);
													}
													if (Static94.aBoolean138) {
														Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
													}
													local1001.aClass53_2.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local1001.anInt1129 - Static277.anInt5282, local1001.anInt1130 - Static228.anInt4376, local1001.anInt1128 - Static230.anInt4401, local1001.aLong45, local24, null);
													if (Static94.aBoolean138 && local1001.aBoolean63) {
														Static94.method1613(var8);
													}
												}
												@Pc(1064) Class183 local1064 = local8.aClass183_1;
												if (local1064 != null && local1064.anInt5500 == 0) {
													if (Static94.aBoolean138) {
														Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
													}
													if (local1064.aClass53_8 != null) {
														local1064.aClass53_8.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local1064.anInt5497 - Static277.anInt5282, local1064.anInt5502 - Static228.anInt4376, local1064.anInt5504 - Static230.anInt4401, local1064.aLong194, local24, null);
													}
													if (local1064.aClass53_6 != null) {
														local1064.aClass53_6.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local1064.anInt5497 - Static277.anInt5282, local1064.anInt5502 - Static228.anInt4376, local1064.anInt5504 - Static230.anInt4401, local1064.aLong194, local24, null);
													}
													if (local1064.aClass53_7 != null) {
														local1064.aClass53_7.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local1064.anInt5497 - Static277.anInt5282, local1064.anInt5502 - Static228.anInt4376, local1064.anInt5504 - Static230.anInt4401, local1064.aLong194, local24, null);
													}
												}
											}
											local894 = local8.anInt3551;
											if (local894 != 0) {
												if (local18 < Static239.anInt4514 && (local894 & 0x4) != 0) {
													var39 = local31[local18 + 1][local21];
													if (var39 != null && var39.aBoolean255) {
														Static134.aClass114_26.method2625(var39);
													}
												}
												if (local21 < Static172.anInt3329 && (local894 & 0x2) != 0) {
													var39 = local31[local18][local21 + 1];
													if (var39 != null && var39.aBoolean255) {
														Static134.aClass114_26.method2625(var39);
													}
												}
												if (local18 > Static239.anInt4514 && (local894 & 0x1) != 0) {
													var39 = local31[local18 - 1][local21];
													if (var39 != null && var39.aBoolean255) {
														Static134.aClass114_26.method2625(var39);
													}
												}
												if (local21 > Static172.anInt3329 && (local894 & 0x8) != 0) {
													var39 = local31[local18][local21 - 1];
													if (var39 != null && var39.aBoolean255) {
														Static134.aClass114_26.method2625(var39);
													}
												}
											}
											break;
										}
										if (local8.anInt3549 != 0) {
											var32 = true;
											for (var10 = 0; var10 < local8.anInt3554; var10++) {
												if (local8.aClass33Array3[var10].anInt815 != Static81.anInt1871 && (local8.anIntArray390[var10] & local8.anInt3549) == local8.anInt3553) {
													var32 = false;
													break;
												}
											}
											if (var32) {
												var30 = local8.aClass182_1;
												if (!Static220.method3326(local27, local18, local21, var30.anInt5494)) {
													if (Static94.aBoolean138) {
														label1037: {
															if ((var30.aLong193 & 0xFC000L) == 16384L) {
																local65 = var30.anInt5493 - Static277.anInt5282;
																local115 = var30.anInt5492 - Static230.anInt4401;
																local1332 = (int) (var30.aLong193 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static299.anInt5591 - 1) {
																		Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18 - 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static300.anInt5636 - 1 && local21 < Static299.anInt5591 - 1) {
																		Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18 + 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static300.anInt5636 - 1 && local21 > 0) {
																		Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18 + 1, local21 - 1);
																		break label1037;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18 - 1, local21 - 1);
																		break label1037;
																	}
																}
															}
															Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
														}
													}
													var30.aClass53_5.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, var30.anInt5493 - Static277.anInt5282, var30.anInt5495 - Static228.anInt4376, var30.anInt5492 - Static230.anInt4401, var30.aLong193, local24, null);
												}
												local8.anInt3549 = 0;
											}
										}
										if (!local8.aBoolean256) {
											break;
										}
										try {
											var9 = local8.anInt3554;
											local8.aBoolean256 = false;
											var10 = 0;
											label844: for (local65 = 0; local65 < var9; local65++) {
												var33 = local8.aClass33Array3[local65];
												if (var33.anInt815 != Static81.anInt1871) {
													for (local1332 = var33.anInt824; local1332 <= var33.anInt825; local1332++) {
														for (local894 = var33.anInt826; local894 <= var33.anInt817; local894++) {
															var39 = local31[local1332][local894];
															if (var39.aBoolean257) {
																local8.aBoolean256 = true;
																continue label844;
															}
															if (var39.anInt3549 != 0) {
																local904 = 0;
																if (local1332 > var33.anInt824) {
																	local904++;
																}
																if (local1332 < var33.anInt825) {
																	local904 += 4;
																}
																if (local894 > var33.anInt826) {
																	local904 += 8;
																}
																if (local894 < var33.anInt817) {
																	local904 += 2;
																}
																if ((local904 & var39.anInt3549) == local8.anInt3559) {
																	local8.aBoolean256 = true;
																	continue label844;
																}
															}
														}
													}
													Static62.aClass33Array1[var10++] = var33;
													local1332 = Static239.anInt4514 - var33.anInt824;
													local894 = var33.anInt825 - Static239.anInt4514;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static172.anInt3329 - var33.anInt826;
													local904 = var33.anInt817 - Static172.anInt3329;
													if (local904 > local899) {
														var33.anInt811 = local1332 + local904;
													} else {
														var33.anInt811 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class33 local1628 = Static62.aClass33Array1[local1332];
													if (local1628.anInt815 != Static81.anInt1871) {
														if (local1628.anInt811 > local65) {
															local65 = local1628.anInt811;
															local115 = local1332;
														} else if (local1628.anInt811 == local65) {
															local899 = local1628.anInt821 - Static277.anInt5282;
															local904 = local1628.anInt827 - Static230.anInt4401;
															var17 = Static62.aClass33Array1[local115].anInt821 - Static277.anInt5282;
															var18 = Static62.aClass33Array1[local115].anInt827 - Static230.anInt4401;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class33 local1697 = Static62.aClass33Array1[local115];
												local1697.anInt815 = Static81.anInt1871;
												if (!Static132.method2004(local27, local1697.anInt824, local1697.anInt825, local1697.anInt826, local1697.anInt817, local1697.aClass53_1.method3850())) {
													if (Static94.aBoolean138) {
														if ((local1697.aLong38 & 0xFC000L) == 147456L) {
															Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
															local894 = local1697.anInt821 - Static277.anInt5282;
															local899 = local1697.anInt827 - Static230.anInt4401;
															local904 = (int) (local1697.aLong38 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static196.method3130(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static196.method3130(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static196.method3130(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static196.method3130(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static196.method3128(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local1697.anInt824, local1697.anInt826, local1697.anInt825, local1697.anInt817);
														}
													}
													local1697.aClass53_1.method3842(local1697.anInt814, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local1697.anInt821 - Static277.anInt5282, local1697.anInt823 - Static228.anInt4376, local1697.anInt827 - Static230.anInt4401, local1697.aLong38, local24, null);
												}
												for (local894 = local1697.anInt824; local894 <= local1697.anInt825; local894++) {
													for (local899 = local1697.anInt826; local899 <= local1697.anInt817; local899++) {
														@Pc(1863) Class4_Sub19 local1863 = local31[local894][local899];
														if (local1863.anInt3549 != 0) {
															Static134.aClass114_26.method2625(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean255) {
															Static134.aClass114_26.method2625(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean256) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean256 = false;
											break;
										}
									}
									if (local8.aClass110_1 != null) {
										if (Static94.aBoolean138) {
											@Pc(1905) GL local1905 = Static94.aGL1;
											Static94.method1613(var8);
											Static184.method2974(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401);
											var10 = local8.anInt3548 * 128 + 64 - Static277.anInt5282;
											local65 = Static243.anIntArrayArrayArray13[local24][local8.anInt3548][local8.anInt3547] - Static228.anInt4376;
											local115 = local8.anInt3547 * 128 + 64 - Static230.anInt4401;
											if (local24 < 3) {
												local1332 = Static243.anIntArrayArrayArray13[local24][local8.anInt3548][local8.anInt3547] - Static243.anIntArrayArrayArray13[local24 + 1][local8.anInt3548][local8.anInt3547];
											} else {
												local1332 = 1024;
											}
											local894 = local115 * Static113.anInt2272 - var10 * Static251.anInt4795 >> 16;
											local899 = local65 * Static52.anInt2247 + local894 * Static183.anInt3487 >> 16;
											local904 = local899 + (Static183.anInt3487 * 91 + Static52.anInt2247 * 0 >> 16);
											var17 = local899 + (Static183.anInt3487 * -91 - local1332 * Static52.anInt2247 >> 16);
											if (var17 < local904 - 1597) {
												var17 = local904 - 1597;
											}
											var18 = local904 + 2 - var17;
											@Pc(2030) Class20_Sub2_Sub1 local2030 = null;
											@Pc(2032) Class20_Sub1 local2032 = null;
											@Pc(2034) int local2034 = -1;
											@Pc(2040) Class20_Sub2_Sub1 local2040 = (Class20_Sub2_Sub1) local8.aClass110_1.method2465();
											while (true) {
												label1054: {
													if (local2040 != null) {
														if (local2040.aClass20_Sub1_1 == null || local2040.aClass20_Sub1_1.aClass20_Sub3_1.aBoolean250) {
															local2040.method2957();
															break label1054;
														}
														if ((byte) (local2040.aClass20_Sub1_1.aClass20_Sub3_1.aLong128 & 0xFFL) != local8.aByte14) {
															local8.aClass110_1 = null;
															break;
														}
														if (local2030 == null) {
															local2030 = local2040;
															local2032 = local2040.aClass20_Sub1_1;
															local2034 = local2032.aClass90_1.anInt2399;
															break label1054;
														}
													}
													if (local2030 != null && (local2040 == null || local2040.aClass20_Sub1_1 != local2032 || local2040.aClass20_Sub1_1.aClass90_1.anInt2399 != local2034)) {
														@Pc(2097) int local2097;
														for (local2097 = 0; local2097 < var18; local2097++) {
															Static184.anIntArray387[local2097] = 0;
														}
														for (local2097 = 0; local2097 < 32; local2097++) {
															Static184.anIntArray388[local2097] = 0;
														}
														Static184.anInt3519 = 0;
														for (@Pc(2121) Class20_Sub2_Sub1 local2121 = local2030; local2121 != local2040; local2121 = (Class20_Sub2_Sub1) local2121.aClass20_Sub2_5) {
															if (local2121.aClass20_Sub1_1 != null) {
																@Pc(2134) int local2134 = (local2121.anInt3228 >> 12) - Static277.anInt5282;
																@Pc(2141) int local2141 = (local2121.anInt3229 >> 12) - Static228.anInt4376;
																@Pc(2148) int local2148 = (local2121.anInt3230 >> 12) - Static230.anInt4401;
																@Pc(2158) int local2158 = local2148 * Static113.anInt2272 - local2134 * Static251.anInt4795 >> 16;
																@Pc(2170) int local2170 = (local2141 * Static52.anInt2247 + local2158 * Static183.anInt3487 >> 16) - var17;
																if (Static184.anIntArray387[local2170] < 32) {
																	Static184.aShortArrayArray3[local2170][Static184.anIntArray387[local2170]++] = local2121.aShort21;
																} else {
																	if (Static184.anIntArray387[local2170] == 32) {
																		if (Static184.anInt3519 == 32) {
																			if (Static184.aBoolean251) {
																				System.out.println("Overflowed world-based radix sort");
																			}
																			break;
																		}
																		Static184.anIntArray387[local2170] += Static184.anInt3519++ + 1;
																	}
																	@Pc(2227) int local2227 = Static184.anIntArray388[Static184.anIntArray387[local2170] - 32 - 1];
																	if (local2227 < 768) {
																		@Pc(2239) short[] local2239 = Static184.aShortArrayArray4[Static184.anIntArray387[local2170] - 32 - 1];
																		@Pc(2247) int local2247 = Static184.anIntArray387[local2170] - 32 - 1;
																		@Pc(2249) int local2249 = Static184.anIntArray388[Static184.anIntArray387[local2170] - 32 - 1];
																		Static184.anIntArray388[local2247] = Static184.anIntArray388[Static184.anIntArray387[local2170] - 32 - 1] + 1;
																		local2239[local2249] = local2121.aShort21;
																	}
																}
															}
															if (local2121.aClass20_Sub2_5 == local8.aClass110_1.aClass20_Sub2_1) {
																break;
															}
														}
														@Pc(2270) boolean local2270 = false;
														if (Static184.aBoolean249 && local2032.aClass90_1.anInt2403 != -1) {
															Static158.anInterface5_1.method451(local2032.aClass90_1.anInt2403);
															local2270 = true;
														} else {
															Static94.method1600(-1);
														}
														@Pc(2293) float local2293 = (float) local2034 * Static184.aFloat86;
														if (local2293 > 64.0F) {
															local2293 = 64.0F;
														}
														local1905.glPointSize(local2293);
														local2032.aClass20_Sub3_1.method2968(local1905, var18, local2270, local2032.aClass90_1.aBoolean167);
														if (local2040 != null) {
															local2030 = local2040;
															local2032 = local2040.aClass20_Sub1_1;
															local2034 = local2040.aClass20_Sub1_1.aClass90_1.anInt2399;
														}
													}
													if (local2040 == null) {
														break;
													}
												}
												local2040 = (Class20_Sub2_Sub1) local8.aClass110_1.method2468();
											}
											Static184.method2975();
										} else {
											var9 = Static184.anInt3506 + Static158.anInt3125;
											var10 = Static184.anInt3503 + Static158.anInt3126;
											@Pc(2347) Class20_Sub2 local2347 = local8.aClass110_1.aClass20_Sub2_1;
											for (@Pc(2350) Class20_Sub2 local2350 = local2347.aClass20_Sub2_5; local2350 != local2347; local2350 = local2350.aClass20_Sub2_5) {
												@Pc(2356) Class20_Sub2_Sub1 local2356 = (Class20_Sub2_Sub1) local2350;
												if (local2356.aClass20_Sub1_1 != null && !local2356.aClass20_Sub1_1.aClass20_Sub3_1.aBoolean250) {
													if ((byte) (local2356.aClass20_Sub1_1.aClass20_Sub3_1.aLong128 & 0xFFL) != local8.aByte14) {
														local8.aClass110_1 = null;
														break;
													}
													local894 = (local2356.anInt3228 >> 12) - Static277.anInt5282;
													local899 = (local2356.anInt3229 >> 12) - Static228.anInt4376;
													local904 = (local2356.anInt3230 >> 12) - Static230.anInt4401;
													var17 = local904 * Static251.anInt4795 + local894 * Static113.anInt2272 >> 16;
													local904 = local904 * Static113.anInt2272 - local894 * Static251.anInt4795 >> 16;
													local894 = var17;
													var17 = local899 * Static183.anInt3487 - local904 * Static52.anInt2247 >> 16;
													local904 = local899 * Static52.anInt2247 + local904 * Static183.anInt3487 >> 16;
													if (local904 >= 50) {
														var18 = var9 + (local894 << 9) / local904;
														var19 = var10 + (var17 << 9) / local904;
														@Pc(2468) int local2468 = local904 * 400;
														if (local2468 == 0) {
															local2468 = 1;
														}
														Static270.method4243(var18, var19, (local2356.aClass20_Sub1_1.aClass90_1.anInt2399 << 16) / local2468, local2356.anInt3231, local2356.anInt3231 >> 24 & 0xFF);
													}
												}
											}
										}
									}
								} while (!local8.aBoolean255);
							} while (local8.anInt3549 != 0);
							if (local18 > Static239.anInt4514 || local18 <= Static261.anInt4979) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean255);
						if (local18 < Static239.anInt4514 || local18 >= Static87.anInt5782 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean255);
					if (local21 > Static172.anInt3329 || local21 <= Static47.anInt890) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean255);
				if (local21 < Static172.anInt3329 || local21 >= Static70.anInt1344 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean255);
			local8.aBoolean255 = false;
			Static183.anInt3486--;
			@Pc(2596) Class183 local2596 = local8.aClass183_1;
			if (local2596 != null && local2596.anInt5500 != 0) {
				if (Static94.aBoolean138) {
					Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
				}
				if (local2596.aClass53_8 != null) {
					local2596.aClass53_8.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local2596.anInt5497 - Static277.anInt5282, local2596.anInt5502 - Static228.anInt4376 - local2596.anInt5500, local2596.anInt5504 - Static230.anInt4401, local2596.aLong194, local24, null);
				}
				if (local2596.aClass53_6 != null) {
					local2596.aClass53_6.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local2596.anInt5497 - Static277.anInt5282, local2596.anInt5502 - Static228.anInt4376 - local2596.anInt5500, local2596.anInt5504 - Static230.anInt4401, local2596.aLong194, local24, null);
				}
				if (local2596.aClass53_7 != null) {
					local2596.aClass53_7.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local2596.anInt5497 - Static277.anInt5282, local2596.anInt5502 - Static228.anInt4376 - local2596.anInt5500, local2596.anInt5504 - Static230.anInt4401, local2596.aLong194, local24, null);
				}
			}
			if (local8.anInt3558 != 0) {
				@Pc(2706) Class186 local2706 = local8.aClass186_1;
				if (local2706 != null && !Static70.method1089(local27, local18, local21, local2706.aClass53_10.method3850())) {
					if ((local2706.anInt5633 & local8.anInt3558) != 0) {
						if (Static94.aBoolean138) {
							Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
						}
						local2706.aClass53_10.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local2706.anInt5630 + local2706.anInt5637 - Static277.anInt5282, local2706.anInt5631 - Static228.anInt4376, local2706.anInt5628 + local2706.anInt5629 - Static230.anInt4401, local2706.aLong199, local24, null);
					} else if (local2706.anInt5633 == 256) {
						local65 = local2706.anInt5630 - Static277.anInt5282;
						local115 = local2706.anInt5631 - Static228.anInt4376;
						local1332 = local2706.anInt5628 - Static230.anInt4401;
						local894 = local2706.anInt5635;
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
							if (Static94.aBoolean138) {
								Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
							}
							local2706.aClass53_10.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local65 + local2706.anInt5637, local115, local1332 + local2706.anInt5629, local2706.aLong199, local24, null);
						} else if (local2706.aClass53_9 != null) {
							if (Static94.aBoolean138) {
								Static196.method3127(Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local24, local18, local21);
							}
							local2706.aClass53_9.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local65, local115, local1332, local2706.aLong199, local24, null);
						}
					}
				}
				@Pc(2872) Class182 local2872 = local8.aClass182_1;
				if (local2872 != null) {
					if ((local2872.anInt5489 & local8.anInt3558) != 0 && !Static220.method3326(local27, local18, local21, local2872.anInt5489)) {
						if (Static94.aBoolean138) {
							Static196.method3132(local2872.anInt5489, Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local27, local18, local21);
						}
						local2872.aClass53_4.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local2872.anInt5493 - Static277.anInt5282, local2872.anInt5495 - Static228.anInt4376, local2872.anInt5492 - Static230.anInt4401, local2872.aLong193, local24, null);
					}
					if ((local2872.anInt5494 & local8.anInt3558) != 0 && !Static220.method3326(local27, local18, local21, local2872.anInt5494)) {
						if (Static94.aBoolean138) {
							Static196.method3132(local2872.anInt5494, Static277.anInt5282, Static228.anInt4376, Static230.anInt4401, local27, local18, local21);
						}
						local2872.aClass53_5.method3842(0, Static52.anInt2247, Static183.anInt3487, Static251.anInt4795, Static113.anInt2272, local2872.anInt5493 - Static277.anInt5282, local2872.anInt5495 - Static228.anInt4376, local2872.anInt5492 - Static230.anInt4401, local2872.aLong193, local24, null);
					}
				}
			}
			@Pc(2985) Class4_Sub19 local2985;
			if (local24 < Static224.anInt4310 - 1) {
				local2985 = Static6.aClass4_Sub19ArrayArrayArray1[local24 + 1][local18][local21];
				if (local2985 != null && local2985.aBoolean255) {
					Static134.aClass114_26.method2625(local2985);
				}
			}
			if (local18 < Static239.anInt4514) {
				local2985 = local31[local18 + 1][local21];
				if (local2985 != null && local2985.aBoolean255) {
					Static134.aClass114_26.method2625(local2985);
				}
			}
			if (local21 < Static172.anInt3329) {
				local2985 = local31[local18][local21 + 1];
				if (local2985 != null && local2985.aBoolean255) {
					Static134.aClass114_26.method2625(local2985);
				}
			}
			if (local18 > Static239.anInt4514) {
				local2985 = local31[local18 - 1][local21];
				if (local2985 != null && local2985.aBoolean255) {
					Static134.aClass114_26.method2625(local2985);
				}
			}
			if (local21 > Static172.anInt3329) {
				local2985 = local31[local18][local21 - 1];
				if (local2985 != null && local2985.aBoolean255) {
					Static134.aClass114_26.method2625(local2985);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!wf;BI)V")
	public static void method3532(@OriginalArg(0) Class189[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(19) Class189 local19 = arg0[local7];
			if (local19 != null && local19.anInt5941 == arg1 && (!local19.aBoolean417 || !Static41.method692(local19))) {
				if (local19.anInt5915 == 0) {
					if (!local19.aBoolean417 && Static41.method692(local19) && Static208.aClass189_11 != local19) {
						continue;
					}
					method3532(arg0, local19.anInt5918);
					if (local19.aClass189Array4 != null) {
						method3532(local19.aClass189Array4, local19.anInt5918);
					}
					@Pc(79) Class4_Sub27 local79 = (Class4_Sub27) Static148.aClass85_13.method1845((long) local19.anInt5918);
					if (local79 != null) {
						Static194.method4280(local79.anInt4621);
					}
				}
				if (local19.anInt5915 == 6) {
					@Pc(113) int local113;
					if (local19.anInt5895 != -1 || local19.anInt5914 != -1) {
						@Pc(108) boolean local108 = Static268.method4236(local19);
						if (local108) {
							local113 = local19.anInt5914;
						} else {
							local113 = local19.anInt5895;
						}
						if (local113 != -1) {
							@Pc(129) Class46 local129 = Static156.method2501(local113);
							if (local129 != null) {
								local19.anInt5901 += Static211.anInt4156;
								while (local129.anIntArray94[local19.anInt5896] < local19.anInt5901) {
									local19.anInt5901 -= local129.anIntArray94[local19.anInt5896];
									local19.anInt5896++;
									if (local19.anInt5896 >= local129.anIntArray95.length) {
										local19.anInt5896 -= local129.anInt1242;
										if (local19.anInt5896 < 0 || local129.anIntArray95.length <= local19.anInt5896) {
											local19.anInt5896 = 0;
										}
									}
									local19.anInt5983 = local19.anInt5896 + 1;
									if (local129.anIntArray95.length <= local19.anInt5983) {
										local19.anInt5983 -= local129.anInt1242;
										if (local19.anInt5983 < 0 || local129.anIntArray95.length <= local19.anInt5983) {
											local19.anInt5983 = -1;
										}
									}
									Static205.method3283(local19);
								}
							}
						}
					}
					if (local19.anInt5905 != 0 && !local19.aBoolean417) {
						@Pc(261) int local261 = local19.anInt5905 >> 16;
						@Pc(265) int local265 = local261 * Static211.anInt4156;
						local113 = local19.anInt5905 << 16 >> 16;
						local19.anInt5948 = local265 + local19.anInt5948 & 0x7FF;
						local113 *= Static211.anInt4156;
						local19.anInt5980 = local113 + local19.anInt5980 & 0x7FF;
						Static205.method3283(local19);
					}
				}
			}
		}
	}
}
