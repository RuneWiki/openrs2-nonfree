import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Z")
	public static boolean aBoolean672 = false;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_131 = new Class61(77, -1);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	public static void method7800() {
		Static249.aClass66_9.method6806(Static404.aFloat142, Static462.aFloat158, Static549.aFloat196);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)Z")
	public static boolean method7801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
	public static void method7802() {
		@Pc(5) Class223 local5 = Static291.aClass223_42;
		synchronized (Static291.aClass223_42) {
			Static291.aClass223_42.method4932();
		}
		local5 = Static52.aClass223_7;
		synchronized (Static52.aClass223_7) {
			Static52.aClass223_7.method4932();
		}
	}
}
