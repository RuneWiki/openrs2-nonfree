import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static707 {

	@OriginalMember(owner = "client!wfa", name = "m", descriptor = "I")
	public static int anInt10827 = -1;

	@OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
	public static final int anInt10829 = 2;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II[FIIIB)V")
	public static void method9447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 > 0 && !Static457.method6641(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static457.method6641(arg5)) {
			@Pc(37) int local37 = Static582.method8098(6408);
			@Pc(39) int local39 = 0;
			@Pc(51) int local51 = arg1 >= arg5 ? arg5 : arg1;
			@Pc(68) int local68 = arg1 >> 1;
			@Pc(72) int local72 = arg5 >> 1;
			@Pc(74) float[] local74 = arg2;
			@Pc(81) float[] local81 = new float[local37 * local72 * local68];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg1, arg5, 0, 6408, 5126, local74, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(103) int local103 = arg1 * local37;
				for (@Pc(105) int local105 = 0; local105 < local37; local105++) {
					@Pc(111) int local111 = local105;
					@Pc(113) int local113 = local105;
					@Pc(117) int local117 = local103 + local105;
					for (@Pc(119) int local119 = 0; local119 < local72; local119++) {
						for (@Pc(123) int local123 = 0; local123 < local68; local123++) {
							@Pc(129) float local129 = local74[local113];
							local113 += local37;
							@Pc(139) float local139 = local129 + local74[local113];
							@Pc(145) float local145 = local139 + local74[local117];
							local113 += local37;
							local117 += local37;
							@Pc(159) float local159 = local145 + local74[local117];
							local81[local111] = local159 * 0.25F;
							local117 += local37;
							local111 += local37;
						}
						local113 += local103;
						local117 += local103;
					}
				}
				@Pc(201) float[] local201 = local81;
				local81 = local74;
				arg5 = local72;
				local74 = local201;
				arg1 = local68;
				local39++;
				local72 >>= 0x1;
				local51 >>= 0x1;
				local68 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
