import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread2;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
	public static int anInt2794;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "Lclient!tl;")
	public static Class155 aClass155_22 = new Class155(64);

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "F")
	public static float aFloat97 = 0.0F;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(JZ)V")
	public static void method2132(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static180.anInt4068; local18++) {
			if (Static286.aLongArray11[local18] == arg0) {
				Static180.anInt4068--;
				for (@Pc(38) int local38 = local18; local38 < Static180.anInt4068; local38++) {
					Static78.aStringArray6[local38] = Static78.aStringArray6[local38 + 1];
					Static233.anIntArray532[local38] = Static233.anIntArray532[local38 + 1];
					Static84.aStringArray8[local38] = Static84.aStringArray8[local38 + 1];
					Static286.aLongArray11[local38] = Static286.aLongArray11[local38 + 1];
					Static78.anIntArray197[local38] = Static78.anIntArray197[local38 + 1];
					Static225.aBooleanArray21[local38] = Static225.aBooleanArray21[local38 + 1];
				}
				Static254.anInt5408 = Static27.anInt754;
				Static81.aClass1_Sub16_Sub1_1.method2676(225);
				Static81.aClass1_Sub16_Sub1_1.method2631(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Lclient!ug;")
	public static Class1_Sub2_Sub14 method2133() {
		@Pc(9) int local9 = Static166.anIntArray343[0] * Static81.anIntArray204[0];
		@Pc(16) int[] local16 = new int[local9];
		@Pc(26) byte[] local26 = Static200.aByteArrayArray83[0];
		for (@Pc(28) int local28 = 0; local28 < local9; local28++) {
			local16[local28] = Static167.anIntArray346[local26[local28] & 0xFF];
		}
		@Pc(69) Class1_Sub2_Sub14 local69;
		if (Static296.aBoolean335) {
			local69 = new Class1_Sub2_Sub14_Sub2(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[0], Static121.anIntArray257[0], Static166.anIntArray343[0], Static81.anIntArray204[0], local16);
		} else {
			local69 = new Class1_Sub2_Sub14_Sub1(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[0], Static121.anIntArray257[0], Static166.anIntArray343[0], Static81.anIntArray204[0], local16);
		}
		Static265.method4490();
		return local69;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIBZI)V")
	public static void method2134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		Static121.anInt2729++;
		Static14.method317();
		@Pc(28) int local28;
		if (arg3) {
			Static262.method4467(false, false, 0);
		} else {
			Static159.method3000(0);
			Static262.method4467(true, false, 0);
			if (Static11.anInt2936 == 0) {
				for (local28 = 1; local28 <= 5; local28++) {
					Static262.method4467(false, false, local28);
					Static262.method4467(false, true, local28);
					Static159.method3000(local28);
				}
			} else {
				for (local28 = 1; local28 <= 5; local28++) {
					Static159.method3000(local28);
					Static262.method4467(false, false, local28);
					Static262.method4467(false, true, local28);
				}
			}
		}
		if (!arg3) {
			Static122.method2096();
		}
		Static216.method3788();
		if (Static296.aBoolean335) {
			Static269.method4526(arg4, arg1, true, arg0, arg2);
			arg1 = Static59.anInt1538;
			arg2 = Static267.anInt3426;
			arg0 = Static249.anInt5441;
			arg4 = Static108.anInt2326;
		}
		@Pc(124) int local124;
		if (Static280.anInt5999 == 1) {
			local28 = (int) Static25.aFloat19;
			local124 = Static136.anInt3074 + (int) aFloat97 & 0x7FF;
			if (local28 < Static130.anInt2885 / 256) {
				local28 = Static130.anInt2885 / 256;
			}
			if (Static233.aBooleanArray22[4] && local28 < Static255.anIntArray559[4] + 128) {
				local28 = Static255.anIntArray559[4] + 128;
			}
			Static32.method662(local124, Static148.anInt3505, Static220.method3905(Static239.aClass25_Sub1_Sub1_2.anInt1635, Static239.aClass25_Sub1_Sub1_2.anInt1604, Static145.anInt3477) - 50, local28 * 3 + 600, local28, arg2, Static251.anInt5460);
		} else if (Static280.anInt5999 == 5) {
			Static43.method946(arg2);
		}
		local124 = Static48.anInt1350;
		local28 = Static229.anInt5072;
		@Pc(183) int local183 = Static157.anInt3612;
		@Pc(185) int local185 = Static38.anInt1151;
		@Pc(187) int local187 = Static97.anInt6055;
		@Pc(189) int local189;
		@Pc(231) int local231;
		for (local189 = 0; local189 < 5; local189++) {
			if (Static233.aBooleanArray22[local189]) {
				local231 = (int) (Math.random() * (double) (Static188.anIntArray377[local189] * 2 + 1) - (double) Static188.anIntArray377[local189] + Math.sin((double) Static261.anIntArray568[local189] * ((double) Static183.anIntArray367[local189] / 100.0D)) * (double) Static255.anIntArray559[local189]);
				if (local189 == 2) {
					Static157.anInt3612 += local231;
				}
				if (local189 == 3) {
					Static97.anInt6055 = Static97.anInt6055 + local231 & 0x7FF;
				}
				if (local189 == 4) {
					Static38.anInt1151 += local231;
					if (Static38.anInt1151 < 128) {
						Static38.anInt1151 = 128;
					}
					if (Static38.anInt1151 > 383) {
						Static38.anInt1151 = 383;
					}
				}
				if (local189 == 0) {
					Static229.anInt5072 += local231;
				}
				if (local189 == 1) {
					Static48.anInt1350 += local231;
				}
			}
		}
		Static101.method2287();
		@Pc(390) int local390;
		if (Static296.aBoolean335) {
			Static288.method4714(arg1, arg4, arg0 + arg1, arg4 - -arg2);
			@Pc(353) float local353 = (float) Static97.anInt6055 * 0.17578125F;
			@Pc(360) float local360 = (float) Static38.anInt1151 * 0.17578125F;
			if (Static280.anInt5999 == 3) {
				local360 = Static273.aFloat193 * 360.0F / 6.2831855F;
				local353 = Static27.aFloat21 * 360.0F / 6.2831855F;
			}
			if (Static279.anInt5968 == 10) {
				local390 = Static299.method4859(Static112.anInt2417, Static157.anInt3612 >> 10, Static229.anInt5072 >> 10, Static20.anInt5576);
			} else {
				local390 = Static299.method4859(Static112.anInt2417, Static239.aClass25_Sub1_Sub1_2.anIntArray173[0] >> 3, Static239.aClass25_Sub1_Sub1_2.anIntArray172[0] >> 3, Static20.anInt5576);
			}
			if (Static6.anInt2268 >= 0) {
				Static296.method4836();
				@Pc(419) Class150 local419 = Static15.method320(Static3.anInt107, Static6.anInt2268, Static62.anInt1583, Static254.anInt5397);
				local419.method4251(Static271.anInt5843, arg1, arg4, arg0, arg2, Static38.anInt1151, Static97.anInt6055, local390);
			} else {
				Static296.method4817(local390);
			}
			Static296.method4827(arg1, arg4, arg0, arg2, arg0 / 2 + arg1, arg4 - -(arg2 / 2), local360, local353, Static49.anInt1370, Static49.anInt1370);
			Static228.method3997(false);
			Static296.method4822();
			Static296.method4798(true);
			Static296.method4814(true);
		} else {
			Static203.method3590(arg1, arg4, arg0 + arg1, arg4 + arg2);
			Static151.method2838();
			if (Static6.anInt2268 < 0) {
				Static203.method3592(arg1, arg4, arg0, arg2, 0);
			} else {
				@Pc(327) Class150 local327 = Static15.method320(Static3.anInt107, Static6.anInt2268, Static62.anInt1583, Static254.anInt5397);
				local327.method4253(Static271.anInt5843, arg1, arg4, arg0, arg2, Static38.anInt1151, Static97.anInt6055);
			}
		}
		if (Static218.aBoolean267 || Static190.anInt4241 < arg1 || arg1 + arg0 <= Static190.anInt4241 || arg4 > Static281.anInt6019 || Static281.anInt6019 >= arg2 + arg4) {
			Static129.anInt2873 = 0;
			Static212.aBoolean252 = false;
		} else {
			Static129.anInt2873 = 0;
			Static212.aBoolean252 = true;
			local189 = Static9.anInt271;
			local390 = Static91.anInt2137;
			local231 = Static148.anInt3502;
			Static24.anInt490 = local189 + (local231 - local189) * (Static190.anInt4241 + -arg1) / arg0;
			@Pc(516) int local516 = Static234.anInt5157;
			Static45.anInt1287 = local390 + (Static281.anInt6019 - arg4) * (local516 + -local390) / arg2;
		}
		Static96.method1648();
		@Pc(548) byte local548 = Static18.method379() == 2 ? (byte) Static121.anInt2729 : 1;
		if (Static296.aBoolean335) {
			Static67.method1284(Static32.anInt809, !Static135.aBoolean154);
			Static48.method1021(Static48.anInt1350, Static38.anInt1151, Static157.anInt3612, Static97.anInt6055, Static229.anInt5072);
			Static296.anInt6203 = Static32.anInt809;
			Static202.method3589(Static229.anInt5072, Static48.anInt1350, Static157.anInt3612, Static38.anInt1151, Static97.anInt6055, Static269.aByteArrayArrayArray51, Static73.anIntArray186, Static92.anIntArray217, Static22.anIntArray48, Static94.anIntArray609, Static277.anIntArray596, Static145.anInt3477 + 1, local548, Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7, Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7);
			Static177.aBoolean203 = true;
			Static67.method1287();
			Static48.method1021(0, 0, 0, 0, 0);
			Static96.method1648();
			Static280.method4651(arg2, Static49.anInt1370, arg0, arg4, Static49.anInt1370, arg1);
			Static9.method213(Static49.anInt1370, Static49.anInt1370, arg1, arg4, arg0, arg2);
			Static217.method3825();
		} else {
			Static202.method3589(Static229.anInt5072, Static48.anInt1350, Static157.anInt3612, Static38.anInt1151, Static97.anInt6055, Static269.aByteArrayArrayArray51, Static73.anIntArray186, Static92.anIntArray217, Static22.anIntArray48, Static94.anIntArray609, Static277.anIntArray596, Static145.anInt3477 + 1, local548, Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7, Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7);
			Static96.method1648();
			Static217.method3825();
			Static280.method4651(arg2, 256, arg0, arg4, 256, arg1);
			Static9.method213(256, 256, arg1, arg4, arg0, arg2);
		}
		((Class2_Sub1) Static151.anInterface2_1).method4434(Static112.anInt2417);
		Static271.method4537(arg0, arg1, arg4, arg2);
		Static48.anInt1350 = local124;
		Static157.anInt3612 = local183;
		Static229.anInt5072 = local28;
		Static97.anInt6055 = local187;
		Static38.anInt1151 = local185;
		if (Static202.aBoolean241 && Static10.aClass42_1.method1083() == 0) {
			Static202.aBoolean241 = false;
		}
		if (Static202.aBoolean241) {
			if (Static296.aBoolean335) {
				Static288.method4713(arg1, arg4, arg0, arg2, 0);
			} else {
				Static203.method3592(arg1, arg4, arg0, arg2, 0);
			}
			Static242.method4171(false, Static19.aString12);
		}
		if (!arg3 && !Static202.aBoolean241 && !Static218.aBoolean267 && arg1 <= Static190.anInt4241 && Static190.anInt4241 < arg1 + arg0 && Static281.anInt6019 >= arg4 && Static281.anInt6019 < arg4 + arg2) {
			Static181.method3281(arg2, arg4, arg0, Static281.anInt6019, arg1, Static190.anInt4241);
		}
	}
}
