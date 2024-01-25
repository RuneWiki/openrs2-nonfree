import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!sj;")
	public static Class181 aClass181_34;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
	public static int anInt4058;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
	public static int anInt4059;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString154;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "[I")
	public static final int[] anIntArray340 = new int[128];

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
	public static int anInt4063 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!tj;I)V")
	public static void method3462(@OriginalArg(0) Class122 arg0) {
		arg0.method4768(0, 0, Static298.anInt5944, 350);
		arg0.method4732(0, 0, Static298.anInt5944, 350, Static322.anInt6236 << 24 | 0x332277, 1);
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			local31 = Static118.anIntArray148[local25];
			@Pc(35) int local35 = Static225.anIntArray435[local25];
			arg0.method4732(local31, local35, 2, 2, Static9.anIntArray10[local25] << 24 | 0xFFFFFF, 1);
		}
		for (local31 = 0; local31 < Static265.aStringArray34.length; local31++) {
			Static83.aClass120_1.method5528(Static265.aStringArray34[local31], -16777216, 348 - Static303.aClass209_9.anInt6521 - Static225.anInt5462 - Static135.anInt2791 * local31, -1, 10);
		}
		arg0.method4736(-1, 0, Static298.anInt5944, 350 - Static225.anInt5462);
		Static243.aClass120_6.method5528("--> " + Static159.aString118 + "*", -16777216, 350 - Static191.aClass209_6.anInt6521 - 1, -1, 10);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!ao;IIIIIIIII)Z")
	public static boolean method3463(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg2;
		@Pc(17) int local17 = arg5 - 64;
		Static177.anIntArrayArray24[64][64] = 99;
		@Pc(28) int local28 = arg2 - 64;
		Static238.anIntArrayArray42[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static238.anIntArray380[0] = arg5;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static227.anIntArray376[0] = arg2;
		@Pc(55) int[][] local55 = arg1.anIntArrayArray1;
		while (local42 != local45) {
			local7 = Static238.anIntArray380[local42];
			local9 = Static227.anIntArray376[local42];
			local42 = local42 + 1 & 0xFFF;
			@Pc(76) int local76 = local9 - local28;
			@Pc(81) int local81 = local9 - arg1.anInt336;
			@Pc(87) int local87 = local7 - arg1.anInt340;
			@Pc(91) int local91 = local7 - local17;
			if (arg8 == -4) {
				if (arg3 == local7 && local9 == arg0) {
					Static45.anInt929 = local9;
					Static132.anInt2759 = local7;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static90.method1438(arg7, 1, arg0, local7, 1, arg3, arg6, local9)) {
					Static132.anInt2759 = local7;
					Static45.anInt929 = local9;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg1.method244(arg7, local7, arg4, 1, local9, arg6, arg3, 1, arg0)) {
					Static45.anInt929 = local9;
					Static132.anInt2759 = local7;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg1.method232(1, arg6, local9, local7, arg7, arg3, arg4, arg0)) {
					Static45.anInt929 = local9;
					Static132.anInt2759 = local7;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg1.method243(arg0, local7, local9, arg9, 1, arg8, arg3)) {
					Static132.anInt2759 = local7;
					Static45.anInt929 = local9;
					return true;
				}
			} else if (arg1.method237(arg3, local9, 1, local7, arg8, arg0, arg9)) {
				Static132.anInt2759 = local7;
				Static45.anInt929 = local9;
				return true;
			}
			@Pc(249) int local249 = Static238.anIntArrayArray42[local91][local76] + 1;
			if (local91 > 0 && Static177.anIntArrayArray24[local91 - 1][local76] == 0 && (local55[local87 - 1][local81] & 0x42240000) == 0) {
				Static238.anIntArray380[local45] = local7 - 1;
				Static227.anIntArray376[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static177.anIntArrayArray24[local91 - 1][local76] = 2;
				Static238.anIntArrayArray42[local91 - 1][local76] = local249;
			}
			if (local91 < 127 && Static177.anIntArrayArray24[local91 + 1][local76] == 0 && (local55[local87 + 1][local81] & 0x60240000) == 0) {
				Static238.anIntArray380[local45] = local7 + 1;
				Static227.anIntArray376[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static177.anIntArrayArray24[local91 + 1][local76] = 8;
				Static238.anIntArrayArray42[local91 + 1][local76] = local249;
			}
			if (local76 > 0 && Static177.anIntArrayArray24[local91][local76 - 1] == 0 && (local55[local87][local81 - 1] & 0x40A40000) == 0) {
				Static238.anIntArray380[local45] = local7;
				Static227.anIntArray376[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static177.anIntArrayArray24[local91][local76 - 1] = 1;
				Static238.anIntArrayArray42[local91][local76 - 1] = local249;
			}
			if (local76 < 127 && Static177.anIntArrayArray24[local91][local76 + 1] == 0 && (local55[local87][local81 + 1] & 0x48240000) == 0) {
				Static238.anIntArray380[local45] = local7;
				Static227.anIntArray376[local45] = local9 + 1;
				Static177.anIntArrayArray24[local91][local76 + 1] = 4;
				local45 = local45 + 1 & 0xFFF;
				Static238.anIntArrayArray42[local91][local76 + 1] = local249;
			}
			if (local91 > 0 && local76 > 0 && Static177.anIntArrayArray24[local91 - 1][local76 - 1] == 0 && (local55[local87 - 1][local81 - 1] & 0x43A40000) == 0 && (local55[local87 - 1][local81] & 0x42240000) == 0 && (local55[local87][local81 - 1] & 0x40A40000) == 0) {
				Static238.anIntArray380[local45] = local7 - 1;
				Static227.anIntArray376[local45] = local9 - 1;
				Static177.anIntArrayArray24[local91 - 1][local76 - 1] = 3;
				local45 = local45 + 1 & 0xFFF;
				Static238.anIntArrayArray42[local91 - 1][local76 - 1] = local249;
			}
			if (local91 < 127 && local76 > 0 && Static177.anIntArrayArray24[local91 + 1][local76 - 1] == 0 && (local55[local87 + 1][local81 - 1] & 0x60E40000) == 0 && (local55[local87 + 1][local81] & 0x60240000) == 0 && (local55[local87][local81 - 1] & 0x40A40000) == 0) {
				Static238.anIntArray380[local45] = local7 + 1;
				Static227.anIntArray376[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static177.anIntArrayArray24[local91 + 1][local76 - 1] = 9;
				Static238.anIntArrayArray42[local91 + 1][local76 - 1] = local249;
			}
			if (local91 > 0 && local76 < 127 && Static177.anIntArrayArray24[local91 - 1][local76 + 1] == 0 && (local55[local87 - 1][local81 + 1] & 0x4E240000) == 0 && (local55[local87 - 1][local81] & 0x42240000) == 0 && (local55[local87][local81 + 1] & 0x48240000) == 0) {
				Static238.anIntArray380[local45] = local7 - 1;
				Static227.anIntArray376[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static177.anIntArrayArray24[local91 - 1][local76 + 1] = 6;
				Static238.anIntArrayArray42[local91 - 1][local76 + 1] = local249;
			}
			if (local91 < 127 && local76 < 127 && Static177.anIntArrayArray24[local91 + 1][local76 + 1] == 0 && (local55[local87 + 1][local81 + 1] & 0x78240000) == 0 && (local55[local87 + 1][local81] & 0x60240000) == 0 && (local55[local87][local81 + 1] & 0x48240000) == 0) {
				Static238.anIntArray380[local45] = local7 + 1;
				Static227.anIntArray376[local45] = local9 + 1;
				Static177.anIntArrayArray24[local91 + 1][local76 + 1] = 12;
				local45 = local45 + 1 & 0xFFF;
				Static238.anIntArrayArray42[local91 + 1][local76 + 1] = local249;
			}
		}
		Static132.anInt2759 = local7;
		Static45.anInt929 = local9;
		return false;
	}
}
