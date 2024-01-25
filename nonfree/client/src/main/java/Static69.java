import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[6][];

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_7 = new Class166(30);

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!ada;")
	public static Class8 aClass8_9 = new Class8();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	public static void method1194() {
		Static351.method5660(Static348.aClass6_Sub22_19.aClass15_Sub24_1.method8343());
		@Pc(19) int local19 = (Static580.anInt9662 >> 12) + (Static606.anInt8651 >> 3);
		Static175.anInt3636 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 = 0;
		@Pc(33) int local33 = (Static524.anInt9123 >> 12) + (Static195.anInt3961 >> 3);
		Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method1024(8, 8);
		Static495.anIntArrayArray43 = new int[18][4];
		Static480.anIntArray523 = new int[18];
		Static91.aByteArrayArray23 = new byte[18][];
		Static510.aByteArrayArray140 = new byte[18][];
		Static117.aByteArrayArray43 = new byte[18][];
		Static29.anIntArray36 = new int[18];
		Static173.anIntArray217 = new int[18];
		Static85.aByteArrayArray31 = new byte[18][];
		Static330.anIntArray372 = new int[18];
		Static327.aByteArrayArray102 = new byte[18][];
		anIntArray100 = new int[18];
		Static82.anIntArray114 = new int[18];
		@Pc(79) int local79 = 0;
		@Pc(99) int local99;
		for (@Pc(88) int local88 = (local19 - (Static442.anInt7975 >> 4)) / 8; local88 <= (local19 + (Static442.anInt7975 >> 4)) / 8; local88++) {
			for (local99 = (local33 - (Static284.anInt7916 >> 4)) / 8; local99 <= ((Static284.anInt7916 >> 4) + local33) / 8; local99++) {
				@Pc(107) int local107 = (local88 << 8) + local99;
				Static480.anIntArray523[local79] = local107;
				Static29.anIntArray36[local79] = Static503.aClass353_102.method8410("m" + local88 + "_" + local99);
				anIntArray100[local79] = Static503.aClass353_102.method8410("l" + local88 + "_" + local99);
				Static82.anIntArray114[local79] = Static503.aClass353_102.method8410("n" + local88 + "_" + local99);
				Static173.anIntArray217[local79] = Static503.aClass353_102.method8410("um" + local88 + "_" + local99);
				Static330.anIntArray372[local79] = Static503.aClass353_102.method8410("ul" + local88 + "_" + local99);
				if (Static82.anIntArray114[local79] == -1) {
					Static29.anIntArray36[local79] = -1;
					anIntArray100[local79] = -1;
					Static173.anIntArray217[local79] = -1;
					Static330.anIntArray372[local79] = -1;
				}
				local79++;
			}
		}
		for (local99 = local79; local99 < Static82.anIntArray114.length; local99++) {
			Static82.anIntArray114[local99] = -1;
			Static29.anIntArray36[local99] = -1;
			anIntArray100[local99] = -1;
			Static173.anIntArray217[local99] = -1;
			Static330.anIntArray372[local99] = -1;
		}
		@Pc(285) byte local285;
		if (Static554.anInt1821 == 3) {
			local285 = 4;
		} else {
			local285 = 8;
		}
		Static323.method5375(false, local19, local33, local285);
	}
}
