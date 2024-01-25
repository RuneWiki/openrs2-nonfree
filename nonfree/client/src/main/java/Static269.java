import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
	public static int anInt4731;

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
	public static int anInt4733;

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_94 = new Class56(54, 11);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIB)Z")
	public static boolean method4101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIII)I")
	public static int method4104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 4095 - arg1;
		} else if (local7 == 2) {
			return 4095 - arg0;
		} else {
			return arg1;
		}
	}
}
