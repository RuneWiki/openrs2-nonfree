import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static345 {

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "Lclient!gga;")
	public static Class124 aClass124_75;

	@OriginalMember(owner = "client!lja", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!lja", name = "j", descriptor = "[I")
	public static int[] anIntArray317;

	@OriginalMember(owner = "client!lja", name = "d", descriptor = "[I")
	public static final int[] anIntArray316 = new int[200];

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(BJ)V")
	public static void method5977(@OriginalArg(1) long arg0) {
		Static550.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
