import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static34 {

	@OriginalMember(owner = "client!bba", name = "J", descriptor = "J")
	public static long aLong38;

	@OriginalMember(owner = "client!bba", name = "L", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!bba", name = "v", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!bba", name = "z", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_10 = new Class187(51, -1);

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_27 = new Class196(129, 6);

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)I")
	public static int method450(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "(I)V")
	public static void method451() {
		Static338.method7924(Static655.aClass5_Sub36_29.aClass2_Sub2_1.method969() == 1);
		Static549.aClass107_3 = Static80.method1216(0, Static105.aCanvas2, 22050, Static150.aClass202_2);
		Static192.method2759(Static373.method5519((Class5_Sub14_Sub4) null));
		Static373.aClass107_1 = Static80.method1216(1, Static105.aCanvas2, 2048, Static150.aClass202_2);
		Static229.aClass5_Sub14_Sub3_1 = new Class5_Sub14_Sub3();
		Static373.aClass107_1.method8604(Static229.aClass5_Sub14_Sub3_1);
		Static123.aClass158_1 = new Class158(22050, Static227.anInt3654);
		Static516.method3871();
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(II)Z")
	public static boolean method453(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
