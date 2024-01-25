import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	public static int anInt7582;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_6 = new Class6(8, 1);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)I")
	public static int method6496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg0;
		}
	}
}
