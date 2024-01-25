import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!uj;")
	public static Class204 aClass204_3;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_171 = new Class221(7, 6);

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_172 = new Class221(13, -1);

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_16 = new Class143(8, 3);

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "[I")
	public static final int[] anIntArray403 = new int[14];

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "[I")
	public static int[] anIntArray404 = new int[2];

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(JIIIZ)Ljava/lang/String;")
	public static String method4391(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(35) boolean local35 = false;
		if (arg0 < 0L) {
			local35 = true;
			arg0 = -arg0;
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(26);
		@Pc(56) int local56;
		@Pc(61) int local61;
		if (arg2 > 0) {
			for (local56 = 0; local56 < arg2; local56++) {
				local61 = (int) arg0;
				arg0 /= 10L;
				local49.append((char) (local61 + 48 - (int) arg0 * 10));
			}
			local49.append(local7);
		}
		local56 = 0;
		while (true) {
			local61 = (int) arg0;
			arg0 /= 10L;
			local49.append((char) (local61 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local35) {
					local49.append('-');
				}
				return local49.reverse().toString();
			}
			if (arg3) {
				local56++;
				if (local56 % 3 == 0) {
					local49.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)V")
	public static void method4392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub9_Sub4 local13 = Static98.method1971(1, arg1);
		local13.method1801();
		local13.anInt1723 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIBLclient!ek;IIIII)Z")
	public static boolean method4393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class61 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg3;
		@Pc(17) int local17 = arg8 - 64;
		@Pc(22) int local22 = arg3 - 64;
		Static182.anIntArrayArray26[64][64] = 99;
		Static233.anIntArrayArray47[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static309.anIntArray471[0] = arg8;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static270.anIntArray432[0] = arg3;
		@Pc(55) int[][] local55 = arg5.anIntArrayArray19;
		while (true) {
			label282: while (true) {
				@Pc(81) int local81;
				@Pc(76) int local76;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(250) int local250;
				@Pc(292) int local292;
				do {
					do {
						do {
							label259: do {
								if (local50 == local47) {
									Static49.anInt821 = local7;
									Static152.anInt3473 = local9;
									return false;
								}
								local7 = Static309.anIntArray471[local47];
								local9 = Static270.anIntArray432[local47];
								local47 = local47 + 1 & 0xFFF;
								local76 = local9 - local22;
								local81 = local7 - local17;
								local87 = local7 - arg5.anInt1457;
								local93 = local9 - arg5.anInt1460;
								if (arg7 == -4) {
									if (local7 == arg1 && arg2 == local9) {
										Static49.anInt821 = local7;
										Static152.anInt3473 = local9;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static286.method4839(arg0, local9, arg6, arg2, arg6, local7, arg1, arg10)) {
										Static49.anInt821 = local7;
										Static152.anInt3473 = local9;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg5.method1605(arg0, arg10, arg6, arg6, arg9, local9, local7, arg1, arg2)) {
										Static49.anInt821 = local7;
										Static152.anInt3473 = local9;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg5.method1600(arg1, local9, arg0, local7, arg9, arg6, arg2, arg10)) {
										Static49.anInt821 = local7;
										Static152.anInt3473 = local9;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg5.method1608(arg4, arg1, arg7, arg6, local9, local7, arg2)) {
										Static49.anInt821 = local7;
										Static152.anInt3473 = local9;
										return true;
									}
								} else if (arg5.method1613(arg2, arg7, arg4, arg1, arg6, local7, local9)) {
									Static152.anInt3473 = local9;
									Static49.anInt821 = local7;
									return true;
								}
								local250 = Static233.anIntArrayArray47[local81][local76] + 1;
								if (local81 > 0 && Static182.anIntArrayArray26[local81 - 1][local76] == 0 && (local55[local87 - 1][local93] & 0x43A40000) == 0 && (local55[local87 - 1][local93 + arg6 - 1] & 0x4E240000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg6 - 1) {
											Static309.anIntArray471[local50] = local7 - 1;
											Static270.anIntArray432[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static182.anIntArrayArray26[local81 - 1][local76] = 2;
											Static233.anIntArrayArray47[local81 - 1][local76] = local250;
											break;
										}
										if ((local55[local87 - 1][local292 + local93] & 0x4FA40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local81 < 128 - arg6 && Static182.anIntArrayArray26[local81 + 1][local76] == 0 && (local55[arg6 + local87][local93] & 0x60E40000) == 0 && (local55[local87 + arg6][arg6 + local93 - 1] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (arg6 - 1 <= local292) {
											Static309.anIntArray471[local50] = local7 + 1;
											Static270.anIntArray432[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static182.anIntArrayArray26[local81 + 1][local76] = 8;
											Static233.anIntArrayArray47[local81 + 1][local76] = local250;
											break;
										}
										if ((local55[arg6 + local87][local93 + local292] & 0x78E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local76 > 0 && Static182.anIntArrayArray26[local81][local76 - 1] == 0 && (local55[local87][local93 - 1] & 0x43A40000) == 0 && (local55[local87 + arg6 - 1][local93 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg6 - 1) {
											Static309.anIntArray471[local50] = local7;
											Static270.anIntArray432[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static182.anIntArrayArray26[local81][local76 - 1] = 1;
											Static233.anIntArrayArray47[local81][local76 - 1] = local250;
											break;
										}
										if ((local55[local87 + local292][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local76 < 128 - arg6 && Static182.anIntArrayArray26[local81][local76 + 1] == 0 && (local55[local87][arg6 + local93] & 0x4E240000) == 0 && (local55[local87 + arg6 - 1][local93 + arg6] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (arg6 - 1 <= local292) {
											Static309.anIntArray471[local50] = local7;
											Static270.anIntArray432[local50] = local9 + 1;
											local50 = local50 + 1 & 0xFFF;
											Static182.anIntArrayArray26[local81][local76 + 1] = 4;
											Static233.anIntArrayArray47[local81][local76 + 1] = local250;
											break;
										}
										if ((local55[local292 + local87][arg6 + local93] & 0x7E240000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local81 > 0 && local76 > 0 && Static182.anIntArrayArray26[local81 - 1][local76 - 1] == 0 && (local55[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg6) {
											Static309.anIntArray471[local50] = local7 - 1;
											Static270.anIntArray432[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static182.anIntArrayArray26[local81 - 1][local76 - 1] = 3;
											Static233.anIntArrayArray47[local81 - 1][local76 - 1] = local250;
											break;
										}
										if ((local55[local87 - 1][local93 + local292 - 1] & 0x4FA40000) != 0 || (local55[local292 + local87 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local81 < 128 - arg6 && local76 > 0 && Static182.anIntArrayArray26[local81 + 1][local76 - 1] == 0 && (local55[arg6 + local87][local93 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg6) {
											Static309.anIntArray471[local50] = local7 + 1;
											Static270.anIntArray432[local50] = local9 - 1;
											Static182.anIntArrayArray26[local81 + 1][local76 - 1] = 9;
											local50 = local50 + 1 & 0xFFF;
											Static233.anIntArrayArray47[local81 + 1][local76 - 1] = local250;
											break;
										}
										if ((local55[local87 + arg6][local93 + local292 - 1] & 0x78E40000) != 0 || (local55[local87 + local292][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local81 > 0 && 128 - arg6 > local76 && Static182.anIntArrayArray26[local81 - 1][local76 + 1] == 0 && (local55[local87 - 1][local93 + arg6] & 0x4E240000) == 0) {
									for (local292 = 1; local292 < arg6; local292++) {
										if ((local55[local87 - 1][local93 + local292] & 0x4FA40000) != 0 || (local55[local87 + local292 - 1][local93 + arg6] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static309.anIntArray471[local50] = local7 - 1;
									Static270.anIntArray432[local50] = local9 + 1;
									Static182.anIntArrayArray26[local81 - 1][local76 + 1] = 6;
									local50 = local50 + 1 & 0xFFF;
									Static233.anIntArrayArray47[local81 - 1][local76 + 1] = local250;
								}
							} while (local81 >= 128 - arg6);
						} while (128 - arg6 <= local76);
					} while (Static182.anIntArrayArray26[local81 + 1][local76 + 1] != 0);
				} while ((local55[local87 + arg6][arg6 + local93] & 0x78240000) != 0);
				for (local292 = 1; local292 < arg6; local292++) {
					if ((local55[local87 + local292][arg6 + local93] & 0x7E240000) != 0 || (local55[local87 + arg6][local292 + local93] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static309.anIntArray471[local50] = local7 + 1;
				Static270.anIntArray432[local50] = local9 + 1;
				Static182.anIntArrayArray26[local81 + 1][local76 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray47[local81 + 1][local76 + 1] = local250;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4394(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static309.aStringArray41.length; local7++) {
			if (Static309.aStringArray41[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method4395() {
		Static137.anInt2913 = 0;
		@Pc(16) int local16 = Static150.anInt3453 + (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >> 7);
		@Pc(23) int local23 = Static287.anInt5776 + (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >> 7);
		if (local16 >= 3053 && local16 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static137.anInt2913 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static137.anInt2913 = 1;
		}
		if (Static137.anInt2913 == 1 && local16 >= 3139 && local16 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static137.anInt2913 = 0;
		}
	}
}
