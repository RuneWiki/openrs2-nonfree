import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static613 {

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
	public static int anInt10156;

	@OriginalMember(owner = "client!vr", name = "N", descriptor = "I")
	public static int anInt10162;

	@OriginalMember(owner = "client!vr", name = "D", descriptor = "[I")
	public static final int[] anIntArray617 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!vr", name = "H", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_146 = new Class218(49, 4);

	@OriginalMember(owner = "client!vr", name = "K", descriptor = "F")
	public static float aFloat279 = 1.0F;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)Z")
	public static boolean method8342(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method8343(@OriginalArg(1) String arg0) {
		if (Class2_Sub3_Sub2.aString69.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class2_Sub3_Sub2.aString69.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class2_Sub3_Sub2.aString69.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
