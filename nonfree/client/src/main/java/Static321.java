import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	public static int anInt5862;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!ma;")
	public static final Class216 aClass216_9 = new Class216();

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public static final int anInt5861 = 1339;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIZIII)V")
	public static void method4775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg2;
		@Pc(21) int local21 = arg6 - arg2;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(69) int local69 = local41 + (1 - local57) * local25;
		@Pc(78) int local78 = local29 - (local57 - 1) * local45;
		@Pc(87) int local87 = local49 + (1 - local61) * local33;
		@Pc(96) int local96 = local37 - (local61 - 1) * local53;
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = (local57 - 3) * local45;
		@Pc(130) int local130 = local49 * 3;
		@Pc(136) int local136 = (local61 - 3) * local53;
		@Pc(138) int local138 = local104;
		@Pc(144) int local144 = (arg6 - 1) * local100;
		@Pc(146) int local146 = local112;
		@Pc(152) int local152 = (local21 - 1) * local108;
		@Pc(174) int local174;
		@Pc(182) int local182;
		@Pc(191) int local191;
		@Pc(199) int local199;
		if (Static120.anInt2491 <= arg0 && Static71.anInt1350 >= arg0) {
			@Pc(166) int[] local166 = Static280.anIntArrayArray25[arg0];
			local174 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1 - arg4);
			local182 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg4 + arg1);
			local191 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1 - local16);
			local199 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1 + local16);
			Static329.method4871(local174, local191, local166, arg5);
			Static329.method4871(local191, local199, local166, arg3);
			Static329.method4871(local199, local182, local166, arg5);
		}
		while (local9 > 0) {
			@Pc(230) boolean local230 = local21 >= local9;
			if (local230) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local146;
						local87 += local130;
						local146 += local112;
						local11++;
						local130 += local112;
					}
				}
				if (local96 < 0) {
					local96 += local146;
					local87 += local130;
					local130 += local112;
					local146 += local112;
					local11++;
				}
				local96 += -local136;
				local87 += -local152;
				local152 -= local108;
				local136 -= local108;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local138;
					local69 += local116;
					local138 += local104;
					local116 += local104;
					local7++;
				}
			}
			if (local78 < 0) {
				local78 += local138;
				local69 += local116;
				local7++;
				local116 += local104;
				local138 += local104;
			}
			local69 += -local144;
			local78 += -local122;
			local122 -= local100;
			local144 -= local100;
			local9--;
			local174 = arg0 - local9;
			local182 = local9 + arg0;
			if (Static120.anInt2491 <= local182 && local174 <= Static71.anInt1350) {
				local191 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1 + local7);
				local199 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1 - local7);
				if (local230) {
					@Pc(409) int local409 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1 + local11);
					@Pc(418) int local418 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1 - local11);
					@Pc(429) int[] local429;
					if (Static120.anInt2491 <= local174) {
						local429 = Static280.anIntArrayArray25[local174];
						Static329.method4871(local199, local418, local429, arg5);
						Static329.method4871(local418, local409, local429, arg3);
						Static329.method4871(local409, local191, local429, arg5);
					}
					if (local182 <= Static71.anInt1350) {
						local429 = Static280.anIntArrayArray25[local182];
						Static329.method4871(local199, local418, local429, arg5);
						Static329.method4871(local418, local409, local429, arg3);
						Static329.method4871(local409, local191, local429, arg5);
					}
				} else {
					if (local174 >= Static120.anInt2491) {
						Static329.method4871(local199, local191, Static280.anIntArrayArray25[local174], arg5);
					}
					if (local182 <= Static71.anInt1350) {
						Static329.method4871(local199, local191, Static280.anIntArrayArray25[local182], arg5);
					}
				}
			}
		}
	}
}
