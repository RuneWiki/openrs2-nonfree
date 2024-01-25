import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!js", name = "b", descriptor = "I")
	public static int anInt4852;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "Lclient!oa;")
	public static Class14 aClass14_7;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "[I")
	public static final int[] anIntArray364 = new int[13];

	@OriginalMember(owner = "client!js", name = "h", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!js", name = "o", descriptor = "[I")
	public static final int[] anIntArray365 = new int[6];

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZILclient!cu;)V")
	public static void method4205(@OriginalArg(1) int arg0, @OriginalArg(2) Class57 arg1) {
		if (Static559.anInt9221 >= 50 || (arg1 == null || arg1.anIntArrayArray12 == null || arg0 >= arg1.anIntArrayArray12.length || arg1.anIntArrayArray12[arg0] == null)) {
			return;
		}
		@Pc(35) int local35 = arg1.anIntArrayArray12[arg0][0];
		@Pc(39) int local39 = local35 >> 8;
		@Pc(45) int local45 = local35 >> 5 & 0x7;
		if (arg1.anIntArrayArray12[arg0].length > 1) {
			@Pc(64) int local64 = (int) ((double) arg1.anIntArrayArray12[arg0].length * Math.random());
			if (local64 > 0) {
				local39 = arg1.anIntArrayArray12[arg0][local64];
			}
		}
		if (arg1.aBoolean115) {
			Static366.method5502(local39, 0, 255, false, local45);
		} else {
			Static588.method1983(255, local39, 0, local45);
		}
	}
}
