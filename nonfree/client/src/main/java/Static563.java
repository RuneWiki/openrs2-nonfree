import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static563 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!ae;")
	public static Class8 aClass8_126;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
	public static boolean method7899(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!si;)I")
	public static int method7906(@OriginalArg(1) Class322 arg0) {
		if (arg0 == Static320.aClass322_5) {
			return 7681;
		} else if (Static131.aClass322_3 == arg0) {
			return 8448;
		} else if (arg0 == Static296.aClass322_4) {
			return 34165;
		} else if (Static116.aClass322_2 == arg0) {
			return 260;
		} else if (Static30.aClass322_1 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
