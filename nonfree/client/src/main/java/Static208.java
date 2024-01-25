import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
	public static int anInt3801;

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "[F")
	public static final float[] aFloatArray44 = new float[4];

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_24 = new Class112();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[FIIIII)V")
	public static void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 > 0 && !Static259.method3984(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static259.method3984(arg2)) {
			@Pc(44) int local44 = Static367.method5385(6408);
			@Pc(46) int local46 = 0;
			@Pc(57) int local57 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(61) int local61 = arg3 >> 1;
			@Pc(65) int local65 = arg2 >> 1;
			@Pc(67) float[] local67 = arg1;
			@Pc(74) float[] local74 = new float[local65 * local61 * local44];
			while (true) {
				OpenGL.glTexImage2Df(3553, local46, 34842, arg3, arg2, 0, 6408, 5126, local67, 0);
				if (local57 <= 1) {
					return;
				}
				@Pc(94) int local94 = arg3 * local44;
				@Pc(96) float[] local96 = local74;
				for (@Pc(98) int local98 = 0; local98 < local44; local98++) {
					@Pc(102) int local102 = local98;
					@Pc(104) int local104 = local98;
					@Pc(108) int local108 = local94 + local98;
					for (@Pc(110) int local110 = 0; local110 < local65; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local61; local114++) {
							@Pc(120) float local120 = local67[local104];
							local104 += local44;
							@Pc(130) float local130 = local120 + local67[local104];
							local104 += local44;
							@Pc(140) float local140 = local130 + local67[local108];
							local108 += local44;
							@Pc(150) float local150 = local140 + local67[local108];
							local108 += local44;
							local74[local102] = local150 * 0.25F;
							local102 += local44;
						}
						local108 += local94;
						local104 += local94;
					}
				}
				local74 = local67;
				arg3 = local61;
				arg2 = local65;
				local67 = local96;
				local65 >>= 0x1;
				local46++;
				local61 >>= 0x1;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method3390(@OriginalArg(0) Class45 arg0) {
		if (Static150.aBoolean254) {
			Static5.method81(arg0);
		} else {
			Static45.method736(arg0);
		}
	}
}
