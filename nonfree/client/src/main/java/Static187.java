import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!wg", name = "bb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1510 = Static177.method3050("shake:");

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1508 = aClass46_1510;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1509 = Static177.method3050("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!wg", name = "Z", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_51 = new Class66(64);

	@OriginalMember(owner = "client!wg", name = "ib", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1512 = Static177.method3050("Walk here");

	@OriginalMember(owner = "client!wg", name = "eb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1511 = aClass46_1512;

	@OriginalMember(owner = "client!wg", name = "jb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1513 = aClass46_1510;

	@OriginalMember(owner = "client!wg", name = "lb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1514 = Static177.method3050("Versteckt");

	@OriginalMember(owner = "client!wg", name = "mb", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!wg", name = "nb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1515 = Static177.method3050("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIBII)I")
	public static int method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(8) int local8 = arg5;
			arg5 = arg1;
			arg1 = local8;
		}
		@Pc(28) int local28 = arg2 & 0x3;
		if (local28 == 0) {
			return arg4;
		} else if (local28 == 1) {
			return arg3;
		} else if (local28 == 2) {
			return 1 + 7 - arg5 - arg4;
		} else {
			return 1 + 7 - arg1 - arg3;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)J")
	public static long method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1040; local13++) {
			@Pc(19) Class86 local19 = local7.aClass86Array1[local13];
			if ((local19.aLong129 >> 29 & 0x3L) == 2L && local19.anInt3583 == arg1 && local19.anInt3581 == arg2) {
				return local19.aLong129;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([Lclient!mb;I[BIIIIIII)V")
	public static void method3165(@OriginalArg(0) Class58[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (arg1 + local3 > 0 && arg1 + local3 < 103 && local7 + arg4 > 0 && local7 + arg4 < 103) {
					arg0[arg6].anIntArrayArray20[arg1 + local3][local7 + arg4] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(82) Class4_Sub11 local82 = new Class4_Sub11(arg2);
		for (@Pc(84) int local84 = 0; local84 < 4; local84++) {
			for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
				for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
					if (arg3 == local84 && arg8 <= local88 && arg8 + 8 > local88 && local92 >= arg5 && local92 < arg5 + 8) {
						Static41.method713(local82, 0, arg7, arg6, 0, arg4 + Static41.method710(local88 & 0x7, local92 & 0x7, arg7), arg1 + Static142.method2441(local92 & 0x7, arg7, local88 & 0x7));
					} else {
						Static41.method713(local82, 0, 0, 0, 0, -1, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBI)I")
	public static int method3166(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!a;I)Lclient!jd;")
	public static Class46 method3167(@OriginalArg(0) Class1 arg0) {
		if (Static119.method2144(Static102.method1954(arg0)) == 0) {
			return null;
		} else if (arg0.aClass46_3 == null || arg0.aClass46_3.method1644().method1677() == 0) {
			return Static120.aBoolean150 ? Static12.aClass46_140 : null;
		} else {
			return arg0.aClass46_3;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
	public static void method3168(@OriginalArg(1) int arg0) {
		if (Static143.anInt3333 == arg0) {
			return;
		}
		if (Static143.anInt3333 == 0) {
			Static45.method760();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static30.anInt767 = 0;
			Static178.anInt3990 = 0;
			Static156.anInt3534 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static167.aClass27_6 != null) {
			Static167.aClass27_6.method952();
			Static167.aClass27_6 = null;
		}
		if (Static143.anInt3333 == 25) {
			Static184.anInt4142 = 1;
			Static46.anInt1215 = 0;
			Static59.anInt1453 = 0;
			Static25.anInt617 = 0;
			Static121.anInt2922 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static112.method3177(Static52.aClass62_Sub1_37, Static137.aCanvas1, Static22.aClass62_Sub1_17);
		} else {
			Static11.method215();
		}
		Static143.anInt3333 = arg0;
	}
}
