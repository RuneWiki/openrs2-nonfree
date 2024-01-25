import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)I")
	public static int method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		for (local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; Static186.method3515(local10, arg1) > arg0; local10--) {
		}
		return local10;
	}
}
