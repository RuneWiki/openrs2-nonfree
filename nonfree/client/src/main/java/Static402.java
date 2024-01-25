import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_143 = new Class211(19, -2);

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!de;")
	public static final Class50 aClass50_26 = new Class50(11, 0, 1, 2);

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[B")
	public static final byte[] aByteArray81 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([J[IB)V")
	public static void method5076(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static332.method4453(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method5077() {
		Static274.aClass2_Sub46_2 = new Class2_Sub46(Static157.aClass134_54.method2720(Static331.anInt5597), "", Static96.anInt1855, 1011, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBII[FII)V")
	public static void method5078(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static376.method4880(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static376.method4880(arg1)) {
			@Pc(34) int local34 = Static334.method4468(6408);
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg1 > arg0 ? arg0 : arg1;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(58) float[] local58 = arg3;
			@Pc(65) float[] local65 = new float[local34 * local56 * local52];
			while (true) {
				OpenGL.glTexImage2Df(3553, local41, 34842, arg0, arg1, 0, 6408, 5126, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(86) int local86 = arg0 * local34;
				for (@Pc(88) int local88 = 0; local88 < local34; local88++) {
					@Pc(92) int local92 = local88;
					@Pc(94) int local94 = local88;
					@Pc(98) int local98 = local88 + local86;
					for (@Pc(100) int local100 = 0; local100 < local56; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local52; local104++) {
							@Pc(110) float local110 = local58[local94];
							local94 += local34;
							@Pc(120) float local120 = local110 + local58[local94];
							@Pc(126) float local126 = local120 + local58[local98];
							local94 += local34;
							local98 += local34;
							@Pc(140) float local140 = local126 + local58[local98];
							local65[local92] = local140 * 0.25F;
							local98 += local34;
							local92 += local34;
						}
						local98 += local86;
						local94 += local86;
					}
				}
				@Pc(176) float[] local176 = local65;
				local65 = local58;
				arg1 = local56;
				arg0 = local52;
				local58 = local176;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local56 >>= 0x1;
				local41++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
