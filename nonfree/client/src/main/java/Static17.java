import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "Lclient!tq;")
	public static Class226 aClass226_1;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIBIILclient!bm;IIII)Z")
	public static boolean method513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class23 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg2;
		@Pc(7) int local7 = arg6;
		@Pc(15) int local15 = arg2 - 64;
		@Pc(20) int local20 = arg6 - 64;
		Static184.anIntArrayArray30[64][64] = 99;
		Static438.anIntArrayArray65[64][64] = 0;
		@Pc(34) byte local34 = 0;
		Static342.anIntArray456[0] = arg2;
		@Pc(40) int local40 = 0;
		@Pc(48) int local48 = local34 + 1;
		Static209.anIntArray314[0] = arg6;
		@Pc(53) int[][] local53 = arg5.anIntArrayArray4;
		while (local48 != local40) {
			local5 = Static342.anIntArray456[local40];
			local7 = Static209.anIntArray314[local40];
			@Pc(67) int local67 = local5 - local15;
			local40 = local40 + 1 & 0xFFF;
			@Pc(78) int local78 = local7 - local20;
			@Pc(84) int local84 = local5 - arg5.anInt923;
			@Pc(90) int local90 = local7 - arg5.anInt926;
			if (arg1 == -4) {
				if (local5 == arg4 && local7 == arg8) {
					Static304.anInt5567 = local5;
					Static402.anInt7002 = local7;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static79.method1399(arg4, arg8, arg7, arg0, 2, local5, 2, local7)) {
					Static304.anInt5567 = local5;
					Static402.anInt7002 = local7;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg5.method817(arg4, local5, arg3, 2, 2, arg7, arg8, local7, arg0)) {
					Static402.anInt7002 = local7;
					Static304.anInt5567 = local5;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg5.method823(arg8, arg3, local5, local7, arg4, arg7, 2, arg0)) {
					Static402.anInt7002 = local7;
					Static304.anInt5567 = local5;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg5.method831(arg1, arg4, arg9, local7, 2, local5, arg8)) {
					Static402.anInt7002 = local7;
					Static304.anInt5567 = local5;
					return true;
				}
			} else if (arg5.method819(2, arg8, arg9, local7, arg4, local5, arg1)) {
				Static304.anInt5567 = local5;
				Static402.anInt7002 = local7;
				return true;
			}
			@Pc(242) int local242 = Static438.anIntArrayArray65[local67][local78] + 1;
			if (local67 > 0 && Static184.anIntArrayArray30[local67 - 1][local78] == 0 && (local53[local84 - 1][local90] & 0x43A40000) == 0 && (local53[local84 - 1][local90 + 1] & 0x4E240000) == 0) {
				Static342.anIntArray456[local48] = local5 - 1;
				Static209.anIntArray314[local48] = local7;
				Static184.anIntArrayArray30[local67 - 1][local78] = 2;
				local48 = local48 + 1 & 0xFFF;
				Static438.anIntArrayArray65[local67 - 1][local78] = local242;
			}
			if (local67 < 126 && Static184.anIntArrayArray30[local67 + 1][local78] == 0 && (local53[local84 + 2][local90] & 0x60E40000) == 0 && (local53[local84 + 2][local90 + 1] & 0x78240000) == 0) {
				Static342.anIntArray456[local48] = local5 + 1;
				Static209.anIntArray314[local48] = local7;
				local48 = local48 + 1 & 0xFFF;
				Static184.anIntArrayArray30[local67 + 1][local78] = 8;
				Static438.anIntArrayArray65[local67 + 1][local78] = local242;
			}
			if (local78 > 0 && Static184.anIntArrayArray30[local67][local78 - 1] == 0 && (local53[local84][local90 - 1] & 0x43A40000) == 0 && (local53[local84 + 1][local90 - 1] & 0x60E40000) == 0) {
				Static342.anIntArray456[local48] = local5;
				Static209.anIntArray314[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static184.anIntArrayArray30[local67][local78 - 1] = 1;
				Static438.anIntArrayArray65[local67][local78 - 1] = local242;
			}
			if (local78 < 126 && Static184.anIntArrayArray30[local67][local78 + 1] == 0 && (local53[local84][local90 + 2] & 0x4E240000) == 0 && (local53[local84 + 1][local90 + 2] & 0x78240000) == 0) {
				Static342.anIntArray456[local48] = local5;
				Static209.anIntArray314[local48] = local7 + 1;
				Static184.anIntArrayArray30[local67][local78 + 1] = 4;
				local48 = local48 + 1 & 0xFFF;
				Static438.anIntArrayArray65[local67][local78 + 1] = local242;
			}
			if (local67 > 0 && local78 > 0 && Static184.anIntArrayArray30[local67 - 1][local78 - 1] == 0 && (local53[local84 - 1][local90] & 0x4FA40000) == 0 && (local53[local84 - 1][local90 - 1] & 0x43A40000) == 0 && (local53[local84][local90 - 1] & 0x63E40000) == 0) {
				Static342.anIntArray456[local48] = local5 - 1;
				Static209.anIntArray314[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static184.anIntArrayArray30[local67 - 1][local78 - 1] = 3;
				Static438.anIntArrayArray65[local67 - 1][local78 - 1] = local242;
			}
			if (local67 < 126 && local78 > 0 && Static184.anIntArrayArray30[local67 + 1][local78 - 1] == 0 && (local53[local84 + 1][local90 - 1] & 0x63E40000) == 0 && (local53[local84 + 2][local90 - 1] & 0x60E40000) == 0 && (local53[local84 + 2][local90] & 0x78E40000) == 0) {
				Static342.anIntArray456[local48] = local5 + 1;
				Static209.anIntArray314[local48] = local7 - 1;
				Static184.anIntArrayArray30[local67 + 1][local78 - 1] = 9;
				local48 = local48 + 1 & 0xFFF;
				Static438.anIntArrayArray65[local67 + 1][local78 - 1] = local242;
			}
			if (local67 > 0 && local78 < 126 && Static184.anIntArrayArray30[local67 - 1][local78 + 1] == 0 && (local53[local84 - 1][local90 + 1] & 0x4FA40000) == 0 && (local53[local84 - 1][local90 + 2] & 0x4E240000) == 0 && (local53[local84][local90 + 2] & 0x7E240000) == 0) {
				Static342.anIntArray456[local48] = local5 - 1;
				Static209.anIntArray314[local48] = local7 + 1;
				Static184.anIntArrayArray30[local67 - 1][local78 + 1] = 6;
				local48 = local48 + 1 & 0xFFF;
				Static438.anIntArrayArray65[local67 - 1][local78 + 1] = local242;
			}
			if (local67 < 126 && local78 < 126 && Static184.anIntArrayArray30[local67 + 1][local78 + 1] == 0 && (local53[local84 + 1][local90 + 2] & 0x7E240000) == 0 && (local53[local84 + 2][local90 + 2] & 0x78240000) == 0 && (local53[local84 + 2][local90 + 1] & 0x78E40000) == 0) {
				Static342.anIntArray456[local48] = local5 + 1;
				Static209.anIntArray314[local48] = local7 + 1;
				local48 = local48 + 1 & 0xFFF;
				Static184.anIntArrayArray30[local67 + 1][local78 + 1] = 12;
				Static438.anIntArrayArray65[local67 + 1][local78 + 1] = local242;
			}
		}
		Static304.anInt5567 = local5;
		Static402.anInt7002 = local7;
		return false;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZIIII)I")
	public static int method514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg1 & 0xF;
		@Pc(21) int local21 = local12 < 8 ? arg0 : arg3;
		@Pc(38) int local38 = local12 < 4 ? arg3 : local12 == 12 || local12 == 14 ? arg0 : arg2;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local38 : -local38);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
	public static void method515() {
		@Pc(8) Class3_Sub1 local8 = (Class3_Sub1) Static274.aClass229_31.method5328();
		@Pc(19) boolean local19 = Static435.aClass68_14 != null || Static167.anInt6467 > 0;
		if (local19) {
			Static390.anInt6740 = 1;
		}
		if (Static93.aBoolean163 && Static19.aClass16_1.method580(81) && Static169.anInt3551 > 2) {
			if (local19) {
				Static419.aClass3_Sub38_2 = (Class3_Sub38) Static374.aClass229_41.aClass3_233.aClass3_262.aClass3_262;
			} else {
				Static421.method3680((Class3_Sub38) Static374.aClass229_41.aClass3_233.aClass3_262.aClass3_262, local8.method4777(), local8.method4775());
			}
		} else if (local19) {
			Static419.aClass3_Sub38_2 = (Class3_Sub38) Static374.aClass229_41.aClass3_233.aClass3_262;
		} else {
			Static421.method3680((Class3_Sub38) Static374.aClass229_41.aClass3_233.aClass3_262, local8.method4777(), local8.method4775());
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZZ[B)Ljava/lang/Object;")
	public static Object method517(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static175.aBoolean343) {
			try {
				@Pc(23) Class43 local23 = (Class43) Class.forName("Class43_Sub1").getDeclaredConstructor().newInstance();
				local23.method5200(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static175.aBoolean343 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
	public static void method518() {
		Static197.anInt4304 = 0;
		@Pc(16) boolean local16 = Static110.aClass3_Sub2_Sub2_1.method5997() == 1;
		@Pc(20) int local20 = Static110.aClass3_Sub2_Sub2_1.method6004();
		@Pc(24) int local24 = Static110.aClass3_Sub2_Sub2_1.method6041();
		@Pc(28) int local28 = Static110.aClass3_Sub2_Sub2_1.method6013();
		Static408.method5487(local28);
		@Pc(49) int local49 = (Static113.anInt6862 - Static110.aClass3_Sub2_Sub2_1.anInt7620) / 16;
		Static244.anIntArrayArray37 = new int[local49][4];
		@Pc(58) int local58;
		for (@Pc(55) int local55 = 0; local55 < local49; local55++) {
			for (local58 = 0; local58 < 4; local58++) {
				Static244.anIntArrayArray37[local55][local58] = Static110.aClass3_Sub2_Sub2_1.method6014();
			}
		}
		Static277.anIntArray351 = new int[local49];
		Static437.anIntArray569 = new int[local49];
		Static445.aByteArrayArray25 = new byte[local49][];
		Static144.anIntArray241 = new int[local49];
		Static303.aByteArrayArray17 = new byte[local49][];
		Static265.aByteArrayArray14 = new byte[local49][];
		Static363.anIntArray466 = null;
		Static20.anIntArray43 = new int[local49];
		Static289.anIntArray407 = new int[local49];
		Static104.aByteArrayArray9 = new byte[local49][];
		Static57.aByteArrayArray4 = null;
		local49 = 0;
		for (local58 = (local24 - (Static399.anInt6923 >> 4)) / 8; local58 <= (local24 + (Static399.anInt6923 >> 4)) / 8; local58++) {
			for (@Pc(129) int local129 = (local20 - (Static127.anInt2696 >> 4)) / 8; local129 <= ((Static127.anInt2696 >> 4) + local20) / 8; local129++) {
				Static289.anIntArray407[local49] = local129 + (local58 << 8);
				Static277.anIntArray351[local49] = Static93.aClass56_22.method1368("m" + local58 + "_" + local129);
				Static20.anIntArray43[local49] = Static93.aClass56_22.method1368("l" + local58 + "_" + local129);
				Static437.anIntArray569[local49] = Static93.aClass56_22.method1368("um" + local58 + "_" + local129);
				Static144.anIntArray241[local49] = Static93.aClass56_22.method1368("ul" + local58 + "_" + local129);
				local49++;
			}
		}
		Static29.method737(local16, local24, false, local20);
	}
}
