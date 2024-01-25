import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!rka", name = "c", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_86 = new Class144(22, -1);

	@OriginalMember(owner = "client!rka", name = "d", descriptor = "S")
	public static short aShort92 = 320;

	@OriginalMember(owner = "client!rka", name = "g", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_152 = new Class397(103, 4);

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(IIII)I")
	public static int method7352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}
}
