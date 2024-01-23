import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
	public static int anInt3176;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "[I")
	public static int[] anIntArray244 = new int[2048];

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	public static void method2411() {
		@Pc(7) int local7 = Static48.anInt1406;
		@Pc(9) int local9 = Static95.anInt2633;
		@Pc(11) int local11 = Static75.anInt2037;
		@Pc(15) int local15 = Static197.anInt2398 - 3;
		if (Static233.aClass1_Sub2_Sub4_9 == null || Static249.aClass1_Sub2_Sub4_10 == null) {
			if (Static24.aClass51_10.method1868(Static135.anInt3312) && Static24.aClass51_10.method1868(Static239.anInt5148)) {
				Static233.aClass1_Sub2_Sub4_9 = Static228.method3807(Static135.anInt3312, Static24.aClass51_10);
				Static249.aClass1_Sub2_Sub4_10 = Static228.method3807(Static239.anInt5148, Static24.aClass51_10);
			} else {
				Static189.method3187(local9, local7, local11, 20, Static91.anInt2523, 256 - Static193.anInt4301);
			}
		}
		@Pc(70) int local70;
		@Pc(72) int local72;
		if (Static233.aClass1_Sub2_Sub4_9 != null && Static249.aClass1_Sub2_Sub4_10 != null) {
			local70 = (local11 - Static249.aClass1_Sub2_Sub4_10.anInt1292 * 2) / Static233.aClass1_Sub2_Sub4_9.anInt1292;
			for (local72 = 0; local72 < local70; local72++) {
				Static233.aClass1_Sub2_Sub4_9.method892(Static249.aClass1_Sub2_Sub4_10.anInt1292 + local9 + Static233.aClass1_Sub2_Sub4_9.anInt1292 * local72, local7);
			}
			Static249.aClass1_Sub2_Sub4_10.method892(local9, local7);
			Static249.aClass1_Sub2_Sub4_10.method884(local11 + local9 - Static249.aClass1_Sub2_Sub4_10.anInt1292, local7);
		}
		Static120.aClass1_Sub2_Sub7_2.method1940(Static16.aString354, local9 + 3, local7 + 14, Static209.anInt4575, -1);
		Static189.method3187(local9, local7 + 20, local11, local15 - 20, Static91.anInt2523, 256 - Static193.anInt4301);
		local72 = Static240.anInt5167;
		local70 = Static71.anInt1930;
		@Pc(162) int local162;
		for (@Pc(145) int local145 = 0; local145 < Static230.anInt5417; local145++) {
			local162 = (Static230.anInt5417 - local145 - 1) * 15 + local7 + 20 + 13;
			if (local70 > local9 && local70 < local11 + local9 && local72 > local162 - 13 && local162 + 3 > local72) {
				Static189.method3187(local9, local162 - 12, local11, 15, Static112.anInt2953, 256 - Static259.anInt5468);
			}
		}
		if ((Static224.aClass1_Sub2_Sub4_8 == null || Static128.aClass1_Sub2_Sub4_5 == null || Static37.aClass1_Sub2_Sub4_2 == null) && Static24.aClass51_10.method1868(Static115.anInt3012) && Static24.aClass51_10.method1868(Static51.anInt1458) && Static24.aClass51_10.method1868(Static87.anInt2470)) {
			Static224.aClass1_Sub2_Sub4_8 = Static228.method3807(Static115.anInt3012, Static24.aClass51_10);
			Static128.aClass1_Sub2_Sub4_5 = Static228.method3807(Static51.anInt1458, Static24.aClass51_10);
			Static37.aClass1_Sub2_Sub4_2 = Static228.method3807(Static87.anInt2470, Static24.aClass51_10);
		}
		@Pc(262) int local262;
		@Pc(298) int local298;
		if (Static224.aClass1_Sub2_Sub4_8 != null && Static128.aClass1_Sub2_Sub4_5 != null && Static37.aClass1_Sub2_Sub4_2 != null) {
			local162 = (local11 - Static37.aClass1_Sub2_Sub4_2.anInt1292 * 2) / Static224.aClass1_Sub2_Sub4_8.anInt1292;
			for (local262 = 0; local262 < local162; local262++) {
				Static224.aClass1_Sub2_Sub4_8.method892(Static224.aClass1_Sub2_Sub4_8.anInt1292 * local262 + local9 + Static37.aClass1_Sub2_Sub4_2.anInt1292, local15 + local7 - Static224.aClass1_Sub2_Sub4_8.anInt1291);
			}
			local298 = (local15 - Static37.aClass1_Sub2_Sub4_2.anInt1291 - 20) / Static128.aClass1_Sub2_Sub4_5.anInt1291;
			for (@Pc(300) int local300 = 0; local300 < local298; local300++) {
				Static128.aClass1_Sub2_Sub4_5.method892(local9, local7 + Static128.aClass1_Sub2_Sub4_5.anInt1291 * local300 + 20);
				Static128.aClass1_Sub2_Sub4_5.method884(local11 + local9 - Static128.aClass1_Sub2_Sub4_5.anInt1292, local7 - -(local300 * Static128.aClass1_Sub2_Sub4_5.anInt1291) + 20);
			}
			Static37.aClass1_Sub2_Sub4_2.method892(local9, local7 + local15 - Static37.aClass1_Sub2_Sub4_2.anInt1291);
			Static37.aClass1_Sub2_Sub4_2.method884(local9 + local11 - Static37.aClass1_Sub2_Sub4_2.anInt1292, local7 + local15 + -Static37.aClass1_Sub2_Sub4_2.anInt1291);
		}
		for (local162 = 0; local162 < Static230.anInt5417; local162++) {
			local262 = local7 + (-local162 + Static230.anInt5417 + -1) * 15 + 13 + 20;
			local298 = Static209.anInt4575;
			if (local70 > local9 && local70 < local9 + local11 && local262 - 13 < local72 && local72 < local262 + 3) {
				local298 = Static98.anInt2702;
			}
			Static120.aClass1_Sub2_Sub7_2.method1940(Static174.method2990(local162), local9 + 3, local262, local298, 0);
		}
		Static116.method2308(Static197.anInt2398, Static75.anInt2037, Static48.anInt1406, Static95.anInt2633);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBI)I")
	public static int method2412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 / arg0;
		@Pc(9) int local9 = arg2 & arg0 - 1;
		@Pc(13) int local13 = arg1 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg1;
		@Pc(28) int local28 = Static21.method409(local13, local3);
		@Pc(35) int local35 = Static21.method409(local13, local3 + 1);
		@Pc(42) int local42 = Static21.method409(local13 + 1, local3);
		@Pc(51) int local51 = Static21.method409(local13 + 1, local3 + 1);
		@Pc(58) int local58 = Static82.method1656(local28, arg0, local35, local9);
		@Pc(70) int local70 = Static82.method1656(local42, arg0, local51, local9);
		return Static82.method1656(local58, arg0, local70, local23);
	}
}
