import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!pq", name = "K", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFFZ)I")
	public static int method6285(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local17 < local26 && local26 > local35) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIII)V")
	public static void method6288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static110.anInt2515 = arg0;
		Static49.anInt1348 = arg3;
		Static416.anInt7784 = arg2;
		Static367.anInt6943 = arg1;
		Static228.anInt4743 = arg4;
		if (Static110.anInt2515 >= 100) {
			@Pc(32) int local32 = Static228.anInt4743 * 512 + 256;
			@Pc(38) int local38 = Static367.anInt6943 * 512 + 256;
			@Pc(46) int local46 = Static482.method7333(Static493.anInt8836, local38, local32) - Static416.anInt7784;
			@Pc(51) int local51 = local32 - Static86.anInt2132;
			@Pc(55) int local55 = local46 - Static5.anInt142;
			@Pc(60) int local60 = local38 - Static390.anInt7318;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local60 * local60 + local51 * local51));
			Static348.anInt6726 = (int) (Math.atan2((double) local55, (double) local71) * 2607.5945876176133D) & 0x3FFF;
			Static393.anInt7341 = (int) (-2607.5945876176133D * Math.atan2((double) local51, (double) local60)) & 0x3FFF;
			if (Static348.anInt6726 < 1024) {
				Static348.anInt6726 = 1024;
			}
			Static268.anInt9015 = 0;
			if (Static348.anInt6726 > 3072) {
				Static348.anInt6726 = 3072;
			}
		}
		Static84.anInt1994 = 2;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBIII)Z")
	public static boolean method6292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static356.aByteArrayArrayArray17[0][arg1][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static356.aByteArrayArrayArray17[arg2][arg1][arg0] & 0x10) == 0) {
			return arg3 == Static296.method4850(arg0, arg2, arg1);
		} else {
			return false;
		}
	}
}
