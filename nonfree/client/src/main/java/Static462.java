import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "[I")
	public static final int[] anIntArray408 = new int[25];

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "S")
	public static short aShort82 = 1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)V")
	public static void method6810(@OriginalArg(0) int arg0) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 3);
		local9.method4001();
	}
}
