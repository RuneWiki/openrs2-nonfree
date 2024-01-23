import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
	public static int anInt5464 = 0;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray80 = new String[1000];

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray9 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "Z")
	public static boolean aBoolean461 = false;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public static void method4120() {
		if (Static52.anInt1147 < 0) {
			Static52.anInt1147 = 0;
			Static119.anInt2398 = -1;
			Static64.anInt1385 = -1;
		}
		if (Static52.anInt1147 > Static156.anInt3157) {
			Static119.anInt2398 = -1;
			Static64.anInt1385 = -1;
			Static52.anInt1147 = Static156.anInt3157;
		}
		if (Static218.anInt4483 < 0) {
			Static119.anInt2398 = -1;
			Static64.anInt1385 = -1;
			Static218.anInt4483 = 0;
		}
		if (Static218.anInt4483 > Static221.anInt4539) {
			Static64.anInt1385 = -1;
			Static119.anInt2398 = -1;
			Static218.anInt4483 = Static221.anInt4539;
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
	public static void method4127() {
		if (Static198.aClass159_14 != null || Static201.aClass159_15 != null) {
			return;
		}
		@Pc(18) int local18 = Static157.anInt5714;
		@Pc(84) int local84;
		@Pc(90) int local90;
		if (!Static147.aBoolean246) {
			if (local18 == 1 && Static185.anInt3679 > 0) {
				@Pc(34) short local34 = Static204.aShortArray34[Static185.anInt3679 - 1];
				if (local34 == 51 || local34 == 28 || local34 == 13 || local34 == 43 || local34 == 33 || local34 == 35 || local34 == 15 || local34 == 2 || local34 == 37 || local34 == 36 || local34 == 1 || local34 == 1006) {
					local84 = Static243.anIntArray368[Static185.anInt3679 - 1];
					local90 = Static190.anIntArray283[Static185.anInt3679 - 1];
					@Pc(94) Class159 local94 = Static82.method1361(local90);
					@Pc(97) Class8_Sub24 local97 = Static42.method668(local94);
					if (local97.method3353() || local97.method3359()) {
						Static87.anInt1864 = 0;
						Static90.aBoolean138 = false;
						if (Static198.aClass159_14 != null) {
							Static128.method2075(Static198.aClass159_14);
						}
						Static198.aClass159_14 = Static82.method1361(local90);
						Static288.anInt1351 = Static59.anInt1292;
						Static195.anInt2790 = Static89.anInt1907;
						Static138.anInt2765 = local84;
						Static128.method2075(Static198.aClass159_14);
						return;
					}
				}
			}
			if (local18 == 1 && (Static236.anInt4770 == 1 && Static185.anInt3679 > 2 || Static181.method2773(Static185.anInt3679 - 1))) {
				local18 = 2;
			}
			if (local18 == 2 && Static185.anInt3679 > 0 || Static211.anInt4338 == 1) {
				Static246.method3670();
			}
			if (local18 == 1 && Static185.anInt3679 > 0 || Static211.anInt4338 == 2) {
				Static21.method393();
			}
			return;
		}
		@Pc(194) int local194;
		if (local18 != 1) {
			local194 = Static182.anInt3572;
			local84 = Static106.anInt2198;
			if (Static111.anInt2293 - 10 > local194 || local194 > Static111.anInt2293 + Static17.anInt485 + 10 || Static215.anInt4426 - 10 > local84 || Static215.anInt4426 + Static202.anInt4178 + 10 < local84) {
				Static147.aBoolean246 = false;
				Static216.method3391(Static17.anInt485, Static202.anInt4178, Static111.anInt2293, Static215.anInt4426);
			}
		}
		if (local18 != 1) {
			return;
		}
		local84 = Static215.anInt4426;
		local194 = Static111.anInt2293;
		local90 = Static17.anInt485;
		@Pc(252) int local252 = Static59.anInt1292;
		@Pc(254) int local254 = Static89.anInt1907;
		@Pc(256) int local256 = -1;
		for (@Pc(258) int local258 = 0; local258 < Static185.anInt3679; local258++) {
			@Pc(277) int local277;
			if (Static225.aBoolean372) {
				local277 = local84 + (Static185.anInt3679 - local258 - 1) * 15 + 33;
				if (local194 < local252 && local252 < local194 + local90 && local254 > local277 - 13 && local277 + 3 > local254) {
					local256 = local258;
				}
			} else {
				local277 = local84 + (Static185.anInt3679 - local258 - 1) * 15 + 31;
				if (local252 > local194 && local252 < local194 + local90 && local277 - 13 < local254 && local254 < local277 + 3) {
					local256 = local258;
				}
			}
		}
		if (local256 != -1) {
			Static28.method479(local256);
		}
		Static147.aBoolean246 = false;
		Static216.method3391(Static17.anInt485, Static202.anInt4178, Static111.anInt2293, Static215.anInt4426);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIILclient!eh;JZ)V")
	public static void method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class120 local6 = new Class120();
		local6.aClass36_5 = arg4;
		local6.anInt3473 = arg1 * 128 + 64;
		local6.anInt3476 = arg2 * 128 + 64;
		local6.anInt3475 = arg3;
		local6.aLong127 = arg5;
		local6.aBoolean289 = arg6;
		if (Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2] = new Class8_Sub27(arg0, arg1, arg2);
		}
		Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2].aClass120_1 = local6;
	}
}
