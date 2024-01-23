import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
	public static int anInt5944;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
	public static int anInt5939 = 0;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
	public static int anInt5948 = 0;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I")
	public static int method4563(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!ic;IIIII)V")
	public static void method4565(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = 0L;
		if (arg0 == 0) {
			local7 = Static270.method4100(arg4, arg5, arg3);
		} else if (arg0 == 1) {
			local7 = Static272.method4131(arg4, arg5, arg3);
		} else if (arg0 == 2) {
			local7 = Static228.method3616(arg4, arg5, arg3);
		} else if (arg0 == 3) {
			local7 = Static163.method2577(arg4, arg5, arg3);
		}
		@Pc(57) int local57 = (int) local7 >> 14 & 0x1F;
		@Pc(66) int local66 = (int) local7 >> 20 & 0x3;
		@Pc(82) int local82 = (int) (local7 >>> 32) & Integer.MAX_VALUE;
		@Pc(86) Class92 local86 = Static166.method2725(local82);
		if (local86.method2327()) {
			Static88.method1535(local86, arg5, arg4, arg3);
		}
		if (local7 == 0L) {
			return;
		}
		@Pc(103) Class2 local103 = null;
		@Pc(105) Class2 local105 = null;
		if (arg0 == 0) {
			@Pc(225) Class136 local225 = Static9.method300(arg4, arg5, arg3);
			if (local225 != null) {
				local105 = local225.aClass2_9;
				local103 = local225.aClass2_10;
			}
			if (local86.anInt3202 != 0) {
				arg1.method1820(local86.aBoolean210, arg3, local57, local66, arg5, !local86.aBoolean202);
			}
		} else if (arg0 == 1) {
			@Pc(118) Class106 local118 = Static252.method3857(arg4, arg5, arg3);
			if (local118 != null) {
				local105 = local118.aClass2_6;
				local103 = local118.aClass2_5;
			}
		} else if (arg0 == 2) {
			@Pc(165) Class7 local165 = Static281.method2096(arg4, arg5, arg3);
			if (local165 != null) {
				local103 = local165.aClass2_1;
			}
			if (local86.anInt3202 != 0 && local86.anInt3227 + arg5 < 104 && local86.anInt3227 + arg3 < 104 && arg5 + local86.anInt3182 < 104 && local86.anInt3182 + arg3 < 104) {
				arg1.method1816(!local86.aBoolean202, local86.aBoolean210, local86.anInt3227, local86.anInt3182, arg3, local66, arg5);
			}
		} else if (arg0 == 3) {
			@Pc(143) Class119 local143 = Static28.method613(arg4, arg5, arg3);
			if (local143 != null) {
				local103 = local143.aClass2_7;
			}
			if (local86.anInt3202 == 1) {
				arg1.method1822(arg5, arg3);
			}
		}
		if (local86.anIntArray300 != null) {
			local86 = local86.method2323();
		}
		if (!Static294.aBoolean367 || local86 == null || !local86.aBoolean204) {
			return;
		}
		if (local57 == 2) {
			if (local103 instanceof Class2_Sub5) {
				((Class2_Sub5) local103).method2524();
			} else {
				Static295.method4529(local86, arg3, 0, arg5, local57, arg2, local66 + 4, 0);
			}
			if (local105 instanceof Class2_Sub5) {
				((Class2_Sub5) local105).method2524();
			} else {
				Static295.method4529(local86, arg3, 0, arg5, local57, arg2, local66 + 1 & 0x3, 0);
			}
		} else if (local57 == 5) {
			if (local103 instanceof Class2_Sub5) {
				((Class2_Sub5) local103).method2524();
			} else {
				Static295.method4529(local86, arg3, Static79.anIntArray191[local66] * 8, arg5, 4, arg2, local66, Static161.anIntArray322[local66] * 8);
			}
		} else if (local57 == 6) {
			if (local103 instanceof Class2_Sub5) {
				((Class2_Sub5) local103).method2524();
			} else {
				Static295.method4529(local86, arg3, Static146.anIntArray394[local66] * 8, arg5, 4, arg2, local66 + 4, Static111.anIntArray257[local66] * 8);
			}
		} else if (local57 == 7) {
			if (local103 instanceof Class2_Sub5) {
				((Class2_Sub5) local103).method2524();
			} else {
				Static295.method4529(local86, arg3, 0, arg5, 4, arg2, (local66 + 2 & 0x3) + 4, 0);
			}
		} else if (local57 == 8) {
			if (local103 instanceof Class2_Sub5) {
				((Class2_Sub5) local103).method2524();
			} else {
				Static295.method4529(local86, arg3, Static146.anIntArray394[local66] * 8, arg5, 4, arg2, local66 + 4, Static111.anIntArray257[local66] * 8);
			}
			if (local105 instanceof Class2_Sub5) {
				((Class2_Sub5) local105).method2524();
			} else {
				Static295.method4529(local86, arg3, Static146.anIntArray394[local66] * 8, arg5, 4, arg2, (local66 + 2 & 0x3) + 4, Static111.anIntArray257[local66] * 8);
			}
		} else if (local57 == 11) {
			if (local103 instanceof Class2_Sub5) {
				((Class2_Sub5) local103).method2524();
			} else {
				Static295.method4529(local86, arg3, 0, arg5, 10, arg2, local66 + 4, 0);
			}
		} else if (local103 instanceof Class2_Sub5) {
			((Class2_Sub5) local103).method2524();
		} else {
			Static295.method4529(local86, arg3, 0, arg5, local57, arg2, local66, 0);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/lang/String;BII)V")
	public static void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class191 local12 = Static205.method3267(arg3, arg2);
		if (local12 == null) {
			return;
		}
		if (local12.anObjectArray23 != null) {
			@Pc(23) Class1_Sub27 local23 = new Class1_Sub27();
			local23.anObjectArray1 = local12.anObjectArray23;
			local23.anInt5235 = arg0;
			local23.aString371 = arg1;
			local23.aClass191_14 = local12;
			Static140.method2329(local23);
		}
		@Pc(41) boolean local41 = true;
		if (local12.anInt6115 > 0) {
			local41 = Static209.method3349(local12);
		}
		if (!local41 || !Static35.method737(local12).method4554(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static2.aClass1_Sub14_Sub1_1.method2252(55);
			Static2.aClass1_Sub14_Sub1_1.method2236(arg2);
			Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		}
		if (arg0 == 2) {
			Static2.aClass1_Sub14_Sub1_1.method2252(186);
			Static2.aClass1_Sub14_Sub1_1.method2236(arg2);
			Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		}
		if (arg0 == 3) {
			Static2.aClass1_Sub14_Sub1_1.method2252(38);
			Static2.aClass1_Sub14_Sub1_1.method2236(arg2);
			Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		}
		if (arg0 == 4) {
			Static2.aClass1_Sub14_Sub1_1.method2252(86);
			Static2.aClass1_Sub14_Sub1_1.method2236(arg2);
			Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		}
		if (arg0 == 5) {
			Static2.aClass1_Sub14_Sub1_1.method2252(91);
			Static2.aClass1_Sub14_Sub1_1.method2236(arg2);
			Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		}
		if (arg0 == 6) {
			Static2.aClass1_Sub14_Sub1_1.method2252(225);
			Static2.aClass1_Sub14_Sub1_1.method2236(arg2);
			Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		}
		if (arg0 == 7) {
			Static2.aClass1_Sub14_Sub1_1.method2252(49);
			Static2.aClass1_Sub14_Sub1_1.method2236(arg2);
			Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		}
		if (arg0 == 8) {
			Static2.aClass1_Sub14_Sub1_1.method2252(96);
			Static2.aClass1_Sub14_Sub1_1.method2236(arg2);
			Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		}
		if (arg0 == 9) {
			Static2.aClass1_Sub14_Sub1_1.method2252(0);
			Static2.aClass1_Sub14_Sub1_1.method2236(arg2);
			Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		}
		if (arg0 == 10) {
			Static2.aClass1_Sub14_Sub1_1.method2252(10);
			Static2.aClass1_Sub14_Sub1_1.method2236(arg2);
			Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		}
	}
}
