import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static432 {

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
	public static int anInt7313;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBI)Z")
	public static boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static95.method1800(arg0, arg1) || Static500.method5655(arg0, arg1);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(BLclient!r;)V")
	public static void method6070(@OriginalArg(1) Class12 arg0) {
		if (Static294.aBoolean407) {
			Static420.method6357(arg0);
		} else {
			Static508.method1299(arg0);
		}
	}
}
