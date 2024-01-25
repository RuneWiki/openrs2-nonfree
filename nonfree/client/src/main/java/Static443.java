import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "[I")
	public static int[] anIntArray605;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_96 = new Class212(12, 16);

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
	public static int anInt7558 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIII)I")
	public static int method6061(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}
}
