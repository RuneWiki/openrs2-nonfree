import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "Z")
	public static boolean aBoolean384;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!lc;")
	public static final Class192 aClass192_2 = new Class192("RC", 1);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)I")
	public static int method4400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)I")
	public static int method4402() {
		return 14;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public static void method4403() {
		Static577.aClass305_40.method7440();
	}
}
