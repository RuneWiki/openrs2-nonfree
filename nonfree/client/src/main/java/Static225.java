import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public static int anInt4439;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Z")
	public static boolean aBoolean306;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!mr;IILclient!mr;BIIIII)V", line = 17)
	public static void method4196(@OriginalArg(0) Class11_Sub5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub5_Sub2 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg0.method4325();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class13 local21 = (Class13) Class2_Sub3_Sub7.aClass98_5.method2614((long) local7);
		if (local21 == null) {
			@Pc(28) Class48[] local28 = Static372.method1690(Static29.aClass197_5, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static177.aClass19_8.method2893(local28[0]);
			Class2_Sub3_Sub7.aClass98_5.method2626((long) local7, local21);
		}
		Static301.method5542(0, arg3.anInt6770, arg3.aByte78, arg3.method4329() * 64, arg4 >> 1, arg3.anInt6768, arg5 >> 1);
		@Pc(75) int local75 = arg2 + Class153.anIntArray231[0] - 18;
		@Pc(90) int local90 = arg1 + Class153.anIntArray231[1] - 54 - 16;
		@Pc(98) int local98 = local75 + arg6 / 4 * 18;
		@Pc(106) int local106 = local90 + arg6 % 4 * 18;
		local21.method6386(local98, local106);
		if (arg0 == arg3) {
			Static177.aClass19_8.method2839(local106 - 1, local98 - 1, 18, -256, 18);
		}
		@Pc(130) Class12_Sub6 local130 = Static292.method5384();
		local130.anInt4742 = local106;
		local130.anInt4743 = local98;
		local130.anInt4741 = local106 + 16;
		local130.aClass11_Sub5_Sub2_1 = arg0;
		local130.anInt4745 = local98 + 16;
		Class2_Sub2_Sub6_Sub2.aClass36_10.method1420(local130);
	}
}
