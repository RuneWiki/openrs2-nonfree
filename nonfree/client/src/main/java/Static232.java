import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method3628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg2;
		@Pc(20) int local20 = arg6 - arg2;
		@Pc(24) int local24 = arg5 * arg5;
		@Pc(28) int local28 = arg6 * arg6;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg6 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(68) int local68 = (1 - local56) * local24 + local40;
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = (1 - local60) * local32 + local48;
		@Pc(100) int local100 = local36 - (local60 - 1) * local52;
		@Pc(104) int local104 = local24 << 2;
		@Pc(108) int local108 = local28 << 2;
		@Pc(112) int local112 = local32 << 2;
		@Pc(116) int local116 = local36 << 2;
		@Pc(120) int local120 = local40 * 3;
		@Pc(126) int local126 = (local56 - 3) * local44;
		@Pc(130) int local130 = local48 * 3;
		@Pc(136) int local136 = local52 * (local60 - 3);
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = local104 * (arg6 - 1);
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = local112 * (local20 - 1);
		@Pc(175) int local175;
		@Pc(183) int local183;
		@Pc(192) int local192;
		@Pc(200) int local200;
		if (Static395.anInt6904 <= arg0 && arg0 <= Static561.anInt2703) {
			@Pc(166) int[] local166 = Static158.anIntArrayArray66[arg0];
			local175 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg3 - arg5);
			local183 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg5 + arg3);
			local192 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg3 - local16);
			local200 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg3 + local16);
			Static583.method7816(local166, arg4, local175, local192);
			Static583.method7816(local166, arg1, local192, local200);
			Static583.method7816(local166, arg4, local200, local183);
		}
		while (local9 > 0) {
			@Pc(233) boolean local233 = local20 >= local9;
			if (local68 < 0) {
				while (local68 < 0) {
					local68 += local120;
					local77 += local138;
					local138 += local108;
					local120 += local108;
					local7++;
				}
			}
			if (local233) {
				if (local87 < 0) {
					while (local87 < 0) {
						local100 += local146;
						local87 += local130;
						local11++;
						local146 += local116;
						local130 += local116;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local87 += local130;
					local11++;
					local146 += local116;
					local130 += local116;
				}
				local100 += -local136;
				local87 += -local152;
				local152 -= local112;
				local136 -= local112;
			}
			if (local77 < 0) {
				local77 += local138;
				local68 += local120;
				local138 += local108;
				local7++;
				local120 += local108;
			}
			local68 += -local144;
			local77 += -local126;
			local126 -= local104;
			local144 -= local104;
			local9--;
			local175 = arg0 - local9;
			local183 = arg0 + local9;
			if (local183 >= Static395.anInt6904 && local175 <= Static561.anInt2703) {
				local192 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg3 + local7);
				local200 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg3 - local7);
				if (local233) {
					@Pc(437) int local437 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg3 + local11);
					@Pc(446) int local446 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg3 - local11);
					@Pc(453) int[] local453;
					if (Static395.anInt6904 <= local175) {
						local453 = Static158.anIntArrayArray66[local175];
						Static583.method7816(local453, arg4, local200, local446);
						Static583.method7816(local453, arg1, local446, local437);
						Static583.method7816(local453, arg4, local437, local192);
					}
					if (local183 <= Static561.anInt2703) {
						local453 = Static158.anIntArrayArray66[local183];
						Static583.method7816(local453, arg4, local200, local446);
						Static583.method7816(local453, arg1, local446, local437);
						Static583.method7816(local453, arg4, local437, local192);
					}
				} else {
					if (local175 >= Static395.anInt6904) {
						Static583.method7816(Static158.anIntArrayArray66[local175], arg4, local200, local192);
					}
					if (local183 <= Static561.anInt2703) {
						Static583.method7816(Static158.anIntArrayArray66[local183], arg4, local200, local192);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	public static void method3629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static67.method1444(local7.aClass41_Sub2_Sub3_1);
		Static67.method1444(local7.aClass41_Sub2_Sub3_2);
		if (local7.aClass41_Sub2_Sub3_1 != null) {
			local7.aClass41_Sub2_Sub3_1 = null;
		}
		if (local7.aClass41_Sub2_Sub3_2 != null) {
			local7.aClass41_Sub2_Sub3_2 = null;
		}
	}
}
