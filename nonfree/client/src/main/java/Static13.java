import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "[J")
	public static long[] aLongArray2;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "Lclient!iu;")
	public static Class150 aClass150_11 = null;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBI)Z")
	public static boolean method343(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
