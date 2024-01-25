import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!id", name = "k", descriptor = "[I")
	public static final int[] anIntArray140 = new int[13];

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_117 = new Class137(40, 3);

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	public static int anInt2764 = 0;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "S")
	public static short aShort31 = 1;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	public static int anInt2765 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!nm;Lclient!qa;IILclient!c;ZIBIIIIIII)Lclient!c;")
	public static Class33 method2298(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class33 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg4 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg0 != null) {
			local11 = arg0.method3428(arg8, -1, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = ((long) arg10 << 48) + ((long) arg6 << 32) + (long) ((arg13 << 24) + (arg11 << 16) + arg3);
		@Pc(51) Class167 local51 = Static250.aClass167_9;
		@Pc(59) Class33 local59;
		synchronized (Static250.aClass167_9) {
			local59 = (Class33) Static250.aClass167_9.method3386(local49);
		}
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(169) int local169;
		@Pc(173) int local173;
		if (local59 == null || arg1.method3605(local59.n(), local11) != 0) {
			if (local59 != null) {
				local11 = arg1.method3554(local11, local59.n());
			}
			@Pc(101) byte local101;
			if (arg3 == 1) {
				local101 = 9;
			} else if (arg3 == 2) {
				local101 = 12;
			} else if (arg3 == 3) {
				local101 = 15;
			} else if (arg3 == 4) {
				local101 = 18;
			} else {
				local101 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(148) Class199 local148 = new Class199(local101 * 3 + 1, -local101 + local101 * 3 * 2, 0);
			local157 = local148.method4136(0, 0, 0);
			@Pc(161) int[][] local161 = new int[3][local101];
			@Pc(175) int local175;
			@Pc(199) int local199;
			for (local163 = 0; local163 < 3; local163++) {
				local169 = local130[local163];
				local173 = local130[local163];
				for (local175 = 0; local175 < local101; local175++) {
					@Pc(183) int local183 = (local175 << 14) / local101;
					@Pc(191) int local191 = local169 * Class1_Sub1_Sub25.anIntArray249[local183] >> 15;
					local199 = Class1_Sub1_Sub25.anIntArray248[local183] * local173 >> 15;
					local161[local163][local175] = local148.method4136(local199, 0, local191);
				}
			}
			for (local169 = 0; local169 < 3; local169++) {
				local173 = (local169 * 256 + 128) / 3;
				local175 = 256 - local173;
				@Pc(250) byte local250 = (byte) (local175 * arg11 + local173 * arg13 >> 8);
				@Pc(295) short local295 = (short) (((arg10 & 0x7F) * local173 + (arg6 & 0x7F) * local175 & 0x7F00) + (local173 * (arg10 & 0x380) + (arg6 & 0x380) * local175 & 0x38000) + ((arg10 & 0xFC00) * local173 + (arg6 & 0xFC00) * local175 & 0xFC0000) >> 8);
				for (local199 = 0; local199 < local101; local199++) {
					if (local169 == 0) {
						local148.method4124(local250, local161[0][local199], (short) -1, (byte) -1, local157, local161[0][(local199 + 1) % local101], (byte) 1, local295);
					} else {
						local148.method4124(local250, local161[local169][(local199 + 1) % local101], (short) -1, (byte) -1, local161[local169 - 1][local199], local161[local169 - 1][(local199 + 1) % local101], (byte) 1, local295);
						local148.method4124(local250, local161[local169][local199], (short) -1, (byte) -1, local161[local169 - 1][local199], local161[local169][(local199 + 1) % local101], (byte) 1, local295);
					}
				}
			}
			local59 = arg1.method3602(local148, local11, Static180.anInt2931, 64, 768);
			@Pc(417) Class167 local417 = Static250.aClass167_9;
			synchronized (Static250.aClass167_9) {
				Static250.aClass167_9.method3392(local59, local49);
			}
		}
		@Pc(436) int local436 = (arg3 << 6) - 1;
		@Pc(444) int local444 = -local436;
		@Pc(447) int local447 = -local436;
		@Pc(449) int local449 = local436;
		local157 = local436;
		if (arg5) {
			if (arg7 > 1024 && arg7 < 7168) {
				local444 -= 128;
			}
			if (arg7 > 5120 && arg7 < 11264) {
				local157 = local436 + 128;
			}
			if (arg7 > 13312 || arg7 < 3072) {
				local447 -= 128;
			}
			if (arg7 > 9216 && arg7 < 15360) {
				local449 = local436 + 128;
			}
		}
		@Pc(492) int local492 = arg4.la();
		local163 = arg4.VA();
		local169 = arg4.X();
		if (local444 > local492) {
			local492 = local444;
		}
		if (local163 > local449) {
			local163 = local449;
		}
		if (local447 > local169) {
			local169 = local447;
		}
		local173 = arg4.C();
		if (local173 > local157) {
			local173 = local157;
		}
		@Pc(531) Class1_Sub3_Sub11 local531 = null;
		if (arg0 != null) {
			@Pc(538) int local538 = arg0.anIntArray235[arg8];
			local531 = Static152.aClass213_1.method4412(local538 >> 16);
			arg8 = local538 & 0xFFFF;
		}
		if (local531 == null) {
			local59 = local59.method5383((byte) 3, local11, true);
			local59.XA(local163 - local492 >> 1, 128, local173 - local169 >> 1);
			local59.ja(local492 + local163 >> 1, 0, local169 + local173 >> 1);
		} else {
			local59 = local59.method5383((byte) 3, local11, true);
			local59.XA(local163 - local492 >> 1, 128, local173 - local169 >> 1);
			local59.ja(local492 + local163 >> 1, 0, local173 + local169 >> 1);
			local59.method5381(arg8, local531);
		}
		if (arg12 != 0) {
			local59.WA(arg12);
		}
		if (arg9 != 0) {
			local59.o(arg9);
		}
		if (arg2 != 0) {
			local59.ja(0, arg2, 0);
		}
		return local59;
	}
}
