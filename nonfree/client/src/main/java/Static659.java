import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static659 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
	public static int anInt10542;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJ)V")
	public static void method9126(@OriginalArg(1) long arg0) {
		Static379.aCalendar19.setTime(new Date(arg0));
	}
}
