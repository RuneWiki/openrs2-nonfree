import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	public static void method6544() {
		@Pc(1) Class233 local1 = Static42.aClass233_2;
		synchronized (Static42.aClass233_2) {
			Static42.aClass233_2.method5665();
		}
		local1 = Static58.aClass233_5;
		synchronized (Static58.aClass233_5) {
			Static58.aClass233_5.method5665();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
	public static void method6545() {
		Static642.anIntArray742 = Static234.method3888(0.4F);
	}
}
