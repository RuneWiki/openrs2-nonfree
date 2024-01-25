import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "[Lclient!pga;")
	public static Class32[] aClass32Array7;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public static int anInt1859;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "Lclient!de;")
	public static final Class61 aClass61_4 = new Class61();

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_12 = new Class166(128, 4);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!we;Lclient!we;B)V")
	public static void method1535(@OriginalArg(0) Class6_Sub2 arg0, @OriginalArg(1) Class6_Sub2 arg1) {
		if (arg1.aClass6_Sub2_67 != null) {
			arg1.method8754();
		}
		arg1.aClass6_Sub2_67 = arg0.aClass6_Sub2_67;
		arg1.aClass6_Sub2_66 = arg0;
		arg1.aClass6_Sub2_67.aClass6_Sub2_66 = arg1;
		arg1.aClass6_Sub2_66.aClass6_Sub2_67 = arg1;
	}
}
