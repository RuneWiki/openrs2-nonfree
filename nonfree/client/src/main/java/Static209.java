import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "Z")
	public static boolean aBoolean145;

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
	public static int anInt1846;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
	public static int anInt1845 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)I")
	public static int method1565(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIII)V")
	public static void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub3_Sub16 local8 = Static119.method2204(arg0, 9);
		local8.method2718();
		local8.anInt3327 = arg1;
		local8.anInt3323 = arg2;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIILclient!r;Lclient!bd;IIZIIIII)Lclient!r;")
	public static Class36_Sub2 method1568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36_Sub2 arg3, @OriginalArg(5) Class15 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(23) long local23 = ((long) arg0 << 48) + (long) ((arg2 << 24) + (arg12 << 16) + arg9) + ((long) arg8 << 32);
		@Pc(33) Class36_Sub2 local33 = (Class36_Sub2) Static174.aClass46_30.method1074(local23);
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(127) int local127;
		@Pc(131) int local131;
		@Pc(153) int local153;
		if (local33 == null) {
			@Pc(40) byte local40;
			if (arg9 == 1) {
				local40 = 9;
			} else if (arg9 == 2) {
				local40 = 12;
			} else if (arg9 == 3) {
				local40 = 15;
			} else if (arg9 == 4) {
				local40 = 18;
			} else {
				local40 = 21;
			}
			@Pc(86) int[] local86 = new int[] { 64, 96, 128 };
			@Pc(104) Class36_Sub6 local104 = new Class36_Sub6(local40 * 3 + 1, -local40 + local40 * 3 * 2, 0);
			@Pc(108) int[][] local108 = new int[3][local40];
			local114 = local104.method4057(0, 0);
			for (local116 = 0; local116 < 3; local116++) {
				local127 = local86[local116];
				local131 = local86[local116];
				for (@Pc(133) int local133 = 0; local133 < local40; local133++) {
					@Pc(142) int local142 = (local133 << 11) / local40;
					local153 = arg6 + Class66.anIntArray148[local142] * local127 >> 16;
					@Pc(163) int local163 = arg1 + Class66.anIntArray153[local142] * local131 >> 16;
					local108[local116][local133] = local104.method4057(local153, local163);
				}
			}
			for (local116 = 0; local116 < 3; local116++) {
				local127 = (local116 * 256 + 128) / 3;
				local131 = 256 - local127;
				@Pc(212) byte local212 = (byte) (local127 * arg2 + arg12 * local131 >> 8);
				@Pc(257) short local257 = (short) ((local127 * (arg0 & 0x7F) + (arg8 & 0x7F) * local131 & 0x7F00) + (local131 * (arg8 & 0xFC00) + (arg0 & 0xFC00) * local127 & 0xFC0000) + (local131 * (arg8 & 0x380) + local127 * (arg0 & 0x380) & 0x38000) >> 8);
				for (local153 = 0; local153 < local40; local153++) {
					if (local116 == 0) {
						local104.method4042(local114, local108[0][(local153 + 1) % local40], local108[0][local153], local257, local212);
					} else {
						local104.method4042(local108[local116 - 1][local153], local108[local116 - 1][(local153 + 1) % local40], local108[local116][(local153 + 1) % local40], local257, local212);
						local104.method4042(local108[local116 - 1][local153], local108[local116][(local153 + 1) % local40], local108[local116][local153], local257, local212);
					}
				}
			}
			local33 = local104.method4049(64, 768, -50, -10, -50);
			Static174.aClass46_30.method1071(local33, local23);
		}
		@Pc(377) int local377 = arg9 * 64 - 1;
		@Pc(380) int local380 = -local377;
		@Pc(383) int local383 = -local377;
		@Pc(385) int local385 = local377;
		local114 = local377;
		if (arg7) {
			if (arg10 > 640 && arg10 < 1408) {
				local114 = local377 + 128;
			}
			if (arg10 > 1664 || arg10 < 384) {
				local380 -= 128;
			}
			if (arg10 > 128 && arg10 < 896) {
				local383 -= 128;
			}
			if (arg10 > 1152 && arg10 < 1920) {
				local385 = local377 + 128;
			}
		}
		@Pc(430) int local430 = arg3.method3847();
		local116 = arg3.method3841();
		if (local383 > local430) {
			local430 = local383;
		}
		local127 = arg3.method3852();
		if (local127 < local380) {
			local127 = local380;
		}
		if (local116 > local385) {
			local116 = local385;
		}
		local131 = arg3.method3848();
		if (local131 > local114) {
			local131 = local114;
		}
		@Pc(469) Class2_Sub3_Sub13 local469 = null;
		if (arg4 != null) {
			@Pc(477) int local477 = arg4.anIntArray26[arg5];
			local469 = Static67.method4883(local477 >> 16);
			arg5 = local477 & 0xFFFF;
		}
		if (local469 == null) {
			local33 = local33.method3856(true, true, true);
			local33.method3853((local116 - local430) / 2, 128, (local131 - local127) / 2);
			local33.method3834((local430 + local116) / 2, 0, (local127 + local131) / 2);
		} else {
			local33 = local33.method3856(!local469.method2470(arg5), !local469.method2467(arg5), true);
			local33.method3853((local116 - local430) / 2, 128, (local131 - local127) / 2);
			local33.method3834((local430 + local116) / 2, 0, (local127 + local131) / 2);
			local33.method3829(local469, arg5);
		}
		if (arg10 != 0) {
			local33.method3844(arg10);
		}
		if (Static60.aBoolean106) {
			@Pc(671) Class36_Sub2_Sub1 local671 = (Class36_Sub2_Sub1) local33;
			if (arg11 != Static99.method1894(Static208.anInt4335, local127 + arg1, local430 + arg6) || arg11 != Static99.method1894(Static208.anInt4335, local131 + arg1, local116 + arg6)) {
				for (local153 = 0; local153 < local671.anInt1109; local153++) {
					local671.anIntArray83[local153] += Static99.method1894(Static208.anInt4335, local671.anIntArray86[local153] + arg1, local671.anIntArray87[local153] + arg6) - arg11;
				}
				local671.aClass157_1.aBoolean411 = false;
				local671.aClass105_1.aBoolean261 = false;
			}
		} else {
			@Pc(601) Class36_Sub2_Sub2 local601 = (Class36_Sub2_Sub2) local33;
			if (Static99.method1894(Static208.anInt4335, local127 + arg1, local430 + arg6) != arg11 || arg11 != Static99.method1894(Static208.anInt4335, arg1 + local131, arg6 - -local116)) {
				for (local153 = 0; local153 < local601.anInt4749; local153++) {
					local601.anIntArray401[local153] += Static99.method1894(Static208.anInt4335, arg1 + local601.anIntArray403[local153], arg6 + local601.anIntArray409[local153]) - arg11;
				}
				local601.aBoolean400 = false;
			}
		}
		return local33;
	}
}
