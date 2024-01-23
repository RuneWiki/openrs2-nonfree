import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "[I")
	public static int[] anIntArray21;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "[I")
	public static int[] anIntArray19 = new int[500];

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
	public static int anInt386 = 0;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static volatile int anInt387 = 0;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
	public static int[] anIntArray20 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public static void method360() {
		if (Static133.aClass54_1 != null) {
			@Pc(15) Class54 local15 = Static133.aClass54_1;
			synchronized (Static133.aClass54_1) {
				Static133.aClass54_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZB)V")
	public static void method361(@OriginalArg(0) boolean arg0) {
		@Pc(6) Class1_Sub8 local6;
		for (local6 = (Class1_Sub8) Static75.aClass59_18.method1704(); local6 != null; local6 = (Class1_Sub8) Static75.aClass59_18.method1701()) {
			if (local6.aClass1_Sub24_Sub2_1 != null) {
				Static205.aClass1_Sub24_Sub3_1.method4518(local6.aClass1_Sub24_Sub2_1);
				local6.aClass1_Sub24_Sub2_1 = null;
			}
			if (local6.aClass1_Sub24_Sub2_2 != null) {
				Static205.aClass1_Sub24_Sub3_1.method4518(local6.aClass1_Sub24_Sub2_2);
				local6.aClass1_Sub24_Sub2_2 = null;
			}
			local6.method4779();
		}
		if (!arg0) {
			return;
		}
		for (local6 = (Class1_Sub8) Static93.aClass59_20.method1704(); local6 != null; local6 = (Class1_Sub8) Static93.aClass59_20.method1701()) {
			if (local6.aClass1_Sub24_Sub2_1 != null) {
				Static205.aClass1_Sub24_Sub3_1.method4518(local6.aClass1_Sub24_Sub2_1);
				local6.aClass1_Sub24_Sub2_1 = null;
			}
			local6.method4779();
		}
		for (local6 = (Class1_Sub8) Static132.aClass142_18.method3534(); local6 != null; local6 = (Class1_Sub8) Static132.aClass142_18.method3530()) {
			if (local6.aClass1_Sub24_Sub2_1 != null) {
				Static205.aClass1_Sub24_Sub3_1.method4518(local6.aClass1_Sub24_Sub2_1);
				local6.aClass1_Sub24_Sub2_1 = null;
			}
			local6.method4779();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIBIIIII)V")
	public static void method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg6;
		@Pc(20) int local20 = arg1 - arg6;
		@Pc(24) int local24 = arg1 * arg1;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local24 << 1;
		@Pc(44) int local44 = local28 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = arg1 << 1;
		@Pc(56) int local56 = local32 << 1;
		@Pc(65) int local65 = (1 - local52) * local28 + local40;
		@Pc(69) int local69 = local20 << 1;
		@Pc(77) int local77 = local36 - (local69 - 1) * local56;
		@Pc(90) int local90 = local24 - local44 * (local52 - 1);
		@Pc(94) int local94 = local28 << 2;
		@Pc(102) int local102 = local48 + (1 - local69) * local32;
		@Pc(106) int local106 = local24 << 2;
		@Pc(110) int local110 = local32 << 2;
		@Pc(114) int local114 = local36 << 2;
		@Pc(118) int local118 = local40 * 3;
		@Pc(124) int local124 = local44 * (local52 - 3);
		@Pc(130) int local130 = local56 * (local69 - 3);
		@Pc(136) int local136 = local94 * (arg1 - 1);
		@Pc(138) int local138 = local106;
		@Pc(142) int local142 = local48 * 3;
		@Pc(144) int local144 = local114;
		@Pc(150) int local150 = local110 * (local20 - 1);
		@Pc(179) int local179;
		@Pc(187) int local187;
		@Pc(196) int local196;
		@Pc(204) int local204;
		if (Static98.anInt2007 <= arg0 && arg0 <= Static213.anInt4452) {
			@Pc(169) int[] local169 = Static183.anIntArrayArray26[arg0];
			local179 = Static226.method3512(arg3 - arg5, Static29.anInt517, Static11.anInt170);
			local187 = Static226.method3512(arg3 + arg5, Static29.anInt517, Static11.anInt170);
			local196 = Static226.method3512(arg3 - local16, Static29.anInt517, Static11.anInt170);
			local204 = Static226.method3512(arg3 + local16, Static29.anInt517, Static11.anInt170);
			Static273.method4257(local179, local169, arg2, local196);
			Static273.method4257(local196, local169, arg4, local204);
			Static273.method4257(local204, local169, arg2, local187);
		}
		while (local9 > 0) {
			if (local65 < 0) {
				while (local65 < 0) {
					local65 += local118;
					local118 += local106;
					local90 += local138;
					local138 += local106;
					local3++;
				}
			}
			if (local90 < 0) {
				local90 += local138;
				local3++;
				local65 += local118;
				local118 += local106;
				local138 += local106;
			}
			local65 += -local136;
			local136 -= local94;
			local90 += -local124;
			@Pc(292) boolean local292 = local9 <= local20;
			local124 -= local94;
			local9--;
			local187 = local9 + arg0;
			local179 = arg0 - local9;
			if (local292) {
				if (local102 < 0) {
					while (local102 < 0) {
						local77 += local144;
						local102 += local142;
						local142 += local114;
						local11++;
						local144 += local114;
					}
				}
				if (local77 < 0) {
					local77 += local144;
					local102 += local142;
					local11++;
					local142 += local114;
					local144 += local114;
				}
				local102 += -local150;
				local150 -= local110;
				local77 += -local130;
				local130 -= local110;
			}
			if (Static98.anInt2007 <= local187 && Static213.anInt4452 >= local179) {
				local196 = Static226.method3512(arg3 + local3, Static29.anInt517, Static11.anInt170);
				local204 = Static226.method3512(arg3 - local3, Static29.anInt517, Static11.anInt170);
				if (local292) {
					@Pc(439) int local439 = Static226.method3512(arg3 + local11, Static29.anInt517, Static11.anInt170);
					@Pc(447) int local447 = Static226.method3512(arg3 - local11, Static29.anInt517, Static11.anInt170);
					@Pc(458) int[] local458;
					if (Static98.anInt2007 <= local179) {
						local458 = Static183.anIntArrayArray26[local179];
						Static273.method4257(local204, local458, arg2, local447);
						Static273.method4257(local447, local458, arg4, local439);
						Static273.method4257(local439, local458, arg2, local196);
					}
					if (local187 <= Static213.anInt4452) {
						local458 = Static183.anIntArrayArray26[local187];
						Static273.method4257(local204, local458, arg2, local447);
						Static273.method4257(local447, local458, arg4, local439);
						Static273.method4257(local439, local458, arg2, local196);
					}
				} else {
					if (local179 >= Static98.anInt2007) {
						Static273.method4257(local204, Static183.anIntArrayArray26[local179], arg2, local196);
					}
					if (local187 <= Static213.anInt4452) {
						Static273.method4257(local204, Static183.anIntArrayArray26[local187], arg2, local196);
					}
				}
			}
		}
	}
}
