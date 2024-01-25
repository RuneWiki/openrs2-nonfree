import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static570 {

	@OriginalMember(owner = "client!uga", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject20;

	@OriginalMember(owner = "client!uga", name = "l", descriptor = "Z")
	public static boolean aBoolean776 = false;

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "(II)I")
	public static int method7989(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static76.method2154(arg0);
	}
}
