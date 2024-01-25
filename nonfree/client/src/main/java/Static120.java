import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!eda", name = "M", descriptor = "Lclient!fo;")
	public static Class109 aClass109_3;

	@OriginalMember(owner = "client!eda", name = "J", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_26 = new Class316(8, -1);

	@OriginalMember(owner = "client!eda", name = "K", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BII)Z")
	public static boolean method1870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static366.method5425(arg1, arg0) | (arg1 & 0x70000) != 0 || Static19.method253(arg1, arg0);
	}
}
