import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "Lclient!lga;")
	public static Class223 aClass223_24;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Lclient!jh;")
	public static Class189 aClass189_2;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_17 = new Class340();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZII)Z")
	public static boolean method2163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!uda;IIIIIIIII)Z")
	public static boolean method2164(@OriginalArg(0) int arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg3 - 64;
		@Pc(23) int local23 = arg4 - 64;
		Static2.anIntArrayArray1[64][64] = 99;
		Static311.anIntArrayArray30[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static173.anIntArray191[0] = arg3;
		@Pc(49) int local49 = 0;
		@Pc(52) int local52 = local37 + 1;
		Static313.anIntArray315[0] = arg4;
		@Pc(57) int[][] local57 = arg1.anIntArrayArray53;
		while (local52 != local49) {
			local9 = Static313.anIntArray315[local49];
			local7 = Static173.anIntArray191[local49];
			local49 = local49 + 1 & 0xFFF;
			@Pc(78) int local78 = local7 - local18;
			@Pc(83) int local83 = local9 - local23;
			@Pc(89) int local89 = local7 - arg1.anInt9620;
			@Pc(95) int local95 = local9 - arg1.anInt9604;
			if (arg7 == -4) {
				if (arg2 == local7 && local9 == arg0) {
					Static150.anInt3124 = local7;
					Static322.anInt5560 = local9;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static51.method616(2, local7, local9, 2, arg2, arg6, arg0, arg5)) {
					Static322.anInt5560 = local9;
					Static150.anInt3124 = local7;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg1.method8384(arg0, arg8, arg5, arg2, local7, 2, 2, arg6, local9)) {
					Static322.anInt5560 = local9;
					Static150.anInt3124 = local7;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg1.method8390(arg0, local9, arg5, local7, 2, arg2, arg8, arg6)) {
					Static322.anInt5560 = local9;
					Static150.anInt3124 = local7;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg1.method8392(local9, arg9, arg2, local7, arg0, arg7, 2)) {
					Static150.anInt3124 = local7;
					Static322.anInt5560 = local9;
					return true;
				}
			} else if (arg1.method8398(local7, arg9, local9, arg7, arg2, 2, arg0)) {
				Static322.anInt5560 = local9;
				Static150.anInt3124 = local7;
				return true;
			}
			@Pc(265) int local265 = Static311.anIntArrayArray30[local78][local83] + 1;
			if (local78 > 0 && Static2.anIntArrayArray1[local78 - 1][local83] == 0 && (local57[local89 - 1][local95] & 0x43A40000) == 0 && (local57[local89 - 1][local95 + 1] & 0x4E240000) == 0) {
				Static173.anIntArray191[local52] = local7 - 1;
				Static313.anIntArray315[local52] = local9;
				Static2.anIntArrayArray1[local78 - 1][local83] = 2;
				local52 = local52 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local78 - 1][local83] = local265;
			}
			if (local78 < 126 && Static2.anIntArrayArray1[local78 + 1][local83] == 0 && (local57[local89 + 2][local95] & 0x60E40000) == 0 && (local57[local89 + 2][local95 + 1] & 0x78240000) == 0) {
				Static173.anIntArray191[local52] = local7 + 1;
				Static313.anIntArray315[local52] = local9;
				local52 = local52 + 1 & 0xFFF;
				Static2.anIntArrayArray1[local78 + 1][local83] = 8;
				Static311.anIntArrayArray30[local78 + 1][local83] = local265;
			}
			if (local83 > 0 && Static2.anIntArrayArray1[local78][local83 - 1] == 0 && (local57[local89][local95 - 1] & 0x43A40000) == 0 && (local57[local89 + 1][local95 - 1] & 0x60E40000) == 0) {
				Static173.anIntArray191[local52] = local7;
				Static313.anIntArray315[local52] = local9 - 1;
				Static2.anIntArrayArray1[local78][local83 - 1] = 1;
				local52 = local52 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local78][local83 - 1] = local265;
			}
			if (local83 < 126 && Static2.anIntArrayArray1[local78][local83 + 1] == 0 && (local57[local89][local95 + 2] & 0x4E240000) == 0 && (local57[local89 + 1][local95 + 2] & 0x78240000) == 0) {
				Static173.anIntArray191[local52] = local7;
				Static313.anIntArray315[local52] = local9 + 1;
				Static2.anIntArrayArray1[local78][local83 + 1] = 4;
				local52 = local52 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local78][local83 + 1] = local265;
			}
			if (local78 > 0 && local83 > 0 && Static2.anIntArrayArray1[local78 - 1][local83 - 1] == 0 && (local57[local89 - 1][local95] & 0x4FA40000) == 0 && (local57[local89 - 1][local95 - 1] & 0x43A40000) == 0 && (local57[local89][local95 - 1] & 0x63E40000) == 0) {
				Static173.anIntArray191[local52] = local7 - 1;
				Static313.anIntArray315[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static2.anIntArrayArray1[local78 - 1][local83 - 1] = 3;
				Static311.anIntArrayArray30[local78 - 1][local83 - 1] = local265;
			}
			if (local78 < 126 && local83 > 0 && Static2.anIntArrayArray1[local78 + 1][local83 - 1] == 0 && (local57[local89 + 1][local95 - 1] & 0x63E40000) == 0 && (local57[local89 + 2][local95 - 1] & 0x60E40000) == 0 && (local57[local89 + 2][local95] & 0x78E40000) == 0) {
				Static173.anIntArray191[local52] = local7 + 1;
				Static313.anIntArray315[local52] = local9 - 1;
				Static2.anIntArrayArray1[local78 + 1][local83 - 1] = 9;
				local52 = local52 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local78 + 1][local83 - 1] = local265;
			}
			if (local78 > 0 && local83 < 126 && Static2.anIntArrayArray1[local78 - 1][local83 + 1] == 0 && (local57[local89 - 1][local95 + 1] & 0x4FA40000) == 0 && (local57[local89 - 1][local95 + 2] & 0x4E240000) == 0 && (local57[local89][local95 + 2] & 0x7E240000) == 0) {
				Static173.anIntArray191[local52] = local7 - 1;
				Static313.anIntArray315[local52] = local9 + 1;
				Static2.anIntArrayArray1[local78 - 1][local83 + 1] = 6;
				local52 = local52 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local78 - 1][local83 + 1] = local265;
			}
			if (local78 < 126 && local83 < 126 && Static2.anIntArrayArray1[local78 + 1][local83 + 1] == 0 && (local57[local89 + 1][local95 + 2] & 0x7E240000) == 0 && (local57[local89 + 2][local95 + 2] & 0x78240000) == 0 && (local57[local89 + 2][local95 + 1] & 0x78E40000) == 0) {
				Static173.anIntArray191[local52] = local7 + 1;
				Static313.anIntArray315[local52] = local9 + 1;
				Static2.anIntArrayArray1[local78 + 1][local83 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local78 + 1][local83 + 1] = local265;
			}
		}
		Static322.anInt5560 = local9;
		Static150.anInt3124 = local7;
		return false;
	}
}
