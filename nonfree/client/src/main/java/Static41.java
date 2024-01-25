import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public static int anInt983;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Lclient!e;")
	public static Class46 aClass46_3;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public static int anInt980 = 0;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	public static int anInt982 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLclient!mo;Lclient!mo;)V")
	public static void method987(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Class143 arg1) {
		Static17.aClass143_12 = arg1;
		Static201.aClass143_78 = arg0;
		Static34.anInt4373 = Static201.aClass143_78.method3732(3);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!id;ILclient!e;IIIILclient!gn;IZIIIIB)Lclient!id;")
	public static Class45 method988(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class79 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg7 != null) {
			local11 = arg7.method2295(false, -1, arg12) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(54) long local54 = ((long) arg11 << 48) + ((long) arg10 << 32) + (long) ((arg6 << 24) + (arg8 << 16) + arg1);
		@Pc(56) Class11 local56 = Static159.aClass11_73;
		@Pc(64) Class45 local64;
		synchronized (Static159.aClass11_73) {
			local64 = (Class45) Static159.aClass11_73.method209(local54);
		}
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(170) int local170;
		@Pc(174) int local174;
		if (local64 == null || arg2.method5149(local64.method1809(), local11) != 0) {
			if (local64 != null) {
				local11 = arg2.method5112(local11, local64.method1809());
			}
			@Pc(94) byte local94;
			if (arg1 == 1) {
				local94 = 9;
			} else if (arg1 == 2) {
				local94 = 12;
			} else if (arg1 == 3) {
				local94 = 15;
			} else if (arg1 == 4) {
				local94 = 18;
			} else {
				local94 = 21;
			}
			@Pc(134) int[] local134 = new int[] { 64, 96, 128 };
			@Pc(151) Class71 local151 = new Class71(local94 * 3 + 1, local94 * 3 * 2 - local94, 0);
			local158 = local151.method2178(0, 0, 0);
			@Pc(162) int[][] local162 = new int[3][local94];
			@Pc(176) int local176;
			@Pc(200) int local200;
			for (local164 = 0; local164 < 3; local164++) {
				local170 = local134[local164];
				local174 = local134[local164];
				for (local176 = 0; local176 < local94; local176++) {
					@Pc(184) int local184 = (local176 << 14) / local94;
					@Pc(192) int local192 = local170 * Class14_Sub3_Sub34.anIntArray547[local184] >> 15;
					local200 = local174 * Class14_Sub3_Sub34.anIntArray546[local184] >> 15;
					local162[local164][local176] = local151.method2178(local200, 0, local192);
				}
			}
			for (local170 = 0; local170 < 3; local170++) {
				local174 = (local170 * 256 + 128) / 3;
				local176 = 256 - local174;
				@Pc(255) byte local255 = (byte) (arg6 * local174 + arg8 * local176 >> 8);
				@Pc(300) short local300 = (short) (((arg11 & 0x7F) * local174 + (arg10 & 0x7F) * local176 & 0x7F00) + (local176 * (arg10 & 0xFC00) + local174 * (arg11 & 0xFC00) & 0xFC0000) + (local176 * (arg10 & 0x380) + (arg11 & 0x380) * local174 & 0x38000) >> 8);
				for (local200 = 0; local200 < local94; local200++) {
					if (local170 == 0) {
						local151.method2188(local158, (short) -1, local300, local162[0][(local200 + 1) % local94], (byte) 1, local162[0][local200], (byte) -1, local255);
					} else {
						local151.method2188(local162[local170 - 1][local200], (short) -1, local300, local162[local170 - 1][(local200 + 1) % local94], (byte) 1, local162[local170][(local200 + 1) % local94], (byte) -1, local255);
						local151.method2188(local162[local170 - 1][local200], (short) -1, local300, local162[local170][(local200 + 1) % local94], (byte) 1, local162[local170][local200], (byte) -1, local255);
					}
				}
			}
			local64 = arg2.method5148(local151, local11, Static315.anInt6455, 64, 768);
			@Pc(427) Class11 local427 = Static159.aClass11_73;
			synchronized (Static159.aClass11_73) {
				Static159.aClass11_73.method219(local54, local64);
			}
		}
		@Pc(446) int local446 = arg1 * 64 - 1;
		@Pc(449) int local449 = -local446;
		@Pc(452) int local452 = -local446;
		@Pc(454) int local454 = local446;
		local158 = local446;
		if (arg9) {
			if (arg13 > 1024 && arg13 < 7168) {
				local449 -= 128;
			}
			if (arg13 > 13312 || arg13 < 3072) {
				local452 -= 128;
			}
			if (arg13 > 5120 && arg13 < 11264) {
				local158 = local446 + 128;
			}
			if (arg13 > 9216 && arg13 < 15360) {
				local454 = local446 + 128;
			}
		}
		@Pc(497) int local497 = arg0.method1777();
		local164 = arg0.method1792();
		local170 = arg0.method1798();
		local174 = arg0.method1806();
		if (local452 > local170) {
			local170 = local452;
		}
		if (local497 < local449) {
			local497 = local449;
		}
		if (local454 < local164) {
			local164 = local454;
		}
		if (local158 < local174) {
			local174 = local158;
		}
		@Pc(536) Class14_Sub2_Sub15 local536 = null;
		if (arg7 != null) {
			@Pc(543) int local543 = arg7.anIntArray217[arg12];
			local536 = Static203.method5589(local543 >> 16);
			arg12 = local543 & 0xFFFF;
		}
		if (local536 == null) {
			local64 = local64.method1793((byte) 3, local11, true);
			local64.method1802((local164 - local497) / 2, 128, (local174 - local170) / 2);
			local64.method1788((local497 + local164) / 2, 0, (local170 + local174) / 2);
		} else {
			local64 = local64.method1793((byte) 3, local11, true);
			local64.method1802((local164 - local497) / 2, 128, (local174 - local170) / 2);
			local64.method1788((local164 + local497) / 2, 0, (local174 + local170) / 2);
			local64.method1785(local536, arg12);
		}
		if (arg5 != 0) {
			local64.method1818(arg5);
		}
		if (arg3 != 0) {
			local64.method1784(arg3);
		}
		if (arg4 != 0) {
			local64.method1788(0, arg4, 0);
		}
		return local64;
	}
}
