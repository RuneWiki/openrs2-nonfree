import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!gm", name = "Ab", descriptor = "Lclient!uo;")
	public static Class129 aClass129_4;

	@OriginalMember(owner = "client!gm", name = "Ib", descriptor = "Lclient!io;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
	public static int anInt1990 = 0;

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "[I")
	public static final int[] anIntArray138 = new int[1000];

	@OriginalMember(owner = "client!gm", name = "p", descriptor = "Z")
	public static boolean aBoolean127 = true;

	@OriginalMember(owner = "client!gm", name = "mb", descriptor = "I")
	public static int anInt2025 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)Lclient!tj;")
	public static Class190 method1628(@OriginalArg(0) int arg0) {
		@Pc(10) Class190 local10 = (Class190) Static159.aClass26_29.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static32.aClass144_10.method3896(arg0, 0);
		local10 = new Class190();
		if (local20 != null) {
			local10.method5145(new Class11_Sub25(local20));
		}
		local10.method5148();
		Static159.aClass26_29.method330((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1632(@OriginalArg(0) String arg0) {
		Static239.aString46 = arg0;
		if (Static77.aClass118_7.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static77.aClass118_7.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static77.aClass118_7.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static328.method5391(Static268.method4627() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static360.method557("document.cookie=\"" + local39 + "\"", Static77.aClass118_7.anApplet1);
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)V")
	public static void method1637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class106 local28 = Static212.aClass106ArrayArrayArray2[local9][arg0][arg1] = Static212.aClass106ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte25--;
				for (@Pc(40) Class64 local40 = local28.aClass64_4; local40 != null; local40 = local40.aClass64_2) {
					@Pc(44) Class67_Sub3 local44 = local40.aClass67_Sub3_1;
					if (local44.aShort91 == arg0 && local44.aShort90 == arg1) {
						local44.aByte73--;
					}
				}
			}
		}
		if (Static212.aClass106ArrayArrayArray2[0][arg0][arg1] == null) {
			Static212.aClass106ArrayArrayArray2[0][arg0][arg1] = new Class106(0, arg0, arg1);
			Static212.aClass106ArrayArrayArray2[0][arg0][arg1].aByte26 = 1;
		}
		Static212.aClass106ArrayArrayArray2[0][arg0][arg1].aClass106_1 = local7;
		Static212.aClass106ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
