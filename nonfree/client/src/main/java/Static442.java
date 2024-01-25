import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(FFIIIIFIIIF[BFLclient!wba;)V")
	public static void method6765(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float arg4, @OriginalArg(10) float arg5, @OriginalArg(11) byte[] arg6, @OriginalArg(12) float arg7, @OriginalArg(13) Class79 arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(46) int local46;
		@Pc(56) int local56;
		for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
			arg8.method2175(arg4 / (float) 128, 0, arg0 * 127.0F, arg5 / (float) 16, arg7 / (float) 128, arg2, local12);
			local46 = arg3;
			arg5 *= 2.0F;
			arg4 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg6[local46] = (byte) ((float) arg6[local46] + local12[local56]);
				local46++;
			}
			arg0 *= arg1;
			arg7 *= 2.0F;
		}
		local46 = arg3;
		for (local56 = 0; local56 < 16384; local56++) {
			arg6[local46] = (byte) (arg6[local46] + 127);
			local46++;
		}
	}
}
