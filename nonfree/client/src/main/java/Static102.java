import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
	public static int anInt2170;

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "[Lclient!fu;")
	public static Class108[] aClass108Array1;

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "[I")
	public static final int[] anIntArray158 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "[I")
	public static final int[] anIntArray160 = new int[50];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIZI[FI)V")
	public static void method2087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static329.method5606(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static329.method5606(arg0)) {
			@Pc(34) int local34 = Static74.method1729(6408);
			@Pc(36) int local36 = 0;
			@Pc(52) int local52 = arg5 < arg0 ? arg5 : arg0;
			@Pc(56) int local56 = arg5 >> 1;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(62) float[] local62 = arg4;
			@Pc(69) float[] local69 = new float[local60 * local56 * local34];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg5, arg0, 0, 6408, 5126, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(90) int local90 = local34 * arg5;
				for (@Pc(92) int local92 = 0; local92 < local34; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(102) int local102 = local90 + local92;
					for (@Pc(104) int local104 = 0; local104 < local60; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local56; local108++) {
							@Pc(114) float local114 = local62[local98];
							local98 += local34;
							@Pc(124) float local124 = local114 + local62[local98];
							@Pc(130) float local130 = local124 + local62[local102];
							local98 += local34;
							local102 += local34;
							@Pc(144) float local144 = local130 + local62[local102];
							local69[local96] = local144 * 0.25F;
							local102 += local34;
							local96 += local34;
						}
						local98 += local90;
						local102 += local90;
					}
				}
				@Pc(188) float[] local188 = local69;
				local69 = local62;
				local62 = local188;
				arg5 = local56;
				arg0 = local60;
				local36++;
				local60 >>= 0x1;
				local52 >>= 0x1;
				local56 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
