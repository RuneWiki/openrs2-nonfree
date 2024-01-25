import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	public static int anInt7910 = -1;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!st;")
	public static final Class314 aClass314_114 = new Class314(51, 7);

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "Lclient!st;")
	public static final Class314 aClass314_115 = new Class314(12, 8);

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "Z")
	public static boolean aBoolean568 = false;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZI)V")
	public static void method6849(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Class3_Sub52 local8 = Static504.method7331(arg1, arg0);
		if (local8 != null) {
			local8.method8682();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method6853() {
		Static206.method3226(11);
		Static244.method4104();
		System.gc();
	}
}
