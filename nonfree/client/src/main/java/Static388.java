import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
	public static void method5728() {
		@Pc(3) Class309[] local3 = Class222.aClass309Array5;
		synchronized (Class222.aClass309Array5) {
			for (@Pc(7) int local7 = 0; local7 < Class222.aClass309Array5.length; local7++) {
				Class222.aClass309Array5[local7] = new Class309();
				Static537.anIntArray350[local7] = 0;
			}
		}
	}
}
