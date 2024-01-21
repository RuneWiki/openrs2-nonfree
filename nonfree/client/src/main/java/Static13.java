import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!u;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[I")
	public static int[] anIntArray47;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4[] aClass4_Sub2_Sub3_Sub4Array1;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	public static int anInt349 = 0;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_244 = Static28.method504("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private static final int anInt353 = 2301979;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "I")
	public static volatile int anInt356 = 0;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "Lclient!ja;")
	private static Class39 aClass39_246 = Static28.method504("Select a world");

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!ja;")
	public static Class39 aClass39_245 = aClass39_246;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[5];

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIZ)V")
	public static void method230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static58.aClass4_Sub2_Sub3_Sub4Array3[0].method1688(arg4, arg0);
		Static58.aClass4_Sub2_Sub3_Sub4Array3[1].method1688(arg4, arg2 + arg0 - 16);
		Static17.method1682(arg4, arg0 + 16, 16, arg2 - 32, anInt353);
		@Pc(37) int local37 = arg2 * (arg2 - 32) / arg3;
		if (local37 < 8) {
			local37 = 8;
		}
		@Pc(62) int local62 = (arg2 - local37 - 32) * arg1 / (arg3 - arg2);
		Static17.method1682(arg4, local62 + arg0 + 16, 16, local37, Static25.anInt3164);
		Static17.method1673(arg4, arg0 + local62 + 16, local37, Static1.anInt1);
		Static17.method1673(arg4 + 1, local62 + 16 + arg0, local37, Static1.anInt1);
		Static17.method1669(arg4, local62 + arg0 + 16, 16, Static1.anInt1);
		Static17.method1669(arg4, local62 + arg0 + 17, 16, Static1.anInt1);
		Static17.method1673(arg4 + 15, arg0 - (-16 - local62), local37, Static73.anInt1759);
		Static17.method1673(arg4 + 14, local62 + 17 + arg0, local37 - 1, Static73.anInt1759);
		Static17.method1669(arg4, local62 + arg0 + local37 + 15, 16, Static73.anInt1759);
		Static17.method1669(arg4 + 1, local37 + local62 + arg0 + 14, 15, Static73.anInt1759);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method231() {
		@Pc(5) Object local5 = Static36.anObject3;
		synchronized (Static36.anObject3) {
			if (Static108.anInt2702 == 0) {
				Static126.aClass29_63.method607(new Class17(), 5);
			}
			Static108.anInt2702 = 600;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method232() {
		aClass39_244 = null;
		anIntArray47 = null;
		aBooleanArray2 = null;
		aClass75_1 = null;
		aClass39_245 = null;
		aClass4_Sub2_Sub3_Sub4Array1 = null;
		aBooleanArray3 = null;
		aClass39_246 = null;
	}
}
