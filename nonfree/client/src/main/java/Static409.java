import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!uo", name = "Uc", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_93 = new Class84("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!uo", name = "Wc", descriptor = "[I")
	public static final int[] anIntArray591 = new int[100];

	@OriginalMember(owner = "client!uo", name = "Xc", descriptor = "I")
	public static int anInt7172 = -1;

	@OriginalMember(owner = "client!uo", name = "Yc", descriptor = "[I")
	public static final int[] anIntArray592 = new int[200];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIZLclient!id;II)Z")
	public static boolean method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class112 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg9 - 64;
		@Pc(23) int local23 = arg6 - 64;
		Static45.anIntArrayArray23[64][64] = 99;
		Static378.anIntArrayArray183[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static221.anIntArray325[0] = arg9;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static179.anIntArray273[0] = arg6;
		@Pc(56) int[][] local56 = arg7.anIntArrayArray90;
		while (local43 != local46) {
			local7 = Static221.anIntArray325[local43];
			local9 = Static179.anIntArray273[local43];
			@Pc(71) int local71 = local9 - local23;
			@Pc(77) int local77 = local9 - arg7.anInt3142;
			@Pc(82) int local82 = local7 - local18;
			local43 = local43 + 1 & 0xFFF;
			@Pc(94) int local94 = local7 - arg7.anInt3133;
			if (arg5 == -4) {
				if (arg0 == local7 && arg4 == local9) {
					Static247.anInt3930 = local7;
					Static66.anInt1364 = local9;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static44.method729(local7, 1, arg4, arg2, local9, arg0, arg3, 1)) {
					Static66.anInt1364 = local9;
					Static247.anInt3930 = local7;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg7.method2695(arg2, 1, local9, arg8, local7, 1, arg4, arg0, arg3)) {
					Static66.anInt1364 = local9;
					Static247.anInt3930 = local7;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg7.method2690(arg4, arg2, arg0, local7, arg3, local9, 1, arg8)) {
					Static66.anInt1364 = local9;
					Static247.anInt3930 = local7;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg7.method2682(arg4, arg1, local7, arg5, local9, 1, arg0)) {
					Static66.anInt1364 = local9;
					Static247.anInt3930 = local7;
					return true;
				}
			} else if (arg7.method2687(1, local9, arg1, arg0, arg4, arg5, local7)) {
				Static66.anInt1364 = local9;
				Static247.anInt3930 = local7;
				return true;
			}
			@Pc(248) int local248 = Static378.anIntArrayArray183[local82][local71] + 1;
			if (local82 > 0 && Static45.anIntArrayArray23[local82 - 1][local71] == 0 && (local56[local94 - 1][local77] & 0x42240000) == 0) {
				Static221.anIntArray325[local46] = local7 - 1;
				Static179.anIntArray273[local46] = local9;
				Static45.anIntArrayArray23[local82 - 1][local71] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static378.anIntArrayArray183[local82 - 1][local71] = local248;
			}
			if (local82 < 127 && Static45.anIntArrayArray23[local82 + 1][local71] == 0 && (local56[local94 + 1][local77] & 0x60240000) == 0) {
				Static221.anIntArray325[local46] = local7 + 1;
				Static179.anIntArray273[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static45.anIntArrayArray23[local82 + 1][local71] = 8;
				Static378.anIntArrayArray183[local82 + 1][local71] = local248;
			}
			if (local71 > 0 && Static45.anIntArrayArray23[local82][local71 - 1] == 0 && (local56[local94][local77 - 1] & 0x40A40000) == 0) {
				Static221.anIntArray325[local46] = local7;
				Static179.anIntArray273[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static45.anIntArrayArray23[local82][local71 - 1] = 1;
				Static378.anIntArrayArray183[local82][local71 - 1] = local248;
			}
			if (local71 < 127 && Static45.anIntArrayArray23[local82][local71 + 1] == 0 && (local56[local94][local77 + 1] & 0x48240000) == 0) {
				Static221.anIntArray325[local46] = local7;
				Static179.anIntArray273[local46] = local9 + 1;
				Static45.anIntArrayArray23[local82][local71 + 1] = 4;
				local46 = local46 + 1 & 0xFFF;
				Static378.anIntArrayArray183[local82][local71 + 1] = local248;
			}
			if (local82 > 0 && local71 > 0 && Static45.anIntArrayArray23[local82 - 1][local71 - 1] == 0 && (local56[local94 - 1][local77 - 1] & 0x43A40000) == 0 && (local56[local94 - 1][local77] & 0x42240000) == 0 && (local56[local94][local77 - 1] & 0x40A40000) == 0) {
				Static221.anIntArray325[local46] = local7 - 1;
				Static179.anIntArray273[local46] = local9 - 1;
				Static45.anIntArrayArray23[local82 - 1][local71 - 1] = 3;
				local46 = local46 + 1 & 0xFFF;
				Static378.anIntArrayArray183[local82 - 1][local71 - 1] = local248;
			}
			if (local82 < 127 && local71 > 0 && Static45.anIntArrayArray23[local82 + 1][local71 - 1] == 0 && (local56[local94 + 1][local77 - 1] & 0x60E40000) == 0 && (local56[local94 + 1][local77] & 0x60240000) == 0 && (local56[local94][local77 - 1] & 0x40A40000) == 0) {
				Static221.anIntArray325[local46] = local7 + 1;
				Static179.anIntArray273[local46] = local9 - 1;
				Static45.anIntArrayArray23[local82 + 1][local71 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static378.anIntArrayArray183[local82 + 1][local71 - 1] = local248;
			}
			if (local82 > 0 && local71 < 127 && Static45.anIntArrayArray23[local82 - 1][local71 + 1] == 0 && (local56[local94 - 1][local77 + 1] & 0x4E240000) == 0 && (local56[local94 - 1][local77] & 0x42240000) == 0 && (local56[local94][local77 + 1] & 0x48240000) == 0) {
				Static221.anIntArray325[local46] = local7 - 1;
				Static179.anIntArray273[local46] = local9 + 1;
				Static45.anIntArrayArray23[local82 - 1][local71 + 1] = 6;
				local46 = local46 + 1 & 0xFFF;
				Static378.anIntArrayArray183[local82 - 1][local71 + 1] = local248;
			}
			if (local82 < 127 && local71 < 127 && Static45.anIntArrayArray23[local82 + 1][local71 + 1] == 0 && (local56[local94 + 1][local77 + 1] & 0x78240000) == 0 && (local56[local94 + 1][local77] & 0x60240000) == 0 && (local56[local94][local77 + 1] & 0x48240000) == 0) {
				Static221.anIntArray325[local46] = local7 + 1;
				Static179.anIntArray273[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static45.anIntArrayArray23[local82 + 1][local71 + 1] = 12;
				Static378.anIntArrayArray183[local82 + 1][local71 + 1] = local248;
			}
		}
		Static66.anInt1364 = local9;
		Static247.anInt3930 = local7;
		return false;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIILclient!tf;IILclient!uo;Lclient!pk;)V")
	public static void method5547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26_Sub2_Sub2_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class26_Sub2_Sub2_Sub2 arg5, @OriginalArg(7) Class182 arg6) {
		@Pc(12) Class1_Sub29 local12 = new Class1_Sub29();
		local12.anInt4373 = arg3 << 7;
		local12.anInt4374 = arg4 << 7;
		local12.anInt4367 = arg1;
		if (arg6 != null) {
			local12.aClass182_1 = arg6;
			@Pc(33) int local33 = arg6.anInt5486;
			@Pc(36) int local36 = arg6.anInt5487;
			if (arg0 == 1 || arg0 == 3) {
				local36 = arg6.anInt5486;
				local33 = arg6.anInt5487;
			}
			local12.anInt4377 = arg6.anInt5462 << 7;
			local12.anInt4380 = arg6.anInt5448;
			local12.anInt4375 = arg6.anInt5476;
			local12.anIntArray350 = arg6.anIntArray427;
			local12.anInt4381 = arg3 + local33 << 7;
			local12.anInt4368 = arg6.anInt5495;
			local12.anInt4378 = arg4 + local36 << 7;
			local12.anInt4372 = arg6.anInt5479;
			if (arg6.anIntArray425 != null) {
				local12.aBoolean300 = true;
				local12.method3604();
			}
			if (local12.anIntArray350 != null) {
				local12.anInt4366 = local12.anInt4368 + (int) ((double) (local12.anInt4375 - local12.anInt4368) * Math.random());
			}
			Static205.aClass266_32.method5998(local12);
		} else if (arg5 != null) {
			local12.aClass26_Sub2_Sub2_Sub2_1 = arg5;
			@Pc(179) Class66 local179 = arg5.aClass66_1;
			if (local179.anIntArray152 != null) {
				local12.aBoolean300 = true;
				local179 = local179.method1454(Static51.aClass79_1);
			}
			if (local179 != null) {
				local12.anInt4378 = local179.anInt1717 + arg4 << 7;
				local12.anInt4381 = arg3 + local179.anInt1717 << 7;
				local12.anInt4372 = Static204.method3120(arg5);
				local12.anInt4380 = local179.anInt1683;
				local12.anInt4377 = local179.anInt1694 << 7;
			}
			Static14.aClass266_3.method5998(local12);
		} else if (arg2 != null) {
			local12.aClass26_Sub2_Sub2_Sub1_2 = arg2;
			local12.anInt4381 = arg3 + arg2.method5535() << 7;
			local12.anInt4378 = arg2.method5535() + arg4 << 7;
			local12.anInt4372 = Static195.method2960(arg2);
			local12.anInt4380 = arg2.anInt6632;
			local12.anInt4377 = arg2.anInt6627 << 7;
			Static51.aClass27_9.method564((long) arg2.anInt7097, local12);
			return;
		}
	}
}
