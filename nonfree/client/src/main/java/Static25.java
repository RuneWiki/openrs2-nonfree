import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
	public static int anInt354;

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "[Lclient!tha;")
	public static Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method326(@OriginalArg(0) Class75 arg0) {
		if (Static484.aBoolean623) {
			Static252.method8466(arg0);
		} else {
			Static464.method7028(arg0);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method327(@OriginalArg(0) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIII)V")
	public static void method328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static687.aClass6_Sub44_33.aClass7_Sub13_5.method3338() != 0 && arg2 != 0 && Static74.anInt1034 < 50 && arg3 != -1) {
			Static534.aClass124Array6[Static74.anInt1034++] = new Class124((byte) 1, arg3, arg2, arg0, arg1, arg4, arg5, (Class60_Sub1) null);
		}
	}
}
