import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "[I")
	public static int[] anIntArray659;

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "Lclient!vfa;")
	public static Class361 aClass361_11;

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[100];

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BIIIIIIIIILclient!nt;)Z")
	public static boolean method8046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class240 arg9) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg7;
		@Pc(18) int local18 = arg4 - 64;
		@Pc(22) int local22 = arg7 - 64;
		Static283.anIntArrayArray46[64][64] = 99;
		Static283.anIntArrayArray47[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static314.anIntArray343[0] = arg4;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static493.anIntArray569[0] = arg7;
		@Pc(58) int[][] local58 = arg9.anIntArrayArray40;
		while (local45 != local42) {
			local7 = Static314.anIntArray343[local42];
			local9 = Static493.anIntArray569[local42];
			@Pc(73) int local73 = local9 - local22;
			@Pc(77) int local77 = local7 - local18;
			@Pc(83) int local83 = local9 - arg9.anInt6073;
			local42 = local42 + 1 & 0xFFF;
			@Pc(95) int local95 = local7 - arg9.anInt6066;
			if (arg2 == -4) {
				if (local7 == arg8 && arg6 == local9) {
					Static395.anInt6217 = local7;
					Static350.anInt5488 = local9;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static155.method2316(local9, 1, local7, arg6, 1, arg3, arg1, arg8)) {
					Static395.anInt6217 = local7;
					Static350.anInt5488 = local9;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg9.method5177(local9, arg3, arg6, arg1, 1, local7, arg8, arg5, 1)) {
					Static395.anInt6217 = local7;
					Static350.anInt5488 = local9;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg9.method5185(1, local9, arg5, local7, arg8, arg1, arg3, arg6)) {
					Static395.anInt6217 = local7;
					Static350.anInt5488 = local9;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg9.method5175(arg2, 1, local7, local9, arg6, arg0, arg8)) {
					Static395.anInt6217 = local7;
					Static350.anInt5488 = local9;
					return true;
				}
			} else if (arg9.method5189(arg8, arg6, local7, arg2, local9, 1, arg0)) {
				Static395.anInt6217 = local7;
				Static350.anInt5488 = local9;
				return true;
			}
			@Pc(249) int local249 = Static283.anIntArrayArray47[local77][local73] + 1;
			if (local77 > 0 && Static283.anIntArrayArray46[local77 - 1][local73] == 0 && (local58[local95 - 1][local83] & 0x42240000) == 0) {
				Static314.anIntArray343[local45] = local7 - 1;
				Static493.anIntArray569[local45] = local9;
				Static283.anIntArrayArray46[local77 - 1][local73] = 2;
				local45 = local45 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local77 - 1][local73] = local249;
			}
			if (local77 < 127 && Static283.anIntArrayArray46[local77 + 1][local73] == 0 && (local58[local95 + 1][local83] & 0x60240000) == 0) {
				Static314.anIntArray343[local45] = local7 + 1;
				Static493.anIntArray569[local45] = local9;
				Static283.anIntArrayArray46[local77 + 1][local73] = 8;
				local45 = local45 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local77 + 1][local73] = local249;
			}
			if (local73 > 0 && Static283.anIntArrayArray46[local77][local73 - 1] == 0 && (local58[local95][local83 - 1] & 0x40A40000) == 0) {
				Static314.anIntArray343[local45] = local7;
				Static493.anIntArray569[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static283.anIntArrayArray46[local77][local73 - 1] = 1;
				Static283.anIntArrayArray47[local77][local73 - 1] = local249;
			}
			if (local73 < 127 && Static283.anIntArrayArray46[local77][local73 + 1] == 0 && (local58[local95][local83 + 1] & 0x48240000) == 0) {
				Static314.anIntArray343[local45] = local7;
				Static493.anIntArray569[local45] = local9 + 1;
				Static283.anIntArrayArray46[local77][local73 + 1] = 4;
				local45 = local45 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local77][local73 + 1] = local249;
			}
			if (local77 > 0 && local73 > 0 && Static283.anIntArrayArray46[local77 - 1][local73 - 1] == 0 && (local58[local95 - 1][local83 - 1] & 0x43A40000) == 0 && (local58[local95 - 1][local83] & 0x42240000) == 0 && (local58[local95][local83 - 1] & 0x40A40000) == 0) {
				Static314.anIntArray343[local45] = local7 - 1;
				Static493.anIntArray569[local45] = local9 - 1;
				Static283.anIntArrayArray46[local77 - 1][local73 - 1] = 3;
				local45 = local45 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local77 - 1][local73 - 1] = local249;
			}
			if (local77 < 127 && local73 > 0 && Static283.anIntArrayArray46[local77 + 1][local73 - 1] == 0 && (local58[local95 + 1][local83 - 1] & 0x60E40000) == 0 && (local58[local95 + 1][local83] & 0x60240000) == 0 && (local58[local95][local83 - 1] & 0x40A40000) == 0) {
				Static314.anIntArray343[local45] = local7 + 1;
				Static493.anIntArray569[local45] = local9 - 1;
				Static283.anIntArrayArray46[local77 + 1][local73 - 1] = 9;
				local45 = local45 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local77 + 1][local73 - 1] = local249;
			}
			if (local77 > 0 && local73 < 127 && Static283.anIntArrayArray46[local77 - 1][local73 + 1] == 0 && (local58[local95 - 1][local83 + 1] & 0x4E240000) == 0 && (local58[local95 - 1][local83] & 0x42240000) == 0 && (local58[local95][local83 + 1] & 0x48240000) == 0) {
				Static314.anIntArray343[local45] = local7 - 1;
				Static493.anIntArray569[local45] = local9 + 1;
				Static283.anIntArrayArray46[local77 - 1][local73 + 1] = 6;
				local45 = local45 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local77 - 1][local73 + 1] = local249;
			}
			if (local77 < 127 && local73 < 127 && Static283.anIntArrayArray46[local77 + 1][local73 + 1] == 0 && (local58[local95 + 1][local83 + 1] & 0x78240000) == 0 && (local58[local95 + 1][local83] & 0x60240000) == 0 && (local58[local95][local83 + 1] & 0x48240000) == 0) {
				Static314.anIntArray343[local45] = local7 + 1;
				Static493.anIntArray569[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static283.anIntArrayArray46[local77 + 1][local73 + 1] = 12;
				Static283.anIntArrayArray47[local77 + 1][local73 + 1] = local249;
			}
		}
		Static395.anInt6217 = local7;
		Static350.anInt5488 = local9;
		return false;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIIZ)V")
	public static void method8048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(16) int local16 = 0; local16 < Static385.anInt6044; local16++) {
			@Pc(22) Rectangle local22 = Class2_Sub2_Sub10.aRectangleArray1[local16];
			if (local22.width + local22.x > arg1 && local22.x < arg3 + arg1 && arg0 < local22.height + local22.y && local22.y < arg0 + arg2) {
				Static498.aBooleanArray144[local16] = true;
			}
		}
		Static170.method7976(arg1 + arg3, arg0 - -arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)I")
	public static int method8050(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
