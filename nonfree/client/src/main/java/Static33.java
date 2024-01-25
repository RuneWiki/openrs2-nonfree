import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!tea;")
	public static Class331 aClass331_1;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
	public static int anInt568;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "[I")
	public static final int[] anIntArray35 = new int[2];

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!qea;")
	public static final Class288 aClass288_1 = new Class288();

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static251.method3707(arg5, arg6, arg1)) {
			return false;
		}
		@Pc(16) int local16 = Static675.anIntArray622[1];
		@Pc(20) int local20 = Static675.anIntArray622[0];
		@Pc(24) int local24 = Static675.anIntArray622[2];
		if (!Static251.method3707(arg3, arg2, arg8)) {
			return false;
		}
		@Pc(43) int local43 = Static675.anIntArray622[2];
		@Pc(47) int local47 = Static675.anIntArray622[1];
		@Pc(51) int local51 = Static675.anIntArray622[0];
		if (Static251.method3707(arg4, arg7, arg0)) {
			@Pc(64) int local64 = Static675.anIntArray622[1];
			@Pc(68) int local68 = Static675.anIntArray622[2];
			@Pc(72) int local72 = Static675.anIntArray622[0];
			return Static516.method7501(local20, local64, local24, local16, local51, local43, local68, local47, local72);
		} else {
			return false;
		}
	}
}
