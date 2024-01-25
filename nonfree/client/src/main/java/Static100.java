import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dha", name = "A", descriptor = "Lclient!in;")
	public static Class157 aClass157_64;

	@OriginalMember(owner = "client!dha", name = "B", descriptor = "I")
	public static int anInt2830;

	@OriginalMember(owner = "client!dha", name = "D", descriptor = "Lclient!in;")
	public static Class157 aClass157_65;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IILclient!bh;[I)Lclient!ew;")
	public static Class101 method2646(@OriginalArg(1) int arg0, @OriginalArg(2) Class32 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(14) int[] local14 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg1.aByteArray20 != null) {
			@Pc(24) int local24 = arg1.anInt1671;
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
			local18 = new float[local24][];
			local16 = new int[local24];
			local14 = new int[local24];
			@Pc(91) int local91;
			@Pc(148) int local148;
			for (@Pc(85) int local85 = 0; local85 < arg0; local85++) {
				local91 = arg2[local85];
				if (arg1.aByteArray20[local91] != -1) {
					@Pc(105) int local105 = arg1.aByteArray20[local91] & 0xFF;
					for (@Pc(107) int local107 = 0; local107 < 3; local107++) {
						@Pc(124) short local124;
						if (local107 == 0) {
							local124 = arg1.aShortArray20[local91];
						} else if (local107 == 1) {
							local124 = arg1.aShortArray14[local91];
						} else {
							local124 = arg1.aShortArray17[local91];
						}
						@Pc(143) int local143 = arg1.anIntArray64[local124];
						local148 = arg1.anIntArray66[local124];
						@Pc(153) int local153 = arg1.anIntArray67[local124];
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
						if (local42[local105] < local153) {
							local42[local105] = local153;
						}
					}
				}
			}
			local7 = new int[local24];
			for (local91 = 0; local91 < local24; local91++) {
				@Pc(247) byte local247 = arg1.aByteArray21[local91];
				if (local247 > 0) {
					local7[local91] = (local30[local91] + local27[local91]) / 2;
					local14[local91] = (local36[local91] + local33[local91]) / 2;
					local16[local91] = (local39[local91] + local42[local91]) / 2;
					@Pc(305) float local305;
					@Pc(337) float local337;
					@Pc(303) float local303;
					if (local247 == 1) {
						local148 = arg1.anIntArray69[local91];
						if (local148 == 0) {
							local303 = 1.0F;
							local305 = 1.0F;
						} else if (local148 <= 0) {
							local303 = 1.0F;
							local305 = (float) -local148 / 1024.0F;
						} else {
							local305 = 1.0F;
							local303 = (float) local148 / 1024.0F;
						}
						local337 = 64.0F / (float) arg1.anIntArray62[local91];
					} else if (local247 == 2) {
						local337 = 64.0F / (float) arg1.anIntArray62[local91];
						local303 = 64.0F / (float) arg1.anIntArray65[local91];
						local305 = 64.0F / (float) arg1.anIntArray69[local91];
					} else {
						local337 = (float) arg1.anIntArray62[local91] / 1024.0F;
						local303 = (float) arg1.anIntArray65[local91] / 1024.0F;
						local305 = (float) arg1.anIntArray69[local91] / 1024.0F;
					}
					local18[local91] = Static437.method6925(arg1.aShortArray12[local91], arg1.aShortArray16[local91], local303, local305, local337, arg1.aShortArray13[local91], arg1.aByteArray22[local91] & 0xFF);
				}
			}
		}
		return new Class101(local7, local14, local16, local18);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(ZZB)V")
	public static void method2647(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static567.anInt10181++;
			Static120.method2943();
		}
		if (arg1) {
			Static223.anInt4977++;
			Static173.method3640();
		}
	}
}
