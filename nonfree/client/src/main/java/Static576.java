import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static576 {

	@OriginalMember(owner = "client!uha", name = "G", descriptor = "I")
	public static final int anInt9494 = 50;

	@OriginalMember(owner = "client!uha", name = "A", descriptor = "[I")
	public static final int[] anIntArray599 = new int[anInt9494];

	@OriginalMember(owner = "client!uha", name = "C", descriptor = "[I")
	public static final int[] anIntArray600 = new int[anInt9494];

	@OriginalMember(owner = "client!uha", name = "I", descriptor = "[I")
	public static final int[] anIntArray601 = new int[anInt9494];

	@OriginalMember(owner = "client!uha", name = "J", descriptor = "[I")
	public static final int[] anIntArray602 = new int[anInt9494];

	@OriginalMember(owner = "client!uha", name = "K", descriptor = "J")
	public static long aLong255 = -1L;

	@OriginalMember(owner = "client!uha", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[anInt9494];

	@OriginalMember(owner = "client!uha", name = "M", descriptor = "I")
	public static int anInt9495 = 1;

	@OriginalMember(owner = "client!uha", name = "N", descriptor = "[I")
	public static final int[] anIntArray603 = new int[anInt9494];

	@OriginalMember(owner = "client!uha", name = "P", descriptor = "I")
	public static int anInt9497 = -1;

	@OriginalMember(owner = "client!uha", name = "Q", descriptor = "[I")
	public static int[] anIntArray604 = new int[2];

	@OriginalMember(owner = "client!uha", name = "R", descriptor = "[I")
	public static final int[] anIntArray605 = new int[anInt9494];

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)I")
	public static int method8181() {
		return 16;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIIIII)V")
	public static void method8183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static630.anInt10099 <= arg5 && Static16.anInt4339 >= arg3 && Static11.anInt9803 <= arg0 && arg1 <= Static149.anInt2949) {
			if (arg4 == 1) {
				Static59.method1597(arg0, arg1, arg3, arg5, arg2);
			} else {
				Static345.method5780(arg1, arg3, arg4, arg5, arg2, arg0);
			}
		} else if (arg4 == 1) {
			Static443.method6908(arg5, arg2, arg0, arg1, arg3);
		} else {
			Static520.method8081(arg1, arg4, arg5, arg3, arg0, arg2);
		}
	}
}
