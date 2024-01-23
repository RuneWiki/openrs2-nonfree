import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!qf;")
	public static Class146 aClass146_5;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method1150() {
		@Pc(12) int local12 = Static143.anInt2824;
		@Pc(14) int local14 = Static78.anInt1455;
		@Pc(16) int local16 = Static44.anInt848;
		@Pc(18) int local18 = Static66.anInt1303;
		if (Static291.aBoolean404) {
			Static133.method2176(local12, local14, local16, local18, 6116423);
			Static133.method2176(local12 + 1, local14 + 1, local16 - 2, 16, 0);
			Static133.method2164(local12 + 1, local14 + 18, local16 - 2, local18 - 19, 0);
		} else {
			Static41.method730(local12, local14, local16, local18, 6116423);
			Static41.method730(local12 + 1, local14 + 1, local16 - 2, 16, 0);
			Static41.method729(local12 + 1, local14 + 18, local16 - 2, local18 + -19, 0);
		}
		Static245.aClass1_Sub1_Sub12_2.method4421(Static143.aString98, local12 + 3, local14 - -14, 6116423, -1);
		@Pc(101) int local101 = Static152.anInt3132;
		@Pc(103) int local103 = Static300.anInt5678;
		for (@Pc(105) int local105 = 0; local105 < Static316.anInt5941; local105++) {
			@Pc(124) int local124 = local14 + (Static316.anInt5941 - local105 + -1) * 15 + 31;
			@Pc(126) int local126 = 16777215;
			if (local101 > local12 && local12 + local16 > local101 && local103 > local124 - 13 && local124 + 3 > local103) {
				local126 = 16776960;
			}
			Static245.aClass1_Sub1_Sub12_2.method4421(Static190.method3114(local105), local12 + 3, local124, local126, 0);
		}
		Static247.method3813(Static44.anInt848, Static66.anInt1303, Static78.anInt1455, Static143.anInt2824);
	}
}
