import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "[I")
	public static int[] anIntArray291 = new int[1];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIILclient!ha;III)V")
	public static void method3792(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class95 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		arg2.method6936(arg0, arg4, arg3, -10660793, arg1);
		arg2.method6936(16, arg4 - 2, arg3 - -1, -16777216, arg1 + 1);
		arg2.method6989(arg3 + 1, -16777216, arg0 - 19, arg1 + 18, arg4 + -2);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIBII[F)V")
	public static void method3796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5) {
		if (arg3 > 0 && !Static485.method6790(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static485.method6790(arg0)) {
			@Pc(37) int local37 = Static513.method7197(6408);
			@Pc(43) int local43 = 0;
			@Pc(50) int local50 = arg3 < arg0 ? arg3 : arg0;
			@Pc(54) int local54 = arg3 >> 1;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(60) float[] local60 = arg5;
			@Pc(67) float[] local67 = new float[local58 * local54 * local37];
			while (true) {
				OpenGL.glTexImage2Df(3553, local43, 34842, arg3, arg0, 0, 6408, 5126, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(88) int local88 = local37 * arg3;
				@Pc(90) float[] local90 = local67;
				for (@Pc(92) int local92 = 0; local92 < local37; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(103) int local103 = local92 + local88;
					for (@Pc(105) int local105 = 0; local105 < local58; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local54; local109++) {
							@Pc(115) float local115 = local60[local98];
							local98 += local37;
							@Pc(125) float local125 = local115 + local60[local98];
							@Pc(131) float local131 = local125 + local60[local103];
							local98 += local37;
							local103 += local37;
							@Pc(145) float local145 = local131 + local60[local103];
							local67[local96] = local145 * 0.25F;
							local103 += local37;
							local96 += local37;
						}
						local103 += local88;
						local98 += local88;
					}
				}
				local67 = local60;
				arg0 = local58;
				arg3 = local54;
				local60 = local90;
				local50 >>= 0x1;
				local43++;
				local54 >>= 0x1;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
