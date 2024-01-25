import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static484 {

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public static int anInt8685;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z")
	public static boolean method7672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static89.method1569(arg0, arg1) | (arg1 & 0x70000) != 0 || Static318.method5254(arg1, arg0);
	}
}
