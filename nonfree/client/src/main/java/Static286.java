import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
	public static int anInt5827;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IC)I")
	public static int method4858(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class227.anIntArray583.length > arg0 ? Class227.anIntArray583[arg0] : -1;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IBI)Z")
	public static boolean method4859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
