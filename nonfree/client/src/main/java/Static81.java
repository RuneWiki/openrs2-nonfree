import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "Z")
	public static boolean aBoolean75;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!lf;")
	public static Class49 aClass49_865 = Static32.method683("<)4col>");

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2 = new byte[4][104][104];

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Lclient!lf;")
	private static Class49 aClass49_867 = Static32.method683("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Lclient!lf;")
	public static Class49 aClass49_868 = aClass49_867;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "Lclient!lf;")
	private static Class49 aClass49_872 = Static32.method683(" from your ignore list first)3");

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "Lclient!lf;")
	public static Class49 aClass49_869 = aClass49_872;

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_870 = Static32.method683("Fallen lassen");

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "Lclient!lf;")
	public static Class49 aClass49_871 = Static32.method683(")1");

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array13 = new Class49[100];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method1391() {
		Static168.aClass74_89.method2347();
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method1392() {
		aClass49_867 = null;
		aClass49_865 = null;
		aClass49_870 = null;
		aClass49_869 = null;
		aClass49_871 = null;
		aClass49_872 = null;
		aClass49Array13 = null;
		aByteArrayArrayArray3 = null;
		aByteArrayArrayArray2 = null;
		aClass49_868 = null;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	public static void method1393() {
		Static86.aClass2_Sub13_Sub1_13.method2975();
		@Pc(11) int local11 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static86.aClass2_Sub13_Sub1_13.method2978(2);
		if (local19 == 0) {
			Static90.anIntArray192[Static88.anInt1850++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(55) int local55;
		if (local19 == 1) {
			local43 = Static86.aClass2_Sub13_Sub1_13.method2978(3);
			Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.method2739(false, local43);
			local55 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
			if (local55 == 1) {
				Static90.anIntArray192[Static88.anInt1850++] = 2047;
			}
			return;
		}
		@Pc(99) int local99;
		if (local19 == 2) {
			local43 = Static86.aClass2_Sub13_Sub1_13.method2978(3);
			Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.method2739(true, local43);
			local55 = Static86.aClass2_Sub13_Sub1_13.method2978(3);
			Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.method2739(true, local55);
			local99 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
			if (local99 == 1) {
				Static90.anIntArray192[Static88.anInt1850++] = 2047;
			}
		} else if (local19 == 3) {
			local43 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
			Static66.anInt1396 = Static86.aClass2_Sub13_Sub1_13.method2978(2);
			local55 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
			if (local55 == 1) {
				Static90.anIntArray192[Static88.anInt1850++] = 2047;
			}
			local99 = Static86.aClass2_Sub13_Sub1_13.method2978(7);
			@Pc(154) int local154 = Static86.aClass2_Sub13_Sub1_13.method2978(7);
			Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.method2735(local154, local43 == 1, local99);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[II)I")
	public static int method1394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		return arg0 * arg2[0] + arg2[1] * arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)I")
	public static int method1395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 * arg2 + (4096 - arg1) * arg0 >> 12;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	public static void method1396() {
		Static129.anImage4 = null;
		Static22.aFont1 = null;
		Static25.aFontMetrics1 = null;
	}
}
