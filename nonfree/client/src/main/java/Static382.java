import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!naa", name = "A", descriptor = "I")
	public static int anInt7017;

	@OriginalMember(owner = "client!naa", name = "D", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!naa", name = "E", descriptor = "I")
	public static int anInt7019;

	@OriginalMember(owner = "client!naa", name = "G", descriptor = "J")
	public static long aLong195 = 1L;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg6;
		@Pc(20) int local20 = arg2 - arg6;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg2 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local24 * (1 - local56) + local40;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = local48 + local32 * (1 - local60);
		@Pc(96) int local96 = local36 - local52 * (local60 - 1);
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(108) int local108 = local32 << 2;
		@Pc(112) int local112 = local36 << 2;
		@Pc(116) int local116 = local40 * 3;
		@Pc(130) int local130 = (local56 - 3) * local44;
		@Pc(134) int local134 = local48 * 3;
		@Pc(140) int local140 = local52 * (local60 - 3);
		@Pc(142) int local142 = local104;
		@Pc(148) int local148 = local100 * (arg2 - 1);
		@Pc(150) int local150 = local112;
		@Pc(156) int local156 = (local20 - 1) * local108;
		@Pc(179) int local179;
		@Pc(188) int local188;
		@Pc(197) int local197;
		@Pc(205) int local205;
		if (Static468.anInt355 <= arg4 && Static370.anInt10475 >= arg4) {
			@Pc(170) int[] local170 = Static274.anIntArrayArray34[arg4];
			local179 = Static258.method3697(arg1 - arg0, Static575.anInt9879, Static313.anInt9045);
			local188 = Static258.method3697(arg1 + arg0, Static575.anInt9879, Static313.anInt9045);
			local197 = Static258.method3697(arg1 - local16, Static575.anInt9879, Static313.anInt9045);
			local205 = Static258.method3697(local16 + arg1, Static575.anInt9879, Static313.anInt9045);
			Static679.method9323(local170, local179, arg3, local197);
			Static679.method9323(local170, local197, arg5, local205);
			Static679.method9323(local170, local205, arg3, local188);
		}
		while (local9 > 0) {
			@Pc(232) boolean local232 = local9 <= local20;
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local116;
					local78 += local142;
					local7++;
					local142 += local104;
					local116 += local104;
				}
			}
			if (local232) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local150;
						local87 += local134;
						local11++;
						local134 += local112;
						local150 += local112;
					}
				}
				if (local96 < 0) {
					local87 += local134;
					local96 += local150;
					local11++;
					local134 += local112;
					local150 += local112;
				}
				local87 += -local156;
				local96 += -local140;
				local140 -= local108;
				local156 -= local108;
			}
			if (local78 < 0) {
				local69 += local116;
				local78 += local142;
				local116 += local104;
				local142 += local104;
				local7++;
			}
			local78 += -local130;
			local69 += -local148;
			local9--;
			local148 -= local100;
			local130 -= local100;
			local179 = arg4 - local9;
			local188 = arg4 + local9;
			if (local188 >= Static468.anInt355 && local179 <= Static370.anInt10475) {
				local197 = Static258.method3697(local7 + arg1, Static575.anInt9879, Static313.anInt9045);
				local205 = Static258.method3697(arg1 - local7, Static575.anInt9879, Static313.anInt9045);
				if (local232) {
					@Pc(435) int local435 = Static258.method3697(local11 + arg1, Static575.anInt9879, Static313.anInt9045);
					@Pc(444) int local444 = Static258.method3697(arg1 - local11, Static575.anInt9879, Static313.anInt9045);
					@Pc(455) int[] local455;
					if (local179 >= Static468.anInt355) {
						local455 = Static274.anIntArrayArray34[local179];
						Static679.method9323(local455, local205, arg3, local444);
						Static679.method9323(local455, local444, arg5, local435);
						Static679.method9323(local455, local435, arg3, local197);
					}
					if (local188 <= Static370.anInt10475) {
						local455 = Static274.anIntArrayArray34[local188];
						Static679.method9323(local455, local205, arg3, local444);
						Static679.method9323(local455, local444, arg5, local435);
						Static679.method9323(local455, local435, arg3, local197);
					}
				} else {
					if (Static468.anInt355 <= local179) {
						Static679.method9323(Static274.anIntArrayArray34[local179], local205, arg3, local197);
					}
					if (local188 <= Static370.anInt10475) {
						Static679.method9323(Static274.anIntArrayArray34[local188], local205, arg3, local197);
					}
				}
			}
		}
	}
}
