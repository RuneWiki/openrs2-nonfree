import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "Lclient!fl;")
	public static Class104 aClass104_2;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_15 = new Class101(13, 16);

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[Lclient!pga;")
	public static Class259[] aClass259Array1 = null;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	public static int method6629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(22) int local22 = local10 ^ local10 << 13;
		@Pc(36) int local36 = Integer.MAX_VALUE & (local22 * local22 * 15731 + 789221) * local22 + 1376312589;
		return local36 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!ni;)V")
	public static void method6630(@OriginalArg(1) Class223 arg0) {
		Static231.aClass223_56 = arg0;
	}
}
