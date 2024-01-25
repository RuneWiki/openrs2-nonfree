import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
	public static int anInt4422 = 0;

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(III)Z")
	public static boolean method4000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static671.method9143(arg1, arg0) || Static574.method7979(56, arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static400.method5898(arg1, arg0);
		}
	}
}
