import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ua", name = "xb", descriptor = "I")
	public static int anInt2912;

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1397 = Static108.method1915("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1398 = Static108.method1915("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ua", name = "Db", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1403 = Static108.method1915("Loading )2 please wait)3");

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1399 = aClass39_1403;

	@OriginalMember(owner = "client!ua", name = "gb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1400 = Static108.method1915("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ua", name = "pb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1402 = Static108.method1915("Classic");

	@OriginalMember(owner = "client!ua", name = "kb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1401 = aClass39_1402;

	@OriginalMember(owner = "client!ua", name = "ob", descriptor = "I")
	public static int anInt2907 = 0;

	@OriginalMember(owner = "client!ua", name = "sb", descriptor = "I")
	public static int anInt2909 = -1;

	@OriginalMember(owner = "client!ua", name = "ub", descriptor = "[I")
	public static int[] anIntArray460 = new int[2048];

	@OriginalMember(owner = "client!ua", name = "wb", descriptor = "[Lclient!kd;")
	public static Class39[] aClass39Array29 = new Class39[200];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!kd;Lclient!q;Lclient!kd;)[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] method2020(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class39 arg2) {
		@Pc(13) int local13 = arg1.method2015(arg0);
		@Pc(19) int local19 = arg1.method2012(local13, arg2);
		return Static68.method1221(local13, local19, arg1);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Z")
	public static boolean method2022() {
		@Pc(5) Class71 local5 = Static98.aClass71_1;
		synchronized (Static98.aClass71_1) {
			if (Static71.anInt1796 == Static24.anInt828) {
				return false;
			} else {
				Static110.anInt2791 = Static112.anIntArray433[Static71.anInt1796];
				Static77.anInt1931 = Static53.anIntArray206[Static71.anInt1796];
				Static71.anInt1796 = Static71.anInt1796 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!q;Lclient!qe;Lclient!q;Lclient!q;I)Z")
	public static boolean method2027(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class1_Sub8_Sub4 arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) Class62 arg3) {
		Static76.aClass1_Sub8_Sub4_2 = arg1;
		Static22.aClass62_5 = arg0;
		Static67.aClass62_19 = arg2;
		Static116.aClass62_31 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBI)I")
	public static int method2028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method2029() {
		aClass39_1398 = null;
		aClass39_1399 = null;
		aClass39_1401 = null;
		aClass39_1402 = null;
		aClass39_1400 = null;
		anIntArray460 = null;
		aClass39Array29 = null;
		aClass39_1397 = null;
		aClass39_1403 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZI)Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4 method2031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(20) long local20 = ((long) arg2 << 40) + (((long) arg0 << 16) + (long) arg4 + ((long) arg1 << 38));
		@Pc(32) Class1_Sub1_Sub4_Sub4 local32;
		if (!arg3) {
			local32 = (Class1_Sub1_Sub4_Sub4) Static69.aClass33_25.method1038(local20);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class1_Sub1_Sub17 local40 = Static8.method224(arg4);
		if (arg0 > 1 && local40.anIntArray419 != null) {
			@Pc(48) int local48 = -1;
			for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
				if (local40.anIntArray420[local50] <= arg0 && local40.anIntArray420[local50] != 0) {
					local48 = local40.anIntArray419[local50];
				}
			}
			if (local48 != -1) {
				local40 = Static8.method224(local48);
			}
		}
		@Pc(87) Class1_Sub1_Sub2_Sub7 local87 = local40.method1916(1);
		if (local87 == null) {
			return null;
		}
		@Pc(93) Class1_Sub1_Sub4_Sub4 local93 = null;
		if (local40.anInt2748 != -1) {
			local93 = method2031(10, 1, 0, true, local40.anInt2729);
			if (local93 == null) {
				return null;
			}
		}
		@Pc(113) int local113 = Static15.anInt2152;
		@Pc(115) int local115 = Static15.anInt2154;
		@Pc(117) int[] local117 = Static15.anIntArray326;
		@Pc(120) int[] local120 = new int[4];
		Static15.method1515(local120);
		local32 = new Class1_Sub1_Sub4_Sub4(36, 32);
		Static15.method1502(local32.anIntArray327, 36, 32);
		Static15.method1510();
		Static27.method566();
		Static27.method559(16, 16);
		Static27.aBoolean84 = false;
		@Pc(143) int local143 = local40.anInt2724;
		if (arg3) {
			local143 = (int) ((double) local143 * 1.5D);
		} else if (arg1 == 2) {
			local143 = (int) ((double) local143 * 1.04D);
		}
		@Pc(171) int local171 = local143 * Class1_Sub1_Sub4_Sub2.anIntArray138[local40.anInt2721] >> 16;
		@Pc(180) int local180 = local143 * Class1_Sub1_Sub4_Sub2.anIntArray142[local40.anInt2721] >> 16;
		local87.method1371();
		local87.method1378(local40.anInt2740, local40.anInt2737, local40.anInt2721, local40.anInt2730, local171 + local87.anInt2467 / 2 + local40.anInt2744, local180 + local40.anInt2744);
		if (arg1 >= 1) {
			local32.method1532(1);
		}
		if (arg1 >= 2) {
			local32.method1532(16777215);
		}
		if (arg2 != 0) {
			local32.method1545(arg2);
		}
		Static15.method1502(local32.anIntArray327, 36, 32);
		if (local40.anInt2748 != -1) {
			local93.method1539(0, 0);
		}
		if (!arg3 && (local40.anInt2755 == 1 || arg0 != 1) && arg0 != -1) {
			Static73.aClass1_Sub1_Sub4_Sub3_2.method753(Static114.method1977(arg0), 0, 9, 16776960, 1);
		}
		if (!arg3) {
			Static69.aClass33_25.method1042(local32, local20);
		}
		Static15.method1502(local117, local113, local115);
		Static15.method1507(local120);
		Static27.method566();
		Static27.aBoolean84 = true;
		return local32;
	}
}
