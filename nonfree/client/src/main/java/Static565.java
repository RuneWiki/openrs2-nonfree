import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array15;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_311 = new Class123(0, 1);

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	public static int anInt9794 = 0;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[100];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIBI[F)V")
	public static void method7702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5) {
		if (arg2 > 0 && !Static249.method6960(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static249.method6960(arg0)) {
			@Pc(34) int local34 = Static341.method4969(6408);
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg0 > arg2 ? arg2 : arg0;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(63) int local63 = arg0 >> 1;
			@Pc(65) float[] local65 = arg5;
			@Pc(72) float[] local72 = new float[local34 * local63 * local59];
			while (true) {
				OpenGL.glTexImage2Df(3553, local44, 34842, arg2, arg0, 0, 6408, 5126, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(93) int local93 = arg2 * local34;
				for (@Pc(95) int local95 = 0; local95 < local34; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(105) int local105 = local93 + local95;
					for (@Pc(107) int local107 = 0; local107 < local63; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local59; local111++) {
							@Pc(117) float local117 = local65[local101];
							local101 += local34;
							@Pc(127) float local127 = local117 + local65[local101];
							local101 += local34;
							@Pc(137) float local137 = local127 + local65[local105];
							local105 += local34;
							@Pc(147) float local147 = local137 + local65[local105];
							local105 += local34;
							local72[local99] = local147 * 0.25F;
							local99 += local34;
						}
						local105 += local93;
						local101 += local93;
					}
				}
				@Pc(187) float[] local187 = local72;
				local72 = local65;
				arg2 = local59;
				arg0 = local63;
				local65 = local187;
				local59 >>= 0x1;
				local44++;
				local55 >>= 0x1;
				local63 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
