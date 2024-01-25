import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!wq", name = "R", descriptor = "[I")
	public static int[] anIntArray836;

	@OriginalMember(owner = "client!wq", name = "P", descriptor = "Lclient!cda;")
	public static final Class49 aClass49_7 = new Class49();

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([IIB[II)V")
	public static void method8834(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(22) int local22 = (arg1 + arg3) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg0[local22];
		arg0[local22] = arg0[arg3];
		arg0[arg3] = local28;
		@Pc(42) int local42 = arg2[local22];
		arg2[local22] = arg2[arg3];
		arg2[arg3] = local42;
		@Pc(61) int local61 = ~local28 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg1; local63 < arg3; local63++) {
			if ((local63 & local61) + local28 > arg0[local63]) {
				@Pc(82) int local82 = arg0[local63];
				arg0[local63] = arg0[local24];
				arg0[local24] = local82;
				@Pc(96) int local96 = arg2[local63];
				arg2[local63] = arg2[local24];
				arg2[local24++] = local96;
			}
		}
		arg0[arg3] = arg0[local24];
		arg0[local24] = local28;
		arg2[arg3] = arg2[local24];
		arg2[local24] = local42;
		method8834(arg0, arg1, arg2, local24 - 1);
		method8834(arg0, local24 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	public static void method8835() {
		Static227.anInt3948 = 0;
		for (@Pc(13) int local13 = 0; local13 < 2048; local13++) {
			Static578.aClass5_Sub12Array1[local13] = null;
			Static514.aByteArray78[local13] = 1;
			Static495.aClass127Array3[local13] = null;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!kn;I)V")
	public static void method8836(@OriginalArg(1) Class14_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt2912 > Static235.anInt3998) {
			Static571.method8049(arg0);
		} else if (Static235.anInt3998 <= arg0.anInt2942) {
			Static100.method1467(arg0);
		} else {
			Static578.method8155(arg0, false);
			local7 = Static563.anInt9268;
			local9 = Static561.anInt9239;
		}
		@Pc(128) int local128;
		if (arg0.anInt9317 < 512 || arg0.anInt9315 < 512 || (Static111.anInt1752 - 1) * 512 <= arg0.anInt9317 || arg0.anInt9315 >= Static279.anInt4567 * 512 - 512) {
			arg0.anIntArray243 = null;
			local7 = -1;
			arg0.anInt2942 = 0;
			local9 = 0;
			arg0.anInt2912 = 0;
			arg0.anInt2930 = -1;
			arg0.anInt9317 = arg0.anIntArray253[0] * 512 + arg0.method2509() * 256;
			arg0.anInt9315 = arg0.anIntArray252[0] * 512 + arg0.method2509() * 256;
			arg0.method2514();
			for (local128 = 0; local128 < arg0.aClass315Array3.length; local128++) {
				arg0.aClass315Array3[local128].anInt8720 = -1;
			}
		}
		if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 == arg0 && (arg0.anInt9317 < 6144 || arg0.anInt9315 < 6144 || (Static111.anInt1752 - 12) * 512 <= arg0.anInt9317 || arg0.anInt9315 >= (Static279.anInt4567 - 12) * 512)) {
			arg0.anInt2942 = 0;
			local7 = -1;
			arg0.anIntArray243 = null;
			local9 = 0;
			arg0.anInt2930 = -1;
			arg0.anInt2912 = 0;
			arg0.anInt9317 = arg0.anIntArray253[0] * 512 + arg0.method2509() * 256;
			arg0.anInt9315 = arg0.anIntArray252[0] * 512 + arg0.method2509() * 256;
			arg0.method2514();
			for (local128 = 0; local128 < arg0.aClass315Array3.length; local128++) {
				arg0.aClass315Array3[local128].anInt8720 = -1;
			}
		}
		local128 = Static542.method7722(arg0);
		Static109.method1609(arg0);
		Static319.method4977(local9, arg0, local128, local7);
		Static78.method1248(arg0, local7);
		Static241.method3665(arg0);
	}
}
