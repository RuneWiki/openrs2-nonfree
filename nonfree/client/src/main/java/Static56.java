import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!jj;")
	public static Class108 aClass108_19 = new Class108(16);

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public static int anInt2420 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method2569() {
		@Pc(5) Class70 local5 = Static69.aClass70_17;
		synchronized (Static69.aClass70_17) {
			Static69.aClass70_17.method1405();
		}
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)I")
	public static int method2573() {
		return 6;
	}
}
