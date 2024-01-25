import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static221 {

	@OriginalMember(owner = "client!il", name = "y", descriptor = "Lclient!vo;")
	public static Class348 aClass348_16;

	@OriginalMember(owner = "client!il", name = "G", descriptor = "J")
	public static long aLong20;

	@OriginalMember(owner = "client!il", name = "E", descriptor = "[I")
	public static final int[] anIntArray27 = new int[1000];

	@OriginalMember(owner = "client!il", name = "H", descriptor = "I")
	public static int anInt1106 = 0;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
	public static void method954() {
		Static117.aBoolean207 = false;
		Static430.method6395(Static593.anInt10604, Static303.anInt6098, Static469.anInt8895, Static340.anInt6537);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)Z")
	public static boolean method956(@OriginalArg(0) int arg0) {
		if (arg0 == 4 || arg0 == 46 || arg0 == 21 || arg0 == 48 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 19 || arg0 == 1011;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIBZLjava/lang/String;)V")
	public static void method957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		Static392.method2874(arg0, null, arg3, arg2, false, arg1);
	}
}
