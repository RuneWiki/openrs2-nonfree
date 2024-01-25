import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static142 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!ko;")
	public static Class118 aClass118_3;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[I")
	public static final int[] anIntArray184 = new int[] { 1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 2, 0, 0, 0, 0, -1, 12, 0, -2, 0, 6, 0, 0, -2, 3, 12, 0, 0, 0, 0, 0, 0, 0, 0, 28, 0, 0, 8, 0, 0, -2, 3, 12, 0, 8, 17, 6, -1, 10, 8, 0, 0, 12, 3, 0, 0, 0, 6, 15, -2, -2, 0, 5, 0, 0, 6, 0, 0, -2, 0, 0, 7, -1, 4, 1, 0, 0, 0, 0, 0, 9, 10, 6, 0, -1, 0, 7, -1, 0, 6, 0, 0, 12, 0, 0, 0, 0, 6, 0, -1, 0, 0, 14, 0, 0, 0, 3, 7, 0, 0, 0, 0, 0, 0, -1, 0, 0, 6, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, -2, -2, 0, 0, 1, 2, 0, -1, 2, 0, 0, 8, 0, 0, 0, 20, 0, 2, -1, -2, -1, -1, 0, 0, 6, 4, 0, 0, 0, 0, -1, -2, 5, 0, 0, -1, 8, 0, 1, 2, 0, 0, 3, 0, 0, 0, 6, 0, 0, 7, 0, 0, 0, 3, 10, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 5, -1, 0, 0, 0, 2, 8, 0, 2, 0, 0, 0, 8, 0, 0, -2, 0, 11, 0, 0, 0, 0, 0, 0, 6, 0, 10, 0, 0, 0, 0, 6, 15, 0, 0, 0, 4, 0, 8, 8, 0, 8, -2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 14, 0, 0, 3, 5, 8, 0 };

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString23 = "";

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2181(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
