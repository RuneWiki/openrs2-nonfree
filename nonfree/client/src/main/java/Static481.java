import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method6574(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static347.method5276(arg0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII[FI)V")
	public static void method6575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5) {
		if (arg4 > 0 && !Static159.method2855(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static159.method2855(arg0)) {
			@Pc(37) int local37 = Static57.method1112(6408);
			@Pc(39) int local39 = 0;
			@Pc(54) int local54 = arg0 <= arg4 ? arg0 : arg4;
			@Pc(58) int local58 = arg4 >> 1;
			@Pc(62) int local62 = arg0 >> 1;
			@Pc(64) float[] local64 = arg5;
			@Pc(71) float[] local71 = new float[local37 * local58 * local62];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg4, arg0, 0, 6408, 5126, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg4 * local37;
				for (@Pc(94) int local94 = 0; local94 < local37; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(105) int local105 = local94 + local92;
					for (@Pc(107) int local107 = 0; local107 < local62; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local58; local111++) {
							@Pc(117) float local117 = local64[local100];
							local100 += local37;
							@Pc(127) float local127 = local117 + local64[local100];
							local100 += local37;
							@Pc(137) float local137 = local127 + local64[local105];
							local105 += local37;
							@Pc(147) float local147 = local137 + local64[local105];
							local105 += local37;
							local71[local98] = local147 * 0.25F;
							local98 += local37;
						}
						local105 += local92;
						local100 += local92;
					}
				}
				@Pc(187) float[] local187 = local71;
				local71 = local64;
				arg0 = local62;
				local64 = local187;
				arg4 = local58;
				local62 >>= 0x1;
				local58 >>= 0x1;
				local54 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
