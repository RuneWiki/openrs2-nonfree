import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static316 {

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILclient!sba;)Ljava/lang/String;")
	public static String method5294(@OriginalArg(1) Class302 arg0) {
		if (Static75.method2151(arg0).method8492() == 0) {
			return null;
		} else if (arg0.aString88 == null || arg0.aString88.trim().length() == 0) {
			return Static30.aBoolean78 ? "Hidden-use" : null;
		} else {
			return arg0.aString88;
		}
	}
}
