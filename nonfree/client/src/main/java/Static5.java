import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	public static int anInt32;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public static void method23() {
		@Pc(5) Class26 local5 = Static188.aClass26_36;
		synchronized (Static188.aClass26_36) {
			Static188.aClass26_36.method333();
		}
		local5 = Static30.aClass26_3;
		synchronized (Static30.aClass26_3) {
			Static30.aClass26_3.method333();
		}
	}
}
