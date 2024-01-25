import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "J")
	public static long aLong51;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "[I")
	public static int[] anIntArray127 = new int[2];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!dc;I)V")
	public static void method1176(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt4898 > Static266.anInt4392) {
			Static9.method122(arg1);
		} else if (arg1.anInt4917 >= Static266.anInt4392) {
			Static132.method1981(arg1);
		} else {
			Static125.method1835(arg1, false);
			local9 = Static361.anInt6087;
			local7 = Static179.anInt3085;
		}
		if (arg1.anInt6833 < 128 || arg1.anInt6835 < 128 || arg1.anInt6833 >= Static166.anInt2852 * 128 - 128 || arg1.anInt6835 >= Static426.anInt6923 * 128 - 128) {
			arg1.anInt4903 = -1;
			arg1.anInt4964 = -1;
			local7 = -1;
			arg1.anInt4898 = 0;
			local9 = 0;
			arg1.anInt4912 = -1;
			arg1.anInt4917 = 0;
			arg1.anInt6833 = arg1.anIntArray425[0] * 128 + arg1.method4009() * 64;
			arg1.anInt6835 = arg1.anIntArray424[0] * 128 + arg1.method4009() * 64;
			arg1.method4010();
		}
		if (arg1 == Static60.aClass3_Sub4_Sub1_Sub2_1 && (arg1.anInt6833 < 1536 || arg1.anInt6835 < 1536 || (Static166.anInt2852 - 12) * 128 <= arg1.anInt6833 || Static426.anInt6923 * 128 - 1536 <= arg1.anInt6835)) {
			local9 = 0;
			local7 = -1;
			arg1.anInt4903 = -1;
			arg1.anInt4964 = -1;
			arg1.anInt4917 = 0;
			arg1.anInt4898 = 0;
			arg1.anInt4912 = -1;
			arg1.anInt6833 = arg1.anIntArray425[0] * 128 + arg1.method4009() * 64;
			arg1.anInt6835 = arg1.anIntArray424[0] * 128 + arg1.method4009() * 64;
			arg1.method4010();
		}
		@Pc(214) int local214 = Static454.method5701(arg1);
		Static131.method1960(arg1, local9, local7, local214);
		Static105.method1608(arg1);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIILclient!nt;IB)V")
	public static void method1177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub35 arg3, @OriginalArg(4) int arg4) {
		if (arg3.anInt4551 == -1 && arg3.anIntArray389 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(28) int local28 = arg3.anInt4554 * Static2.aClass148_Sub1_1.anInt3790 >> 8;
		if (arg3.anInt4563 < arg1) {
			local20 = arg1 - arg3.anInt4563;
		} else if (arg1 < arg3.anInt4556) {
			local20 = arg3.anInt4556 - arg1;
		}
		if (arg3.anInt4553 < arg2) {
			local20 += arg2 - arg3.anInt4553;
		} else if (arg2 < arg3.anInt4565) {
			local20 += arg3.anInt4565 - arg2;
		}
		if (arg3.anInt4562 == 0 || local20 - 64 > arg3.anInt4562 || Static2.aClass148_Sub1_1.anInt3790 == 0 || arg3.anInt4561 != arg4) {
			if (arg3.aClass2_Sub1_Sub3_3 != null) {
				Static421.aClass2_Sub1_Sub4_2.method3237(arg3.aClass2_Sub1_Sub3_3);
				arg3.aClass2_Sub1_Sub3_3 = null;
			}
			if (arg3.aClass2_Sub1_Sub3_4 != null) {
				Static421.aClass2_Sub1_Sub4_2.method3237(arg3.aClass2_Sub1_Sub3_4);
				arg3.aClass2_Sub1_Sub3_4 = null;
			}
			return;
		}
		local20 -= 64;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(138) int local138 = local28 * (arg3.anInt4562 - local20) / arg3.anInt4562;
		if (arg3.aClass2_Sub1_Sub3_3 != null) {
			arg3.aClass2_Sub1_Sub3_3.method1594(local138);
		} else if (arg3.anInt4551 >= 0) {
			@Pc(156) Class106 local156 = Static465.method2204(Static427.aClass54_115, arg3.anInt4551, 0);
			if (local156 != null) {
				@Pc(163) Class2_Sub22_Sub1 local163 = local156.method2206().method2159(Static162.aClass243_1);
				@Pc(168) Class2_Sub1_Sub3 local168 = Static462.method1593(local163, local138);
				local168.method1598(-1);
				Static421.aClass2_Sub1_Sub4_2.method3232(local168);
				arg3.aClass2_Sub1_Sub3_3 = local168;
			}
		}
		if (arg3.aClass2_Sub1_Sub3_4 != null) {
			arg3.aClass2_Sub1_Sub3_4.method1594(local138);
			if (!arg3.aClass2_Sub1_Sub3_4.method5702()) {
				arg3.aClass2_Sub1_Sub3_4 = null;
			}
		} else if (arg3.anIntArray389 != null && (arg3.anInt4559 -= arg0) <= 0) {
			@Pc(215) int local215 = (int) (Math.random() * (double) arg3.anIntArray389.length);
			@Pc(223) Class106 local223 = Static465.method2204(Static427.aClass54_115, arg3.anIntArray389[local215], 0);
			if (local223 != null) {
				@Pc(230) Class2_Sub22_Sub1 local230 = local223.method2206().method2159(Static162.aClass243_1);
				@Pc(235) Class2_Sub1_Sub3 local235 = Static462.method1593(local230, local138);
				local235.method1598(0);
				Static421.aClass2_Sub1_Sub4_2.method3232(local235);
				arg3.anInt4559 = (int) ((double) (arg3.anInt4555 - arg3.anInt4550) * Math.random()) + arg3.anInt4550;
				arg3.aClass2_Sub1_Sub3_4 = local235;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLclient!pf;Z)V")
	public static void method1179(@OriginalArg(1) Class3_Sub4_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static137.anInt6647 >= 400) {
			return;
		}
		if (Static60.aClass3_Sub4_Sub1_Sub2_1 != arg0) {
			@Pc(179) String local179;
			@Pc(106) int local106;
			if (arg0.anInt4992 == 0) {
				@Pc(61) boolean local61 = true;
				if (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4988 != -1 && arg0.anInt4988 != -1) {
					@Pc(84) int local84 = arg0.anInt5001 < Static60.aClass3_Sub4_Sub1_Sub2_1.anInt5001 ? Static60.aClass3_Sub4_Sub1_Sub2_1.anInt5001 : arg0.anInt5001;
					@Pc(95) int local95 = arg0.anInt4988 > Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4988 ? Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4988 : arg0.anInt4988;
					local106 = local84 * 10 / 100 + local95 + 5;
					@Pc(113) int local113 = Static60.aClass3_Sub4_Sub1_Sub2_1.anInt5001 - arg0.anInt5001;
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local113 > local106) {
						local61 = false;
					}
				}
				@Pc(140) String local140 = Static270.aClass4_3 == Static118.aClass4_1 ? Static345.aClass134_80.method2720(Static331.anInt5597) : Static136.aClass134_48.method2720(Static331.anInt5597);
				if (arg0.anInt5001 >= arg0.anInt4995) {
					local179 = arg0.method4017() + (local61 ? Static154.method2191(arg0.anInt5001, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt5001) : "<col=ffffff>") + " (" + local140 + arg0.anInt5001 + ")";
				} else {
					local179 = arg0.method4017() + (local61 ? Static154.method2191(arg0.anInt5001, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt5001) : "<col=ffffff>") + " (" + local140 + arg0.anInt5001 + "+" + (arg0.anInt4995 - arg0.anInt5001) + ")";
				}
			} else {
				local179 = arg0.method4017() + " (" + Static397.aClass134_90.method2720(Static331.anInt5597) + arg0.anInt4992 + ")";
			}
			if (Static215.aBoolean217) {
				if (!arg1 && (Static256.anInt2800 & 0x8) != 0) {
					Static153.method2190(0, Static76.aString45, true, Static201.anInt3379, Static408.aString205 + " -> <col=ffffff>" + local179, -1, 0, 57, false, (long) arg0.anInt4915);
				}
			} else if (arg1) {
				Static153.method2190(0, "<col=cccccc>" + local179, false, -1, "", 0, 0, -1, true, 0L);
			} else {
				for (@Pc(249) int local249 = 7; local249 >= 0; local249--) {
					if (Static43.aStringArray5[local249] != null) {
						@Pc(257) short local257 = 0;
						if (Static118.aClass4_1 == Static193.aClass4_2 && Static43.aStringArray5[local249].equalsIgnoreCase(Static95.aClass134_45.method2720(Static331.anInt5597))) {
							if (arg0.anInt5001 > Static60.aClass3_Sub4_Sub1_Sub2_1.anInt5001) {
								local257 = 2000;
							}
							if (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4982 != 0 && arg0.anInt4982 != 0) {
								if (arg0.anInt4982 == Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4982) {
									local257 = 2000;
								} else {
									local257 = 0;
								}
							}
						} else if (Static232.aBooleanArray15[local249]) {
							local257 = 2000;
						}
						@Pc(311) short local311 = (short) (Static139.aShortArray10[local249] + local257);
						local106 = Static99.anIntArray147[local249] == -1 ? Static235.anInt3807 : Static99.anIntArray147[local249];
						Static153.method2190(0, Static43.aStringArray5[local249], true, local106, "<col=ffffff>" + local179, -1, 0, local311, false, (long) arg0.anInt4915);
					}
				}
			}
			if (!arg1) {
				for (@Pc(416) Class2_Sub46 local416 = (Class2_Sub46) Static261.aClass156_13.method3155(); local416 != null; local416 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
					if (local416.anInt7283 == 10) {
						local416.aString206 = "<col=ffffff>" + local179;
						return;
					}
				}
			}
		} else if (Static215.aBoolean217 && (Static256.anInt2800 & 0x10) != 0) {
			Static153.method2190(0, Static76.aString45, true, Static201.anInt3379, Static408.aString205 + " -> <col=ffffff>" + Static298.aClass134_8.method2720(Static331.anInt5597), -1, 0, 16, false, 0L);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V")
	public static void method1180() {
		Static419.aClass132_57.method2713(5);
	}
}
