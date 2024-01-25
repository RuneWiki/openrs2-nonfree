import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!m;")
	public static Class193_Sub1 aClass193_Sub1_1;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "[I")
	public static final int[] anIntArray394 = new int[1000];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method3007() {
		Static121.method1820();
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static296.aClass295Array3[local16].method6550();
		}
		Static260.method3646();
		Static244.method3524();
		System.gc();
	}
}
