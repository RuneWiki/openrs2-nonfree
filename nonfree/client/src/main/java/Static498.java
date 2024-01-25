import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static498 {

	@OriginalMember(owner = "client!pha", name = "g", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_127 = new Class397(66, 10);

	@OriginalMember(owner = "client!pha", name = "d", descriptor = "Z")
	public static boolean aBoolean532 = false;

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(III)V")
	public static void method6804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static68.anInt1625 == 1) {
			Static172.method2785(arg0, arg1, Static524.aClass3_Sub7_Sub10_2);
		} else if (Static68.anInt1625 == 2) {
			if (Static347.aBoolean360) {
				Static569.method7380(arg1 + Static541.method7180(), Static308.method4570() + arg0);
			} else {
				Static569.method7380(arg1, arg0);
			}
		}
		Static524.aClass3_Sub7_Sub10_2 = null;
		Static68.anInt1625 = 0;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IBI)I")
	public static int method6808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static641.anIntArray714[arg1 & 0x3] : Static497.anIntArray578[arg1 & 0x3];
	}
}
