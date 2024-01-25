import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
	public static int anInt4595;

	@OriginalMember(owner = "client!jda", name = "H", descriptor = "Lclient!fv;")
	public static final Class108 aClass108_5 = new Class108();

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)Lclient!to;")
	public static Class1_Sub48 method3953() {
		@Pc(11) Class1_Sub48 local11 = Static258.method4052();
		local11.aClass319_152 = null;
		local11.anInt8523 = 0;
		local11.aClass1_Sub20_Sub1_2 = new Class1_Sub20_Sub1(5000);
		return local11;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)V")
	public static void method3955(@OriginalArg(0) int arg0) {
		Static326.anInt5840 = arg0;
		Static590.anInt9527 = 2;
		if (Static210.aString41 == null) {
			Static298.method4694(35);
		} else {
			@Pc(24) Class1_Sub20 local24 = new Class1_Sub20(Static523.method7943(Static79.method1644(Static210.aString41)));
			@Pc(28) long local28 = local24.method4416();
			Static562.aLong403 = local24.method4416();
			Static296.method4673(true, Static541.method7808(local28), "");
		}
	}
}
