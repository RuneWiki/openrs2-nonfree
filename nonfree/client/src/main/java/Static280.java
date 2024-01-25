import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!ko;")
	public static Class142 aClass142_29 = new Class142();

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Z")
	public static boolean aBoolean374 = false;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3858(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
