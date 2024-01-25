import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!ke;")
	public static final Class199 aClass199_9 = new Class199();

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BIIIIII)V")
	public static void method6102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static670.method9288(93, arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static670.method9288(114, arg4)) {
			@Pc(41) int local41 = Static492.method7404(arg3);
			@Pc(48) int local48 = 0;
			@Pc(56) int local56 = arg5 < arg4 ? arg5 : arg4;
			@Pc(60) int local60 = arg5 >> 1;
			@Pc(64) int local64 = arg4 >> 1;
			@Pc(66) byte[] local66 = arg0;
			@Pc(73) byte[] local73 = new byte[local41 * local64 * local60];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local48, arg2, arg5, arg4, 0, arg3, 5121, local66, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(93) int local93 = local41 * arg5;
				@Pc(95) byte[] local95 = local73;
				for (@Pc(97) int local97 = 0; local97 < local41; local97++) {
					@Pc(100) int local100 = local97;
					@Pc(102) int local102 = local97;
					@Pc(106) int local106 = local93 + local97;
					for (@Pc(108) int local108 = 0; local108 < local64; local108++) {
						for (@Pc(111) int local111 = 0; local111 < local60; local111++) {
							@Pc(116) byte local116 = local66[local102];
							local102 += local41;
							@Pc(126) int local126 = local116 + local66[local102];
							@Pc(132) int local132 = local126 + local66[local106];
							local102 += local41;
							local106 += local41;
							@Pc(146) int local146 = local132 + local66[local106];
							local73[local100] = (byte) (local146 >> 2);
							local106 += local41;
							local100 += local41;
						}
						local102 += local93;
						local106 += local93;
					}
				}
				local73 = local66;
				local66 = local95;
				arg5 = local60;
				arg4 = local64;
				local56 >>= 0x1;
				local48++;
				local60 >>= 0x1;
				local64 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
