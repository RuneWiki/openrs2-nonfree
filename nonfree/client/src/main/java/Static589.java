import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static589 {

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
	public static int anInt9673 = 500;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIZ)V")
	public static void method7857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static286.anInt5239 == 0) {
			Static59.method996(false);
		} else {
			Static585.anInt9650 = Static286.anInt5239;
			Static358.method7632(0);
		}
		Static74.anInt3294 = arg2;
		Static341.aBoolean497 = arg3;
		Static309.anInt5687 = arg1;
		Static287.method3144(arg0);
	}
}
