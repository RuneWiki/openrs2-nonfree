import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static567 {

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public static int anInt9819;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
	public static int anInt9818 = -1;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray82 = new int[128][128];

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "S")
	public static short aShort127 = 256;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!jr;B)Lclient!qp;")
	public static Class19_Sub3 method7824(@OriginalArg(0) Class6_Sub12 arg0) {
		return new Class19_Sub3(arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6037(), arg0.method6019());
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIII)V")
	public static void method7826(@OriginalArg(0) boolean arg0) {
		Static107.anInt1830 = 2;
		Static480.aBoolean552 = arg0;
		Static313.anInt6055 = 22050;
	}
}
