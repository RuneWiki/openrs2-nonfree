import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "Lclient!dk;")
	public static Class54 aClass54_101;

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "F")
	public static float aFloat83;

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_128 = new Class211(85, 8);

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "[I")
	public static final int[] anIntArray528 = new int[100];

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBIIIIII)V")
	public static void method4786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg1 - arg4;
		@Pc(26) int local26 = arg2 - arg4;
		@Pc(30) int local30 = arg1 * arg1;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(38) int local38 = local21 * local21;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg2 << 1;
		@Pc(66) int local66 = local26 << 1;
		@Pc(75) int local75 = local30 * (1 - local62) + local46;
		@Pc(84) int local84 = local34 - local50 * (local62 - 1);
		@Pc(94) int local94 = (1 - local66) * local38 + local54;
		@Pc(102) int local102 = local42 - (local66 - 1) * local58;
		@Pc(106) int local106 = local30 << 2;
		@Pc(110) int local110 = local34 << 2;
		@Pc(114) int local114 = local38 << 2;
		@Pc(118) int local118 = local42 << 2;
		@Pc(122) int local122 = local46 * 3;
		@Pc(128) int local128 = (local62 - 3) * local50;
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = (local66 - 3) * local58;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (arg2 - 1);
		@Pc(148) int local148 = local118;
		@Pc(171) int local171;
		@Pc(179) int local179;
		@Pc(188) int local188;
		@Pc(196) int local196;
		if (Static219.anInt6125 <= arg5 && arg5 <= Static155.anInt2670) {
			@Pc(162) int[] local162 = Static229.anIntArrayArray26[arg5];
			local171 = Static331.method4435(arg3 - arg1, Static215.anInt3546, Static317.anInt6670);
			local179 = Static331.method4435(arg1 + arg3, Static215.anInt3546, Static317.anInt6670);
			local188 = Static331.method4435(arg3 - local21, Static215.anInt3546, Static317.anInt6670);
			local196 = Static331.method4435(local21 + arg3, Static215.anInt3546, Static317.anInt6670);
			Static216.method2862(local171, local188, arg0, local162);
			Static216.method2862(local188, local196, arg6, local162);
			Static216.method2862(local196, local179, arg0, local162);
		}
		@Pc(220) int local220 = local114 * (local26 - 1);
		while (local14 > 0) {
			@Pc(229) boolean local229 = local14 <= local26;
			if (local75 < 0) {
				while (local75 < 0) {
					local84 += local140;
					local75 += local122;
					local12++;
					local140 += local110;
					local122 += local110;
				}
			}
			if (local229) {
				if (local94 < 0) {
					while (local94 < 0) {
						local102 += local148;
						local94 += local132;
						local148 += local118;
						local16++;
						local132 += local118;
					}
				}
				if (local102 < 0) {
					local94 += local132;
					local102 += local148;
					local132 += local118;
					local148 += local118;
					local16++;
				}
				local94 += -local220;
				local102 += -local138;
				local138 -= local114;
				local220 -= local114;
			}
			if (local84 < 0) {
				local84 += local140;
				local75 += local122;
				local122 += local110;
				local12++;
				local140 += local110;
			}
			local84 += -local128;
			local75 += -local146;
			local146 -= local106;
			local128 -= local106;
			local14--;
			local171 = arg5 - local14;
			local179 = arg5 + local14;
			if (Static219.anInt6125 <= local179 && local171 <= Static155.anInt2670) {
				local188 = Static331.method4435(arg3 + local12, Static215.anInt3546, Static317.anInt6670);
				local196 = Static331.method4435(arg3 - local12, Static215.anInt3546, Static317.anInt6670);
				if (local229) {
					@Pc(438) int local438 = Static331.method4435(arg3 + local16, Static215.anInt3546, Static317.anInt6670);
					@Pc(447) int local447 = Static331.method4435(arg3 - local16, Static215.anInt3546, Static317.anInt6670);
					@Pc(458) int[] local458;
					if (Static219.anInt6125 <= local171) {
						local458 = Static229.anIntArrayArray26[local171];
						Static216.method2862(local196, local447, arg0, local458);
						Static216.method2862(local447, local438, arg6, local458);
						Static216.method2862(local438, local188, arg0, local458);
					}
					if (local179 <= Static155.anInt2670) {
						local458 = Static229.anIntArrayArray26[local179];
						Static216.method2862(local196, local447, arg0, local458);
						Static216.method2862(local447, local438, arg6, local458);
						Static216.method2862(local438, local188, arg0, local458);
					}
				} else {
					if (local171 >= Static219.anInt6125) {
						Static216.method2862(local196, local188, arg0, Static229.anIntArrayArray26[local171]);
					}
					if (Static155.anInt2670 >= local179) {
						Static216.method2862(local196, local188, arg0, Static229.anIntArrayArray26[local179]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBJI)V")
	public static void method4788(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg1 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static111.method1707(arg2, local22, local15, 0, arg0, 0, 0, true);
			return;
		}
		@Pc(61) Class192 local61 = Static50.aClass190_1.method4218(local29);
		@Pc(69) int local69;
		@Pc(72) int local72;
		if (local22 == 0 || local22 == 2) {
			local72 = local61.anInt5355;
			local69 = local61.anInt5321;
		} else {
			local69 = local61.anInt5355;
			local72 = local61.anInt5321;
		}
		@Pc(83) int local83 = local61.anInt5348;
		if (local22 != 0) {
			local83 = (local83 << local22 & 0xF) + (local83 >> 4 - local22);
		}
		Static111.method1707(arg2, 0, 0, local72, arg0, local83, local69, true);
	}
}
