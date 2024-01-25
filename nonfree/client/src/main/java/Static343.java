import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "[Lclient!s;")
	public static Class51[] aClass51Array1;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "J")
	public static long aLong176;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "[S")
	public static short[] aShortArray98 = new short[256];

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString67 = null;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I")
	public static int method5287(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
