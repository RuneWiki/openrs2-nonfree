import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "[I")
	public static int[] anIntArray557;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII[F)V")
	public static void method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5) {
		if (arg0 > 0 && !Static54.method895(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static54.method895(arg1)) {
			@Pc(35) int local35 = Static157.method2555(6408);
			@Pc(37) int local37 = 0;
			@Pc(48) int local48 = arg1 <= arg0 ? arg1 : arg0;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(58) float[] local58 = arg5;
			@Pc(65) float[] local65 = new float[local56 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(3553, local37, 34842, arg0, arg1, 0, 6408, 5126, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(84) int local84 = local35 * arg0;
				@Pc(86) float[] local86 = local65;
				for (@Pc(88) int local88 = 0; local88 < local35; local88++) {
					@Pc(92) int local92 = local88;
					@Pc(94) int local94 = local88;
					@Pc(98) int local98 = local84 + local88;
					for (@Pc(100) int local100 = 0; local100 < local56; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local52; local104++) {
							@Pc(110) float local110 = local58[local94];
							local94 += local35;
							@Pc(120) float local120 = local110 + local58[local94];
							@Pc(126) float local126 = local120 + local58[local98];
							local94 += local35;
							local98 += local35;
							@Pc(140) float local140 = local126 + local58[local98];
							local65[local92] = local140 * 0.25F;
							local98 += local35;
							local92 += local35;
						}
						local98 += local84;
						local94 += local84;
					}
				}
				local65 = local58;
				arg1 = local56;
				arg0 = local52;
				local58 = local86;
				local56 >>= 0x1;
				local52 >>= 0x1;
				local48 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public static void method5222() {
		Static159.method2586(Static244.aClass54_101);
		Static424.aClass2_Sub23_Sub2_1.method5449(0);
	}
}
