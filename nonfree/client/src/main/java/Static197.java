import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
	public static int anInt3210;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
	public static void method2805() {
		Static544.method7522(Static655.aClass5_Sub36_29.aClass2_Sub11_1.method5016());
		@Pc(19) int local19 = (Static570.anInt9347 >> 12) + (Static454.anInt7910 >> 3);
		Static458.anInt7955 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 = 0;
		@Pc(33) int local33 = (Static105.anInt1868 >> 12) + (Static48.anInt750 >> 3);
		Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7942(8, 8);
		Static373.aByteArrayArray15 = new byte[18][];
		Static620.aByteArrayArray22 = new byte[18][];
		Static155.aByteArrayArray8 = new byte[18][];
		Static655.anIntArray596 = new int[18];
		Static640.anIntArray588 = new int[18];
		Static490.aByteArrayArray19 = new byte[18][];
		Static336.aByteArrayArray11 = new byte[18][];
		Static517.anIntArray477 = new int[18];
		Static235.anIntArray236 = new int[18];
		Static249.anIntArray245 = new int[18];
		Static286.anIntArray263 = new int[18];
		Static636.anIntArrayArray87 = new int[18][4];
		@Pc(84) int local84 = 0;
		@Pc(104) int local104;
		for (@Pc(93) int local93 = (local19 - (Static124.anInt2150 >> 4)) / 8; local93 <= ((Static124.anInt2150 >> 4) + local19) / 8; local93++) {
			for (local104 = (local33 - (Static64.anInt1015 >> 4)) / 8; local104 <= (local33 + (Static64.anInt1015 >> 4)) / 8; local104++) {
				@Pc(113) int local113 = (local93 << 8) + local104;
				Static249.anIntArray245[local84] = local113;
				Static640.anIntArray588[local84] = Static570.aClass50_162.method900("m" + local93 + "_" + local104);
				Static235.anIntArray236[local84] = Static570.aClass50_162.method900("l" + local93 + "_" + local104);
				Static655.anIntArray596[local84] = Static570.aClass50_162.method900("n" + local93 + "_" + local104);
				Static517.anIntArray477[local84] = Static570.aClass50_162.method900("um" + local93 + "_" + local104);
				Static286.anIntArray263[local84] = Static570.aClass50_162.method900("ul" + local93 + "_" + local104);
				if (Static655.anIntArray596[local84] == -1) {
					Static640.anIntArray588[local84] = -1;
					Static235.anIntArray236[local84] = -1;
					Static517.anIntArray477[local84] = -1;
					Static286.anIntArray263[local84] = -1;
				}
				local84++;
			}
		}
		for (local104 = local84; local104 < Static655.anIntArray596.length; local104++) {
			Static655.anIntArray596[local104] = -1;
			Static640.anIntArray588[local104] = -1;
			Static235.anIntArray236[local104] = -1;
			Static517.anIntArray477[local104] = -1;
			Static286.anIntArray263[local104] = -1;
		}
		@Pc(282) byte local282;
		if (Static539.anInt8853 == 3) {
			local282 = 4;
		} else {
			local282 = 8;
		}
		Static505.method7281(false, local33, local282, local19);
	}
}
