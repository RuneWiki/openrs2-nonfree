import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!l", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public static void method1510(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub3_Sub13 local12 = Static397.method4998(12, arg0);
		local12.method3458();
	}
}
