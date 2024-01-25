import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hea", name = "i", descriptor = "I")
	public static int anInt3602;

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_138 = new Class179(27, 12);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIII[F)V")
	public static void method3092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float[] arg5) {
		if (arg4 > 0 && !Static177.method2498(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static177.method2498(arg3)) {
			@Pc(46) int local46 = Static545.method7723(6408);
			@Pc(48) int local48 = 0;
			@Pc(55) int local55 = arg3 > arg4 ? arg4 : arg3;
			@Pc(59) int local59 = arg4 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) float[] local65 = arg5;
			@Pc(72) float[] local72 = new float[local59 * local63 * local46];
			while (true) {
				OpenGL.glTexImage2Df(3553, local48, 34842, arg4, arg3, 0, 6408, 5126, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg4 * local46;
				@Pc(94) float[] local94 = local72;
				for (@Pc(96) int local96 = 0; local96 < local46; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local96 + local92;
					for (@Pc(108) int local108 = 0; local108 < local63; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local59; local112++) {
							@Pc(118) float local118 = local65[local102];
							local102 += local46;
							@Pc(128) float local128 = local118 + local65[local102];
							local102 += local46;
							@Pc(138) float local138 = local128 + local65[local106];
							local106 += local46;
							@Pc(148) float local148 = local138 + local65[local106];
							local72[local100] = local148 * 0.25F;
							local106 += local46;
							local100 += local46;
						}
						local106 += local92;
						local102 += local92;
					}
				}
				local72 = local65;
				local65 = local94;
				arg4 = local59;
				arg3 = local63;
				local63 >>= 0x1;
				local48++;
				local55 >>= 0x1;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
