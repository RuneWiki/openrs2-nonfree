import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "[I")
	public static int[] anIntArray252 = new int[4096];

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	public static int anInt2756 = 0;

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
	public static int anInt2761 = 127;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!im;Lclient!im;B)V")
	public static void method2128(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg0.aClass1_230 != null) {
			arg0.method4441();
		}
		arg0.aClass1_230 = arg1.aClass1_230;
		arg0.aClass1_231 = arg1;
		arg0.aClass1_230.aClass1_231 = arg0;
		arg0.aClass1_231.aClass1_230 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
	public static void method2130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static88.aBoolean140 = true;
		Static117.anInt2723 = arg0;
		Static266.anInt3887 = arg1;
		Static53.anInt5283 = arg2;
		Static258.anInt5067 = -1;
		Static296.anInt5586 = -1;
	}
}
