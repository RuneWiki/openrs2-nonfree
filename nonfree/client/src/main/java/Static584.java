import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static584 {

	@OriginalMember(owner = "client!tfa", name = "m", descriptor = "[I")
	public static final int[] anIntArray605 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!tfa", name = "v", descriptor = "I")
	public static int anInt9324 = -1;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)Z")
	public static boolean method8153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static373.method5634(arg0, arg1)) {
			return Static577.method8048(arg0, arg1) | (arg0 & 0xB000) != 0 | Static207.method3816(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static249.method4344(arg0, arg1) | Static569.method7983(arg0, arg1));
		} else {
			return false;
		}
	}
}
