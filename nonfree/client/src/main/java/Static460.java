import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array9;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "Lclient!uk;")
	public static Class329 aClass329_5;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_89 = new Class230(12, 3);

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "[I")
	public static final int[] anIntArray530 = new int[14];

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
	public static int anInt8639 = 0;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
	public static int anInt8640 = 104;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public static void method7069() {
		Static322.aClass15_10.X(Static591.anInt10348, Static455.aClass3_Sub27_Sub1_1.aBoolean386 ? Static247.anInt5390 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[BIIIII)V")
	public static void method7072(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 > 0 && !Static282.method4863(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static282.method4863(arg3)) {
			@Pc(29) int local29 = Static191.method3300(arg0);
			@Pc(31) int local31 = 0;
			@Pc(42) int local42 = arg4 < arg3 ? arg4 : arg3;
			@Pc(46) int local46 = arg4 >> 1;
			@Pc(54) int local54 = arg3 >> 1;
			@Pc(56) byte[] local56 = arg1;
			@Pc(63) byte[] local63 = new byte[local54 * local46 * local29];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local31, arg5, arg4, arg3, 0, arg0, 5121, local56, 0);
				if (local42 <= 1) {
					return;
				}
				@Pc(82) int local82 = local29 * arg4;
				for (@Pc(84) int local84 = 0; local84 < local29; local84++) {
					@Pc(87) int local87 = local84;
					@Pc(89) int local89 = local84;
					@Pc(93) int local93 = local82 + local84;
					for (@Pc(95) int local95 = 0; local95 < local54; local95++) {
						for (@Pc(98) int local98 = 0; local98 < local46; local98++) {
							@Pc(103) byte local103 = local56[local89];
							local89 += local29;
							@Pc(113) int local113 = local103 + local56[local89];
							@Pc(119) int local119 = local113 + local56[local93];
							local89 += local29;
							local93 += local29;
							@Pc(133) int local133 = local119 + local56[local93];
							local63[local87] = (byte) (local133 >> 2);
							local93 += local29;
							local87 += local29;
						}
						local93 += local82;
						local89 += local82;
					}
				}
				@Pc(182) byte[] local182 = local63;
				local63 = local56;
				local56 = local182;
				arg3 = local54;
				arg4 = local46;
				local31++;
				local42 >>= 0x1;
				local46 >>= 0x1;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
