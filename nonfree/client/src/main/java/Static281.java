import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Lclient!km;")
	public static Class91 aClass91_194;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public static int anInt5252;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "[Lclient!bd;")
	public static Interface1[] anInterface1Array3;

	@OriginalMember(owner = "client!vi", name = "J", descriptor = "[I")
	public static int[] anIntArray463;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!dj;")
	public static Class32 aClass32_3 = new Class32();

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "Lclient!qc;")
	public static Class135 aClass135_39 = new Class135(30);

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "[I")
	public static int[] anIntArray464 = new int[32768];

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V")
	public static void method4072(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static116.anInt5593 != -1) {
				Static40.method825(Static116.anInt5593);
			}
			for (@Pc(14) Class1_Sub17 local14 = (Class1_Sub17) Static256.aClass70_17.method2074(); local14 != null; local14 = (Class1_Sub17) Static256.aClass70_17.method2079()) {
				Static59.method3199(true, local14);
			}
			Static116.anInt5593 = -1;
			Static256.aClass70_17 = new Class70(8);
			Static218.method3443();
			Static116.anInt5593 = Static140.anInt3032;
			Static84.method1470(false);
			Static146.method2565();
			Static77.method1355(Static116.anInt5593);
		}
		Static254.anInt4981 = -1;
		Static166.method2881(Static92.anInt2070);
		Static197.aClass14_Sub2_Sub1_2 = new Class14_Sub2_Sub1();
		Static197.aClass14_Sub2_Sub1_2.anInt4680 = 3000;
		Static197.aClass14_Sub2_Sub1_2.anInt4630 = 3000;
		if (!Static277.aBoolean412 && Static87.anInt1946 == 0) {
			Static24.method3649(Static134.aClass91_110);
			Static163.method2823(10);
			return;
		}
		if (Static220.anInt4376 == 2) {
			Static69.anInt1504 = Static188.anInt3900 << 7;
			Static239.anInt4738 = Static189.anInt3906 << 7;
		} else {
			Static177.method2999();
		}
		if (Static277.aBoolean412) {
			Static149.method2601();
		}
		Static104.method1942();
		Static163.method2823(28);
	}
}
