import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!in;")
	public static Class157 aClass157_311;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "[Lclient!ga;")
	public static Class3_Sub1[] aClass3_Sub1Array151;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
	public static final int[] anIntArray717 = new int[6];

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static int anInt11089 = 0;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	public static int anInt11090 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
	public static boolean method9247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)I")
	public static int method9248(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!ka;IZIIIILclient!ha;IIILclient!hg;)Lclient!ka;")
	public static Class166 method9249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class20 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class130 arg12) {
		if (arg2 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg12 != null) {
			local11 = arg12.method4093(-1, arg4, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(53) long local53 = ((long) arg10 << 48) + (long) (arg6 + (arg9 << 16) + (arg11 << 24)) + ((long) arg5 << 32);
		@Pc(55) Class169 local55 = Static118.aClass169_19;
		@Pc(63) Class166 local63;
		synchronized (Static118.aClass169_19) {
			local63 = (Class166) Static118.aClass169_19.method5002(local53);
		}
		if (local63 == null || arg8.method7270(local63.ua(), local11) != 0) {
			if (local63 != null) {
				local11 = arg8.method7282(local11, local63.ua());
			}
			@Pc(96) byte local96;
			if (arg6 == 1) {
				local96 = 9;
			} else if (arg6 == 2) {
				local96 = 12;
			} else if (arg6 == 3) {
				local96 = 15;
			} else if (arg6 == 4) {
				local96 = 18;
			} else {
				local96 = 21;
			}
			@Pc(133) int[] local133 = new int[] { 64, 96, 128 };
			@Pc(151) Class32 local151 = new Class32(local96 * 3 + 1, local96 * 2 * 3 + -local96, 0);
			@Pc(158) int local158 = local151.method1601(0, 0, 0);
			@Pc(162) int[][] local162 = new int[3][local96];
			@Pc(170) int local170;
			@Pc(174) int local174;
			@Pc(176) int local176;
			@Pc(200) int local200;
			for (@Pc(164) int local164 = 0; local164 < 3; local164++) {
				local170 = local133[local164];
				local174 = local133[local164];
				for (local176 = 0; local176 < local96; local176++) {
					@Pc(184) int local184 = (local176 << 14) / local96;
					@Pc(192) int local192 = Class177.anIntArray361[local184] * local170 >> 14;
					local200 = Class177.anIntArray360[local184] * local174 >> 14;
					local162[local164][local176] = local151.method1601(0, local200, local192);
				}
			}
			for (local170 = 0; local170 < 3; local170++) {
				local174 = (local170 * 256 + 128) / 3;
				local176 = 256 - local174;
				@Pc(251) byte local251 = (byte) (local174 * arg11 + arg9 * local176 >> 8);
				@Pc(296) short local296 = (short) (((arg10 & 0xFC00) * local174 + local176 * (arg5 & 0xFC00) & 0xFC0000) + ((arg10 & 0x380) * local174 + local176 * (arg5 & 0x380) & 0x38000) + (local174 * (arg10 & 0x7F) + (arg5 & 0x7F) * local176 & 0x7F00) >> 8);
				for (local200 = 0; local200 < local96; local200++) {
					if (local170 == 0) {
						local151.method1602(local158, (byte) 1, (byte) -1, (short) -1, local296, local162[0][(local200 + 1) % local96], local251, local162[0][local200]);
					} else {
						local151.method1602(local162[local170 - 1][local200], (byte) 1, (byte) -1, (short) -1, local296, local162[local170 - 1][(local200 + 1) % local96], local251, local162[local170][(local200 + 1) % local96]);
						local151.method1602(local162[local170 - 1][local200], (byte) 1, (byte) -1, (short) -1, local296, local162[local170][(local200 + 1) % local96], local251, local162[local170][local200]);
					}
				}
			}
			local63 = arg8.method7228(local151, local11, Static454.anInt8398, 64, 768);
			@Pc(420) Class169 local420 = Static118.aClass169_19;
			synchronized (Static118.aClass169_19) {
				Static118.aClass169_19.method5001(local63, local53);
			}
		}
		@Pc(436) int local436 = arg2.V();
		@Pc(439) int local439 = arg2.RA();
		@Pc(442) int local442 = arg2.HA();
		@Pc(445) int local445 = arg2.G();
		@Pc(447) Class2_Sub6_Sub9 local447 = null;
		if (arg12 != null) {
			@Pc(454) int local454 = arg12.anIntArray237[arg4];
			local447 = Static195.aClass193_1.method5577(local454 >> 16);
			arg4 = local454 & 0xFFFF;
		}
		if (local447 == null) {
			local63 = local63.method6684((byte) 3, local11, true);
			local63.O(local439 - local436 >> 1, 128, local445 - local442 >> 1);
			local63.H(local439 + local436 >> 1, 0, local445 + local442 >> 1);
		} else {
			local63 = local63.method6684((byte) 3, local11, true);
			local63.O(local439 - local436 >> 1, 128, local445 - local442 >> 1);
			local63.H(local439 + local436 >> 1, 0, local445 + local442 >> 1);
			local63.method6681(arg4, local447);
		}
		if (arg0 != 0) {
			local63.FA(arg0);
		}
		if (arg3 != 0) {
			local63.VA(arg3);
		}
		if (arg7 != 0) {
			local63.H(0, arg7, 0);
		}
		return local63;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)Z")
	public static boolean method9252(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
