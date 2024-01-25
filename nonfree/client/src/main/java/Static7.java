import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "[Lclient!ic;")
	public static Class168[] aClass168Array1;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "[Lclient!qs;")
	public static Class303[] aClass303Array1;

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "Lclient!nv;")
	public static final Class258 aClass258_2 = new Class258();

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_1 = new Class160(27, -2);

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!qga;BI)I")
	public static int method103(@OriginalArg(0) Class299 arg0, @OriginalArg(2) int arg1) {
		if (!Static80.method1360(arg0).method479(arg1) && arg0.anObjectArray15 == null) {
			return -1;
		} else if (arg0.anIntArray438 == null || arg0.anIntArray438.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray438[arg1];
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IBI)Z")
	public static boolean method105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
