import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static108 {

	@OriginalMember(owner = "client!se", name = "Cd", descriptor = "Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4 aClass4_Sub2_Sub3_Sub4_6;

	@OriginalMember(owner = "client!se", name = "Gd", descriptor = "[Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4[] aClass4_Sub2_Sub3_Sub4Array6;

	@OriginalMember(owner = "client!se", name = "Id", descriptor = "[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] aClass4_Sub2_Sub3_Sub1Array10;

	@OriginalMember(owner = "client!se", name = "sd", descriptor = "I")
	public static int anInt2699 = 0;

	@OriginalMember(owner = "client!se", name = "vd", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1416 = Static28.method504("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!se", name = "wd", descriptor = "Lclient!c;")
	public static Class12 aClass12_74 = new Class12(64);

	@OriginalMember(owner = "client!se", name = "xd", descriptor = "Lclient!c;")
	public static Class12 aClass12_75 = new Class12(50);

	@OriginalMember(owner = "client!se", name = "yd", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1417 = Static28.method504("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!se", name = "zd", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1418 = Static28.method504("Create a free account");

	@OriginalMember(owner = "client!se", name = "Dd", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1420 = Static28.method504(" has logged out)3");

	@OriginalMember(owner = "client!se", name = "Ad", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1419 = aClass39_1420;

	@OriginalMember(owner = "client!se", name = "Bd", descriptor = "I")
	public static int anInt2701 = 1;

	@OriginalMember(owner = "client!se", name = "Ed", descriptor = "I")
	public static int anInt2702 = 0;

	@OriginalMember(owner = "client!se", name = "Fd", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1421 = aClass39_1418;

	@OriginalMember(owner = "client!se", name = "Hd", descriptor = "[I")
	public static int[] anIntArray301 = new int[100];

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
	public static void method1917() {
		aClass39_1420 = null;
		aClass4_Sub2_Sub3_Sub4Array6 = null;
		aClass12_74 = null;
		aClass4_Sub2_Sub3_Sub1Array10 = null;
		anIntArray301 = null;
		aClass39_1419 = null;
		aClass12_75 = null;
		aClass39_1418 = null;
		aClass39_1416 = null;
		aClass4_Sub2_Sub3_Sub4_6 = null;
		aClass39_1421 = null;
		aClass39_1417 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!he;II)Lclient!ja;")
	public static Class39 method1918(@OriginalArg(0) Class4_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (!Static125.method2176(arg1, Static20.method385(arg0)) && arg0.anObjectArray21 == null) {
			return null;
		} else if (arg0.aClass39Array9 == null || arg0.aClass39Array9.length <= arg1 || arg0.aClass39Array9[arg1] == null || arg0.aClass39Array9[arg1].method957().method953() == 0) {
			return Static67.aBoolean96 ? Static62.method1123(new Class39[] { Static67.aClass39_893, Static29.method510(arg1) }) : null;
		} else {
			return arg0.aClass39Array9[arg1];
		}
	}
}
