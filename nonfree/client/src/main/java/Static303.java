import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!th", name = "F", descriptor = "I")
	public static int anInt5804;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "I")
	public static volatile int anInt5807 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V")
	public static void method4896() {
		@Pc(1) Class103 local1 = Static189.aClass103_34;
		synchronized (Static189.aClass103_34) {
			Static189.aClass103_34.method2679(5);
		}
		local1 = Static179.aClass103_30;
		synchronized (Static179.aClass103_30) {
			Static179.aClass103_30.method2679(5);
		}
	}
}
