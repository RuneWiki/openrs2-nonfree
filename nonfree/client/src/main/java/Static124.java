import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	public static int anInt600;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	public static int anInt596 = -1;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public static int anInt597 = 0;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString23 = "";

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!nm;Z)Lclient!le;")
	public static Class1_Sub5_Sub6_Sub1 method562(@OriginalArg(0) int arg0, @OriginalArg(2) Class119 arg1) {
		return Static114.method2083(arg0, arg1, 0) ? Static183.method3109() : null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)V")
	public static void method563(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static315.anInt5636 != -1) {
				Static43.method784(Static315.anInt5636);
			}
			for (@Pc(17) Class1_Sub20 local17 = (Class1_Sub20) Static224.aClass86_27.method2134(); local17 != null; local17 = (Class1_Sub20) Static224.aClass86_27.method2141()) {
				Static296.method720(true, local17);
			}
			Static315.anInt5636 = -1;
			Static224.aClass86_27 = new Class86(8);
			Static230.method3682();
			Static315.anInt5636 = Static276.anInt5071;
			Static270.method4170(false);
			Static141.method2485();
			Static215.method3496(Static315.anInt5636);
		}
		Static293.anInt5296 = -1;
		Static279.method4269(Static256.anInt4782);
		Static138.aClass11_Sub4_Sub1_3 = new Class11_Sub4_Sub1();
		Static138.aClass11_Sub4_Sub1_3.anInt3865 = 3000;
		Static138.aClass11_Sub4_Sub1_3.anInt3856 = 3000;
		if (!Static71.aBoolean165 && Static272.anInt5005 == 0) {
			Static263.method4066(Static45.aClass119_15);
			Static197.method3406(10);
			return;
		}
		if (Static228.anInt4270 == 2) {
			Static87.anInt1875 = Static108.anInt2261 << 7;
			Static273.anInt5035 = Static13.anInt277 << 7;
		} else {
			Static31.method535();
		}
		if (Static71.aBoolean165) {
			Static47.method893();
		}
		Static219.method3545();
		Static197.method3406(28);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIILclient!km;JLclient!km;Lclient!km;)V")
	public static void method564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class11 arg6, @OriginalArg(7) Class11 arg7) {
		@Pc(3) Class68 local3 = new Class68();
		local3.aClass11_8 = arg4;
		local3.anInt1909 = arg1 * 128 + 64;
		local3.anInt1912 = arg2 * 128 + 64;
		local3.anInt1908 = arg3;
		local3.aLong73 = arg5;
		local3.aClass11_6 = arg6;
		local3.aClass11_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub16 local42 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt2573; local46++) {
				@Pc(55) Class45 local55 = local42.aClass45Array2[local46];
				if ((local55.aLong56 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass11_5.method4297();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt1914 = -local34;
		if (Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2] = new Class1_Sub16(arg0, arg1, arg2);
		}
		Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2].aClass68_1 = local3;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method565() {
		@Pc(7) boolean local7 = true;
		Static173.method2973(false);
		Static82.anInt1811 = 0;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static120.aByteArrayArray8.length; local14++) {
			if (Static8.anIntArray20[local14] != -1 && Static120.aByteArrayArray8[local14] == null) {
				Static120.aByteArrayArray8[local14] = Static67.aClass119_20.method3235(0, Static8.anIntArray20[local14]);
				if (Static120.aByteArrayArray8[local14] == null) {
					local7 = false;
					Static82.anInt1811++;
				}
			}
			if (Static98.anIntArray146[local14] != -1 && Static186.aByteArrayArray13[local14] == null) {
				Static186.aByteArrayArray13[local14] = Static67.aClass119_20.method3237(Static98.anIntArray146[local14], 0, Static16.anIntArrayArray1[local14]);
				if (Static186.aByteArrayArray13[local14] == null) {
					Static82.anInt1811++;
					local7 = false;
				}
			}
			if (Static71.aBoolean165) {
				if (Static53.anIntArray91[local14] != -1 && Static295.aByteArrayArray21[local14] == null) {
					Static295.aByteArrayArray21[local14] = Static67.aClass119_20.method3235(0, Static53.anIntArray91[local14]);
					if (Static295.aByteArrayArray21[local14] == null) {
						local7 = false;
						Static82.anInt1811++;
					}
				}
				if (Static44.anIntArray78[local14] != -1 && Static172.aByteArrayArray11[local14] == null) {
					Static172.aByteArrayArray11[local14] = Static67.aClass119_20.method3235(0, Static44.anIntArray78[local14]);
					if (Static172.aByteArrayArray11[local14] == null) {
						local7 = false;
						Static82.anInt1811++;
					}
				}
			}
			if (Static246.anIntArray501 != null && Static110.aByteArrayArray7[local14] == null && Static246.anIntArray501[local14] != -1) {
				Static110.aByteArrayArray7[local14] = Static67.aClass119_20.method3237(Static246.anIntArray501[local14], 0, Static16.anIntArrayArray1[local14]);
				if (Static110.aByteArrayArray7[local14] == null) {
					Static82.anInt1811++;
					local7 = false;
				}
			}
		}
		if (Static69.aClass78_1 == null) {
			if (Static189.aClass1_Sub5_Sub14_1 == null || !Static74.aClass119_28.method3219(Static189.aClass1_Sub5_Sub14_1.aString120 + "_labels")) {
				Static69.aClass78_1 = new Class78(0);
			} else if (Static74.aClass119_28.method3248(Static189.aClass1_Sub5_Sub14_1.aString120 + "_labels")) {
				Static69.aClass78_1 = Static24.method476(Static189.aClass1_Sub5_Sub14_1.aString120 + "_labels", Static217.aBoolean369, Static74.aClass119_28);
			} else {
				Static82.anInt1811++;
				local7 = false;
			}
		}
		if (!local7) {
			Static58.anInt1248 = 1;
			return;
		}
		local7 = true;
		Static132.anInt2603 = 0;
		@Pc(293) int local293;
		@Pc(304) int local304;
		for (local14 = 0; local14 < Static120.aByteArrayArray8.length; local14++) {
			@Pc(278) byte[] local278 = Static186.aByteArrayArray13[local14];
			if (local278 != null) {
				local293 = (Static135.anIntArray209[local14] >> 8) * 64 - Static38.anInt714;
				local304 = (Static135.anIntArray209[local14] & 0xFF) * 64 - Static135.anInt2659;
				if (Static222.aBoolean378) {
					local293 = 10;
					local304 = 10;
				}
				local7 &= Static68.method1298(local293, local278, local304);
			}
			if (Static71.aBoolean165) {
				local278 = Static172.aByteArrayArray11[local14];
				if (local278 != null) {
					local304 = (Static135.anIntArray209[local14] & 0xFF) * 64 - Static135.anInt2659;
					local293 = (Static135.anIntArray209[local14] >> 8) * 64 - Static38.anInt714;
					if (Static222.aBoolean378) {
						local293 = 10;
						local304 = 10;
					}
					local7 &= Static68.method1298(local293, local278, local304);
				}
			}
		}
		if (!local7) {
			Static58.anInt1248 = 2;
			return;
		}
		if (Static58.anInt1248 != 0) {
			Static288.method4341(true, Static270.aString192 + "<br>(100%)");
		}
		Static246.method3875();
		Static76.method3988();
		@Pc(396) boolean local396 = false;
		@Pc(402) int local402;
		if (Static71.aBoolean165 && Static43.aBoolean88) {
			for (local402 = 0; local402 < Static120.aByteArrayArray8.length; local402++) {
				if (Static172.aByteArrayArray11[local402] != null || Static295.aByteArrayArray21[local402] != null) {
					local396 = true;
					break;
				}
			}
		}
		Static98.method1903(Static71.aBoolean165 ? 28 : 25, local396);
		for (local402 = 0; local402 < 4; local402++) {
			Static122.aClass60Array1[local402].method1700();
		}
		for (local402 = 0; local402 < 4; local402++) {
			for (local293 = 0; local293 < 104; local293++) {
				for (local304 = 0; local304 < 104; local304++) {
					Static17.aByteArrayArrayArray1[local402][local293][local304] = 0;
				}
			}
		}
		Static66.method1154(false);
		if (Static71.aBoolean165) {
			Static15.aClass57_Sub1_6.method1655();
			for (local402 = 0; local402 < 13; local402++) {
				for (local293 = 0; local293 < 13; local293++) {
					Static15.aClass35ArrayArray1[local402][local293].aBoolean106 = true;
				}
			}
		}
		if (Static71.aBoolean165) {
			Static151.method2632();
		}
		if (Static71.aBoolean165) {
			Static299.method4476();
		}
		Static246.method3875();
		System.gc();
		Static173.method2973(true);
		Static68.method1297(false);
		if (!Static222.aBoolean378) {
			Static24.method474(false);
			Static173.method2973(true);
			if (Static71.aBoolean165) {
				local293 = Static138.aClass11_Sub4_Sub1_3.anIntArray406[0] >> 3;
				local402 = Static138.aClass11_Sub4_Sub1_3.anIntArray407[0] >> 3;
				Static104.method1987(local402, local293);
			}
			Static3.method67(false);
			if (Static110.aByteArrayArray7 != null) {
				Static231.method3715();
			}
		}
		if (Static222.aBoolean378) {
			Static137.method2364(false);
			Static173.method2973(true);
			if (Static71.aBoolean165) {
				local402 = Static138.aClass11_Sub4_Sub1_3.anIntArray407[0] >> 3;
				local293 = Static138.aClass11_Sub4_Sub1_3.anIntArray406[0] >> 3;
				Static104.method1987(local402, local293);
			}
			Static10.method4571(false);
		}
		Static76.method3988();
		Static173.method2973(true);
		Static149.method750(Static122.aClass60Array1, Static222.aBoolean378 ? Static291.anIntArrayArrayArray14 : (int[][][]) null, false);
		if (Static71.aBoolean165) {
			Static151.method2641();
		}
		Static173.method2973(true);
		local402 = Static187.anInt3579;
		if (Static132.anInt2608 < local402) {
			local402 = Static132.anInt2608;
		}
		if (local402 >= Static132.anInt2608 - 1) {
		}
		if (Static115.method2108()) {
			Static158.method3199(0);
		} else {
			Static158.method3199(Static187.anInt3579);
		}
		Static53.method981();
		if (Static71.aBoolean165 && local396) {
			Static47.method896(true);
			Static68.method1297(true);
			if (!Static222.aBoolean378) {
				Static24.method474(true);
				Static173.method2973(true);
				Static3.method67(true);
			}
			if (Static222.aBoolean378) {
				Static137.method2364(true);
				Static173.method2973(true);
				Static10.method4571(true);
			}
			Static76.method3988();
			Static173.method2973(true);
			Static149.method750(Static122.aClass60Array1, Static222.aBoolean378 ? Static291.anIntArrayArrayArray14 : (int[][][]) null, true);
			Static173.method2973(true);
			Static53.method981();
			Static47.method896(false);
		}
		if (Static71.aBoolean165) {
			for (local293 = 0; local293 < 13; local293++) {
				for (local304 = 0; local304 < 13; local304++) {
					Static15.aClass35ArrayArray1[local293][local304].method922(Static280.anIntArrayArrayArray13[0], local293 * 8, local304 * 8);
				}
			}
		}
		for (local293 = 0; local293 < 104; local293++) {
			for (local304 = 0; local304 < 104; local304++) {
				Static17.method274(local293, local304);
			}
		}
		Static28.method513();
		Static246.method3875();
		Static105.method1991();
		Static76.method3988();
		Static42.aBoolean86 = false;
		if (Static71.aBoolean165) {
			Static297.method4447(true);
		}
		if (Static311.aFrame2 != null && Static97.aClass49_2 != null && Static97.anInt2087 == 25) {
			Static116.aClass1_Sub13_Sub1_48.method1887(240);
			Static116.aClass1_Sub13_Sub1_48.method1851(1057001181);
		}
		if (!Static222.aBoolean378) {
			@Pc(822) int local822 = (Static130.anInt2581 + 6) / 8;
			local304 = (Static130.anInt2581 - 6) / 8;
			@Pc(834) int local834 = (Static133.anInt2638 - 6) / 8;
			@Pc(840) int local840 = (Static133.anInt2638 + 6) / 8;
			for (@Pc(844) int local844 = local304 - 1; local844 <= local822 + 1; local844++) {
				for (@Pc(857) int local857 = local834 - 1; local857 <= local840 + 1; local857++) {
					if (local304 > local844 || local822 < local844 || local834 > local857 || local857 > local840) {
						Static67.aClass119_20.method3224("m" + local844 + "_" + local857);
						Static67.aClass119_20.method3224("l" + local844 + "_" + local857);
					}
				}
			}
		}
		if (Static97.anInt2087 == 28) {
			Static197.method3406(10);
		} else {
			Static197.method3406(30);
			if (Static97.aClass49_2 != null) {
				Static116.aClass1_Sub13_Sub1_48.method1887(103);
			}
		}
		Static134.method2334();
		Static246.method3875();
		Static165.method4610();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}
}
