import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I")
	public static int method2981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		for (local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; Static224.method3591(local10, arg1) > arg0; local10--) {
		}
		return local10;
	}
}
