import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
	public static void method2508() {
		Static385.method5400(Static336.aClass3_Sub41_18.aClass14_Sub22_1.method6221());
		@Pc(19) int local19 = (Static534.anInt8358 >> 3) + (Static370.anInt6266 >> 12);
		@Pc(28) int local28 = (Static564.anInt9117 >> 12) + (Static402.anInt6661 >> 3);
		Static570.anInt9192 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 = 0;
		Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method1489(8, 8);
		Static614.anIntArray542 = new int[18];
		Static115.anIntArray118 = new int[18];
		Static455.aByteArrayArray21 = new byte[18][];
		Static517.anIntArrayArray49 = new int[18][4];
		Static110.aByteArrayArray7 = new byte[18][];
		Static144.anIntArray149 = new int[18];
		Static322.aByteArrayArray16 = new byte[18][];
		Static448.anIntArray394 = new int[18];
		Static572.anIntArray485 = new int[18];
		Static315.aByteArrayArray15 = new byte[18][];
		Static376.aByteArrayArray18 = new byte[18][];
		Static312.anIntArray296 = new int[18];
		@Pc(79) int local79 = 0;
		@Pc(98) int local98;
		for (@Pc(87) int local87 = (local19 - (Static98.anInt361 >> 4)) / 8; local87 <= ((Static98.anInt361 >> 4) + local19) / 8; local87++) {
			for (local98 = (local28 - (Static438.anInt7120 >> 4)) / 8; local98 <= (local28 + (Static438.anInt7120 >> 4)) / 8; local98++) {
				@Pc(106) int local106 = local98 + (local87 << 8);
				Static448.anIntArray394[local79] = local106;
				Static312.anIntArray296[local79] = Static405.aClass362_87.method8353("m" + local87 + "_" + local98);
				Static144.anIntArray149[local79] = Static405.aClass362_87.method8353("l" + local87 + "_" + local98);
				Static614.anIntArray542[local79] = Static405.aClass362_87.method8353("n" + local87 + "_" + local98);
				Static115.anIntArray118[local79] = Static405.aClass362_87.method8353("um" + local87 + "_" + local98);
				Static572.anIntArray485[local79] = Static405.aClass362_87.method8353("ul" + local87 + "_" + local98);
				if (Static614.anIntArray542[local79] == -1) {
					Static312.anIntArray296[local79] = -1;
					Static144.anIntArray149[local79] = -1;
					Static115.anIntArray118[local79] = -1;
					Static572.anIntArray485[local79] = -1;
				}
				local79++;
			}
		}
		for (local98 = local79; local98 < Static614.anIntArray542.length; local98++) {
			Static614.anIntArray542[local98] = -1;
			Static312.anIntArray296[local98] = -1;
			Static144.anIntArray149[local98] = -1;
			Static115.anIntArray118[local98] = -1;
			Static572.anIntArray485[local98] = -1;
		}
		@Pc(280) byte local280;
		if (Static221.anInt3831 == 3) {
			local280 = 4;
		} else {
			local280 = 8;
		}
		Static469.method6284(local28, false, local19, local280);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)V")
	public static void method2509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class3_Sub5_Sub20 local19 = Static447.method6065((long) arg0 << 32 | (long) arg1, 19);
		local19.method8834();
	}
}
