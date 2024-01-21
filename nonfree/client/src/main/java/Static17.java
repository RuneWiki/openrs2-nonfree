import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!cc", name = "Zc", descriptor = "Lclient!ff;")
	public static Class11 aClass11_13;

	@OriginalMember(owner = "client!cc", name = "Qc", descriptor = "Lclient!wd;")
	private static Class80 aClass80_219 = Static2.method59("Add friend");

	@OriginalMember(owner = "client!cc", name = "md", descriptor = "Lclient!wd;")
	private static Class80 aClass80_231 = Static2.method59("flash2:");

	@OriginalMember(owner = "client!cc", name = "Rc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_220 = aClass80_231;

	@OriginalMember(owner = "client!cc", name = "Sc", descriptor = "Lclient!wd;")
	private static Class80 aClass80_221 = Static2.method59("Password: ");

	@OriginalMember(owner = "client!cc", name = "Uc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_222 = Static2.method59("Lade Sprites )2 ");

	@OriginalMember(owner = "client!cc", name = "Vc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_223 = Static2.method59("mapdots");

	@OriginalMember(owner = "client!cc", name = "Wc", descriptor = "[Lclient!me;")
	public static Class49[] aClass49Array1 = new Class49[4];

	@OriginalMember(owner = "client!cc", name = "dd", descriptor = "Lclient!wd;")
	private static Class80 aClass80_227 = Static2.method59("Loading ignore list");

	@OriginalMember(owner = "client!cc", name = "Yc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_224 = aClass80_227;

	@OriginalMember(owner = "client!cc", name = "ad", descriptor = "Lclient!wd;")
	public static Class80 aClass80_225 = aClass80_219;

	@OriginalMember(owner = "client!cc", name = "bd", descriptor = "Lclient!wd;")
	public static Class80 aClass80_226 = Static2.method59("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!cc", name = "ed", descriptor = "Lclient!wd;")
	private static Class80 aClass80_228 = Static2.method59("Off");

	@OriginalMember(owner = "client!cc", name = "gd", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!cc", name = "hd", descriptor = "Lclient!wd;")
	public static Class80 aClass80_229 = aClass80_228;

	@OriginalMember(owner = "client!cc", name = "jd", descriptor = "I")
	public static int anInt650 = 0;

	@OriginalMember(owner = "client!cc", name = "kd", descriptor = "Lclient!wd;")
	public static Class80 aClass80_230 = aClass80_221;

	@OriginalMember(owner = "client!cc", name = "od", descriptor = "Lclient!wd;")
	public static Class80 aClass80_232 = Static2.method59("null");

	@OriginalMember(owner = "client!cc", name = "qd", descriptor = "Lclient!wd;")
	public static Class80 aClass80_233 = aClass80_231;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	public static void method322() {
		if (!Static76.aBoolean141) {
			return;
		}
		@Pc(16) Class2_Sub1_Sub17 local16 = Static61.method1057(Static74.anInt1950, Static43.anInt1292);
		if (local16 != null && local16.anObjectArray18 != null) {
			Static40.method667(local16.anObjectArray18, null, 0, 0, 0, local16);
		}
		Static76.aBoolean141 = false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[BBI)I")
	public static int method323(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg2; local9++) {
			local7 = Class77.anIntArray407[(local7 ^ arg1[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(Z)V")
	public static void method324() {
		aClass80_223 = null;
		aClass11_13 = null;
		aClass80_228 = null;
		aClass80_221 = null;
		aClass80_230 = null;
		aClass80_231 = null;
		aClass80_225 = null;
		aClass80_219 = null;
		aClass80_220 = null;
		aClass80_229 = null;
		aClass80_233 = null;
		aClass80_222 = null;
		aClass80_224 = null;
		aClass80_232 = null;
		aClass80_227 = null;
		aClass49Array1 = null;
		aClass80_226 = null;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
	public static void method325(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static122.method1969(arg0)) {
			return;
		}
		@Pc(22) Class2_Sub1_Sub17[] local22 = Static51.aClass2_Sub1_Sub17ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class2_Sub1_Sub17 local30 = local22[local24];
			if (local30.anObjectArray13 != null) {
				Static40.method667(local30.anObjectArray13, null, 0, 0, 0, local30);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)I")
	public static int method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg0;
			arg0 = local12;
		}
		@Pc(20) int local20 = arg5 & 0x3;
		if (local20 == 0) {
			return arg3;
		} else if (local20 == 1) {
			return 1 + 7 - arg1 - arg2;
		} else if (local20 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!ie;IIII)V")
	public static void method327(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class2_Sub6 local7 = new Class2_Sub6();
		local7.anInt1765 = arg4;
		local7.anInt1762 = arg0 * 128;
		local7.anInt1763 = arg1.anInt1643;
		local7.anInt1766 = arg1.anInt1640;
		local7.anIntArray220 = arg1.anIntArray210;
		local7.anInt1761 = arg1.anInt1624;
		@Pc(34) int local34 = arg1.anInt1630;
		local7.anInt1760 = arg3 * 128;
		local7.anInt1752 = arg1.anInt1614 * 128;
		@Pc(48) int local48 = arg1.anInt1634;
		if (arg2 == 1 || arg2 == 3) {
			local48 = arg1.anInt1630;
			local34 = arg1.anInt1634;
		}
		local7.anInt1758 = (arg0 + local34) * 128;
		local7.anInt1753 = (arg3 + local48) * 128;
		if (arg1.anIntArray207 != null) {
			local7.aClass2_Sub1_Sub10_1 = arg1;
			local7.method1041();
		}
		Static107.aClass58_14.method1294(local7);
		if (local7.anIntArray220 != null) {
			local7.anInt1759 = (int) (Math.random() * (double) (local7.anInt1763 - local7.anInt1761)) + local7.anInt1761;
		}
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
	public static void method328() {
		Static100.aClass2_Sub17_Sub1_1.method1810();
		@Pc(11) int local11 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
		if (local11 == 0) {
			return;
		}
		@Pc(23) int local23 = Static100.aClass2_Sub17_Sub1_1.method1801(2);
		if (local23 == 0) {
			Static16.anIntArray68[Static93.anInt2410++] = 2047;
			return;
		}
		@Pc(44) int local44;
		@Pc(54) int local54;
		if (local23 == 1) {
			local44 = Static100.aClass2_Sub17_Sub1_1.method1801(3);
			Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.method1436(local44, false);
			local54 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
			if (local54 == 1) {
				Static16.anIntArray68[Static93.anInt2410++] = 2047;
			}
			return;
		}
		@Pc(98) int local98;
		if (local23 == 2) {
			local44 = Static100.aClass2_Sub17_Sub1_1.method1801(3);
			Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.method1436(local44, true);
			local54 = Static100.aClass2_Sub17_Sub1_1.method1801(3);
			Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.method1436(local54, true);
			local98 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
			if (local98 == 1) {
				Static16.anIntArray68[Static93.anInt2410++] = 2047;
			}
		} else if (local23 == 3) {
			local44 = Static100.aClass2_Sub17_Sub1_1.method1801(7);
			local54 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
			if (local54 == 1) {
				Static16.anIntArray68[Static93.anInt2410++] = 2047;
			}
			local98 = Static100.aClass2_Sub17_Sub1_1.method1801(7);
			Static16.anInt444 = Static100.aClass2_Sub17_Sub1_1.method1801(2);
			@Pc(153) int local153 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
			Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.method1434(local98, local44, local153 == 1);
		}
	}
}
