import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
	public static int anInt913;

	@OriginalMember(owner = "client!bw", name = "y", descriptor = "Lclient!gda;")
	public static Class126 aClass126_40;

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
	public static int anInt915 = -1;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
	public static void method933() {
		if (Static670.aClass242_7 != Static478.aClass242_9) {
			try {
				Static684.method782(Static189.aClient1, "tbrefresh");
			} catch (@Pc(24) Throwable local24) {
			}
		}
	}
}
