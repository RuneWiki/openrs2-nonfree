import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!f;")
	public static Class49 aClass49_18;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	public static int anInt5175;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "Lclient!s;")
	public static Class1_Sub9_Sub4 aClass1_Sub9_Sub4_3;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public static void method4044() {
		@Pc(5) int local5 = 0;
		if (Static336.aClass106_Sub1_1.method4423(Static410.anInt6680)) {
			local5 = 55;
		}
		if (!Static336.aClass106_Sub1_1.aBoolean463) {
			local5 |= 0x40;
		}
		Static44.method688(local5);
		Static259.aClass95_3.method1825(local5);
		Static227.aClass65_2.method1335(local5);
		Static304.aClass27_1.method593(local5);
		Static44.aClass190_2.method3999(local5);
		Static53.method827(local5);
		Static421.method5240(local5);
		Static382.method4888(local5);
		Static86.method1264(local5);
		if (Static98.anInt1721 == 10) {
			Static430.method5422(28);
		} else if (Static98.anInt1721 == 30) {
			Static430.method5422(25);
			return;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I")
	public static int method4045(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)V")
	public static void method4047(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub3_Sub13 local13 = Static397.method4998(9, arg0);
		local13.method3458();
	}
}
