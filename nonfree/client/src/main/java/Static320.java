import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static320 {

	@OriginalMember(owner = "client!km", name = "K", descriptor = "[Lclient!eba;")
	public static Class84[] aClass84Array8;

	@OriginalMember(owner = "client!km", name = "J", descriptor = "F")
	public static float aFloat118 = 1024.0F;

	@OriginalMember(owner = "client!km", name = "R", descriptor = "[Lclient!eg;")
	public static Class91[] aClass91Array8 = null;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIB)Z")
	public static boolean method5327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5329(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}
