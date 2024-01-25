import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	public static int anInt9504;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "Lclient!vfa;")
	public static Class357 aClass357_11 = null;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(III)Lclient!daa;")
	public static Class66 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass66_2;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!ur;I[I)Lclient!eh;")
	public static Class92 method8161(@OriginalArg(0) int arg0, @OriginalArg(1) Class349 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(13) float[][] local13 = null;
		if (arg1.aByteArray91 != null) {
			@Pc(19) int local19 = arg1.anInt9574;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(25) int[] local25 = new int[local19];
			@Pc(28) int[] local28 = new int[local19];
			@Pc(31) int[] local31 = new int[local19];
			@Pc(34) int[] local34 = new int[local19];
			@Pc(37) int[] local37 = new int[local19];
			for (@Pc(39) int local39 = 0; local39 < local19; local39++) {
				local22[local39] = Integer.MAX_VALUE;
				local25[local39] = -2147483647;
				local28[local39] = Integer.MAX_VALUE;
				local31[local39] = -2147483647;
				local34[local39] = Integer.MAX_VALUE;
				local37[local39] = -2147483647;
			}
			local9 = new int[local19];
			local11 = new int[local19];
			@Pc(83) int local83;
			@Pc(135) int local135;
			for (@Pc(77) int local77 = 0; local77 < arg0; local77++) {
				local83 = arg2[local77];
				if (arg1.aByteArray91[local83] != -1) {
					@Pc(97) int local97 = arg1.aByteArray91[local83] & 0xFF;
					for (@Pc(99) int local99 = 0; local99 < 3; local99++) {
						@Pc(111) short local111;
						if (local99 == 0) {
							local111 = arg1.aShortArray167[local83];
						} else if (local99 == 1) {
							local111 = arg1.aShortArray165[local83];
						} else {
							local111 = arg1.aShortArray174[local83];
						}
						@Pc(130) int local130 = arg1.anIntArray764[local111];
						local135 = arg1.anIntArray774[local111];
						@Pc(140) int local140 = arg1.anIntArray769[local111];
						if (local22[local97] > local130) {
							local22[local97] = local130;
						}
						if (local130 > local25[local97]) {
							local25[local97] = local130;
						}
						if (local28[local97] > local135) {
							local28[local97] = local135;
						}
						if (local135 > local31[local97]) {
							local31[local97] = local135;
						}
						if (local34[local97] > local140) {
							local34[local97] = local140;
						}
						if (local140 > local37[local97]) {
							local37[local97] = local140;
						}
					}
				}
			}
			local13 = new float[local19][];
			local7 = new int[local19];
			for (local83 = 0; local83 < local19; local83++) {
				@Pc(229) byte local229 = arg1.aByteArray92[local83];
				if (local229 > 0) {
					local7[local83] = (local22[local83] + local25[local83]) / 2;
					local9[local83] = (local31[local83] + local28[local83]) / 2;
					local11[local83] = (local37[local83] + local34[local83]) / 2;
					@Pc(283) float local283;
					@Pc(291) float local291;
					@Pc(299) float local299;
					if (local229 == 1) {
						local135 = arg1.anIntArray772[local83];
						local291 = 64.0F / (float) arg1.anIntArray765[local83];
						if (local135 == 0) {
							local299 = 1.0F;
							local283 = 1.0F;
						} else if (local135 > 0) {
							local299 = (float) local135 / 1024.0F;
							local283 = 1.0F;
						} else {
							local299 = 1.0F;
							local283 = (float) -local135 / 1024.0F;
						}
					} else if (local229 == 2) {
						local299 = 64.0F / (float) arg1.anIntArray763[local83];
						local291 = 64.0F / (float) arg1.anIntArray765[local83];
						local283 = 64.0F / (float) arg1.anIntArray772[local83];
					} else {
						local283 = (float) arg1.anIntArray772[local83] / 1024.0F;
						local291 = (float) arg1.anIntArray765[local83] / 1024.0F;
						local299 = (float) arg1.anIntArray763[local83] / 1024.0F;
					}
					local13[local83] = Static432.method6469(arg1.aShortArray168[local83], arg1.aShortArray169[local83], arg1.aByteArray94[local83] & 0xFF, local283, local291, local299, arg1.aShortArray173[local83]);
				}
			}
		}
		return new Class92(local7, local9, local11, local13);
	}
}
