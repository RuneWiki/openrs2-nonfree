import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Z")
	public static boolean aBoolean276;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II[IIIIII)V")
	public static void method2876(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 > 0 && !Static298.method3895(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static298.method3895(arg4)) {
			@Pc(42) int local42 = 0;
			@Pc(53) int local53 = arg4 <= arg2 ? arg4 : arg2;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(61) int local61 = arg4 >> 1;
			@Pc(63) int[] local63 = arg1;
			@Pc(68) int[] local68 = new int[local57 * local61];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local42, arg5, arg2, arg4, 0, 32993, arg3, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(90) int local90 = 0;
				@Pc(92) int local92 = 0;
				@Pc(96) int local96 = arg2;
				@Pc(98) int[] local98 = local68;
				for (@Pc(100) int local100 = 0; local100 < local61; local100++) {
					for (@Pc(104) int local104 = 0; local104 < local57; local104++) {
						@Pc(111) int local111 = local63[local92++];
						@Pc(116) int local116 = local63[local92++];
						@Pc(121) int local121 = local63[local96++];
						@Pc(125) int local125 = local111 & 0xFF;
						@Pc(131) int local131 = local111 >> 8 & 0xFF;
						@Pc(136) int local136 = local63[local96++];
						@Pc(142) int local142 = local111 >> 16 & 0xFF;
						@Pc(148) int local148 = local111 >> 24 & 0xFF;
						@Pc(154) int local154 = local125 + (local116 & 0xFF);
						@Pc(162) int local162 = local142 + (local116 >> 16 & 0xFF);
						@Pc(170) int local170 = local148 + (local116 >> 24 & 0xFF);
						@Pc(178) int local178 = local131 + (local116 >> 8 & 0xFF);
						@Pc(186) int local186 = local170 + (local121 >> 24 & 0xFF);
						@Pc(192) int local192 = local154 + (local121 & 0xFF);
						@Pc(200) int local200 = local178 + (local121 >> 8 & 0xFF);
						@Pc(208) int local208 = local162 + (local121 >> 16 & 0xFF);
						@Pc(216) int local216 = local200 + (local136 >> 8 & 0xFF);
						@Pc(222) int local222 = local192 + (local136 & 0xFF);
						@Pc(230) int local230 = local208 + (local136 >> 16 & 0xFF);
						@Pc(238) int local238 = local186 + (local136 >> 24 & 0xFF);
						local68[local90++] = (local216 & 0x3FC) << 6 | local230 << 14 & 0xFF0000 | (local238 & 0x3FC) << 22 | local222 >> 2 & 0xFF;
					}
					local96 += arg2;
					local92 += arg2;
				}
				local68 = local63;
				arg4 = local61;
				arg2 = local57;
				local63 = local98;
				local61 >>= 0x1;
				local42++;
				local53 >>= 0x1;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
