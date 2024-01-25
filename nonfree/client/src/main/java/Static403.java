import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static403 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[250][];

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V")
	public static void method5361() {
		Static180.aClass44_29.method1025(5);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Z")
	public static boolean method5362(@OriginalArg(1) int arg0) {
		if (arg0 == 60 || arg0 == 4 || arg0 == 5 || arg0 == 46 || arg0 == 59) {
			return true;
		} else {
			return arg0 == 9 || arg0 == 1007;
		}
	}
}
