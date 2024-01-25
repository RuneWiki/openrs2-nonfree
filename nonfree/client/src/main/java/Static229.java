import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static229 {

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "[Lclient!fc;")
	public static Class100[] aClass100Array1;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
	public static int anInt4278;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public static int anInt4277 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIII)I")
	public static int method3905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static90.aByteArrayArrayArray25[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static90.aByteArrayArrayArray25[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
