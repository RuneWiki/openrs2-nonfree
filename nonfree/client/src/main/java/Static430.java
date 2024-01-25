import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
	public static int anInt7238 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBIIIIII)V")
	public static void method5854(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg3;
		@Pc(20) int local20 = arg4 - arg3;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(28) int local28 = arg4 * arg4;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(55) int local55 = local36 << 1;
		@Pc(59) int local59 = local32 << 1;
		@Pc(63) int local63 = arg4 << 1;
		@Pc(67) int local67 = local20 << 1;
		@Pc(76) int local76 = local40 + (1 - local63) * local24;
		@Pc(85) int local85 = local28 - (local63 - 1) * local44;
		@Pc(95) int local95 = local32 * (1 - local67) + local55;
		@Pc(104) int local104 = local36 - (local67 - 1) * local59;
		@Pc(108) int local108 = local24 << 2;
		@Pc(112) int local112 = local28 << 2;
		@Pc(116) int local116 = local32 << 2;
		@Pc(120) int local120 = local36 << 2;
		@Pc(124) int local124 = local40 * 3;
		@Pc(130) int local130 = local44 * (local63 - 3);
		@Pc(134) int local134 = local55 * 3;
		@Pc(140) int local140 = local59 * (local67 - 3);
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = (arg4 - 1) * local108;
		@Pc(150) int local150 = local120;
		@Pc(156) int local156 = local116 * (local20 - 1);
		@Pc(183) int local183;
		@Pc(191) int local191;
		@Pc(199) int local199;
		@Pc(207) int local207;
		if (arg0 >= Static316.anInt5349 && arg0 <= Static418.anInt7030) {
			@Pc(174) int[] local174 = Static296.anIntArrayArray42[arg0];
			local183 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg5 - arg6);
			local191 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg6 + arg5);
			local199 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg5 - local16);
			local207 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg5 + local16);
			Static201.method3084(local174, local183, local199, arg1);
			Static201.method3084(local174, local199, local207, arg2);
			Static201.method3084(local174, local207, local191, arg1);
		}
		while (local9 > 0) {
			@Pc(234) boolean local234 = local20 >= local9;
			if (local76 < 0) {
				while (local76 < 0) {
					local85 += local142;
					local76 += local124;
					local7++;
					local142 += local112;
					local124 += local112;
				}
			}
			if (local234) {
				if (local95 < 0) {
					while (local95 < 0) {
						local104 += local150;
						local95 += local134;
						local150 += local120;
						local11++;
						local134 += local120;
					}
				}
				if (local104 < 0) {
					local95 += local134;
					local104 += local150;
					local11++;
					local134 += local120;
					local150 += local120;
				}
				local104 += -local140;
				local95 += -local156;
				local156 -= local116;
				local140 -= local116;
			}
			if (local85 < 0) {
				local85 += local142;
				local76 += local124;
				local124 += local112;
				local7++;
				local142 += local112;
			}
			local76 += -local148;
			local85 += -local130;
			local148 -= local108;
			local9--;
			local130 -= local108;
			local183 = arg0 - local9;
			local191 = arg0 + local9;
			if (local191 >= Static316.anInt5349 && Static418.anInt7030 >= local183) {
				local199 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, local7 + arg5);
				local207 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg5 - local7);
				if (local234) {
					@Pc(405) int local405 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, local11 + arg5);
					@Pc(414) int local414 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg5 - local11);
					@Pc(421) int[] local421;
					if (Static316.anInt5349 <= local183) {
						local421 = Static296.anIntArrayArray42[local183];
						Static201.method3084(local421, local207, local414, arg1);
						Static201.method3084(local421, local414, local405, arg2);
						Static201.method3084(local421, local405, local199, arg1);
					}
					if (local191 <= Static418.anInt7030) {
						local421 = Static296.anIntArrayArray42[local191];
						Static201.method3084(local421, local207, local414, arg1);
						Static201.method3084(local421, local414, local405, arg2);
						Static201.method3084(local421, local405, local199, arg1);
					}
				} else {
					if (local183 >= Static316.anInt5349) {
						Static201.method3084(Static296.anIntArrayArray42[local183], local207, local199, arg1);
					}
					if (Static418.anInt7030 >= local191) {
						Static201.method3084(Static296.anIntArrayArray42[local191], local207, local199, arg1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!nj;)Lclient!oc;")
	public static Class155_Sub1 method5858(@OriginalArg(1) Class3_Sub25 arg0) {
		return new Class155_Sub1(arg0.method4065(), arg0.method4065(), arg0.method4065(), arg0.method4065(), arg0.method4099(), arg0.method4099(), arg0.method4096());
	}
}
