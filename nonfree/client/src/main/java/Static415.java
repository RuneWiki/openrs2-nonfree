import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!ou", name = "N", descriptor = "[I")
	public static final int[] anIntArray478 = new int[8];

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!lea;III)V")
	public static void method6508(@OriginalArg(0) Class2_Sub3_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static655.method6405(local6, 0, local6.length, arg2);
		Static63.method1344(local6, arg0, arg1);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)V")
	public static void method6509(@OriginalArg(1) int arg0) {
		if (!Static263.method4883(arg0)) {
			return;
		}
		@Pc(14) Class108[] local14 = Static85.aClass108ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class108 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt4095 = 1;
				local22.anInt4025 = 0;
				local22.anInt4065 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!fba;I)Z")
	public static boolean method6510(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1) {
		Static445.aClass47_7.method7868(arg1.anIntArray188[arg0], arg1.anIntArray189[arg0], arg1.anIntArray187[arg0], Static446.anIntArray507);
		@Pc(22) int local22 = Static446.anIntArray507[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray31[arg0] = (short) (Static290.anInt5910 + Static446.anIntArray507[0] * Static47.anInt1034 / local22);
			arg1.aShortArray32[arg0] = (short) (Static352.anInt6886 + Static446.anIntArray507[1] * Static115.anInt9244 / local22);
			arg1.aShortArray30[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(B)V")
	public static void method6511() {
		Static573.aClass276_59.method6910();
		Static266.anInt8465 = 0;
	}
}
