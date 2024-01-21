import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!wf", name = "Kc", descriptor = "I")
	public static int anInt3164;

	@OriginalMember(owner = "client!wf", name = "Mc", descriptor = "I")
	public static int anInt3165;

	@OriginalMember(owner = "client!wf", name = "Oc", descriptor = "Lclient!h;")
	public static Class8_Sub1_Sub1_Sub4_Sub1 aClass8_Sub1_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!wf", name = "Wc", descriptor = "[Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3[] aClass8_Sub1_Sub3_Sub3Array41;

	@OriginalMember(owner = "client!wf", name = "gd", descriptor = "Lclient!ia;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!wf", name = "ic", descriptor = "Lclient!mf;")
	public static Class52 aClass52_2 = new Class52();

	@OriginalMember(owner = "client!wf", name = "Tc", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1442 = Static56.method816("flash2:");

	@OriginalMember(owner = "client!wf", name = "Lc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1438 = aClass34_1442;

	@OriginalMember(owner = "client!wf", name = "Qc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1440 = aClass34_1442;

	@OriginalMember(owner = "client!wf", name = "Rc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1441 = Static56.method816("Untersuchen");

	@OriginalMember(owner = "client!wf", name = "cd", descriptor = "Lclient!lf;")
	public static Class48 aClass48_59 = new Class48(64);

	@OriginalMember(owner = "client!wf", name = "dd", descriptor = "I")
	public static int anInt3168 = 0;

	@OriginalMember(owner = "client!wf", name = "fd", descriptor = "I")
	public static int anInt3170 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!dd;I)Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2 method2016(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1) {
		return Static127.method1984(arg0, arg1) ? Static75.method1094() : null;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public static void method2017() {
		aClass33_1 = null;
		aClass8_Sub1_Sub1_Sub4_Sub1_1 = null;
		aClass34_1441 = null;
		aClass52_2 = null;
		aClass8_Sub1_Sub3_Sub3Array41 = null;
		aClass34_1440 = null;
		aClass48_59 = null;
		aClass34_1438 = null;
		aClass34_1442 = null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILclient!dd;)Z")
	public static boolean method2026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14 arg2) {
		@Pc(9) byte[] local9 = arg2.method1156(arg0, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static124.method1964(local9);
			return true;
		}
	}
}
