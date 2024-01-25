import jaggl.OpenGL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "Lclient!hs;")
	public static final Class162 aClass162_11 = new Class162("", 16);

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V")
	public static void method7883() {
		if (Static548.aClass59_10 != Static543.aClass59_9) {
			try {
				Static698.method8237(Static105.aClient4, "tbrefresh");
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III[FIII)V")
	public static void method7887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static670.method9288(107, arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static670.method9288(85, arg0)) {
			@Pc(43) int local43 = Static492.method7404(6408);
			@Pc(45) int local45 = 0;
			@Pc(53) int local53 = arg4 < arg0 ? arg4 : arg0;
			@Pc(57) int local57 = arg4 >> 1;
			@Pc(61) int local61 = arg0 >> 1;
			@Pc(63) float[] local63 = arg2;
			@Pc(70) float[] local70 = new float[local43 * local57 * local61];
			while (true) {
				OpenGL.glTexImage2Df(3553, local45, 34842, arg4, arg0, 0, 6408, 5126, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(92) int local92 = local43 * arg4;
				@Pc(94) float[] local94 = local70;
				for (@Pc(96) int local96 = 0; local96 < local43; local96++) {
					@Pc(99) int local99 = local96;
					@Pc(101) int local101 = local96;
					@Pc(106) int local106 = local96 + local92;
					for (@Pc(108) int local108 = 0; local108 < local61; local108++) {
						for (@Pc(111) int local111 = 0; local111 < local57; local111++) {
							@Pc(116) float local116 = local63[local101];
							local101 += local43;
							@Pc(126) float local126 = local116 + local63[local101];
							@Pc(132) float local132 = local126 + local63[local106];
							local101 += local43;
							local106 += local43;
							@Pc(146) float local146 = local132 + local63[local106];
							local106 += local43;
							local70[local99] = local146 * 0.25F;
							local99 += local43;
						}
						local106 += local92;
						local101 += local92;
					}
				}
				local70 = local63;
				arg0 = local61;
				local63 = local94;
				arg4 = local57;
				local61 >>= 0x1;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local45++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
