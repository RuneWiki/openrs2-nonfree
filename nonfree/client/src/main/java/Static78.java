import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!je", name = "N", descriptor = "Lclient!kh;")
	public static Class29 aClass29_14;

	@OriginalMember(owner = "client!je", name = "I", descriptor = "Lclient!cd;")
	public static Class10 aClass10_336 = Static51.method932("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!je", name = "J", descriptor = "I")
	public static int anInt734 = 0;

	@OriginalMember(owner = "client!je", name = "O", descriptor = "Lclient!cd;")
	private static Class10 aClass10_340 = Static51.method932("Too many connections from your address)3");

	@OriginalMember(owner = "client!je", name = "K", descriptor = "Lclient!cd;")
	public static Class10 aClass10_337 = aClass10_340;

	@OriginalMember(owner = "client!je", name = "L", descriptor = "Lclient!cd;")
	private static Class10 aClass10_338 = Static51.method932("Choose Option");

	@OriginalMember(owner = "client!je", name = "M", descriptor = "Lclient!cd;")
	public static Class10 aClass10_339 = aClass10_338;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!jf;")
	public static Class2_Sub1_Sub8 method574(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub1_Sub8 local6 = (Class2_Sub1_Sub8) Static83.aClass72_17.method2259((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static111.aClass29_50.method1030(arg0, 1);
		local6 = new Class2_Sub1_Sub8();
		if (local20 != null) {
			local6.method1286(new Class2_Sub11(local20), arg0);
		}
		local6.method1284();
		Static83.aClass72_17.method2254(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)Lclient!h;")
	public static Class2_Sub1_Sub6 method577(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub6 local10 = (Class2_Sub1_Sub6) Static34.aClass72_8.method2259((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static72.aClass29_33.method1030(arg0, 10);
		local10 = new Class2_Sub1_Sub6();
		local10.anInt1491 = arg0;
		if (local20 != null) {
			local10.method1096(new Class2_Sub11(local20));
		}
		local10.method1095();
		if (local10.anInt1506 != -1) {
			local10.method1097(method577(local10.anInt1506), method577(local10.anInt1512));
		}
		if (!Static56.aBoolean62 && local10.aBoolean64) {
			local10.aBoolean65 = false;
			local10.aClass10Array11 = null;
			local10.anInt1495 = 0;
			local10.aClass10_662 = Static110.aClass10_1092;
			local10.aClass10Array10 = null;
		}
		Static34.aClass72_8.method2254(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)V")
	public static void method585() {
		Applet_Sub1.anIntArray59 = null;
		aClass10_338 = null;
		aClass10_337 = null;
		aClass10_336 = null;
		aClass10_339 = null;
		aClass29_14 = null;
		aClass10_340 = null;
	}
}
