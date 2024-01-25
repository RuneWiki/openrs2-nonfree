import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!vda", name = "v", descriptor = "Lclient!rg;")
	public static final Class293 aClass293_13 = new Class293();

	@OriginalMember(owner = "client!vda", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString97 = null;

	@OriginalMember(owner = "client!vda", name = "x", descriptor = "[Lclient!ro;")
	public static final Class3_Sub7_Sub18[] aClass3_Sub7_Sub18Array6 = new Class3_Sub7_Sub18[14];

	@OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
	public static int anInt9700 = 0;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)V")
	public static void method8228() {
		Static86.method7758(Static32.aClass3_Sub41_3.aClass7_Sub5_1.method2834() == 1);
		Static189.aClass89_3 = Static505.method7344(Static617.aCanvas13, 0, 22050, Static48.aClass298_12);
		Static378.method5965(Static280.method4566((Class3_Sub3_Sub1) null));
		Static320.aClass89_5 = Static505.method7344(Static617.aCanvas13, 1, 2048, Static48.aClass298_12);
		Static304.aClass3_Sub3_Sub3_3 = new Class3_Sub3_Sub3();
		Static320.aClass89_5.method4218(Static304.aClass3_Sub3_Sub3_3);
		Static415.aClass208_2 = new Class208(22050, Static168.anInt3272);
		Static612.method8364();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IJI)Ljava/lang/String;")
	public static String method8229(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static334.method5409(arg0);
		@Pc(10) int local10 = Static116.aCalendar1.get(5);
		@Pc(14) int local14 = Static116.aCalendar1.get(2);
		@Pc(26) int local26 = Static116.aCalendar1.get(1);
		@Pc(30) int local30 = Static116.aCalendar1.get(11);
		@Pc(34) int local34 = Static116.aCalendar1.get(12);
		return arg1 == 3 ? Static123.method2220(arg1, arg0) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static644.aStringArrayArray2[arg1][local14] + "-" + local26 + " " + local30 / 10 + local30 % 10 + ":" + local34 / 10 + local34 % 10;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZIIIII)V")
	public static void method8230(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static567.aClass351ArrayArrayArray4 == null) {
			Static266.aClass82_8.method6134(arg3, arg1, arg4, -16777216, arg2);
		} else if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 >= 0 && Static399.anInt7121 * 512 > Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 >= 0 && Static24.anInt345 * 512 > Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158) {
			Static609.anInt9804++;
			if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 != null && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 - (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619() - 1) * 256 >> 9 == Static162.anInt3235 && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 + 256 - Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619() * 256 >> 9 == Static258.anInt5032) {
				Static162.anInt3235 = -1;
				Static258.anInt5032 = -1;
				Static238.method7923();
			}
			Static115.method7801();
			if (!arg0) {
				Static518.method7525();
			}
			Static560.method7957();
			Static56.method1014(arg1, arg4, true, arg3, arg2);
			@Pc(118) int local118 = Static556.anInt9246;
			@Pc(120) int local120 = Static59.anInt1084;
			@Pc(122) int local122 = Static274.anInt5297;
			@Pc(124) int local124 = Static33.anInt503;
			Static562.anInt9327 = Static562.anInt9324;
			@Pc(139) int local139;
			@Pc(170) int local170;
			if (Static471.anInt8064 == 1) {
				local139 = (int) Static509.aFloat152;
				if (Static208.anInt3810 >> 8 > local139) {
					local139 = Static208.anInt3810 >> 8;
				}
				if (Static186.aBooleanArray12[4] && Static198.anIntArray409[4] + 128 > local139) {
					local139 = Static198.anIntArray409[4] + 128;
				}
				local170 = (int) Static170.aFloat71 + Static138.anInt2852 & 0x3FFF;
				Static234.method3999(Static454.anInt7698, local139, Static594.method8211(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158, Static65.anInt1298) - 200, (local139 >> 3) * 3 + 600 << 2, Static94.anInt1851, local170, local122);
			} else if (Static471.anInt8064 == 4) {
				local139 = (int) Static509.aFloat152;
				if (Static208.anInt3810 >> 8 > local139) {
					local139 = Static208.anInt3810 >> 8;
				}
				if (Static186.aBooleanArray12[4] && local139 < Static198.anIntArray409[4] + 128) {
					local139 = Static198.anIntArray409[4] + 128;
				}
				local170 = (int) Static170.aFloat71 & 0x3FFF;
				Static234.method3999(Static454.anInt7698, local139, Static594.method8211(Static49.anInt971, Static528.anInt8946, Static65.anInt1298) - 200, (local139 >> 3) * 3 + 600 << 2, Static94.anInt1851, local170, local122);
			} else if (Static471.anInt8064 == 5) {
				Static516.method7516(local122);
			}
			local139 = Static419.anInt7345;
			local170 = Static13.anInt232;
			@Pc(271) int local271 = Static522.anInt8849;
			@Pc(273) int local273 = Static253.anInt4961;
			@Pc(275) int local275 = Static35.anInt545;
			@Pc(319) int local319;
			for (@Pc(277) int local277 = 0; local277 < 5; local277++) {
				if (Static186.aBooleanArray12[local277]) {
					local319 = (int) ((double) -Static646.anIntArray258[local277] + Math.random() * (double) (Static646.anIntArray258[local277] * 2 + 1) + Math.sin((double) Static649.anIntArray680[local277] * ((double) Static279.anIntArray296[local277] / 100.0D)) * (double) Static198.anIntArray409[local277]);
					if (local277 == 3) {
						Static35.anInt545 = local319 + Static35.anInt545 & 0x3FFF;
					}
					if (local277 == 2) {
						Static522.anInt8849 += local319 << 2;
					}
					if (local277 == 0) {
						Static419.anInt7345 += local319 << 2;
					}
					if (local277 == 4) {
						Static253.anInt4961 += local319;
						if (Static253.anInt4961 < 1024) {
							Static253.anInt4961 = 1024;
						} else if (Static253.anInt4961 > 3072) {
							Static253.anInt4961 = 3072;
						}
					}
					if (local277 == 1) {
						Static13.anInt232 += local319 << 2;
					}
				}
			}
			if (Static419.anInt7345 < 0) {
				Static419.anInt7345 = 0;
			}
			if (Static522.anInt8849 < 0) {
				Static522.anInt8849 = 0;
			}
			if ((Static573.anInt6750 << 9) - 1 < Static419.anInt7345) {
				Static419.anInt7345 = (Static573.anInt6750 << 9) - 1;
			}
			if (Static522.anInt8849 > (Static547.anInt9143 << 9) - 1) {
				Static522.anInt8849 = (Static547.anInt9143 << 9) - 1;
			}
			Static268.method4479();
			Static248.method4182();
			Static266.aClass82_8.KA(local120, local124, local120 + local118, local122 + local124);
			Static220.method3852(true);
			if (Static80.aBoolean118) {
				Static134.method2348(Static159.anInt3199);
				if (Static109.anInt2201 != Static562.anInt9327) {
					Static334.aBoolean462 = true;
				}
				Static109.anInt2201 = Static562.anInt9327;
			} else {
				Static266.aClass82_8.ya();
				local319 = Static159.anInt3199;
				if (Static626.aClass137_1 == null) {
					Static266.aClass82_8.GA(local319);
				} else {
					Static626.aClass137_1.method3189(Static253.anInt4961, local120, local124, local118, local319, Static266.aClass82_8, local122, Static585.anInt9501 << 3, Static35.anInt545);
				}
			}
			Static234.method3998();
			Static570.aClass31_14.method7919(Static419.anInt7345, Static13.anInt232, Static522.anInt8849, -Static253.anInt4961 & 0x3FFF, -Static35.anInt545 & 0x3FFF, -Static330.anInt6250 & 0x3FFF);
			Static266.aClass82_8.method6160(Static570.aClass31_14);
			Static266.aClass82_8.DA(local118 / 2 + local120, local124 + local122 / 2, Static631.anInt10059 << 1, Static631.anInt10059 << 1);
			Static124.method2222(local124 + local122 / 2, local118 / 2 + local120, Static631.anInt10059 << 1, Static631.anInt10059 << 1);
			Static569.method8032(Static419.anInt7345, -Static35.anInt545 & 0x3FFF, Static522.anInt8849, -Static253.anInt4961 & 0x3FFF, -Static330.anInt6250 & 0x3FFF, Static13.anInt232);
			@Pc(579) byte local579 = Static32.aClass3_Sub41_3.aClass7_Sub8_2.method3974() == 2 ? (byte) Static609.anInt9804 : 1;
			if (Static80.aBoolean118) {
				Static253.method4225(-Static253.anInt4961 & 0x3FFF, -Static330.anInt6250 & 0x3FFF, -Static35.anInt545 & 0x3FFF);
				Static152.method2716(Static419.anInt7345, Static522.anInt8849, Static171.aByteArrayArrayArray10, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 + 1, Static134.anIntArray177, Static76.anIntArray107, Static313.anIntArray333, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 >> 9, Static562.anInt9327, Static91.anIntArray118, Static217.anIntArray244, local579, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 >> 9, Static32.aClass3_Sub41_3.aClass7_Sub16_1.method6022() == 0, Static304.anInt8391, Static13.anInt232);
			} else {
				Static152.method2715(Static304.anInt8391, Static419.anInt7345, Static13.anInt232, Static522.anInt8849, Static171.aByteArrayArrayArray10, Static134.anIntArray177, Static76.anIntArray107, Static91.anIntArray118, Static217.anIntArray244, Static313.anIntArray333, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 + 1, local579, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 >> 9, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 >> 9, Static32.aClass3_Sub41_3.aClass7_Sub16_1.method6022() == 0, Static40.aBoolean34 ? Static562.anInt9327 : -1, 0, false);
			}
			Static234.method3998();
			if (Static82.anInt1653 == 10) {
				Static499.method7253(local120, local122, local124, local118);
				Static638.method8581(local124, local122, local120, local118);
				Static178.method1503(local124, local120, local118, local122);
				Static21.method280(local118, local120, local124, local122);
			}
			Static456.method6760();
			Static253.anInt4961 = local273;
			Static35.anInt545 = local275;
			Static522.anInt8849 = local271;
			Static13.anInt232 = local170;
			Static419.anInt7345 = local139;
			if (Static146.aBoolean224 && Static186.aClass323_1.method7840() == 0) {
				Static146.aBoolean224 = false;
			}
			if (Static146.aBoolean224) {
				Static266.aClass82_8.method6134(local120, local122, local118, -16777216, local124);
				Static447.method6682(false, Static232.aClass63_6, Static369.aClass235_15.method5893(Static455.anInt7738), Static240.aClass93_4, Static266.aClass82_8);
			}
			Static220.method3852(false);
		} else {
			Static266.aClass82_8.method6134(arg3, arg1, arg4, -16777216, arg2);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZII)Z")
	public static boolean method8233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
