import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static586 {

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "[I")
	public static final int[] anIntArray667 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "Lclient!pn;")
	public static final Class266 aClass266_7 = new Class266();

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)Z")
	public static boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static44.method1646(arg1, arg0)) {
			return Static370.method6241(arg1, arg0) | (arg0 & 0xB000) != 0 | Static594.method8740(arg0, arg1) ? true : (Static408.method6624(arg1, arg0) | Static15.method318(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
