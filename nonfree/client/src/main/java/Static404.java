import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_108 = new Class90(48, 0);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIII)V")
	public static void method6134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class116 local9 = Static347.aClass116ArrayArray1[arg0][arg1];
		Static515.method3256(local9 == null ? Static308.aClass116_2 : local9, arg2);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Z")
	public static boolean method6136(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[FIIII)V")
	public static void method6137(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static32.method1002(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static32.method1002(arg2)) {
			@Pc(34) int local34 = Static305.method4825(6408);
			@Pc(36) int local36 = 0;
			@Pc(51) int local51 = arg2 <= arg3 ? arg2 : arg3;
			@Pc(55) int local55 = arg3 >> 1;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(61) float[] local61 = arg1;
			@Pc(68) float[] local68 = new float[local34 * local59 * local55];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg3, arg2, 0, 6408, 5126, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg3 * local34;
				for (@Pc(91) int local91 = 0; local91 < local34; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local89 + local91;
					for (@Pc(103) int local103 = 0; local103 < local59; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local55; local107++) {
							@Pc(113) float local113 = local61[local97];
							local97 += local34;
							@Pc(123) float local123 = local113 + local61[local97];
							@Pc(129) float local129 = local123 + local61[local101];
							local97 += local34;
							local101 += local34;
							@Pc(143) float local143 = local129 + local61[local101];
							local68[local95] = local143 * 0.25F;
							local101 += local34;
							local95 += local34;
						}
						local97 += local89;
						local101 += local89;
					}
				}
				@Pc(179) float[] local179 = local68;
				local68 = local61;
				arg2 = local59;
				arg3 = local55;
				local61 = local179;
				local55 >>= 0x1;
				local51 >>= 0x1;
				local36++;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
	public static void method6138() {
		Static365.aClass4_Sub21_Sub4_6.method6175();
		Static132.aClass4_Sub21_Sub4_1 = null;
		Static221.aClass348_16 = null;
		Static491.anInt9287 = 1;
	}
}
