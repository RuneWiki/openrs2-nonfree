import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "Lclient!lga;")
	public static Class223 aClass223_8;

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIIIIZIIII)Z")
	public static boolean method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static552.method7814(arg0, arg1, arg3)) {
			return false;
		}
		@Pc(16) int local16 = Static385.anIntArray383[0];
		@Pc(20) int local20 = Static385.anIntArray383[2];
		@Pc(24) int local24 = Static385.anIntArray383[1];
		if (!Static552.method7814(arg8, arg2, arg6)) {
			return false;
		}
		@Pc(37) int local37 = Static385.anIntArray383[2];
		@Pc(41) int local41 = Static385.anIntArray383[1];
		@Pc(52) int local52 = Static385.anIntArray383[0];
		if (Static552.method7814(arg4, arg5, arg7)) {
			@Pc(65) int local65 = Static385.anIntArray383[1];
			@Pc(69) int local69 = Static385.anIntArray383[0];
			@Pc(73) int local73 = Static385.anIntArray383[2];
			return Static425.method6506(local73, local20, local24, local65, local69, local41, local37, local52, local16);
		} else {
			return false;
		}
	}
}
