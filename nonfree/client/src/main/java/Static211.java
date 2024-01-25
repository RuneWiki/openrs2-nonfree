import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
	public static int anInt4381;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
	public static int anInt4386;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg5;
		@Pc(23) int local23 = 0;
		@Pc(28) int local28 = arg1 - arg0;
		@Pc(33) int local33 = arg5 - arg0;
		@Pc(37) int local37 = arg1 * arg1;
		@Pc(41) int local41 = arg5 * arg5;
		@Pc(45) int local45 = local28 * local28;
		@Pc(49) int local49 = local33 * local33;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = local49 << 1;
		@Pc(65) int local65 = local45 << 1;
		@Pc(69) int local69 = arg5 << 1;
		@Pc(73) int local73 = local33 << 1;
		@Pc(82) int local82 = (1 - local69) * local37 + local53;
		@Pc(91) int local91 = local41 - local57 * (local69 - 1);
		@Pc(99) int local99 = local61 + (1 - local73) * local45;
		@Pc(108) int local108 = local49 - (local73 - 1) * local65;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 << 2;
		@Pc(120) int local120 = local45 << 2;
		@Pc(124) int local124 = local49 << 2;
		@Pc(128) int local128 = local53 * 3;
		@Pc(134) int local134 = local57 * (local69 - 3);
		@Pc(138) int local138 = local61 * 3;
		@Pc(144) int local144 = local65 * (local73 - 3);
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = (arg5 - 1) * local112;
		@Pc(154) int local154 = local124;
		@Pc(160) int local160 = (local33 - 1) * local120;
		@Pc(164) int[] local164 = Static81.anIntArrayArray25[arg2];
		Static227.method7421(arg6 - arg1, arg3, arg6 - local28, local164);
		Static227.method7421(arg6 - local28, arg4, local28 + arg6, local164);
		Static227.method7421(local28 + arg6, arg3, arg6 + arg1, local164);
		while (local21 > 0) {
			@Pc(206) boolean local206 = local33 >= local21;
			if (local82 < 0) {
				while (local82 < 0) {
					local82 += local128;
					local91 += local146;
					local128 += local116;
					local19++;
					local146 += local116;
				}
			}
			if (local206) {
				if (local99 < 0) {
					while (local99 < 0) {
						local99 += local138;
						local108 += local154;
						local23++;
						local154 += local124;
						local138 += local124;
					}
				}
				if (local108 < 0) {
					local99 += local138;
					local108 += local154;
					local154 += local124;
					local138 += local124;
					local23++;
				}
				local99 += -local160;
				local108 += -local144;
				local160 -= local120;
				local144 -= local120;
			}
			if (local91 < 0) {
				local91 += local146;
				local82 += local128;
				local146 += local116;
				local19++;
				local128 += local116;
			}
			local91 += -local134;
			local82 += -local152;
			local152 -= local112;
			local134 -= local112;
			local21--;
			@Pc(346) int local346 = arg2 - local21;
			@Pc(351) int local351 = arg2 + local21;
			@Pc(355) int local355 = arg6 + local19;
			@Pc(360) int local360 = arg6 - local19;
			if (local206) {
				@Pc(384) int local384 = local23 + arg6;
				@Pc(388) int local388 = arg6 - local23;
				Static227.method7421(local360, arg3, local388, Static81.anIntArrayArray25[local346]);
				Static227.method7421(local388, arg4, local384, Static81.anIntArrayArray25[local346]);
				Static227.method7421(local384, arg3, local355, Static81.anIntArrayArray25[local346]);
				Static227.method7421(local360, arg3, local388, Static81.anIntArrayArray25[local351]);
				Static227.method7421(local388, arg4, local384, Static81.anIntArrayArray25[local351]);
				Static227.method7421(local384, arg3, local355, Static81.anIntArrayArray25[local351]);
			} else {
				Static227.method7421(local360, arg3, local355, Static81.anIntArrayArray25[local346]);
				Static227.method7421(local360, arg3, local355, Static81.anIntArrayArray25[local351]);
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!pc;)V")
	public static void method3827(@OriginalArg(0) Class47_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort115; local2 <= arg0.aShort116; local2++) {
			for (@Pc(6) int local6 = arg0.aShort117; local6 <= arg0.aShort114; local6++) {
				@Pc(16) Class206 local16 = Static313.aClass206ArrayArrayArray2[arg0.aByte94][local2][local6];
				if (local16 != null) {
					@Pc(21) Class168 local21 = local16.aClass168_2;
					@Pc(23) Class168 local23 = null;
					while (local21 != null) {
						if (local21.aClass47_Sub2_2 == arg0) {
							if (local23 == null) {
								local16.aClass168_2 = local21.aClass168_1;
							} else {
								local23.aClass168_1 = local21.aClass168_1;
							}
							local21.method4330();
							break;
						}
						local23 = local21;
						local21 = local21.aClass168_1;
					}
					local16.aByte71 = 0;
					for (@Pc(56) Class168 local56 = local16.aClass168_2; local56 != null; local56 = local56.aClass168_1) {
						local16.aByte71 = (byte) (local16.aByte71 | local56.anInt4983);
					}
				}
			}
		}
	}
}
