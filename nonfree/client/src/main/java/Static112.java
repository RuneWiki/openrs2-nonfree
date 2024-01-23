import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	public static int anInt2572;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "[I")
	public static int[] anIntArray231;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public static int anInt2575;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public static void method2053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class1_Sub26 local30 = Static74.aClass1_Sub26ArrayArrayArray1[local9][arg0][arg1] = Static74.aClass1_Sub26ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt4097--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt4090; local40++) {
					@Pc(49) Class25 local49 = local30.aClass25Array4[local40];
					if ((local49.aLong39 >> 29 & 0x3L) == 2L && local49.anInt1003 == arg0 && local49.anInt1000 == arg1) {
						local49.anInt1007--;
					}
				}
			}
		}
		if (Static74.aClass1_Sub26ArrayArrayArray1[0][arg0][arg1] == null) {
			Static74.aClass1_Sub26ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub26(0, arg0, arg1);
		}
		Static74.aClass1_Sub26ArrayArrayArray1[0][arg0][arg1].aClass1_Sub26_1 = local7;
		Static74.aClass1_Sub26ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method2056(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public static void method2059(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static192.anInt3954 < 100) {
			Static238.method3082();
		}
		if (Static277.aBoolean412) {
			Static41.method847(arg0, arg2, arg3 + arg0, arg1 + arg2);
		} else {
			Static50.method950(arg0, arg2, arg0 + arg3, arg2 - -arg1);
		}
		@Pc(47) int local47;
		@Pc(58) int local58;
		if (Static192.anInt3954 < 100) {
			local47 = arg0 + arg3 / 2;
			local58 = arg1 / 2 + arg2 - 20 - 18;
			if (Static277.aBoolean412) {
				Static41.method832(arg0, arg2, arg3, arg1, 0);
				Static41.method844(local47 - 152, local58, 304, 34, 9179409);
				Static41.method844(local47 - 151, local58 - -1, 302, 32, 0);
				Static41.method832(local47 - 150, local58 + 2, Static192.anInt3954 * 3, 30, 9179409);
				Static41.method832(Static192.anInt3954 * 3 + local47 - 150, local58 - -2, 300 - Static192.anInt3954 * 3, 30, 0);
			} else {
				Static50.method954(arg0, arg2, arg3, arg1, 0);
				Static50.method946(local47 - 152, local58, 304, 34, 9179409);
				Static50.method946(local47 - 151, local58 + 1, 302, 32, 0);
				Static50.method954(local47 - 150, local58 + 2, Static192.anInt3954 * 3, 30, 9179409);
				Static50.method954(local47 + Static192.anInt3954 * 3 - 150, local58 + 2, 300 - Static192.anInt3954 * 3, 30, 0);
			}
			Static134.aClass1_Sub2_Sub1_3.method456(Static273.aString309, local47, local58 + 20, 16777215, -1);
			return;
		}
		@Pc(189) int local189 = Static88.anInt1962 - (int) ((float) arg3 / Static13.aFloat3);
		Static154.anInt3333 = Static88.anInt1962 - (int) ((float) arg3 / Static13.aFloat3);
		Static149.anInt3224 = Static207.anInt4867 - (int) ((float) arg1 / Static13.aFloat3);
		local47 = Static207.anInt4867 - (int) ((float) arg1 / Static13.aFloat3);
		Static193.anInt3981 = (int) ((float) (arg1 * 2) / Static13.aFloat3);
		local58 = Static88.anInt1962 + (int) ((float) arg3 / Static13.aFloat3);
		Static142.anInt3046 = (int) ((float) (arg3 * 2) / Static13.aFloat3);
		@Pc(247) int local247 = (int) ((float) arg1 / Static13.aFloat3) + Static207.anInt4867;
		if (Static277.aBoolean412) {
			if (Static246.aClass1_Sub2_Sub11_Sub2_4 == null || Static246.aClass1_Sub2_Sub11_Sub2_4.anInt4874 != arg3 || Static246.aClass1_Sub2_Sub11_Sub2_4.anInt4869 != arg1) {
				Static246.aClass1_Sub2_Sub11_Sub2_4 = null;
				Static246.aClass1_Sub2_Sub11_Sub2_4 = new Class1_Sub2_Sub11_Sub2(arg3, arg1);
			}
			Static50.method958(Static246.aClass1_Sub2_Sub11_Sub2_4.anIntArray426, arg3, arg1);
			Static129.method2209(local247, arg1, local58, local47, 0, 0, local189, arg3);
			Static40.method830(local47, Static189.aBoolean296, local247, 0, local58, arg1, 0, arg3, local189);
			Static85.method1484(0, arg3, local189, 0, local58, local47, arg1, local247);
			Static246.aClass1_Sub2_Sub11_Sub2_4.method3799();
			Static41.method838(Static246.aClass1_Sub2_Sub11_Sub2_4.anIntArray426, arg0, arg2, arg3, arg1);
			Static50.anIntArray107 = null;
		} else {
			Static129.method2209(local247, arg1 + arg2, local58, local47, arg0, arg2, local189, arg3 + arg0);
			Static40.method830(local47, Static189.aBoolean296, local247, arg0, local58, arg2 + arg1, arg2, arg0 + arg3, local189);
			Static85.method1484(arg0, arg0 + arg3, local189, arg2, local58, local47, arg2 + arg1, local247);
		}
		if (Static240.anInt4766 > 0) {
			Static296.anInt5584--;
			if (Static296.anInt5584 == 0) {
				Static240.anInt4766--;
				Static296.anInt5584 = 20;
			}
		}
		if (!Static85.aBoolean135) {
			return;
		}
		@Pc(395) int local395 = arg1 + arg2 - 8;
		@Pc(401) int local401 = arg0 + arg3 - 5;
		@Pc(403) int local403 = 16776960;
		Static88.aClass1_Sub2_Sub1_2.method445("Fps:" + Static67.anInt1416, local401, local395, 16776960, -1);
		@Pc(418) int local418 = local395 - 15;
		@Pc(420) Runtime local420 = Runtime.getRuntime();
		@Pc(430) int local430 = (int) ((local420.totalMemory() - local420.freeMemory()) / 1024L);
		if (local430 > 65536) {
			local403 = 16711680;
		}
		Static88.aClass1_Sub2_Sub1_2.method445("Mem:" + local430 + "k", local401, local418, local403, -1);
		local395 = local418 - 15;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(BI)Lclient!fb;")
	public static Class42 method2060(@OriginalArg(1) int arg0) {
		@Pc(10) Class42 local10 = (Class42) Static263.aClass135_37.method3316((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static164.aClass91_130.method2495(Static66.method1197(arg0), Static116.method4438(arg0));
		local10 = new Class42();
		local10.anInt1497 = arg0;
		if (local24 != null) {
			local10.method1250(new Class1_Sub11(local24));
		}
		local10.method1251();
		if (local10.anInt1460 != -1) {
			local10.method1262(method2060(local10.anInt1460), method2060(local10.anInt1469));
		}
		if (local10.anInt1465 != -1) {
			local10.method1259(method2060(local10.anInt1514), method2060(local10.anInt1465));
		}
		if (!Static239.aBoolean363 && local10.aBoolean107) {
			local10.aStringArray19 = Static54.aStringArray18;
			local10.aStringArray20 = Static171.aStringArray45;
			local10.aBoolean106 = false;
			local10.aString87 = Static100.aString135;
			local10.anInt1483 = 0;
		}
		Static263.aClass135_37.method3321((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)I")
	public static int method2061(@OriginalArg(0) int arg0) {
		@Pc(13) Class119 local13 = Static14.method289(arg0);
		@Pc(16) int local16 = local13.anInt3899;
		@Pc(19) int local19 = local13.anInt3891;
		@Pc(22) int local22 = local13.anInt3893;
		@Pc(29) int local29 = Class114.anIntArray338[local16 - local22];
		return local29 & Static128.anIntArray259[local19] >> local22;
	}
}
