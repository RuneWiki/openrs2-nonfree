import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!hm", name = "F", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_81 = new Class359(31, -2);

	@OriginalMember(owner = "client!hm", name = "I", descriptor = "F")
	public static float aFloat91 = 0.0F;

	@OriginalMember(owner = "client!hm", name = "J", descriptor = "Lclient!cja;")
	public static final Class64 aClass64_2 = new Class64();

	@OriginalMember(owner = "client!hm", name = "L", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_39 = new Class305(11, 3);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI[FIII)V")
	public static void method3634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static111.method4954(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static111.method4954(arg4)) {
			@Pc(29) int local29 = Static105.method2031(6408);
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg4 <= arg1 ? arg4 : arg1;
			@Pc(42) int local42 = arg1 >> 1;
			@Pc(46) int local46 = arg4 >> 1;
			@Pc(48) float[] local48 = arg2;
			@Pc(55) float[] local55 = new float[local29 * local42 * local46];
			while (true) {
				OpenGL.glTexImage2Df(3553, local31, 34842, arg1, arg4, 0, 6408, 5126, local48, 0);
				if (local38 <= 1) {
					return;
				}
				@Pc(73) int local73 = local29 * arg1;
				@Pc(75) float[] local75 = local55;
				for (@Pc(77) int local77 = 0; local77 < local29; local77++) {
					@Pc(80) int local80 = local77;
					@Pc(82) int local82 = local77;
					@Pc(87) int local87 = local77 + local73;
					for (@Pc(89) int local89 = 0; local89 < local46; local89++) {
						for (@Pc(92) int local92 = 0; local92 < local42; local92++) {
							@Pc(97) float local97 = local48[local82];
							local82 += local29;
							@Pc(107) float local107 = local97 + local48[local82];
							@Pc(113) float local113 = local107 + local48[local87];
							local82 += local29;
							local87 += local29;
							@Pc(127) float local127 = local113 + local48[local87];
							local87 += local29;
							local55[local80] = local127 * 0.25F;
							local80 += local29;
						}
						local82 += local73;
						local87 += local73;
					}
				}
				local55 = local48;
				local48 = local75;
				arg1 = local42;
				arg4 = local46;
				local31++;
				local38 >>= 0x1;
				local42 >>= 0x1;
				local46 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
