import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "[Lclient!ufa;")
	public static Class4[] aClass4Array11;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
	public static final int[] anIntArray368 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Z")
	public static boolean aBoolean579 = false;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public static void method6210() {
		for (@Pc(10) Class6_Sub5_Sub11 local10 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6055(); local10 != null; local10 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6050()) {
			if (local10.anInt3423 > 1) {
				local10.anInt3423 = 0;
				Static263.aClass94_24.method2963(((Class6_Sub5_Sub9) local10.aClass231_2.aClass6_Sub5_60.aClass6_Sub5_66).aLong79, local10);
				local10.aClass231_2.method6049();
			}
		}
		Static223.anInt5025 = 0;
		Static611.anInt10324 = 0;
		Static68.aClass163_14.method4970();
		Static565.aClass380_46.method8751();
		Static224.aClass231_5.method6049();
		Static199.aBoolean358 = false;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	public static void method6211() {
		Static47.anInt1657 = 0;
		@Pc(17) int local17 = (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 >> 9) + Static477.anInt8412;
		@Pc(24) int local24 = (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 >> 9) + Static227.anInt5049;
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static47.anInt1657 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static47.anInt1657 = 1;
		}
		if (Static47.anInt1657 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static47.anInt1657 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg2;
		@Pc(21) int local21 = arg6 - arg2;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = local49 + (1 - local61) * local33;
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = local45 * (local57 - 3);
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = (local61 - 3) * local53;
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = (arg6 - 1) * local101;
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = (local21 - 1) * local109;
		@Pc(153) int[] local153 = Static173.anIntArrayArray15[arg4];
		Static571.method7990(arg5, local153, arg1 - arg3, arg1 + -local16);
		Static571.method7990(arg0, local153, arg1 - local16, local16 + arg1);
		Static571.method7990(arg5, local153, local16 + arg1, arg1 + arg3);
		while (local9 > 0) {
			@Pc(195) boolean local195 = local9 <= local21;
			if (local195) {
				if (local88 < 0) {
					while (local88 < 0) {
						local97 += local143;
						local88 += local127;
						local143 += local113;
						local127 += local113;
						local11++;
					}
				}
				if (local97 < 0) {
					local97 += local143;
					local88 += local127;
					local127 += local113;
					local143 += local113;
					local11++;
				}
				local97 += -local133;
				local88 += -local149;
				local133 -= local109;
				local149 -= local109;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local135;
					local70 += local117;
					local7++;
					local117 += local105;
					local135 += local105;
				}
			}
			if (local79 < 0) {
				local70 += local117;
				local79 += local135;
				local117 += local105;
				local7++;
				local135 += local105;
			}
			local70 += -local141;
			local79 += -local123;
			local141 -= local101;
			local123 -= local101;
			local9--;
			@Pc(331) int local331 = arg4 - local9;
			@Pc(335) int local335 = arg4 + local9;
			@Pc(340) int local340 = arg1 + local7;
			@Pc(345) int local345 = arg1 - local7;
			if (local195) {
				@Pc(351) int local351 = local11 + arg1;
				@Pc(356) int local356 = arg1 - local11;
				Static571.method7990(arg5, Static173.anIntArrayArray15[local331], local345, local356);
				Static571.method7990(arg0, Static173.anIntArrayArray15[local331], local356, local351);
				Static571.method7990(arg5, Static173.anIntArrayArray15[local331], local351, local340);
				Static571.method7990(arg5, Static173.anIntArrayArray15[local335], local345, local356);
				Static571.method7990(arg0, Static173.anIntArrayArray15[local335], local356, local351);
				Static571.method7990(arg5, Static173.anIntArrayArray15[local335], local351, local340);
			} else {
				Static571.method7990(arg5, Static173.anIntArrayArray15[local331], local345, local340);
				Static571.method7990(arg5, Static173.anIntArrayArray15[local335], local345, local340);
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
	public static void method6216() {
		if (Static632.anInt10595 == 0) {
			return;
		}
		try {
			if (++Static284.anInt5943 > 2000) {
				if (Static226.aClass41_1 != null) {
					Static226.aClass41_1.method1733();
					Static226.aClass41_1 = null;
				}
				if (Static634.anInt10666 >= 2) {
					Static109.anInt2942 = -5;
					Static632.anInt10595 = 0;
					return;
				}
				Static578.aClass358_5.method8344();
				Static634.anInt10666++;
				Static284.anInt5943 = 0;
				Static632.anInt10595 = 1;
			}
			if (Static632.anInt10595 == 1) {
				Static275.aClass159_9 = Static578.aClass358_5.method8340(Static496.aClass104_4);
				Static632.anInt10595 = 2;
			}
			if (Static632.anInt10595 == 2) {
				if (Static275.aClass159_9.anInt5910 == 2) {
					throw new IOException();
				}
				if (Static275.aClass159_9.anInt5910 != 1) {
					return;
				}
				Static226.aClass41_1 = Static360.method5825((Socket) Static275.aClass159_9.anObject13);
				Static275.aClass159_9 = null;
				Static169.method3193();
				Static632.anInt10595 = 4;
			}
			if (Static632.anInt10595 == 4 && Static226.aClass41_1.method1729(1)) {
				Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 1);
				@Pc(124) int local124 = Static84.aClass6_Sub8_Sub1_1.aByteArray102[0] & 0xFF;
				Static109.anInt2942 = local124;
				Static632.anInt10595 = 0;
				Static226.aClass41_1.method1733();
				Static226.aClass41_1 = null;
			}
		} catch (@Pc(135) IOException local135) {
			if (Static226.aClass41_1 != null) {
				Static226.aClass41_1.method1733();
				Static226.aClass41_1 = null;
			}
			if (Static634.anInt10666 >= 2) {
				Static109.anInt2942 = -4;
				Static632.anInt10595 = 0;
			} else {
				Static578.aClass358_5.method8344();
				Static634.anInt10666++;
				Static284.anInt5943 = 0;
				Static632.anInt10595 = 1;
			}
		}
	}
}
