import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method4967() {
		@Pc(10) int local10 = Static2.aClass148_Sub1_1.method3051(Static288.anInt4743);
		if (local10 == 0) {
			Static111.aByteArrayArrayArray1 = null;
			Static112.method3106(0);
		} else if (local10 == 1) {
			Static200.method2688((byte) 0);
			Static112.method3106(512);
			if (Static253.aByteArrayArrayArray11 != null) {
				Static9.method121();
			}
		} else {
			Static200.method2688((byte) (Static197.anInt3347 - 4 & 0xFF));
			Static112.method3106(2);
		}
		Static434.anInt7019 = Static61.anInt1129;
	}
}
