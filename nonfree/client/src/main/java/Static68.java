import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!df", name = "L", descriptor = "I")
	public static int anInt1387;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_26 = new Class146(27, -1);

	@OriginalMember(owner = "client!df", name = "H", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_27 = new Class146(63, 3);

	@OriginalMember(owner = "client!df", name = "K", descriptor = "I")
	public static int anInt1386 = 0;

	@OriginalMember(owner = "client!df", name = "M", descriptor = "[I")
	public static final int[] anIntArray104 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!hd;I)V")
	public static void method1152(@OriginalArg(0) Class110 arg0) {
		if (arg0.anInt2627 == 5 && arg0.anInt2588 != -1) {
			Static45.method587(Static39.aClass135_1, arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)I")
	public static int method1153(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
	public static int method1157(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
