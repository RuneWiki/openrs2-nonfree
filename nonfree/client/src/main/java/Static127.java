import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Lclient!cg;")
	public static Class22 aClass22_41;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "Lclient!cg;")
	public static Class22 aClass22_42;

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!jf", name = "H", descriptor = "Lclient!cg;")
	public static Class22 aClass22_43;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "Z")
	public static boolean aBoolean163 = true;

	@OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
	public static int anInt2549 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZIIIIB)V")
	public static void method2070(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (Static251.aBoolean330) {
			@Pc(32) int local32 = arg3 - 334;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 100) {
				local32 = 100;
			}
			@Pc(60) int local60 = (Static240.aShort23 - Static114.aShort17) * local32 / 100 + Static114.aShort17;
			if (local60 < Static276.aShort45) {
				local60 = Static276.aShort45;
			} else if (local60 > Static60.aShort11) {
				local60 = Static60.aShort11;
			}
			@Pc(82) int local82 = arg3 * 512 * local60 / (arg1 * 334);
			@Pc(120) int local120;
			@Pc(126) int local126;
			@Pc(95) short local95;
			if (local82 < Static101.aShort14) {
				local95 = Static101.aShort14;
				local60 = local95 * 334 * arg1 / (arg3 * 512);
				if (local60 > Static60.aShort11) {
					local60 = Static60.aShort11;
					local120 = arg3 * local60 * 512 / (local95 * 334);
					local126 = (arg1 - local120) / 2;
					if (arg0) {
						Static87.method1462();
						Static87.method1464(arg2, arg4, local126, arg3, 0);
						Static87.method1464(arg2 + arg1 - local126, arg4, local126, arg3, 0);
					}
					arg1 -= local126 * 2;
					arg2 += local126;
				}
			} else if (Static145.aShort46 < local82) {
				local95 = Static145.aShort46;
				local60 = arg1 * 334 * local95 / (arg3 * 512);
				if (Static276.aShort45 > local60) {
					local60 = Static276.aShort45;
					local120 = arg1 * local95 * 334 / (local60 * 512);
					local126 = (arg3 - local120) / 2;
					if (arg0) {
						Static87.method1462();
						Static87.method1464(arg2, arg4, arg1, local126, 0);
						Static87.method1464(arg2, arg4 + arg3 - local126, arg1, local126, 0);
					}
					arg4 += local126;
					arg3 -= local126 * 2;
				}
			}
			Static235.anInt4661 = local60 * arg3 / 334;
		}
		Static114.anInt2289 = (short) arg1;
		Static292.anInt5677 = arg2;
		Static225.anInt4537 = arg4;
		Static266.anInt5232 = (short) arg3;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIBII)V")
	public static void method2071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static104.anInt2092 = arg0 * Static158.anInt3242 / arg2;
		Static165.anInt3317 = -1;
		Static208.anInt4072 = arg3 * Static207.anInt2141 / arg1;
		Static230.anInt4619 = -1;
		Static72.method1221();
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)Z")
	public static boolean method2072(@OriginalArg(1) int arg0) {
		if (Static308.anInt5865 == arg0) {
			return false;
		}
		Static274.anIntArrayArray37 = new int[104][104];
		Static209.anIntArrayArrayArray11 = new int[4][13][13];
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			Static223.aClass12Array1[local27] = new Class12(104, 104);
		}
		Static216.aClass17ArrayArrayArray1 = new Class17[4][104][104];
		Static185.aByteArrayArrayArray10 = new byte[4][104][104];
		Static27.aByteArrayArrayArray2 = new byte[4][104][104];
		if (Static251.aBoolean330) {
			Static142.method2276();
			Static249.method3814();
			Static41.aClass54ArrayArray1 = new Class54[13][13];
		}
		Static308.anInt5865 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!cg;)V")
	public static void method2073(@OriginalArg(1) Class22 arg0) {
		aClass22_41 = arg0;
		Static17.anInt384 = aClass22_41.method679(4);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method2074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class97 local8 = Static77.method1320(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray6 != null) {
			@Pc(19) Class4_Sub23 local19 = new Class4_Sub23();
			local19.aString125 = arg2;
			local19.anInt3599 = arg0;
			local19.anObjectArray32 = local8.anObjectArray6;
			local19.aClass97_15 = local8;
			Static145.method4497(local19);
		}
		@Pc(37) boolean local37 = true;
		if (local8.anInt3123 > 0) {
			local37 = Static212.method3322(local8);
		}
		if (!local37 || !Static41.method791(local8).method2563(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static175.aClass4_Sub24_Sub1_1.method3123(89);
			Static175.aClass4_Sub24_Sub1_1.method3066(arg3);
			Static175.aClass4_Sub24_Sub1_1.method3105(arg1);
		}
		if (arg0 == 2) {
			Static175.aClass4_Sub24_Sub1_1.method3123(126);
			Static175.aClass4_Sub24_Sub1_1.method3066(arg3);
			Static175.aClass4_Sub24_Sub1_1.method3105(arg1);
		}
		if (arg0 == 3) {
			Static175.aClass4_Sub24_Sub1_1.method3123(101);
			Static175.aClass4_Sub24_Sub1_1.method3066(arg3);
			Static175.aClass4_Sub24_Sub1_1.method3105(arg1);
		}
		if (arg0 == 4) {
			Static175.aClass4_Sub24_Sub1_1.method3123(241);
			Static175.aClass4_Sub24_Sub1_1.method3066(arg3);
			Static175.aClass4_Sub24_Sub1_1.method3105(arg1);
		}
		if (arg0 == 5) {
			Static175.aClass4_Sub24_Sub1_1.method3123(150);
			Static175.aClass4_Sub24_Sub1_1.method3066(arg3);
			Static175.aClass4_Sub24_Sub1_1.method3105(arg1);
		}
		if (arg0 == 6) {
			Static175.aClass4_Sub24_Sub1_1.method3123(255);
			Static175.aClass4_Sub24_Sub1_1.method3066(arg3);
			Static175.aClass4_Sub24_Sub1_1.method3105(arg1);
		}
		if (arg0 == 7) {
			Static175.aClass4_Sub24_Sub1_1.method3123(52);
			Static175.aClass4_Sub24_Sub1_1.method3066(arg3);
			Static175.aClass4_Sub24_Sub1_1.method3105(arg1);
		}
		if (arg0 == 8) {
			Static175.aClass4_Sub24_Sub1_1.method3123(206);
			Static175.aClass4_Sub24_Sub1_1.method3066(arg3);
			Static175.aClass4_Sub24_Sub1_1.method3105(arg1);
		}
		if (arg0 == 9) {
			Static175.aClass4_Sub24_Sub1_1.method3123(189);
			Static175.aClass4_Sub24_Sub1_1.method3066(arg3);
			Static175.aClass4_Sub24_Sub1_1.method3105(arg1);
		}
		if (arg0 == 10) {
			Static175.aClass4_Sub24_Sub1_1.method3123(62);
			Static175.aClass4_Sub24_Sub1_1.method3066(arg3);
			Static175.aClass4_Sub24_Sub1_1.method3105(arg1);
		}
	}
}
