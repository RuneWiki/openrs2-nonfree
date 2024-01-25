import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString39 = null;

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "[I")
	public static final int[] anIntArray193 = new int[8];

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_45 = new Class241(6, 3);

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
	public static final int anInt3559 = 1403;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([IIIIIIII)V")
	public static void method3365(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 > 0 && !Static232.method4114(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static232.method4114(arg5)) {
			@Pc(47) int local47 = 0;
			@Pc(64) int local64 = arg5 <= arg2 ? arg5 : arg2;
			@Pc(68) int local68 = arg2 >> 1;
			@Pc(72) int local72 = arg5 >> 1;
			@Pc(74) int[] local74 = arg0;
			@Pc(79) int[] local79 = new int[local72 * local68];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local47, arg3, arg2, arg5, 0, 32993, arg4, local74, 0);
				if (local64 <= 1) {
					return;
				}
				@Pc(97) int local97 = 0;
				@Pc(99) int local99 = 0;
				@Pc(103) int local103 = arg2;
				@Pc(105) int[] local105 = local79;
				for (@Pc(107) int local107 = 0; local107 < local72; local107++) {
					for (@Pc(113) int local113 = 0; local113 < local68; local113++) {
						@Pc(122) int local122 = local74[local99++];
						@Pc(127) int local127 = local74[local99++];
						@Pc(132) int local132 = local74[local103++];
						@Pc(137) int local137 = local74[local103++];
						@Pc(143) int local143 = local122 >> 24 & 0xFF;
						@Pc(149) int local149 = local122 >> 8 & 0xFF;
						@Pc(155) int local155 = local122 >> 16 & 0xFF;
						@Pc(159) int local159 = local122 & 0xFF;
						@Pc(167) int local167 = local155 + (local127 >> 16 & 0xFF);
						@Pc(175) int local175 = local143 + (local127 >> 24 & 0xFF);
						@Pc(181) int local181 = local159 + (local127 & 0xFF);
						@Pc(189) int local189 = local149 + (local127 >> 8 & 0xFF);
						@Pc(197) int local197 = local189 + (local132 >> 8 & 0xFF);
						@Pc(205) int local205 = local175 + (local132 >> 24 & 0xFF);
						@Pc(211) int local211 = local181 + (local132 & 0xFF);
						@Pc(219) int local219 = local167 + (local132 >> 16 & 0xFF);
						@Pc(227) int local227 = local197 + (local137 >> 8 & 0xFF);
						@Pc(235) int local235 = local219 + (local137 >> 16 & 0xFF);
						@Pc(241) int local241 = local211 + (local137 & 0xFF);
						@Pc(249) int local249 = local205 + (local137 >> 24 & 0xFF);
						local79[local97++] = local241 >> 2 & 0xFF | (local227 & 0x3FC) << 6 | (local235 & 0x3FC) << 14 | (local249 & 0x3FC) << 22;
					}
					local99 += arg2;
					local103 += arg2;
				}
				local79 = local74;
				arg5 = local72;
				arg2 = local68;
				local74 = local105;
				local72 >>= 0x1;
				local47++;
				local68 >>= 0x1;
				local64 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
