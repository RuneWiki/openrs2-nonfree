import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!kb;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "[I")
	public static int[] anIntArray124 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public static int anInt837 = 0;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_275 = null;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "S")
	public static short aShort11 = 1;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Lclient!kh;")
	public static Class60 aClass60_276 = Static200.method3116(":");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIIZII)Z")
	public static boolean method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static6.anIntArrayArray4[local7][local11] = 0;
				Static42.anIntArrayArray17[local7][local11] = 99999999;
			}
		}
		Static6.anIntArrayArray4[arg2][arg5] = 99;
		Static42.anIntArrayArray17[arg2][arg5] = 0;
		@Pc(49) int local49 = arg5;
		local11 = arg2;
		@Pc(53) byte local53 = 0;
		Static22.anIntArray88[0] = arg2;
		@Pc(60) int local60 = local53 + 1;
		Static214.anIntArray615[0] = arg5;
		@Pc(81) int local81 = 0;
		@Pc(86) int[][] local86 = Static153.aClass3Array1[Static180.anInt3841].anIntArrayArray1;
		@Pc(88) boolean local88 = false;
		@Pc(200) int local200;
		while (local81 != local60) {
			local11 = Static22.anIntArray88[local81];
			local49 = Static214.anIntArray615[local81];
			local81 = local81 + 1 & 0xFFF;
			if (arg10 == local11 && local49 == arg0) {
				local88 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && Static153.aClass3Array1[Static180.anInt3841].method37(arg0, arg9, local49, arg6 - 1, local11, 1, arg10)) {
					local88 = true;
					break;
				}
				if (arg6 < 10 && Static153.aClass3Array1[Static180.anInt3841].method53(local11, 1, arg6 - 1, arg0, local49, arg9, arg10)) {
					local88 = true;
					break;
				}
			}
			if (arg1 != 0 && arg3 != 0 && Static153.aClass3Array1[Static180.anInt3841].method48(arg3, 1, arg0, local49, arg10, arg7, arg1, local11)) {
				local88 = true;
				break;
			}
			local200 = Static42.anIntArrayArray17[local11][local49] + 1;
			if (local11 > 0 && Static6.anIntArrayArray4[local11 - 1][local49] == 0 && (local86[local11 - 1][local49] & 0x12C0108) == 0) {
				Static22.anIntArray88[local60] = local11 - 1;
				Static214.anIntArray615[local60] = local49;
				local60 = local60 + 1 & 0xFFF;
				Static6.anIntArrayArray4[local11 - 1][local49] = 2;
				Static42.anIntArrayArray17[local11 - 1][local49] = local200;
			}
			if (local11 < 103 && Static6.anIntArrayArray4[local11 + 1][local49] == 0 && (local86[local11 + 1][local49] & 0x12C0180) == 0) {
				Static22.anIntArray88[local60] = local11 + 1;
				Static214.anIntArray615[local60] = local49;
				Static6.anIntArrayArray4[local11 + 1][local49] = 8;
				Static42.anIntArrayArray17[local11 + 1][local49] = local200;
				local60 = local60 + 1 & 0xFFF;
			}
			if (local49 > 0 && Static6.anIntArrayArray4[local11][local49 - 1] == 0 && (local86[local11][local49 - 1] & 0x12C0102) == 0) {
				Static22.anIntArray88[local60] = local11;
				Static214.anIntArray615[local60] = local49 - 1;
				local60 = local60 + 1 & 0xFFF;
				Static6.anIntArrayArray4[local11][local49 - 1] = 1;
				Static42.anIntArrayArray17[local11][local49 - 1] = local200;
			}
			if (local49 < 103 && Static6.anIntArrayArray4[local11][local49 + 1] == 0 && (local86[local11][local49 + 1] & 0x12C0120) == 0) {
				Static22.anIntArray88[local60] = local11;
				Static214.anIntArray615[local60] = local49 + 1;
				Static6.anIntArrayArray4[local11][local49 + 1] = 4;
				Static42.anIntArrayArray17[local11][local49 + 1] = local200;
				local60 = local60 + 1 & 0xFFF;
			}
			if (local11 > 0 && local49 > 0 && Static6.anIntArrayArray4[local11 - 1][local49 - 1] == 0 && (local86[local11 - 1][local49 - 1] & 0x12C010E) == 0 && (local86[local11 - 1][local49] & 0x12C0108) == 0 && (local86[local11][local49 - 1] & 0x12C0102) == 0) {
				Static22.anIntArray88[local60] = local11 - 1;
				Static214.anIntArray615[local60] = local49 - 1;
				Static6.anIntArrayArray4[local11 - 1][local49 - 1] = 3;
				local60 = local60 + 1 & 0xFFF;
				Static42.anIntArrayArray17[local11 - 1][local49 - 1] = local200;
			}
			if (local11 < 103 && local49 > 0 && Static6.anIntArrayArray4[local11 + 1][local49 - 1] == 0 && (local86[local11 + 1][local49 - 1] & 0x12C0183) == 0 && (local86[local11 + 1][local49] & 0x12C0180) == 0 && (local86[local11][local49 - 1] & 0x12C0102) == 0) {
				Static22.anIntArray88[local60] = local11 + 1;
				Static214.anIntArray615[local60] = local49 - 1;
				Static6.anIntArrayArray4[local11 + 1][local49 - 1] = 9;
				local60 = local60 + 1 & 0xFFF;
				Static42.anIntArrayArray17[local11 + 1][local49 - 1] = local200;
			}
			if (local11 > 0 && local49 < 103 && Static6.anIntArrayArray4[local11 - 1][local49 + 1] == 0 && (local86[local11 - 1][local49 + 1] & 0x12C0138) == 0 && (local86[local11 - 1][local49] & 0x12C0108) == 0 && (local86[local11][local49 + 1] & 0x12C0120) == 0) {
				Static22.anIntArray88[local60] = local11 - 1;
				Static214.anIntArray615[local60] = local49 + 1;
				local60 = local60 + 1 & 0xFFF;
				Static6.anIntArrayArray4[local11 - 1][local49 + 1] = 6;
				Static42.anIntArrayArray17[local11 - 1][local49 + 1] = local200;
			}
			if (local11 < 103 && local49 < 103 && Static6.anIntArrayArray4[local11 + 1][local49 + 1] == 0 && (local86[local11 + 1][local49 + 1] & 0x12C01E0) == 0 && (local86[local11 + 1][local49] & 0x12C0180) == 0 && (local86[local11][local49 + 1] & 0x12C0120) == 0) {
				Static22.anIntArray88[local60] = local11 + 1;
				Static214.anIntArray615[local60] = local49 + 1;
				local60 = local60 + 1 & 0xFFF;
				Static6.anIntArrayArray4[local11 + 1][local49 + 1] = 12;
				Static42.anIntArrayArray17[local11 + 1][local49 + 1] = local200;
			}
		}
		Static193.anInt4130 = 0;
		@Pc(822) int local822;
		if (!local88) {
			if (!arg8) {
				return false;
			}
			local822 = 100;
			local200 = 1000;
			for (@Pc(830) int local830 = arg10 - 10; local830 <= arg10 + 10; local830++) {
				for (@Pc(837) int local837 = arg0 - 10; local837 <= arg0 + 10; local837++) {
					if (local830 >= 0 && local837 >= 0 && local830 < 104 && local837 < 104 && Static42.anIntArrayArray17[local830][local837] < 100) {
						@Pc(863) int local863 = 0;
						if (local830 < arg10) {
							local863 = arg10 - local830;
						} else if (arg1 + arg10 - 1 < local830) {
							local863 = local830 + 1 - arg10 - arg1;
						}
						@Pc(891) int local891 = 0;
						if (local837 < arg0) {
							local891 = arg0 - local837;
						} else if (local837 > arg0 + arg3 - 1) {
							local891 = local837 + 1 - arg0 - arg3;
						}
						@Pc(929) int local929 = local863 * local863 + local891 * local891;
						if (local929 < local200 || local929 == local200 && Static42.anIntArrayArray17[local830][local837] < local822) {
							local11 = local830;
							local200 = local929;
							local49 = local837;
							local822 = Static42.anIntArrayArray17[local830][local837];
						}
					}
				}
			}
			if (local200 == 1000) {
				return false;
			}
			if (local11 == arg2 && local49 == arg5) {
				return false;
			}
			Static193.anInt4130 = 1;
		}
		@Pc(999) byte local999 = 0;
		Static22.anIntArray88[0] = local11;
		local81 = local999 + 1;
		Static214.anIntArray615[0] = local49;
		local200 = local822 = Static6.anIntArrayArray4[local11][local49];
		while (arg2 != local11 || local49 != arg5) {
			if (local200 != local822) {
				Static22.anIntArray88[local81] = local11;
				local822 = local200;
				Static214.anIntArray615[local81++] = local49;
			}
			if ((local200 & 0x2) != 0) {
				local11++;
			} else if ((local200 & 0x8) != 0) {
				local11--;
			}
			if ((local200 & 0x1) != 0) {
				local49++;
			} else if ((local200 & 0x4) != 0) {
				local49--;
			}
			local200 = Static6.anIntArrayArray4[local11][local49];
		}
		if (local81 > 0) {
			Static94.method1625(arg4, Static214.anIntArray615, local81, Static22.anIntArray88);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!ai;)V")
	public static void method623(@OriginalArg(1) Class7 arg0) {
		Static24.aClass7_5 = arg0;
	}
}
