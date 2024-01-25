import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!nha", name = "q", descriptor = "[Lclient!tu;")
	public static Class337[] aClass337Array5;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IILclient!tu;)Z")
	public static boolean method5767(@OriginalArg(0) int arg0, @OriginalArg(2) Class337 arg1) {
		Static372.aClass203_13.method8325(arg1.anIntArray546[arg0], arg1.anIntArray547[arg0], arg1.anIntArray545[arg0], Static675.anIntArray622);
		@Pc(22) int local22 = Static675.anIntArray622[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray127[arg0] = (short) (Static617.anInt10169 * Static675.anIntArray622[0] / local22 + Static502.anInt8565);
			arg1.aShortArray125[arg0] = (short) (Static675.anIntArray622[1] * Static17.anInt299 / local22 + Static120.anInt1905);
			arg1.aShortArray126[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIIIILclient!pda;ILclient!ha;II)V")
	public static void method5768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5_Sub5_Sub18 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class57 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg7 < arg4 && arg4 < arg9 + arg7 && arg5 > arg1 - 13 && arg5 < arg1 + 3) {
			arg3 = arg10;
		}
		@Pc(50) String local50 = Static223.method3186(arg6);
		Static533.aClass80_10.method8789(local50, Static118.anIntArray17, Static494.aClass134Array13, arg7 + 3, arg1, arg3);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!ha;IIIII)V")
	public static void method5770(@OriginalArg(0) Class57 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static617.aClass57_14 = arg0;
		Static422.aClass203_12 = Static617.aClass57_14.method7676();
		Static612.aClass203_14 = Static617.aClass57_14.method7676();
		Static296.aClass203_15 = Static617.aClass57_14.method7676();
		Static174.anInt2965 = 100;
		Static659.anInt10597 = 0;
		Static242.anInt4086 = 100;
		Static376.anInterface6Array1 = null;
		Static615.anIntArray561 = null;
		Static558.method8061(arg1, arg2);
		Static522.anInt8830 = -1;
		Static417.anInt7207 = -1;
		Static314.anInt5581 = -1;
	}
}
