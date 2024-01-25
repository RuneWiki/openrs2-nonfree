import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "Lclient!tj;")
	public static Class193 aClass193_3;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	public static int anInt109;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "[Lclient!ba;")
	public static final Class15[] aClass15Array1 = new Class15[6];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!fa;IBI)V")
	public static void method116(@OriginalArg(0) Class8_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt4954 && arg2 != -1) {
			@Pc(83) Class14 local83 = Static225.method4042(arg2);
			@Pc(86) int local86 = local83.anInt351;
			if (local86 == 1) {
				arg0.anInt4935 = arg1;
				arg0.anInt4969 = 1;
				arg0.anInt4959 = 0;
				arg0.anInt4945 = 0;
				arg0.anInt4961 = 0;
				Static167.method3265(arg0.anInt6701, arg0.anInt6702, arg0.anInt4961, Static158.aClass8_Sub1_Sub2_Sub1_1 == arg0, local83);
			}
			if (local86 == 2) {
				arg0.anInt4959 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt4954 == -1 || Static225.method4042(arg2).anInt344 >= Static225.method4042(arg0.anInt4954).anInt344) {
			arg0.anInt4959 = 0;
			arg0.anInt4981 = arg0.anInt4987;
			arg0.anInt4961 = 0;
			arg0.anInt4935 = arg1;
			arg0.anInt4945 = 0;
			arg0.anInt4969 = 1;
			arg0.anInt4954 = arg2;
			if (arg0.anInt4954 != -1) {
				Static167.method3265(arg0.anInt6701, arg0.anInt6702, arg0.anInt4961, Static158.aClass8_Sub1_Sub2_Sub1_1 == arg0, Static225.method4042(arg0.anInt4954));
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!vq;IIILclient!ni;IZIILclient!b;IBIII)Lclient!ni;")
	public static Class38 method119(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class38 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class14 arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg4 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg9 != null) {
			local11 = arg9.method311(arg3, false, -1) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = (long) (arg2 + (arg1 << 16) + (arg5 << 24)) + ((long) arg11 << 32) + ((long) arg7 << 48);
		@Pc(51) Class198 local51 = Static288.aClass198_207;
		@Pc(59) Class38 local59;
		synchronized (Static288.aClass198_207) {
			local59 = (Class38) Static288.aClass198_207.method5210(local49);
		}
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(169) int local169;
		@Pc(173) int local173;
		if (local59 == null || arg0.method2695(local59.method1898(), local11) != 0) {
			if (local59 != null) {
				local11 = arg0.method2742(local11, local59.method1898());
			}
			@Pc(88) byte local88;
			if (arg2 == 1) {
				local88 = 9;
			} else if (arg2 == 2) {
				local88 = 12;
			} else if (arg2 == 3) {
				local88 = 15;
			} else if (arg2 == 4) {
				local88 = 18;
			} else {
				local88 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(148) Class165 local148 = new Class165(local88 * 3 + 1, -local88 + local88 * 3 * 2, 0);
			local157 = local148.method4488(0, 0, 0);
			@Pc(161) int[][] local161 = new int[3][local88];
			@Pc(175) int local175;
			@Pc(199) int local199;
			for (local163 = 0; local163 < 3; local163++) {
				local169 = local130[local163];
				local173 = local130[local163];
				for (local175 = 0; local175 < local88; local175++) {
					@Pc(183) int local183 = (local175 << 14) / local88;
					@Pc(191) int local191 = Class118_Sub1.anIntArray314[local183] * local169 >> 15;
					local199 = local173 * Class118_Sub1.anIntArray317[local183] >> 15;
					local161[local163][local175] = local148.method4488(local191, local199, 0);
				}
			}
			for (local169 = 0; local169 < 3; local169++) {
				local173 = (local169 * 256 + 128) / 3;
				local175 = 256 - local173;
				@Pc(250) byte local250 = (byte) (arg5 * local173 + local175 * arg1 >> 8);
				@Pc(295) short local295 = (short) ((local173 * (arg7 & 0x7F) + (arg11 & 0x7F) * local175 & 0x7F00) + (local173 * (arg7 & 0x380) + local175 * (arg11 & 0x380) & 0x38000) + ((arg11 & 0xFC00) * local175 + local173 * (arg7 & 0xFC00) & 0xFC0000) >> 8);
				for (local199 = 0; local199 < local88; local199++) {
					if (local169 == 0) {
						local148.method4485(local250, (short) -1, local157, (byte) -1, (byte) 1, local161[0][(local199 + 1) % local88], local295, local161[0][local199]);
					} else {
						local148.method4485(local250, (short) -1, local161[local169 - 1][local199], (byte) -1, (byte) 1, local161[local169 - 1][(local199 + 1) % local88], local295, local161[local169][(local199 + 1) % local88]);
						local148.method4485(local250, (short) -1, local161[local169 - 1][local199], (byte) -1, (byte) 1, local161[local169][(local199 + 1) % local88], local295, local161[local169][local199]);
					}
				}
			}
			local59 = arg0.method2717(local148, local11, Static6.anInt176, 64, 768);
			@Pc(418) Class198 local418 = Static288.aClass198_207;
			synchronized (Static288.aClass198_207) {
				Static288.aClass198_207.method5201(local59, local49);
			}
		}
		@Pc(437) int local437 = arg2 * 64 - 1;
		@Pc(440) int local440 = -local437;
		@Pc(443) int local443 = -local437;
		@Pc(445) int local445 = local437;
		local157 = local437;
		if (arg6) {
			if (arg8 > 9216 && arg8 < 15360) {
				local445 = local437 + 128;
			}
			if (arg8 > 1024 && arg8 < 7168) {
				local440 -= 128;
			}
			if (arg8 > 13312 || arg8 < 3072) {
				local443 -= 128;
			}
			if (arg8 > 5120 && arg8 < 11264) {
				local157 = local437 + 128;
			}
		}
		@Pc(489) int local489 = arg4.method1888();
		local163 = arg4.method1907();
		local169 = arg4.method1909();
		local173 = arg4.method1892();
		if (local169 < local443) {
			local169 = local443;
		}
		if (local163 > local445) {
			local163 = local445;
		}
		if (local489 < local440) {
			local489 = local440;
		}
		if (local157 < local173) {
			local173 = local157;
		}
		@Pc(536) Class4_Sub4_Sub15 local536 = null;
		if (arg9 != null) {
			@Pc(543) int local543 = arg9.anIntArray12[arg3];
			local536 = Static287.method3916(local543 >> 16);
			arg3 = local543 & 0xFFFF;
		}
		if (local536 == null) {
			local59 = local59.method1915((byte) 3, local11, true);
			local59.method1919((local163 - local489) / 2, 128, (local173 - local169) / 2);
			local59.method1883((local163 + local489) / 2, 0, (local173 + local169) / 2);
		} else {
			local59 = local59.method1915((byte) 3, local11, true);
			local59.method1919((local163 - local489) / 2, 128, (local173 - local169) / 2);
			local59.method1883((local163 + local489) / 2, 0, (local169 + local173) / 2);
			local59.method1923(local536, arg3);
		}
		if (arg13 != 0) {
			local59.method1913(arg13);
		}
		if (arg10 != 0) {
			local59.method1897(arg10);
		}
		if (arg12 != 0) {
			local59.method1883(0, arg12, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!tj;BI)Lclient!bb;")
	public static Class16 method120(@OriginalArg(0) Class193 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5049(arg1);
		return local13 == null ? null : new Class16(local13);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
	public static void method122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class4_Sub4_Sub18 local13 = Static302.method4961(arg3, 8);
		local13.method4908();
		local13.anInt5705 = arg0;
		local13.anInt5703 = arg1;
		local13.anInt5704 = arg2;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZILjava/lang/String;Lclient!ug;)V")
	public static void method124(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class51 arg2) {
		@Pc(30) int local30 = Static330.aClass16_7.method326(arg1, null, 250);
		@Pc(39) int local39 = Static330.aClass16_7.method317(250, null, arg1) * 13;
		Static274.aClass47_9.method2682(6, 6, local30 + 4 + 4, local39 + 4 + 4, -16777216, 0);
		Static274.aClass47_9.method2759(6, 6, local30 + 4 + 4, 4 + 4 + local39, -1, 0);
		arg2.method4244(0, 1, -1, arg1, 1, 10, local39, null, 10, -1, 0, null, 0, local30, null);
		Static168.method5617(local39 + 4 + 4, 6, 6, local30 + 4 + 4);
		if (arg0) {
			Static274.aClass47_9.method2756();
		}
	}
}
