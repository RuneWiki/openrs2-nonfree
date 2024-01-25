import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static574 {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!q;")
	public static Class255 aClass255_9;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "[[B")
	public static byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "Lclient!ah;")
	public static Class9 aClass9_4;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!tc;)Ljava/lang/String;")
	public static String method8202(@OriginalArg(1) Class305 arg0) {
		if (Static68.method1694(arg0).method1757() == 0) {
			return null;
		} else if (arg0.aString112 == null || arg0.aString112.trim().length() == 0) {
			return Static230.aBoolean352 ? "Hidden-use" : null;
		} else {
			return arg0.aString112;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
	public static boolean method8204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static377.method6099(arg0, arg1) & Static387.method6199(arg0, arg1);
	}
}
