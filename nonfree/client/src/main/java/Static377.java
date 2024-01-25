import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!or", name = "b", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "[S")
	public static final short[] aShortArray158 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!or", name = "e", descriptor = "Lclient!mfa;")
	public static final Class211 aClass211_71 = new Class211();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
	public static void method7562() {
		Static298.method4854(Static488.aClass181_99);
		for (@Pc(21) Class6_Sub48 local21 = (Class6_Sub48) Static459.aClass305_24.method7445(); local21 != null; local21 = (Class6_Sub48) Static459.aClass305_24.method7449()) {
			if (!local21.method8152()) {
				local21 = (Class6_Sub48) Static459.aClass305_24.method7445();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt9210 == 0) {
				Static551.method7862(true, true, local21);
			}
		}
		if (Static469.aClass93_15 != null) {
			Static468.method7221(Static469.aClass93_15);
			Static469.aClass93_15 = null;
		}
	}
}
