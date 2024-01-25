import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	public static int anInt5975;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "[S")
	public static short[] aShortArray87;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_140 = new Class180(123, -1);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)I")
	public static int method5402(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static76.anInt1404;
		if (local10 == 0) {
			return arg0 ? 0 : Static485.anInt8031;
		} else if (local10 == 1) {
			return Static485.anInt8031;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
