import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!mn", name = "J", descriptor = "Lclient!aca;")
	public static Class5 aClass5_2;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)B")
	public static byte method5012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
