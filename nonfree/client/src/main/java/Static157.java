import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Lclient!sa;")
	public static Class3_Sub21 aClass3_Sub21_1;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1273 = Static65.method1172("white:");

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1264 = aClass46_1273;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "[I")
	public static int[] anIntArray402 = new int[500];

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1265 = aClass46_1273;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1266 = Static65.method1172("<img=1>");

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1267 = Static65.method1172("Error loading your profile)3");

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1268 = aClass46_1267;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1269 = Static65.method1172("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1270 = Static65.method1172("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
	public static int anInt3504 = 0;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1271 = Static65.method1172(" (X");

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1272 = aClass46_1269;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!h;I)I")
	public static int method2541(@OriginalArg(0) Class33 arg0) {
		@Pc(23) Class3_Sub25 local23 = (Class3_Sub25) Static34.aClass54_3.method1602(((long) arg0.anInt1434 << 32) + ((long) arg0.anInt1468));
		return local23 == null ? arg0.anInt1481 : local23.anInt3833;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method2542() {
		aClass46_1268 = null;
		aClass46_1269 = null;
		aClass3_Sub21_1 = null;
		aClass46_1272 = null;
		aClass46_1267 = null;
		aClass46_1270 = null;
		aClass46_1264 = null;
		aClass46_1271 = null;
		aClass46_1273 = null;
		aClass46_1266 = null;
		anIntArray402 = null;
		aClass46_1265 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!jg;Lclient!jg;)V")
	public static void method2543(@OriginalArg(1) Class44 arg0, @OriginalArg(2) Class44 arg1) {
		Static93.aClass44_16 = arg0;
		Static145.aClass44_27 = arg1;
	}
}
