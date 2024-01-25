import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method3363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static166.method3034(arg7, arg3, arg5)) {
			return false;
		}
		@Pc(15) int local15 = Static518.anIntArray501[0];
		@Pc(19) int local19 = Static518.anIntArray501[1];
		@Pc(23) int local23 = Static518.anIntArray501[2];
		if (!Static166.method3034(arg2, arg8, arg1)) {
			return false;
		}
		@Pc(35) int local35 = Static518.anIntArray501[1];
		@Pc(39) int local39 = Static518.anIntArray501[2];
		@Pc(43) int local43 = Static518.anIntArray501[0];
		if (Static166.method3034(arg4, arg6, arg0)) {
			@Pc(55) int local55 = Static518.anIntArray501[2];
			@Pc(59) int local59 = Static518.anIntArray501[1];
			@Pc(63) int local63 = Static518.anIntArray501[0];
			return Static52.method680(local35, local63, local39, local15, local43, local19, local55, local23, local59);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIB)I")
	public static int method3364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return ((arg2 >> 2 & 0x3F) << 10) + (arg0 >> 5 << 7) + (arg1 >> 1);
	}
}
