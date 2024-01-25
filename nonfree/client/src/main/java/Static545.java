import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "D")
	public static double aDouble34;

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lclient!nca;")
	public static Class228 aClass228_14;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_143 = new Class200(11, -2);

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "[I")
	public static final int[] anIntArray643 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZ)Z")
	public static boolean method8455(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILclient!fu;[IZ)Lclient!je;")
	public static Class168 method8459(@OriginalArg(0) int arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg1.aByteArray45 != null) {
			@Pc(24) int local24 = arg1.anInt3254;
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
			local9 = new int[local24];
			@Pc(88) int local88;
			@Pc(141) int local141;
			for (@Pc(82) int local82 = 0; local82 < arg0; local82++) {
				local88 = arg2[local82];
				if (arg1.aByteArray45[local88] != -1) {
					@Pc(101) int local101 = arg1.aByteArray45[local88] & 0xFF;
					for (@Pc(103) int local103 = 0; local103 < 3; local103++) {
						@Pc(117) short local117;
						if (local103 == 0) {
							local117 = arg1.aShortArray60[local88];
						} else if (local103 == 1) {
							local117 = arg1.aShortArray61[local88];
						} else {
							local117 = arg1.aShortArray63[local88];
						}
						@Pc(136) int local136 = arg1.anIntArray166[local117];
						local141 = arg1.anIntArray169[local117];
						@Pc(146) int local146 = arg1.anIntArray168[local117];
						if (local27[local101] > local136) {
							local27[local101] = local136;
						}
						if (local30[local101] < local136) {
							local30[local101] = local136;
						}
						if (local33[local101] > local141) {
							local33[local101] = local141;
						}
						if (local141 > local36[local101]) {
							local36[local101] = local141;
						}
						if (local146 < local39[local101]) {
							local39[local101] = local146;
						}
						if (local42[local101] < local146) {
							local42[local101] = local146;
						}
					}
				}
			}
			local16 = new int[local24];
			local7 = new int[local24];
			for (local88 = 0; local88 < local24; local88++) {
				@Pc(245) byte local245 = arg1.aByteArray46[local88];
				if (local245 > 0) {
					local7[local88] = (local27[local88] + local30[local88]) / 2;
					local9[local88] = (local36[local88] + local33[local88]) / 2;
					local16[local88] = (local39[local88] + local42[local88]) / 2;
					@Pc(307) float local307;
					@Pc(299) float local299;
					@Pc(315) float local315;
					if (local245 == 1) {
						local141 = arg1.anIntArray173[local88];
						if (local141 == 0) {
							local307 = 1.0F;
							local299 = 1.0F;
						} else if (local141 > 0) {
							local299 = (float) local141 / 1024.0F;
							local307 = 1.0F;
						} else {
							local307 = (float) -local141 / 1024.0F;
							local299 = 1.0F;
						}
						local315 = 64.0F / (float) arg1.anIntArray170[local88];
					} else if (local245 == 2) {
						local299 = 64.0F / (float) arg1.anIntArray174[local88];
						local307 = 64.0F / (float) arg1.anIntArray173[local88];
						local315 = 64.0F / (float) arg1.anIntArray170[local88];
					} else {
						local307 = (float) arg1.anIntArray173[local88] / 1024.0F;
						local299 = (float) arg1.anIntArray174[local88] / 1024.0F;
						local315 = (float) arg1.anIntArray170[local88] / 1024.0F;
					}
					local18[local88] = Static386.method6218(arg1.aShortArray64[local88], arg1.aShortArray59[local88], arg1.aShortArray55[local88], arg1.aByteArray41[local88] & 0xFF, local315, local307, local299);
				}
			}
		}
		return new Class168(local7, local9, local16, local18);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!la;I)V")
	public static void method8461(@OriginalArg(0) Class196 arg0) {
		Static336.anInt6308 = arg0.method5104("p11_full");
		Static641.anInt10199 = arg0.method5104("p12_full");
		Static574.anInt9449 = arg0.method5104("b12_full");
	}
}
