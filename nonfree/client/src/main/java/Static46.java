import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "Lclient!td;")
	public static Class334 aClass334_1;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "[I")
	public static final int[] anIntArray46 = new int[3];

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString12 = null;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Lclient!qn;")
	public static Class295 method1245(@OriginalArg(0) int arg0) {
		@Pc(15) Class295[] local15 = Static466.method6677();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class295 local23 = local15[local17];
			if (arg0 == local23.anInt8311) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	public static void method1246() {
		@Pc(1) Class279 local1 = Static415.aClass279_37;
		synchronized (Static415.aClass279_37) {
			Static415.aClass279_37.method6630(5);
		}
	}
}
