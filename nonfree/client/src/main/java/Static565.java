import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
	public static int anInt9242 = 0;

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_163 = new Class319(54, -1);

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public static void method7627() {
		Static317.method4814(Static479.aClass1_Sub7_Sub1_1.anInt3100);
		@Pc(17) int local17 = (Static333.anInt5940 >> 12) + (Static376.anInt6631 >> 3);
		Static240.anInt4595 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 = 0;
		@Pc(31) int local31 = (Static216.anInt4203 >> 12) + (Static24.anInt674 >> 3);
		Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method4147(8, 8);
		Static515.anIntArray586 = new int[18];
		Static331.aByteArrayArray20 = new byte[18][];
		Static298.anIntArray348 = new int[18];
		Static457.aByteArrayArray25 = new byte[18][];
		Static201.anIntArray451 = new int[18];
		Static549.anIntArray609 = new int[18];
		Static466.aByteArrayArray10 = new byte[18][];
		Static585.anIntArray630 = new int[18];
		Static429.aByteArrayArray24 = new byte[18][];
		Static357.anIntArrayArray43 = new int[18][4];
		Static349.aByteArrayArray21 = new byte[18][];
		Static328.anIntArray378 = new int[18];
		@Pc(84) int local84 = 0;
		@Pc(104) int local104;
		for (@Pc(93) int local93 = (local17 - (Static500.anInt6888 >> 4)) / 8; local93 <= (local17 + (Static500.anInt6888 >> 4)) / 8; local93++) {
			for (local104 = (local31 - (Static573.anInt9325 >> 4)) / 8; local104 <= ((Static573.anInt9325 >> 4) + local31) / 8; local104++) {
				@Pc(113) int local113 = (local93 << 8) + local104;
				Static298.anIntArray348[local84] = local113;
				Static549.anIntArray609[local84] = Static373.aClass111_90.method2462("m" + local93 + "_" + local104);
				Static515.anIntArray586[local84] = Static373.aClass111_90.method2462("l" + local93 + "_" + local104);
				Static328.anIntArray378[local84] = Static373.aClass111_90.method2462("n" + local93 + "_" + local104);
				Static201.anIntArray451[local84] = Static373.aClass111_90.method2462("um" + local93 + "_" + local104);
				Static585.anIntArray630[local84] = Static373.aClass111_90.method2462("ul" + local93 + "_" + local104);
				if (Static328.anIntArray378[local84] == -1) {
					Static549.anIntArray609[local84] = -1;
					Static515.anIntArray586[local84] = -1;
					Static201.anIntArray451[local84] = -1;
					Static585.anIntArray630[local84] = -1;
				}
				local84++;
			}
		}
		for (local104 = local84; local104 < Static328.anIntArray378.length; local104++) {
			Static328.anIntArray378[local104] = -1;
			Static549.anIntArray609[local104] = -1;
			Static515.anIntArray586[local104] = -1;
			Static201.anIntArray451[local104] = -1;
			Static585.anIntArray630[local104] = -1;
		}
		@Pc(286) byte local286;
		if (Static177.anInt2101 == 3) {
			local286 = 4;
		} else {
			local286 = 8;
		}
		Static304.method4713(local286, local17, local31, false);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 >= Static487.anInt8210 && Static278.anInt5111 >= arg1 && arg3 >= Static126.anInt6658 && arg5 <= Static494.anInt8295) {
			Static560.method7546(arg4, arg3, arg2, arg6, arg1, arg0, arg5);
		} else {
			Static127.method2189(arg2, arg5, arg3, arg1, arg0, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)Z")
	public static boolean method7632(@OriginalArg(0) int arg0) {
		return arg0 == 50 || arg0 == 2 || arg0 == 1001 || arg0 == 60 || arg0 == 48;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[BB)[B")
	public static byte[] method7636(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(18) byte[] local18 = new byte[32768];
		Static600.method3768(arg1, arg0, local18, 0, 32768);
		return local18;
	}
}
