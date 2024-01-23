import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!dk", name = "cb", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_5;

	@OriginalMember(owner = "client!dk", name = "R", descriptor = "Lclient!qe;")
	public static Class78 aClass78_159 = Static199.method3560("unzap");

	@OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
	public static int anInt847 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIIIZII)Z")
	public static boolean method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(8) int local8;
		for (@Pc(5) int local5 = 0; local5 < 104; local5++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static3.anIntArrayArray1[local5][local8] = 0;
				Static122.anIntArrayArray20[local5][local8] = 99999999;
			}
		}
		Static3.anIntArrayArray1[arg7][arg10] = 99;
		local8 = arg7;
		@Pc(41) byte local41 = 0;
		Static122.anIntArrayArray20[arg7][arg10] = 0;
		Static86.anIntArray341[0] = arg7;
		@Pc(53) int local53 = arg10;
		@Pc(56) int local56 = local41 + 1;
		Static110.anIntArray419[0] = arg10;
		@Pc(60) int local60 = 0;
		@Pc(62) boolean local62 = false;
		@Pc(67) int[][] local67 = Static202.aClass90Array1[Static137.anInt3136].anIntArrayArray41;
		@Pc(180) int local180;
		while (local56 != local60) {
			local53 = Static110.anIntArray419[local60];
			local8 = Static86.anIntArray341[local60];
			local60 = local60 + 1 & 0xFFF;
			if (local8 == arg4 && local53 == arg9) {
				local62 = true;
				break;
			}
			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && Static202.aClass90Array1[Static137.anInt3136].method3512(local8, arg9, arg2 - 1, local53, arg6, arg4, 1)) {
					local62 = true;
					break;
				}
				if (arg2 < 10 && Static202.aClass90Array1[Static137.anInt3136].method3519(local8, 1, arg4, arg9, arg6, arg2 - 1, local53)) {
					local62 = true;
					break;
				}
			}
			if (arg5 != 0 && arg1 != 0 && Static202.aClass90Array1[Static137.anInt3136].method3526(arg1, local53, arg9, arg5, local8, arg4, arg3, 1)) {
				local62 = true;
				break;
			}
			local180 = Static122.anIntArrayArray20[local8][local53] + 1;
			if (local8 > 0 && Static3.anIntArrayArray1[local8 - 1][local53] == 0 && (local67[local8 - 1][local53] & 0x12C0108) == 0) {
				Static86.anIntArray341[local56] = local8 - 1;
				Static110.anIntArray419[local56] = local53;
				local56 = local56 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local8 - 1][local53] = 2;
				Static122.anIntArrayArray20[local8 - 1][local53] = local180;
			}
			if (local8 < 103 && Static3.anIntArrayArray1[local8 + 1][local53] == 0 && (local67[local8 + 1][local53] & 0x12C0180) == 0) {
				Static86.anIntArray341[local56] = local8 + 1;
				Static110.anIntArray419[local56] = local53;
				Static3.anIntArrayArray1[local8 + 1][local53] = 8;
				Static122.anIntArrayArray20[local8 + 1][local53] = local180;
				local56 = local56 + 1 & 0xFFF;
			}
			if (local53 > 0 && Static3.anIntArrayArray1[local8][local53 - 1] == 0 && (local67[local8][local53 - 1] & 0x12C0102) == 0) {
				Static86.anIntArray341[local56] = local8;
				Static110.anIntArray419[local56] = local53 - 1;
				local56 = local56 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local8][local53 - 1] = 1;
				Static122.anIntArrayArray20[local8][local53 - 1] = local180;
			}
			if (local53 < 103 && Static3.anIntArrayArray1[local8][local53 + 1] == 0 && (local67[local8][local53 + 1] & 0x12C0120) == 0) {
				Static86.anIntArray341[local56] = local8;
				Static110.anIntArray419[local56] = local53 + 1;
				Static3.anIntArrayArray1[local8][local53 + 1] = 4;
				local56 = local56 + 1 & 0xFFF;
				Static122.anIntArrayArray20[local8][local53 + 1] = local180;
			}
			if (local8 > 0 && local53 > 0 && Static3.anIntArrayArray1[local8 - 1][local53 - 1] == 0 && (local67[local8 - 1][local53 - 1] & 0x12C010E) == 0 && (local67[local8 - 1][local53] & 0x12C0108) == 0 && (local67[local8][local53 - 1] & 0x12C0102) == 0) {
				Static86.anIntArray341[local56] = local8 - 1;
				Static110.anIntArray419[local56] = local53 - 1;
				Static3.anIntArrayArray1[local8 - 1][local53 - 1] = 3;
				local56 = local56 + 1 & 0xFFF;
				Static122.anIntArrayArray20[local8 - 1][local53 - 1] = local180;
			}
			if (local8 < 103 && local53 > 0 && Static3.anIntArrayArray1[local8 + 1][local53 - 1] == 0 && (local67[local8 + 1][local53 - 1] & 0x12C0183) == 0 && (local67[local8 + 1][local53] & 0x12C0180) == 0 && (local67[local8][local53 - 1] & 0x12C0102) == 0) {
				Static86.anIntArray341[local56] = local8 + 1;
				Static110.anIntArray419[local56] = local53 - 1;
				local56 = local56 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local8 + 1][local53 - 1] = 9;
				Static122.anIntArrayArray20[local8 + 1][local53 - 1] = local180;
			}
			if (local8 > 0 && local53 < 103 && Static3.anIntArrayArray1[local8 - 1][local53 + 1] == 0 && (local67[local8 - 1][local53 + 1] & 0x12C0138) == 0 && (local67[local8 - 1][local53] & 0x12C0108) == 0 && (local67[local8][local53 + 1] & 0x12C0120) == 0) {
				Static86.anIntArray341[local56] = local8 - 1;
				Static110.anIntArray419[local56] = local53 + 1;
				Static3.anIntArrayArray1[local8 - 1][local53 + 1] = 6;
				Static122.anIntArrayArray20[local8 - 1][local53 + 1] = local180;
				local56 = local56 + 1 & 0xFFF;
			}
			if (local8 < 103 && local53 < 103 && Static3.anIntArrayArray1[local8 + 1][local53 + 1] == 0 && (local67[local8 + 1][local53 + 1] & 0x12C01E0) == 0 && (local67[local8 + 1][local53] & 0x12C0180) == 0 && (local67[local8][local53 + 1] & 0x12C0120) == 0) {
				Static86.anIntArray341[local56] = local8 + 1;
				Static110.anIntArray419[local56] = local53 + 1;
				Static3.anIntArrayArray1[local8 + 1][local53 + 1] = 12;
				local56 = local56 + 1 & 0xFFF;
				Static122.anIntArrayArray20[local8 + 1][local53 + 1] = local180;
			}
		}
		Static194.anInt4453 = 0;
		@Pc(788) int local788;
		if (!local62) {
			if (!arg8) {
				return false;
			}
			local180 = 1000;
			local788 = 100;
			for (@Pc(795) int local795 = arg4 - 10; local795 <= arg4 + 10; local795++) {
				for (@Pc(800) int local800 = arg9 - 10; local800 <= arg9 + 10; local800++) {
					if (local795 >= 0 && local800 >= 0 && local795 < 104 && local800 < 104 && Static122.anIntArrayArray20[local795][local800] < 100) {
						@Pc(820) int local820 = 0;
						@Pc(822) int local822 = 0;
						if (arg9 > local800) {
							local822 = arg9 - local800;
						} else if (arg1 + arg9 - 1 < local800) {
							local822 = local800 + 1 - arg9 - arg1;
						}
						if (local795 < arg4) {
							local820 = arg4 - local795;
						} else if (local795 > arg5 + arg4 - 1) {
							local820 = local795 + 1 - arg4 - arg5;
						}
						@Pc(887) int local887 = local822 * local822 + local820 * local820;
						if (local887 < local180 || local180 == local887 && local788 > Static122.anIntArrayArray20[local795][local800]) {
							local8 = local795;
							local53 = local800;
							local180 = local887;
							local788 = Static122.anIntArrayArray20[local795][local800];
						}
					}
				}
			}
			if (local180 == 1000) {
				return false;
			}
			if (local8 == arg7 && arg10 == local53) {
				return false;
			}
			Static194.anInt4453 = 1;
		}
		@Pc(955) byte local955 = 0;
		Static86.anIntArray341[0] = local8;
		local60 = local955 + 1;
		Static110.anIntArray419[0] = local53;
		local180 = local788 = Static3.anIntArrayArray1[local8][local53];
		while (arg7 != local8 || local53 != arg10) {
			if (local180 != local788) {
				local788 = local180;
				Static86.anIntArray341[local60] = local8;
				Static110.anIntArray419[local60++] = local53;
			}
			if ((local180 & 0x2) != 0) {
				local8++;
			} else if ((local180 & 0x8) != 0) {
				local8--;
			}
			if ((local180 & 0x1) != 0) {
				local53++;
			} else if ((local180 & 0x4) != 0) {
				local53--;
			}
			local180 = Static3.anIntArrayArray1[local8][local53];
		}
		if (local60 > 0) {
			Static128.method2312(arg0, local60);
			return true;
		} else if (arg0 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!oe;BLclient!oe;Lclient!oe;)V")
	public static void method624(@OriginalArg(0) Class72 arg0, @OriginalArg(2) Class72 arg1, @OriginalArg(3) Class72 arg2) {
		Static127.aClass72_281 = arg0;
		Static209.aClass72_235 = arg2;
		Static184.aClass72_254 = arg1;
	}
}
