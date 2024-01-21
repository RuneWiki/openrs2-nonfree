import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_89;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1708 = Static107.method1838("Loading)3)3)3");

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1706 = aClass28_1708;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1707 = Static107.method1838("(U1");

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Lclient!qd;")
	public static Class65 aClass65_11 = new Class65();

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray26 = new int[104][104];

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1709 = Static107.method1838("(U");

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1710 = Static107.method1838("Connection lost)3");

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "Lclient!ai;")
	public static Class4 aClass4_2 = new Class4();

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1711 = Static107.method1838("Lade)3)3)3");

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1712 = Static107.method1838("Choose Option");

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1713 = aClass28_1710;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1714 = aClass28_1712;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIILclient!d;IJZ)Z")
	public static boolean method2002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub4_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static129.method2083(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILclient!gf;I)V")
	public static void method2003(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub4_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt1653 && arg0 != -1) {
			@Pc(15) int local15 = Static49.method926(arg0).anInt489;
			if (local15 == 1) {
				arg1.anInt1597 = 0;
				arg1.anInt1641 = arg2;
				arg1.anInt1616 = 0;
				arg1.anInt1609 = 0;
			}
			if (local15 == 2) {
				arg1.anInt1609 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt1653 == -1 || Static49.method926(arg0).anInt479 >= Static49.method926(arg1.anInt1653).anInt479) {
			arg1.anInt1597 = 0;
			arg1.anInt1616 = 0;
			arg1.anInt1644 = arg1.anInt1643;
			arg1.anInt1653 = arg0;
			arg1.anInt1609 = 0;
			arg1.anInt1641 = arg2;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public static void method2004() {
		aClass28_1711 = null;
		aClass28_1708 = null;
		aClass4_2 = null;
		aClass28_1707 = null;
		aClass65_11 = null;
		aClass28_1709 = null;
		aClass28_1714 = null;
		anIntArrayArray26 = null;
		aClass40_Sub1_89 = null;
		aClass28_1712 = null;
		aClass28_1706 = null;
		aClass28_1710 = null;
		aClass28_1713 = null;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([IIIIII)V")
	public static void method2005(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class69 local13 = local7.aClass69_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt3122;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class73 local58 = local7.aClass73_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt3253;
		@Pc(67) int local67 = local58.anInt3251;
		@Pc(70) int local70 = local58.anInt3252;
		@Pc(73) int local73 = local58.anInt3250;
		@Pc(77) int[] local77 = Static54.anIntArrayArray7[local23];
		@Pc(81) int[] local81 = Static14.anIntArrayArray1[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Z")
	public static boolean method2006(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I")
	public static int method2007() {
		@Pc(9) int local9 = Static103.method1808(Static103.anInt2568, Static36.anInt977, Static21.anInt726);
		return local9 - Static40.anInt1057 >= 800 || (Static49.aByteArrayArrayArray4[Static103.anInt2568][Static36.anInt977 >> 7][Static21.anInt726 >> 7] & 0x4) == 0 ? 3 : Static103.anInt2568;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILclient!jc;)[Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4[] method2008(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class40 arg2) {
		return Static108.method1851(arg2, arg1, arg0) ? Static33.method644() : null;
	}
}
