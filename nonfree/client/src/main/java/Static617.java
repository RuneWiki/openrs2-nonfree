import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static617 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
	public static int anInt10101 = 0;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public static int anInt10103 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)Z")
	public static boolean method8585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static590.method8336(arg0, arg1)) {
			return Static193.method8832(arg0, arg1) | (arg0 & 0xB000) != 0 | Static524.method7273(arg1, arg0) ? true : (Static205.method5785(arg0, arg1) | Static534.method7403(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
