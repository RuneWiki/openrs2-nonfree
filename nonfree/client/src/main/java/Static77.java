import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ds", name = "A", descriptor = "Z")
	public static boolean aBoolean90;

	@OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
	public static int anInt1587 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIBI)I")
	public static int method1378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
