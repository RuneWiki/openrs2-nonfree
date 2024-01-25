import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
	public static int anInt8248;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_113 = new Class276(91, 5);

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "[I")
	public static final int[] anIntArray506 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z")
	public static boolean method6774(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static387.method6201(arg1, arg0) | Static291.method4968(arg1, arg0)) & Static263.method4657(arg1, arg0);
	}
}
