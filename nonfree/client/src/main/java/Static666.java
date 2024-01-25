import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static666 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
	public static int anInt10646;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "J")
	public static long aLong308;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "[I")
	public static int[] anIntArray708 = new int[2];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	public static void method9033() {
		if (Static569.aClass380_6.aBoolean729 && Static34.aClass354_1.anInt9837 != -1) {
			Static627.method8634(Static34.aClass354_1.aString135, Static34.aClass354_1.anInt9837);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!laa;I)Ljava/lang/String;")
	public static String method9034(@OriginalArg(0) Class6_Sub4_Sub10 arg0) {
		return arg0.aString71 + " <col=ffffff>>";
	}
}
