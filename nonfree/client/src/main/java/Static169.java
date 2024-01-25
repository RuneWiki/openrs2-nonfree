import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	public static int anInt3517;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!bi;")
	public static Class26 aClass26_20;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "Lclient!ig;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public static int anInt3518 = 0;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString231 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "J")
	public static long aLong124 = 0L;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Z")
	public static boolean aBoolean260 = false;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)B")
	public static byte method3222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
