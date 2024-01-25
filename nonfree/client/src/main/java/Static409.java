import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_203 = new Class363(7, -1);

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public static int anInt7111 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!r;)V")
	public static void method5952(@OriginalArg(1) Class100 arg0) {
		if (Static316.aBoolean475) {
			Static502.method537(arg0);
		} else {
			Static578.method7802(arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(FIFIIIII[FIIIF)V")
	public static void method5955(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(5) int local5 = arg6 - arg3;
		@Pc(13) int local13 = arg10 - arg1;
		@Pc(17) int local17 = arg9 - arg8;
		@Pc(42) float local42 = (float) local5 * arg7[1] + arg7[0] * (float) local17 + arg7[2] * (float) local13;
		@Pc(63) float local63 = arg7[4] * (float) local5 + (float) local17 * arg7[3] + (float) local13 * arg7[5];
		@Pc(84) float local84 = (float) local13 * arg7[8] + arg7[7] * (float) local5 + (float) local17 * arg7[6];
		@Pc(106) float local106;
		@Pc(100) float local100;
		if (arg4 == 0) {
			local106 = arg0 + local42 + 0.5F;
			local100 = arg2 + 0.5F - local84;
		} else if (arg4 == 1) {
			local100 = arg2 + local84 + 0.5F;
			local106 = arg0 + local42 + 0.5F;
		} else if (arg4 == 2) {
			local106 = arg0 + 0.5F - local42;
			local100 = arg11 + 0.5F - local63;
		} else if (arg4 == 3) {
			local106 = local42 + arg0 + 0.5F;
			local100 = arg11 + 0.5F - local63;
		} else if (arg4 == 4) {
			local100 = arg11 + 0.5F - local63;
			local106 = local84 + arg2 + 0.5F;
		} else {
			local106 = arg2 + 0.5F - local84;
			local100 = arg11 + 0.5F - local63;
		}
		@Pc(215) float local215;
		if (arg5 == 1) {
			local215 = local106;
			local106 = -local100;
			local100 = local215;
		} else if (arg5 == 2) {
			local100 = -local100;
			local106 = -local106;
		} else if (arg5 == 3) {
			local215 = local106;
			local106 = local100;
			local100 = -local215;
		}
		Static119.aFloat63 = local100;
		Static576.aFloat249 = local106;
	}
}
