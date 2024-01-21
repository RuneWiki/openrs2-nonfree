import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "Lclient!f;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
	public static int anInt626;

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "Lclient!sd;")
	public static Class73 aClass73_375 = Static122.method531("me");

	@OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
	public static int anInt621 = 1;

	@OriginalMember(owner = "client!cg", name = "bb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_377 = Static122.method531(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!nf;BIII)V")
	public static void method499(@OriginalArg(0) Class3_Sub1_Sub4_Sub7_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1 == arg0 || Static142.anInt3262 >= 400) {
			return;
		}
		@Pc(61) Class73 local61;
		if (arg0.anInt2702 == 0) {
			local61 = Static19.method372(new Class73[] { arg0.aClass73_1521, Static141.method2359(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt2712, arg0.anInt2712), Static45.aClass73_615, Static121.aClass73_1601, Static154.method2485(arg0.anInt2712), Static40.aClass73_573 });
		} else {
			local61 = Static19.method372(new Class73[] { arg0.aClass73_1521, Static45.aClass73_615, Static93.aClass73_1181, Static154.method2485(arg0.anInt2702), Static40.aClass73_573 });
		}
		@Pc(101) int local101;
		if (Static4.anInt71 == 1) {
			Static63.method1125(arg3, arg1, Static63.aClass73_815, Static19.method372(new Class73[] { Static122.aClass73_397, Static153.aClass73_1857, local61 }), 23, arg2);
		} else if (!Static159.aBoolean233) {
			for (local101 = 7; local101 >= 0; local101--) {
				if (Static173.aClass73Array28[local101] != null) {
					@Pc(113) short local113 = 0;
					if (Static173.aClass73Array28[local101].method2438(Static99.aClass73_1262)) {
						if (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt2712 < arg0.anInt2712) {
							local113 = 2000;
						}
						if (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt2708 != 0 && arg0.anInt2708 != 0) {
							if (arg0.anInt2708 == Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt2708) {
								local113 = 2000;
							} else {
								local113 = 0;
							}
						}
					} else if (Static101.aBooleanArray10[local101]) {
						local113 = 2000;
					}
					@Pc(167) int local167 = local113 + Static169.anIntArray385[local101];
					Static63.method1125(arg3, arg1, Static173.aClass73Array28[local101], Static19.method372(new Class73[] { Static178.aClass73_2072, local61 }), local167, arg2);
				}
			}
		} else if ((Static44.anInt1025 & 0x8) == 8) {
			Static63.method1125(arg3, arg1, Static90.aClass73_1133, Static19.method372(new Class73[] { Static39.aClass73_541, Static153.aClass73_1857, local61 }), 44, arg2);
		}
		for (local101 = 0; local101 < Static142.anInt3262; local101++) {
			if (Static176.anIntArray419[local101] == 39) {
				Static162.aClass73Array24[local101] = Static19.method372(new Class73[] { Static178.aClass73_2072, local61 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIIII)V")
	public static void method500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static81.anInt1818; local8++) {
			if (arg1 < Static72.anIntArray176[local8] + Static19.anIntArray47[local8] && Static72.anIntArray176[local8] < arg3 + arg1 && arg2 < Static34.anIntArray78[local8] + Static163.anIntArray325[local8] && arg2 + arg0 > Static163.anIntArray325[local8]) {
				Static27.aBooleanArray3[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public static void method501() {
		aClass13_4 = null;
		aClass73_375 = null;
		aClass73_377 = null;
	}
}
