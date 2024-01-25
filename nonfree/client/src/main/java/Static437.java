import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "Lclient!ie;")
	public static Class142 aClass142_1 = new Class142(8);

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "[I")
	public static final int[] anIntArray450 = new int[1];

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
	public static void method6114() {
		@Pc(3) Class178[] local3 = RuntimeException_Sub1.aClass178Array1;
		synchronized (RuntimeException_Sub1.aClass178Array1) {
			for (@Pc(12) int local12 = 0; local12 < RuntimeException_Sub1.aClass178Array1.length; local12++) {
				RuntimeException_Sub1.aClass178Array1[local12] = new Class178();
				Static521.anIntArray541[local12] = 0;
			}
		}
	}
}
