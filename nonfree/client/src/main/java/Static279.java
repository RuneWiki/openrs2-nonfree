import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
	public static int anInt7417;

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
	public static int anInt7421;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)B")
	public static byte method5722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIII)V")
	public static void method5723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class150[] local12 = Static325.aClass150Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Class150 local20 = local12[local14];
			if (local20 != null && local20.anInt4136 == 2) {
				Static407.method5112(local20.anInt4144, arg2 >> 1, local20.anInt4137, arg1 >> 1, local20.anInt4143 * 2, local20.anInt4134);
				if (Static25.anIntArray37[0] > -1 && Static274.anInt4617 % 20 < 10) {
					Static378.aClass11Array12[local20.anInt4138].method4394(arg3 + Static25.anIntArray37[0] - 12, Static25.anIntArray37[1] + -28 + arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(B)V")
	public static void method5724() {
		Static100.method1743(Static130.aClass153_Sub1_1.anInt5234);
		@Pc(17) int local17 = (Static46.anInt737 >> 10) + (Static359.anInt5713 >> 3);
		@Pc(26) int local26 = (Static181.anInt3254 >> 10) + (Static314.anInt5181 >> 3);
		Static268.anInt4539 = Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 = 0;
		Static104.aClass26_Sub2_Sub4_Sub2_2.method5526(8, 8);
		Static48.anIntArray70 = new int[18];
		Static401.anIntArray574 = new int[18];
		Static253.anIntArray367 = new int[18];
		Static66.aByteArrayArray4 = new byte[18][];
		Static36.anIntArray53 = new int[18];
		Static420.aByteArrayArray22 = new byte[18][];
		Static331.anIntArray494 = new int[18];
		Static3.aByteArrayArray1 = new byte[18][];
		Static155.aByteArrayArray12 = new byte[18][];
		Static220.anIntArrayArray29 = new int[18][4];
		Static170.anIntArray421 = new int[18];
		Static333.aByteArrayArray14 = new byte[18][];
		@Pc(85) int local85 = 0;
		@Pc(105) int local105;
		for (@Pc(94) int local94 = (local17 - (Static333.anInt3375 >> 4)) / 8; local94 <= (local17 + (Static333.anInt3375 >> 4)) / 8; local94++) {
			for (local105 = (local26 - (Static102.anInt2086 >> 4)) / 8; local105 <= (local26 + (Static102.anInt2086 >> 4)) / 8; local105++) {
				@Pc(114) int local114 = (local94 << 8) + local105;
				Static331.anIntArray494[local85] = local114;
				Static253.anIntArray367[local85] = Static402.aClass178_123.method3836("m" + local94 + "_" + local105);
				Static48.anIntArray70[local85] = Static402.aClass178_123.method3836("l" + local94 + "_" + local105);
				Static401.anIntArray574[local85] = Static402.aClass178_123.method3836("n" + local94 + "_" + local105);
				Static36.anIntArray53[local85] = Static402.aClass178_123.method3836("um" + local94 + "_" + local105);
				Static170.anIntArray421[local85] = Static402.aClass178_123.method3836("ul" + local94 + "_" + local105);
				if (Static401.anIntArray574[local85] == -1) {
					Static253.anIntArray367[local85] = -1;
					Static48.anIntArray70[local85] = -1;
					Static36.anIntArray53[local85] = -1;
					Static170.anIntArray421[local85] = -1;
				}
				local85++;
			}
		}
		for (local105 = local85; local105 < Static401.anIntArray574.length; local105++) {
			Static401.anIntArray574[local105] = -1;
			Static253.anIntArray367[local105] = -1;
			Static48.anIntArray70[local105] = -1;
			Static36.anIntArray53[local105] = -1;
			Static170.anIntArray421[local105] = -1;
		}
		@Pc(295) byte local295;
		if (Static206.anInt3642 == 1 || Static206.anInt3642 == 2) {
			local295 = 3;
		} else {
			local295 = 7;
		}
		Static114.method1939(local295, local26, local17, false);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIZI)V")
	public static void method5725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(37) int local37 = (1 - local29) * local13 + local21;
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = local25 * ((arg2 << 1) - 3);
		@Pc(81) int local81 = local54;
		@Pc(87) int local87 = local50 * (arg2 - 1);
		@Pc(105) int local105;
		@Pc(114) int local114;
		if (arg3 >= Static316.anInt5188 && arg3 <= Static82.anInt1667) {
			local105 = Static278.method3708(arg1 + arg0, Static137.anInt2576, Static293.anInt4886);
			local114 = Static278.method3708(arg1 - arg0, Static137.anInt2576, Static293.anInt4886);
			Static404.method5769(Static353.anIntArrayArray48[arg3], local114, local105, arg4);
		}
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local67;
					local46 += local81;
					local7++;
					local67 += local54;
					local81 += local54;
				}
			}
			if (local46 < 0) {
				local37 += local67;
				local46 += local81;
				local67 += local54;
				local7++;
				local81 += local54;
			}
			local37 += -local87;
			local46 += -local75;
			local75 -= local50;
			local87 -= local50;
			local9--;
			local105 = arg3 - local9;
			local114 = arg3 + local9;
			if (Static316.anInt5188 <= local114 && Static82.anInt1667 >= local105) {
				@Pc(212) int local212 = Static278.method3708(local7 + arg1, Static137.anInt2576, Static293.anInt4886);
				@Pc(225) int local225 = Static278.method3708(arg1 - local7, Static137.anInt2576, Static293.anInt4886);
				if (Static316.anInt5188 <= local105) {
					Static404.method5769(Static353.anIntArrayArray48[local105], local225, local212, arg4);
				}
				if (local114 <= Static82.anInt1667) {
					Static404.method5769(Static353.anIntArrayArray48[local114], local225, local212, arg4);
				}
			}
		}
	}
}
