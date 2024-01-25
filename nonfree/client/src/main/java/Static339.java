import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!st;")
	public static final Class314 aClass314_19 = new Class314(7, 2);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	public static void method915() {
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub13_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub13_2);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub8_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub8_2);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub29_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub1_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub18_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub16_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub10_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub2_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub28_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub6_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub27_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub7_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub26_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub26_2);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub3_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub11_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub25_1);
		Static578.method8094();
		Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub20_1);
		Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub14_1);
		Static408.method6354();
		Static183.method2986();
		Static264.aBoolean581 = true;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	public static void method916() {
		Static136.method2361(Static32.aClass3_Sub41_3.aClass7_Sub11_1.method5159());
		@Pc(25) int local25 = (Static419.anInt7345 >> 12) + (Static427.anInt7462 >> 3);
		@Pc(33) int local33 = (Static522.anInt8849 >> 12) + (Static22.anInt329 >> 3);
		Static65.anInt1298 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 = 0;
		Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method1153(8, 8);
		Static151.aByteArrayArray10 = new byte[18][];
		Static606.aByteArrayArray28 = new byte[18][];
		Static544.anIntArray571 = new int[18];
		Static454.anIntArray476 = new int[18];
		Static427.anIntArray447 = new int[18];
		Static289.aByteArrayArray13 = new byte[18][];
		Static543.anIntArrayArray54 = new int[18][4];
		Static50.aByteArrayArray1 = new byte[18][];
		Static243.anIntArray265 = new int[18];
		Static247.anIntArray268 = new int[18];
		Static316.aByteArrayArray16 = new byte[18][];
		Static252.anIntArray273 = new int[18];
		@Pc(84) int local84 = 0;
		@Pc(104) int local104;
		for (@Pc(93) int local93 = (local25 - (Static399.anInt7121 >> 4)) / 8; local93 <= ((Static399.anInt7121 >> 4) + local25) / 8; local93++) {
			for (local104 = (local33 - (Static24.anInt345 >> 4)) / 8; local104 <= ((Static24.anInt345 >> 4) + local33) / 8; local104++) {
				@Pc(112) int local112 = (local93 << 8) + local104;
				Static454.anIntArray476[local84] = local112;
				Static544.anIntArray571[local84] = Static235.aClass343_118.method8158("m" + local93 + "_" + local104);
				Static247.anIntArray268[local84] = Static235.aClass343_118.method8158("l" + local93 + "_" + local104);
				Static427.anIntArray447[local84] = Static235.aClass343_118.method8158("n" + local93 + "_" + local104);
				Static243.anIntArray265[local84] = Static235.aClass343_118.method8158("um" + local93 + "_" + local104);
				Static252.anIntArray273[local84] = Static235.aClass343_118.method8158("ul" + local93 + "_" + local104);
				if (Static427.anIntArray447[local84] == -1) {
					Static544.anIntArray571[local84] = -1;
					Static247.anIntArray268[local84] = -1;
					Static243.anIntArray265[local84] = -1;
					Static252.anIntArray273[local84] = -1;
				}
				local84++;
			}
		}
		for (local104 = local84; local104 < Static427.anIntArray447.length; local104++) {
			Static427.anIntArray447[local104] = -1;
			Static544.anIntArray571[local104] = -1;
			Static247.anIntArray268[local104] = -1;
			Static243.anIntArray265[local104] = -1;
			Static252.anIntArray273[local104] = -1;
		}
		@Pc(282) byte local282;
		if (Static82.anInt1653 == 3) {
			local282 = 4;
		} else {
			local282 = 8;
		}
		Static442.method6636(local33, local25, local282, false);
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)I")
	public static int method917() {
		if (Static355.aFrame7 == null) {
			return Static481.aBoolean591 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
