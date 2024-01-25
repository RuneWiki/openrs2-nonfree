import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "[[S")
	public static short[][] aShortArrayArray50;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	public static final int anInt5344 = 328;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([BIIIIII)V")
	public static void method4688(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static159.method2855(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static159.method2855(arg5)) {
			@Pc(33) int local33 = Static57.method1112(arg2);
			@Pc(35) int local35 = 0;
			@Pc(42) int local42 = arg5 <= arg4 ? arg5 : arg4;
			@Pc(51) int local51 = arg4 >> 1;
			@Pc(55) int local55 = arg5 >> 1;
			@Pc(57) byte[] local57 = arg0;
			@Pc(64) byte[] local64 = new byte[local51 * local55 * local33];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local35, arg3, arg4, arg5, 0, arg2, 5121, local57, 0);
				if (local42 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg4 * local33;
				@Pc(87) byte[] local87 = local64;
				for (@Pc(89) int local89 = 0; local89 < local33; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(100) int local100 = local89 + local85;
					for (@Pc(102) int local102 = 0; local102 < local55; local102++) {
						for (@Pc(106) int local106 = 0; local106 < local51; local106++) {
							@Pc(112) byte local112 = local57[local95];
							local95 += local33;
							@Pc(122) int local122 = local112 + local57[local95];
							local95 += local33;
							@Pc(132) int local132 = local122 + local57[local100];
							local100 += local33;
							@Pc(142) int local142 = local132 + local57[local100];
							local64[local93] = (byte) (local142 >> 2);
							local100 += local33;
							local93 += local33;
						}
						local100 += local85;
						local95 += local85;
					}
				}
				local64 = local57;
				arg4 = local51;
				local57 = local87;
				arg5 = local55;
				local51 >>= 0x1;
				local35++;
				local55 >>= 0x1;
				local42 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
