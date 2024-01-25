import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "[Lclient!wr;")
	public static final Class363[] aClass363Array1 = new Class363[35];

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V")
	public static void method3723() {
		@Pc(3) Class209[] local3 = Class318.aClass209Array1;
		synchronized (Class318.aClass209Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class318.aClass209Array1.length; local7++) {
				Class318.aClass209Array1[local7] = new Class209();
				Static42.anIntArray83[local7] = 0;
			}
		}
	}
}
