import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
	public static int anInt4843;

	@OriginalMember(owner = "client!jd", name = "L", descriptor = "Lclient!fa;")
	public static Interface4 anInterface4_7;

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
	public static int anInt4862;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B[FI)[F")
	public static float[] method3897(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static604.method6222(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!ol;IIIIIILclient!ol;)V")
	public static void method3898(@OriginalArg(2) Class25_Sub2_Sub2_Sub5 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) Class25_Sub2_Sub2_Sub5 arg6) {
		@Pc(7) int local7 = arg6.method6674();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class73 local21 = (Class73) Static187.aClass342_75.method7684((long) local7);
		if (local21 == null) {
			@Pc(28) Class365[] local28 = Static607.method8154(Static194.aClass284_60, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static319.aClass31_11.method8086(local28[0], true);
			Static187.aClass342_75.method7683(local21, (long) local7);
		}
		Static288.method4332(arg1 >> 1, arg0.aByte117, arg0.anInt8482, arg0.anInt8476, arg3 >> 1, arg0.method6668() * 256, 0);
		@Pc(75) int local75 = arg2 + Static468.anIntArray481[0] - 18;
		@Pc(83) int local83 = local75 + arg4 / 4 * 18;
		@Pc(93) int local93 = Static468.anIntArray481[1] + arg5 - 16 - 54;
		@Pc(101) int local101 = local93 + arg4 % 4 * 18;
		local21.method7957(local83, local101);
		if (arg6 == arg0) {
			Static319.aClass31_11.method8084(-256, 18, 18, local83 - 1, local101 + -1);
		}
		@Pc(123) Class25_Sub3 local123 = Static220.method3682();
		local123.anInt2298 = local101;
		local123.anInt2297 = local83;
		local123.anInt2295 = local83 + 16;
		local123.aClass25_Sub2_Sub2_Sub5_1 = arg6;
		local123.anInt2300 = local101 + 16;
		Static213.aClass269_2.method5977(local123);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method3899() {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			Static544.aBooleanArray32[local8] = true;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public static void method3901() {
		Static262.anInt5041 = -1;
		Static298.anInt5561 = 0;
		Static349.anInt6239 = -1;
	}
}
