import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!pl;")
	public static Class287 aClass287_1;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_51 = new Class151(60, 6);

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_52 = new Class151(41, 2);

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_53 = new Class151(51, -1);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)Z")
	public static boolean method2080(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([FIIIIII)V")
	public static void method2082(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static211.method8993(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static211.method8993(arg3)) {
			@Pc(34) int local34 = Static415.method5231(6408);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg4 >= arg3 ? arg3 : arg4;
			@Pc(47) int local47 = arg4 >> 1;
			@Pc(51) int local51 = arg3 >> 1;
			@Pc(58) float[] local58 = arg0;
			@Pc(65) float[] local65 = new float[local34 * local47 * local51];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg4, arg3, 0, 6408, 5126, local58, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(85) int local85 = local34 * arg4;
				@Pc(87) float[] local87 = local65;
				for (@Pc(89) int local89 = 0; local89 < local34; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(99) int local99 = local85 + local89;
					for (@Pc(101) int local101 = 0; local101 < local51; local101++) {
						for (@Pc(105) int local105 = 0; local105 < local47; local105++) {
							@Pc(111) float local111 = local58[local95];
							local95 += local34;
							@Pc(121) float local121 = local111 + local58[local95];
							@Pc(127) float local127 = local121 + local58[local99];
							local95 += local34;
							local99 += local34;
							@Pc(141) float local141 = local127 + local58[local99];
							local99 += local34;
							local65[local93] = local141 * 0.25F;
							local93 += local34;
						}
						local95 += local85;
						local99 += local85;
					}
				}
				local65 = local58;
				arg3 = local51;
				arg4 = local47;
				local58 = local87;
				local43 >>= 0x1;
				local51 >>= 0x1;
				local36++;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
