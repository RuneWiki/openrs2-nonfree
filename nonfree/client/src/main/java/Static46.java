import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!br", name = "n", descriptor = "Lclient!q;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!br", name = "o", descriptor = "I")
	public static int anInt1129;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString8 = null;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_37 = new Class363(65, -1);

	@OriginalMember(owner = "client!br", name = "k", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_12 = new Class313(8);

	@OriginalMember(owner = "client!br", name = "l", descriptor = "I")
	public static int anInt1128 = -2;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "Z")
	public static boolean aBoolean79 = true;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!vb;Lclient!r;ILclient!ww;I)Z")
	public static boolean method788(@OriginalArg(1) Class2_Sub46 arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(4) Class366 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray702 != null) {
			local9 = Static270.anInt1798 + (Static270.anInt1795 - Static270.anInt1798) * (arg0.anInt9115 + arg2.anInt9638 - Static270.anInt1804) / (Static270.anInt1794 - Static270.anInt1804);
			local13 = Static270.anInt1802 - (arg2.anInt9621 + arg0.anInt9116 - Static270.anInt1803) * (-Static270.anInt1796 + Static270.anInt1802) / (Static270.anInt1799 - Static270.anInt1803);
			local11 = Static270.anInt1802 - (Static270.anInt1802 - Static270.anInt1796) * (-Static270.anInt1803 + arg0.anInt9116 + arg2.anInt9620) / (Static270.anInt1799 - Static270.anInt1803);
			local7 = (arg0.anInt9115 + arg2.anInt9651 - Static270.anInt1804) * (Static270.anInt1795 - Static270.anInt1798) / (Static270.anInt1794 - Static270.anInt1804) + Static270.anInt1798;
		}
		@Pc(103) Class39 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		if (arg2.anInt9648 != -1) {
			if (arg0.aBoolean695 && arg2.anInt9632 != -1) {
				local103 = arg2.method7997(arg1, true);
			} else {
				local103 = arg2.method7997(arg1, false);
			}
			if (local103 != null) {
				local105 = arg0.anInt9118 - (local103.A() + 1 >> 1);
				local107 = arg0.anInt9118 + (local103.A() + 1 >> 1);
				if (local105 < local7) {
					local7 = local105;
				}
				local109 = arg0.anInt9114 - (local103.ca() + 1 >> 1);
				if (local107 > local9) {
					local9 = local107;
				}
				if (local11 > local109) {
					local11 = local109;
				}
				local111 = arg0.anInt9114 + (local103.ca() + 1 >> 1);
				if (local13 < local111) {
					local13 = local111;
				}
			}
		}
		@Pc(211) Class243 local211 = null;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(277) int local277;
		@Pc(300) int local300;
		if (arg2.aString101 != null) {
			local211 = Static20.method6755(arg2.anInt9623);
			if (local211 != null) {
				local213 = Static450.aClass294_11.method6721(arg2.aString101, Static370.aStringArray119, null, null);
				local215 = arg0.anInt9114;
				if (local103 == null) {
					local215 -= local211.method5692() * local213 / 2;
				} else {
					local215 -= (local103.ca() >> 1) + (local211.method5691() * local213);
				}
				for (local277 = 0; local277 < local213; local277++) {
					@Pc(283) String local283 = Static370.aStringArray119[local277];
					if (local213 - 1 > local277) {
						local283 = local283.substring(0, local283.length() - 4);
					}
					local300 = local211.method5693(local283);
					if (local217 < local300) {
						local217 = local300;
					}
				}
				local219 = arg0.anInt9118 - local217 / 2;
				local221 = arg0.anInt9118 + local217 / 2;
				if (local7 > local219) {
					local7 = local219;
				}
				if (local221 > local9) {
					local9 = local221;
				}
				local223 = local215;
				if (local223 < local11) {
					local11 = local223;
				}
				local225 = local211.method5691() * local213 + local215;
				if (local225 > local13) {
					local13 = local225;
				}
			}
		}
		if (Static270.anInt1798 > local9 || Static270.anInt1795 < local7 || Static270.anInt1796 > local13 || Static270.anInt1802 < local11) {
			return true;
		}
		@Pc(402) int local402;
		if (arg2.anIntArray702 != null) {
			@Pc(400) int[] local400 = new int[arg2.anIntArray702.length];
			for (local402 = 0; local402 < local400.length / 2; local402++) {
				local300 = arg0.anInt9115 + arg2.anIntArray702[local402 * 2];
				@Pc(426) int local426 = arg0.anInt9116 + arg2.anIntArray702[local402 * 2 + 1];
				local400[local402 * 2] = Static270.anInt1798 + (local300 - Static270.anInt1804) * (-Static270.anInt1798 + Static270.anInt1795) / (Static270.anInt1794 - Static270.anInt1804);
				local400[local402 * 2 + 1] = Static270.anInt1802 - (local426 - Static270.anInt1803) * (-Static270.anInt1796 + Static270.anInt1802) / (Static270.anInt1799 - Static270.anInt1803);
			}
			Static179.method3076(arg1, local400, arg2.anInt9652);
			for (local300 = 0; local300 < local400.length / 2 - 1; local300++) {
				arg1.method6224(local400[local300 * 2 + 1], arg2.anInt9653, local400[local300 * 2 + 2 + 1], local400[local300 * 2], local400[local300 * 2 + 2]);
			}
			arg1.method6224(local400[local400.length - 1], arg2.anInt9653, local400[1], local400[local400.length - 2], local400[0]);
		}
		if (local103 != null) {
			if (Static356.anInt6365 > 0 && (Static591.anInt9584 != -1 && arg0.anInt9117 == Static591.anInt9584 || Static582.anInt9503 != -1 && Static582.anInt9503 == arg2.anInt9642)) {
				if (Static485.anInt8224 > 50) {
					local277 = 200 - Static485.anInt8224 * 2;
				} else {
					local277 = Static485.anInt8224 * 2;
				}
				local402 = local277 << 24 | 0xFFFF00;
				arg1.method6255(local402, arg0.anInt9118, arg0.anInt9114, local103.E() / 2 + 7);
				arg1.method6255(local402, arg0.anInt9118, arg0.anInt9114, local103.E() / 2 + 5);
				arg1.method6255(local402, arg0.anInt9118, arg0.anInt9114, local103.E() / 2 + 3);
				arg1.method6255(local402, arg0.anInt9118, arg0.anInt9114, local103.E() / 2 + 1);
				arg1.method6255(local402, arg0.anInt9118, arg0.anInt9114, local103.E() / 2);
			}
			local103.method7851(arg0.anInt9118 - (local103.A() >> 1), arg0.anInt9114 - (local103.ca() >> 1));
		}
		if (arg2.aString101 != null && local211 != null) {
			Static445.method6396(local213, arg2, local211, arg1, local215, local217, arg0);
		}
		if (arg2.anInt9648 != -1 || arg2.aString101 != null) {
			@Pc(717) Class2_Sub8 local717 = new Class2_Sub8(arg0);
			local717.anInt1367 = local223;
			local717.anInt1370 = local107;
			local717.anInt1371 = local105;
			local717.anInt1372 = local111;
			local717.anInt1374 = local109;
			local717.anInt1373 = local225;
			local717.anInt1375 = local221;
			local717.anInt1369 = local219;
			Static36.aClass8_3.method212(local717);
		}
		return false;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIII)V")
	public static void method793(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 + Static35.anInt906;
		@Pc(13) int local13 = Static130.anInt5246 + arg0;
		if (Static389.aClass346ArrayArrayArray2 == null || arg2 < 0 || arg0 < 0 || Static188.anInt3850 <= arg2 || arg0 >= Static49.anInt1174 || !Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846) && arg1 != Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112) {
			return;
		}
		@Pc(58) long local58 = (long) (local9 | arg1 << 28 | local13 << 14);
		@Pc(64) Class2_Sub40 local64 = (Class2_Sub40) Static261.aClass162_35.method3519(local58);
		if (local64 == null) {
			Static582.method7907(arg1, arg2, arg0);
			return;
		}
		@Pc(80) Class2_Sub18 local80 = (Class2_Sub18) local64.aClass8_57.method210();
		if (local80 == null) {
			Static582.method7907(arg1, arg2, arg0);
			return;
		}
		@Pc(99) Class6_Sub1_Sub4_Sub1 local99 = (Class6_Sub1_Sub4_Sub1) Static582.method7907(arg1, arg2, arg0);
		if (local99 == null) {
			local99 = new Class6_Sub1_Sub4_Sub1(arg2 << 9, Static421.aClass67Array7[arg1].method6707(arg0, arg2), arg0 << 9, arg1, arg1);
		} else {
			local99.anInt4303 = local99.anInt4302 = -1;
		}
		local99.anInt4306 = local80.anInt3006;
		local99.anInt4290 = local80.anInt3007;
		label56: while (true) {
			@Pc(142) Class2_Sub18 local142 = (Class2_Sub18) local64.aClass8_57.method218();
			if (local142 == null) {
				break;
			}
			if (local99.anInt4290 != local142.anInt3007) {
				local99.anInt4303 = local142.anInt3007;
				local99.anInt4309 = local142.anInt3006;
				while (true) {
					@Pc(163) Class2_Sub18 local163 = (Class2_Sub18) local64.aClass8_57.method218();
					if (local163 == null) {
						break label56;
					}
					if (local99.anInt4290 != local163.anInt3007 && local99.anInt4303 != local163.anInt3007) {
						local99.anInt4302 = local163.anInt3007;
						local99.anInt4295 = local163.anInt3006;
					}
				}
			}
		}
		@Pc(207) int local207 = Static524.method7217((arg2 << 9) + 256, arg1, (arg0 << 9) + 256);
		local99.aByte112 = (byte) arg1;
		local99.anInt4292 = 0;
		local99.aByte111 = (byte) arg1;
		local99.anInt8759 = local207;
		local99.anInt8761 = arg2 << 9;
		local99.anInt8764 = arg0 << 9;
		if (Static551.method7475(arg0, arg2)) {
			local99.aByte111++;
		}
		Static125.method1804(arg1, arg2, arg0, local207, local99);
	}
}
