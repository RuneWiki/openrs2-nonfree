import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_102 = new Class2(61, 1);

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_147 = new Class253(31, -1);

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)V")
	public static void method5129() {
		for (@Pc(8) int local8 = 0; local8 < Static259.aClass156ArrayArray1.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static259.aClass156ArrayArray1[local8].length; local12++) {
				Static259.aClass156ArrayArray1[local8][local12] = Static283.aClass156_2;
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V")
	public static void method5131() {
		Static81.method1414(Static26.aClass2_9);
		for (@Pc(24) Class7_Sub44 local24 = (Class7_Sub44) Static23.aClass164_3.method3514(); local24 != null; local24 = (Class7_Sub44) Static23.aClass164_3.method3519()) {
			if (!local24.method5801()) {
				local24 = (Class7_Sub44) Static23.aClass164_3.method3514();
				if (local24 == null) {
					break;
				}
			}
			if (local24.anInt7164 == 0) {
				Static255.method3394(true, local24, true);
			}
		}
		if (Static63.aClass95_2 != null) {
			Static413.method5189(Static63.aClass95_2);
			Static63.aClass95_2 = null;
		}
	}
}
