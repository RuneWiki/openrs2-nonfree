import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static185 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!ot;")
	public static Class268 aClass268_5;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString42 = null;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
	public static boolean method3573(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
