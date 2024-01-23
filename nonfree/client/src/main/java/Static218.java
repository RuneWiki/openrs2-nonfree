import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	public static int anInt4880;

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
	public static int anInt4883;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "[I")
	public static int[] anIntArray494 = new int[500];

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "[I")
	public static int[] anIntArray495 = new int[256];

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
	public static int anInt4881 = 0;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "Z")
	public static boolean aBoolean267 = false;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIILclient!h;IJ)Z")
	public static boolean method3880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class25 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static48.method1027(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method3881(@OriginalArg(1) Class83 arg0) {
		Static145.aClass83_107 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIILclient!lf;IIIIZIILclient!v;)Lclient!lf;")
	public static Class25_Sub2 method3882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class25_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class163 arg12) {
		@Pc(26) long local26 = ((long) arg2 << 48) + ((long) arg7 << 32) + (long) ((arg10 << 24) + (arg8 << 16) + arg11);
		@Pc(32) Class25_Sub2 local32 = (Class25_Sub2) Static5.aClass155_1.method4358(local26);
		@Pc(111) int local111;
		@Pc(113) int local113;
		@Pc(124) int local124;
		@Pc(120) int local120;
		@Pc(149) int local149;
		if (local32 == null) {
			@Pc(52) int[] local52 = new int[] { 64, 96, 128 };
			@Pc(65) byte local65;
			if (arg11 == 1) {
				local65 = 9;
			} else if (arg11 == 2) {
				local65 = 12;
			} else if (arg11 == 3) {
				local65 = 15;
			} else if (arg11 == 4) {
				local65 = 18;
			} else {
				local65 = 21;
			}
			@Pc(88) int[][] local88 = new int[3][local65];
			@Pc(105) Class25_Sub3 local105 = new Class25_Sub3(local65 * 3 + 1, local65 * 2 * 3 - local65, 0);
			local111 = local105.method2803(0, 0);
			for (local113 = 0; local113 < 3; local113++) {
				local120 = local52[local113];
				local124 = local52[local113];
				for (@Pc(126) int local126 = 0; local126 < local65; local126++) {
					@Pc(139) int local139 = (local126 << 11) / local65;
					local149 = local124 * Class91.anIntArray319[local139] + arg4 >> 16;
					@Pc(159) int local159 = arg6 + Class91.anIntArray320[local139] * local120 >> 16;
					local88[local113][local126] = local105.method2803(local149, local159);
				}
			}
			for (local113 = 0; local113 < 3; local113++) {
				local124 = (local113 * 256 + 128) / 3;
				local120 = 256 - local124;
				@Pc(204) byte local204 = (byte) (arg8 * local120 + local124 * arg10 >> 8);
				@Pc(249) short local249 = (short) ((local124 * (arg2 & 0x7F) + local120 * (arg7 & 0x7F) & 0x7F00) + (local120 * (arg7 & 0xFC00) + (arg2 & 0xFC00) * local124 & 0xFC0000) + ((arg7 & 0x380) * local120 + local124 * (arg2 & 0x380) & 0x38000) >> 8);
				for (local149 = 0; local149 < local65; local149++) {
					if (local113 == 0) {
						local105.method2802(local111, local88[0][(local149 + 1) % local65], local88[0][local149], local249, local204);
					} else {
						local105.method2802(local88[local113 - 1][local149], local88[local113 - 1][(local149 + 1) % local65], local88[local113][(local149 + 1) % local65], local249, local204);
						local105.method2802(local88[local113 - 1][local149], local88[local113][(local149 + 1) % local65], local88[local113][local149], local249, local204);
					}
				}
			}
			local32 = local105.method2821(64, 768, -50, -10, -50);
			Static5.aClass155_1.method4360(local26, local32);
		}
		@Pc(367) int local367 = arg11 * 64 - 1;
		@Pc(370) int local370 = -local367;
		@Pc(373) int local373 = -local367;
		@Pc(375) int local375 = local367;
		local111 = local367;
		@Pc(386) int local386 = arg5.method3475();
		if (arg9) {
			if (arg1 > 640 && arg1 < 1408) {
				local111 = local367 + 128;
			}
			if (arg1 > 1152 && arg1 < 1920) {
				local375 = local367 + 128;
			}
			if (arg1 > 1664 || arg1 < 384) {
				local370 -= 128;
			}
			if (arg1 > 128 && arg1 < 896) {
				local373 -= 128;
			}
		}
		if (local373 > local386) {
			local386 = local373;
		}
		local113 = arg5.method3466();
		if (local375 < local113) {
			local113 = local375;
		}
		local124 = arg5.method3489();
		if (local370 > local124) {
			local124 = local370;
		}
		@Pc(457) Class1_Sub2_Sub12 local457 = null;
		local120 = arg5.method3470();
		if (arg12 != null) {
			@Pc(467) int local467 = arg12.anIntArray587[arg0];
			local457 = Static283.method4670(local467 >> 16);
			arg0 = local467 & 0xFFFF;
		}
		if (local120 > local111) {
			local120 = local111;
		}
		if (local457 == null) {
			local32 = local32.method3463(true, true, true);
			local32.method3486((local113 - local386) / 2, 128, (local120 - local124) / 2);
			local32.method3474((local113 + local386) / 2, 0, (local124 + local120) / 2);
		} else {
			local32 = local32.method3463(!local457.method1921(arg0), !local457.method1922(arg0), true);
			local32.method3486((local113 - local386) / 2, 128, (local120 - local124) / 2);
			local32.method3474((local113 + local386) / 2, 0, (local120 + local124) / 2);
			local32.method3478(local457, arg0);
		}
		if (arg1 != 0) {
			local32.method3480(arg1);
		}
		if (Static296.aBoolean335) {
			@Pc(655) Class25_Sub2_Sub1 local655 = (Class25_Sub2_Sub1) local32;
			if (Static220.method3905(arg4 + local386, arg6 + local124, Static145.anInt3477) != arg3 || Static220.method3905(arg4 + local113, local120 + arg6, Static145.anInt3477) != arg3) {
				for (local149 = 0; local149 < local655.anInt794; local149++) {
					local655.anIntArray82[local149] += Static220.method3905(arg4 + local655.anIntArray81[local149], local655.anIntArray84[local149] - -arg6, Static145.anInt3477) - arg3;
				}
				local655.aClass167_1.aBoolean320 = false;
				local655.aClass77_1.aBoolean145 = false;
			}
		} else {
			@Pc(582) Class25_Sub2_Sub2 local582 = (Class25_Sub2_Sub2) local32;
			if (arg3 != Static220.method3905(local386 + arg4, arg6 + local124, Static145.anInt3477) || Static220.method3905(arg4 + local113, local120 + arg6, Static145.anInt3477) != arg3) {
				for (local149 = 0; local149 < local582.anInt4409; local149++) {
					local582.anIntArray421[local149] += Static220.method3905(arg4 + local582.anIntArray409[local149], arg6 + local582.anIntArray414[local149], Static145.anInt3477) - arg3;
				}
				local582.aBoolean233 = false;
			}
		}
		return local32;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public static void method3883() {
		Static80.aClass155_12.method4354();
		Static146.aClass155_29.method4354();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)Lclient!ul;")
	public static Class162 method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass162_1 == null ? null : local7.aClass162_1;
	}
}
