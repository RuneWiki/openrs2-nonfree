import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_27 = new Class130(10, 2);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V")
	public static void method1665(@OriginalArg(1) int arg0) {
		Static460.anInt8092 = arg0;
		Static279.aClass102_30.method2681();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ha;IIIIIIIIILclient!ka;IILclient!vo;)Lclient!ka;")
	public static Class17 method1666(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class17 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class361 arg12) {
		if (arg9 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg12 != null) {
			local11 = arg12.method8452(-1, false, arg8) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg2 << 32) + (long) ((arg7 << 16) + arg11 + (arg1 << 24)) + ((long) arg5 << 48);
		@Pc(50) Class102 local50 = Static236.aClass102_26;
		@Pc(58) Class17 local58;
		synchronized (Static236.aClass102_26) {
			local58 = (Class17) Static236.aClass102_26.method2677(local48);
		}
		if (local58 == null || arg0.method7541(local58.ua(), local11) != 0) {
			if (local58 != null) {
				local11 = arg0.method7501(local11, local58.ua());
			}
			@Pc(85) byte local85;
			if (arg11 == 1) {
				local85 = 9;
			} else if (arg11 == 2) {
				local85 = 12;
			} else if (arg11 == 3) {
				local85 = 15;
			} else if (arg11 == 4) {
				local85 = 18;
			} else {
				local85 = 21;
			}
			@Pc(127) int[] local127 = new int[] { 64, 96, 128 };
			@Pc(145) Class118 local145 = new Class118(local85 * 3 + 1, -local85 + local85 * 3 * 2, 0);
			@Pc(152) int local152 = local145.method2924(0, 0, 0);
			@Pc(156) int[][] local156 = new int[3][local85];
			@Pc(164) int local164;
			@Pc(168) int local168;
			@Pc(170) int local170;
			@Pc(194) int local194;
			for (@Pc(158) int local158 = 0; local158 < 3; local158++) {
				local164 = local127[local158];
				local168 = local127[local158];
				for (local170 = 0; local170 < local85; local170++) {
					@Pc(178) int local178 = (local170 << 14) / local85;
					@Pc(186) int local186 = Class21.anIntArray656[local178] * local164 >> 14;
					local194 = local168 * Class21.anIntArray655[local178] >> 14;
					local156[local158][local170] = local145.method2924(0, local186, local194);
				}
			}
			for (local164 = 0; local164 < 3; local164++) {
				local168 = (local164 * 256 + 128) / 3;
				local170 = 256 - local168;
				@Pc(245) byte local245 = (byte) (local168 * arg1 + local170 * arg7 >> 8);
				@Pc(290) short local290 = (short) (((arg5 & 0x380) * local168 + local170 * (arg2 & 0x380) & 0x38000) + ((arg2 & 0xFC00) * local170 + (arg5 & 0xFC00) * local168 & 0xFC0000) + (local170 * (arg2 & 0x7F) + local168 * (arg5 & 0x7F) & 0x7F00) >> 8);
				for (local194 = 0; local194 < local85; local194++) {
					if (local164 == 0) {
						local145.method2933((byte) 1, local245, (short) -1, local290, local152, (byte) -1, local156[0][local194], local156[0][(local194 + 1) % local85]);
					} else {
						local145.method2933((byte) 1, local245, (short) -1, local290, local156[local164 - 1][local194], (byte) -1, local156[local164][(local194 + 1) % local85], local156[local164 - 1][(local194 + 1) % local85]);
						local145.method2933((byte) 1, local245, (short) -1, local290, local156[local164 - 1][local194], (byte) -1, local156[local164][local194], local156[local164][(local194 + 1) % local85]);
					}
				}
			}
			local58 = arg0.method7490(local145, local11, Static391.anInt7253, 64, 768);
			@Pc(410) Class102 local410 = Static236.aClass102_26;
			synchronized (Static236.aClass102_26) {
				Static236.aClass102_26.method2674(local48, local58);
			}
		}
		@Pc(426) int local426 = arg9.V();
		@Pc(429) int local429 = arg9.RA();
		@Pc(432) int local432 = arg9.HA();
		@Pc(435) int local435 = arg9.G();
		@Pc(442) Class3_Sub4_Sub8 local442 = null;
		if (arg12 != null) {
			@Pc(449) int local449 = arg12.anIntArray638[arg8];
			local442 = Static115.aClass227_1.method5974(local449 >> 16);
			arg8 = local449 & 0xFFFF;
		}
		if (local442 == null) {
			local58 = local58.method5409((byte) 3, local11, true);
			local58.O(local429 - local426 >> 1, 128, local435 - local432 >> 1);
			local58.H(local426 + local429 >> 1, 0, local432 + local435 >> 1);
		} else {
			local58 = local58.method5409((byte) 3, local11, true);
			local58.O(local429 - local426 >> 1, 128, local435 - local432 >> 1);
			local58.H(local429 + local426 >> 1, 0, local435 + local432 >> 1);
			local58.method5418(arg8, local442);
		}
		if (arg4 != 0) {
			local58.FA(arg4);
		}
		if (arg6 != 0) {
			local58.VA(arg6);
		}
		if (arg3 != 0) {
			local58.H(0, arg3, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z[B)Z")
	public static boolean method1668(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub3 local8 = new Class3_Sub3(arg0);
		@Pc(12) int local12 = local8.method4225();
		if (local12 != 2) {
			return false;
		}
		@Pc(34) boolean local34 = local8.method4225() == 1;
		if (local34) {
			Static333.method1858(local8);
		}
		Static183.method3161(local8);
		return true;
	}
}
