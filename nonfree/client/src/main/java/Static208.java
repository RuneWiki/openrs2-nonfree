import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
	public static int anInt4309 = 100;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3661(@OriginalArg(1) String arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(17) char local17 = arg0.charAt(local12);
			if (local17 == '%' && local10 > local12 + 2) {
				local17 = arg0.charAt(local12 + 1);
				@Pc(66) int local66;
				if (local17 >= '0' && local17 <= '9') {
					local66 = local17 - 48;
				} else if (local17 >= 'a' && local17 <= 'f') {
					local66 = local17 + 10 - 97;
				} else {
					if (local17 < 'A' || local17 > 'F') {
						local7.append('%');
						continue;
					}
					local66 = local17 + '\n' - 65;
				}
				local17 = arg0.charAt(local12 + 2);
				local66 *= 16;
				if (local17 >= '0' && local17 <= '9') {
					local66 += local17 - 48;
				} else if (local17 >= 'a' && local17 <= 'f') {
					local66 += local17 + 10 - 97;
				} else {
					if (local17 < 'A' || local17 > 'F') {
						local7.append('%');
						continue;
					}
					local66 += local17 + '\n' - 65;
				}
				if (local66 != 0 && Static388.method6204((byte) local66)) {
					local7.append(Static142.method2866((byte) local66));
				}
				local12 += 2;
			} else if (local17 == '+') {
				local7.append(' ');
			} else {
				local7.append(local17);
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIILclient!ba;Lclient!jq;ILclient!oa;IIIIIIZI)Lclient!ba;")
	public static Class21 method3663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(4) Class174 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class15 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return null;
		}
		@Pc(9) int local9 = 2055;
		if (arg4 != null) {
			local9 = arg4.method4547(-1, false, arg0) | 0x807;
			local9 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = (long) ((arg11 << 16) + (arg8 + (arg5 << 24))) + ((long) arg7 << 32) + ((long) arg13 << 48);
		@Pc(50) Class211 local50 = Static419.aClass211_51;
		@Pc(58) Class21 local58;
		synchronized (Static419.aClass211_51) {
			local58 = (Class21) Static419.aClass211_51.method5534(local48);
		}
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(165) int local165;
		@Pc(169) int local169;
		if (local58 == null || arg6.method5321(local58.h(), local9) != 0) {
			if (local58 != null) {
				local9 = arg6.method5315(local9, local58.h());
			}
			@Pc(101) byte local101;
			if (arg8 == 1) {
				local101 = 9;
			} else if (arg8 == 2) {
				local101 = 12;
			} else if (arg8 == 3) {
				local101 = 15;
			} else if (arg8 == 4) {
				local101 = 18;
			} else {
				local101 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(147) Class96 local147 = new Class96(local101 * 3 + 1, local101 * 6 - local101, 0);
			local154 = local147.method2785(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local101];
			@Pc(171) int local171;
			@Pc(194) int local194;
			for (local160 = 0; local160 < 3; local160++) {
				local165 = local130[local160];
				local169 = local130[local160];
				for (local171 = 0; local171 < local101; local171++) {
					@Pc(178) int local178 = (local171 << 14) / local101;
					@Pc(186) int local186 = Class2_Sub3.anIntArray620[local178] * local165 >> 14;
					local194 = local169 * Class2_Sub3.anIntArray621[local178] >> 14;
					local158[local160][local171] = local147.method2785(local186, 0, local194);
				}
			}
			for (local165 = 0; local165 < 3; local165++) {
				local169 = (local165 * 256 + 128) / 3;
				local171 = 256 - local169;
				@Pc(240) byte local240 = (byte) (arg5 * local169 + arg11 * local171 >> 8);
				@Pc(285) short local285 = (short) ((local171 * (arg7 & 0x7F) + local169 * (arg13 & 0x7F) & 0x7F00) + ((arg13 & 0xFC00) * local169 + local171 * (arg7 & 0xFC00) & 0xFC0000) + (local169 * (arg13 & 0x380) + (arg7 & 0x380) * local171 & 0x38000) >> 8);
				for (local194 = 0; local194 < local101; local194++) {
					if (local165 == 0) {
						local147.method2774((byte) 1, local240, local285, (short) -1, local154, (byte) -1, local158[0][(local194 + 1) % local101], local158[0][local194]);
					} else {
						local147.method2774((byte) 1, local240, local285, (short) -1, local158[local165 - 1][local194], (byte) -1, local158[local165 - 1][(local194 + 1) % local101], local158[local165][(local194 + 1) % local101]);
						local147.method2774((byte) 1, local240, local285, (short) -1, local158[local165 - 1][local194], (byte) -1, local158[local165][(local194 + 1) % local101], local158[local165][local194]);
					}
				}
			}
			local58 = arg6.method5352(local147, local9, Static28.anInt853, 64, 768);
			@Pc(402) Class211 local402 = Static419.aClass211_51;
			synchronized (Static419.aClass211_51) {
				Static419.aClass211_51.method5529(local48, local58);
			}
		}
		@Pc(421) int local421 = (arg8 << 8) - 1;
		@Pc(424) int local424 = -local421;
		@Pc(427) int local427 = -local421;
		@Pc(429) int local429 = local421;
		local154 = local421;
		if (arg9 != 0) {
			if ((arg9 & 0x4) != 0) {
				local429 = local421 + 512;
			}
			if ((arg9 & 0x2) != 0) {
				local427 -= 512;
			}
			if ((arg9 & 0x1) != 0) {
				local154 = local421 + 512;
			}
			if ((arg9 & 0x8) != 0) {
				local424 -= 512;
			}
		}
		@Pc(465) int local465 = arg3.ha();
		local160 = arg3.M();
		local165 = arg3.LA();
		if (local465 < local424) {
			local465 = local424;
		}
		local169 = arg3.K();
		if (local160 > local429) {
			local160 = local429;
		}
		if (local165 < local427) {
			local165 = local427;
		}
		if (local154 < local169) {
			local169 = local154;
		}
		@Pc(504) Class3_Sub4_Sub12 local504 = null;
		if (arg4 != null) {
			@Pc(511) int local511 = arg4.anIntArray326[arg0];
			local504 = Static532.aClass157_2.method3737(local511 >> 16);
			arg0 = local511 & 0xFFFF;
		}
		if (local504 == null) {
			local58 = local58.method7131((byte) 3, local9, true);
			local58.l(local160 - local465 >> 1, 128, local169 - local165 >> 1);
			local58.m(local465 + local160 >> 1, 0, local169 + local165 >> 1);
		} else {
			local58 = local58.method7131((byte) 3, local9, true);
			local58.l(local160 - local465 >> 1, 128, local169 - local165 >> 1);
			local58.m(local160 + local465 >> 1, 0, local165 + local169 >> 1);
			local58.method7141(arg0, local504);
		}
		if (arg1 != 0) {
			local58.AA(arg1);
		}
		if (arg10 != 0) {
			local58.v(arg10);
		}
		if (arg12 != 0) {
			local58.m(0, arg12, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIBII)V")
	public static void method3665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static535.anInt9696 <= arg0 && Static35.anInt993 >= arg1 && arg2 >= Static55.anInt1303 && arg5 <= anInt4309) {
			if (arg3 == 1) {
				Static329.method5694(arg2, arg1, arg0, arg5, arg4);
			} else {
				Static535.method7873(arg1, arg5, arg2, arg4, arg3, arg0);
			}
		} else if (arg3 == 1) {
			Static311.method5195(arg2, arg4, arg5, arg1, arg0);
		} else {
			Static248.method4475(arg0, arg2, arg3, arg5, arg1, arg4);
		}
	}
}
