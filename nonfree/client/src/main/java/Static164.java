import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1940 = Static122.method531("green:");

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1936 = aClass73_1940;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1937 = Static122.method531("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1938 = Static122.method531("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1939 = Static122.method531("mapmarker");

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1941 = Static122.method531("Prepared sound engine");

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1943 = aClass73_1941;

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1944 = aClass73_1940;

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
	public static int anInt3564 = -1;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public static void method2576() {
		aClass73_1941 = null;
		aClass73_1936 = null;
		aClass73_1937 = null;
		aClass73_1944 = null;
		aClass73_1939 = null;
		aClass73_1943 = null;
		aClass73_1940 = null;
		aClass73_1938 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!f;BI)Lclient!se;")
	public static Class3_Sub20 method2577(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method347(arg1);
		return local8 == null ? null : new Class3_Sub20(local8);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Lclient!id;")
	public static Class3_Sub1_Sub10 method2578(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub10 local10 = (Class3_Sub1_Sub10) Static125.aClass7_20.method183((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static121.aClass13_24.method348(9, arg0);
		local10 = new Class3_Sub1_Sub10();
		local10.anInt1568 = arg0;
		if (local27 != null) {
			local10.method1202(new Class3_Sub12(local27));
		}
		local10.method1203();
		Static125.aClass7_20.method186(local10, (long) arg0);
		return local10;
	}
}
