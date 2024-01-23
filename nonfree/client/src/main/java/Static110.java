import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "[I")
	public static int[] anIntArray220 = new int[] { 0, 0, 0, 0, 2, 0, 3, 0, -1, -1, 0, 10, 3, 0, 0, -2, 0, 0, 0, 5, 3, 0, 4, 0, 0, 0, 0, 0, 0, 12, 0, -1, 15, 6, 12, 0, 0, 0, 3, 7, 0, 10, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 6, 0, 2, 0, -1, 0, 0, -2, 0, 0, 8, 0, 0, 5, -1, 2, 1, 9, 3, -1, 0, 6, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, -2, 0, 0, 6, -1, -2, -1, 7, 1, 17, 4, 0, 0, 0, 0, 2, 0, 0, 12, 28, 0, 0, 0, 0, 6, 3, 8, -1, 0, -1, 0, 5, 0, 2, 0, 0, 7, 3, 0, 6, 8, 0, -2, 0, -2, 7, 8, 0, 8, 6, -1, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, -2, 0, -2, 0, 0, 4, 12, 0, 0, -2, 14, -2, 0, 0, 0, 0, 10, 1, 4, 0, -1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 12, 0, 0, 0, 8, 1, 0, 0, 6, 0, 0, 0, 20, 0, 0, 2, 0, 0, 0, 0, 10, 0, 8, 0, 2, -1, 0, 0, 0, 0, 0, 0, -1, 0, 15, 8, -2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -1, 3, 8, 0, 0, 0, 0, 0, 6, 14, 6, 0, -2 };

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!sb;Lclient!aj;)V")
	public static void method1866(@OriginalArg(1) Class2_Sub8_Sub21 arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(13) Class93_Sub1 local13 = arg1.method153();
		if (local13 == null) {
			return;
		}
		@Pc(20) int local20 = arg0.anInt4973;
		@Pc(23) int local23 = local13.anInt4355;
		if (local13.anInt4359 > local13.anInt4355) {
			local23 = local13.anInt4359;
		}
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.anInt4976;
		@Pc(54) int local54;
		@Pc(82) int local82;
		if (arg1.aString9 != null) {
			local33 = Static92.aClass2_Sub8_Sub5_2.method1231(arg1.aString9, null, Static96.aStringArray18);
			for (local54 = 0; local54 < local33; local54++) {
				@Pc(61) String local61 = Static96.aStringArray18[local54];
				if (local33 - 1 > local54) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static279.aClass87_7.method2478(local61);
				if (local37 < local82) {
					local37 = local82;
				}
			}
			local35 = (local33 - 1) * Static279.aClass87_7.method2487() + Static279.aClass87_7.method2486() / 2;
		}
		@Pc(115) int local115 = arg0.anInt4976 - local35 / 2;
		local54 = arg0.anInt4973;
		if (Static250.anInt3124 + local23 > local20) {
			local54 = local23 + Static250.anInt3124 + local23 / 2 + local37 / 2 + 5;
			local20 = Static250.anInt3124 + local23;
		} else if (Static250.anInt3130 - local23 < local20) {
			local54 = Static250.anInt3130 - local23 / 2 - local23 - local37 / 2 - 5;
			local20 = Static250.anInt3130 - local23;
		}
		if (Static250.anInt3126 + local23 > local40) {
			local40 = local23 + Static250.anInt3126;
			local115 = Static250.anInt3126 + local23 + local23 / 2 + Static279.aClass87_7.method2487();
		} else if (local40 > Static250.anInt3123 - local23) {
			local40 = Static250.anInt3123 - local23;
			local115 = Static250.anInt3123 - local23 / 2 - local23 - local35;
		}
		local23 >>= 0x1;
		@Pc(243) int local243 = -2;
		local82 = (int) (Math.atan2((double) (local20 - arg0.anInt4973), (double) (local40 - arg0.anInt4976)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		local13.method2562(local13.anInt4361 << 3, local13.anInt4354 << 3, (local20 << 4) + local23, (local40 << 4) - -local23, local82);
		if (arg1.aString9 != null) {
			local267 = local115 - Static279.aClass87_7.method2486() - 3;
			local265 = local54 - local37 / 2 - 5;
			local269 = Static279.aClass87_7.method2487() * local33 + local267;
			local243 = local265 + local37 + 10;
			if (arg1.anInt163 != 0) {
				Static77.method1443(local265, local267, local243 - local265, local269 - local267, arg1.anInt163, arg1.anInt163 >>> 24);
			}
			if (arg1.anInt168 != 0) {
				Static77.method1454(local265, local267, local243 - local265, -local267 + local269, arg1.anInt168, arg1.anInt168 >>> 24);
			}
			for (@Pc(372) int local372 = 0; local372 < local33; local372++) {
				@Pc(383) String local383 = Static96.aStringArray18[local372];
				if (local33 - 1 > local372) {
					local383 = local383.substring(0, local383.length() - 4);
				}
				Static279.aClass87_7.method2485(local383, local54, local115, arg1.anInt147);
				local115 += Static279.aClass87_7.method2487();
			}
		}
		if ((local20 - local23 >= Static131.anInt3016 || Static131.anInt3016 >= local23 + local20 || Static281.anInt5551 <= local40 - local23 || local23 + local40 <= Static281.anInt5551) && (local265 >= Static131.anInt3016 || local243 <= Static131.anInt3016 || local267 >= Static281.anInt5551 || Static281.anInt5551 >= local269)) {
			return;
		}
		if (arg1.aStringArray1[4] != null) {
			Static206.method3478(arg1.aString10, (long) arg0.anInt4970, 0, (short) 1009, arg1.aStringArray1[4], 0, -1);
		}
		if (arg1.aStringArray1[3] != null) {
			Static206.method3478(arg1.aString10, (long) arg0.anInt4970, 0, (short) 1003, arg1.aStringArray1[3], 0, -1);
		}
		if (arg1.aStringArray1[2] != null) {
			Static206.method3478(arg1.aString10, (long) arg0.anInt4970, 0, (short) 1005, arg1.aStringArray1[2], 0, -1);
		}
		if (arg1.aStringArray1[1] != null) {
			Static206.method3478(arg1.aString10, (long) arg0.anInt4970, 0, (short) 1006, arg1.aStringArray1[1], 0, -1);
		}
		if (arg1.aStringArray1[0] != null) {
			Static206.method3478(arg1.aString10, (long) arg0.anInt4970, 0, (short) 1008, arg1.aStringArray1[0], 0, -1);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)[Lclient!ka;")
	public static Class93_Sub1[] method1872() {
		@Pc(8) Class93_Sub1[] local8 = new Class93_Sub1[Static236.anInt4770];
		for (@Pc(10) int local10 = 0; local10 < Static236.anInt4770; local10++) {
			local8[local10] = new Class93_Sub1(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[local10], Static275.anIntArray522[local10], Static299.anIntArray561[local10], Static187.anIntArray397[local10], Static165.aByteArrayArray9[local10], Static199.anIntArray438);
		}
		Static293.method4502();
		return local8;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
	public static void method1873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static287.anInt5651 * arg0 >> 8;
		if (arg1 == -1 && !Static297.aBoolean384) {
			Static259.method4088();
		} else if (arg1 != -1 && (Static7.anInt116 != arg1 || !Static90.method1596()) && local9 != 0 && !Static297.aBoolean384) {
			Static34.method654(arg1, local9, Static251.aClass42_77);
		}
		Static7.anInt116 = arg1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
	public static void method1874(@OriginalArg(1) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static116.aBoolean184 && arg0) {
			local11 = Static234.aByteArrayArray15;
			local13 = 1;
		} else {
			local11 = Static296.aByteArrayArray19;
			local13 = 4;
		}
		@Pc(22) int local22 = local11.length;
		@Pc(30) int local30;
		@Pc(55) int local55;
		for (local30 = 0; local30 < local22; local30++) {
			@Pc(41) byte[] local41 = local11[local30];
			@Pc(43) int[] local43 = null;
			@Pc(49) int local49 = Static253.anIntArray485[local30] >> 8;
			local55 = Static253.anIntArray485[local30] & 0xFF;
			@Pc(62) int local62 = local55 * 64 - Static234.anInt4705;
			@Pc(69) int local69 = local49 * 64 - Static160.anInt5159;
			if (local41 != null) {
				Static220.method3662();
				local43 = Static122.method2051(local62, Static89.aClass154Array1, arg0, Static160.anInt5159, local69, local41, Static234.anInt4705);
			}
			if (!arg0 && Static180.anInt3907 / 8 == local49 && local55 == Static261.anInt5142 / 8) {
				if (local43 == null) {
					Static100.anInt2372 = -1;
				} else {
					Static118.anInt2627 = local43[2];
					Static200.anInt4186 = local43[3];
					Static278.anInt5486 = local43[1];
					Static130.anInt2985 = local43[4];
					Static100.anInt2372 = local43[0];
				}
			}
		}
		for (local30 = 0; local30 < local22; local30++) {
			@Pc(150) int local150 = (Static253.anIntArray485[local30] >> 8) * 64 - Static160.anInt5159;
			@Pc(161) int local161 = (Static253.anIntArray485[local30] & 0xFF) * 64 - Static234.anInt4705;
			@Pc(165) byte[] local165 = local11[local30];
			if (local165 == null && Static261.anInt5142 < 800) {
				Static220.method3662();
				for (local55 = 0; local55 < local13; local55++) {
					Static154.method2843(local150, local161, local55, 64, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
	public static void method1876() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static86.aClass2_Sub13ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static86.aClass2_Sub13ArrayArrayArray2.length; local3++) {
				for (local9 = 0; local9 < Static38.anInt954; local9++) {
					for (local14 = 0; local14 < Static232.anInt4680; local14++) {
						Static86.aClass2_Sub13ArrayArrayArray2[local3][local9][local14] = null;
					}
				}
			}
		}
		Static296.aClass2_Sub32ArrayArray4 = null;
		if (Static136.aClass2_Sub13ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static136.aClass2_Sub13ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static38.anInt954; local9++) {
					for (local14 = 0; local14 < Static232.anInt4680; local14++) {
						Static136.aClass2_Sub13ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static89.aClass2_Sub32ArrayArray3 = null;
		Static166.anInt3672 = 0;
		if (Static254.aClass150Array2 != null) {
			for (local3 = 0; local3 < Static166.anInt3672; local3++) {
				Static254.aClass150Array2[local3] = null;
			}
		}
		if (Static315.aClass170Array3 != null) {
			for (local3 = 0; local3 < Static273.anInt5430; local3++) {
				Static315.aClass170Array3[local3] = null;
			}
			Static273.anInt5430 = 0;
		}
		if (Static285.aClass170Array2 != null) {
			for (local3 = 0; local3 < Static285.aClass170Array2.length; local3++) {
				Static285.aClass170Array2[local3] = null;
			}
		}
	}
}
