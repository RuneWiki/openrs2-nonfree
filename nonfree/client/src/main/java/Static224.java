import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	public static int anInt3559;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	public static int anInt3557 = 104;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)I")
	public static int method3271(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V")
	public static void method3272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		Static275.aFloat105 = (float) local11;
		if (Static259.anInt4200 == 2) {
			Static571.anInt8879 = 0;
			Static226.anInt3586 = local7;
			Static383.anInt9871 = local11;
		}
		Static642.aFloat230 = (float) local7;
		Static340.method4636();
		Static123.aBoolean157 = true;
	}
}
