import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public static int anInt5797 = 0;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	public static int anInt5799 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJIB)V")
	public static void method4921(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (int) arg1 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static430.method5446(arg2, local22, 0, 0, arg0, 0, local15, true);
			return;
		}
		@Pc(47) Class36 local47 = Static308.aClass96_4.method2274(local29);
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (local22 == 0 || local22 == 2) {
			local57 = local47.anInt947;
			local60 = local47.anInt975;
		} else {
			local60 = local47.anInt947;
			local57 = local47.anInt975;
		}
		@Pc(71) int local71 = local47.anInt949;
		if (local22 != 0) {
			local71 = (local71 << local22 & 0xF) + (local71 >> 4 - local22);
		}
		Static430.method5446(arg2, 0, local71, local57, arg0, local60, 0, true);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)V")
	public static void method4922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static118.aFloat11 > Static118.aFloat10) {
			Static118.aFloat10 = (float) ((double) Static118.aFloat10 + (double) Static118.aFloat10 / 30.0D);
			if (Static118.aFloat10 > Static118.aFloat11) {
				Static118.aFloat10 = Static118.aFloat11;
			}
			Static64.method1152();
			Static118.anInt810 = (int) Static118.aFloat10 >> 1;
			Static118.aByteArrayArrayArray2 = Static325.method5035(Static118.anInt810);
		} else if (Static118.aFloat10 > Static118.aFloat11) {
			Static118.aFloat10 = (float) ((double) Static118.aFloat10 - (double) Static118.aFloat10 / 30.0D);
			if (Static118.aFloat10 < Static118.aFloat11) {
				Static118.aFloat10 = Static118.aFloat11;
			}
			Static64.method1152();
			Static118.anInt810 = (int) Static118.aFloat10 >> 1;
			Static118.aByteArrayArrayArray2 = Static325.method5035(Static118.anInt810);
		}
		if (Static351.anInt6257 != -1 && Static340.anInt6093 != -1) {
			@Pc(78) int local78 = Static351.anInt6257 - Static103.anInt2070;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(95) int local95 = Static340.anInt6093 - Static214.anInt2191;
			Static103.anInt2070 += local78;
			if (local95 < 2 || local95 > 2) {
				local95 /= 8;
			}
			Static214.anInt2191 += local95;
			if (local78 == 0 && local95 == 0) {
				Static351.anInt6257 = -1;
				Static340.anInt6093 = -1;
			}
			Static64.method1152();
		}
		if (Static546.anInt2811 <= 0) {
			Static299.anInt5548 = -1;
			Static361.anInt6368 = -1;
		} else {
			Static99.anInt1989--;
			if (Static99.anInt1989 == 0) {
				Static546.anInt2811--;
				Static99.anInt1989 = 100;
			}
		}
		if (!Static533.aBoolean629 || Static442.aClass37_83 == null) {
			return;
		}
		for (@Pc(165) Class1_Sub43 local165 = (Class1_Sub43) Static442.aClass37_83.method977(); local165 != null; local165 = (Class1_Sub43) Static442.aClass37_83.method971()) {
			@Pc(174) Class30 local174 = Static118.aClass272_2.method6380(local165.aClass1_Sub39_1.anInt7253);
			if (local165.method6564(arg1, arg0)) {
				if (local174.aStringArray3 != null) {
					if (local174.aStringArray3[4] != null) {
						Static13.method390((long) local165.aClass1_Sub39_1.anInt7253, 0, local174.aString4, local174.anInt871, 1002, local174.aStringArray3[4], -1, true, false, -1);
					}
					if (local174.aStringArray3[3] != null) {
						Static13.method390((long) local165.aClass1_Sub39_1.anInt7253, 0, local174.aString4, local174.anInt871, 1008, local174.aStringArray3[3], -1, true, false, -1);
					}
					if (local174.aStringArray3[2] != null) {
						Static13.method390((long) local165.aClass1_Sub39_1.anInt7253, 0, local174.aString4, local174.anInt871, 1003, local174.aStringArray3[2], -1, true, false, -1);
					}
					if (local174.aStringArray3[1] != null) {
						Static13.method390((long) local165.aClass1_Sub39_1.anInt7253, 0, local174.aString4, local174.anInt871, 1001, local174.aStringArray3[1], -1, true, false, -1);
					}
					if (local174.aStringArray3[0] != null) {
						Static13.method390((long) local165.aClass1_Sub39_1.anInt7253, 0, local174.aString4, local174.anInt871, 1010, local174.aStringArray3[0], -1, true, false, -1);
					}
				}
				if (!local165.aClass1_Sub39_1.aBoolean521) {
					local165.aClass1_Sub39_1.aBoolean521 = true;
					Static180.method2674(Static167.aClass64_5, local165.aClass1_Sub39_1.anInt7253, local174.anInt871);
				}
				if (local165.aClass1_Sub39_1.aBoolean521) {
					Static180.method2674(Static518.aClass64_10, local165.aClass1_Sub39_1.anInt7253, local174.anInt871);
				}
			} else if (local165.aClass1_Sub39_1.aBoolean521) {
				local165.aClass1_Sub39_1.aBoolean521 = false;
				Static180.method2674(Static515.aClass64_8, local165.aClass1_Sub39_1.anInt7253, local174.anInt871);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method4923() {
		if (Static513.aClass122_10 == null) {
			return;
		}
		Static153.aClass299_3.method7028();
		Static227.method3905();
		Static359.method5344();
		Static68.method1246();
		Static205.method3536();
		Static125.method2135();
		if (Static40.aClass117_1 != null) {
			Static40.aClass117_1.method2618();
		}
		Static152.method2409();
		Static194.method2970();
		Static286.method4634();
		Static306.method4837(false);
		Static270.method4435();
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			@Pc(51) Class49_Sub2_Sub2_Sub1 local51 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local45];
			if (local51 != null) {
				local51.aClass1_Sub50_3 = null;
				for (@Pc(58) int local58 = 0; local58 < local51.aClass145Array3.length; local58++) {
					local51.aClass145Array3[local58] = null;
				}
			}
		}
		for (@Pc(83) int local83 = 0; local83 < Static350.anInt6254; local83++) {
			@Pc(90) Class49_Sub2_Sub2_Sub2 local90 = Static177.aClass1_Sub17Array3[local83].aClass49_Sub2_Sub2_Sub2_2;
			if (local90 != null) {
				for (@Pc(94) int local94 = 0; local94 < local90.aClass145Array3.length; local94++) {
					local90.aClass145Array3[local94] = null;
				}
			}
		}
		Static37.aClass118_3 = null;
		Static158.aClass118_6 = null;
		Static513.aClass122_10.method7224();
		Static513.aClass122_10 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4924(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static144.method2331(Static292.aClass296_378);
		Static455.aClass1_Sub6_Sub2_2.method3937(Static282.method6464(arg1) + 1);
		Static455.aClass1_Sub6_Sub2_2.method3957(arg0);
		Static455.aClass1_Sub6_Sub2_2.method3917(arg1);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
	public static void method4926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(23) int local23 = Static400.method6041(arg0 + arg2, Static216.anInt4203, Static358.anInt8908);
		@Pc(31) int local31 = Static400.method6041(arg0 - arg2, Static216.anInt4203, Static358.anInt8908);
		Static424.method6216(local23, arg3, local31, Static447.anIntArrayArray99[arg1]);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(62) int local62;
			@Pc(66) int local66;
			@Pc(84) int local84;
			@Pc(93) int local93;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local62 = arg1 - local9;
				local66 = local9 + arg1;
				if (local66 >= Static99.anInt1988 && local62 <= Static205.anInt4042) {
					local84 = Static400.method6041(arg0 + local7, Static216.anInt4203, Static358.anInt8908);
					local93 = Static400.method6041(arg0 - local7, Static216.anInt4203, Static358.anInt8908);
					if (local66 <= Static205.anInt4042) {
						Static424.method6216(local84, arg3, local93, Static447.anIntArrayArray99[local66]);
					}
					if (local62 >= Static99.anInt1988) {
						Static424.method6216(local84, arg3, local93, Static447.anIntArrayArray99[local62]);
					}
				}
			}
			local7++;
			local62 = arg1 - local7;
			local66 = arg1 + local7;
			if (local66 >= Static99.anInt1988 && Static205.anInt4042 >= local62) {
				local84 = Static400.method6041(arg0 + local9, Static216.anInt4203, Static358.anInt8908);
				local93 = Static400.method6041(arg0 - local9, Static216.anInt4203, Static358.anInt8908);
				if (local66 <= Static205.anInt4042) {
					Static424.method6216(local84, arg3, local93, Static447.anIntArrayArray99[local66]);
				}
				if (Static99.anInt1988 <= local62) {
					Static424.method6216(local84, arg3, local93, Static447.anIntArrayArray99[local62]);
				}
			}
		}
	}
}
