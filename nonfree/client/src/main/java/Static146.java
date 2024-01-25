import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "Lclient!h;")
	public static final Class114 aClass114_65 = new Class114("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_51 = new Class6(49, 8);

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
	public static int anInt3337 = 0;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	public static void method2995() {
		Static265.method4402(Static89.aClass1_Sub28_Sub1_1.anInt4905);
		@Pc(15) int local15 = (Static308.anInt5918 >> 10) + (Static324.anInt6132 >> 3);
		Static245.anInt4747 = Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 = 0;
		@Pc(29) int local29 = (Static347.anInt6404 >> 10) + (Static517.anInt8716 >> 3);
		Static16.aClass47_Sub2_Sub3_Sub2_1.method4378(8, 8);
		Static161.aByteArrayArray15 = new byte[18][];
		Static130.aByteArrayArray12 = new byte[18][];
		Static270.anIntArrayArray37 = new int[18][4];
		Static480.anIntArray638 = new int[18];
		Static404.anIntArray782 = new int[18];
		Static540.aByteArrayArray32 = new byte[18][];
		Static213.anIntArray329 = new int[18];
		Static419.aByteArrayArray28 = new byte[18][];
		Static467.anIntArray624 = new int[18];
		Static397.aByteArrayArray25 = new byte[18][];
		Static85.anIntArray178 = new int[18];
		Static128.anIntArray247 = new int[18];
		@Pc(75) int local75 = 0;
		@Pc(94) int local94;
		for (@Pc(84) int local84 = (local15 - (Static542.anInt9387 >> 4)) / 8; local84 <= ((Static542.anInt9387 >> 4) + local15) / 8; local84++) {
			for (local94 = (local29 - (Static36.anInt1324 >> 4)) / 8; local94 <= ((Static36.anInt1324 >> 4) + local29) / 8; local94++) {
				@Pc(101) int local101 = (local84 << 8) + local94;
				Static85.anIntArray178[local75] = local101;
				Static128.anIntArray247[local75] = Static350.aClass160_74.method4199("m" + local84 + "_" + local94);
				Static480.anIntArray638[local75] = Static350.aClass160_74.method4199("l" + local84 + "_" + local94);
				Static213.anIntArray329[local75] = Static350.aClass160_74.method4199("n" + local84 + "_" + local94);
				Static467.anIntArray624[local75] = Static350.aClass160_74.method4199("um" + local84 + "_" + local94);
				Static404.anIntArray782[local75] = Static350.aClass160_74.method4199("ul" + local84 + "_" + local94);
				if (Static213.anIntArray329[local75] == -1) {
					Static128.anIntArray247[local75] = -1;
					Static480.anIntArray638[local75] = -1;
					Static467.anIntArray624[local75] = -1;
					Static404.anIntArray782[local75] = -1;
				}
				local75++;
			}
		}
		for (local94 = local75; local94 < Static213.anIntArray329.length; local94++) {
			Static213.anIntArray329[local94] = -1;
			Static128.anIntArray247[local94] = -1;
			Static480.anIntArray638[local94] = -1;
			Static467.anIntArray624[local94] = -1;
			Static404.anIntArray782[local94] = -1;
		}
		@Pc(272) byte local272;
		if (Static51.anInt7926 == 1 || Static51.anInt7926 == 2) {
			local272 = 3;
		} else {
			local272 = 7;
		}
		Static292.method4920(local29, local272, local15, false);
	}
}
