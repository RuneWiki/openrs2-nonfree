import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static302 {

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString263 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V")
	public static void method5196(@OriginalArg(0) int arg0) {
		Static233.anInt4345 = arg0;
		Static21.aClass70_10.method1399();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5198(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
