import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!js", name = "e", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "[[Lclient!wca;")
	public static Class310[][] aClass310ArrayArray2;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public static void method3656() {
		Static291.method4614(Static281.aClass2_Sub19_Sub1_1.anInt2189);
		@Pc(19) int local19 = (Static187.anInt3432 >> 10) + (Static238.anInt4280 >> 3);
		Static208.anInt3742 = Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 = 0;
		@Pc(33) int local33 = (Static353.anInt5258 >> 10) + (Static371.anInt6936 >> 3);
		Static266.aClass1_Sub1_Sub2_Sub1_1.method2949(8, 8);
		Static46.aByteArrayArray3 = new byte[18][];
		Static263.aByteArrayArray16 = new byte[18][];
		Static403.anIntArrayArray67 = new int[18][4];
		Static511.anIntArray679 = new int[18];
		Static215.anIntArray621 = new int[18];
		Static444.anIntArray613 = new int[18];
		Static475.anIntArray650 = new int[18];
		Static357.aByteArrayArray22 = new byte[18][];
		Static331.aByteArrayArray21 = new byte[18][];
		Static475.anIntArray649 = new int[18];
		Static390.anIntArray573 = new int[18];
		Static138.aByteArrayArray13 = new byte[18][];
		@Pc(79) int local79 = 0;
		@Pc(99) int local99;
		for (@Pc(88) int local88 = (local19 - (Static363.anInt1158 >> 4)) / 8; local88 <= ((Static363.anInt1158 >> 4) + local19) / 8; local88++) {
			for (local99 = (local33 - (Static511.anInt8889 >> 4)) / 8; local99 <= (local33 + (Static511.anInt8889 >> 4)) / 8; local99++) {
				@Pc(107) int local107 = local99 + (local88 << 8);
				Static444.anIntArray613[local79] = local107;
				Static390.anIntArray573[local79] = Static360.aClass53_151.method1608("m" + local88 + "_" + local99);
				Static215.anIntArray621[local79] = Static360.aClass53_151.method1608("l" + local88 + "_" + local99);
				Static475.anIntArray650[local79] = Static360.aClass53_151.method1608("n" + local88 + "_" + local99);
				Static511.anIntArray679[local79] = Static360.aClass53_151.method1608("um" + local88 + "_" + local99);
				Static475.anIntArray649[local79] = Static360.aClass53_151.method1608("ul" + local88 + "_" + local99);
				if (Static475.anIntArray650[local79] == -1) {
					Static390.anIntArray573[local79] = -1;
					Static215.anIntArray621[local79] = -1;
					Static511.anIntArray679[local79] = -1;
					Static475.anIntArray649[local79] = -1;
				}
				local79++;
			}
		}
		for (local99 = local79; local99 < Static475.anIntArray650.length; local99++) {
			Static475.anIntArray650[local99] = -1;
			Static390.anIntArray573[local99] = -1;
			Static215.anIntArray621[local99] = -1;
			Static511.anIntArray679[local99] = -1;
			Static475.anIntArray649[local99] = -1;
		}
		@Pc(280) byte local280;
		if (Static271.anInt8654 == 1 || Static271.anInt8654 == 2) {
			local280 = 3;
		} else {
			local280 = 7;
		}
		Static447.method6827(false, local33, local280, local19);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)I")
	public static int method3658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg0 & arg1 - 1;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg2 & arg1 - 1;
		@Pc(30) int local30 = Static13.method445(local17, local7);
		@Pc(37) int local37 = Static13.method445(local17, local7 + 1);
		@Pc(44) int local44 = Static13.method445(local17 + 1, local7);
		@Pc(53) int local53 = Static13.method445(local17 + 1, local7 + 1);
		@Pc(60) int local60 = Static309.method4811(local13, local30, arg1, local37);
		@Pc(67) int local67 = Static309.method4811(local13, local44, arg1, local53);
		return Static309.method4811(local23, local60, arg1, local67);
	}
}
