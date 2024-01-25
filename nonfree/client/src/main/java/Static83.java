import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!f;")
	public static Class5 aClass5_6;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static int anInt1567 = 0;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	public static int anInt1568 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[FIIIII)V")
	public static void method1359(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static166.method6223(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static166.method6223(arg1)) {
			@Pc(31) int local31 = Static476.method6629(6408);
			@Pc(33) int local33 = 0;
			@Pc(40) int local40 = arg2 >= arg1 ? arg1 : arg2;
			@Pc(44) int local44 = arg2 >> 1;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(50) float[] local50 = arg0;
			@Pc(57) float[] local57 = new float[local31 * local48 * local44];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg2, arg1, 0, 6408, 5126, local50, 0);
				if (local40 <= 1) {
					return;
				}
				@Pc(87) int local87 = local31 * arg2;
				@Pc(89) float[] local89 = local57;
				for (@Pc(91) int local91 = 0; local91 < local31; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local91 + local87;
					for (@Pc(103) int local103 = 0; local103 < local48; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local44; local107++) {
							@Pc(113) float local113 = local50[local97];
							local97 += local31;
							@Pc(123) float local123 = local113 + local50[local97];
							local97 += local31;
							@Pc(133) float local133 = local123 + local50[local101];
							local101 += local31;
							@Pc(143) float local143 = local133 + local50[local101];
							local101 += local31;
							local57[local95] = local143 * 0.25F;
							local95 += local31;
						}
						local97 += local87;
						local101 += local87;
					}
				}
				local57 = local50;
				local50 = local89;
				arg2 = local44;
				arg1 = local48;
				local40 >>= 0x1;
				local48 >>= 0x1;
				local33++;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
