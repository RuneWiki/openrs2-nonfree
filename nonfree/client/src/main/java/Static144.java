import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!er", name = "H", descriptor = "I")
	public static int anInt2713;

	@OriginalMember(owner = "client!er", name = "y", descriptor = "I")
	public static int anInt2708 = -1;

	@OriginalMember(owner = "client!er", name = "B", descriptor = "I")
	public static int anInt2710 = -1;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I[BILclient!fc;)Lclient!oga;")
	public static Class261 method2522(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class101_Sub1_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(18) int local18 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local18);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static647.anIntArray583, 0);
		if (Static647.anIntArray583[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class261(arg1, 34336, local18);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II[FIIZI)V")
	public static void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static100.method1457(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static100.method1457(arg5)) {
			@Pc(37) int local37 = Static36.method624(6408);
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg5 <= arg3 ? arg5 : arg3;
			@Pc(54) int local54 = arg3 >> 1;
			@Pc(58) int local58 = arg5 >> 1;
			@Pc(60) float[] local60 = arg2;
			@Pc(67) float[] local67 = new float[local58 * local54 * local37];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg3, arg5, 0, 6408, 5126, local60, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(87) int local87 = local37 * arg3;
				@Pc(89) float[] local89 = local67;
				for (@Pc(91) int local91 = 0; local91 < local37; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local87 + local91;
					for (@Pc(103) int local103 = 0; local103 < local58; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local54; local107++) {
							@Pc(113) float local113 = local60[local97];
							local97 += local37;
							@Pc(123) float local123 = local113 + local60[local97];
							local97 += local37;
							@Pc(133) float local133 = local123 + local60[local101];
							local101 += local37;
							@Pc(143) float local143 = local133 + local60[local101];
							local67[local95] = local143 * 0.25F;
							local101 += local37;
							local95 += local37;
						}
						local101 += local87;
						local97 += local87;
					}
				}
				local67 = local60;
				arg5 = local58;
				local60 = local89;
				arg3 = local54;
				local58 >>= 0x1;
				local39++;
				local46 >>= 0x1;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Z")
	public static boolean method2525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
