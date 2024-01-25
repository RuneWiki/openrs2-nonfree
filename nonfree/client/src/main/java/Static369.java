import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
	public static int anInt1973;

	@OriginalMember(owner = "client!mi", name = "F", descriptor = "Lclient!nf;")
	public static Class102 aClass102_9;

	@OriginalMember(owner = "client!mi", name = "G", descriptor = "Lclient!ud;")
	public static Class352 aClass352_5;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_26 = new Class376(72, 7);

	@OriginalMember(owner = "client!mi", name = "D", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_29 = new Class126(31, 10);

	@OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
	public static int anInt1974 = 2;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method1820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static55.anInt1419 = arg1;
		Static215.anInt6266 = arg4;
		Static337.anInt6126 = arg3;
		Static18.anInt681 = arg0;
		Static480.anInt8125 = arg2;
		if (arg5 && Static55.anInt1419 >= 100) {
			Static97.anInt2082 = Static215.anInt6266 * 512 + 256;
			Static663.anInt10236 = Static480.anInt8125 * 512 + 256;
			Static265.anInt9363 = Static194.method5133(Static97.anInt2082, Static663.anInt10236, Static576.anInt9136) - Static337.anInt6126;
		}
		Static378.anInt6662 = 2;
		Static18.anInt682 = -1;
		Static65.anInt1581 = -1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[FIIII)V")
	public static void method1823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static9.method94(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static9.method94(arg1)) {
			@Pc(36) int local36 = Static517.method7338(6408);
			@Pc(38) int local38 = 0;
			@Pc(49) int local49 = arg1 <= arg5 ? arg1 : arg5;
			@Pc(53) int local53 = arg5 >> 1;
			@Pc(68) int local68 = arg1 >> 1;
			@Pc(70) float[] local70 = arg2;
			@Pc(77) float[] local77 = new float[local36 * local68 * local53];
			while (true) {
				OpenGL.glTexImage2Df(3553, local38, 34842, arg5, arg1, 0, 6408, 5126, local70, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(95) int local95 = local36 * arg5;
				for (@Pc(97) int local97 = 0; local97 < local36; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(107) int local107 = local95 + local97;
					for (@Pc(109) int local109 = 0; local109 < local68; local109++) {
						for (@Pc(113) int local113 = 0; local113 < local53; local113++) {
							@Pc(119) float local119 = local70[local103];
							local103 += local36;
							@Pc(129) float local129 = local119 + local70[local103];
							local103 += local36;
							@Pc(139) float local139 = local129 + local70[local107];
							local107 += local36;
							@Pc(149) float local149 = local139 + local70[local107];
							local77[local101] = local149 * 0.25F;
							local107 += local36;
							local101 += local36;
						}
						local107 += local95;
						local103 += local95;
					}
				}
				@Pc(197) float[] local197 = local77;
				local77 = local70;
				local70 = local197;
				arg5 = local53;
				arg1 = local68;
				local49 >>= 0x1;
				local38++;
				local68 >>= 0x1;
				local53 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
