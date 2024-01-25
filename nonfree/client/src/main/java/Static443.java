import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "Lclient!dba;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "[I")
	public static final int[] anIntArray487 = new int[13];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILclient!de;)I")
	public static int method6841(@OriginalArg(1) Class61 arg0) {
		if (arg0 == Static119.aClass61_5) {
			return 9216;
		} else if (Static380.aClass61_4 == arg0) {
			return 34065;
		} else if (Static78.aClass61_1 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!di;)V")
	public static void method6843(@OriginalArg(0) Class65 arg0) {
		Static94.aClass65_1 = arg0;
	}
}
