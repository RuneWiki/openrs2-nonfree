import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	public static int anInt2539 = 0;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
	public static final int[] anIntArray131 = new int[8];

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)V")
	public static void method2492(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static141.anInt8737 - Static421.anInt7233;
		if (local8 >= 100) {
			Static526.anInt8626 = 1;
			Static16.anInt232 = -1;
			Static126.anInt2529 = -1;
			return;
		}
		@Pc(32) int local32 = (int) Static135.aFloat51;
		if (local32 < Static97.anInt1438 >> 8) {
			local32 = Static97.anInt1438 >> 8;
		}
		if (Static153.aBooleanArray9[4] && Static449.anIntArray491[4] + 128 > local32) {
			local32 = Static449.anIntArray491[4] + 128;
		}
		@Pc(71) int local71 = Static28.anInt375 + (int) Static409.aFloat135 & 0x3FFF;
		Static419.method6417((local32 >> 3) * 3 + 600 << 2, Static170.anInt3533, local71, local32, arg0, Static331.anInt8309, Static248.method4318(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057, Static504.anInt8428, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048) - 200);
		@Pc(115) float local115 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static337.anInt5759 = (int) ((float) Static507.anInt10524 + (float) (Static337.anInt5759 - Static507.anInt10524) * local115);
		Static475.anInt8090 = (int) ((float) (Static475.anInt8090 - Static105.anInt2088) * local115 + (float) Static105.anInt2088);
		Static365.anInt6155 = (int) (local115 * (float) (Static365.anInt6155 - Static429.anInt7378) + (float) Static429.anInt7378);
		Static406.anInt7076 = (int) ((float) (Static406.anInt7076 - Static547.anInt8870) * local115 + (float) Static547.anInt8870);
		@Pc(166) int local166 = Static21.anInt279 - Static30.anInt391;
		if (local166 > 8192) {
			local166 -= 16384;
		} else if (local166 < -8192) {
			local166 += 16384;
		}
		Static21.anInt279 = (int) (local115 * (float) local166 + (float) Static30.anInt391);
		Static21.anInt279 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIILjava/lang/String;III)V")
	public static void method2493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class60_Sub8 local7 = new Class60_Sub8();
		local7.anInt8461 = arg5;
		local7.anInt8460 = arg2;
		local7.aString98 = arg4;
		local7.anInt8458 = arg1;
		local7.anInt8457 = arg6;
		local7.anInt8456 = Static141.anInt8737 + arg3;
		local7.anInt8463 = arg0;
		Static292.aClass385_4.method8779(local7);
	}
}
