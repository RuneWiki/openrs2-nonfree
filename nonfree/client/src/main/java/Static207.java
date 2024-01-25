import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static207 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gg", name = "K", descriptor = "Ljava/lang/Class;")
	public static Class aClass11;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(JI)V")
	public static void method3080(@OriginalArg(0) long arg0) {
		Static321.aCalendar11.setTime(new Date(arg0));
	}
}
