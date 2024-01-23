import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
	public static int anInt2036;

	@OriginalMember(owner = "client!ia", name = "T", descriptor = "Lclient!bf;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
	public static int anInt2039;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "Lclient!og;")
	public static Class127 aClass127_7 = null;

	@OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
	public static int anInt2042 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZIILclient!ei;BIILclient!pi;IIII)Lclient!ei;")
	public static Class6_Sub2 method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub2 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class133 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(32) long local32 = ((long) arg12 << 48) + (long) ((arg10 << 24) + (arg6 << 16) + arg9) + ((long) arg4 << 32);
		@Pc(38) Class6_Sub2 local38 = (Class6_Sub2) Static204.aClass31_30.method852(local32);
		@Pc(125) int local125;
		@Pc(127) int local127;
		@Pc(138) int local138;
		@Pc(134) int local134;
		@Pc(174) int local174;
		if (local38 == null) {
			@Pc(54) byte local54;
			if (arg9 == 1) {
				local54 = 9;
			} else if (arg9 == 2) {
				local54 = 12;
			} else if (arg9 == 3) {
				local54 = 15;
			} else if (arg9 == 4) {
				local54 = 18;
			} else {
				local54 = 21;
			}
			@Pc(95) int[] local95 = new int[] { 64, 96, 128 };
			@Pc(115) Class6_Sub3 local115 = new Class6_Sub3(local54 * 3 + 1, -local54 + 2 * 3 * local54, 0);
			@Pc(119) int[][] local119 = new int[3][local54];
			local125 = local115.method1420(0, 0);
			for (local127 = 0; local127 < 3; local127++) {
				local134 = local95[local127];
				local138 = local95[local127];
				for (@Pc(140) int local140 = 0; local140 < local54; local140++) {
					@Pc(153) int local153 = (local140 << 11) / local54;
					@Pc(164) int local164 = arg3 + Class135.anIntArray474[local153] * local134 >> 16;
					local174 = local138 * Class135.anIntArray472[local153] + arg7 >> 16;
					local119[local127][local140] = local115.method1420(local174, local164);
				}
			}
			for (local127 = 0; local127 < 3; local127++) {
				local138 = (local127 * 256 + 128) / 3;
				local134 = 256 - local138;
				@Pc(223) byte local223 = (byte) (local138 * arg10 + arg6 * local134 >> 8);
				@Pc(268) short local268 = (short) (((arg4 & 0x380) * local134 + local138 * (arg12 & 0x380) & 0x38000) + ((arg12 & 0xFC00) * local138 + (arg4 & 0xFC00) * local134 & 0xFC0000) + ((arg4 & 0x7F) * local134 + local138 * (arg12 & 0x7F) & 0x7F00) >> 8);
				for (local174 = 0; local174 < local54; local174++) {
					if (local127 == 0) {
						local115.method1440(local125, local119[0][(local174 + 1) % local54], local119[0][local174], local268, local223);
					} else {
						local115.method1440(local119[local127 - 1][local174], local119[local127 - 1][(local174 + 1) % local54], local119[local127][(local174 + 1) % local54], local268, local223);
						local115.method1440(local119[local127 - 1][local174], local119[local127][(local174 + 1) % local54], local119[local127][local174], local268, local223);
					}
				}
			}
			local38 = local115.method1425(64, 768, -50, -10, -50);
			Static204.aClass31_30.method851(local38, local32);
		}
		@Pc(383) int local383 = arg9 * 64 - 1;
		@Pc(386) int local386 = -local383;
		@Pc(389) int local389 = -local383;
		local125 = local383;
		@Pc(393) int local393 = local383;
		@Pc(396) int local396 = arg5.method2092();
		if (arg2) {
			if (arg0 > 128 && arg0 < 896) {
				local389 -= 128;
			}
			if (arg0 > 1152 && arg0 < 1920) {
				local393 = local383 + 128;
			}
			if (arg0 > 640 && arg0 < 1408) {
				local125 = local383 + 128;
			}
			if (arg0 > 1664 || arg0 < 384) {
				local386 -= 128;
			}
		}
		if (local396 < local389) {
			local396 = local389;
		}
		local127 = arg5.method2097();
		if (local127 > local393) {
			local127 = local393;
		}
		local138 = arg5.method2083();
		if (local386 > local138) {
			local138 = local386;
		}
		@Pc(461) Class1_Sub2_Sub4 local461 = null;
		local134 = arg5.method2093();
		if (local125 < local134) {
			local134 = local125;
		}
		if (arg8 != null) {
			@Pc(478) int local478 = arg8.anIntArray461[arg1];
			local461 = Static261.method4028(local478 >> 16);
			arg1 = local478 & 0xFFFF;
		}
		if (local461 == null) {
			local38 = local38.method2094(true, true, true);
			local38.method2076((local127 - local396) / 2, 128, (local134 - local138) / 2);
			local38.method2073((local396 + local127) / 2, 0, (local134 + local138) / 2);
		} else {
			local38 = local38.method2094(!local461.method457(arg1), !local461.method461(arg1), true);
			local38.method2076((local127 - local396) / 2, 128, (local134 - local138) / 2);
			local38.method2073((local396 + local127) / 2, 0, (local138 + local134) / 2);
			local38.method2079(local461, arg1);
		}
		if (arg0 != 0) {
			local38.method2072(arg0);
		}
		if (Static240.aBoolean369) {
			@Pc(667) Class6_Sub2_Sub2 local667 = (Class6_Sub2_Sub2) local38;
			if (arg11 != Static124.method1919(Static159.anInt2978, local396 + arg7, local138 + arg3) || Static124.method1919(Static159.anInt2978, arg7 + local127, local134 + arg3) != arg11) {
				for (local174 = 0; local174 < local667.anInt2527; local174++) {
					local667.anIntArray300[local174] += Static124.method1919(Static159.anInt2978, local667.anIntArray295[local174] + arg7, local667.anIntArray298[local174] + arg3) - arg11;
				}
				local667.aClass96_1.aBoolean187 = false;
				local667.aClass110_3.aBoolean224 = false;
			}
		} else {
			@Pc(591) Class6_Sub2_Sub1 local591 = (Class6_Sub2_Sub1) local38;
			if (Static124.method1919(Static159.anInt2978, arg7 + local396, arg3 - -local138) != arg11 || Static124.method1919(Static159.anInt2978, arg7 + local127, arg3 - -local134) != arg11) {
				for (local174 = 0; local174 < local591.anInt690; local174++) {
					local591.anIntArray70[local174] += Static124.method1919(Static159.anInt2978, local591.anIntArray76[local174] + arg7, local591.anIntArray74[local174] + arg3) - arg11;
				}
				local591.aBoolean66 = false;
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
	public static void method1718() {
		Static86.aClass127ArrayArray1 = new Class127[Static55.aClass7_49.method257()][];
		Static176.aBooleanArray13 = new boolean[Static55.aClass7_49.method257()];
	}
}
