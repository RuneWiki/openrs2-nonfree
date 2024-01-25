import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_51 = new Class126(4);

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "S")
	public static short aShort68 = 256;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lclient!hv;")
	public static Class7_Sub4_Sub9 method4440() {
		return Static93.aClass7_Sub4_Sub9_3;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4441(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)I")
	public static int method4442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(12) int local12 = arg5;
			arg5 = arg2;
			arg2 = local12;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 7 + 1 - arg4 - arg5;
		} else {
			return 7 + 1 - arg3 - arg2;
		}
	}
}
