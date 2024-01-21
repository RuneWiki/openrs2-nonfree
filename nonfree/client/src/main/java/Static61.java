import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static61 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!fd;")
	public static Class1_Sub9 aClass1_Sub9_9;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!ie;")
	public static Class35 aClass35_13;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!df;")
	public static Class17 aClass17_4;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array13 = new Class34[200];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!ie;I)Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2 method1049(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1) {
		return Static21.method448(arg1, arg0) ? Static90.method2071() : null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method1050() {
		aClass35_13 = null;
		aClass34Array13 = null;
		aClass1_Sub9_9 = null;
		aClass17_4 = null;
	}
}
