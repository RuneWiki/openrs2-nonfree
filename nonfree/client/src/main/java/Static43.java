import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public static int anInt8881;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
	public static int anInt8888;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "J")
	public static long aLong243 = -1L;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Z")
	public static boolean method7854(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!uf;)V")
	public static void method7857(@OriginalArg(1) Class357 arg0) {
		if (arg0.anInt10430 == 5 && arg0.anInt10396 != -1) {
			Static674.method9828(arg0, Static607.aClass101_15);
		}
	}
}
