import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_3;

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "Lclient!t;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
	public static int anInt720;

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "Lclient!fd;")
	public static Class24 aClass24_8;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "Lclient!pe;")
	public static Class2_Sub18 aClass2_Sub18_1;

	@OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
	public static int anInt726;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "Lclient!je;")
	private static Class40 aClass40_419 = Static69.method1231("World");

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "Lclient!je;")
	private static Class40 aClass40_420 = Static69.method1231("Players");

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "Lclient!je;")
	public static Class40 aClass40_421 = Static69.method1231("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "Lclient!je;")
	public static Class40 aClass40_422 = Static69.method1231("va");

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lclient!je;")
	public static Class40 aClass40_423 = Static69.method1231(" weitere Optionen");

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "Lclient!je;")
	public static Class40 aClass40_424 = aClass40_419;

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "Lclient!je;")
	public static Class40 aClass40_425 = Static69.method1231(":tradereq:");

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "Lclient!je;")
	public static Class40 aClass40_426 = aClass40_420;

	@OriginalMember(owner = "client!ef", name = "Z", descriptor = "Lclient!je;")
	public static Class40 aClass40_427 = aClass40_419;

	@OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
	public static int anInt724 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static15.aClass2_Sub1_Sub2_Sub1Array16[0].method1084(arg1, arg0);
		Static15.aClass2_Sub1_Sub2_Sub1Array16[1].method1084(arg1, arg2 + arg0 - 16);
		Static6.method1695(arg1, arg0 + 16, 16, arg2 - 32, Static41.anInt1100);
		@Pc(37) int local37 = (arg2 - 32) * arg2 / arg3;
		if (local37 < 8) {
			local37 = 8;
		}
		@Pc(56) int local56 = arg4 * (arg2 - local37 - 32) / (arg3 - arg2);
		Static6.method1695(arg1, arg0 + local56 + 16, 16, local37, Static40.anInt1081);
		Static6.method1691(arg1, local56 + arg0 + 16, local37, Static17.anInt429);
		Static6.method1691(arg1 + 1, arg0 - (-16 - local56), local37, Static17.anInt429);
		Static6.method1702(arg1, arg0 + local56 + 16, 16, Static17.anInt429);
		Static6.method1702(arg1, arg0 + local56 + 17, 16, Static17.anInt429);
		Static6.method1691(arg1 + 15, local56 + 16 + arg0, local37, Static99.anInt2467);
		Static6.method1691(arg1 + 14, local56 + (arg0 - -17), local37 - 1, Static99.anInt2467);
		Static6.method1702(arg1, local56 + arg0 + local37 + 15, 16, Static99.anInt2467);
		Static6.method1702(arg1 + 1, local56 + arg0 + (14 - -local37), 15, Static99.anInt2467);
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	public static void method456() {
		aClass40_425 = null;
		aClass2_Sub18_1 = null;
		aClass24_8 = null;
		aClass40_424 = null;
		aClass40_419 = null;
		aClass40_421 = null;
		aClass40_426 = null;
		aClass40_422 = null;
		aClass34_1 = null;
		aClass2_Sub13_3 = null;
		aClass40_427 = null;
		aClass40_423 = null;
		aClass40_420 = null;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	public static void method457() {
		@Pc(1) Class10 local1 = Static49.aClass10_1;
		synchronized (Static49.aClass10_1) {
			Static107.anInt2544 = Static73.anInt1925;
			Static112.anInt2616 = Static112.anInt2608;
			Static85.anInt2261 = Static126.anInt2912;
			Static68.anInt1856 = Static74.anInt942;
			Static41.anInt1096 = Static60.anInt1676;
			Static103.anInt2511 = Static46.anInt1213;
			Static93.aLong65 = Static64.aLong47;
			Static74.anInt942 = 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method458(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
