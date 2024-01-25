import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_113 = new Class181(66, 4);

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	public static void method7870() {
		try {
			if (Static463.anInt8569 == 1) {
				@Pc(10) int local10 = Static258.aClass6_Sub10_Sub1_2.method1516();
				if (local10 > 0 && Static258.aClass6_Sub10_Sub1_2.method1533()) {
					local10 -= Static478.anInt8743;
					if (local10 < 0) {
						local10 = 0;
					}
					Static258.aClass6_Sub10_Sub1_2.method1544(local10);
					return;
				}
				Static258.aClass6_Sub10_Sub1_2.method1532();
				Static258.aClass6_Sub10_Sub1_2.method1525();
				Static27.aClass6_Sub3_1 = null;
				if (Static329.aClass168_79 == null) {
					Static463.anInt8569 = 0;
				} else {
					Static463.anInt8569 = 2;
				}
				Static445.aClass276_1 = null;
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static258.aClass6_Sub10_Sub1_2.method1532();
			Static445.aClass276_1 = null;
			Static329.aClass168_79 = null;
			Static27.aClass6_Sub3_1 = null;
			Static463.anInt8569 = 0;
		}
	}
}
