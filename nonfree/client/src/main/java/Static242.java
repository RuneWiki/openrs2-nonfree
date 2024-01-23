import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "Z")
	public static boolean aBoolean322;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
	public static int[] anIntArray492 = new int[2];

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "[Lclient!fd;")
	public static Class4_Sub10[] aClass4_Sub10Array1 = new Class4_Sub10[2048];

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
	public static void method3782() {
		Static223.aClass26_45.method511();
		Static296.aClass26_57.method511();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIZII)V")
	public static void method3783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static86.anInt1997++;
		Static125.method1933();
		@Pc(26) int local26;
		if (arg2) {
			Static10.method174(0, false, false);
		} else {
			Static149.method2395(0);
			Static10.method174(0, false, true);
			if (Static212.anInt4166 == 0) {
				for (local26 = 1; local26 <= 5; local26++) {
					Static10.method174(local26, false, false);
					Static10.method174(local26, true, false);
					Static149.method2395(local26);
				}
			} else {
				for (local26 = 1; local26 <= 5; local26++) {
					Static149.method2395(local26);
					Static10.method174(local26, false, false);
					Static10.method174(local26, true, false);
				}
			}
		}
		if (!arg2) {
			Static130.method1977();
		}
		Static282.method4358();
		if (Static94.aBoolean138) {
			Static250.method3961(arg4, true, arg1, arg0, arg3);
			arg3 = Static240.anInt4547;
			arg1 = Static69.anInt1333;
			arg4 = Static255.anInt4857;
			arg0 = Static183.anInt3483;
		}
		Static184.anInt3506 = arg0;
		Static184.anInt3503 = arg4;
		@Pc(137) int local137;
		if (Static41.anInt772 == 1) {
			local26 = (int) Static198.aFloat147;
			if (Static38.anInt626 / 256 > local26) {
				local26 = Static38.anInt626 / 256;
			}
			local137 = (int) Static202.aFloat97 + Static15.anInt242 & 0x7FF;
			if (Static137.aBooleanArray13[4] && Static295.anIntArray626[4] + 128 > local26) {
				local26 = Static295.anIntArray626[4] + 128;
			}
			Static251.method3991(local137, Static33.method522(Static154.aClass53_Sub1_Sub1_2.anInt4002, Static154.aClass53_Sub1_Sub1_2.anInt3974, Static281.anInt5335) - 50, local26, local26 * 3 + 600, Static127.anInt2496, arg1, Static289.anInt5413);
		} else if (Static41.anInt772 == 5) {
			Static42.method698(arg1);
		}
		local26 = Static129.anInt2519;
		@Pc(183) int local183 = Static302.anInt5682;
		@Pc(185) int local185 = Static207.anInt4066;
		local137 = Static82.anInt1931;
		@Pc(189) int local189 = Static193.anInt3656;
		@Pc(191) int local191;
		@Pc(237) int local237;
		for (local191 = 0; local191 < 5; local191++) {
			if (Static137.aBooleanArray13[local191]) {
				local237 = (int) ((double) -Static293.anIntArray625[local191] + Math.random() * (double) (Static293.anIntArray625[local191] * 2 + 1) + Math.sin((double) Static6.anIntArray13[local191] / 100.0D * (double) Static6.anIntArray14[local191]) * (double) Static295.anIntArray626[local191]);
				if (local191 == 1) {
					Static82.anInt1931 += local237;
				}
				if (local191 == 4) {
					Static207.anInt4066 += local237;
					if (Static207.anInt4066 < 128) {
						Static207.anInt4066 = 128;
					}
					if (Static207.anInt4066 > 383) {
						Static207.anInt4066 = 383;
					}
				}
				if (local191 == 3) {
					Static193.anInt3656 = Static193.anInt3656 + local237 & 0x7FF;
				}
				if (local191 == 2) {
					Static302.anInt5682 += local237;
				}
				if (local191 == 0) {
					Static129.anInt2519 += local237;
				}
			}
		}
		Static307.method4758();
		@Pc(398) int local398;
		if (Static94.aBoolean138) {
			Static104.method1694(arg0, arg4, arg0 + arg3, arg1 + arg4);
			@Pc(363) float local363 = (float) Static207.anInt4066 * 0.17578125F;
			@Pc(368) float local368 = (float) Static193.anInt3656 * 0.17578125F;
			if (Static41.anInt772 == 3) {
				local363 = Static27.aFloat15 * 360.0F / 6.2831855F;
				local368 = Static314.aFloat154 * 360.0F / 6.2831855F;
			}
			if (Static169.anInt3304 == 10) {
				local398 = Static266.method4190(Static10.anInt185, Static302.anInt5682 >> 10, Static211.anInt4156, Static129.anInt2519 >> 10);
			} else {
				local398 = Static266.method4190(Static10.anInt185, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0] >> 3, Static211.anInt4156, Static154.aClass53_Sub1_Sub1_2.anIntArray422[0] >> 3);
			}
			if (Static256.anInt4864 >= 0) {
				Static94.method1603();
				@Pc(427) Class47 local427 = Static58.method936(Static141.anInt5830, Static29.anInt466, Static256.anInt4864, Static223.anInt4304);
				local427.method1025(Static210.anInt3774, arg0, arg4, arg3, arg1, Static207.anInt4066, Static193.anInt3656, local398);
			} else {
				Static94.method1617(local398);
			}
			Static94.method1582(arg0, arg4, arg3, arg1, arg0 + arg3 / 2, arg4 + arg1 / 2, local363, local368, Static292.anInt5441, Static292.anInt5441);
			Static155.method1937(false);
			Static94.method1618();
			Static94.method1588(true);
			Static94.method1593(true);
		} else {
			Static270.method4246(arg0, arg4, arg3 + arg0, arg4 - -arg1);
			Static158.method2574();
			if (Static256.anInt4864 >= 0) {
				@Pc(328) Class47 local328 = Static58.method936(Static141.anInt5830, Static29.anInt466, Static256.anInt4864, Static223.anInt4304);
				local328.method1024(Static210.anInt3774, arg0, arg4, arg3, arg1, Static207.anInt4066, Static193.anInt3656);
			} else {
				Static270.method4242(arg0, arg4, arg3, arg1, 0);
			}
		}
		if (Static18.aBoolean17 || Static175.anInt3341 < arg0 || Static175.anInt3341 >= arg3 + arg0 || arg4 > Static198.anInt5852 || Static198.anInt5852 >= arg1 + arg4) {
			Static5.aBoolean8 = false;
			Static300.anInt5627 = 0;
		} else {
			Static300.anInt5627 = 0;
			Static5.aBoolean8 = true;
			local237 = Static157.anInt3123;
			@Pc(517) int local517 = Static27.anInt403;
			local398 = Static311.anInt6034;
			local191 = Static291.anInt5438;
			Static281.anInt5334 = local191 + (local237 - local191) * (Static175.anInt3341 + -arg0) / arg3;
			Static2.anInt3 = local398 + (Static198.anInt5852 - arg4) * (-local398 + local517) / arg1;
		}
		Static16.method763();
		@Pc(562) byte local562 = Static36.method561() == 2 ? (byte) Static86.anInt1997 : 1;
		if (Static94.aBoolean138) {
			Static196.method3124(Static50.anInt954, !Static312.aBoolean422);
			Static140.method2079(Static193.anInt3656, Static207.anInt4066, Static82.anInt1931, Static302.anInt5682, Static129.anInt2519);
			Static94.anInt2085 = Static50.anInt954;
			Static175.method2741(Static129.anInt2519, Static82.anInt1931, Static302.anInt5682, Static207.anInt4066, Static193.anInt3656, Static9.aByteArrayArrayArray2, Static212.anIntArray440, Static89.anIntArray164, Static291.anIntArray620, Static241.anIntArray489, anIntArray492, Static281.anInt5335 + 1, local562, Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7, Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7);
			Static273.aBoolean123 = true;
			Static196.method3125();
			Static140.method2079(0, 0, 0, 0, 0);
			Static16.method763();
			Static107.method4407(arg0, Static292.anInt5441, arg1, Static292.anInt5441, arg3, arg4);
			Static29.method462(arg4, Static292.anInt5441, arg1, Static292.anInt5441, arg3, arg0);
			Static148.method2367();
		} else {
			Static175.method2741(Static129.anInt2519, Static82.anInt1931, Static302.anInt5682, Static207.anInt4066, Static193.anInt3656, Static9.aByteArrayArrayArray2, Static212.anIntArray440, Static89.anIntArray164, Static291.anIntArray620, Static241.anIntArray489, anIntArray492, Static281.anInt5335 + 1, local562, Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7, Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7);
			Static16.method763();
			Static148.method2367();
			Static107.method4407(arg0, 256, arg1, 256, arg3, arg4);
			Static29.method462(arg4, 256, arg1, 256, arg3, arg0);
		}
		((Class24_Sub1) Static158.anInterface5_1).method458(Static211.anInt4156);
		Static207.method3340(arg4, arg0, arg1, arg3);
		Static129.anInt2519 = local26;
		Static82.anInt1931 = local137;
		Static193.anInt3656 = local189;
		Static207.anInt4066 = local185;
		Static302.anInt5682 = local183;
		if (Static107.aBoolean367 && Static288.aClass51_2.method1092() == 0) {
			Static107.aBoolean367 = false;
		}
		if (Static107.aBoolean367) {
			if (Static94.aBoolean138) {
				Static104.method1702(arg0, arg4, arg3, arg1, 0);
			} else {
				Static270.method4242(arg0, arg4, arg3, arg1, 0);
			}
			Static306.method4753(Static156.aString187, false);
		}
		if (!arg2 && !Static107.aBoolean367 && !Static18.aBoolean17 && arg0 <= Static175.anInt3341 && arg3 + arg0 > Static175.anInt3341 && arg4 <= Static198.anInt5852 && arg4 + arg1 > Static198.anInt5852) {
			Static86.method1518(arg1, Static175.anInt3341, arg4, arg0, arg3, Static198.anInt5852);
		}
	}
}
