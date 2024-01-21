import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static177 {

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray104;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1603 = Static169.method2903("Loading )2 please wait)3");

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	public static int anInt4203 = 0;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "Lclient!td;")
	public static Class79 aClass79_29 = new Class79(64);

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1604 = aClass23_1603;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1605 = Static169.method2903("");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZILclient!ob;I)V")
	public static void method3000(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) int arg2) {
		if (Static133.aClass60_12 != null || Static164.aBoolean201 || (arg1 == null || Static42.method709(arg1) == null)) {
			return;
		}
		Static133.aClass60_12 = arg1;
		Static142.aClass60_13 = Static42.method709(arg1);
		Static169.anInt4122 = arg2;
		Static30.anInt2834 = 0;
		Static86.aBoolean115 = false;
		Static99.anInt2527 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public static void method3001() {
		aClass79_29 = null;
		aClass23_1605 = null;
		aByteArrayArrayArray104 = null;
		aClass23_1604 = null;
		aClass23_1603 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILclient!ga;)Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4 method3002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		return Static162.method2822(arg0, arg1, arg2) ? Static92.method1612() : null;
	}
}
