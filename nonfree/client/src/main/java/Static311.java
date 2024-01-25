import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString74;

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "[Lclient!vs;")
	public static Class20_Sub2[] aClass20_Sub2Array11;

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "[I")
	public static final int[] anIntArray358 = new int[64];

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZILclient!jn;)J")
	public static long method5224(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface12 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class312 local14 = Static283.aClass210_2.method5629(arg2.method9026());
		@Pc(35) long local35 = (long) ((arg1 | 0x800000) << 7 | arg0 | arg2.method9032() << 14 | arg2.method9029() << 20);
		if (local14.anInt9207 == 0) {
			local35 |= local7;
		}
		if (local14.anInt9215 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg2.method9026() << 32;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I[FIIIII)V")
	public static void method5225(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static316.method5292(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static316.method5292(arg4)) {
			@Pc(33) int local33 = Static628.method8719(6408);
			@Pc(35) int local35 = 0;
			@Pc(42) int local42 = arg5 < arg4 ? arg5 : arg4;
			@Pc(46) int local46 = arg5 >> 1;
			@Pc(50) int local50 = arg4 >> 1;
			@Pc(52) float[] local52 = arg1;
			@Pc(64) float[] local64 = new float[local50 * local46 * local33];
			while (true) {
				OpenGL.glTexImage2Df(3553, local35, 34842, arg5, arg4, 0, 6408, 5126, local52, 0);
				if (local42 <= 1) {
					return;
				}
				@Pc(83) int local83 = local33 * arg5;
				@Pc(85) float[] local85 = local64;
				for (@Pc(87) int local87 = 0; local87 < local33; local87++) {
					@Pc(91) int local91 = local87;
					@Pc(93) int local93 = local87;
					@Pc(97) int local97 = local83 + local87;
					for (@Pc(99) int local99 = 0; local99 < local50; local99++) {
						for (@Pc(103) int local103 = 0; local103 < local46; local103++) {
							@Pc(109) float local109 = local52[local93];
							local93 += local33;
							@Pc(119) float local119 = local109 + local52[local93];
							@Pc(125) float local125 = local119 + local52[local97];
							local93 += local33;
							local97 += local33;
							@Pc(139) float local139 = local125 + local52[local97];
							local64[local91] = local139 * 0.25F;
							local97 += local33;
							local91 += local33;
						}
						local93 += local83;
						local97 += local83;
					}
				}
				local64 = local52;
				local52 = local85;
				arg4 = local50;
				arg5 = local46;
				local46 >>= 0x1;
				local42 >>= 0x1;
				local50 >>= 0x1;
				local35++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
