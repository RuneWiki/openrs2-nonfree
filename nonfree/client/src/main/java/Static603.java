import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static603 {

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "[I")
	public static int[] anIntArray653;

	@OriginalMember(owner = "client!ug", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString116;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "D")
	public static double aDouble27;

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "Z")
	public static boolean aBoolean725 = false;

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "Lclient!pn;")
	public static final Class288 aClass288_4 = new Class288("LIVE", 0);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!wk;)V")
	public static void method7931(@OriginalArg(1) Class3_Sub10 arg0) {
		arg0.aClass3_Sub1_Sub2_Sub2_1 = null;
		if (Static429.anInt6769 < 20) {
			Static665.aClass236_11.method4955(arg0);
			Static429.anInt6769++;
		}
	}
}
