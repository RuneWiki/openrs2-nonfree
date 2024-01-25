import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "S")
	public static short aShort43 = 32767;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)I")
	public static int method3428(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(14) int local14 = local4 | local4 >>> 1;
		@Pc(20) int local20 = local14 | local14 >>> 2;
		@Pc(26) int local26 = local20 | local20 >>> 4;
		@Pc(32) int local32 = local26 | local26 >>> 8;
		@Pc(38) int local38 = local32 | local32 >>> 16;
		return local38 + 1;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(Z)V")
	public static void method3429() {
		Static243.method3970(11);
		Static485.method6797();
		System.gc();
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(Z)V")
	public static void method3430(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static118.aClass293ArrayArrayArray14 = Static80.aClass293ArrayArrayArray35;
			Static20.aClass17Array1 = Static499.aClass17Array3;
		} else {
			Static118.aClass293ArrayArrayArray14 = Static373.aClass293ArrayArrayArray25;
			Static20.aClass17Array1 = Static158.aClass17Array2;
		}
		Static101.anInt2104 = Static118.aClass293ArrayArrayArray14.length;
	}
}
