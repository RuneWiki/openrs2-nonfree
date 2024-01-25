import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "Lclient!ic;")
	public static Class61 aClass61_2;

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	public static void method2076() {
		Static322.method5357(Static344.anInt6591);
		@Pc(16) int local16 = (Static182.anInt3662 >> 3) + (Static190.anInt3870 >> 10);
		@Pc(25) int local25 = (Static316.anInt6169 >> 10) + (Static169.anInt6312 >> 3);
		Static157.anIntArray201 = new int[18];
		Static311.aByteArrayArray6 = new byte[18][];
		Static293.anIntArray451 = new int[18];
		Static253.anIntArrayArray57 = new int[18][4];
		Static245.aByteArrayArray49 = new byte[18][];
		Static131.anIntArray171 = new int[18];
		Static178.aByteArrayArray25 = new byte[18][];
		Static114.aByteArrayArray18 = new byte[18][];
		Static217.anIntArray339 = new int[18];
		Static82.aByteArrayArray13 = new byte[18][];
		Static211.anIntArray332 = new int[18];
		Static70.anIntArray89 = new int[18];
		@Pc(76) int local76 = 0;
		@Pc(96) int local96;
		for (@Pc(85) int local85 = (local16 - (Static24.anInt454 >> 4)) / 8; local85 <= (local16 + (Static24.anInt454 >> 4)) / 8; local85++) {
			for (local96 = (local25 - (Static240.anInt4832 >> 4)) / 8; local96 <= (local25 + (Static240.anInt4832 >> 4)) / 8; local96++) {
				@Pc(104) int local104 = local96 + (local85 << 8);
				Static157.anIntArray201[local76] = local104;
				Static293.anIntArray451[local76] = Static316.aClass144_100.method3902("m" + local85 + "_" + local96);
				Static211.anIntArray332[local76] = Static316.aClass144_100.method3902("l" + local85 + "_" + local96);
				Static131.anIntArray171[local76] = Static316.aClass144_100.method3902("n" + local85 + "_" + local96);
				Static217.anIntArray339[local76] = Static316.aClass144_100.method3902("um" + local85 + "_" + local96);
				Static70.anIntArray89[local76] = Static316.aClass144_100.method3902("ul" + local85 + "_" + local96);
				if (Static131.anIntArray171[local76] == -1) {
					Static293.anIntArray451[local76] = -1;
					Static211.anIntArray332[local76] = -1;
					Static217.anIntArray339[local76] = -1;
					Static70.anIntArray89[local76] = -1;
				}
				local76++;
			}
		}
		for (local96 = local76; local96 < Static131.anIntArray171.length; local96++) {
			Static131.anIntArray171[local96] = -1;
			Static293.anIntArray451[local96] = -1;
			Static211.anIntArray332[local96] = -1;
			Static217.anIntArray339[local96] = -1;
			Static70.anIntArray89[local96] = -1;
		}
		Static19.method1626(true, 8, local16, false, 8, local25, 0);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!mc;III[Z)V")
	public static void method2077(@OriginalArg(0) Class11_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static108.aClass77Array2 == Static79.aClass77Array5) {
			return;
		}
		@Pc(9) int local9 = Static129.aClass77Array3[arg1].method4133(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class77 local22 = Static129.aClass77Array3[local11];
				if (local22 != null) {
					local22.method4135(arg0, arg2, local9 - local22.method4133(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIII)I")
	public static int method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static1.aByteArrayArrayArray1[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static1.aByteArrayArrayArray1[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIZLclient!uo;Lclient!be;Lclient!co;Lclient!bo;)V")
	public static void method2079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class129 arg3, @OriginalArg(5) Class23 arg4, @OriginalArg(6) Class11_Sub8 arg5, @OriginalArg(7) Class30 arg6) {
		@Pc(15) int local15 = arg5.anInt861 - arg1 / 2 - 5;
		@Pc(19) int local19 = arg2 + 2;
		if (arg4.anInt295 != 0) {
			arg3.method4941(local15, local19, arg1 + 10, arg4.anInt295, arg2 + arg0 * arg6.method400() + 1 - local19);
		}
		if (arg4.anInt315 != 0) {
			arg3.method4993(arg1 + 10, arg0 * arg6.method400() + (arg2 + -local19 - -1), local15, local19, arg4.anInt315);
		}
		@Pc(77) int local77 = arg4.anInt305;
		if (arg5.aBoolean53 && arg4.anInt306 != -1) {
			local77 = arg4.anInt306;
		}
		for (@Pc(90) int local90 = 0; local90 < arg0; local90++) {
			@Pc(96) String local96 = Static288.aStringArray47[local90];
			if (arg0 - 1 > local90) {
				local96 = local96.substring(0, local96.length() - 4);
			}
			arg6.method395(arg3, local96, arg5.anInt861, arg2, local77);
			arg2 += arg6.method400();
		}
	}
}
