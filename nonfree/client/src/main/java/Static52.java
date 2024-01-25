import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!c", name = "z", descriptor = "Lclient!qi;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Lclient!tq;")
	public static final Class305 aClass305_9 = new Class305(8);

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	public static final int[] anIntArray94 = new int[256];

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_27 = new Class254(112, 9);

	@OriginalMember(owner = "client!c", name = "A", descriptor = "Lclient!vw;")
	public static final Class340 aClass340_4 = new Class340();

	@OriginalMember(owner = "client!c", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[6][];

	@OriginalMember(owner = "client!c", name = "C", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)Z")
	public static boolean method1233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!ep;)V")
	public static void method1235(@OriginalArg(1) Class93 arg0) {
		if (arg0.anInt2823 == 5 && arg0.anInt2822 != -1) {
			Static120.method2372(Static323.aClass9_8, arg0);
		}
	}
}
