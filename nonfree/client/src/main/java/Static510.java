import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "Lclient!dp;")
	public static Class3_Sub6_Sub3 aClass3_Sub6_Sub3_3;

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "Lclient!rf;")
	public static Class284 aClass284_2;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_245 = new Class272(50, 7);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public static void method6826() {
		Static206.method3700(Static278.aClass3_Sub13_Sub1_1.anInt5161);
		@Pc(17) int local17 = (Static529.anInt8344 >> 3) + (Static421.anInt7061 >> 12);
		@Pc(26) int local26 = (Static233.anInt4431 >> 12) + (Static463.anInt7588 >> 3);
		Static209.anInt8182 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 = 0;
		Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5585(8, 8);
		Static475.aByteArrayArray25 = new byte[18][];
		Static101.aByteArrayArray6 = new byte[18][];
		Static232.anIntArray358 = new int[18];
		Static259.aByteArrayArray29 = new byte[18][];
		Static147.anIntArray258 = new int[18];
		Static167.anIntArrayArray27 = new int[18][4];
		Static548.anIntArray650 = new int[18];
		Static531.anIntArray635 = new int[18];
		Static557.anIntArray656 = new int[18];
		Static240.aByteArrayArray13 = new byte[18][];
		Static113.anIntArray189 = new int[18];
		Static411.aByteArrayArray22 = new byte[18][];
		@Pc(82) int local82 = 0;
		@Pc(101) int local101;
		for (@Pc(90) int local90 = (local17 - (Static400.anInt6818 >> 4)) / 8; local90 <= ((Static400.anInt6818 >> 4) + local17) / 8; local90++) {
			for (local101 = (local26 - (Static271.anInt5050 >> 4)) / 8; local101 <= ((Static271.anInt5050 >> 4) + local26) / 8; local101++) {
				@Pc(109) int local109 = (local90 << 8) + local101;
				Static548.anIntArray650[local82] = local109;
				Static147.anIntArray258[local82] = Static565.aClass246_261.method5665("m" + local90 + "_" + local101);
				Static557.anIntArray656[local82] = Static565.aClass246_261.method5665("l" + local90 + "_" + local101);
				Static531.anIntArray635[local82] = Static565.aClass246_261.method5665("n" + local90 + "_" + local101);
				Static113.anIntArray189[local82] = Static565.aClass246_261.method5665("um" + local90 + "_" + local101);
				Static232.anIntArray358[local82] = Static565.aClass246_261.method5665("ul" + local90 + "_" + local101);
				if (Static531.anIntArray635[local82] == -1) {
					Static147.anIntArray258[local82] = -1;
					Static557.anIntArray656[local82] = -1;
					Static113.anIntArray189[local82] = -1;
					Static232.anIntArray358[local82] = -1;
				}
				local82++;
			}
		}
		for (local101 = local82; local101 < Static531.anIntArray635.length; local101++) {
			Static531.anIntArray635[local101] = -1;
			Static147.anIntArray258[local101] = -1;
			Static557.anIntArray656[local101] = -1;
			Static113.anIntArray189[local101] = -1;
			Static232.anIntArray358[local101] = -1;
		}
		@Pc(281) byte local281;
		if (Static246.anInt4542 == 3) {
			local281 = 4;
		} else {
			local281 = 8;
		}
		Static23.method453(local281, false, local17, local26);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	public static void method6827() {
		Static294.aClass10_31.method263();
	}
}
