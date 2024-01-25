import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
	public static void method2099() {
		Static500.method7435();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static510.aClass184Array1[local13].method4591();
		}
		Static38.method804();
		Static514.method1479();
		System.gc();
	}
}
