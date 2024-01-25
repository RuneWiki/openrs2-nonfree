import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static494 {

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
	public static int anInt9306;

	@OriginalMember(owner = "client!sv", name = "F", descriptor = "I")
	public static int anInt9313 = 0;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Lclient!oda;")
	public static Class244 method7139() {
		return Static279.method4474();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z")
	public static boolean method7140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
