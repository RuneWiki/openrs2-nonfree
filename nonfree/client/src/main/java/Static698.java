import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static698 {

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_157 = new Class349(72, 8);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method9382(@OriginalArg(0) Class145 arg0) {
		if (Static437.aBoolean603) {
			Static271.method3798(arg0);
		} else {
			Static505.method7162(arg0);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBIIIIIIIILclient!lka;)Z")
	public static boolean method9383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class226 arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg2;
		@Pc(25) int local25 = arg3 - 64;
		Static313.anIntArrayArray38[64][64] = 99;
		@Pc(35) int local35 = arg2 - 64;
		Static171.anIntArrayArray19[64][64] = 0;
		@Pc(43) byte local43 = 0;
		@Pc(45) int local45 = 0;
		Static564.anIntArray640[0] = arg3;
		@Pc(52) int local52 = local43 + 1;
		Static585.anIntArray674[0] = arg2;
		@Pc(57) int[][] local57 = arg9.anIntArrayArray41;
		while (local52 != local45) {
			local9 = Static585.anIntArray674[local45];
			local7 = Static564.anIntArray640[local45];
			@Pc(72) int local72 = local9 - local35;
			@Pc(78) int local78 = local9 - arg9.anInt5886;
			@Pc(83) int local83 = local7 - local25;
			local45 = local45 + 1 & 0xFFF;
			@Pc(95) int local95 = local7 - arg9.anInt5905;
			if (arg5 == -4) {
				if (local7 == arg7 && local9 == arg6) {
					Static313.anInt4796 = local7;
					Static653.anInt10222 = local9;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static397.method5858(1, arg0, local7, 1, arg7, arg4, local9, arg6)) {
					Static653.anInt10222 = local9;
					Static313.anInt4796 = local7;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg9.method5271(arg7, local7, local9, arg1, 1, arg4, arg6, arg0, 1)) {
					Static653.anInt10222 = local9;
					Static313.anInt4796 = local7;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg9.method5273(arg0, arg1, local9, arg7, 1, arg6, arg4, local7)) {
					Static313.anInt4796 = local7;
					Static653.anInt10222 = local9;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg9.method5277(arg8, 1, arg5, arg7, local9, local7, arg6)) {
					Static653.anInt10222 = local9;
					Static313.anInt4796 = local7;
					return true;
				}
			} else if (arg9.method5272(1, arg5, arg8, arg7, arg6, local9, local7)) {
				Static313.anInt4796 = local7;
				Static653.anInt10222 = local9;
				return true;
			}
			@Pc(274) int local274 = Static171.anIntArrayArray19[local83][local72] + 1;
			if (local83 > 0 && Static313.anIntArrayArray38[local83 - 1][local72] == 0 && (local57[local95 - 1][local78] & 0x42240000) == 0) {
				Static564.anIntArray640[local52] = local7 - 1;
				Static585.anIntArray674[local52] = local9;
				Static313.anIntArrayArray38[local83 - 1][local72] = 2;
				local52 = local52 + 1 & 0xFFF;
				Static171.anIntArrayArray19[local83 - 1][local72] = local274;
			}
			if (local83 < 127 && Static313.anIntArrayArray38[local83 + 1][local72] == 0 && (local57[local95 + 1][local78] & 0x60240000) == 0) {
				Static564.anIntArray640[local52] = local7 + 1;
				Static585.anIntArray674[local52] = local9;
				local52 = local52 + 1 & 0xFFF;
				Static313.anIntArrayArray38[local83 + 1][local72] = 8;
				Static171.anIntArrayArray19[local83 + 1][local72] = local274;
			}
			if (local72 > 0 && Static313.anIntArrayArray38[local83][local72 - 1] == 0 && (local57[local95][local78 - 1] & 0x40A40000) == 0) {
				Static564.anIntArray640[local52] = local7;
				Static585.anIntArray674[local52] = local9 - 1;
				Static313.anIntArrayArray38[local83][local72 - 1] = 1;
				local52 = local52 + 1 & 0xFFF;
				Static171.anIntArrayArray19[local83][local72 - 1] = local274;
			}
			if (local72 < 127 && Static313.anIntArrayArray38[local83][local72 + 1] == 0 && (local57[local95][local78 + 1] & 0x48240000) == 0) {
				Static564.anIntArray640[local52] = local7;
				Static585.anIntArray674[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static313.anIntArrayArray38[local83][local72 + 1] = 4;
				Static171.anIntArrayArray19[local83][local72 + 1] = local274;
			}
			if (local83 > 0 && local72 > 0 && Static313.anIntArrayArray38[local83 - 1][local72 - 1] == 0 && (local57[local95 - 1][local78 - 1] & 0x43A40000) == 0 && (local57[local95 - 1][local78] & 0x42240000) == 0 && (local57[local95][local78 - 1] & 0x40A40000) == 0) {
				Static564.anIntArray640[local52] = local7 - 1;
				Static585.anIntArray674[local52] = local9 - 1;
				Static313.anIntArrayArray38[local83 - 1][local72 - 1] = 3;
				local52 = local52 + 1 & 0xFFF;
				Static171.anIntArrayArray19[local83 - 1][local72 - 1] = local274;
			}
			if (local83 < 127 && local72 > 0 && Static313.anIntArrayArray38[local83 + 1][local72 - 1] == 0 && (local57[local95 + 1][local78 - 1] & 0x60E40000) == 0 && (local57[local95 + 1][local78] & 0x60240000) == 0 && (local57[local95][local78 - 1] & 0x40A40000) == 0) {
				Static564.anIntArray640[local52] = local7 + 1;
				Static585.anIntArray674[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static313.anIntArrayArray38[local83 + 1][local72 - 1] = 9;
				Static171.anIntArrayArray19[local83 + 1][local72 - 1] = local274;
			}
			if (local83 > 0 && local72 < 127 && Static313.anIntArrayArray38[local83 - 1][local72 + 1] == 0 && (local57[local95 - 1][local78 + 1] & 0x4E240000) == 0 && (local57[local95 - 1][local78] & 0x42240000) == 0 && (local57[local95][local78 + 1] & 0x48240000) == 0) {
				Static564.anIntArray640[local52] = local7 - 1;
				Static585.anIntArray674[local52] = local9 + 1;
				Static313.anIntArrayArray38[local83 - 1][local72 + 1] = 6;
				local52 = local52 + 1 & 0xFFF;
				Static171.anIntArrayArray19[local83 - 1][local72 + 1] = local274;
			}
			if (local83 < 127 && local72 < 127 && Static313.anIntArrayArray38[local83 + 1][local72 + 1] == 0 && (local57[local95 + 1][local78 + 1] & 0x78240000) == 0 && (local57[local95 + 1][local78] & 0x60240000) == 0 && (local57[local95][local78 + 1] & 0x48240000) == 0) {
				Static564.anIntArray640[local52] = local7 + 1;
				Static585.anIntArray674[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static313.anIntArrayArray38[local83 + 1][local72 + 1] = 12;
				Static171.anIntArrayArray19[local83 + 1][local72 + 1] = local274;
			}
		}
		Static653.anInt10222 = local9;
		Static313.anInt4796 = local7;
		return false;
	}
}
