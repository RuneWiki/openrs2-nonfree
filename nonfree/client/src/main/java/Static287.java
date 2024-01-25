import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
	public static int anInt5028;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
	public static int anInt5030;

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "Lclient!la;")
	public static Class76 aClass76_3;

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_119 = new Class119("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	public static int anInt5027 = 0;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "Lclient!oq;")
	public static final Class182 aClass182_6 = new Class182("", 10);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIBIII)V")
	public static void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg0;
		@Pc(21) int local21 = arg3 - arg0;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(46) int local46 = local29 << 1;
		@Pc(50) int local50 = local25 << 1;
		@Pc(54) int local54 = local37 << 1;
		@Pc(58) int local58 = local33 << 1;
		@Pc(62) int local62 = arg3 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(75) int local75 = local46 + (1 - local62) * local25;
		@Pc(84) int local84 = local29 - local50 * (local62 - 1);
		@Pc(93) int local93 = local54 + (1 - local66) * local33;
		@Pc(102) int local102 = local37 - (local66 - 1) * local58;
		@Pc(106) int local106 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(122) int local122 = local46 * 3;
		@Pc(128) int local128 = local50 * (local62 - 3);
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = (local66 - 3) * local58;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = (arg3 - 1) * local106;
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = (local21 - 1) * local114;
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(194) int local194;
		@Pc(202) int local202;
		if (arg4 >= Static289.anInt5053 && Static93.anInt1676 >= arg4) {
			@Pc(168) int[] local168 = Static67.anIntArrayArray13[arg4];
			local177 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 - arg6);
			local185 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 + arg6);
			local194 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 - local16);
			local202 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 + local16);
			Static2.method38(local194, arg2, local168, local177);
			Static2.method38(local202, arg1, local168, local194);
			Static2.method38(local185, arg2, local168, local202);
		}
		while (local9 > 0) {
			@Pc(233) boolean local233 = local21 >= local9;
			if (local233) {
				if (local93 < 0) {
					while (local93 < 0) {
						local102 += local148;
						local93 += local132;
						local148 += local118;
						local11++;
						local132 += local118;
					}
				}
				if (local102 < 0) {
					local93 += local132;
					local102 += local148;
					local148 += local118;
					local132 += local118;
					local11++;
				}
				local102 += -local138;
				local93 += -local154;
				local154 -= local114;
				local138 -= local114;
			}
			if (local75 < 0) {
				while (local75 < 0) {
					local84 += local140;
					local75 += local122;
					local140 += local110;
					local122 += local110;
					local7++;
				}
			}
			if (local84 < 0) {
				local84 += local140;
				local75 += local122;
				local122 += local110;
				local7++;
				local140 += local110;
			}
			local84 += -local128;
			local75 += -local146;
			local146 -= local106;
			local128 -= local106;
			local9--;
			local177 = arg4 - local9;
			local185 = local9 + arg4;
			if (local185 >= Static289.anInt5053 && Static93.anInt1676 >= local177) {
				local194 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 + local7);
				local202 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 - local7);
				if (local233) {
					@Pc(401) int local401 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, local11 + arg5);
					@Pc(410) int local410 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 - local11);
					@Pc(421) int[] local421;
					if (Static289.anInt5053 <= local177) {
						local421 = Static67.anIntArrayArray13[local177];
						Static2.method38(local410, arg2, local421, local202);
						Static2.method38(local401, arg1, local421, local410);
						Static2.method38(local194, arg2, local421, local401);
					}
					if (Static93.anInt1676 >= local185) {
						local421 = Static67.anIntArrayArray13[local185];
						Static2.method38(local410, arg2, local421, local202);
						Static2.method38(local401, arg1, local421, local410);
						Static2.method38(local194, arg2, local421, local401);
					}
				} else {
					if (Static289.anInt5053 <= local177) {
						Static2.method38(local194, arg2, Static67.anIntArrayArray13[local177], local202);
					}
					if (Static93.anInt1676 >= local185) {
						Static2.method38(local194, arg2, Static67.anIntArrayArray13[local185], local202);
					}
				}
			}
		}
	}
}
