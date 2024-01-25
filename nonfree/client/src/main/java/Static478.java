import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
	public static int anInt9997;

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "Z")
	public static boolean aBoolean839 = true;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "Lclient!er;")
	public static final Class86 aClass86_11 = new Class86();

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "[I")
	public static final int[] anIntArray606 = new int[4096];

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "Lclient!us;")
	public static final Class344 aClass344_120 = new Class344(59, 4);

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)Lclient!jm;")
	public static Class163 method8207(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static394.aClass163Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!jo;)V")
	public static void method8208(@OriginalArg(1) Class3_Sub1_Sub10 arg0) {
		arg0.method8621();
		@Pc(19) boolean local19 = false;
		for (@Pc(24) Class3_Sub1_Sub10 local24 = (Class3_Sub1_Sub10) Static379.aClass30_9.method780(); local24 != null; local24 = (Class3_Sub1_Sub10) Static379.aClass30_9.method783()) {
			if (Static228.method4369(local24.method4919(), arg0.method4919())) {
				Static615.method8368(arg0, local24);
				local19 = true;
				break;
			}
		}
		if (!local19) {
			Static379.aClass30_9.method779(arg0);
		}
	}
}
