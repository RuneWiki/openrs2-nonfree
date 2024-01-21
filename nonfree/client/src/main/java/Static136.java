import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public static int anInt3108;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	public static int anInt3117;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
	public static int anInt3110 = 0;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
	public static int anInt3111 = 0;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1828 = Static107.method1838("");

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	public static int anInt3116 = 0;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1829 = aClass28_1828;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZB)V")
	public static void method2139(@OriginalArg(0) boolean arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static29.anInt884; local9++) {
			@Pc(17) Class2_Sub4_Sub1_Sub1_Sub1 local17 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[Static129.anIntArray274[local9]];
			@Pc(26) long local26 = (long) Static129.anIntArray274[local9] << 32 | 0x20000000L;
			if (local17 != null && local17.method1093() && local17.aClass2_Sub4_Sub4_1.aBoolean32 == arg0 && local17.aClass2_Sub4_Sub4_1.method594()) {
				@Pc(51) int local51 = local17.anInt1633 >> 7;
				@Pc(56) int local56 = local17.anInt1635 >> 7;
				if (local51 >= 0 && local51 < 104 && local56 >= 0 && local56 < 104) {
					if (local17.anInt1618 == 1 && (local17.anInt1633 & 0x7F) == 64 && (local17.anInt1635 & 0x7F) == 64) {
						if (Static122.anIntArrayArray26[local51][local56] == Static87.anInt2197) {
							continue;
						}
						Static122.anIntArrayArray26[local51][local56] = Static87.anInt2197;
					}
					if (!local17.aClass2_Sub4_Sub4_1.aBoolean33) {
						local26 |= Long.MIN_VALUE;
					}
					local17.anInt1634 = Static103.method1808(Static103.anInt2568, (local17.anInt1618 - 1) * 64 + local17.anInt1633, (local17.anInt1618 - 1) * 64 + local17.anInt1635);
					Static122.method2002(Static103.anInt2568, local17.anInt1633, local17.anInt1635, local17.anInt1634, local17.anInt1618 * 64 + 60 - 64, local17, local17.anInt1603, local26, local17.aBoolean82);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)Z")
	public static boolean method2140(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lclient!gg;")
	public static Class28 method2141(@OriginalArg(0) int arg0) {
		return Static80.aClass28Array29[arg0].method1121() <= 0 ? Static98.aClass28Array34[arg0] : Static83.method1481(new Class28[] { Static98.aClass28Array34[arg0], Static180.aClass28_2425, Static80.aClass28Array29[arg0] });
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method2142() {
		aClass28_1828 = null;
		aClass28_1829 = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IJII)Z")
	public static boolean method2143(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = (int) arg1 >> 20 & 0x3;
		@Pc(19) int local19 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		@Pc(26) int local26 = (int) arg1 >> 14 & 0x1F;
		if (local26 == 10 || local26 == 11 || local26 == 22) {
			@Pc(52) Class2_Sub4_Sub6 local52 = Static151.method2339(local19);
			@Pc(63) int local63;
			@Pc(66) int local66;
			if (local12 == 0 || local12 == 2) {
				local63 = local52.anInt1050;
				local66 = local52.anInt1037;
			} else {
				local63 = local52.anInt1037;
				local66 = local52.anInt1050;
			}
			@Pc(77) int local77 = local52.anInt1030;
			if (local12 != 0) {
				local77 = (local77 << local12 & 0xF) + (local77 >> 4 - local12);
			}
			Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], local77, local66, local63, 2, arg2, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], arg0, true, 0);
		} else {
			Static146.method2284(local26 + 1, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 0, 0, 2, arg2, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], arg0, true, local12);
		}
		Static49.anInt1287 = Static130.anInt3042;
		Static6.anInt366 = 2;
		Static33.anInt945 = Static101.anInt449;
		Static164.anInt3646 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
	public static void method2144() {
		for (@Pc(11) int local11 = 0; local11 < Static29.anInt884; local11++) {
			@Pc(17) int local17 = Static129.anIntArray274[local11];
			@Pc(21) Class2_Sub4_Sub1_Sub1_Sub1 local21 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local17];
			if (local21 != null) {
				Static61.method1106(local21, local21.aClass2_Sub4_Sub4_1.anInt854);
			}
		}
	}
}
