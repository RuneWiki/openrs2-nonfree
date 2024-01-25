import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "[Lclient!o;")
	public static Class41[] aClass41Array15;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_126 = new Class231("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_127 = new Class231("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg6;
		@Pc(20) int local20 = arg3 - arg6;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = (1 - local56) * local24 + local40;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = local48 + local32 * (1 - local60);
		@Pc(96) int local96 = local36 - local52 * (local60 - 1);
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(108) int local108 = local32 << 2;
		@Pc(112) int local112 = local36 << 2;
		@Pc(116) int local116 = local40 * 3;
		@Pc(122) int local122 = (local56 - 3) * local44;
		@Pc(126) int local126 = local48 * 3;
		@Pc(132) int local132 = (local60 - 3) * local52;
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = local100 * (arg3 - 1);
		@Pc(142) int local142 = local112;
		@Pc(160) int local160;
		@Pc(168) int local168;
		@Pc(176) int local176;
		@Pc(184) int local184;
		if (arg0 >= Static118.anInt2005 && arg0 <= Static123.anInt2069) {
			@Pc(152) int[] local152 = Static46.anIntArrayArray24[arg0];
			local160 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg5 - arg2);
			local168 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg5 + arg2);
			local176 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg5 - local16);
			local184 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, local16 + arg5);
			Static215.method3035(local160, local176, local152, arg1);
			Static215.method3035(local176, local184, local152, arg4);
			Static215.method3035(local184, local168, local152, arg1);
		}
		@Pc(208) int local208 = local108 * (local20 - 1);
		while (local9 > 0) {
			@Pc(217) boolean local217 = local9 <= local20;
			if (local217) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local142;
						local87 += local126;
						local11++;
						local126 += local112;
						local142 += local112;
					}
				}
				if (local96 < 0) {
					local87 += local126;
					local96 += local142;
					local11++;
					local142 += local112;
					local126 += local112;
				}
				local96 += -local132;
				local87 += -local208;
				local132 -= local108;
				local208 -= local108;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local116;
					local78 += local134;
					local134 += local104;
					local116 += local104;
					local7++;
				}
			}
			if (local78 < 0) {
				local78 += local134;
				local69 += local116;
				local7++;
				local134 += local104;
				local116 += local104;
			}
			local69 += -local140;
			local78 += -local122;
			local122 -= local100;
			local9--;
			local140 -= local100;
			local160 = arg0 - local9;
			local168 = local9 + arg0;
			if (local168 >= Static118.anInt2005 && Static123.anInt2069 >= local160) {
				local176 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg5 + local7);
				local184 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg5 - local7);
				if (local217) {
					@Pc(392) int local392 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg5 + local11);
					@Pc(401) int local401 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg5 - local11);
					@Pc(412) int[] local412;
					if (Static118.anInt2005 <= local160) {
						local412 = Static46.anIntArrayArray24[local160];
						Static215.method3035(local184, local401, local412, arg1);
						Static215.method3035(local401, local392, local412, arg4);
						Static215.method3035(local392, local176, local412, arg1);
					}
					if (local168 <= Static123.anInt2069) {
						local412 = Static46.anIntArrayArray24[local168];
						Static215.method3035(local184, local401, local412, arg1);
						Static215.method3035(local401, local392, local412, arg4);
						Static215.method3035(local392, local176, local412, arg1);
					}
				} else {
					if (Static118.anInt2005 <= local160) {
						Static215.method3035(local184, local176, Static46.anIntArrayArray24[local160], arg1);
					}
					if (local168 <= Static123.anInt2069) {
						Static215.method3035(local184, local176, Static46.anIntArrayArray24[local168], arg1);
					}
				}
			}
		}
	}
}
