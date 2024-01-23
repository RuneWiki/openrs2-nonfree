import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	public static int anInt3998 = 0;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString138 = "glow1:";

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
	public static int anInt4009 = 0;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "[I")
	public static int[] anIntArray458 = new int[8];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([[F[[I[[B[[F[[B[[I[[I[[I[[BI[[[I[[B[[II[[[B[[F)[Lclient!rc;")
	public static Class1_Sub25[] method3157(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(10) int[][][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int[][] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) byte[][][] arg13, @OriginalArg(15) float[][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(57) byte local57;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local18 = 1; local18 <= 103; local18++) {
				local23 = 0;
				if (arg9 != null) {
					@Pc(38) int local38 = arg9[arg12][local11 >> 3][local18 >> 3];
					local23 = local38 >> 1 & 0x3;
				}
				if (local23 == 0) {
					local57 = arg10[local11][local18];
					if (local57 == 0) {
						local57 = arg10[local11 - 1][local18];
					}
					if (local57 == 0) {
						local57 = arg10[local11][local18 - 1];
					}
					if (local57 == 0) {
						local57 = arg10[local11 - 1][local18 - 1];
					}
				} else if (local23 == 1) {
					local57 = arg10[local11][local18 - 1];
					if (local57 == 0) {
						local57 = arg10[local11][local18];
					}
					if (local57 == 0) {
						local57 = arg10[local11 - 1][local18 - 1];
					}
					if (local57 == 0) {
						local57 = arg10[local11 - 1][local18];
					}
				} else if (local23 == 2) {
					local57 = arg10[local11 - 1][local18 - 1];
					if (local57 == 0) {
						local57 = arg10[local11][local18 - 1];
					}
					if (local57 == 0) {
						local57 = arg10[local11 - 1][local18];
					}
					if (local57 == 0) {
						local57 = arg10[local11][local18];
					}
				} else {
					local57 = arg10[local11 - 1][local18];
					if (local57 == 0) {
						local57 = arg10[local11 - 1][local18 - 1];
					}
					if (local57 == 0) {
						local57 = arg10[local11][local18];
					}
					if (local57 == 0) {
						local57 = arg10[local11][local18 - 1];
					}
				}
				if (local57 != 0) {
					@Pc(252) Class130 local252 = Static33.method619((local57 & 0xFF) - 1);
					local9[local11][local18] = (local252.anInt3775 + 1 << 16) + local252.anInt3771;
				}
			}
		}
		@Pc(277) Class22 local277 = new Class22(128);
		@Pc(337) int local337;
		@Pc(357) int local357;
		@Pc(331) int local331;
		for (local18 = 1; local18 <= 102; local18++) {
			for (local23 = 1; local23 <= 102; local23++) {
				if (arg10[local18][local23] != 0) {
					@Pc(313) int[] local313;
					if (arg4[local18][local23] == 0) {
						local313 = Static116.anIntArrayArray20[0];
					} else {
						local313 = Static189.anIntArrayArray29[arg2[local18][local23]];
						if (local313.length == 0) {
							continue;
						}
					}
					local331 = 0;
					local337 = local9[local18][local23];
					if (arg1 != null) {
						local331 = arg1[local18][local23] & 0xFFFFFF;
					}
					local357 = local9[local18 + 1][local23];
					@Pc(365) int local365 = local9[local18][local23 + 1];
					@Pc(375) int local375 = local9[local18 + 1][local23 + 1];
					@Pc(383) long local383 = (long) local331 | (long) local337 << 32;
					@Pc(391) long local391 = (long) local357 << 32 | (long) local331;
					@Pc(399) long local399 = (long) local331 | (long) local365 << 32;
					@Pc(407) long local407 = (long) local331 | (long) local375 << 32;
					@Pc(412) int local412 = local313.length / 2;
					@Pc(418) Class1_Sub25 local418 = (Class1_Sub25) local277.method633(local383);
					if (local418 == null) {
						local418 = new Class1_Sub25((local337 >> 16) - 1, (float) (local337 & 0xFFFF), false, arg5 != null, local331);
						local277.method643(local383, local418);
					}
					local418.anInt4713++;
					local418.anInt4714 += local412;
					if (local391 != local383) {
						local418 = (Class1_Sub25) local277.method633(local391);
						if (local418 == null) {
							local418 = new Class1_Sub25((local357 >> 16) - 1, (float) (local357 & 0xFFFF), false, arg5 != null, local331);
							local277.method643(local391, local418);
						}
						local418.anInt4714 += local412;
						local418.anInt4713++;
					}
					if (local407 != local383 && local407 != local391) {
						local418 = (Class1_Sub25) local277.method633(local407);
						if (local418 == null) {
							local418 = new Class1_Sub25((local375 >> 16) - 1, (float) (local375 & 0xFFFF), false, arg5 != null, local331);
							local277.method643(local407, local418);
						}
						local418.anInt4714 += local412;
						local418.anInt4713++;
					}
					if (local383 != local399 && local391 != local399 && local407 != local399) {
						local418 = (Class1_Sub25) local277.method633(local399);
						if (local418 == null) {
							local418 = new Class1_Sub25((local365 >> 16) - 1, (float) (local365 & 0xFFFF), false, arg5 != null, local331);
							local277.method643(local399, local418);
						}
						local418.anInt4714 += local412;
						local418.anInt4713++;
					}
				}
			}
		}
		@Pc(658) Class1_Sub25 local658;
		for (local658 = (Class1_Sub25) local277.method640(); local658 != null; local658 = (Class1_Sub25) local277.method637()) {
			local658.method3600();
		}
		for (local18 = 1; local18 <= 102; local18++) {
			for (local23 = 1; local23 <= 102; local23++) {
				local57 = arg10[local18][local23];
				if (local57 != 0) {
					if ((arg13[arg12][local18][local23] & 0x8) != 0) {
						local331 = 0;
					} else if ((arg13[1][local18][local23] & 0x2) == 2 && arg12 > 0) {
						local331 = arg12 - 1;
					} else {
						local331 = arg12;
					}
					@Pc(736) boolean[] local736 = null;
					local357 = 128;
					local337 = 0;
					if (arg1 != null) {
						local357 = arg1[local18][local23] >>> 24 << 3;
						local337 = arg1[local18][local23] & 0xFFFFFF;
					}
					@Pc(822) int local822;
					@Pc(902) int local902;
					@Pc(777) int[] local777;
					@Pc(791) byte local791;
					@Pc(847) int local847;
					@Pc(879) int local879;
					if (arg4[local18][local23] == 0) {
						local777 = Static116.anIntArrayArray20[0];
						local822 = local57 == arg10[local18 - 1][local23 - 1] ? 1 : -1;
						local847 = arg10[local18 + 1][local23 - 1] == local57 ? 1 : -1;
						if (local57 == arg10[local18][local23 - 1]) {
							local847++;
							local822++;
						} else {
							local847--;
							local822--;
						}
						local879 = local57 == arg10[local18 - 1][local23 + 1] ? 1 : -1;
						local902 = local57 == arg10[local18 + 1][local23 + 1] ? 1 : -1;
						if (arg10[local18 + 1][local23] == local57) {
							local902++;
							local847++;
						} else {
							local847--;
							local902--;
						}
						if (local57 == arg10[local18][local23 + 1]) {
							local879++;
							local902++;
						} else {
							local902--;
							local879--;
						}
						if (local57 == arg10[local18 - 1][local23]) {
							local879++;
							local822++;
						} else {
							local879--;
							local822--;
						}
						@Pc(963) int local963 = local847 - local879;
						@Pc(968) int local968 = local822 - local902;
						if (local968 < 0) {
							local968 = -local968;
						}
						if (local963 < 0) {
							local963 = -local963;
						}
						local791 = (byte) (local968 < local963 ? 1 : 0);
						arg8[local18][local23] = local791;
					} else {
						local777 = Static189.anIntArrayArray29[arg2[local18][local23]];
						local736 = Static192.aBooleanArrayArray11[arg2[local18][local23]];
						local791 = arg8[local18][local23];
						if (local777.length == 0) {
							continue;
						}
					}
					local847 = local9[local18 + 1][local23];
					local822 = local9[local18][local23];
					local902 = local9[local18 + 1][local23 + 1];
					local879 = local9[local18][local23 + 1];
					@Pc(1036) long local1036 = (long) local879 << 32 | (long) local337;
					@Pc(1044) long local1044 = (long) local847 << 32 | (long) local337;
					@Pc(1052) long local1052 = (long) local337 | (long) local822 << 32;
					@Pc(1060) long local1060 = (long) local337 | (long) local902 << 32;
					@Pc(1066) int local1066 = arg11[local18][local23];
					@Pc(1074) int local1074 = arg11[local18 + 1][local23];
					@Pc(1084) int local1084 = arg11[local18 + 1][local23 + 1];
					@Pc(1092) int local1092 = arg11[local18][local23 + 1];
					@Pc(1098) int local1098 = arg7[local18][local23];
					@Pc(1106) int local1106 = arg7[local18 + 1][local23];
					@Pc(1116) int local1116 = arg7[local18 + 1][local23 + 1];
					@Pc(1122) int local1122 = (local822 >> 16) - 1;
					@Pc(1130) int local1130 = arg7[local18][local23 + 1];
					@Pc(1136) int local1136 = (local879 >> 16) - 1;
					@Pc(1142) int local1142 = (local847 >> 16) - 1;
					@Pc(1148) int local1148 = (local902 >> 16) - 1;
					@Pc(1154) Class1_Sub25 local1154 = (Class1_Sub25) local277.method633(local1052);
					Static210.method3344(arg14, arg0, arg6, Static44.method814(local1122, local1084, local1116), local822 >= local822, Static44.method814(local1122, local1066, local1098), local331, local18, local736, local777, local822 <= local902, arg5, local791, Static44.method814(local1122, local1092, local1130), local847 >= local822, Static44.method814(local1122, local1074, local1106), local1154, local357, local23, arg3, local822 <= local879);
					if (local1052 != local1044) {
						local1154 = (Class1_Sub25) local277.method633(local1044);
						Static210.method3344(arg14, arg0, arg6, Static44.method814(local1142, local1084, local1116), local822 >= local847, Static44.method814(local1142, local1066, local1098), local331, local18, local736, local777, local902 >= local847, arg5, local791, Static44.method814(local1142, local1092, local1130), local847 <= local847, Static44.method814(local1142, local1074, local1106), local1154, local357, local23, arg3, local847 <= local879);
					}
					if (local1060 != local1052 && local1060 != local1044) {
						local1154 = (Class1_Sub25) local277.method633(local1060);
						Static210.method3344(arg14, arg0, arg6, Static44.method814(local1148, local1084, local1116), local822 >= local902, Static44.method814(local1148, local1066, local1098), local331, local18, local736, local777, local902 >= local902, arg5, local791, Static44.method814(local1148, local1092, local1130), local902 <= local847, Static44.method814(local1148, local1074, local1106), local1154, local357, local23, arg3, local879 >= local902);
					}
					if (local1036 != local1052 && local1036 != local1044 && local1036 != local1060) {
						local1154 = (Class1_Sub25) local277.method633(local1036);
						Static210.method3344(arg14, arg0, arg6, Static44.method814(local1136, local1084, local1116), local879 <= local822, Static44.method814(local1136, local1066, local1098), local331, local18, local736, local777, local879 <= local902, arg5, local791, Static44.method814(local1136, local1092, local1130), local879 <= local847, Static44.method814(local1136, local1074, local1106), local1154, local357, local23, arg3, local879 <= local879);
					}
				}
			}
		}
		for (local658 = (Class1_Sub25) local277.method640(); local658 != null; local658 = (Class1_Sub25) local277.method637()) {
			if (local658.anInt4711 == 0) {
				local658.method4534();
			} else {
				local658.method3604();
			}
		}
		local18 = local277.method642();
		@Pc(1526) Class1_Sub25[] local1526 = new Class1_Sub25[local18];
		@Pc(1529) long[] local1529 = new long[local18];
		local277.method639(local1526);
		for (local331 = 0; local331 < local18; local331++) {
			local1529[local331] = local1526[local331].aLong202;
		}
		Static185.method2796(local1529, local1526);
		return local1526;
	}
}
