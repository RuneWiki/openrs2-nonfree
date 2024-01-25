import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static74 {

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!bd;")
	public static Class32 aClass32_2 = new Class32();

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
	public static int method1224(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
