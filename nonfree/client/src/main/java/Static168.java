import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!fha", name = "v", descriptor = "I")
	public static int anInt3083;

	@OriginalMember(owner = "client!fha", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!fha", name = "p", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_31 = new Class240(82, 6);

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)V")
	public static void method2664() {
		if (Static173.anInt3182 != -1) {
			Static117.method1799(-1, Static173.anInt3182, false, -1);
			Static173.anInt3182 = -1;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZBI)V")
	public static void method2665(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		Static66.method1166(Static114.aClass84_12.method1729(Static654.anInt10668), arg0, arg1);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!dt;B)Lclient!efa;")
	public static Class98 method2666(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(12) int local12 = arg0.method7951();
		return new Class98(local12);
	}
}
