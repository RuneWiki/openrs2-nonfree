import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rp", name = "Nb", descriptor = "[Lclient!na;")
	public static Class146[] aClass146Array2;

	@OriginalMember(owner = "client!rp", name = "Qb", descriptor = "I")
	public static int anInt6292;

	@OriginalMember(owner = "client!rp", name = "Kb", descriptor = "Z")
	public static boolean aBoolean427 = false;

	@OriginalMember(owner = "client!rp", name = "Mb", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_206 = new Class186(68, 16);

	@OriginalMember(owner = "client!rp", name = "Ob", descriptor = "I")
	public static int anInt6291 = 64;

	@OriginalMember(owner = "client!rp", name = "Pb", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_207 = new Class186(94, -1);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!ps;Lclient!bo;Lclient!wk;Lclient!qa;IBI)V")
	public static void method4893(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub32 arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) Class264 arg3, @OriginalArg(4) Class30 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg1.anInt5603 - arg5 / 2 - 5;
		@Pc(19) int local19 = arg0 + 2;
		if (arg2.anInt868 != 0) {
			arg4.method4692(arg5 + 10, -local19 + arg3.method5725() * arg6 + (arg0 - -1), local15, arg2.anInt868, local19);
		}
		if (arg2.anInt863 != 0) {
			arg4.method4702(local15, arg2.anInt863, arg5 + 10, arg0 + 1 + arg3.method5725() * arg6 + -local19, local19);
		}
		@Pc(70) int local70 = arg2.anInt862;
		if (arg1.aBoolean373 && arg2.anInt853 != -1) {
			local70 = arg2.anInt853;
		}
		for (@Pc(88) int local88 = 0; local88 < arg6; local88++) {
			@Pc(94) String local94 = Static21.aStringArray3[local88];
			if (local88 < arg6 - 1) {
				local94 = local94.substring(0, local94.length() - 4);
			}
			arg3.method5727(arg4, local94, arg1.anInt5603, arg0, local70);
			arg0 += arg3.method5725();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!tq;BIIIIILclient!c;IIIILclient!qa;ZI)Lclient!c;")
	public static Class7 method4894(@OriginalArg(0) Class233 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class7 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class30 arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13) {
		if (arg6 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg0 != null) {
			local11 = arg0.method5246(false, arg9, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = ((long) arg5 << 32) + ((long) ((arg13 << 16) + arg1 + (arg10 << 24)) + ((long) arg2 << 48));
		@Pc(51) Class69 local51 = Static53.aClass69_12;
		@Pc(59) Class7 local59;
		synchronized (Static53.aClass69_12) {
			local59 = (Class7) Static53.aClass69_12.method1591(local49);
		}
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(170) int local170;
		@Pc(174) int local174;
		if (local59 == null || arg11.method4674(local59.n(), local11) != 0) {
			if (local59 != null) {
				local11 = arg11.method4665(local11, local59.n());
			}
			@Pc(91) byte local91;
			if (arg1 == 1) {
				local91 = 9;
			} else if (arg1 == 2) {
				local91 = 12;
			} else if (arg1 == 3) {
				local91 = 15;
			} else if (arg1 == 4) {
				local91 = 18;
			} else {
				local91 = 21;
			}
			@Pc(133) int[] local133 = new int[] { 64, 96, 128 };
			@Pc(151) Class208 local151 = new Class208(local91 * 3 + 1, -local91 + local91 * 6, 0);
			local158 = local151.method4820(0, 0, 0);
			@Pc(162) int[][] local162 = new int[3][local91];
			@Pc(176) int local176;
			@Pc(200) int local200;
			for (local164 = 0; local164 < 3; local164++) {
				local170 = local133[local164];
				local174 = local133[local164];
				for (local176 = 0; local176 < local91; local176++) {
					@Pc(184) int local184 = (local176 << 14) / local91;
					@Pc(192) int local192 = Class56.anIntArray119[local184] * local170 >> 15;
					local200 = Class56.anIntArray120[local184] * local174 >> 15;
					local162[local164][local176] = local151.method4820(0, local192, local200);
				}
			}
			for (local170 = 0; local170 < 3; local170++) {
				local174 = (local170 * 256 + 128) / 3;
				local176 = 256 - local174;
				@Pc(251) byte local251 = (byte) (arg13 * local176 + arg10 * local174 >> 8);
				@Pc(296) short local296 = (short) (((arg2 & 0x7F) * local174 + local176 * (arg5 & 0x7F) & 0x7F00) + (local174 * (arg2 & 0x380) + local176 * (arg5 & 0x380) & 0x38000) + ((arg2 & 0xFC00) * local174 + local176 * (arg5 & 0xFC00) & 0xFC0000) >> 8);
				for (local200 = 0; local200 < local91; local200++) {
					if (local170 == 0) {
						local151.method4822(local251, (short) -1, local158, local162[0][local200], (byte) -1, local162[0][(local200 + 1) % local91], local296, (byte) 1);
					} else {
						local151.method4822(local251, (short) -1, local162[local170 - 1][local200], local162[local170][(local200 + 1) % local91], (byte) -1, local162[local170 - 1][(local200 + 1) % local91], local296, (byte) 1);
						local151.method4822(local251, (short) -1, local162[local170 - 1][local200], local162[local170][local200], (byte) -1, local162[local170][(local200 + 1) % local91], local296, (byte) 1);
					}
				}
			}
			local59 = arg11.method4655(local151, local11, Static111.anInt6480, 64, 768);
			@Pc(416) Class69 local416 = Static53.aClass69_12;
			synchronized (Static53.aClass69_12) {
				Static53.aClass69_12.method1590(local49, local59);
			}
		}
		@Pc(435) int local435 = (arg1 << 6) - 1;
		@Pc(438) int local438 = -local435;
		@Pc(441) int local441 = -local435;
		@Pc(443) int local443 = local435;
		local158 = local435;
		if (arg12) {
			if (arg8 > 13312 || arg8 < 3072) {
				local441 -= 128;
			}
			if (arg8 > 1024 && arg8 < 7168) {
				local438 -= 128;
			}
			if (arg8 > 9216 && arg8 < 15360) {
				local443 = local435 + 128;
			}
			if (arg8 > 5120 && arg8 < 11264) {
				local158 = local435 + 128;
			}
		}
		@Pc(482) int local482 = arg6.la();
		local164 = arg6.VA();
		local170 = arg6.X();
		if (local482 < local438) {
			local482 = local438;
		}
		if (local441 > local170) {
			local170 = local441;
		}
		local174 = arg6.C();
		if (local443 < local164) {
			local164 = local443;
		}
		if (local174 > local158) {
			local174 = local158;
		}
		@Pc(513) Class4_Sub1_Sub12 local513 = null;
		if (arg0 != null) {
			@Pc(525) int local525 = arg0.anIntArray593[arg9];
			local513 = Static269.aClass10_1.method288(local525 >> 16);
			arg9 = local525 & 0xFFFF;
		}
		if (local513 == null) {
			local59 = local59.method4077((byte) 3, local11, true);
			local59.XA(local164 - local482 >> 1, 128, local174 - local170 >> 1);
			local59.ja(local482 + local164 >> 1, 0, local170 + local174 >> 1);
		} else {
			local59 = local59.method4077((byte) 3, local11, true);
			local59.XA(local164 - local482 >> 1, 128, local174 - local170 >> 1);
			local59.ja(local482 + local164 >> 1, 0, local174 + local170 >> 1);
			local59.method4096(local513, arg9);
		}
		if (arg7 != 0) {
			local59.WA(arg7);
		}
		if (arg3 != 0) {
			local59.o(arg3);
		}
		if (arg4 != 0) {
			local59.ja(0, arg4, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method4895(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static315.method4350(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local37);
			return Static296.method4113(local45, arg1);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIBLjava/lang/String;)V")
	public static void method4897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class126 local8 = Static299.method4154(arg2, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray20 != null) {
			@Pc(18) Class4_Sub40 local18 = new Class4_Sub40();
			local18.anInt6872 = arg1;
			local18.aClass126_16 = local8;
			local18.anObjectArray35 = local8.anObjectArray20;
			local18.aString67 = arg3;
			Static172.method2513(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt3434 != 0) {
			local35 = Static192.method5862(local8);
		}
		if (!local35 || !Static55.method1118(local8).method4451(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static209.method2982(Static22.aClass36_127);
			Static448.method5743(local8.anInt3395, arg2, arg0);
		}
		if (arg1 == 2) {
			Static209.method2982(Static376.aClass36_120);
			Static448.method5743(local8.anInt3395, arg2, arg0);
		}
		if (arg1 == 3) {
			Static209.method2982(Static28.aClass36_17);
			Static448.method5743(local8.anInt3395, arg2, arg0);
		}
		if (arg1 == 4) {
			Static209.method2982(Static370.aClass36_119);
			Static448.method5743(local8.anInt3395, arg2, arg0);
		}
		if (arg1 == 5) {
			Static209.method2982(Static40.aClass36_23);
			Static448.method5743(local8.anInt3395, arg2, arg0);
		}
		if (arg1 == 6) {
			Static209.method2982(Static91.aClass36_45);
			Static448.method5743(local8.anInt3395, arg2, arg0);
		}
		if (arg1 == 7) {
			Static209.method2982(Static453.aClass36_133);
			Static448.method5743(local8.anInt3395, arg2, arg0);
		}
		if (arg1 == 8) {
			Static209.method2982(Static95.aClass36_49);
			Static448.method5743(local8.anInt3395, arg2, arg0);
		}
		if (arg1 == 9) {
			Static209.method2982(Static365.aClass36_118);
			Static448.method5743(local8.anInt3395, arg2, arg0);
		}
		if (arg1 == 10) {
			Static209.method2982(Static32.aClass36_18);
			Static448.method5743(local8.anInt3395, arg2, arg0);
		}
	}
}
