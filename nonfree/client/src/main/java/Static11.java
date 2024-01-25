import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static11 {

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
	public static int anInt143;

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "Lclient!paa;")
	public static Class261 aClass261_1 = null;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)Z")
	public static boolean method164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
