import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!jg;")
	public static Class44 aClass44_27;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "Lclient!jg;")
	public static Class44 aClass44_28;

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1154 = Static65.method1172("No reply from loginserver)3");

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1150 = aClass46_1154;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1151 = Static65.method1172(")2");

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1152 = Static65.method1172("Connection timed out)3");

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1153 = aClass46_1152;

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "Lclient!nd;")
	public static Class59 aClass59_8 = new Class59();

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1155 = Static65.method1172("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(ZI)I")
	public static int method2410(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local18 * local32 >> 12;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public static void method2411() {
		aClass59_8 = null;
		aClass46_1153 = null;
		aClass44_28 = null;
		aClass46_1152 = null;
		aClass44_27 = null;
		aClass46_1150 = null;
		aClass46_1151 = null;
		aClass46_1155 = null;
		aClass46_1154 = null;
	}
}
