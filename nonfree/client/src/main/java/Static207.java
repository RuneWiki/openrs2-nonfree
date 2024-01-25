import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
	public static int anInt3503;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!ha;")
	public static Class95 aClass95_6;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
	public static final int anInt3508 = 1406;

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
	public static int anInt3511 = -50;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)Z")
	public static boolean method2926(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2929(@OriginalArg(0) Class95 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static319.aBoolean356) {
			local7 = Static274.method3801();
			local9 = Static69.method966();
		}
		arg0.KA(local7, local9, local7 + Static511.anInt8548, local9 + 350);
		arg0.aa(local7, local9, Static511.anInt8548, 350, Static617.anInt9937 << 24 | 0x332277, 1);
		Static170.method7976(Static511.anInt8548 + local7, local9 + 350, local7, local9);
		@Pc(53) int local53 = 350 / Static318.anInt5061;
		@Pc(60) int local60;
		if (Static294.anInt4813 > 0) {
			local60 = 342 - Static318.anInt5061;
			@Pc(70) int local70 = local53 * local60 / (Static294.anInt4813 + local53 - 1);
			@Pc(72) int local72 = 4;
			if (Static294.anInt4813 > 1) {
				local72 = (Static294.anInt4813 - Static16.anInt222 - 1) * (-local70 + local60) / (Static294.anInt4813 - 1) + 4;
			}
			arg0.aa(local7 + Static511.anInt8548 - 16, local9 + local72, 12, local70, Static617.anInt9937 << 24 | 0x332277, 2);
			for (@Pc(113) int local113 = Static16.anInt222; local113 < local53 + Static16.anInt222 && local113 < Static294.anInt4813; local113++) {
				@Pc(122) String[] local122 = Static17.method249(Static397.aStringArray34[local113], '\b');
				@Pc(131) int local131 = (Static511.anInt8548 - 8 - 16) / local122.length;
				for (@Pc(133) int local133 = 0; local133 < local122.length; local133++) {
					@Pc(141) int local141 = local131 * local133 + 8;
					arg0.KA(local141 + local7, local9, local131 + local7 + local141 - 8, local9 + 350);
					Static505.aClass62_21.method5684(local7 + local141, Static163.method2444(local122[local133]), local9 + 350 - Static318.anInt5061 * (local113 - Static16.anInt222) - Static389.aClass256_13.anInt6420 - Static437.anInt7040 - 2, -1, -16777216);
				}
			}
		}
		Static139.aClass62_7.method5679(-1, Static511.anInt8548 + local7 - 25, -16777216, local9 + 350 + -20, "Build: 631");
		arg0.KA(local7, local9, Static511.anInt8548 + local7, local9 - -350);
		arg0.method6990(local9 + 350 - Static437.anInt7040, -1, local7, Static511.anInt8548);
		Static194.aClass62_22.method5684(local7 + 10, "--> " + Static163.method2444(Static61.aString13), local9 + 350 - Static228.aClass256_7.anInt6420 - 1, -1, -16777216);
		if (!Static223.aBoolean258) {
			return;
		}
		local60 = -1;
		if (Static262.anInt5597 % 30 > 15) {
			local60 = 16777215;
		}
		arg0.method6965(Static228.aClass256_7.method5534("--> " + Static163.method2444(Static61.aString13).substring(0, Static553.anInt9045)) + local7 + 10, local60, 12, local9 + 350 - Static228.aClass256_7.anInt6420 - 11);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!wu;)V")
	public static void method2931(@OriginalArg(1) Class380 arg0) {
		Static640.aClass380_136 = arg0;
	}
}
