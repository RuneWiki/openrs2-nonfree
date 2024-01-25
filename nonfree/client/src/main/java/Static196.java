import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!cea;")
	public static Class47 aClass47_3;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[Lclient!vp;")
	public static Class390[] aClass390Array1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!av;II)V")
	public static void method2961(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class331 local8 = arg0.method473(Static488.aClass67_12);
		if (local8 == null) {
			return;
		}
		Static488.aClass67_12.KA(arg2, arg1, arg2 + arg0.anInt509, arg1 + arg0.anInt569);
		if (Static412.anInt7313 >= 3) {
			Static488.aClass67_12.A(-16777216, local8.aClass1_1, arg2, arg1);
		} else {
			Static605.aClass9_32.method8612((float) arg0.anInt509 / 2.0F + (float) arg2, (float) arg0.anInt569 / 2.0F + (float) arg1, ((int) -Static658.aFloat196 & 0x3FFF) << 2, local8.aClass1_1, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)Lclient!oaa;")
	public static Class256_Sub1 method2962() {
		return Static372.aClass256_Sub1Array1.length > Static693.anInt10869 ? Static372.aClass256_Sub1Array1[Static693.anInt10869++] : null;
	}
}
