import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Lclient!qn;")
	public static Class291 aClass291_1;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public static int anInt4486 = 0;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
	public static int anInt4487 = 0;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public static int anInt4490 = 13156520;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII[F)V")
	public static void method4114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float[] arg5) {
		if (arg0 > 0 && !Static129.method2437(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static129.method2437(arg2)) {
			@Pc(32) int local32 = Static336.method5063(6408);
			@Pc(34) int local34 = 0;
			@Pc(41) int local41 = arg0 >= arg2 ? arg2 : arg0;
			@Pc(45) int local45 = arg0 >> 1;
			@Pc(49) int local49 = arg2 >> 1;
			@Pc(59) float[] local59 = arg5;
			@Pc(66) float[] local66 = new float[local32 * local49 * local45];
			while (true) {
				OpenGL.glTexImage2Df(3553, local34, 34842, arg0, arg2, 0, 6408, 5126, local59, 0);
				if (local41 <= 1) {
					return;
				}
				@Pc(85) int local85 = local32 * arg0;
				@Pc(87) float[] local87 = local66;
				for (@Pc(89) int local89 = 0; local89 < local32; local89++) {
					@Pc(92) int local92 = local89;
					@Pc(94) int local94 = local89;
					@Pc(98) int local98 = local85 + local89;
					for (@Pc(100) int local100 = 0; local100 < local49; local100++) {
						for (@Pc(103) int local103 = 0; local103 < local45; local103++) {
							@Pc(108) float local108 = local59[local94];
							local94 += local32;
							@Pc(118) float local118 = local108 + local59[local94];
							@Pc(124) float local124 = local118 + local59[local98];
							local94 += local32;
							local98 += local32;
							@Pc(138) float local138 = local124 + local59[local98];
							local66[local92] = local138 * 0.25F;
							local98 += local32;
							local92 += local32;
						}
						local98 += local85;
						local94 += local85;
					}
				}
				local66 = local59;
				arg2 = local49;
				local59 = local87;
				arg0 = local45;
				local34++;
				local45 >>= 0x1;
				local49 >>= 0x1;
				local41 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
	public static void method4115(@OriginalArg(0) int arg0) {
		Static30.anInt575 = -1;
		Static122.anInt2525 = 3;
		Static43.anInt1024 = 100;
		Static246.anInt4481 = arg0;
	}
}
