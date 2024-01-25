import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public static int anInt3360;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)B")
	public static byte method2670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IBI)I")
	public static int method2671(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(24) int local24 = (arg0 & 0x7F) * 96 >> 7;
		if (local24 < 2) {
			local24 = 2;
		} else if (local24 > 126) {
			local24 = 126;
		}
		return local24 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIILclient!za;BIIIILclient!e;IILclient!jp;I)Lclient!e;")
	public static Class59 method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class59 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class128 arg12, @OriginalArg(14) int arg13) {
		if (arg9 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg12 != null) {
			local11 = arg12.method2648(-1, false, arg3) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = (long) (arg11 + (arg0 << 16) + (arg6 << 24)) + ((long) arg1 << 32) + ((long) arg7 << 48);
		@Pc(51) Class132 local51 = Static459.aClass132_35;
		@Pc(59) Class59 local59;
		synchronized (Static459.aClass132_35) {
			local59 = (Class59) Static459.aClass132_35.method2701(local49);
		}
		@Pc(151) int local151;
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(167) int local167;
		if (local59 == null || arg4.method5502(local59.RA(), local11) != 0) {
			if (local59 != null) {
				local11 = arg4.method5514(local11, local59.RA());
			}
			@Pc(86) byte local86;
			if (arg11 == 1) {
				local86 = 9;
			} else if (arg11 == 2) {
				local86 = 12;
			} else if (arg11 == 3) {
				local86 = 15;
			} else if (arg11 == 4) {
				local86 = 18;
			} else {
				local86 = 21;
			}
			@Pc(126) int[] local126 = new int[] { 64, 96, 128 };
			@Pc(144) Class205 local144 = new Class205(local86 * 3 + 1, -local86 + local86 * 2 * 3, 0);
			local151 = local144.method4449(0, 0, 0);
			@Pc(155) int[][] local155 = new int[3][local86];
			@Pc(169) int local169;
			@Pc(193) int local193;
			for (local157 = 0; local157 < 3; local157++) {
				local163 = local126[local157];
				local167 = local126[local157];
				for (local169 = 0; local169 < local86; local169++) {
					@Pc(177) int local177 = (local169 << 14) / local86;
					@Pc(185) int local185 = Class155.anIntArray342[local177] * local163 >> 15;
					local193 = Class155.anIntArray341[local177] * local167 >> 15;
					local155[local157][local169] = local144.method4449(local193, local185, 0);
				}
			}
			for (local163 = 0; local163 < 3; local163++) {
				local167 = (local163 * 256 + 128) / 3;
				local169 = 256 - local167;
				@Pc(244) byte local244 = (byte) (arg6 * local167 + local169 * arg0 >> 8);
				@Pc(289) short local289 = (short) (((arg7 & 0x7F) * local167 + (arg1 & 0x7F) * local169 & 0x7F00) + ((arg7 & 0xFC00) * local167 + (arg1 & 0xFC00) * local169 & 0xFC0000) + ((arg7 & 0x380) * local167 + local169 * (arg1 & 0x380) & 0x38000) >> 8);
				for (local193 = 0; local193 < local86; local193++) {
					if (local163 == 0) {
						local144.method4439((byte) 1, local289, local244, (byte) -1, local151, local155[0][(local193 + 1) % local86], (short) -1, local155[0][local193]);
					} else {
						local144.method4439((byte) 1, local289, local244, (byte) -1, local155[local163 - 1][local193], local155[local163 - 1][(local193 + 1) % local86], (short) -1, local155[local163][(local193 + 1) % local86]);
						local144.method4439((byte) 1, local289, local244, (byte) -1, local155[local163 - 1][local193], local155[local163][(local193 + 1) % local86], (short) -1, local155[local163][local193]);
					}
				}
			}
			local59 = arg4.method5530(local144, local11, Static407.anInt6656, 64, 768);
			@Pc(415) Class132 local415 = Static459.aClass132_35;
			synchronized (Static459.aClass132_35) {
				Static459.aClass132_35.method2711(local59, local49);
			}
		}
		@Pc(436) int local436 = (arg11 << 6) - 1;
		@Pc(439) int local439 = -local436;
		@Pc(442) int local442 = -local436;
		@Pc(449) int local449 = local436;
		local151 = local436;
		if (arg5 != 0) {
			if ((arg5 & 0x1) != 0) {
				local151 = local436 + 128;
			}
			if ((arg5 & 0x8) != 0) {
				local439 -= 128;
			}
			if ((arg5 & 0x2) != 0) {
				local442 -= 128;
			}
			if ((arg5 & 0x4) != 0) {
				local449 = local436 + 128;
			}
		}
		@Pc(482) int local482 = arg9.ta();
		local157 = arg9.MA();
		local163 = arg9.Z();
		if (local157 > local449) {
			local157 = local449;
		}
		local167 = arg9.S();
		if (local439 > local482) {
			local482 = local439;
		}
		if (local163 < local442) {
			local163 = local442;
		}
		if (local167 > local151) {
			local167 = local151;
		}
		@Pc(529) Class2_Sub5_Sub18 local529 = null;
		if (arg12 != null) {
			@Pc(536) int local536 = arg12.anIntArray278[arg3];
			local529 = Static334.aClass62_2.method1414(local536 >> 16);
			arg3 = local536 & 0xFFFF;
		}
		if (local529 == null) {
			local59 = local59.method5737((byte) 3, local11, true);
			local59.n(local157 - local482 >> 1, 128, local167 - local163 >> 1);
			local59.a(local157 + local482 >> 1, 0, local163 + local167 >> 1);
		} else {
			local59 = local59.method5737((byte) 3, local11, true);
			local59.n(local157 - local482 >> 1, 128, local167 - local163 >> 1);
			local59.a(local482 + local157 >> 1, 0, local167 + local163 >> 1);
			local59.method5739(local529, arg3);
		}
		if (arg2 != 0) {
			local59.W(arg2);
		}
		if (arg10 != 0) {
			local59.K(arg10);
		}
		if (arg13 != 0) {
			local59.a(0, arg13, 0);
		}
		return local59;
	}
}
