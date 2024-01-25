import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!k", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[128][128];

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	public static int anInt3801 = -2;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
	public static final int[] anIntArray274 = new int[14];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!rl;[BZIIIZI)Lclient!oc;")
	public static Class19_Sub4_Sub1 method3130(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean393 || Static99.method4914(arg3) && Static99.method4914(arg2)) {
			return new Class19_Sub4_Sub1(arg0, 3553, 6406, arg3, arg2, false, arg1, 6406);
		} else if (arg0.aBoolean396) {
			return new Class19_Sub4_Sub1(arg0, 34037, 6406, arg3, arg2, false, arg1, 6406);
		} else {
			return new Class19_Sub4_Sub1(arg0, 6406, arg3, arg2, Static52.method1203(arg3), Static52.method1203(arg2), arg1, 6406);
		}
	}
}
