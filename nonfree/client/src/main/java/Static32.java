import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII[I)V")
	public static void method731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg0 > 0 && !Static608.method8539(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static608.method8539(arg1)) {
			@Pc(45) int local45 = 0;
			@Pc(56) int local56 = arg1 <= arg0 ? arg1 : arg0;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(64) int local64 = arg1 >> 1;
			@Pc(66) int[] local66 = arg5;
			@Pc(83) int[] local83 = new int[local64 * local60];
			while (true) {
				OpenGL.glTexImage2Di(arg4, local45, arg3, arg0, arg1, 0, 32993, arg2, local66, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(101) int local101 = 0;
				@Pc(103) int local103 = 0;
				@Pc(108) int local108 = arg0;
				@Pc(110) int[] local110 = local83;
				for (@Pc(112) int local112 = 0; local112 < local64; local112++) {
					for (@Pc(115) int local115 = 0; local115 < local60; local115++) {
						@Pc(121) int local121 = local66[local103++];
						@Pc(126) int local126 = local66[local103++];
						@Pc(131) int local131 = local66[local108++];
						@Pc(136) int local136 = local66[local108++];
						@Pc(142) int local142 = local121 >> 24 & 0xFF;
						@Pc(148) int local148 = local121 >> 8 & 0xFF;
						@Pc(152) int local152 = local121 & 0xFF;
						@Pc(158) int local158 = local121 >> 16 & 0xFF;
						@Pc(166) int local166 = local158 + (local126 >> 16 & 0xFF);
						@Pc(174) int local174 = local148 + (local126 >> 8 & 0xFF);
						@Pc(182) int local182 = local142 + (local126 >> 24 & 0xFF);
						@Pc(188) int local188 = local152 + (local126 & 0xFF);
						@Pc(196) int local196 = local182 + (local131 >> 24 & 0xFF);
						@Pc(202) int local202 = local188 + (local131 & 0xFF);
						@Pc(210) int local210 = local166 + (local131 >> 16 & 0xFF);
						@Pc(218) int local218 = local174 + (local131 >> 8 & 0xFF);
						@Pc(226) int local226 = local196 + (local136 >> 24 & 0xFF);
						@Pc(234) int local234 = local218 + (local136 >> 8 & 0xFF);
						@Pc(242) int local242 = local210 + (local136 >> 16 & 0xFF);
						@Pc(248) int local248 = local202 + (local136 & 0xFF);
						local83[local101++] = (local226 & 0x3FC) << 22 | local242 << 14 & 0xFF0000 | (local234 & 0x3FC) << 6 | local248 >> 2 & 0xFF;
					}
					local103 += arg0;
					local108 += arg0;
				}
				local83 = local66;
				local66 = local110;
				arg0 = local60;
				arg1 = local64;
				local45++;
				local60 >>= 0x1;
				local56 >>= 0x1;
				local64 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
