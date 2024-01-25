import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static634 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
	public static boolean method8707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static14.method452(arg0, arg1) | (arg1 & 0x70000) != 0 || Static426.method6548(arg0, arg1);
	}
}
