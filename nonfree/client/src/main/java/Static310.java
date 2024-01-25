import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!kga", name = "M", descriptor = "Lclient!bo;")
	public static Class6_Sub2_Sub2 aClass6_Sub2_Sub2_1 = null;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III[BIII)V")
	public static void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static232.method4114(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static232.method4114(arg5)) {
			@Pc(43) int local43 = Static8.method111(arg3);
			@Pc(45) int local45 = 0;
			@Pc(53) int local53 = arg5 > arg0 ? arg0 : arg5;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(61) int local61 = arg5 >> 1;
			@Pc(70) byte[] local70 = arg2;
			@Pc(77) byte[] local77 = new byte[local43 * local61 * local57];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local45, arg1, arg0, arg5, 0, arg3, 5121, local70, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(99) int local99 = local43 * arg0;
				@Pc(101) byte[] local101 = local77;
				for (@Pc(103) int local103 = 0; local103 < local43; local103++) {
					@Pc(109) int local109 = local103;
					@Pc(111) int local111 = local103;
					@Pc(115) int local115 = local103 + local99;
					for (@Pc(117) int local117 = 0; local117 < local61; local117++) {
						for (@Pc(121) int local121 = 0; local121 < local57; local121++) {
							@Pc(129) byte local129 = local70[local111];
							local111 += local43;
							@Pc(139) int local139 = local129 + local70[local111];
							@Pc(145) int local145 = local139 + local70[local115];
							local111 += local43;
							local115 += local43;
							@Pc(159) int local159 = local145 + local70[local115];
							local77[local109] = (byte) (local159 >> 2);
							local115 += local43;
							local109 += local43;
						}
						local115 += local99;
						local111 += local99;
					}
				}
				local77 = local70;
				arg0 = local57;
				local70 = local101;
				arg5 = local61;
				local45++;
				local53 >>= 0x1;
				local61 >>= 0x1;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
