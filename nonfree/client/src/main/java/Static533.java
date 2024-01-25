import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public static int anInt8980 = 0;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public static int anInt8981 = -1;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public static int anInt8982 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)Z")
	public static boolean method7292(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(FFIF)I")
	public static int method7293(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local17 < local26 && local26 > local35) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
