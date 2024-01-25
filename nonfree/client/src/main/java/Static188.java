import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gda", name = "M", descriptor = "[I")
	public static final int[] anIntArray170 = new int[3];

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)V")
	public static void method2726(@OriginalArg(0) byte arg0) {
		Static518.method7510(Static637.aClass5_Sub20_31.aClass24_Sub26_1.method8058());
		@Pc(20) int local20 = (Static532.anInt9189 >> 12) + (Static622.anInt10188 >> 3);
		Static240.anInt3974 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 = 0;
		@Pc(34) int local34 = (Static489.anInt8202 >> 12) + (Static668.anInt10683 >> 3);
		Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method3606(8, 8);
		Static401.anIntArray398 = new int[18];
		Static617.anIntArray562 = new int[18];
		Static319.aByteArrayArray13 = new byte[18][];
		Static444.aByteArrayArray23 = new byte[18][];
		Static379.anIntArray374 = new int[18];
		Static672.anIntArray621 = new int[18];
		Static13.anIntArray18 = new int[18];
		Static293.anIntArray287 = new int[18];
		Static411.aByteArrayArray21 = new byte[18][];
		Static445.aByteArrayArray24 = new byte[18][];
		Static261.anIntArrayArray30 = new int[18][4];
		Static494.aByteArrayArray27 = new byte[18][];
		@Pc(80) int local80 = 0;
		@Pc(98) int local98;
		for (@Pc(88) int local88 = (local20 - (Static544.anInt9261 >> 4)) / 8; local88 <= ((Static544.anInt9261 >> 4) + local20) / 8; local88++) {
			for (local98 = (local34 - (Static282.anInt4887 >> 4)) / 8; local98 <= (local34 + (Static282.anInt4887 >> 4)) / 8; local98++) {
				@Pc(107) int local107 = (local88 << 8) + local98;
				Static672.anIntArray621[local80] = local107;
				Static13.anIntArray18[local80] = Static609.aClass208_137.method4986("m" + local88 + "_" + local98, -119);
				Static617.anIntArray562[local80] = Static609.aClass208_137.method4986("l" + local88 + "_" + local98, -92);
				Static293.anIntArray287[local80] = Static609.aClass208_137.method4986("n" + local88 + "_" + local98, -120);
				Static401.anIntArray398[local80] = Static609.aClass208_137.method4986("um" + local88 + "_" + local98, arg0 ^ 0x19);
				Static379.anIntArray374[local80] = Static609.aClass208_137.method4986("ul" + local88 + "_" + local98, -71);
				if (Static293.anIntArray287[local80] == -1) {
					Static13.anIntArray18[local80] = -1;
					Static617.anIntArray562[local80] = -1;
					Static401.anIntArray398[local80] = -1;
					Static379.anIntArray374[local80] = -1;
				}
				local80++;
			}
		}
		for (local98 = local80; local98 < Static293.anIntArray287.length; local98++) {
			Static293.anIntArray287[local98] = -1;
			Static13.anIntArray18[local98] = -1;
			Static617.anIntArray562[local98] = -1;
			Static401.anIntArray398[local98] = -1;
			Static379.anIntArray374[local98] = -1;
		}
		if (arg0 != -81) {
			method2725(-58);
		}
		@Pc(302) byte local302;
		if (Static107.anInt1746 == 3) {
			local302 = 4;
		} else {
			local302 = 8;
		}
		Static286.method4303(local34, false, local302, local20);
	}

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)Z")
	public static boolean method2727() {
		Static377.aBoolean500 = true;
		Static237.anInt1804++;
		return true;
	}
}
