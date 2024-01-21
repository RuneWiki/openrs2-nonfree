import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!g", name = "z", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	public static int anInt1285;

	@OriginalMember(owner = "client!g", name = "E", descriptor = "I")
	public static int anInt1288;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_429 = Static151.method2243("auf der Hautpseite)3");

	@OriginalMember(owner = "client!g", name = "F", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_430 = Static151.method2243("leuchten2:");

	@OriginalMember(owner = "client!g", name = "G", descriptor = "[I")
	public static final int[] anIntArray101 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(JB)V")
	public static void method854(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static125.anInt2769 >= 100) {
			Static154.method2292(Static149.aClass62_1100, 0, Static69.aClass62_484);
			return;
		}
		@Pc(29) Class62 local29 = Static149.method2218(arg0).method1876();
		for (@Pc(31) int local31 = 0; local31 < Static125.anInt2769; local31++) {
			if (Static161.aLongArray10[local31] == arg0) {
				Static154.method2292(Static169.method2460(new Class62[] { local29, Static76.aClass62_540 }), 0, Static69.aClass62_484);
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static29.anInt714; local64++) {
			if (Static124.aLongArray7[local64] == arg0) {
				Static154.method2292(Static169.method2460(new Class62[] { Static59.aClass62_406, local29, Static196.aClass62_1403 }), 0, Static69.aClass62_484);
				return;
			}
		}
		if (local29.method1870(Static186.aClass7_Sub2_Sub2_1.aClass62_1072)) {
			Static154.method2292(Static18.aClass62_133, 0, Static69.aClass62_484);
			return;
		}
		Static161.aLongArray10[Static125.anInt2769] = arg0;
		Static86.aClass62Array104[Static125.anInt2769++] = Static149.method2218(arg0);
		Static104.anInt2337 = Static11.anInt305;
		Static58.aClass2_Sub11_Sub1_2.method1595(90);
		Static58.aClass2_Sub11_Sub1_2.method1527(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!df;")
	public static Class2_Sub1_Sub7 method856(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub7 local10 = (Class2_Sub1_Sub7) Static143.aClass53_17.method1648((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static101.aClass71_20.method2130(4, arg0);
		local10 = new Class2_Sub1_Sub7();
		if (local20 != null) {
			local10.method620(arg0, new Class2_Sub11(local20));
		}
		Static143.aClass53_17.method1645((long) arg0, local10);
		return local10;
	}
}
