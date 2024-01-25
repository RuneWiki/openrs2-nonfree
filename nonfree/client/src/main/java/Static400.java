import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "[I")
	public static int[] anIntArray525;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public static void method5477() {
		Static188.anInt3479 = 0;
		@Pc(11) int local11 = Static116.aClass1_Sub14_Sub2_1.method4499();
		@Pc(20) boolean local20 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
		@Pc(24) int local24 = Static116.aClass1_Sub14_Sub2_1.method4499();
		@Pc(28) int local28 = Static116.aClass1_Sub14_Sub2_1.method4548();
		Static41.method546(local28);
		@Pc(39) int local39 = (Static282.anInt4732 - Static116.aClass1_Sub14_Sub2_1.anInt5695) / 16;
		Static439.anIntArrayArray58 = new int[local39][4];
		for (@Pc(45) int local45 = 0; local45 < local39; local45++) {
			for (@Pc(49) int local49 = 0; local49 < 4; local49++) {
				Static439.anIntArrayArray58[local45][local49] = Static116.aClass1_Sub14_Sub2_1.method4500();
			}
		}
		Static235.anIntArray330 = new int[local39];
		Static28.anIntArray30 = new int[local39];
		Static228.anIntArray311 = new int[local39];
		Static242.aByteArrayArray18 = new byte[local39][];
		Static21.anIntArray25 = new int[local39];
		Static81.aByteArrayArray5 = null;
		Static26.aByteArrayArray3 = new byte[local39][];
		Static435.aByteArrayArray24 = new byte[local39][];
		Static68.anIntArray59 = new int[local39];
		Static306.aByteArrayArray19 = new byte[local39][];
		Static57.anIntArray46 = null;
		local39 = 0;
		for (@Pc(121) int local121 = (local11 - (Static80.anInt6558 >> 4)) / 8; local121 <= ((Static80.anInt6558 >> 4) + local11) / 8; local121++) {
			for (@Pc(132) int local132 = (local24 - (Static104.anInt2048 >> 4)) / 8; local132 <= (local24 + (Static104.anInt2048 >> 4)) / 8; local132++) {
				Static68.anIntArray59[local39] = (local121 << 8) + local132;
				Static21.anIntArray25[local39] = Static162.aClass109_37.method2343("m" + local121 + "_" + local132);
				Static228.anIntArray311[local39] = Static162.aClass109_37.method2343("l" + local121 + "_" + local132);
				Static28.anIntArray30[local39] = Static162.aClass109_37.method2343("um" + local121 + "_" + local132);
				Static235.anIntArray330[local39] = Static162.aClass109_37.method2343("ul" + local121 + "_" + local132);
				local39++;
			}
		}
		Static389.method5445(local24, false, local20, local11);
	}
}
