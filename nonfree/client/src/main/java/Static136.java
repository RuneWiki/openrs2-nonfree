import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Lclient!afa;")
	public static Class12 aClass12_3;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_46 = new Class73(120, -1);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIII)Z")
	public static boolean method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static506.aClass115_9.method6293(arg1, arg2, arg0, Static212.anIntArray204);
		@Pc(13) int local13 = Static212.anIntArray204[2];
		if (local13 < 50) {
			return false;
		} else {
			Static212.anIntArray204[1] = Static569.anInt9768 * Static212.anIntArray204[1] / local13 + Static386.anInt7276;
			Static212.anIntArray204[2] = local13;
			Static212.anIntArray204[0] = Static76.anInt2537 * Static212.anIntArray204[0] / local13 + Static6.anInt461;
			return true;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method2734(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1 == arg0.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}
}
