import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "J")
	public static long aLong20;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	public static int anInt450;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_11 = new Class27(42, 8);

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_12 = new Class27(1, 15);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!sf;IILclient!ha;)V")
	public static void method366(@OriginalArg(0) int arg0, @OriginalArg(1) Class24_Sub3_Sub2_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class10_Sub8_Sub2 arg3) {
		@Pc(16) int local16;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if ((arg2 & 0x100) != 0) {
			local16 = arg3.method2498();
			if (local16 == 65535) {
				local16 = -1;
			}
			local25 = arg3.method2515();
			local29 = arg3.method2503();
			arg1.method4914(local16, local29, local25, false);
		}
		@Pc(38) byte local38 = -1;
		if ((arg2 & 0x1000) != 0) {
			local38 = arg3.method2475();
		}
		if ((arg2 & 0x4000) != 0) {
			local16 = arg3.method2498();
			arg1.anInt6236 = arg3.method2502();
			arg1.anInt6267 = arg3.method2503();
			arg1.lb = (local16 & 0x8000) != 0;
			arg1.anInt6239 = local16 & 0x7FFF;
			arg1.anInt6252 = arg1.anInt6239 + Static400.anInt6752 + arg1.anInt6236;
		}
		if ((arg2 & 0x8) != 0) {
			local16 = arg3.method2520();
			if (local16 == 65535) {
				local16 = -1;
			}
			local25 = arg3.method2483();
			Static346.method4693(local25, local16, arg1);
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt6283 = arg3.method2475();
			arg1.anInt6246 = arg3.method2460();
			arg1.anInt6258 = arg3.method2475();
			arg1.anInt6254 = arg3.method2476();
			arg1.anInt6285 = arg3.method2498() + Static400.anInt6752;
			arg1.anInt6261 = arg3.method2485() + Static400.anInt6752;
			arg1.anInt6255 = arg3.method2486();
			arg1.anInt6291 = 0;
			if (arg1.aBoolean407) {
				arg1.anInt6258 += arg1.anInt6303;
				arg1.anInt6288 = 0;
				arg1.anInt6246 += arg1.anInt6317;
				arg1.anInt6283 += arg1.anInt6303;
				arg1.anInt6254 += arg1.anInt6317;
			} else {
				arg1.anInt6258 += arg1.anIntArray610[0];
				arg1.anInt6283 += arg1.anIntArray610[0];
				arg1.anInt6288 = 1;
				arg1.anInt6246 += arg1.anIntArray611[0];
				arg1.anInt6254 += arg1.anIntArray611[0];
			}
		}
		if ((arg2 & 0x40) != 0) {
			local16 = arg3.method2471();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg1.anInt6241 = local16;
		}
		if ((arg2 & 0x20) != 0) {
			local16 = arg3.method2469();
			local25 = arg3.method2486();
			arg1.method4911(Static400.anInt6752, local16, local25);
			arg1.anInt6253 = Static400.anInt6752 + 300;
			arg1.anInt6215 = arg3.method2502();
		}
		if ((arg2 & 0x2) != 0) {
			arg1.anInt6298 = arg3.method2520();
			if (arg1.anInt6288 == 0) {
				arg1.method4920(arg1.anInt6298);
				arg1.anInt6298 = -1;
			}
		}
		if ((arg2 & 0x40000) != 0) {
			local16 = arg3.method2498();
			local25 = arg3.method2468();
			if (local16 == 65535) {
				local16 = -1;
			}
			local29 = arg3.method2503();
			arg1.method4914(local16, local29, local25, true);
		}
		if ((arg2 & 0x8000) != 0) {
			arg1.aString56 = arg3.method2478();
			if (arg1.aString56.charAt(0) == '~') {
				arg1.aString56 = arg1.aString56.substring(1);
				Static104.method1823(arg1.method4933(), 0, arg1.aString56, arg1.method4927(), 2);
			} else if (Static263.aClass24_Sub3_Sub2_Sub2_4 == arg1) {
				Static104.method1823(arg1.method4933(), 0, arg1.aString56, arg1.method4927(), 2);
			}
			arg1.anInt6247 = 0;
			arg1.anInt6209 = 150;
			arg1.anInt6220 = 0;
		}
		@Pc(424) int local424;
		if ((arg2 & 0x2000) != 0) {
			local25 = Static400.anInt6752;
			local29 = arg3.method2469();
			local424 = arg3.method2483();
			arg1.method4911(local25, local29, local424);
		}
		if ((arg2 & 0x800) != 0) {
			arg1.aBoolean408 = arg3.method2483() == 1;
		}
		if ((arg2 & 0x80) != 0) {
			local25 = arg3.method2485();
			local29 = arg3.method2503();
			local424 = arg3.method2502();
			@Pc(468) int local468 = arg3.anInt2989;
			@Pc(479) boolean local479 = (local25 & 0x8000) != 0;
			if (arg1.aString58 != null && arg1.aClass75_1 != null) {
				@Pc(487) boolean local487 = false;
				if (local29 <= 1) {
					if (!local479 && (Static376.aBoolean422 && !Static111.aBoolean380 || Static269.aBoolean320)) {
						local487 = true;
					} else if (Static47.method837(arg1.aString58)) {
						local487 = true;
					}
				}
				if (!local487 && Static197.anInt3947 == 0) {
					Static4.aClass10_Sub8_11.anInt2989 = 0;
					arg3.method2513(local424, Static4.aClass10_Sub8_11.aByteArray44);
					Static4.aClass10_Sub8_11.anInt2989 = 0;
					@Pc(531) int local531 = -1;
					@Pc(539) String local539;
					if (local479) {
						local25 &= 0x7FFF;
						@Pc(549) Class62 local549 = Static300.method4153(Static4.aClass10_Sub8_11);
						local531 = local549.anInt1812;
						local539 = local549.aClass10_Sub1_Sub12_1.method3860(Static4.aClass10_Sub8_11);
					} else {
						local539 = Static391.method5206(Static415.method5451(Static4.aClass10_Sub8_11));
					}
					arg1.aString56 = local539.trim();
					arg1.anInt6220 = local25 & 0xFF;
					arg1.anInt6247 = local25 >> 8;
					arg1.anInt6209 = 150;
					@Pc(591) int local591;
					if (local29 == 1 || local29 == 2) {
						local591 = local479 ? 17 : 1;
					} else {
						local591 = local479 ? 17 : 2;
					}
					if (local29 == 2) {
						Static178.method2949(local531, null, local539, "<img=1>" + arg1.method4927(), 0, "<img=1>" + arg1.method4933(), local591);
					} else if (local29 == 1) {
						Static178.method2949(local531, null, local539, "<img=0>" + arg1.method4927(), 0, "<img=0>" + arg1.method4933(), local591);
					} else {
						Static178.method2949(local531, null, local539, arg1.method4927(), 0, arg1.method4933(), local591);
					}
				}
			}
			arg3.anInt2989 = local424 + local468;
		}
		if ((arg2 & 0x4) != 0) {
			local25 = arg3.method2483();
			@Pc(701) byte[] local701 = new byte[local25];
			@Pc(706) Class10_Sub8 local706 = new Class10_Sub8(local701);
			arg3.method2513(local25, local701);
			Static134.aClass10_Sub8Array1[arg0] = local706;
			arg1.method4930(local706);
		}
		if ((arg2 & 0x10000) != 0) {
			local25 = arg3.method2483();
			@Pc(734) int[] local734 = new int[local25];
			@Pc(737) int[] local737 = new int[local25];
			@Pc(740) int[] local740 = new int[local25];
			for (@Pc(742) int local742 = 0; local742 < local25; local742++) {
				@Pc(748) int local748 = arg3.method2485();
				if (local748 == 65535) {
					local748 = -1;
				}
				local734[local742] = local748;
				local737[local742] = arg3.method2502();
				local740[local742] = arg3.method2520();
			}
			Static189.method3037(local740, arg1, local734, local737);
		}
		if ((arg2 & 0x10) != 0) {
			Static393.aByteArray87[arg0] = arg3.method2475();
		}
		if ((arg2 & 0x20000) != 0) {
			arg1.aByte72 = arg3.method2476();
			arg1.aByte71 = arg3.method2460();
			arg1.aByte70 = arg3.method2476();
			arg1.aByte73 = (byte) arg3.method2503();
			arg1.anInt6218 = Static400.anInt6752 + arg3.method2485();
			arg1.anInt6262 = Static400.anInt6752 + arg3.method2471();
		}
		if (!arg1.aBoolean407) {
			return;
		}
		if (local38 == 127) {
			arg1.method4925(arg1.anInt6303, arg1.anInt6317);
			return;
		}
		@Pc(853) byte local853;
		if (local38 == -1) {
			local853 = Static393.aByteArray87[arg0];
		} else {
			local853 = local38;
		}
		arg1.method4931(arg1.anInt6317, arg1.anInt6303, local853);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIZ)Z")
	public static boolean method367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static181.aByteArrayArrayArray15[0][arg3][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static181.aByteArrayArrayArray15[arg0][arg3][arg2] & 0x10) == 0) {
			return arg1 == Static420.method5525(arg3, arg2, arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method368(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static267.method3813(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIZB)Lclient!ik;")
	public static Class10_Sub21 method369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class10_Sub21 local7 = new Class10_Sub21();
		local7.anInt3646 = arg2;
		local7.anInt3643 = arg0;
		Static114.aClass167_12.method3705(local7, (long) arg1);
		Static228.method3399(arg2);
		@Pc(35) Class89 local35 = Static40.method557(arg1);
		if (local35 != null) {
			Static135.method5400(local35);
		}
		if (Static378.aClass89_13 != null) {
			Static135.method5400(Static378.aClass89_13);
			Static378.aClass89_13 = null;
		}
		Static153.method2610();
		if (local35 != null) {
			Static344.method4658(!arg3, local35);
		}
		if (!arg3) {
			Static79.method1503(arg2);
		}
		if (!arg3 && Static189.anInt3826 != -1) {
			Static209.method3246(Static189.anInt3826, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIZIIIII)Z")
	public static boolean method370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray610[0];
		@Pc(13) int local13 = Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray611[0];
		if (local8 < 0 || local8 >= Static2.anInt7 || local13 < 0 || Static17.anInt315 <= local13) {
			return false;
		} else if (arg4 >= 0 && arg4 < Static2.anInt7 && arg1 >= 0 && arg1 < Static17.anInt315) {
			@Pc(62) int local62 = Static78.method1496(local13, arg0, Static11.aClass220Array1[Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98], arg5, arg3, local8, arg6, arg2, arg4, arg1, arg7, Static319.anIntArray534, Static263.aClass24_Sub3_Sub2_Sub2_4.method4919(), Static268.anIntArray480);
			if (local62 < 1) {
				return false;
			}
			Static297.anInt5146 = Static268.anIntArray480[local62 - 1];
			Static457.anInt7597 = Static319.anIntArray534[local62 - 1];
			Static336.aBoolean367 = false;
			Static245.method3582();
			return true;
		} else {
			return false;
		}
	}
}
