import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static323 {

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
	public static int anInt5538;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_119 = new Class205(5, -1);

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	public static int anInt5535 = 0;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_86 = new Class32("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_120 = new Class205(26, 4);

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Z")
	public static boolean aBoolean407 = false;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_82 = new Class11(50, 8);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIBIIII)Z")
	public static boolean method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < arg4 + arg3 && arg0 + arg7 > arg3) {
			return arg5 < arg2 + arg6 && arg1 + arg5 > arg6;
		} else {
			return false;
		}
	}
}
