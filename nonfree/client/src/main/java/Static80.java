import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!k", name = "Gb", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!k", name = "Hb", descriptor = "Lclient!b;")
	public static Class7 aClass7_11 = new Class7(5);

	@OriginalMember(owner = "client!k", name = "Kb", descriptor = "[Lclient!v;")
	public static Class80[] aClass80Array1 = new Class80[16];

	@OriginalMember(owner = "client!k", name = "Rb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_963 = Static122.method531("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!k", name = "Vb", descriptor = "[I")
	public static int[] anIntArray185 = new int[1000];

	@OriginalMember(owner = "client!k", name = "Yb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_964 = Static122.method531("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!k", name = "Zb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_965 = Static122.method531("<img=0>");

	@OriginalMember(owner = "client!k", name = "ac", descriptor = "Lclient!sd;")
	public static Class73 aClass73_966 = Static122.method531("headicons_hint");

	@OriginalMember(owner = "client!k", name = "i", descriptor = "(II)Lclient!vd;")
	public static Class83 method1396(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0xFFFF;
		@Pc(16) int local16 = arg0 >> 16;
		if (Static57.aClass83ArrayArray1[local16] == null || Static57.aClass83ArrayArray1[local16][local12] == null) {
			@Pc(30) boolean local30 = Static150.method2586(local16);
			if (!local30) {
				return null;
			}
		}
		return Static57.aClass83ArrayArray1[local16][local12];
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(IB)I")
	public static int method1402(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local18 * local32 >> 12;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static150.method2586(arg0)) {
			Static158.method2521(arg1, -1, arg5, Static57.aClass83ArrayArray1[arg0], arg4, arg6, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!k", name = "p", descriptor = "(I)V")
	public static void method1405() {
		anIntArray185 = null;
		aClass73_966 = null;
		aClass73_964 = null;
		aClass73_963 = null;
		aClass73_965 = null;
		aClass80Array1 = null;
		aClass7_11 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!cb;Lclient!je;)V")
	public static void method1407(@OriginalArg(0) int arg0, @OriginalArg(2) Class13_Sub1 arg1, @OriginalArg(3) Class43 arg2) {
		@Pc(15) Class3_Sub19 local15 = new Class3_Sub19();
		local15.aClass43_4 = arg2;
		local15.anInt3102 = 1;
		local15.aLong183 = arg0;
		local15.aClass13_Sub1_17 = arg1;
		@Pc(30) Class72 local30 = Static124.aClass72_39;
		synchronized (Static124.aClass72_39) {
			Static124.aClass72_39.method2404(local15);
		}
		Static47.method1341();
	}
}
