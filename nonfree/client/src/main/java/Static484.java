import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "Lclient!cb;")
	public static Class50 aClass50_141;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBII)V")
	public static void method7065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		Static329.aFloat117 = (float) local7;
		if (Static133.anInt2254 == 2) {
			Static498.anInt8495 = local7;
			Static78.anInt1274 = 0;
			Static493.anInt8442 = local11;
		}
		Static495.aFloat161 = (float) local11;
		Static221.method3130();
		Static550.aBoolean649 = true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I")
	public static int method7068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static106.aByteArrayArray2 == null ? 0 : Static106.aByteArrayArray2[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)Z")
	public static boolean method7069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
