import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "[I")
	public static final int[] anIntArray275 = new int[1];

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(III)Z")
	public static boolean method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static43.method897(arg1, arg0) | (arg1 & 0x70000) != 0 || Static150.method2772(arg0, arg1);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)I")
	public static int method3321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class5_Sub2_Sub16.anIntArray410[arg1 * 8192 / arg2] >> 1;
		return (arg0 * (65536 - local16) >> 16) + (arg3 * local16 >> 16);
	}
}
