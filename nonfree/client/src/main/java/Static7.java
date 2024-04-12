import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!p;")
	public static Class45 aClass45_5;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 42)
	public static void method183() {
		if (Static72.aClass24_1 != null) {
			Static72.aClass24_1.method1656();
			Static72.aClass24_1 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Ljava/awt/Component;", line = 71)
	public static Component method185() {
		if (Static97.aCanvas_Sub1_1 == null) {
			return Static91.aClass7_2 == null ? null : Static91.aClass7_2.anApplet1;
		} else {
			return Static97.aCanvas_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 94)
	public static void method186() {
		if (Class2_Sub2_Sub16.anInt2473 == 0) {
			return;
		}
		@Pc(13) Class2_Sub2_Sub2_Sub2 local13 = Static95.aClass2_Sub2_Sub2_Sub2_5;
		@Pc(15) int local15 = 0;
		if (Class52.anInt1973 != 0) {
			local15 = 1;
		}
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			if (Class2_Sub2_Sub13.aClass40Array30[local26] != null) {
				@Pc(36) int local36 = Class45.anIntArray469[local26];
				@Pc(40) Class40 local40 = Class2_Sub3_Sub1.aClass40Array40[local26];
				@Pc(42) byte local42 = 0;
				if (local40 != null && local40.method1168(Class2_Sub2_Sub10.aClass40_323)) {
					local42 = 1;
					local40 = local40.method1185(5);
				}
				if (local40 != null && local40.method1168(Class45_Sub1.aClass40_622)) {
					local42 = 2;
					local40 = local40.method1185(5);
				}
				@Pc(108) int local108;
				if ((local36 == 3 || local36 == 7) && (local36 == 7 || Class63.anInt2515 == 0 || Class63.anInt2515 == 1 && Static36.method729(local40))) {
					local108 = 329 - local15 * 13;
					local15++;
					local13.method575(Class27.aClass40_340, 4, local108, 0);
					local13.method575(Class27.aClass40_340, 4, local108 - 1, 65535);
					@Pc(131) int local131 = local13.method568(Class50.aClass40_564) + 4;
					if (local42 == 1) {
						Static64.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(local131, local108 - 12);
						local131 += 14;
					}
					if (local42 == 2) {
						Static64.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local131, local108 - 12);
						local131 += 14;
					}
					local13.method575(Static72.method1334(new Class40[] { local40, Class1.aClass40_4, Class2_Sub2_Sub13.aClass40Array30[local26] }), local131, local108, 0);
					local13.method575(Static72.method1334(new Class40[] { local40, Class1.aClass40_4, Class2_Sub2_Sub13.aClass40Array30[local26] }), local131, local108 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local36 == 5 && Class63.anInt2515 < 2) {
					local108 = 329 - local15 * 13;
					local15++;
					local13.method575(Class2_Sub2_Sub13.aClass40Array30[local26], 4, local108, 0);
					local13.method575(Class2_Sub2_Sub13.aClass40Array30[local26], 4, local108 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local36 == 6 && Class63.anInt2515 < 2) {
					local108 = 329 - local15 * 13;
					local13.method575(Static72.method1334(new Class40[] { Class2_Sub2_Sub15.aClass40_690, local40, Class1.aClass40_4, Class2_Sub2_Sub13.aClass40Array30[local26] }), 4, local108, 0);
					local13.method575(Static72.method1334(new Class40[] { Class2_Sub2_Sub15.aClass40_690, local40, Class1.aClass40_4, Class2_Sub2_Sub13.aClass40Array30[local26] }), 4, local108 - 1, 65535);
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)V", line = 233)
	public static void method187(@OriginalArg(0) int arg0) {
		if (arg0 == Class2_Sub2_Sub11.anInt1075) {
			return;
		}
		if (Class2_Sub2_Sub11.anInt1075 == 0) {
			Static42.method801();
		}
		if (arg0 == 20 || arg0 == 40) {
			Class37.anInt1649 = 0;
			Class2_Sub2_Sub12_Sub5.anInt2039 = 0;
			Class20.anInt693 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static34.aClass25_20 != null) {
			Static34.aClass25_20.method730();
		}
		if (Class2_Sub2_Sub11.anInt1075 == 25 || Class2_Sub2_Sub11.anInt1075 == 40) {
			Static69.method1230();
			Static25.method1610();
		}
		if (Class2_Sub2_Sub11.anInt1075 == 25) {
			Class2_Sub6.anInt805 = 1;
			Class38.anInt1667 = 0;
			Applet_Sub1.anInt375 = 0;
			Class2_Sub2.anInt2455 = 1;
			Class2_Sub2_Sub11.anInt1080 = 0;
		}
		if (arg0 == 35) {
			Static2.method18();
			Static11.method252();
			if (Static27.aClass45_14 == null) {
				Static27.aClass45_14 = Static75.method1351(765, method185(), 503);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static27.aClass45_14 = null;
			Static2.method18();
			Static14.method1263(Static74.aClass5_Sub1_16, method185(), Static73.aClass5_Sub1_15);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static27.aClass45_14 = null;
			Static11.method252();
			Static54.method997(Static74.aClass5_Sub1_16, method185());
		}
		Class2_Sub2_Sub11.anInt1075 = arg0;
		Class1.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V", line = 313)
	public static void method188() {
		Class55.aBoolean163 = false;
		Class1.aBoolean2 = false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIII)I", line = 334)
	public static int method189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V", line = 389)
	public static void method191() {
		Class6.aByteArray1 = null;
		Class6.aClass40_60 = null;
		Class6.aClass40_61 = null;
		aClass45_5 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!eb;)Lclient!o;", line = 401)
	public static Class40 method192(@OriginalArg(1) Class2_Sub3 arg0) {
		return Static17.method360(arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!ud;II)[Lclient!qb;", line = 454)
	public static Class2_Sub2_Sub2_Sub3[] method194(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2) {
		return Static84.method1484(arg0, arg1, arg2) ? Static88.method1555() : null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V", line = 522)
	public static void method196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = arg2; local11 <= arg2 + arg0; local11++) {
			for (@Pc(15) int local15 = arg3; local15 <= arg3 + arg1; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static55.aByteArrayArrayArray6[0][local15][local11] = 127;
					if (arg3 == local15 && local15 > 0) {
						Class57.anIntArrayArrayArray8[0][local15][local11] = Class57.anIntArrayArrayArray8[0][local15 - 1][local11];
					}
					if (local15 == arg3 + arg1 && local15 < 103) {
						Class57.anIntArrayArrayArray8[0][local15][local11] = Class57.anIntArrayArrayArray8[0][local15 + 1][local11];
					}
					if (arg2 == local11 && local11 > 0) {
						Class57.anIntArrayArrayArray8[0][local15][local11] = Class57.anIntArrayArrayArray8[0][local15][local11 - 1];
					}
					if (local11 == arg0 + arg2 && local11 < 103) {
						Class57.anIntArrayArrayArray8[0][local15][local11] = Class57.anIntArrayArrayArray8[0][local15][local11 + 1];
					}
				}
			}
		}
	}
}
