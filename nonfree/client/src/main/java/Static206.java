import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ga;Z[[[BIB)Z")
	public static boolean method4082(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static430.aBoolean179) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10303 >> Static151.anInt3896;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10310 >> Static151.anInt3896;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class3_Sub1_Sub3) {
			local10 = ((Class3_Sub1_Sub3) arg0).aShort121;
			local17 = ((Class3_Sub1_Sub3) arg0).aShort119;
			local8 = ((Class3_Sub1_Sub3) arg0).aShort118;
			local15 = ((Class3_Sub1_Sub3) arg0).aShort120;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte131 < Static462.anInt8470 && local38 >= Static235.anInt5129 && local38 < Static224.anInt4980 && local41 >= Static36.anInt791 && local41 < Static487.anInt9607) {
					if ((arg2 == null || arg0.aByte132 < arg3 || arg2[arg0.aByte132][local38][local41] != arg4) && arg0.method8602() && !arg0.method8606()) {
						return false;
					}
					if (!arg1 && local38 >= Static120.anInt3199 - 16 && local38 <= Static120.anInt3199 + 16 && local41 >= Static360.anInt7144 - 16 && local41 <= Static360.anInt7144 + 16) {
						if (Static218.aBoolean365) {
							Static78.aClass59Array1[Static389.anInt7491++].method2129(arg0);
							Static389.anInt7491 %= Static6.anInt117;
						} else {
							arg0.method8611(Static194.aClass20_5);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)I")
	public static int method4083(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;BII)V")
	public static void method4084(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class24 local8 = Static330.method5694(arg0, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray12 != null) {
			@Pc(18) Class2_Sub44 local18 = new Class2_Sub44();
			local18.aClass24_15 = local8;
			local18.aString96 = arg1;
			local18.anObjectArray32 = local8.anObjectArray12;
			local18.anInt9079 = arg2;
			Static284.method5153(local18);
		}
		if (Static529.anInt9623 != 10 || !Static76.method2235(local8).method9002(arg2 - 1)) {
			return;
		}
		@Pc(60) Class2_Sub52 local60;
		if (arg2 == 1) {
			local60 = Static130.method3019(Static224.aClass94_47, Static361.aClass183_1);
			Static179.method3751(arg3, arg0, local8.anInt501, local60);
			Static96.method2563(local60);
		}
		if (arg2 == 2) {
			local60 = Static130.method3019(Static479.aClass94_91, Static361.aClass183_1);
			Static179.method3751(arg3, arg0, local8.anInt501, local60);
			Static96.method2563(local60);
		}
		if (arg2 == 3) {
			local60 = Static130.method3019(Static135.aClass94_30, Static361.aClass183_1);
			Static179.method3751(arg3, arg0, local8.anInt501, local60);
			Static96.method2563(local60);
		}
		if (arg2 == 4) {
			local60 = Static130.method3019(Static363.aClass94_73, Static361.aClass183_1);
			Static179.method3751(arg3, arg0, local8.anInt501, local60);
			Static96.method2563(local60);
		}
		@Pc(160) Class2_Sub52 local160;
		if (arg2 == 5) {
			local160 = Static130.method3019(Static172.aClass94_36, Static361.aClass183_1);
			Static179.method3751(arg3, arg0, local8.anInt501, local160);
			Static96.method2563(local160);
		}
		if (arg2 == 6) {
			local160 = Static130.method3019(Static510.aClass94_96, Static361.aClass183_1);
			Static179.method3751(arg3, arg0, local8.anInt501, local160);
			Static96.method2563(local160);
		}
		if (arg2 == 7) {
			local160 = Static130.method3019(Static140.aClass94_33, Static361.aClass183_1);
			Static179.method3751(arg3, arg0, local8.anInt501, local160);
			Static96.method2563(local160);
		}
		if (arg2 == 8) {
			local160 = Static130.method3019(Static533.aClass94_99, Static361.aClass183_1);
			Static179.method3751(arg3, arg0, local8.anInt501, local160);
			Static96.method2563(local160);
		}
		if (arg2 == 9) {
			local160 = Static130.method3019(Static7.aClass94_2, Static361.aClass183_1);
			Static179.method3751(arg3, arg0, local8.anInt501, local160);
			Static96.method2563(local160);
		}
		if (arg2 == 10) {
			local160 = Static130.method3019(Static596.aClass94_104, Static361.aClass183_1);
			Static179.method3751(arg3, arg0, local8.anInt501, local160);
			Static96.method2563(local160);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)B")
	public static byte method4086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBI)Z")
	public static boolean method4087(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static338.method5846(arg1, arg0) & Static158.method3486(arg1, arg0);
	}
}
