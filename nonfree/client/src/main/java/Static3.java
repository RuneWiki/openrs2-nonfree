import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
	public static int anInt49;

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
	public static int anInt50;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII[II)V")
	public static void method33(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (arg0 > 0 && !Static280.method3692(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static280.method3692(arg3)) {
			@Pc(42) int local42 = 0;
			@Pc(53) int local53 = arg0 >= arg3 ? arg3 : arg0;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(61) int local61 = arg3 >> 1;
			@Pc(63) int[] local63 = arg5;
			@Pc(80) int[] local80 = new int[local57 * local61];
			while (true) {
				OpenGL.glTexImage2Di(arg4, local42, arg2, arg0, arg3, 0, 32993, arg1, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(97) int local97 = 0;
				@Pc(99) int local99 = 0;
				@Pc(103) int local103 = arg0;
				for (@Pc(105) int local105 = 0; local105 < local61; local105++) {
					for (@Pc(109) int local109 = 0; local109 < local57; local109++) {
						@Pc(116) int local116 = local63[local99++];
						@Pc(121) int local121 = local63[local103++];
						@Pc(126) int local126 = local63[local99++];
						@Pc(132) int local132 = local116 >> 16 & 0xFF;
						@Pc(136) int local136 = local116 & 0xFF;
						@Pc(141) int local141 = local63[local103++];
						@Pc(147) int local147 = local116 >> 24 & 0xFF;
						@Pc(153) int local153 = local116 >> 8 & 0xFF;
						@Pc(161) int local161 = local147 + (local126 >> 24 & 0xFF);
						@Pc(169) int local169 = local153 + (local126 >> 8 & 0xFF);
						@Pc(177) int local177 = local132 + (local126 >> 16 & 0xFF);
						@Pc(183) int local183 = local136 + (local126 & 0xFF);
						@Pc(191) int local191 = local169 + (local121 >> 8 & 0xFF);
						@Pc(197) int local197 = local183 + (local121 & 0xFF);
						@Pc(205) int local205 = local161 + (local121 >> 24 & 0xFF);
						@Pc(213) int local213 = local177 + (local121 >> 16 & 0xFF);
						@Pc(219) int local219 = local197 + (local141 & 0xFF);
						@Pc(227) int local227 = local191 + (local141 >> 8 & 0xFF);
						@Pc(235) int local235 = local213 + (local141 >> 16 & 0xFF);
						@Pc(243) int local243 = local205 + (local141 >> 24 & 0xFF);
						local80[local97++] = local219 >> 2 & 0xFF | (local227 & 0x3FC) << 6 | (local235 & 0x3FC) << 14 | (local243 & 0x3FC) << 22;
					}
					local99 += arg0;
					local103 += arg0;
				}
				@Pc(296) int[] local296 = local80;
				local80 = local63;
				arg3 = local61;
				local63 = local296;
				arg0 = local57;
				local53 >>= 0x1;
				local57 >>= 0x1;
				local61 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V")
	public static void method34(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub2_Sub17 local13 = Static34.method1709(11, arg0);
		local13.method5523();
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
	public static void method35() {
		Static363.anInt5531 = -1;
		Static387.anInt6335 = 0;
		Static25.anInt375 = -1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILclient!e;Lclient!e;)V")
	public static void method36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub5 arg3, @OriginalArg(4) Class8_Sub5 arg4) {
		@Pc(4) Class75 local4 = Static371.method4772(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass8_Sub5_2 = arg3;
			local4.aClass8_Sub5_1 = arg4;
		}
	}
}
