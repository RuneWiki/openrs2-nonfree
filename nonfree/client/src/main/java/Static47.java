import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bs", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString24 = "";

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(B)V")
	public static void method853() {
		Static425.anInt6885 = 0;
		@Pc(11) int local11 = Static70.aClass2_Sub29_Sub2_1.method5209();
		@Pc(19) int local19 = Static70.aClass2_Sub29_Sub2_1.method5229();
		@Pc(30) boolean local30 = Static70.aClass2_Sub29_Sub2_1.method5183() == 1;
		@Pc(34) int local34 = Static70.aClass2_Sub29_Sub2_1.method5225();
		Static352.method5538();
		Static291.method4614(local11);
		@Pc(46) int local46 = (Static472.anInt8247 - Static70.aClass2_Sub29_Sub2_1.anInt6132) / 16;
		Static403.anIntArrayArray67 = new int[local46][4];
		@Pc(56) int local56;
		for (@Pc(52) int local52 = 0; local52 < local46; local52++) {
			for (local56 = 0; local56 < 4; local56++) {
				Static403.anIntArrayArray67[local52][local56] = Static70.aClass2_Sub29_Sub2_1.method5198();
			}
		}
		Static46.aByteArrayArray3 = null;
		Static511.anIntArray679 = new int[local46];
		Static263.aByteArrayArray16 = new byte[local46][];
		Static475.anIntArray649 = new int[local46];
		Static475.anIntArray650 = null;
		Static138.aByteArrayArray13 = new byte[local46][];
		Static444.anIntArray613 = new int[local46];
		Static390.anIntArray573 = new int[local46];
		Static357.aByteArrayArray22 = new byte[local46][];
		Static215.anIntArray621 = new int[local46];
		Static331.aByteArrayArray21 = new byte[local46][];
		local46 = 0;
		for (local56 = (local34 - (Static363.anInt1158 >> 4)) / 8; local56 <= ((Static363.anInt1158 >> 4) + local34) / 8; local56++) {
			for (@Pc(127) int local127 = (local19 - (Static511.anInt8889 >> 4)) / 8; local127 <= (local19 + (Static511.anInt8889 >> 4)) / 8; local127++) {
				Static444.anIntArray613[local46] = (local56 << 8) + local127;
				Static390.anIntArray573[local46] = Static360.aClass53_151.method1608("m" + local56 + "_" + local127);
				Static215.anIntArray621[local46] = Static360.aClass53_151.method1608("l" + local56 + "_" + local127);
				Static511.anIntArray679[local46] = Static360.aClass53_151.method1608("um" + local56 + "_" + local127);
				Static475.anIntArray649[local46] = Static360.aClass53_151.method1608("ul" + local56 + "_" + local127);
				local46++;
			}
		}
		Static447.method6827(local30, local19, 10, local34);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!wca;)Lclient!wca;")
	public static Class310 method854(@OriginalArg(1) Class310 arg0) {
		@Pc(6) Class310 local6 = Static67.method1241(arg0);
		if (local6 == null) {
			local6 = arg0.aClass310_17;
		}
		return local6;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BIII)V")
	public static void method856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class142 local13 = Static355.aClass142ArrayArray1[arg2][arg1];
		Static108.method2073(arg0, local13 == null ? Static438.aClass142_1 : local13);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(BI)V")
	public static void method857(@OriginalArg(1) int arg0) {
		if (Static155.anIntArray340 == null || arg0 > Static155.anIntArray340.length) {
			Static155.anIntArray340 = new int[arg0];
		}
	}
}
