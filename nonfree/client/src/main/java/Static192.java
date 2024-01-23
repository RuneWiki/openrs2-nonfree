import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!gj;")
	public static Class41 aClass41_3;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!qe;")
	public static Class78 aClass78_757 = Static199.method3560("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method3513() {
		if (Static202.aClass105_4 != null) {
			Static202.aClass105_4.method3695();
			Static202.aClass105_4 = null;
		}
		Static149.method1485();
		Static199.method3558();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static202.aClass90Array1[local19].method3523();
		}
		Static110.method1908();
		System.gc();
		Static145.method2571();
		Static2.aBoolean2 = false;
		Static162.anInt3745 = -1;
		Static68.method1109(true);
		Static160.aBoolean160 = false;
		Static28.anInt497 = 0;
		Static57.anInt628 = 0;
		for (@Pc(50) int local50 = 0; local50 < Static216.aClass19Array1.length; local50++) {
			Static216.aClass19Array1[local50] = null;
		}
		Static180.anInt4193 = 0;
		Static50.anInt908 = 0;
		for (@Pc(70) int local70 = 0; local70 < 2048; local70++) {
			Static213.aClass5_Sub2_Sub2Array3[local70] = null;
			Static95.aClass2_Sub23Array1[local70] = null;
		}
		for (@Pc(85) int local85 = 0; local85 < 32768; local85++) {
			Static95.aClass5_Sub2_Sub1Array1[local85] = null;
		}
		Static125.method1281(8);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public static void method3520() {
		Static178.aClass53_15.method1797();
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	public static void method3522() {
		Static139.aClass2_Sub23_Sub1_4.method2144();
		@Pc(16) int local16 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
		if (local16 == 0) {
			return;
		}
		@Pc(24) int local24 = Static139.aClass2_Sub23_Sub1_4.method2154(2);
		if (local24 == 0) {
			Static156.anIntArray598[Static125.anInt1641++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (local24 == 1) {
			local43 = Static139.aClass2_Sub23_Sub1_4.method2154(3);
			Static31.aClass5_Sub2_Sub2_1.method1482(local43, false);
			local53 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
			if (local53 == 1) {
				Static156.anIntArray598[Static125.anInt1641++] = 2047;
			}
			return;
		}
		@Pc(93) int local93;
		if (local24 == 2) {
			local43 = Static139.aClass2_Sub23_Sub1_4.method2154(3);
			Static31.aClass5_Sub2_Sub2_1.method1482(local43, true);
			local53 = Static139.aClass2_Sub23_Sub1_4.method2154(3);
			Static31.aClass5_Sub2_Sub2_1.method1482(local53, true);
			local93 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
			if (local93 == 1) {
				Static156.anIntArray598[Static125.anInt1641++] = 2047;
			}
		} else if (local24 == 3) {
			local43 = Static139.aClass2_Sub23_Sub1_4.method2154(7);
			local53 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
			local93 = Static139.aClass2_Sub23_Sub1_4.method2154(7);
			@Pc(132) int local132 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
			if (local132 == 1) {
				Static156.anIntArray598[Static125.anInt1641++] = 2047;
			}
			Static137.anInt3136 = Static139.aClass2_Sub23_Sub1_4.method2154(2);
			Static31.aClass5_Sub2_Sub2_1.method1483(local43, local93, local53 == 1);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!mj;IZZI)V")
	public static void method3524(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(2) int local2 = arg0.anInt3021;
		if (arg0.aByte13 == 0) {
			arg0.anInt3021 = arg0.anInt3018;
		} else if (arg0.aByte13 == 1) {
			arg0.anInt3021 = arg3 - arg0.anInt3018;
		} else if (arg0.aByte13 == 2) {
			arg0.anInt3021 = arg0.anInt3018 * arg3 >> 14;
		} else if (arg0.aByte13 == 3) {
			if (arg0.anInt3051 == 2) {
				arg0.anInt3021 = (arg0.anInt3018 - 1) * arg0.anInt3023 + arg0.anInt3018 * 32;
			} else if (arg0.anInt3051 == 7) {
				arg0.anInt3021 = arg0.anInt3023 * (arg0.anInt3018 - 1) + arg0.anInt3018 * 115;
			}
		}
		@Pc(90) int local90 = arg0.anInt3040;
		if (arg0.aByte14 == 0) {
			arg0.anInt3040 = arg0.anInt3064;
		} else if (arg0.aByte14 == 1) {
			arg0.anInt3040 = arg1 - arg0.anInt3064;
		} else if (arg0.aByte14 == 2) {
			arg0.anInt3040 = arg0.anInt3064 * arg1 >> 14;
		} else if (arg0.aByte14 == 3) {
			if (arg0.anInt3051 == 2) {
				arg0.anInt3040 = arg0.anInt3035 * (arg0.anInt3064 - 1) + arg0.anInt3064 * 32;
			} else if (arg0.anInt3051 == 7) {
				arg0.anInt3040 = arg0.anInt3064 * 12 + (arg0.anInt3064 - 1) * arg0.anInt3035;
			}
		}
		if (arg0.aByte13 == 4) {
			arg0.anInt3021 = arg0.anInt3040 * arg0.anInt3057 / arg0.anInt3071;
		}
		if (arg0.aByte14 == 4) {
			arg0.anInt3040 = arg0.anInt3071 * arg0.anInt3021 / arg0.anInt3057;
		}
		if (Static57.aBoolean21 && (Static36.method473(arg0) != 0 || arg0.anInt3051 == 0)) {
			if (arg0.anInt3040 < 5 && arg0.anInt3021 < 5) {
				arg0.anInt3021 = 5;
				arg0.anInt3040 = 5;
			} else {
				if (arg0.anInt3021 <= 0) {
					arg0.anInt3021 = 5;
				}
				if (arg0.anInt3040 <= 0) {
					arg0.anInt3040 = 5;
				}
			}
		}
		if (arg0.anInt3002 == 1337) {
			Static226.aClass64_16 = arg0;
		}
		if (arg2 && arg0.anObjectArray6 != null && (local2 != arg0.anInt3021 || arg0.anInt3040 != local90)) {
			@Pc(274) Class2_Sub1 local274 = new Class2_Sub1();
			local274.anObjectArray1 = arg0.anObjectArray6;
			local274.aClass64_1 = arg0;
			Static37.aClass44_9.method1355(local274);
		}
	}
}
