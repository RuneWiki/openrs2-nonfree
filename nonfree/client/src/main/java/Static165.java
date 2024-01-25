import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "[I")
	public static final int[] anIntArray178 = new int[14];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[BIIIII)V")
	public static void method2543(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static119.method2029(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static119.method2029(arg0)) {
			@Pc(34) int local34 = Static287.method4939(arg3);
			@Pc(36) int local36 = 0;
			@Pc(58) int local58 = arg0 > arg2 ? arg2 : arg0;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(66) int local66 = arg0 >> 1;
			@Pc(68) byte[] local68 = arg1;
			@Pc(75) byte[] local75 = new byte[local34 * local62 * local66];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local36, arg5, arg2, arg0, 0, arg3, 5121, local68, 0);
				if (local58 <= 1) {
					return;
				}
				@Pc(94) int local94 = arg2 * local34;
				for (@Pc(96) int local96 = 0; local96 < local34; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local96 + local94;
					for (@Pc(108) int local108 = 0; local108 < local66; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local62; local112++) {
							@Pc(118) byte local118 = local68[local102];
							local102 += local34;
							@Pc(128) int local128 = local118 + local68[local102];
							@Pc(134) int local134 = local128 + local68[local106];
							local102 += local34;
							local106 += local34;
							@Pc(148) int local148 = local134 + local68[local106];
							local75[local100] = (byte) (local148 >> 2);
							local106 += local34;
							local100 += local34;
						}
						local106 += local94;
						local102 += local94;
					}
				}
				@Pc(189) byte[] local189 = local75;
				local75 = local68;
				arg2 = local62;
				local68 = local189;
				arg0 = local66;
				local66 >>= 0x1;
				local62 >>= 0x1;
				local58 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
