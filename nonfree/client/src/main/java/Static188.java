import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static188 {

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "F")
	public static float aFloat124;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_58 = new Class286(82, 6);

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public static int anInt3850 = 104;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
	public static final int[] anIntArray217 = new int[1];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZILclient!pl;IIB)V")
	public static void method3183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class259 arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= 0) {
			Static24.method443(arg0, arg2, arg1);
			return;
		}
		Static362.aBoolean487 = false;
		Static185.anInt9183 = arg1;
		Static219.anInt4151 = 0;
		Static526.anInt8654 = arg0;
		Static554.aClass259_166 = arg2;
		Static409.anInt7111 = 1;
		Static206.anInt4003 = Static396.aClass2_Sub10_Sub2_3.method1560() / arg3;
		if (Static206.anInt4003 < 1) {
			Static206.anInt4003 = 1;
		}
	}
}
