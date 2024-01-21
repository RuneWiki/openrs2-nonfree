import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	public static int anInt3427;

	@OriginalMember(owner = "client!ub", name = "Y", descriptor = "Lclient!kh;")
	public static Class29 aClass29_66;

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "Lclient!ug;")
	public static Class83 aClass83_4;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1493 = Static51.method932("<br>(X100(U(Y");

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1494 = Static51.method932("Ok");

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "[I")
	public static int[] anIntArray361 = new int[5];

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1495 = aClass10_1494;

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1496 = Static51.method932("Your account is already logged in)3");

	@OriginalMember(owner = "client!ub", name = "cb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1497 = aClass10_1496;

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1498 = Static51.method932("(U0a )2 in: ");

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	public static void method2443() {
		Static69.aFont1 = null;
		Static147.anImage105 = null;
		Static66.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(JI)V")
	public static void method2444(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static139.anInt3081 >= 100) {
			Static96.method2627(Static63.aClass10_687, 0, Static3.aClass10_35);
			return;
		}
		@Pc(31) Class10 local31 = Static36.method764(arg0).method361();
		for (@Pc(33) int local33 = 0; local33 < Static139.anInt3081; local33++) {
			if (arg0 == Static167.aLongArray6[local33]) {
				Static96.method2627(Static63.aClass10_687, 0, Static3.method36(new Class10[] { local31, Static56.aClass10_616 }));
				return;
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static76.anInt1789; local72++) {
			if (Static16.aLongArray2[local72] == arg0) {
				Static96.method2627(Static63.aClass10_687, 0, Static3.method36(new Class10[] { Static20.aClass10_240, local31, Static81.aClass10_824 }));
				return;
			}
		}
		if (local31.method358(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass10_598)) {
			Static96.method2627(Static63.aClass10_687, 0, Static16.aClass10_195);
			return;
		}
		Static167.aLongArray6[Static139.anInt3081] = arg0;
		Static116.aClass10Array20[Static139.anInt3081++] = Static36.method764(arg0);
		Static1.anInt5 = Static12.anInt364;
		Static141.aClass2_Sub11_Sub1_3.method1495(46);
		Static141.aClass2_Sub11_Sub1_3.method1458(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Lclient!cd;")
	public static Class10 method2445(@OriginalArg(1) int arg0) {
		@Pc(12) Class10 local12 = new Class10();
		local12.aByteArray7 = new byte[arg0];
		local12.anInt513 = 0;
		return local12;
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	public static void method2446() {
		aClass10_1495 = null;
		anIntArray361 = null;
		aClass83_4 = null;
		aClass10_1496 = null;
		aClass10_1493 = null;
		aClass10_1494 = null;
		aClass10_1498 = null;
		aClass29_66 = null;
		aClass10_1497 = null;
	}
}
