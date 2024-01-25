import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static566 {

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "J")
	public static long aLong250;

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "Lclient!mr;")
	public static Class223 aClass223_60;

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
	public static int anInt9413;

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_137 = new Class200(100, 5);

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)Z")
	public static boolean method8110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static242.method3966(arg0, arg1) | (arg1 & 0x70000) != 0 || Static375.method6039(arg0, arg1);
	}
}
