import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "Lclient!eca;")
	public static Class76 aClass76_2;

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "Lclient!nn;")
	public static final Class212 aClass212_8 = new Class212(7, 7);

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIZII)V")
	public static void method2830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(23) int local23 = arg4 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(50) int local50 = local23 * (Static459.aShort101 - Static261.aShort68) / 100 + Static261.aShort68;
		if (Static26.aShort2 > local50) {
			local50 = Static26.aShort2;
		} else if (Static381.aShort89 < local50) {
			local50 = Static381.aShort89;
		}
		@Pc(80) int local80 = local50 * 512 * arg4 / (arg0 * 334);
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(85) short local85;
		if (local80 < Static435.aShort98) {
			local85 = Static435.aShort98;
			local50 = local85 * arg0 * 334 / (arg4 * 512);
			if (Static381.aShort89 < local50) {
				local50 = Static381.aShort89;
				local110 = local50 * arg4 * 512 / (local85 * 334);
				local116 = (arg0 - local110) / 2;
				if (arg3) {
					Static110.aClass62_15.n();
					Static110.aClass62_15.method7040(-16777216, arg4, arg1, arg2, local116);
					Static110.aClass62_15.method7040(-16777216, arg4, arg1, arg0 + arg2 - local116, local116);
				}
				arg0 -= local116 * 2;
				arg2 += local116;
			}
		} else if (local80 > Static137.aShort38) {
			local85 = Static137.aShort38;
			local50 = arg0 * local85 * 334 / (arg4 * 512);
			if (local50 < Static26.aShort2) {
				local50 = Static26.aShort2;
				local110 = arg0 * 334 * local85 / (local50 * 512);
				local116 = (arg4 - local110) / 2;
				if (arg3) {
					Static110.aClass62_15.n();
					Static110.aClass62_15.method7040(-16777216, local116, arg1, arg2, arg0);
					Static110.aClass62_15.method7040(-16777216, local116, arg1 + arg4 - local116, arg2, arg0);
				}
				arg1 += local116;
				arg4 -= local116 * 2;
			}
		}
		Static482.anInt8344 = (short) arg0;
		Static534.anInt9003 = arg2;
		Static540.anInt9077 = (short) arg4;
		Static497.anInt9140 = arg4 * local50 / 334;
		Static299.anInt5952 = arg1;
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)V")
	public static void method2831() {
		Static56.anInt1176 = 0;
		@Pc(18) boolean local18 = Static131.aClass5_Sub3_Sub1_1.method4226() == 1;
		@Pc(22) int local22 = Static131.aClass5_Sub3_Sub1_1.method4205();
		@Pc(26) int local26 = Static131.aClass5_Sub3_Sub1_1.method4232();
		@Pc(30) int local30 = Static131.aClass5_Sub3_Sub1_1.method4183();
		Static505.method6631();
		Static289.method4853(local30);
		@Pc(43) int local43 = (Static319.anInt6170 - Static131.aClass5_Sub3_Sub1_1.anInt4960) / 16;
		Static213.anIntArrayArray28 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static213.anIntArrayArray28[local49][local53] = Static131.aClass5_Sub3_Sub1_1.method4230();
			}
		}
		Static339.anIntArray474 = new int[local43];
		Static178.aByteArrayArray17 = new byte[local43][];
		Static348.aByteArrayArray36 = null;
		Static226.aByteArrayArray31 = new byte[local43][];
		Static103.anIntArray76 = new int[local43];
		Static85.aByteArrayArray11 = new byte[local43][];
		Static254.anIntArray688 = new int[local43];
		Static201.anIntArray274 = null;
		Static339.anIntArray475 = new int[local43];
		Static124.aByteArrayArray13 = new byte[local43][];
		Static141.anIntArray237 = new int[local43];
		local43 = 0;
		for (local53 = (local22 - (Static460.anInt7894 >> 4)) / 8; local53 <= (local22 + (Static460.anInt7894 >> 4)) / 8; local53++) {
			for (@Pc(134) int local134 = (local26 - (Static235.anInt4493 >> 4)) / 8; local134 <= (local26 + (Static235.anInt4493 >> 4)) / 8; local134++) {
				Static103.anIntArray76[local43] = local134 + (local53 << 8);
				Static141.anIntArray237[local43] = Static338.aClass117_151.method2982("m" + local53 + "_" + local134);
				Static339.anIntArray474[local43] = Static338.aClass117_151.method2982("l" + local53 + "_" + local134);
				Static339.anIntArray475[local43] = Static338.aClass117_151.method2982("um" + local53 + "_" + local134);
				Static254.anIntArray688[local43] = Static338.aClass117_151.method2982("ul" + local53 + "_" + local134);
				local43++;
			}
		}
		Static110.method2215(10, local18, local26, local22);
	}
}
