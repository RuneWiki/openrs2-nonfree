import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!vl", name = "R", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!vl", name = "U", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!vl", name = "L", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_39 = new Class133(57, 6);

	@OriginalMember(owner = "client!vl", name = "Q", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_40 = new Class133(25, 10);

	@OriginalMember(owner = "client!vl", name = "S", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_41 = new Class133(64, 3);

	@OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
	public static int anInt1786 = -1;

	@OriginalMember(owner = "client!vl", name = "V", descriptor = "[Lclient!un;")
	public static final Class296[] aClass296Array2 = new Class296[8];

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIILclient!hi;IILclient!ba;IIIIILclient!oa;)Lclient!ba;")
	public static Class2 method1673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class122 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class5 arg13) {
		if (arg8 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg5 != null) {
			local11 = arg5.method3439(-1, arg3, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg11 << 32) + (long) (arg6 + (arg1 << 16) + (arg10 << 24)) + ((long) arg2 << 48);
		@Pc(49) Class125 local49 = Static260.aClass125_36;
		@Pc(57) Class2 local57;
		synchronized (Static260.aClass125_36) {
			local57 = (Class2) Static260.aClass125_36.method3512(local47);
		}
		@Pc(153) int local153;
		@Pc(159) int local159;
		@Pc(165) int local165;
		@Pc(169) int local169;
		if (local57 == null || arg13.method7435(local57.h(), local11) != 0) {
			if (local57 != null) {
				local11 = arg13.method7418(local11, local57.h());
			}
			@Pc(86) byte local86;
			if (arg6 == 1) {
				local86 = 9;
			} else if (arg6 == 2) {
				local86 = 12;
			} else if (arg6 == 3) {
				local86 = 15;
			} else if (arg6 == 4) {
				local86 = 18;
			} else {
				local86 = 21;
			}
			@Pc(128) int[] local128 = new int[] { 64, 96, 128 };
			@Pc(146) Class222 local146 = new Class222(local86 * 3 + 1, local86 * 2 * 3 + -local86, 0);
			local153 = local146.method5595(0, 0, 0);
			@Pc(157) int[][] local157 = new int[3][local86];
			@Pc(171) int local171;
			@Pc(195) int local195;
			for (local159 = 0; local159 < 3; local159++) {
				local165 = local128[local159];
				local169 = local128[local159];
				for (local171 = 0; local171 < local86; local171++) {
					@Pc(179) int local179 = (local171 << 14) / local86;
					@Pc(187) int local187 = Class5.anIntArray761[local179] * local165 >> 14;
					local195 = local169 * Class5.anIntArray760[local179] >> 14;
					local157[local159][local171] = local146.method5595(local187, local195, 0);
				}
			}
			for (local165 = 0; local165 < 3; local165++) {
				local169 = (local165 * 256 + 128) / 3;
				local171 = 256 - local169;
				@Pc(246) byte local246 = (byte) (arg1 * local171 + local169 * arg10 >> 8);
				@Pc(291) short local291 = (short) ((local169 * (arg2 & 0x380) + local171 * (arg11 & 0x380) & 0x38000) + ((arg11 & 0xFC00) * local171 + (arg2 & 0xFC00) * local169 & 0xFC0000) + (local171 * (arg11 & 0x7F) + (arg2 & 0x7F) * local169 & 0x7F00) >> 8);
				for (local195 = 0; local195 < local86; local195++) {
					if (local165 == 0) {
						local146.method5596(local291, local153, (byte) 1, local157[0][local195], local246, (byte) -1, local157[0][(local195 + 1) % local86], (short) -1);
					} else {
						local146.method5596(local291, local157[local165 - 1][local195], (byte) 1, local157[local165][(local195 + 1) % local86], local246, (byte) -1, local157[local165 - 1][(local195 + 1) % local86], (short) -1);
						local146.method5596(local291, local157[local165 - 1][local195], (byte) 1, local157[local165][local195], local246, (byte) -1, local157[local165][(local195 + 1) % local86], (short) -1);
					}
				}
			}
			local57 = arg13.method7443(local146, local11, Static140.anInt2892, 64, 768);
			@Pc(411) Class125 local411 = Static260.aClass125_36;
			synchronized (Static260.aClass125_36) {
				Static260.aClass125_36.method3519(local47, local57);
			}
		}
		@Pc(430) int local430 = (arg6 << 8) - 1;
		@Pc(433) int local433 = -local430;
		@Pc(436) int local436 = -local430;
		@Pc(438) int local438 = local430;
		local153 = local430;
		if (arg9 != 0) {
			if ((arg9 & 0x1) != 0) {
				local153 = local430 + 512;
			}
			if ((arg9 & 0x4) != 0) {
				local438 = local430 + 512;
			}
			if ((arg9 & 0x2) != 0) {
				local436 -= 512;
			}
			if ((arg9 & 0x8) != 0) {
				local433 -= 512;
			}
		}
		@Pc(471) int local471 = arg8.ha();
		local159 = arg8.M();
		local165 = arg8.LA();
		if (local165 < local436) {
			local165 = local436;
		}
		if (local471 < local433) {
			local471 = local433;
		}
		local169 = arg8.K();
		if (local438 < local159) {
			local159 = local438;
		}
		if (local153 < local169) {
			local169 = local153;
		}
		@Pc(510) Class3_Sub10_Sub6 local510 = null;
		if (arg5 != null) {
			@Pc(517) int local517 = arg5.anIntArray396[arg3];
			local510 = Static46.aClass247_1.method6032(local517 >> 16);
			arg3 = local517 & 0xFFFF;
		}
		if (local510 == null) {
			local57 = local57.method5775((byte) 3, local11, true);
			local57.l(local159 - local471 >> 1, 128, local169 - local165 >> 1);
			local57.m(local471 + local159 >> 1, 0, local169 + local165 >> 1);
		} else {
			local57 = local57.method5775((byte) 3, local11, true);
			local57.l(local159 - local471 >> 1, 128, local169 - local165 >> 1);
			local57.m(local159 + local471 >> 1, 0, local169 + local165 >> 1);
			local57.method5777(local510, arg3);
		}
		if (arg12 != 0) {
			local57.AA(arg12);
		}
		if (arg7 != 0) {
			local57.v(arg7);
		}
		if (arg0 != 0) {
			local57.m(0, arg0, 0);
		}
		return local57;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(BI)V")
	public static void method1674(@OriginalArg(1) int arg0) {
		Static430.anInt9213 = arg0;
		@Pc(15) Class125 local15 = Static388.aClass125_57;
		synchronized (Static388.aClass125_57) {
			Static388.aClass125_57.method3521();
		}
		local15 = Static145.aClass125_24;
		synchronized (Static145.aClass125_24) {
			Static145.aClass125_24.method3521();
		}
	}
}
