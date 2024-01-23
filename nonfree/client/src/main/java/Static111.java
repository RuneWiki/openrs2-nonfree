import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static111 {

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString128 = " is already on your ignore list.";

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1792(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V")
	public static void method1794() {
		Static133.aClass26_26.method515();
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)I")
	public static int method1795() {
		return Static221.anInt4280;
	}
}
