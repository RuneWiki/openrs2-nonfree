import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray30;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	public static int anInt9189 = 0;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "[I")
	public static final int[] anIntArray477 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIILclient!sba;)V")
	public static void method7490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class302 arg2) {
		@Pc(10) Class1 local10 = arg2.method7356(Static467.aClass5_13);
		if (local10 == null) {
			return;
		}
		Static467.aClass5_13.KA(arg0, arg1, arg0 + arg2.anInt8909, arg2.anInt8872 + arg1);
		if (Static571.anInt9787 < 3) {
			Static572.aClass4_31.method7702((float) arg0 + (float) arg2.anInt8909 / 2.0F, (float) arg1 + (float) arg2.anInt8872 / 2.0F, ((int) -Static595.aFloat184 & 0x3FFF) << 2, local10, arg0, arg1);
		} else {
			Static467.aClass5_13.A(-16777216, local10, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!sba;II)V")
	public static void method7491(@OriginalArg(0) int arg0, @OriginalArg(1) Class302 arg1, @OriginalArg(2) int arg2) {
		Static580.anInt9870 = arg2;
		Static544.anInt9410 = arg0;
		Static497.aClass302_15 = arg1;
	}
}
