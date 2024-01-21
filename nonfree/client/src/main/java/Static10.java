import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static10 {

	@OriginalMember(owner = "client!b", name = "F", descriptor = "[S")
	public static short[] aShortArray5 = new short[] { 3, 35, 23, 48, 40, 29, 28, 14 };

	@OriginalMember(owner = "client!b", name = "H", descriptor = "Lclient!rf;")
	private static Class70 aClass70_121 = Static49.method1293("Please enter your username)3");

	@OriginalMember(owner = "client!b", name = "P", descriptor = "Lclient!rf;")
	public static Class70 aClass70_122 = aClass70_121;

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "Lclient!rf;")
	public static Class70 aClass70_123 = Static49.method1293("<col=ffb000>");

	@OriginalMember(owner = "client!b", name = "T", descriptor = "[I")
	public static int[] anIntArray24 = new int[25];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!de;II)V")
	public static void method295(@OriginalArg(0) Class1_Sub1_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static99.method3502(arg0.anInt2001, arg1, arg0.anInt2030);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZZ)Lclient!rf;")
	public static Class70 method298(@OriginalArg(0) int arg0) {
		return Static96.method2077(true, arg0);
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
	public static void method299() {
		aClass70_121 = null;
		aClass70_123 = null;
		aShortArray5 = null;
		aClass70_122 = null;
		anIntArray24 = null;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)Lclient!rf;")
	public static Class70 method301(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static34.method873(arg0) : Static27.aClass70_258;
	}
}
