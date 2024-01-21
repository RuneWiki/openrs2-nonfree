import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
	public static int anInt2412;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
	public static int anInt2415;

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "Lclient!gj;")
	public static final Class40 aClass40_6 = new Class40(4096);

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
	public static int anInt2421 = 500;

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1145 = Static193.method3027("(U3");

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "[Lclient!wf;")
	public static final Class99[] aClass99Array3 = new Class99[100];

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
	public static int anInt2428 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JI)V")
	public static void method1720(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static70.method1023(arg0 - 1L);
			Static70.method1023(1L);
		} else {
			Static70.method1023(arg0);
		}
	}
}
