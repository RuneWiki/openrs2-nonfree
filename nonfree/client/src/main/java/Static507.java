import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
	public static int anInt8547;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "[Lclient!cea;")
	public static final Class9_Sub2_Sub1_Sub2_Sub1[] aClass9_Sub2_Sub1_Sub2_Sub1Array1 = new Class9_Sub2_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIII[I)V")
	public static void method7363(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg2 > 0 && !Static112.method1840(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static112.method1840(arg4)) {
			@Pc(47) int local47 = 0;
			@Pc(54) int local54 = arg4 <= arg2 ? arg4 : arg2;
			@Pc(58) int local58 = arg2 >> 1;
			@Pc(62) int local62 = arg4 >> 1;
			@Pc(64) int[] local64 = arg5;
			@Pc(69) int[] local69 = new int[local58 * local62];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local47, arg3, arg2, arg4, 0, 32993, arg0, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(87) int local87 = 0;
				@Pc(89) int local89 = 0;
				@Pc(93) int local93 = arg2;
				for (@Pc(95) int local95 = 0; local95 < local62; local95++) {
					for (@Pc(99) int local99 = 0; local99 < local58; local99++) {
						@Pc(106) int local106 = local64[local89++];
						@Pc(111) int local111 = local64[local89++];
						@Pc(116) int local116 = local64[local93++];
						@Pc(122) int local122 = local106 >> 8 & 0xFF;
						@Pc(128) int local128 = local106 >> 16 & 0xFF;
						@Pc(132) int local132 = local106 & 0xFF;
						@Pc(138) int local138 = local106 >> 24 & 0xFF;
						@Pc(143) int local143 = local64[local93++];
						@Pc(151) int local151 = local138 + (local111 >> 24 & 0xFF);
						@Pc(157) int local157 = local132 + (local111 & 0xFF);
						@Pc(165) int local165 = local122 + (local111 >> 8 & 0xFF);
						@Pc(173) int local173 = local128 + (local111 >> 16 & 0xFF);
						@Pc(179) int local179 = local157 + (local116 & 0xFF);
						@Pc(187) int local187 = local151 + (local116 >> 24 & 0xFF);
						@Pc(195) int local195 = local165 + (local116 >> 8 & 0xFF);
						@Pc(203) int local203 = local173 + (local116 >> 16 & 0xFF);
						@Pc(211) int local211 = local195 + (local143 >> 8 & 0xFF);
						@Pc(217) int local217 = local179 + (local143 & 0xFF);
						@Pc(225) int local225 = local203 + (local143 >> 16 & 0xFF);
						@Pc(233) int local233 = local187 + (local143 >> 24 & 0xFF);
						local69[local87++] = (local225 & 0x3FC) << 14 | (local233 & 0x3FC) << 22 | (local211 & 0x3FC) << 6 | local217 >> 2 & 0xFF;
					}
					local93 += arg2;
					local89 += arg2;
				}
				@Pc(286) int[] local286 = local69;
				local69 = local64;
				local64 = local286;
				arg4 = local62;
				arg2 = local58;
				local54 >>= 0x1;
				local62 >>= 0x1;
				local58 >>= 0x1;
				local47++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
