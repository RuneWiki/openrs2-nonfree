import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!nm;")
	public static Class146 aClass146_2;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array14;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!cq;")
	public static Class55 aClass55_3;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	public static int anInt5982;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!ei;")
	public static Class83 aClass83_7;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!kl;")
	public static final Class174 aClass174_10 = new Class174(1);

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)Z")
	public static boolean method4979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	public static void method4980() {
		Static289.method4853(Static300.aClass5_Sub28_Sub1_1.anInt4869);
		@Pc(22) int local22 = (Static515.anInt3214 >> 3) + (Static367.anInt6861 >> 10);
		@Pc(30) int local30 = (Static364.anInt6817 >> 10) + (Static338.anInt6353 >> 3);
		Static367.anInt6860 = Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 = 0;
		Static35.aClass15_Sub2_Sub1_Sub1_1.method800(8, 8);
		Static103.anIntArray76 = new int[18];
		Static226.aByteArrayArray31 = new byte[18][];
		Static141.anIntArray237 = new int[18];
		Static339.anIntArray474 = new int[18];
		Static339.anIntArray475 = new int[18];
		Static254.anIntArray688 = new int[18];
		Static201.anIntArray274 = new int[18];
		Static124.aByteArrayArray13 = new byte[18][];
		Static348.aByteArrayArray36 = new byte[18][];
		Static85.aByteArrayArray11 = new byte[18][];
		Static213.anIntArrayArray28 = new int[18][4];
		Static178.aByteArrayArray17 = new byte[18][];
		@Pc(81) int local81 = 0;
		@Pc(101) int local101;
		for (@Pc(90) int local90 = (local22 - (Static460.anInt7894 >> 4)) / 8; local90 <= (local22 + (Static460.anInt7894 >> 4)) / 8; local90++) {
			for (local101 = (local30 - (Static235.anInt4493 >> 4)) / 8; local101 <= ((Static235.anInt4493 >> 4) + local30) / 8; local101++) {
				@Pc(109) int local109 = local101 + (local90 << 8);
				Static103.anIntArray76[local81] = local109;
				Static141.anIntArray237[local81] = Static338.aClass117_151.method2982("m" + local90 + "_" + local101);
				Static339.anIntArray474[local81] = Static338.aClass117_151.method2982("l" + local90 + "_" + local101);
				Static201.anIntArray274[local81] = Static338.aClass117_151.method2982("n" + local90 + "_" + local101);
				Static339.anIntArray475[local81] = Static338.aClass117_151.method2982("um" + local90 + "_" + local101);
				Static254.anIntArray688[local81] = Static338.aClass117_151.method2982("ul" + local90 + "_" + local101);
				if (Static201.anIntArray274[local81] == -1) {
					Static141.anIntArray237[local81] = -1;
					Static339.anIntArray474[local81] = -1;
					Static339.anIntArray475[local81] = -1;
					Static254.anIntArray688[local81] = -1;
				}
				local81++;
			}
		}
		for (local101 = local81; local101 < Static201.anIntArray274.length; local101++) {
			Static201.anIntArray274[local101] = -1;
			Static141.anIntArray237[local101] = -1;
			Static339.anIntArray474[local101] = -1;
			Static339.anIntArray475[local101] = -1;
			Static254.anIntArray688[local101] = -1;
		}
		@Pc(284) byte local284;
		if (Static389.anInt7024 == 1 || Static389.anInt7024 == 2) {
			local284 = 3;
		} else {
			local284 = 7;
		}
		Static110.method2215(local284, false, local30, local22);
	}
}
