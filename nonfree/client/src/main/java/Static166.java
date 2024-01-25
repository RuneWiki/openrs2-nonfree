import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!gca", name = "H", descriptor = "Lclient!ri;")
	public static Class284 aClass284_53;

	@OriginalMember(owner = "client!gca", name = "J", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!gca", name = "F", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_57 = new Class287(72, -1);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	public static void method3009() {
		@Pc(12) Class269[] local12 = Class200.aClass269Array1;
		synchronized (Class200.aClass269Array1) {
			for (@Pc(16) int local16 = 0; local16 < Class200.aClass269Array1.length; local16++) {
				Class200.aClass269Array1[local16] = new Class269();
				Static73.anIntArray439[local16] = 0;
			}
		}
	}
}
