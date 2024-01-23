import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Lclient!jc;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
	public static int[] anIntArray304 = new int[500];

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "[I")
	public static int[] anIntArray305 = new int[14];

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public static int anInt3282 = 0;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	public static int anInt3286 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = arg2 - arg5;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = arg4;
		@Pc(20) int local20 = arg4 - arg5;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = arg4 * arg4;
		@Pc(32) int local32 = local12 * local12;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local24 << 1;
		@Pc(44) int local44 = local28 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = local20 << 1;
		@Pc(60) int local60 = arg4 << 1;
		@Pc(68) int local68 = local44 + local24 * (1 - local60);
		@Pc(76) int local76 = local48 + local32 * (1 - local56);
		@Pc(80) int local80 = local28 << 2;
		@Pc(89) int local89 = local28 - (local60 - 1) * local40;
		@Pc(93) int local93 = local24 << 2;
		@Pc(102) int local102 = local36 - (local56 - 1) * local52;
		@Pc(106) int local106 = local36 << 2;
		@Pc(110) int local110 = local32 << 2;
		@Pc(114) int local114 = local44 * 3;
		@Pc(118) int local118 = local48 * 3;
		@Pc(124) int local124 = (local60 - 3) * local40;
		@Pc(130) int local130 = (local56 - 3) * local52;
		@Pc(136) int local136 = (local20 - 1) * local110;
		@Pc(142) int local142 = (arg4 - 1) * local93;
		@Pc(146) int[] local146 = Static121.anIntArrayArray33[arg1];
		@Pc(148) int local148 = local106;
		Static98.method3942(arg0 - local12, local146, arg6, arg0 - arg2);
		Static98.method3942(local12 + arg0, local146, arg3, arg0 - local12);
		@Pc(171) int local171 = local80;
		Static98.method3942(arg0 + arg2, local146, arg6, local12 + arg0);
		while (local16 > 0) {
			if (local68 < 0) {
				while (local68 < 0) {
					local89 += local171;
					local171 += local80;
					local68 += local114;
					local114 += local80;
					local7++;
				}
			}
			@Pc(221) boolean local221 = local16 <= local20;
			if (local221) {
				if (local76 < 0) {
					while (local76 < 0) {
						local14++;
						local76 += local118;
						local102 += local148;
						local118 += local106;
						local148 += local106;
					}
				}
				if (local102 < 0) {
					local14++;
					local76 += local118;
					local102 += local148;
					local118 += local106;
					local148 += local106;
				}
				local102 += -local130;
				local76 += -local136;
				local136 -= local110;
				local130 -= local110;
			}
			if (local89 < 0) {
				local89 += local171;
				local171 += local80;
				local68 += local114;
				local114 += local80;
				local7++;
			}
			local89 += -local124;
			local68 += -local142;
			local142 -= local93;
			local16--;
			local124 -= local93;
			@Pc(335) int local335 = arg1 + local16;
			@Pc(340) int local340 = arg1 - local16;
			@Pc(345) int local345 = arg0 + local7;
			@Pc(350) int local350 = arg0 - local7;
			if (local221) {
				@Pc(356) int local356 = local14 + arg0;
				@Pc(361) int local361 = arg0 - local14;
				Static98.method3942(local361, Static121.anIntArrayArray33[local340], arg6, local350);
				Static98.method3942(local356, Static121.anIntArrayArray33[local340], arg3, local361);
				Static98.method3942(local345, Static121.anIntArrayArray33[local340], arg6, local356);
				Static98.method3942(local361, Static121.anIntArrayArray33[local335], arg6, local350);
				Static98.method3942(local356, Static121.anIntArrayArray33[local335], arg3, local361);
				Static98.method3942(local345, Static121.anIntArrayArray33[local335], arg6, local356);
			} else {
				Static98.method3942(local345, Static121.anIntArrayArray33[local340], arg6, local350);
				Static98.method3942(local345, Static121.anIntArrayArray33[local335], arg6, local350);
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
	public static void method2375() {
		for (@Pc(1) int local1 = 0; local1 < Static165.anInt3670; local1++) {
			@Pc(8) Class7 local8 = Static259.aClass7Array3[local1];
			Static172.method2803(local8);
			Static259.aClass7Array3[local1] = null;
		}
		Static165.anInt3670 = 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	public static void method2376() {
		Static219.aClass89_34.method2273(5);
	}
}
