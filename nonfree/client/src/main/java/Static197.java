import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Lclient!fb;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
	public static int anInt3614;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Lclient!vo;")
	public static final Class265 aClass265_3 = new Class265("", 11);

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
	public static int anInt3608 = 2;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)I")
	public static int method2823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)Z")
	public static boolean method2828(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
