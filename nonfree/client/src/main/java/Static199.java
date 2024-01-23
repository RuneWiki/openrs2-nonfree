import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!pf", name = "xc", descriptor = "Lclient!bk;")
	public static Class17 aClass17_3;

	@OriginalMember(owner = "client!pf", name = "Sc", descriptor = "[Lclient!me;")
	public static Class43[] aClass43Array4;

	@OriginalMember(owner = "client!pf", name = "Ac", descriptor = "[I")
	public static int[] anIntArray305 = new int[2000];

	@OriginalMember(owner = "client!pf", name = "Cc", descriptor = "I")
	public static int anInt4028 = -1;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3079(@OriginalArg(0) String arg0) {
		Static73.aString61 = arg0;
		if (aClass17_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = aClass17_3.anApplet1.getParameter("cookieprefix");
			@Pc(20) String local20 = aClass17_3.anApplet1.getParameter("cookiehost");
			@Pc(35) String local35 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local20;
			if (arg0.length() == 0) {
				local35 = local35 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local35 = local35 + "; Expires=" + Static226.method3501(Static71.method1143() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static304.method1292(aClass17_3.anApplet1, "document.cookie=\"" + local35 + "\"");
		} catch (@Pc(94) Throwable local94) {
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(IB)Lclient!ij;")
	public static Class81 method3081(@OriginalArg(0) int arg0) {
		@Pc(6) Class81 local6 = (Class81) Static4.aClass61_1.method1384((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static44.aClass132_15.method3194(29, arg0);
		local6 = new Class81();
		if (local28 != null) {
			local6.method1840(new Class8_Sub2(local28), arg0);
		}
		Static4.aClass61_1.method1377((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!pk;Lclient!pk;)I")
	public static int method3083(@OriginalArg(1) Class132 arg0, @OriginalArg(2) Class132 arg1) {
		@Pc(13) int local13 = 0;
		if (arg1.method3166(Static28.anInt694)) {
			local13++;
		}
		if (arg1.method3166(Static230.anInt4669)) {
			local13++;
		}
		if (arg1.method3166(Static74.anInt1608)) {
			local13++;
		}
		if (arg0.method3166(Static28.anInt694)) {
			local13++;
		}
		if (arg0.method3166(Static230.anInt4669)) {
			local13++;
		}
		if (arg0.method3166(Static74.anInt1608)) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V")
	public static void method3086() {
		for (@Pc(3) int local3 = 0; local3 < Static135.anInt2729; local3++) {
			@Pc(14) int local14 = Static191.anIntArray285[local3];
			@Pc(18) Class36_Sub3_Sub2 local18 = Static48.aClass36_Sub3_Sub2Array1[local14];
			if (local18 != null) {
				Static136.method2198(local18.aClass173_1.anInt5633, local18);
			}
		}
	}
}
