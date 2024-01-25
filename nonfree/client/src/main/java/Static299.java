import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_100 = new Class117("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIILclient!pk;)V")
	public static void method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class67_Sub4 arg3) {
		if (Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static112.method1688(arg0, arg1, arg2);
		}
		Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2].aClass67_Sub4_1 = arg3;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZIBII)Lclient!vd;")
	public static Class11_Sub41 method5103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class11_Sub41 local7 = new Class11_Sub41();
		local7.anInt6364 = arg2;
		local7.anInt6363 = arg1;
		Static197.aClass58_18.method1006((long) arg3, local7);
		Static333.method5456(arg2);
		@Pc(36) Class137 local36 = Static166.method2688(arg3);
		if (local36 != null) {
			Static69.method1039(local36);
		}
		if (Static242.aClass137_17 != null) {
			Static69.method1039(Static242.aClass137_17);
			Static242.aClass137_17 = null;
		}
		Static259.method4517();
		if (local36 != null) {
			Static351.method5429(!arg0, local36);
		}
		if (!arg0) {
			Static93.method1349(arg2);
		}
		if (!arg0 && Static270.anInt5491 != -1) {
			Static313.method5275(1, Static270.anInt5491);
		}
		return local7;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5104(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Lclient!bk;")
	public static Class11_Sub4_Sub2 method5106(@OriginalArg(1) int arg0) {
		@Pc(10) Class11_Sub4_Sub2 local10 = (Class11_Sub4_Sub2) Static193.aClass26_37.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static341.aClass144_110.method3896(arg0, 26);
		local10 = new Class11_Sub4_Sub2();
		if (local20 != null) {
			local10.method352(new Class11_Sub25(local20));
		}
		Static193.aClass26_37.method330((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBII)V")
	public static void method5107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static129.anInt2387 == 1) {
			Static342.aClass97Array28[Static89.anInt1600 / 100].method5555(Static66.anInt2104 - 8, Static240.anInt4835 + -8);
		}
		if (Static129.anInt2387 == 2) {
			Static342.aClass97Array28[Static89.anInt1600 / 100 + 4].method5555(Static66.anInt2104 - 8, Static240.anInt4835 + -8);
		}
		Static354.method5677();
	}
}
