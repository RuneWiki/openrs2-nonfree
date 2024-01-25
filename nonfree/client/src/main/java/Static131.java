import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "J")
	public static long aLong65;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!pq;")
	public static Class251 aClass251_46;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method1964(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIZ)I")
	public static int method1965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lclient!wt;")
	public static Class211 method1966() {
		try {
			return (Class211) Class.forName("Class211_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBLclient!oa;Lclient!ba;ILclient!fq;IIIIIIII)Lclient!ba;")
	public static Class22 method1968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2, @OriginalArg(4) Class22 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class108 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg5 != null) {
			local11 = arg5.method2189(-1, false, arg0) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg13 << 48) + ((long) arg11 << 32) + (long) ((arg4 << 24) + (arg7 << 16) + arg8);
		@Pc(49) Class332 local49 = Static189.aClass332_83;
		@Pc(57) Class22 local57;
		synchronized (Static189.aClass332_83) {
			local57 = (Class22) Static189.aClass332_83.method7502(local47);
		}
		@Pc(149) int local149;
		@Pc(155) int local155;
		@Pc(161) int local161;
		@Pc(165) int local165;
		if (local57 == null || arg2.method7150(local57.h(), local11) != 0) {
			if (local57 != null) {
				local11 = arg2.method7099(local11, local57.h());
			}
			@Pc(96) byte local96;
			if (arg8 == 1) {
				local96 = 9;
			} else if (arg8 == 2) {
				local96 = 12;
			} else if (arg8 == 3) {
				local96 = 15;
			} else if (arg8 == 4) {
				local96 = 18;
			} else {
				local96 = 21;
			}
			@Pc(125) int[] local125 = new int[] { 64, 96, 128 };
			@Pc(142) Class274 local142 = new Class274(local96 * 3 + 1, local96 * 3 * 2 - local96, 0);
			local149 = local142.method6336(0, 0, 0);
			@Pc(153) int[][] local153 = new int[3][local96];
			@Pc(167) int local167;
			@Pc(191) int local191;
			for (local155 = 0; local155 < 3; local155++) {
				local161 = local125[local155];
				local165 = local125[local155];
				for (local167 = 0; local167 < local96; local167++) {
					@Pc(175) int local175 = (local167 << 14) / local96;
					@Pc(183) int local183 = Class138.anIntArray392[local175] * local161 >> 14;
					local191 = local165 * Class138.anIntArray393[local175] >> 14;
					local153[local155][local167] = local142.method6336(0, local191, local183);
				}
			}
			for (local161 = 0; local161 < 3; local161++) {
				local165 = (local161 * 256 + 128) / 3;
				local167 = 256 - local165;
				@Pc(238) byte local238 = (byte) (arg4 * local165 + local167 * arg7 >> 8);
				@Pc(283) short local283 = (short) ((local165 * (arg13 & 0x7F) + local167 * (arg11 & 0x7F) & 0x7F00) + (local167 * (arg11 & 0xFC00) + local165 * (arg13 & 0xFC00) & 0xFC0000) + ((arg13 & 0x380) * local165 + (arg11 & 0x380) * local167 & 0x38000) >> 8);
				for (local191 = 0; local191 < local96; local191++) {
					if (local161 == 0) {
						local142.method6339((byte) -1, local283, local153[0][(local191 + 1) % local96], (short) -1, local149, local238, (byte) 1, local153[0][local191]);
					} else {
						local142.method6339((byte) -1, local283, local153[local161 - 1][(local191 + 1) % local96], (short) -1, local153[local161 - 1][local191], local238, (byte) 1, local153[local161][(local191 + 1) % local96]);
						local142.method6339((byte) -1, local283, local153[local161][(local191 + 1) % local96], (short) -1, local153[local161 - 1][local191], local238, (byte) 1, local153[local161][local191]);
					}
				}
			}
			local57 = arg2.method7088(local142, local11, Static204.anInt3473, 64, 768);
			@Pc(410) Class332 local410 = Static189.aClass332_83;
			synchronized (Static189.aClass332_83) {
				Static189.aClass332_83.method7498(local47, local57);
			}
		}
		@Pc(429) int local429 = (arg8 << 8) - 1;
		@Pc(432) int local432 = -local429;
		@Pc(435) int local435 = -local429;
		@Pc(437) int local437 = local429;
		local149 = local429;
		if (arg12 != 0) {
			if ((arg12 & 0x8) != 0) {
				local432 -= 512;
			}
			if ((arg12 & 0x1) != 0) {
				local149 = local429 + 512;
			}
			if ((arg12 & 0x2) != 0) {
				local435 -= 512;
			}
			if ((arg12 & 0x4) != 0) {
				local437 = local429 + 512;
			}
		}
		@Pc(470) int local470 = arg3.ha();
		local155 = arg3.M();
		local161 = arg3.LA();
		if (local470 < local432) {
			local470 = local432;
		}
		if (local435 > local161) {
			local161 = local435;
		}
		if (local155 > local437) {
			local155 = local437;
		}
		local165 = arg3.K();
		if (local149 < local165) {
			local165 = local149;
		}
		@Pc(509) Class6_Sub1_Sub7 local509 = null;
		if (arg5 != null) {
			@Pc(516) int local516 = arg5.anIntArray312[arg0];
			local509 = Static31.aClass345_1.method7796(local516 >> 16);
			arg0 = local516 & 0xFFFF;
		}
		if (local509 == null) {
			local57 = local57.method4699((byte) 3, local11, true);
			local57.l(local155 - local470 >> 1, 128, local165 - local161 >> 1);
			local57.m(local155 + local470 >> 1, 0, local161 + local165 >> 1);
		} else {
			local57 = local57.method4699((byte) 3, local11, true);
			local57.l(local155 - local470 >> 1, 128, local165 - local161 >> 1);
			local57.m(local470 + local155 >> 1, 0, local161 + local165 >> 1);
			local57.method4695(local509, arg0);
		}
		if (arg1 != 0) {
			local57.AA(arg1);
		}
		if (arg9 != 0) {
			local57.v(arg9);
		}
		if (arg6 != 0) {
			local57.m(0, arg6, 0);
		}
		return local57;
	}
}
