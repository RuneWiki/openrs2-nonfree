import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static281 {

	@OriginalMember(owner = "client!sb", name = "gc", descriptor = "Z")
	public static boolean aBoolean379;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString324 = "K";

	@OriginalMember(owner = "client!sb", name = "ec", descriptor = "Lclient!ik;")
	public static Class103 aClass103_51 = new Class103(64);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4414(@OriginalArg(0) String arg0) {
		return Static178.method3299(10, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B[BI)I")
	public static int method4416(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static204.method3624(arg1, 0, arg0);
	}
}
