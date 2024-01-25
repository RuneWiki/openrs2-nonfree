import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIBI[BI)V")
	public static void method7321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static457.method6641(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static457.method6641(arg3)) {
			@Pc(37) int local37 = Static582.method8098(arg5);
			@Pc(39) int local39 = 0;
			@Pc(47) int local47 = arg3 <= arg2 ? arg3 : arg2;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) byte[] local65 = arg4;
			@Pc(72) byte[] local72 = new byte[local37 * local51 * local63];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local39, arg1, arg2, arg3, 0, arg5, 5121, local65, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg2 * local37;
				@Pc(94) byte[] local94 = local72;
				for (@Pc(96) int local96 = 0; local96 < local37; local96++) {
					@Pc(102) int local102 = local96;
					@Pc(104) int local104 = local96;
					@Pc(108) int local108 = local92 + local96;
					for (@Pc(110) int local110 = 0; local110 < local63; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local51; local114++) {
							@Pc(122) byte local122 = local65[local104];
							local104 += local37;
							@Pc(132) int local132 = local122 + local65[local104];
							local104 += local37;
							@Pc(142) int local142 = local132 + local65[local108];
							local108 += local37;
							@Pc(152) int local152 = local142 + local65[local108];
							local108 += local37;
							local72[local102] = (byte) (local152 >> 2);
							local102 += local37;
						}
						local108 += local92;
						local104 += local92;
					}
				}
				local72 = local65;
				local65 = local94;
				arg2 = local51;
				arg3 = local63;
				local39++;
				local63 >>= 0x1;
				local51 >>= 0x1;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
