import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "Lclient!ja;")
	public static final Class154 aClass154_14 = new Class154();

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
	public static int anInt8807 = -1;

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
	public static int anInt8808 = 0;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIII)I")
	public static int method6874(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
