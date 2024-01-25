import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	public static int anInt9007;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "Z")
	public static boolean aBoolean681 = false;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!qv;")
	public static final Class271 aClass271_9 = new Class271(1, 1);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II[FIIII)V")
	public static void method7567(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static85.method1890(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static85.method1890(arg2)) {
			@Pc(31) int local31 = Static498.method7458(6408);
			@Pc(33) int local33 = 0;
			@Pc(48) int local48 = arg2 > arg4 ? arg4 : arg2;
			@Pc(52) int local52 = arg4 >> 1;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(58) float[] local58 = arg1;
			@Pc(65) float[] local65 = new float[local52 * local56 * local31];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg4, arg2, 0, 6408, 5126, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(86) int local86 = local31 * arg4;
				for (@Pc(88) int local88 = 0; local88 < local31; local88++) {
					@Pc(92) int local92 = local88;
					@Pc(94) int local94 = local88;
					@Pc(98) int local98 = local86 + local88;
					for (@Pc(100) int local100 = 0; local100 < local56; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local52; local104++) {
							@Pc(110) float local110 = local58[local94];
							local94 += local31;
							@Pc(120) float local120 = local110 + local58[local94];
							local94 += local31;
							@Pc(130) float local130 = local120 + local58[local98];
							local98 += local31;
							@Pc(140) float local140 = local130 + local58[local98];
							local65[local92] = local140 * 0.25F;
							local98 += local31;
							local92 += local31;
						}
						local94 += local86;
						local98 += local86;
					}
				}
				@Pc(176) float[] local176 = local65;
				local65 = local58;
				local58 = local176;
				arg2 = local56;
				arg4 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local56 >>= 0x1;
				local33++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
