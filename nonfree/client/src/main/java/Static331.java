import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!pv", name = "Zc", descriptor = "I")
	public static int anInt5292;

	@OriginalMember(owner = "client!pv", name = "cd", descriptor = "Lclient!um;")
	public static Class243 aClass243_184;

	@OriginalMember(owner = "client!pv", name = "Kc", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_143 = new Class129(4, -2);

	@OriginalMember(owner = "client!pv", name = "Tc", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_95 = new Class198("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!pv", name = "bd", descriptor = "I")
	public static int anInt5294 = 16777215;

	@OriginalMember(owner = "client!pv", name = "fd", descriptor = "I")
	public static int anInt5297 = 0;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(BI)I")
	public static int method4084(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(18) int local18 = local0 | local0 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "(I)V")
	public static void method4085() {
		for (@Pc(10) Class5_Sub11 local10 = (Class5_Sub11) Static75.aClass177_5.method3618(); local10 != null; local10 = (Class5_Sub11) Static75.aClass177_5.method3619()) {
			if (Static319.aClass258ArrayArrayArray3 == null) {
				local10.method6003();
			} else {
				@Pc(28) int local28;
				@Pc(124) Class2_Sub1 local124;
				@Pc(166) Class2_Sub3 local166;
				@Pc(77) Class2_Sub2 local77;
				@Pc(38) Class2_Sub4 local38;
				@Pc(179) Class2_Sub3_Sub3 local179;
				@Pc(90) Class2_Sub2_Sub3 local90;
				@Pc(51) Class2_Sub4_Sub3 local51;
				if (local10.anInt1512 <= Static85.anInt1536) {
					local28 = Static30.anIntArray25[local10.anInt1529];
					if (local28 == 0) {
						local38 = Static73.method1080(local10.anInt1524, local10.anInt1515, local10.anInt1523);
						if (local38 instanceof Class2_Sub4_Sub3) {
							Static39.method634(local10.anInt1524, local10.anInt1515, local10.anInt1523);
							local51 = (Class2_Sub4_Sub3) local38;
							if (local51.aClass2_Sub4_1 != null) {
								Static270.method3407(local10.anInt1524, local10.anInt1515, local10.anInt1523, local51.aClass2_Sub4_1, null);
							}
						}
					} else if (local28 == 1) {
						local77 = Static173.method2392(local10.anInt1524, local10.anInt1515, local10.anInt1523);
						if (local77 instanceof Class2_Sub2_Sub3) {
							Static358.method4638(local10.anInt1524, local10.anInt1515, local10.anInt1523);
							local90 = (Class2_Sub2_Sub3) local77;
							if (local90.aClass2_Sub2_1 != null) {
								Static189.method2559(local10.anInt1524, local10.anInt1515, local10.anInt1523, local90.aClass2_Sub2_1, null);
							}
						}
					} else if (local28 == 2) {
						local124 = Static12.method194(local10.anInt1524, local10.anInt1515, local10.anInt1523, bs.class);
						if (local124 instanceof Class2_Sub1_Sub5) {
							Static281.method5919(local10.anInt1524, local10.anInt1515, local10.anInt1523, bs.class);
							@Pc(145) Class2_Sub1_Sub5 local145 = (Class2_Sub1_Sub5) local124;
							if (local145.aClass2_Sub1_2 != null) {
								Static462.method6056(local145.aClass2_Sub1_2, false);
							}
						}
					} else if (local28 == 3) {
						local166 = Static285.method3519(local10.anInt1524, local10.anInt1515, local10.anInt1523);
						if (local166 instanceof Class2_Sub3_Sub3) {
							Static395.method5139(local10.anInt1524, local10.anInt1515, local10.anInt1523);
							local179 = (Class2_Sub3_Sub3) local166;
							if (local179.aClass2_Sub3_1 != null) {
								Static324.method3999(local10.anInt1524, local10.anInt1515, local10.anInt1523, local179.aClass2_Sub3_1);
							}
						}
					}
					local10.method6003();
				} else if (Static85.anInt1536 == local10.anInt1522) {
					local28 = Static30.anIntArray25[local10.anInt1529];
					if (local28 == 0) {
						local38 = Static73.method1080(local10.anInt1524, local10.anInt1515, local10.anInt1523);
						if (local38 instanceof Class2_Sub4_Sub3) {
							local10.method6003();
						} else if (Static320.method3947(local10.anInt1524, local10.anInt1515, local10.anInt1523) == null) {
							local51 = new Class2_Sub4_Sub3(local10.anInt1529, local10.anInt1526, local10.anInt1527, local10.anInt1528, local10.anInt1514, local38);
							Static270.method3407(local10.anInt1524, local10.anInt1515, local10.anInt1523, local51, null);
						} else {
							local10.method6003();
						}
					} else if (local28 == 1) {
						local77 = Static173.method2392(local10.anInt1524, local10.anInt1515, local10.anInt1523);
						if (local77 instanceof Class2_Sub2_Sub3) {
							local10.method6003();
						} else if (Static286.method3547(local10.anInt1524, local10.anInt1515, local10.anInt1523) == null) {
							local90 = new Class2_Sub2_Sub3(local10.anInt1529, local10.anInt1526, local10.anInt1527, local10.anInt1528, local10.anInt1514, local77);
							Static189.method2559(local10.anInt1524, local10.anInt1515, local10.anInt1523, local90, null);
						} else {
							local10.method6003();
						}
					} else if (local28 == 2) {
						local124 = Static12.method194(local10.anInt1524, local10.anInt1515, local10.anInt1523, bs.class);
						if (local124 instanceof Class2_Sub1_Sub5) {
							local10.method6003();
						} else {
							Static281.method5919(local10.anInt1524, local10.anInt1515, local10.anInt1523, bs.class);
							@Pc(415) Class114 local415 = Static398.aClass256_4.method5782(local10.anInt1518);
							@Pc(431) int local431;
							@Pc(428) int local428;
							if (local10.anInt1526 == 1 || local10.anInt1526 == 3) {
								local428 = local415.anInt2990;
								local431 = local415.anInt2993;
							} else {
								local428 = local415.anInt2993;
								local431 = local415.anInt2990;
							}
							@Pc(472) Class2_Sub1_Sub5 local472 = new Class2_Sub1_Sub5(local10.anInt1529, local10.anInt1526, local10.anInt1524, local10.anInt1527, local10.anInt1528, local10.anInt1514, local10.anInt1515, local10.anInt1515 + local431 - 1, local10.anInt1523, local428 + local10.anInt1523 - 1, local124);
							Static462.method6056(local472, false);
						}
					} else if (local28 == 3) {
						local166 = Static285.method3519(local10.anInt1524, local10.anInt1515, local10.anInt1523);
						if (local166 instanceof Class2_Sub3_Sub3) {
							local10.method6003();
						} else {
							local179 = new Class2_Sub3_Sub3(local10.anInt1527, local10.anInt1528, local10.anInt1514, local166);
							Static324.method3999(local10.anInt1524, local10.anInt1515, local10.anInt1523, local179);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(IB)I")
	public static int method4086(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(III)Z")
	public static boolean method4090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
