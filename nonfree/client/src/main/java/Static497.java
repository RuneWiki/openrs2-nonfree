import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static497 {

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!nd;")
	public static Class238 aClass238_223;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Z")
	public static boolean aBoolean562;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method6926(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)I")
	public static int method6927() {
		return Static366.anInt6320;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z")
	public static boolean method6929(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static603.method8485(arg0, arg1) || Static352.method5274(arg0, arg1);
	}
}
