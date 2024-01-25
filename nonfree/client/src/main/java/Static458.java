import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
	public static int anInt7334 = 0;

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_152 = new Class151(55, -2);

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "[Lclient!uea;")
	public static final Class4_Sub48[] aClass4_Sub48Array1 = new Class4_Sub48[300];

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "([IZIIIIII)V")
	public static void method6400(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static211.method8993(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static211.method8993(arg2)) {
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg2 <= arg3 ? arg2 : arg3;
			@Pc(53) int local53 = arg3 >> 1;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(59) int[] local59 = arg0;
			@Pc(64) int[] local64 = new int[local53 * local57];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local42, arg4, arg3, arg2, 0, 32993, arg1, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(86) int local86 = 0;
				@Pc(88) int local88 = 0;
				@Pc(93) int local93 = arg3;
				for (@Pc(95) int local95 = 0; local95 < local57; local95++) {
					for (@Pc(99) int local99 = 0; local99 < local53; local99++) {
						@Pc(106) int local106 = local59[local88++];
						@Pc(111) int local111 = local59[local88++];
						@Pc(116) int local116 = local59[local93++];
						@Pc(122) int local122 = local106 >> 8 & 0xFF;
						@Pc(127) int local127 = local59[local93++];
						@Pc(131) int local131 = local106 & 0xFF;
						@Pc(137) int local137 = local106 >> 16 & 0xFF;
						@Pc(143) int local143 = local106 >> 24 & 0xFF;
						@Pc(151) int local151 = local137 + (local111 >> 16 & 0xFF);
						@Pc(157) int local157 = local131 + (local111 & 0xFF);
						@Pc(165) int local165 = local143 + (local111 >> 24 & 0xFF);
						@Pc(173) int local173 = local122 + (local111 >> 8 & 0xFF);
						@Pc(181) int local181 = local151 + (local116 >> 16 & 0xFF);
						@Pc(187) int local187 = local157 + (local116 & 0xFF);
						@Pc(195) int local195 = local165 + (local116 >> 24 & 0xFF);
						@Pc(203) int local203 = local173 + (local116 >> 8 & 0xFF);
						@Pc(209) int local209 = local187 + (local127 & 0xFF);
						@Pc(217) int local217 = local181 + (local127 >> 16 & 0xFF);
						@Pc(225) int local225 = local203 + (local127 >> 8 & 0xFF);
						@Pc(233) int local233 = local195 + (local127 >> 24 & 0xFF);
						local64[local86++] = local209 >> 2 & 0xFF | (local217 & 0x3FC) << 14 | (local233 & 0x3FC) << 22 | (local225 & 0x3FC) << 6;
					}
					local93 += arg3;
					local88 += arg3;
				}
				@Pc(282) int[] local282 = local64;
				local64 = local59;
				arg2 = local57;
				local59 = local282;
				arg3 = local53;
				local53 >>= 0x1;
				local49 >>= 0x1;
				local42++;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
