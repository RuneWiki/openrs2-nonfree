import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!ft", name = "D", descriptor = "Z")
	public static boolean aBoolean38;

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "[I")
	public static final int[] anIntArray65 = new int[50];

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
	public static int anInt840 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method747(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method749(@OriginalArg(1) String arg0) {
		return Static352.method4869(arg0);
	}
}
