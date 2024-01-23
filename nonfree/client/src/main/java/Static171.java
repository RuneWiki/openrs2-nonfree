import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
	public static int anInt3162;

	@OriginalMember(owner = "client!mn", name = "R", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!mn", name = "Y", descriptor = "[I")
	public static int[] anIntArray380 = new int[100];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!jj;IILclient!jh;)V")
	public static void method2595(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class84 arg2) {
		@Pc(9) Class1_Sub14 local9 = new Class1_Sub14();
		local9.anInt1897 = arg0.method3122();
		local9.anInt1902 = arg0.method3074();
		local9.aClass118Array2 = new Class118[local9.anInt1897];
		local9.aClass118Array1 = new Class118[local9.anInt1897];
		local9.aByteArrayArrayArray12 = new byte[local9.anInt1897][][];
		local9.anIntArray254 = new int[local9.anInt1897];
		local9.anIntArray255 = new int[local9.anInt1897];
		local9.anIntArray257 = new int[local9.anInt1897];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt1897; local51++) {
			try {
				@Pc(63) int local63 = arg0.method3122();
				@Pc(85) String local85;
				@Pc(89) String local89;
				@Pc(93) int local93;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local93 = 0;
					local85 = arg0.method3101();
					local89 = arg0.method3101();
					if (local63 == 1) {
						local93 = arg0.method3074();
					}
					local9.anIntArray257[local51] = local63;
					local9.anIntArray255[local51] = local93;
					local9.aClass118Array1[local51] = arg2.method1952(Static219.method3490(local85), local89);
				} else if (local63 == 3 || local63 == 4) {
					local85 = arg0.method3101();
					local89 = arg0.method3101();
					local93 = arg0.method3122();
					@Pc(96) String[] local96 = new String[local93];
					for (@Pc(98) int local98 = 0; local98 < local93; local98++) {
						local96[local98] = arg0.method3101();
					}
					@Pc(117) byte[][] local117 = new byte[local93][];
					@Pc(131) int local131;
					if (local63 == 3) {
						for (@Pc(124) int local124 = 0; local124 < local93; local124++) {
							local131 = arg0.method3074();
							local117[local124] = new byte[local131];
							arg0.method3095(local117[local124], local131);
						}
					}
					@Pc(152) Class[] local152 = new Class[local93];
					local9.anIntArray257[local51] = local63;
					for (local131 = 0; local131 < local93; local131++) {
						local152[local131] = Static219.method3490(local96[local131]);
					}
					local9.aClass118Array2[local51] = arg2.method1962(local152, Static219.method3490(local85), local89);
					local9.aByteArrayArrayArray12[local51] = local117;
				}
			} catch (@Pc(236) ClassNotFoundException local236) {
				local9.anIntArray254[local51] = -1;
			} catch (@Pc(243) SecurityException local243) {
				local9.anIntArray254[local51] = -2;
			} catch (@Pc(250) NullPointerException local250) {
				local9.anIntArray254[local51] = -3;
			} catch (@Pc(257) Exception local257) {
				local9.anIntArray254[local51] = -4;
			} catch (@Pc(264) Throwable local264) {
				local9.anIntArray254[local51] = -5;
			}
		}
		Static113.aClass69_11.method1628(local9);
	}

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "(I)V")
	public static void method2597() {
		Static30.anInt663 = 0;
		Static218.anInt1198 = -1;
		Static192.aBoolean414 = false;
		Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
		Static209.anInt4188 = 0;
		Static221.anInt4611 = -1;
		Static258.anInt5207 = -1;
		Static63.aClass1_Sub18_Sub1_1.anInt3911 = 0;
		Static129.anInt3910 = 0;
		Static297.anInt5891 = -1;
		Static43.anInt967 = 0;
		Static292.anInt5802 = 0;
		Static29.anInt626 = 0;
		@Pc(35) int local35;
		for (local35 = 0; local35 < Static77.aClass6_Sub6_Sub2Array1.length; local35++) {
			if (Static77.aClass6_Sub6_Sub2Array1[local35] != null) {
				Static77.aClass6_Sub6_Sub2Array1[local35].anInt4513 = -1;
			}
		}
		for (local35 = 0; local35 < Static211.aClass6_Sub6_Sub1Array2.length; local35++) {
			if (Static211.aClass6_Sub6_Sub1Array2[local35] != null) {
				Static211.aClass6_Sub6_Sub1Array2[local35].anInt4513 = -1;
			}
		}
		Static91.method1496();
		Static109.anInt2057 = 1;
		Static299.method4554(30);
		for (local35 = 0; local35 < 100; local35++) {
			Static267.aBooleanArray25[local35] = true;
		}
		Static104.method2545();
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)I")
	public static int method2598(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local10 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local10 += 8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local10 += 2;
		}
		if (arg0 >= 1) {
			local10++;
			arg0 >>>= 0x1;
		}
		return arg0 + local10;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(CI)C")
	public static char method2599(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method2600(@OriginalArg(0) String arg0) {
		@Pc(14) int local14 = Static12.method240(arg0);
		return local14 == -1 ? "" : Static115.method1775(" ", "<br>", Static166.aClass50_2.aStringArray6[local14]);
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
	public static void method2601() {
		Static228.aClass1_Sub2_Sub2Array12 = null;
		Static17.aClass1_Sub2_Sub2Array1 = null;
		Static155.aClass1_Sub2_Sub2Array8 = null;
		Static123.aClass48Array3 = null;
		Static121.aClass1_Sub2_Sub2Array6 = null;
		Static275.aClass1_Sub2_Sub12_Sub1_2 = null;
		Static216.aClass1_Sub2_Sub2Array11 = null;
		Static145.aClass1_Sub2_Sub2_6 = null;
		Static169.aClass1_Sub2_Sub12_3 = null;
		Static84.aClass1_Sub2_Sub12_2 = null;
		Static159.aClass1_Sub2_Sub2_Sub1Array2 = null;
		Static10.aClass1_Sub2_Sub12_1 = null;
		Static211.aClass48Array2 = null;
		Static284.aClass1_Sub2_Sub2_12 = null;
		Static51.aClass1_Sub2_Sub2Array2 = null;
		Static156.aClass1_Sub2_Sub2Array4 = null;
		Static105.aClass1_Sub2_Sub2Array5 = null;
		Static136.aClass1_Sub2_Sub2Array7 = null;
		Static244.aClass1_Sub2_Sub2Array13 = null;
	}

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "(I)V")
	public static void method2602() {
		Static180.aClass31_26.method850();
		Static274.aClass31_40.method850();
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(Z)V")
	public static void method2603() {
		@Pc(12) int local12 = Static275.anInt5486;
		@Pc(14) int local14 = Static210.anInt4223;
		@Pc(16) int local16 = Static112.anInt2084;
		@Pc(18) int local18 = Static229.anInt4793;
		if (Static240.aBoolean369) {
			Static50.method866(local12, local16, local14, local18, 6116423);
			Static50.method866(local12 + 1, local16 + 1, local14 - 2, 16, 0);
			Static50.method868(local12 + 1, local16 + 18, local14 - 2, local18 + -19, 0);
		} else {
			Static213.method3362(local12, local16, local14, local18, 6116423);
			Static213.method3362(local12 + 1, local16 + 1, local14 - 2, 16, 0);
			Static213.method3370(local12 + 1, local16 + 18, local14 - 2, local18 + -19, 0);
		}
		Static10.aClass1_Sub2_Sub12_1.method4394(Static167.aString104, local12 + 3, local16 - -14, 6116423, -1);
		@Pc(101) int local101 = Static224.anInt4700;
		@Pc(103) int local103 = Static293.anInt5833;
		for (@Pc(105) int local105 = 0; local105 < Static29.anInt626; local105++) {
			@Pc(125) int local125 = (Static29.anInt626 - local105 - 1) * 15 + local16 + 31;
			@Pc(127) int local127 = 16777215;
			if (local12 < local101 && local101 < local12 + local14 && local125 - 13 < local103 && local103 < local125 + 3) {
				local127 = 16776960;
			}
			Static10.aClass1_Sub2_Sub12_1.method4394(Static242.method3843(local105), local12 + 3, local125, local127, 0);
		}
		Static216.method3455(Static275.anInt5486, Static229.anInt4793, Static112.anInt2084, Static210.anInt4223);
	}
}
