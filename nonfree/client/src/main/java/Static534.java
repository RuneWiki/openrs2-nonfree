import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public static final int anInt8991 = 1405;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII[FB)V")
	public static void method7726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5) {
		if (arg1 > 0 && !Static112.method1840(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static112.method1840(arg0)) {
			@Pc(31) int local31 = Static285.method6790(6408);
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg0 <= arg1 ? arg0 : arg1;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(54) float[] local54 = arg5;
			@Pc(61) float[] local61 = new float[local52 * local48 * local31];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg1, arg0, 0, 6408, 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg1 * local31;
				for (@Pc(94) int local94 = 0; local94 < local31; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(105) int local105 = local94 + local92;
					for (@Pc(107) int local107 = 0; local107 < local52; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local48; local111++) {
							@Pc(117) float local117 = local54[local100];
							local100 += local31;
							@Pc(127) float local127 = local117 + local54[local100];
							local100 += local31;
							@Pc(137) float local137 = local127 + local54[local105];
							local105 += local31;
							@Pc(147) float local147 = local137 + local54[local105];
							local61[local98] = local147 * 0.25F;
							local105 += local31;
							local98 += local31;
						}
						local105 += local92;
						local100 += local92;
					}
				}
				@Pc(191) float[] local191 = local61;
				local61 = local54;
				arg0 = local52;
				arg1 = local48;
				local54 = local191;
				local33++;
				local52 >>= 0x1;
				local48 >>= 0x1;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
