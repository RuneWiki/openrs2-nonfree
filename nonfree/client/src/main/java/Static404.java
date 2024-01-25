import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
	public static int anInt7010 = 0;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)Lclient!qp;")
	public static Class14_Sub39 method6115() {
		if (Static224.aClass32_4 == null || Static434.aClass140_1 == null) {
			return null;
		}
		Static434.aClass140_1.method3020(Static224.aClass32_4);
		@Pc(26) Class14_Sub39 local26 = (Class14_Sub39) Static434.aClass140_1.method3019();
		if (local26 == null) {
			return null;
		} else {
			@Pc(39) Class152 local39 = Static224.aClass274_2.method6614(local26.anInt8785);
			return local39 != null && local39.aBoolean331 && local39.method3796(Static224.anInterface2_2) ? local26 : Static89.method8699();
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
	public static void method6116(@OriginalArg(0) boolean arg0) {
		@Pc(10) Class14_Sub3 local10;
		for (local10 = (Class14_Sub3) Static461.aClass32_44.method584(); local10 != null; local10 = (Class14_Sub3) Static461.aClass32_44.method577()) {
			Static368.method5521(false, local10);
		}
		if (!arg0) {
			method6116(false);
		}
		for (local10 = (Class14_Sub3) Static74.aClass32_2.method584(); local10 != null; local10 = (Class14_Sub3) Static74.aClass32_2.method577()) {
			Static368.method5521(true, local10);
		}
	}
}
