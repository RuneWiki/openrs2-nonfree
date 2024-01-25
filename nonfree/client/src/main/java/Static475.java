import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!op", name = "A", descriptor = "I")
	public static int anInt7494 = 1;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(III)V")
	public static void method6472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static219.method3261(local7.aClass9_Sub1_Sub4_1);
			if (local7.aClass9_Sub1_Sub4_1 != null) {
				local7.aClass9_Sub1_Sub4_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method6473(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null || arg1 == null) {
			return false;
		} else if (arg3.startsWith("#") || arg1.startsWith("#")) {
			return arg3.equals(arg1);
		} else {
			return arg2.equals(arg0);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!fe;IIIIIIIIII)Z")
	public static boolean method6474(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg9;
		@Pc(18) int local18 = arg2 - 64;
		Static716.anIntArrayArray69[64][64] = 99;
		@Pc(36) int local36 = arg9 - 64;
		Static296.anIntArrayArray20[64][64] = 0;
		@Pc(44) byte local44 = 0;
		@Pc(46) int local46 = 0;
		Static386.anIntArray438[0] = arg2;
		@Pc(53) int local53 = local44 + 1;
		Static267.anIntArray327[0] = arg9;
		@Pc(58) int[][] local58 = arg1.anIntArrayArray9;
		while (true) {
			label282: while (true) {
				@Pc(78) int local78;
				@Pc(73) int local73;
				@Pc(90) int local90;
				@Pc(96) int local96;
				@Pc(278) int local278;
				@Pc(329) int local329;
				do {
					do {
						do {
							label259: do {
								if (local53 == local46) {
									Static290.anInt4444 = local9;
									Static286.anInt4374 = local7;
									return false;
								}
								local9 = Static267.anIntArray327[local46];
								local7 = Static386.anIntArray438[local46];
								local73 = local9 - local36;
								local78 = local7 - local18;
								local46 = local46 + 1 & 0xFFF;
								local90 = local7 - arg1.anInt2978;
								local96 = local9 - arg1.anInt2989;
								if (arg8 == -4) {
									if (local7 == arg7 && arg3 == local9) {
										Static286.anInt4374 = local7;
										Static290.anInt4444 = local9;
										return true;
									}
								} else if (arg8 == -3) {
									if (Static374.method5105(arg4, arg6, local7, arg7, arg0, local9, arg3, arg0)) {
										Static286.anInt4374 = local7;
										Static290.anInt4444 = local9;
										return true;
									}
								} else if (arg8 == -2) {
									if (arg1.method2718(arg5, local9, arg4, arg6, arg7, arg0, arg0, arg3, local7)) {
										Static290.anInt4444 = local9;
										Static286.anInt4374 = local7;
										return true;
									}
								} else if (arg8 == -1) {
									if (arg1.method2720(arg4, local7, local9, arg5, arg7, arg3, arg6, arg0)) {
										Static290.anInt4444 = local9;
										Static286.anInt4374 = local7;
										return true;
									}
								} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
									if (arg1.method2729(local7, arg10, arg0, arg8, arg7, arg3, local9)) {
										Static290.anInt4444 = local9;
										Static286.anInt4374 = local7;
										return true;
									}
								} else if (arg1.method2722(arg3, arg0, arg10, arg7, local7, arg8, local9)) {
									Static290.anInt4444 = local9;
									Static286.anInt4374 = local7;
									return true;
								}
								local278 = Static296.anIntArrayArray20[local78][local73] + 1;
								if (local78 > 0 && Static716.anIntArrayArray69[local78 - 1][local73] == 0 && (local58[local90 - 1][local96] & 0x43A40000) == 0 && (local58[local90 - 1][arg0 + local96 - 1] & 0x4E240000) == 0) {
									local329 = 1;
									while (true) {
										if (arg0 - 1 <= local329) {
											Static386.anIntArray438[local53] = local7 - 1;
											Static267.anIntArray327[local53] = local9;
											Static716.anIntArrayArray69[local78 - 1][local73] = 2;
											local53 = local53 + 1 & 0xFFF;
											Static296.anIntArrayArray20[local78 - 1][local73] = local278;
											break;
										}
										if ((local58[local90 - 1][local96 + local329] & 0x4FA40000) != 0) {
											break;
										}
										local329++;
									}
								}
								if (128 - arg0 > local78 && Static716.anIntArrayArray69[local78 + 1][local73] == 0 && (local58[local90 + arg0][local96] & 0x60E40000) == 0 && (local58[arg0 + local90][local96 + arg0 - 1] & 0x78240000) == 0) {
									local329 = 1;
									while (true) {
										if (local329 >= arg0 - 1) {
											Static386.anIntArray438[local53] = local7 + 1;
											Static267.anIntArray327[local53] = local9;
											Static716.anIntArrayArray69[local78 + 1][local73] = 8;
											local53 = local53 + 1 & 0xFFF;
											Static296.anIntArrayArray20[local78 + 1][local73] = local278;
											break;
										}
										if ((local58[arg0 + local90][local96 + local329] & 0x78E40000) != 0) {
											break;
										}
										local329++;
									}
								}
								if (local73 > 0 && Static716.anIntArrayArray69[local78][local73 - 1] == 0 && (local58[local90][local96 - 1] & 0x43A40000) == 0 && (local58[arg0 + local90 - 1][local96 - 1] & 0x60E40000) == 0) {
									local329 = 1;
									while (true) {
										if (local329 >= arg0 - 1) {
											Static386.anIntArray438[local53] = local7;
											Static267.anIntArray327[local53] = local9 - 1;
											Static716.anIntArrayArray69[local78][local73 - 1] = 1;
											local53 = local53 + 1 & 0xFFF;
											Static296.anIntArrayArray20[local78][local73 - 1] = local278;
											break;
										}
										if ((local58[local90 + local329][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local329++;
									}
								}
								if (local73 < 128 - arg0 && Static716.anIntArrayArray69[local78][local73 + 1] == 0 && (local58[local90][local96 + arg0] & 0x4E240000) == 0 && (local58[arg0 + local90 - 1][local96 + arg0] & 0x78240000) == 0) {
									local329 = 1;
									while (true) {
										if (local329 >= arg0 - 1) {
											Static386.anIntArray438[local53] = local7;
											Static267.anIntArray327[local53] = local9 + 1;
											local53 = local53 + 1 & 0xFFF;
											Static716.anIntArrayArray69[local78][local73 + 1] = 4;
											Static296.anIntArrayArray20[local78][local73 + 1] = local278;
											break;
										}
										if ((local58[local329 + local90][arg0 + local96] & 0x7E240000) != 0) {
											break;
										}
										local329++;
									}
								}
								if (local78 > 0 && local73 > 0 && Static716.anIntArrayArray69[local78 - 1][local73 - 1] == 0 && (local58[local90 - 1][local96 - 1] & 0x43A40000) == 0) {
									local329 = 1;
									while (true) {
										if (local329 >= arg0) {
											Static386.anIntArray438[local53] = local7 - 1;
											Static267.anIntArray327[local53] = local9 - 1;
											local53 = local53 + 1 & 0xFFF;
											Static716.anIntArrayArray69[local78 - 1][local73 - 1] = 3;
											Static296.anIntArrayArray20[local78 - 1][local73 - 1] = local278;
											break;
										}
										if ((local58[local90 - 1][local96 + local329 - 1] & 0x4FA40000) != 0 || (local58[local90 + local329 - 1][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local329++;
									}
								}
								if (local78 < 128 - arg0 && local73 > 0 && Static716.anIntArrayArray69[local78 + 1][local73 - 1] == 0 && (local58[arg0 + local90][local96 - 1] & 0x60E40000) == 0) {
									local329 = 1;
									while (true) {
										if (local329 >= arg0) {
											Static386.anIntArray438[local53] = local7 + 1;
											Static267.anIntArray327[local53] = local9 - 1;
											Static716.anIntArrayArray69[local78 + 1][local73 - 1] = 9;
											local53 = local53 + 1 & 0xFFF;
											Static296.anIntArrayArray20[local78 + 1][local73 - 1] = local278;
											break;
										}
										if ((local58[arg0 + local90][local329 + local96 - 1] & 0x78E40000) != 0 || (local58[local329 + local90][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local329++;
									}
								}
								if (local78 > 0 && local73 < 128 - arg0 && Static716.anIntArrayArray69[local78 - 1][local73 + 1] == 0 && (local58[local90 - 1][local96 + arg0] & 0x4E240000) == 0) {
									for (local329 = 1; local329 < arg0; local329++) {
										if ((local58[local90 - 1][local96 + local329] & 0x4FA40000) != 0 || (local58[local90 + local329 - 1][local96 + arg0] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static386.anIntArray438[local53] = local7 - 1;
									Static267.anIntArray327[local53] = local9 + 1;
									local53 = local53 + 1 & 0xFFF;
									Static716.anIntArrayArray69[local78 - 1][local73 + 1] = 6;
									Static296.anIntArrayArray20[local78 - 1][local73 + 1] = local278;
								}
							} while (128 - arg0 <= local78);
						} while (local73 >= 128 - arg0);
					} while (Static716.anIntArrayArray69[local78 + 1][local73 + 1] != 0);
				} while ((local58[arg0 + local90][local96 + arg0] & 0x78240000) != 0);
				for (local329 = 1; local329 < arg0; local329++) {
					if ((local58[local329 + local90][local96 + arg0] & 0x7E240000) != 0 || (local58[arg0 + local90][local96 + local329] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static386.anIntArray438[local53] = local7 + 1;
				Static267.anIntArray327[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static716.anIntArrayArray69[local78 + 1][local73 + 1] = 12;
				Static296.anIntArrayArray20[local78 + 1][local73 + 1] = local278;
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V")
	public static void method6475(@OriginalArg(1) int arg0) {
		if (Static98.anInt2140 == 7 && (Static74.anInt1708 == 0 && Static446.anInt6827 == 0)) {
			Static565.anInt8601 = arg0;
			Static336.method4832(9);
		}
	}
}
