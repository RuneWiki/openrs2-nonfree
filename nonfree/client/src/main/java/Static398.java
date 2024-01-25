import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
	public static int anInt7032 = 0;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([BIIIZII)V")
	public static void method5864(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static392.method5808(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static392.method5808(arg2)) {
			@Pc(31) int local31 = Static172.method2654(arg4);
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg5 >= arg2 ? arg2 : arg5;
			@Pc(56) int local56 = arg5 >> 1;
			@Pc(60) int local60 = arg2 >> 1;
			@Pc(62) byte[] local62 = arg0;
			@Pc(69) byte[] local69 = new byte[local31 * local60 * local56];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local33, arg1, arg5, arg2, 0, arg4, 5121, local62, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(88) int local88 = arg5 * local31;
				for (@Pc(90) int local90 = 0; local90 < local31; local90++) {
					@Pc(94) int local94 = local90;
					@Pc(96) int local96 = local90;
					@Pc(101) int local101 = local90 + local88;
					for (@Pc(103) int local103 = 0; local103 < local60; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local56; local107++) {
							@Pc(113) byte local113 = local62[local96];
							local96 += local31;
							@Pc(123) int local123 = local113 + local62[local96];
							@Pc(129) int local129 = local123 + local62[local101];
							local96 += local31;
							local101 += local31;
							@Pc(143) int local143 = local129 + local62[local101];
							local69[local94] = (byte) (local143 >> 2);
							local101 += local31;
							local94 += local31;
						}
						local96 += local88;
						local101 += local88;
					}
				}
				@Pc(184) byte[] local184 = local69;
				local69 = local62;
				local62 = local184;
				arg5 = local56;
				arg2 = local60;
				local33++;
				local44 >>= 0x1;
				local60 >>= 0x1;
				local56 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BII)Z")
	public static boolean method5865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
