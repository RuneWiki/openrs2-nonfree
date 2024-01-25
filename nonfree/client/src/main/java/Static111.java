import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	public static int anInt7564;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!qa;BIZLclient!c;IIIIIIILclient!hi;II)Lclient!c;")
	public static Class31 method5933(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class96 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg11 != null) {
			local11 = arg11.method2712(arg10, false, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = (long) (arg1 + (arg4 << 16) + (arg5 << 24)) + ((long) arg9 << 32) + ((long) arg8 << 48);
		@Pc(51) Class5 local51 = Static142.aClass5_26;
		@Pc(59) Class31 local59;
		synchronized (Static142.aClass5_26) {
			local59 = (Class31) Static142.aClass5_26.method104(local49);
		}
		@Pc(153) int local153;
		@Pc(159) int local159;
		@Pc(165) int local165;
		@Pc(169) int local169;
		if (local59 == null || arg0.method2610(local59.n(), local11) != 0) {
			if (local59 != null) {
				local11 = arg0.method2614(local11, local59.n());
			}
			@Pc(93) byte local93;
			if (arg1 == 1) {
				local93 = 9;
			} else if (arg1 == 2) {
				local93 = 12;
			} else if (arg1 == 3) {
				local93 = 15;
			} else if (arg1 == 4) {
				local93 = 18;
			} else {
				local93 = 21;
			}
			@Pc(128) int[] local128 = new int[] { 64, 96, 128 };
			@Pc(146) Class242 local146 = new Class242(local93 * 3 + 1, -local93 + local93 * 3 * 2, 0);
			local153 = local146.method5557(0, 0, 0);
			@Pc(157) int[][] local157 = new int[3][local93];
			@Pc(171) int local171;
			@Pc(195) int local195;
			for (local159 = 0; local159 < 3; local159++) {
				local165 = local128[local159];
				local169 = local128[local159];
				for (local171 = 0; local171 < local93; local171++) {
					@Pc(179) int local179 = (local171 << 14) / local93;
					@Pc(187) int local187 = Applet_Sub1.anIntArray85[local179] * local165 >> 15;
					local195 = Applet_Sub1.anIntArray87[local179] * local169 >> 15;
					local157[local159][local171] = local146.method5557(local195, local187, 0);
				}
			}
			for (local165 = 0; local165 < 3; local165++) {
				local169 = (local165 * 256 + 128) / 3;
				local171 = 256 - local169;
				@Pc(246) byte local246 = (byte) (arg4 * local171 + local169 * arg5 >> 8);
				@Pc(291) short local291 = (short) ((local171 * (arg9 & 0x7F) + (arg8 & 0x7F) * local169 & 0x7F00) + ((arg9 & 0xFC00) * local171 + (arg8 & 0xFC00) * local169 & 0xFC0000) + (local169 * (arg8 & 0x380) + local171 * (arg9 & 0x380) & 0x38000) >> 8);
				for (local195 = 0; local195 < local93; local195++) {
					if (local165 == 0) {
						local146.method5555((byte) -1, local291, (byte) 1, local157[0][(local195 + 1) % local93], local153, (short) -1, local246, local157[0][local195]);
					} else {
						local146.method5555((byte) -1, local291, (byte) 1, local157[local165 - 1][(local195 + 1) % local93], local157[local165 - 1][local195], (short) -1, local246, local157[local165][(local195 + 1) % local93]);
						local146.method5555((byte) -1, local291, (byte) 1, local157[local165][(local195 + 1) % local93], local157[local165 - 1][local195], (short) -1, local246, local157[local165][local195]);
					}
				}
			}
			local59 = arg0.method2616(local146, local11, Static346.anInt6299, 64, 768);
			@Pc(416) Class5 local416 = Static142.aClass5_26;
			synchronized (Static142.aClass5_26) {
				Static142.aClass5_26.method114(local49, local59);
			}
		}
		@Pc(440) int local440 = (arg1 << 6) - 1;
		@Pc(443) int local443 = -local440;
		@Pc(446) int local446 = -local440;
		@Pc(448) int local448 = local440;
		local153 = local440;
		if (arg2) {
			if (arg12 > 13312 || arg12 < 3072) {
				local446 -= 128;
			}
			if (arg12 > 9216 && arg12 < 15360) {
				local448 = local440 + 128;
			}
			if (arg12 > 1024 && arg12 < 7168) {
				local443 -= 128;
			}
			if (arg12 > 5120 && arg12 < 11264) {
				local153 = local440 + 128;
			}
		}
		@Pc(493) int local493 = arg3.la();
		local159 = arg3.VA();
		local165 = arg3.X();
		if (local159 > local448) {
			local159 = local448;
		}
		local169 = arg3.C();
		if (local165 < local446) {
			local165 = local446;
		}
		if (local493 < local443) {
			local493 = local443;
		}
		if (local153 < local169) {
			local169 = local153;
		}
		@Pc(532) Class3_Sub3_Sub13 local532 = null;
		if (arg11 != null) {
			@Pc(539) int local539 = arg11.anIntArray253[arg10];
			local532 = Static196.aClass30_2.method934(local539 >> 16);
			arg10 = local539 & 0xFFFF;
		}
		if (local532 == null) {
			local59 = local59.method5710((byte) 3, local11, true);
			local59.XA(local159 - local493 >> 1, 128, local169 - local165 >> 1);
			local59.ja(local159 + local493 >> 1, 0, local169 + local165 >> 1);
		} else {
			local59 = local59.method5710((byte) 3, local11, true);
			local59.XA(local159 - local493 >> 1, 128, local169 - local165 >> 1);
			local59.ja(local159 + local493 >> 1, 0, local165 + local169 >> 1);
			local59.method5709(arg10, local532);
		}
		if (arg13 != 0) {
			local59.WA(arg13);
		}
		if (arg6 != 0) {
			local59.o(arg6);
		}
		if (arg7 != 0) {
			local59.ja(0, arg7, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
	public static void method5935() {
		Static197.anInt4304 = Static110.aClass3_Sub2_Sub2_1.method6044();
		@Pc(18) boolean local18 = Static110.aClass3_Sub2_Sub2_1.method5997() == 1;
		@Pc(22) int local22 = Static110.aClass3_Sub2_Sub2_1.method6044();
		@Pc(26) int local26 = Static110.aClass3_Sub2_Sub2_1.method6041();
		@Pc(30) int local30 = Static110.aClass3_Sub2_Sub2_1.method6004();
		Static408.method5487(local22);
		Static110.aClass3_Sub2_Sub2_1.method6056();
		@Pc(45) int local45;
		@Pc(48) int local48;
		@Pc(54) int local54;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local45 = 0; local45 < Static399.anInt6923 >> 3; local45++) {
				for (local48 = 0; local48 < Static127.anInt2696 >> 3; local48++) {
					local54 = Static110.aClass3_Sub2_Sub2_1.method6057(1);
					if (local54 == 1) {
						Static192.anIntArrayArrayArray11[local42][local45][local48] = Static110.aClass3_Sub2_Sub2_1.method6057(26);
					} else {
						Static192.anIntArrayArrayArray11[local42][local45][local48] = -1;
					}
				}
			}
		}
		Static110.aClass3_Sub2_Sub2_1.method6059();
		local45 = (Static113.anInt6862 - Static110.aClass3_Sub2_Sub2_1.anInt7620) / 16;
		Static244.anIntArrayArray37 = new int[local45][4];
		for (local48 = 0; local48 < local45; local48++) {
			for (local54 = 0; local54 < 4; local54++) {
				Static244.anIntArrayArray37[local48][local54] = Static110.aClass3_Sub2_Sub2_1.method6014();
			}
		}
		Static144.anIntArray241 = new int[local45];
		Static445.aByteArrayArray25 = new byte[local45][];
		Static277.anIntArray351 = new int[local45];
		Static363.anIntArray466 = null;
		Static437.anIntArray569 = new int[local45];
		Static57.aByteArrayArray4 = null;
		Static104.aByteArrayArray9 = new byte[local45][];
		Static20.anIntArray43 = new int[local45];
		Static303.aByteArrayArray17 = new byte[local45][];
		Static265.aByteArrayArray14 = new byte[local45][];
		Static289.anIntArray407 = new int[local45];
		local45 = 0;
		for (local54 = 0; local54 < 4; local54++) {
			for (@Pc(176) int local176 = 0; local176 < Static399.anInt6923 >> 3; local176++) {
				for (@Pc(179) int local179 = 0; local179 < Static127.anInt2696 >> 3; local179++) {
					@Pc(188) int local188 = Static192.anIntArrayArrayArray11[local54][local176][local179];
					if (local188 != -1) {
						@Pc(197) int local197 = local188 >> 14 & 0x3FF;
						@Pc(203) int local203 = local188 >> 3 & 0x7FF;
						@Pc(213) int local213 = (local197 / 8 << 8) + local203 / 8;
						for (@Pc(215) int local215 = 0; local215 < local45; local215++) {
							if (local213 == Static289.anIntArray407[local215]) {
								local213 = -1;
								break;
							}
						}
						if (local213 != -1) {
							Static289.anIntArray407[local45] = local213;
							@Pc(245) int local245 = local213 >> 8 & 0xFF;
							@Pc(249) int local249 = local213 & 0xFF;
							Static277.anIntArray351[local45] = Static93.aClass56_22.method1368("m" + local245 + "_" + local249);
							Static20.anIntArray43[local45] = Static93.aClass56_22.method1368("l" + local245 + "_" + local249);
							Static437.anIntArray569[local45] = Static93.aClass56_22.method1368("um" + local245 + "_" + local249);
							Static144.anIntArray241[local45] = Static93.aClass56_22.method1368("ul" + local245 + "_" + local249);
							local45++;
						}
					}
				}
			}
		}
		Static29.method737(local18, local26, false, local30);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method5936() {
		if (Static79.anInt1714 != -1) {
			Static345.method4946(Static79.anInt1714, false, -1, -1);
			Static79.anInt1714 = -1;
		}
	}
}
