import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public static int anInt3530;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "D")
	public static double aDouble14;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_65 = new Class186(45, 28);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([FIIZF[FFIFIIIII)V")
	public static void method3023(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(9) int local9 = arg1 - arg8;
		@Pc(13) int local13 = arg6 - arg12;
		@Pc(17) int local17 = arg10 - arg11;
		@Pc(38) float local38 = (float) local17 * arg4[0] + arg4[1] * (float) local9 + arg4[2] * (float) local13;
		@Pc(64) float local64 = (float) local17 * arg4[3] + arg4[4] * (float) local9 + (float) local13 * arg4[5];
		@Pc(85) float local85 = (float) local13 * arg4[8] + (float) local17 * arg4[6] + arg4[7] * (float) local9;
		@Pc(100) float local100;
		@Pc(106) float local106;
		if (arg2 == 0) {
			local100 = local38 + arg5 + 0.5F;
			local106 = arg3 + 0.5F - local85;
		} else if (arg2 == 1) {
			local100 = local38 + arg5 + 0.5F;
			local106 = local85 + arg3 + 0.5F;
		} else if (arg2 == 2) {
			local106 = arg7 + 0.5F - local64;
			local100 = arg5 + 0.5F - local38;
		} else if (arg2 == 3) {
			local106 = arg7 + 0.5F - local64;
			local100 = arg5 + local38 + 0.5F;
		} else if (arg2 == 4) {
			local100 = arg3 + local85 + 0.5F;
			local106 = arg7 + 0.5F - local64;
		} else {
			local106 = arg7 + 0.5F - local64;
			local100 = arg3 + 0.5F - local85;
		}
		@Pc(223) float local223;
		if (arg9 == 1) {
			local223 = local100;
			local100 = -local106;
			local106 = local223;
		} else if (arg9 == 2) {
			local100 = -local100;
			local106 = -local106;
		} else if (arg9 == 3) {
			local223 = local100;
			local100 = local106;
			local106 = -local223;
		}
		arg0[0] = local100;
		arg0[1] = local106;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB[B)[B")
	public static byte[] method3024(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(12) byte[] local12 = new byte[arg0];
		Static735.method9185(arg1, 0, local12, 0, arg0);
		return local12;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public static void method3025() {
		for (@Pc(3) int local3 = 0; local3 < Static581.anInt9508; local3++) {
			@Pc(9) Class239 local9 = Static326.aClass239Array1[local3];
			if (local9.aByte108 == 3) {
				if (local9.aClass3_Sub22_Sub1_1 == null) {
					local9.anInt7040 = Integer.MIN_VALUE;
				} else {
					Static155.aClass3_Sub22_Sub4_1.method9062(local9.aClass3_Sub22_Sub1_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILclient!oba;Lclient!lk;)V")
	public static void method3026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19_Sub1_Sub3_Sub2_Sub2 arg2, @OriginalArg(4) Class3_Sub28_Sub2 arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(39) int local39;
		@Pc(58) boolean local58;
		if ((arg0 & 0x400) != 0) {
			local16 = arg3.method5272();
			local20 = arg3.method5312();
			if (local16 == 65535) {
				local16 = -1;
			}
			local29 = arg3.method5334();
			local33 = local29 & 0x7;
			local39 = local29 >> 3 & 0xF;
			if (local39 == 15) {
				local39 = -1;
			}
			local58 = (local29 >> 7 & 0x1) == 1;
			arg2.method6585(local20, 1, local33, local58, local39, local16);
		}
		@Pc(69) byte local69 = -1;
		@Pc(95) int local95;
		if ((arg0 & 0x1) != 0) {
			local16 = arg3.method5322(-106);
			if (local16 > 0) {
				for (local20 = 0; local20 < local16; local20++) {
					local33 = -1;
					local39 = -1;
					local95 = -1;
					local29 = arg3.method5331();
					if (local29 == 32767) {
						local29 = arg3.method5331();
						local39 = arg3.method5331();
						local33 = arg3.method5331();
						local95 = arg3.method5331();
					} else if (local29 == 32766) {
						local29 = -1;
					} else {
						local39 = arg3.method5331();
					}
					@Pc(139) int local139 = arg3.method5331();
					@Pc(143) int local143 = arg3.method5293();
					arg2.method6589(local29, local95, local39, local139, local143, Static269.anInt4883, local33);
				}
			}
		}
		if ((arg0 & 0x4000) != 0) {
			local16 = arg3.method5305();
			arg2.anInt7806 = arg3.method5293();
			arg2.anInt7758 = arg3.method5293();
			arg2.anInt7771 = local16 & 0x7FFF;
			arg2.aBoolean593 = (local16 & 0x8000) != 0;
			arg2.anInt7785 = arg2.anInt7806 + Static269.anInt4883 + arg2.anInt7771;
		}
		if ((arg0 & 0x8) != 0) {
			arg2.anInt7825 = arg3.method5303();
			if (arg2.anInt7824 == 0) {
				arg2.method6604(arg2.anInt7825);
				arg2.anInt7825 = -1;
			}
		}
		if ((arg0 & 0x800) != 0) {
			arg2.anInt7811 = arg3.method5288();
			arg2.anInt7816 = arg3.method5299();
			arg2.anInt7820 = arg3.method5288();
			arg2.anInt7809 = arg3.method5288();
			arg2.anInt7812 = arg3.method5301() + Static269.anInt4883;
			arg2.anInt7814 = arg3.method5303() + Static269.anInt4883;
			arg2.anInt7817 = arg3.method5334();
			arg2.anInt7822 = 0;
			if (arg2.aBoolean601) {
				arg2.anInt7811 += arg2.anInt7830;
				arg2.anInt7820 += arg2.anInt7830;
				arg2.anInt7824 = 0;
				arg2.anInt7816 += arg2.anInt7852;
				arg2.anInt7809 += arg2.anInt7852;
			} else {
				arg2.anInt7820 += arg2.anIntArray430[0];
				arg2.anInt7809 += arg2.lb[0];
				arg2.anInt7824 = 1;
				arg2.anInt7811 += arg2.anIntArray430[0];
				arg2.anInt7816 += arg2.lb[0];
			}
		}
		@Pc(383) int[] local383;
		@Pc(386) int[] local386;
		if ((arg0 & 0x200) != 0) {
			local16 = arg3.method5334();
			local383 = new int[local16];
			local386 = new int[local16];
			@Pc(389) int[] local389 = new int[local16];
			for (local39 = 0; local39 < local16; local39++) {
				local95 = arg3.method5303();
				if (local95 == 65535) {
					local95 = -1;
				}
				local383[local39] = local95;
				local386[local39] = arg3.method5334();
				local389[local39] = arg3.method5305();
			}
			Static363.method5199(local389, local386, local383, arg2);
		}
		if ((arg0 & 0x40) != 0) {
			@Pc(441) int[] local441 = new int[4];
			for (local20 = 0; local20 < 4; local20++) {
				local441[local20] = arg3.method5303();
				if (local441[local20] == 65535) {
					local441[local20] = -1;
				}
			}
			local29 = arg3.method5334();
			Static192.method2903(arg2, false, local29, local441);
		}
		if ((arg0 & 0x40000) != 0) {
			local16 = arg3.method5293();
			local383 = new int[local16];
			local386 = new int[local16];
			for (local33 = 0; local33 < local16; local33++) {
				local39 = arg3.method5303();
				if ((local39 & 0xC000) == 49152) {
					local95 = arg3.method5272();
					local383[local33] = local95 | local39 << 16;
				} else {
					local383[local33] = local39;
				}
				local386[local33] = arg3.method5272();
			}
			arg2.method6601(local383, local386);
		}
		if ((arg0 & 0x100) != 0) {
			arg2.aBoolean600 = arg3.method5293() == 1;
		}
		if ((arg0 & 0x80) != 0) {
			local16 = arg3.method5305();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = arg3.method5312();
			local29 = arg3.method5322(-60);
			local33 = local29 & 0x7;
			local39 = local29 >> 3 & 0xF;
			if (local39 == 15) {
				local39 = -1;
			}
			local58 = (local29 >> 7 & 0x1) == 1;
			arg2.method6585(local20, 0, local33, local58, local39, local16);
		}
		if ((arg0 & 0x2) != 0) {
			local16 = arg3.method5293();
			@Pc(647) byte[] local647 = new byte[local16];
			@Pc(652) Class3_Sub28 local652 = new Class3_Sub28(local647);
			arg3.method5271(local647, local16, 0);
			Static677.aClass3_Sub28Array1[arg1] = local652;
			arg2.method6615((byte) -116, local652);
		}
		if ((arg0 & 0x10) != 0) {
			local16 = arg3.method5301();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg2.anInt7780 = local16;
		}
		if ((arg0 & 0x10000) != 0) {
			local16 = arg3.method5303();
			local20 = arg3.method5321();
			if (local16 == 65535) {
				local16 = -1;
			}
			local29 = arg3.method5308();
			local33 = local29 & 0x7;
			local39 = local29 >> 3 & 0xF;
			if (local39 == 15) {
				local39 = -1;
			}
			local58 = (local29 >> 7 & 0x1) == 1;
			arg2.method6585(local20, 3, local33, local58, local39, local16);
		}
		if ((arg0 & 0x80000) != 0) {
			arg2.aBoolean599 = arg3.method5334() == 1;
		}
		if ((arg0 & 0x2000) != 0) {
			local69 = arg3.method5330();
		}
		if ((arg0 & 0x100000) != 0) {
			arg2.aByte120 = arg3.method5299();
			arg2.aByte121 = arg3.method5330();
			arg2.aByte119 = arg3.method5330();
			arg2.aByte118 = (byte) arg3.method5322(-73);
			arg2.anInt7813 = Static269.anInt4883 + arg3.method5301();
			arg2.anInt7808 = Static269.anInt4883 + arg3.method5305();
		}
		if ((arg0 & 0x20) != 0) {
			Static443.aByteArray65[arg1] = arg3.method5299();
		}
		if ((arg0 & 0x1000) != 0) {
			@Pc(845) String local845 = arg3.method5295();
			if (local845.charAt(0) == '~') {
				local845 = local845.substring(1);
				Static170.method2681(arg2.method6622(), 2, 0, local845, arg2.aString108, arg2.method6618());
			} else if (arg2 == Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2) {
				Static170.method2681(arg2.method6622(), 2, 0, local845, arg2.aString108, arg2.method6618());
			}
			arg2.method6610(0, local845, 0);
		}
		if ((arg0 & 0x20000) != 0) {
			local16 = arg3.method5272();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = arg3.method5323();
			local29 = arg3.method5322(-11);
			local33 = local29 & 0x7;
			local39 = local29 >> 3 & 0xF;
			if (local39 == 15) {
				local39 = -1;
			}
			local58 = (local29 >> 7 & 0x1) == 1;
			arg2.method6585(local20, 2, local33, local58, local39, local16);
		}
		if (!arg2.aBoolean601) {
			return;
		}
		if (local69 == 127) {
			arg2.method6616(arg2.anInt7830, arg2.anInt7852);
			return;
		}
		@Pc(983) byte local983;
		if (local69 == -1) {
			local983 = Static443.aByteArray65[arg1];
		} else {
			local983 = local69;
		}
		Static649.method8733(local983, arg2);
		arg2.method6620(arg2.anInt7852, local983, arg2.anInt7830);
	}
}
