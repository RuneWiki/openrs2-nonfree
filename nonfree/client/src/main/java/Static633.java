import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!vga", name = "K", descriptor = "D")
	public static double aDouble34;

	@OriginalMember(owner = "client!vga", name = "G", descriptor = "Z")
	public static boolean aBoolean746 = false;

	@OriginalMember(owner = "client!vga", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray63 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIIIII[B)V")
	public static void method8798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg4 > 0 && !Static197.method3300(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static197.method3300(arg2)) {
			@Pc(41) int local41 = Static453.method6398(arg3);
			@Pc(43) int local43 = 0;
			@Pc(55) int local55 = arg4 >= arg2 ? arg2 : arg4;
			@Pc(59) int local59 = arg4 >> 1;
			@Pc(63) int local63 = arg2 >> 1;
			@Pc(65) byte[] local65 = arg5;
			@Pc(72) byte[] local72 = new byte[local41 * local59 * local63];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local43, arg0, arg4, arg2, 0, arg3, 5121, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(94) int local94 = arg4 * local41;
				for (@Pc(96) int local96 = 0; local96 < local41; local96++) {
					@Pc(102) int local102 = local96;
					@Pc(104) int local104 = local96;
					@Pc(108) int local108 = local94 + local96;
					for (@Pc(110) int local110 = 0; local110 < local63; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local59; local114++) {
							@Pc(122) byte local122 = local65[local104];
							local104 += local41;
							@Pc(132) int local132 = local122 + local65[local104];
							local104 += local41;
							@Pc(142) int local142 = local132 + local65[local108];
							local108 += local41;
							@Pc(152) int local152 = local142 + local65[local108];
							local108 += local41;
							local72[local102] = (byte) (local152 >> 2);
							local102 += local41;
						}
						local104 += local94;
						local108 += local94;
					}
				}
				@Pc(197) byte[] local197 = local72;
				local72 = local65;
				local65 = local197;
				arg4 = local59;
				arg2 = local63;
				local59 >>= 0x1;
				local63 >>= 0x1;
				local43++;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
