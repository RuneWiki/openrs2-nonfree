import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static637 {

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "J")
	public static long aLong290;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
	public static int anInt10654;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_182 = new Class44(85, 1);

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "[I")
	public static final int[] anIntArray793 = new int[13];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI)Z")
	public static boolean method8888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static313.method7483(arg1, arg0) | (arg0 & 0x70000) != 0 || Static79.method1488(arg0, arg1);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([IB[Ljava/lang/Object;)V")
	public static void method8889(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static298.method4394(arg1, arg0, arg0.length - 1, 0);
	}
}
