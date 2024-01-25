import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
	public static final int[] anIntArray126 = new int[100];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!hh;I)I")
	public static int method1879(@OriginalArg(0) Class109 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2348(Static362.anInt6604)) {
			local5++;
		}
		if (arg0.method2348(Static96.anInt1882)) {
			local5++;
		}
		return local5;
	}
}
