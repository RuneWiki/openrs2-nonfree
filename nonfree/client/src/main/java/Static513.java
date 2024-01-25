import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!gj;Lclient!oa;BI)V")
	public static void method7254(@OriginalArg(1) Class124 arg0, @OriginalArg(2) Class66 arg1) {
		Static457.aClass124_51.method3265();
		if (Static132.aBoolean240) {
			return;
		}
		for (@Pc(16) Class4_Sub48 local16 = (Class4_Sub48) arg0.method3267(); local16 != null; local16 = (Class4_Sub48) arg0.method3273()) {
			@Pc(24) Class86 local24 = Static392.aClass337_4.method7441(local16.anInt8895);
			if (Static595.method8010(local24)) {
				@Pc(36) boolean local36 = Static338.method5033(arg1, local24, local16);
				if (local36) {
					Static390.method5714(arg1, local16, local24);
				}
			}
		}
	}
}
