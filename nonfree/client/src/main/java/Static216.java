import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static216 {

	@OriginalMember(owner = "client!iga", name = "t", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array12;

	@OriginalMember(owner = "client!iga", name = "u", descriptor = "[Lclient!i;")
	public static Class47[] aClass47Array2;

	@OriginalMember(owner = "client!iga", name = "x", descriptor = "F")
	public static float aFloat107;

	@OriginalMember(owner = "client!iga", name = "y", descriptor = "I")
	public static int anInt4134;

	@OriginalMember(owner = "client!iga", name = "B", descriptor = "Lclient!pga;")
	public static Class260 aClass260_7;

	@OriginalMember(owner = "client!iga", name = "v", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[250][];

	@OriginalMember(owner = "client!iga", name = "z", descriptor = "I")
	public static int anInt4135 = 0;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V")
	public static void method3350() {
		Static135.anIntArray223 = Static125.method1976(0.4F);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIIIII)V")
	public static void method3351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static348.aClass1_Sub30_Sub1_1.anInt4863 != 0 && arg3 != 0 && Static507.anInt8646 < 50 && arg0 != -1) {
			Static150.aClass104Array1[Static507.anInt8646++] = new Class104((byte) 1, arg0, arg3, arg1, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)V")
	public static void method3353() {
		if (Static2.aClass103_1 != null) {
			Static521.aClass163_1 = new Class163();
			Static521.aClass163_1.method3472(Static378.aLong204, Static2.aClass103_1.aClass351_1.method7651(Static307.anInt5279), Static2.aClass103_1.anInt2628, Static2.aClass103_1);
			Static484.aThread7 = new Thread(Static521.aClass163_1, "");
			Static484.aThread7.start();
		}
	}
}
