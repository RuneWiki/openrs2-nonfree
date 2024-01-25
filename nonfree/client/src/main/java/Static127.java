import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
	public static int anInt2598 = 0;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_43 = new Class359(50, 8);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZ)V")
	public static void method2321(@OriginalArg(0) boolean arg0) {
		if (Static390.aString58.length() == 0) {
			return;
		}
		Static574.method7927("--> " + Static390.aString58);
		Static527.method7439(false, Static390.aString58, arg0);
		Static576.anInt9395 = 0;
		Static390.aString58 = "";
		Static78.anInt1119 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!wm;IIZI)V")
	public static void method2322(@OriginalArg(1) Class390 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		Static347.method5293(arg0, arg2, (long) 0, arg1);
	}
}
