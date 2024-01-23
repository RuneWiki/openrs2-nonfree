import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
	public static int anInt5500;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
	public static int anInt5494 = -1;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
	public static int anInt5497 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
	public static void method4363(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = Static96.aClass151_1;
		synchronized (Static96.aClass151_1) {
			Static82.anInt1579 = arg0;
		}
	}
}
