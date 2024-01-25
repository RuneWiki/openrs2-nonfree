import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!vfa;")
	public static Class329 aClass329_3;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!wt;")
	public static final Class6_Sub51 aClass6_Sub51_2 = new Class6_Sub51(0, 0);

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_49 = new Class98(23, 1);

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
	public static int anInt3808 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg3;
		@Pc(21) int local21 = arg0 - arg3;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(57) int local57 = local33 << 1;
		@Pc(61) int local61 = arg0 << 1;
		@Pc(65) int local65 = local21 << 1;
		@Pc(74) int local74 = local25 * (1 - local61) + local41;
		@Pc(83) int local83 = local29 - (local61 - 1) * local45;
		@Pc(93) int local93 = local33 * (1 - local65) + local49;
		@Pc(102) int local102 = local37 - local57 * (local65 - 1);
		@Pc(106) int local106 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = local45 * (local61 - 3);
		@Pc(132) int local132 = local49 * 3;
		@Pc(138) int local138 = (local65 - 3) * local57;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = (arg0 - 1) * local106;
		@Pc(148) int local148 = local118;
		@Pc(166) int local166;
		@Pc(174) int local174;
		@Pc(183) int local183;
		@Pc(192) int local192;
		if (arg2 >= Static133.anInt2531 && arg2 <= Static52.anInt1226) {
			@Pc(158) int[] local158 = Static155.anIntArrayArray32[arg2];
			local166 = Static502.method6952(Static205.anInt3906, arg5 - arg6, Static529.anInt9806);
			local174 = Static502.method6952(Static205.anInt3906, arg5 + arg6, Static529.anInt9806);
			local183 = Static502.method6952(Static205.anInt3906, arg5 - local16, Static529.anInt9806);
			local192 = Static502.method6952(Static205.anInt3906, arg5 + local16, Static529.anInt9806);
			Static264.method4006(local183, arg4, local166, local158);
			Static264.method4006(local192, arg1, local183, local158);
			Static264.method4006(local174, arg4, local192, local158);
		}
		@Pc(216) int local216 = (local21 - 1) * local114;
		while (local9 > 0) {
			@Pc(229) boolean local229 = local9 <= local21;
			if (local74 < 0) {
				while (local74 < 0) {
					local74 += local122;
					local83 += local140;
					local7++;
					local122 += local110;
					local140 += local110;
				}
			}
			if (local229) {
				if (local93 < 0) {
					while (local93 < 0) {
						local102 += local148;
						local93 += local132;
						local11++;
						local132 += local118;
						local148 += local118;
					}
				}
				if (local102 < 0) {
					local93 += local132;
					local102 += local148;
					local132 += local118;
					local148 += local118;
					local11++;
				}
				local93 += -local216;
				local102 += -local138;
				local138 -= local114;
				local216 -= local114;
			}
			if (local83 < 0) {
				local74 += local122;
				local83 += local140;
				local7++;
				local122 += local110;
				local140 += local110;
			}
			local74 += -local146;
			local83 += -local128;
			local9--;
			local128 -= local106;
			local146 -= local106;
			local166 = arg2 - local9;
			local174 = arg2 + local9;
			if (local174 >= Static133.anInt2531 && Static52.anInt1226 >= local166) {
				local183 = Static502.method6952(Static205.anInt3906, local7 + arg5, Static529.anInt9806);
				local192 = Static502.method6952(Static205.anInt3906, arg5 - local7, Static529.anInt9806);
				if (local229) {
					@Pc(412) int local412 = Static502.method6952(Static205.anInt3906, local11 + arg5, Static529.anInt9806);
					@Pc(421) int local421 = Static502.method6952(Static205.anInt3906, arg5 - local11, Static529.anInt9806);
					@Pc(432) int[] local432;
					if (local166 >= Static133.anInt2531) {
						local432 = Static155.anIntArrayArray32[local166];
						Static264.method4006(local421, arg4, local192, local432);
						Static264.method4006(local412, arg1, local421, local432);
						Static264.method4006(local183, arg4, local412, local432);
					}
					if (Static52.anInt1226 >= local174) {
						local432 = Static155.anIntArrayArray32[local174];
						Static264.method4006(local421, arg4, local192, local432);
						Static264.method4006(local412, arg1, local421, local432);
						Static264.method4006(local183, arg4, local412, local432);
					}
				} else {
					if (local166 >= Static133.anInt2531) {
						Static264.method4006(local183, arg4, local192, Static155.anIntArrayArray32[local166]);
					}
					if (Static52.anInt1226 >= local174) {
						Static264.method4006(local183, arg4, local192, Static155.anIntArrayArray32[local174]);
					}
				}
			}
		}
	}
}
