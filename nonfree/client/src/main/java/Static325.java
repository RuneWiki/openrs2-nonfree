import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method4555() {
		Static620.aBoolean886 = true;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(JI)V")
	public static void method4556(@OriginalArg(0) long arg0) {
		Static246.aCalendar4.setTime(new Date(arg0));
	}
}
