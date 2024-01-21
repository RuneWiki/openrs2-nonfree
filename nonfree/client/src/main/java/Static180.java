import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static180 {

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
	public static int anInt4190;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
	public static int anInt4191;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
	public static int anInt4192;

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "Lclient!jc;")
	public static Class38 aClass38_5;

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "[[Lclient!wa;")
	public static Class87[][] aClass87ArrayArray1;

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
	public static int anInt4195;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1271 = Static38.method685("FULL");

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1267 = aClass6_1271;

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1274 = Static38.method685("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1268 = aClass6_1274;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
	public static int anInt4187 = 0;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1270 = Static38.method685("yellow:");

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1269 = aClass6_1270;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1272 = aClass6_1270;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1273 = Static38.method685("logo");

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
	public static int anInt4193 = 0;

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1275 = Static38.method685("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public static void method2809() {
		aClass6_1275 = null;
		aClass6_1267 = null;
		aClass38_5 = null;
		aClass6_1268 = null;
		aClass6_1270 = null;
		aClass6_1271 = null;
		aClass6_1273 = null;
		aClass87ArrayArray1 = null;
		aClass6_1272 = null;
		aClass6_1274 = null;
		aClass6_1269 = null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!wa;I)Lclient!ai;")
	public static Class6 method2810(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1) {
		if (!Static135.method2096(Static179.method2802(arg1), arg0) && arg1.anObjectArray4 == null) {
			return null;
		} else if (arg1.aClass6Array24 == null || arg1.aClass6Array24.length <= arg0 || arg1.aClass6Array24[arg0] == null || arg1.aClass6Array24[arg0].method135().method107() == 0) {
			return Static181.aBoolean89 ? Static58.method956(new Class6[] { Static143.aClass6_986, Static106.method2806(arg0) }) : null;
		} else {
			return arg1.aClass6Array24[arg0];
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!c;ZII)V")
	public static void method2811(@OriginalArg(0) int arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static6.anInt1431 = arg3;
		Static65.anInt1613 = 1;
		Static155.aBoolean161 = false;
		Static109.anInt3491 = arg2;
		Static141.anInt3309 = 10000;
		Static135.anInt3139 = arg0;
		Static19.aClass10_21 = arg1;
	}
}
