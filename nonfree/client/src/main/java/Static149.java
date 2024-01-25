import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	public static int anInt2680 = -1;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Z")
	public static boolean aBoolean194 = false;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III[BIII)V")
	public static void method2458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static220.method3379(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static220.method3379(arg4)) {
			@Pc(39) int local39 = Static7.method121(arg2);
			@Pc(41) int local41 = 0;
			@Pc(52) int local52 = arg1 < arg4 ? arg1 : arg4;
			@Pc(67) int local67 = arg1 >> 1;
			@Pc(71) int local71 = arg4 >> 1;
			@Pc(73) byte[] local73 = arg3;
			@Pc(80) byte[] local80 = new byte[local71 * local67 * local39];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local41, arg0, arg1, arg4, 0, arg2, 5121, local73, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(100) int local100 = local39 * arg1;
				for (@Pc(102) int local102 = 0; local102 < local39; local102++) {
					@Pc(106) int local106 = local102;
					@Pc(108) int local108 = local102;
					@Pc(112) int local112 = local100 + local102;
					for (@Pc(114) int local114 = 0; local114 < local71; local114++) {
						for (@Pc(118) int local118 = 0; local118 < local67; local118++) {
							@Pc(124) byte local124 = local73[local108];
							local108 += local39;
							@Pc(134) int local134 = local124 + local73[local108];
							@Pc(140) int local140 = local134 + local73[local112];
							local108 += local39;
							local112 += local39;
							@Pc(154) int local154 = local140 + local73[local112];
							local112 += local39;
							local80[local106] = (byte) (local154 >> 2);
							local106 += local39;
						}
						local108 += local100;
						local112 += local100;
					}
				}
				@Pc(203) byte[] local203 = local80;
				local80 = local73;
				arg4 = local71;
				local73 = local203;
				arg1 = local67;
				local41++;
				local71 >>= 0x1;
				local67 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
