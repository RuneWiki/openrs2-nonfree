import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
	public static int anInt1903;

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!bv", name = "z", descriptor = "Lclient!l;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1810(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
