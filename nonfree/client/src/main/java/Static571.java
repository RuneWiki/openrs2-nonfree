import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "I")
	public static int anInt9680;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "[Lclient!kga;")
	public static final Class3_Sub1_Sub12[] aClass3_Sub1_Sub12Array5 = new Class3_Sub1_Sub12[14];

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_134 = new Class218(44, 1);

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BII[IIIII)V")
	public static void method7997(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg4 > 0 && !Static474.method7016(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static474.method7016(arg5)) {
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg5 > arg4 ? arg4 : arg5;
			@Pc(50) int local50 = arg4 >> 1;
			@Pc(54) int local54 = arg5 >> 1;
			@Pc(56) int[] local56 = arg1;
			@Pc(61) int[] local61 = new int[local54 * local50];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local39, arg0, arg4, arg5, 0, 32993, arg2, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(81) int local81 = 0;
				@Pc(83) int local83 = 0;
				@Pc(87) int local87 = arg4;
				for (@Pc(89) int local89 = 0; local89 < local54; local89++) {
					for (@Pc(93) int local93 = 0; local93 < local50; local93++) {
						@Pc(100) int local100 = local56[local83++];
						@Pc(105) int local105 = local56[local87++];
						@Pc(110) int local110 = local56[local83++];
						@Pc(115) int local115 = local56[local87++];
						@Pc(121) int local121 = local100 >> 8 & 0xFF;
						@Pc(127) int local127 = local100 >> 16 & 0xFF;
						@Pc(133) int local133 = local100 >> 24 & 0xFF;
						@Pc(137) int local137 = local100 & 0xFF;
						@Pc(143) int local143 = local137 + (local110 & 0xFF);
						@Pc(151) int local151 = local133 + (local110 >> 24 & 0xFF);
						@Pc(159) int local159 = local121 + (local110 >> 8 & 0xFF);
						@Pc(167) int local167 = local127 + (local110 >> 16 & 0xFF);
						@Pc(175) int local175 = local151 + (local105 >> 24 & 0xFF);
						@Pc(181) int local181 = local143 + (local105 & 0xFF);
						@Pc(189) int local189 = local159 + (local105 >> 8 & 0xFF);
						@Pc(197) int local197 = local167 + (local105 >> 16 & 0xFF);
						@Pc(205) int local205 = local189 + (local115 >> 8 & 0xFF);
						@Pc(213) int local213 = local197 + (local115 >> 16 & 0xFF);
						@Pc(219) int local219 = local181 + (local115 & 0xFF);
						@Pc(227) int local227 = local175 + (local115 >> 24 & 0xFF);
						local61[local81++] = local219 >> 2 & 0xFF | (local213 & 0x3FC) << 14 | (local227 & 0x3FC) << 22 | (local205 & 0x3FC) << 6;
					}
					local87 += arg4;
					local83 += arg4;
				}
				@Pc(276) int[] local276 = local61;
				local61 = local56;
				local56 = local276;
				arg4 = local50;
				arg5 = local54;
				local46 >>= 0x1;
				local54 >>= 0x1;
				local39++;
				local50 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
