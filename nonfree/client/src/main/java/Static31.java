import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
	public static int anInt3294 = 0;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_51 = new Class208(14, 3);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBI)Z")
	public static boolean method2712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static140.method2190(arg0, arg1) || Static7.method94(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static296.method4225(arg0, arg1);
		}
	}
}
