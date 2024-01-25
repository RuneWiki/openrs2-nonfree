import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cd", name = "S", descriptor = "[I")
	public static final int[] anIntArray445 = new int[2];

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)Z")
	public static boolean method4377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static63.method1151(arg1, arg0) || Static342.method5379(arg1, arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4382(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static36.method706(arg0.charAt(local12)) - local10;
		}
		return local10;
	}
}
