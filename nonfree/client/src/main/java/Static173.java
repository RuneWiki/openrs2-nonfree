import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_81 = new Class150(109, -1);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
	public static void method3022(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub2_Sub7 local12 = Static144.method2728(arg0, 10);
		local12.method1324();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[FIBII)V")
	public static void method3025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static281.method4574(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static281.method4574(arg3)) {
			@Pc(37) int local37 = Static541.method7392(6408);
			@Pc(39) int local39 = 0;
			@Pc(54) int local54 = arg4 >= arg3 ? arg3 : arg4;
			@Pc(58) int local58 = arg4 >> 1;
			@Pc(62) int local62 = arg3 >> 1;
			@Pc(64) float[] local64 = arg2;
			@Pc(71) float[] local71 = new float[local58 * local62 * local37];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg4, arg3, 0, 6408, 5126, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg4 * local37;
				for (@Pc(91) int local91 = 0; local91 < local37; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local89 + local91;
					for (@Pc(103) int local103 = 0; local103 < local62; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local58; local107++) {
							@Pc(113) float local113 = local64[local97];
							local97 += local37;
							@Pc(123) float local123 = local113 + local64[local97];
							local97 += local37;
							@Pc(133) float local133 = local123 + local64[local101];
							local101 += local37;
							@Pc(143) float local143 = local133 + local64[local101];
							local101 += local37;
							local71[local95] = local143 * 0.25F;
							local95 += local37;
						}
						local97 += local89;
						local101 += local89;
					}
				}
				@Pc(187) float[] local187 = local71;
				local71 = local64;
				local64 = local187;
				arg4 = local58;
				arg3 = local62;
				local54 >>= 0x1;
				local62 >>= 0x1;
				local58 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
