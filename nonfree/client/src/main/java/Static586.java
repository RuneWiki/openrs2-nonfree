import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static586 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_247 = new Class160(90, 12);

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Z")
	public static boolean aBoolean669 = false;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(JB)V")
	public static void method8349(@OriginalArg(0) long arg0) {
		Static183.aCalendar2.setTime(new Date(arg0));
	}
}
