import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIBIIIII)Z")
	public static boolean method8180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static542.method7927(arg6, arg3, arg8)) {
			return false;
		}
		@Pc(15) int local15 = Static540.anIntArray571[1];
		@Pc(19) int local19 = Static540.anIntArray571[0];
		@Pc(23) int local23 = Static540.anIntArray571[2];
		if (!Static542.method7927(arg2, arg0, arg1)) {
			return false;
		}
		@Pc(35) int local35 = Static540.anIntArray571[2];
		@Pc(39) int local39 = Static540.anIntArray571[0];
		@Pc(51) int local51 = Static540.anIntArray571[1];
		if (Static542.method7927(arg5, arg4, arg7)) {
			@Pc(63) int local63 = Static540.anIntArray571[1];
			@Pc(67) int local67 = Static540.anIntArray571[0];
			@Pc(71) int local71 = Static540.anIntArray571[2];
			return Static349.method5625(local39, local51, local19, local23, local15, local67, local63, local35, local71);
		} else {
			return false;
		}
	}
}
