import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static47 {

	@OriginalMember(owner = "client!bia", name = "t", descriptor = "Lclient!ff;")
	public static Class111 aClass111_3;

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(III)Z")
	public static boolean method1236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
