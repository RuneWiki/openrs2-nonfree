import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static277 {

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!kga", name = "r", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_97 = new Class56(9, -1);

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "S")
	public static short aShort76 = 1;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BII)Z")
	public static boolean method4173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static64.method1419(arg1, arg0) | (arg0 & 0x70000) != 0 || Static429.method6065(arg1, arg0);
	}
}
