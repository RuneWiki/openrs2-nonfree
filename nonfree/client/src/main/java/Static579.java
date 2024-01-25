import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static579 {

	@OriginalMember(owner = "client!um", name = "d", descriptor = "F")
	public static float aFloat171;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "Lclient!hd;")
	public static final Class136 aClass136_7 = new Class136();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method6867(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
