import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public static int anInt5788;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	public static int anInt5784 = 0;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!fd;")
	public static final Class98 aClass98_3 = new Class98();

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)I")
	public static int method4801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}
}
