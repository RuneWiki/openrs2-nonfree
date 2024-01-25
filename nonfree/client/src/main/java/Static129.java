import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_1 = new Class96(0, Static590.aClass364_20, Static590.aClass364_20, 0, 1);

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_2 = new Class96(1, Static590.aClass364_20, 2);

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_3 = new Class96(2, Static590.aClass364_20, Static590.aClass364_20, 2, 3);

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_4 = new Class96(3, Static590.aClass364_20, 3);

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_5 = new Class96(4, Static590.aClass364_20, Static590.aClass364_20, 3, 4);

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_6 = new Class96(5, Static590.aClass364_20, 4);

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_7 = new Class96(6, Static590.aClass364_20, 4);

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_8 = new Class96(7, Static590.aClass364_20, Static590.aClass364_20, 4, 5);

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_9 = new Class96(8, Static590.aClass364_20, Static590.aClass364_20, 5, 98, true, true);

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_10 = new Class96(9, Static590.aClass364_20, 99);

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_11 = new Class96(10, Static590.aClass364_20, 100);

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_12 = new Class96(11, Static590.aClass364_21, Static590.aClass364_21, 0, 92, true, true);

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_13 = new Class96(12, Static590.aClass364_21, Static590.aClass364_21, 92, 92);

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "Lclient!fc;")
	private static final Class96 aClass96_14 = new Class96(13, Static590.aClass364_21, Static590.aClass364_21, 92, 93);

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_15 = new Class96(14, Static590.aClass364_21, Static590.aClass364_21, 94, 95);

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_16 = new Class96(15, Static590.aClass364_21, Static590.aClass364_21, 96, 97);

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_17 = new Class96(16, Static590.aClass364_21, 97);

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_18 = new Class96(17, Static590.aClass364_21, 97);

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_19 = new Class96(18, Static590.aClass364_21, 98);

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_20 = new Class96(19, Static590.aClass364_21, 100);

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_21 = new Class96(20, Static590.aClass364_21, 100);

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "Lclient!fc;")
	public static final Class96 aClass96_22 = new Class96(21, Static590.aClass364_21, 100);

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "J")
	public static long aLong67 = 0L;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "[I")
	public static final int[] anIntArray133 = new int[5];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(CI)Z")
	public static boolean method2632(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!n;Z)V")
	public static void method2633(@OriginalArg(0) Class225 arg0) {
		if (arg0.anInt6508 == 5 && arg0.anInt6527 != -1) {
			Static213.method4331(Static440.aClass44_12, arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZII)Z")
	public static boolean method2635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static480.method8255(arg0, arg1) | (arg1 & 0x40000) != 0 || Static401.method6308(arg1, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)[Lclient!fc;")
	public static Class96[] method2636() {
		return new Class96[] { aClass96_1, aClass96_2, aClass96_3, aClass96_4, aClass96_5, aClass96_6, aClass96_7, aClass96_8, aClass96_9, aClass96_10, aClass96_11, aClass96_12, aClass96_13, aClass96_14, aClass96_15, aClass96_16, aClass96_17, aClass96_18, aClass96_19, aClass96_20, aClass96_21, aClass96_22 };
	}
}
