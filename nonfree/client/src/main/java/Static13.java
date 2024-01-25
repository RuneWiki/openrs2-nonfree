import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "J")
	public static long aLong235;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "Lclient!oh;")
	public static Class237 aClass237_124;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!tp;IB)I")
	public static int method7361(@OriginalArg(0) Class331 arg0, @OriginalArg(1) int arg1) {
		if (!Static73.method1921(arg0).method5220(arg1) && arg0.anObjectArray10 == null) {
			return -1;
		} else if (arg0.anIntArray521 == null || arg1 >= arg0.anIntArray521.length) {
			return -1;
		} else {
			return arg0.anIntArray521[arg1];
		}
	}
}
