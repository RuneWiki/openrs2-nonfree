import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Lclient!dm;")
	public static Class3_Sub18 method4732() {
		if (Static317.aClass338_136 == null || Static406.aClass167_1 == null) {
			return null;
		}
		Static406.aClass167_1.method4438(Static317.aClass338_136);
		@Pc(26) Class3_Sub18 local26 = (Class3_Sub18) Static406.aClass167_1.method4435();
		if (local26 == null) {
			return null;
		} else {
			@Pc(36) Class308 local36 = Static317.aClass27_3.method693(local26.anInt2277);
			return local36 != null && local36.aBoolean686 && local36.method7689(Static317.anInterface16_2) ? local26 : Static132.method2501();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBIII)V")
	public static void method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = Static120.method2296(arg1, Static374.anInt5986, Static84.anInt1667);
		@Pc(25) int local25 = Static120.method2296(arg0, Static374.anInt5986, Static84.anInt1667);
		@Pc(31) int local31 = Static120.method2296(arg3, Static7.anInt93, Static115.anInt2377);
		@Pc(37) int local37 = Static120.method2296(arg2, Static7.anInt93, Static115.anInt2377);
		for (@Pc(39) int local39 = local17; local39 <= local25; local39++) {
			Static483.method7014(Static392.anIntArrayArray39[local39], local31, local37, arg4);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public static void method4734() {
		Static520.method7300(false);
		Static219.anInt4162 = 0;
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < Static73.aByteArrayArray6.length; local19++) {
			if (Static647.anIntArray907[local19] != -1 && Static73.aByteArrayArray6[local19] == null) {
				Static73.aByteArrayArray6[local19] = Static590.aClass15_146.method517(0, Static647.anIntArray907[local19]);
				if (Static73.aByteArrayArray6[local19] == null) {
					Static219.anInt4162++;
					local17 = false;
				}
			}
			if (Static250.anIntArray410[local19] != -1 && Static654.aByteArrayArray30[local19] == null) {
				Static654.aByteArrayArray30[local19] = Static590.aClass15_146.method531(0, Static597.anIntArrayArray58[local19], Static250.anIntArray410[local19]);
				if (Static654.aByteArrayArray30[local19] == null) {
					local17 = false;
					Static219.anInt4162++;
				}
			}
			if (Static198.anIntArray945[local19] != -1 && Static585.aByteArrayArray25[local19] == null) {
				Static585.aByteArrayArray25[local19] = Static590.aClass15_146.method517(0, Static198.anIntArray945[local19]);
				if (Static585.aByteArrayArray25[local19] == null) {
					Static219.anInt4162++;
					local17 = false;
				}
			}
			if (Static281.anIntArray439[local19] != -1 && Static134.aByteArrayArray10[local19] == null) {
				Static134.aByteArrayArray10[local19] = Static590.aClass15_146.method517(0, Static281.anIntArray439[local19]);
				if (Static134.aByteArrayArray10[local19] == null) {
					local17 = false;
					Static219.anInt4162++;
				}
			}
			if (Static460.anIntArray648 != null && Static635.aByteArrayArray28[local19] == null && Static460.anIntArray648[local19] != -1) {
				Static635.aByteArrayArray28[local19] = Static590.aClass15_146.method531(0, Static597.anIntArrayArray58[local19], Static460.anIntArray648[local19]);
				if (Static635.aByteArrayArray28[local19] == null) {
					Static219.anInt4162++;
					local17 = false;
				}
			}
		}
		if (Static537.aClass130_2 == null) {
			if (Static604.aClass3_Sub11_Sub21_3 == null || !Static267.aClass15_75.method520(Static604.aClass3_Sub11_Sub21_3.aString128 + "_staticelements")) {
				Static537.aClass130_2 = new Class130(0);
			} else if (Static267.aClass15_75.method532(Static604.aClass3_Sub11_Sub21_3.aString128 + "_staticelements")) {
				Static537.aClass130_2 = Static574.method8104(Static604.aClass3_Sub11_Sub21_3.aString128 + "_staticelements", Static267.aClass15_75, Static128.aBoolean206);
			} else {
				Static219.anInt4162++;
				local17 = false;
			}
		}
		if (!local17) {
			Static44.anInt1037 = 1;
			return;
		}
		Static290.anInt4940 = 0;
		local17 = true;
		@Pc(270) int local270;
		@Pc(281) int local281;
		for (@Pc(251) int local251 = 0; local251 < Static73.aByteArrayArray6.length; local251++) {
			@Pc(257) byte[] local257 = Static654.aByteArrayArray30[local251];
			if (local257 != null) {
				local270 = (Static77.anIntArray125[local251] >> 8) * 64 - Static287.anInt4910;
				local281 = (Static77.anIntArray125[local251] & 0xFF) * 64 - Static72.anInt1361;
				if (Static567.anInt5924 != 0) {
					local270 = 10;
					local281 = 10;
				}
				local17 &= Static350.method5202(local257, local270, Static158.anInt927, Static515.anInt8292, local281);
			}
			local257 = Static134.aByteArrayArray10[local251];
			if (local257 != null) {
				local270 = (Static77.anIntArray125[local251] >> 8) * 64 - Static287.anInt4910;
				local281 = (Static77.anIntArray125[local251] & 0xFF) * 64 - Static72.anInt1361;
				if (Static567.anInt5924 != 0) {
					local270 = 10;
					local281 = 10;
				}
				local17 &= Static350.method5202(local257, local270, Static158.anInt927, Static515.anInt8292, local281);
			}
		}
		if (!local17) {
			Static44.anInt1037 = 2;
			return;
		}
		if (Static44.anInt1037 != 0) {
			Static21.method603(Static504.aClass69_11, Static674.aClass13_22, Static253.aClass88_19, true, Static601.aClass346_14.method8440(Static609.anInt9834) + "<br>(100%)");
		}
		Static72.method1380();
		Static429.method6182();
		Static651.method9022();
		@Pc(380) boolean local380 = false;
		if (Static674.aClass13_22.method8507() && Static24.aClass3_Sub22_4.aClass6_Sub29_1.method8967() == 2) {
			for (local270 = 0; local270 < Static73.aByteArrayArray6.length; local270++) {
				if (Static134.aByteArrayArray10[local270] != null || Static585.aByteArrayArray25[local270] != null) {
					local380 = true;
					break;
				}
			}
		}
		if (Static24.aClass3_Sub22_4.aClass6_Sub5_1.method2797() == 1) {
			local270 = Static64.anIntArray114[Static11.anInt126];
		} else {
			local270 = Static569.anIntArray791[Static11.anInt126];
		}
		if (Static674.aClass13_22.method8513()) {
			local270++;
		}
		Static653.method9047(Static674.aClass13_22, Static640.anInt10168, Static158.anInt927, Static515.anInt8292, local270, local380, Static674.aClass13_22.method8448() > 0);
		Static576.method8135(Static202.anInt3394);
		if (Static202.anInt3394 == 0) {
			Static233.method3921((Class69) null);
		} else {
			Static233.method3921(Static400.aClass69_9);
		}
		for (local281 = 0; local281 < 4; local281++) {
			Static1.aClass252Array5[local281].method6169();
		}
		Static13.method192();
		Static443.method6285(false);
		Static264.method4357();
		Static536.aClass206_5 = null;
		Static634.aBoolean767 = false;
		Static72.method1380();
		System.gc();
		Static520.method7300(true);
		Static478.method6965();
		Static45.anInt1064 = Static24.aClass3_Sub22_4.aClass6_Sub3_1.method1374();
		Static425.aBoolean485 = Static387.anInt6096 >= 96;
		Static76.aBoolean102 = Static24.aClass3_Sub22_4.aClass6_Sub29_1.method8967() == 2;
		Static540.aBoolean695 = Static24.aClass3_Sub22_4.aClass6_Sub12_1.method4157() == 1;
		Static10.anInt114 = Static24.aClass3_Sub22_4.lb.method7116() == 1 ? -1 : Static34.anInt808;
		Static653.aBoolean781 = Static24.aClass3_Sub22_4.aClass6_Sub9_1.method3802() == 1;
		Static507.aBoolean593 = Static24.aClass3_Sub22_4.aClass6_Sub15_1.method4448() == 1;
		Static239.aClass73_Sub1_1 = new Class73_Sub1(4, Static158.anInt927, Static515.anInt8292, false);
		if (Static567.anInt5924 == 0) {
			Static416.method5924(Static73.aByteArrayArray6, Static239.aClass73_Sub1_1);
		} else {
			Static15.method7497(Static73.aByteArrayArray6, Static239.aClass73_Sub1_1);
		}
		Static423.method6086(Static515.anInt8292 >> 4, Static158.anInt927 >> 4);
		Static523.method7310();
		if (local380) {
			Static524.method7321(true);
			Static576.aClass73_Sub1_2 = new Class73_Sub1(1, Static158.anInt927, Static515.anInt8292, true);
			if (Static567.anInt5924 == 0) {
				Static416.method5924(Static585.aByteArrayArray25, Static576.aClass73_Sub1_2);
				Static520.method7300(true);
			} else {
				Static15.method7497(Static585.aByteArrayArray25, Static576.aClass73_Sub1_2);
				Static520.method7300(true);
			}
			Static576.aClass73_Sub1_2.method1804(Static239.aClass73_Sub1_1.anIntArrayArrayArray8[0]);
			Static576.aClass73_Sub1_2.method1799((Class252[]) null, (int[][][]) null, Static674.aClass13_22);
			Static524.method7321(false);
		}
		Static239.aClass73_Sub1_1.method1799(Static1.aClass252Array5, local380 ? Static576.aClass73_Sub1_2.anIntArrayArrayArray8 : null, Static674.aClass13_22);
		if (Static567.anInt5924 == 0) {
			Static520.method7300(true);
			Static256.method3783(Static239.aClass73_Sub1_1, Static654.aByteArrayArray30);
			if (Static635.aByteArrayArray28 != null) {
				Static189.method5094();
			}
		} else {
			Static520.method7300(true);
			Static451.method6588(Static239.aClass73_Sub1_1, Static654.aByteArrayArray30);
		}
		Static429.method6182();
		if (Static387.anInt6096 < 96) {
			Static554.method7893();
		}
		Static520.method7300(true);
		Static239.aClass73_Sub1_1.method1798(local380 ? Static108.aClass21Array1[0] : null, (Class21) null, Static674.aClass13_22);
		Static239.aClass73_Sub1_1.method1809(false, Static674.aClass13_22);
		Static520.method7300(true);
		if (local380) {
			Static524.method7321(true);
			Static520.method7300(true);
			if (Static567.anInt5924 == 0) {
				Static256.method3783(Static576.aClass73_Sub1_2, Static134.aByteArrayArray10);
			} else {
				Static451.method6588(Static576.aClass73_Sub1_2, Static134.aByteArrayArray10);
			}
			Static429.method6182();
			Static520.method7300(true);
			Static576.aClass73_Sub1_2.method1798((Class21) null, Static582.aClass21Array3[0], Static674.aClass13_22);
			Static576.aClass73_Sub1_2.method1809(true, Static674.aClass13_22);
			Static520.method7300(true);
			Static524.method7321(false);
		}
		Static322.method4919();
		@Pc(758) int local758 = Static239.aClass73_Sub1_1.anInt1886;
		if (local758 > Static309.anInt5138) {
			local758 = Static309.anInt5138;
		}
		if (Static309.anInt5138 - 1 > local758) {
			local758 = Static309.anInt5138 - 1;
		}
		if (Static24.aClass3_Sub22_4.lb.method7116() == 0) {
			Static658.method9283(local758);
		} else {
			Static658.method9283(0);
		}
		@Pc(796) int local796;
		@Pc(800) int local800;
		for (@Pc(792) int local792 = 0; local792 < 4; local792++) {
			for (local796 = 0; local796 < Static158.anInt927; local796++) {
				for (local800 = 0; local800 < Static515.anInt8292; local800++) {
					Static154.method2813(local800, local792, local796);
				}
			}
		}
		Static342.method5130();
		Static72.method1380();
		Static584.method8243();
		Static429.method6182();
		Static213.method3716();
		@Pc(851) Class3_Sub34 local851;
		if (Static380.aFrame2 != null && Static559.aClass269_1 != null && Static406.anInt6454 == 11) {
			local851 = Static172.method3123(Static163.aClass375_1, Static411.aClass218_95);
			local851.aClass3_Sub25_Sub1_2.method8588(1057001181);
			Static441.method6275(local851);
		}
		if (Static567.anInt5924 == 0) {
			local796 = (Static601.anInt9665 - (Static158.anInt927 >> 4)) / 8;
			local800 = (Static601.anInt9665 + (Static158.anInt927 >> 4)) / 8;
			@Pc(886) int local886 = (Static288.anInt4926 - (Static515.anInt8292 >> 4)) / 8;
			@Pc(894) int local894 = ((Static515.anInt8292 >> 4) + Static288.anInt4926) / 8;
			for (@Pc(898) int local898 = local796 - 1; local898 <= local800 + 1; local898++) {
				for (@Pc(904) int local904 = local886 - 1; local904 <= local894 + 1; local904++) {
					if (local796 > local898 || local800 < local898 || local904 < local886 || local894 < local904) {
						Static590.aClass15_146.method524("m" + local898 + "_" + local904);
						Static590.aClass15_146.method524("l" + local898 + "_" + local904);
					}
				}
			}
		}
		if (Static406.anInt6454 == 4) {
			Static553.method7892(3);
		} else if (Static406.anInt6454 == 8) {
			Static553.method7892(7);
		} else {
			Static553.method7892(10);
			if (Static559.aClass269_1 != null) {
				local851 = Static172.method3123(Static163.aClass375_1, Static222.aClass218_58);
				Static441.method6275(local851);
			}
		}
		Static390.method9304();
		Static72.method1380();
		Static225.method3836();
		Static27.aBoolean42 = true;
		if (Static551.aBoolean706) {
			Static238.method4024("Took: " + (Static524.method7320() - Static360.aLong187) + "ms");
			Static551.aBoolean706 = false;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method4735(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static94.anInt1782 >= 100) {
			Static381.method5445(Static601.aClass346_41.method8440(Static609.anInt9834));
			return;
		}
		@Pc(25) String local25 = Static629.method8792(arg0);
		if (local25 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(30) int local30 = 0; local30 < Static94.anInt1782; local30++) {
			@Pc(38) String local38 = Static629.method8792(Static134.aStringArray7[local30]);
			if (local38 != null && local38.equals(local25)) {
				Static381.method5445(arg0 + Static601.aClass346_42.method8440(Static609.anInt9834));
				return;
			}
			if (Static271.aStringArray31[local30] != null) {
				local69 = Static629.method8792(Static271.aStringArray31[local30]);
				if (local69 != null && local69.equals(local25)) {
					Static381.method5445(arg0 + Static601.aClass346_42.method8440(Static609.anInt9834));
					return;
				}
			}
		}
		for (@Pc(96) int local96 = 0; local96 < Static458.anInt7581; local96++) {
			local69 = Static629.method8792(Static461.aStringArray20[local96]);
			if (local69 != null && local69.equals(local25)) {
				Static381.method5445(Static601.aClass346_47.method8440(Static609.anInt9834) + arg0 + Static601.aClass346_48.method8440(Static609.anInt9834));
				return;
			}
			if (Static105.aStringArray5[local96] != null) {
				@Pc(147) String local147 = Static629.method8792(Static105.aStringArray5[local96]);
				if (local147 != null && local147.equals(local25)) {
					Static381.method5445(Static601.aClass346_47.method8440(Static609.anInt9834) + arg0 + Static601.aClass346_48.method8440(Static609.anInt9834));
					return;
				}
			}
		}
		if (Static629.method8792(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString123).equals(local25)) {
			Static381.method5445(Static601.aClass346_44.method8440(Static609.anInt9834));
			return;
		}
		@Pc(201) Class3_Sub34 local201 = Static172.method3123(Static163.aClass375_1, Static397.aClass218_94);
		local201.aClass3_Sub25_Sub1_2.method8614(Static440.method6269(arg0) + 1);
		local201.aClass3_Sub25_Sub1_2.method8583(arg0);
		local201.aClass3_Sub25_Sub1_2.method8614(arg1 ? 1 : 0);
		Static441.method6275(local201);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)Lclient!mt;")
	public static Class228 method4736(@OriginalArg(1) int arg0) {
		@Pc(8) Class228[] local8 = Static502.method3751();
		for (@Pc(17) int local17 = 0; local17 < local8.length; local17++) {
			if (local8[local17].anInt6086 == arg0) {
				return local8[local17];
			}
		}
		return null;
	}
}
