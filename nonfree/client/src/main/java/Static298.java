import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "Lclient!qg;")
	public static Class1_Sub8_Sub4 aClass1_Sub8_Sub4_2;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "[I")
	public static int[] anIntArray348;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
	public static final int[] anIntArray349 = new int[200];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method4692() {
		Static326.anInt5840 = -1;
		Static590.anInt9527 = 1;
		if (Static210.aString41 == null) {
			method4694(35);
		} else {
			@Pc(24) Class1_Sub20 local24 = new Class1_Sub20(Static523.method7943(Static79.method1644(Static210.aString41)));
			@Pc(28) long local28 = local24.method4416();
			Static562.aLong403 = local24.method4416();
			Static296.method4673(true, Static541.method7808(local28), "");
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V")
	public static void method4694(@OriginalArg(0) int arg0) {
		if (Static590.anInt9527 == 1) {
			Static285.anInt9365 = arg0;
		} else if (Static590.anInt9527 == 2 || Static590.anInt9527 == 3) {
			Static543.anInt8924 = arg0;
		}
	}
}
