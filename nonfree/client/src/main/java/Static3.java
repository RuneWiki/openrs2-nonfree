import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public static int anInt53;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z[FIIIII)V")
	public static void method51(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static230.method3483(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static230.method3483(arg5)) {
			@Pc(34) int local34 = Static219.method5965(6408);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg1 < arg5 ? arg1 : arg5;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg5 >> 1;
			@Pc(57) float[] local57 = arg0;
			@Pc(69) float[] local69 = new float[local55 * local51 * local34];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg1, arg5, 0, 6408, 5126, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(89) int local89 = local34 * arg1;
				@Pc(91) float[] local91 = local69;
				for (@Pc(93) int local93 = 0; local93 < local34; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(103) int local103 = local89 + local93;
					for (@Pc(105) int local105 = 0; local105 < local55; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local51; local109++) {
							@Pc(115) float local115 = local57[local99];
							local99 += local34;
							@Pc(125) float local125 = local115 + local57[local99];
							local99 += local34;
							@Pc(135) float local135 = local125 + local57[local103];
							local103 += local34;
							@Pc(145) float local145 = local135 + local57[local103];
							local69[local97] = local145 * 0.25F;
							local103 += local34;
							local97 += local34;
						}
						local99 += local89;
						local103 += local89;
					}
				}
				local69 = local57;
				local57 = local91;
				arg5 = local55;
				arg1 = local51;
				local47 >>= 0x1;
				local55 >>= 0x1;
				local36++;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
