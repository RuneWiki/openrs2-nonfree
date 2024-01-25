import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
	public static int anInt1419 = 0;

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	public static void method1342() {
		Static37.method813(Static301.anInt5429);
		@Pc(16) int local16 = (Static376.anInt6607 >> 3) + (Static160.anInt2915 >> 10);
		Static331.anInt5804 = Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 = 0;
		@Pc(29) int local29 = (Static133.anInt2474 >> 3) + (Static22.anInt547 >> 10);
		Static267.aClass12_Sub1_Sub2_Sub2_1.method4722(8, 8);
		Static304.anIntArray254 = new int[18];
		Static272.aByteArrayArray17 = new byte[18][];
		Static135.aByteArrayArray9 = new byte[18][];
		Static371.aByteArrayArray22 = new byte[18][];
		Static67.aByteArrayArray7 = new byte[18][];
		Static255.anIntArray231 = new int[18];
		Static345.anIntArray727 = new int[18];
		Static249.anIntArrayArray33 = new int[18][4];
		Static383.anIntArray805 = new int[18];
		Static372.anIntArray785 = new int[18];
		Static385.aByteArrayArray24 = new byte[18][];
		Static37.anIntArray118 = new int[18];
		@Pc(75) int local75 = 0;
		@Pc(103) int local103;
		for (@Pc(84) int local84 = (local16 - (Static392.anInt6751 >> 4)) / 8; local84 <= ((Static392.anInt6751 >> 4) + local16) / 8; local84++) {
			for (@Pc(95) int local95 = (local29 - (Static307.anInt5484 >> 4)) / 8; local95 <= (local29 + (Static307.anInt5484 >> 4)) / 8; local95++) {
				local103 = (local84 << 8) + local95;
				Static372.anIntArray785[local75] = local103;
				Static255.anIntArray231[local75] = Static200.aClass71_48.method1568("m" + local84 + "_" + local95);
				Static345.anIntArray727[local75] = Static200.aClass71_48.method1568("l" + local84 + "_" + local95);
				Static304.anIntArray254[local75] = Static200.aClass71_48.method1568("n" + local84 + "_" + local95);
				Static37.anIntArray118[local75] = Static200.aClass71_48.method1568("um" + local84 + "_" + local95);
				Static383.anIntArray805[local75] = Static200.aClass71_48.method1568("ul" + local84 + "_" + local95);
				if (Static304.anIntArray254[local75] == -1) {
					Static255.anIntArray231[local75] = -1;
					Static345.anIntArray727[local75] = -1;
					Static37.anIntArray118[local75] = -1;
					Static383.anIntArray805[local75] = -1;
				}
				local75++;
			}
		}
		for (local103 = local75; local103 < Static304.anIntArray254.length; local103++) {
			Static304.anIntArray254[local103] = -1;
			Static255.anIntArray231[local103] = -1;
			Static345.anIntArray727[local103] = -1;
			Static37.anIntArray118[local103] = -1;
			Static383.anIntArray805[local103] = -1;
		}
		Static386.method1339(local16, local29, true, false);
	}
}
