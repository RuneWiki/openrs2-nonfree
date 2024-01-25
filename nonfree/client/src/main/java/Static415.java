import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "[B")
	public static final byte[] aByteArray72 = new byte[2048];

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Lclient!gca;")
	public static final Class116 aClass116_12 = new Class116();

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([ILclient!b;II)Lclient!dj;")
	public static Class76 method6353(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg1.aByteArray9 != null) {
			@Pc(24) int local24 = arg1.anInt382;
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
			local7 = new int[local24];
			local18 = new float[local24][];
			local16 = new int[local24];
			@Pc(95) int local95;
			@Pc(152) int local152;
			for (@Pc(89) int local89 = 0; local89 < arg2; local89++) {
				local95 = arg0[local89];
				if (arg1.aByteArray9[local95] != -1) {
					@Pc(109) int local109 = arg1.aByteArray9[local95] & 0xFF;
					for (@Pc(111) int local111 = 0; local111 < 3; local111++) {
						@Pc(128) short local128;
						if (local111 == 0) {
							local128 = arg1.aShortArray9[local95];
						} else if (local111 == 1) {
							local128 = arg1.aShortArray17[local95];
						} else {
							local128 = arg1.aShortArray18[local95];
						}
						@Pc(147) int local147 = arg1.anIntArray16[local128];
						local152 = arg1.anIntArray22[local128];
						@Pc(157) int local157 = arg1.anIntArray17[local128];
						if (local147 < local27[local109]) {
							local27[local109] = local147;
						}
						if (local30[local109] < local147) {
							local30[local109] = local147;
						}
						if (local33[local109] > local152) {
							local33[local109] = local152;
						}
						if (local36[local109] < local152) {
							local36[local109] = local152;
						}
						if (local157 < local39[local109]) {
							local39[local109] = local157;
						}
						if (local42[local109] < local157) {
							local42[local109] = local157;
						}
					}
				}
			}
			local9 = new int[local24];
			for (local95 = 0; local95 < local24; local95++) {
				@Pc(249) byte local249 = arg1.aByteArray5[local95];
				if (local249 > 0) {
					local7[local95] = (local27[local95] + local30[local95]) / 2;
					local9[local95] = (local33[local95] + local36[local95]) / 2;
					local16[local95] = (local42[local95] + local39[local95]) / 2;
					@Pc(322) float local322;
					@Pc(314) float local314;
					@Pc(306) float local306;
					if (local249 == 1) {
						local152 = arg1.anIntArray24[local95];
						local314 = 64.0F / (float) arg1.anIntArray25[local95];
						if (local152 == 0) {
							local322 = 1.0F;
							local306 = 1.0F;
						} else if (local152 > 0) {
							local322 = 1.0F;
							local306 = (float) local152 / 1024.0F;
						} else {
							local306 = 1.0F;
							local322 = (float) -local152 / 1024.0F;
						}
					} else if (local249 == 2) {
						local306 = 64.0F / (float) arg1.anIntArray19[local95];
						local314 = 64.0F / (float) arg1.anIntArray25[local95];
						local322 = 64.0F / (float) arg1.anIntArray24[local95];
					} else {
						local314 = (float) arg1.anIntArray25[local95] / 1024.0F;
						local306 = (float) arg1.anIntArray19[local95] / 1024.0F;
						local322 = (float) arg1.anIntArray24[local95] / 1024.0F;
					}
					local18[local95] = Static115.method1767(local306, local314, local322, arg1.aShortArray13[local95], arg1.aByteArray6[local95] & 0xFF, arg1.aShortArray10[local95], arg1.aShortArray12[local95]);
				}
			}
		}
		return new Class76(local7, local9, local16, local18);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
	public static void method6354() {
		Static102.aClass87_57.method1793(50);
	}
}
