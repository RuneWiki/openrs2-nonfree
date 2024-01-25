import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Lclient!su;")
	public static Class3_Sub46 method3489() {
		if (Static671.aClass302_68 == null || Static289.aClass178_1 == null) {
			return null;
		}
		for (@Pc(21) Class3_Sub46 local21 = (Class3_Sub46) Static289.aClass178_1.method4058(); local21 != null; local21 = (Class3_Sub46) Static289.aClass178_1.method4058()) {
			@Pc(29) Class188 local29 = Static671.aClass378_4.method8708(local21.anInt9112);
			if (local29 != null && local29.aBoolean329 && local29.method4283(Static671.anInterface6_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public static void method3491() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static98.anInt361; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static438.anInt7120; local13++) {
				if (Static319.method4594(local13, local7, true, Static254.aClass368ArrayArrayArray2, local9)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
