import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	public static int anInt4499;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	public static int anInt4502;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
	public static int anInt4503;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString142 = "Discard";

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
	public static int anInt4504 = 0;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Z")
	public static boolean aBoolean241 = true;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	public static int anInt4505 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V")
	public static void method3586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static240.method4148(false);
		Static192.anInt4280 = arg2;
		Static97.anInt6053 = arg0;
		Static37.method864(arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ok;III)V")
	public static void method3587(@OriginalArg(0) Class116 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4322 == 1) {
			Static106.method1718(-1, (short) 28, 0, arg0.anInt4290, "", arg0.aString132, 0L);
		}
		@Pc(34) String local34;
		if (arg0.anInt4322 == 2 && !Static16.aBoolean22) {
			local34 = Static254.method4239(arg0);
			if (local34 != null) {
				Static106.method1718(-1, (short) 59, -1, arg0.anInt4290, "<col=00ff00>" + arg0.aString133, local34, 0L);
			}
		}
		if (arg0.anInt4322 == 3) {
			Static106.method1718(-1, (short) 22, 0, arg0.anInt4290, "", Static254.aString170, 0L);
		}
		if (arg0.anInt4322 == 4) {
			Static106.method1718(-1, (short) 60, 0, arg0.anInt4290, "", arg0.aString132, 0L);
		}
		if (arg0.anInt4322 == 5) {
			Static106.method1718(-1, (short) 30, 0, arg0.anInt4290, "", arg0.aString132, 0L);
		}
		if (arg0.anInt4322 == 6 && Static2.aClass116_16 == null) {
			Static106.method1718(-1, (short) 31, -1, arg0.anInt4290, "", arg0.aString132, 0L);
		}
		@Pc(160) int local160;
		@Pc(158) int local158;
		if (arg0.anInt4376 == 2) {
			local158 = 0;
			for (local160 = 0; local160 < arg0.anInt4347; local160++) {
				for (@Pc(170) int local170 = 0; local170 < arg0.anInt4292; local170++) {
					@Pc(185) int local185 = (arg0.anInt4373 + 32) * local170;
					@Pc(192) int local192 = (arg0.anInt4377 + 32) * local160;
					if (local158 < 20) {
						local192 += arg0.anIntArray400[local158];
						local185 += arg0.anIntArray401[local158];
					}
					if (arg2 >= local185 && arg1 >= local192 && local185 + 32 > arg2 && arg1 < local192 + 32) {
						Static227.aClass116_14 = arg0;
						Static289.anInt6097 = local158;
						if (arg0.anIntArray404[local158] > 0) {
							@Pc(251) Class1_Sub8 local251 = Static37.method866(arg0);
							@Pc(260) Class138 local260 = Static238.method4099(arg0.anIntArray404[local158] - 1);
							if (Static272.anInt5854 == 1 && local251.method1098()) {
								if (arg0.anInt4290 != Static190.anInt4240 || local158 != Static209.anInt4643) {
									Static106.method1718(-1, (short) 11, local158, arg0.anInt4290, Static95.aString70 + " -> <col=ff9040>" + local260.aString159, Static5.aString3, (long) local260.anInt5060);
								}
							} else if (Static16.aBoolean22 && local251.method1098()) {
								@Pc(559) Class1_Sub2_Sub19 local559 = Static27.anInt755 == -1 ? null : Static114.method1863(Static27.anInt755);
								if ((Static177.anInt3986 & 0x10) != 0 && (local559 == null || local260.method4004(Static27.anInt755, local559.anInt5556) != local559.anInt5556)) {
									Static106.method1718(Static266.anInt5785, (short) 4, local158, arg0.anInt4290, Static128.aString80 + " -> <col=ff9040>" + local260.aString159, Static280.aString193, (long) local260.anInt5060);
								}
							} else {
								@Pc(284) String[] local284 = local260.aStringArray26;
								if (Static208.aBoolean246) {
									local284 = Static40.method1451(local284);
								}
								@Pc(297) int local297;
								@Pc(316) byte local316;
								if (local251.method1098()) {
									for (local297 = 4; local297 >= 3; local297--) {
										if (local284 != null && local284[local297] != null) {
											if (local297 == 3) {
												local316 = 7;
											} else {
												local316 = 46;
											}
											Static106.method1718(-1, local316, local158, arg0.anInt4290, "<col=ff9040>" + local260.aString159, local284[local297], (long) local260.anInt5060);
										}
									}
								}
								if (local251.method1103()) {
									Static106.method1718(Static180.anInt4069, (short) 33, local158, arg0.anInt4290, "<col=ff9040>" + local260.aString159, Static5.aString3, (long) local260.anInt5060);
								}
								if (local251.method1098() && local284 != null) {
									for (local297 = 2; local297 >= 0; local297--) {
										if (local284[local297] != null) {
											local316 = 0;
											if (local297 == 0) {
												local316 = 38;
											}
											if (local297 == 1) {
												local316 = 3;
											}
											if (local297 == 2) {
												local316 = 10;
											}
											Static106.method1718(-1, local316, local158, arg0.anInt4290, "<col=ff9040>" + local260.aString159, local284[local297], (long) local260.anInt5060);
										}
									}
								}
								local284 = arg0.aStringArray20;
								if (Static208.aBoolean246) {
									local284 = Static40.method1451(local284);
								}
								if (local284 != null) {
									for (local297 = 4; local297 >= 0; local297--) {
										if (local284[local297] != null) {
											local316 = 0;
											if (local297 == 0) {
												local316 = 21;
											}
											if (local297 == 1) {
												local316 = 35;
											}
											if (local297 == 2) {
												local316 = 5;
											}
											if (local297 == 3) {
												local316 = 47;
											}
											if (local297 == 4) {
												local316 = 20;
											}
											Static106.method1718(-1, local316, local158, arg0.anInt4290, "<col=ff9040>" + local260.aString159, local284[local297], (long) local260.anInt5060);
										}
									}
								}
								Static106.method1718(Static204.anInt4559, (short) 1002, local158, arg0.anInt4290, "<col=ff9040>" + local260.aString159, Static140.aString92, (long) local260.anInt5060);
							}
						}
					}
					local158++;
				}
			}
		}
		if (!arg0.aBoolean224) {
			return;
		}
		if (!Static16.aBoolean22) {
			for (local158 = 9; local158 >= 5; local158--) {
				@Pc(706) String local706 = Static129.method2195(arg0, local158);
				if (local706 != null) {
					Static106.method1718(Static227.method3945(arg0, local158), (short) 1006, arg0.anInt4297, arg0.anInt4290, arg0.aString131, local706, (long) (local158 + 1));
				}
			}
			local34 = Static254.method4239(arg0);
			if (local34 != null) {
				Static106.method1718(-1, (short) 59, arg0.anInt4297, arg0.anInt4290, arg0.aString131, local34, 0L);
			}
			for (local160 = 4; local160 >= 0; local160--) {
				@Pc(773) String local773 = Static129.method2195(arg0, local160);
				if (local773 != null) {
					Static106.method1718(Static227.method3945(arg0, local160), (short) 2, arg0.anInt4297, arg0.anInt4290, arg0.aString131, local773, (long) (local160 + 1));
				}
			}
			if (Static37.method866(arg0).method1094()) {
				if (arg0.aString128 == null) {
					Static106.method1718(-1, (short) 31, arg0.anInt4297, arg0.anInt4290, "", Static50.aString46, 0L);
				} else {
					Static106.method1718(-1, (short) 31, arg0.anInt4297, arg0.anInt4290, "", arg0.aString128, 0L);
				}
			}
		} else if (Static37.method866(arg0).method1097() && (Static177.anInt3986 & 0x20) != 0) {
			Static106.method1718(Static266.anInt5785, (short) 19, arg0.anInt4297, arg0.anInt4290, Static128.aString80 + " -> " + arg0.aString131, Static280.aString193, 0L);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method3589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static212.anInt4717 * 128) {
			arg0 = Static212.anInt4717 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static293.anInt6189 * 128) {
			arg2 = Static293.anInt6189 * 128 - 1;
		}
		Static125.anInt2794 = Class91.anIntArray319[arg3];
		Static145.anInt3480 = Class91.anIntArray320[arg3];
		Static132.anInt2996 = Class91.anIntArray319[arg4];
		Static2.anInt5658 = Class91.anIntArray320[arg4];
		Static292.anInt6173 = arg0;
		Static114.anInt2499 = arg1;
		Static197.anInt4472 = arg2;
		Static97.anInt6060 = arg0 / 128;
		Static16.anInt444 = arg2 / 128;
		Static131.anInt2971 = Static97.anInt6060 - Static34.anInt918;
		if (Static131.anInt2971 < 0) {
			Static131.anInt2971 = 0;
		}
		Static78.anInt1884 = Static16.anInt444 - Static34.anInt918;
		if (Static78.anInt1884 < 0) {
			Static78.anInt1884 = 0;
		}
		Static193.anInt4317 = Static97.anInt6060 + Static34.anInt918;
		if (Static193.anInt4317 > Static212.anInt4717) {
			Static193.anInt4317 = Static212.anInt4717;
		}
		Static15.anInt400 = Static16.anInt444 + Static34.anInt918;
		if (Static15.anInt400 > Static293.anInt6189) {
			Static15.anInt400 = Static293.anInt6189;
		}
		@Pc(99) short local99;
		if (Static296.aBoolean335) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static34.anInt918 + Static34.anInt918 + 2; local104++) {
			for (local113 = 0; local113 < Static34.anInt918 + Static34.anInt918 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static34.anInt918 << 7) - (Static292.anInt6173 & 0x7F);
				@Pc(140) int local140 = (local113 - Static34.anInt918 << 7) - (Static197.anInt4472 & 0x7F);
				@Pc(146) int local146 = Static97.anInt6060 + local104 - Static34.anInt918;
				@Pc(152) int local152 = Static16.anInt444 + local113 - Static34.anInt918;
				if (local146 >= 0 && local152 >= 0 && local146 < Static212.anInt4717 && local152 < Static293.anInt6189) {
					@Pc(176) int local176;
					if (Static298.anIntArrayArrayArray19 == null) {
						local176 = Static113.anIntArrayArrayArray10[0][local146][local152] + 128 - Static114.anInt2499;
					} else {
						local176 = Static298.anIntArrayArrayArray19[0][local146][local152] + 128 - Static114.anInt2499;
					}
					@Pc(201) int local201 = Static113.anIntArrayArrayArray10[3][local146][local152] - Static114.anInt2499 - 1000;
					Static274.aBooleanArrayArray5[local104][local113] = Static2.method4407(local130, local201, local176, local140, local99);
				} else {
					Static274.aBooleanArrayArray5[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static34.anInt918 + Static34.anInt918 + 1; local104++) {
			for (local113 = 0; local113 < Static34.anInt918 + Static34.anInt918 + 1; local113++) {
				Static42.aBooleanArrayArray2[local104][local113] = Static274.aBooleanArrayArray5[local104][local113] || Static274.aBooleanArrayArray5[local104 + 1][local113] || Static274.aBooleanArrayArray5[local104][local113 + 1] || Static274.aBooleanArrayArray5[local104 + 1][local113 + 1];
			}
		}
		Static136.anIntArray275 = arg6;
		Static231.anIntArray554 = arg7;
		Static89.anIntArray214 = arg8;
		Static197.anIntArray455 = arg9;
		Static73.anIntArray184 = arg10;
		Static58.method1140();
		if (Static59.aClass1_Sub14ArrayArrayArray1 != null) {
			Static146.method2773(true);
			Static146.method2772(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static296.aBoolean335) {
				Static197.aBoolean238 = false;
				Static141.method2524(0, 0);
				Static201.method3577(null);
				Static67.method1287();
			}
			Static146.method2773(false);
		}
		Static146.method2772(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}
}
