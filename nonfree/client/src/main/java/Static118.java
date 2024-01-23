import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public static int anInt2627;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!ek;")
	public static Class42 aClass42_31;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
	public static int[] anIntArray233 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Z")
	public static boolean aBoolean194 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIB)V")
	public static void method1990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static116.aBoolean184) {
			Static111.method1895(arg0, arg2, arg1 + arg0, arg3 + arg2);
			Static111.method1888(arg0, arg2, arg1, arg3, 0);
		} else {
			Static77.method1444(arg0, arg2, arg0 + arg1, arg2 + arg3);
			Static77.method1447(arg0, arg2, arg1, arg3, 0);
		}
		if (Static91.anInt2195 < 100) {
			return;
		}
		@Pc(53) float local53 = (float) Static250.anInt3119 / (float) Static250.anInt3121;
		@Pc(55) int local55 = arg1;
		@Pc(57) int local57 = arg3;
		if (local53 < 1.0F) {
			local57 = (int) (local53 * (float) arg1);
		} else {
			local55 = (int) ((float) arg3 / local53);
		}
		@Pc(84) int local84 = arg2 + (arg3 - local57) / 2;
		if (Static89.aClass2_Sub8_Sub1_7 == null || Static89.aClass2_Sub8_Sub1_7.anInt5514 != arg1 || arg3 != Static89.aClass2_Sub8_Sub1_7.anInt5517) {
			@Pc(105) Class2_Sub8_Sub1_Sub1 local105 = new Class2_Sub8_Sub1_Sub1(arg1, arg3);
			Static77.method1460(local105.anIntArray340, arg1, arg3);
			if (Static250.aClass2_Sub8_Sub16_3.anInt4420 != -1) {
				Static77.method1447(0, 0, arg1, arg3, Static250.aClass2_Sub8_Sub16_3.anInt4420);
			}
			Static250.method2539(0, 0, Static250.anInt3121, Static250.anInt3119, 0, 0, local55, local57);
			Static250.method2523();
			if (Static116.aBoolean184) {
				Static89.aClass2_Sub8_Sub1_7 = new Class2_Sub8_Sub1_Sub2(local105);
			} else {
				Static89.aClass2_Sub8_Sub1_7 = local105;
			}
			if (Static116.aBoolean184) {
				Static77.anIntArray163 = null;
			} else {
				Static179.aClass3_1.method4441();
			}
		}
		@Pc(163) int local163 = arg0 + (arg1 - local55) / 2;
		Static89.aClass2_Sub8_Sub1_7.method4368(local163, local84);
		@Pc(175) int local175 = local163 + local55 * Static84.anInt1966 / Static250.anInt3121;
		@Pc(183) int local183 = local84 + Static26.anInt4562 * local57 / Static250.anInt3119;
		@Pc(189) int local189 = Static200.anInt4185 * local55 / Static250.anInt3121;
		@Pc(198) int local198 = local57 * Static223.anInt4545 / Static250.anInt3119;
		@Pc(200) int local200 = 16711680;
		if (Static162.anInt3614 == 1) {
			local200 = 16777215;
		}
		if (Static116.aBoolean184) {
			Static111.method1890(local175, local183, local189, local198, local200, 128);
			Static111.method1897(local175, local183, local189, local198, local200);
		} else {
			Static77.method1443(local175, local183, local189, local198, local200, 128);
			Static77.method1457(local175, local183, local189, local198, local200);
		}
		if (Static10.anInt171 <= 0) {
			return;
		}
		@Pc(252) int local252;
		if (Static225.anInt5333 > 50) {
			local252 = (100 - Static225.anInt5333) * 5;
		} else {
			local252 = Static225.anInt5333 * 5;
		}
		for (@Pc(263) Class2_Sub8_Sub21 local263 = (Class2_Sub8_Sub21) Static250.aClass37_10.method1139(); local263 != null; local263 = (Class2_Sub8_Sub21) Static250.aClass37_10.method1145()) {
			@Pc(271) Class10 local271 = Static48.method890(local263.anInt4970);
			if (Static159.method2934(local271)) {
				@Pc(293) int local293;
				@Pc(303) int local303;
				if (local263.anInt4970 == Static122.anInt2705) {
					local293 = local163 + local263.anInt4967 * local55 / Static250.anInt3121;
					local303 = local84 + local263.anInt4968 * local57 / Static250.anInt3119;
					if (Static116.aBoolean184) {
						Static111.method1890(local293 - 2, local303 + -2, 4, 4, 16776960, local252);
					} else {
						Static77.method1443(local293 - 2, local303 - 2, 4, 4, 16776960, local252);
					}
				} else if (Static166.anInt3676 != -1 && local271.anInt155 == Static166.anInt3676) {
					local293 = local163 + local55 * local263.anInt4967 / Static250.anInt3121;
					local303 = local84 + local57 * local263.anInt4968 / Static250.anInt3119;
					if (Static116.aBoolean184) {
						Static111.method1890(local293 - 2, local303 + -2, 4, 4, 16776960, local252);
					} else {
						Static77.method1443(local293 - 2, local303 + -2, 4, 4, 16776960, local252);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public static void method1991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 8) {
			arg1 = 4;
		}
		if (arg1 == 4 && !Static74.aBoolean118) {
			arg1 = 2;
			arg0 = 2;
		}
		if (Static43.anInt1121 != arg1) {
			if (Static229.aBoolean306) {
				return;
			}
			if (Static43.anInt1121 != 0) {
				Static18.anInterface5Array1[Static43.anInt1121].method4036();
			}
			if (arg1 != 0) {
				@Pc(45) Interface5 local45 = Static18.anInterface5Array1[arg1];
				local45.method4037();
				local45.method4039(arg0);
			}
			Static43.anInt1121 = arg1;
			Static88.anInt2123 = arg0;
		} else if (arg1 != 0 && arg0 != Static88.anInt2123) {
			Static18.anInterface5Array1[arg1].method4039(arg0);
			Static88.anInt2123 = arg0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(CI)Z")
	public static boolean method1994(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I")
	public static int method1995() {
		if ((double) Static250.aFloat31 == 3.0D) {
			return 37;
		} else if ((double) Static250.aFloat31 == 4.0D) {
			return 50;
		} else if ((double) Static250.aFloat31 == 6.0D) {
			return 75;
		} else if ((double) Static250.aFloat31 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
