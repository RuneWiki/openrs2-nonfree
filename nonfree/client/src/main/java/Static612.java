import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "([FIIIIII)V")
	public static void method8294(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static365.method5254(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static365.method5254(arg1)) {
			@Pc(42) int local42 = Static571.method7502(6408);
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg5 >= arg1 ? arg1 : arg5;
			@Pc(55) int local55 = arg5 >> 1;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(61) float[] local61 = arg0;
			@Pc(68) float[] local68 = new float[local55 * local59 * local42];
			while (true) {
				OpenGL.glTexImage2Df(3553, local44, 34842, arg5, arg1, 0, 6408, 5126, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(87) int local87 = arg5 * local42;
				@Pc(89) float[] local89 = local68;
				for (@Pc(91) int local91 = 0; local91 < local42; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(102) int local102 = local91 + local87;
					for (@Pc(104) int local104 = 0; local104 < local59; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local55; local108++) {
							@Pc(114) float local114 = local61[local97];
							local97 += local42;
							@Pc(124) float local124 = local114 + local61[local97];
							@Pc(130) float local130 = local124 + local61[local102];
							local97 += local42;
							local102 += local42;
							@Pc(144) float local144 = local130 + local61[local102];
							local68[local95] = local144 * 0.25F;
							local102 += local42;
							local95 += local42;
						}
						local102 += local87;
						local97 += local87;
					}
				}
				local68 = local61;
				arg1 = local59;
				arg5 = local55;
				local61 = local89;
				local55 >>= 0x1;
				local51 >>= 0x1;
				local44++;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
