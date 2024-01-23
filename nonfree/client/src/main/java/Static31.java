import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
	public static int anInt572;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!jd;")
	public static Class84 aClass84_14;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "[B")
	public static byte[] aByteArray2;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
	public static int anInt575;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!hj;")
	public static Class70 aClass70_2 = new Class70();

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!ac;")
	public static Class2_Sub2 aClass2_Sub2_2 = new Class2_Sub2(0, 0);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public static void method512(@OriginalArg(1) int arg0) {
		Static117.method2159(Static117.anInt2495, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static117.method2157(-50.0F, -60.0F, -50.0F);
		Static117.method2153(Static117.anInt2494, 0, false);
		Static117.method2154();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBIII)V")
	public static void method513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static68.anInt1509 <= arg0 - arg3 && Static43.anInt1054 >= arg0 + arg3 && arg2 - arg3 >= Static127.anInt2664 && arg2 + arg3 <= Static290.anInt6021) {
			Static76.method1382(arg3, arg2, arg0, arg1);
		} else {
			Static286.method4732(arg3, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)[Lclient!vn;")
	public static Class178[] method514() {
		if (Static13.aClass178Array1 == null) {
			@Pc(7) Class178[] local7 = Static196.method3332(Static299.aClass177_5);
			@Pc(9) int local9 = 0;
			@Pc(13) Class178[] local13 = new Class178[local7.length];
			label54: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(27) Class178 local27 = local7[local15];
				if ((local27.anInt5881 <= 0 || local27.anInt5881 >= 24) && local27.anInt5877 >= 800 && local27.anInt5883 >= 600) {
					for (@Pc(53) int local53 = 0; local53 < local9; local53++) {
						@Pc(64) Class178 local64 = local13[local53];
						if (local27.anInt5877 == local64.anInt5877 && local64.anInt5883 == local27.anInt5883) {
							if (local27.anInt5881 > local64.anInt5881) {
								local13[local53] = local27;
							}
							continue label54;
						}
					}
					local13[local9] = local27;
					local9++;
				}
			}
			Static13.aClass178Array1 = new Class178[local9];
			Static301.method296(local13, 0, Static13.aClass178Array1, 0, local9);
			@Pc(118) int[] local118 = new int[Static13.aClass178Array1.length];
			for (@Pc(120) int local120 = 0; local120 < Static13.aClass178Array1.length; local120++) {
				@Pc(128) Class178 local128 = Static13.aClass178Array1[local120];
				local118[local120] = local128.anInt5883 * local128.anInt5877;
			}
			Static152.method2617(Static13.aClass178Array1, local118);
		}
		return Static13.aClass178Array1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIIIIIIIIII)V")
	public static void method516(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(10) int local10 = arg5 - arg7;
		@Pc(15) int local15 = arg6 - arg4;
		if (Static52.anInt1205 > arg5) {
			local10++;
		}
		if (arg6 < Static142.anInt3081) {
			local15++;
		}
		@Pc(30) int local30;
		@Pc(42) int local42;
		@Pc(52) int local52;
		@Pc(57) int local57;
		@Pc(66) int local66;
		@Pc(119) int local119;
		@Pc(151) int local151;
		@Pc(163) int local163;
		@Pc(168) int local168;
		@Pc(213) int local213;
		@Pc(224) int local224;
		@Pc(235) int local235;
		@Pc(255) int local255;
		@Pc(278) int local278;
		@Pc(299) int local299;
		@Pc(377) int local377;
		@Pc(394) int local394;
		@Pc(195) int[][] local195;
		for (local30 = 0; local30 < local15; local30++) {
			local42 = arg1 * local30 >> 16;
			local52 = arg1 * (local30 + 1) >> 16;
			local57 = local52 - local42;
			if (local57 > 0) {
				local66 = local30 + arg4 >> 6;
				if (local66 >= 0 && Static278.anIntArrayArrayArray15.length - 1 >= local66) {
					local42 += arg2;
					local52 += arg2;
					@Pc(191) byte[][] local191 = Static19.aByteArrayArrayArray1[local66];
					local195 = Static278.anIntArrayArrayArray15[local66];
					@Pc(199) byte[][] local199 = Static279.aByteArrayArrayArray15[local66];
					@Pc(203) byte[][] local203 = Static294.aByteArrayArrayArray16[local66];
					@Pc(207) byte[][] local207 = Static59.aByteArrayArrayArray4[local66];
					@Pc(211) byte[][] local211 = Static119.aByteArrayArrayArray8[local66];
					for (local213 = 0; local213 < local10; local213++) {
						local224 = arg3 * local213 >> 16;
						local235 = (local213 + 1) * arg3 >> 16;
						@Pc(240) int local240 = local235 - local224;
						if (local240 > 0) {
							local235 += arg0;
							local255 = arg7 + local213 >> 6;
							local224 += arg0;
							@Pc(265) int local265 = arg7 + local213 & 0x3F;
							@Pc(271) int local271 = arg4 + local30 & 0x3F;
							local278 = (local265 << 6) + local271;
							if (local255 < 0 || local195.length - 1 < local255 || local195[local255] == null) {
								if (Static197.aClass2_Sub3_Sub18_2.anInt3680 != -1) {
									local299 = Static197.aClass2_Sub3_Sub18_2.anInt3680;
								} else if ((local30 + arg4 & 0x4) == (arg7 + local213 & 0x4)) {
									local299 = Static36.anIntArray56[Static89.anInt1995 + 1];
								} else {
									local299 = 4936552;
								}
								if (local255 < 0 || local255 > local195.length - 1) {
									if (local299 == 0) {
										local299 = 1;
									}
									Static160.method2788(local42, local224, local57, local240, local299);
									continue;
								}
							} else {
								local299 = local195[local255][local278];
							}
							if (local299 == 0) {
								local299 = 1;
							}
							local377 = local191[local255] == null ? 0 : Static36.anIntArray56[local191[local255][local278] & 0xFF];
							local394 = local203[local255] == null ? 0 : Static36.anIntArray56[local203[local255][local278] & 0xFF];
							@Pc(430) int local430;
							if (local377 == 0 && local394 == 0) {
								Static160.method2788(local42, local224, local57, local240, local299);
							} else {
								@Pc(426) byte local426;
								if (local377 != 0) {
									local426 = local199[local255] == null ? 0 : local199[local255][local278];
									local430 = local426 & 0xFC;
									if (local377 == -1) {
										local377 = 1;
									}
									if (local430 == 0 || local57 <= 1 || local240 <= 1) {
										Static160.method2788(local42, local224, local57, local240, local377);
									} else {
										Static289.method4810(local57, local224, local377, local426 & 0x3, true, local430 >> 2, local299, Static160.anIntArray254, local240, local42);
									}
								}
								if (local394 != 0) {
									if (local394 == -1) {
										local394 = local299;
									}
									local426 = local207[local255][local278];
									local430 = local426 & 0xFC;
									if (local430 == 0 || local57 <= 1 || local240 <= 1) {
										Static160.method2788(local42, local224, local57, local240, local394);
									}
									Static289.method4810(local57, local224, local394, local426 & 0x3, local377 == 0, local430 >> 2, 0, Static160.anIntArray254, local240, local42);
								}
							}
							if (local211[local255] != null) {
								@Pc(543) int local543 = local211[local255][local278] & 0xFF;
								if (local543 != 0) {
									if (local57 == 1) {
										local430 = local42;
									} else {
										local430 = local52 - 1;
									}
									@Pc(570) int local570;
									if (local240 == 1) {
										local570 = local224;
									} else {
										local570 = local235 - 1;
									}
									@Pc(576) int local576 = 13421772;
									if (local543 >= 5 && local543 <= 8 || local543 >= 13 && local543 <= 16 || local543 >= 21 && local543 <= 24 || local543 == 27 || local543 == 28) {
										local576 = 13369344;
										local543 -= 4;
									}
									if (local543 == 1) {
										Static160.method2780(local42, local224, local240, local576);
									} else if (local543 == 2) {
										Static160.method2791(local42, local224, local57, local576);
									} else if (local543 == 3) {
										Static160.method2780(local430, local224, local240, local576);
									} else if (local543 == 4) {
										Static160.method2791(local42, local570, local57, local576);
									} else if (local543 == 9) {
										Static160.method2780(local42, local224, local240, 16777215);
										Static160.method2791(local42, local224, local57, local576);
									} else if (local543 == 10) {
										Static160.method2780(local430, local224, local240, 16777215);
										Static160.method2791(local42, local224, local57, local576);
									} else if (local543 == 11) {
										Static160.method2780(local430, local224, local240, 16777215);
										Static160.method2791(local42, local570, local57, local576);
									} else if (local543 == 12) {
										Static160.method2780(local42, local224, local240, 16777215);
										Static160.method2791(local42, local570, local57, local576);
									} else if (local543 == 17) {
										Static160.method2791(local42, local224, 1, local576);
									} else if (local543 == 18) {
										Static160.method2791(local430, local224, 1, local576);
									} else if (local543 == 19) {
										Static160.method2791(local430, local570, 1, local576);
									} else if (local543 == 20) {
										Static160.method2791(local42, local570, 1, local576);
									} else {
										@Pc(722) int local722;
										if (local543 == 25) {
											for (local722 = 0; local722 < local240; local722++) {
												Static160.method2791(local722 + local42, local570 - local722, 1, local576);
											}
										} else if (local543 == 26) {
											for (local722 = 0; local722 < local240; local722++) {
												Static160.method2791(local42 + local722, local722 + local224, 1, local576);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local42 += arg2;
					for (@Pc(92) int local92 = 0; local92 < local10; local92++) {
						if (Static197.aClass2_Sub3_Sub18_2.anInt3680 != -1) {
							local119 = Static197.aClass2_Sub3_Sub18_2.anInt3680;
						} else if ((local30 + arg4 & 0x4) == (local92 + arg7 & 0x4)) {
							local119 = Static36.anIntArray56[Static89.anInt1995 + 1];
						} else {
							local119 = 4936552;
						}
						if (local119 == 0) {
							local119 = 1;
						}
						local151 = (local92 * arg3 >> 16) + arg0;
						local163 = arg0 + (arg3 * (local92 + 1) >> 16);
						local168 = local163 - local151;
						Static160.method2788(local42, local151, local57, local168, local119);
					}
				}
			}
		}
		for (local30 = -2; local30 < local15 + 2; local30++) {
			local42 = local30 * arg1 >> 16;
			local52 = (local30 + 1) * arg1 >> 16;
			local57 = local52 - local42;
			if (local57 > 0) {
				local42 += arg2;
				local66 = arg4 + local30 >> 6;
				if (local66 >= 0 && local66 <= Static202.anIntArrayArrayArray10.length - 1) {
					local195 = Static202.anIntArrayArrayArray10[local66];
					for (local119 = -2; local119 < local10 + 2; local119++) {
						local151 = local119 * arg3 >> 16;
						local163 = (local119 + 1) * arg3 >> 16;
						local168 = local163 - local151;
						if (local168 > 0) {
							@Pc(945) int local945 = local119 + arg7 >> 6;
							local151 += arg0;
							if (local945 >= 0 && local945 <= local195.length - 1) {
								local213 = ((local119 + arg7 & 0x3F) << 6) + (arg4 + local30 & 0x3F);
								if (local195[local945] != null) {
									local224 = local195[local945][local213];
									local235 = local224 & 0x1FFF;
									if (local235 != 0) {
										local255 = local224 >> 13 & 0x3;
										@Pc(1022) boolean local1022 = (local224 >> 15 & 0x1) == 1;
										@Pc(1028) Class112 local1028 = Static188.method3183(local235 - 1);
										@Pc(1034) Class71_Sub1 local1034 = local1028.method2797(local1022, local255);
										if (local1034 != null) {
											local278 = local57 * local1034.anInt5766 / 4;
											local299 = local168 * local1034.anInt5767 / 4;
											if (local1028.aBoolean275) {
												local377 = local224 >> 16 & 0xF;
												local394 = local224 >> 20 & 0xF;
												if ((local255 & 0x1) == 1) {
													local255 = local377;
													local377 = local394;
													local394 = local255;
												}
												local299 = local394 * local168;
												local278 = local57 * local377;
											}
											if (local278 != 0 && local299 != 0) {
												if (local1028.anInt3402 == 0) {
													local1034.method1860(local42, local168 + local151 - local299, local278, local299);
												} else {
													local1034.method1858(local42, local151 + local168 - local299, local278, local299, local1028.anInt3402);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
