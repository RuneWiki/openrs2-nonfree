import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "(I)V")
	public static void method6032() {
		for (@Pc(15) Class4_Sub7_Sub9 local15 = (Class4_Sub7_Sub9) Static328.aClass124_29.method3267(); local15 != null; local15 = (Class4_Sub7_Sub9) Static328.aClass124_29.method3273()) {
			@Pc(20) Class10_Sub1_Sub4 local20 = local15.aClass10_Sub1_Sub4_1;
			if (local20.aBoolean504) {
				local15.method8013();
				local20.method5681();
			} else if (local20.anInt6770 <= Static237.anInt7561) {
				local20.method5680(Static426.anInt7338);
				if (local20.aBoolean504) {
					local15.method8013();
				} else {
					Static314.method7738(local20, true);
				}
			}
		}
	}
}
