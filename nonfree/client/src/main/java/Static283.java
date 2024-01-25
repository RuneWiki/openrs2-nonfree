import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static283 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[S")
	public static short[] aShortArray108;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public static int anInt5344 = 0;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!s", name = "f", descriptor = "J")
	public static long aLong176 = 0L;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString227 = "Loading config - ";

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Ljava/lang/String;")
	public static final String aString228 = "white:";

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I")
	public static int method4853(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
