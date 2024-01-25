import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static306 {

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
	public static int anInt5330;

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
	public static int anInt5332;

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
	public static int anInt5334 = 1;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljava/lang/String;IZZLjava/lang/String;)V")
	public static void method4769(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		Static267.method4303(arg3, arg0, arg2, true, -1, arg1);
	}
}
