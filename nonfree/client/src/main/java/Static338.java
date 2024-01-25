import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "[J")
	public static long[] aLongArray25;

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "(I)V")
	public static void method7634() {
		Static404.method5619(Static348.aClass1_Sub30_Sub1_1.anInt4864);
		@Pc(17) int local17 = (Static541.anInt9058 >> 3) + (Static405.anInt7085 >> 12);
		@Pc(25) int local25 = (Static59.anInt1132 >> 12) + (Static116.anInt2289 >> 3);
		Static433.anInt7592 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 = 0;
		Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.method1444(8, 8);
		Static103.aByteArrayArray11 = new byte[18][];
		Static342.anIntArrayArray132 = new int[18][4];
		Static279.anIntArray375 = new int[18];
		Static269.aByteArrayArray20 = new byte[18][];
		Static259.anIntArray367 = new int[18];
		Static405.anIntArray542 = new int[18];
		Static317.aByteArrayArray21 = new byte[18][];
		Static566.anIntArray710 = new int[18];
		Static101.anIntArray182 = new int[18];
		Static173.aByteArrayArray15 = new byte[18][];
		Static162.anIntArray263 = new int[18];
		Static481.aByteArrayArray30 = new byte[18][];
		@Pc(78) int local78 = 0;
		@Pc(96) int local96;
		for (@Pc(86) int local86 = (local17 - (Static71.anInt1410 >> 4)) / 8; local86 <= ((Static71.anInt1410 >> 4) + local17) / 8; local86++) {
			for (local96 = (local25 - (Static471.anInt8012 >> 4)) / 8; local96 <= ((Static471.anInt8012 >> 4) + local25) / 8; local96++) {
				@Pc(105) int local105 = (local86 << 8) + local96;
				Static566.anIntArray710[local78] = local105;
				Static259.anIntArray367[local78] = Static559.aClass270_116.method5677("m" + local86 + "_" + local96);
				Static162.anIntArray263[local78] = Static559.aClass270_116.method5677("l" + local86 + "_" + local96);
				Static101.anIntArray182[local78] = Static559.aClass270_116.method5677("n" + local86 + "_" + local96);
				Static279.anIntArray375[local78] = Static559.aClass270_116.method5677("um" + local86 + "_" + local96);
				Static405.anIntArray542[local78] = Static559.aClass270_116.method5677("ul" + local86 + "_" + local96);
				if (Static101.anIntArray182[local78] == -1) {
					Static259.anIntArray367[local78] = -1;
					Static162.anIntArray263[local78] = -1;
					Static279.anIntArray375[local78] = -1;
					Static405.anIntArray542[local78] = -1;
				}
				local78++;
			}
		}
		for (local96 = local78; local96 < Static101.anIntArray182.length; local96++) {
			Static101.anIntArray182[local96] = -1;
			Static259.anIntArray367[local96] = -1;
			Static162.anIntArray263[local96] = -1;
			Static279.anIntArray375[local96] = -1;
			Static405.anIntArray542[local96] = -1;
		}
		@Pc(284) byte local284;
		if (Static216.anInt4135 == 3) {
			local284 = 4;
		} else {
			local284 = 8;
		}
		Static498.method6987(local17, false, local25, local284);
	}
}
