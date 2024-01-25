import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static542 {

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_198 = new Class332(10);

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
	public static final int[] anIntArray691 = new int[14];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method7491(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static535.method5172(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Z")
	public static boolean method7492(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2 || arg0 == 4;
	}
}
