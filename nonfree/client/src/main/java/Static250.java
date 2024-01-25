import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString39 = "";

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method3753() {
		Static444.method5854(Static38.aClass135_Sub1_1.anInt5103);
		@Pc(18) int local18 = (Static139.anInt2727 >> 10) + (Static165.anInt3049 >> 3);
		@Pc(26) int local26 = (Static345.anInt5799 >> 3) + (Static92.anInt1946 >> 10);
		Static357.anInt5881 = Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 = 0;
		Static452.aClass31_Sub2_Sub1_Sub1_2.method1185(8, 8);
		Static175.aByteArrayArray8 = new byte[18][];
		Static111.anIntArray183 = new int[18];
		Static266.anIntArray627 = new int[18];
		Static44.anIntArrayArray7 = new int[18][4];
		Static92.anIntArray162 = new int[18];
		Static72.aByteArrayArray3 = new byte[18][];
		Static407.aByteArrayArray20 = new byte[18][];
		Static18.anIntArray306 = new int[18];
		Static181.anIntArray293 = new int[18];
		Static390.aByteArrayArray18 = new byte[18][];
		Static136.aByteArrayArray6 = new byte[18][];
		Static431.anIntArray632 = new int[18];
		@Pc(85) int local85 = 0;
		@Pc(105) int local105;
		for (@Pc(94) int local94 = (local18 - (Static195.anInt3537 >> 4)) / 8; local94 <= ((Static195.anInt3537 >> 4) + local18) / 8; local94++) {
			for (local105 = (local26 - (Static118.anInt2419 >> 4)) / 8; local105 <= (local26 + (Static118.anInt2419 >> 4)) / 8; local105++) {
				@Pc(113) int local113 = (local94 << 8) + local105;
				Static266.anIntArray627[local85] = local113;
				Static111.anIntArray183[local85] = Static334.aClass246_179.method5478("m" + local94 + "_" + local105);
				Static431.anIntArray632[local85] = Static334.aClass246_179.method5478("l" + local94 + "_" + local105);
				Static92.anIntArray162[local85] = Static334.aClass246_179.method5478("n" + local94 + "_" + local105);
				Static18.anIntArray306[local85] = Static334.aClass246_179.method5478("um" + local94 + "_" + local105);
				Static181.anIntArray293[local85] = Static334.aClass246_179.method5478("ul" + local94 + "_" + local105);
				if (Static92.anIntArray162[local85] == -1) {
					Static111.anIntArray183[local85] = -1;
					Static431.anIntArray632[local85] = -1;
					Static18.anIntArray306[local85] = -1;
					Static181.anIntArray293[local85] = -1;
				}
				local85++;
			}
		}
		for (local105 = local85; local105 < Static92.anIntArray162.length; local105++) {
			Static92.anIntArray162[local105] = -1;
			Static111.anIntArray183[local105] = -1;
			Static431.anIntArray632[local105] = -1;
			Static18.anIntArray306[local105] = -1;
			Static181.anIntArray293[local105] = -1;
		}
		@Pc(291) byte local291;
		if (Static342.anInt5771 == 1 || Static342.anInt5771 == 2) {
			local291 = 3;
		} else {
			local291 = 7;
		}
		Static410.method5509(local18, false, local26, local291);
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	public static void method3755() {
		Static193.method2984(Static135.aClass179_31);
		Static92.aClass1_Sub5_Sub1_1.method5393(Static16.anInt474);
	}
}
