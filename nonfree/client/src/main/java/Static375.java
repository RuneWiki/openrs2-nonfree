import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!nca", name = "n", descriptor = "I")
	public static int anInt6456;

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "[I")
	public static final int[] anIntArray419 = new int[2];

	@OriginalMember(owner = "client!nca", name = "q", descriptor = "I")
	public static int anInt6459 = -1;

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "(B)Z")
	public static boolean method5563() {
		if (Static640.aBoolean751) {
			try {
				if ((Boolean) Static655.method4698("showingVideoAd", Static107.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(35) Throwable local35) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIFIIIFBI[FIFI[F)V")
	public static void method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float[] arg12) {
		@Pc(3) int local3 = arg5 - arg0;
		@Pc(7) int local7 = arg4 - arg7;
		@Pc(11) int local11 = arg9 - arg1;
		@Pc(36) float local36 = (float) local3 * arg8[0] + arg8[1] * (float) local11 + (float) local7 * arg8[2];
		@Pc(57) float local57 = arg8[5] * (float) local7 + arg8[4] * (float) local11 + (float) local3 * arg8[3];
		@Pc(78) float local78 = (float) local7 * arg8[8] + (float) local11 * arg8[7] + arg8[6] * (float) local3;
		@Pc(95) float local95;
		@Pc(89) float local89;
		if (arg11 == 0) {
			local95 = arg2 + local36 + 0.5F;
			local89 = arg10 + 0.5F - local78;
		} else if (arg11 == 1) {
			local89 = local78 + arg10 + 0.5F;
			local95 = arg2 + local36 + 0.5F;
		} else if (arg11 == 2) {
			local89 = arg6 + 0.5F - local57;
			local95 = arg2 + 0.5F - local36;
		} else if (arg11 == 3) {
			local95 = arg2 + local36 + 0.5F;
			local89 = arg6 + 0.5F - local57;
		} else if (arg11 == 4) {
			local95 = local78 + arg10 + 0.5F;
			local89 = arg6 + 0.5F - local57;
		} else {
			local95 = arg10 + 0.5F - local78;
			local89 = arg6 + 0.5F - local57;
		}
		@Pc(194) float local194;
		if (arg3 == 1) {
			local194 = local95;
			local95 = -local89;
			local89 = local194;
		} else if (arg3 == 2) {
			local95 = -local95;
			local89 = -local89;
		} else if (arg3 == 3) {
			local194 = local95;
			local95 = local89;
			local89 = -local194;
		}
		arg12[0] = local95;
		arg12[1] = local89;
	}
}
