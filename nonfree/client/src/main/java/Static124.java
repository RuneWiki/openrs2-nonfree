import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Lclient!pk;")
	public static Class132 aClass132_44;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "[[[Lclient!wn;")
	public static Class182[][][] aClass182ArrayArrayArray1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Z")
	public static boolean method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static206.anInt4273; local1++) {
			@Pc(8) Class50 local8 = Static201.aClass50Array1[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt1559 == 1) {
				local17 = local8.anInt1540 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt1549 + (local8.anInt1546 * local17 >> 8);
					local39 = local8.anInt1560 + (local8.anInt1543 * local17 >> 8);
					local49 = local8.anInt1550 + (local8.anInt1561 * local17 >> 8);
					local59 = local8.anInt1553 + (local8.anInt1556 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1559 == 2) {
				local17 = arg0 - local8.anInt1540;
				if (local17 > 0) {
					local29 = local8.anInt1549 + (local8.anInt1546 * local17 >> 8);
					local39 = local8.anInt1560 + (local8.anInt1543 * local17 >> 8);
					local49 = local8.anInt1550 + (local8.anInt1561 * local17 >> 8);
					local59 = local8.anInt1553 + (local8.anInt1556 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1559 == 3) {
				local17 = local8.anInt1549 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt1540 + (local8.anInt1548 * local17 >> 8);
					local39 = local8.anInt1544 + (local8.anInt1552 * local17 >> 8);
					local49 = local8.anInt1550 + (local8.anInt1561 * local17 >> 8);
					local59 = local8.anInt1553 + (local8.anInt1556 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1559 == 4) {
				local17 = arg2 - local8.anInt1549;
				if (local17 > 0) {
					local29 = local8.anInt1540 + (local8.anInt1548 * local17 >> 8);
					local39 = local8.anInt1544 + (local8.anInt1552 * local17 >> 8);
					local49 = local8.anInt1550 + (local8.anInt1561 * local17 >> 8);
					local59 = local8.anInt1553 + (local8.anInt1556 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1559 == 5) {
				local17 = arg1 - local8.anInt1550;
				if (local17 > 0) {
					local29 = local8.anInt1540 + (local8.anInt1548 * local17 >> 8);
					local39 = local8.anInt1544 + (local8.anInt1552 * local17 >> 8);
					local49 = local8.anInt1549 + (local8.anInt1546 * local17 >> 8);
					local59 = local8.anInt1560 + (local8.anInt1543 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public static void method1981() {
		for (@Pc(10) Class8_Sub9 local10 = (Class8_Sub9) Static84.aClass182_10.method4319(); local10 != null; local10 = (Class8_Sub9) Static84.aClass182_10.method4329()) {
			if (local10.anInt1245 > 0) {
				local10.anInt1245--;
			}
			if (local10.anInt1245 != 0) {
				if (local10.anInt1248 > 0) {
					local10.anInt1248--;
				}
				if (local10.anInt1248 == 0 && local10.anInt1249 >= 1 && local10.anInt1251 >= 1 && local10.anInt1249 <= 102 && local10.anInt1251 <= 102 && (local10.anInt1239 < 0 || Static20.method369(local10.anInt1241, local10.anInt1239))) {
					Static174.method2692(local10.anInt1250, local10.anInt1240, local10.anInt1239, local10.anInt1243, local10.anInt1251, local10.anInt1249, local10.anInt1241);
					local10.anInt1248 = -1;
					if (local10.anInt1239 == local10.anInt1247 && local10.anInt1247 == -1) {
						local10.method4273();
					} else if (local10.anInt1247 == local10.anInt1239 && local10.anInt1240 == local10.anInt1242 && local10.anInt1252 == local10.anInt1241) {
						local10.method4273();
					}
				}
			} else if (local10.anInt1247 < 0 || Static20.method369(local10.anInt1252, local10.anInt1247)) {
				Static174.method2692(local10.anInt1250, local10.anInt1242, local10.anInt1247, local10.anInt1243, local10.anInt1251, local10.anInt1249, local10.anInt1252);
				local10.method4273();
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!eh;III)V")
	public static void method1982(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class8_Sub27 local12;
		if (arg2 < Static24.anInt639) {
			local12 = Static178.aClass8_Sub27ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass120_1 != null && local12.aClass120_1.aClass36_5.method4174()) {
				arg0.method4179(local12.aClass120_1.aClass36_5, 128, 0, 0, true);
			}
		}
		if (arg3 < Static24.anInt639) {
			local12 = Static178.aClass8_Sub27ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass120_1 != null && local12.aClass120_1.aClass36_5.method4174()) {
				arg0.method4179(local12.aClass120_1.aClass36_5, 0, 0, 128, true);
			}
		}
		if (arg2 < Static24.anInt639 && arg3 < Static27.anInt665) {
			local12 = Static178.aClass8_Sub27ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass120_1 != null && local12.aClass120_1.aClass36_5.method4174()) {
				arg0.method4179(local12.aClass120_1.aClass36_5, 128, 0, 128, true);
			}
		}
		if (arg2 < Static24.anInt639 && arg3 > 0) {
			local12 = Static178.aClass8_Sub27ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass120_1 != null && local12.aClass120_1.aClass36_5.method4174()) {
				arg0.method4179(local12.aClass120_1.aClass36_5, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
	public static void method1983() {
		Static58.aClass8_Sub1_Sub7_5 = null;
		Static230.aClass8_Sub1_Sub7_10 = null;
		Static46.aClass8_Sub1_Sub7_1 = null;
		Static175.aClass8_Sub1_Sub7_6 = null;
		Static211.aClass8_Sub1_Sub7_8 = null;
	}
}
