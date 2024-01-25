import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
	public static int anInt3415;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!lo;")
	public static final Class220 aClass220_3 = new Class220();

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILclient!ida;[I)Lclient!qs;")
	public static Class306 method3185(@OriginalArg(1) int arg0, @OriginalArg(2) Class159 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(18) float[][] local18 = null;
		if (arg1.aByteArray44 != null) {
			@Pc(24) int local24 = arg1.anInt4821;
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
			local9 = new int[local24];
			local11 = new int[local24];
			local7 = new int[local24];
			@Pc(91) int local91;
			@Pc(148) int local148;
			for (@Pc(85) int local85 = 0; local85 < arg0; local85++) {
				local91 = arg2[local85];
				if (arg1.aByteArray44[local91] != -1) {
					@Pc(105) int local105 = arg1.aByteArray44[local91] & 0xFF;
					for (@Pc(107) int local107 = 0; local107 < 3; local107++) {
						@Pc(124) short local124;
						if (local107 == 0) {
							local124 = arg1.aShortArray68[local91];
						} else if (local107 == 1) {
							local124 = arg1.aShortArray69[local91];
						} else {
							local124 = arg1.aShortArray64[local91];
						}
						@Pc(143) int local143 = arg1.anIntArray229[local124];
						local148 = arg1.anIntArray234[local124];
						@Pc(153) int local153 = arg1.anIntArray235[local124];
						if (local27[local105] > local143) {
							local27[local105] = local143;
						}
						if (local143 > local30[local105]) {
							local30[local105] = local143;
						}
						if (local148 < local33[local105]) {
							local33[local105] = local148;
						}
						if (local148 > local36[local105]) {
							local36[local105] = local148;
						}
						if (local153 < local39[local105]) {
							local39[local105] = local153;
						}
						if (local153 > local42[local105]) {
							local42[local105] = local153;
						}
					}
				}
			}
			local18 = new float[local24][];
			for (local91 = 0; local91 < local24; local91++) {
				@Pc(245) byte local245 = arg1.aByteArray40[local91];
				if (local245 > 0) {
					local7[local91] = (local30[local91] + local27[local91]) / 2;
					local9[local91] = (local33[local91] + local36[local91]) / 2;
					local11[local91] = (local39[local91] + local42[local91]) / 2;
					@Pc(301) float local301;
					@Pc(333) float local333;
					@Pc(299) float local299;
					if (local245 == 1) {
						local148 = arg1.anIntArray231[local91];
						if (local148 == 0) {
							local299 = 1.0F;
							local301 = 1.0F;
						} else if (local148 > 0) {
							local301 = 1.0F;
							local299 = (float) local148 / 1024.0F;
						} else {
							local299 = 1.0F;
							local301 = (float) -local148 / 1024.0F;
						}
						local333 = 64.0F / (float) arg1.anIntArray236[local91];
					} else if (local245 == 2) {
						local301 = 64.0F / (float) arg1.anIntArray231[local91];
						local333 = 64.0F / (float) arg1.anIntArray236[local91];
						local299 = 64.0F / (float) arg1.anIntArray228[local91];
					} else {
						local333 = (float) arg1.anIntArray236[local91] / 1024.0F;
						local301 = (float) arg1.anIntArray231[local91] / 1024.0F;
						local299 = (float) arg1.anIntArray228[local91] / 1024.0F;
					}
					local18[local91] = Static396.method6571(local299, arg1.aShortArray61[local91], arg1.aShortArray62[local91], arg1.aShortArray63[local91], local301, arg1.aByteArray39[local91] & 0xFF, local333);
				}
			}
		}
		return new Class306(local7, local9, local11, local18);
	}
}
