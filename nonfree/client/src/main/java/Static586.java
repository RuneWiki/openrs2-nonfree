import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!tt", name = "E", descriptor = "Z")
	public static boolean aBoolean742 = false;

	@OriginalMember(owner = "client!tt", name = "I", descriptor = "[I")
	public static final int[] anIntArray519 = new int[2];

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIII)Z")
	public static boolean method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static96.aByteArrayArrayArray10[0][arg0][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static96.aByteArrayArrayArray10[arg3][arg0][arg2] & 0x10) == 0) {
			return arg1 == Static226.method4158(arg2, arg0, arg3);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "(I)V")
	public static void method8862() {
		@Pc(9) int[] local9 = new int[Static372.aClass343_1.anInt9759];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static372.aClass343_1.anInt9759; local13++) {
			@Pc(20) Class351 local20 = Static372.aClass343_1.method8549(local13);
			if (local20.anInt10193 >= 0 || local20.anInt10165 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static296.anIntArray273 = new int[local11];
		for (@Pc(59) int local59 = 0; local59 < local11; local59++) {
			Static296.anIntArray273[local59] = local9[local59];
		}
	}
}
