import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lclient!fu;")
	public static Class4_Sub20 method2443() {
		if (Static572.aClass22_64 == null || Static168.aClass92_1 == null) {
			return null;
		}
		for (@Pc(16) Class4_Sub20 local16 = (Class4_Sub20) Static168.aClass92_1.method2168(); local16 != null; local16 = (Class4_Sub20) Static168.aClass92_1.method2168()) {
			@Pc(24) Class288 local24 = Static572.aClass121_4.method2676(local16.anInt3266);
			if (local24 != null && local24.aBoolean607 && local24.method6627(Static572.anInterface17_2)) {
				return local16;
			}
		}
		return null;
	}
}
