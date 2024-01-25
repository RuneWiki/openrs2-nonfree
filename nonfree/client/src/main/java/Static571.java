import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
	public static int anInt8992;

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
	public static int anInt8999 = 0;

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "[I")
	public static final int[] anIntArray656 = new int[32];

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "[I")
	public static final int[] anIntArray657 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)I")
	public static int method7939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg0;
		}
	}
}
