import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!sh", name = "P", descriptor = "J")
	public static long aLong124;

	@OriginalMember(owner = "client!sh", name = "jb", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_28;

	@OriginalMember(owner = "client!sh", name = "N", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1428 = Static120.method1824("Please try using a different world)3");

	@OriginalMember(owner = "client!sh", name = "V", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1429 = aClass80_1428;

	@OriginalMember(owner = "client!sh", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1430 = Static120.method1824("0(U");

	@OriginalMember(owner = "client!sh", name = "Z", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1431 = aClass80_1428;

	@OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
	public static int anInt3714 = 0;

	@OriginalMember(owner = "client!sh", name = "cb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1432 = aClass80_1428;

	@OriginalMember(owner = "client!sh", name = "eb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1433 = aClass80_1428;

	@OriginalMember(owner = "client!sh", name = "hb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1434 = aClass80_1428;

	@OriginalMember(owner = "client!sh", name = "mb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1435 = aClass80_1428;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BII)V")
	public static void method2679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class70 local11 = Static142.aClass70ArrayArrayArray1[Static153.anInt673][arg0][arg1];
		if (local11 == null) {
			Static21.method343(Static153.anInt673, arg0, arg1);
			return;
		}
		@Pc(20) int local20 = -99999999;
		@Pc(22) Class3_Sub1_Sub5_Sub7 local22 = null;
		@Pc(27) Class3_Sub1_Sub5_Sub7 local27;
		for (local27 = (Class3_Sub1_Sub5_Sub7) local11.method1953(); local27 != null; local27 = (Class3_Sub1_Sub5_Sub7) local11.method1948()) {
			@Pc(33) Class3_Sub1_Sub2 local33 = Static173.method2793(local27.anInt4093);
			@Pc(36) int local36 = local33.anInt390;
			if (local33.anInt389 == 1) {
				local36 *= local27.anInt4095 + 1;
			}
			if (local20 < local36) {
				local20 = local36;
				local22 = local27;
			}
		}
		if (local22 == null) {
			Static21.method343(Static153.anInt673, arg0, arg1);
			return;
		}
		local11.method1963(local22);
		local27 = (Class3_Sub1_Sub5_Sub7) local11.method1953();
		@Pc(83) Class3_Sub1_Sub5_Sub7 local83 = null;
		@Pc(85) Class3_Sub1_Sub5_Sub7 local85 = null;
		@Pc(99) long local99 = (long) (arg0 + (arg1 << 7) + 1610612736);
		while (local27 != null) {
			if (local27.anInt4093 != local22.anInt4093) {
				if (local83 == null) {
					local83 = local27;
				}
				if (local83.anInt4093 != local27.anInt4093 && local85 == null) {
					local85 = local27;
				}
			}
			local27 = (Class3_Sub1_Sub5_Sub7) local11.method1948();
		}
		Static137.method2069(Static153.anInt673, arg0, arg1, Static50.method742(Static153.anInt673, arg1 * 128 + 64, arg0 * 128 + 64), local22, local99, local83, local85);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII)V")
	public static void method2680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static24.method2569(arg0, arg1, arg0 + arg3, arg2 + arg1);
		Static65.method964();
		Static37.anInt856++;
		Static56.method824(true);
		Static187.method3038(true);
		Static56.method824(false);
		Static187.method3038(false);
		Static94.method1433();
		Static165.method2658();
		@Pc(43) int local43;
		@Pc(79) int local79;
		if (!Static100.aBoolean86) {
			local43 = Static181.anInt4047;
			if (local43 < Static174.anInt3934 / 256) {
				local43 = Static174.anInt3934 / 256;
			}
			if (Static48.aBooleanArray4[4] && Static116.anIntArray524[4] + 128 > local43) {
				local43 = Static116.anIntArray524[4] + 128;
			}
			local79 = Static126.anInt2704 + Static29.anInt735 & 0x7FF;
			Static87.method1270(local43, Static48.anInt1076, Static50.method742(Static153.anInt673, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329) - 50, local43 * 3 + 600, local79, Static92.anInt3071);
		}
		if (Static100.aBoolean86) {
			local43 = Static13.method235();
		} else {
			local43 = Static62.method915();
		}
		@Pc(113) int local113 = Static149.anInt3350;
		local79 = Static56.anInt1216;
		@Pc(117) int local117 = Static165.anInt3680;
		@Pc(119) int local119 = Static163.anInt3648;
		@Pc(121) int local121 = Static86.anInt1786;
		@Pc(164) int local164;
		for (@Pc(123) int local123 = 0; local123 < 5; local123++) {
			if (Static48.aBooleanArray4[local123]) {
				local164 = (int) ((double) (Static86.anIntArray219[local123] * 2 + 1) * Math.random() - (double) Static86.anIntArray219[local123] + Math.sin((double) Static104.anIntArray302[local123] / 100.0D * (double) Static111.anIntArray326[local123]) * (double) Static116.anIntArray524[local123]);
				if (local123 == 4) {
					Static165.anInt3680 += local164;
					if (Static165.anInt3680 < 128) {
						Static165.anInt3680 = 128;
					}
					if (Static165.anInt3680 > 383) {
						Static165.anInt3680 = 383;
					}
				}
				if (local123 == 0) {
					Static56.anInt1216 += local164;
				}
				if (local123 == 3) {
					Static163.anInt3648 = Static163.anInt3648 + local164 & 0x7FF;
				}
				if (local123 == 2) {
					Static86.anInt1786 += local164;
				}
				if (local123 == 1) {
					Static149.anInt3350 += local164;
				}
			}
		}
		local164 = Static190.anInt4379;
		@Pc(226) int local226 = Static3.anInt153;
		if (local164 >= arg0 && local164 < arg3 + arg0 && arg1 <= local226 && local226 < arg2 + arg1) {
			Static189.aBoolean77 = true;
			Static189.anInt1936 = 0;
			Static189.anInt1938 = Static190.anInt4379 - arg0;
			Static189.anInt1934 = Static3.anInt153 - arg1;
		} else {
			Static189.aBoolean77 = false;
			Static189.anInt1936 = 0;
		}
		Static174.method2812();
		Static24.method2576(arg0, arg1, arg3, arg2, 0);
		Static174.method2812();
		Static110.method1713(Static56.anInt1216, Static149.anInt3350, Static86.anInt1786, Static165.anInt3680, Static163.anInt3648, local43);
		Static174.method2812();
		Static79.method1200();
		Static36.method575(arg3, arg2, arg1, arg0);
		Static53.method792(arg1, arg0);
		((Class86) Static65.anInterface1_2).method2659(Static152.anInt3407);
		Static51.method759(arg1, arg2, arg0, arg3);
		Static56.anInt1216 = local79;
		Static163.anInt3648 = local119;
		Static165.anInt3680 = local117;
		Static149.anInt3350 = local113;
		Static86.anInt1786 = local121;
		if (Static106.aBoolean91 && Static126.method1866() == 0) {
			Static106.aBoolean91 = false;
		}
		if (Static106.aBoolean91) {
			Static24.method2576(arg0, arg1, arg3, arg2, 0);
			Static126.method1869(Static196.aClass80_1517, false);
		}
		if (!Static106.aBoolean91 && !Static148.aBoolean134 && arg0 <= local164 && local164 < arg0 + arg3 && local226 >= arg1 && local226 < arg1 + arg2) {
			Static59.method891(local164, arg1, local226, arg0);
		}
	}
}
