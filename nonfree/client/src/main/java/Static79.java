import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static79 {

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Lclient!ve;")
	public static Class69 aClass69_21;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "[Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2[] aClass1_Sub2_Sub8_Sub2Array10;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
	public static int anInt1889 = 0;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!lc;")
	public static final Class58 aClass58_1 = new Class58();

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public static int anInt1892 = 255;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_571 = Static81.method1507("::autoshadow on");

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "[I")
	public static final int[] anIntArray163 = new int[50];

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
	public static int anInt1893 = 1;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
	public static void method1467(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static173.aBoolean177) {
			Static144.method2512();
		} else if (arg0 != -1 && (Static66.anInt1656 != arg0 || !Static134.method2291()) && anInt1892 != 0 && !Static173.aBoolean177) {
			Static119.method2026(Static186.aClass69_Sub1_26, arg0, anInt1892);
		}
		Static66.anInt1656 = arg0;
	}
}
