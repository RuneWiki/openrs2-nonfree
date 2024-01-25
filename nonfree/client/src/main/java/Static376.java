import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
	public static int anInt6324 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "([IIIIIIII)V")
	public static void method5009(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static147.method2135(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static147.method2135(arg1)) {
			@Pc(43) int local43 = 0;
			@Pc(54) int local54 = arg3 >= arg1 ? arg1 : arg3;
			@Pc(58) int local58 = arg3 >> 1;
			@Pc(62) int local62 = arg1 >> 1;
			@Pc(69) int[] local69 = arg0;
			@Pc(74) int[] local74 = new int[local58 * local62];
			while (true) {
				OpenGL.glTexImage2Di(arg4, local43, arg5, arg3, arg1, 0, 32993, arg2, local69, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(90) int local90 = 0;
				@Pc(92) int local92 = 0;
				@Pc(97) int local97 = arg3;
				for (@Pc(99) int local99 = 0; local99 < local62; local99++) {
					for (@Pc(103) int local103 = 0; local103 < local58; local103++) {
						@Pc(110) int local110 = local69[local92++];
						@Pc(115) int local115 = local69[local92++];
						@Pc(120) int local120 = local69[local97++];
						@Pc(126) int local126 = local110 >> 8 & 0xFF;
						@Pc(131) int local131 = local69[local97++];
						@Pc(137) int local137 = local110 >> 16 & 0xFF;
						@Pc(143) int local143 = local110 >> 24 & 0xFF;
						@Pc(147) int local147 = local110 & 0xFF;
						@Pc(155) int local155 = local137 + (local115 >> 16 & 0xFF);
						@Pc(163) int local163 = local143 + (local115 >> 24 & 0xFF);
						@Pc(171) int local171 = local126 + (local115 >> 8 & 0xFF);
						@Pc(177) int local177 = local147 + (local115 & 0xFF);
						@Pc(185) int local185 = local163 + (local120 >> 24 & 0xFF);
						@Pc(193) int local193 = local171 + (local120 >> 8 & 0xFF);
						@Pc(201) int local201 = local155 + (local120 >> 16 & 0xFF);
						@Pc(207) int local207 = local177 + (local120 & 0xFF);
						@Pc(213) int local213 = local207 + (local131 & 0xFF);
						@Pc(221) int local221 = local201 + (local131 >> 16 & 0xFF);
						@Pc(229) int local229 = local193 + (local131 >> 8 & 0xFF);
						@Pc(237) int local237 = local185 + (local131 >> 24 & 0xFF);
						local74[local90++] = local213 >> 2 & 0xFF | (local229 & 0x3FC) << 6 | (local221 & 0x3FC) << 14 | (local237 & 0x3FC) << 22;
					}
					local92 += arg3;
					local97 += arg3;
				}
				@Pc(286) int[] local286 = local74;
				local74 = local69;
				local69 = local286;
				arg3 = local58;
				arg1 = local62;
				local54 >>= 0x1;
				local43++;
				local58 >>= 0x1;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!um;Lclient!um;)V")
	public static void method5013(@OriginalArg(1) Class243 arg0, @OriginalArg(2) Class243 arg1) {
		Static279.aClass243_152 = arg1;
		Static265.aClass243_144 = arg0;
	}
}
