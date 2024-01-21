import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "[I")
	public static int[] anIntArray142 = new int[32];

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "Lclient!je;")
	private static Class40 aClass40_709 = Static69.method1231("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "Lclient!je;")
	public static Class40 aClass40_708 = aClass40_709;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
	public static int anInt1394 = 0;

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lclient!je;")
	public static Class40 aClass40_710 = Static69.method1231("Einloggen");

	@OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lclient!da;")
	public static Class12 aClass12_1 = new Class12();

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public static void method935() {
		if (!Static108.aBoolean211) {
			return;
		}
		Static84.aClass2_Sub1_Sub2_Sub1_13 = null;
		Static21.anIntArray74 = null;
		Static55.aClass2_Sub1_Sub2_Sub4Array9 = null;
		Static69.aClass2_Sub1_Sub2_Sub1Array53 = null;
		Static125.anIntArray343 = null;
		Static73.aClass2_Sub1_Sub2_Sub1_12 = null;
		Static84.aClass2_Sub1_Sub2_Sub1Array73 = null;
		Static88.aClass2_Sub1_Sub2_Sub1Array74 = null;
		Static97.anIntArray267 = null;
		Static69.anIntArray206 = null;
		Static12.aClass2_Sub1_Sub2_Sub1Array102 = null;
		Static81.anIntArray225 = null;
		Static93.aClass2_Sub1_Sub2_Sub4_3 = null;
		Static86.aClass2_Sub1_Sub2_Sub1_14 = null;
		Static17.aClass2_Sub1_Sub2_Sub1Array19 = null;
		Static14.anIntArray51 = null;
		Static115.anIntArray302 = null;
		Static30.anIntArray86 = null;
		Static54.aClass2_Sub1_Sub2_Sub1_10 = null;
		Static95.aClass2_Sub1_Sub2_Sub4_4 = null;
		Static24.method2212();
		Static111.method1867(true);
		Static108.aBoolean211 = false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ta;)V")
	public static void method936(@OriginalArg(1) Class2_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt1784 == Static28.anInt704 || arg0.anInt1817 == -1 || arg0.anInt1814 != 0 || arg0.anInt1769 + 1 > Static40.method724(arg0.anInt1817).anIntArray210[arg0.anInt1804]) {
			@Pc(36) int local36 = Static28.anInt704 - arg0.anInt1787;
			@Pc(46) int local46 = arg0.anInt1785 * 128 + arg0.anInt1789 * 64;
			@Pc(56) int local56 = arg0.anInt1781 * 128 + arg0.anInt1789 * 64;
			@Pc(63) int local63 = arg0.anInt1784 - arg0.anInt1787;
			@Pc(74) int local74 = arg0.anInt1800 * 128 + arg0.anInt1789 * 64;
			@Pc(84) int local84 = arg0.anInt1807 * 128 + arg0.anInt1789 * 64;
			arg0.anInt1792 = ((local63 - local36) * local84 + local74 * local36) / local63;
			arg0.anInt1788 = (local46 * (local63 - local36) + local56 * local36) / local63;
		}
		arg0.anInt1770 = 0;
		if (arg0.anInt1798 == 0) {
			arg0.anInt1801 = 1024;
		}
		if (arg0.anInt1798 == 1) {
			arg0.anInt1801 = 1536;
		}
		if (arg0.anInt1798 == 2) {
			arg0.anInt1801 = 0;
		}
		if (arg0.anInt1798 == 3) {
			arg0.anInt1801 = 512;
		}
		arg0.anInt1818 = arg0.anInt1801;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public static void method937() {
		anIntArray142 = null;
		aClass40_710 = null;
		aClass12_1 = null;
		aClass40_709 = null;
		aClass40_708 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public static void method939() {
		Static129.aClass2_Sub5_Sub4_2.method1967();
		Static77.anInt2023 = 1;
		Static122.aClass24_32 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIILclient!fd;BI)V")
	public static void method940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(5) int arg3) {
		Static122.aClass24_32 = arg2;
		Static104.aBoolean204 = false;
		Static70.anInt1896 = 10000;
		Static120.anInt2820 = arg1;
		Static26.anInt673 = arg3;
		Static56.anInt1471 = arg0;
		Static77.anInt2023 = 1;
	}
}
