import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!jv;")
	public static Class191 aClass191_2;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public static void method7348() {
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub13_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub13_2, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub25_1, 2);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub25_2, 2);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub27_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub22_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub4_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub19_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub10_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub28_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub1_1, 2);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub18_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub8_1, 2);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub17_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub9_2, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub9_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub16_1, 2);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub3_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub29_1, 0);
		Static61.method1233();
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub23_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub11_1, 4);
		Static221.method6306();
		Static677.method9300();
		Static6.aBoolean3 = true;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method7349(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (arg0.length() > 320 || !Static14.method139()) {
			return;
		}
		if (Static258.aClass97_2 != null) {
			Static258.aClass97_2.method2286();
			Static258.aClass97_2 = null;
		}
		Static41.method904();
		Static238.aString49 = arg0;
		Static12.aString1 = arg1;
		Static67.method1345(5);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZLclient!ha;IILclient!pf;IIIIIILclient!ka;I)Lclient!ka;")
	public static Class80 method7350(@OriginalArg(0) int arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class275 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class80 arg11, @OriginalArg(13) int arg12) {
		if (arg11 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg4 != null) {
			local11 = arg4.method6549(-1, false, arg6) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = (long) (arg8 + (arg5 << 16) + (arg10 << 24)) + ((long) arg9 << 32) + ((long) arg3 << 48);
		@Pc(51) Class264 local51 = Static566.aClass264_56;
		@Pc(59) Class80 local59;
		synchronized (Static566.aClass264_56) {
			local59 = (Class80) Static566.aClass264_56.method6367(local49);
		}
		if (local59 == null || arg1.method7922(local59.ua(), local11) != 0) {
			if (local59 != null) {
				local11 = arg1.method7943(local11, local59.ua());
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
			@Pc(133) int[] local133 = new int[] { 64, 96, 128 };
			@Pc(151) Class67 local151 = new Class67(local96 * 3 + 1, -local96 + local96 * 3 * 2, 0);
			@Pc(158) int local158 = local151.method1714(0, 0, 0);
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
					@Pc(192) int local192 = local170 * Class32.anIntArray76[local184] >> 14;
					local200 = Class32.anIntArray77[local184] * local174 >> 14;
					local162[local164][local176] = local151.method1714(0, local200, local192);
				}
			}
			for (local170 = 0; local170 < 3; local170++) {
				local174 = (local170 * 256 + 128) / 3;
				local176 = 256 - local174;
				@Pc(255) byte local255 = (byte) (arg5 * local176 + arg10 * local174 >> 8);
				@Pc(300) short local300 = (short) (((arg9 & 0x380) * local176 + local174 * (arg3 & 0x380) & 0x38000) + (local176 * (arg9 & 0xFC00) + local174 * (arg3 & 0xFC00) & 0xFC0000) + (local176 * (arg9 & 0x7F) + (arg3 & 0x7F) * local174 & 0x7F00) >> 8);
				for (local200 = 0; local200 < local96; local200++) {
					if (local170 == 0) {
						local151.method1711((byte) 1, local158, local300, (byte) -1, local162[0][local200], local162[0][(local200 + 1) % local96], local255, (short) -1);
					} else {
						local151.method1711((byte) 1, local162[local170 - 1][local200], local300, (byte) -1, local162[local170][(local200 + 1) % local96], local162[local170 - 1][(local200 + 1) % local96], local255, (short) -1);
						local151.method1711((byte) 1, local162[local170 - 1][local200], local300, (byte) -1, local162[local170][local200], local162[local170][(local200 + 1) % local96], local255, (short) -1);
					}
				}
			}
			local59 = arg1.method7901(local151, local11, Static224.anInt4178, 64, 768);
			@Pc(427) Class264 local427 = Static566.aClass264_56;
			synchronized (Static566.aClass264_56) {
				Static566.aClass264_56.method6364(local49, local59);
			}
		}
		@Pc(443) int local443 = arg11.V();
		@Pc(446) int local446 = arg11.RA();
		@Pc(449) int local449 = arg11.HA();
		@Pc(452) int local452 = arg11.G();
		@Pc(454) Class14_Sub3_Sub1 local454 = null;
		if (arg4 != null) {
			@Pc(466) int local466 = arg4.anIntArray598[arg6];
			local454 = aClass191_2.method4319(local466 >> 16);
			arg6 = local466 & 0xFFFF;
		}
		if (local454 == null) {
			local59 = local59.method6378((byte) 3, local11, true);
			local59.O(local446 - local443 >> 1, 128, local452 - local449 >> 1);
			local59.H(local443 + local446 >> 1, 0, local449 + local452 >> 1);
		} else {
			local59 = local59.method6378((byte) 3, local11, true);
			local59.O(local446 - local443 >> 1, 128, local452 - local449 >> 1);
			local59.H(local446 + local443 >> 1, 0, local449 + local452 >> 1);
			local59.method6395(arg6, local454);
		}
		if (arg2 != 0) {
			local59.FA(arg2);
		}
		if (arg12 != 0) {
			local59.VA(arg12);
		}
		if (arg7 != 0) {
			local59.H(0, arg7, 0);
		}
		return local59;
	}
}
