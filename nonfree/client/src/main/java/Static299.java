import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static299 {

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)Z")
	public static boolean method4690(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static499.method6950(arg1, arg0) | (arg1 & 0x70000) != 0 || Static90.method1399(arg0, arg1);
	}
}
