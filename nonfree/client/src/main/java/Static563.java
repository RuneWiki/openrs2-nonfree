import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static563 {

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(III)Z")
	public static boolean method7586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static192.method3391(arg1, arg0)) {
			return Static221.method3672(arg1, arg0) | (arg1 & 0x9000) != 0 | Static356.method5848(arg1, arg0) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | Static96.method1811(arg1, arg0) | Static455.method6386(arg0, arg1));
		} else {
			return false;
		}
	}
}
