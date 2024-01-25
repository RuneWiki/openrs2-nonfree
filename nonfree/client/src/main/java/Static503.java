import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!oh;")
	public static Class237 aClass237_138;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_114 = new Class257(41, -1);

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	public static int anInt9960 = 0;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "[[F")
	public static final float[][] aFloatArrayArray18 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIZI[I)V")
	public static void method8089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg2 > 0 && !Static439.method6796(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static439.method6796(arg0)) {
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg0 <= arg2 ? arg0 : arg2;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(61) int local61 = arg0 >> 1;
			@Pc(63) int[] local63 = arg5;
			@Pc(68) int[] local68 = new int[local61 * local53];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local42, arg1, arg2, arg0, 0, 32993, arg4, local63, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(86) int local86 = 0;
				@Pc(88) int local88 = 0;
				@Pc(92) int local92 = arg2;
				for (@Pc(94) int local94 = 0; local94 < local61; local94++) {
					for (@Pc(98) int local98 = 0; local98 < local53; local98++) {
						@Pc(105) int local105 = local63[local88++];
						@Pc(110) int local110 = local63[local92++];
						@Pc(115) int local115 = local63[local88++];
						@Pc(119) int local119 = local105 & 0xFF;
						@Pc(125) int local125 = local105 >> 8 & 0xFF;
						@Pc(130) int local130 = local63[local92++];
						@Pc(136) int local136 = local105 >> 16 & 0xFF;
						@Pc(142) int local142 = local105 >> 24 & 0xFF;
						@Pc(150) int local150 = local136 + (local115 >> 16 & 0xFF);
						@Pc(156) int local156 = local119 + (local115 & 0xFF);
						@Pc(164) int local164 = local125 + (local115 >> 8 & 0xFF);
						@Pc(172) int local172 = local142 + (local115 >> 24 & 0xFF);
						@Pc(180) int local180 = local164 + (local110 >> 8 & 0xFF);
						@Pc(188) int local188 = local150 + (local110 >> 16 & 0xFF);
						@Pc(196) int local196 = local172 + (local110 >> 24 & 0xFF);
						@Pc(202) int local202 = local156 + (local110 & 0xFF);
						@Pc(208) int local208 = local202 + (local130 & 0xFF);
						@Pc(216) int local216 = local188 + (local130 >> 16 & 0xFF);
						@Pc(224) int local224 = local196 + (local130 >> 24 & 0xFF);
						@Pc(232) int local232 = local180 + (local130 >> 8 & 0xFF);
						local68[local86++] = local208 >> 2 & 0xFF | (local224 & 0x3FC) << 22 | (local216 & 0x3FC) << 14 | (local232 & 0x3FC) << 6;
					}
					local88 += arg2;
					local92 += arg2;
				}
				@Pc(285) int[] local285 = local68;
				local68 = local63;
				local63 = local285;
				arg0 = local61;
				arg2 = local53;
				local53 >>= 0x1;
				local42++;
				local61 >>= 0x1;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
