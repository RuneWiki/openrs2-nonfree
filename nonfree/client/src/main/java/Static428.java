import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static428 {

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
	public static int anInt7892;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	public static int anInt7883 = 0;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)Z")
	public static boolean method6539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static191.method3679(arg0, arg1) || Static315.method5106(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static318.method4379(arg1, arg0);
		}
	}
}
