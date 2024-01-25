import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "Z")
	public static boolean aBoolean599;

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "Z")
	public static boolean aBoolean600;

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
	public static int anInt8504 = 0;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "[I")
	public static final int[] anIntArray464 = new int[50];

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString79 = null;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "Z")
	public static boolean aBoolean601 = true;

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "[Lclient!mp;")
	public static final Class222[] aClass222Array1 = new Class222[16];

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Z)V")
	public static void method6958() {
		Static65.method1066();
		Static390.method6204();
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIIIIILclient!ga;III)Z")
	public static boolean method6961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class111 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg0;
		@Pc(23) int local23 = arg6 - 64;
		Static398.anIntArrayArray43[64][64] = 99;
		@Pc(34) int local34 = arg0 - 64;
		Static404.anIntArrayArray45[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static242.anIntArray221[0] = arg6;
		@Pc(51) int local51 = local42 + 1;
		Static478.anIntArray477[0] = arg0;
		@Pc(56) int[][] local56 = arg7.anIntArrayArray20;
		while (true) {
			label282: while (true) {
				@Pc(82) int local82;
				@Pc(77) int local77;
				@Pc(88) int local88;
				@Pc(93) int local93;
				@Pc(250) int local250;
				@Pc(286) int local286;
				do {
					do {
						do {
							label259: do {
								if (local51 == local44) {
									Static61.anInt985 = local9;
									Static145.anInt3095 = local7;
									return false;
								}
								local9 = Static478.anIntArray477[local44];
								local7 = Static242.anIntArray221[local44];
								local44 = local44 + 1 & 0xFFF;
								local77 = local9 - local34;
								local82 = local7 - local23;
								local88 = local7 - arg7.anInt3180;
								local93 = local9 - arg7.anInt3177;
								if (arg10 == -4) {
									if (local7 == arg3 && arg1 == local9) {
										Static61.anInt985 = local9;
										Static145.anInt3095 = local7;
										return true;
									}
								} else if (arg10 == -3) {
									if (Static415.method6524(arg8, arg5, arg4, arg5, local9, arg3, local7, arg1)) {
										Static145.anInt3095 = local7;
										Static61.anInt985 = local9;
										return true;
									}
								} else if (arg10 == -2) {
									if (arg7.method2859(arg5, arg1, arg8, arg3, arg5, local9, local7, arg9, arg4)) {
										Static145.anInt3095 = local7;
										Static61.anInt985 = local9;
										return true;
									}
								} else if (arg10 == -1) {
									if (arg7.method2852(local9, arg9, arg5, arg3, arg1, local7, arg4, arg8)) {
										Static61.anInt985 = local9;
										Static145.anInt3095 = local7;
										return true;
									}
								} else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
									if (arg7.method2849(arg5, arg1, local7, arg3, arg2, arg10, local9)) {
										Static61.anInt985 = local9;
										Static145.anInt3095 = local7;
										return true;
									}
								} else if (arg7.method2856(arg10, arg3, arg1, arg2, local7, arg5, local9)) {
									Static61.anInt985 = local9;
									Static145.anInt3095 = local7;
									return true;
								}
								local250 = Static404.anIntArrayArray45[local82][local77] + 1;
								if (local82 > 0 && Static398.anIntArrayArray43[local82 - 1][local77] == 0 && (local56[local88 - 1][local93] & 0x43A40000) == 0 && (local56[local88 - 1][local93 + arg5 - 1] & 0x4E240000) == 0) {
									local286 = 1;
									while (true) {
										if (arg5 - 1 <= local286) {
											Static242.anIntArray221[local51] = local7 - 1;
											Static478.anIntArray477[local51] = local9;
											Static398.anIntArrayArray43[local82 - 1][local77] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static404.anIntArrayArray45[local82 - 1][local77] = local250;
											break;
										}
										if ((local56[local88 - 1][local286 + local93] & 0x4FA40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local82 < 128 - arg5 && Static398.anIntArrayArray43[local82 + 1][local77] == 0 && (local56[local88 + arg5][local93] & 0x60E40000) == 0 && (local56[arg5 + local88][arg5 + local93 - 1] & 0x78240000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg5 - 1) {
											Static242.anIntArray221[local51] = local7 + 1;
											Static478.anIntArray477[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static398.anIntArrayArray43[local82 + 1][local77] = 8;
											Static404.anIntArrayArray45[local82 + 1][local77] = local250;
											break;
										}
										if ((local56[local88 + arg5][local93 + local286] & 0x78E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local77 > 0 && Static398.anIntArrayArray43[local82][local77 - 1] == 0 && (local56[local88][local93 - 1] & 0x43A40000) == 0 && (local56[arg5 + local88 - 1][local93 - 1] & 0x60E40000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg5 - 1) {
											Static242.anIntArray221[local51] = local7;
											Static478.anIntArray477[local51] = local9 - 1;
											Static398.anIntArrayArray43[local82][local77 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static404.anIntArrayArray45[local82][local77 - 1] = local250;
											break;
										}
										if ((local56[local88 + local286][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local77 < 128 - arg5 && Static398.anIntArrayArray43[local82][local77 + 1] == 0 && (local56[local88][arg5 + local93] & 0x4E240000) == 0 && (local56[local88 + arg5 - 1][local93 + arg5] & 0x78240000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg5 - 1) {
											Static242.anIntArray221[local51] = local7;
											Static478.anIntArray477[local51] = local9 + 1;
											Static398.anIntArrayArray43[local82][local77 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static404.anIntArrayArray45[local82][local77 + 1] = local250;
											break;
										}
										if ((local56[local286 + local88][local93 + arg5] & 0x7E240000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local82 > 0 && local77 > 0 && Static398.anIntArrayArray43[local82 - 1][local77 - 1] == 0 && (local56[local88 - 1][local93 - 1] & 0x43A40000) == 0) {
									local286 = 1;
									while (true) {
										if (arg5 <= local286) {
											Static242.anIntArray221[local51] = local7 - 1;
											Static478.anIntArray477[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static398.anIntArrayArray43[local82 - 1][local77 - 1] = 3;
											Static404.anIntArrayArray45[local82 - 1][local77 - 1] = local250;
											break;
										}
										if ((local56[local88 - 1][local286 + local93 - 1] & 0x4FA40000) != 0 || (local56[local286 + local88 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (128 - arg5 > local82 && local77 > 0 && Static398.anIntArrayArray43[local82 + 1][local77 - 1] == 0 && (local56[arg5 + local88][local93 - 1] & 0x60E40000) == 0) {
									local286 = 1;
									while (true) {
										if (arg5 <= local286) {
											Static242.anIntArray221[local51] = local7 + 1;
											Static478.anIntArray477[local51] = local9 - 1;
											Static398.anIntArrayArray43[local82 + 1][local77 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static404.anIntArrayArray45[local82 + 1][local77 - 1] = local250;
											break;
										}
										if ((local56[arg5 + local88][local286 + local93 - 1] & 0x78E40000) != 0 || (local56[local88 + local286][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local82 > 0 && local77 < 128 - arg5 && Static398.anIntArrayArray43[local82 - 1][local77 + 1] == 0 && (local56[local88 - 1][arg5 + local93] & 0x4E240000) == 0) {
									for (local286 = 1; local286 < arg5; local286++) {
										if ((local56[local88 - 1][local93 + local286] & 0x4FA40000) != 0 || (local56[local88 + local286 - 1][local93 + arg5] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static242.anIntArray221[local51] = local7 - 1;
									Static478.anIntArray477[local51] = local9 + 1;
									local51 = local51 + 1 & 0xFFF;
									Static398.anIntArrayArray43[local82 - 1][local77 + 1] = 6;
									Static404.anIntArrayArray45[local82 - 1][local77 + 1] = local250;
								}
							} while (128 - arg5 <= local82);
						} while (local77 >= 128 - arg5);
					} while (Static398.anIntArrayArray43[local82 + 1][local77 + 1] != 0);
				} while ((local56[arg5 + local88][arg5 + local93] & 0x78240000) != 0);
				for (local286 = 1; local286 < arg5; local286++) {
					if ((local56[local88 + local286][local93 + arg5] & 0x7E240000) != 0 || (local56[arg5 + local88][local93 + local286] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static242.anIntArray221[local51] = local7 + 1;
				Static478.anIntArray477[local51] = local9 + 1;
				Static398.anIntArrayArray43[local82 + 1][local77 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static404.anIntArrayArray45[local82 + 1][local77 + 1] = local250;
			}
		}
	}
}
