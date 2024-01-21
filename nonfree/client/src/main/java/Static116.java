import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static116 {

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
	public static int anInt2873;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "Lclient!ge;")
	public static Class4_Sub11_Sub1 aClass4_Sub11_Sub1_2 = new Class4_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!u", name = "O", descriptor = "I")
	public static volatile int anInt2871 = 0;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!u", name = "R", descriptor = "Lclient!ec;")
	public static Class22 aClass22_892 = Static60.method1113("<col=ffffff>");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ea;BLclient!ea;)V")
	public static void method1840(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class20 arg1) {
		Static11.aClass20_59 = arg1;
		Static13.aClass20_9 = arg0;
		Static75.anInt1999 = Static11.aClass20_59.method591(3);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ea;I)V")
	public static void method1841(@OriginalArg(0) Class20 arg0) {
		Static38.aClass20_21 = arg0;
		Static50.anInt1412 = Static38.aClass20_21.method591(16);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
	public static void method1842() {
		aClass22_892 = null;
		aClass4_Sub11_Sub1_2 = null;
	}
}
