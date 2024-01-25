import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
	public static int[] anIntArray598;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "F")
	public static float aFloat198 = 0.0F;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)I")
	public static int method8605() {
		return Static181.anInt2988;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBI)V")
	public static void method8611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(11, (long) arg2);
		local9.method2438();
		local9.anInt2740 = arg1;
		local9.anInt2749 = arg0;
	}
}
