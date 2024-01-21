import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1435 = Static187.method3089("Loading fonts )2 ");

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	public static int anInt2989 = 0;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	public static int anInt2991 = 0;

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1436 = Static187.method3089("");

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1437 = aClass92_1435;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	public static void method2192() {
		for (@Pc(15) Class1_Sub4 local15 = (Class1_Sub4) Static183.aClass97_21.method3372(); local15 != null; local15 = (Class1_Sub4) Static183.aClass97_21.method3377()) {
			@Pc(20) int local20 = local15.anInt490;
			if (Static24.method463(local20)) {
				@Pc(26) boolean local26 = true;
				@Pc(30) Class11[] local30 = Static194.aClass11ArrayArray1[local20];
				for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
					if (local30[local32] != null) {
						local26 = local30[local32].aBoolean28;
						break;
					}
				}
				if (!local26) {
					@Pc(60) int local60 = (int) local15.aLong251;
					@Pc(64) Class11 local64 = Static9.method2342(local60);
					if (local64 != null) {
						Static73.method1118(local64);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([IIIIII)V")
	public static void method2193(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class64 local13 = local7.aClass64_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt2677;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class31 local58 = local7.aClass31_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt1315;
		@Pc(67) int local67 = local58.anInt1318;
		@Pc(70) int local70 = local58.anInt1317;
		@Pc(73) int local73 = local58.anInt1316;
		@Pc(77) int[] local77 = Static133.anIntArrayArray18[local23];
		@Pc(81) int[] local81 = Static87.anIntArrayArray13[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)I")
	public static int method2194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	public static void method2195() {
		Static38.aClass1_Sub14_Sub1_3.anInt4061 = 0;
		Static177.anInt3805 = 0;
		Static184.anInt3960 = 0;
		Static153.anInt3183 = -1;
		Static63.anInt3562 = 0;
		Static18.aClass1_Sub14_Sub1_2.anInt4061 = 0;
		Static120.anInt2555 = 0;
		Static61.anInt1466 = 0;
		Static152.anInt3135 = 0;
		Static177.anInt3812 = -1;
		Static11.anInt273 = -1;
		Static35.aBoolean61 = false;
		Static41.anInt1085 = -1;
		for (@Pc(40) int local40 = 0; local40 < Static47.aClass8_Sub3_Sub1Array1.length; local40++) {
			if (Static47.aClass8_Sub3_Sub1Array1[local40] != null) {
				Static47.aClass8_Sub3_Sub1Array1[local40].anInt3582 = -1;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static177.aClass8_Sub3_Sub2Array1.length; local62++) {
			if (Static177.aClass8_Sub3_Sub2Array1[local62] != null) {
				Static177.aClass8_Sub3_Sub2Array1[local62].anInt3582 = -1;
			}
		}
		Static121.method3413();
		Static48.method862(30);
		for (@Pc(89) int local89 = 0; local89 < 100; local89++) {
			Static84.aBooleanArray5[local89] = true;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
	public static void method2196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static46.method3170(arg1, arg3, arg1 + arg2, arg3 + arg0);
		Static174.method2841();
		Static202.anInt4411++;
		Static118.method1732(true);
		Static9.method2343(true);
		Static118.method1732(false);
		Static9.method2343(false);
		Static61.method997();
		Static121.method3412();
		@Pc(48) int local48;
		@Pc(88) int local88;
		if (!Static40.aBoolean199) {
			local48 = Static129.anInt2670;
			if (local48 < Static188.anInt4439 / 256) {
				local48 = Static188.anInt4439 / 256;
			}
			if (Static179.aBooleanArray15[4] && Static205.anIntArray363[4] + 128 > local48) {
				local48 = Static205.anIntArray363[4] + 128;
			}
			local88 = Static106.anInt2306 + Static77.anInt1706 & 0x7FF;
			Static192.method3138(local88, Static64.method1027(Static15.aClass8_Sub3_Sub1_1.anInt3606, Static15.aClass8_Sub3_Sub1_1.anInt3600, Static192.anInt4180) - 50, Static203.anInt4428, local48 * 3 + 600, local48, Static1.anInt57);
		}
		if (Static40.aBoolean199) {
			local48 = Static149.method2256();
		} else {
			local48 = method2197();
		}
		@Pc(120) int local120 = Static107.anInt2320;
		local88 = Static186.anInt4074;
		@Pc(124) int local124 = Static100.anInt2140;
		@Pc(126) int local126 = Static47.anInt1197;
		@Pc(128) int local128 = Static10.anInt243;
		@Pc(171) int local171;
		for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
			if (Static179.aBooleanArray15[local130]) {
				local171 = (int) ((double) (Static150.anIntArray278[local130] * 2 + 1) * Math.random() - (double) Static150.anIntArray278[local130] + Math.sin((double) Static83.anIntArray155[local130] * ((double) Static77.anIntArray135[local130] / 100.0D)) * (double) Static205.anIntArray363[local130]);
				if (local130 == 1) {
					Static107.anInt2320 += local171;
				}
				if (local130 == 2) {
					Static100.anInt2140 += local171;
				}
				if (local130 == 4) {
					Static10.anInt243 += local171;
					if (Static10.anInt243 < 128) {
						Static10.anInt243 = 128;
					}
					if (Static10.anInt243 > 383) {
						Static10.anInt243 = 383;
					}
				}
				if (local130 == 0) {
					Static186.anInt4074 += local171;
				}
				if (local130 == 3) {
					Static47.anInt1197 = Static47.anInt1197 + local171 & 0x7FF;
				}
			}
		}
		local171 = Static85.anInt1855;
		@Pc(235) int local235 = Static126.anInt2633;
		if (arg1 <= local171 && arg1 + arg2 > local171 && arg3 <= local235 && arg0 + arg3 > local235) {
			Static56.anInt1344 = Static126.anInt2633 - arg3;
			Static184.anInt3959 = Static85.anInt1855 - arg1;
			Static180.anInt4483 = 0;
			Static101.aBoolean126 = true;
		} else {
			Static101.aBoolean126 = false;
			Static180.anInt4483 = 0;
		}
		Static140.method2075();
		Static46.method3173(arg1, arg3, arg2, arg0, 0);
		Static132.method1966(Static186.anInt4074, Static107.anInt2320, Static100.anInt2140, Static10.anInt243, Static47.anInt1197, local48);
		Static140.method2075();
		Static8.method160();
		Static63.method2679(arg2, arg1, arg3, arg0);
		Static17.method2611(arg1, arg3);
		((Class82) Static174.anInterface3_2).method2601(Static110.anInt2383);
		Static190.method3113(arg3, arg2, arg1, arg0);
		Static107.anInt2320 = local120;
		Static10.anInt243 = local128;
		Static47.anInt1197 = local126;
		Static186.anInt4074 = local88;
		Static100.anInt2140 = local124;
		if (Static173.aBoolean205 && Static48.method863() == 0) {
			Static173.aBoolean205 = false;
		}
		if (Static173.aBoolean205) {
			Static46.method3173(arg1, arg3, arg2, arg0, 0);
			Static80.method1240(Static26.aClass92_265, false);
		}
		if (!Static173.aBoolean205 && !Static35.aBoolean61 && local171 >= arg1 && local171 < arg1 + arg2 && arg3 <= local235 && arg3 + arg0 > local235) {
			Static17.method2618(local235, arg1, arg3, local171);
		}
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)I")
	private static int method2197() {
		@Pc(7) int local7 = 3;
		if (Static10.anInt243 < 310) {
			@Pc(19) int local19 = Static100.anInt2140 >> 7;
			@Pc(23) int local23 = Static186.anInt4074 >> 7;
			if ((Static146.aByteArrayArrayArray33[Static192.anInt4180][local23][local19] & 0x4) != 0) {
				local7 = Static192.anInt4180;
			}
			@Pc(43) int local43 = Static15.aClass8_Sub3_Sub1_1.anInt3600 >> 7;
			@Pc(48) int local48 = Static15.aClass8_Sub3_Sub1_1.anInt3606 >> 7;
			@Pc(56) int local56;
			if (local19 >= local48) {
				local56 = local19 - local48;
			} else {
				local56 = local48 - local19;
			}
			@Pc(71) int local71;
			if (local43 > local23) {
				local71 = local43 - local23;
			} else {
				local71 = local23 - local43;
			}
			@Pc(87) int local87;
			@Pc(89) int local89;
			if (local71 <= local56) {
				local87 = local71 * 65536 / local56;
				local89 = 32768;
				while (local19 != local48) {
					local89 += local87;
					if (local19 < local48) {
						local19++;
					} else if (local48 < local19) {
						local19--;
					}
					if ((Static146.aByteArrayArrayArray33[Static192.anInt4180][local23][local19] & 0x4) != 0) {
						local7 = Static192.anInt4180;
					}
					if (local89 >= 65536) {
						if (local43 > local23) {
							local23++;
						} else if (local43 < local23) {
							local23--;
						}
						if ((Static146.aByteArrayArrayArray33[Static192.anInt4180][local23][local19] & 0x4) != 0) {
							local7 = Static192.anInt4180;
						}
						local89 -= 65536;
					}
				}
			} else {
				local87 = local56 * 65536 / local71;
				local89 = 32768;
				while (local23 != local43) {
					if (local43 > local23) {
						local23++;
					} else if (local23 > local43) {
						local23--;
					}
					local89 += local87;
					if ((Static146.aByteArrayArrayArray33[Static192.anInt4180][local23][local19] & 0x4) != 0) {
						local7 = Static192.anInt4180;
					}
					if (local89 >= 65536) {
						if (local48 > local19) {
							local19++;
						} else if (local48 < local19) {
							local19--;
						}
						local89 -= 65536;
						if ((Static146.aByteArrayArrayArray33[Static192.anInt4180][local23][local19] & 0x4) != 0) {
							local7 = Static192.anInt4180;
						}
					}
				}
			}
		}
		if ((Static146.aByteArrayArrayArray33[Static192.anInt4180][Static15.aClass8_Sub3_Sub1_1.anInt3600 >> 7][Static15.aClass8_Sub3_Sub1_1.anInt3606 >> 7] & 0x4) != 0) {
			local7 = Static192.anInt4180;
		}
		return local7;
	}
}
