import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!gha", name = "d", descriptor = "[I")
	public static int[] anIntArray186 = null;

	@OriginalMember(owner = "client!gha", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[6][];

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V")
	public static void method3031() {
		if (!Static615.aBoolean715) {
			Static615.aBoolean715 = true;
			Static258.aBoolean305 = true;
			Static560.aFloat177 += (24.0F - Static560.aFloat177) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(BI)V")
	public static void method3032(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg0, 10);
		local9.method8834();
	}
}
