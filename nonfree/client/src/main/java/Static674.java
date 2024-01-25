import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static674 {

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
	public static int anInt11178;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
	public static int anInt11170 = -1;

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[200];

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZI)V")
	public static void method9278(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class14_Sub25 local9 = arg1 ? Static323.aClass14_Sub25_2 : Static64.aClass14_Sub25_1;
		if (local9 == null || arg0 < 0 || arg0 >= local9.anInt4216) {
			return;
		}
		@Pc(30) Class336 local30 = local9.aClass336Array1[arg0];
		if (local30.aByte135 != -1) {
			return;
		}
		@Pc(44) String local44 = local30.aString102;
		@Pc(49) Class14_Sub19 local49 = Static286.method4081(Static205.aClass394_1, Static398.aClass100_99);
		local49.aClass14_Sub29_Sub1_1.method5854(Static651.method9066(local44) + 3);
		local49.aClass14_Sub29_Sub1_1.method5854(arg1 ? 1 : 0);
		local49.aClass14_Sub29_Sub1_1.method5859(arg0);
		local49.aClass14_Sub29_Sub1_1.method5855(local44);
		Static576.method8234(local49);
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
	public static void method9280() {
		Static92.aClass350_2.method8460();
		Static620.aClass119_5.method2833();
		Static372.aClass154_2.method3554();
		Static511.aClass13_2.method81();
		Static63.aClass37_1.method973();
		Static175.aClass247_2.method5952();
		Static501.aClass191_2.method4320();
		Static556.aClass216_2.method5273();
		Static427.aClass225_1.method5329();
		Static195.aClass76_1.method1919();
		Static634.aClass15_1.method132();
		Static110.aClass197_1.method4403();
		Static196.aClass116_2.method2787();
		Static313.aClass83_6.method2080();
		Static217.aClass90_1.method2120();
		Static605.aClass370_1.method8861();
		Static20.aClass385_31.method9137();
		Static379.aClass250_13.method5997();
		Static264.aClass68_1.method1729();
		Static184.aClass151_1.method3507();
		Static296.aClass205_3.method5065();
		Static137.aClass299_1.method7432();
		Static241.method3616();
		Static63.method1261();
		Static286.method4083();
		Static133.method2137();
		Static231.method3503();
		Static372.aClass264_42.method6366(5);
		Static283.aClass264_32.method6366(5);
		Static433.aClass264_61.method6366(5);
		Static546.aClass264_55.method6366(5);
		Static632.aClass264_63.method6366(5);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!so;I)Lclient!wo;")
	public static Class86_Sub4 method9283(@OriginalArg(0) Class14_Sub29 arg0) {
		return new Class86_Sub4(arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5862(), arg0.method5862(), arg0.method5866());
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIIIIIIILclient!mb;I)Z")
	public static boolean method9285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class226 arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg1 - 64;
		Static533.anIntArrayArray51[64][64] = 99;
		@Pc(29) int local29 = arg2 - 64;
		Static323.anIntArrayArray37[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static669.anIntArray823[0] = arg1;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static1.anIntArray748[0] = arg2;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray39;
		while (true) {
			label282: while (true) {
				@Pc(82) int local82;
				@Pc(77) int local77;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(247) int local247;
				@Pc(289) int local289;
				do {
					do {
						do {
							label259: do {
								if (local48 == local51) {
									Static71.anInt1587 = local9;
									Static437.anInt7796 = local7;
									return false;
								}
								local9 = Static1.anIntArray748[local48];
								local7 = Static669.anIntArray823[local48];
								local48 = local48 + 1 & 0xFFF;
								local77 = local9 - local29;
								local82 = local7 - local18;
								local88 = local7 - arg9.anInt6536;
								local94 = local9 - arg9.anInt6545;
								if (arg0 == -4) {
									if (arg7 == local7 && local9 == arg8) {
										Static437.anInt7796 = local7;
										Static71.anInt1587 = local9;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static89.method1687(local7, arg3, arg8, local9, arg3, arg7, arg10, arg6)) {
										Static71.anInt1587 = local9;
										Static437.anInt7796 = local7;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg9.method5375(local9, arg3, arg6, arg7, arg5, local7, arg8, arg10, arg3)) {
										Static71.anInt1587 = local9;
										Static437.anInt7796 = local7;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg9.method5367(arg8, arg6, arg3, arg10, local7, local9, arg7, arg5)) {
										Static437.anInt7796 = local7;
										Static71.anInt1587 = local9;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg9.method5365(arg3, local9, arg8, local7, arg4, arg7, arg0)) {
										Static71.anInt1587 = local9;
										Static437.anInt7796 = local7;
										return true;
									}
								} else if (arg9.method5372(arg3, arg8, arg0, local9, local7, arg7, arg4)) {
									Static437.anInt7796 = local7;
									Static71.anInt1587 = local9;
									return true;
								}
								local247 = Static323.anIntArrayArray37[local82][local77] + 1;
								if (local82 > 0 && Static533.anIntArrayArray51[local82 - 1][local77] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][arg3 + local94 - 1] & 0x4E240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg3 - 1 <= local289) {
											Static669.anIntArray823[local51] = local7 - 1;
											Static1.anIntArray748[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static533.anIntArrayArray51[local82 - 1][local77] = 2;
											Static323.anIntArrayArray37[local82 - 1][local77] = local247;
											break;
										}
										if ((local56[local88 - 1][local94 + local289] & 0x4FA40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local82 < 128 - arg3 && Static533.anIntArrayArray51[local82 + 1][local77] == 0 && (local56[arg3 + local88][local94] & 0x60E40000) == 0 && (local56[local88 + arg3][arg3 + local94 - 1] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg3 - 1 <= local289) {
											Static669.anIntArray823[local51] = local7 + 1;
											Static1.anIntArray748[local51] = local9;
											Static533.anIntArrayArray51[local82 + 1][local77] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static323.anIntArrayArray37[local82 + 1][local77] = local247;
											break;
										}
										if ((local56[local88 + arg3][local94 + local289] & 0x78E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local77 > 0 && Static533.anIntArrayArray51[local82][local77 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + arg3 - 1][local94 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg3 - 1) {
											Static669.anIntArray823[local51] = local7;
											Static1.anIntArray748[local51] = local9 - 1;
											Static533.anIntArrayArray51[local82][local77 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static323.anIntArrayArray37[local82][local77 - 1] = local247;
											break;
										}
										if ((local56[local88 + local289][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local77 < 128 - arg3 && Static533.anIntArrayArray51[local82][local77 + 1] == 0 && (local56[local88][local94 + arg3] & 0x4E240000) == 0 && (local56[local88 + arg3 - 1][local94 + arg3] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg3 - 1 <= local289) {
											Static669.anIntArray823[local51] = local7;
											Static1.anIntArray748[local51] = local9 + 1;
											Static533.anIntArrayArray51[local82][local77 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static323.anIntArrayArray37[local82][local77 + 1] = local247;
											break;
										}
										if ((local56[local88 + local289][arg3 + local94] & 0x7E240000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local82 > 0 && local77 > 0 && Static533.anIntArrayArray51[local82 - 1][local77 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg3 <= local289) {
											Static669.anIntArray823[local51] = local7 - 1;
											Static1.anIntArray748[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static533.anIntArrayArray51[local82 - 1][local77 - 1] = 3;
											Static323.anIntArrayArray37[local82 - 1][local77 - 1] = local247;
											break;
										}
										if ((local56[local88 - 1][local289 + local94 - 1] & 0x4FA40000) != 0 || (local56[local88 + local289 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local82 < 128 - arg3 && local77 > 0 && Static533.anIntArrayArray51[local82 + 1][local77 - 1] == 0 && (local56[local88 + arg3][local94 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg3) {
											Static669.anIntArray823[local51] = local7 + 1;
											Static1.anIntArray748[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static533.anIntArrayArray51[local82 + 1][local77 - 1] = 9;
											Static323.anIntArrayArray37[local82 + 1][local77 - 1] = local247;
											break;
										}
										if ((local56[arg3 + local88][local94 + local289 - 1] & 0x78E40000) != 0 || (local56[local289 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local82 > 0 && local77 < 128 - arg3 && Static533.anIntArrayArray51[local82 - 1][local77 + 1] == 0 && (local56[local88 - 1][arg3 + local94] & 0x4E240000) == 0) {
									for (local289 = 1; local289 < arg3; local289++) {
										if ((local56[local88 - 1][local289 + local94] & 0x4FA40000) != 0 || (local56[local88 + local289 - 1][arg3 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static669.anIntArray823[local51] = local7 - 1;
									Static1.anIntArray748[local51] = local9 + 1;
									local51 = local51 + 1 & 0xFFF;
									Static533.anIntArrayArray51[local82 - 1][local77 + 1] = 6;
									Static323.anIntArrayArray37[local82 - 1][local77 + 1] = local247;
								}
							} while (128 - arg3 <= local82);
						} while (local77 >= 128 - arg3);
					} while (Static533.anIntArrayArray51[local82 + 1][local77 + 1] != 0);
				} while ((local56[local88 + arg3][local94 + arg3] & 0x78240000) != 0);
				for (local289 = 1; local289 < arg3; local289++) {
					if ((local56[local289 + local88][local94 + arg3] & 0x7E240000) != 0 || (local56[local88 + arg3][local289 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static669.anIntArray823[local51] = local7 + 1;
				Static1.anIntArray748[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static533.anIntArrayArray51[local82 + 1][local77 + 1] = 12;
				Static323.anIntArrayArray37[local82 + 1][local77 + 1] = local247;
			}
		}
	}
}
