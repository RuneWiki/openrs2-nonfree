import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "Lclient!rg;")
	public static Class2_Sub43 aClass2_Sub43_2;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_45 = new Class269(38, 3);

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
	public static int anInt4525 = 0;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "Lclient!dm;")
	public static Class78 aClass78_7 = null;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
	public static int anInt4531 = 0;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([FIIIIII)V")
	public static void method3742(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static504.method7825(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static504.method7825(arg1)) {
			@Pc(32) int local32 = Static131.method2560(6408);
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg1 <= arg2 ? arg1 : arg2;
			@Pc(54) int local54 = arg2 >> 1;
			@Pc(58) int local58 = arg1 >> 1;
			@Pc(60) float[] local60 = arg0;
			@Pc(67) float[] local67 = new float[local32 * local54 * local58];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg2, arg1, 0, 6408, 5126, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(87) int local87 = arg2 * local32;
				@Pc(89) float[] local89 = local67;
				for (@Pc(91) int local91 = 0; local91 < local32; local91++) {
					@Pc(94) int local94 = local91;
					@Pc(96) int local96 = local91;
					@Pc(101) int local101 = local91 + local87;
					for (@Pc(103) int local103 = 0; local103 < local58; local103++) {
						for (@Pc(106) int local106 = 0; local106 < local54; local106++) {
							@Pc(111) float local111 = local60[local96];
							local96 += local32;
							@Pc(121) float local121 = local111 + local60[local96];
							local96 += local32;
							@Pc(131) float local131 = local121 + local60[local101];
							local101 += local32;
							@Pc(141) float local141 = local131 + local60[local101];
							local101 += local32;
							local67[local94] = local141 * 0.25F;
							local94 += local32;
						}
						local101 += local87;
						local96 += local87;
					}
				}
				local67 = local60;
				local60 = local89;
				arg1 = local58;
				arg2 = local54;
				local54 >>= 0x1;
				local58 >>= 0x1;
				local50 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	public static void method3746() {
		Static316.aClass6_24 = null;
		Static244.anInt4841 = -1;
		Static318.anInt5776 = -1;
		Static491.anInt8363 = -1;
		Static594.anInt9790 = -1;
		Static167.aClass87_3 = null;
		Static315.anIntArray429 = null;
		Static581.aClass6_36 = null;
		Static258.aClass6_38 = null;
		Static401.anInterface24_1 = null;
		Static5.anInterface24Array1 = null;
		Static275.aClass329_3.method7691();
	}
}
