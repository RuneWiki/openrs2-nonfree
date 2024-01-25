import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static436 {

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_235 = new Class196(74, -1);

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_236 = new Class196(31, 2);

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
	public static int anInt7713 = 0;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	public static void method6546() {
		Static567.method7781();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method6548(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return arg0 && arg1 >= 0 ? Static284.method3902(arg0, arg1) : Integer.toString(arg1);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZI)B")
	public static byte method6549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
