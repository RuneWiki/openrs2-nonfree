import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	public static int anInt4517;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_12 = new Class162(0, 2);

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	public static int anInt4519 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)Z")
	public static boolean method3958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIII)I")
	public static int method3959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(18) int local18 = arg1;
			arg1 = arg5;
			arg5 = local18;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1 + 7 - arg1 - arg2;
		} else if (local3 == 2) {
			return 7 + 1 - arg0 - arg5;
		} else {
			return arg2;
		}
	}
}
