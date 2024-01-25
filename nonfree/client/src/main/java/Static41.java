import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
	public static final int[] anIntArray78 = new int[50];

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
	public static int anInt1028 = 0;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_10 = new Class242("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)Z")
	public static boolean method736(@OriginalArg(0) int arg0) {
		if (arg0 == 50 || arg0 == 47 || arg0 == 8 || arg0 == 12 || arg0 == 23) {
			return true;
		} else {
			return arg0 == 30 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIII)V")
	public static void method738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(14) int local14 = arg0; local14 <= arg2; local14++) {
			Static335.method4533(arg4, arg1, arg3, Static162.anIntArrayArray58[local14]);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(III[FBII)V")
	public static void method739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static315.method4350(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static315.method4350(arg0)) {
			@Pc(41) int local41 = Static21.method450(6408);
			@Pc(43) int local43 = 0;
			@Pc(50) int local50 = arg0 > arg1 ? arg1 : arg0;
			@Pc(54) int local54 = arg1 >> 1;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(60) float[] local60 = arg3;
			@Pc(67) float[] local67 = new float[local41 * local58 * local54];
			while (true) {
				OpenGL.glTexImage2Df(3553, local43, 34842, arg1, arg0, 0, 6408, 5126, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(88) int local88 = local41 * arg1;
				@Pc(90) float[] local90 = local67;
				for (@Pc(92) int local92 = 0; local92 < local41; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(102) int local102 = local92 + local88;
					for (@Pc(104) int local104 = 0; local104 < local58; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local54; local108++) {
							@Pc(114) float local114 = local60[local98];
							local98 += local41;
							@Pc(124) float local124 = local114 + local60[local98];
							@Pc(130) float local130 = local124 + local60[local102];
							local98 += local41;
							local102 += local41;
							@Pc(144) float local144 = local130 + local60[local102];
							local67[local96] = local144 * 0.25F;
							local102 += local41;
							local96 += local41;
						}
						local102 += local88;
						local98 += local88;
					}
				}
				local67 = local60;
				arg1 = local54;
				arg0 = local58;
				local60 = local90;
				local50 >>= 0x1;
				local58 >>= 0x1;
				local54 >>= 0x1;
				local43++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
