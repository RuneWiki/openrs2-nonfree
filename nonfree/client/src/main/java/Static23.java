import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "I")
	public static int anInt750 = 0;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!af;")
	private static Class5 aClass5_342 = Static45.method1937("Choose Option");

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_343 = aClass5_342;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "J")
	public static volatile long aLong24 = 0L;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Lclient!af;")
	public static Class5 aClass5_344 = Static45.method1937("null");

	@OriginalMember(owner = "client!da", name = "k", descriptor = "I")
	public static int anInt755 = -1;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method533() {
		aClass5_342 = null;
		aClass5_343 = null;
		aClass5_344 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(JI)V")
	public static void method534(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!of;I)Lclient!of;")
	public static Class1_Sub17 method535(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(16) int local16 = Static129.method2251(Static6.method221(arg0));
		if (local16 == 0) {
			return null;
		}
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			arg0 = Static36.method680(arg0.anInt2292);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
