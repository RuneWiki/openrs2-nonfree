import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!dea;II[I)Lclient!iq;")
	public static Class178 method6688(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(5) int[] local5 = null;
		@Pc(7) int[] local7 = null;
		@Pc(15) int[] local15 = null;
		@Pc(17) float[][] local17 = null;
		if (arg0.aByteArray30 != null) {
			@Pc(23) int local23 = arg0.anInt1757;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(29) int[] local29 = new int[local23];
			@Pc(32) int[] local32 = new int[local23];
			@Pc(35) int[] local35 = new int[local23];
			@Pc(38) int[] local38 = new int[local23];
			@Pc(41) int[] local41 = new int[local23];
			for (@Pc(43) int local43 = 0; local43 < local23; local43++) {
				local26[local43] = Integer.MAX_VALUE;
				local29[local43] = -2147483647;
				local32[local43] = Integer.MAX_VALUE;
				local35[local43] = -2147483647;
				local38[local43] = Integer.MAX_VALUE;
				local41[local43] = -2147483647;
			}
			local15 = new int[local23];
			@Pc(86) int local86;
			@Pc(137) int local137;
			for (@Pc(81) int local81 = 0; local81 < arg1; local81++) {
				local86 = arg2[local81];
				if (arg0.aByteArray30[local86] != -1) {
					@Pc(100) int local100 = arg0.aByteArray30[local86] & 0xFF;
					for (@Pc(102) int local102 = 0; local102 < 3; local102++) {
						@Pc(110) short local110;
						if (local102 == 0) {
							local110 = arg0.aShortArray25[local86];
						} else if (local102 == 1) {
							local110 = arg0.aShortArray27[local86];
						} else {
							local110 = arg0.aShortArray24[local86];
						}
						@Pc(132) int local132 = arg0.anIntArray93[local110];
						local137 = arg0.anIntArray102[local110];
						@Pc(142) int local142 = arg0.anIntArray99[local110];
						if (local26[local100] > local132) {
							local26[local100] = local132;
						}
						if (local132 > local29[local100]) {
							local29[local100] = local132;
						}
						if (local32[local100] > local137) {
							local32[local100] = local137;
						}
						if (local35[local100] < local137) {
							local35[local100] = local137;
						}
						if (local142 < local38[local100]) {
							local38[local100] = local142;
						}
						if (local142 > local41[local100]) {
							local41[local100] = local142;
						}
					}
				}
			}
			local5 = new int[local23];
			local17 = new float[local23][];
			local7 = new int[local23];
			for (local86 = 0; local86 < local23; local86++) {
				@Pc(251) byte local251 = arg0.aByteArray32[local86];
				if (local251 > 0) {
					local5[local86] = (local29[local86] + local26[local86]) / 2;
					local7[local86] = (local32[local86] + local35[local86]) / 2;
					local15[local86] = (local38[local86] + local41[local86]) / 2;
					@Pc(330) float local330;
					@Pc(311) float local311;
					@Pc(328) float local328;
					if (local251 == 1) {
						local137 = arg0.anIntArray94[local86];
						local311 = 64.0F / (float) arg0.anIntArray103[local86];
						if (local137 == 0) {
							local328 = 1.0F;
							local330 = 1.0F;
						} else if (local137 > 0) {
							local328 = (float) local137 / 1024.0F;
							local330 = 1.0F;
						} else {
							local328 = 1.0F;
							local330 = (float) -local137 / 1024.0F;
						}
					} else if (local251 == 2) {
						local330 = 64.0F / (float) arg0.anIntArray94[local86];
						local328 = 64.0F / (float) arg0.anIntArray97[local86];
						local311 = 64.0F / (float) arg0.anIntArray103[local86];
					} else {
						local311 = (float) arg0.anIntArray103[local86] / 1024.0F;
						local330 = (float) arg0.anIntArray94[local86] / 1024.0F;
						local328 = (float) arg0.anIntArray97[local86] / 1024.0F;
					}
					local17[local86] = method6690(arg0.aShortArray30[local86], arg0.aShortArray29[local86], arg0.aShortArray26[local86], arg0.aByteArray31[local86] & 0xFF, local330, local328, local311);
				}
			}
		}
		return new Class178(local5, local7, local15, local17);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(III)Z")
	public static boolean method6689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static588.method8382(arg0, arg1) || Static531.method7865(arg0, arg1);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIIZIFFF)[F")
	private static float[] method6690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[0] = local17;
		local6[3] = 0.0F;
		local6[5] = 0.0F;
		local6[7] = 0.0F;
		local6[8] = local17;
		local6[6] = -local25;
		local6[4] = 1.0F;
		@Pc(75) float[] local75 = new float[9];
		@Pc(77) float local77 = 1.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = (float) arg0 / 32767.0F;
		@Pc(89) float local89 = 1.0F - local84;
		@Pc(100) float local100 = -((float) Math.sqrt((double) (1.0F - local84 * local84)));
		@Pc(111) float local111 = (float) Math.sqrt((double) (arg1 * arg1 + arg2 * arg2));
		if (local111 == 0.0F && local84 == 0.0F) {
			local9 = local6;
		} else {
			if (local111 != 0.0F) {
				local77 = (float) -arg2 / local111;
				local79 = (float) arg1 / local111;
			}
			local75[2] = local89 * local77 * local79;
			local75[5] = local77 * local100;
			local75[3] = -local79 * local100;
			local75[8] = local84 + local89 * local79 * local79;
			local75[4] = local84;
			local75[1] = local79 * local100;
			local75[0] = local84 + local89 * local77 * local77;
			local75[7] = -local77 * local100;
			local75[6] = local77 * local79 * local89;
			local9[0] = local6[2] * local75[6] + local75[0] * local6[0] + local6[1] * local75[3];
			local9[1] = local75[7] * local6[2] + local6[1] * local75[4] + local6[0] * local75[1];
			local9[3] = local6[5] * local75[6] + local75[3] * local6[4] + local6[3] * local75[0];
			local9[2] = local6[1] * local75[5] + local6[0] * local75[2] + local75[8] * local6[2];
			local9[4] = local6[5] * local75[7] + local6[4] * local75[4] + local6[3] * local75[1];
			local9[5] = local6[5] * local75[8] + local6[3] * local75[2] + local6[4] * local75[5];
			local9[6] = local6[6] * local75[0] + local6[7] * local75[3] + local75[6] * local6[8];
			local9[7] = local75[7] * local6[8] + local75[4] * local6[7] + local6[6] * local75[1];
			local9[8] = local6[8] * local75[8] + local75[5] * local6[7] + local75[2] * local6[6];
		}
		local9[3] *= arg6;
		local9[8] *= arg5;
		local9[7] *= arg5;
		local9[1] *= arg4;
		local9[0] *= arg4;
		local9[6] *= arg5;
		local9[2] *= arg4;
		local9[5] *= arg6;
		local9[4] *= arg6;
		return local9;
	}
}
