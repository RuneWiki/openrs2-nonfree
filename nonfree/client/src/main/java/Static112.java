import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static112 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!mb;")
	public static Class70 aClass70_27;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "J")
	public static long aLong89;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "Lclient!ia;")
	private static Class51 aClass51_809 = Static64.method1101("Prepared sound engine");

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "Lclient!ia;")
	public static Class51 aClass51_810 = aClass51_809;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "[I")
	public static int[] anIntArray142 = new int[5];

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Z")
	public static boolean method1883() {
		return Static45.aBoolean52;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!me;)Lclient!ia;")
	public static Class51 method1884(@OriginalArg(1) Class71 arg0) {
		if (Static73.method1284(Static33.method587(arg0)) == 0) {
			return null;
		} else if (arg0.aClass51_983 == null || arg0.aClass51_983.method1436().method1399() == 0) {
			return Static135.aBoolean135 ? Static116.aClass51_395 : null;
		} else {
			return arg0.aClass51_983;
		}
	}
}
