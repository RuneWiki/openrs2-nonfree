import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
	public static int anInt9905;

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
	public static int anInt9907;

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "F")
	public static float aFloat207 = 0.0F;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIII)I")
	public static int method8718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg2;
			arg2 = local6;
		}
		@Pc(14) int local14 = arg1 & 0x3;
		if (local14 == 0) {
			return arg4;
		} else if (local14 == 1) {
			return arg5;
		} else if (local14 == 2) {
			return 1 + 7 - arg4 - arg3;
		} else {
			return 1 + 7 - arg2 - arg5;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BII)Z")
	public static boolean method8719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
