import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!paa", name = "F", descriptor = "Lclient!tca;")
	public static Interface22 anInterface22_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!paa", name = "N", descriptor = "Ljava/lang/Class;")
	public static Class aClass43;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IB)I")
	public static int method6725(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
	public static void method6726() {
		Static391.aClass317_36.method7873();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method6730(@OriginalArg(0) String arg0) {
		if (Static293.aClass165Array1 == null) {
			return;
		}
		@Pc(14) Class347 local14 = Static435.method6495();
		@Pc(20) Class14_Sub54 local20 = Static72.method1195(local14.aClass197_2, Static436.aClass251_180);
		local20.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(arg0));
		local20.aClass14_Sub21_Sub2_2.method7690(arg0);
		local14.method8308(local20);
	}
}
