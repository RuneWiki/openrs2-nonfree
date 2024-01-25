import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "Lclient!ha;")
	public static Class144 aClass144_12;

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
	public static int anInt9275;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method8000() {
		for (@Pc(6) Class14_Sub42 local6 = (Class14_Sub42) Static618.aClass32_66.method584(); local6 != null; local6 = (Class14_Sub42) Static618.aClass32_66.method577()) {
			if (local6.aBoolean658) {
				local6.method8234();
			}
		}
		for (@Pc(34) Class14_Sub42 local34 = (Class14_Sub42) Static489.aClass32_57.method584(); local34 != null; local34 = (Class14_Sub42) Static489.aClass32_57.method577()) {
			if (local34.aBoolean658) {
				local34.method8234();
			}
		}
		if (-82 < -94) {
			aClass144_12 = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)Z")
	public static boolean method8001() {
		try {
			@Pc(7) Class179 local7 = new Class179();
			@Pc(12) byte[] local12 = local7.method4386(Static12.aByteArray2);
			Static431.method6455(local12);
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}
}
