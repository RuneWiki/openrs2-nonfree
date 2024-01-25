import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!baa", name = "s", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!baa", name = "z", descriptor = "J")
	public static volatile long aLong37 = 0L;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!ik;)I")
	public static int method1090(@OriginalArg(1) Class182 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3964(Static212.anInt3495)) {
			local5++;
		}
		if (arg0.method3964(Static96.anInt10761)) {
			local5++;
		}
		if (arg0.method3964(Static486.anInt7654)) {
			local5++;
		}
		if (arg0.method3964(Static336.anInt5407)) {
			local5++;
		}
		if (arg0.method3964(Static117.anInt2409)) {
			local5++;
		}
		if (arg0.method3964(Static189.anInt3241)) {
			local5++;
		}
		if (arg0.method3964(Static413.anInt6380)) {
			local5++;
		}
		if (arg0.method3964(Static642.anInt9924)) {
			local5++;
		}
		if (arg0.method3964(Static533.anInt8302)) {
			local5++;
		}
		if (arg0.method3964(Static217.anInt3585)) {
			local5++;
		}
		if (arg0.method3964(Static39.anInt1223)) {
			local5++;
		}
		if (arg0.method3964(Static642.anInt9932)) {
			local5++;
		}
		if (arg0.method3964(Static45.anInt1287)) {
			local5++;
		}
		if (arg0.method3964(Static137.anInt2610)) {
			local5++;
		}
		if (arg0.method3964(Static354.anInt5610)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IB)I")
	public static int method1092(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static454.method6020(arg0);
	}
}
