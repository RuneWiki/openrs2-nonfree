import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
	public static int anInt173 = 0;

	@OriginalMember(owner = "client!aj", name = "C", descriptor = "I")
	public static int anInt177 = 2;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[B)[B")
	public static byte[] method145(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static307.method3244(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public static void method146(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub2_Sub21 local12 = Static39.method4121(arg0, 11);
		local12.method4361();
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
	public static void method147() {
		Static101.aClass4_Sub17_Sub1_4.method1904();
		@Pc(13) int local13 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
		if (local13 == 0) {
			return;
		}
		@Pc(22) int local22 = Static101.aClass4_Sub17_Sub1_4.method1898(2);
		if (local22 == 0) {
			Static97.anIntArray219[Static84.anInt1709++] = 2047;
			return;
		}
		@Pc(46) int local46;
		@Pc(56) int local56;
		if (local22 == 1) {
			local46 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
			Static239.aClass12_Sub3_Sub2_2.method3371(local46, 1);
			local56 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
			if (local56 == 1) {
				Static97.anIntArray219[Static84.anInt1709++] = 2047;
			}
		} else if (local22 == 2) {
			if (Static101.aClass4_Sub17_Sub1_4.method1898(1) == 1) {
				local46 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
				Static239.aClass12_Sub3_Sub2_2.method3371(local46, 2);
				local56 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
				Static239.aClass12_Sub3_Sub2_2.method3371(local56, 2);
			} else {
				local46 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
				Static239.aClass12_Sub3_Sub2_2.method3371(local46, 0);
			}
			local46 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
			if (local46 == 1) {
				Static97.anIntArray219[Static84.anInt1709++] = 2047;
			}
		} else if (local22 == 3) {
			local46 = Static101.aClass4_Sub17_Sub1_4.method1898(7);
			Static210.anInt4103 = Static101.aClass4_Sub17_Sub1_4.method1898(2);
			local56 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
			@Pc(159) int local159 = Static101.aClass4_Sub17_Sub1_4.method1898(7);
			@Pc(164) int local164 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
			if (local164 == 1) {
				Static97.anIntArray219[Static84.anInt1709++] = 2047;
			}
			Static239.aClass12_Sub3_Sub2_2.method3383(local159, local46, local56 == 1);
		}
	}
}
