import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Lclient!ff;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString22 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "Lclient!th;")
	public static Class169 aClass169_21 = new Class169(4);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIIIII)V")
	public static void method560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static231.aClass103Array4[0].method4594(arg4, arg3);
		@Pc(21) int local21 = (arg0 - 32) * arg0 / arg1;
		if (local21 < 8) {
			local21 = 8;
		}
		Static231.aClass103Array4[1].method4594(arg4, arg0 + arg3 - 16);
		@Pc(54) int local54 = (arg0 - local21 - 32) * arg2 / (arg1 - arg0);
		if (!Static291.aBoolean404) {
			Static41.method730(arg4, arg3 + 16, 16, arg0 - 32, Static301.anInt5710);
			Static41.method730(arg4, arg3 + local54 + 16, 16, local21, Static21.anInt418);
			Static41.method741(arg4, local54 + arg3 + 16, local21, Static52.anInt1096);
			Static41.method741(arg4 + 1, local54 + (arg3 - -16), local21, Static52.anInt1096);
			Static41.method752(arg4, local54 + arg3 + 16, 16, Static52.anInt1096);
			Static41.method752(arg4, local54 + arg3 + 17, 16, Static52.anInt1096);
			Static41.method741(arg4 + 15, local54 + 16 + arg3, local21, Static296.anInt5593);
			Static41.method741(arg4 + 14, arg3 - -17 + local54, local21 - 1, Static296.anInt5593);
			Static41.method752(arg4, local54 + arg3 + local21 + 15, 16, Static296.anInt5593);
			Static41.method752(arg4 + 1, local21 + local54 + arg3 + 14, 15, Static296.anInt5593);
			return;
		}
		Static133.method2176(arg4, arg3 + 16, 16, arg0 - 32, Static301.anInt5710);
		Static133.method2176(arg4, local54 + arg3 + 16, 16, local21, Static21.anInt418);
		Static133.method2172(arg4, arg3 + local54 + 16, local21, Static52.anInt1096);
		Static133.method2172(arg4 + 1, local54 + arg3 + 16, local21, Static52.anInt1096);
		Static133.method2162(arg4, local54 + arg3 + 16, 16, Static52.anInt1096);
		Static133.method2162(arg4, arg3 + local54 + 17, 16, Static52.anInt1096);
		Static133.method2172(arg4 + 15, arg3 + 16 + local54, local21, Static296.anInt5593);
		Static133.method2172(arg4 + 14, local54 + arg3 + 17, local21 - 1, Static296.anInt5593);
		Static133.method2162(arg4, arg3 + local54 + local21 + 15, 16, Static296.anInt5593);
		Static133.method2162(arg4 + 1, arg3 + 14 + local54 - -local21, 15, Static296.anInt5593);
	}
}
