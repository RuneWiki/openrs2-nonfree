import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
	public static void method2483() {
		for (@Pc(15) Class1_Sub8_Sub5 local15 = (Class1_Sub8_Sub5) Static297.aClass111_25.method2547(); local15 != null; local15 = (Class1_Sub8_Sub5) Static297.aClass111_25.method2554()) {
			@Pc(20) Class11_Sub1_Sub1_Sub1 local20 = local15.aClass11_Sub1_Sub1_Sub1_1;
			if (local20.aBoolean15) {
				local15.method7908();
				local20.method351();
			} else if (local20.anInt404 <= Static518.anInt9331) {
				local20.method348(Static175.anInt3258);
				if (local20.aBoolean15) {
					local15.method7908();
				} else {
					Static89.method1396(local20, true);
				}
			}
		}
	}
}
