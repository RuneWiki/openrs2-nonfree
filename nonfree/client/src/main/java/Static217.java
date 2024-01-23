import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!q", name = "c", descriptor = "[[Lclient!lg;")
	public static Class97[][] aClass97ArrayArray1;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Lclient!wb;")
	public static Class4_Sub2_Sub4 aClass4_Sub2_Sub4_8;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "I")
	public static int anInt4191;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V")
	public static void method3394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static65.anInt5704 == 1) {
			Static133.aClass4_Sub2_Sub4Array8[Static229.anInt4595 / 100].method4142(Static137.anInt2702 - 8, Static135.anInt2679 - 8);
		}
		if (Static65.anInt5704 == 2) {
			Static133.aClass4_Sub2_Sub4Array8[Static229.anInt4595 / 100 + 4].method4142(Static137.anInt2702 - 8, Static135.anInt2679 - 8);
		}
		Static162.method2609();
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method3395() {
		@Pc(7) int local7;
		@Pc(19) int local19;
		for (local7 = -1; local7 < Static85.anInt1730; local7++) {
			if (local7 == -1) {
				local19 = 2047;
			} else {
				local19 = Static291.anIntArray457[local7];
			}
			@Pc(27) Class13_Sub5_Sub1 local27 = Static100.aClass13_Sub5_Sub1Array1[local19];
			if (local27 != null && local27.anInt5253 > 0) {
				local27.anInt5253--;
				if (local27.anInt5253 == 0) {
					local27.aString178 = null;
				}
			}
		}
		for (local7 = 0; local7 < Static99.anInt1950; local7++) {
			local19 = Static123.anIntArray214[local7];
			@Pc(71) Class13_Sub5_Sub2 local71 = Static260.aClass13_Sub5_Sub2Array114[local19];
			if (local71 != null && local71.anInt5253 > 0) {
				local71.anInt5253--;
				if (local71.anInt5253 == 0) {
					local71.aString178 = null;
				}
			}
		}
	}
}
