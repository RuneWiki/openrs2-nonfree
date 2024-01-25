import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	public static int anInt2327 = 0;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Z")
	public static boolean aBoolean176 = false;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString21 = null;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "I")
	public static int anInt2329 = -1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
	public static int method2138(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZLclient!qh;)V")
	public static void method2139(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub3_Sub6_Sub1 arg1) {
		if (Static228.anInt3878 >= 400) {
			return;
		}
		if (arg1 != Static134.aClass3_Sub3_Sub6_Sub1_1) {
			@Pc(171) String local171;
			@Pc(106) int local106;
			if (arg1.anInt5507 == 0) {
				@Pc(60) boolean local60 = true;
				if (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5536 != -1 && arg1.anInt5536 != -1) {
					@Pc(84) int local84 = Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5504 <= arg1.anInt5504 ? arg1.anInt5504 : Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5504;
					@Pc(95) int local95 = arg1.anInt5536 > Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5536 ? Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5536 : arg1.anInt5536;
					local106 = local84 * 10 / 100 + local95 + 5;
					@Pc(113) int local113 = Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5504 - arg1.anInt5504;
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local106 < local113) {
						local60 = false;
					}
				}
				@Pc(136) String local136 = Static193.aClass44_3 == Static323.aClass44_4 ? Static170.aClass231_28.method5138(Static382.anInt6289) : Static371.aClass231_100.method5138(Static382.anInt6289);
				if (arg1.anInt5520 <= arg1.anInt5504) {
					local171 = arg1.method4685() + (local60 ? Static302.method4394(arg1.anInt5504, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5504) : "<col=ffffff>") + " (" + local136 + arg1.anInt5504 + ")";
				} else {
					local171 = arg1.method4685() + (local60 ? Static302.method4394(arg1.anInt5504, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5504) : "<col=ffffff>") + " (" + local136 + arg1.anInt5504 + "+" + (arg1.anInt5520 - arg1.anInt5504) + ")";
				}
			} else {
				local171 = arg1.method4685() + " (" + Static121.aClass231_34.method5138(Static382.anInt6289) + arg1.anInt5507 + ")";
			}
			if (Static274.aBoolean336) {
				if (!arg0 && (Static172.anInt3044 & 0x8) != 0) {
					Static361.method5112(Static263.aString38 + " -> <col=ffffff>" + local171, 2, 0, 0, Static60.anInt1241, true, aString21, -1, (long) arg1.anInt6731, false);
				}
			} else if (arg0) {
				Static361.method5112("", -1, 0, 0, -1, false, "<col=cccccc>" + local171, 0, 0L, true);
			} else {
				for (@Pc(262) int local262 = 7; local262 >= 0; local262--) {
					if (Static62.aStringArray6[local262] != null) {
						@Pc(270) short local270 = 0;
						if (Static307.aClass44_2 == Static323.aClass44_4 && Static62.aStringArray6[local262].equalsIgnoreCase(Static188.aClass231_52.method5138(Static382.anInt6289))) {
							if (arg1.anInt5504 > Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5504) {
								local270 = 2000;
							}
							if (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5525 != 0 && arg1.anInt5525 != 0) {
								if (arg1.anInt5525 == Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5525) {
									local270 = 2000;
								} else {
									local270 = 0;
								}
							}
						} else if (Static7.aBooleanArray1[local262]) {
							local270 = 2000;
						}
						@Pc(325) short local325 = (short) (Static75.aShortArray28[local262] + local270);
						local106 = Static70.anIntArray154[local262] == -1 ? Static414.anInt6928 : Static70.anIntArray154[local262];
						Static361.method5112("<col=ffffff>" + local171, local325, 0, 0, local106, true, Static62.aStringArray6[local262], -1, (long) arg1.anInt6731, false);
					}
				}
			}
			if (!arg0) {
				for (@Pc(413) Class6_Sub33 local413 = (Class6_Sub33) Static307.aClass88_23.method1882(); local413 != null; local413 = (Class6_Sub33) Static307.aClass88_23.method1891()) {
					if (local413.anInt5954 == 13) {
						local413.aString52 = "<col=ffffff>" + local171;
						return;
					}
				}
			}
		} else if (Static274.aBoolean336 && (Static172.anInt3044 & 0x10) != 0) {
			Static361.method5112(Static263.aString38 + " -> <col=ffffff>" + Static433.aClass231_79.method5138(Static382.anInt6289), 19, 0, 0, Static60.anInt1241, true, aString21, -1, 0L, false);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I")
	public static int method2140(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!pi;III)V")
	public static void method2141(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static267.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt2147 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass6_Sub6Array3[arg0.anInt2147++] = Static304.aClass66Array1[local21 - 1].aClass6_Sub6_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt2147; local21 < 4; local21++) {
			arg0.aClass6_Sub6Array3[local21] = null;
		}
	}
}
