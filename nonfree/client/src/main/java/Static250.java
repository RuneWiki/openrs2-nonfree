import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
	public static int anInt4639 = -2;

	@OriginalMember(owner = "client!mo", name = "y", descriptor = "Lclient!tn;")
	public static final Class229 aClass229_4 = new Class229();

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public static void method3629(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub11 local8 = Static405.method5222(arg0, 2);
		local8.method2608();
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)Z")
	public static boolean method3631(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BII[FIII)V")
	public static void method3634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static424.method5413(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static424.method5413(arg5)) {
			@Pc(34) int local34 = Static9.method92(6408);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg4 < arg5 ? arg4 : arg5;
			@Pc(51) int local51 = arg4 >> 1;
			@Pc(55) int local55 = arg5 >> 1;
			@Pc(63) float[] local63 = arg2;
			@Pc(70) float[] local70 = new float[local55 * local51 * local34];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg4, arg5, 0, 6408, 5126, local63, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(90) int local90 = local34 * arg4;
				for (@Pc(92) int local92 = 0; local92 < local34; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(102) int local102 = local90 + local92;
					for (@Pc(104) int local104 = 0; local104 < local55; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local51; local108++) {
							@Pc(114) float local114 = local63[local98];
							local98 += local34;
							@Pc(124) float local124 = local114 + local63[local98];
							@Pc(130) float local130 = local124 + local63[local102];
							local98 += local34;
							local102 += local34;
							@Pc(144) float local144 = local130 + local63[local102];
							local102 += local34;
							local70[local96] = local144 * 0.25F;
							local96 += local34;
						}
						local98 += local90;
						local102 += local90;
					}
				}
				@Pc(184) float[] local184 = local70;
				local70 = local63;
				arg4 = local51;
				local63 = local184;
				arg5 = local55;
				local36++;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
