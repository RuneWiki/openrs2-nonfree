import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static442 {

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
	public static int anInt6948;

	@OriginalMember(owner = "client!vu", name = "z", descriptor = "[I")
	public static int[] anIntArray501;

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "[I")
	public static final int[] anIntArray498 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Z")
	public static boolean method5521() {
		return Static222.aBoolean369;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method5523(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static455.method5866(arg0);
	}
}
