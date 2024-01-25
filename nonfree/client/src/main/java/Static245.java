import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "F")
	public static float aFloat159;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "J")
	public static long aLong123;

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
	public static int anInt5496 = -1;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)Lclient!gba;")
	public static Class3_Sub22 method4648() {
		if (Static361.aClass276_14 == null || Static647.aClass271_1 == null) {
			return null;
		}
		Static647.aClass271_1.method6847(Static361.aClass276_14);
		@Pc(18) Class3_Sub22 local18 = (Class3_Sub22) Static647.aClass271_1.method6848();
		if (local18 == null) {
			return null;
		} else {
			@Pc(36) Class269 local36 = Static361.aClass115_3.method3752(local18.anInt4123);
			return local36 != null && local36.aBoolean692 && local36.method6796(Static361.anInterface6_2) ? local18 : Static309.method5218();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)V")
	public static void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static314.method5350(arg0, arg1);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!ha;IIIIILclient!rj;ILclient!ka;IIIII)Lclient!ka;")
	public static Class128 method4650(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class290 arg6, @OriginalArg(8) Class128 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg7 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg6 != null) {
			local11 = arg6.method7174(arg9, -1, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = (long) ((arg3 << 16) + arg10 + (arg11 << 24)) + ((long) arg1 << 32) + ((long) arg12 << 48);
		@Pc(49) Class112 local49 = Static185.aClass112_20;
		@Pc(57) Class128 local57;
		synchronized (Static185.aClass112_20) {
			local57 = (Class128) Static185.aClass112_20.method3640(local47);
		}
		if (local57 == null || arg0.method6220(local57.ua(), local11) != 0) {
			if (local57 != null) {
				local11 = arg0.method6176(local11, local57.ua());
			}
			@Pc(92) byte local92;
			if (arg10 == 1) {
				local92 = 9;
			} else if (arg10 == 2) {
				local92 = 12;
			} else if (arg10 == 3) {
				local92 = 15;
			} else if (arg10 == 4) {
				local92 = 18;
			} else {
				local92 = 21;
			}
			@Pc(129) int[] local129 = new int[] { 64, 96, 128 };
			@Pc(148) Class142 local148 = new Class142(local92 * 3 + 1, -local92 + local92 * 3 * 2, 0);
			@Pc(155) int local155 = local148.method4355(0, 0, 0);
			@Pc(159) int[][] local159 = new int[3][local92];
			@Pc(167) int local167;
			@Pc(171) int local171;
			@Pc(173) int local173;
			@Pc(197) int local197;
			for (@Pc(161) int local161 = 0; local161 < 3; local161++) {
				local167 = local129[local161];
				local171 = local129[local161];
				for (local173 = 0; local173 < local92; local173++) {
					@Pc(181) int local181 = (local173 << 14) / local92;
					@Pc(189) int local189 = Class3_Sub1_Sub2.anIntArray84[local181] * local167 >> 14;
					local197 = local171 * Class3_Sub1_Sub2.anIntArray85[local181] >> 14;
					local159[local161][local173] = local148.method4355(local197, local189, 0);
				}
			}
			for (local167 = 0; local167 < 3; local167++) {
				local171 = (local167 * 256 + 128) / 3;
				local173 = 256 - local171;
				@Pc(250) byte local250 = (byte) (local171 * arg11 + arg3 * local173 >> 8);
				@Pc(295) short local295 = (short) (((arg12 & 0x7F) * local171 + local173 * (arg1 & 0x7F) & 0x7F00) + ((arg12 & 0xFC00) * local171 + local173 * (arg1 & 0xFC00) & 0xFC0000) + (local171 * (arg12 & 0x380) + local173 * (arg1 & 0x380) & 0x38000) >> 8);
				for (local197 = 0; local197 < local92; local197++) {
					if (local167 == 0) {
						local148.method4365((short) -1, local159[0][(local197 + 1) % local92], (byte) 1, local250, local295, local159[0][local197], (byte) -1, local155);
					} else {
						local148.method4365((short) -1, local159[local167 - 1][(local197 + 1) % local92], (byte) 1, local250, local295, local159[local167][(local197 + 1) % local92], (byte) -1, local159[local167 - 1][local197]);
						local148.method4365((short) -1, local159[local167][(local197 + 1) % local92], (byte) 1, local250, local295, local159[local167][local197], (byte) -1, local159[local167 - 1][local197]);
					}
				}
			}
			local57 = arg0.method6157(local148, local11, Static618.anInt10216, 64, 768);
			@Pc(416) Class112 local416 = Static185.aClass112_20;
			synchronized (Static185.aClass112_20) {
				Static185.aClass112_20.method3636(local47, local57);
			}
		}
		@Pc(437) int local437 = arg7.V();
		@Pc(440) int local440 = arg7.RA();
		@Pc(443) int local443 = arg7.HA();
		@Pc(446) int local446 = arg7.G();
		@Pc(448) Class3_Sub1_Sub12 local448 = null;
		if (arg6 != null) {
			@Pc(455) int local455 = arg6.anIntArray550[arg9];
			local448 = Static618.aClass222_2.method5861(local455 >> 16);
			arg9 = local455 & 0xFFFF;
		}
		if (local448 == null) {
			local57 = local57.method6279((byte) 3, local11, true);
			local57.O(local440 - local437 >> 1, 128, local446 - local443 >> 1);
			local57.H(local437 + local440 >> 1, 0, local446 + local443 >> 1);
		} else {
			local57 = local57.method6279((byte) 3, local11, true);
			local57.O(local440 - local437 >> 1, 128, local446 - local443 >> 1);
			local57.H(local437 + local440 >> 1, 0, local446 + local443 >> 1);
			local57.method6293(arg9, local448);
		}
		if (arg5 != 0) {
			local57.FA(arg5);
		}
		if (arg2 != 0) {
			local57.VA(arg2);
		}
		if (arg8 != 0) {
			local57.H(0, arg8, 0);
		}
		return local57;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(JJ)J")
	public static long method4651(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!tn;)Lclient!fa;")
	public static Class41_Sub3 method4652(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(12) Class41 local12 = Static465.method6957(arg0);
		@Pc(16) int local16 = arg0.method8402();
		@Pc(20) int local20 = arg0.method8402();
		@Pc(24) int local24 = arg0.method8414();
		return new Class41_Sub3(local12.aClass117_13, local12.aClass178_12, local12.anInt9780, local12.anInt9781, local12.anInt9779, local12.anInt9773, local12.anInt9775, local12.anInt9771, local12.anInt9777, local16, local20, local24);
	}
}
