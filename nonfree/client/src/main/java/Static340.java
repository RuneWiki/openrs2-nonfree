import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static340 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "F")
	public static float aFloat117;

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "Lclient!ub;")
	public static Class344 aClass344_7;

	@OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
	public static int anInt5689;

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
	public static int anInt5684 = 0;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)Z")
	public static boolean method5194(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static204.method3648(arg1, arg0) | (arg0 & 0x800) != 0 || Static639.method8893(arg1, arg0);
	}
}
