import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static277 {

	@OriginalMember(owner = "client!il", name = "c", descriptor = "[I")
	public static int[] anIntArray289;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "I")
	public static int anInt5059;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "[I")
	public static final int[] anIntArray288 = new int[1];

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)I")
	public static int method4235(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static6.method106(arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)V")
	public static void method4236(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static6.aByteArrayArrayArray1 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)Z")
	public static boolean method4237() {
		return Static178.anInt3225 >= 1;
	}
}
