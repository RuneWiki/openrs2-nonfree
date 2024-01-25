import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "[I")
	public static int[] anIntArray112;

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
	public static int anInt2326;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
	public static int anInt2321 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	public static void method1840() {
		@Pc(1) Class167 local1 = Static416.aClass167_95;
		synchronized (Static416.aClass167_95) {
			Static416.aClass167_95.method3390();
		}
		local1 = Static43.aClass167_74;
		synchronized (Static43.aClass167_74) {
			Static43.aClass167_74.method3390();
		}
	}
}
