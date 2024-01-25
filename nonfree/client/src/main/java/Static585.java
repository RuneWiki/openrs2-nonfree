import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static585 {

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	public static int anInt9330;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Z")
	public static boolean method8157(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(JZ)V")
	public static void method8158(@OriginalArg(0) long arg0) {
		Static390.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([[II)V")
	public static void method8159(@OriginalArg(0) int[][] arg0) {
		Static36.anIntArrayArray4 = arg0;
	}
}
