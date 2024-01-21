import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public static int anInt1837 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1350() {
		while (true) {
			@Pc(8) Class30 local8 = Static139.aClass30_14;
			@Pc(15) Class1_Sub7 local15;
			synchronized (Static139.aClass30_14) {
				local15 = (Class1_Sub7) Static104.aClass30_13.method1122();
			}
			if (local15 == null) {
				return;
			}
			local15.aClass82_Sub1_4.method2974((int) local15.aLong148, local15.aByteArray1, local15.aClass66_1, false);
		}
	}
}
