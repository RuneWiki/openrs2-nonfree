import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static524 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public static int anInt8784;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "F")
	public static float aFloat188;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!ps;")
	public static Class257 aClass257_5;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	public static final int[] anIntArray647 = new int[50];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z")
	public static boolean method7193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static288.method4675(arg0, arg1) | Static569.method7617(arg0, arg1) | Static422.method6090(arg1, arg0)) & Static552.method7481(arg1, arg0);
	}
}
