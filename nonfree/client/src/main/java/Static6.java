import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "J")
	public static long aLong7;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public static int anInt137 = -1;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	public static volatile int anInt138 = -1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method99() {
		if (Static113.anIntArray218 != null && Static25.anIntArray445 != null) {
			return;
		}
		Static113.anIntArray218 = new int[256];
		Static25.anIntArray445 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static113.anIntArray218[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static25.anIntArray445[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZIIBIIIIIII)Z")
	public static boolean method100(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static96.anIntArrayArray21[local7][local11] = 0;
				Static22.anIntArrayArray1[local7][local11] = 99999999;
			}
		}
		Static96.anIntArrayArray21[arg2][arg5] = 99;
		Static22.anIntArrayArray1[arg2][arg5] = 0;
		local11 = arg2;
		@Pc(51) byte local51 = 0;
		Static23.anIntArray39[0] = arg2;
		@Pc(57) boolean local57 = false;
		@Pc(59) int local59 = arg5;
		@Pc(61) int local61 = 0;
		@Pc(64) int local64 = local51 + 1;
		Static177.anIntArray435[0] = arg5;
		@Pc(71) int[][] local71 = Static128.aClass69Array1[Static99.anInt2422].anIntArrayArray35;
		@Pc(74) int local74 = Static23.anIntArray39.length;
		@Pc(187) int local187;
		while (local64 != local61) {
			local11 = Static23.anIntArray39[local61];
			local59 = Static177.anIntArray435[local61];
			local61 = (local61 + 1) % local74;
			if (arg10 == local11 && arg6 == local59) {
				local57 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static128.aClass69Array1[Static99.anInt2422].method2256(arg10, arg0 - 1, arg9, arg6, local59, local11)) {
					local57 = true;
					break;
				}
				if (arg0 < 10 && Static128.aClass69Array1[Static99.anInt2422].method2261(arg9, arg6, arg10, local59, local11, arg0 - 1)) {
					local57 = true;
					break;
				}
			}
			if (arg3 != 0 && arg8 != 0 && Static128.aClass69Array1[Static99.anInt2422].method2249(arg7, arg10, arg3, local11, arg8, arg6, local59)) {
				local57 = true;
				break;
			}
			local187 = Static22.anIntArrayArray1[local11][local59] + 1;
			if (local11 > 0 && Static96.anIntArrayArray21[local11 - 1][local59] == 0 && (local71[local11 - 1][local59] & 0x12C0108) == 0) {
				Static23.anIntArray39[local64] = local11 - 1;
				Static177.anIntArray435[local64] = local59;
				local64 = (local64 + 1) % local74;
				Static96.anIntArrayArray21[local11 - 1][local59] = 2;
				Static22.anIntArrayArray1[local11 - 1][local59] = local187;
			}
			if (local11 < 103 && Static96.anIntArrayArray21[local11 + 1][local59] == 0 && (local71[local11 + 1][local59] & 0x12C0180) == 0) {
				Static23.anIntArray39[local64] = local11 + 1;
				Static177.anIntArray435[local64] = local59;
				local64 = (local64 + 1) % local74;
				Static96.anIntArrayArray21[local11 + 1][local59] = 8;
				Static22.anIntArrayArray1[local11 + 1][local59] = local187;
			}
			if (local59 > 0 && Static96.anIntArrayArray21[local11][local59 - 1] == 0 && (local71[local11][local59 - 1] & 0x12C0102) == 0) {
				Static23.anIntArray39[local64] = local11;
				Static177.anIntArray435[local64] = local59 - 1;
				Static96.anIntArrayArray21[local11][local59 - 1] = 1;
				Static22.anIntArrayArray1[local11][local59 - 1] = local187;
				local64 = (local64 + 1) % local74;
			}
			if (local59 < 103 && Static96.anIntArrayArray21[local11][local59 + 1] == 0 && (local71[local11][local59 + 1] & 0x12C0120) == 0) {
				Static23.anIntArray39[local64] = local11;
				Static177.anIntArray435[local64] = local59 + 1;
				local64 = (local64 + 1) % local74;
				Static96.anIntArrayArray21[local11][local59 + 1] = 4;
				Static22.anIntArrayArray1[local11][local59 + 1] = local187;
			}
			if (local11 > 0 && local59 > 0 && Static96.anIntArrayArray21[local11 - 1][local59 - 1] == 0 && (local71[local11 - 1][local59 - 1] & 0x12C010E) == 0 && (local71[local11 - 1][local59] & 0x12C0108) == 0 && (local71[local11][local59 - 1] & 0x12C0102) == 0) {
				Static23.anIntArray39[local64] = local11 - 1;
				Static177.anIntArray435[local64] = local59 - 1;
				local64 = (local64 + 1) % local74;
				Static96.anIntArrayArray21[local11 - 1][local59 - 1] = 3;
				Static22.anIntArrayArray1[local11 - 1][local59 - 1] = local187;
			}
			if (local11 < 103 && local59 > 0 && Static96.anIntArrayArray21[local11 + 1][local59 - 1] == 0 && (local71[local11 + 1][local59 - 1] & 0x12C0183) == 0 && (local71[local11 + 1][local59] & 0x12C0180) == 0 && (local71[local11][local59 - 1] & 0x12C0102) == 0) {
				Static23.anIntArray39[local64] = local11 + 1;
				Static177.anIntArray435[local64] = local59 - 1;
				Static96.anIntArrayArray21[local11 + 1][local59 - 1] = 9;
				local64 = (local64 + 1) % local74;
				Static22.anIntArrayArray1[local11 + 1][local59 - 1] = local187;
			}
			if (local11 > 0 && local59 < 103 && Static96.anIntArrayArray21[local11 - 1][local59 + 1] == 0 && (local71[local11 - 1][local59 + 1] & 0x12C0138) == 0 && (local71[local11 - 1][local59] & 0x12C0108) == 0 && (local71[local11][local59 + 1] & 0x12C0120) == 0) {
				Static23.anIntArray39[local64] = local11 - 1;
				Static177.anIntArray435[local64] = local59 + 1;
				Static96.anIntArrayArray21[local11 - 1][local59 + 1] = 6;
				Static22.anIntArrayArray1[local11 - 1][local59 + 1] = local187;
				local64 = (local64 + 1) % local74;
			}
			if (local11 < 103 && local59 < 103 && Static96.anIntArrayArray21[local11 + 1][local59 + 1] == 0 && (local71[local11 + 1][local59 + 1] & 0x12C01E0) == 0 && (local71[local11 + 1][local59] & 0x12C0180) == 0 && (local71[local11][local59 + 1] & 0x12C0120) == 0) {
				Static23.anIntArray39[local64] = local11 + 1;
				Static177.anIntArray435[local64] = local59 + 1;
				Static96.anIntArrayArray21[local11 + 1][local59 + 1] = 12;
				Static22.anIntArrayArray1[local11 + 1][local59 + 1] = local187;
				local64 = (local64 + 1) % local74;
			}
		}
		Static182.anInt4005 = 0;
		@Pc(793) int local793;
		@Pc(799) int local799;
		@Pc(806) int local806;
		if (!local57) {
			if (!arg1) {
				return false;
			}
			local187 = 1000;
			local793 = 100;
			for (local799 = arg10 - 10; local799 <= arg10 + 10; local799++) {
				for (local806 = arg6 - 10; local806 <= arg6 + 10; local806++) {
					if (local799 >= 0 && local806 >= 0 && local799 < 104 && local806 < 104 && Static22.anIntArrayArray1[local799][local806] < 100) {
						@Pc(837) int local837 = 0;
						@Pc(839) int local839 = 0;
						if (local799 < arg10) {
							local837 = arg10 - local799;
						} else if (local799 > arg10 + arg3 - 1) {
							local837 = local799 + 1 - arg10 - arg3;
						}
						if (arg6 > local806) {
							local839 = arg6 - local806;
						} else if (arg8 + arg6 - 1 < local806) {
							local839 = local806 + 1 - arg6 - arg8;
						}
						@Pc(904) int local904 = local837 * local837 + local839 * local839;
						if (local187 > local904 || local187 == local904 && Static22.anIntArrayArray1[local799][local806] < local793) {
							local793 = Static22.anIntArrayArray1[local799][local806];
							local187 = local904;
							local11 = local799;
							local59 = local806;
						}
					}
				}
			}
			if (local187 == 1000) {
				return false;
			}
			if (local11 == arg2 && arg5 == local59) {
				return false;
			}
			Static182.anInt4005 = 1;
		}
		@Pc(975) byte local975 = 0;
		Static23.anIntArray39[0] = local11;
		local61 = local975 + 1;
		Static177.anIntArray435[0] = local59;
		local187 = local793 = Static96.anIntArrayArray21[local11][local59];
		while (arg2 != local11 || local59 != arg5) {
			if (local187 != local793) {
				local793 = local187;
				Static23.anIntArray39[local61] = local11;
				Static177.anIntArray435[local61++] = local59;
			}
			if ((local187 & 0x1) != 0) {
				local59++;
			} else if ((local187 & 0x4) != 0) {
				local59--;
			}
			if ((local187 & 0x2) != 0) {
				local11++;
			} else if ((local187 & 0x8) != 0) {
				local11--;
			}
			local187 = Static96.anIntArrayArray21[local11][local59];
		}
		if (local61 > 0) {
			local74 = local61;
			if (local61 > 25) {
				local74 = 25;
			}
			local61--;
			@Pc(1072) int local1072 = Static23.anIntArray39[local61];
			local799 = Static177.anIntArray435[local61];
			if (arg4 == 0) {
				Static133.aClass3_Sub4_Sub1_3.method233(2);
				Static133.aClass3_Sub4_Sub1_3.method206(local74 + local74 + 3);
			}
			if (arg4 == 1) {
				Static133.aClass3_Sub4_Sub1_3.method233(191);
				Static133.aClass3_Sub4_Sub1_3.method206(local74 + local74 + 17);
			}
			if (arg4 == 2) {
				Static133.aClass3_Sub4_Sub1_3.method233(31);
				Static133.aClass3_Sub4_Sub1_3.method206(local74 + local74 + 3);
			}
			Static18.anInt423 = Static177.anIntArray435[0];
			Static32.anInt911 = Static23.anIntArray39[0];
			for (local806 = 1; local806 < local74; local806++) {
				local61--;
				Static133.aClass3_Sub4_Sub1_3.method206(Static23.anIntArray39[local61] - local1072);
				Static133.aClass3_Sub4_Sub1_3.method176(Static177.anIntArray435[local61] - local799);
			}
			Static133.aClass3_Sub4_Sub1_3.method183(local799 + Static58.anInt1578);
			Static133.aClass3_Sub4_Sub1_3.method198(local1072 + Static42.anInt1173);
			Static133.aClass3_Sub4_Sub1_3.method176(Static97.aBooleanArray9[82] ? 1 : 0);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
