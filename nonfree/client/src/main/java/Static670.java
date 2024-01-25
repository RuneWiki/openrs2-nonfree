import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
	public static int anInt10721;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "[I")
	public static int[] anIntArray619;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lclient!dja;")
	public static final Class88[] aClass88Array1 = new Class88[4];

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)V")
	public static void method9242(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static44.anInt740 - Static594.anInt10008;
		if (local7 >= 100) {
			Static79.anInt1216 = 1;
			Static272.anInt4763 = -1;
			Static651.anInt10529 = -1;
			return;
		}
		@Pc(26) int local26 = (int) Static138.aFloat18;
		if (Static322.anInt5769 >> 8 > local26) {
			local26 = Static322.anInt5769 >> 8;
		}
		if (Static261.aBooleanArray7[4] && local26 < Static24.anIntArray29[4] + 128) {
			local26 = Static24.anIntArray29[4] + 128;
		}
		@Pc(65) int local65 = Static6.anInt81 + (int) Static429.aFloat132 & 0x3FFF;
		Static258.method3802(local26, Static380.method5559(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355, Static240.anInt3974, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363, 0) - 200, Static425.anInt7328, arg0, local65, Static349.anInt6137, (local26 >> 3) * 3 + 600 << 2);
		@Pc(111) float local111 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static649.anInt5976 = (int) (local111 * (float) (Static649.anInt5976 - Static164.anInt2527) + (float) Static164.anInt2527);
		Static132.anInt2186 = (int) ((float) Static104.anInt1683 + (float) (Static132.anInt2186 - Static104.anInt1683) * local111);
		Static489.anInt8202 = (int) ((float) Static241.anInt9882 + local111 * (float) (Static489.anInt8202 - Static241.anInt9882));
		Static532.anInt9189 = (int) ((float) Static378.anInt6475 + (float) (Static532.anInt9189 - Static378.anInt6475) * local111);
		@Pc(164) int local164 = Static159.anInt2475 - Static490.anInt9714;
		if (local164 > 8192) {
			local164 -= 16384;
		} else if (local164 < -8192) {
			local164 += 16384;
		}
		Static159.anInt2475 = (int) ((float) Static490.anInt9714 + local111 * (float) local164);
		Static159.anInt2475 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method9243(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub50 local12 = Static457.method6722(Static643.aClass387_121, Static80.aClass313_1);
		local12.aClass5_Sub23_Sub2_2.method8502(Static228.method3239(arg0) + 1);
		local12.aClass5_Sub23_Sub2_2.method8538(arg0);
		local12.aClass5_Sub23_Sub2_2.method8531(arg1);
		Static494.method7120(local12);
	}
}
