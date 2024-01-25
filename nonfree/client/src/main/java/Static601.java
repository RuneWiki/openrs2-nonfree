import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static601 {

	@OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
	public static int anInt9959;

	@OriginalMember(owner = "client!vca", name = "v", descriptor = "Lclient!vs;")
	public static final Class370 aClass370_1 = new Class370();

	@OriginalMember(owner = "client!vca", name = "A", descriptor = "[F")
	public static final float[] aFloatArray101 = new float[2];

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
	public static void method8464() throws Exception_Sub1 {
		if (Static518.anInt8368 == 1) {
			Static613.aClass13_82.method8133(Static239.anInt4434, Static326.anInt5718);
		} else {
			Static613.aClass13_82.method8133(0, 0);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8468(@OriginalArg(2) String arg0) {
		Static107.method1973(arg0, 0, "", "", 4, "");
	}
}
