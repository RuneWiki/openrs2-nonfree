import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jea", name = "A", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_24 = new Class94(30);

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II[BIIII)V")
	public static void method4644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static152.method3040(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static152.method3040(arg3)) {
			@Pc(37) int local37 = Static275.method8431(arg5);
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg0 >= arg3 ? arg3 : arg0;
			@Pc(54) int local54 = arg0 >> 1;
			@Pc(58) int local58 = arg3 >> 1;
			@Pc(60) byte[] local60 = arg2;
			@Pc(67) byte[] local67 = new byte[local37 * local58 * local54];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local39, arg4, arg0, arg3, 0, arg5, 5121, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(87) int local87 = local37 * arg0;
				for (@Pc(89) int local89 = 0; local89 < local37; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(100) int local100 = local89 + local87;
					for (@Pc(102) int local102 = 0; local102 < local58; local102++) {
						for (@Pc(106) int local106 = 0; local106 < local54; local106++) {
							@Pc(112) byte local112 = local60[local95];
							local95 += local37;
							@Pc(122) int local122 = local112 + local60[local95];
							local95 += local37;
							@Pc(132) int local132 = local122 + local60[local100];
							local100 += local37;
							@Pc(142) int local142 = local132 + local60[local100];
							local100 += local37;
							local67[local93] = (byte) (local142 >> 2);
							local93 += local37;
						}
						local95 += local87;
						local100 += local87;
					}
				}
				@Pc(187) byte[] local187 = local67;
				local67 = local60;
				arg0 = local54;
				local60 = local187;
				arg3 = local58;
				local58 >>= 0x1;
				local50 >>= 0x1;
				local39++;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IB)V")
	public static void method4649(@OriginalArg(0) int arg0) {
		Static601.anInt10196 = arg0;
		Static92.aClass94_12.method2952();
	}
}
