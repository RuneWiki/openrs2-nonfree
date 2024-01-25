import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	public static int anInt1349;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	public static int anInt1360;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
	public static int anInt1364;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public static int anInt1352 = 1;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Lclient!ka;")
	public static Class109 aClass109_18 = new Class109(64);

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
	public static final int[] anIntArray110 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIBIII)V")
	public static void method1303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static163.anInt3234 <= arg4 && Static353.anInt6760 >= arg0 && Static75.anInt1447 <= arg3 && arg6 <= Static346.anInt6668) {
			Static4.method71(arg6, arg2, arg0, arg4, arg3, arg1, arg5);
		} else {
			Static160.method2841(arg6, arg5, arg0, arg2, arg1, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZII)V")
	public static void method1307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg0) {
			Static160.method2840(arg3, arg1, arg0, Static129.anIntArrayArray46[arg2]);
		} else {
			Static160.method2840(arg3, arg0, arg1, Static129.anIntArrayArray46[arg2]);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1309(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static125.aClass5_Sub12_Sub2_3.method5125(239);
			Static125.aClass5_Sub12_Sub2_3.method5089(Static56.method878(arg0));
			Static125.aClass5_Sub12_Sub2_3.method5094(arg0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public static void method1310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class65 local17 = Static42.aClass65ArrayArray1[arg0][arg1];
		if (local17 != null) {
			Static52.anInt969 = local17.anInt1478;
			Static232.anInt4692 = local17.anInt1483;
			Static222.anInt4381 = local17.anInt1487;
		}
		Static96.method1760();
	}
}
