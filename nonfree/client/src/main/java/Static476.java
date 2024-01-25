import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static476 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)V")
	public static void method5364(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static69.anInt9579 == 1) {
			Static351.method5103(Static536.aClass3_Sub5_Sub18_8, arg0, arg1);
		} else if (Static69.anInt9579 == 2) {
			if (Static498.aBoolean757) {
				Static440.method6013(Static84.method1336() + arg0, Static614.method8324() + arg1);
			} else {
				Static440.method6013(arg0, arg1);
			}
		}
		Static536.aClass3_Sub5_Sub18_8 = null;
		Static69.anInt9579 = 0;
	}
}
