import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!ld;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!dp;")
	public static Class53 aClass53_158;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	public static int anInt6260 = 0;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[5];

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
	public static final int[] anIntArray712 = new int[14];

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public static void method5700() {
		Static322.aClass70_90.method1399();
		Static309.aClass70_100.method1399();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lclient!qa;")
	public static Class165 method5701(@OriginalArg(0) int arg0) {
		@Pc(10) Class165 local10 = (Class165) Static92.aClass70_30.method1396((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static99.aClass53_152.method1033(arg0, 36);
		local10 = new Class165();
		local10.anInt4678 = arg0;
		if (local20 != null) {
			local10.method4331(new Class6_Sub10(local20));
		}
		local10.method4324();
		Static92.aClass70_30.method1406(local10, (long) arg0);
		return local10;
	}
}
