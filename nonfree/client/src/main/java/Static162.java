import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public static int anInt3246 = 0;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public static int anInt3249 = 0;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public static int anInt3250 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[BIII)V")
	public static void method2644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 > 0 && !Static54.method895(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static54.method895(arg2)) {
			@Pc(37) int local37 = Static157.method2555(arg4);
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg2 <= arg0 ? arg2 : arg0;
			@Pc(54) int local54 = arg0 >> 1;
			@Pc(58) int local58 = arg2 >> 1;
			@Pc(60) byte[] local60 = arg3;
			@Pc(72) byte[] local72 = new byte[local37 * local58 * local54];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local39, arg5, arg0, arg2, 0, arg4, 5121, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg0 * local37;
				for (@Pc(94) int local94 = 0; local94 < local37; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local92 + local94;
					for (@Pc(106) int local106 = 0; local106 < local58; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local54; local110++) {
							@Pc(116) byte local116 = local60[local100];
							local100 += local37;
							@Pc(126) int local126 = local116 + local60[local100];
							@Pc(132) int local132 = local126 + local60[local104];
							local100 += local37;
							local104 += local37;
							@Pc(146) int local146 = local132 + local60[local104];
							local72[local98] = (byte) (local146 >> 2);
							local104 += local37;
							local98 += local37;
						}
						local100 += local92;
						local104 += local92;
					}
				}
				@Pc(195) byte[] local195 = local72;
				local72 = local60;
				arg2 = local58;
				arg0 = local54;
				local60 = local195;
				local39++;
				local54 >>= 0x1;
				local58 >>= 0x1;
				local50 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	public static void method2646(@OriginalArg(0) int arg0) {
		Static376.anInt6397 = arg0;
		Static440.aClass171_60.method3936();
	}
}
