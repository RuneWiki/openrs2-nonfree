import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static448 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "[Lclient!td;")
	public static Class24[] aClass24Array16;

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
	public static int anInt7978 = 0;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IILclient!la;BIIZ)V")
	public static void method6932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= 0) {
			Static189.method3227(arg3, arg2, arg1);
			return;
		}
		Static402.aClass196_83 = arg2;
		Static324.anInt8117 = 1;
		Static185.aBoolean342 = false;
		Static236.aClass3_Sub7_Sub2_1 = null;
		Static563.anInt9401 = arg3;
		Static141.anInt2838 = arg1;
		Static495.anInt8540 = 0;
		Static406.anInt7454 = Static594.aClass3_Sub7_Sub2_3.method2449() / arg0;
		if (Static406.anInt7454 < 1) {
			Static406.anInt7454 = 1;
		}
	}
}
