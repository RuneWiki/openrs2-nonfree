import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static144 {

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!qg;")
	public static Class87 aClass87_8;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public static int anInt2943 = 1;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_53 = new Class92(40, -1);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)Z")
	public static boolean method2459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static240.method3702(arg0, arg1) & Static214.method3234(arg1, arg0);
	}
}
