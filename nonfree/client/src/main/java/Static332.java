import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_180 = new Class202(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
	public static int anInt6223 = 0;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "([BIIIIII)V")
	public static void method5297(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 > 0 && !Static150.method2607(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static150.method2607(arg2)) {
			@Pc(39) int local39 = Static472.method6911(arg5);
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg2 <= arg1 ? arg2 : arg1;
			@Pc(52) int local52 = arg1 >> 1;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(62) byte[] local62 = arg0;
			@Pc(69) byte[] local69 = new byte[local52 * local56 * local39];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local41, arg3, arg1, arg2, 0, arg5, 5121, local62, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(90) int local90 = arg1 * local39;
				@Pc(92) byte[] local92 = local69;
				for (@Pc(94) int local94 = 0; local94 < local39; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local90 + local94;
					for (@Pc(106) int local106 = 0; local106 < local56; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local52; local110++) {
							@Pc(116) byte local116 = local62[local100];
							local100 += local39;
							@Pc(126) int local126 = local116 + local62[local100];
							@Pc(132) int local132 = local126 + local62[local104];
							local100 += local39;
							local104 += local39;
							@Pc(146) int local146 = local132 + local62[local104];
							local69[local98] = (byte) (local146 >> 2);
							local104 += local39;
							local98 += local39;
						}
						local104 += local90;
						local100 += local90;
					}
				}
				local69 = local62;
				arg1 = local52;
				local62 = local92;
				arg2 = local56;
				local52 >>= 0x1;
				local41++;
				local56 >>= 0x1;
				local48 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5299(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
