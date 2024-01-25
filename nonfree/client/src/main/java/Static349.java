import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!lja", name = "o", descriptor = "I")
	public static int anInt5933 = 0;

	@OriginalMember(owner = "client!lja", name = "c", descriptor = "(I)V")
	public static void method5347() {
		Static305.aClass260_2 = Static525.aClass260_3;
		Static423.anInt7240 = -1;
		Static41.anInt544 = 1;
		@Pc(11) String local11 = null;
		if (Static468.aByteArray78 != null) {
			@Pc(18) Class6_Sub15 local18 = new Class6_Sub15(Static468.aByteArray78);
			local11 = Static23.method263(local18.method3049());
			Static520.aLong275 = local18.method3049();
		}
		if (local11 == null) {
			Static378.method5857(35);
		} else {
			Static430.method3630(true, local11, "", false);
		}
	}

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "(B)Z")
	public static boolean method5348() {
		if (Static37.anInt498 == 3) {
			return Static597.anInt9453 == 0 && Static557.anInt9014 == 0;
		} else {
			return false;
		}
	}
}
