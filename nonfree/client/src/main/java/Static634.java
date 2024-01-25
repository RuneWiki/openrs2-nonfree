import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
	public static int[] anIntArray586 = new int[4];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
	public static void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 != 4) {
			anIntArray586 = null;
		}
		if (Static573.anInt8986 <= arg0 && arg0 <= Static319.anInt5445) {
			@Pc(28) int local28 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg1);
			@Pc(34) int local34 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg2);
			Static590.method8143(local34, local28, arg0, arg3);
		}
	}
}
