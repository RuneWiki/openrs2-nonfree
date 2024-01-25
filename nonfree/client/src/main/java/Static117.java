import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static117 {

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	public static int anInt2350;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	public static int anInt2356;

	@OriginalMember(owner = "client!fk", name = "x", descriptor = "[[Lclient!cr;")
	public static Class41[][] aClass41ArrayArray1;

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
	public static int anInt2361 = 0;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	public static void method1716() {
		Static109.aClass240_8.method5433();
		Static215.aClass240_20.method5433();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!da;Lclient!da;Z)V")
	public static void method1718(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_262 != null) {
			arg1.method6072();
		}
		arg1.aClass2_262 = arg0.aClass2_262;
		arg1.aClass2_261 = arg0;
		arg1.aClass2_262.aClass2_261 = arg1;
		arg1.aClass2_261.aClass2_262 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public static void method1723(@OriginalArg(1) int arg0) {
		if (Static415.anInt7247 == 0) {
			Static151.aClass2_Sub18_Sub2_1.method2884(arg0);
		} else {
			Static229.anInt4373 = arg0;
		}
	}
}
