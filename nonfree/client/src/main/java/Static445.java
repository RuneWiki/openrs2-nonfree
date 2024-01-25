import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!qu", name = "P", descriptor = "Z")
	public static final boolean aBoolean563 = false;

	@OriginalMember(owner = "client!qu", name = "T", descriptor = "[I")
	public static final int[] anIntArray470 = new int[1024];

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILclient!jw;IIIIIZII)Z")
	public static boolean method6212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class169 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg7;
		@Pc(23) int local23 = arg1 - 64;
		Static285.anIntArrayArray111[64][64] = 99;
		@Pc(34) int local34 = arg7 - 64;
		Static427.anIntArrayArray161[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static305.anIntArray301[0] = arg1;
		@Pc(51) int local51 = local42 + 1;
		Static47.anIntArray608[0] = arg7;
		@Pc(56) int[][] local56 = arg2.anIntArrayArray105;
		while (local44 != local51) {
			local7 = Static305.anIntArray301[local44];
			local9 = Static47.anIntArray608[local44];
			@Pc(71) int local71 = local9 - local34;
			@Pc(76) int local76 = local7 - local23;
			local44 = local44 + 1 & 0xFFF;
			@Pc(88) int local88 = local7 - arg2.anInt4643;
			@Pc(93) int local93 = local9 - arg2.anInt4631;
			if (arg4 == -4) {
				if (arg8 == local7 && local9 == arg3) {
					Static439.anInt7337 = local9;
					Static505.anInt8221 = local7;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static551.method7301(arg9, 2, arg8, arg6, arg3, local9, 2, local7)) {
					Static439.anInt7337 = local9;
					Static505.anInt8221 = local7;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg2.method4033(arg8, local7, arg5, arg3, 2, arg9, arg6, local9, 2)) {
					Static505.anInt8221 = local7;
					Static439.anInt7337 = local9;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg2.method4036(arg6, arg9, local7, arg8, 2, arg5, local9, arg3)) {
					Static505.anInt8221 = local7;
					Static439.anInt7337 = local9;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg2.method4024(2, arg3, arg4, arg0, local7, arg8, local9)) {
					Static505.anInt8221 = local7;
					Static439.anInt7337 = local9;
					return true;
				}
			} else if (arg2.method4039(arg0, arg8, arg4, local7, 2, local9, arg3)) {
				Static505.anInt8221 = local7;
				Static439.anInt7337 = local9;
				return true;
			}
			@Pc(240) int local240 = Static427.anIntArrayArray161[local76][local71] + 1;
			if (local76 > 0 && Static285.anIntArrayArray111[local76 - 1][local71] == 0 && (local56[local88 - 1][local93] & 0x43A40000) == 0 && (local56[local88 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static305.anIntArray301[local51] = local7 - 1;
				Static47.anIntArray608[local51] = local9;
				Static285.anIntArrayArray111[local76 - 1][local71] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static427.anIntArrayArray161[local76 - 1][local71] = local240;
			}
			if (local76 < 126 && Static285.anIntArrayArray111[local76 + 1][local71] == 0 && (local56[local88 + 2][local93] & 0x60E40000) == 0 && (local56[local88 + 2][local93 + 1] & 0x78240000) == 0) {
				Static305.anIntArray301[local51] = local7 + 1;
				Static47.anIntArray608[local51] = local9;
				Static285.anIntArrayArray111[local76 + 1][local71] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static427.anIntArrayArray161[local76 + 1][local71] = local240;
			}
			if (local71 > 0 && Static285.anIntArrayArray111[local76][local71 - 1] == 0 && (local56[local88][local93 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static305.anIntArray301[local51] = local7;
				Static47.anIntArray608[local51] = local9 - 1;
				Static285.anIntArrayArray111[local76][local71 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static427.anIntArrayArray161[local76][local71 - 1] = local240;
			}
			if (local71 < 126 && Static285.anIntArrayArray111[local76][local71 + 1] == 0 && (local56[local88][local93 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local93 + 2] & 0x78240000) == 0) {
				Static305.anIntArray301[local51] = local7;
				Static47.anIntArray608[local51] = local9 + 1;
				Static285.anIntArrayArray111[local76][local71 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static427.anIntArrayArray161[local76][local71 + 1] = local240;
			}
			if (local76 > 0 && local71 > 0 && Static285.anIntArrayArray111[local76 - 1][local71 - 1] == 0 && (local56[local88 - 1][local93] & 0x4FA40000) == 0 && (local56[local88 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local88][local93 - 1] & 0x63E40000) == 0) {
				Static305.anIntArray301[local51] = local7 - 1;
				Static47.anIntArray608[local51] = local9 - 1;
				Static285.anIntArrayArray111[local76 - 1][local71 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static427.anIntArrayArray161[local76 - 1][local71 - 1] = local240;
			}
			if (local76 < 126 && local71 > 0 && Static285.anIntArrayArray111[local76 + 1][local71 - 1] == 0 && (local56[local88 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local93] & 0x78E40000) == 0) {
				Static305.anIntArray301[local51] = local7 + 1;
				Static47.anIntArray608[local51] = local9 - 1;
				Static285.anIntArrayArray111[local76 + 1][local71 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static427.anIntArrayArray161[local76 + 1][local71 - 1] = local240;
			}
			if (local76 > 0 && local71 < 126 && Static285.anIntArrayArray111[local76 - 1][local71 + 1] == 0 && (local56[local88 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local88][local93 + 2] & 0x7E240000) == 0) {
				Static305.anIntArray301[local51] = local7 - 1;
				Static47.anIntArray608[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static285.anIntArrayArray111[local76 - 1][local71 + 1] = 6;
				Static427.anIntArrayArray161[local76 - 1][local71 + 1] = local240;
			}
			if (local76 < 126 && local71 < 126 && Static285.anIntArrayArray111[local76 + 1][local71 + 1] == 0 && (local56[local88 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static305.anIntArray301[local51] = local7 + 1;
				Static47.anIntArray608[local51] = local9 + 1;
				Static285.anIntArrayArray111[local76 + 1][local71 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static427.anIntArrayArray161[local76 + 1][local71 + 1] = local240;
			}
		}
		Static439.anInt7337 = local9;
		Static505.anInt8221 = local7;
		return false;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "()V")
	public static void method6213() {
		if (Static441.aClass54_11 == null) {
			return;
		}
		Static511.aClass45_12.oa(Static275.anIntArray261);
		for (@Pc(10) int local10 = 0; local10 < Static574.anIntArray600.length; local10++) {
			Static511.aClass45_12.method7383(Static275.anIntArray261[1], -256, Static574.anIntArray600[local10] + Static336.anIntArray314[local10], Static275.anIntArray261[3] - Static275.anIntArray261[1]);
		}
		for (@Pc(39) int local39 = 0; local39 < Static465.anInt7743; local39++) {
			@Pc(44) Class308 local44 = Static121.aClass308Array2[local39];
			Static511.aClass45_12.MA(local44.anIntArray506[0], local44.anIntArray505[0], local44.anIntArray504[0], Static335.anIntArray313);
			Static511.aClass45_12.MA(local44.anIntArray506[1], local44.anIntArray505[1], local44.anIntArray504[1], Static46.anIntArray36);
			Static511.aClass45_12.MA(local44.anIntArray506[2], local44.anIntArray505[2], local44.anIntArray504[2], Static96.anIntArray90);
			Static511.aClass45_12.MA(local44.anIntArray506[3], local44.anIntArray505[3], local44.anIntArray504[3], Static305.anIntArray300);
			if (Static335.anIntArray313[2] != -1 && Static46.anIntArray36[2] != -1 && Static96.anIntArray90[2] != -1 && Static305.anIntArray300[2] != -1) {
				@Pc(126) int local126 = -65536;
				if (local44.aByte107 == 4) {
					local126 = -16776961;
				}
				Static511.aClass45_12.method7388(Static46.anIntArray36[0], Static335.anIntArray313[1], local126, Static335.anIntArray313[0], Static46.anIntArray36[1]);
				Static511.aClass45_12.method7388(Static96.anIntArray90[0], Static46.anIntArray36[1], local126, Static46.anIntArray36[0], Static96.anIntArray90[1]);
				Static511.aClass45_12.method7388(Static305.anIntArray300[0], Static96.anIntArray90[1], local126, Static96.anIntArray90[0], Static305.anIntArray300[1]);
				Static511.aClass45_12.method7388(Static335.anIntArray313[0], Static305.anIntArray300[1], local126, Static305.anIntArray300[0], Static335.anIntArray313[1]);
				Static511.aClass45_12.method7388(Static96.anIntArray90[0], Static335.anIntArray313[1], local126, Static335.anIntArray313[0], Static96.anIntArray90[1]);
			}
		}
		Static441.aClass54_11.method7796("Static Opaque: OW: " + Static279.anIntArray622[0] + "/" + Static317.anIntArray307[0] + " UW: " + Static279.anIntArray622[1] + "/" + Static317.anIntArray307[1], -16777216, 10, -256, 30);
		Static441.aClass54_11.method7796("Static Trans: OW: " + Static462.anIntArray496[0] + "/" + Static231.anIntArray212[0] + " UW: " + Static462.anIntArray496[1] + "/" + Static231.anIntArray212[1], -16777216, 10, -256, 45);
		Static441.aClass54_11.method7796("Static Anim: OW: " + Static505.anIntArray524[0] + "/" + Static198.anIntArray196[0] + " UW: " + Static505.anIntArray524[1] + "/" + Static198.anIntArray196[1], -16777216, 10, -256, 60);
		Static441.aClass54_11.method7796("Dynamic: " + Static460.anInt6105 + "/" + 5000, -16777216, 10, -256, 75);
		Static441.aClass54_11.method7796("Total Opaque Onscreen: " + Static90.anInt1894 + "/" + 10000, -16777216, 10, -256, 90);
		Static441.aClass54_11.method7796("Total Trans Onscreen: " + Static122.anInt2802 + "/" + 5000, -16777216, 10, -256, 105);
		Static441.aClass54_11.method7796("Occluders: " + (Static118.anInt2726 + Static145.anInt3113) + " Active: " + Static465.anInt7743, -16777216, 10, -256, 120);
		Static441.aClass54_11.method7796("Occluded: Ground:" + Static244.anInt4331 + " Walls: " + Static490.anInt7997 + " CPs: " + Static299.anInt5092 + " Pixels: " + Static328.anInt5532, -16777216, 10, -256, 135);
		Static441.aClass54_11.method7796("Occlude Calc Took: " + Static236.aLong124 / 1000L + "us", -16777216, 10, -256, 150);
		if (Static128.anIntArray130 == null) {
			return;
		}
		for (@Pc(456) int local456 = 0; local456 < Static128.anIntArray130.length; local456++) {
			@Pc(462) float local462 = (float) Static128.anIntArray130[local456];
			local462 /= 4194304.0F;
			if (local462 > 1.0F) {
				local462 = 1.0F;
			}
			local462 *= 255.0F;
			local462 = 255.0F - local462;
			@Pc(483) int local483 = (int) local462;
			Static128.anIntArray130[local456] = local483 | local483 << 8 | local483 << 16 | 0xFF000000;
		}
		@Pc(510) Class14 local510 = Static511.aClass45_12.method7395(Static128.anIntArray130, Static365.anInt6275, Static365.anInt6275, Static76.anInt1726);
		local510.V(10, 170, 1, 0, 0);
	}
}
