import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
	public static int anInt4922;

	@OriginalMember(owner = "client!kga", name = "m", descriptor = "Z")
	public static boolean aBoolean372;

	@OriginalMember(owner = "client!kga", name = "n", descriptor = "F")
	public static float aFloat130;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIZI)V")
	public static void method3926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg4; local3 <= arg1; local3++) {
			Static329.method4871(arg3, arg2, Static280.anIntArrayArray25[local3], arg0);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(JJ)J")
	public static long method3927(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3928(@OriginalArg(1) String arg0) {
		Static9.aString2 = arg0;
		if (Static433.anApplet2 == null) {
			return;
		}
		try {
			@Pc(16) String local16 = Static433.anApplet2.getParameter("cookieprefix");
			@Pc(20) String local20 = Static433.anApplet2.getParameter("cookiehost");
			@Pc(35) String local35 = local16 + "settings=" + arg0 + "; version=1; path=/; domain=" + local20;
			if (arg0.length() == 0) {
				local35 = local35 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local35 = local35 + "; Expires=" + Static170.method2744(Static480.method6650() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static597.method647(Static433.anApplet2, "document.cookie=\"" + local35 + "\"");
		} catch (@Pc(86) Throwable local86) {
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIII)I")
	public static int method3929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xF;
		@Pc(14) int local14 = local7 < 8 ? arg0 : arg3;
		@Pc(33) int local33 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg0 : arg2) : arg3;
		return ((local7 & 0x1) == 0 ? local14 : -local14) + ((local7 & 0x2) == 0 ? local33 : -local33);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3930(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static574.method7732("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)V")
	public static void method3931(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg0, 2);
		local8.method4835();
	}
}
