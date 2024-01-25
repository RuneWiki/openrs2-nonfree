import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	public static int anInt8826;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
	public static final int[] anIntArray579 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	public static void method7344() {
		Static261.method3996(Static405.aClass3_Sub3_Sub1_1.anInt7571);
		@Pc(19) int local19 = (Static335.anInt5608 >> 3) + (Static226.anInt3984 >> 12);
		Static117.anInt2694 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 = 0;
		@Pc(33) int local33 = (Static350.anInt6080 >> 12) + (Static246.anInt4344 >> 3);
		Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7871(8, 8);
		Static58.anIntArray60 = new int[18];
		Static73.anIntArray77 = new int[18];
		Static299.anIntArray289 = new int[18];
		Static308.aByteArrayArray13 = new byte[18][];
		Static551.aByteArrayArray22 = new byte[18][];
		Static529.anIntArray557 = new int[18];
		Static346.aByteArrayArray18 = new byte[18][];
		Static403.anIntArray428 = new int[18];
		Static189.anIntArrayArray81 = new int[18][4];
		Static401.aByteArrayArray20 = new byte[18][];
		Static274.aByteArrayArray12 = new byte[18][];
		Static450.anIntArray623 = new int[18];
		@Pc(79) int local79 = 0;
		@Pc(103) int local103;
		for (@Pc(93) int local93 = (local19 - (Static54.anInt1038 >> 4)) / 8; local93 <= ((Static54.anInt1038 >> 4) + local19) / 8; local93++) {
			for (local103 = (local33 - (Static140.anInt3026 >> 4)) / 8; local103 <= (local33 + (Static140.anInt3026 >> 4)) / 8; local103++) {
				@Pc(112) int local112 = (local93 << 8) + local103;
				Static403.anIntArray428[local79] = local112;
				Static450.anIntArray623[local79] = Static99.aClass322_36.method6823("m" + local93 + "_" + local103);
				Static73.anIntArray77[local79] = Static99.aClass322_36.method6823("l" + local93 + "_" + local103);
				Static58.anIntArray60[local79] = Static99.aClass322_36.method6823("n" + local93 + "_" + local103);
				Static529.anIntArray557[local79] = Static99.aClass322_36.method6823("um" + local93 + "_" + local103);
				Static299.anIntArray289[local79] = Static99.aClass322_36.method6823("ul" + local93 + "_" + local103);
				if (Static58.anIntArray60[local79] == -1) {
					Static450.anIntArray623[local79] = -1;
					Static73.anIntArray77[local79] = -1;
					Static529.anIntArray557[local79] = -1;
					Static299.anIntArray289[local79] = -1;
				}
				local79++;
			}
		}
		for (local103 = local79; local103 < Static58.anIntArray60.length; local103++) {
			Static58.anIntArray60[local103] = -1;
			Static450.anIntArray623[local103] = -1;
			Static73.anIntArray77[local103] = -1;
			Static529.anIntArray557[local103] = -1;
			Static299.anIntArray289[local103] = -1;
		}
		@Pc(290) byte local290;
		if (Static32.anInt602 == 3) {
			local290 = 4;
		} else {
			local290 = 8;
		}
		Static272.method4138(local290, local19, false, local33);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
	public static void method7345() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static350.aBooleanArray20[local7] = false;
		}
		Static119.anInt2747 = Static333.anInt5565;
		Static391.anInt6856 = -1;
		Static18.anInt314 = -1;
		Static220.anInt3921 = Static226.anInt3984;
		Static379.anInt6482 = 5;
		Static73.anInt1695 = Static461.anInt7704;
		Static562.anInt9174 = 0;
		Static91.anInt1908 = -1;
		Static1.anInt1 = -1;
		Static477.anInt7888 = 0;
		Static537.anInt8622 = Static506.anInt8251;
		Static6.anInt137 = Static350.anInt6080;
		Static207.anInt3795 = Static494.anInt8029;
	}
}
