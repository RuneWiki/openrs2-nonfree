import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static77 {

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	public static int anInt1540;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_20 = new Class25(22, -1);

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "[I")
	public static final int[] anIntArray162 = new int[6];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZI)Z")
	public static boolean method1446(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([II[J)V")
	public static void method1447(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static8.method124(arg0, arg1.length - 1, arg1, 0);
	}
}
