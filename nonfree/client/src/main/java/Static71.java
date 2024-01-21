import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!n", name = "yb", descriptor = "Lclient!df;")
	public static Class5_Sub2_Sub6_Sub1 aClass5_Sub2_Sub6_Sub1_4;

	@OriginalMember(owner = "client!n", name = "Cb", descriptor = "Lclient!sd;")
	public static Class29 aClass29_48;

	@OriginalMember(owner = "client!n", name = "Mb", descriptor = "[[I")
	public static int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!n", name = "Zb", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_32;

	@OriginalMember(owner = "client!n", name = "Bb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_874 = Static63.method1251("backvmid3");

	@OriginalMember(owner = "client!n", name = "Db", descriptor = "Lclient!sa;")
	public static Class67 aClass67_16 = new Class67(50);

	@OriginalMember(owner = "client!n", name = "Ib", descriptor = "I")
	public static int anInt2070 = 0;

	@OriginalMember(owner = "client!n", name = "Pb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_875 = Static63.method1251("");

	@OriginalMember(owner = "client!n", name = "Rb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_876 = Static63.method1251(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!n", name = "Tb", descriptor = "Lclient!rc;")
	public static Class63 aClass63_1 = new Class63();

	@OriginalMember(owner = "client!n", name = "Xb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_877 = Static63.method1251("World");

	@OriginalMember(owner = "client!n", name = "Yb", descriptor = "I")
	public static int anInt2080 = 0;

	@OriginalMember(owner = "client!n", name = "ac", descriptor = "Lclient!mb;")
	public static Class45 aClass45_878 = aClass45_877;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)I")
	public static int method1381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class5_Sub2_Sub6_Sub2.anIntArray362[arg2 * 1024 / arg0] >> 1;
		return (arg1 * local21 >> 16) + (arg3 * (65536 - local21) >> 16);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lclient!mb;")
	public static Class45 method1382(@OriginalArg(0) int arg0) {
		@Pc(9) Class45 local9 = Static76.method1476(arg0);
		for (@Pc(20) int local20 = local9.method1317() - 3; local20 > 0; local20 -= 3) {
			local9 = Static39.method1443(new Class45[] { local9.method1322(local20, 0), Static53.aClass45_1005, local9.method1296(local20) });
		}
		if (local9.method1317() > 8) {
			local9 = Static39.method1443(new Class45[] { Static90.aClass45_1055, local9.method1322(local9.method1317() - 8, 0), Static51.aClass45_649, Static96.aClass45_1100, local9, Static98.aClass45_1123 });
		} else if (local9.method1317() > 4) {
			local9 = Static39.method1443(new Class45[] { Static114.aClass45_1307, local9.method1322(local9.method1317() - 4, 0), Static92.aClass45_1335, Static96.aClass45_1100, local9, Static98.aClass45_1123 });
		}
		return Static39.method1443(new Class45[] { Static11.aClass45_172, local9 });
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!mb;)Z")
	public static boolean method1383(@OriginalArg(1) Class45 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static104.anInt2772; local9++) {
			if (arg0.method1330(Static21.aClass45Array7[local9])) {
				return true;
			}
		}
		return arg0.method1330(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass45_629);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBLclient!j;I)V")
	public static void method1385(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub2_Sub4_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt2436 == arg2 && arg2 != -1) {
			@Pc(23) int local23 = Static63.method1252(arg2).anInt1664;
			if (local23 == 1) {
				arg1.anInt2387 = arg0;
				arg1.anInt2420 = 0;
				arg1.anInt2424 = 0;
				arg1.anInt2390 = 0;
			}
			if (local23 == 2) {
				arg1.anInt2424 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt2436 == -1 || Static63.method1252(arg2).anInt1674 >= Static63.method1252(arg1.anInt2436).anInt1674) {
			arg1.anInt2436 = arg2;
			arg1.anInt2424 = 0;
			arg1.anInt2405 = arg1.anInt2433;
			arg1.anInt2390 = 0;
			arg1.anInt2387 = arg0;
			arg1.anInt2420 = 0;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BJ)V")
	public static void method1386(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static69.anInt1993; local16++) {
			if (arg0 == Static56.aLongArray3[local16]) {
				Static69.anInt1993--;
				Static72.aBoolean99 = true;
				for (@Pc(36) int local36 = local16; local36 < Static69.anInt1993; local36++) {
					Static56.aLongArray3[local36] = Static56.aLongArray3[local36 + 1];
				}
				Static64.aClass5_Sub9_Sub1_2.method1466(92);
				Static64.aClass5_Sub9_Sub1_2.method1454(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "h", descriptor = "(I)V")
	public static void method1387() {
		aClass67_16 = null;
		aClass5_Sub2_Sub6_Sub1_4 = null;
		aClass45_876 = null;
		aClass45_877 = null;
		aClass45_874 = null;
		aClass45_875 = null;
		anIntArrayArray21 = null;
		aClass29_Sub1_32 = null;
		aClass63_1 = null;
		aClass29_48 = null;
		aClass45_878 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)I")
	public static int method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 31;
		return (local3 + arg1) / arg0 - local3;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!t;ILclient!ge;)V")
	public static void method1389(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(3) Class29_Sub1 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(17) Class10 local17 = Static19.aClass10_4;
		synchronized (Static19.aClass10_4) {
			for (@Pc(24) Class5_Sub14 local24 = (Class5_Sub14) Static19.aClass10_4.method230(); local24 != null; local24 = (Class5_Sub14) Static19.aClass10_4.method233()) {
				if (local24.aLong146 == (long) arg0 && local24.aClass68_3 == arg1 && local24.anInt1841 == 0) {
					local3 = local24.aByteArray26;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(71) byte[] local71 = arg1.method1899(arg0);
			arg2.method773(arg0, true, arg1, local71);
		} else {
			arg2.method773(arg0, true, arg1, local3);
		}
	}
}
