import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public static int anInt1680 = 0;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	public static int anInt1681 = 0;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "[I")
	public static int[] anIntArray161 = new int[4000];

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!rc;")
	public static Class55 aClass55_649 = Static34.method846("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	public static int anInt1685 = 0;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!rc;")
	public static Class55 aClass55_650 = Static34.method846("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!le", name = "w", descriptor = "Lclient!rc;")
	public static Class55 aClass55_651 = Static34.method846("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V")
	public static void method1156(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static22.method654(arg0)) {
			return;
		}
		@Pc(21) Class6_Sub2_Sub14[] local21 = Static9.aClass6_Sub2_Sub14ArrayArray1[arg0];
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(29) Class6_Sub2_Sub14 local29 = local21[local23];
			if (local29.anObjectArray9 != null) {
				Static51.method1093(0, local29.anObjectArray9, local29, 0);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method1157() {
		for (@Pc(3) int local3 = 0; local3 < Static59.anInt1826; local3++) {
			@Pc(14) int local14 = Static102.anIntArray288[local3];
			@Pc(18) Class6_Sub2_Sub3_Sub1_Sub1 local18 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local14];
			@Pc(22) int local22 = Static13.aClass6_Sub1_Sub1_2.method1495();
			if ((local22 & 0x40) != 0) {
				local22 += Static13.aClass6_Sub1_Sub1_2.method1495() << 8;
			}
			Static88.method2091(local18, local14, local22);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method1158() {
		@Pc(9) int local9 = Static51.anInt1598 * 128 + 64;
		@Pc(15) int local15 = Static32.anInt1216 * 128 + 64;
		@Pc(26) int local26 = Static112.method2073(Static56.anInt1718, local9, local15) - Static17.anInt932;
		if (Static7.anInt291 < local26) {
			Static7.anInt291 += (local26 - Static7.anInt291) * Static31.anInt1206 / 1000 + Static71.anInt2108;
			if (local26 < Static7.anInt291) {
				Static7.anInt291 = local26;
			}
		}
		if (Static7.anInt291 > local26) {
			Static7.anInt291 -= Static31.anInt1206 * (Static7.anInt291 - local26) / 1000 + Static71.anInt2108;
			if (Static7.anInt291 < local26) {
				Static7.anInt291 = local26;
			}
		}
		if (local15 > Static61.anInt1876) {
			Static61.anInt1876 += (local15 - Static61.anInt1876) * Static31.anInt1206 / 1000 + Static71.anInt2108;
			if (Static61.anInt1876 > local15) {
				Static61.anInt1876 = local15;
			}
		}
		if (Static61.anInt1876 > local15) {
			Static61.anInt1876 -= Static71.anInt2108 + Static31.anInt1206 * (Static61.anInt1876 - local15) / 1000;
			if (local15 > Static61.anInt1876) {
				Static61.anInt1876 = local15;
			}
		}
		if (Static94.anInt2650 < local9) {
			Static94.anInt2650 += Static31.anInt1206 * (local9 - Static94.anInt2650) / 1000 + Static71.anInt2108;
			if (Static94.anInt2650 > local9) {
				Static94.anInt2650 = local9;
			}
		}
		local15 = Static29.anInt1151 * 128 + 64;
		if (local9 < Static94.anInt2650) {
			Static94.anInt2650 -= Static71.anInt2108 + (Static94.anInt2650 - local9) * Static31.anInt1206 / 1000;
			if (Static94.anInt2650 < local9) {
				Static94.anInt2650 = local9;
			}
		}
		local9 = Static47.anInt1520 * 128 + 64;
		local26 = Static112.method2073(Static56.anInt1718, local9, local15) - Static4.anInt2357;
		@Pc(193) int local193 = local9 - Static94.anInt2650;
		@Pc(197) int local197 = local26 - Static7.anInt291;
		@Pc(202) int local202 = local15 - Static61.anInt1876;
		@Pc(213) int local213 = (int) Math.sqrt((double) (local202 * local202 + local193 * local193));
		@Pc(224) int local224 = (int) (Math.atan2((double) local197, (double) local213) * 325.949D) & 0x7FF;
		if (local224 < 128) {
			local224 = 128;
		}
		if (local224 > 383) {
			local224 = 383;
		}
		@Pc(249) int local249 = (int) (Math.atan2((double) local193, (double) local202) * -325.949D) & 0x7FF;
		if (Static81.anInt2299 < local224) {
			Static81.anInt2299 += (local224 - Static81.anInt2299) * Static43.anInt1467 / 1000 + Static109.anInt3140;
			if (Static81.anInt2299 > local224) {
				Static81.anInt2299 = local224;
			}
		}
		if (local224 < Static81.anInt2299) {
			Static81.anInt2299 -= Static43.anInt1467 * (Static81.anInt2299 - local224) / 1000 + Static109.anInt3140;
			if (local224 > Static81.anInt2299) {
				Static81.anInt2299 = local224;
			}
		}
		@Pc(304) int local304 = local249 - Static3.anInt27;
		if (local304 > 1024) {
			local304 -= 2048;
		}
		if (local304 < -1024) {
			local304 += 2048;
		}
		if (local304 > 0) {
			Static3.anInt27 += local304 * Static43.anInt1467 / 1000 + Static109.anInt3140;
			Static3.anInt27 &= 0x7FF;
		}
		if (local304 < 0) {
			Static3.anInt27 -= -local304 * Static43.anInt1467 / 1000 + Static109.anInt3140;
			Static3.anInt27 &= 0x7FF;
		}
		@Pc(353) int local353 = local249 - Static3.anInt27;
		if (local353 > 1024) {
			local353 -= 2048;
		}
		if (local353 < -1024) {
			local353 += 2048;
		}
		if (local353 < 0 && local304 > 0 || local353 > 0 && local304 < 0) {
			Static3.anInt27 = local249;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!pb;ZILclient!pb;)V")
	public static void method1159(@OriginalArg(0) Class40 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class40 arg2) {
		Static92.aBoolean120 = arg1;
		Static97.aClass40_35 = arg2;
		Static6.aClass40_7 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method1160() {
		aClass55_649 = null;
		aClass55_650 = null;
		aByteArrayArrayArray9 = null;
		anIntArray162 = null;
		anIntArray161 = null;
		aClass55_651 = null;
	}
}
