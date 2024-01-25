import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "[I")
	public static final int[] anIntArray56 = new int[4];

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public static int anInt1480 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZILclient!pn;Lclient!vo;ZI)V")
	public static void method1304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub21_Sub4 arg2, @OriginalArg(4) Class348 arg3) {
		Static586.method8188(arg0, arg3, arg1);
		Static132.aClass4_Sub21_Sub4_1 = arg2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method1305(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static313.anInt6277 = -1;
		Static274.anInt5755 = 1;
		Static200.method3273(false, arg0, arg1);
	}
}
