import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "Lclient!sba;")
	public static Class297 aClass297_16 = new Class297(8);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIZ)I")
	public static int method3502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16 = 65536 - Class3_Sub28.anIntArray231[arg3 * 8192 / arg0] >> 1;
		return (arg1 * local16 >> 16) + (arg2 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method3505(@OriginalArg(0) Class31 arg0) {
		if (Static289.aBoolean370) {
			Static154.method2855(arg0);
		} else {
			Static575.method7829(arg0);
		}
	}
}
