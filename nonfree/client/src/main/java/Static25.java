import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!au", name = "m", descriptor = "I")
	public static int anInt551;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "I")
	public static int anInt547 = 0;

	@OriginalMember(owner = "client!au", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!au", name = "j", descriptor = "Lclient!im;")
	public static final Class140 aClass140_12 = new Class140(67, 14);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([FIIIIBI)V")
	public static void method573(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static535.method7411(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static535.method7411(arg5)) {
			@Pc(39) int local39 = Static228.method3981(6408);
			@Pc(41) int local41 = 0;
			@Pc(52) int local52 = arg1 < arg5 ? arg1 : arg5;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(65) int local65 = arg5 >> 1;
			@Pc(67) float[] local67 = arg0;
			@Pc(74) float[] local74 = new float[local56 * local65 * local39];
			while (true) {
				OpenGL.glTexImage2Df(3553, local41, 34842, arg1, arg5, 0, 6408, 5126, local67, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(93) int local93 = local39 * arg1;
				@Pc(95) float[] local95 = local74;
				for (@Pc(97) int local97 = 0; local97 < local39; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(108) int local108 = local97 + local93;
					for (@Pc(110) int local110 = 0; local110 < local65; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local56; local114++) {
							@Pc(120) float local120 = local67[local103];
							local103 += local39;
							@Pc(130) float local130 = local120 + local67[local103];
							@Pc(136) float local136 = local130 + local67[local108];
							local103 += local39;
							local108 += local39;
							@Pc(150) float local150 = local136 + local67[local108];
							local108 += local39;
							local74[local101] = local150 * 0.25F;
							local101 += local39;
						}
						local108 += local93;
						local103 += local93;
					}
				}
				local74 = local67;
				arg1 = local56;
				local67 = local95;
				arg5 = local65;
				local65 >>= 0x1;
				local52 >>= 0x1;
				local56 >>= 0x1;
				local41++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I[Lclient!jq;I)V")
	public static void method574(@OriginalArg(0) int arg0, @OriginalArg(1) Class156[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			@Pc(20) Class156 local20 = arg1[local14];
			if (local20 != null && local20.anInt4686 == arg0 && !Static67.method1236(local20)) {
				if (local20.anInt4735 == 0) {
					method574(local20.anInt4677, arg1);
					if (local20.aClass156Array1 != null) {
						method574(local20.anInt4677, local20.aClass156Array1);
					}
					@Pc(58) Class1_Sub35 local58 = (Class1_Sub35) Static468.aClass17_36.method738((long) local20.anInt4677);
					if (local58 != null) {
						Static383.method4918(local58.anInt6103);
					}
				}
				if (local20.anInt4735 == 6 && local20.anInt4693 != -1) {
					@Pc(79) Class199 local79 = Static182.aClass218_1.method5221(local20.anInt4693);
					if (local79 != null) {
						local20.anInt4670 += Static152.anInt2791;
						while (local79.anIntArray575[local20.anInt4652] < local20.anInt4670) {
							local20.anInt4670 -= local79.anIntArray575[local20.anInt4652];
							local20.anInt4652++;
							if (local20.anInt4652 >= local79.anIntArray574.length) {
								local20.anInt4652 -= local79.anInt5746;
								if (local20.anInt4652 < 0 || local20.anInt4652 >= local79.anIntArray574.length) {
									local20.anInt4652 = 0;
								}
							}
							local20.anInt4680 = local20.anInt4652 + 1;
							if (local79.anIntArray574.length <= local20.anInt4680) {
								local20.anInt4680 -= local79.anInt5746;
								if (local20.anInt4680 < 0 || local20.anInt4680 >= local79.anIntArray574.length) {
									local20.anInt4680 = -1;
								}
							}
							Static473.method6593(local20);
						}
					}
				}
			}
		}
	}
}
