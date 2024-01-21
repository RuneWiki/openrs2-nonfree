import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
	public static int[] anIntArray323;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1630 = Static32.method683("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1631 = aClass49_1630;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	public static int anInt3638 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method2771() {
		aString7 = null;
		aClass49_1631 = null;
		anIntArray323 = null;
		aClass49_1630 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method2773() {
		if (Static37.aClass5_1 != null) {
			Static37.aClass5_1.method1793();
		}
		if (Static146.aClass5_2 != null) {
			Static146.aClass5_2.method1793();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)Lclient!td;")
	public static Class2_Sub2_Sub16 method2774(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub16 local10 = (Class2_Sub2_Sub16) Static171.aClass74_94.method2345((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static165.method2736(arg0, Static27.aClass11_29, Static163.aClass11_32);
		if (local10 != null) {
			Static171.aClass74_94.method2341((long) arg0, local10);
		}
		return local10;
	}
}
