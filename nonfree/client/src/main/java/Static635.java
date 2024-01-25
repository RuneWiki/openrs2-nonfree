import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static635 {

	@OriginalMember(owner = "client!via", name = "a", descriptor = "Lclient!la;")
	public static Class208 aClass208_143;

	@OriginalMember(owner = "client!via", name = "b", descriptor = "I")
	public static int anInt10331;

	@OriginalMember(owner = "client!via", name = "d", descriptor = "I")
	public static int anInt10332;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IILclient!cn;)I")
	public static int method8871(@OriginalArg(1) int arg0, @OriginalArg(2) Class73 arg1) {
		if (!Static81.method1252(arg1).method7126(arg0) && arg1.anObjectArray31 == null) {
			return -1;
		} else if (arg1.anIntArray66 == null || arg1.anIntArray66.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray66[arg0];
		}
	}
}
