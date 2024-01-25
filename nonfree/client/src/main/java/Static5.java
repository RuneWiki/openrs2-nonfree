import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "Xc", descriptor = "Lclient!ec;")
	public static final Class88 aClass88_1 = new Class88(2);

	@OriginalMember(owner = "client!ac", name = "kd", descriptor = "Lclient!qfa;")
	public static final Class269 aClass269_1 = new Class269("", 11);

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)Z")
	public static boolean method153(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[FIIIIB)V")
	public static void method157(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 > 0 && !Static19.method380(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static19.method380(arg0)) {
			@Pc(34) int local34 = Static288.method4279(6408);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg2 >= arg0 ? arg0 : arg2;
			@Pc(47) int local47 = arg2 >> 1;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(53) float[] local53 = arg1;
			@Pc(60) float[] local60 = new float[local47 * local51 * local34];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg2, arg0, 0, 6408, 5126, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(80) int local80 = arg2 * local34;
				for (@Pc(82) int local82 = 0; local82 < local34; local82++) {
					@Pc(86) int local86 = local82;
					@Pc(88) int local88 = local82;
					@Pc(92) int local92 = local82 + local80;
					for (@Pc(94) int local94 = 0; local94 < local51; local94++) {
						for (@Pc(98) int local98 = 0; local98 < local47; local98++) {
							@Pc(104) float local104 = local53[local88];
							local88 += local34;
							@Pc(114) float local114 = local104 + local53[local88];
							@Pc(120) float local120 = local114 + local53[local92];
							local88 += local34;
							local92 += local34;
							@Pc(134) float local134 = local120 + local53[local92];
							local92 += local34;
							local60[local86] = local134 * 0.25F;
							local86 += local34;
						}
						local92 += local80;
						local88 += local80;
					}
				}
				@Pc(182) float[] local182 = local60;
				local60 = local53;
				arg2 = local47;
				local53 = local182;
				arg0 = local51;
				local43 >>= 0x1;
				local51 >>= 0x1;
				local36++;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
