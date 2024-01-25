import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_135 = new Class81(55, -2);

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_136 = new Class81(93, 6);

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_137 = new Class81(82, 8);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBII)I")
	public static int method4511(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg2;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
	public static void method4512(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static351.anInt6176 = arg1;
		Static75.anInt1858 = 0;
		Static175.anInt3399 = arg0;
		Static331.anInt5894 = 0;
	}
}
