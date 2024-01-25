import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
	public static int anInt690;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "Lclient!lga;")
	public static Class223 aClass223_9;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "[I")
	public static final int[] anIntArray48 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)Z")
	public static boolean method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static680.method8956(arg0, arg1) || Static234.method4147(arg0, arg1);
	}
}
