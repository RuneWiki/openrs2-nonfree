import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!je;")
	public static Class44 aClass44_3;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!rf;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_287 = Static169.method2903("<)4col>");

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_288 = Static169.method2903("<br>");

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_289 = Static169.method2903("<col=80ff00>");

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_290 = Static169.method2903("me");

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	public static int anInt845 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ed;BLclient!ed;ILclient!ed;)V")
	public static void method483(@OriginalArg(0) Class23 arg0, @OriginalArg(2) Class23 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class23 arg3) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static64.anIntArray231[local7] = Static64.anIntArray231[local7 - 1];
			Static114.aClass23Array15[local7] = Static114.aClass23Array15[local7 - 1];
			Static119.aClass23Array18[local7] = Static119.aClass23Array18[local7 - 1];
			Static55.aClass23Array6[local7] = Static55.aClass23Array6[local7 - 1];
		}
		Static99.anInt2515 = Static176.anInt4191;
		Static114.aClass23Array15[0] = arg1;
		Static64.anIntArray231[0] = arg2;
		Static20.anInt645++;
		Static119.aClass23Array18[0] = arg0;
		Static55.aClass23Array6[0] = arg3;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	public static void method484() {
		aClass23_288 = null;
		aClass44_3 = null;
		aClass23_287 = null;
		aClass23_290 = null;
		aClass74_1 = null;
		aClass23_289 = null;
	}
}
