import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "J")
	public static long aLong203;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public static int anInt3466;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "[I")
	public static final int[] anIntArray365 = new int[50];

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1274 = Static161.method2452("titlebox");

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public static int anInt3462 = 0;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1275 = Static161.method2452("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public static int anInt3464 = 0;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public static int anInt3465 = 0;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1276 = aClass20_1275;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "[I")
	public static int[] anIntArray366 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIIIIIIZI)Z")
	public static boolean method2630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static155.anIntArrayArray34[local7][local11] = 0;
				Static167.anIntArrayArray36[local7][local11] = 99999999;
			}
		}
		Static155.anIntArrayArray34[arg3][arg2] = 99;
		local11 = arg3;
		@Pc(47) int local47 = arg2;
		Static167.anIntArrayArray36[arg3][arg2] = 0;
		@Pc(55) int local55 = 0;
		@Pc(57) byte local57 = 0;
		Static85.anIntArray183[0] = arg3;
		@Pc(82) int local82 = local57 + 1;
		Static128.anIntArray292[0] = arg2;
		@Pc(89) int[][] local89 = Static9.aClass76Array1[Static111.anInt2327].anIntArrayArray30;
		@Pc(91) boolean local91 = false;
		@Pc(214) int local214;
		@Pc(257) int local257;
		label367: while (local82 != local55) {
			local47 = Static128.anIntArray292[local55];
			local11 = Static85.anIntArray183[local55];
			local55 = local55 + 1 & 0xFFF;
			if (local11 == arg7 && arg6 == local47) {
				local91 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && Static9.aClass76Array1[Static111.anInt2327].method2230(arg5 - 1, arg1, arg7, local47, arg4, local11, arg6)) {
					local91 = true;
					break;
				}
				if (arg5 < 10 && Static9.aClass76Array1[Static111.anInt2327].method2228(arg7, local47, local11, arg6, arg1, arg5 - 1, arg4)) {
					local91 = true;
					break;
				}
			}
			if (arg9 != 0 && arg8 != 0 && Static9.aClass76Array1[Static111.anInt2327].method2215(arg6, arg7, local11, arg9, arg4, local47, arg11, arg8)) {
				local91 = true;
				break;
			}
			local214 = Static167.anIntArrayArray36[local11][local47] + 1;
			if (local11 > 0 && Static155.anIntArrayArray34[local11 - 1][local47] == 0 && (local89[local11 - 1][local47] & 0x12C010E) == 0 && (local89[local11 - 1][local47 + arg4 - 1] & 0x12C0138) == 0) {
				local257 = 1;
				while (true) {
					if (local257 >= arg4 - 1) {
						Static85.anIntArray183[local82] = local11 - 1;
						Static128.anIntArray292[local82] = local47;
						local82 = local82 + 1 & 0xFFF;
						Static155.anIntArrayArray34[local11 - 1][local47] = 2;
						Static167.anIntArrayArray36[local11 - 1][local47] = local214;
						break;
					}
					if ((local89[local11 - 1][local47 + local257] & 0x12C013E) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local11 < 102 && Static155.anIntArrayArray34[local11 + 1][local47] == 0 && (local89[local11 + arg4][local47] & 0x12C0183) == 0 && (local89[arg4 + local11][local47 + arg4 - 1] & 0x12C01E0) == 0) {
				local257 = 1;
				while (true) {
					if (local257 >= arg4 - 1) {
						Static85.anIntArray183[local82] = local11 + 1;
						Static128.anIntArray292[local82] = local47;
						local82 = local82 + 1 & 0xFFF;
						Static155.anIntArrayArray34[local11 + 1][local47] = 8;
						Static167.anIntArrayArray36[local11 + 1][local47] = local214;
						break;
					}
					if ((local89[arg4 + local11][local257 + local47] & 0x12C01E3) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local47 > 0 && Static155.anIntArrayArray34[local11][local47 - 1] == 0 && (local89[local11][local47 - 1] & 0x12C010E) == 0 && (local89[arg4 + local11 - 1][local47 - 1] & 0x12C0183) == 0) {
				local257 = 1;
				while (true) {
					if (local257 >= arg4 - 1) {
						Static85.anIntArray183[local82] = local11;
						Static128.anIntArray292[local82] = local47 - 1;
						Static155.anIntArrayArray34[local11][local47 - 1] = 1;
						local82 = local82 + 1 & 0xFFF;
						Static167.anIntArrayArray36[local11][local47 - 1] = local214;
						break;
					}
					if ((local89[local11 + local257][local47 - 1] & 0x12C018F) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local47 < 102 && Static155.anIntArrayArray34[local11][local47 + 1] == 0 && (local89[local11][local47 + arg4] & 0x12C0138) == 0 && (local89[arg4 + local11 - 1][arg4 + local47] & 0x12C01E0) == 0) {
				local257 = 1;
				while (true) {
					if (local257 >= arg4 - 1) {
						Static85.anIntArray183[local82] = local11;
						Static128.anIntArray292[local82] = local47 + 1;
						local82 = local82 + 1 & 0xFFF;
						Static155.anIntArrayArray34[local11][local47 + 1] = 4;
						Static167.anIntArrayArray36[local11][local47 + 1] = local214;
						break;
					}
					if ((local89[local257 + local11][arg4 + local47] & 0x12C01F8) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local11 > 0 && local47 > 0 && Static155.anIntArrayArray34[local11 - 1][local47 - 1] == 0 && (local89[local11 - 1][arg4 + local47 - 2] & 0x12C0138) == 0 && (local89[local11 - 1][local47 - 1] & 0x12C010E) == 0 && (local89[arg4 + local11 - 1 - 1][local47 - 1] & 0x12C0183) == 0) {
				local257 = 1;
				while (true) {
					if (local257 >= arg4 - 1) {
						Static85.anIntArray183[local82] = local11 - 1;
						Static128.anIntArray292[local82] = local47 - 1;
						Static155.anIntArrayArray34[local11 - 1][local47 - 1] = 3;
						Static167.anIntArrayArray36[local11 - 1][local47 - 1] = local214;
						local82 = local82 + 1 & 0xFFF;
						break;
					}
					if ((local89[local11 - 1][local257 + local47 - 1] & 0x12C013E) != 0 || (local89[local257 + local11 - 1][local47 - 1] & 0x12C018F) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local11 < 102 && local47 > 0 && Static155.anIntArrayArray34[local11 + 1][local47 - 1] == 0 && (local89[local11 + 1][local47 - 1] & 0x12C010E) == 0 && (local89[arg4 + local11][local47 - 1] & 0x12C0183) == 0 && (local89[local11 + arg4][arg4 + local47 - 1 - 1] & 0x12C01E0) == 0) {
				local257 = 1;
				while (true) {
					if (local257 >= arg4 - 1) {
						Static85.anIntArray183[local82] = local11 + 1;
						Static128.anIntArray292[local82] = local47 - 1;
						Static155.anIntArrayArray34[local11 + 1][local47 - 1] = 9;
						Static167.anIntArrayArray36[local11 + 1][local47 - 1] = local214;
						local82 = local82 + 1 & 0xFFF;
						break;
					}
					if ((local89[arg4 + local11][local47 + local257 - 1] & 0x12C01E3) != 0 || (local89[local11 + local257 + 1][local47 - 1] & 0x12C018F) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local11 > 0 && local47 < 102 && Static155.anIntArrayArray34[local11 - 1][local47 + 1] == 0 && (local89[local11 - 1][local47 + 1] & 0x12C010E) == 0 && (local89[local11 - 1][local47 + arg4] & 0x12C0138) == 0 && (local89[local11][local47 + arg4] & 0x12C01E0) == 0) {
				local257 = 1;
				while (true) {
					if (arg4 - 1 <= local257) {
						Static85.anIntArray183[local82] = local11 - 1;
						Static128.anIntArray292[local82] = local47 + 1;
						Static155.anIntArrayArray34[local11 - 1][local47 + 1] = 6;
						Static167.anIntArrayArray36[local11 - 1][local47 + 1] = local214;
						local82 = local82 + 1 & 0xFFF;
						break;
					}
					if ((local89[local11 - 1][local257 + local47 + 1] & 0x12C013E) != 0 || (local89[local11 + local257 - 1][arg4 + local47] & 0x12C01F8) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local11 < 102 && local47 < 102 && Static155.anIntArrayArray34[local11 + 1][local47 + 1] == 0 && (local89[local11 + 1][arg4 + local47] & 0x12C0138) == 0 && (local89[local11 + arg4][local47 + arg4] & 0x12C01E0) == 0 && (local89[local11 + arg4][local47 + 1] & 0x12C0183) == 0) {
				for (local257 = 1; local257 < arg4 - 1; local257++) {
					if ((local89[local11 + local257 + 1][arg4 + local47] & 0x12C01F8) != 0 || (local89[arg4 + local11][local47 + local257 + 1] & 0x12C01E3) != 0) {
						continue label367;
					}
				}
				Static85.anIntArray183[local82] = local11 + 1;
				Static128.anIntArray292[local82] = local47 + 1;
				local82 = local82 + 1 & 0xFFF;
				Static155.anIntArrayArray34[local11 + 1][local47 + 1] = 12;
				Static167.anIntArrayArray36[local11 + 1][local47 + 1] = local214;
			}
		}
		Static152.anInt3068 = 0;
		if (!local91) {
			if (!arg10) {
				return false;
			}
			local214 = 1000;
			local257 = 100;
			for (@Pc(1190) int local1190 = arg7 - 10; local1190 <= arg7 + 10; local1190++) {
				for (@Pc(1197) int local1197 = arg6 - 10; local1197 <= arg6 + 10; local1197++) {
					if (local1190 >= 0 && local1197 >= 0 && local1190 < 104 && local1197 < 104 && Static167.anIntArrayArray36[local1190][local1197] < 100) {
						@Pc(1223) int local1223 = 0;
						@Pc(1225) int local1225 = 0;
						if (local1190 < arg7) {
							local1223 = arg7 - local1190;
						} else if (local1190 > arg7 + arg9 - 1) {
							local1223 = local1190 + 1 - arg7 - arg9;
						}
						if (local1197 < arg6) {
							local1225 = arg6 - local1197;
						} else if (arg8 + arg6 - 1 < local1197) {
							local1225 = local1197 + 1 - arg8 - arg6;
						}
						@Pc(1295) int local1295 = local1223 * local1223 + local1225 * local1225;
						if (local1295 < local214 || local214 == local1295 && Static167.anIntArrayArray36[local1190][local1197] < local257) {
							local214 = local1295;
							local47 = local1197;
							local11 = local1190;
							local257 = Static167.anIntArrayArray36[local1190][local1197];
						}
					}
				}
			}
			if (local214 == 1000) {
				return false;
			}
			if (local11 == arg3 && local47 == arg2) {
				return false;
			}
			Static152.anInt3068 = 1;
		}
		@Pc(1371) byte local1371 = 0;
		Static85.anIntArray183[0] = local11;
		local55 = local1371 + 1;
		Static128.anIntArray292[0] = local47;
		local214 = local257 = Static155.anIntArrayArray34[local11][local47];
		while (local11 != arg3 || local47 != arg2) {
			if (local214 != local257) {
				local257 = local214;
				Static85.anIntArray183[local55] = local11;
				Static128.anIntArray292[local55++] = local47;
			}
			if ((local214 & 0x1) != 0) {
				local47++;
			} else if ((local214 & 0x4) != 0) {
				local47--;
			}
			if ((local214 & 0x2) != 0) {
				local11++;
			} else if ((local214 & 0x8) != 0) {
				local11--;
			}
			local214 = Static155.anIntArrayArray34[local11][local47];
		}
		if (local55 > 0) {
			Static28.method420(local55, Static128.anIntArray292, Static85.anIntArray183, arg0);
			return true;
		} else if (arg0 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
