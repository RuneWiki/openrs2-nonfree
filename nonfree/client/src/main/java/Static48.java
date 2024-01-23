import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!dk", name = "Q", descriptor = "Lclient!ph;")
	public static Class138 aClass138_9;

	@OriginalMember(owner = "client!dk", name = "R", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
	public static int anInt929 = 0;

	@OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
	public static int anInt931 = 0;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(IIB)I")
	public static int method851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}
}
