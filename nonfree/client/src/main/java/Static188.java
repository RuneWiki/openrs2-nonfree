import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt3532;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Lclient!oc;")
	public static Class1_Sub2_Sub13 aClass1_Sub2_Sub13_2;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "S")
	public static short aShort32 = 1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public static void method2833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub2_Sub11 local10 = Static163.method3579(7, arg1);
		local10.method1859();
		local10.anInt2282 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method2834() {
		Static13.aClass1_Sub2_Sub2_7 = null;
		Static6.aClass1_Sub2_Sub2_1 = null;
		Static13.aClass1_Sub2_Sub2_8 = null;
		Static108.aClass1_Sub2_Sub2_5 = null;
		Static244.aClass1_Sub2_Sub2_11 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	public static void method2835(@OriginalArg(0) int arg0) {
		if (Static295.anIntArray690 == null || arg0 > Static295.anIntArray690.length) {
			Static295.anIntArray690 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([II)[I")
	public static int[] method2836(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) int[] local17 = new int[arg0.length];
			Static300.method491(arg0, 0, local17, 0, arg0.length);
			return local17;
		}
	}
}
