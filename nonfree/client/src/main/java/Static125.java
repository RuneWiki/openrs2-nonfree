import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static125 {

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!al;")
	public static Class11 aClass11_5;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZII)B")
	public static byte method2257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
