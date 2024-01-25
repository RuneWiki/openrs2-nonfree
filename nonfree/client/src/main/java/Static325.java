import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
	public static int anInt5186;

	@OriginalMember(owner = "client!ll", name = "J", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_181 = new Class288(42, 8);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILclient!nt;IIIBIIIII)Z")
	public static boolean method4371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class240 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg6;
		@Pc(17) int local17 = arg7 - 64;
		Static283.anIntArrayArray46[64][64] = 99;
		@Pc(28) int local28 = arg6 - 64;
		Static283.anIntArrayArray47[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static314.anIntArray343[0] = arg7;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static493.anIntArray569[0] = arg6;
		@Pc(55) int[][] local55 = arg2.anIntArrayArray40;
		while (true) {
			label282: while (true) {
				@Pc(75) int local75;
				@Pc(70) int local70;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(244) int local244;
				@Pc(284) int local284;
				do {
					do {
						do {
							label259: do {
								if (local47 == local50) {
									Static350.anInt5488 = local9;
									Static395.anInt6217 = local7;
									return false;
								}
								local9 = Static493.anIntArray569[local47];
								local7 = Static314.anIntArray343[local47];
								local70 = local9 - local28;
								local75 = local7 - local17;
								local47 = local47 + 1 & 0xFFF;
								local87 = local7 - arg2.anInt6066;
								local93 = local9 - arg2.anInt6073;
								if (arg10 == -4) {
									if (local7 == arg1 && local9 == arg0) {
										Static395.anInt6217 = local7;
										Static350.anInt5488 = local9;
										return true;
									}
								} else if (arg10 == -3) {
									if (Static155.method2316(local9, arg4, local7, arg0, arg4, arg3, arg9, arg1)) {
										Static350.anInt5488 = local9;
										Static395.anInt6217 = local7;
										return true;
									}
								} else if (arg10 == -2) {
									if (arg2.method5177(local9, arg3, arg0, arg9, arg4, local7, arg1, arg8, arg4)) {
										Static350.anInt5488 = local9;
										Static395.anInt6217 = local7;
										return true;
									}
								} else if (arg10 == -1) {
									if (arg2.method5185(arg4, local9, arg8, local7, arg1, arg9, arg3, arg0)) {
										Static395.anInt6217 = local7;
										Static350.anInt5488 = local9;
										return true;
									}
								} else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
									if (arg2.method5175(arg10, arg4, local7, local9, arg0, arg5, arg1)) {
										Static350.anInt5488 = local9;
										Static395.anInt6217 = local7;
										return true;
									}
								} else if (arg2.method5189(arg1, arg0, local7, arg10, local9, arg4, arg5)) {
									Static350.anInt5488 = local9;
									Static395.anInt6217 = local7;
									return true;
								}
								local244 = Static283.anIntArrayArray47[local75][local70] + 1;
								if (local75 > 0 && Static283.anIntArrayArray46[local75 - 1][local70] == 0 && (local55[local87 - 1][local93] & 0x43A40000) == 0 && (local55[local87 - 1][local93 + arg4 - 1] & 0x4E240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg4 - 1) {
											Static314.anIntArray343[local50] = local7 - 1;
											Static493.anIntArray569[local50] = local9;
											Static283.anIntArrayArray46[local75 - 1][local70] = 2;
											local50 = local50 + 1 & 0xFFF;
											Static283.anIntArrayArray47[local75 - 1][local70] = local244;
											break;
										}
										if ((local55[local87 - 1][local93 + local284] & 0x4FA40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (128 - arg4 > local75 && Static283.anIntArrayArray46[local75 + 1][local70] == 0 && (local55[arg4 + local87][local93] & 0x60E40000) == 0 && (local55[local87 + arg4][local93 + arg4 - 1] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg4 - 1) {
											Static314.anIntArray343[local50] = local7 + 1;
											Static493.anIntArray569[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static283.anIntArrayArray46[local75 + 1][local70] = 8;
											Static283.anIntArrayArray47[local75 + 1][local70] = local244;
											break;
										}
										if ((local55[arg4 + local87][local284 + local93] & 0x78E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local70 > 0 && Static283.anIntArrayArray46[local75][local70 - 1] == 0 && (local55[local87][local93 - 1] & 0x43A40000) == 0 && (local55[local87 + arg4 - 1][local93 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg4 - 1) {
											Static314.anIntArray343[local50] = local7;
											Static493.anIntArray569[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static283.anIntArrayArray46[local75][local70 - 1] = 1;
											Static283.anIntArrayArray47[local75][local70 - 1] = local244;
											break;
										}
										if ((local55[local87 + local284][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local70 < 128 - arg4 && Static283.anIntArrayArray46[local75][local70 + 1] == 0 && (local55[local87][local93 + arg4] & 0x4E240000) == 0 && (local55[arg4 + local87 - 1][local93 + arg4] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (arg4 - 1 <= local284) {
											Static314.anIntArray343[local50] = local7;
											Static493.anIntArray569[local50] = local9 + 1;
											Static283.anIntArrayArray46[local75][local70 + 1] = 4;
											local50 = local50 + 1 & 0xFFF;
											Static283.anIntArrayArray47[local75][local70 + 1] = local244;
											break;
										}
										if ((local55[local284 + local87][arg4 + local93] & 0x7E240000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local75 > 0 && local70 > 0 && Static283.anIntArrayArray46[local75 - 1][local70 - 1] == 0 && (local55[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local284 = 1;
									while (true) {
										if (arg4 <= local284) {
											Static314.anIntArray343[local50] = local7 - 1;
											Static493.anIntArray569[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static283.anIntArrayArray46[local75 - 1][local70 - 1] = 3;
											Static283.anIntArrayArray47[local75 - 1][local70 - 1] = local244;
											break;
										}
										if ((local55[local87 - 1][local284 + local93 - 1] & 0x4FA40000) != 0 || (local55[local87 + local284 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (128 - arg4 > local75 && local70 > 0 && Static283.anIntArrayArray46[local75 + 1][local70 - 1] == 0 && (local55[arg4 + local87][local93 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (arg4 <= local284) {
											Static314.anIntArray343[local50] = local7 + 1;
											Static493.anIntArray569[local50] = local9 - 1;
											Static283.anIntArrayArray46[local75 + 1][local70 - 1] = 9;
											local50 = local50 + 1 & 0xFFF;
											Static283.anIntArrayArray47[local75 + 1][local70 - 1] = local244;
											break;
										}
										if ((local55[local87 + arg4][local284 + local93 - 1] & 0x78E40000) != 0 || (local55[local284 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local75 > 0 && local70 < 128 - arg4 && Static283.anIntArrayArray46[local75 - 1][local70 + 1] == 0 && (local55[local87 - 1][arg4 + local93] & 0x4E240000) == 0) {
									for (local284 = 1; local284 < arg4; local284++) {
										if ((local55[local87 - 1][local284 + local93] & 0x4FA40000) != 0 || (local55[local284 + local87 - 1][local93 + arg4] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static314.anIntArray343[local50] = local7 - 1;
									Static493.anIntArray569[local50] = local9 + 1;
									Static283.anIntArrayArray46[local75 - 1][local70 + 1] = 6;
									local50 = local50 + 1 & 0xFFF;
									Static283.anIntArrayArray47[local75 - 1][local70 + 1] = local244;
								}
							} while (128 - arg4 <= local75);
						} while (128 - arg4 <= local70);
					} while (Static283.anIntArrayArray46[local75 + 1][local70 + 1] != 0);
				} while ((local55[arg4 + local87][arg4 + local93] & 0x78240000) != 0);
				for (local284 = 1; local284 < arg4; local284++) {
					if ((local55[local284 + local87][local93 + arg4] & 0x7E240000) != 0 || (local55[arg4 + local87][local284 + local93] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static314.anIntArray343[local50] = local7 + 1;
				Static493.anIntArray569[local50] = local9 + 1;
				Static283.anIntArrayArray46[local75 + 1][local70 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local75 + 1][local70 + 1] = local244;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4373(@OriginalArg(0) String arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local12 += local27 - 64;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local12 += local27 - 96;
			} else if (local27 >= '0' && local27 <= '9') {
				local12 += local27 + 27 - 48;
			}
			if (local12 >= 177917621779460413L) {
				break;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V")
	public static void method4374(@OriginalArg(0) int arg0) {
		Static500.anInt8131 = arg0;
		Static507.anInt8408 = 2;
		if (Static435.aString32 == null) {
			Static63.method8324(35);
		} else {
			@Pc(20) Class2_Sub22 local20 = new Class2_Sub22(Static620.method8307(Static504.method6915(Static435.aString32)));
			@Pc(24) long local24 = local20.method8506();
			Static630.aLong277 = local20.method8506();
			Static575.method7863(true, Static309.method4208(local24), "");
		}
	}
}
