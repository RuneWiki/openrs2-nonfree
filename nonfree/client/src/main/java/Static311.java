import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static311 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString72;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Lclient!gj;")
	public static Class143 aClass143_78;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BJ)I")
	public static int method4790(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}
}
