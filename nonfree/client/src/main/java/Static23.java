import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
	public static int anInt6320;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	public static int anInt6321;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_148 = new Class81(72, -1);

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_149 = new Class81(38, 2);

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_117 = new Class319(7, 2);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIII[F)V")
	public static void method5274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5) {
		if (arg3 > 0 && !Static119.method2029(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static119.method2029(arg2)) {
			@Pc(31) int local31 = Static287.method4939(6408);
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg3 < arg2 ? arg3 : arg2;
			@Pc(48) int local48 = arg3 >> 1;
			@Pc(60) int local60 = arg2 >> 1;
			@Pc(62) float[] local62 = arg5;
			@Pc(69) float[] local69 = new float[local31 * local60 * local48];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg3, arg2, 0, 6408, 5126, local62, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(90) int local90 = arg3 * local31;
				for (@Pc(92) int local92 = 0; local92 < local31; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(103) int local103 = local92 + local90;
					for (@Pc(105) int local105 = 0; local105 < local60; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local48; local109++) {
							@Pc(115) float local115 = local62[local98];
							local98 += local31;
							@Pc(125) float local125 = local115 + local62[local98];
							@Pc(131) float local131 = local125 + local62[local103];
							local98 += local31;
							local103 += local31;
							@Pc(145) float local145 = local131 + local62[local103];
							local103 += local31;
							local69[local96] = local145 * 0.25F;
							local96 += local31;
						}
						local98 += local90;
						local103 += local90;
					}
				}
				@Pc(189) float[] local189 = local69;
				local69 = local62;
				arg2 = local60;
				arg3 = local48;
				local62 = local189;
				local60 >>= 0x1;
				local33++;
				local48 >>= 0x1;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
