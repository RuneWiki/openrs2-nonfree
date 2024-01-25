import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "Lclient!f;")
	public static Class3 aClass3_16;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_78 = new Class242("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!bp;B)I")
	public static int method4469(@OriginalArg(0) Class6_Sub2_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt975;
		@Pc(12) Class132 local12 = arg0.method4762();
		if (arg0.aBoolean421) {
			local8 = arg0.anInt1006;
		} else if (local12.anInt3752 == arg0.anInt6077 || arg0.anInt6077 == local12.anInt3737 || local12.anInt3754 == arg0.anInt6077 || local12.anInt3759 == arg0.anInt6077) {
			local8 = arg0.anInt988;
		} else if (arg0.anInt6077 == local12.anInt3750 || arg0.anInt6077 == local12.anInt3740 || arg0.anInt6077 == local12.anInt3738 || local12.anInt3742 == arg0.anInt6077) {
			local8 = arg0.anInt984;
		}
		return local8;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIZIIILclient!wq;)Z")
	public static boolean method4470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class268 arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg1;
		@Pc(18) int local18 = arg2 - 64;
		@Pc(23) int local23 = arg1 - 64;
		Static384.anIntArrayArray57[64][64] = 99;
		Static33.anIntArrayArray12[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static102.anIntArray137[0] = arg2;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static161.anIntArray252[0] = arg1;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray66;
		while (local51 != local48) {
			local7 = Static102.anIntArray137[local48];
			local9 = Static161.anIntArray252[local48];
			@Pc(72) int local72 = local7 - arg9.anInt7539;
			@Pc(77) int local77 = local9 - local23;
			@Pc(82) int local82 = local7 - local18;
			@Pc(87) int local87 = local9 - arg9.anInt7518;
			local48 = local48 + 1 & 0xFFF;
			if (arg6 == -4) {
				if (arg3 == local7 && arg7 == local9) {
					Static126.anInt2567 = local7;
					Static123.anInt6825 = local9;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static303.method4186(local9, arg0, 1, arg8, arg7, arg3, 1, local7)) {
					Static126.anInt2567 = local7;
					Static123.anInt6825 = local9;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg9.method5806(local7, 1, arg8, arg5, local9, 1, arg7, arg0, arg3)) {
					Static126.anInt2567 = local7;
					Static123.anInt6825 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg9.method5810(arg8, 1, arg3, local7, arg7, arg0, local9, arg5)) {
					Static126.anInt2567 = local7;
					Static123.anInt6825 = local9;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg9.method5801(arg6, arg7, local7, arg4, local9, 1, arg3)) {
					Static126.anInt2567 = local7;
					Static123.anInt6825 = local9;
					return true;
				}
			} else if (arg9.method5800(arg3, arg6, local7, 1, local9, arg4, arg7)) {
				Static126.anInt2567 = local7;
				Static123.anInt6825 = local9;
				return true;
			}
			@Pc(240) int local240 = Static33.anIntArrayArray12[local82][local77] + 1;
			if (local82 > 0 && Static384.anIntArrayArray57[local82 - 1][local77] == 0 && (local56[local72 - 1][local87] & 0x42240000) == 0) {
				Static102.anIntArray137[local51] = local7 - 1;
				Static161.anIntArray252[local51] = local9;
				Static384.anIntArrayArray57[local82 - 1][local77] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static33.anIntArrayArray12[local82 - 1][local77] = local240;
			}
			if (local82 < 127 && Static384.anIntArrayArray57[local82 + 1][local77] == 0 && (local56[local72 + 1][local87] & 0x60240000) == 0) {
				Static102.anIntArray137[local51] = local7 + 1;
				Static161.anIntArray252[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local82 + 1][local77] = 8;
				Static33.anIntArrayArray12[local82 + 1][local77] = local240;
			}
			if (local77 > 0 && Static384.anIntArrayArray57[local82][local77 - 1] == 0 && (local56[local72][local87 - 1] & 0x40A40000) == 0) {
				Static102.anIntArray137[local51] = local7;
				Static161.anIntArray252[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local82][local77 - 1] = 1;
				Static33.anIntArrayArray12[local82][local77 - 1] = local240;
			}
			if (local77 < 127 && Static384.anIntArrayArray57[local82][local77 + 1] == 0 && (local56[local72][local87 + 1] & 0x48240000) == 0) {
				Static102.anIntArray137[local51] = local7;
				Static161.anIntArray252[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local82][local77 + 1] = 4;
				Static33.anIntArrayArray12[local82][local77 + 1] = local240;
			}
			if (local82 > 0 && local77 > 0 && Static384.anIntArrayArray57[local82 - 1][local77 - 1] == 0 && (local56[local72 - 1][local87 - 1] & 0x43A40000) == 0 && (local56[local72 - 1][local87] & 0x42240000) == 0 && (local56[local72][local87 - 1] & 0x40A40000) == 0) {
				Static102.anIntArray137[local51] = local7 - 1;
				Static161.anIntArray252[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local82 - 1][local77 - 1] = 3;
				Static33.anIntArrayArray12[local82 - 1][local77 - 1] = local240;
			}
			if (local82 < 127 && local77 > 0 && Static384.anIntArrayArray57[local82 + 1][local77 - 1] == 0 && (local56[local72 + 1][local87 - 1] & 0x60E40000) == 0 && (local56[local72 + 1][local87] & 0x60240000) == 0 && (local56[local72][local87 - 1] & 0x40A40000) == 0) {
				Static102.anIntArray137[local51] = local7 + 1;
				Static161.anIntArray252[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local82 + 1][local77 - 1] = 9;
				Static33.anIntArrayArray12[local82 + 1][local77 - 1] = local240;
			}
			if (local82 > 0 && local77 < 127 && Static384.anIntArrayArray57[local82 - 1][local77 + 1] == 0 && (local56[local72 - 1][local87 + 1] & 0x4E240000) == 0 && (local56[local72 - 1][local87] & 0x42240000) == 0 && (local56[local72][local87 + 1] & 0x48240000) == 0) {
				Static102.anIntArray137[local51] = local7 - 1;
				Static161.anIntArray252[local51] = local9 + 1;
				Static384.anIntArrayArray57[local82 - 1][local77 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static33.anIntArrayArray12[local82 - 1][local77 + 1] = local240;
			}
			if (local82 < 127 && local77 < 127 && Static384.anIntArrayArray57[local82 + 1][local77 + 1] == 0 && (local56[local72 + 1][local87 + 1] & 0x78240000) == 0 && (local56[local72 + 1][local87] & 0x60240000) == 0 && (local56[local72][local87 + 1] & 0x48240000) == 0) {
				Static102.anIntArray137[local51] = local7 + 1;
				Static161.anIntArray252[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local82 + 1][local77 + 1] = 12;
				Static33.anIntArrayArray12[local82 + 1][local77 + 1] = local240;
			}
		}
		Static123.anInt6825 = local9;
		Static126.anInt2567 = local7;
		return false;
	}
}
