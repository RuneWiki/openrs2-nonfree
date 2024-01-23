import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "P", descriptor = "Z")
	public static boolean aBoolean6;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "[I")
	public static int[] anIntArray4 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!a", name = "K", descriptor = "Lclient!il;")
	public static Class86 aClass86_1 = new Class86(32);

	@OriginalMember(owner = "client!a", name = "M", descriptor = "I")
	public static int anInt46 = 0;

	@OriginalMember(owner = "client!a", name = "O", descriptor = "I")
	public static int anInt48 = 0;

	@OriginalMember(owner = "client!a", name = "R", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!a", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[112];

	@OriginalMember(owner = "client!a", name = "T", descriptor = "I")
	public static int anInt50 = 0;
}
