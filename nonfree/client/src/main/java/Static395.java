import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "J")
	public static long aLong183;

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
	public static int anInt7399;

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)V")
	public static void method6363(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub2_Sub9 local16 = Static144.method2332(3, arg0);
		local16.method3722();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)Z")
	public static boolean method6364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIIIIIILclient!tea;III)Z")
	public static boolean method6365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class319 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg1;
		@Pc(17) int local17 = arg0;
		@Pc(26) int local26 = arg1 - 64;
		@Pc(31) int local31 = arg0 - 64;
		Static524.anIntArrayArray46[64][64] = 99;
		Static533.anIntArrayArray49[64][64] = 0;
		@Pc(45) byte local45 = 0;
		@Pc(47) int local47 = 0;
		Static151.anIntArray179[0] = arg1;
		@Pc(54) int local54 = local45 + 1;
		Static430.anIntArray478[0] = arg0;
		@Pc(59) int[][] local59 = arg7.anIntArrayArray52;
		while (true) {
			label282: while (true) {
				@Pc(85) int local85;
				@Pc(80) int local80;
				@Pc(91) int local91;
				@Pc(96) int local96;
				@Pc(249) int local249;
				@Pc(288) int local288;
				do {
					do {
						do {
							label259: do {
								if (local47 == local54) {
									Static75.anInt1537 = local17;
									Static189.anInt3799 = local7;
									return false;
								}
								local17 = Static430.anIntArray478[local47];
								local7 = Static151.anIntArray179[local47];
								local47 = local47 + 1 & 0xFFF;
								local80 = local17 - local31;
								local85 = local7 - local26;
								local91 = local7 - arg7.anInt9338;
								local96 = local17 - arg7.anInt9322;
								if (arg3 == -4) {
									if (arg6 == local7 && local17 == arg2) {
										Static75.anInt1537 = local17;
										Static189.anInt3799 = local7;
										return true;
									}
								} else if (arg3 == -3) {
									if (Static53.method901(arg6, arg8, arg10, arg4, local7, arg2, arg8, local17)) {
										Static189.anInt3799 = local7;
										Static75.anInt1537 = local17;
										return true;
									}
								} else if (arg3 == -2) {
									if (arg7.method7931(arg8, local7, arg6, local17, arg2, arg4, arg8, arg5, arg10)) {
										Static75.anInt1537 = local17;
										Static189.anInt3799 = local7;
										return true;
									}
								} else if (arg3 == -1) {
									if (arg7.method7935(arg6, arg10, arg5, arg4, arg2, arg8, local7, local17)) {
										Static189.anInt3799 = local7;
										Static75.anInt1537 = local17;
										return true;
									}
								} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
									if (arg7.method7938(local17, arg2, arg3, arg6, arg8, arg9, local7)) {
										Static75.anInt1537 = local17;
										Static189.anInt3799 = local7;
										return true;
									}
								} else if (arg7.method7945(arg8, arg2, local7, arg3, arg6, local17, arg9)) {
									Static189.anInt3799 = local7;
									Static75.anInt1537 = local17;
									return true;
								}
								local249 = Static533.anIntArrayArray49[local85][local80] + 1;
								if (local85 > 0 && Static524.anIntArrayArray46[local85 - 1][local80] == 0 && (local59[local91 - 1][local96] & 0x43A40000) == 0 && (local59[local91 - 1][arg8 + local96 - 1] & 0x4E240000) == 0) {
									local288 = 1;
									while (true) {
										if (arg8 - 1 <= local288) {
											Static151.anIntArray179[local54] = local7 - 1;
											Static430.anIntArray478[local54] = local17;
											local54 = local54 + 1 & 0xFFF;
											Static524.anIntArrayArray46[local85 - 1][local80] = 2;
											Static533.anIntArrayArray49[local85 - 1][local80] = local249;
											break;
										}
										if ((local59[local91 - 1][local288 + local96] & 0x4FA40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local85 < 128 - arg8 && Static524.anIntArrayArray46[local85 + 1][local80] == 0 && (local59[local91 + arg8][local96] & 0x60E40000) == 0 && (local59[arg8 + local91][local96 + arg8 - 1] & 0x78240000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg8 - 1) {
											Static151.anIntArray179[local54] = local7 + 1;
											Static430.anIntArray478[local54] = local17;
											Static524.anIntArrayArray46[local85 + 1][local80] = 8;
											local54 = local54 + 1 & 0xFFF;
											Static533.anIntArrayArray49[local85 + 1][local80] = local249;
											break;
										}
										if ((local59[local91 + arg8][local288 + local96] & 0x78E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local80 > 0 && Static524.anIntArrayArray46[local85][local80 - 1] == 0 && (local59[local91][local96 - 1] & 0x43A40000) == 0 && (local59[arg8 + local91 - 1][local96 - 1] & 0x60E40000) == 0) {
									local288 = 1;
									while (true) {
										if (arg8 - 1 <= local288) {
											Static151.anIntArray179[local54] = local7;
											Static430.anIntArray478[local54] = local17 - 1;
											local54 = local54 + 1 & 0xFFF;
											Static524.anIntArrayArray46[local85][local80 - 1] = 1;
											Static533.anIntArrayArray49[local85][local80 - 1] = local249;
											break;
										}
										if ((local59[local288 + local91][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local80 < 128 - arg8 && Static524.anIntArrayArray46[local85][local80 + 1] == 0 && (local59[local91][arg8 + local96] & 0x4E240000) == 0 && (local59[local91 + arg8 - 1][arg8 + local96] & 0x78240000) == 0) {
									local288 = 1;
									while (true) {
										if (arg8 - 1 <= local288) {
											Static151.anIntArray179[local54] = local7;
											Static430.anIntArray478[local54] = local17 + 1;
											Static524.anIntArrayArray46[local85][local80 + 1] = 4;
											local54 = local54 + 1 & 0xFFF;
											Static533.anIntArrayArray49[local85][local80 + 1] = local249;
											break;
										}
										if ((local59[local91 + local288][local96 + arg8] & 0x7E240000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local85 > 0 && local80 > 0 && Static524.anIntArrayArray46[local85 - 1][local80 - 1] == 0 && (local59[local91 - 1][local96 - 1] & 0x43A40000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg8) {
											Static151.anIntArray179[local54] = local7 - 1;
											Static430.anIntArray478[local54] = local17 - 1;
											local54 = local54 + 1 & 0xFFF;
											Static524.anIntArrayArray46[local85 - 1][local80 - 1] = 3;
											Static533.anIntArrayArray49[local85 - 1][local80 - 1] = local249;
											break;
										}
										if ((local59[local91 - 1][local96 + local288 - 1] & 0x4FA40000) != 0 || (local59[local288 + local91 - 1][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local85 < 128 - arg8 && local80 > 0 && Static524.anIntArrayArray46[local85 + 1][local80 - 1] == 0 && (local59[local91 + arg8][local96 - 1] & 0x60E40000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg8) {
											Static151.anIntArray179[local54] = local7 + 1;
											Static430.anIntArray478[local54] = local17 - 1;
											local54 = local54 + 1 & 0xFFF;
											Static524.anIntArrayArray46[local85 + 1][local80 - 1] = 9;
											Static533.anIntArrayArray49[local85 + 1][local80 - 1] = local249;
											break;
										}
										if ((local59[arg8 + local91][local96 + local288 - 1] & 0x78E40000) != 0 || (local59[local288 + local91][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local85 > 0 && 128 - arg8 > local80 && Static524.anIntArrayArray46[local85 - 1][local80 + 1] == 0 && (local59[local91 - 1][local96 + arg8] & 0x4E240000) == 0) {
									for (local288 = 1; local288 < arg8; local288++) {
										if ((local59[local91 - 1][local288 + local96] & 0x4FA40000) != 0 || (local59[local91 + local288 - 1][arg8 + local96] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static151.anIntArray179[local54] = local7 - 1;
									Static430.anIntArray478[local54] = local17 + 1;
									local54 = local54 + 1 & 0xFFF;
									Static524.anIntArrayArray46[local85 - 1][local80 + 1] = 6;
									Static533.anIntArrayArray49[local85 - 1][local80 + 1] = local249;
								}
							} while (128 - arg8 <= local85);
						} while (local80 >= 128 - arg8);
					} while (Static524.anIntArrayArray46[local85 + 1][local80 + 1] != 0);
				} while ((local59[local91 + arg8][arg8 + local96] & 0x78240000) != 0);
				for (local288 = 1; local288 < arg8; local288++) {
					if ((local59[local91 + local288][local96 + arg8] & 0x7E240000) != 0 || (local59[local91 + arg8][local288 + local96] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static151.anIntArray179[local54] = local7 + 1;
				Static430.anIntArray478[local54] = local17 + 1;
				Static524.anIntArrayArray46[local85 + 1][local80 + 1] = 12;
				local54 = local54 + 1 & 0xFFF;
				Static533.anIntArrayArray49[local85 + 1][local80 + 1] = local249;
			}
		}
	}
}
