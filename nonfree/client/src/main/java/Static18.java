import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ar", name = "S", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_2 = new Class146(4, 5);

	@OriginalMember(owner = "client!ar", name = "Y", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_10 = new Class131(78, 16);

	@OriginalMember(owner = "client!ar", name = "Z", descriptor = "I")
	public static int anInt419 = 0;

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V")
	public static void method362() {
		Static156.method2356(Static389.aClass128_Sub1_1.anInt3574);
		@Pc(17) int local17 = (Static437.anInt7555 >> 3) + (Static306.anInt5497 >> 10);
		Static152.anInt2600 = Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 = 0;
		@Pc(30) int local30 = (Static402.anInt6941 >> 10) + (Static134.anInt5502 >> 3);
		Static196.aClass26_Sub2_Sub2_Sub1_1.method5256(8, 8);
		Static442.anIntArray407 = new int[18];
		Static209.aByteArrayArray149 = new byte[18][];
		Static86.anIntArray149 = new int[18];
		Static208.anIntArray319 = new int[18];
		Static157.anIntArray255 = new int[18];
		Static14.aByteArrayArray9 = new byte[18][];
		Static264.aByteArrayArray90 = new byte[18][];
		Static231.anIntArray336 = new int[18];
		Static303.anIntArrayArray151 = new int[18][4];
		Static25.aByteArrayArray15 = new byte[18][];
		Static337.anIntArray642 = new int[18];
		Static68.aByteArrayArray29 = new byte[18][];
		@Pc(76) int local76 = 0;
		@Pc(95) int local95;
		for (@Pc(84) int local84 = (local17 - (Static135.anInt2314 >> 4)) / 8; local84 <= ((Static135.anInt2314 >> 4) + local17) / 8; local84++) {
			for (local95 = (local30 - (Static352.anInt6022 >> 4)) / 8; local95 <= ((Static352.anInt6022 >> 4) + local30) / 8; local95++) {
				@Pc(103) int local103 = (local84 << 8) + local95;
				Static157.anIntArray255[local76] = local103;
				Static86.anIntArray149[local76] = Static88.aClass250_19.method5652("m" + local84 + "_" + local95);
				Static337.anIntArray642[local76] = Static88.aClass250_19.method5652("l" + local84 + "_" + local95);
				Static208.anIntArray319[local76] = Static88.aClass250_19.method5652("n" + local84 + "_" + local95);
				Static231.anIntArray336[local76] = Static88.aClass250_19.method5652("um" + local84 + "_" + local95);
				Static442.anIntArray407[local76] = Static88.aClass250_19.method5652("ul" + local84 + "_" + local95);
				if (Static208.anIntArray319[local76] == -1) {
					Static86.anIntArray149[local76] = -1;
					Static337.anIntArray642[local76] = -1;
					Static231.anIntArray336[local76] = -1;
					Static442.anIntArray407[local76] = -1;
				}
				local76++;
			}
		}
		for (local95 = local76; local95 < Static208.anIntArray319.length; local95++) {
			Static208.anIntArray319[local95] = -1;
			Static86.anIntArray149[local95] = -1;
			Static337.anIntArray642[local95] = -1;
			Static231.anIntArray336[local95] = -1;
			Static442.anIntArray407[local95] = -1;
		}
		Static149.method2261(true, false, local17, local30);
	}
}
