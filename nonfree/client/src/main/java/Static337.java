import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!oaa", name = "T", descriptor = "Lclient!cj;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!oaa", name = "M", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_96 = new Class45("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!oaa", name = "S", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_318 = new Class305(29, 12);

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V")
	public static void method5697() {
		Static42.method1217(Static286.aClass1_Sub15_Sub1_1.anInt7036);
		@Pc(17) int local17 = (Static538.anInt9485 >> 3) + (Static321.anInt6064 >> 10);
		@Pc(25) int local25 = (Static46.anInt1256 >> 10) + (Static282.anInt5380 >> 3);
		Static322.anInt6113 = Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 = 0;
		Static107.aClass20_Sub1_Sub1_Sub1_1.method729(8, 8);
		Static373.aByteArrayArray19 = new byte[18][];
		Static395.anIntArray676 = new int[18];
		Static473.aByteArrayArray25 = new byte[18][];
		Static77.aByteArrayArray10 = new byte[18][];
		Static464.aByteArrayArray24 = new byte[18][];
		Static378.anIntArray656 = new int[18];
		Static46.anIntArray85 = new int[18];
		Static144.anIntArray245 = new int[18];
		Static214.anIntArray337 = new int[18];
		Static268.aByteArrayArray15 = new byte[18][];
		Static16.anIntArrayArray125 = new int[18][4];
		Static487.anIntArray754 = new int[18];
		@Pc(76) int local76 = 0;
		@Pc(95) int local95;
		for (@Pc(85) int local85 = (local17 - (Static237.anInt4563 >> 4)) / 8; local85 <= (local17 + (Static237.anInt4563 >> 4)) / 8; local85++) {
			for (local95 = (local25 - (Static373.anInt6694 >> 4)) / 8; local95 <= ((Static373.anInt6694 >> 4) + local25) / 8; local95++) {
				@Pc(103) int local103 = (local85 << 8) + local95;
				Static378.anIntArray656[local76] = local103;
				Static46.anIntArray85[local76] = Static10.aClass69_4.method1909("m" + local85 + "_" + local95);
				Static487.anIntArray754[local76] = Static10.aClass69_4.method1909("l" + local85 + "_" + local95);
				Static144.anIntArray245[local76] = Static10.aClass69_4.method1909("n" + local85 + "_" + local95);
				Static214.anIntArray337[local76] = Static10.aClass69_4.method1909("um" + local85 + "_" + local95);
				Static395.anIntArray676[local76] = Static10.aClass69_4.method1909("ul" + local85 + "_" + local95);
				if (Static144.anIntArray245[local76] == -1) {
					Static46.anIntArray85[local76] = -1;
					Static487.anIntArray754[local76] = -1;
					Static214.anIntArray337[local76] = -1;
					Static395.anIntArray676[local76] = -1;
				}
				local76++;
			}
		}
		for (local95 = local76; local95 < Static144.anIntArray245.length; local95++) {
			Static144.anIntArray245[local95] = -1;
			Static46.anIntArray85[local95] = -1;
			Static487.anIntArray754[local95] = -1;
			Static214.anIntArray337[local95] = -1;
			Static395.anIntArray676[local95] = -1;
		}
		@Pc(281) byte local281;
		if (Static186.anInt3863 == 1 || Static186.anInt3863 == 2) {
			local281 = 3;
		} else {
			local281 = 7;
		}
		Static164.method2938(local17, local25, local281, false);
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(II)Z")
	public static boolean method5699(@OriginalArg(1) int arg0) {
		if (arg0 == 46 || arg0 == 6 || arg0 == 12 || arg0 == 5 || arg0 == 22) {
			return true;
		} else {
			return arg0 == 16 || arg0 == 1011;
		}
	}
}
