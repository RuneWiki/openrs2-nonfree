import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII[FI)V")
	public static void method4251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static413.method8723(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static413.method8723(arg1)) {
			@Pc(31) int local31 = Static646.method9053(6408);
			@Pc(33) int local33 = 0;
			@Pc(40) int local40 = arg1 <= arg3 ? arg1 : arg3;
			@Pc(44) int local44 = arg3 >> 1;
			@Pc(52) int local52 = arg1 >> 1;
			@Pc(54) float[] local54 = arg4;
			@Pc(61) float[] local61 = new float[local52 * local44 * local31];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg3, arg1, 0, 6408, 5126, local54, 0);
				if (local40 <= 1) {
					return;
				}
				@Pc(80) int local80 = local31 * arg3;
				for (@Pc(82) int local82 = 0; local82 < local31; local82++) {
					@Pc(86) int local86 = local82;
					@Pc(88) int local88 = local82;
					@Pc(92) int local92 = local82 + local80;
					for (@Pc(94) int local94 = 0; local94 < local52; local94++) {
						for (@Pc(98) int local98 = 0; local98 < local44; local98++) {
							@Pc(104) float local104 = local54[local88];
							local88 += local31;
							@Pc(114) float local114 = local104 + local54[local88];
							@Pc(120) float local120 = local114 + local54[local92];
							local88 += local31;
							local92 += local31;
							@Pc(134) float local134 = local120 + local54[local92];
							local61[local86] = local134 * 0.25F;
							local92 += local31;
							local86 += local31;
						}
						local92 += local80;
						local88 += local80;
					}
				}
				@Pc(174) float[] local174 = local61;
				local61 = local54;
				arg3 = local44;
				arg1 = local52;
				local54 = local174;
				local44 >>= 0x1;
				local33++;
				local40 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	public static void method4252() {
		Static45.method794();
	}
}
