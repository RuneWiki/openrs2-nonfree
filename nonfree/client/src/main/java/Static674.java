import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static674 {

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_4 = new Class74(7, 5);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)I")
	public static int method1632(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1634(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
