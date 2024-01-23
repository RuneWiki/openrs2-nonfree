import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_1257 = Static184.method2923("weiss:");

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_1258 = Static184.method2923("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!w", name = "n", descriptor = "[Lclient!jj;")
	public static Class51[] aClass51Array3 = new Class51[100];

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	public static int anInt4711 = 0;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Lclient!i;")
	public static Class41 aClass41_1259 = Static184.method2923("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method3254() {
		@Pc(9) int local9 = Static120.anInt2898 * 128 + 64;
		@Pc(15) int local15 = Static153.anInt3581 * 128 + 64;
		@Pc(23) int local23 = method3261(local9, local15, Static134.anInt3147) - Static62.anInt1673;
		if (Static69.anInt1817 < local9) {
			Static69.anInt1817 += Static145.anInt3309 * (local9 - Static69.anInt1817) / 1000 + Static218.anInt4774;
			if (local9 < Static69.anInt1817) {
				Static69.anInt1817 = local9;
			}
		}
		if (local15 > Static163.anInt3822) {
			Static163.anInt3822 += (local15 - Static163.anInt3822) * Static145.anInt3309 / 1000 + Static218.anInt4774;
			if (local15 < Static163.anInt3822) {
				Static163.anInt3822 = local15;
			}
		}
		if (local9 < Static69.anInt1817) {
			Static69.anInt1817 -= (Static69.anInt1817 - local9) * Static145.anInt3309 / 1000 + Static218.anInt4774;
			if (local9 > Static69.anInt1817) {
				Static69.anInt1817 = local9;
			}
		}
		local9 = Static42.anInt254 * 128 + 64;
		if (Static163.anInt3822 > local15) {
			Static163.anInt3822 -= Static218.anInt4774 + Static145.anInt3309 * (Static163.anInt3822 - local15) / 1000;
			if (Static163.anInt3822 < local15) {
				Static163.anInt3822 = local15;
			}
		}
		if (Static94.anInt2320 < local23) {
			Static94.anInt2320 += Static145.anInt3309 * (local23 - Static94.anInt2320) / 1000 + Static218.anInt4774;
			if (Static94.anInt2320 > local23) {
				Static94.anInt2320 = local23;
			}
		}
		local15 = Static21.anInt4633 * 128 + 64;
		if (local23 < Static94.anInt2320) {
			Static94.anInt2320 -= Static218.anInt4774 + (Static94.anInt2320 - local23) * Static145.anInt3309 / 1000;
			if (Static94.anInt2320 < local23) {
				Static94.anInt2320 = local23;
			}
		}
		local23 = method3261(local9, local15, Static134.anInt3147) - Static59.anInt1641;
		@Pc(199) int local199 = local9 - Static69.anInt1817;
		@Pc(204) int local204 = local23 - Static94.anInt2320;
		@Pc(208) int local208 = local15 - Static163.anInt3822;
		@Pc(219) int local219 = (int) Math.sqrt((double) (local199 * local199 + local208 * local208));
		@Pc(230) int local230 = (int) (Math.atan2((double) local204, (double) local219) * 325.949D) & 0x7FF;
		@Pc(241) int local241 = (int) (Math.atan2((double) local199, (double) local208) * -325.949D) & 0x7FF;
		if (local230 < 128) {
			local230 = 128;
		}
		@Pc(251) int local251 = local241 - Static152.anInt3512;
		if (local251 > 1024) {
			local251 -= 2048;
		}
		if (local230 > 383) {
			local230 = 383;
		}
		if (local251 < -1024) {
			local251 += 2048;
		}
		if (Static183.anInt1325 < local230) {
			Static183.anInt1325 += (local230 - Static183.anInt1325) * Static131.anInt3004 / 1000 + Static8.anInt336;
			if (Static183.anInt1325 > local230) {
				Static183.anInt1325 = local230;
			}
		}
		if (local251 > 0) {
			Static152.anInt3512 += Static131.anInt3004 * local251 / 1000 + Static8.anInt336;
			Static152.anInt3512 &= 0x7FF;
		}
		if (local251 < 0) {
			Static152.anInt3512 -= Static8.anInt336 + Static131.anInt3004 * -local251 / 1000;
			Static152.anInt3512 &= 0x7FF;
		}
		if (Static183.anInt1325 > local230) {
			Static183.anInt1325 -= (Static183.anInt1325 - local230) * Static131.anInt3004 / 1000 + Static8.anInt336;
			if (Static183.anInt1325 < local230) {
				Static183.anInt1325 = local230;
			}
		}
		@Pc(356) int local356 = local241 - Static152.anInt3512;
		if (local356 > 1024) {
			local356 -= 2048;
		}
		if (local356 < -1024) {
			local356 += 2048;
		}
		if (local356 < 0 && local251 > 0 || local356 > 0 && local251 < 0) {
			Static152.anInt3512 = local241;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method3255() {
		Static219.anIntArray501 = null;
		Static60.anIntArray498 = null;
		Static120.anIntArray310 = null;
		Static102.aByteArrayArray6 = null;
		Static25.anIntArray494 = null;
		Static89.anIntArray224 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Lclient!q;")
	public static Class80 method3256(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static68.aClass80ArrayArray1[local12] == null || Static68.aClass80ArrayArray1[local12][local16] == null) {
			@Pc(32) boolean local32 = Static187.method2974(local12);
			if (!local32) {
				return null;
			}
		}
		return Static68.aClass80ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z")
	public static boolean method3258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static211.anIntArrayArrayArray21[arg0][arg1][arg2];
		if (local7 == -Static128.anInt2975) {
			return false;
		} else if (local7 == Static128.anInt2975) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static91.method1600(local22 + 1, Static56.anIntArrayArrayArray7[arg0][arg1][arg2], local26 + 1) && Static91.method1600(local22 + 128 - 1, Static56.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local26 + 1) && Static91.method1600(local22 + 128 - 1, Static56.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static91.method1600(local22 + 1, Static56.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static211.anIntArrayArrayArray21[arg0][arg1][arg2] = Static128.anInt2975;
				return true;
			} else {
				Static211.anIntArrayArrayArray21[arg0][arg1][arg2] = -Static128.anInt2975;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!i;ZLclient!nb;Lclient!i;)[Lclient!rc;")
	public static Class2_Sub2_Sub16[] method3259(@OriginalArg(0) Class41 arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) Class41 arg2) {
		@Pc(4) int local4 = arg1.method414(arg0);
		@Pc(23) int local23 = arg1.method416(arg2, local4);
		return Static32.method632(local23, arg1, local4);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!nb;II)[Lclient!pf;")
	public static Class2_Sub2_Sub16_Sub1[] method3260(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2) {
		return Static43.method900(arg1, arg2, arg0) ? Static32.method631() : null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)I")
	public static int method3261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(16) int local16 = arg0 >> 7;
		if (local16 < 0 || local7 < 0 || local16 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(34) int local34 = arg1 & 0x7F;
		@Pc(36) int local36 = arg2;
		@Pc(40) int local40 = arg0 & 0x7F;
		if (arg2 < 3 && (Static102.aByteArrayArrayArray7[1][local16][local7] & 0x2) == 2) {
			local36 = arg2 + 1;
		}
		@Pc(82) int local82 = Static56.anIntArrayArrayArray7[local36][local16 + 1][local7] * local40 + (128 - local40) * Static56.anIntArrayArrayArray7[local36][local16][local7] >> 7;
		@Pc(112) int local112 = Static56.anIntArrayArrayArray7[local36][local16 + 1][local7 + 1] * local40 + Static56.anIntArrayArrayArray7[local36][local16][local7 + 1] * (128 - local40) >> 7;
		return local34 * local112 + (128 - local34) * local82 >> 7;
	}
}
