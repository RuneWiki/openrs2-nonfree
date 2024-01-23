import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!ak;")
	public static Class7 aClass7_198;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "I")
	public static int anInt4977 = 0;

	@OriginalMember(owner = "client!se", name = "E", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray17 = new int[2][][];

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)Lclient!og;")
	public static Class127 method3829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class127 local7 = Static75.method1287(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass127Array1 == null || local7.aClass127Array1.length <= arg0) {
			return null;
		} else {
			return local7.aClass127Array1[arg0];
		}
	}
}
