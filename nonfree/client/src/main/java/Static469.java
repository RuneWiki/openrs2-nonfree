import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!po", name = "b", descriptor = "I")
	public static int anInt7448 = -1;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!so;[IBI)Lclient!cg;")
	public static Class43 method6481(@OriginalArg(0) Class334 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(13) float[][] local13 = null;
		if (arg0.aByteArray87 != null) {
			@Pc(24) int local24 = arg0.anInt8561;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(30) int[] local30 = new int[local24];
			@Pc(33) int[] local33 = new int[local24];
			@Pc(36) int[] local36 = new int[local24];
			@Pc(39) int[] local39 = new int[local24];
			@Pc(42) int[] local42 = new int[local24];
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				local27[local44] = Integer.MAX_VALUE;
				local30[local44] = -2147483647;
				local33[local44] = Integer.MAX_VALUE;
				local36[local44] = -2147483647;
				local39[local44] = Integer.MAX_VALUE;
				local42[local44] = -2147483647;
			}
			local11 = new int[local24];
			local13 = new float[local24][];
			local7 = new int[local24];
			@Pc(95) int local95;
			@Pc(152) int local152;
			for (@Pc(89) int local89 = 0; local89 < arg2; local89++) {
				local95 = arg1[local89];
				if (arg0.aByteArray87[local95] != -1) {
					@Pc(109) int local109 = arg0.aByteArray87[local95] & 0xFF;
					for (@Pc(111) int local111 = 0; local111 < 3; local111++) {
						@Pc(128) short local128;
						if (local111 == 0) {
							local128 = arg0.aShortArray125[local95];
						} else if (local111 == 1) {
							local128 = arg0.aShortArray132[local95];
						} else {
							local128 = arg0.aShortArray130[local95];
						}
						@Pc(147) int local147 = arg0.anIntArray596[local128];
						local152 = arg0.anIntArray593[local128];
						@Pc(157) int local157 = arg0.anIntArray589[local128];
						if (local27[local109] > local147) {
							local27[local109] = local147;
						}
						if (local147 > local30[local109]) {
							local30[local109] = local147;
						}
						if (local152 < local33[local109]) {
							local33[local109] = local152;
						}
						if (local152 > local36[local109]) {
							local36[local109] = local152;
						}
						if (local39[local109] > local157) {
							local39[local109] = local157;
						}
						if (local157 > local42[local109]) {
							local42[local109] = local157;
						}
					}
				}
			}
			local9 = new int[local24];
			for (local95 = 0; local95 < local24; local95++) {
				@Pc(231) byte local231 = arg0.aByteArray85[local95];
				if (local231 > 0) {
					local7[local95] = (local27[local95] + local30[local95]) / 2;
					local9[local95] = (local33[local95] + local36[local95]) / 2;
					local11[local95] = (local42[local95] + local39[local95]) / 2;
					@Pc(301) float local301;
					@Pc(288) float local288;
					@Pc(303) float local303;
					if (local231 == 1) {
						local152 = arg0.anIntArray599[local95];
						local288 = 64.0F / (float) arg0.anIntArray594[local95];
						if (local152 == 0) {
							local303 = 1.0F;
							local301 = 1.0F;
						} else if (local152 <= 0) {
							local301 = (float) -local152 / 1024.0F;
							local303 = 1.0F;
						} else {
							local301 = 1.0F;
							local303 = (float) local152 / 1024.0F;
						}
					} else if (local231 == 2) {
						local288 = 64.0F / (float) arg0.anIntArray594[local95];
						local301 = 64.0F / (float) arg0.anIntArray599[local95];
						local303 = 64.0F / (float) arg0.anIntArray595[local95];
					} else {
						local288 = (float) arg0.anIntArray594[local95] / 1024.0F;
						local301 = (float) arg0.anIntArray599[local95] / 1024.0F;
						local303 = (float) arg0.anIntArray595[local95] / 1024.0F;
					}
					local13[local95] = Static558.method7415(arg0.aShortArray133[local95], local288, local303, arg0.aByteArray88[local95] & 0xFF, arg0.aShortArray131[local95], arg0.aShortArray124[local95], local301);
				}
			}
		}
		return new Class43(local7, local9, local11, local13);
	}
}
