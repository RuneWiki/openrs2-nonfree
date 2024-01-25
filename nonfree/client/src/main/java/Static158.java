import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static158 {

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "D")
	public static double aDouble8;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public static int anInt2674 = 0;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "[I")
	public static final int[] anIntArray160 = new int[8];

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	public static int anInt2675 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Z")
	public static boolean method2279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static130.method1948(arg0, arg1) | (arg0 & 0x40000) != 0 || Static532.method7864(arg0, arg1);
	}
}
