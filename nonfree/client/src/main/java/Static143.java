import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!eu", name = "C", descriptor = "D")
	public static double aDouble8;

	@OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
	public static int anInt2383;

	@OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
	public static int anInt2376 = -1;

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
	public static final int anInt2379 = 1405;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(IB)[I")
	public static int[] method2155(@OriginalArg(0) int arg0) {
		Static625.method8337(Static18.method271(arg0));
		return new int[] { Static594.aCalendar3.get(5), Static594.aCalendar3.get(2), Static594.aCalendar3.get(1) };
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(II)I")
	public static int method2156(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
