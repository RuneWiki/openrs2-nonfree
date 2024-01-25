import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "Lclient!go;")
	public static Class115_Sub1 aClass115_Sub1_2;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_24 = new Class328(0, 4);

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_161 = new Class73(70, -2);

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "[I")
	public static final int[] anIntArray648 = new int[16];

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!ji;B)Lclient!qi;")
	public static Class271 method7217(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(12) Class271 local12 = new Class271();
		local12.anInt7400 = arg0.method6003();
		local12.aClass6_Sub2_Sub5_1 = Static266.aClass248_2.method5726(local12.anInt7400);
		return local12;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([FIIBIII)V")
	public static void method7218(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static404.method5927(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static404.method5927(arg5)) {
			@Pc(34) int local34 = Static52.method1134(6408);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg5 > arg2 ? arg2 : arg5;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(55) int local55 = arg5 >> 1;
			@Pc(57) float[] local57 = arg0;
			@Pc(75) float[] local75 = new float[local55 * local51 * local34];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg2, arg5, 0, 6408, 5126, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(94) int local94 = arg2 * local34;
				@Pc(96) float[] local96 = local75;
				for (@Pc(98) int local98 = 0; local98 < local34; local98++) {
					@Pc(102) int local102 = local98;
					@Pc(104) int local104 = local98;
					@Pc(108) int local108 = local98 + local94;
					for (@Pc(110) int local110 = 0; local110 < local55; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local51; local114++) {
							@Pc(120) float local120 = local57[local104];
							local104 += local34;
							@Pc(130) float local130 = local120 + local57[local104];
							@Pc(136) float local136 = local130 + local57[local108];
							local104 += local34;
							local108 += local34;
							@Pc(150) float local150 = local136 + local57[local108];
							local75[local102] = local150 * 0.25F;
							local108 += local34;
							local102 += local34;
						}
						local108 += local94;
						local104 += local94;
					}
				}
				local75 = local57;
				local57 = local96;
				arg5 = local55;
				arg2 = local51;
				local55 >>= 0x1;
				local36++;
				local51 >>= 0x1;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
