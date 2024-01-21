import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!dc", name = "pb", descriptor = "I")
	public static final int anInt818 = 50;

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "[I")
	public static int[] anIntArray70 = new int[anInt818];

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_429 = Static32.method683(" ");

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "Lclient!lf;")
	public static Class49 aClass49_427 = aClass49_429;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "[I")
	public static int[] anIntArray71 = new int[anInt818];

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "[I")
	public static int[] anIntArray72 = new int[anInt818];

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_428 = Static32.method683("null");

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "[I")
	public static int[] anIntArray73 = new int[anInt818];

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "[I")
	public static int[] anIntArray74 = new int[anInt818];

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array6 = new Class49[anInt818];

	@OriginalMember(owner = "client!dc", name = "jb", descriptor = "[I")
	public static int[] anIntArray75 = new int[anInt818];

	@OriginalMember(owner = "client!dc", name = "nb", descriptor = "[I")
	public static int[] anIntArray76 = new int[anInt818];

	@OriginalMember(owner = "client!dc", name = "ob", descriptor = "I")
	public static int anInt817 = 0;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V")
	public static void method657() {
		anIntArray73 = null;
		aClass2_Sub2_Sub2_Sub2_1 = null;
		anIntArray75 = null;
		anIntArray76 = null;
		anIntArray71 = null;
		aClass49_427 = null;
		aClass49_428 = null;
		aClass49_429 = null;
		anIntArray72 = null;
		anIntArray70 = null;
		aClass49Array6 = null;
		anIntArray74 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass7_1 != null && local7.aClass7_1.aLong13 == arg3) {
			return true;
		} else if (local7.aClass47_1 != null && local7.aClass47_1.aLong89 == arg3) {
			return true;
		} else if (local7.aClass26_1 != null && local7.aClass26_1.aLong44 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt15; local46++) {
				if (local7.aClass22Array1[local46].aLong41 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
	public static void method659() {
		@Pc(7) int local7 = Static92.anInt1938;
		@Pc(9) int local9 = Static93.anInt1968;
		@Pc(11) int local11 = Static98.anInt2077;
		@Pc(15) int local15 = Static113.anInt2340;
		Static10.method1861(local7, local9, local11, local15, 6116423);
		Static10.method1861(local7 + 1, local9 + 1, local11 - 2, 16, 0);
		Static10.method1854(local7 + 1, local9 + 18, local11 - 2, local15 - 19, 0);
		Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1.method610(Static162.aClass49_1610, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(64) int local64 = Static96.anInt2022;
		@Pc(66) int local66 = Static20.anInt449;
		for (@Pc(68) int local68 = 0; local68 < Static133.anInt3713; local68++) {
			@Pc(72) int local72 = 16777215;
			@Pc(85) int local85 = local9 + (-local68 + -1 + Static133.anInt3713) * 15 + 31;
			if (local66 > local7 && local66 < local7 + local11 && local64 > local85 - 13 && local64 < local85 + 3) {
				local72 = 16776960;
			}
			Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1.method610(Static101.method1743(local68), local7 + 3, local85, local72, 0);
		}
		Static160.method2711(Static98.anInt2077, Static113.anInt2340, Static92.anInt1938, Static93.anInt1968);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIIIII[Lclient!lb;)V")
	public static void method660(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class48[] arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg3 > 0 && local7 + arg3 < 103 && arg4 + local11 > 0 && arg4 + local11 < 103) {
						arg5[local3].anIntArrayArray21[local7 + arg3][local11 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(100) Class2_Sub13 local100 = new Class2_Sub13(arg0);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
				for (@Pc(110) int local110 = 0; local110 < 64; local110++) {
					Static27.method485(local11, arg2, 0, arg4 + local110, local106 - -arg3, arg1, local100);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)Z")
	public static boolean method661() {
		try {
			if (Static78.anInt1631 == 2) {
				if (Static37.aClass2_Sub23_1 == null) {
					Static37.aClass2_Sub23_1 = Static192.method2431(Static15.aClass11_16, Static66.anInt1388, Static129.anInt2805);
					if (Static37.aClass2_Sub23_1 == null) {
						return false;
					}
				}
				if (Static79.aClass13_41 == null) {
					Static79.aClass13_41 = new Class13(Static12.aClass11_12, Static104.aClass11_85);
				}
				if (Static61.aClass2_Sub14_Sub3_1.method2564(Static37.aClass2_Sub23_1, Static170.aClass11_133, Static79.aClass13_41)) {
					Static61.aClass2_Sub14_Sub3_1.method2562();
					Static61.aClass2_Sub14_Sub3_1.method2574(Static7.anInt133);
					Static61.aClass2_Sub14_Sub3_1.method2549(Static81.aBoolean75, Static37.aClass2_Sub23_1);
					Static15.aClass11_16 = null;
					Static78.anInt1631 = 0;
					Static37.aClass2_Sub23_1 = null;
					Static79.aClass13_41 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static61.aClass2_Sub14_Sub3_1.method2577();
			Static79.aClass13_41 = null;
			Static37.aClass2_Sub23_1 = null;
			Static15.aClass11_16 = null;
			Static78.anInt1631 = 0;
		}
		return false;
	}
}
