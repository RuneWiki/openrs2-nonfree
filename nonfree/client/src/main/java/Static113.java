import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static113 {

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_10;

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "Lclient!ne;")
	public static Class1_Sub1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_12 = new Class4();

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "[Lclient!dg;")
	public static Class1_Sub1_Sub4_Sub2_Sub1[] aClass1_Sub1_Sub4_Sub2_Sub1Array1 = new Class1_Sub1_Sub4_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1021 = Static49.method1293("k");

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1022 = Static49.method1293("Unable to find ");

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1023 = aClass70_1022;

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1024 = Static49.method1293("rect_debug=");

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public static void method2295() {
		aClass76_Sub1_10 = null;
		aClass1_Sub1_Sub1_Sub2_Sub1_3 = null;
		aClass70_1024 = null;
		aClass70_1022 = null;
		aBooleanArray15 = null;
		aClass1_Sub1_Sub4_Sub2_Sub1Array1 = null;
		aClass70_1021 = null;
		aClass4_12 = null;
		aClass70_1023 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!ig;)Lclient!rf;")
	public static Class70 method2296(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		if (!Static37.method957(arg0, Static20.method439(arg1)) && arg1.anObjectArray15 == null) {
			return null;
		} else if (arg1.aClass70Array11 == null || arg1.aClass70Array11.length <= arg0 || arg1.aClass70Array11[arg0] == null || arg1.aClass70Array11[arg0].method2919().method2896() == 0) {
			return Static125.aBoolean134 ? Static160.method3210(new Class70[] { Static90.aClass70_872, Static34.method873(arg0) }) : null;
		} else {
			return arg1.aClass70Array11[arg0];
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIILclient!s;IJIIII)Z")
	public static boolean method2297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static93.method2007(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}
