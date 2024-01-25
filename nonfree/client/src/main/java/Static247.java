import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!iea", name = "K", descriptor = "I")
	public static final int anInt4856 = 1407;

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(BI)[I")
	public static int[] method4405(@OriginalArg(1) int arg0) {
		@Pc(6) int[] local6 = new int[3];
		Static345.method5977(Static155.method3184(arg0));
		local6[0] = Static550.aCalendar2.get(5);
		local6[1] = Static550.aCalendar2.get(2);
		local6[2] = Static550.aCalendar2.get(1);
		return local6;
	}
}
