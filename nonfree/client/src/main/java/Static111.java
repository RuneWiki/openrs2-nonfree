import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static111 {

	@OriginalMember(owner = "client!gs", name = "P", descriptor = "Z")
	public static boolean aBoolean122;

	@OriginalMember(owner = "client!gs", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString81 = "Allocating memory";

	@OriginalMember(owner = "client!gs", name = "K", descriptor = "Lclient!ms;")
	public static final Class138 aClass138_1 = new Class138();

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString82 = "flash1:";

	@OriginalMember(owner = "client!gs", name = "O", descriptor = "[I")
	public static int[] anIntArray139 = new int[2];

	@OriginalMember(owner = "client!gs", name = "Q", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_20 = new Class198(64);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIII)I")
	public static int method1930(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + (arg0 >> 2 << 10);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)B")
	public static byte method1931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
