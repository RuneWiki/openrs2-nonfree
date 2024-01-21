import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "[S")
	public static short[] aShortArray106;

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
	public static int anInt3476 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lclient!sg;")
	public static Class77 method2408(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static2.method61(arg0) : Static89.aClass77_907;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public static void method2409() {
		if (!Static166.aBoolean181) {
			Static131.anIntArray616[0] = 1007;
			Static18.anInt618 = 1;
			Static56.aClass77Array10[0] = Static181.aClass77_1563;
			Static136.aClass77Array20[0] = Static41.aClass77_468;
		}
		if (Static93.anInt2394 != -1) {
			Static38.method769(Static93.anInt2394);
		}
		for (@Pc(30) int local30 = 0; local30 < Static176.anInt4482; local30++) {
			if (Static103.aBooleanArray9[local30]) {
				Static154.aBooleanArray17[local30] = true;
			}
			Static152.aBooleanArray16[local30] = Static103.aBooleanArray9[local30];
			Static103.aBooleanArray9[local30] = false;
		}
		Static152.anInt3725 = -1;
		Static160.anInt4574 = -1;
		Static92.anInt2379 = Static143.anInt3513;
		Static139.aClass66_11 = null;
		if (Static93.anInt2394 != -1) {
			Static176.anInt4482 = 0;
			Static132.method2251(765, Static93.anInt2394, 0, 0, 0, 503, -1, 0);
		}
		Static113.method1232();
		Static79.method1468();
		if (Static166.aBoolean181) {
			Static45.method833();
		} else if (Static160.anInt4574 != -1) {
			Static40.method799(Static160.anInt4574, Static152.anInt3725);
		}
		if (Static58.anInt1521 == 3) {
			for (@Pc(105) int local105 = 0; local105 < Static176.anInt4482; local105++) {
				if (Static152.aBooleanArray16[local105]) {
					Static113.method1246(Static56.anIntArray233[local105], Static74.anIntArray330[local105], Static94.anIntArray385[local105], Static98.anIntArray396[local105], 16711935, 128);
				} else if (Static154.aBooleanArray17[local105]) {
					Static113.method1246(Static56.anIntArray233[local105], Static74.anIntArray330[local105], Static94.anIntArray385[local105], Static98.anIntArray396[local105], 16711680, 128);
				}
			}
		}
		Static180.method3005(Static131.anInt4359, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400, Static54.anInt1472, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385);
		Static131.anInt4359 = 0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	public static void method2410() {
		aShortArray106 = null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	public static boolean method2411(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static170.anIntArrayArray37[local3][local7] = 0;
				Static46.anIntArrayArray11[local3][local7] = 99999999;
			}
		}
		local7 = arg1;
		Static170.anIntArrayArray37[arg1][arg5] = 99;
		Static46.anIntArrayArray11[arg1][arg5] = 0;
		@Pc(53) int local53 = arg5;
		@Pc(55) byte local55 = 0;
		@Pc(57) boolean local57 = false;
		Static42.anIntArray184[0] = arg1;
		@Pc(64) int local64 = local55 + 1;
		Static100.anIntArray103[0] = arg5;
		@Pc(69) int local69 = Static42.anIntArray184.length;
		@Pc(71) int local71 = 0;
		@Pc(76) int[][] local76 = Static27.aClass86Array1[Static54.anInt1472].anIntArrayArray36;
		@Pc(195) int local195;
		while (local64 != local71) {
			local7 = Static42.anIntArray184[local71];
			local53 = Static100.anIntArray103[local71];
			local71 = (local71 + 1) % local69;
			if (arg2 == local7 && local53 == arg9) {
				local57 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && Static27.aClass86Array1[Static54.anInt1472].method2803(local7, arg8, arg9, arg6 - 1, arg2, local53)) {
					local57 = true;
					break;
				}
				if (arg6 < 10 && Static27.aClass86Array1[Static54.anInt1472].method2817(local7, arg9, arg6 - 1, arg2, local53, arg8)) {
					local57 = true;
					break;
				}
			}
			if (arg10 != 0 && arg4 != 0 && Static27.aClass86Array1[Static54.anInt1472].method2804(local7, arg4, arg7, arg9, arg2, arg10, local53)) {
				local57 = true;
				break;
			}
			local195 = Static46.anIntArrayArray11[local7][local53] + 1;
			if (local7 > 0 && Static170.anIntArrayArray37[local7 - 1][local53] == 0 && (local76[local7 - 1][local53] & 0x12C0108) == 0) {
				Static42.anIntArray184[local64] = local7 - 1;
				Static100.anIntArray103[local64] = local53;
				local64 = (local64 + 1) % local69;
				Static170.anIntArrayArray37[local7 - 1][local53] = 2;
				Static46.anIntArrayArray11[local7 - 1][local53] = local195;
			}
			if (local7 < 103 && Static170.anIntArrayArray37[local7 + 1][local53] == 0 && (local76[local7 + 1][local53] & 0x12C0180) == 0) {
				Static42.anIntArray184[local64] = local7 + 1;
				Static100.anIntArray103[local64] = local53;
				Static170.anIntArrayArray37[local7 + 1][local53] = 8;
				local64 = (local64 + 1) % local69;
				Static46.anIntArrayArray11[local7 + 1][local53] = local195;
			}
			if (local53 > 0 && Static170.anIntArrayArray37[local7][local53 - 1] == 0 && (local76[local7][local53 - 1] & 0x12C0102) == 0) {
				Static42.anIntArray184[local64] = local7;
				Static100.anIntArray103[local64] = local53 - 1;
				local64 = (local64 + 1) % local69;
				Static170.anIntArrayArray37[local7][local53 - 1] = 1;
				Static46.anIntArrayArray11[local7][local53 - 1] = local195;
			}
			if (local53 < 103 && Static170.anIntArrayArray37[local7][local53 + 1] == 0 && (local76[local7][local53 + 1] & 0x12C0120) == 0) {
				Static42.anIntArray184[local64] = local7;
				Static100.anIntArray103[local64] = local53 + 1;
				Static170.anIntArrayArray37[local7][local53 + 1] = 4;
				local64 = (local64 + 1) % local69;
				Static46.anIntArrayArray11[local7][local53 + 1] = local195;
			}
			if (local7 > 0 && local53 > 0 && Static170.anIntArrayArray37[local7 - 1][local53 - 1] == 0 && (local76[local7 - 1][local53 - 1] & 0x12C010E) == 0 && (local76[local7 - 1][local53] & 0x12C0108) == 0 && (local76[local7][local53 - 1] & 0x12C0102) == 0) {
				Static42.anIntArray184[local64] = local7 - 1;
				Static100.anIntArray103[local64] = local53 - 1;
				local64 = (local64 + 1) % local69;
				Static170.anIntArrayArray37[local7 - 1][local53 - 1] = 3;
				Static46.anIntArrayArray11[local7 - 1][local53 - 1] = local195;
			}
			if (local7 < 103 && local53 > 0 && Static170.anIntArrayArray37[local7 + 1][local53 - 1] == 0 && (local76[local7 + 1][local53 - 1] & 0x12C0183) == 0 && (local76[local7 + 1][local53] & 0x12C0180) == 0 && (local76[local7][local53 - 1] & 0x12C0102) == 0) {
				Static42.anIntArray184[local64] = local7 + 1;
				Static100.anIntArray103[local64] = local53 - 1;
				local64 = (local64 + 1) % local69;
				Static170.anIntArrayArray37[local7 + 1][local53 - 1] = 9;
				Static46.anIntArrayArray11[local7 + 1][local53 - 1] = local195;
			}
			if (local7 > 0 && local53 < 103 && Static170.anIntArrayArray37[local7 - 1][local53 + 1] == 0 && (local76[local7 - 1][local53 + 1] & 0x12C0138) == 0 && (local76[local7 - 1][local53] & 0x12C0108) == 0 && (local76[local7][local53 + 1] & 0x12C0120) == 0) {
				Static42.anIntArray184[local64] = local7 - 1;
				Static100.anIntArray103[local64] = local53 + 1;
				local64 = (local64 + 1) % local69;
				Static170.anIntArrayArray37[local7 - 1][local53 + 1] = 6;
				Static46.anIntArrayArray11[local7 - 1][local53 + 1] = local195;
			}
			if (local7 < 103 && local53 < 103 && Static170.anIntArrayArray37[local7 + 1][local53 + 1] == 0 && (local76[local7 + 1][local53 + 1] & 0x12C01E0) == 0 && (local76[local7 + 1][local53] & 0x12C0180) == 0 && (local76[local7][local53 + 1] & 0x12C0120) == 0) {
				Static42.anIntArray184[local64] = local7 + 1;
				Static100.anIntArray103[local64] = local53 + 1;
				local64 = (local64 + 1) % local69;
				Static170.anIntArrayArray37[local7 + 1][local53 + 1] = 12;
				Static46.anIntArrayArray11[local7 + 1][local53 + 1] = local195;
			}
		}
		Static110.anInt3442 = 0;
		@Pc(822) int local822;
		@Pc(830) int local830;
		@Pc(837) int local837;
		if (!local57) {
			if (!arg0) {
				return false;
			}
			local822 = 100;
			local195 = 1000;
			for (local830 = arg2 - 10; local830 <= arg2 + 10; local830++) {
				for (local837 = arg9 - 10; local837 <= arg9 + 10; local837++) {
					if (local830 >= 0 && local837 >= 0 && local830 < 104 && local837 < 104 && Static46.anIntArrayArray11[local830][local837] < 100) {
						@Pc(862) int local862 = 0;
						if (local830 < arg2) {
							local862 = arg2 - local830;
						} else if (arg10 + arg2 - 1 < local830) {
							local862 = local830 + 1 - arg10 - arg2;
						}
						@Pc(889) int local889 = 0;
						if (arg9 > local837) {
							local889 = arg9 - local837;
						} else if (local837 > arg4 + arg9 - 1) {
							local889 = local837 + 1 - arg9 - arg4;
						}
						@Pc(926) int local926 = local889 * local889 + local862 * local862;
						if (local195 > local926 || local926 == local195 && local822 > Static46.anIntArrayArray11[local830][local837]) {
							local195 = local926;
							local7 = local830;
							local822 = Static46.anIntArrayArray11[local830][local837];
							local53 = local837;
						}
					}
				}
			}
			if (local195 == 1000) {
				return false;
			}
			if (arg1 == local7 && arg5 == local53) {
				return false;
			}
			Static110.anInt3442 = 1;
		}
		@Pc(994) byte local994 = 0;
		Static42.anIntArray184[0] = local7;
		local71 = local994 + 1;
		Static100.anIntArray103[0] = local53;
		local195 = local822 = Static170.anIntArrayArray37[local7][local53];
		while (arg1 != local7 || arg5 != local53) {
			if (local822 != local195) {
				local822 = local195;
				Static42.anIntArray184[local71] = local7;
				Static100.anIntArray103[local71++] = local53;
			}
			if ((local195 & 0x2) != 0) {
				local7++;
			} else if ((local195 & 0x8) != 0) {
				local7--;
			}
			if ((local195 & 0x1) != 0) {
				local53++;
			} else if ((local195 & 0x4) != 0) {
				local53--;
			}
			local195 = Static170.anIntArrayArray37[local7][local53];
		}
		if (local71 > 0) {
			local69 = local71--;
			local830 = Static100.anIntArray103[local71];
			@Pc(1095) int local1095 = Static42.anIntArray184[local71];
			if (local69 > 25) {
				local69 = 25;
			}
			if (arg3 == 0) {
				Static124.aClass2_Sub18_Sub1_3.method2398(126);
				Static124.aClass2_Sub18_Sub1_3.method2389(local69 + local69 + 3);
			}
			if (arg3 == 1) {
				Static124.aClass2_Sub18_Sub1_3.method2398(112);
				Static124.aClass2_Sub18_Sub1_3.method2389(local69 + local69 + 17);
			}
			if (arg3 == 2) {
				Static124.aClass2_Sub18_Sub1_3.method2398(201);
				Static124.aClass2_Sub18_Sub1_3.method2389(local69 + local69 + 3);
			}
			Static124.aClass2_Sub18_Sub1_3.method2365(Static168.anInt4143 + local830);
			Static85.anInt2206 = Static100.anIntArray103[0];
			Static136.anInt3295 = Static42.anIntArray184[0];
			for (local837 = 1; local837 < local69; local837++) {
				local71--;
				Static124.aClass2_Sub18_Sub1_3.method2397(Static42.anIntArray184[local71] - local1095);
				Static124.aClass2_Sub18_Sub1_3.method2355(Static100.anIntArray103[local71] - local830);
			}
			Static124.aClass2_Sub18_Sub1_3.method2355(Static146.aBooleanArray12[82] ? 1 : 0);
			Static124.aClass2_Sub18_Sub1_3.method2369(local1095 + Static157.anInt3889);
			return true;
		} else if (arg3 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
