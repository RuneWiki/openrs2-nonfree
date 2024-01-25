import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!sv", name = "F", descriptor = "I")
	public static int anInt8620 = 0;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILclient!cu;)Z")
	public static boolean method7425(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1) {
		Static343.aClass51_6.method6706(arg1.anIntArray155[arg0], arg1.anIntArray156[arg0], arg1.anIntArray157[arg0], Static209.anIntArray263);
		@Pc(22) int local22 = Static209.anIntArray263[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray30[arg0] = (short) (Static108.anInt2357 + Static209.anIntArray263[0] * Static622.anInt10160 / local22);
			arg1.aShortArray31[arg0] = (short) (Static260.anInt4887 * Static209.anIntArray263[1] / local22 + Static449.anInt7346);
			arg1.aShortArray32[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
	public static void method7426(@OriginalArg(1) int arg0) {
		Static629.aLong268 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBII)I")
	public static int method7427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}
}
