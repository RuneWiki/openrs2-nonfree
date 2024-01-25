import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(FFFFILclient!bo;[BFIIIIII)V")
	public static void method3589(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) Class34 arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) float arg6, @OriginalArg(11) int arg7, @OriginalArg(12) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(21) int local21;
		@Pc(63) int local63;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local21 = arg7;
			arg4.method7102(arg3 / (float) 128, arg2 * 127.0F, local12, arg8, arg6 / (float) 16, 0, arg0 / (float) 128);
			arg3 *= 2.0F;
			arg0 *= 2.0F;
			arg2 *= arg1;
			arg6 *= 2.0F;
			for (local63 = 0; local63 < 16384; local63++) {
				arg5[local21] = (byte) (int) ((float) arg5[local21] + local12[local63]);
				local21++;
			}
		}
		local21 = arg7;
		for (local63 = 0; local63 < 16384; local63++) {
			arg5[local21] -= -127;
			local21++;
		}
	}
}
