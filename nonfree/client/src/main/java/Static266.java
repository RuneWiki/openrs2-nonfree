import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static266 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray49 = new String[100];

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "[I")
	public static int[] anIntArray348 = new int[256];

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	public static int anInt3887 = 0;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
	public static int anInt3889 = 0;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray50 = new String[500];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
	public static int method3133(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
