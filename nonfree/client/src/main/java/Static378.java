import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
	public static int anInt6665;

	@OriginalMember(owner = "client!ofa", name = "z", descriptor = "Lclient!hq;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!ofa", name = "y", descriptor = "[I")
	public static int[] anIntArray446 = new int[2];

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg1;
		@Pc(21) int local21 = arg6 - arg1;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(69) int local69 = local25 * (1 - local57) + local41;
		@Pc(78) int local78 = local29 - local45 * (local57 - 1);
		@Pc(87) int local87 = (1 - local61) * local33 + local49;
		@Pc(100) int local100 = local37 - (local61 - 1) * local53;
		@Pc(104) int local104 = local25 << 2;
		@Pc(108) int local108 = local29 << 2;
		@Pc(112) int local112 = local33 << 2;
		@Pc(116) int local116 = local37 << 2;
		@Pc(120) int local120 = local41 * 3;
		@Pc(126) int local126 = (local57 - 3) * local45;
		@Pc(130) int local130 = local49 * 3;
		@Pc(136) int local136 = (local61 - 3) * local53;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg6 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(169) int local169;
		@Pc(177) int local177;
		@Pc(186) int local186;
		@Pc(194) int local194;
		if (Static126.anInt6658 <= arg2 && arg2 <= Static494.anInt8295) {
			@Pc(160) int[] local160 = Static478.anIntArrayArray51[arg2];
			local169 = Static468.method6610(arg4 - arg0, Static487.anInt8210, Static278.anInt5111);
			local177 = Static468.method6610(arg0 + arg4, Static487.anInt8210, Static278.anInt5111);
			local186 = Static468.method6610(arg4 - local16, Static487.anInt8210, Static278.anInt5111);
			local194 = Static468.method6610(arg4 + local16, Static487.anInt8210, Static278.anInt5111);
			Static250.method4000(local186, local160, local169, arg3);
			Static250.method4000(local194, local160, local186, arg5);
			Static250.method4000(local177, local160, local194, arg3);
		}
		@Pc(218) int local218 = (local21 - 1) * local112;
		while (local9 > 0) {
			@Pc(231) boolean local231 = local9 <= local21;
			if (local231) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local130;
						local100 += local146;
						local11++;
						local146 += local116;
						local130 += local116;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local87 += local130;
					local130 += local116;
					local11++;
					local146 += local116;
				}
				local87 += -local218;
				local100 += -local136;
				local136 -= local112;
				local218 -= local112;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local138;
					local69 += local120;
					local120 += local108;
					local138 += local108;
					local7++;
				}
			}
			if (local78 < 0) {
				local78 += local138;
				local69 += local120;
				local120 += local108;
				local138 += local108;
				local7++;
			}
			local69 += -local144;
			local78 += -local126;
			local144 -= local104;
			local126 -= local104;
			local9--;
			local169 = arg2 - local9;
			local177 = arg2 + local9;
			if (local177 >= Static126.anInt6658 && Static494.anInt8295 >= local169) {
				local186 = Static468.method6610(local7 + arg4, Static487.anInt8210, Static278.anInt5111);
				local194 = Static468.method6610(arg4 - local7, Static487.anInt8210, Static278.anInt5111);
				if (local231) {
					@Pc(433) int local433 = Static468.method6610(local11 + arg4, Static487.anInt8210, Static278.anInt5111);
					@Pc(441) int local441 = Static468.method6610(arg4 - local11, Static487.anInt8210, Static278.anInt5111);
					@Pc(448) int[] local448;
					if (Static126.anInt6658 <= local169) {
						local448 = Static478.anIntArrayArray51[local169];
						Static250.method4000(local441, local448, local194, arg3);
						Static250.method4000(local433, local448, local441, arg5);
						Static250.method4000(local186, local448, local433, arg3);
					}
					if (Static494.anInt8295 >= local177) {
						local448 = Static478.anIntArrayArray51[local177];
						Static250.method4000(local441, local448, local194, arg3);
						Static250.method4000(local433, local448, local441, arg5);
						Static250.method4000(local186, local448, local433, arg3);
					}
				} else {
					if (local169 >= Static126.anInt6658) {
						Static250.method4000(local186, Static478.anIntArrayArray51[local169], local194, arg3);
					}
					if (local177 <= Static494.anInt8295) {
						Static250.method4000(local186, Static478.anIntArrayArray51[local177], local194, arg3);
					}
				}
			}
		}
	}
}
