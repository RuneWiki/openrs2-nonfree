import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static215 {

	@OriginalMember(owner = "client!km", name = "n", descriptor = "[Lclient!vo;")
	public static Class260[] aClass260Array2;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "Lclient!af;")
	public static Class6 aClass6_2;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_61 = new Class2(60, -1);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!ok;ZLclient!ok;Lclient!rl;Lclient!ok;)Z")
	public static boolean method3052(@OriginalArg(0) Class178 arg0, @OriginalArg(2) Class178 arg1, @OriginalArg(3) Class7_Sub8_Sub3 arg2, @OriginalArg(4) Class178 arg3) {
		Static195.aClass178_53 = arg3;
		Static429.aClass178_135 = arg1;
		Static108.aClass7_Sub8_Sub3_1 = arg2;
		Static122.aClass178_38 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)Z")
	public static boolean method3055(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
