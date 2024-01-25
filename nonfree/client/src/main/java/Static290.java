import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static290 {

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
	public static int anInt5404;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	public static final int anInt5403 = -1;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method4344(@OriginalArg(0) byte[] arg0) {
		return Static172.method3065(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Z")
	public static boolean method4346(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
