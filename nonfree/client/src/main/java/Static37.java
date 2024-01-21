import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!dg", name = "Ic", descriptor = "Lclient!u;")
	public static Class76 aClass76_34;

	@OriginalMember(owner = "client!dg", name = "Kc", descriptor = "I")
	public static int anInt1307;

	@OriginalMember(owner = "client!dg", name = "Mc", descriptor = "Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!dg", name = "Qc", descriptor = "[I")
	public static int[] anIntArray122;

	@OriginalMember(owner = "client!dg", name = "xc", descriptor = "Lclient!rf;")
	private static Class70 aClass70_409 = Static49.method1293("white:");

	@OriginalMember(owner = "client!dg", name = "pc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_406 = aClass70_409;

	@OriginalMember(owner = "client!dg", name = "qc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_407 = aClass70_409;

	@OriginalMember(owner = "client!dg", name = "Cc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_410 = Static49.method1293("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!dg", name = "Ec", descriptor = "Lclient!rf;")
	public static Class70 aClass70_411 = Static49.method1293(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!dg", name = "Vc", descriptor = "Lclient!rf;")
	private static Class70 aClass70_415 = Static49.method1293("Loaded textures");

	@OriginalMember(owner = "client!dg", name = "Gc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_412 = aClass70_415;

	@OriginalMember(owner = "client!dg", name = "Tc", descriptor = "Lclient!rf;")
	private static Class70 aClass70_414 = Static49.method1293("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!dg", name = "Oc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_413 = aClass70_414;

	@OriginalMember(owner = "client!dg", name = "Wc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_416 = Static49.method1293("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!dg", name = "Yc", descriptor = "I")
	public static int anInt1313 = 0;

	@OriginalMember(owner = "client!dg", name = "ad", descriptor = "Lclient!rf;")
	public static Class70 aClass70_417 = Static49.method1293("<img=1>");

	@OriginalMember(owner = "client!dg", name = "bd", descriptor = "Lclient!rf;")
	public static Class70 aClass70_418 = Static49.method1293("nav");

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(Z)V")
	public static void method956() {
		aClass70_416 = null;
		aClass70_410 = null;
		aClass70_411 = null;
		aClass70_414 = null;
		aClass70_412 = null;
		aClass70_415 = null;
		aClass1_Sub1_Sub1_Sub4_4 = null;
		aClass76_34 = null;
		anIntArray122 = null;
		aClass70_407 = null;
		aClass70_409 = null;
		aClass70_418 = null;
		aClass70_406 = null;
		aClass70_413 = null;
		aClass70_417 = null;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)Z")
	public static boolean method957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILclient!dg;)V")
	public static void method958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub4_Sub2_Sub1 arg2) {
		if (arg0 == arg2.anInt2041 && arg0 != -1) {
			@Pc(62) int local62 = Static90.method1962(arg0).anInt3856;
			if (local62 == 1) {
				arg2.anInt1999 = 0;
				arg2.anInt2010 = 0;
				arg2.anInt2044 = 0;
				arg2.anInt2029 = arg1;
			}
			if (local62 == 2) {
				arg2.anInt2044 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt2041 == -1 || Static90.method1962(arg0).anInt3862 >= Static90.method1962(arg2.anInt2041).anInt3862) {
			arg2.anInt2010 = 0;
			arg2.anInt2037 = arg2.anInt2021;
			arg2.anInt2029 = arg1;
			arg2.anInt2044 = 0;
			arg2.anInt2041 = arg0;
			arg2.anInt1999 = 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method960(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class1_Sub11 local7 = null;
		for (@Pc(12) Class1_Sub11 local12 = (Class1_Sub11) Static14.aClass4_1.method174(); local12 != null; local12 = (Class1_Sub11) Static14.aClass4_1.method181()) {
			if (local12.anInt1935 == arg6 && arg7 == local12.anInt1936 && arg5 == local12.anInt1924 && local12.anInt1927 == arg8) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub11();
			local7.anInt1936 = arg7;
			local7.anInt1935 = arg6;
			local7.anInt1924 = arg5;
			local7.anInt1927 = arg8;
			Static133.method2571(local7);
			Static14.aClass4_1.method179(local7);
		}
		local7.anInt1941 = arg2;
		local7.anInt1932 = arg3;
		local7.anInt1928 = arg4;
		local7.anInt1939 = arg1;
		local7.anInt1931 = arg0;
	}
}
