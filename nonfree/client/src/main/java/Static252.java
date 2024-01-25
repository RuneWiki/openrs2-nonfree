import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_87 = new Class133(29, 3);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
	public static int method4321(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII[BI)V")
	public static void method4322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static260.method4582(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static260.method4582(arg0)) {
			@Pc(39) int local39 = Static56.method1148(arg2);
			@Pc(41) int local41 = 0;
			@Pc(52) int local52 = arg1 >= arg0 ? arg0 : arg1;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(62) byte[] local62 = arg4;
			@Pc(69) byte[] local69 = new byte[local39 * local60 * local56];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local41, arg5, arg1, arg0, 0, arg2, 5121, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(88) int local88 = arg1 * local39;
				for (@Pc(90) int local90 = 0; local90 < local39; local90++) {
					@Pc(94) int local94 = local90;
					@Pc(96) int local96 = local90;
					@Pc(100) int local100 = local88 + local90;
					for (@Pc(102) int local102 = 0; local102 < local60; local102++) {
						for (@Pc(106) int local106 = 0; local106 < local56; local106++) {
							@Pc(112) byte local112 = local62[local96];
							local96 += local39;
							@Pc(122) int local122 = local112 + local62[local96];
							@Pc(128) int local128 = local122 + local62[local100];
							local96 += local39;
							local100 += local39;
							@Pc(142) int local142 = local128 + local62[local100];
							local100 += local39;
							local69[local94] = (byte) (local142 >> 2);
							local94 += local39;
						}
						local96 += local88;
						local100 += local88;
					}
				}
				@Pc(179) byte[] local179 = local69;
				local69 = local62;
				arg0 = local60;
				local62 = local179;
				arg1 = local56;
				local52 >>= 0x1;
				local60 >>= 0x1;
				local41++;
				local56 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
