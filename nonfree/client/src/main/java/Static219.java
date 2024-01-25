import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!wf;")
	public static Class269 aClass269_3;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_60 = new Class212(38, 2);

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	public static int anInt4437 = 16777215;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!kg;IIIIILclient!qa;ILclient!ka;IIIIII)Lclient!ka;")
	public static Class57 method3807(@OriginalArg(0) Class130 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class30 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class57 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (arg8 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg0 != null) {
			local11 = arg0.method3539(arg1, -1, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = ((long) arg9 << 48) + (long) ((arg12 << 16) + (arg5 + (arg2 << 24))) + ((long) arg13 << 32);
		@Pc(51) Class83 local51 = Static408.aClass83_58;
		@Pc(59) Class57 local59;
		synchronized (Static408.aClass83_58) {
			local59 = (Class57) Static408.aClass83_58.method2338(local49);
		}
		@Pc(156) int local156;
		@Pc(162) int local162;
		@Pc(168) int local168;
		@Pc(172) int local172;
		if (local59 == null || arg6.method2065(local59.ma(), local11) != 0) {
			if (local59 != null) {
				local11 = arg6.method2102(local11, local59.ma());
			}
			@Pc(91) byte local91;
			if (arg5 == 1) {
				local91 = 9;
			} else if (arg5 == 2) {
				local91 = 12;
			} else if (arg5 == 3) {
				local91 = 15;
			} else if (arg5 == 4) {
				local91 = 18;
			} else {
				local91 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(149) Class37 local149 = new Class37(local91 * 3 + 1, -local91 + local91 * 3 * 2, 0);
			local156 = local149.method1001(0, 0, 0);
			@Pc(160) int[][] local160 = new int[3][local91];
			@Pc(174) int local174;
			@Pc(198) int local198;
			for (local162 = 0; local162 < 3; local162++) {
				local168 = local130[local162];
				local172 = local130[local162];
				for (local174 = 0; local174 < local91; local174++) {
					@Pc(182) int local182 = (local174 << 14) / local91;
					@Pc(190) int local190 = Class4_Sub13.anIntArray497[local182] * local168 >> 15;
					local198 = Class4_Sub13.anIntArray496[local182] * local172 >> 15;
					local160[local162][local174] = local149.method1001(local190, local198, 0);
				}
			}
			for (local168 = 0; local168 < 3; local168++) {
				local172 = (local168 * 256 + 128) / 3;
				local174 = 256 - local172;
				@Pc(253) byte local253 = (byte) (local174 * arg12 + local172 * arg2 >> 8);
				@Pc(298) short local298 = (short) (((arg9 & 0x7F) * local172 + local174 * (arg13 & 0x7F) & 0x7F00) + (local174 * (arg13 & 0xFC00) + local172 * (arg9 & 0xFC00) & 0xFC0000) + (local174 * (arg13 & 0x380) + local172 * (arg9 & 0x380) & 0x38000) >> 8);
				for (local198 = 0; local198 < local91; local198++) {
					if (local168 == 0) {
						local149.method1005(local156, local160[0][local198], (short) -1, local160[0][(local198 + 1) % local91], (byte) 1, (byte) -1, local253, local298);
					} else {
						local149.method1005(local160[local168 - 1][local198], local160[local168][(local198 + 1) % local91], (short) -1, local160[local168 - 1][(local198 + 1) % local91], (byte) 1, (byte) -1, local253, local298);
						local149.method1005(local160[local168 - 1][local198], local160[local168][local198], (short) -1, local160[local168][(local198 + 1) % local91], (byte) 1, (byte) -1, local253, local298);
					}
				}
			}
			local59 = arg6.method2036(local149, local11, Static99.anInt2119, 64, 768);
			@Pc(421) Class83 local421 = Static408.aClass83_58;
			synchronized (Static408.aClass83_58) {
				Static408.aClass83_58.method2337(local59, local49);
			}
		}
		@Pc(442) int local442 = (arg5 << 6) - 1;
		@Pc(445) int local445 = -local442;
		@Pc(448) int local448 = -local442;
		@Pc(450) int local450 = local442;
		local156 = local442;
		if (arg3 != 0) {
			if ((arg3 & 0x4) != 0) {
				local450 = local442 + 128;
			}
			if ((arg3 & 0x2) != 0) {
				local448 -= 128;
			}
			if ((arg3 & 0x8) != 0) {
				local445 -= 128;
			}
			if ((arg3 & 0x1) != 0) {
				local156 = local442 + 128;
			}
		}
		@Pc(483) int local483 = arg8.da();
		local162 = arg8.J();
		local168 = arg8.K();
		if (local168 < local448) {
			local168 = local448;
		}
		local172 = arg8.ia();
		if (local162 > local450) {
			local162 = local450;
		}
		if (local445 > local483) {
			local483 = local445;
		}
		if (local156 < local172) {
			local172 = local156;
		}
		@Pc(518) Class4_Sub1_Sub17 local518 = null;
		if (arg0 != null) {
			@Pc(525) int local525 = arg0.anIntArray306[arg1];
			local518 = Static143.aClass85_1.method2403(local525 >> 16);
			arg1 = local525 & 0xFFFF;
		}
		if (local518 == null) {
			local59 = local59.method6075((byte) 3, local11, true);
			local59.Z(local162 - local483 >> 1, 128, local172 - local168 >> 1);
			local59.R(local483 + local162 >> 1, 0, local168 + local172 >> 1);
		} else {
			local59 = local59.method6075((byte) 3, local11, true);
			local59.Z(local162 - local483 >> 1, 128, local172 - local168 >> 1);
			local59.R(local483 + local162 >> 1, 0, local172 + local168 >> 1);
			local59.method6072(arg1, local518);
		}
		if (arg4 != 0) {
			local59.E(arg4);
		}
		if (arg11 != 0) {
			local59.S(arg11);
		}
		if (arg10 != 0) {
			local59.R(0, arg10, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method3808() {
		Static149.aClass96_19.method2799();
		Static291.aClass252_9.method5696();
		Static127.aClass252_2.method5696();
	}
}
