import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!q;")
	public static Class4_Sub17 aClass4_Sub17_14;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method1925() {
		aClass4_Sub17_14 = null;
		anIntArray298 = null;
		anIntArray299 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!q;B)Lclient!q;")
	public static Class4_Sub17 method1926(@OriginalArg(0) Class4_Sub17 arg0) {
		@Pc(7) int local7 = Static121.method2041(Static73.method1384(arg0));
		if (local7 == 0) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			arg0 = Static16.method283(arg0.anInt2192);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
