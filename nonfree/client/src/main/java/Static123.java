import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static123 {

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString17;

	@OriginalMember(owner = "client!efa", name = "J", descriptor = "I")
	public static int anInt2590;

	@OriginalMember(owner = "client!efa", name = "x", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_24 = new Class200(104, -1);

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!qm;Lclient!qm;I)V")
	public static void method2427(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg0.aClass3_299 != null) {
			arg0.method8769();
		}
		arg0.aClass3_299 = arg1.aClass3_299;
		arg0.aClass3_300 = arg1;
		arg0.aClass3_299.aClass3_300 = arg0;
		arg0.aClass3_300.aClass3_299 = arg0;
	}
}
