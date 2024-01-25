import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gq", name = "S", descriptor = "Lclient!fm;")
	public static Class75 aClass75_2;

	@OriginalMember(owner = "client!gq", name = "F", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!gq", name = "R", descriptor = "Lclient!hl;")
	public static final Class96 aClass96_15 = new Class96(512);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIII)I")
	public static int method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1023 - arg1;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}
}
