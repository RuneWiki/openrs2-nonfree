import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static318 {

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_21 = new Class220(13, 0, 1, 0);

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_105 = new Class12(2, 6);

	@OriginalMember(owner = "client!pt", name = "w", descriptor = "[I")
	public static int[] anIntArray225 = new int[2];

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)Z")
	public static boolean method2926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static295.method4031(arg0, arg1)) {
			return Static159.method2300(arg0, arg1) | (arg0 & 0xB000) != 0 | Static128.method2024(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static321.method4319(arg1, arg0) | Static237.method3397(arg0, arg1));
		} else {
			return false;
		}
	}
}
