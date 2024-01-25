import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!nba", name = "s", descriptor = "Lclient!ao;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!nba", name = "y", descriptor = "I")
	public static int anInt6285;

	@OriginalMember(owner = "client!nba", name = "r", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "(B)V")
	public static void method5069() {
		Static32.aClass342_54.method7687();
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[BIIIII)V")
	public static void method5070(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 > 0 && !Static249.method6960(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static249.method6960(arg5)) {
			@Pc(34) int local34 = Static341.method4969(arg4);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg5 <= arg3 ? arg5 : arg3;
			@Pc(51) int local51 = arg3 >> 1;
			@Pc(59) int local59 = arg5 >> 1;
			@Pc(61) byte[] local61 = arg1;
			@Pc(68) byte[] local68 = new byte[local51 * local59 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local36, arg0, arg3, arg5, 0, arg4, 5121, local61, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg3 * local34;
				@Pc(91) byte[] local91 = local68;
				for (@Pc(93) int local93 = 0; local93 < local34; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(103) int local103 = local93 + local89;
					for (@Pc(105) int local105 = 0; local105 < local59; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local51; local109++) {
							@Pc(115) byte local115 = local61[local99];
							local99 += local34;
							@Pc(125) int local125 = local115 + local61[local99];
							local99 += local34;
							@Pc(135) int local135 = local125 + local61[local103];
							local103 += local34;
							@Pc(145) int local145 = local135 + local61[local103];
							local68[local97] = (byte) (local145 >> 2);
							local103 += local34;
							local97 += local34;
						}
						local103 += local89;
						local99 += local89;
					}
				}
				local68 = local61;
				local61 = local91;
				arg3 = local51;
				arg5 = local59;
				local36++;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "(III)V")
	public static void method5071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub10 local12 = Static129.method2403(Static452.aClass353_2, Static344.aClass287_101);
		local12.aClass3_Sub26_Sub1_1.method6803(arg1);
		local12.aClass3_Sub26_Sub1_1.method6820(arg0);
		Static193.method3398(local12);
	}
}
