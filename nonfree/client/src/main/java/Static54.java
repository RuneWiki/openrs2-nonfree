import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public static int anInt1158;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "Lclient!fg;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public static int anInt1162 = -1;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_9 = new Class85(16);

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_557 = Static193.method3027("Angreifen");

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
	public static int anInt1163 = 0;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
	public static int anInt1164 = 0;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_10 = new Class85(100);

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_558 = Static193.method3027("Discard");

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "Lclient!oc;")
	public static Class70 aClass70_559 = aClass70_558;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIBIII)I")
	public static int method866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg5;
			arg5 = local10;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg4;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg1;
		} else {
			return 7 + 1 - arg4 - arg5;
		}
	}
}
