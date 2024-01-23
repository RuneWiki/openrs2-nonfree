import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "[I")
	public static int[] anIntArray428;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "Lclient!lc;")
	public static Class79 aClass79_34 = new Class79(30);

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "Z")
	public static boolean aBoolean253 = false;

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "[I")
	public static int[] anIntArray427 = new int[50];

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString345 = "scroll:";

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!ql;)V")
	public static void method3672(@OriginalArg(1) Class1_Sub13 arg0) {
		while (arg0.aByteArray29.length > arg0.anInt2395) {
			@Pc(13) boolean local13 = false;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			if (arg0.method1772() == 1) {
				local15 = arg0.method1772();
				local17 = arg0.method1772();
				local13 = true;
			}
			@Pc(38) int local38 = arg0.method1772();
			@Pc(42) int local42 = arg0.method1772();
			@Pc(53) int local53 = Static174.anInt3997 + Static46.anInt1376 - local42 * 64 - 1;
			@Pc(59) int local59 = local38 * 64 - Static209.anInt4574;
			@Pc(140) byte local140;
			@Pc(84) int local84;
			if (local59 >= 0 && local53 - 63 >= 0 && Static124.anInt3160 > local59 + 63 && local53 < Static174.anInt3997) {
				local84 = local59 >> 6;
				@Pc(88) int local88 = local53 >> 6;
				for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
					for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
						if (!local13 || local15 * 8 <= local90 && local90 < local15 * 8 + 8 && local94 >= local17 * 8 && local94 < local17 * 8 + 8) {
							local140 = arg0.method1756();
							if (local140 != 0) {
								if (Static138.aByteArrayArrayArray11[local84][local88] == null) {
									Static138.aByteArrayArrayArray11[local84][local88] = new byte[4096];
								}
								Static138.aByteArrayArrayArray11[local84][local88][(63 - local94 << 6) + local90] = local140;
								@Pc(177) byte local177 = arg0.method1756();
								if (Static67.aByteArrayArrayArray6[local84][local88] == null) {
									Static67.aByteArrayArrayArray6[local84][local88] = new byte[4096];
								}
								Static67.aByteArrayArrayArray6[local84][local88][local90 + (63 - local94 << 6)] = local177;
							}
						}
					}
				}
			} else {
				for (local84 = 0; local84 < (local13 ? 64 : 4096); local84++) {
					local140 = arg0.method1756();
					if (local140 != 0) {
						arg0.anInt2395++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lclient!cc;")
	public static Class20 method3674(@OriginalArg(1) int arg0) {
		@Pc(10) Class20 local10 = (Class20) Static242.aClass79_36.method2483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31 = Static233.aClass51_78.method1874(Static63.method1229(arg0), Static75.method1474(arg0));
		local10 = new Class20();
		if (local31 != null) {
			local10.method582(new Class1_Sub13(local31));
		}
		Static242.aClass79_36.method2486(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([BI)Z")
	public static boolean method3675(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub13 local4 = new Class1_Sub13(arg0);
		@Pc(12) int local12 = local4.method1772();
		if (local12 != 1) {
			return false;
		}
		@Pc(33) boolean local33 = local4.method1772() == 1;
		if (local33) {
			Static9.method181(local4);
		}
		Static178.method3053(local4);
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method3676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static134.anInt3305++;
		Static262.anInt5505 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(30) int local30;
		@Pc(33) int local33;
		@Pc(177) int local177;
		for (@Pc(23) int local23 = Static63.anInt1779; local23 < Static256.anInt5440; local23++) {
			@Pc(28) Class1_Sub16[][] local28 = Static142.aClass1_Sub16ArrayArrayArray4[local23];
			for (local30 = Static46.anInt1375; local30 < Static131.anInt1077; local30++) {
				for (local33 = Static35.anInt973; local33 < Static167.anInt3901; local33++) {
					@Pc(40) Class1_Sub16 local40 = local28[local30][local33];
					if (local40 != null) {
						if (Static77.aBooleanArrayArray1[local30 + Static187.anInt4201 - Static153.anInt3688][local33 + Static187.anInt4201 - Static148.anInt446] && (arg3 == null || local23 < arg4 || arg3[local23][local30][local33] != arg5)) {
							local40.aBoolean159 = true;
							local40.aBoolean157 = true;
							if (local40.anInt2929 > 0) {
								local40.aBoolean158 = true;
							} else {
								local40.aBoolean158 = false;
							}
							Static262.anInt5505++;
						} else {
							local40.aBoolean159 = false;
							local40.aBoolean157 = false;
							local40.anInt2925 = 0;
							if (local30 >= local9 && local30 <= local13 && local33 >= local17 && local33 <= local21) {
								if (local40.aClass144_1 != null) {
									@Pc(97) Class144 local97 = local40.aClass144_1;
									local97.aClass9_8.method3593(0, local23, local97.anInt5341, local97.anInt5345, local97.anInt5340);
									if (local97.aClass9_9 != null) {
										local97.aClass9_9.method3593(0, local23, local97.anInt5341, local97.anInt5345, local97.anInt5340);
									}
								}
								if (local40.aClass85_1 != null) {
									@Pc(128) Class85 local128 = local40.aClass85_1;
									local128.aClass9_3.method3593(local128.anInt3490, local23, local128.anInt3484, local128.anInt3482, local128.anInt3483);
									if (local128.aClass9_4 != null) {
										local128.aClass9_4.method3593(local128.anInt3490, local23, local128.anInt3484, local128.anInt3482, local128.anInt3483);
									}
								}
								if (local40.aClass148_1 != null) {
									@Pc(161) Class148 local161 = local40.aClass148_1;
									local161.aClass9_10.method3593(0, local23, local161.anInt5464, local161.anInt5465, local161.anInt5466);
								}
								if (local40.aClass47Array1 != null) {
									for (local177 = 0; local177 < local40.anInt2929; local177++) {
										@Pc(183) Class47 local183 = local40.aClass47Array1[local177];
										local183.aClass9_1.method3593(local183.anInt2157, local23, local183.anInt2145, local183.anInt2155, local183.anInt2154);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static38.anIntArrayArrayArray6 == Static32.anIntArrayArrayArray5;
		@Pc(268) int local268;
		@Pc(273) int local273;
		@Pc(277) int local277;
		@Pc(259) int local259;
		for (local30 = Static63.anInt1779; local30 < Static256.anInt5440; local30++) {
			@Pc(247) Class1_Sub16[][] local247 = Static142.aClass1_Sub16ArrayArrayArray4[local30];
			for (@Pc(250) int local250 = -Static187.anInt4201; local250 <= 0; local250++) {
				local177 = Static153.anInt3688 + local250;
				local259 = Static153.anInt3688 - local250;
				if (local177 >= Static46.anInt1375 || local259 < Static131.anInt1077) {
					for (local268 = -Static187.anInt4201; local268 <= 0; local268++) {
						local273 = Static148.anInt446 + local268;
						local277 = Static148.anInt446 - local268;
						@Pc(289) Class1_Sub16 local289;
						if (local177 >= Static46.anInt1375) {
							if (local273 >= Static35.anInt973) {
								local289 = local247[local177][local273];
								if (local289 != null && local289.aBoolean159) {
									Static251.method4068(local289, true);
								}
							}
							if (local277 < Static167.anInt3901) {
								local289 = local247[local177][local277];
								if (local289 != null && local289.aBoolean159) {
									Static251.method4068(local289, true);
								}
							}
						}
						if (local259 < Static131.anInt1077) {
							if (local273 >= Static35.anInt973) {
								local289 = local247[local259][local273];
								if (local289 != null && local289.aBoolean159) {
									Static251.method4068(local289, true);
								}
							}
							if (local277 < Static167.anInt3901) {
								local289 = local247[local259][local277];
								if (local289 != null && local289.aBoolean159) {
									Static251.method4068(local289, true);
								}
							}
						}
						if (Static262.anInt5505 == 0) {
							if (!local240) {
								Static112.aBoolean162 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local33 = Static63.anInt1779; local33 < Static256.anInt5440; local33++) {
			@Pc(375) Class1_Sub16[][] local375 = Static142.aClass1_Sub16ArrayArrayArray4[local33];
			for (local177 = -Static187.anInt4201; local177 <= 0; local177++) {
				local259 = Static153.anInt3688 + local177;
				local268 = Static153.anInt3688 - local177;
				if (local259 >= Static46.anInt1375 || local268 < Static131.anInt1077) {
					for (local273 = -Static187.anInt4201; local273 <= 0; local273++) {
						local277 = Static148.anInt446 + local273;
						@Pc(405) int local405 = Static148.anInt446 - local273;
						@Pc(417) Class1_Sub16 local417;
						if (local259 >= Static46.anInt1375) {
							if (local277 >= Static35.anInt973) {
								local417 = local375[local259][local277];
								if (local417 != null && local417.aBoolean159) {
									Static251.method4068(local417, false);
								}
							}
							if (local405 < Static167.anInt3901) {
								local417 = local375[local259][local405];
								if (local417 != null && local417.aBoolean159) {
									Static251.method4068(local417, false);
								}
							}
						}
						if (local268 < Static131.anInt1077) {
							if (local277 >= Static35.anInt973) {
								local417 = local375[local268][local277];
								if (local417 != null && local417.aBoolean159) {
									Static251.method4068(local417, false);
								}
							}
							if (local405 < Static167.anInt3901) {
								local417 = local375[local268][local405];
								if (local417 != null && local417.aBoolean159) {
									Static251.method4068(local417, false);
								}
							}
						}
						if (Static262.anInt5505 == 0) {
							if (!local240) {
								Static112.aBoolean162 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static112.aBoolean162 = false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)Lclient!nk;")
	public static Class95 method3677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(33) long local33 = (long) arg3 & 0xFFFFL | 0xFFFFL << 32 & (long) arg2 << 32 | 0xFFFFL << 48 & (long) arg0 << 48 | (long) arg1 << 16 & 0xFFFFL << 16;
		@Pc(39) Class95 local39 = (Class95) Static170.aClass79_26.method2483(local33);
		if (local39 != null) {
			return local39;
		}
		@Pc(54) Class139[] local54 = null;
		@Pc(58) Class107 local58 = Static264.method4214(arg3);
		if (local58.anIntArray312 != null) {
			local54 = new Class139[local58.anIntArray312.length];
			for (@Pc(68) int local68 = 0; local68 < local54.length; local68++) {
				@Pc(77) Class82 local77 = Static112.method2260(local58.anIntArray312[local68]);
				local54[local68] = new Class139(local77.anInt3322, local77.anInt3315, local77.anInt3316, local77.anInt3320, local77.anInt3318, local77.anInt3327, local77.anInt3324, local77.aBoolean176);
			}
		}
		local39 = new Class95(local58.anInt4175, local54, local58.anInt4179, arg0, arg2, arg1);
		Static170.aClass79_26.method2486(local39, local33);
		return local39;
	}
}
