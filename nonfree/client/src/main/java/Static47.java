import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
	public static int anInt1065;

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
	public static int anInt1066;

	@OriginalMember(owner = "client!cm", name = "A", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
	public static int anInt1069 = 0;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
	public static void method903() {
		Static173.method3264((long) Static342.anInt6706, Static164.aClass92_7);
		if (Static310.anInt6220 != -1) {
			Static220.method3777(Static310.anInt6220);
		}
		for (@Pc(18) int local18 = 0; local18 < Static2.anInt5069; local18++) {
			if (Static60.aBooleanArray8[local18]) {
				Static128.aBooleanArray19[local18] = true;
			}
			Static105.aBooleanArray30[local18] = Static60.aBooleanArray8[local18];
			Static60.aBooleanArray8[local18] = false;
		}
		Static249.anInt5198 = Static342.anInt6706;
		if (Static164.aClass92_7.method4463()) {
			Static347.aBoolean590 = true;
		}
		Static63.aClass72_6 = null;
		if (Static310.anInt6220 != -1) {
			Static2.anInt5069 = 0;
			Static354.method4051();
		}
		Static164.aClass92_7.method4467();
		Static129.method2602(Static277.anInt5630);
		Static106.anInt2370 = 0;
	}
}
