import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
	public static int anInt6254;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
	public static final int anInt6252 = 1337;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "[S")
	public static final short[] aShortArray109 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Z")
	public static boolean method4952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static37.method605(arg1, arg0) | (arg0 & 0x10000) != 0 || Static232.method3613(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static117.method2084(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLclient!dr;ZILjava/lang/String;)V")
	public static void method4953(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3) {
		if (!arg0) {
			Static364.method4966(arg3, 3, arg1);
			return;
		}
		@Pc(18) String local18;
		if (Static73.aString12.startsWith("win") && Static73.anInt1597 != 3) {
			local18 = null;
			if (arg1.anApplet1 != null) {
				local18 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local18 == null || !local18.equals("1")) {
				@Pc(38) Class138 local38 = Static364.method4966(arg3, 0, arg1);
				Static390.aString60 = arg3;
				Static117.aClass138_4 = local38;
				Static183.aClass59_6 = arg1;
				return;
			}
		}
		if (Static73.aString12.startsWith("mac")) {
			local18 = null;
			if (arg1.anApplet1 != null) {
				local18 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local18 != null && local18.equals("1") && arg2) {
				Static364.method4966(arg3, 1, arg1);
				return;
			}
		}
		Static364.method4966(arg3, 2, arg1);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public static void method4954() {
		Static199.aClass68Array2 = null;
		Static247.method3761(Static86.anInt4394, -1, 0, 0, 0, Static410.anInt6841, Static395.anInt6582, 0);
		if (Static199.aClass68Array2 != null) {
			Static280.method4101(Static199.aClass68Array2, 0, Static335.anInt924, Static37.anInt706, -1412584499, 0, Static86.anInt4394, Static225.aClass68_9.anInt2250, Static395.anInt6582);
			Static199.aClass68Array2 = null;
		}
	}
}
