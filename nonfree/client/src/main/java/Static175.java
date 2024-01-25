import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "([BB)V")
	public static void method3256(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub34 local12 = new Class2_Sub34(arg0);
		while (true) {
			@Pc(16) int local16 = local12.method6904();
			if (local16 == 0) {
				return;
			}
			if (local16 == 2) {
				Static415.anInt7581 = local12.method6884();
			}
		}
	}
}
