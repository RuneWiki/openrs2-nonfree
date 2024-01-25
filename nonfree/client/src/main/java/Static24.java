import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "[Lclient!ho;")
	public static Class9[] aClass9Array7;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
	public static int anInt582 = -1;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "[I")
	public static final int[] anIntArray33 = new int[32];

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
	public static int anInt590 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!s;)V")
	public static void method597(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1) {
		Static289.aClass12Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method599(@OriginalArg(1) String arg0) {
		return Static189.aHashtable2.containsKey(arg0);
	}
}
