import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[200];

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
	public static void method236() {
		Static41.method546(Static327.aClass230_Sub1_1.anInt7294);
		@Pc(18) int local18 = (Static302.anInt5030 >> 10) + (Static190.anInt3507 >> 3);
		@Pc(26) int local26 = (Static331.anInt6034 >> 3) + (Static4.anInt149 >> 10);
		Static1.anInt41 = Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 = 0;
		Static255.aClass47_Sub1_Sub5_Sub2_2.method4336(8, 8);
		Static68.anIntArray59 = new int[18];
		Static26.aByteArrayArray3 = new byte[18][];
		Static306.aByteArrayArray19 = new byte[18][];
		Static435.aByteArrayArray24 = new byte[18][];
		Static242.aByteArrayArray18 = new byte[18][];
		Static21.anIntArray25 = new int[18];
		Static57.anIntArray46 = new int[18];
		Static81.aByteArrayArray5 = new byte[18][];
		Static228.anIntArray311 = new int[18];
		Static28.anIntArray30 = new int[18];
		Static439.anIntArrayArray58 = new int[18][4];
		Static235.anIntArray330 = new int[18];
		@Pc(82) int local82 = 0;
		@Pc(101) int local101;
		for (@Pc(91) int local91 = (local18 - (Static80.anInt6558 >> 4)) / 8; local91 <= ((Static80.anInt6558 >> 4) + local18) / 8; local91++) {
			for (local101 = (local26 - (Static104.anInt2048 >> 4)) / 8; local101 <= (local26 + (Static104.anInt2048 >> 4)) / 8; local101++) {
				@Pc(109) int local109 = local101 + (local91 << 8);
				Static68.anIntArray59[local82] = local109;
				Static21.anIntArray25[local82] = Static162.aClass109_37.method2343("m" + local91 + "_" + local101);
				Static228.anIntArray311[local82] = Static162.aClass109_37.method2343("l" + local91 + "_" + local101);
				Static57.anIntArray46[local82] = Static162.aClass109_37.method2343("n" + local91 + "_" + local101);
				Static28.anIntArray30[local82] = Static162.aClass109_37.method2343("um" + local91 + "_" + local101);
				Static235.anIntArray330[local82] = Static162.aClass109_37.method2343("ul" + local91 + "_" + local101);
				if (Static57.anIntArray46[local82] == -1) {
					Static21.anIntArray25[local82] = -1;
					Static228.anIntArray311[local82] = -1;
					Static28.anIntArray30[local82] = -1;
					Static235.anIntArray330[local82] = -1;
				}
				local82++;
			}
		}
		for (local101 = local82; local101 < Static57.anIntArray46.length; local101++) {
			Static57.anIntArray46[local101] = -1;
			Static21.anIntArray25[local101] = -1;
			Static228.anIntArray311[local101] = -1;
			Static28.anIntArray30[local101] = -1;
			Static235.anIntArray330[local101] = -1;
		}
		Static389.method5445(local26, true, false, local18);
	}
}
