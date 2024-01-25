import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_75 = new Class27(75, 7);

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public static int anInt4704 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg0;
		@Pc(21) int local21 = arg1 - arg0;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local25 * (1 - local57) + local41;
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(87) int local87 = local49 + local33 * (1 - local61);
		@Pc(96) int local96 = local37 - local53 * (local61 - 1);
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(121) int local121 = local41 * 3;
		@Pc(127) int local127 = local45 * (local57 - 3);
		@Pc(131) int local131 = local49 * 3;
		@Pc(137) int local137 = (local61 - 3) * local53;
		@Pc(139) int local139 = local104;
		@Pc(145) int local145 = (arg1 - 1) * local100;
		@Pc(147) int local147 = local112;
		@Pc(166) int local166;
		@Pc(175) int local175;
		@Pc(184) int local184;
		@Pc(192) int local192;
		if (Static319.anInt5496 <= arg6 && arg6 <= Static160.anInt3220) {
			@Pc(157) int[] local157 = Class10_Sub10_Sub1.lb[arg6];
			local166 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg3 - arg2);
			local175 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg3 + arg2);
			local184 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg3 - local16);
			local192 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, local16 + arg3);
			Static212.method3267(local166, local184, arg4, local157);
			Static212.method3267(local184, local192, arg5, local157);
			Static212.method3267(local192, local175, arg4, local157);
		}
		@Pc(216) int local216 = local108 * (local21 - 1);
		while (local9 > 0) {
			@Pc(225) boolean local225 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local139;
					local70 += local121;
					local7++;
					local121 += local104;
					local139 += local104;
				}
			}
			if (local225) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local131;
						local96 += local147;
						local131 += local112;
						local11++;
						local147 += local112;
					}
				}
				if (local96 < 0) {
					local96 += local147;
					local87 += local131;
					local147 += local112;
					local131 += local112;
					local11++;
				}
				local96 += -local137;
				local87 += -local216;
				local216 -= local108;
				local137 -= local108;
			}
			if (local79 < 0) {
				local79 += local139;
				local70 += local121;
				local7++;
				local121 += local104;
				local139 += local104;
			}
			local70 += -local145;
			local79 += -local127;
			local145 -= local100;
			local127 -= local100;
			local9--;
			local166 = arg6 - local9;
			local175 = arg6 + local9;
			if (local175 >= Static319.anInt5496 && Static160.anInt3220 >= local166) {
				local184 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg3 + local7);
				local192 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg3 - local7);
				if (local225) {
					@Pc(404) int local404 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, local11 + arg3);
					@Pc(413) int local413 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg3 - local11);
					@Pc(420) int[] local420;
					if (Static319.anInt5496 <= local166) {
						local420 = Class10_Sub10_Sub1.lb[local166];
						Static212.method3267(local192, local413, arg4, local420);
						Static212.method3267(local413, local404, arg5, local420);
						Static212.method3267(local404, local184, arg4, local420);
					}
					if (local175 <= Static160.anInt3220) {
						local420 = Class10_Sub10_Sub1.lb[local175];
						Static212.method3267(local192, local413, arg4, local420);
						Static212.method3267(local413, local404, arg5, local420);
						Static212.method3267(local404, local184, arg4, local420);
					}
				} else {
					if (Static319.anInt5496 <= local166) {
						Static212.method3267(local192, local184, arg4, Class10_Sub10_Sub1.lb[local166]);
					}
					if (local175 <= Static160.anInt3220) {
						Static212.method3267(local192, local184, arg4, Class10_Sub10_Sub1.lb[local175]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIILclient!qh;Lclient!qh;)V")
	public static void method3799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24_Sub5 arg3, @OriginalArg(4) Class24_Sub5 arg4) {
		@Pc(4) Class11 local4 = Static21.method286(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass24_Sub5_1 = arg3;
			local4.aClass24_Sub5_2 = arg4;
		}
	}
}
