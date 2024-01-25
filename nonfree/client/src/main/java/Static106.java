import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_18 = new Class181(16, 12);

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
	public static int anInt1655 = -1;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
	public static int anInt1658 = -1;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "[Lclient!rs;")
	public static Class166_Sub1[] aClass166_Sub1Array1 = new Class166_Sub1[0];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!ka;ILclient!ha;IIIIIIILclient!la;BI)Lclient!ka;")
	public static Class180 method1535(@OriginalArg(0) int arg0, @OriginalArg(1) Class180 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class126 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class200 arg11, @OriginalArg(13) int arg12) {
		if (arg1 == null) {
			return null;
		}
		@Pc(16) int local16 = 2055;
		if (arg11 != null) {
			local16 = arg11.method4467(false, arg6, -1) | 0x807;
			local16 &= 0xFFFFFDFF;
		}
		@Pc(54) long local54 = (long) (arg2 + (arg8 << 16) + (arg9 << 24)) + ((long) arg10 << 32) + ((long) arg12 << 48);
		@Pc(56) Class293 local56 = Static580.aClass293_75;
		@Pc(64) Class180 local64;
		synchronized (Static580.aClass293_75) {
			local64 = (Class180) Static580.aClass293_75.method6921(local54);
		}
		if (local64 == null || arg3.method6985(local64.ua(), local16) != 0) {
			if (local64 != null) {
				local16 = arg3.method6989(local16, local64.ua());
			}
			@Pc(101) byte local101;
			if (arg2 == 1) {
				local101 = 9;
			} else if (arg2 == 2) {
				local101 = 12;
			} else if (arg2 == 3) {
				local101 = 15;
			} else if (arg2 == 4) {
				local101 = 18;
			} else {
				local101 = 21;
			}
			@Pc(140) int[] local140 = new int[] { 64, 96, 128 };
			@Pc(158) Class349 local158 = new Class349(local101 * 3 + 1, -local101 + local101 * 6, 0);
			@Pc(165) int local165 = local158.method8214(0, 0, 0);
			@Pc(169) int[][] local169 = new int[3][local101];
			@Pc(177) int local177;
			@Pc(181) int local181;
			@Pc(183) int local183;
			@Pc(207) int local207;
			for (@Pc(171) int local171 = 0; local171 < 3; local171++) {
				local177 = local140[local171];
				local181 = local140[local171];
				for (local183 = 0; local183 < local101; local183++) {
					@Pc(191) int local191 = (local183 << 14) / local101;
					@Pc(199) int local199 = local177 * Class5_Sub12_Sub1.anIntArray748[local191] >> 14;
					local207 = local181 * Class5_Sub12_Sub1.anIntArray749[local191] >> 14;
					local169[local171][local183] = local158.method8214(local199, local207, 0);
				}
			}
			for (local177 = 0; local177 < 3; local177++) {
				local181 = (local177 * 256 + 128) / 3;
				local183 = 256 - local181;
				@Pc(253) byte local253 = (byte) (local181 * arg9 + arg8 * local183 >> 8);
				@Pc(298) short local298 = (short) (((arg12 & 0x380) * local181 + (arg10 & 0x380) * local183 & 0x38000) + (local183 * (arg10 & 0xFC00) + (arg12 & 0xFC00) * local181 & 0xFC0000) + ((arg12 & 0x7F) * local181 + (arg10 & 0x7F) * local183 & 0x7F00) >> 8);
				for (local207 = 0; local207 < local101; local207++) {
					if (local177 == 0) {
						local158.method8210((byte) -1, local253, (byte) 1, (short) -1, local169[0][(local207 + 1) % local101], local298, local169[0][local207], local165);
					} else {
						local158.method8210((byte) -1, local253, (byte) 1, (short) -1, local169[local177 - 1][(local207 + 1) % local101], local298, local169[local177][(local207 + 1) % local101], local169[local177 - 1][local207]);
						local158.method8210((byte) -1, local253, (byte) 1, (short) -1, local169[local177][(local207 + 1) % local101], local298, local169[local177][local207], local169[local177 - 1][local207]);
					}
				}
			}
			local64 = arg3.method6982(local158, local16, Static17.anInt400, 64, 768);
			@Pc(422) Class293 local422 = Static580.aClass293_75;
			synchronized (Static580.aClass293_75) {
				Static580.aClass293_75.method6925(local54, local64);
			}
		}
		@Pc(438) int local438 = arg1.V();
		@Pc(441) int local441 = arg1.RA();
		@Pc(444) int local444 = arg1.HA();
		@Pc(447) int local447 = arg1.G();
		@Pc(449) Class5_Sub4_Sub2 local449 = null;
		if (arg11 != null) {
			@Pc(456) int local456 = arg11.anIntArray389[arg6];
			local449 = Static396.aClass359_2.method8413(local456 >> 16);
			arg6 = local456 & 0xFFFF;
		}
		if (local449 == null) {
			local64 = local64.method7945((byte) 3, local16, true);
			local64.O(local441 - local438 >> 1, 128, local447 - local444 >> 1);
			local64.H(local438 + local441 >> 1, 0, local447 + local444 >> 1);
		} else {
			local64 = local64.method7945((byte) 3, local16, true);
			local64.O(local441 - local438 >> 1, 128, local447 - local444 >> 1);
			local64.H(local438 + local441 >> 1, 0, local447 + local444 >> 1);
			local64.method7928(local449, arg6);
		}
		if (arg5 != 0) {
			local64.FA(arg5);
		}
		if (arg0 != 0) {
			local64.VA(arg0);
		}
		if (arg4 != 0) {
			local64.H(0, arg4, 0);
		}
		return local64;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII)Z")
	public static boolean method1539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static542.method7724(arg1, arg0) || Static188.method8826(arg1, arg0);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)V")
	public static void method1541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static486.anInt8186 = arg0 - Static203.anInt137;
		Static100.anInt1573 = arg1 - Static203.anInt136;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BIZ)V")
	public static void method1544(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(6) Class5_Sub40 local6 = Static25.method507(Static98.aClass208_2, Static3.aClass181_1);
			local6.aClass5_Sub12_Sub2_2.method8655(arg0);
			Static612.method8496(local6);
		} else {
			Static82.method1326(Static296.aClass74_22, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BIIII)V")
	public static void method1545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static610.anInt9986 = arg2;
		Static555.anInt7106 = arg3;
		Static173.anInt3126 = arg0;
		Static617.anInt10033 = arg1;
	}
}
